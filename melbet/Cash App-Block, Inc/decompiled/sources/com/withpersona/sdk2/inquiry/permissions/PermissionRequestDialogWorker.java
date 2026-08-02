package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestDialogWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestDialogWorker$Output;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Output", "io/noties/markwon/MarkwonImpl", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PermissionRequestDialogWorker implements Worker<Output>, WorkflowWorker {
    public final Context context;
    public final Permission permission;
    public final ActivityResultLauncher requestPermissionsLauncher;
    public final TrackingEventsLogger trackingEventsLogger;

    public abstract class Output {

        public final class Denied extends Output {
            public static final Denied INSTANCE = new Denied();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Denied);
            }

            public final int hashCode() {
                return -16139474;
            }

            public final String toString() {
                return "Denied";
            }
        }

        public final class Success extends Output {
            public static final Success INSTANCE = new Success();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public final int hashCode() {
                return 375059152;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    public PermissionRequestDialogWorker(ActivityResultLauncher activityResultLauncher, Context context, Permission permission, TrackingEventsLogger trackingEventsLogger) {
        activityResultLauncher.getClass();
        context.getClass();
        permission.getClass();
        trackingEventsLogger.getClass();
        this.requestPermissionsLauncher = activityResultLauncher;
        this.context = context;
        this.permission = permission;
        this.trackingEventsLogger = trackingEventsLogger;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        return (worker instanceof PermissionRequestDialogWorker) && ((PermissionRequestDialogWorker) worker).permission == this.permission;
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new SafeFlow(new PermissionRequestDialogWorker$run$1(this, null));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return (workflowWorker instanceof PermissionRequestDialogWorker) && ((PermissionRequestDialogWorker) workflowWorker).permission == this.permission;
    }
}
