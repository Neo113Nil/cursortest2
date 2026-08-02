package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.google.common.math.DoubleUtils;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherResult;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import kotlin.Metadata;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/governmentid/DocumentSelectWorker$Output;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Output", "government-id_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DocumentSelectWorker implements Worker<Output>, WorkflowWorker {
    public final Context context;
    public final ActivityResultLauncher openDocumentLauncher;
    public final SdkFilesManager sdkFilesManager;

    public abstract class Output {

        public final class Cancel extends Output {
            public static final Cancel INSTANCE = new Cancel();
        }

        public final class Success extends Output {
            public final String absoluteFilePath;
            public final String fileName;

            public Success(String str, String str2) {
                str.getClass();
                this.absoluteFilePath = str;
                this.fileName = str2;
            }
        }
    }

    public DocumentSelectWorker(ActivityResultLauncher activityResultLauncher, Context context, SdkFilesManager sdkFilesManager) {
        activityResultLauncher.getClass();
        context.getClass();
        sdkFilesManager.getClass();
        this.openDocumentLauncher = activityResultLauncher;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        FlowKt__MergeKt$flatMapMerge$$inlined$map$1 flowKt__MergeKt$flatMapMerge$$inlined$map$1 = new FlowKt__MergeKt$flatMapMerge$$inlined$map$1(1, new DocumentSelectLauncherResult(), this);
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        return FlowKt.flowOn(flowKt__MergeKt$flatMapMerge$$inlined$map$1, DefaultIoScheduler.INSTANCE);
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return DoubleUtils.doesSameWorkAs(this, workflowWorker);
    }
}
