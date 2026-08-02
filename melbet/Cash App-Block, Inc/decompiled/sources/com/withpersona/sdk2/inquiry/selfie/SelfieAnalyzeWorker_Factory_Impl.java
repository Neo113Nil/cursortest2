package com.withpersona.sdk2.inquiry.selfie;

import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import dagger.internal.DoubleCheck;

/* loaded from: classes9.dex */
public final class SelfieAnalyzeWorker_Factory_Impl {
    public final SelfieAnalyzeWorker_Factory delegateFactory;

    public SelfieAnalyzeWorker_Factory_Impl(SelfieAnalyzeWorker_Factory selfieAnalyzeWorker_Factory) {
        this.delegateFactory = selfieAnalyzeWorker_Factory;
    }

    public final SelfieAnalyzeWorker create(Selfie.Pose pose, boolean z) {
        SelfieAnalyzeWorker_Factory selfieAnalyzeWorker_Factory = this.delegateFactory;
        return new SelfieAnalyzeWorker(DoubleCheck.lazy(selfieAnalyzeWorker_Factory.selfieDirectionFeedProvider), pose, z, (SdkFilesManager) selfieAnalyzeWorker_Factory.sdkFilesManagerProvider.get());
    }
}
