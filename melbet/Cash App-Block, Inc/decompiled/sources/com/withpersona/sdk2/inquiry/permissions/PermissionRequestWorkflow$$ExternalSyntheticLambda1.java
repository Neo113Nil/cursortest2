package com.withpersona.sdk2.inquiry.permissions;

import com.squareup.workflow1.WorkflowAction;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class PermissionRequestWorkflow$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PermissionRequestWorkflow f$0;
    public final /* synthetic */ PermissionRequestWorkflow.Props f$1;

    public /* synthetic */ PermissionRequestWorkflow$$ExternalSyntheticLambda1(PermissionRequestWorkflow permissionRequestWorkflow, PermissionRequestWorkflow.Props props, int i) {
        this.$r8$classId = i;
        this.f$0 = permissionRequestWorkflow;
        this.f$1 = props;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        PermissionRequestWorkflow.Props props = this.f$1;
        PermissionRequestWorkflow permissionRequestWorkflow = this.f$0;
        WorkflowAction.Updater updater = (WorkflowAction.Updater) obj;
        switch (i) {
            case 0:
                updater.getClass();
                permissionRequestWorkflow.complete(updater, new PermissionState(props.permission, PermissionResult.PermissionRejected));
                break;
            case 1:
                updater.getClass();
                permissionRequestWorkflow.complete(updater, new PermissionState(props.permission, PermissionResult.PermissionRejected));
                break;
            case 2:
                updater.getClass();
                permissionRequestWorkflow.complete(updater, new PermissionState(props.permission, PermissionResult.PermissionRejected));
                break;
            case 3:
                updater.getClass();
                permissionRequestWorkflow.complete(updater, new PermissionState(props.permission, PermissionResult.SettingsLaunched));
                break;
            case 4:
                updater.getClass();
                permissionRequestWorkflow.complete(updater, new PermissionState(props.permission, PermissionResult.PermissionGranted));
                break;
            case 5:
                updater.getClass();
                permissionRequestWorkflow.complete(updater, new PermissionState(props.permission, PermissionResult.SettingsLaunched));
                break;
            default:
                permissionRequestWorkflow.complete(updater, new PermissionState(props.permission, PermissionResult.PermissionGranted));
                break;
        }
        return Unit.INSTANCE;
    }
}
