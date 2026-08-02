package com.withpersona.sdk2.inquiry.ui;

import android.content.Context;
import androidx.media3.common.util.StuckPlayerDetector;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.stripe.android.financialconnections.domain.RealCurrentLinkBrand;
import com.stripe.android.financialconnections.domain.RequestIntegrityToken;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.domain.SaveAccountToLink_Factory;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.device.DeviceModule_AppSetIdHelperFactory;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.shared.external_inquiry_controller.ExternalEventLogger;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes9.dex */
public final class UiWorkflow_Factory implements Factory {
    public final /* synthetic */ int $r8$classId = 0;
    public final Provider applicationContextProvider;
    public final Provider componentWorkHelperProvider;
    public final Provider createReusablePersonaWorkerFactoryProvider;
    public final Provider externalEventLoggerProvider;
    public final Provider featureFlagManagerProvider;
    public final Provider navigationStateManagerProvider;
    public final Provider nfcScanWorkerFactoryProvider;
    public final Provider permissionRequestWorkflowProvider;
    public final Provider trackingEventsLoggerProvider;
    public final Provider verifyReusablePersonaWorkerFactoryProvider;

    public UiWorkflow_Factory(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, Provider provider, LookupAccount_Factory lookupAccount_Factory, ComponentWorkHelper_Factory componentWorkHelper_Factory, Provider provider2, Provider provider3, Provider provider4) {
        this.applicationContextProvider = inquiryActivityModule_ContextFactory;
        this.nfcScanWorkerFactoryProvider = instanceFactory;
        this.createReusablePersonaWorkerFactoryProvider = instanceFactory2;
        this.verifyReusablePersonaWorkerFactoryProvider = instanceFactory3;
        this.navigationStateManagerProvider = provider;
        this.permissionRequestWorkflowProvider = lookupAccount_Factory;
        this.componentWorkHelperProvider = componentWorkHelper_Factory;
        this.externalEventLoggerProvider = provider2;
        this.featureFlagManagerProvider = provider3;
        this.trackingEventsLoggerProvider = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.componentWorkHelperProvider;
        Provider provider2 = this.permissionRequestWorkflowProvider;
        Provider provider3 = this.verifyReusablePersonaWorkerFactoryProvider;
        Provider provider4 = this.createReusablePersonaWorkerFactoryProvider;
        Provider provider5 = this.nfcScanWorkerFactoryProvider;
        Provider provider6 = this.trackingEventsLoggerProvider;
        Provider provider7 = this.featureFlagManagerProvider;
        Provider provider8 = this.externalEventLoggerProvider;
        Provider provider9 = this.navigationStateManagerProvider;
        Provider provider10 = this.applicationContextProvider;
        switch (i) {
            case 0:
                return new UiWorkflow((Context) provider10.get(), (ScanNfcWorker.Factory) ((InstanceFactory) provider5).instance, (CreateReusablePersonaWorker_Factory_Impl) ((InstanceFactory) provider4).instance, (VerifyReusablePersonaWorker_Factory_Impl) ((InstanceFactory) provider3).instance, (NavigationStateManager) provider9.get(), (PermissionRequestWorkflow) ((LookupAccount_Factory) provider2).get(), (ComponentWorkHelper) ((ComponentWorkHelper_Factory) provider).get(), (ExternalEventLogger) provider8.get(), (FeatureFlagManager) provider7.get(), (TrackingEventsLogger) provider6.get());
            default:
                return new StuckPlayerDetector((FinancialConnectionsConsumerSessionRepositoryImpl) provider10.get(), (GetOrFetchSync) provider9.get(), (GetCachedAccounts) provider8.get(), (RequestIntegrityToken) provider7.get(), (SaveAccountToLink) provider6.get(), (FinancialConnectionsAnalyticsTrackerImpl) provider5.get(), (NavigationManagerImpl) provider4.get(), (RealCurrentLinkBrand) provider3.get(), (String) provider2.get(), (Logger$Companion$NOOP_LOGGER$1) provider.get());
        }
    }

    public UiWorkflow_Factory(Provider provider, LookupAccount_Factory lookupAccount_Factory, SelfieDirectionFeed_Factory selfieDirectionFeed_Factory, DeviceModule_AppSetIdHelperFactory deviceModule_AppSetIdHelperFactory, SaveAccountToLink_Factory saveAccountToLink_Factory, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.applicationContextProvider = provider;
        this.navigationStateManagerProvider = lookupAccount_Factory;
        this.externalEventLoggerProvider = selfieDirectionFeed_Factory;
        this.featureFlagManagerProvider = deviceModule_AppSetIdHelperFactory;
        this.trackingEventsLoggerProvider = saveAccountToLink_Factory;
        this.nfcScanWorkerFactoryProvider = provider2;
        this.createReusablePersonaWorkerFactoryProvider = provider3;
        this.verifyReusablePersonaWorkerFactoryProvider = provider4;
        this.permissionRequestWorkflowProvider = provider5;
        this.componentWorkHelperProvider = provider6;
    }
}
