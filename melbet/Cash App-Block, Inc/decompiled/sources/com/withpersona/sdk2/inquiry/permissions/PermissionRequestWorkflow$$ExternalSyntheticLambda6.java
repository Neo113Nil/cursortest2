package com.withpersona.sdk2.inquiry.permissions;

import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda79;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class PermissionRequestWorkflow$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$0;
    public final /* synthetic */ PermissionRequestWorkflow f$1;

    public /* synthetic */ PermissionRequestWorkflow$$ExternalSyntheticLambda6(StatefulWorkflow.RenderContext renderContext, PermissionRequestWorkflow permissionRequestWorkflow, int i) {
        this.$r8$classId = i;
        this.f$0 = renderContext;
        this.f$1 = permissionRequestWorkflow;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        PermissionRequestWorkflow permissionRequestWorkflow = this.f$1;
        StatefulWorkflow.RenderContext renderContext = this.f$0;
        switch (i) {
            case 0:
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(permissionRequestWorkflow, new MoneyTabUIKt$$ExternalSyntheticLambda24(((Boolean) obj).booleanValue(), 22)));
                break;
            default:
                ((WorkflowAction.Updater) obj).getClass();
                renderContext.$$delegate_0.getActionSink().send(Workflows.action$default(permissionRequestWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda79(10)));
                break;
        }
        return Unit.INSTANCE;
    }
}
