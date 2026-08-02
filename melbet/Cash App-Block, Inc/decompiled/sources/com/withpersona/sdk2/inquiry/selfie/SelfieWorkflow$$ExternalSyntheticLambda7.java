package com.withpersona.sdk2.inquiry.selfie;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieWorkflow$$ExternalSyntheticLambda7 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SelfieWorkflow f$0;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$1;

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda7(int i, StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        this.$r8$classId = i;
        this.f$0 = selfieWorkflow;
        this.f$1 = renderContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        StatefulWorkflow.RenderContext renderContext = this.f$1;
        SelfieWorkflow selfieWorkflow = this.f$0;
        switch (i) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                selfieWorkflow.setErrorOutput(renderContext, th);
                return Unit.INSTANCE;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                selfieWorkflow.setErrorOutput(renderContext, th2);
                return Unit.INSTANCE;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                selfieWorkflow.setErrorOutput(renderContext, th3);
                return Unit.INSTANCE;
            case 3:
                SubmitVerificationWorker.Response response = (SubmitVerificationWorker.Response) obj;
                response.getClass();
                boolean z = response instanceof SubmitVerificationWorker.Response.Success;
                SelfieWorkflow selfieWorkflow2 = this.f$0;
                StatefulWorkflow.RenderContext renderContext2 = this.f$1;
                if (z) {
                    return Workflows.action$default(selfieWorkflow2, new SelfieWorkflow$$ExternalSyntheticLambda7(4, renderContext2, selfieWorkflow2));
                }
                if (response instanceof SubmitVerificationWorker.Response.Error) {
                    return Workflows.action$default(selfieWorkflow2, new SelfieWorkflow$$ExternalSyntheticLambda38(selfieWorkflow2, renderContext2, response, false, 17));
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            default:
                ((WorkflowAction.Updater) obj).getClass();
                selfieWorkflow.setOutputForWorkflow(renderContext, SelfieWorkflow.Output.Finished.INSTANCE);
                return Unit.INSTANCE;
        }
    }
}
