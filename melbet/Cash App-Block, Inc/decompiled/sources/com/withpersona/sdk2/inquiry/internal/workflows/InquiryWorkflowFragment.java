package com.withpersona.sdk2.inquiry.internal.workflows;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.cash.R;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor_Factory;
import com.stripe.hcaptcha.HCaptcha;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.CameraPreview$rebind$1$1$1;
import com.withpersona.sdk2.camera.CameraPreview_Factory;
import com.withpersona.sdk2.camera.CameraXController_Factory;
import com.withpersona.sdk2.camera.CameraXController_Factory_Impl;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.camera.camera2.Camera2Controller_Factory_Impl;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory_Factory;
import com.withpersona.sdk2.camera.camera2.Camera2ManagerFactory_Factory_Impl;
import com.withpersona.sdk2.inquiry.document.DocumentCameraWorker_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow;
import com.withpersona.sdk2.inquiry.document.DocumentWorkflow_Factory;
import com.withpersona.sdk2.inquiry.document.DocumentsSelectWorker_Factory_Factory;
import com.withpersona.sdk2.inquiry.document.step.DocumentStepViewModel_Factory;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.featureflag.network.FeatureFlagWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdAnalyzeWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow_Factory;
import com.withpersona.sdk2.inquiry.governmentid.capture.CaptureRenderer_Factory;
import com.withpersona.sdk2.inquiry.governmentid.live_hint.GovernmentIdHintWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.governmentid.network.SubmitVerificationWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.integration.C0349IntegrationBrowserWorker_Factory;
import com.withpersona.sdk2.inquiry.integration.IntegrationBrowserWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.integration.IntegrationWorkflow;
import com.withpersona.sdk2.inquiry.internal.CreateInquirySessionWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.CreateInquiryWorker_Factory;
import com.withpersona.sdk2.inquiry.internal.CreateInquiryWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$InquiryComponentImpl;
import com.withpersona.sdk2.inquiry.internal.ExchangeOneTimeCodeWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1;
import com.withpersona.sdk2.inquiry.internal.InquiryWorkflow$Props;
import com.withpersona.sdk2.inquiry.internal.PollingWorker_Factory;
import com.withpersona.sdk2.inquiry.internal.PollingWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.RestoreUiStepStateWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.SilentNetworkAuthenticationManager;
import com.withpersona.sdk2.inquiry.internal.TransitionBackWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.TransitionWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper;
import com.withpersona.sdk2.inquiry.internal.UpdateInquirySessionWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.internal.databinding.Pi2FragmentWorkflowBinding;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager_Factory;
import com.withpersona.sdk2.inquiry.internal.state.InquiryStateManager_Factory_Impl;
import com.withpersona.sdk2.inquiry.logger.Logger_Factory;
import com.withpersona.sdk2.inquiry.nfc.C0351ScanNfcWorker_Factory;
import com.withpersona.sdk2.inquiry.nfc.MrzKey;
import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker_Factory;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow_Factory;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionsHelper;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker_Factory;
import com.withpersona.sdk2.inquiry.selfie.SelfieAnalyzeWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow_Factory;
import com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer_Factory;
import com.withpersona.sdk2.inquiry.shared.baseFragment.BaseFragment;
import com.withpersona.sdk2.inquiry.shared.baseFragment.FragmentArgsLazy;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import com.withpersona.sdk2.inquiry.tracking.TrackingMetadataProvider;
import com.withpersona.sdk2.inquiry.ui.ComponentWorkHelper_Factory;
import com.withpersona.sdk2.inquiry.ui.CreateReusablePersonaWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow_Factory;
import com.withpersona.sdk2.inquiry.ui.VerifyReusablePersonaWorker_Factory_Impl;
import com.withpersona.sdk2.inquiry.ui.uiStep.UiStepFragment$special$$inlined$lazyViewModel$4;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.jvm.internal.ConvertFromJavaKt$$Lambda$4;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlinx.coroutines.JobKt;
import net.idrnd.face.iad.capture.internal.e3;
import okhttp3.internal.ws.RealWebSocket$connect$1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/workflows/InquiryWorkflowFragment;", "Lcom/withpersona/sdk2/inquiry/shared/baseFragment/BaseFragment;", "Lcom/withpersona/sdk2/inquiry/internal/databinding/Pi2FragmentWorkflowBinding;", "Ldagger/android/HasAndroidInjector;", "<init>", "()V", "WorkflowFragmentArgs", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InquiryWorkflowFragment extends BaseFragment<Pi2FragmentWorkflowBinding> implements HasAndroidInjector {
    public final FragmentArgsLazy args$delegate;
    public DaggerInquiryComponent$InquiryComponentImpl inquiryComponent;
    public TextSetter inquiryStateRenderer;
    public final ViewModelLazy viewModel$delegate;
    public InquiryWorkflowsViewModel_Factory_Impl viewModelFactory;
    public final ViewModelLazy workflowStateViewModel$delegate;
    public WorkflowStateViewModel_Factory_Impl workflowStateViewModelFactory;

    public final class WorkflowFragmentArgs implements Parcelable {
        public static final Parcelable.Creator<WorkflowFragmentArgs> CREATOR = new MrzKey.Creator(23);
        public final String inquiryId;
        public final InquiryWorkflow$Props inquiryWorkflowProps;
        public final String sessionToken;

        public WorkflowFragmentArgs(String str, String str2, InquiryWorkflow$Props inquiryWorkflow$Props) {
            inquiryWorkflow$Props.getClass();
            this.inquiryId = str;
            this.sessionToken = str2;
            this.inquiryWorkflowProps = inquiryWorkflow$Props;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.inquiryId);
            parcel.writeString(this.sessionToken);
            parcel.writeParcelable(this.inquiryWorkflowProps, i);
        }
    }

    public InquiryWorkflowFragment() {
        final int i = 0;
        KClassImpl$Data$$Lambda$22 kClassImpl$Data$$Lambda$22 = new KClassImpl$Data$$Lambda$22(5, this, new Function1(this) { // from class: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$$ExternalSyntheticLambda0
            public final /* synthetic */ InquiryWorkflowFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                InquiryWorkflowFragment inquiryWorkflowFragment = this.f$0;
                SavedStateHandle savedStateHandle = (SavedStateHandle) obj;
                switch (i2) {
                    case 0:
                        savedStateHandle.getClass();
                        InquiryWorkflowsViewModel_Factory_Impl inquiryWorkflowsViewModel_Factory_Impl = inquiryWorkflowFragment.viewModelFactory;
                        if (inquiryWorkflowsViewModel_Factory_Impl != null) {
                            return new InquiryWorkflowsViewModel(savedStateHandle, (InquiryStateManager_Factory_Impl) inquiryWorkflowsViewModel_Factory_Impl.delegateFactory.documentStepStateManagerFactoryProvider.instance);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
                        throw null;
                    default:
                        savedStateHandle.getClass();
                        if (inquiryWorkflowFragment.workflowStateViewModelFactory != null) {
                            return new WorkflowStateViewModel(savedStateHandle);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("workflowStateViewModelFactory");
                        throw null;
                }
            }
        });
        InquiryWorkflowFragment$special$$inlined$lazyViewModel$2 inquiryWorkflowFragment$special$$inlined$lazyViewModel$2 = new InquiryWorkflowFragment$special$$inlined$lazyViewModel$2(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new e3(inquiryWorkflowFragment$special$$inlined$lazyViewModel$2, 17));
        ReflectionFactory reflectionFactory = Reflection.factory;
        this.viewModel$delegate = new ViewModelLazy(reflectionFactory.getOrCreateKotlinClass(InquiryWorkflowsViewModel.class), new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 10), kClassImpl$Data$$Lambda$22, new UiStepFragment$special$$inlined$lazyViewModel$4(lazy, 11));
        final int i2 = 1;
        KClassImpl$Data$$Lambda$22 kClassImpl$Data$$Lambda$222 = new KClassImpl$Data$$Lambda$22(6, this, new Function1(this) { // from class: com.withpersona.sdk2.inquiry.internal.workflows.InquiryWorkflowFragment$$ExternalSyntheticLambda0
            public final /* synthetic */ InquiryWorkflowFragment f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                InquiryWorkflowFragment inquiryWorkflowFragment = this.f$0;
                SavedStateHandle savedStateHandle = (SavedStateHandle) obj;
                switch (i22) {
                    case 0:
                        savedStateHandle.getClass();
                        InquiryWorkflowsViewModel_Factory_Impl inquiryWorkflowsViewModel_Factory_Impl = inquiryWorkflowFragment.viewModelFactory;
                        if (inquiryWorkflowsViewModel_Factory_Impl != null) {
                            return new InquiryWorkflowsViewModel(savedStateHandle, (InquiryStateManager_Factory_Impl) inquiryWorkflowsViewModel_Factory_Impl.delegateFactory.documentStepStateManagerFactoryProvider.instance);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
                        throw null;
                    default:
                        savedStateHandle.getClass();
                        if (inquiryWorkflowFragment.workflowStateViewModelFactory != null) {
                            return new WorkflowStateViewModel(savedStateHandle);
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("workflowStateViewModelFactory");
                        throw null;
                }
            }
        });
        Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new e3(new InquiryWorkflowFragment$special$$inlined$lazyViewModel$2(this, 1), 18));
        this.workflowStateViewModel$delegate = new ViewModelLazy(reflectionFactory.getOrCreateKotlinClass(WorkflowStateViewModel.class), new UiStepFragment$special$$inlined$lazyViewModel$4(lazy2, 12), kClassImpl$Data$$Lambda$222, new UiStepFragment$special$$inlined$lazyViewModel$4(lazy2, 9));
        this.args$delegate = new FragmentArgsLazy(reflectionFactory.getOrCreateKotlinClass(WorkflowFragmentArgs.class), new ConvertFromJavaKt$$Lambda$4(this, 11));
    }

    @Override // dagger.android.HasAndroidInjector
    public final DispatchingAndroidInjector androidInjector() {
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = this.inquiryComponent;
        if (daggerInquiryComponent$InquiryComponentImpl != null) {
            return daggerInquiryComponent$InquiryComponentImpl.dispatchingAndroidInjector();
        }
        Intrinsics.throwUninitializedPropertyAccessException("inquiryComponent");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Fragment parentFragment = getParentFragment();
        parentFragment.getClass();
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = ((InquiryFragment) parentFragment).getViewModel$1().component;
        if (daggerInquiryComponent$InquiryComponentImpl == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
            return;
        }
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl2 = daggerInquiryComponent$InquiryComponentImpl.inquiryComponentImpl;
        InstanceFactory create = InstanceFactory.create(new CreateInquiryWorker_Factory_Impl(new CreateInquiryWorker_Factory(daggerInquiryComponent$InquiryComponentImpl2.inquiryApiHelperProvider)));
        InstanceFactory create2 = InstanceFactory.create(new CreateInquirySessionWorker_Factory_Impl(new CreateInquiryWorker_Factory(daggerInquiryComponent$InquiryComponentImpl2.inquiryApiHelperProvider)));
        InstanceFactory create3 = InstanceFactory.create(new PollingWorker_Factory_Impl(new PollingWorker_Factory(daggerInquiryComponent$InquiryComponentImpl2.inquiryServiceProvider, daggerInquiryComponent$InquiryComponentImpl2.deviceIdProvider, daggerInquiryComponent$InquiryComponentImpl2.sandboxFlagsProvider, daggerInquiryComponent$InquiryComponentImpl2.realFallbackModeManagerProvider, daggerInquiryComponent$InquiryComponentImpl2.realFontDownloaderProvider, daggerInquiryComponent$InquiryComponentImpl2.inquiryThemeManagerProvider, daggerInquiryComponent$InquiryComponentImpl2.inquiryApiHelperProvider)));
        InstanceFactory create4 = InstanceFactory.create(new TransitionBackWorker_Factory_Impl(new CreateInquiryWorker_Factory(daggerInquiryComponent$InquiryComponentImpl2.inquiryApiHelperProvider)));
        InstanceFactory create5 = InstanceFactory.create(new TransitionWorker_Factory_Impl(new MarkwonConfiguration(daggerInquiryComponent$InquiryComponentImpl2.inquiryServiceProvider, daggerInquiryComponent$InquiryComponentImpl2.fallbackModeManagerProvider, daggerInquiryComponent$InquiryComponentImpl2.uiStepSavedStateHelperProvider, daggerInquiryComponent$InquiryComponentImpl2.featureFlagManagerProvider, daggerInquiryComponent$InquiryComponentImpl2.contextProvider)));
        InstanceFactory create6 = InstanceFactory.create(new UpdateInquirySessionWorker_Factory_Impl(new CreateInquiryWorker_Factory(daggerInquiryComponent$InquiryComponentImpl2.inquiryApiHelperProvider)));
        InstanceFactory create7 = InstanceFactory.create(new ExchangeOneTimeCodeWorker_Factory_Impl(new CreateInquiryWorker_Factory(daggerInquiryComponent$InquiryComponentImpl2.inquiryApiHelperProvider)));
        InstanceFactory create8 = InstanceFactory.create(new SubmitVerificationWorker_Factory_Impl(new PollingWorker_Factory(daggerInquiryComponent$InquiryComponentImpl2.contextProvider, daggerInquiryComponent$InquiryComponentImpl2.governmentServiceProvider, daggerInquiryComponent$InquiryComponentImpl2.dataCollectorProvider, daggerInquiryComponent$InquiryComponentImpl2.fallbackModeManagerProvider, daggerInquiryComponent$InquiryComponentImpl2.imageHelperProvider, daggerInquiryComponent$InquiryComponentImpl2.cameraStatsManagerProvider, daggerInquiryComponent$InquiryComponentImpl2.trackingEventsLoggerProvider)));
        Provider provider = daggerInquiryComponent$InquiryComponentImpl2.openDocumentResultLauncherProvider;
        InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory = daggerInquiryComponent$InquiryComponentImpl2.contextProvider;
        CameraPreview_Factory cameraPreview_Factory = daggerInquiryComponent$InquiryComponentImpl2.provideSdkFilesManagerProvider;
        DocumentCameraWorker_Factory documentCameraWorker_Factory = new DocumentCameraWorker_Factory(provider, inquiryActivityModule_ContextFactory, cameraPreview_Factory, 16);
        InstanceFactory create9 = InstanceFactory.create(new CameraXController_Factory_Impl(new CameraXController_Factory(inquiryActivityModule_ContextFactory, daggerInquiryComponent$InquiryComponentImpl2.cameraStatsManagerProvider, cameraPreview_Factory)));
        InstanceFactory create10 = InstanceFactory.create(new Camera2Controller_Factory_Impl(new RealWebSocket$connect$1(3, InstanceFactory.create(new Camera2ManagerFactory_Factory_Impl(new Camera2ManagerFactory_Factory(daggerInquiryComponent$InquiryComponentImpl2.contextProvider, daggerInquiryComponent$InquiryComponentImpl2.cameraStatsManagerProvider, daggerInquiryComponent$InquiryComponentImpl2.provideSdkFilesManagerProvider, daggerInquiryComponent$InquiryComponentImpl2.cameraChoiceHelperProvider))), daggerInquiryComponent$InquiryComponentImpl2.cameraChoiceHelperProvider)));
        InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory2 = daggerInquiryComponent$InquiryComponentImpl2.contextProvider;
        Provider provider2 = daggerInquiryComponent$InquiryComponentImpl2.navigationStateManagerProvider;
        LocalVideoCaptureRenderer_Factory localVideoCaptureRenderer_Factory = new LocalVideoCaptureRenderer_Factory(inquiryActivityModule_ContextFactory2, create9, create10, provider2, 1);
        Provider provider3 = daggerInquiryComponent$InquiryComponentImpl2.trackingEventsLoggerProvider;
        PaymentIntentFlowResultProcessor_Factory paymentIntentFlowResultProcessor_Factory = new PaymentIntentFlowResultProcessor_Factory(inquiryActivityModule_ContextFactory2, create9, create10, provider2, provider3);
        DocumentCameraWorker_Factory documentCameraWorker_Factory2 = new DocumentCameraWorker_Factory(inquiryActivityModule_ContextFactory2, daggerInquiryComponent$InquiryComponentImpl2.requestPermissionResultLauncherProvider, provider3, 19);
        InstanceFactory create11 = InstanceFactory.create(new DeviceFeatureRequestWorker_Factory_Impl(new DeviceFeatureRequestWorker_Factory(daggerInquiryComponent$InquiryComponentImpl2.resolvableApiLauncherProvider, inquiryActivityModule_ContextFactory2)));
        InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory3 = daggerInquiryComponent$InquiryComponentImpl2.contextProvider;
        LookupAccount_Factory lookupAccount_Factory = new LookupAccount_Factory((Factory) inquiryActivityModule_ContextFactory3, (Factory) documentCameraWorker_Factory2, (Factory) new DeviceFeatureRequestWorkflow_Factory(inquiryActivityModule_ContextFactory3, create11), daggerInquiryComponent$InquiryComponentImpl2.trackingEventsLoggerProvider, 8);
        InstanceFactory create12 = InstanceFactory.create(new GovernmentIdAnalyzeWorker_Factory_Impl(new CameraXController_Factory(inquiryActivityModule_ContextFactory3, daggerInquiryComponent$InquiryComponentImpl2.governmentIdFeedProvider, daggerInquiryComponent$InquiryComponentImpl2.provideSdkFilesManagerProvider)));
        InstanceFactory create13 = InstanceFactory.create(new GovernmentIdHintWorker_Factory_Impl(new DeviceFeatureRequestWorker_Factory(daggerInquiryComponent$InquiryComponentImpl2.contextProvider, daggerInquiryComponent$InquiryComponentImpl2.governmentIdFeedProvider)));
        Logger_Factory logger_Factory = new Logger_Factory(daggerInquiryComponent$InquiryComponentImpl2.webRtcServiceProvider, 24);
        InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory4 = daggerInquiryComponent$InquiryComponentImpl2.contextProvider;
        Provider provider4 = daggerInquiryComponent$InquiryComponentImpl2.navigationStateManagerProvider;
        Provider provider5 = daggerInquiryComponent$InquiryComponentImpl2.trackingEventsLoggerProvider;
        CaptureRenderer_Factory captureRenderer_Factory = new CaptureRenderer_Factory(inquiryActivityModule_ContextFactory4, lookupAccount_Factory, create12, create13, logger_Factory, create9, create10, provider4, provider5);
        Provider provider6 = daggerInquiryComponent$InquiryComponentImpl2.governmentServiceProvider;
        Provider provider7 = daggerInquiryComponent$InquiryComponentImpl2.imageHelperProvider;
        SelfieDirectionFeed_Factory selfieDirectionFeed_Factory = new SelfieDirectionFeed_Factory(provider6, provider7, 24);
        Logger_Factory logger_Factory2 = new Logger_Factory(provider4, 10);
        Provider provider8 = daggerInquiryComponent$InquiryComponentImpl2.imageLoaderProvider;
        CameraModule_CameraStatsManagerFactory cameraModule_CameraStatsManagerFactory = daggerInquiryComponent$InquiryComponentImpl2.cameraStatsManagerProvider;
        GovernmentIdWorkflow_Factory governmentIdWorkflow_Factory = new GovernmentIdWorkflow_Factory(inquiryActivityModule_ContextFactory4, provider8, create8, documentCameraWorker_Factory, localVideoCaptureRenderer_Factory, paymentIntentFlowResultProcessor_Factory, captureRenderer_Factory, selfieDirectionFeed_Factory, logger_Factory2, cameraModule_CameraStatsManagerFactory, provider4, daggerInquiryComponent$InquiryComponentImpl2.externalEventLoggerProvider, provider5, daggerInquiryComponent$InquiryComponentImpl2.inquiryThemeManagerProvider);
        InstanceFactory create14 = InstanceFactory.create(new com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker_Factory_Impl(new HCaptcha(inquiryActivityModule_ContextFactory4, daggerInquiryComponent$InquiryComponentImpl2.selfieServiceProvider, daggerInquiryComponent$InquiryComponentImpl2.dataCollectorProvider, daggerInquiryComponent$InquiryComponentImpl2.fallbackModeManagerProvider, provider7, cameraModule_CameraStatsManagerFactory, provider5, daggerInquiryComponent$InquiryComponentImpl2.uploadServiceProvider)));
        InstanceFactory create15 = InstanceFactory.create(new SelfieAnalyzeWorker_Factory_Impl(new SelfieAnalyzeWorker_Factory(daggerInquiryComponent$InquiryComponentImpl2.selfieDirectionFeedProvider, daggerInquiryComponent$InquiryComponentImpl2.provideSdkFilesManagerProvider)));
        InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory5 = daggerInquiryComponent$InquiryComponentImpl2.contextProvider;
        Provider provider9 = daggerInquiryComponent$InquiryComponentImpl2.navigationStateManagerProvider;
        SelfieWorkflow_Factory selfieWorkflow_Factory = new SelfieWorkflow_Factory(inquiryActivityModule_ContextFactory5, create14, logger_Factory, create15, lookupAccount_Factory, new LocalVideoCaptureRenderer_Factory(inquiryActivityModule_ContextFactory5, create9, create10, provider9, 0), create9, create10, daggerInquiryComponent$InquiryComponentImpl2.cameraStatsManagerProvider, provider9, daggerInquiryComponent$InquiryComponentImpl2.externalEventLoggerProvider, daggerInquiryComponent$InquiryComponentImpl2.trackingEventsLoggerProvider);
        InstanceFactory create16 = InstanceFactory.create(new ScanNfcWorker_Factory_Impl(new C0351ScanNfcWorker_Factory(daggerInquiryComponent$InquiryComponentImpl2.passportNfcReaderLauncherProvider, inquiryActivityModule_ContextFactory5, daggerInquiryComponent$InquiryComponentImpl2.sandboxFlagsProvider, daggerInquiryComponent$InquiryComponentImpl2.provideSdkFilesManagerProvider)));
        InstanceFactory create17 = InstanceFactory.create(new CreateReusablePersonaWorker_Factory_Impl(new CameraXController_Factory(daggerInquiryComponent$InquiryComponentImpl2.uiServiceProvider, daggerInquiryComponent$InquiryComponentImpl2.deviceIdProvider, daggerInquiryComponent$InquiryComponentImpl2.customTabsLauncherProvider)));
        InstanceFactory create18 = InstanceFactory.create(new VerifyReusablePersonaWorker_Factory_Impl(new CameraXController_Factory(daggerInquiryComponent$InquiryComponentImpl2.customTabsLauncherProvider, daggerInquiryComponent$InquiryComponentImpl2.uiServiceProvider, daggerInquiryComponent$InquiryComponentImpl2.moshiProvider)));
        Provider provider10 = daggerInquiryComponent$InquiryComponentImpl2.uiServiceProvider;
        Logger_Factory logger_Factory3 = new Logger_Factory(provider10, 22);
        Logger_Factory logger_Factory4 = new Logger_Factory(provider10, 23);
        Provider provider11 = daggerInquiryComponent$InquiryComponentImpl2.openDocumentsResultLauncherProvider;
        Provider provider12 = daggerInquiryComponent$InquiryComponentImpl2.openDocumentResultLauncherProvider;
        InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory6 = daggerInquiryComponent$InquiryComponentImpl2.contextProvider;
        int i = 0;
        ComponentWorkHelper_Factory componentWorkHelper_Factory = new ComponentWorkHelper_Factory(inquiryActivityModule_ContextFactory6, logger_Factory3, logger_Factory4, new DocumentCameraWorker_Factory(provider11, provider12, inquiryActivityModule_ContextFactory6, 20), i);
        Provider provider13 = daggerInquiryComponent$InquiryComponentImpl2.navigationStateManagerProvider;
        Provider provider14 = daggerInquiryComponent$InquiryComponentImpl2.externalEventLoggerProvider;
        Provider provider15 = daggerInquiryComponent$InquiryComponentImpl2.featureFlagManagerProvider;
        Provider provider16 = daggerInquiryComponent$InquiryComponentImpl2.trackingEventsLoggerProvider;
        UiWorkflow_Factory uiWorkflow_Factory = new UiWorkflow_Factory(inquiryActivityModule_ContextFactory6, create16, create17, create18, provider13, lookupAccount_Factory, componentWorkHelper_Factory, provider14, provider15, provider16);
        Provider provider17 = daggerInquiryComponent$InquiryComponentImpl2.takePictureResultLauncherProvider;
        CameraPreview_Factory cameraPreview_Factory2 = daggerInquiryComponent$InquiryComponentImpl2.provideSdkFilesManagerProvider;
        DocumentCameraWorker_Factory documentCameraWorker_Factory3 = new DocumentCameraWorker_Factory(provider17, inquiryActivityModule_ContextFactory6, cameraPreview_Factory2, 0);
        DocumentsSelectWorker_Factory_Factory documentsSelectWorker_Factory_Factory = new DocumentsSelectWorker_Factory_Factory(provider11, daggerInquiryComponent$InquiryComponentImpl2.selectFromPhotoLibraryLauncherProvider, inquiryActivityModule_ContextFactory6, cameraPreview_Factory2, i);
        Provider provider18 = daggerInquiryComponent$InquiryComponentImpl2.documentServiceProvider;
        InstanceFactory create19 = InstanceFactory.create(new InquiryWorkflowsViewModel_Factory_Impl(new DocumentStepViewModel_Factory(InstanceFactory.create(new InquiryStateManager_Factory_Impl(new InquiryStateManager_Factory(create, create2, create3, create4, create5, create6, create7, governmentIdWorkflow_Factory, selfieWorkflow_Factory, uiWorkflow_Factory, new DocumentWorkflow_Factory(daggerInquiryComponent$InquiryComponentImpl2.imageLoaderProvider, inquiryActivityModule_ContextFactory6, lookupAccount_Factory, documentCameraWorker_Factory3, documentsSelectWorker_Factory_Factory, new Logger_Factory(provider18, 7), new Logger_Factory(provider18, 9), new SelfieDirectionFeed_Factory(provider18, daggerInquiryComponent$InquiryComponentImpl2.fileHelperProvider, 23), new Logger_Factory(provider18, 8), new DocumentCameraWorker_Factory(provider18, daggerInquiryComponent$InquiryComponentImpl2.fallbackModeManagerProvider, daggerInquiryComponent$InquiryComponentImpl2.dataCollectorProvider, 15), provider13, provider14, provider16), new LookupAccount_Factory(daggerInquiryComponent$InquiryComponentImpl2.contextProvider, daggerInquiryComponent$InquiryComponentImpl2.navigationStateManagerProvider, InstanceFactory.create(new IntegrationBrowserWorker_Factory_Impl(new C0349IntegrationBrowserWorker_Factory(inquiryActivityModule_ContextFactory6, daggerInquiryComponent$InquiryComponentImpl2.customTabsLauncherProvider))), daggerInquiryComponent$InquiryComponentImpl2.trackingEventsLoggerProvider, 6), daggerInquiryComponent$InquiryComponentImpl2.externalInquiryControllerProvider, daggerInquiryComponent$InquiryComponentImpl2.navigationStateManagerProvider, daggerInquiryComponent$InquiryComponentImpl2.externalEventLoggerProvider, daggerInquiryComponent$InquiryComponentImpl2.uiStepSavedStateHelperProvider, InstanceFactory.create(new RestoreUiStepStateWorker_Factory_Impl(new CreateInquiryWorker_Factory(daggerInquiryComponent$InquiryComponentImpl2.uiStepSavedStateHelperProvider))), InstanceFactory.create(new FeatureFlagWorker_Factory_Impl(new SelfieAnalyzeWorker_Factory(daggerInquiryComponent$InquiryComponentImpl2.featureFlagManagerProvider, daggerInquiryComponent$InquiryComponentImpl2.featureFlagServiceProvider))), daggerInquiryComponent$InquiryComponentImpl2.featureFlagManagerProvider, daggerInquiryComponent$InquiryComponentImpl2.trackingEventsLoggerProvider, daggerInquiryComponent$InquiryComponentImpl2.trackingMetadataProvider, daggerInquiryComponent$InquiryComponentImpl2.silentNetworkAuthenticationManagerProvider))))));
        InstanceFactory create20 = InstanceFactory.create(new WorkflowStateViewModel_Factory_Impl());
        this.inquiryComponent = daggerInquiryComponent$InquiryComponentImpl2;
        this.viewModelFactory = (InquiryWorkflowsViewModel_Factory_Impl) create19.instance;
        this.workflowStateViewModelFactory = (WorkflowStateViewModel_Factory_Impl) create20.instance;
        this.inquiryStateRenderer = new TextSetter((SandboxFlags) daggerInquiryComponent$InquiryComponentImpl2.sandboxFlagsProvider.get());
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.pi2_fragment_workflow, viewGroup, false);
        int i = R.id.floating_action_button;
        FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(inflate, R.id.floating_action_button);
        if (floatingActionButton != null) {
            i = R.id.fragment_container_view;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(inflate, R.id.fragment_container_view);
            if (fragmentContainerView != null) {
                i = R.id.permissions_request_container_view;
                if (((FragmentContainerView) ViewBindings.findChildViewById(inflate, R.id.permissions_request_container_view)) != null) {
                    FrameLayout frameLayout = (FrameLayout) inflate;
                    this._binding = new Pi2FragmentWorkflowBinding(frameLayout, floatingActionButton, fragmentContainerView);
                    frameLayout.getClass();
                    return frameLayout;
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ViewBinding viewBinding = this._binding;
        viewBinding.getClass();
        int i = 0;
        ((Pi2FragmentWorkflowBinding) viewBinding).fragmentContainerView.setVisibility(0);
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = this.inquiryComponent;
        Continuation continuation = null;
        if (daggerInquiryComponent$InquiryComponentImpl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("inquiryComponent");
            throw null;
        }
        PermissionsHelper permissionsHelper = (PermissionsHelper) daggerInquiryComponent$InquiryComponentImpl.permissionsHelperProvider.get();
        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        ViewBinding viewBinding2 = this._binding;
        viewBinding2.getClass();
        int id = ((Pi2FragmentWorkflowBinding) viewBinding2).fragmentContainerView.getId();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        permissionsHelper.getClass();
        permissionsHelper.fragmentManager = childFragmentManager;
        permissionsHelper.viewId = Integer.valueOf(id);
        childFragmentManager.setFragmentResultListener("pi2_permission_request_request", viewLifecycleOwner, new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(28));
        viewLifecycleOwner.getLifecycle().addObserver(new CameraPreview$rebind$1$1$1(permissionsHelper, 5));
        InquiryWorkflowsViewModel inquiryWorkflowsViewModel = (InquiryWorkflowsViewModel) this.viewModel$delegate.getValue();
        InquiryWorkflow$Props inquiryWorkflow$Props = ((WorkflowFragmentArgs) this.args$delegate.getValue()).inquiryWorkflowProps;
        inquiryWorkflow$Props.getClass();
        InquiryStateManager inquiryStateManager = inquiryWorkflowsViewModel.inquiryStateManager;
        if (inquiryStateManager == null) {
            InquiryStateManager_Factory_Impl inquiryStateManager_Factory_Impl = inquiryWorkflowsViewModel.inquiryStateManagerFactory;
            SavedStateHandle savedStateHandle = inquiryWorkflowsViewModel.savedStateHandle;
            InquiryStateManager_Factory inquiryStateManager_Factory = inquiryStateManager_Factory_Impl.delegateFactory;
            InquiryStateManager inquiryStateManager2 = new InquiryStateManager(inquiryWorkflow$Props, savedStateHandle, (CreateInquiryWorker_Factory_Impl) inquiryStateManager_Factory.createInquiryWorkerProvider.instance, (CreateInquirySessionWorker_Factory_Impl) inquiryStateManager_Factory.inquirySessionWorkerProvider.instance, (PollingWorker_Factory_Impl) inquiryStateManager_Factory.pollingWorkerProvider.instance, (TransitionBackWorker_Factory_Impl) inquiryStateManager_Factory.transitionBackWorkerProvider.instance, (TransitionWorker_Factory_Impl) inquiryStateManager_Factory.transitionWorkerFactoryProvider.instance, (UpdateInquirySessionWorker_Factory_Impl) inquiryStateManager_Factory.updateInquirySessionWorkerFactoryProvider.instance, (ExchangeOneTimeCodeWorker_Factory_Impl) inquiryStateManager_Factory.exchangeOneTimeCodeWorkerFactoryProvider.instance, (GovernmentIdWorkflow) inquiryStateManager_Factory.governmentIdWorkflowProvider.get(), (SelfieWorkflow) inquiryStateManager_Factory.selfieWorkflowProvider.get(), (UiWorkflow) inquiryStateManager_Factory.uiWorkflowProvider.get(), (DocumentWorkflow) inquiryStateManager_Factory.documentWorkflowProvider.get(), (IntegrationWorkflow) inquiryStateManager_Factory.integrationWorkflowProvider.get(), (InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1) inquiryStateManager_Factory.externalInquiryControllerProvider.get(), (NavigationStateManager) inquiryStateManager_Factory.navigationStateManagerProvider.get(), (ExternalEventLogger) inquiryStateManager_Factory.externalEventLoggerProvider.get(), (UiStepSavedStateHelper) inquiryStateManager_Factory.uiStepSavedStateHelperProvider.get(), (RestoreUiStepStateWorker_Factory_Impl) inquiryStateManager_Factory.restoreUiStepStateWorkerFactoryProvider.instance, (FeatureFlagWorker_Factory_Impl) inquiryStateManager_Factory.featureFlagWorkerFactoryProvider.instance, (FeatureFlagManager) inquiryStateManager_Factory.featureFlagManagerProvider.get(), (TrackingEventsLogger) inquiryStateManager_Factory.trackingEventsLoggerProvider.get(), (TrackingMetadataProvider) inquiryStateManager_Factory.trackingMetadataProvider.get(), (SilentNetworkAuthenticationManager) inquiryStateManager_Factory.silentNetworkAuthenticationManagerProvider.get());
            inquiryWorkflowsViewModel.inquiryStateManager = inquiryStateManager2;
            inquiryStateManager = inquiryStateManager2;
        }
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        JobKt.launch$default(ViewModelKt.getCoroutineScope(viewLifecycleOwner2.getLifecycle()), null, null, new InquiryWorkflowFragment$onViewCreated$1(inquiryStateManager, this, continuation, i), 3);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        JobKt.launch$default(ViewModelKt.getCoroutineScope(viewLifecycleOwner3.getLifecycle()), null, null, new InquiryWorkflowFragment$onViewCreated$1(inquiryStateManager, this, continuation, 1), 3);
    }
}
