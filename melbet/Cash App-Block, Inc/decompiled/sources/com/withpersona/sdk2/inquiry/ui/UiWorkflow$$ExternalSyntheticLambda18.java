package com.withpersona.sdk2.inquiry.ui;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.model.UiStepButtonType;
import com.withpersona.sdk2.inquiry.ui.UiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final /* synthetic */ class UiWorkflow$$ExternalSyntheticLambda18 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$0;
    public final /* synthetic */ UiWorkflow f$1;
    public final /* synthetic */ UiState f$2;

    public /* synthetic */ UiWorkflow$$ExternalSyntheticLambda18(UiWorkflow uiWorkflow, UiState uiState, StatefulWorkflow.RenderContext renderContext) {
        this.$r8$classId = 2;
        this.f$1 = uiWorkflow;
        this.f$2 = uiState;
        this.f$0 = renderContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        StatefulWorkflow.RenderContext renderContext = this.f$0;
        UiState uiState = this.f$2;
        UiWorkflow uiWorkflow = this.f$1;
        switch (i) {
            case 0:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new UiWorkflow$$ExternalSyntheticLambda2(uiState, 1)));
                break;
            case 1:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new UiWorkflow$$ExternalSyntheticLambda2(uiState, 2)));
                break;
            default:
                TrackingEventsLogger.DefaultImpls.logUiStepButtonEvent$default(uiWorkflow.trackingEventsLogger, UiStepButtonType.Complete, null, ((UiState.Displaying) uiState).stepName, false, 10, null);
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(uiWorkflow, new InstantKt$$ExternalSyntheticLambda0(12)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ UiWorkflow$$ExternalSyntheticLambda18(StatefulWorkflow.RenderContext renderContext, UiWorkflow uiWorkflow, UiState uiState, int i) {
        this.$r8$classId = i;
        this.f$0 = renderContext;
        this.f$1 = uiWorkflow;
        this.f$2 = uiState;
    }
}
