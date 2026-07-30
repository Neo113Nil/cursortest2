package org.game.play.aviator.gameplay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.EdgeToEdge;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.pesonal.adsdk.AppManage;
import com.pesonal.adsdk.Click;
import org.game.play.aviator.gameplay.databinding.ActivityGuide5Binding;

/* loaded from: classes3.dex */
public class GuideActivity5 extends AppCompatActivity {
    ActivityGuide5Binding binding;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        EdgeToEdge.enable(this);
        ActivityGuide5Binding inflate = ActivityGuide5Binding.inflate(getLayoutInflater());
        this.binding = inflate;
        setContentView(inflate.getRoot());
        SystemUIUtil.hideSystemUI(getWindow());
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass1(true));
        ViewCompat.setOnApplyWindowInsetsListener(this.binding.main, new OnApplyWindowInsetsListener() { // from class: org.game.play.aviator.gameplay.GuideActivity5$$ExternalSyntheticLambda4
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return GuideActivity5.this.m2224lambda$onCreate$0$orggameplayaviatorgameplayGuideActivity5(view, windowInsetsCompat);
            }
        });
        BlurUtil.applyBlur(this.binding.ivBackground);
        if (AppManage.app_nativeAlter < 4) {
            AppManage.getInstance(this).show_NATIVE(this.binding.rlNativeAd, this.binding.tvNativeAd, AppManage.ADMOB_N1, AppManage.FACEBOOK_N1);
        }
        this.binding.catAdventure.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity5$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity5.this.m2225lambda$onCreate$1$orggameplayaviatorgameplayGuideActivity5(view);
            }
        });
        this.binding.catCard.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity5$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity5.this.m2229lambda$onCreate$2$orggameplayaviatorgameplayGuideActivity5(view);
            }
        });
        this.binding.catCasual.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity5$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity5.this.m2230lambda$onCreate$3$orggameplayaviatorgameplayGuideActivity5(view);
            }
        });
        this.binding.catPuzzle.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity5$$ExternalSyntheticLambda10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity5.this.m2231lambda$onCreate$4$orggameplayaviatorgameplayGuideActivity5(view);
            }
        });
        this.binding.catRacing.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity5$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity5.this.m2232lambda$onCreate$5$orggameplayaviatorgameplayGuideActivity5(view);
            }
        });
        this.binding.catSimulation.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity5$$ExternalSyntheticLambda12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity5.this.m2233lambda$onCreate$6$orggameplayaviatorgameplayGuideActivity5(view);
            }
        });
        this.binding.catSports.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity5$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity5.this.m2234lambda$onCreate$7$orggameplayaviatorgameplayGuideActivity5(view);
            }
        });
        this.binding.catStrategy.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity5$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity5.this.m2235lambda$onCreate$8$orggameplayaviatorgameplayGuideActivity5(view);
            }
        });
        this.binding.catWords.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity5$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity5.this.m2236lambda$onCreate$9$orggameplayaviatorgameplayGuideActivity5(view);
            }
        });
        this.binding.catSurvival.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity5$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity5.this.m2226lambda$onCreate$10$orggameplayaviatorgameplayGuideActivity5(view);
            }
        });
        this.binding.btn5.setOnClickListener(new View.OnClickListener() { // from class: org.game.play.aviator.gameplay.GuideActivity5$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideActivity5.this.m2228lambda$onCreate$12$orggameplayaviatorgameplayGuideActivity5(view);
            }
        });
    }

    /* renamed from: org.game.play.aviator.gameplay.GuideActivity5$1, reason: invalid class name */
    class AnonymousClass1 extends OnBackPressedCallback {
        AnonymousClass1(boolean z) {
            super(z);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            AppManage appManage = AppManage.getInstance(GuideActivity5.this);
            final GuideActivity5 guideActivity5 = GuideActivity5.this;
            appManage.show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.GuideActivity5$1$$ExternalSyntheticLambda0
                @Override // com.pesonal.adsdk.AppManage.MyCallback
                public final void callbackCall() {
                    GuideActivity5.this.finish();
                }
            }, Click.BACKWARD, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
        }
    }

    /* renamed from: lambda$onCreate$0$org-game-play-aviator-gameplay-GuideActivity5, reason: not valid java name */
    /* synthetic */ WindowInsetsCompat m2224lambda$onCreate$0$orggameplayaviatorgameplayGuideActivity5(View view, WindowInsetsCompat windowInsetsCompat) {
        this.binding.llHeader.setPadding(this.binding.llHeader.getPaddingLeft(), windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top + this.binding.llHeader.getPaddingTop(), this.binding.llHeader.getPaddingRight(), this.binding.llHeader.getPaddingBottom());
        return windowInsetsCompat;
    }

    /* renamed from: lambda$onCreate$1$org-game-play-aviator-gameplay-GuideActivity5, reason: not valid java name */
    /* synthetic */ void m2225lambda$onCreate$1$orggameplayaviatorgameplayGuideActivity5(View view) {
        updateCategorySelection(this.binding.catAdventure);
    }

    /* renamed from: lambda$onCreate$2$org-game-play-aviator-gameplay-GuideActivity5, reason: not valid java name */
    /* synthetic */ void m2229lambda$onCreate$2$orggameplayaviatorgameplayGuideActivity5(View view) {
        updateCategorySelection(this.binding.catCard);
    }

    /* renamed from: lambda$onCreate$3$org-game-play-aviator-gameplay-GuideActivity5, reason: not valid java name */
    /* synthetic */ void m2230lambda$onCreate$3$orggameplayaviatorgameplayGuideActivity5(View view) {
        updateCategorySelection(this.binding.catCasual);
    }

    /* renamed from: lambda$onCreate$4$org-game-play-aviator-gameplay-GuideActivity5, reason: not valid java name */
    /* synthetic */ void m2231lambda$onCreate$4$orggameplayaviatorgameplayGuideActivity5(View view) {
        updateCategorySelection(this.binding.catPuzzle);
    }

    /* renamed from: lambda$onCreate$5$org-game-play-aviator-gameplay-GuideActivity5, reason: not valid java name */
    /* synthetic */ void m2232lambda$onCreate$5$orggameplayaviatorgameplayGuideActivity5(View view) {
        updateCategorySelection(this.binding.catRacing);
    }

    /* renamed from: lambda$onCreate$6$org-game-play-aviator-gameplay-GuideActivity5, reason: not valid java name */
    /* synthetic */ void m2233lambda$onCreate$6$orggameplayaviatorgameplayGuideActivity5(View view) {
        updateCategorySelection(this.binding.catSimulation);
    }

    /* renamed from: lambda$onCreate$7$org-game-play-aviator-gameplay-GuideActivity5, reason: not valid java name */
    /* synthetic */ void m2234lambda$onCreate$7$orggameplayaviatorgameplayGuideActivity5(View view) {
        updateCategorySelection(this.binding.catSports);
    }

    /* renamed from: lambda$onCreate$8$org-game-play-aviator-gameplay-GuideActivity5, reason: not valid java name */
    /* synthetic */ void m2235lambda$onCreate$8$orggameplayaviatorgameplayGuideActivity5(View view) {
        updateCategorySelection(this.binding.catStrategy);
    }

    /* renamed from: lambda$onCreate$9$org-game-play-aviator-gameplay-GuideActivity5, reason: not valid java name */
    /* synthetic */ void m2236lambda$onCreate$9$orggameplayaviatorgameplayGuideActivity5(View view) {
        updateCategorySelection(this.binding.catWords);
    }

    /* renamed from: lambda$onCreate$10$org-game-play-aviator-gameplay-GuideActivity5, reason: not valid java name */
    /* synthetic */ void m2226lambda$onCreate$10$orggameplayaviatorgameplayGuideActivity5(View view) {
        updateCategorySelection(this.binding.catSurvival);
    }

    /* renamed from: lambda$onCreate$12$org-game-play-aviator-gameplay-GuideActivity5, reason: not valid java name */
    /* synthetic */ void m2228lambda$onCreate$12$orggameplayaviatorgameplayGuideActivity5(View view) {
        AppManage.getInstance(this).show_INTERSTIAL(new AppManage.MyCallback() { // from class: org.game.play.aviator.gameplay.GuideActivity5$$ExternalSyntheticLambda0
            @Override // com.pesonal.adsdk.AppManage.MyCallback
            public final void callbackCall() {
                GuideActivity5.this.m2227lambda$onCreate$11$orggameplayaviatorgameplayGuideActivity5();
            }
        }, Click.GUIDE, AppManage.ADMOB_I1, AppManage.FACEBOOK_I1);
    }

    /* renamed from: lambda$onCreate$11$org-game-play-aviator-gameplay-GuideActivity5, reason: not valid java name */
    /* synthetic */ void m2227lambda$onCreate$11$orggameplayaviatorgameplayGuideActivity5() {
        startActivity(new Intent(this, (Class<?>) StartApp.class));
        finish();
    }

    private void updateCategorySelection(LinearLayout linearLayout) {
        this.binding.catAdventure.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.catCard.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.catCasual.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.catPuzzle.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.catRacing.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.catSimulation.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.catSports.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.catStrategy.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.catWords.setBackgroundResource(R.drawable.bg_language_card_unselected);
        this.binding.catSurvival.setBackgroundResource(R.drawable.bg_language_card_unselected);
        linearLayout.setBackgroundResource(R.drawable.bg_language_card_selected);
    }
}
