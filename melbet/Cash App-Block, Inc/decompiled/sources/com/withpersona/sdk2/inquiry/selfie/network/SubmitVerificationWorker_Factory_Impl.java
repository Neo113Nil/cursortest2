package com.withpersona.sdk2.inquiry.selfie.network;

import android.content.Context;
import com.stripe.hcaptcha.HCaptcha;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.network.upload.UploadService;
import com.withpersona.sdk2.inquiry.selfie.SelfieType;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.image.RealImageHelper;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.internal.Provider;
import java.util.List;

/* loaded from: classes9.dex */
public final class SubmitVerificationWorker_Factory_Impl {
    public final HCaptcha delegateFactory;

    public SubmitVerificationWorker_Factory_Impl(HCaptcha hCaptcha) {
        this.delegateFactory = hCaptcha;
    }

    public final SubmitVerificationWorker create(String str, String str2, String str3, String str4, SelfieType selfieType, String str5, List list, String str6, CameraProperties cameraProperties, long j, String str7) {
        HCaptcha hCaptcha = this.delegateFactory;
        return new SubmitVerificationWorker((Context) ((Provider) hCaptcha.result).get(), str, str2, selfieType, list, (SelfieService) ((Provider) hCaptcha.exception).get(), str4, str3, str5, (DataCollector) ((Provider) hCaptcha.onSuccessListeners).get(), (FallbackModeManager) ((Provider) hCaptcha.onFailureListeners).get(), (RealImageHelper) ((Provider) hCaptcha.onOpenListeners).get(), str6, cameraProperties, (RealCameraStatsManager) ((Provider) hCaptcha.handler).get(), j, (TrackingEventsLogger) ((Provider) hCaptcha.internalConfig).get(), (UploadService) ((Provider) hCaptcha.captchaVerifier).get(), str7);
    }
}
