package com.withpersona.sdk2.inquiry.governmentid.autoClassification;

import com.squareup.workflow1.ui.AndroidViewRendering;
import com.squareup.workflow1.ui.DecorativeViewFactory;
import com.squareup.workflow1.ui.ViewFactory;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda2;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes9.dex */
public final class ErrorView implements AndroidViewRendering {
    public final String continueButtonText;
    public final NavigationState navigationState;
    public final CaptureRenderer$$ExternalSyntheticLambda7 onBackClick;
    public final SelfieWorkflow$$ExternalSyntheticLambda2 onCancelClick;
    public final SelfieWorkflow$$ExternalSyntheticLambda2 onContinueClick;
    public final StepStyles.GovernmentIdStepStyle styles;
    public final String titleText;
    public final DecorativeViewFactory viewFactory;

    public ErrorView(String str, String str2, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NavigationState navigationState, SelfieWorkflow$$ExternalSyntheticLambda2 selfieWorkflow$$ExternalSyntheticLambda2, CaptureRenderer$$ExternalSyntheticLambda7 captureRenderer$$ExternalSyntheticLambda7, SelfieWorkflow$$ExternalSyntheticLambda2 selfieWorkflow$$ExternalSyntheticLambda22) {
        navigationState.getClass();
        this.titleText = str;
        this.continueButtonText = str2;
        this.styles = governmentIdStepStyle;
        this.navigationState = navigationState;
        this.onContinueClick = selfieWorkflow$$ExternalSyntheticLambda2;
        this.onBackClick = captureRenderer$$ExternalSyntheticLambda7;
        this.onCancelClick = selfieWorkflow$$ExternalSyntheticLambda22;
        this.viewFactory = new DecorativeViewFactory(Reflection.factory.getOrCreateKotlinClass(ErrorView.class), ErrorView$viewFactory$1.INSTANCE, new HCaptcha$$ExternalSyntheticLambda2(this, 18));
    }

    @Override // com.squareup.workflow1.ui.AndroidViewRendering
    public final ViewFactory getViewFactory() {
        return this.viewFactory;
    }
}
