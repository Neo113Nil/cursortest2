package com.withpersona.sdk2.inquiry.ui;

import androidx.activity.result.ActivityResultLauncher;
import com.google.common.math.DoubleUtils;
import com.squareup.moshi.Moshi;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.ui.network.UiService;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker$Output;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Output", "com/withpersona/sdk2/inquiry/ui/VerifyReusablePersonaWorker_Factory_Impl", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VerifyReusablePersonaWorker implements Worker<Output>, WorkflowWorker {
    public final String componentName;
    public final Map componentParams;
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
                return -1215598964;
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

    public VerifyReusablePersonaWorker(ActivityResultLauncher activityResultLauncher, UiService uiService, Moshi moshi, String str, String str2, String str3, String str4, Map map) {
        activityResultLauncher.getClass();
        uiService.getClass();
        moshi.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        map.getClass();
        this.customTabsLauncher = activityResultLauncher;
        this.uiService = uiService;
        this.sessionToken = str;
        this.inquiryId = str2;
        this.url = str3;
        this.componentName = str4;
        this.componentParams = map;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        return Worker.DefaultImpls.doesSameWorkAs(this, worker) && Intrinsics.areEqual(((VerifyReusablePersonaWorker) worker).url, this.url);
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new SafeFlow(new VerifyReusablePersonaWorker$run$1(this, null));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return DoubleUtils.doesSameWorkAs(this, workflowWorker);
    }
}
