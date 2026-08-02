package com.neptunesoft.bacdz;

import android.content.Intent;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* loaded from: classes4.dex */
public class CoursActivity extends AppCompatActivity {
    CardView cv_arabic;
    CardView cv_en;
    CardView cv_fr;
    CardView cv_his_geo;
    CardView cv_islamique;
    CardView cv_math;
    CardView cv_philo;
    CardView cv_phisique;
    CardView cv_sciences;
    LinearLayout lyt_arabic;
    LinearLayout lyt_en;
    LinearLayout lyt_fr;
    LinearLayout lyt_his_geo;
    LinearLayout lyt_islamique;
    LinearLayout lyt_math;
    LinearLayout lyt_philo;
    LinearLayout lyt_phisique;
    LinearLayout lyt_sciences;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.CoursActivity$$ExternalSyntheticLambda4
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return CoursActivity.lambda$onCreate$0(view, windowInsetsCompat);
            }
        });
        this.cv_math = (CardView) findViewById(R.id.cv_math);
        this.cv_sciences = (CardView) findViewById(R.id.cv_sciences);
        this.cv_arabic = (CardView) findViewById(R.id.cv_arabic);
        this.cv_phisique = (CardView) findViewById(R.id.cv_phisique);
        this.cv_islamique = (CardView) findViewById(R.id.cv_islamique);
        this.cv_his_geo = (CardView) findViewById(R.id.cv_his_geo);
        this.cv_en = (CardView) findViewById(R.id.cv_en);
        this.cv_philo = (CardView) findViewById(R.id.cv_philo);
        this.cv_fr = (CardView) findViewById(R.id.cv_fr);
        this.lyt_math = (LinearLayout) findViewById(R.id.lyt_math);
        this.lyt_sciences = (LinearLayout) findViewById(R.id.lyt_sciences);
        this.lyt_arabic = (LinearLayout) findViewById(R.id.lyt_arabic);
        this.lyt_phisique = (LinearLayout) findViewById(R.id.lyt_phisique);
        this.lyt_islamique = (LinearLayout) findViewById(R.id.lyt_islamique);
        this.lyt_his_geo = (LinearLayout) findViewById(R.id.lyt_his_geo);
        this.lyt_en = (LinearLayout) findViewById(R.id.lyt_en);
        this.lyt_philo = (LinearLayout) findViewById(R.id.lyt_philo);
        this.lyt_fr = (LinearLayout) findViewById(R.id.lyt_fr);
        this.cv_math.setCardElevation(10.0f);
        this.cv_sciences.setCardElevation(10.0f);
        this.cv_arabic.setCardElevation(10.0f);
        this.cv_phisique.setCardElevation(10.0f);
        this.cv_islamique.setCardElevation(10.0f);
        this.cv_his_geo.setCardElevation(10.0f);
        this.cv_en.setCardElevation(10.0f);
        this.cv_philo.setCardElevation(10.0f);
        this.cv_fr.setCardElevation(10.0f);
        this.lyt_math.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CoursActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m542lambda$onCreate$1$comneptunesoftbacdzCoursActivity(view);
            }
        });
        this.lyt_sciences.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CoursActivity$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m543lambda$onCreate$2$comneptunesoftbacdzCoursActivity(view);
            }
        });
        this.lyt_arabic.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CoursActivity$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m544lambda$onCreate$3$comneptunesoftbacdzCoursActivity(view);
            }
        });
        this.lyt_phisique.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CoursActivity$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m545lambda$onCreate$4$comneptunesoftbacdzCoursActivity(view);
            }
        });
        this.lyt_islamique.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CoursActivity$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m546lambda$onCreate$5$comneptunesoftbacdzCoursActivity(view);
            }
        });
        this.lyt_his_geo.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CoursActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m547lambda$onCreate$6$comneptunesoftbacdzCoursActivity(view);
            }
        });
        this.lyt_en.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CoursActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m548lambda$onCreate$7$comneptunesoftbacdzCoursActivity(view);
            }
        });
        this.lyt_philo.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CoursActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m549lambda$onCreate$8$comneptunesoftbacdzCoursActivity(view);
            }
        });
        this.lyt_fr.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.CoursActivity$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoursActivity.this.m550lambda$onCreate$9$comneptunesoftbacdzCoursActivity(view);
            }
        });
        refreshUI();
    }

    static /* synthetic */ WindowInsetsCompat lambda$onCreate$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets platformInsets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).toPlatformInsets();
            i = platformInsets.left;
            i2 = platformInsets.top;
            i3 = platformInsets.right;
            i4 = platformInsets.bottom;
            view.setPadding(i, i2, i3, i4);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    /* renamed from: lambda$onCreate$1$com-neptunesoft-bacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m542lambda$onCreate$1$comneptunesoftbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) MathsActivity.class));
    }

    /* renamed from: lambda$onCreate$2$com-neptunesoft-bacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m543lambda$onCreate$2$comneptunesoftbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) SciencesActivity.class));
    }

    /* renamed from: lambda$onCreate$3$com-neptunesoft-bacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m544lambda$onCreate$3$comneptunesoftbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) ArabicActivity.class));
    }

    /* renamed from: lambda$onCreate$4$com-neptunesoft-bacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m545lambda$onCreate$4$comneptunesoftbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) PhysicsActivity.class));
    }

    /* renamed from: lambda$onCreate$5$com-neptunesoft-bacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m546lambda$onCreate$5$comneptunesoftbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) IslamicActivity.class));
    }

    /* renamed from: lambda$onCreate$6$com-neptunesoft-bacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m547lambda$onCreate$6$comneptunesoftbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) HistoryGeographyActivity.class));
    }

    /* renamed from: lambda$onCreate$7$com-neptunesoft-bacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m548lambda$onCreate$7$comneptunesoftbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) EnglishActivity.class));
    }

    /* renamed from: lambda$onCreate$8$com-neptunesoft-bacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m549lambda$onCreate$8$comneptunesoftbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) PhilosophyActivity.class));
    }

    /* renamed from: lambda$onCreate$9$com-neptunesoft-bacdz-CoursActivity, reason: not valid java name */
    /* synthetic */ void m550lambda$onCreate$9$comneptunesoftbacdzCoursActivity(View view) {
        startActivity(new Intent(getApplicationContext(), (Class<?>) FrenchActivity.class));
    }

    void refreshUI() {
        ImageView imageView = (ImageView) findViewById(R.id.imgMaths);
        ImageView imageView2 = (ImageView) findViewById(R.id.imgSciences);
        ImageView imageView3 = (ImageView) findViewById(R.id.imgArabic);
        ImageView imageView4 = (ImageView) findViewById(R.id.imgPhisique);
        ImageView imageView5 = (ImageView) findViewById(R.id.imgIslamique);
        ImageView imageView6 = (ImageView) findViewById(R.id.imgHisGeo);
        ImageView imageView7 = (ImageView) findViewById(R.id.imgEn);
        ImageView imageView8 = (ImageView) findViewById(R.id.imgPhilo);
        ImageView imageView9 = (ImageView) findViewById(R.id.imgFr);
        if (SplashScreen.darkmode) {
            imageView.setImageResource(R.drawable.ic_maths_dark);
            imageView2.setImageResource(R.drawable.ic_microscope_dark);
            imageView3.setImageResource(R.drawable.ic_world_ar_dark);
            imageView4.setImageResource(R.drawable.ic_atom_dark);
            imageView5.setImageResource(R.drawable.ic_bismillah_dark);
            imageView6.setImageResource(R.drawable.ic_history_dark);
            imageView7.setImageResource(R.drawable.ic_world_en_dark);
            imageView8.setImageResource(R.drawable.ic_question_book_dark);
            imageView9.setImageResource(R.drawable.ic_world_fr_dark);
            return;
        }
        imageView.setImageResource(R.drawable.ic_maths);
        imageView2.setImageResource(R.drawable.ic_microscope);
        imageView3.setImageResource(R.drawable.ic_world_ar);
        imageView4.setImageResource(R.drawable.ic_atom);
        imageView5.setImageResource(R.drawable.ic_bismillah);
        imageView6.setImageResource(R.drawable.ic_history);
        imageView7.setImageResource(R.drawable.ic_world_en);
        imageView8.setImageResource(R.drawable.ic_question_book);
        imageView9.setImageResource(R.drawable.ic_world_fr);
    }
}
