package com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners;

import android.content.Context;
import android.widget.Button;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.play.core.splitinstall.internal.zzai;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.android.play.integrity.internal.ah;
import com.squareup.cash.R;
import com.squareup.cash.support.chat.views.ChatView$$ExternalSyntheticLambda28;
import com.squareup.workflow1.ui.LayoutRunner;
import com.squareup.workflow1.ui.ViewEnvironment;
import com.valentinilk.shimmer.ShimmerThemeKt$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.governmentid.Screen;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.ErrorView$$ExternalSyntheticLambda4;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2ErrorBinding;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.ButtonSubmitComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.LocalImageComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.ui.InsetsUtilsKt;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.styling.ButtonStylingKt;
import com.withpersona.sdk2.inquiry.steps.ui.styling.TextStylingKt;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes9.dex */
public final class ErrorScreenRunner implements LayoutRunner {
    public final Pi2ErrorBinding binding;

    static {
        int i = ErrorScreenRunner$Companion$1.$r8$clinit;
        int i2 = ErrorScreenRunner$Companion$2.$r8$clinit;
        Reflection.factory.getOrCreateKotlinClass(Screen.ErrorScreen.class);
    }

    public ErrorScreenRunner(Pi2ErrorBinding pi2ErrorBinding) {
        pi2ErrorBinding.getClass();
        this.binding = pi2ErrorBinding;
        CoordinatorLayout coordinatorLayout = pi2ErrorBinding.rootView;
        coordinatorLayout.getClass();
        InsetsUtilsKt.applyInsetsAsPadding$default(coordinatorLayout, 15);
    }

    @Override // com.squareup.workflow1.ui.LayoutRunner
    public final void showRendering(final Screen.ErrorScreen errorScreen, ViewEnvironment viewEnvironment) {
        StepStyles.StepSubmitButtonComponentStyleContainer base;
        ButtonSubmitComponentStyle base2;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        StepStyles.GovernmentIdStepImageLocalStyle imageLocalStyle;
        StepStyles.GovernmentIdStepImageLocalStyleContainer illustration;
        errorScreen.getClass();
        viewEnvironment.getClass();
        NavigationState navigationState = errorScreen.navigationState;
        final int i = 0;
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners.ErrorScreenRunner$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                Screen.ErrorScreen errorScreen2 = errorScreen;
                switch (i2) {
                    case 0:
                        errorScreen2.onBackClick.invoke();
                        break;
                    default:
                        errorScreen2.onCancelClick.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i2 = 1;
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.runners.ErrorScreenRunner$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                Screen.ErrorScreen errorScreen2 = errorScreen;
                switch (i22) {
                    case 0:
                        errorScreen2.onBackClick.invoke();
                        break;
                    default:
                        errorScreen2.onCancelClick.invoke();
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        Pi2ErrorBinding pi2ErrorBinding = this.binding;
        Pi2NavigationBar pi2NavigationBar = pi2ErrorBinding.navigationBar;
        Button button = pi2ErrorBinding.continueButton;
        TextView textView = pi2ErrorBinding.title;
        CoordinatorLayout coordinatorLayout = pi2ErrorBinding.rootView;
        coordinatorLayout.getClass();
        zzai.applyNavigationState(navigationState, function0, function02, new ShimmerThemeKt$$ExternalSyntheticLambda0(25), pi2NavigationBar, coordinatorLayout);
        StepStyles.GovernmentIdStepStyle governmentIdStepStyle = errorScreen.styles;
        LocalImageComponentStyle base5 = (governmentIdStepStyle == null || (imageLocalStyle = governmentIdStepStyle.getImageLocalStyle()) == null || (illustration = imageLocalStyle.getIllustration()) == null) ? null : illustration.getBase();
        pi2ErrorBinding.illustration.setAnimation(R.raw.pi2_id_front_fail);
        if (base5 != null) {
            coordinatorLayout.getClass();
            ah.addOneShotPreDrawListenerAndDiscardFrame(coordinatorLayout, new ErrorView$$ExternalSyntheticLambda4(pi2ErrorBinding, base5, 1));
        }
        textView.setText(errorScreen.titleText);
        button.setText(errorScreen.continueButtonText);
        button.setOnClickListener(new ChatView$$ExternalSyntheticLambda28(errorScreen, 19));
        if (governmentIdStepStyle != null) {
            coordinatorLayout.getClass();
            Integer backgroundColorValue = governmentIdStepStyle.getBackgroundColorValue();
            if (backgroundColorValue != null) {
                int intValue = backgroundColorValue.intValue();
                coordinatorLayout.setBackgroundColor(intValue);
                Context context = coordinatorLayout.getContext();
                context.getClass();
                zzat.updateSystemUiColor(viewEnvironment, context, intValue);
            }
            StepStyles.GovernmentIdStepTitleComponentStyle titleStyle = governmentIdStepStyle.getTitleStyle();
            if (titleStyle != null && (base3 = titleStyle.getBase()) != null && (base4 = base3.getBase()) != null) {
                TextStylingKt.style(textView, base4, EmptySet.INSTANCE);
            }
            StepStyles.GovernmentIdStepPrimaryButtonComponentStyle buttonPrimaryStyle = governmentIdStepStyle.getButtonPrimaryStyle();
            if (buttonPrimaryStyle == null || (base = buttonPrimaryStyle.getBase()) == null || (base2 = base.getBase()) == null) {
                return;
            }
            ButtonStylingKt.style$default(button, base2, false, false, 14);
        }
    }
}
