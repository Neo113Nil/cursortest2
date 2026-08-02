package com.withpersona.sdk2.inquiry.nfc;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.result.ActivityResultLauncher;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.nfc.PassportNfcReaderOutput;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class ScanNfcWorker$run$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public PassportNfcReaderOutput L$1;
    public int label;
    public final /* synthetic */ ScanNfcWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanNfcWorker$run$1(ScanNfcWorker scanNfcWorker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scanNfcWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScanNfcWorker$run$1 scanNfcWorker$run$1 = new ScanNfcWorker$run$1(this.this$0, continuation);
        scanNfcWorker$run$1.L$0 = obj;
        return scanNfcWorker$run$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ScanNfcWorker$run$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x012c, code lost:
    
        if (r2.emit(r1, r19) != r12) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011b, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r4, r19) == r12) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
    
        if (r4.emit(r13, r19) == r12) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0100, code lost:
    
        if (r3 == r12) goto L59;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        Object first;
        PassportNfcReaderOutput passportNfcReaderOutput;
        FlowCollector flowCollector2;
        PassportNfcReaderOutput passportNfcReaderOutput2;
        ScanNfcWorker scanNfcWorker = this.this$0;
        Context context = scanNfcWorker.context;
        PassportNfcStrings passportNfcStrings = scanNfcWorker.passportNfcStrings;
        SdkFilesManager sdkFilesManager = scanNfcWorker.sdkFilesManager;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            FlowCollector flowCollector3 = (FlowCollector) this.L$0;
            SandboxFlags sandboxFlags = scanNfcWorker.sandboxFlags;
            if (sandboxFlags.isSandboxModeEnabled && sandboxFlags.simulateGovIdNfc) {
                File newRandomSessionFile = sdkFilesManager.newRandomSessionFile(".dat");
                FileOutputStream fileOutputStream = new FileOutputStream(newRandomSessionFile);
                try {
                    FilesKt__FileReadWriteKt.writeText$default(newRandomSessionFile, "this_is_some_fake_dg1_data");
                    fileOutputStream.close();
                    File newRandomSessionFile2 = sdkFilesManager.newRandomSessionFile(".dat");
                    fileOutputStream = new FileOutputStream(newRandomSessionFile2);
                    try {
                        FilesKt__FileReadWriteKt.writeText$default(newRandomSessionFile2, "this_is_some_fake_dg2_data");
                        fileOutputStream.close();
                        File newRandomSessionFile3 = sdkFilesManager.newRandomSessionFile(".dat");
                        fileOutputStream = new FileOutputStream(newRandomSessionFile3);
                        try {
                            FilesKt__FileReadWriteKt.writeText$default(newRandomSessionFile3, "this_is_some_fake_sod_data");
                            fileOutputStream.close();
                            Toast.makeText(context, "Using simulated government ID NFC data", 0).show();
                            PassportNfcReaderOutput.Success success = new PassportNfcReaderOutput.Success(Uri.fromFile(newRandomSessionFile), Uri.fromFile(newRandomSessionFile2), Uri.fromFile(newRandomSessionFile3), ChipAuthenticationStatus.NotRequested, passportNfcStrings.successfulScanTransitionComponentName);
                            this.label = 1;
                        } finally {
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } else {
                ActivityResultLauncher activityResultLauncher = scanNfcWorker.passportNfcReaderLauncher;
                String str = scanNfcWorker.cardAccessNumber;
                MrzKey mrzKey = scanNfcWorker.mrzKey;
                List list = scanNfcWorker.enabledDataGroups;
                StepStyles.UiStepStyle uiStepStyle = scanNfcWorker.stepStyles;
                GovernmentIdNfcScan.GovernmentIdNfcScanStyles governmentIdNfcScanStyles = scanNfcWorker.componentStyles;
                boolean z = scanNfcWorker.enableRedesign;
                flowCollector = flowCollector3;
                activityResultLauncher.launch(new PassportNfcReaderConfig(str, mrzKey, passportNfcStrings, list, null, uiStepStyle, governmentIdNfcScanStyles, z));
                PassportNfcReaderResultSender passportNfcReaderResultSender = new PassportNfcReaderResultSender();
                this.L$0 = flowCollector;
                this.label = 2;
                first = FlowKt.first(passportNfcReaderResultSender, this);
            }
        } else {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i == 2) {
                flowCollector = (FlowCollector) this.L$0;
                SafeTrace.throwOnFailure(obj);
                first = obj;
                passportNfcReaderOutput = (PassportNfcReaderOutput) first;
                try {
                    long integer = context.getResources().getInteger(R.integer.pi2_transition_animation_duration);
                    this.L$0 = flowCollector;
                    this.L$1 = passportNfcReaderOutput;
                    this.label = 3;
                } catch (Resources.NotFoundException unused) {
                }
            } else {
                if (i != 3) {
                    if (i == 4) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                passportNfcReaderOutput2 = this.L$1;
                flowCollector2 = (FlowCollector) this.L$0;
                try {
                    SafeTrace.throwOnFailure(obj);
                } catch (Resources.NotFoundException unused2) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
            }
        }
        return coroutineSingletons;
        flowCollector2 = flowCollector;
        passportNfcReaderOutput2 = passportNfcReaderOutput;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 4;
    }
}
