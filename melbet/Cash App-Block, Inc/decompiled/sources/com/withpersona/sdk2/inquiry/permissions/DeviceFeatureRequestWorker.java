package com.withpersona.sdk2.inquiry.permissions;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.google.common.math.DoubleUtils;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker$Output;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Output", "com/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorker_Factory_Impl", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeviceFeatureRequestWorker implements Worker<Output>, WorkflowWorker {
    public final Context context;
    public final ActivityResultLauncher resolvableApiLauncher;

    public abstract class Output {

        public final class Denied extends Output {
            public static final Denied INSTANCE = new Denied();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Denied);
            }

            public final int hashCode() {
                return -588562023;
            }

            public final String toString() {
                return "Denied";
            }
        }

        public final class NotSupported extends Output {
            public static final NotSupported INSTANCE = new NotSupported();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NotSupported);
            }

            public final int hashCode() {
                return 726963865;
            }

            public final String toString() {
                return "NotSupported";
            }
        }

        public final class Success extends Output {
            public static final Success INSTANCE = new Success();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public final int hashCode() {
                return -190170683;
            }

            public final String toString() {
                return "Success";
            }
        }
    }

    public DeviceFeatureRequestWorker(ActivityResultLauncher activityResultLauncher, Context context) {
        activityResultLauncher.getClass();
        context.getClass();
        this.resolvableApiLauncher = activityResultLauncher;
        this.context = context;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new SafeFlow(new TransitionWorker$run$1(this, null, 18));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return DoubleUtils.doesSameWorkAs(this, workflowWorker);
    }
}
