package com.squareup.cash.ui;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.splashscreen.SplashScreen$KeepOnScreenCondition;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import coil3.memory.MemoryCacheService;
import com.google.android.material.focus.FocusRingDrawable;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientArcadeMigrationSplashScreen;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.ui.util.SplashScreenAnimationKt;
import java.util.Set;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda3 implements SplashScreen$KeepOnScreenCondition {
    public final /* synthetic */ MainActivity f$0;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda3(MainActivity mainActivity) {
        this.f$0 = mainActivity;
    }

    public void onSplashScreenExit(final MemoryCacheService memoryCacheService) {
        int i = MainActivity.$r8$clinit;
        memoryCacheService.getClass();
        WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) memoryCacheService.imageLoader;
        MainActivity mainActivity = this.f$0;
        ViewGroup viewGroup = mainActivity.container;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("container");
            throw null;
        }
        FeatureFlagManager featureFlagManager = ((SandboxedActivityContext) mainActivity.getSandboxedActivityContextFlow().getValue()).featureFlagManager;
        SplashScreenAnimationObserver splashScreenAnimationObserver = ((SandboxedActivityContext) mainActivity.getSandboxedActivityContextFlow().getValue()).splashScreenAnimationObserver;
        ErrorReporter errorReporter = mainActivity.errorReporter;
        if (errorReporter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("errorReporter");
            throw null;
        }
        FocusRingDrawable.AnonymousClass1 anonymousClass1 = SplashScreenAnimationKt.splashAnimationTranslationY;
        try {
            View iconView = workLauncherImpl.getIconView();
            if (!(iconView instanceof ImageView)) {
                workLauncherImpl.remove();
                return;
            }
            if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(AmplitudeExperiments$ClientArcadeMigrationSplashScreen.INSTANCE)).enabled()) {
                SplashScreenAnimationKt.startModernSplashScreenAnimation(mainActivity, memoryCacheService, (ImageView) iconView, viewGroup, splashScreenAnimationObserver);
                return;
            }
            ViewGroup splashScreenView = workLauncherImpl.getSplashScreenView();
            Property property = View.ALPHA;
            property.getClass();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(splashScreenView, (Property<ViewGroup, Float>) property, 1.0f, RecyclerView.DECELERATION_RATE);
            ofFloat.setDuration(200L);
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.squareup.cash.ui.util.SplashScreenAnimationKt$startLegacySplashScreenAnimation$lambda$0$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    ((WorkLauncherImpl) MemoryCacheService.this.imageLoader).remove();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
            ofFloat.start();
        } catch (Exception e) {
            errorReporter.report(new ReportedError() { // from class: com.squareup.cash.ui.util.SplashScreenAnimationKt$startSplashScreenAnimation$1
                @Override // java.lang.Throwable
                public final Throwable getCause() {
                    return e;
                }

                @Override // com.squareup.cash.observability.types.FeatureError
                public final Set getFeatures() {
                    return SetsKt__SetsJVMKt.setOf(ErrorFeature.DesignSystems.INSTANCE);
                }

                @Override // com.squareup.cash.observability.types.ReportedError
                public final String getGroupingDescriptor() {
                    return e.getMessage();
                }
            }, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            workLauncherImpl.remove();
        }
    }

    @Override // androidx.core.splashscreen.SplashScreen$KeepOnScreenCondition
    public boolean shouldKeepOnScreen() {
        MainActivity mainActivity = this.f$0;
        return (mainActivity.isContentReady && ((RealFeatureFlagManager) ((SandboxedActivityContext) mainActivity.getSandboxedActivityContextFlow().getValue()).featureFlagManager).featureFlagsQueried.isCompleted()) ? false : true;
    }
}
