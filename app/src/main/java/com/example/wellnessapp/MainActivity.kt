package com.example.wellnessapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        find buttons by use of their IDs
        val Healthbutton = findViewById<Button>(R.id.Healthy_recipes)
        val Nutritionbutton = findViewById<Button>(R.id.Nutrition_advice)
        val  Exercisebutton = findViewById<Button>(R.id.Start_exercise)
        val Hydrationbutton = findViewById<Button>(R.id.Hydration_alert)
        val Meditationbutton= findViewById<Button>(R.id.Meditation)
        val Motivationbutton = findViewById<Button>(R.id.Daily_Motivation)
        val Progressbutton = findViewById<Button>(R.id.Check_progress)
        val Weeklygoalbutton = findViewById<Button>(R.id.Weekly_goals)

//         set onClick listener on the buttons as you do the intent to the different pages/activity
        Healthbutton.setOnClickListener {
            val intent = Intent(applicationContext, HealthActivity::class.java)
            startActivity(intent)

        }
//        =======================================================
        Nutritionbutton.setOnClickListener {
            val intent = Intent (applicationContext, NutritionActivity::class.java)
            startActivity(intent)
        }
//        ================================================
        Exercisebutton.setOnClickListener {
            val intent = Intent(applicationContext, ExerciseActivity::class.java)
            startActivity(intent)
        }
//        =====================================================
        Hydrationbutton.setOnClickListener {
            val intent = Intent(applicationContext, HydrationActivty::class.java)
            startActivity(intent)
        }
//        =============================================================
        Meditationbutton.setOnClickListener {
            val intent = Intent (applicationContext, MeditationActivity::class.java)
            startActivity(intent)
        }
//        =================================================================
        Motivationbutton.setOnClickListener {
            val intent = Intent(applicationContext, MotivationActivity::class.java)
            startActivity(intent)
        }
//        ===========================================================
        Progressbutton.setOnClickListener {
            val intent= Intent(applicationContext, ProgressActivity::class.java)
            startActivity(intent)
        }
//        ====================================================================
        Weeklygoalbutton.setOnClickListener {
            val intent= Intent(applicationContext, WeeklygoalsActivity::class.java)
            startActivity(intent)
        }
        }
    }
