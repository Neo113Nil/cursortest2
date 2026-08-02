package com.withpersona.sdk2.inquiry.internal;

import androidx.compose.material.AnchoredDraggableState;
import app.cash.zipline.loader.ZiplineLoader;
import com.android.volley.RequestQueue;
import com.google.android.gms.maps.zzai;
import com.squareup.scannerview.TextSetter;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.GooglePayJsonFactory_Factory;
import com.stripe.hcaptcha.HCaptcha;
import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.camera.CameraXController_Factory;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory_Factory;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory_Factory_Impl;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker_Factory_Factory;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepViewModel_Factory;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepViewModel_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepViewModel_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.renderers.GovIdCaptureRenderer_Factory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession_Factory;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker_Factory;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker_Factory;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieViewModel_Factory;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieViewModel_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.shared.di.BaseDaggerFragment;
import dagger.android.AndroidInjector;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okhttp3.internal.ws.RealWebSocket$connect$1;

/* loaded from: classes9.dex */
public final class DaggerInquiryComponent$UiStepFragmentSubcomponentFactory {
    public final /* synthetic */ int $r8$classId;
    public final DaggerInquiryComponent$InquiryComponentImpl inquiryComponentImpl;

    public /* synthetic */ DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl, int i) {
        this.$r8$classId = i;
        this.inquiryComponentImpl = daggerInquiryComponent$InquiryComponentImpl;
    }

    public final AndroidInjector create(BaseDaggerFragment baseDaggerFragment) {
        int i = this.$r8$classId;
        int i2 = 3;
        int i3 = 24;
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = this.inquiryComponentImpl;
        switch (i) {
            case 0:
                return new AssetPublicSuffixList(daggerInquiryComponent$InquiryComponentImpl);
            case 1:
                zzai zzaiVar = new zzai();
                zzaiVar.zaa = daggerInquiryComponent$InquiryComponentImpl;
                Provider provider = daggerInquiryComponent$InquiryComponentImpl.takePictureResultLauncherProvider;
                InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory = daggerInquiryComponent$InquiryComponentImpl.contextProvider;
                CameraPreview_Factory cameraPreview_Factory = daggerInquiryComponent$InquiryComponentImpl.provideSdkFilesManagerProvider;
                zzaiVar.zab = new DocumentCameraWorker_Factory(provider, inquiryActivityModule_ContextFactory, cameraPreview_Factory, 0);
                zzaiVar.zac = new DocumentsSelectWorker_Factory_Factory(daggerInquiryComponent$InquiryComponentImpl.openDocumentsResultLauncherProvider, daggerInquiryComponent$InquiryComponentImpl.selectFromPhotoLibraryLauncherProvider, inquiryActivityModule_ContextFactory, cameraPreview_Factory, 0);
                Provider provider2 = daggerInquiryComponent$InquiryComponentImpl.documentServiceProvider;
                zzaiVar.zad = new Logger_Factory(provider2, 7);
                zzaiVar.zza = new Logger_Factory(provider2, 9);
                zzaiVar.zzb = new SelfieDirectionFeed_Factory(provider2, daggerInquiryComponent$InquiryComponentImpl.fileHelperProvider, 23);
                zzaiVar.zzc = new Logger_Factory(provider2, 8);
                zzaiVar.zzd = new DocumentCameraWorker_Factory(provider2, daggerInquiryComponent$InquiryComponentImpl.fallbackModeManagerProvider, daggerInquiryComponent$InquiryComponentImpl.dataCollectorProvider, 15);
                zzaiVar.zze = InstanceFactory.create(new DocumentStepViewModel_Factory_Impl(new DocumentStepViewModel_Factory(InstanceFactory.create(new DocumentStepStateManager_Factory_Impl(new ZiplineLoader(daggerInquiryComponent$InquiryComponentImpl.imageLoaderProvider, daggerInquiryComponent$InquiryComponentImpl.contextProvider, (DocumentCameraWorker_Factory) zzaiVar.zab, (DocumentsSelectWorker_Factory_Factory) zzaiVar.zac, (Logger_Factory) zzaiVar.zad, (Logger_Factory) zzaiVar.zza, (SelfieDirectionFeed_Factory) zzaiVar.zzb, (Logger_Factory) zzaiVar.zzc, (DocumentCameraWorker_Factory) zzaiVar.zzd, daggerInquiryComponent$InquiryComponentImpl.navigationStateManagerProvider, daggerInquiryComponent$InquiryComponentImpl.externalEventLoggerProvider, daggerInquiryComponent$InquiryComponentImpl.trackingEventsLoggerProvider, InstanceFactory.create(new PermissionRequestWorker_Factory_Impl(new StaticTemplateSession_Factory(daggerInquiryComponent$InquiryComponentImpl.permissionsHelperProvider)))))))));
                return zzaiVar;
            case 2:
                RequestQueue requestQueue = new RequestQueue();
                requestQueue.mSequenceGenerator = daggerInquiryComponent$InquiryComponentImpl;
                requestQueue.mCurrentRequests = InstanceFactory.create(new SubmitVerificationWorker_Factory_Impl(new PollingWorker_Factory(daggerInquiryComponent$InquiryComponentImpl.contextProvider, daggerInquiryComponent$InquiryComponentImpl.governmentServiceProvider, daggerInquiryComponent$InquiryComponentImpl.dataCollectorProvider, daggerInquiryComponent$InquiryComponentImpl.fallbackModeManagerProvider, daggerInquiryComponent$InquiryComponentImpl.imageHelperProvider, daggerInquiryComponent$InquiryComponentImpl.cameraStatsManagerProvider, daggerInquiryComponent$InquiryComponentImpl.trackingEventsLoggerProvider)));
                Provider provider3 = daggerInquiryComponent$InquiryComponentImpl.openDocumentResultLauncherProvider;
                InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory2 = daggerInquiryComponent$InquiryComponentImpl.contextProvider;
                CameraPreview_Factory cameraPreview_Factory2 = daggerInquiryComponent$InquiryComponentImpl.provideSdkFilesManagerProvider;
                requestQueue.mCacheQueue = new DocumentCameraWorker_Factory(provider3, inquiryActivityModule_ContextFactory2, cameraPreview_Factory2, 16);
                requestQueue.mNetworkQueue = InstanceFactory.create(new CameraXController_Factory_Impl(new CameraXController_Factory(inquiryActivityModule_ContextFactory2, daggerInquiryComponent$InquiryComponentImpl.cameraStatsManagerProvider, cameraPreview_Factory2)));
                InstanceFactory create = InstanceFactory.create(new Camera2Controller_Factory_Impl(new RealWebSocket$connect$1(i2, InstanceFactory.create(new Camera2ManagerFactory_Factory_Impl(new Camera2ManagerFactory_Factory(daggerInquiryComponent$InquiryComponentImpl.contextProvider, daggerInquiryComponent$InquiryComponentImpl.cameraStatsManagerProvider, daggerInquiryComponent$InquiryComponentImpl.provideSdkFilesManagerProvider, daggerInquiryComponent$InquiryComponentImpl.cameraChoiceHelperProvider))), daggerInquiryComponent$InquiryComponentImpl.cameraChoiceHelperProvider)));
                requestQueue.mCache = create;
                InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory3 = daggerInquiryComponent$InquiryComponentImpl.contextProvider;
                InstanceFactory instanceFactory = (InstanceFactory) requestQueue.mNetworkQueue;
                Provider provider4 = daggerInquiryComponent$InquiryComponentImpl.navigationStateManagerProvider;
                Provider provider5 = daggerInquiryComponent$InquiryComponentImpl.trackingEventsLoggerProvider;
                requestQueue.mNetwork = new GooglePayJsonFactory_Factory(inquiryActivityModule_ContextFactory3, instanceFactory, create, provider4, provider5, 1);
                requestQueue.mDelivery = new GooglePayJsonFactory_Factory(inquiryActivityModule_ContextFactory3, instanceFactory, create, provider4, provider5, 2);
                requestQueue.mDispatchers = InstanceFactory.create(new GovernmentIdAnalyzeWorker_Factory_Impl(new CameraXController_Factory(inquiryActivityModule_ContextFactory3, daggerInquiryComponent$InquiryComponentImpl.governmentIdFeedProvider, daggerInquiryComponent$InquiryComponentImpl.provideSdkFilesManagerProvider)));
                requestQueue.mCacheDispatcher = InstanceFactory.create(new GovernmentIdHintWorker_Factory_Impl(new DeviceFeatureRequestWorker_Factory(daggerInquiryComponent$InquiryComponentImpl.contextProvider, daggerInquiryComponent$InquiryComponentImpl.governmentIdFeedProvider)));
                requestQueue.mFinishedListeners = new Logger_Factory(daggerInquiryComponent$InquiryComponentImpl.webRtcServiceProvider, i3);
                InstanceFactory create2 = InstanceFactory.create(new PermissionRequestWorker_Factory_Impl(new StaticTemplateSession_Factory(daggerInquiryComponent$InquiryComponentImpl.permissionsHelperProvider)));
                InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory4 = daggerInquiryComponent$InquiryComponentImpl.contextProvider;
                InstanceFactory instanceFactory2 = (InstanceFactory) requestQueue.mDispatchers;
                InstanceFactory instanceFactory3 = (InstanceFactory) requestQueue.mCacheDispatcher;
                Logger_Factory logger_Factory = (Logger_Factory) requestQueue.mFinishedListeners;
                InstanceFactory instanceFactory4 = (InstanceFactory) requestQueue.mNetworkQueue;
                InstanceFactory instanceFactory5 = (InstanceFactory) requestQueue.mCache;
                Provider provider6 = daggerInquiryComponent$InquiryComponentImpl.navigationStateManagerProvider;
                Provider provider7 = daggerInquiryComponent$InquiryComponentImpl.trackingEventsLoggerProvider;
                requestQueue.mEventListeners = InstanceFactory.create(new GovernmentIdStepViewModel_Factory_Impl(new SelfieViewModel_Factory(InstanceFactory.create(new GovernmentIdStepStateManager_Factory_Impl(new AnchoredDraggableState(inquiryActivityModule_ContextFactory4, daggerInquiryComponent$InquiryComponentImpl.imageLoaderProvider, (InstanceFactory) requestQueue.mCurrentRequests, (DocumentCameraWorker_Factory) requestQueue.mCacheQueue, (GooglePayJsonFactory_Factory) requestQueue.mNetwork, (GooglePayJsonFactory_Factory) requestQueue.mDelivery, new GovIdCaptureRenderer_Factory(inquiryActivityModule_ContextFactory4, instanceFactory2, instanceFactory3, logger_Factory, instanceFactory4, instanceFactory5, provider6, provider7, create2), new SelfieDirectionFeed_Factory(daggerInquiryComponent$InquiryComponentImpl.governmentServiceProvider, daggerInquiryComponent$InquiryComponentImpl.imageHelperProvider, i3), new Logger_Factory(provider6, 11), daggerInquiryComponent$InquiryComponentImpl.cameraStatsManagerProvider, provider6, daggerInquiryComponent$InquiryComponentImpl.externalEventLoggerProvider, provider7, daggerInquiryComponent$InquiryComponentImpl.inquiryThemeManagerProvider))))));
                return requestQueue;
            case 3:
                return new RealWebSocket$connect$1(daggerInquiryComponent$InquiryComponentImpl);
            case 4:
                return new InquiryManager(daggerInquiryComponent$InquiryComponentImpl, 1);
            case 5:
                return new TextSetter(daggerInquiryComponent$InquiryComponentImpl);
            case 6:
                SubtreeManager subtreeManager = new SubtreeManager();
                subtreeManager.snapshotCache = daggerInquiryComponent$InquiryComponentImpl;
                subtreeManager.contextForChildren = InstanceFactory.create(new com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker_Factory_Impl(new HCaptcha(daggerInquiryComponent$InquiryComponentImpl.contextProvider, daggerInquiryComponent$InquiryComponentImpl.selfieServiceProvider, daggerInquiryComponent$InquiryComponentImpl.dataCollectorProvider, daggerInquiryComponent$InquiryComponentImpl.fallbackModeManagerProvider, daggerInquiryComponent$InquiryComponentImpl.imageHelperProvider, daggerInquiryComponent$InquiryComponentImpl.cameraStatsManagerProvider, daggerInquiryComponent$InquiryComponentImpl.trackingEventsLoggerProvider, daggerInquiryComponent$InquiryComponentImpl.uploadServiceProvider)));
                subtreeManager.emitActionToParent = new Logger_Factory(daggerInquiryComponent$InquiryComponentImpl.webRtcServiceProvider, i3);
                subtreeManager.workflowSession = InstanceFactory.create(new SelfieAnalyzeWorker_Factory_Impl(new SelfieAnalyzeWorker_Factory(daggerInquiryComponent$InquiryComponentImpl.selfieDirectionFeedProvider, daggerInquiryComponent$InquiryComponentImpl.provideSdkFilesManagerProvider)));
                subtreeManager.interceptor = InstanceFactory.create(new PermissionRequestWorker_Factory_Impl(new StaticTemplateSession_Factory(daggerInquiryComponent$InquiryComponentImpl.permissionsHelperProvider)));
                subtreeManager.idCounter = InstanceFactory.create(new CameraXController_Factory_Impl(new CameraXController_Factory(daggerInquiryComponent$InquiryComponentImpl.contextProvider, daggerInquiryComponent$InquiryComponentImpl.cameraStatsManagerProvider, daggerInquiryComponent$InquiryComponentImpl.provideSdkFilesManagerProvider)));
                subtreeManager.children = InstanceFactory.create(new SelfieViewModel_Factory_Impl(new SelfieViewModel_Factory(InstanceFactory.create(new SelfieStepStateManager_Factory_Impl(new RequestQueue(daggerInquiryComponent$InquiryComponentImpl.contextProvider, (InstanceFactory) subtreeManager.contextForChildren, (Logger_Factory) subtreeManager.emitActionToParent, (InstanceFactory) subtreeManager.workflowSession, (InstanceFactory) subtreeManager.interceptor, (InstanceFactory) subtreeManager.idCounter, InstanceFactory.create(new Camera2Controller_Factory_Impl(new RealWebSocket$connect$1(i2, InstanceFactory.create(new Camera2ManagerFactory_Factory_Impl(new Camera2ManagerFactory_Factory(daggerInquiryComponent$InquiryComponentImpl.contextProvider, daggerInquiryComponent$InquiryComponentImpl.cameraStatsManagerProvider, daggerInquiryComponent$InquiryComponentImpl.provideSdkFilesManagerProvider, daggerInquiryComponent$InquiryComponentImpl.cameraChoiceHelperProvider))), daggerInquiryComponent$InquiryComponentImpl.cameraChoiceHelperProvider))), daggerInquiryComponent$InquiryComponentImpl.cameraStatsManagerProvider, daggerInquiryComponent$InquiryComponentImpl.navigationStateManagerProvider, daggerInquiryComponent$InquiryComponentImpl.externalEventLoggerProvider, daggerInquiryComponent$InquiryComponentImpl.trackingEventsLoggerProvider))))));
                return subtreeManager;
            default:
                return new InquiryManager(daggerInquiryComponent$InquiryComponentImpl, 2);
        }
    }
}
