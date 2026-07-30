package org.game.play.aviator.gameplay;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.Click;
import org.game.play.aviator.gameplay.databinding.ActivityGuide1Binding;

/* loaded from: classes3.dex */
public class GuideActivity1 extends AppCompatActivity {
    private ActivityGuide1Binding binding;
    private View lastSelectedOption = null;
    private String selectedLanguage = "";

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        ActivityGuide1Binding inflate = ActivityGuide1Binding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        SystemUIUtil.hideSystemUI(getWindow());
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(true));
        ViewCompat.setOnApplyWindowInsetsListener(this.binding.main, new OnApplyWindowInsetsListener() { // from class: org.game.play.aviator.gameplay.GuideActivity1$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return GuideActivity1.this.m2194lambda$onCreate$0$orggameplayaviatorgameplayGuideActivity1(view, windowInsetsCompat);
            }
        });
        BlurUtil.applyBlur(this.binding.ivBackground);
        if (AppManage.app_nativeAlter < 4) {
            AppManage.getInstance(this).show_NATIVE(this.binding.rlNativeAd, this.binding.tvNativeAd, AppManage.ADMOB_N1, AppManage.FACEBOOK_N1);
        }
        this.binding.btnEnglish.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity1$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity1.this.m2195lambda$onCreate$1$orggameplayaviatorgameplayGuideActivity1(view);
            }
        });
        this.binding.btnHindi.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity1$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity1.this.m2196lambda$onCreate$2$orggameplayaviatorgameplayGuideActivity1(view);
            }
        });
        this.binding.btnGujarati.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity1$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity1.this.m2197lambda$onCreate$3$orggameplayaviatorgameplayGuideActivity1(view);
            }
        });
        this.binding.btnSpanish.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity1$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity1.this.m2198lambda$onCreate$4$orggameplayaviatorgameplayGuideActivity1(view);
            }
        });
        this.binding.btnFrench.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity1$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity1.this.m2199lambda$onCreate$5$orggameplayaviatorgameplayGuideActivity1(view);
            }
        });
        this.binding.btnRussian.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity1$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity1.this.m2200lambda$onCreate$6$orggameplayaviatorgameplayGuideActivity1(view);
            }
        });
        this.binding.btn1.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity1$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity1.this.m2202lambda$onCreate$8$orggameplayaviatorgameplayGuideActivity1(view);
            }
        });
    }

    /* renamed from: org.game.play.aviator.gameplay.GuideActivity1$1, reason: invalid class name */
    class AnonymousClass1 extends OnBackPressedCallback {
        AnonymousClass1(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            AppManage appManage = AppManage.getInstance(GuideActivity1.this);
            final GuideActivity1 guideActivity1 = GuideActivity1.this;
            appManage.show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.GuideActivity1$1$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    GuideActivity1.this.finish();
                }
            }, Click.BACKWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    /* renamed from: lambda$onCreate$0$org-game-play-aviator-gameplay-GuideActivity1, reason: not valid java name */
    /* synthetic */ WindowInsetsCompat m2194lambda$onCreate$0$orggameplayaviatorgameplayGuideActivity1(View view, WindowInsetsCompat windowInsetsCompat) {
        this.binding.llHeader.setPadding(this.binding.llHeader.getPaddingLeft(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top + this.binding.llHeader.getPaddingTop(), this.binding.llHeader.getPaddingRight(), this.binding.llHeader.getPaddingBottom());
        return windowInsetsCompat;
    }

    /* renamed from: lambda$onCreate$1$org-game-play-aviator-gameplay-GuideActivity1, reason: not valid java name */
    /* synthetic */ void m2195lambda$onCreate$1$orggameplayaviatorgameplayGuideActivity1(View view) {
        selectLanguage(this.binding.btnEnglish, "English");
    }

    /* renamed from: lambda$onCreate$2$org-game-play-aviator-gameplay-GuideActivity1, reason: not valid java name */
    /* synthetic */ void m2196lambda$onCreate$2$orggameplayaviatorgameplayGuideActivity1(View view) {
        selectLanguage(this.binding.btnHindi, "Hindi");
    }

    /* renamed from: lambda$onCreate$3$org-game-play-aviator-gameplay-GuideActivity1, reason: not valid java name */
    /* synthetic */ void m2197lambda$onCreate$3$orggameplayaviatorgameplayGuideActivity1(View view) {
        selectLanguage(this.binding.btnGujarati, "Gujarati");
    }

    /* renamed from: lambda$onCreate$4$org-game-play-aviator-gameplay-GuideActivity1, reason: not valid java name */
    /* synthetic */ void m2198lambda$onCreate$4$orggameplayaviatorgameplayGuideActivity1(View view) {
        selectLanguage(this.binding.btnSpanish, "Spanish");
    }

    /* renamed from: lambda$onCreate$5$org-game-play-aviator-gameplay-GuideActivity1, reason: not valid java name */
    /* synthetic */ void m2199lambda$onCreate$5$orggameplayaviatorgameplayGuideActivity1(View view) {
        selectLanguage(this.binding.btnFrench, "French");
    }

    /* renamed from: lambda$onCreate$6$org-game-play-aviator-gameplay-GuideActivity1, reason: not valid java name */
    /* synthetic */ void m2200lambda$onCreate$6$orggameplayaviatorgameplayGuideActivity1(View view) {
        selectLanguage(this.binding.btnRussian, "Russian");
    }

    /* renamed from: lambda$onCreate$8$org-game-play-aviator-gameplay-GuideActivity1, reason: not valid java name */
    /* synthetic */ void m2202lambda$onCreate$8$orggameplayaviatorgameplayGuideActivity1(View view) {
        if (this.selectedLanguage.isEmpty()) {
            Toast.makeText(this, "Please select your language", 0).show();
        } else {
            AppManage.getInstance(this).show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.GuideActivity1$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    GuideActivity1.this.m2201lambda$onCreate$7$orggameplayaviatorgameplayGuideActivity1();
                }
            }, Click.GUIDE, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    /* renamed from: lambda$onCreate$7$org-game-play-aviator-gameplay-GuideActivity1, reason: not valid java name */
    /* synthetic */ void m2201lambda$onCreate$7$orggameplayaviatorgameplayGuideActivity1() {
        Intent intent = new Intent(this, (Class<?>) GuideActivity2.class);
        intent.putExtra("selected_language", this.selectedLanguage);
        startActivity(intent);
    }

    private void selectLanguage(View view, String str) {
        View view2 = this.lastSelectedOption;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.bg_language_card_unselected);
            updateRadioButton(this.lastSelectedOption, false);
        }
        view.setBackgroundResource(R.drawable.bg_language_card_selected);
        updateRadioButton(view, true);
        this.lastSelectedOption = view;
        this.selectedLanguage = str;
    }

    private void updateRadioButton(View view, boolean z) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof RadioButton) {
                    RadioButton radioButton = (RadioButton) childAt;
                    radioButton.setChecked(z);
                    radioButton.setButtonTintList(ColorStateList.valueOf(Color.parseColor(z ? "#FFFFFF" : "#66FFFFFF")));
                }
            }
        }
    }
}
