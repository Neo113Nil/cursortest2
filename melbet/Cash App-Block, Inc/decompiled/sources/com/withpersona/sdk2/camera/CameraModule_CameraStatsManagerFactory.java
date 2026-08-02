package com.withpersona.sdk2.camera;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.fillr.core.utilities.AppPreferenceStore;
import com.google.android.instantapps.InstantApps;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.Logger$Companion;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataRepository;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.utils.RealIsWorkManagerAvailable;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.FeaturedInstitutions;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.RealIsNetworkingRelinkSession;
import com.stripe.android.financialconnections.domain.SearchInstitutions;
import com.stripe.android.financialconnections.domain.StartVerification;
import com.stripe.android.financialconnections.domain.UpdateCachedAccounts;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.repository.AccountUpdateRequiredContentRepository;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsErrorRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.financialconnections.repository.NoticeSheetContentRepository;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.core.authentication.NoOpIntentNextActionHandler;
import com.stripe.android.payments.core.authentication.PaymentNextActionHandler;
import com.stripe.android.payments.core.authentication.UnsupportedNextActionHandler;
import com.stripe.attestation.RealStandardIntegrityManagerFactory;
import com.withpersona.sdk2.camera.stats.RealCameraStatsManager;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import net.idrnd.face.iad.capture.internal.o0;
import net.idrnd.misnap.iad.Payload;

/* loaded from: classes8.dex */
public final class CameraModule_CameraStatsManagerFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider realCameraStatsManagerProvider;

    public /* synthetic */ CameraModule_CameraStatsManagerFactory(Provider provider, int i) {
        this.$r8$classId = i;
        this.realCameraStatsManagerProvider = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object failure;
        int i = this.$r8$classId;
        Continuation continuation = null;
        Provider provider = this.realCameraStatsManagerProvider;
        switch (i) {
            case 0:
                Lazy lazy = DoubleCheck.lazy(provider);
                lazy.getClass();
                Object obj = lazy.get();
                obj.getClass();
                return (RealCameraStatsManager) obj;
            case 1:
                return new RealStandardIntegrityManagerFactory((Application) provider.get(), 1);
            case 2:
                return new AppPreferenceStore((Application) provider.get());
            case 3:
                Application application = (Application) provider.get();
                application.getClass();
                String packageName = application.getPackageName();
                packageName.getClass();
                return packageName;
            case 4:
                FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = (FinancialConnectionsSheetConfiguration) provider.get();
                financialConnectionsSheetConfiguration.getClass();
                return financialConnectionsSheetConfiguration.stripeAccountId;
            case 5:
                final ApiRequest.Options options = (ApiRequest.Options) provider.get();
                options.getClass();
                return new ProvideApiRequestOptions() { // from class: com.stripe.android.financialconnections.di.FinancialConnectionsSheetModule$$ExternalSyntheticLambda0
                    @Override // com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions
                    public final ApiRequest.Options invoke(boolean z) {
                        return ApiRequest.Options.this;
                    }
                };
            case 6:
                FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) provider.get();
                financialConnectionsSheetNativeState.getClass();
                return financialConnectionsSheetNativeState.elementsSessionContext;
            case 7:
                FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState2 = (FinancialConnectionsSheetNativeState) provider.get();
                financialConnectionsSheetNativeState2.getClass();
                ElementsSessionContext elementsSessionContext = financialConnectionsSheetNativeState2.elementsSessionContext;
                if (elementsSessionContext != null) {
                    return elementsSessionContext.prefillDetails;
                }
                return null;
            case 8:
                Application application2 = (Application) provider.get();
                application2.getClass();
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                return new DefaultFraudDetectionDataRepository(new AndroidFileSaver(1, application2, defaultIoScheduler), new o0((Context) application2, 5), new DefaultStripeNetworkClient(defaultIoScheduler, null, 30), new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(24), defaultIoScheduler, new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(25));
            case 9:
                return ((Boolean) provider.get()).booleanValue() ? Logger$Companion.REAL_LOGGER : Logger$Companion.NOOP_LOGGER;
            case 10:
                ApiVersion apiVersion = (ApiVersion) provider.get();
                apiVersion.getClass();
                return new ApiRequest.Factory(apiVersion.getCode());
            case 11:
                GetOrFetchSync getOrFetchSync = (GetOrFetchSync) provider.get();
                getOrFetchSync.getClass();
                return new RealIsWorkManagerAvailable(new Scene.AnonymousClass1(getOrFetchSync, continuation, 29));
            case 12:
                return new ConfirmVerification((FinancialConnectionsConsumerSessionRepositoryImpl) provider.get());
            case 13:
                return new FeaturedInstitutions((FinancialConnectionsInstitutionsRepositoryImpl) provider.get());
            case 14:
                return new Payload((FinancialConnectionsRepositoryImpl) provider.get());
            case 15:
                return new RealIsNetworkingRelinkSession((CoreAuthorizationPendingNetworkingRepairRepository) provider.get());
            case 16:
                return new SearchInstitutions((FinancialConnectionsInstitutionsRepositoryImpl) provider.get());
            case 17:
                return new StartVerification((FinancialConnectionsConsumerSessionRepositoryImpl) provider.get());
            case 18:
                return new UpdateCachedAccounts((FinancialConnectionsAccountsRepositoryImpl) provider.get());
            case 19:
                return new UpdateLocalManifest((FinancialConnectionsManifestRepositoryImpl) provider.get());
            case 20:
                SavedStateHandle savedStateHandle = (SavedStateHandle) provider.get();
                savedStateHandle.getClass();
                return new AccountUpdateRequiredContentRepository(savedStateHandle);
            case 21:
                SavedStateHandle savedStateHandle2 = (SavedStateHandle) provider.get();
                savedStateHandle2.getClass();
                return new FinancialConnectionsErrorRepository(savedStateHandle2);
            case 22:
                SavedStateHandle savedStateHandle3 = (SavedStateHandle) provider.get();
                savedStateHandle3.getClass();
                return new NoticeSheetContentRepository(savedStateHandle3);
            case 23:
                return new RealConsumerSessionRepository((SavedStateHandle) provider.get());
            case 24:
                SavedStateHandle savedStateHandle4 = (SavedStateHandle) provider.get();
                savedStateHandle4.getClass();
                return new SuccessContentRepository(savedStateHandle4);
            case 25:
                return new NoOpIntentNextActionHandler((Function1) provider.get());
            case 26:
                return new UnsupportedNextActionHandler((Function1) provider.get());
            case 27:
                Context context = (Context) provider.get();
                context.getClass();
                String packageName2 = context.getPackageName();
                packageName2.getClass();
                return new DefaultReturnUrl(packageName2);
            case 28:
                Context context2 = (Context) provider.get();
                context2.getClass();
                return Boolean.valueOf(InstantApps.isInstantApp(context2));
            default:
                Object obj2 = (UnsupportedNextActionHandler) provider.get();
                obj2.getClass();
                try {
                    Result.Companion companion = Result.Companion;
                    Object newInstance = Class.forName("com.stripe.android.payments.wechatpay.WeChatPayNextActionHandler").getConstructor(null).newInstance(null);
                    newInstance.getClass();
                    failure = (PaymentNextActionHandler) newInstance;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (!(failure instanceof Result.Failure)) {
                    obj2 = failure;
                }
                return (PaymentNextActionHandler) obj2;
        }
    }

    public /* synthetic */ CameraModule_CameraStatsManagerFactory(Object obj, Provider provider, int i) {
        this.$r8$classId = i;
        this.realCameraStatsManagerProvider = provider;
    }
}
