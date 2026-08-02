package com.withpersona.sdk2.inquiry.governmentid;

import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdWorkflow$$ExternalSyntheticLambda6 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GovernmentIdWorkflow.Input f$0;
    public final /* synthetic */ GovernmentIdState f$1;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$2;
    public final /* synthetic */ GovernmentIdWorkflow f$3;

    public /* synthetic */ GovernmentIdWorkflow$$ExternalSyntheticLambda6(StatefulWorkflow.RenderContext renderContext, GovernmentIdState governmentIdState, GovernmentIdWorkflow.Input input, GovernmentIdWorkflow governmentIdWorkflow) {
        this.$r8$classId = 2;
        this.f$2 = renderContext;
        this.f$3 = governmentIdWorkflow;
        this.f$1 = governmentIdState;
        this.f$0 = input;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        GovernmentIdWorkflow governmentIdWorkflow = this.f$3;
        StatefulWorkflow.RenderContext renderContext = this.f$2;
        GovernmentIdState governmentIdState = this.f$1;
        GovernmentIdWorkflow.Input input = this.f$0;
        switch (i) {
            case 0:
                ReviewScreenUtilsKt.onAcceptImageClick(input, (GovernmentIdState.ReviewImageState) governmentIdState, renderContext, governmentIdWorkflow.videoCaptureHelper, governmentIdWorkflow.trackingEventsLogger);
                break;
            case 1:
                ReviewScreenUtilsKt.onAcceptImageClick(input, (GovernmentIdState.ReviewImageState) governmentIdState, renderContext, governmentIdWorkflow.videoCaptureHelper, governmentIdWorkflow.trackingEventsLogger);
                break;
            default:
                StatefulWorkflow.RenderContext renderContext2 = this.f$2;
                Sink actionSink = renderContext2.$$delegate_0.getActionSink();
                GovernmentIdState governmentIdState2 = this.f$1;
                GovernmentIdWorkflow.Input input2 = this.f$0;
                GovernmentIdWorkflow governmentIdWorkflow2 = this.f$3;
                actionSink.send(Workflows.action$default(governmentIdWorkflow2, new OpenSourceKt$$ExternalSyntheticLambda9(governmentIdState2, input2, renderContext2, governmentIdWorkflow2, 21)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ GovernmentIdWorkflow$$ExternalSyntheticLambda6(GovernmentIdWorkflow.Input input, GovernmentIdState governmentIdState, StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow, int i) {
        this.$r8$classId = i;
        this.f$0 = input;
        this.f$1 = governmentIdState;
        this.f$2 = renderContext;
        this.f$3 = governmentIdWorkflow;
    }
}
