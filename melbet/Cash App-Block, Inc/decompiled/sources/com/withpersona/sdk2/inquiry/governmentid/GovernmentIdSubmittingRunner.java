package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidSubmittingScreenBinding;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final class GovernmentIdSubmittingRunner implements LayoutRunner {
    public static final SandboxScreenRunner.Companion Companion = new SandboxScreenRunner.Companion(4);
    public final Pi2GovernmentidSubmittingScreenBinding binding;
    public View currentLoadingAssetView;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StyleElements.PositionType.values().length];
            try {
                iArr[StyleElements.PositionType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StyleElements.PositionType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StyleElements.PositionType.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GovernmentIdSubmittingRunner(Pi2GovernmentidSubmittingScreenBinding pi2GovernmentidSubmittingScreenBinding) {
        pi2GovernmentidSubmittingScreenBinding.getClass();
        this.binding = pi2GovernmentidSubmittingScreenBinding;
        ConstraintLayout constraintLayout = pi2GovernmentidSubmittingScreenBinding.rootView;
        Context context = constraintLayout.getContext();
        context.getClass();
        Integer resourceIdFromAttr$default = ResToolsKt.resourceIdFromAttr$default(context, R.attr.personaInquiryLoadingLottieRaw);
        ThemeableLottieAnimationView themeableLottieAnimationView = pi2GovernmentidSubmittingScreenBinding.pendingAnimation;
        if (resourceIdFromAttr$default != null) {
            themeableLottieAnimationView.setAnimation(resourceIdFromAttr$default.intValue());
            themeableLottieAnimationView.removeAllUpdateListeners();
        } else {
            themeableLottieAnimationView.addValueCallback(new KeyPath("scanner", "**"), (KeyPath) LottieProperty.COLOR, (SimpleLottieValueCallback<KeyPath>) new MaterialButton$$ExternalSyntheticLambda3(this, pi2GovernmentidSubmittingScreenBinding));
        }
        constraintLayout.getClass();
        InsetsUtilsKt.applyInsetsAsPadding$default(constraintLayout, 15);
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(final Screen.SubmittingScreen submittingScreen, ViewEnvironment viewEnvironment) {
        float f;
        submittingScreen.getClass();
        viewEnvironment.getClass();
        NavigationState navigationState = submittingScreen.navigationState;
        String str = submittingScreen.description;
        final int i = 0;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdSubmittingRunner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                Screen.SubmittingScreen submittingScreen2 = submittingScreen;
                switch (i2) {
                    case 0:
                        submittingScreen2.onBack.invoke();
                        break;
                    default:
                        submittingScreen2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i2 = 1;
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.GovernmentIdSubmittingRunner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                Screen.SubmittingScreen submittingScreen2 = submittingScreen;
                switch (i22) {
                    case 0:
                        submittingScreen2.onBack.invoke();
                        break;
                    default:
                        submittingScreen2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        Pi2GovernmentidSubmittingScreenBinding pi2GovernmentidSubmittingScreenBinding = this.binding;
        Pi2NavigationBar pi2NavigationBar = pi2GovernmentidSubmittingScreenBinding.navigationBar;
        ConstraintLayout constraintLayout = pi2GovernmentidSubmittingScreenBinding.contentContainer;
        ThemeableLottieAnimationView themeableLottieAnimationView = pi2GovernmentidSubmittingScreenBinding.pendingAnimation;
        ConstraintLayout constraintLayout2 = pi2GovernmentidSubmittingScreenBinding.animationContainer;
        TextView textView = pi2GovernmentidSubmittingScreenBinding.body;
        ConstraintLayout constraintLayout3 = pi2GovernmentidSubmittingScreenBinding.rootView;
        constraintLayout3.getClass();
        zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, constraintLayout3);
        String str2 = submittingScreen.title;
        int length = str2.length();
        TextView textView2 = pi2GovernmentidSubmittingScreenBinding.title;
        if (length == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(str2);
            textView2.sendAccessibilityEvent(32768);
        }
        if (str.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        NextStep.GovernmentId.AssetConfig.PendingPage pendingPage = submittingScreen.assetConfig;
        RemoteImage loadingPictograph = pendingPage != null ? pendingPage.getLoadingPictograph() : null;
        if (loadingPictograph != null && this.currentLoadingAssetView == null) {
            this.currentLoadingAssetView = RemoteImageUtilsKt.renderToContainer(loadingPictograph, constraintLayout2, true);
            themeableLottieAnimationView.setVisibility(8);
        }
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = submittingScreen.styles;
        if (governmentIdStepStyle != null) {
            PendingPageTextPosition pendingPageTextPosition = submittingScreen.pendingPageTextVerticalPosition;
            StyleElements.PositionType pendingPageAlignmentValue = governmentIdStepStyle.getPendingPageAlignmentValue();
            if (pendingPageAlignmentValue == null) {
                pendingPageAlignmentValue = pendingPageTextPosition == PendingPageTextPosition.TOP ? StyleElements.PositionType.START : StyleElements.PositionType.CENTER;
            }
            int[] iArr = pendingPageTextPosition == PendingPageTextPosition.TOP ? new int[]{textView2.getId(), textView.getId(), constraintLayout2.getId()} : new int[]{constraintLayout2.getId(), textView2.getId(), textView.getId()};
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(constraintLayout);
            int i3 = WhenMappings.$EnumSwitchMapping$0[pendingPageAlignmentValue.ordinal()];
            if (i3 == 1) {
                f = RecyclerView.DECELERATION_RATE;
            } else if (i3 == 2) {
                f = 0.5f;
            } else {
                if (i3 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                f = 1.0f;
            }
            constraintSet.createVerticalChain(2, iArr);
            constraintSet.setVerticalBias(f, ArraysKt___ArraysKt.first(iArr));
            constraintSet.applyTo(constraintLayout);
            Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
            if (backgroundColorValue != null) {
                int intValue = backgroundColorValue.intValue();
                constraintLayout3.setBackgroundColor(intValue);
                Context context = constraintLayout3.getContext();
                context.getClass();
                zzat.updateSystemUiColor(viewEnvironment, context, intValue);
            }
            Context context2 = constraintLayout3.getContext();
            context2.getClass();
            Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(governmentIdStepStyle, context2);
            if (backgroundImageDrawable != null) {
                constraintLayout3.setBackground(backgroundImageDrawable);
            }
            TextBasedComponentStyle processingTitleStyleValue = governmentIdStepStyle.getProcessingTitleStyleValue();
            if (processingTitleStyleValue != null) {
                TextStylingKt.style(textView2, processingTitleStyleValue, EmptySet.INSTANCE);
            }
            TextBasedComponentStyle processingTextStyleValue = governmentIdStepStyle.getProcessingTextStyleValue();
            if (processingTextStyleValue != null) {
                TextStylingKt.style(textView, processingTextStyleValue, EmptySet.INSTANCE);
            }
            Integer fillColorValue = governmentIdStepStyle.getFillColorValue();
            if (fillColorValue != null) {
                int intValue2 = fillColorValue.intValue();
                themeableLottieAnimationView.addColorReplacement(Color.parseColor("#AA85FF"), intValue2);
                themeableLottieAnimationView.addColorReplacement(Color.parseColor("#4600EB"), intValue2);
            }
            Integer strokeColorValue = governmentIdStepStyle.getStrokeColorValue();
            if (strokeColorValue != null) {
                themeableLottieAnimationView.addColorReplacement(Color.parseColor("#190052"), strokeColorValue.intValue());
            }
            Integer backgroundColorValue2 = governmentIdStepStyle.getBackgroundColorValue();
            if (backgroundColorValue2 != null) {
                int intValue3 = backgroundColorValue2.intValue();
                themeableLottieAnimationView.addColorReplacement(Color.parseColor("#FFFFFF"), intValue3);
                themeableLottieAnimationView.addColorReplacement(Color.parseColor("#F1EBFF"), intValue3);
            }
        }
    }
}
