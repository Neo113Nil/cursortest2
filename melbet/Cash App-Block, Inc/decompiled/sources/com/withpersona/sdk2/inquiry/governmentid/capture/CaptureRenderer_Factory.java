package com.withpersona.sdk2.inquiry.governmentid.capture;

import android.content.Context;
import com.squareup.kotterknife.Lazy;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.stripe.android.financialconnections.domain.RealIsLinkWithStripe;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.api.FinancialConnectionsConsumersApiServiceImpl;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.googlepaylauncher.DefaultPaymentsClientFactory_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.WebIntentNextActionHandler;
import com.stripe.android.repository.ConsumersApiServiceImpl;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final class CaptureRenderer_Factory implements Factory {
    public final /* synthetic */ int $r8$classId = 0;
    public final Provider applicationContextProvider;
    public final Provider camera2ControllerFactoryProvider;
    public final Provider cameraXControllerFactoryProvider;
    public final Provider governmentIdAnalyzeWorkerFactoryProvider;
    public final Provider governmentIdHintWorkerFactoryProvider;
    public final Provider navigationStateManagerProvider;
    public final Provider permissionRequestWorkflowProvider;
    public final Provider trackingEventsLoggerProvider;
    public final Factory webRtcWorkerFactoryProvider;

    public CaptureRenderer_Factory(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, LookupAccount_Factory lookupAccount_Factory, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, Logger_Factory logger_Factory, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, Provider provider, Provider provider2) {
        this.applicationContextProvider = inquiryActivityModule_ContextFactory;
        this.permissionRequestWorkflowProvider = lookupAccount_Factory;
        this.governmentIdAnalyzeWorkerFactoryProvider = instanceFactory;
        this.governmentIdHintWorkerFactoryProvider = instanceFactory2;
        this.webRtcWorkerFactoryProvider = logger_Factory;
        this.cameraXControllerFactoryProvider = instanceFactory3;
        this.camera2ControllerFactoryProvider = instanceFactory4;
        this.navigationStateManagerProvider = provider;
        this.trackingEventsLoggerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Factory factory = this.webRtcWorkerFactoryProvider;
        Provider provider = this.navigationStateManagerProvider;
        Provider provider2 = this.permissionRequestWorkflowProvider;
        Provider provider3 = this.camera2ControllerFactoryProvider;
        Provider provider4 = this.cameraXControllerFactoryProvider;
        Provider provider5 = this.governmentIdHintWorkerFactoryProvider;
        Provider provider6 = this.governmentIdAnalyzeWorkerFactoryProvider;
        Provider provider7 = this.trackingEventsLoggerProvider;
        Provider provider8 = this.applicationContextProvider;
        switch (i) {
            case 0:
                return new CaptureRenderer((Context) provider8.get(), (PermissionRequestWorkflow) ((LookupAccount_Factory) provider2).get(), (GovernmentIdAnalyzeWorker_Factory_Impl) ((InstanceFactory) provider6).instance, (GovernmentIdHintWorker_Factory_Impl) ((InstanceFactory) provider5).instance, (WebRtcWorker.Factory) ((Logger_Factory) factory).get(), (CameraXController_Factory_Impl) ((InstanceFactory) provider4).instance, (Camera2Controller_Factory_Impl) ((InstanceFactory) provider3).instance, (NavigationStateManager) provider.get(), (TrackingEventsLogger) provider7.get());
            case 1:
                ConsumersApiServiceImpl consumersApiServiceImpl = (ConsumersApiServiceImpl) provider8.get();
                ProvideApiRequestOptions provideApiRequestOptions = (ProvideApiRequestOptions) provider.get();
                FinancialConnectionsConsumersApiServiceImpl financialConnectionsConsumersApiServiceImpl = (FinancialConnectionsConsumersApiServiceImpl) provider7.get();
                RealConsumerSessionRepository realConsumerSessionRepository = (RealConsumerSessionRepository) provider2.get();
                Locale locale = (Locale) provider6.get();
                Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = (Logger$Companion$NOOP_LOGGER$1) provider5.get();
                RealIsLinkWithStripe realIsLinkWithStripe = (RealIsLinkWithStripe) provider4.get();
                DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository = (DefaultFraudDetectionDataRepository) provider3.get();
                ElementsSessionContext elementsSessionContext = (ElementsSessionContext) ((CameraModule_CameraStatsManagerFactory) factory).get();
                consumersApiServiceImpl.getClass();
                provideApiRequestOptions.getClass();
                financialConnectionsConsumersApiServiceImpl.getClass();
                realConsumerSessionRepository.getClass();
                logger$Companion$NOOP_LOGGER$1.getClass();
                realIsLinkWithStripe.getClass();
                defaultFraudDetectionDataRepository.getClass();
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                return new FinancialConnectionsConsumerSessionRepositoryImpl(financialConnectionsConsumersApiServiceImpl, consumersApiServiceImpl, realConsumerSessionRepository, provideApiRequestOptions, locale, logger$Companion$NOOP_LOGGER$1, defaultFraudDetectionDataRepository, elementsSessionContext, realIsLinkWithStripe);
            default:
                return new WebIntentNextActionHandler((Function1) provider8.get(), (DefaultAnalyticsRequestExecutor) ((SelfieDirectionFeed_Factory) provider7).get(), (PaymentAnalyticsRequestFactory) ((InstanceFactory) provider6).instance, ((Boolean) ((InstanceFactory) provider5).instance).booleanValue(), (CoroutineContext) ((InstanceFactory) provider4).instance, (Function0) ((InstanceFactory) provider3).instance, ((Boolean) ((InstanceFactory) provider2).instance).booleanValue(), (DefaultReturnUrl) provider.get(), (Lazy) ((DefaultPaymentsClientFactory_Factory) factory).get());
        }
    }

    public CaptureRenderer_Factory(Provider provider, SelfieDirectionFeed_Factory selfieDirectionFeed_Factory, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, Provider provider2, DefaultPaymentsClientFactory_Factory defaultPaymentsClientFactory_Factory) {
        this.applicationContextProvider = provider;
        this.trackingEventsLoggerProvider = selfieDirectionFeed_Factory;
        this.governmentIdAnalyzeWorkerFactoryProvider = instanceFactory;
        this.governmentIdHintWorkerFactoryProvider = instanceFactory2;
        this.cameraXControllerFactoryProvider = instanceFactory3;
        this.camera2ControllerFactoryProvider = instanceFactory4;
        this.permissionRequestWorkflowProvider = instanceFactory5;
        this.navigationStateManagerProvider = provider2;
        this.webRtcWorkerFactoryProvider = defaultPaymentsClientFactory_Factory;
    }

    public CaptureRenderer_Factory(Provider provider, Provider provider2, DocumentCameraWorker_Factory documentCameraWorker_Factory, Provider provider3, Provider provider4, Provider provider5, DefaultPaymentsClientFactory_Factory defaultPaymentsClientFactory_Factory, CameraModule_CameraStatsManagerFactory cameraModule_CameraStatsManagerFactory, CameraModule_CameraStatsManagerFactory cameraModule_CameraStatsManagerFactory2) {
        this.applicationContextProvider = provider;
        this.navigationStateManagerProvider = provider2;
        this.trackingEventsLoggerProvider = documentCameraWorker_Factory;
        this.permissionRequestWorkflowProvider = provider3;
        this.governmentIdAnalyzeWorkerFactoryProvider = provider4;
        this.governmentIdHintWorkerFactoryProvider = provider5;
        this.cameraXControllerFactoryProvider = defaultPaymentsClientFactory_Factory;
        this.camera2ControllerFactoryProvider = cameraModule_CameraStatsManagerFactory;
        this.webRtcWorkerFactoryProvider = cameraModule_CameraStatsManagerFactory2;
    }
}
