package com.neptunesoft.bacdz;

import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* loaded from: classes4.dex */
public class TipsActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.root), new OnApplyWindowInsetsListener() { // from class: com.neptunesoft.bacdz.TipsActivity$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return TipsActivity.lambda$onCreate$0(view, windowInsetsCompat);
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

    void refreshUI() {
        ImageView imageView = (ImageView) findViewById(R.id.imageViewmask);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageViewdistance);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageViewclean);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView_home);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageViewpeace);
        ImageView imageView6 = (ImageView) findViewById(R.id.imagecovid);
        ImageView imageView7 = (ImageView) findViewById(R.id.imagesalat);
        ImageView imageView8 = (ImageView) findViewById(R.id.imagediligence);
        if (SplashScreen.darkmode) {
            imageView.setImageResource(R.drawable.ic_mask_dark);
            imageView2.setImageResource(R.drawable.ic_dry_cough_dark);
            imageView3.setImageResource(R.drawable.ic_liquid_soap_dark);
            imageView4.setImageResource(R.drawable.ic_house_dark);
            imageView5.setImageResource(R.drawable.ic_star_dark);
            imageView6.setImageResource(R.drawable.ic_covid_dark);
            imageView7.setImageResource(R.drawable.ic_muslim_salat_dark);
            imageView8.setImageResource(R.drawable.ic_diligence_dark);
            return;
        }
        imageView.setImageResource(R.drawable.ic_mask);
        imageView2.setImageResource(R.drawable.ic_dry_cough);
        imageView3.setImageResource(R.drawable.ic_liquid_soap);
        imageView4.setImageResource(R.drawable.ic_house);
        imageView5.setImageResource(R.drawable.ic_star);
        imageView6.setImageResource(R.drawable.ic_covid);
        imageView7.setImageResource(R.drawable.ic_muslim_salat);
        imageView8.setImageResource(R.drawable.ic_diligence);
    }
}
