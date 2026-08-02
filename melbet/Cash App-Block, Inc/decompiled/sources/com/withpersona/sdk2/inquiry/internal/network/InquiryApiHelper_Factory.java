package com.withpersona.sdk2.inquiry.internal.network;

import android.content.Context;
import com.google.android.gms.internal.common.zzj;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.DefaultCardFundingFilter;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.LinearRetryDelaySupplier;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.googlepaylauncher.DefaultGooglePayRepository;
import com.stripe.android.googlepaylauncher.DefaultPaymentsClientFactory;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Config;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.analytics.RealErrorReporter;
import com.stripe.android.payments.core.authentication.threeds2.DefaultStripe3ds2ChallengeResultProcessor;
import com.withpersona.sdk2.inquiry.device.RealDeviceIdProvider;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.RealFallbackModeManager;
import com.withpersona.sdk2.inquiry.internal.integrity.PlayIntegrityHelper;
import com.withpersona.sdk2.inquiry.sandbox.SandboxFlags;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes8.dex */
public final class InquiryApiHelper_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider applicationContextProvider;
    public final Provider deviceIdProvider;
    public final Provider fallbackModeManagerProvider;
    public final Provider playIntegrityHelperProvider;
    public final Provider sandboxFlagsProvider;
    public final Provider serviceProvider;

    public /* synthetic */ InquiryApiHelper_Factory(Factory factory, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, int i) {
        this.$r8$classId = i;
        this.applicationContextProvider = factory;
        this.serviceProvider = provider;
        this.fallbackModeManagerProvider = provider2;
        this.sandboxFlagsProvider = provider3;
        this.deviceIdProvider = provider4;
        this.playIntegrityHelperProvider = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.playIntegrityHelperProvider;
        Provider provider2 = this.deviceIdProvider;
        Provider provider3 = this.sandboxFlagsProvider;
        Provider provider4 = this.fallbackModeManagerProvider;
        Provider provider5 = this.serviceProvider;
        Provider provider6 = this.applicationContextProvider;
        switch (i) {
            case 0:
                return new InquiryApiHelper((Context) provider6.get(), (InquiryService) provider5.get(), (RealFallbackModeManager) provider4.get(), (SandboxFlags) provider3.get(), (RealDeviceIdProvider) provider2.get(), (PlayIntegrityHelper) provider.get());
            case 1:
                Context context = (Context) provider6.get();
                GooglePayPaymentMethodLauncher$Config googlePayPaymentMethodLauncher$Config = (GooglePayPaymentMethodLauncher$Config) provider5.get();
                Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = (Logger$Companion$NOOP_LOGGER$1) provider4.get();
                RealErrorReporter realErrorReporter = (RealErrorReporter) provider3.get();
                DefaultCardBrandFilter defaultCardBrandFilter = (DefaultCardBrandFilter) provider2.get();
                DefaultCardFundingFilter defaultCardFundingFilter = (DefaultCardFundingFilter) provider.get();
                context.getClass();
                googlePayPaymentMethodLauncher$Config.getClass();
                logger$Companion$NOOP_LOGGER$1.getClass();
                realErrorReporter.getClass();
                defaultCardBrandFilter.getClass();
                defaultCardFundingFilter.getClass();
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                return new DefaultGooglePayRepository(applicationContext, googlePayPaymentMethodLauncher$Config.environment, zzj.convert(googlePayPaymentMethodLauncher$Config.billingAddressConfig), googlePayPaymentMethodLauncher$Config.existingPaymentMethodRequired, googlePayPaymentMethodLauncher$Config.allowCreditCards, new DefaultPaymentsClientFactory(context), realErrorReporter, logger$Companion$NOOP_LOGGER$1, defaultCardBrandFilter, defaultCardFundingFilter, googlePayPaymentMethodLauncher$Config.additionalEnabledNetworks);
            case 2:
                return new DefaultStripe3ds2ChallengeResultProcessor((StripeRepository) provider6.get(), (DefaultAnalyticsRequestExecutor) provider5.get(), (PaymentAnalyticsRequestFactory) provider4.get(), (LinearRetryDelaySupplier) provider3.get(), (Logger$Companion$NOOP_LOGGER$1) provider2.get(), (CoroutineContext) provider.get());
            default:
                FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor = (FinancialConnectionsRequestExecutor) provider6.get();
                ApiRequest.Factory factory = (ApiRequest.Factory) provider5.get();
                ProvideApiRequestOptions provideApiRequestOptions = (ProvideApiRequestOptions) provider4.get();
                Locale locale = (Locale) provider3.get();
                Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$12 = (Logger$Companion$NOOP_LOGGER$1) provider2.get();
                SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) ((InstanceFactory) provider).instance;
                financialConnectionsRequestExecutor.getClass();
                factory.getClass();
                provideApiRequestOptions.getClass();
                logger$Companion$NOOP_LOGGER$12.getClass();
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                Locale locale2 = locale;
                locale2.getClass();
                return new FinancialConnectionsManifestRepositoryImpl(financialConnectionsRequestExecutor, factory, provideApiRequestOptions, locale2, logger$Companion$NOOP_LOGGER$12, synchronizeSessionResponse);
        }
    }
}
