package com.withpersona.sdk2.inquiry.nfc;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import java.util.List;

/* loaded from: classes9.dex */
public final class ScanNfcWorker_Factory_Impl implements ScanNfcWorker.Factory {
    public final C0351ScanNfcWorker_Factory delegateFactory;

    public ScanNfcWorker_Factory_Impl(C0351ScanNfcWorker_Factory c0351ScanNfcWorker_Factory) {
        this.delegateFactory = c0351ScanNfcWorker_Factory;
    }

    public final ScanNfcWorker create(String str, MrzKey mrzKey, PassportNfcStrings passportNfcStrings, List list, StepStyles.UiStepStyle uiStepStyle, GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles, boolean z) {
        C0351ScanNfcWorker_Factory c0351ScanNfcWorker_Factory = this.delegateFactory;
        return new ScanNfcWorker((ActivityResultLauncher) c0351ScanNfcWorker_Factory.passportNfcReaderLauncherProvider.get(), (Context) c0351ScanNfcWorker_Factory.contextProvider.get(), (SandboxFlags) c0351ScanNfcWorker_Factory.sandboxFlagsProvider.get(), (SdkFilesManager) c0351ScanNfcWorker_Factory.sdkFilesManagerProvider.get(), str, mrzKey, passportNfcStrings, list, uiStepStyle, governmentIdNfcScanStyles, z);
    }
}
