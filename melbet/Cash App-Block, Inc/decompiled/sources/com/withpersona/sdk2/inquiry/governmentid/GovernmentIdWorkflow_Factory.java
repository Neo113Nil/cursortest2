package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import coil3.RealImageLoader;
import com.fillr.featuretoggle.UnleashContext;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor_Factory;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.governmentid.autoClassification.AutoClassificationRenderer;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer_Factory;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcRenderer;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer_Factory;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.inquiryTheme.InquiryThemeManager;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes9.dex */
public final class GovernmentIdWorkflow_Factory implements Factory {
    public final Provider applicationContextProvider;
    public final Logger_Factory autoClassificationRendererProvider;
    public final SelfieDirectionFeed_Factory autoClassifyWorkerFactoryProvider;
    public final Provider cameraStatsManagerProvider;
    public final CaptureRenderer_Factory captureRendererProvider;
    public final DocumentCameraWorker_Factory documentSelectWorkerProvider;
    public final Provider externalEventLoggerProvider;
    public final Provider imageLoaderProvider;
    public final LocalVideoCaptureRenderer_Factory localVideoCaptureRendererProvider;
    public final Provider navigationStateManagerProvider;
    public final InstanceFactory submitVerificationWorkerFactoryProvider;
    public final Provider themeManagerProvider;
    public final Provider trackingEventsLoggerProvider;
    public final PaymentIntentFlowResultProcessor_Factory webRtcRendererProvider;

    public GovernmentIdWorkflow_Factory(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, Provider provider, InstanceFactory instanceFactory, DocumentCameraWorker_Factory documentCameraWorker_Factory, LocalVideoCaptureRenderer_Factory localVideoCaptureRenderer_Factory, PaymentIntentFlowResultProcessor_Factory paymentIntentFlowResultProcessor_Factory, CaptureRenderer_Factory captureRenderer_Factory, SelfieDirectionFeed_Factory selfieDirectionFeed_Factory, Logger_Factory logger_Factory, CameraModule_CameraStatsManagerFactory cameraModule_CameraStatsManagerFactory, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.applicationContextProvider = inquiryActivityModule_ContextFactory;
        this.imageLoaderProvider = provider;
        this.submitVerificationWorkerFactoryProvider = instanceFactory;
        this.documentSelectWorkerProvider = documentCameraWorker_Factory;
        this.localVideoCaptureRendererProvider = localVideoCaptureRenderer_Factory;
        this.webRtcRendererProvider = paymentIntentFlowResultProcessor_Factory;
        this.captureRendererProvider = captureRenderer_Factory;
        this.autoClassifyWorkerFactoryProvider = selfieDirectionFeed_Factory;
        this.autoClassificationRendererProvider = logger_Factory;
        this.cameraStatsManagerProvider = cameraModule_CameraStatsManagerFactory;
        this.navigationStateManagerProvider = provider2;
        this.externalEventLoggerProvider = provider3;
        this.trackingEventsLoggerProvider = provider4;
        this.themeManagerProvider = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new GovernmentIdWorkflow((Context) this.applicationContextProvider.get(), (RealImageLoader) this.imageLoaderProvider.get(), (SubmitVerificationWorker_Factory_Impl) this.submitVerificationWorkerFactoryProvider.instance, (DocumentSelectWorker) this.documentSelectWorkerProvider.get(), (UnleashContext) this.localVideoCaptureRendererProvider.get(), (WebRtcRenderer) this.webRtcRendererProvider.get(), (CaptureRenderer) this.captureRendererProvider.get(), (AutoClassifyWorker.Factory) this.autoClassifyWorkerFactoryProvider.get(), (AutoClassificationRenderer) this.autoClassificationRendererProvider.get(), (RealCameraStatsManager) this.cameraStatsManagerProvider.get(), (NavigationStateManager) this.navigationStateManagerProvider.get(), (ExternalEventLogger) this.externalEventLoggerProvider.get(), (TrackingEventsLogger) this.trackingEventsLoggerProvider.get(), (InquiryThemeManager) this.themeManagerProvider.get());
    }
}
