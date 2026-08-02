package com.withpersona.sdk2.inquiry.nfc;

import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import dagger.internal.Provider;

/* renamed from: com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker_Factory, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0351ScanNfcWorker_Factory {
    public final Provider contextProvider;
    public final Provider passportNfcReaderLauncherProvider;
    public final Provider sandboxFlagsProvider;
    public final Provider sdkFilesManagerProvider;

    public C0351ScanNfcWorker_Factory(Provider provider, InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, Provider provider2, CameraPreview_Factory cameraPreview_Factory) {
        this.passportNfcReaderLauncherProvider = provider;
        this.contextProvider = inquiryActivityModule_ContextFactory;
        this.sandboxFlagsProvider = provider2;
        this.sdkFilesManagerProvider = cameraPreview_Factory;
    }
}
