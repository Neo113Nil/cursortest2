package com.withpersona.sdk2.inquiry.selfie;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieWorkflow$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SelfieWorkflow f$0;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$1;

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda3(StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        this.$r8$classId = 4;
        this.f$1 = renderContext;
        this.f$0 = selfieWorkflow;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        SelfieWorkflow.Output.Canceled canceled = SelfieWorkflow.Output.Canceled.INSTANCE;
        StatefulWorkflow.RenderContext renderContext = this.f$1;
        SelfieWorkflow selfieWorkflow = this.f$0;
        switch (i) {
            case 0:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            case 1:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            case 2:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            case 3:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            case 4:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(selfieWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda79(0)));
                break;
            case 5:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            case 6:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            case 7:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            case 8:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            case 9:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            case 10:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            case 11:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            case 12:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            case 13:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            case 14:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
            default:
                selfieWorkflow.setOutputForWorkflow(renderContext, canceled);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda3(int i, StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        this.$r8$classId = i;
        this.f$0 = selfieWorkflow;
        this.f$1 = renderContext;
    }
}
