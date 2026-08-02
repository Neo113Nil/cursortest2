package com.withpersona.sdk2.inquiry.selfie;

import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow$$ExternalSyntheticLambda7;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflowUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class SelfieWorkflow$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$0;

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda2(int i, StatefulWorkflow.RenderContext renderContext, SelfieWorkflow selfieWorkflow) {
        this.$r8$classId = i;
        this.f$0 = renderContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 27;
        StatefulWorkflow.RenderContext renderContext = this.f$0;
        switch (i) {
            case 0:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            case 1:
                GovernmentIdWorkflowUtilsKt.cancel(renderContext);
                break;
            case 2:
                GovernmentIdWorkflowUtilsKt.cancel(renderContext);
                break;
            case 3:
                GovernmentIdWorkflowUtilsKt.cancel(renderContext);
                break;
            case 4:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(19)));
                break;
            case 5:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(17)));
                break;
            case 6:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(18)));
                break;
            case 7:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new DocumentWorkflow$$ExternalSyntheticLambda7(i2)));
                break;
            case 8:
                GovernmentIdWorkflowUtilsKt.goBack(renderContext, null);
                break;
            case 9:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda79(1)));
                break;
            case 10:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            case 11:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            case 12:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            case 13:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            case 14:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            case 15:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            case 16:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            case 17:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            case 18:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            case 19:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            case 20:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            case 21:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            case 22:
                SelfieWorkflowUtilsKt.goBack(renderContext);
                break;
            default:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(new SelfieWorkflow$$ExternalSyntheticLambda79(27)));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SelfieWorkflow$$ExternalSyntheticLambda2(StatefulWorkflow.RenderContext renderContext, int i) {
        this.$r8$classId = i;
        this.f$0 = renderContext;
    }
}
