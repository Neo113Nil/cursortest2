package com.withpersona.sdk2.inquiry.document;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.squareup.moshi.Moshi;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.CancelAuthorizationSession;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.domain.RealCurrentLinkBrand;
import com.stripe.android.financialconnections.domain.RealIsLinkWithStripe;
import com.stripe.android.financialconnections.features.notice.RealPresentSheet;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.repository.AccountUpdateRequiredContentRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.NoticeSheetContentRepository;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.repository.api.FinancialConnectionsConsumersApiServiceImpl;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.financialconnections.repository.api.RealProvideApiRequestOptions;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.inquiry.document.network.DocumentService;
import com.withpersona.sdk2.inquiry.fallbackmode.FallbackModeManager;
import com.withpersona.sdk2.inquiry.governmentid.DocumentSelectWorker;
import com.withpersona.sdk2.inquiry.internal.ErrorReportingManager;
import com.withpersona.sdk2.inquiry.internal.InquiryActivityModule_ContextFactory;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper;
import com.withpersona.sdk2.inquiry.internal.integrity.RealStandardIntegrityManagerFactory;
import com.withpersona.sdk2.inquiry.internal.network.InquiryService;
import com.withpersona.sdk2.inquiry.logger.Logger;
import com.withpersona.sdk2.inquiry.logger.SubsystemLogger;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags_Factory;
import com.withpersona.sdk2.inquiry.shared.data_collection.DataCollector;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import io.noties.markwon.MarkwonImpl;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes8.dex */
public final class DocumentCameraWorker_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider contextProvider;
    public final Provider pictureLauncherProvider;
    public final Provider sdkFilesManagerProvider;

    public DocumentCameraWorker_Factory(InquiryActivityModule_ContextFactory inquiryActivityModule_ContextFactory, InstanceFactory instanceFactory, Provider provider, SandboxFlags_Factory sandboxFlags_Factory) {
        this.$r8$classId = 18;
        this.pictureLauncherProvider = inquiryActivityModule_ContextFactory;
        this.contextProvider = instanceFactory;
        this.sdkFilesManagerProvider = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.sdkFilesManagerProvider;
        Provider provider2 = this.contextProvider;
        Provider provider3 = this.pictureLauncherProvider;
        switch (i) {
            case 0:
                return new DocumentCameraWorker((ActivityResultLauncher) provider3.get(), (Context) provider2.get(), (SdkFilesManager) provider.get());
            case 1:
                return new DefaultFinancialConnectionsEventReporter((DefaultAnalyticsRequestExecutor) provider3.get(), (AnalyticsRequestFactory) provider2.get(), (CoroutineContext) provider.get());
            case 2:
                FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = (FinancialConnectionsRequestExecutor) provider3.get();
                ApiRequest.Options options = (ApiRequest.Options) provider2.get();
                ApiRequest.Factory factory = (ApiRequest.Factory) provider.get();
                financialConnectionsRequestExecutor.getClass();
                options.getClass();
                factory.getClass();
                return new FinancialConnectionsConsumersApiServiceImpl(financialConnectionsRequestExecutor, options, factory);
            case 3:
                FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor2 = (FinancialConnectionsRequestExecutor) provider3.get();
                ProvideApiRequestOptions provideApiRequestOptions = (ProvideApiRequestOptions) provider2.get();
                ApiRequest.Factory factory2 = (ApiRequest.Factory) provider.get();
                financialConnectionsRequestExecutor2.getClass();
                provideApiRequestOptions.getClass();
                factory2.getClass();
                return new FinancialConnectionsInstitutionsRepositoryImpl(financialConnectionsRequestExecutor2, provideApiRequestOptions, factory2);
            case 4:
                return new CancelAuthorizationSession((NativeAuthFlowCoordinator) provider3.get(), (FinancialConnectionsManifestRepositoryImpl) provider2.get(), (FinancialConnectionsSheetConfiguration) provider.get(), 0);
            case 5:
                return new CancelAuthorizationSession((NativeAuthFlowCoordinator) provider3.get(), (FinancialConnectionsManifestRepositoryImpl) provider2.get(), (FinancialConnectionsSheetConfiguration) provider.get(), 1);
            case 6:
                return new TextSetter((FinancialConnectionsManifestRepositoryImpl) provider3.get(), (Logger$Companion$NOOP_LOGGER$1) provider2.get(), (FinancialConnectionsSheetConfiguration) provider.get());
            case 7:
                return new PostAuthorizationSession((FinancialConnectionsManifestRepositoryImpl) provider3.get(), (FinancialConnectionsSheetConfiguration) provider2.get(), (String) provider.get());
            case 8:
                return new RealCurrentLinkBrand((FinancialConnectionsSheetNativeState) provider3.get(), (FinancialConnectionsManifestRepositoryImpl) provider2.get(), (RealConsumerSessionRepository) provider.get());
            case 9:
                return new TextSetter((FinancialConnectionsManifestRepositoryImpl) provider3.get(), (FinancialConnectionsSheetConfiguration) provider2.get(), (String) provider.get());
            case 10:
                return new CancelAuthorizationSession((NativeAuthFlowCoordinator) provider3.get(), (FinancialConnectionsManifestRepositoryImpl) provider2.get(), (FinancialConnectionsSheetConfiguration) provider.get(), 2);
            case 11:
                return new TextSetter((FinancialConnectionsSheetConfiguration) provider3.get(), (SuccessContentRepository) provider2.get(), (FinancialConnectionsAccountsRepositoryImpl) provider.get());
            case 12:
                return new RealPresentSheet((NavigationManagerImpl) provider3.get(), (NoticeSheetContentRepository) provider2.get(), (AccountUpdateRequiredContentRepository) provider.get());
            case 13:
                return new RealProvideApiRequestOptions((RealConsumerSessionRepository) provider3.get(), (RealIsLinkWithStripe) provider2.get(), (ApiRequest.Options) provider.get());
            case 14:
                return new HandleClickableUrl((UriUtils) provider3.get(), (FinancialConnectionsAnalyticsTrackerImpl) provider2.get(), (Logger$Companion$NOOP_LOGGER$1) provider.get());
            case 15:
                return new TextSetter((DocumentService) provider3.get(), (FallbackModeManager) provider2.get(), (DataCollector) provider.get());
            case 16:
                return new DocumentSelectWorker((ActivityResultLauncher) provider3.get(), (Context) provider2.get(), (SdkFilesManager) provider.get());
            case 17:
                return new ErrorReportingManager((InquiryService) provider3.get(), (Moshi) provider2.get(), (Logger) provider.get());
            case 18:
                Context context = (Context) provider3.get();
                SubsystemLogger.Factory factory3 = (SubsystemLogger.Factory) provider2.get();
                RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory = (RealStandardIntegrityManagerFactory) provider.get();
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                Preconditions.checkNotNullFromProvides(defaultScheduler);
                return new PlayIntegrityHelper(context, factory3, realStandardIntegrityManagerFactory, defaultScheduler);
            case 19:
                return new MarkwonImpl((Context) provider3.get(), (ActivityResultLauncher) provider2.get(), (TrackingEventsLogger) provider.get());
            default:
                return new MarkwonImpl((ActivityResultLauncher) provider3.get(), (ActivityResultLauncher) provider2.get(), (Context) provider.get());
        }
    }

    public /* synthetic */ DocumentCameraWorker_Factory(Provider provider, Provider provider2, Provider provider3, int i) {
        this.$r8$classId = i;
        this.pictureLauncherProvider = provider;
        this.contextProvider = provider2;
        this.sdkFilesManagerProvider = provider3;
    }
}
