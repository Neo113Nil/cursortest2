package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.common.hash.AbstractHashFunction;
import com.squareup.cash.R;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.sandbox.SandboxScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieSubmittingScreenBinding;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
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
import kotlinx.coroutines.JobKt;

/* loaded from: classes9.dex */
public final class SelfieSubmittingRunner implements LayoutRunner {
    public static final SandboxScreenRunner.Companion Companion = new SandboxScreenRunner.Companion(8);
    public final Pi2SelfieSubmittingScreenBinding binding;
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

    public SelfieSubmittingRunner(Pi2SelfieSubmittingScreenBinding pi2SelfieSubmittingScreenBinding) {
        pi2SelfieSubmittingScreenBinding.getClass();
        this.binding = pi2SelfieSubmittingScreenBinding;
        ConstraintLayout constraintLayout = pi2SelfieSubmittingScreenBinding.rootView;
        constraintLayout.getClass();
        InsetsUtilsKt.applyInsetsAsPadding$default(constraintLayout, 15);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0077  */
    @Override // com.squareup.workflow1.ui.LayoutRunner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void showRendering(final SelfieWorkflow.Screen.SubmittingScreen submittingScreen, ViewEnvironment viewEnvironment) {
        AppCompatActivity activity;
        char c;
        RemoteImage remoteImage;
        StepStyles.SelfieStepStyle selfieStepStyle;
        int[] iArr;
        float f;
        submittingScreen.getClass();
        viewEnvironment.getClass();
        NavigationState navigationState = submittingScreen.navigationState;
        String str = submittingScreen.description;
        String str2 = submittingScreen.title;
        final int i = 0;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieSubmittingRunner$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SelfieWorkflow.Screen.SubmittingScreen submittingScreen2 = submittingScreen;
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
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.SelfieSubmittingRunner$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SelfieWorkflow.Screen.SubmittingScreen submittingScreen2 = submittingScreen;
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
        Pi2SelfieSubmittingScreenBinding pi2SelfieSubmittingScreenBinding = this.binding;
        Pi2NavigationBar pi2NavigationBar = pi2SelfieSubmittingScreenBinding.navigationBar;
        ConstraintLayout constraintLayout = pi2SelfieSubmittingScreenBinding.contentContainer;
        ConstraintLayout constraintLayout2 = pi2SelfieSubmittingScreenBinding.animationContainer;
        TextView textView = pi2SelfieSubmittingScreenBinding.body;
        TextView textView2 = pi2SelfieSubmittingScreenBinding.title;
        ConstraintLayout constraintLayout3 = pi2SelfieSubmittingScreenBinding.rootView;
        constraintLayout3.getClass();
        zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, constraintLayout3);
        Context context = constraintLayout3.getContext();
        context.getClass();
        Integer resourceIdFromAttr$default = ResToolsKt.resourceIdFromAttr$default(context, R.attr.personaInquiryLoadingLottieRaw);
        ThemeableLottieAnimationView themeableLottieAnimationView = pi2SelfieSubmittingScreenBinding.pendingAnimation;
        if (resourceIdFromAttr$default != null) {
            themeableLottieAnimationView.setAnimation(resourceIdFromAttr$default.intValue());
            themeableLottieAnimationView.removeAllAnimatorListeners();
        } else {
            Context context2 = themeableLottieAnimationView.getContext();
            if (context2 != null && (activity = ContextUtilsKt.getActivity(context2)) != null) {
                c = 0;
                JobKt.launch$default(ViewModelKt.getCoroutineScope(activity.getLifecycle()), null, null, new SelfieSubmittingRunner$showRendering$1$3(pi2SelfieSubmittingScreenBinding, submittingScreen, null), 3);
                if (str2.length() != 0) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(str2);
                    textView2.sendAccessibilityEvent(32768);
                }
                if (str.length() != 0) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(str);
                }
                remoteImage = submittingScreen.customLoadingAsset;
                if (remoteImage != null && this.currentLoadingAssetView == null) {
                    this.currentLoadingAssetView = RemoteImageUtilsKt.renderToContainer(remoteImage, constraintLayout2, true);
                    themeableLottieAnimationView.setVisibility(8);
                }
                selfieStepStyle = submittingScreen.styles;
                if (selfieStepStyle == null) {
                    PendingPageTextPosition pendingPageTextPosition = submittingScreen.pendingPageTextVerticalPosition;
                    StyleElements.PositionType pendingPageAlignmentValue = selfieStepStyle.getPendingPageAlignmentValue();
                    if (pendingPageAlignmentValue == null) {
                        pendingPageAlignmentValue = pendingPageTextPosition == PendingPageTextPosition.TOP ? StyleElements.PositionType.START : StyleElements.PositionType.CENTER;
                    }
                    if (pendingPageTextPosition == PendingPageTextPosition.TOP) {
                        iArr = new int[3];
                        iArr[c] = textView2.getId();
                        iArr[1] = textView.getId();
                        iArr[2] = constraintLayout2.getId();
                    } else {
                        iArr = new int[3];
                        iArr[c] = constraintLayout2.getId();
                        iArr[1] = textView2.getId();
                        iArr[2] = textView.getId();
                    }
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
                    Integer backgroundColorValue = selfieStepStyle.getBackgroundColorValue();
                    if (backgroundColorValue != null) {
                        int intValue = backgroundColorValue.intValue();
                        constraintLayout3.setBackgroundColor(intValue);
                        Context context3 = constraintLayout3.getContext();
                        context3.getClass();
                        zzat.updateSystemUiColor(viewEnvironment, context3, intValue);
                    }
                    Context context4 = constraintLayout3.getContext();
                    context4.getClass();
                    Drawable backgroundImageDrawable = AbstractHashFunction.backgroundImageDrawable(selfieStepStyle, context4);
                    if (backgroundImageDrawable != null) {
                        constraintLayout3.setBackground(backgroundImageDrawable);
                    }
                    TextBasedComponentStyle processingTitleStyleValue = selfieStepStyle.getProcessingTitleStyleValue();
                    if (processingTitleStyleValue != null) {
                        TextStylingKt.style(textView2, processingTitleStyleValue, EmptySet.INSTANCE);
                    }
                    TextBasedComponentStyle processingTextStyleValue = selfieStepStyle.getProcessingTextStyleValue();
                    if (processingTextStyleValue != null) {
                        TextStylingKt.style(textView, processingTextStyleValue, EmptySet.INSTANCE);
                    }
                    Integer fillColorValue = selfieStepStyle.getFillColorValue();
                    if (fillColorValue != null) {
                        int intValue2 = fillColorValue.intValue();
                        themeableLottieAnimationView.addColorReplacement(Color.parseColor("#AA85FF"), intValue2);
                        themeableLottieAnimationView.addColorReplacement(Color.parseColor("#4600EB"), intValue2);
                    }
                    Integer strokeColorValue = selfieStepStyle.getStrokeColorValue();
                    if (strokeColorValue != null) {
                        themeableLottieAnimationView.addColorReplacement(Color.parseColor("#190052"), strokeColorValue.intValue());
                    }
                    Integer backgroundColorValue2 = selfieStepStyle.getBackgroundColorValue();
                    if (backgroundColorValue2 != null) {
                        int intValue3 = backgroundColorValue2.intValue();
                        themeableLottieAnimationView.addColorReplacement(Color.parseColor("#FFFFFF"), intValue3);
                        themeableLottieAnimationView.addColorReplacement(Color.parseColor("#F1EBFF"), intValue3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        c = 0;
        if (str2.length() != 0) {
        }
        if (str.length() != 0) {
        }
        remoteImage = submittingScreen.customLoadingAsset;
        if (remoteImage != null) {
            this.currentLoadingAssetView = RemoteImageUtilsKt.renderToContainer(remoteImage, constraintLayout2, true);
            themeableLottieAnimationView.setVisibility(8);
        }
        selfieStepStyle = submittingScreen.styles;
        if (selfieStepStyle == null) {
        }
    }
}
