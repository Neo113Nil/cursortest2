package com.withpersona.sdk2.inquiry.permissions;

import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.Sink;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestDialogWorker;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$$ExternalSyntheticLambda79;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class PermissionRequestWorkflow$$ExternalSyntheticLambda9 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PermissionRequestWorkflow f$0;
    public final /* synthetic */ StatefulWorkflow.RenderContext f$1;
    public final /* synthetic */ PermissionRequestWorkflow.Props f$2;

    public /* synthetic */ PermissionRequestWorkflow$$ExternalSyntheticLambda9(StatefulWorkflow.RenderContext renderContext, PermissionRequestWorkflow permissionRequestWorkflow, PermissionRequestWorkflow.Props props, int i) {
        this.$r8$classId = i;
        this.f$1 = renderContext;
        this.f$0 = permissionRequestWorkflow;
        this.f$2 = props;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        PermissionRequestWorkflow.Props props = this.f$2;
        PermissionRequestWorkflow permissionRequestWorkflow = this.f$0;
        StatefulWorkflow.RenderContext renderContext = this.f$1;
        switch (i) {
            case 0:
                PermissionRequestDialogWorker.Output output = (PermissionRequestDialogWorker.Output) obj;
                output.getClass();
                if (!output.equals(PermissionRequestDialogWorker.Output.Success.INSTANCE)) {
                    if (!output.equals(PermissionRequestDialogWorker.Output.Denied.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 1:
                DeviceFeatureRequestWorkflow.Output output2 = (DeviceFeatureRequestWorkflow.Output) obj;
                output2.getClass();
                StatefulWorkflow.RenderContext renderContext2 = this.f$1;
                PermissionRequestWorkflow permissionRequestWorkflow2 = this.f$0;
                break;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                StatefulWorkflow.RenderContext renderContext3 = this.f$1;
                Sink actionSink = renderContext3.$$delegate_0.getActionSink();
                PermissionRequestWorkflow permissionRequestWorkflow3 = this.f$0;
                actionSink.send(Workflows.action$default(permissionRequestWorkflow3, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(booleanValue, permissionRequestWorkflow3, this.f$2, renderContext3, 21)));
                break;
            default:
                WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
                updater.getClass();
                boolean z = ((PermissionRequestWorkflow.Props) updater.props).optional;
                BaseRenderContext baseRenderContext = renderContext.$$delegate_0;
                if (z) {
                    baseRenderContext.getActionSink().send(Workflows.action$default(permissionRequestWorkflow, new PermissionRequestWorkflow$$ExternalSyntheticLambda1(permissionRequestWorkflow, props, 0)));
                } else {
                    baseRenderContext.getActionSink().send(Workflows.action$default(permissionRequestWorkflow, new SelfieWorkflow$$ExternalSyntheticLambda79(12)));
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PermissionRequestWorkflow$$ExternalSyntheticLambda9(PermissionRequestWorkflow permissionRequestWorkflow, StatefulWorkflow.RenderContext renderContext, PermissionRequestWorkflow.Props props, int i) {
        this.$r8$classId = i;
        this.f$0 = permissionRequestWorkflow;
        this.f$1 = renderContext;
        this.f$2 = props;
    }
}
