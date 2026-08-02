package com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers;

import android.content.Context;
import com.google.android.gms.internal.mlkit_genai_prompt.zzjo;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.stripe.android.payments.core.authentication.DefaultPaymentNextActionHandlerRegistry;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import net.idrnd.face.iad.capture.Plane;

/* loaded from: classes9.dex */
public final class GovIdCaptureRenderer_Factory implements Factory {
    public final /* synthetic */ int $r8$classId = 0;
    public final Provider applicationContextProvider;
    public final Provider camera2ControllerFactoryProvider;
    public final Provider cameraXControllerFactoryProvider;
    public final Provider governmentIdAnalyzeWorkerFactoryProvider;
    public final Provider governmentIdHintWorkerFactoryProvider;
    public final Provider navigationStateManagerProvider;
    public final InstanceFactory permissionRequestWorkerProvider;
    public final Provider trackingEventsLoggerProvider;
    public final Provider webRtcWorkerFactoryProvider;

    public GovIdCaptureRenderer_Factory(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, Logger_Factory logger_Factory, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, Provider provider, Provider provider2, InstanceFactory instanceFactory5) {
        this.applicationContextProvider = inquiryActivityModule_ContextFactory;
        this.governmentIdAnalyzeWorkerFactoryProvider = instanceFactory;
        this.governmentIdHintWorkerFactoryProvider = instanceFactory2;
        this.webRtcWorkerFactoryProvider = logger_Factory;
        this.cameraXControllerFactoryProvider = instanceFactory3;
        this.camera2ControllerFactoryProvider = instanceFactory4;
        this.navigationStateManagerProvider = provider;
        this.trackingEventsLoggerProvider = provider2;
        this.permissionRequestWorkerProvider = instanceFactory5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        InstanceFactory instanceFactory = this.permissionRequestWorkerProvider;
        Provider provider = this.trackingEventsLoggerProvider;
        Provider provider2 = this.navigationStateManagerProvider;
        Provider provider3 = this.camera2ControllerFactoryProvider;
        Provider provider4 = this.cameraXControllerFactoryProvider;
        Provider provider5 = this.webRtcWorkerFactoryProvider;
        Provider provider6 = this.governmentIdHintWorkerFactoryProvider;
        Provider provider7 = this.governmentIdAnalyzeWorkerFactoryProvider;
        Provider provider8 = this.applicationContextProvider;
        switch (i) {
            case 0:
                return new GovIdCaptureRenderer((Context) provider8.get(), (GovernmentIdAnalyzeWorker_Factory_Impl) provider7.get(), (GovernmentIdHintWorker_Factory_Impl) provider6.get(), (WebRtcWorker.Factory) provider5.get(), (CameraXController_Factory_Impl) provider4.get(), (Camera2Controller_Factory_Impl) provider3.get(), (NavigationStateManager) provider2.get(), (TrackingEventsLogger) provider.get(), (PermissionRequestWorker_Factory_Impl) instanceFactory.instance);
            default:
                Context context = (Context) provider8.get();
                boolean booleanValue = ((Boolean) provider7.get()).booleanValue();
                CoroutineContext coroutineContext = (CoroutineContext) provider6.get();
                CoroutineContext coroutineContext2 = (CoroutineContext) provider5.get();
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = (PaymentAnalyticsRequestFactory) provider4.get();
                Function0 function0 = (Function0) provider3.get();
                Set set = (Set) provider2.get();
                boolean booleanValue2 = ((Boolean) provider.get()).booleanValue();
                boolean booleanValue3 = ((Boolean) instanceFactory.instance).booleanValue();
                context.getClass();
                coroutineContext.getClass();
                coroutineContext2.getClass();
                paymentAnalyticsRequestFactory.getClass();
                function0.getClass();
                set.getClass();
                DefaultPaymentNextActionHandlerRegistry createInstance = zzjo.createInstance(context, paymentAnalyticsRequestFactory, booleanValue, coroutineContext, coroutineContext2, function0, set, booleanValue2, booleanValue3);
                Preconditions.checkNotNullFromProvides(createInstance);
                return createInstance;
        }
    }

    public GovIdCaptureRenderer_Factory(Plane plane, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, CameraPreview_Factory cameraPreview_Factory, SandboxFlags_Factory sandboxFlags_Factory, PaymentAnalyticsRequestFactory_Factory paymentAnalyticsRequestFactory_Factory, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, CameraModule_CameraStatsManagerFactory cameraModule_CameraStatsManagerFactory, InstanceFactory instanceFactory5) {
        this.applicationContextProvider = instanceFactory;
        this.governmentIdAnalyzeWorkerFactoryProvider = instanceFactory2;
        this.governmentIdHintWorkerFactoryProvider = cameraPreview_Factory;
        this.webRtcWorkerFactoryProvider = sandboxFlags_Factory;
        this.cameraXControllerFactoryProvider = paymentAnalyticsRequestFactory_Factory;
        this.camera2ControllerFactoryProvider = instanceFactory3;
        this.navigationStateManagerProvider = instanceFactory4;
        this.trackingEventsLoggerProvider = cameraModule_CameraStatsManagerFactory;
        this.permissionRequestWorkerProvider = instanceFactory5;
    }
}
