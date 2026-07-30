package org.game.play.aviator.gameplay;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.Click;

/* loaded from: classes3.dex */
public class SettingPoliceActivity extends AppCompatActivity {
    TextView opt1;
    TextView opt2;
    TextView opt3;
    TextView opt4;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        WindowInsetsController windowInsetsController;
        EdgeToEdge.enable(this);
        super.onCreate(bundle);
        setContentView(R.layout.activity_setting_police);
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(true));
        findViewById(R.id.back).setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.SettingPoliceActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingPoliceActivity.this.m2255xde02e580(view);
            }
        });
        View decorView = getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= 30 && (windowInsetsController = decorView.getWindowInsetsController()) != null) {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
        if (Build.VERSION.SDK_INT < 35) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() & (-8193));
        }
        ViewCompat.setOnApplyWindowInsetsListener(getWindow().getDecorView(), new OnApplyWindowInsetsListener() { // from class: org.game.play.aviator.gameplay.SettingPoliceActivity$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return SettingPoliceActivity.this.m2256xf81e641f(view, windowInsetsCompat);
            }
        });
        ((WebView) findViewById(R.id.webview)).loadUrl("https://www.google.com/?zx=1764149135510&no_sw_cr=1");
    }

    /* renamed from: org.game.play.aviator.gameplay.SettingPoliceActivity$1, reason: invalid class name */
    class AnonymousClass1 extends OnBackPressedCallback {
        AnonymousClass1(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            AppManage appManage = AppManage.getInstance(SettingPoliceActivity.this);
            final SettingPoliceActivity settingPoliceActivity = SettingPoliceActivity.this;
            appManage.show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.SettingPoliceActivity$1$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    SettingPoliceActivity.this.finish();
                }
            }, Click.BACKWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    /* renamed from: lambda$onCreate$0$org-game-play-aviator-gameplay-SettingPoliceActivity, reason: not valid java name */
    /* synthetic */ void m2255xde02e580(View view) {
        getOnBackPressedDispatcher().onBackPressed();
    }

    /* renamed from: lambda$onCreate$1$org-game-play-aviator-gameplay-SettingPoliceActivity, reason: not valid java name */
    /* synthetic */ WindowInsetsCompat m2256xf81e641f(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        View findViewById = findViewById(R.id.main);
        findViewById.setPadding(findViewById.getPaddingLeft(), insets.top, findViewById.getPaddingRight(), insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }
}
