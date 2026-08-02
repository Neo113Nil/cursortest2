package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.databinding.Pi2DocumentLoadingBinding;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiController;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.steps.ui.ScreenRenderer;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final class DocumentPendingRunner implements LayoutRunner, ScreenRenderer {
    public static final SandboxScreenRunner.Companion Companion = new SandboxScreenRunner.Companion(1);
    public final Pi2DocumentLoadingBinding binding;
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

    public DocumentPendingRunner(Pi2DocumentLoadingBinding pi2DocumentLoadingBinding) {
        pi2DocumentLoadingBinding.getClass();
        this.binding = pi2DocumentLoadingBinding;
        ConstraintLayout constraintLayout = pi2DocumentLoadingBinding.rootView;
        Context context = constraintLayout.getContext();
        context.getClass();
        Integer resourceIdFromAttr$default = ResToolsKt.resourceIdFromAttr$default(context, R.attr.personaInquiryLoadingLottieRaw);
        ThemeableLottieAnimationView themeableLottieAnimationView = pi2DocumentLoadingBinding.pendingAnimation;
        if (resourceIdFromAttr$default != null) {
            themeableLottieAnimationView.setAnimation(resourceIdFromAttr$default.intValue());
            themeableLottieAnimationView.removeAllUpdateListeners();
        } else {
            int parseColor = Color.parseColor("#4600EB");
            Context context2 = constraintLayout.getContext();
            context2.getClass();
            TypedValue typedValue = new TypedValue();
            context2.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
            themeableLottieAnimationView.addColorReplacement(parseColor, typedValue.data);
        }
        constraintLayout.getClass();
        InsetsUtilsKt.applyInsetsAsPadding$default(constraintLayout, 15);
    }

    public final void render(final DocumentWorkflow.Screen.LoadingAnimation loadingAnimation, SystemUiController systemUiController) {
        float f;
        loadingAnimation.getClass();
        NavigationState navigationState = loadingAnimation.navigationState;
        String str = loadingAnimation.prompt;
        final int i = 0;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentPendingRunner$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DocumentWorkflow.Screen.LoadingAnimation loadingAnimation2 = loadingAnimation;
                switch (i2) {
                    case 0:
                        loadingAnimation2.onBack.invoke();
                        break;
                    default:
                        loadingAnimation2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i2 = 1;
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.document.DocumentPendingRunner$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DocumentWorkflow.Screen.LoadingAnimation loadingAnimation2 = loadingAnimation;
                switch (i22) {
                    case 0:
                        loadingAnimation2.onBack.invoke();
                        break;
                    default:
                        loadingAnimation2.onCancel.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        Pi2DocumentLoadingBinding pi2DocumentLoadingBinding = this.binding;
        Pi2NavigationBar pi2NavigationBar = pi2DocumentLoadingBinding.navigationBar;
        ConstraintLayout constraintLayout = pi2DocumentLoadingBinding.contentContainer;
        ThemeableLottieAnimationView themeableLottieAnimationView = pi2DocumentLoadingBinding.pendingAnimation;
        ConstraintLayout constraintLayout2 = pi2DocumentLoadingBinding.animationContainer;
        TextView textView = pi2DocumentLoadingBinding.body;
        TextView textView2 = pi2DocumentLoadingBinding.title;
        ConstraintLayout constraintLayout3 = pi2DocumentLoadingBinding.rootView;
        constraintLayout3.getClass();
        zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, constraintLayout3);
        String str2 = loadingAnimation.title;
        if (str2 == null || str2.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(str2);
            textView2.sendAccessibilityEvent(32768);
        }
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        NextStep.Document.AssetConfig.PendingPage pendingPage = loadingAnimation.assetConfig;
        RemoteImage loadingPictograph = pendingPage != null ? pendingPage.getLoadingPictograph() : null;
        if (loadingPictograph != null && this.currentLoadingAssetView == null) {
            this.currentLoadingAssetView = RemoteImageUtilsKt.renderToContainer(loadingPictograph, constraintLayout2, true);
            themeableLottieAnimationView.setVisibility(8);
        }
        StepStyles.DocumentStepStyle documentStepStyle = loadingAnimation.styles;
        if (documentStepStyle != null) {
            PendingPageTextPosition pendingPageTextPosition = loadingAnimation.pendingPageTextVerticalPosition;
            StyleElements.PositionType pendingPageAlignmentValue = documentStepStyle.getPendingPageAlignmentValue();
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
            Integer backgroundColorValue = documentStepStyle.getBackgroundColorValue();
            if (backgroundColorValue != null) {
                int intValue = backgroundColorValue.intValue();
                constraintLayout3.setBackgroundColor(intValue);
                if (systemUiController != null) {
                    Context context = constraintLayout3.getContext();
                    context.getClass();
                    systemUiController.updateSystemUiColor(context, intValue);
                }
            }
            Context context2 = constraintLayout3.getContext();
            context2.getClass();
            Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(documentStepStyle, context2);
            if (backgroundImageDrawable != null) {
                constraintLayout3.setBackground(backgroundImageDrawable);
            }
            TextBasedComponentStyle processingTitleStyleValue = documentStepStyle.getProcessingTitleStyleValue();
            if (processingTitleStyleValue != null) {
                TextStylingKt.style(textView2, processingTitleStyleValue, EmptySet.INSTANCE);
            }
            TextBasedComponentStyle processingTextStyleValue = documentStepStyle.getProcessingTextStyleValue();
            if (processingTextStyleValue != null) {
                TextStylingKt.style(textView, processingTextStyleValue, EmptySet.INSTANCE);
            }
            Integer fillColorValue = documentStepStyle.getFillColorValue();
            if (fillColorValue != null) {
                themeableLottieAnimationView.addColorReplacement(Color.parseColor("#4600EB"), fillColorValue.intValue());
            }
            Integer strokeColorValue = documentStepStyle.getStrokeColorValue();
            if (strokeColorValue != null) {
                int intValue2 = strokeColorValue.intValue();
                themeableLottieAnimationView.addColorReplacement(Color.parseColor("#180052"), intValue2);
                themeableLottieAnimationView.addColorReplacement(Color.parseColor("#190052"), intValue2);
            }
        }
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(Object obj, ViewEnvironment viewEnvironment) {
        viewEnvironment.getClass();
        render((DocumentWorkflow.Screen.LoadingAnimation) obj, zzat.getSystemUiController(viewEnvironment));
    }
}
