package com.withpersona.sdk2.inquiry.internal;

import com.squareup.scannerview.TextSetter;
import com.stripe.android.GooglePayConfig;
import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory_Factory;
import com.withpersona.sdk2.camera.CameraHelper;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.CameraModule_SelfiePoseFactory;
import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.camera.camera2.Camera2UtilsKt;
import com.withpersona.sdk2.inquiry.device.DeviceModule;
import com.withpersona.sdk2.inquiry.device.DeviceModule_AppSetIdHelperFactory;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker_Factory_Factory;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepFragment;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager_Factory;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagModule;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagModule_TipsFeatureFlagFactory;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdKt;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepFragment;
import com.withpersona.sdk2.inquiry.integration.fragment.IntegrationStepFragment;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.FallbackModeModule_EnvironmentFactory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.OfflineModeApiController_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession_Factory;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.integrity.RealStandardIntegrityManagerFactory_Factory$InstanceHolder;
import com.withpersona.sdk2.inquiry.internal.loading.LoadingFragment;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelperKt;
import com.withpersona.sdk2.inquiry.internal.network.InquiryApiHelper_Factory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryModule_WebRtcServiceFactory;
import com.withpersona.sdk2.inquiry.internal.workflow.WorkflowStepFragment;
import com.withpersona.sdk2.inquiry.launchers.CustomTabsLauncherModule;
import com.withpersona.sdk2.inquiry.launchers.DocumentLaunchersModule_TakePictureResultLauncherFactory;
import com.withpersona.sdk2.inquiry.launchers.DocumentSelectLauncherModule;
import com.withpersona.sdk2.inquiry.logger.C0350SubsystemLogger_Factory;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.logger.SubsystemLogger_Factory_Impl;
import com.withpersona.sdk2.inquiry.modal.ModalContainerScreenKt;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_InterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_KeyInflectionFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_MoshiFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_OkhttpClientFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_ResponseInterceptorFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_RetrofitFactory;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule_UseServerStylesFactory;
import com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule_UserAgentFactory;
import com.withpersona.sdk2.inquiry.permissions.PermissionsStateKt;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionsHelper_Factory$InstanceHolder;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import com.withpersona.sdk2.inquiry.sandbox.SandboxScreen;
import com.withpersona.sdk2.inquiry.selfie.selfieStep.SelfieStepFragment;
import com.withpersona.sdk2.inquiry.shared.SharedModule;
import com.withpersona.sdk2.inquiry.shared.SharedModule_FileHelperFactory;
import com.withpersona.sdk2.inquiry.tracking.C0352TrackingEventsLoggerImpl_Factory;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache_Factory;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl_Factory_Impl;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsModule;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsModule_TrackingEventsLoggerFactory;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider_Factory;
import com.withpersona.sdk2.inquiry.ui.MdocHelperKt;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.MapFactory;
import dagger.internal.Provider;
import dagger.internal.SetBuilder;
import dagger.internal.SetFactory;
import dev.chrisbanes.haze.Pool;
import io.noties.markwon.LinkResolverDef;
import io.noties.markwon.MarkwonImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.MatchResult;
import net.idrnd.face.iad.capture.internal.o0;
import net.idrnd.face.iad.capture.internal.y0;
import net.idrnd.misnap.iad.Payload;
import okhttp3.FormBody;

