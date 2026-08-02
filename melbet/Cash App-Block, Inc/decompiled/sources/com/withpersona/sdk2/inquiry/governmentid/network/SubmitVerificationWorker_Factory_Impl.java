package com.withpersona.sdk2.inquiry.governmentid.network;

import android.content.Context;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.PollingWorker_Factory;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.image.RealImageHelper;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;

/* loaded from: classes9.dex */
public final class SubmitVerificationWorker_Factory_Impl {
    public final PollingWorker_Factory delegateFactory;

    public SubmitVerificationWorker_Factory_Impl(PollingWorker_Factory pollingWorker_Factory) {
        this.delegateFactory = pollingWorker_Factory;
    }

    public final SubmitVerificationWorker create(String str, String str2, String str3, String str4, GovernmentIdRequestArguments governmentIdRequestArguments, String str5, CameraProperties cameraProperties) {
        PollingWorker_Factory pollingWorker_Factory = this.delegateFactory;
        return new SubmitVerificationWorker((Context) pollingWorker_Factory.serviceProvider.get(), str, str2, str4, str3, (GovernmentIdService) pollingWorker_Factory.deviceIdProvider.get(), governmentIdRequestArguments, (DataCollector) pollingWorker_Factory.sandboxFlagsProvider.get(), (FallbackModeManager) pollingWorker_Factory.fallbackModeManagerProvider.get(), (RealImageHelper) pollingWorker_Factory.fontDownloaderProvider.get(), str5, cameraProperties, (RealCameraStatsManager) pollingWorker_Factory.themeManagerProvider.get(), (TrackingEventsLogger) pollingWorker_Factory.inquiryApiHelperProvider.get());
    }
}
