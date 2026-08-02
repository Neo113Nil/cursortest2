package com.withpersona.sdk2.inquiry.governmentid;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class GovernmentIdWorkflow$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$0;
    public final /* synthetic */ GovernmentIdWorkflow f$1;
    public final /* synthetic */ GovernmentIdState f$2;

    public /* synthetic */ GovernmentIdWorkflow$$ExternalSyntheticLambda9(StatefulWorkflow.RenderContext renderContext, GovernmentIdWorkflow governmentIdWorkflow, GovernmentIdState governmentIdState, int i) {
        this.$r8$classId = i;
        this.f$0 = renderContext;
        this.f$1 = governmentIdWorkflow;
        this.f$2 = governmentIdState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        GovernmentIdState governmentIdState = this.f$2;
        GovernmentIdWorkflow governmentIdWorkflow = this.f$1;
        StatefulWorkflow.RenderContext renderContext = this.f$0;
        switch (i) {
            case 0:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(governmentIdWorkflow, new GovernmentIdWorkflow$$ExternalSyntheticLambda29(governmentIdState, 1)));
                break;
            case 1:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(governmentIdWorkflow, new GovernmentIdWorkflow$$ExternalSyntheticLambda29(governmentIdState, 0)));
                break;
            case 2:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(governmentIdWorkflow, new GovernmentIdWorkflow$$ExternalSyntheticLambda29(governmentIdState, 3)));
                break;
            case 3:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(governmentIdWorkflow, new HCaptcha$$ExternalSyntheticLambda1(13, governmentIdWorkflow, governmentIdState)));
                break;
            default:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(governmentIdWorkflow, new GovernmentIdWorkflow$$ExternalSyntheticLambda29(governmentIdState, 4)));
                break;
        }
        return Unit.INSTANCE;
    }
}
