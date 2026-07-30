package org.game.play.aviator.gameplay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.Click;
import org.game.play.aviator.gameplay.databinding.ActivityGuide4Binding;

/* loaded from: classes3.dex */
public class GuideActivity4 extends AppCompatActivity {
    private ActivityGuide4Binding binding;
    private View lastSelectedOption = null;
    private String selectedGender = "";

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        ActivityGuide4Binding inflate = ActivityGuide4Binding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        SystemUIUtil.hideSystemUI(getWindow());
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(true));
        ViewCompat.setOnApplyWindowInsetsListener(this.binding.main, new OnApplyWindowInsetsListener() { // from class: org.game.play.aviator.gameplay.GuideActivity4$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return GuideActivity4.this.m2219lambda$onCreate$0$orggameplayaviatorgameplayGuideActivity4(view, windowInsetsCompat);
            }
        });
        BlurUtil.applyBlur(this.binding.ivBackground);
        if (AppManage.app_nativeAlter < 4) {
            AppManage.getInstance(this).show_NATIVE(this.binding.rlNativeAd, this.binding.tvNativeAd, AppManage.ADMOB_N1, AppManage.FACEBOOK_N1);
        }
        this.binding.btnMale.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity4$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity4.this.m2220lambda$onCreate$1$orggameplayaviatorgameplayGuideActivity4(view);
            }
        });
        this.binding.btnFemale.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity4$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity4.this.m2221lambda$onCreate$2$orggameplayaviatorgameplayGuideActivity4(view);
            }
        });
        this.binding.btn4.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity4$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity4.this.m2223lambda$onCreate$4$orggameplayaviatorgameplayGuideActivity4(view);
            }
        });
    }

    /* renamed from: org.game.play.aviator.gameplay.GuideActivity4$1, reason: invalid class name */
    class AnonymousClass1 extends OnBackPressedCallback {
        AnonymousClass1(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            AppManage appManage = AppManage.getInstance(GuideActivity4.this);
            final GuideActivity4 guideActivity4 = GuideActivity4.this;
            appManage.show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.GuideActivity4$1$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    GuideActivity4.this.finish();
                }
            }, Click.BACKWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    /* renamed from: lambda$onCreate$0$org-game-play-aviator-gameplay-GuideActivity4, reason: not valid java name */
    /* synthetic */ WindowInsetsCompat m2219lambda$onCreate$0$orggameplayaviatorgameplayGuideActivity4(View view, WindowInsetsCompat windowInsetsCompat) {
        this.binding.llHeader.setPadding(this.binding.llHeader.getPaddingLeft(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top + this.binding.llHeader.getPaddingTop(), this.binding.llHeader.getPaddingRight(), this.binding.llHeader.getPaddingBottom());
        return windowInsetsCompat;
    }

    /* renamed from: lambda$onCreate$1$org-game-play-aviator-gameplay-GuideActivity4, reason: not valid java name */
    /* synthetic */ void m2220lambda$onCreate$1$orggameplayaviatorgameplayGuideActivity4(View view) {
        selectGender(this.binding.btnMale, "Male");
    }

    /* renamed from: lambda$onCreate$2$org-game-play-aviator-gameplay-GuideActivity4, reason: not valid java name */
    /* synthetic */ void m2221lambda$onCreate$2$orggameplayaviatorgameplayGuideActivity4(View view) {
        selectGender(this.binding.btnFemale, "Female");
    }

    /* renamed from: lambda$onCreate$4$org-game-play-aviator-gameplay-GuideActivity4, reason: not valid java name */
    /* synthetic */ void m2223lambda$onCreate$4$orggameplayaviatorgameplayGuideActivity4(View view) {
        if (this.selectedGender.isEmpty()) {
            Toast.makeText(this, "Please select your gender", 0).show();
        } else {
            AppManage.getInstance(this).show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.GuideActivity4$$ExternalSyntheticLambda4
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    GuideActivity4.this.m2222lambda$onCreate$3$orggameplayaviatorgameplayGuideActivity4();
                }
            }, Click.GUIDE, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    /* renamed from: lambda$onCreate$3$org-game-play-aviator-gameplay-GuideActivity4, reason: not valid java name */
    /* synthetic */ void m2222lambda$onCreate$3$orggameplayaviatorgameplayGuideActivity4() {
        Intent intent = new Intent(this, (Class<?>) GuideActivity5.class);
        intent.putExtra("selected_gender", this.selectedGender);
        startActivity(intent);
    }

    private void selectGender(View view, String str) {
        View view2 = this.lastSelectedOption;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.bg_language_card_unselected);
        }
        view.setBackgroundResource(R.drawable.bg_language_card_selected);
        this.lastSelectedOption = view;
        this.selectedGender = str;
    }
}
