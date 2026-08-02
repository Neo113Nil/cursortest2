package com.withpersona.sdk2.camera;

import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.kotterknife.Lazy;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.MarkLinkVerified;
import com.stripe.android.financialconnections.domain.RealAttachConsumerToLinkAccountSession;
import com.stripe.android.financialconnections.domain.SelectAccounts;
import com.stripe.android.financialconnections.domain.SelectInstitution;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.googlepaylauncher.DefaultPaymentsClientFactory;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Config;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.repository.ConsumersApiServiceImpl;
import com.withpersona.sdk2.inquiry.document.network.DocumentService;
import com.withpersona.sdk2.inquiry.featureflag.FeatureFlagManager;
import com.withpersona.sdk2.inquiry.governmentid.network.AutoClassifyWorker;
import com.withpersona.sdk2.inquiry.governmentid.network.GovernmentIdService;
import com.withpersona.sdk2.inquiry.internal.InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.shared.RealFileHelper;
import com.withpersona.sdk2.inquiry.shared.image.RealImageHelper;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationStateManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.serialization.json.Json;
import net.idrnd.face.iad.capture.internal.y0;
import net.oneformapp.helper.matching.POPMatchingFactory;
import okhttp3.FormBody;

/* loaded from: classes8.dex */
public final class SelfieDirectionFeed_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider resultFlowProvider;
    public final Provider selfieProcessorProvider;

    public SelfieDirectionFeed_Factory(y0 y0Var, Provider provider, Provider provider2) {
        this.$r8$classId = 1;
        this.selfieProcessorProvider = provider;
        this.resultFlowProvider = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.resultFlowProvider;
        Provider provider2 = this.selfieProcessorProvider;
        switch (i) {
            case 0:
                return new SelfieDirectionFeed((SelfieProcessor) provider2.get(), (MutableSharedFlow) provider.get());
            case 1:
                Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = (Logger$Companion$NOOP_LOGGER$1) provider2.get();
                CoroutineContext coroutineContext = (CoroutineContext) provider.get();
                logger$Companion$NOOP_LOGGER$1.getClass();
                coroutineContext.getClass();
                return new DefaultStripeNetworkClient(coroutineContext, logger$Companion$NOOP_LOGGER$1, 14);
            case 2:
                return new ApiRequest.Options((Function0) provider2.get(), (Function0) provider.get());
            case 3:
                return new DefaultAnalyticsRequestExecutor((Logger$Companion$NOOP_LOGGER$1) provider2.get(), (CoroutineContext) provider.get());
            case 4:
                Json json = (Json) provider2.get();
                Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$12 = (Logger$Companion$NOOP_LOGGER$1) provider.get();
                json.getClass();
                logger$Companion$NOOP_LOGGER$12.getClass();
                ToolbarTuckTargets toolbarTuckTargets = new ToolbarTuckTargets();
                toolbarTuckTargets.startCornerCenterX$delegate = json;
                toolbarTuckTargets.endCornerCenterX$delegate = logger$Companion$NOOP_LOGGER$12;
                return toolbarTuckTargets;
            case 5:
                ApiVersion apiVersion = (ApiVersion) provider2.get();
                DefaultStripeNetworkClient defaultStripeNetworkClient = (DefaultStripeNetworkClient) provider.get();
                apiVersion.getClass();
                defaultStripeNetworkClient.getClass();
                return new ConsumersApiServiceImpl(defaultStripeNetworkClient, apiVersion.getCode());
            case 6:
                String str = (String) provider2.get();
                String str2 = (String) provider.get();
                str.getClass();
                return new ApiRequest.Options(str, str2, 4);
            case 7:
                return new AcceptConsent((FinancialConnectionsSheetConfiguration) provider.get(), (FinancialConnectionsManifestRepositoryImpl) provider2.get());
            case 8:
                FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = (FinancialConnectionsSheetConfiguration) provider2.get();
                FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl = (FinancialConnectionsManifestRepositoryImpl) provider.get();
                financialConnectionsSheetConfiguration.getClass();
                financialConnectionsManifestRepositoryImpl.getClass();
                ToolbarTuckTargets toolbarTuckTargets2 = new ToolbarTuckTargets();
                toolbarTuckTargets2.startCornerCenterX$delegate = financialConnectionsSheetConfiguration;
                toolbarTuckTargets2.endCornerCenterX$delegate = financialConnectionsManifestRepositoryImpl;
                return toolbarTuckTargets2;
            case 9:
                FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl = (FinancialConnectionsAccountsRepositoryImpl) provider2.get();
                FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration2 = (FinancialConnectionsSheetConfiguration) provider.get();
                financialConnectionsAccountsRepositoryImpl.getClass();
                financialConnectionsSheetConfiguration2.getClass();
                ToolbarTuckTargets toolbarTuckTargets3 = new ToolbarTuckTargets();
                toolbarTuckTargets3.startCornerCenterX$delegate = financialConnectionsAccountsRepositoryImpl;
                toolbarTuckTargets3.endCornerCenterX$delegate = financialConnectionsSheetConfiguration2;
                return toolbarTuckTargets3;
            case 10:
                return new GetCachedAccounts((FinancialConnectionsAccountsRepositoryImpl) provider2.get(), (FinancialConnectionsSheetConfiguration) provider.get());
            case 11:
                return new Lazy((FinancialConnectionsSheetConfiguration) provider.get(), (FinancialConnectionsManifestRepositoryImpl) provider2.get());
            case 12:
                return new MarkLinkVerified((FinancialConnectionsSheetConfiguration) provider2.get(), (FinancialConnectionsManifestRepositoryImpl) provider.get());
            case 13:
                return new SelectAccounts((FinancialConnectionsAccountsRepositoryImpl) provider2.get(), (FinancialConnectionsSheetConfiguration) provider.get(), 1);
            case 14:
                FinancialConnectionsRepositoryImpl financialConnectionsRepositoryImpl = (FinancialConnectionsRepositoryImpl) provider2.get();
                FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration3 = (FinancialConnectionsSheetConfiguration) provider.get();
                financialConnectionsRepositoryImpl.getClass();
                financialConnectionsSheetConfiguration3.getClass();
                ToolbarTuckTargets toolbarTuckTargets4 = new ToolbarTuckTargets();
                toolbarTuckTargets4.startCornerCenterX$delegate = financialConnectionsRepositoryImpl;
                toolbarTuckTargets4.endCornerCenterX$delegate = financialConnectionsSheetConfiguration3;
                return toolbarTuckTargets4;
            case 15:
                return new RealAttachConsumerToLinkAccountSession((FinancialConnectionsSheetConfiguration) provider2.get(), (FinancialConnectionsConsumerSessionRepositoryImpl) provider.get());
            case 16:
                return new SelectAccounts((FinancialConnectionsAccountsRepositoryImpl) provider2.get(), (FinancialConnectionsSheetConfiguration) provider.get(), 0);
            case 17:
                return new SelectInstitution((FinancialConnectionsSheetConfiguration) provider.get(), (FinancialConnectionsManifestRepositoryImpl) provider2.get());
            case 18:
                return new AttachedPaymentAccountRepository((SavedStateHandle) provider2.get(), (Logger$Companion$NOOP_LOGGER$1) provider.get());
            case 19:
                return new CoreAuthorizationPendingNetworkingRepairRepository((SavedStateHandle) provider2.get(), (Logger$Companion$NOOP_LOGGER$1) provider.get());
            case 20:
                return new UriUtils((Logger$Companion$NOOP_LOGGER$1) provider2.get(), (FinancialConnectionsAnalyticsTrackerImpl) provider.get());
            case 21:
                GooglePayPaymentMethodLauncher$Config googlePayPaymentMethodLauncher$Config = (GooglePayPaymentMethodLauncher$Config) provider2.get();
                DefaultPaymentsClientFactory defaultPaymentsClientFactory = (DefaultPaymentsClientFactory) provider.get();
                googlePayPaymentMethodLauncher$Config.getClass();
                defaultPaymentsClientFactory.getClass();
                return defaultPaymentsClientFactory.create(googlePayPaymentMethodLauncher$Config.environment);
            case 22:
                return new RealErrorReporter((DefaultAnalyticsRequestExecutor) provider2.get(), (AnalyticsRequestFactory) provider.get());
            case 23:
                DocumentService documentService = (DocumentService) provider2.get();
                RealFileHelper realFileHelper = (RealFileHelper) provider.get();
                documentService.getClass();
                realFileHelper.getClass();
                FormBody.Builder builder = new FormBody.Builder();
                builder.names = documentService;
                builder.values = realFileHelper;
                return builder;
            case 24:
                return new AutoClassifyWorker.Factory((GovernmentIdService) provider2.get(), (RealImageHelper) provider.get());
            case 25:
                return new TextSetter((Context) provider2.get(), new POPMatchingFactory(20), (InquiryService) provider.get());
            default:
                return new NavigationStateManager((InquiryFragment$createInquiryComponentIfNeeded$externalInquiryController$1) provider2.get(), (FeatureFlagManager) provider.get());
        }
    }

    public /* synthetic */ SelfieDirectionFeed_Factory(Provider provider, Provider provider2, int i) {
        this.$r8$classId = i;
        this.selfieProcessorProvider = provider;
        this.resultFlowProvider = provider2;
    }
}
