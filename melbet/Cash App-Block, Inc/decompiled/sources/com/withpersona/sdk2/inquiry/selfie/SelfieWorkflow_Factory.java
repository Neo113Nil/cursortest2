package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.di.DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.RealCreateInstantDebitsResult;
import com.stripe.android.financialconnections.domain.RealCurrentLinkBrand;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker_Factory_Factory;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager_Factory;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer_Factory;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import net.idrnd.face.iad.capture.internal.p0;

/* loaded from: classes9.dex */
public final class SelfieWorkflow_Factory implements Factory {
    public final /* synthetic */ int $r8$classId = 0;
    public final Provider applicationContextProvider;
    public final Provider camera2ControllerFactoryProvider;
    public final Provider cameraStatsManagerProvider;
    public final Provider cameraXControllerFactoryProvider;
    public final Provider externalEventLoggerProvider;
    public final Provider localVideoCaptureRendererProvider;
    public final Provider navigationStateManagerProvider;
    public final Provider permissionRequestWorkflowProvider;
    public final Provider selfieAnalyzeWorkerProvider;
    public final Provider submitVerificationWorkerProvider;
    public final Provider trackingEventsLoggerProvider;
    public final Provider webRtcWorkerFactoryProvider;

    public SelfieWorkflow_Factory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, Provider provider, SelfieDirectionFeed_Factory selfieDirectionFeed_Factory, FeatureFlagManager_Factory featureFlagManager_Factory, DocumentsSelectWorker_Factory_Factory documentsSelectWorker_Factory_Factory, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, InstanceFactory instanceFactory3) {
        this.applicationContextProvider = instanceFactory;
        this.cameraStatsManagerProvider = instanceFactory2;
        this.navigationStateManagerProvider = provider;
        this.externalEventLoggerProvider = selfieDirectionFeed_Factory;
        this.trackingEventsLoggerProvider = featureFlagManager_Factory;
        this.submitVerificationWorkerProvider = documentsSelectWorker_Factory_Factory;
        this.selfieAnalyzeWorkerProvider = provider2;
        this.cameraXControllerFactoryProvider = provider3;
        this.camera2ControllerFactoryProvider = provider4;
        this.webRtcWorkerFactoryProvider = provider5;
        this.permissionRequestWorkflowProvider = provider6;
        this.localVideoCaptureRendererProvider = instanceFactory3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.localVideoCaptureRendererProvider;
        Provider provider2 = this.permissionRequestWorkflowProvider;
        Provider provider3 = this.webRtcWorkerFactoryProvider;
        Provider provider4 = this.camera2ControllerFactoryProvider;
        Provider provider5 = this.cameraXControllerFactoryProvider;
        Provider provider6 = this.selfieAnalyzeWorkerProvider;
        Provider provider7 = this.submitVerificationWorkerProvider;
        Provider provider8 = this.trackingEventsLoggerProvider;
        Provider provider9 = this.externalEventLoggerProvider;
        Provider provider10 = this.navigationStateManagerProvider;
        Provider provider11 = this.cameraStatsManagerProvider;
        Provider provider12 = this.applicationContextProvider;
        switch (i) {
            case 0:
                return new SelfieWorkflow((Context) provider12.get(), (SubmitVerificationWorker_Factory_Impl) ((InstanceFactory) provider7).instance, (WebRtcWorker.Factory) ((Logger_Factory) provider3).get(), (SelfieAnalyzeWorker_Factory_Impl) ((InstanceFactory) provider6).instance, (PermissionRequestWorkflow) ((LookupAccount_Factory) provider2).get(), (p0) ((LocalVideoCaptureRenderer_Factory) provider).get(), (CameraXController_Factory_Impl) ((InstanceFactory) provider5).instance, (Camera2Controller_Factory_Impl) ((InstanceFactory) provider4).instance, (RealCameraStatsManager) provider11.get(), (NavigationStateManager) provider10.get(), (ExternalEventLogger) provider9.get(), (TrackingEventsLogger) provider8.get());
            default:
                return new FinancialConnectionsSheetNativeViewModel((DaggerFinancialConnectionsSheetNativeComponent$FinancialConnectionsSheetNativeComponentImpl) provider12.get(), (SavedStateHandle) provider11.get(), (NativeAuthFlowCoordinator) provider10.get(), (UriUtils) provider9.get(), (CompleteFinancialConnectionsSession) provider8.get(), (RealCreateInstantDebitsResult) provider7.get(), (FinancialConnectionsAnalyticsTrackerImpl) provider6.get(), (Logger$Companion$NOOP_LOGGER$1) provider5.get(), (NavigationManagerImpl) provider4.get(), (RealCurrentLinkBrand) provider3.get(), (String) provider2.get(), (FinancialConnectionsSheetNativeState) provider.get());
        }
    }

    public SelfieWorkflow_Factory(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, InstanceFactory instanceFactory, Logger_Factory logger_Factory, InstanceFactory instanceFactory2, LookupAccount_Factory lookupAccount_Factory, LocalVideoCaptureRenderer_Factory localVideoCaptureRenderer_Factory, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, CameraModule_CameraStatsManagerFactory cameraModule_CameraStatsManagerFactory, Provider provider, Provider provider2, Provider provider3) {
        this.applicationContextProvider = inquiryActivityModule_ContextFactory;
        this.submitVerificationWorkerProvider = instanceFactory;
        this.webRtcWorkerFactoryProvider = logger_Factory;
        this.selfieAnalyzeWorkerProvider = instanceFactory2;
        this.permissionRequestWorkflowProvider = lookupAccount_Factory;
        this.localVideoCaptureRendererProvider = localVideoCaptureRenderer_Factory;
        this.cameraXControllerFactoryProvider = instanceFactory3;
        this.camera2ControllerFactoryProvider = instanceFactory4;
        this.cameraStatsManagerProvider = cameraModule_CameraStatsManagerFactory;
        this.navigationStateManagerProvider = provider;
        this.externalEventLoggerProvider = provider2;
        this.trackingEventsLoggerProvider = provider3;
    }
}
