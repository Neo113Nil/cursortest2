package com.stripe.android.financialconnections.domain;

import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.payments.SetupIntentFlowResultProcessor_Factory;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.camera.CameraModule_CameraStatsManagerFactory;
import com.withpersona.sdk2.camera.SelfieDirectionFeed_Factory;
import com.withpersona.sdk2.inquiry.device.DeviceModule_AppSetIdHelperFactory;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class SaveAccountToLink_Factory implements Factory {
    public final /* synthetic */ int $r8$classId = 1;
    public final Provider accountsRepositoryProvider;
    public final Provider attachedPaymentAccountRepositoryProvider;
    public final Provider configurationProvider;
    public final Factory isNetworkingRelinkSessionProvider;
    public final Provider localeProvider;
    public final Provider repositoryProvider;
    public final Provider successContentRepositoryProvider;

    public SaveAccountToLink_Factory(Provider provider, SelfieDirectionFeed_Factory selfieDirectionFeed_Factory, DeviceModule_AppSetIdHelperFactory deviceModule_AppSetIdHelperFactory, LookupAccount_Factory lookupAccount_Factory, Provider provider2, Provider provider3, SetupIntentFlowResultProcessor_Factory setupIntentFlowResultProcessor_Factory) {
        this.localeProvider = provider;
        this.isNetworkingRelinkSessionProvider = selfieDirectionFeed_Factory;
        this.configurationProvider = deviceModule_AppSetIdHelperFactory;
        this.attachedPaymentAccountRepositoryProvider = lookupAccount_Factory;
        this.successContentRepositoryProvider = provider2;
        this.repositoryProvider = provider3;
        this.accountsRepositoryProvider = setupIntentFlowResultProcessor_Factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.accountsRepositoryProvider;
        Provider provider2 = this.repositoryProvider;
        Provider provider3 = this.successContentRepositoryProvider;
        Provider provider4 = this.attachedPaymentAccountRepositoryProvider;
        Provider provider5 = this.configurationProvider;
        Factory factory = this.isNetworkingRelinkSessionProvider;
        Provider provider6 = this.localeProvider;
        switch (i) {
            case 0:
                return new SaveAccountToLink((Locale) provider6.get(), (FinancialConnectionsSheetConfiguration) provider5.get(), (AttachedPaymentAccountRepository) provider4.get(), (SuccessContentRepository) provider3.get(), (FinancialConnectionsManifestRepositoryImpl) provider2.get(), (FinancialConnectionsAccountsRepositoryImpl) provider.get(), (RealIsNetworkingRelinkSession) ((CameraModule_CameraStatsManagerFactory) factory).get());
            default:
                FinancialConnectionsConsumerSessionRepositoryImpl financialConnectionsConsumerSessionRepositoryImpl = (FinancialConnectionsConsumerSessionRepositoryImpl) provider6.get();
                RealAttachConsumerToLinkAccountSession realAttachConsumerToLinkAccountSession = (RealAttachConsumerToLinkAccountSession) ((SelfieDirectionFeed_Factory) factory).get();
                RequestIntegrityToken requestIntegrityToken = (RequestIntegrityToken) provider5.get();
                GetOrFetchSync getOrFetchSync = (GetOrFetchSync) provider4.get();
                NavigationManagerImpl navigationManagerImpl = (NavigationManagerImpl) provider3.get();
                String str = (String) provider2.get();
                RealHandleError realHandleError = (RealHandleError) provider.get();
                financialConnectionsConsumerSessionRepositoryImpl.getClass();
                realAttachConsumerToLinkAccountSession.getClass();
                requestIntegrityToken.getClass();
                getOrFetchSync.getClass();
                navigationManagerImpl.getClass();
                str.getClass();
                realHandleError.getClass();
                SubtreeManager subtreeManager = new SubtreeManager();
                subtreeManager.snapshotCache = financialConnectionsConsumerSessionRepositoryImpl;
                subtreeManager.contextForChildren = realAttachConsumerToLinkAccountSession;
                subtreeManager.emitActionToParent = requestIntegrityToken;
                subtreeManager.workflowSession = getOrFetchSync;
                subtreeManager.interceptor = navigationManagerImpl;
                subtreeManager.idCounter = str;
                subtreeManager.children = realHandleError;
                return subtreeManager;
        }
    }

    public SaveAccountToLink_Factory(Provider provider, InstanceFactory instanceFactory, Provider provider2, Provider provider3, Provider provider4, Provider provider5, CameraModule_CameraStatsManagerFactory cameraModule_CameraStatsManagerFactory) {
        this.localeProvider = provider;
        this.configurationProvider = instanceFactory;
        this.attachedPaymentAccountRepositoryProvider = provider2;
        this.successContentRepositoryProvider = provider3;
        this.repositoryProvider = provider4;
        this.accountsRepositoryProvider = provider5;
        this.isNetworkingRelinkSessionProvider = cameraModule_CameraStatsManagerFactory;
    }
}
