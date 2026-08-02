package com.withpersona.sdk2.inquiry.nfc;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.google.common.math.DoubleUtils;
import com.squareup.workflow1.Worker;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.workflows.WorkflowWorker;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/ScanNfcWorker;", "Lcom/squareup/workflow1/Worker;", "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;", "Lcom/withpersona/sdk2/inquiry/workflows/WorkflowWorker;", "Factory", "nfc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ScanNfcWorker implements Worker<PassportNfcReaderOutput>, WorkflowWorker {
    public final String cardAccessNumber;
    public final GovernmentIdNfcScan.GovernmentIdNfcScanStyles componentStyles;
    public final Context context;
    public final boolean enableRedesign;
    public final List enabledDataGroups;
    public final MrzKey mrzKey;
    public final ActivityResultLauncher passportNfcReaderLauncher;
    public final PassportNfcStrings passportNfcStrings;
    public final SandboxFlags sandboxFlags;
    public final SdkFilesManager sdkFilesManager;
    public final StepStyles.UiStepStyle stepStyles;

    public interface Factory {
    }

    public ScanNfcWorker(ActivityResultLauncher activityResultLauncher, Context context, SandboxFlags sandboxFlags, SdkFilesManager sdkFilesManager, String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List list, StepStyles.UiStepStyle uiStepStyle, GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles, boolean z) {
        activityResultLauncher.getClass();
        context.getClass();
        sandboxFlags.getClass();
        sdkFilesManager.getClass();
        str.getClass();
        list.getClass();
        this.passportNfcReaderLauncher = activityResultLauncher;
        this.context = context;
        this.sandboxFlags = sandboxFlags;
        this.sdkFilesManager = sdkFilesManager;
        this.cardAccessNumber = str;
        this.mrzKey = mrzKey;
        this.passportNfcStrings = passportNfcStrings;
        this.enabledDataGroups = list;
        this.stepStyles = uiStepStyle;
        this.componentStyles = governmentIdNfcScanStyles;
        this.enableRedesign = z;
    }

    @Override // com.squareup.workflow1.Worker
    public final boolean doesSameWorkAs(Worker worker) {
        worker.getClass();
        return worker instanceof ScanNfcWorker;
    }

    @Override // com.squareup.workflow1.Worker
    /* renamed from: run */
    public final Flow getWork() {
        return new SafeFlow(new ScanNfcWorker$run$1(this, null));
    }

    @Override // com.withpersona.sdk2.inquiry.workflows.WorkflowWorker
    public final boolean doesSameWorkAs(WorkflowWorker workflowWorker) {
        return DoubleUtils.doesSameWorkAs(this, workflowWorker);
    }
}
