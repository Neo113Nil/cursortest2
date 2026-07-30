package org.game.play.aviator.gameplay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.Click;
import org.game.play.aviator.gameplay.databinding.ActivityGuide3Binding;

/* loaded from: classes3.dex */
public class GuideActivity3 extends AppCompatActivity {
    private ActivityGuide3Binding binding;
    private boolean isSelectionDone = false;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        ActivityGuide3Binding inflate = ActivityGuide3Binding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        SystemUIUtil.hideSystemUI(getWindow());
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(true));
        ViewCompat.setOnApplyWindowInsetsListener(this.binding.main, new OnApplyWindowInsetsListener() { // from class: org.game.play.aviator.gameplay.GuideActivity3$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return GuideActivity3.this.m2212lambda$onCreate$0$orggameplayaviatorgameplayGuideActivity3(view, windowInsetsCompat);
            }
        });
        BlurUtil.applyBlur(this.binding.ivBackground);
        if (AppManage.app_nativeAlter < 4) {
            AppManage.getInstance(this).show_NATIVE(this.binding.rlNativeAd, this.binding.tvNativeAd, AppManage.ADMOB_N1, AppManage.FACEBOOK_N1);
        }
        this.binding.btn3.setAlpha(0.5f);
        this.binding.llAge1.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity3$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity3.this.m2213lambda$onCreate$1$orggameplayaviatorgameplayGuideActivity3(view);
            }
        });
        this.binding.llAge2.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity3$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity3.this.m2214lambda$onCreate$2$orggameplayaviatorgameplayGuideActivity3(view);
            }
        });
        this.binding.llAge3.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity3$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity3.this.m2215lambda$onCreate$3$orggameplayaviatorgameplayGuideActivity3(view);
            }
        });
        this.binding.llAge4.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity3$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity3.this.m2216lambda$onCreate$4$orggameplayaviatorgameplayGuideActivity3(view);
            }
        });
        this.binding.btn3.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity3$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity3.this.m2218lambda$onCreate$6$orggameplayaviatorgameplayGuideActivity3(view);
            }
        });
    }

    /* renamed from: org.game.play.aviator.gameplay.GuideActivity3$1, reason: invalid class name */
    class AnonymousClass1 extends OnBackPressedCallback {
        AnonymousClass1(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            AppManage appManage = AppManage.getInstance(GuideActivity3.this);
            final GuideActivity3 guideActivity3 = GuideActivity3.this;
            appManage.show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.GuideActivity3$1$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    GuideActivity3.this.finish();
                }
            }, Click.BACKWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    /* renamed from: lambda$onCreate$0$org-game-play-aviator-gameplay-GuideActivity3, reason: not valid java name */
    /* synthetic */ WindowInsetsCompat m2212lambda$onCreate$0$orggameplayaviatorgameplayGuideActivity3(View view, WindowInsetsCompat windowInsetsCompat) {
        this.binding.llHeader.setPadding(this.binding.llHeader.getPaddingLeft(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top + this.binding.llHeader.getPaddingTop(), this.binding.llHeader.getPaddingRight(), this.binding.llHeader.getPaddingBottom());
        return windowInsetsCompat;
    }

    /* renamed from: lambda$onCreate$1$org-game-play-aviator-gameplay-GuideActivity3, reason: not valid java name */
    /* synthetic */ void m2213lambda$onCreate$1$orggameplayaviatorgameplayGuideActivity3(View view) {
        updateAgeSelection(this.binding.llAge1);
    }

    /* renamed from: lambda$onCreate$2$org-game-play-aviator-gameplay-GuideActivity3, reason: not valid java name */
    /* synthetic */ void m2214lambda$onCreate$2$orggameplayaviatorgameplayGuideActivity3(View view) {
        updateAgeSelection(this.binding.llAge2);
    }

    /* renamed from: lambda$onCreate$3$org-game-play-aviator-gameplay-GuideActivity3, reason: not valid java name */
    /* synthetic */ void m2215lambda$onCreate$3$orggameplayaviatorgameplayGuideActivity3(View view) {
        updateAgeSelection(this.binding.llAge3);
    }

    /* renamed from: lambda$onCreate$4$org-game-play-aviator-gameplay-GuideActivity3, reason: not valid java name */
    /* synthetic */ void m2216lambda$onCreate$4$orggameplayaviatorgameplayGuideActivity3(View view) {
        updateAgeSelection(this.binding.llAge4);
    }

    /* renamed from: lambda$onCreate$6$org-game-play-aviator-gameplay-GuideActivity3, reason: not valid java name */
    /* synthetic */ void m2218lambda$onCreate$6$orggameplayaviatorgameplayGuideActivity3(View view) {
        if (!this.isSelectionDone) {
            Toast.makeText(this, "Please select your age range", 0).show();
        } else {
            AppManage.getInstance(this).show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.GuideActivity3$$ExternalSyntheticLambda6
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    GuideActivity3.this.m2217lambda$onCreate$5$orggameplayaviatorgameplayGuideActivity3();
                }
            }, Click.GUIDE, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    /* renamed from: lambda$onCreate$5$org-game-play-aviator-gameplay-GuideActivity3, reason: not valid java name */
    /* synthetic */ void m2217lambda$onCreate$5$orggameplayaviatorgameplayGuideActivity3() {
        startActivity(new Intent(this, (Class<?>) GuideActivity4.class));
    }

    private void updateAgeSelection(LinearLayout linearLayout) {
        this.binding.llAge1.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.llAge2.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.llAge3.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.llAge4.setBackgroundResource(R.drawable.bg_language_card_unselected);
        linearLayout.setBackgroundResource(R.drawable.bg_language_card_selected);
        this.isSelectionDone = true;
        this.binding.btn3.setAlpha(1.0f);
    }
}
