package sqip.internal.nonce;

import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import sqip.internal.AndroidModule_ApplicationFactory;
import sqip.internal.AndroidModule_ResourcesFactory;
import sqip.internal.ApkInfo_Factory;
import sqip.internal.CardEntryActivityController;
import sqip.internal.CardEntryStateManager;
import sqip.internal.CardEntryStateManager_Factory;
import sqip.internal.DeviceInfo_Factory;
import sqip.internal.GzipRequestInterceptor_Factory;
import sqip.internal.HttpModule_ConnectivityManagerFactory;
import sqip.internal.HttpModule_CreateCardNonceErrorResponseAdapterFactory;
import sqip.internal.HttpModule_InstallerPackageNameFactory;
import sqip.internal.HttpModule_MoshiFactory;
import sqip.internal.HttpModule_OkHttpClientFactory;
import sqip.internal.HttpModule_ProvideLocaleFactory;
import sqip.internal.HttpModule_RetrofitFactory;
import sqip.internal.HttpModule_SharedPreferencesFactory;
import sqip.internal.HttpModule_SquareDeviceIdFactory;
import sqip.internal.HttpModule_SquareTruststoreFactory;
import sqip.internal.NetworkMonitor_Factory;
import sqip.internal.SquareHeadersInterceptor_Factory;
import sqip.internal.UrlModule_EventsUrlFactory;
import sqip.internal.UrlModule_PaymentUrlFactory;
import sqip.internal.event.EventLogger_Real_Factory;
import sqip.internal.event.EventModule_EventJsonAdapterFactory;
import sqip.internal.event.EventModule_EventStreamServiceFactory;
import sqip.internal.event.EventModule_EventsUploadExecutorFactory;
import sqip.internal.event.EventModule_RetrofitFactory;

/* loaded from: classes10.dex */
public final class DaggerCardEntryActivityComponent {

    public static final class CardEntryActivityComponentImpl implements CardEntryActivityComponent {
        Provider apkInfoProvider;
        private final CardEntryActivityComponentImpl cardEntryActivityComponentImpl = this;
        Provider cardEntryActivityControllerFactoryProvider;
        Provider cardEntryActivityControllerProvider;
        Provider cardEntryStateManagerProvider;
        Provider cardNonceServiceProvider;
        Provider connectivityManagerProvider;
        Provider createCardNonceErrorResponseAdapterProvider;
        Provider deviceInfoProvider;
        Provider eventJsonAdapterProvider;
        Provider eventStreamServiceProvider;
        Provider eventsUploadExecutorProvider;
        Provider eventsUrlProvider;
        Provider installerPackageNameProvider;
        Provider moshiProvider;
        Provider networkMonitorProvider;
        Provider okHttpClientProvider;
        Provider paymentUrlProvider;
        Provider provideLocaleProvider;
        Provider realCreateCardNonceRequestHandlerProvider;
        Provider realProvider;
        Provider resourcesProvider;
        Provider retrofitProvider;
        Provider retrofitProvider2;
        Provider sharedPreferencesProvider;
        Provider squareDeviceIdProvider;
        Provider squareHeadersInterceptorProvider;
        Provider squareTruststoreProvider;

        public CardEntryActivityComponentImpl(CardEntryActivityControllerFactory cardEntryActivityControllerFactory) {
            initialize(cardEntryActivityControllerFactory);
            initialize2(cardEntryActivityControllerFactory);
        }

