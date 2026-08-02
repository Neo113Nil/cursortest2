package com.withpersona.sdk2.inquiry.permissions.permissionRequest;

import com.google.common.math.DoubleUtils;
import com.withpersona.sdk2.inquiry.logger.Logger$log$1;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.PermissionState;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes9.dex */
public final class PermissionRequestWorker implements WorkflowWorker {
    public final PermissionsHelper permissionsHelper;
    public final PermissionRequestWorkflow.Props props;

    public final class Output {
        public final PermissionState permissionState;

        public Output(PermissionState permissionState) {
            permissionState.getClass();
            this.permissionState = permissionState;
        }
    }

    public PermissionRequestWorker(PermissionsHelper permissionsHelper, PermissionRequestWorkflow.Props props) {
        permissionsHelper.getClass();
        this.permissionsHelper = permissionsHelper;
        this.props = props;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return DoubleUtils.doesSameWorkAs(this, workflowWorker) && this.props.permission == ((PermissionRequestWorker) workflowWorker).props.permission;
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final Flow run() {
        return new SafeFlow(new Logger$log$1(this, (Continuation) null, 20));
    }
}
