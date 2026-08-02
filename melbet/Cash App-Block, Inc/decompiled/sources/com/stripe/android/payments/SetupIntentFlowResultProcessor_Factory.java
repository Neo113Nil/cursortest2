package com.stripe.android.payments;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.core.networking.RealAnalyticsRequestV2Storage;
import com.stripe.android.core.utils.RealIsWorkManagerAvailable;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.RealHandleError;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsErrorRepository;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import dagger.internal.Factory;
import dagger.internal.Provider;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes8.dex */
public final class SetupIntentFlowResultProcessor_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider contextProvider;
    public final Provider loggerProvider;
    public final Provider publishableKeyProvider;
    public final Provider stripeRepositoryProvider;
    public final Provider workContextProvider;

    public /* synthetic */ SetupIntentFlowResultProcessor_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, int i) {
        this.$r8$classId = i;
        this.contextProvider = provider;
        this.publishableKeyProvider = provider2;
        this.stripeRepositoryProvider = provider3;
        this.loggerProvider = provider4;
        this.workContextProvider = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.workContextProvider;
        Provider provider2 = this.loggerProvider;
        Provider provider3 = this.stripeRepositoryProvider;
        Provider provider4 = this.publishableKeyProvider;
        Provider provider5 = this.contextProvider;
        switch (i) {
            case 0:
                return new SetupIntentFlowResultProcessor((Context) provider5.get(), (Function0) provider4.get(), (StripeRepository) provider3.get(), (Logger$Companion$NOOP_LOGGER$1) provider2.get(), (CoroutineContext) provider.get());
            case 1:
                return new DefaultAnalyticsRequestV2Executor((Context) provider5.get(), (DefaultStripeNetworkClient) provider4.get(), (Logger$Companion$NOOP_LOGGER$1) provider3.get(), (RealAnalyticsRequestV2Storage) provider2.get(), (RealIsWorkManagerAvailable) provider.get());
            case 2:
                FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = (FinancialConnectionsRequestExecutor) provider5.get();
                ProvideApiRequestOptions provideApiRequestOptions = (ProvideApiRequestOptions) provider4.get();
                ApiRequest.Factory factory = (ApiRequest.Factory) provider3.get();
                Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = (Logger$Companion$NOOP_LOGGER$1) provider2.get();
                SavedStateHandle savedStateHandle = (SavedStateHandle) provider.get();
                financialConnectionsRequestExecutor.getClass();
                provideApiRequestOptions.getClass();
                factory.getClass();
                logger$Companion$NOOP_LOGGER$1.getClass();
                savedStateHandle.getClass();
                return new FinancialConnectionsAccountsRepositoryImpl(financialConnectionsRequestExecutor, provideApiRequestOptions, factory, logger$Companion$NOOP_LOGGER$1, savedStateHandle);
            case 3:
                Application application = (Application) provider5.get();
                GetOrFetchSync getOrFetchSync = (GetOrFetchSync) provider4.get();
                Locale locale = (Locale) provider3.get();
                FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration = (FinancialConnectionsSheetConfiguration) provider2.get();
                DefaultAnalyticsRequestV2Executor defaultAnalyticsRequestV2Executor = (DefaultAnalyticsRequestV2Executor) provider.get();
                application.getClass();
                getOrFetchSync.getClass();
                financialConnectionsSheetConfiguration.getClass();
                defaultAnalyticsRequestV2Executor.getClass();
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                Locale locale2 = locale;
                locale2.getClass();
                return new FinancialConnectionsAnalyticsTrackerImpl(getOrFetchSync, financialConnectionsSheetConfiguration, locale2, application, defaultAnalyticsRequestV2Executor);
            default:
                return new RealHandleError((FinancialConnectionsErrorRepository) provider5.get(), (FinancialConnectionsAnalyticsTrackerImpl) provider4.get(), (NativeAuthFlowCoordinator) provider3.get(), (Logger$Companion$NOOP_LOGGER$1) provider2.get(), (NavigationManagerImpl) provider.get());
        }
    }
}