        private void initialize(CardEntryActivityControllerFactory cardEntryActivityControllerFactory) {
            this.cardEntryActivityControllerFactoryProvider = InstanceFactory.create(cardEntryActivityControllerFactory);
            Provider provider = DoubleCheck.provider(HttpModule_MoshiFactory.create());
            this.moshiProvider = provider;
            this.createCardNonceErrorResponseAdapterProvider = DoubleCheck.provider(HttpModule_CreateCardNonceErrorResponseAdapterFactory.create(provider));
            this.squareTruststoreProvider = DoubleCheck.provider(HttpModule_SquareTruststoreFactory.create(AndroidModule_ApplicationFactory.create()));
            Provider provider2 = DoubleCheck.provider(HttpModule_SharedPreferencesFactory.create(AndroidModule_ApplicationFactory.create()));
            this.sharedPreferencesProvider = provider2;
            this.squareDeviceIdProvider = DoubleCheck.provider(HttpModule_SquareDeviceIdFactory.create(provider2));
            HttpModule_ProvideLocaleFactory create = HttpModule_ProvideLocaleFactory.create(AndroidModule_ApplicationFactory.create());
            this.provideLocaleProvider = create;
            SquareHeadersInterceptor_Factory create2 = SquareHeadersInterceptor_Factory.create(this.squareDeviceIdProvider, create);
            this.squareHeadersInterceptorProvider = create2;
            this.okHttpClientProvider = DoubleCheck.provider(HttpModule_OkHttpClientFactory.create(this.squareTruststoreProvider, create2, GzipRequestInterceptor_Factory.create()));
            Provider provider3 = DoubleCheck.provider(UrlModule_PaymentUrlFactory.create());
            this.paymentUrlProvider = provider3;
            Provider provider4 = DoubleCheck.provider(HttpModule_RetrofitFactory.create(this.okHttpClientProvider, this.moshiProvider, provider3));
            this.retrofitProvider = provider4;
            this.cardNonceServiceProvider = DoubleCheck.provider(CardEntryModule_CardNonceServiceFactory.create(provider4));
            Provider provider5 = DoubleCheck.provider(HttpModule_ConnectivityManagerFactory.create(AndroidModule_ApplicationFactory.create()));
            this.connectivityManagerProvider = provider5;
            this.networkMonitorProvider = NetworkMonitor_Factory.create(provider5);
            Provider provider6 = DoubleCheck.provider(UrlModule_EventsUrlFactory.create());
            this.eventsUrlProvider = provider6;
            Provider provider7 = DoubleCheck.provider(EventModule_RetrofitFactory.create(this.okHttpClientProvider, this.moshiProvider, provider6));
            this.retrofitProvider2 = provider7;
            this.eventStreamServiceProvider = DoubleCheck.provider(EventModule_EventStreamServiceFactory.create(provider7));
            this.eventsUploadExecutorProvider = DoubleCheck.provider(EventModule_EventsUploadExecutorFactory.create());
            this.eventJsonAdapterProvider = DoubleCheck.provider(EventModule_EventJsonAdapterFactory.create(this.moshiProvider));
            this.resourcesProvider = AndroidModule_ResourcesFactory.create(AndroidModule_ApplicationFactory.create());
            ApkInfo_Factory create3 = ApkInfo_Factory.create(AndroidModule_ApplicationFactory.create());
            this.apkInfoProvider = create3;
            this.realProvider = DoubleCheck.provider(EventLogger_Real_Factory.create(this.eventStreamServiceProvider, this.eventsUploadExecutorProvider, this.eventJsonAdapterProvider, this.resourcesProvider, create3, this.provideLocaleProvider, this.squareDeviceIdProvider));
            Provider provider8 = DoubleCheck.provider(HttpModule_InstallerPackageNameFactory.create(AndroidModule_ApplicationFactory.create()));
            this.installerPackageNameProvider = provider8;
            DeviceInfo_Factory create4 = DeviceInfo_Factory.create(provider8, this.provideLocaleProvider, AndroidModule_ApplicationFactory.create(), this.squareDeviceIdProvider);
            this.deviceInfoProvider = create4;
            this.realCreateCardNonceRequestHandlerProvider = DoubleCheck.provider(RealCreateCardNonceRequestHandler_Factory.create(this.createCardNonceErrorResponseAdapterProvider, this.cardNonceServiceProvider, this.networkMonitorProvider, this.realProvider, create4, this.resourcesProvider));
        }

        private void initialize2(CardEntryActivityControllerFactory cardEntryActivityControllerFactory) {
            this.cardEntryActivityControllerProvider = DoubleCheck.provider(ActivityControllerModule_CardEntryActivityControllerFactory.create(this.cardEntryActivityControllerFactoryProvider, this.realCreateCardNonceRequestHandlerProvider, this.realProvider, this.resourcesProvider));
            this.cardEntryStateManagerProvider = DoubleCheck.provider(CardEntryStateManager_Factory.create(this.realProvider));
        }

        @Override // sqip.internal.nonce.CardEntryActivityComponent
        public CardEntryActivityController cardEntryActivityController() {
            return (CardEntryActivityController) this.cardEntryActivityControllerProvider.get();
        }

        @Override // sqip.internal.nonce.CardEntryActivityComponent
        public CardEntryStateManager cardStateManager() {
            return (CardEntryStateManager) this.cardEntryStateManagerProvider.get();
        }
    }

    private DaggerCardEntryActivityComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public static final class Builder {
        private CardEntryActivityControllerFactory cardEntryActivityControllerFactory;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public CardEntryActivityComponent build() {
            Preconditions.checkBuilderRequirement(CardEntryActivityControllerFactory.class, this.cardEntryActivityControllerFactory);
            return new CardEntryActivityComponentImpl(this.cardEntryActivityControllerFactory);
        }

        public Builder cardEntryActivityControllerFactory(CardEntryActivityControllerFactory cardEntryActivityControllerFactory) {
            cardEntryActivityControllerFactory.getClass();
            this.cardEntryActivityControllerFactory = cardEntryActivityControllerFactory;
            return this;
        }

        private Builder() {
        }
    }
}
