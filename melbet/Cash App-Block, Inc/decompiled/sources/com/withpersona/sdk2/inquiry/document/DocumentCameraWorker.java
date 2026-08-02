package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.content.FileProvider;
import com.google.common.math.DoubleUtils;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.launchers.PictureLauncherResult;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import java.io.File;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/document/DocumentCameraWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/document/DocumentCameraWorker$Output;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Output", "document_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DocumentCameraWorker implements Worker<Output>, WorkflowWorker {
    public final Context context;
    public final ActivityResultLauncher pictureLauncher;
    public final SdkFilesManager sdkFilesManager;

    public abstract class Output {

        public final class Cancel extends Output {
            public static final Cancel INSTANCE = new Cancel();
        }

        public final class Success extends Output {
            public final String absoluteFilePath;

            public Success(String str) {
                str.getClass();
                this.absoluteFilePath = str;
            }
        }
    }

    public DocumentCameraWorker(ActivityResultLauncher activityResultLauncher, Context context, SdkFilesManager sdkFilesManager) {
        activityResultLauncher.getClass();
        context.getClass();
        sdkFilesManager.getClass();
        this.pictureLauncher = activityResultLauncher;
        this.context = context;
        this.sdkFilesManager = sdkFilesManager;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        return Worker.DefaultImpls.doesSameWorkAs(this, worker);
    }

    public final boolean launchTakePicture(String str) {
        Context context = this.context;
        str.getClass();
        try {
            String str2 = context.getPackageName() + ".persona.provider";
            File file = this.sdkFilesManager.sessionDir;
            SdkFilesManager.ensureFolder(file);
            Uri uriForFile = FileProvider.getUriForFile(context, str2, new File(file, "document_camera_photo.jpg"));
            ActivityResultLauncher activityResultLauncher = this.pictureLauncher;
            uriForFile.getClass();
            activityResultLauncher.launch(uriForFile);
            return true;
        } catch (IllegalArgumentException unused) {
            Toast.makeText(context, str, 0).show();
            return false;
        }
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new FlowExtensionsKt$combine$$inlined$combine$1(29, new PictureLauncherResult(), this);
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return DoubleUtils.doesSameWorkAs(this, workflowWorker);
    }
}
