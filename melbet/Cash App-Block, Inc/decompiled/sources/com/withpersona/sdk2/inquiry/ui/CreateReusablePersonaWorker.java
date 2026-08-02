package com.withpersona.sdk2.inquiry.ui;

import androidx.activity.result.ActivityResultLauncher;
import com.google.common.math.DoubleUtils;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.device.RealDeviceIdProvider;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.ui.network.UiService;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker$Output;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Output", "com/withpersona/sdk2/inquiry/ui/CreateReusablePersonaWorker_Factory_Impl", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateReusablePersonaWorker implements Worker<Output>, WorkflowWorker {
    public final String componentName;
    public final ActivityResultLauncher customTabsLauncher;
    public final String inquiryId;
    public final String sessionToken;
    public final UiService uiService;
    public final String url;

    public interface Output {

        public final class Complete implements Output {
            public static final Complete INSTANCE = new Complete();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Complete);
            }

            public final int hashCode() {
                return -1705280535;
            }

            public final String toString() {
                return "Complete";
            }
        }

        public final class Error implements Output {
            public final InternalErrorInfo errorInfo;

            public Error(InternalErrorInfo internalErrorInfo) {
                internalErrorInfo.getClass();
                this.errorInfo = internalErrorInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.errorInfo, ((Error) obj).errorInfo);
            }

            public final int hashCode() {
                return this.errorInfo.hashCode();
            }

            public final String toString() {
                return "Error(errorInfo=" + this.errorInfo + ")";
            }
        }
    }

    public CreateReusablePersonaWorker(UiService uiService, RealDeviceIdProvider realDeviceIdProvider, ActivityResultLauncher activityResultLauncher, String str, String str2, String str3, String str4) {
        uiService.getClass();
        realDeviceIdProvider.getClass();
        activityResultLauncher.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.uiService = uiService;
        this.customTabsLauncher = activityResultLauncher;
        this.sessionToken = str;
        this.inquiryId = str2;
        this.url = str3;
        this.componentName = str4;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    @Override // com.squareup.workflow1.Worker
    public final Flow run() {
        return new SafeFlow(new CreateReusablePersonaWorker$run$1(this, null));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return DoubleUtils.doesSameWorkAs(this, workflowWorker);
    }
}