/* loaded from: classes9.dex */
public final class DaggerInquiryComponent$InquiryComponentImpl {
    public final Provider appSetIdHelperProvider;
    public final Provider cameraChoiceHelperProvider;
    public final CameraPreview_Factory cameraPreviewProvider;
    public final CameraModule_CameraStatsManagerFactory cameraStatsManagerProvider;
    public final InquiryActivityModule_ContextFactory contextProvider;
    public final Provider customTabsLauncherProvider;
    public final CameraPreview_Factory dataCollectorProvider;
    public final Provider deviceIdProvider;
    public final Provider deviceInfoProvider;
    public final Provider documentServiceProvider;
    public final AnonymousClass1 documentStepFragmentSubcomponentFactoryProvider;
    public final Provider errorReportingManagerProvider;
    public final Provider externalEventLoggerProvider;
    public final CameraPreview_Factory externalInquiryControllerProvider;
    public final InstanceFactory factoryProvider2;
    public final PaymentAnalyticsRequestFactory_Factory fallbackModeApiControllerProvider;
    public final Provider fallbackModeManagerProvider;
    public final FallbackModeModule_EnvironmentFactory fallbackModeProvider;
    public final Provider fallbackModeServiceProvider;
    public final Provider featureFlagManagerProvider;
    public final Provider featureFlagServiceProvider;
    public final Provider fileHelperProvider;
    public final FeatureFlagModule_TipsFeatureFlagFactory fileUploadMultipartTransitionFlagProvider;
    public final MatchResult.Destructured filesModule;
    public final Logger_Factory governmentIdFeedProvider;
    public final AnonymousClass1 governmentIdStepFragmentSubcomponentFactoryProvider;
    public final Provider governmentServiceProvider;
    public final Provider imageHelperProvider;
    public final Provider imageLoaderProvider;
    public final FormBody.Builder inquiryActivityModule;
    public final Provider inquiryApiHelperProvider;
    public final DaggerInquiryComponent$InquiryComponentImpl inquiryComponentImpl = this;
    public final Provider inquiryServiceProvider;
    public final Provider inquiryThemeManagerProvider;
    public final AnonymousClass1 integrationStepFragmentSubcomponentFactoryProvider;
    public final NetworkCoreModule_InterceptorFactory interceptorProvider;
    public final Logger_Factory interceptorProvider2;
    public final NetworkCoreModule_KeyInflectionFactory keyInflectionProvider;
    public final AnonymousClass1 loadingFragmentSubcomponentFactoryProvider;
    public final Logger_Factory loggerProvider;
    public final MapFactory mapOfStringAndStringProvider;
    public final Provider moshiProvider;
    public final Provider navigationStateManagerProvider;
    public final FeatureFlagModule_TipsFeatureFlagFactory nfcRedesignMobileSdkFeatureFlagProvider;
    public final NetworkCoreModule_OkhttpClientFactory okhttpClientProvider;
    public final Provider openDocumentResultLauncherProvider;
    public final Provider openDocumentsResultLauncherProvider;
    public final Provider passportNfcReaderLauncherProvider;
    public final AnonymousClass1 permissionRequestFragmentSubcomponentFactoryProvider;
    public final Provider permissionsHelperProvider;
    public final TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory provideMoshiJsonAdapterFactoryProvider;
    public final CameraPreview_Factory provideSdkFilesManagerProvider;
    public final CameraPreview_Factory provideViewBindingsProvider;
    public final DeviceModule_AppSetIdHelperFactory provideViewBindingsProvider2;
    public final Provider realFallbackModeManagerProvider;
    public final Provider realFontDownloaderProvider;
    public final Provider requestPermissionResultLauncherProvider;
    public final Provider resolvableApiLauncherProvider;
    public final NetworkCoreModule_ResponseInterceptorFactory responseInterceptorProvider;
    public final Provider retrofitProvider;
    public final Provider sandboxFlagsProvider;
    public final FallbackModeModule_EnvironmentFactory savedStateHandleProvider;
    public final Provider selectFromPhotoLibraryLauncherProvider;
    public final SelfieDirectionFeed_Factory selfieDirectionFeedProvider;
    public final Logger_Factory selfieProcessorProvider;
    public final FeatureFlagModule_TipsFeatureFlagFactory selfieRedesignMobileSdkFeatureFlagProvider;
    public final Provider selfieServiceProvider;
    public final AnonymousClass1 selfieStepFragmentSubcomponentFactoryProvider;
    public final CameraPreview_Factory serverEndpointProvider;
    public final SetFactory setOfInterceptorProvider;
    public final SetFactory setOfJsonAdapterBindingOfProvider;
    public final SetFactory setOfObjectProvider;
    public final DeviceModule_AppSetIdHelperFactory silentNetworkAuthenticationManagerProvider;
    public final FeatureFlagModule_TipsFeatureFlagFactory squareWorkflowsDisabledFlagProvider;
    public final Provider systemUiControllerProvider;
    public final Provider takePictureResultLauncherProvider;
    public final FeatureFlagModule_TipsFeatureFlagFactory tipsFeatureFlagProvider;
    public final Provider trackingEventsCacheProvider;
    public final Provider trackingEventsLoggerProvider;
    public final FeatureFlagModule_TipsFeatureFlagFactory trackingEventsMobileSdkFeatureFlagProvider;
    public final Provider trackingMetadataProvider;
    public final Provider uiServiceProvider;
    public final AnonymousClass1 uiStepFragmentSubcomponentFactoryProvider;
    public final Provider uiStepSavedStateHelperProvider;
    public final Provider uploadServiceProvider;
    public final FeatureFlagModule_TipsFeatureFlagFactory useCameraXForVideoMobileSdkFeatureFlagProvider;
    public final NetworkCoreModule_UseServerStylesFactory useServerStylesProvider;
    public final Provider viewRegistryProvider;
    public final Provider webRtcServiceProvider;
    public final AnonymousClass1 workflowStepFragmentSubcomponentFactoryProvider;

    /* JADX WARN: Type inference failed for: r1v24, types: [com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl$1] */
    /* JADX WARN: Type inference failed for: r1v25, types: [com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl$1] */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl$1] */
    /* JADX WARN: Type inference failed for: r1v27, types: [com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl$1] */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl$1] */
    /* JADX WARN: Type inference failed for: r1v29, types: [com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl$1] */
    /* JADX WARN: Type inference failed for: r1v30, types: [com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl$1] */
    /* JADX WARN: Type inference failed for: r1v31, types: [com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl$1] */
    public DaggerInquiryComponent$InquiryComponentImpl(NetworkCoreModule networkCoreModule, GooglePayConfig googlePayConfig, DocumentSelectLauncherModule documentSelectLauncherModule, CameraHelper cameraHelper, o0 o0Var, MatchResult.Destructured destructured, FormBody.Builder builder, CustomTabsLauncherModule customTabsLauncherModule, MarkwonImpl markwonImpl, LinkResolverDef linkResolverDef, CustomTabsLauncherModule customTabsLauncherModule2, Payload payload, TextSetter textSetter, SharedModule sharedModule, y0 y0Var, Payload payload2, Pool pool, Payload payload3, DeviceModule deviceModule, FeatureFlagModule featureFlagModule, TrackingEventsModule trackingEventsModule) {
        this.inquiryActivityModule = builder;
        this.filesModule = destructured;
        int i = 1;
        this.governmentIdFeedProvider = new Logger_Factory(DoubleCheck.provider(new CameraModule_SelfiePoseFactory(cameraHelper, i)), i);
        CameraPreview_Factory cameraPreview_Factory = new CameraPreview_Factory(destructured, 19);
        this.provideSdkFilesManagerProvider = cameraPreview_Factory;
        int i2 = 0;
        this.cameraPreviewProvider = new CameraPreview_Factory(cameraPreview_Factory, i2);
        this.selfieRedesignMobileSdkFeatureFlagProvider = new FeatureFlagModule_TipsFeatureFlagFactory(featureFlagModule, 3);
        this.trackingEventsMobileSdkFeatureFlagProvider = new FeatureFlagModule_TipsFeatureFlagFactory(featureFlagModule, 5);
        this.nfcRedesignMobileSdkFeatureFlagProvider = new FeatureFlagModule_TipsFeatureFlagFactory(featureFlagModule, 2);
        this.tipsFeatureFlagProvider = new FeatureFlagModule_TipsFeatureFlagFactory(featureFlagModule, 0);
        this.squareWorkflowsDisabledFlagProvider = new FeatureFlagModule_TipsFeatureFlagFactory(featureFlagModule, 4);
        this.fileUploadMultipartTransitionFlagProvider = new FeatureFlagModule_TipsFeatureFlagFactory(featureFlagModule, 1);
        this.useCameraXForVideoMobileSdkFeatureFlagProvider = new FeatureFlagModule_TipsFeatureFlagFactory(featureFlagModule, 6);
        int i3 = SetFactory.$r8$clinit;
        ArrayList arrayList = new ArrayList(7);
        List list = Collections.EMPTY_LIST;
        arrayList.add(this.selfieRedesignMobileSdkFeatureFlagProvider);
        arrayList.add(this.trackingEventsMobileSdkFeatureFlagProvider);
        arrayList.add(this.nfcRedesignMobileSdkFeatureFlagProvider);
        arrayList.add(this.tipsFeatureFlagProvider);
        arrayList.add(this.squareWorkflowsDisabledFlagProvider);
        arrayList.add(this.fileUploadMultipartTransitionFlagProvider);
        arrayList.add(this.useCameraXForVideoMobileSdkFeatureFlagProvider);
        SetFactory setFactory = new SetFactory(arrayList, list);
        InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory = new InquiryActivityModule_ContextFactory(builder, 0);
        this.contextProvider = inquiryActivityModule_ContextFactory;
        FallbackModeModule_EnvironmentFactory fallbackModeModule_EnvironmentFactory = new FallbackModeModule_EnvironmentFactory(textSetter, 2);
        this.savedStateHandleProvider = fallbackModeModule_EnvironmentFactory;
        this.featureFlagManagerProvider = DoubleCheck.provider(new FeatureFlagManager_Factory(setFactory, inquiryActivityModule_ContextFactory, fallbackModeModule_EnvironmentFactory, i2));
        this.trackingEventsCacheProvider = DoubleCheck.provider(TrackingEventsCache_Factory.create());
        List list2 = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add(InquiryApiHelperKt.INSTANCE$1);
        arrayList2.add(MdocHelperKt.INSTANCE);
        this.setOfObjectProvider = new SetFactory(list2, arrayList2);
        List list3 = Collections.EMPTY_LIST;
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add(InquiryApiHelperKt.INSTANCE);
        this.setOfJsonAdapterBindingOfProvider = new SetFactory(list3, arrayList3);
        this.provideMoshiJsonAdapterFactoryProvider = TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory.create(trackingEventsModule);
        List list4 = Collections.EMPTY_LIST;
        ArrayList arrayList4 = new ArrayList(5);
        arrayList4.add(NetworkInquiryModule_ProvideMoshiJsonAdapterFactoryFactory.create());
        arrayList4.add(NetworkCoreModule_ProvideMoshiJsonAdapterFactoryFactory.create());
        arrayList4.add(InquiryApiHelperKt.INSTANCE$2);
        arrayList4.add(GovernmentIdKt.INSTANCE);
        arrayList4.add(this.provideMoshiJsonAdapterFactoryProvider);
        this.moshiProvider = DoubleCheck.provider(NetworkCoreModule_MoshiFactory.create(networkCoreModule, (Provider) this.setOfObjectProvider, (Provider) this.setOfJsonAdapterBindingOfProvider, (Provider) new SetFactory(list4, arrayList4)));
        Provider provider = DoubleCheck.provider(TrackingMetadataProvider_Factory.create((Provider) this.contextProvider));
        this.trackingMetadataProvider = provider;
        Provider provider2 = DoubleCheck.provider(TrackingEventsModule_TrackingEventsLoggerFactory.create(trackingEventsModule, TrackingEventsLoggerImpl_Factory_Impl.createFactoryProvider(C0352TrackingEventsLoggerImpl_Factory.create((Provider) this.contextProvider, this.trackingEventsCacheProvider, this.moshiProvider, provider, (Provider) this.provideSdkFilesManagerProvider))));
        this.trackingEventsLoggerProvider = provider2;
        Logger_Factory logger_Factory = this.governmentIdFeedProvider;
        CameraPreview_Factory cameraPreview_Factory2 = this.cameraPreviewProvider;
        Provider provider3 = this.featureFlagManagerProvider;
        this.provideViewBindingsProvider = new CameraPreview_Factory(new DocumentsSelectWorker_Factory_Factory(logger_Factory, cameraPreview_Factory2, provider3, provider2, 3), 7);
        this.selfieProcessorProvider = new Logger_Factory(provider3, 2);
        this.selfieDirectionFeedProvider = new SelfieDirectionFeed_Factory(this.selfieProcessorProvider, DoubleCheck.provider(new CameraModule_SelfiePoseFactory(cameraHelper, i2)), i2);
        Provider provider4 = DoubleCheck.provider(Camera2UtilsKt.INSTANCE);
        this.cameraChoiceHelperProvider = provider4;
        CameraPreview_Factory cameraPreview_Factory3 = this.cameraPreviewProvider;
        SelfieDirectionFeed_Factory selfieDirectionFeed_Factory = this.selfieDirectionFeedProvider;
        Provider provider5 = this.trackingEventsLoggerProvider;
        this.provideViewBindingsProvider2 = new DeviceModule_AppSetIdHelperFactory(new DocumentsSelectWorker_Factory_Factory(cameraPreview_Factory3, selfieDirectionFeed_Factory, provider4, provider5, 4), new DocumentsSelectWorker_Factory_Factory(cameraPreview_Factory3, selfieDirectionFeed_Factory, provider5, this.featureFlagManagerProvider, 5), 6);
        List list5 = Collections.EMPTY_LIST;
        ArrayList arrayList5 = new ArrayList(8);
        arrayList5.add(InquiryApiHelperKt.INSTANCE$3);
        arrayList5.add(this.provideViewBindingsProvider);
        arrayList5.add(MdocHelperKt.INSTANCE$1);
        arrayList5.add(this.provideViewBindingsProvider2);
        arrayList5.add(DocumentWorkflow.Event.INSTANCE);
        arrayList5.add(SandboxScreen.INSTANCE$1);
        arrayList5.add(ModalContainerScreenKt.INSTANCE);
        arrayList5.add(PermissionsStateKt.INSTANCE);
        this.viewRegistryProvider = DoubleCheck.provider(new CameraPreview_Factory(new SetFactory(list5, arrayList5), 9));
        this.serverEndpointProvider = new CameraPreview_Factory(googlePayConfig, 8);
        this.responseInterceptorProvider = NetworkCoreModule_ResponseInterceptorFactory.create(networkCoreModule);
        this.interceptorProvider = NetworkCoreModule_InterceptorFactory.create(networkCoreModule, this.moshiProvider);
        Provider provider6 = DoubleCheck.provider(SandboxScreen.INSTANCE);
        this.sandboxFlagsProvider = provider6;
        this.interceptorProvider2 = new Logger_Factory(linkResolverDef, provider6, 20);
        ArrayList arrayList6 = new ArrayList(3);
        List list6 = Collections.EMPTY_LIST;
        arrayList6.add(this.responseInterceptorProvider);
        arrayList6.add(this.interceptorProvider);
        arrayList6.add(this.interceptorProvider2);
        this.setOfInterceptorProvider = new SetFactory(arrayList6, list6);
        this.keyInflectionProvider = NetworkCoreModule_KeyInflectionFactory.create(networkCoreModule);
        this.useServerStylesProvider = NetworkCoreModule_UseServerStylesFactory.create(networkCoreModule);
        int i4 = MapFactory.$r8$clinit;
        SetBuilder setBuilder = new SetBuilder(3);
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder("User-Agent", NetworkInquiryModule_UserAgentFactory.create());
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder("Key-Inflection", this.keyInflectionProvider);
        setBuilder.put$dagger$internal$AbstractMapFactory$Builder("Persona-Use-Mobile-Server-Styles", this.useServerStylesProvider);
        this.mapOfStringAndStringProvider = new MapFactory((LinkedHashMap) setBuilder.contributions);
        this.appSetIdHelperProvider = DoubleCheck.provider(new DeviceModule_AppSetIdHelperFactory(deviceModule, new Logger_Factory(this.contextProvider, 6), i2));
        this.deviceInfoProvider = DoubleCheck.provider(new DeviceModule_AppSetIdHelperFactory(deviceModule, new Logger_Factory(this.contextProvider, 5), 4));
        Logger_Factory logger_Factory2 = new Logger_Factory(this.contextProvider, i2);
        this.loggerProvider = logger_Factory2;
        InstanceFactory create = InstanceFactory.create(new SubsystemLogger_Factory_Impl(new C0350SubsystemLogger_Factory(logger_Factory2)));
        this.factoryProvider2 = create;
        final int i5 = 1;
        NetworkCoreModule_OkhttpClientFactory create2 = NetworkCoreModule_OkhttpClientFactory.create(networkCoreModule, (Provider) this.setOfInterceptorProvider, (Provider) this.mapOfStringAndStringProvider, (Provider) this.contextProvider, this.appSetIdHelperProvider, this.deviceInfoProvider, (Provider) create);
        this.okhttpClientProvider = create2;
        Provider provider7 = DoubleCheck.provider(NetworkCoreModule_RetrofitFactory.create(networkCoreModule, (Provider) this.serverEndpointProvider, (Provider) create2, this.moshiProvider));
        this.retrofitProvider = provider7;
        Provider provider8 = DoubleCheck.provider(new Logger_Factory(googlePayConfig, provider7, 16));
        this.inquiryServiceProvider = provider8;
        int i6 = 17;
        this.errorReportingManagerProvider = DoubleCheck.provider(new DocumentCameraWorker_Factory(provider8, this.moshiProvider, this.loggerProvider, i6));
        this.imageLoaderProvider = DoubleCheck.provider(new UiStepSavedStateHelper_Factory(builder, this.contextProvider));
        this.fallbackModeProvider = new FallbackModeModule_EnvironmentFactory(textSetter, i5);
        this.fallbackModeServiceProvider = DoubleCheck.provider(new InquiryModule_WebRtcServiceFactory(googlePayConfig, this.retrofitProvider, i5));
        InstanceFactory create3 = InstanceFactory.create(new StaticTemplateSession_Factory_Impl(new StaticTemplateSession_Factory(this.savedStateHandleProvider)));
        Provider provider9 = this.fallbackModeServiceProvider;
        Provider provider10 = this.moshiProvider;
        final int i7 = 2;
        this.fallbackModeApiControllerProvider = new PaymentAnalyticsRequestFactory_Factory(provider9, provider10, create3, i7);
        final int i8 = 0;
        Provider provider11 = DoubleCheck.provider(new LookupAccount_Factory((Factory) this.fallbackModeProvider, (Factory) new FeatureFlagManager_Factory(payload2, this.fallbackModeApiControllerProvider, InstanceFactory.create(new OfflineModeApiController_Factory_Impl(new TextSetter(provider10, this.contextProvider, create3))), 5), (Factory) new FallbackModeModule_EnvironmentFactory(textSetter, i8), this.moshiProvider, 7));
        this.realFallbackModeManagerProvider = provider11;
        int i9 = 12;
        this.fallbackModeManagerProvider = DoubleCheck.provider(new Logger_Factory(textSetter, provider11, i9));
        int i10 = 15;
        this.systemUiControllerProvider = DoubleCheck.provider(new CameraPreview_Factory(sharedModule, i10));
        CameraPreview_Factory cameraPreview_Factory4 = new CameraPreview_Factory(pool, 18);
        this.externalInquiryControllerProvider = cameraPreview_Factory4;
        this.externalEventLoggerProvider = DoubleCheck.provider(new CameraPreview_Factory(cameraPreview_Factory4, i6));
        final int i11 = 7;
        this.realFontDownloaderProvider = DoubleCheck.provider(new DeviceModule_AppSetIdHelperFactory(this.okhttpClientProvider, new InquiryActivityModule_ContextFactory(builder, 1), i11));
        this.governmentIdStepFragmentSubcomponentFactoryProvider = new Provider(this) { // from class: com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl.1
            public final /* synthetic */ DaggerInquiryComponent$InquiryComponentImpl this$0;

            {
                this.this$0 = this;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                int i12 = i8;
                DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = this.this$0;
                switch (i12) {
                    case 0:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 2);
                    case 1:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 0);
                    case 2:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 6);
                    case 3:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 1);
                    case 4:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 5);
                    case 5:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 4);
                    case 6:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 7);
                    default:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 3);
                }
            }
        };
        this.uiStepFragmentSubcomponentFactoryProvider = new Provider(this) { // from class: com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl.1
            public final /* synthetic */ DaggerInquiryComponent$InquiryComponentImpl this$0;

            {
                this.this$0 = this;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                int i12 = i5;
                DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = this.this$0;
                switch (i12) {
                    case 0:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 2);
                    case 1:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 0);
                    case 2:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 6);
                    case 3:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 1);
                    case 4:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 5);
                    case 5:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 4);
                    case 6:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 7);
                    default:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 3);
                }
            }
        };
        this.selfieStepFragmentSubcomponentFactoryProvider = new Provider(this) { // from class: com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl.1
            public final /* synthetic */ DaggerInquiryComponent$InquiryComponentImpl this$0;

            {
                this.this$0 = this;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                int i12 = i7;
                DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = this.this$0;
                switch (i12) {
                    case 0:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 2);
                    case 1:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 0);
                    case 2:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 6);
                    case 3:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 1);
                    case 4:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 5);
                    case 5:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 4);
                    case 6:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 7);
                    default:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 3);
                }
            }
        };
        final int i12 = 3;
        this.documentStepFragmentSubcomponentFactoryProvider = new Provider(this) { // from class: com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl.1
            public final /* synthetic */ DaggerInquiryComponent$InquiryComponentImpl this$0;

            {
                this.this$0 = this;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                int i122 = i12;
                DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = this.this$0;
                switch (i122) {
                    case 0:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 2);
                    case 1:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 0);
                    case 2:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 6);
                    case 3:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 1);
                    case 4:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 5);
                    case 5:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 4);
                    case 6:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 7);
                    default:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 3);
                }
            }
        };
        final int i13 = 4;
        this.permissionRequestFragmentSubcomponentFactoryProvider = new Provider(this) { // from class: com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl.1
            public final /* synthetic */ DaggerInquiryComponent$InquiryComponentImpl this$0;

            {
                this.this$0 = this;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                int i122 = i13;
                DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = this.this$0;
                switch (i122) {
                    case 0:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 2);
                    case 1:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 0);
                    case 2:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 6);
                    case 3:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 1);
                    case 4:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 5);
                    case 5:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 4);
                    case 6:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 7);
                    default:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 3);
                }
            }
        };
        final int i14 = 5;
        this.loadingFragmentSubcomponentFactoryProvider = new Provider(this) { // from class: com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl.1
            public final /* synthetic */ DaggerInquiryComponent$InquiryComponentImpl this$0;

            {
                this.this$0 = this;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                int i122 = i14;
                DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = this.this$0;
                switch (i122) {
                    case 0:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 2);
                    case 1:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 0);
                    case 2:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 6);
                    case 3:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 1);
                    case 4:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 5);
                    case 5:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 4);
                    case 6:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 7);
                    default:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 3);
                }
            }
        };
        final int i15 = 6;
        this.workflowStepFragmentSubcomponentFactoryProvider = new Provider(this) { // from class: com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl.1
            public final /* synthetic */ DaggerInquiryComponent$InquiryComponentImpl this$0;

            {
                this.this$0 = this;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                int i122 = i15;
                DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = this.this$0;
                switch (i122) {
                    case 0:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 2);
                    case 1:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 0);
                    case 2:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 6);
                    case 3:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 1);
                    case 4:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 5);
                    case 5:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 4);
                    case 6:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 7);
                    default:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 3);
                }
            }
        };
        this.integrationStepFragmentSubcomponentFactoryProvider = new Provider(this) { // from class: com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl.1
            public final /* synthetic */ DaggerInquiryComponent$InquiryComponentImpl this$0;

            {
                this.this$0 = this;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                int i122 = i11;
                DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = this.this$0;
                switch (i122) {
                    case 0:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 2);
                    case 1:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 0);
                    case 2:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 6);
                    case 3:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 1);
                    case 4:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 5);
                    case 5:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 4);
                    case 6:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 7);
                    default:
                        return new DaggerInquiryComponent$UiStepFragmentSubcomponentFactory(daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl, 3);
                }
            }
        };
        this.permissionsHelperProvider = DoubleCheck.provider(PermissionsHelper_Factory$InstanceHolder.INSTANCE);
        this.deviceIdProvider = DoubleCheck.provider(new CameraPreview_Factory(deviceModule, new Logger_Factory(this.contextProvider, i13)));
        this.inquiryApiHelperProvider = DoubleCheck.provider(new InquiryApiHelper_Factory(this.contextProvider, this.inquiryServiceProvider, this.realFallbackModeManagerProvider, this.sandboxFlagsProvider, this.deviceIdProvider, DoubleCheck.provider(new DocumentCameraWorker_Factory(this.contextProvider, this.factoryProvider2, DoubleCheck.provider(RealStandardIntegrityManagerFactory_Factory$InstanceHolder.INSTANCE), new SandboxFlags_Factory(y0Var, 22))), 0));
        this.inquiryThemeManagerProvider = DoubleCheck.provider(new Logger_Factory(this.savedStateHandleProvider, 21));
        this.uiStepSavedStateHelperProvider = DoubleCheck.provider(new UiStepSavedStateHelper_Factory(this.contextProvider));
        this.governmentServiceProvider = DoubleCheck.provider(new Logger_Factory(googlePayConfig, this.retrofitProvider, i10));
        this.dataCollectorProvider = new CameraPreview_Factory(payload, 16);
        this.imageHelperProvider = DoubleCheck.provider(new SharedModule_FileHelperFactory(sharedModule, i5));
        this.cameraStatsManagerProvider = new CameraModule_CameraStatsManagerFactory(cameraHelper, DoubleCheck.provider(new Logger_Factory(this.contextProvider, i12)), i8);
        this.openDocumentResultLauncherProvider = DoubleCheck.provider(new CameraPreview_Factory(documentSelectLauncherModule, 11));
        this.navigationStateManagerProvider = DoubleCheck.provider(new SelfieDirectionFeed_Factory(this.externalInquiryControllerProvider, this.featureFlagManagerProvider, 26));
        this.requestPermissionResultLauncherProvider = DoubleCheck.provider(new CameraPreview_Factory(o0Var, i9));
        int i16 = 13;
        this.resolvableApiLauncherProvider = DoubleCheck.provider(new CameraPreview_Factory(payload3, i16));
        this.webRtcServiceProvider = DoubleCheck.provider(new InquiryModule_WebRtcServiceFactory(googlePayConfig, this.retrofitProvider, i8));
        this.selfieServiceProvider = DoubleCheck.provider(new Logger_Factory(googlePayConfig, this.retrofitProvider, i6));
        this.uploadServiceProvider = DoubleCheck.provider(new Logger_Factory(googlePayConfig, this.retrofitProvider, 19));
        int i17 = 14;
        this.passportNfcReaderLauncherProvider = DoubleCheck.provider(new CameraPreview_Factory(customTabsLauncherModule2, i17));
        this.uiServiceProvider = DoubleCheck.provider(new Logger_Factory(googlePayConfig, this.retrofitProvider, 18));
        this.customTabsLauncherProvider = DoubleCheck.provider(new CameraPreview_Factory(customTabsLauncherModule, 10));
        this.openDocumentsResultLauncherProvider = DoubleCheck.provider(new DocumentLaunchersModule_TakePictureResultLauncherFactory(markwonImpl, i5));
        this.takePictureResultLauncherProvider = DoubleCheck.provider(new DocumentLaunchersModule_TakePictureResultLauncherFactory(markwonImpl, i8));
        this.selectFromPhotoLibraryLauncherProvider = DoubleCheck.provider(new DocumentLaunchersModule_TakePictureResultLauncherFactory(markwonImpl, 2));
        this.documentServiceProvider = DoubleCheck.provider(new Logger_Factory(googlePayConfig, this.retrofitProvider, i16));
        this.fileHelperProvider = DoubleCheck.provider(new SharedModule_FileHelperFactory(sharedModule, i8));
        this.featureFlagServiceProvider = DoubleCheck.provider(new Logger_Factory(googlePayConfig, this.retrofitProvider, i17));
        this.silentNetworkAuthenticationManagerProvider = new DeviceModule_AppSetIdHelperFactory(new SelfieDirectionFeed_Factory(this.contextProvider, this.inquiryServiceProvider, 25), new SandboxFlags_Factory(y0Var, 23), 5);
    }

    public final DispatchingAndroidInjector dispatchingAndroidInjector() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(11);
        linkedHashMap.put(GovernmentIdStepFragment.class, this.governmentIdStepFragmentSubcomponentFactoryProvider);
        linkedHashMap.put(UiStepFragment.class, this.uiStepFragmentSubcomponentFactoryProvider);
        linkedHashMap.put(SelfieStepFragment.class, this.selfieStepFragmentSubcomponentFactoryProvider);
        linkedHashMap.put(DocumentStepFragment.class, this.documentStepFragmentSubcomponentFactoryProvider);
        linkedHashMap.put(PermissionRequestFragment.class, this.permissionRequestFragmentSubcomponentFactoryProvider);
        linkedHashMap.put(LoadingFragment.class, this.loadingFragmentSubcomponentFactoryProvider);
        linkedHashMap.put(WorkflowStepFragment.class, this.workflowStepFragmentSubcomponentFactoryProvider);
        linkedHashMap.put(IntegrationStepFragment.class, this.integrationStepFragmentSubcomponentFactoryProvider);
        Map unmodifiableMap = linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap);
        Map map = Collections.EMPTY_MAP;
        return new DispatchingAndroidInjector(unmodifiableMap);
    }

    public final TrackingEventsLogger trackingEventsLogger() {
        return (TrackingEventsLogger) this.trackingEventsLoggerProvider.get();
    }
}
