package sqip.internal;

import android.content.res.Resources;
import android.net.ConnectivityManager;
import com.squareup.moshi.JsonAdapter;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import sqip.internal.nonce.CreateGooglePayNonceService;
import sqip.internal.nonce.CreateNonceCall;
import sqip.internal.nonce.GooglePayModule_CardNonceServiceFactory;

/* loaded from: classes10.dex */
public final class DaggerGooglePayComponent {

    public static final class GooglePayComponentImpl implements GooglePayComponent {
        Provider cardNonceServiceProvider;
        Provider connectivityManagerProvider;
        Provider createCardNonceErrorResponseAdapterProvider;
        private final GooglePayComponentImpl googlePayComponentImpl = this;
        Provider installerPackageNameProvider;
        Provider moshiProvider;
        Provider okHttpClientProvider;
        Provider paymentUrlProvider;
        Provider provideLocaleProvider;
        Provider retrofitProvider;
        Provider sharedPreferencesProvider;
        Provider squareDeviceIdProvider;
        Provider squareHeadersInterceptorProvider;
        Provider squareTruststoreProvider;

        public GooglePayComponentImpl() {
            initialize();
        }

        private void initialize() {
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
            this.cardNonceServiceProvider = DoubleCheck.provider(GooglePayModule_CardNonceServiceFactory.create(provider4));
            this.connectivityManagerProvider = DoubleCheck.provider(HttpModule_ConnectivityManagerFactory.create(AndroidModule_ApplicationFactory.create()));
            this.installerPackageNameProvider = DoubleCheck.provider(HttpModule_InstallerPackageNameFactory.create(AndroidModule_ApplicationFactory.create()));
        }

        @Override // sqip.internal.GooglePayComponent
        public CreateNonceCall.Factory createNonceCallFactory() {
            return new CreateNonceCall.Factory((JsonAdapter) this.createCardNonceErrorResponseAdapterProvider.get(), (CreateGooglePayNonceService) this.cardNonceServiceProvider.get(), networkMonitor(), resources(), deviceInfo());
        }

        public DeviceInfo deviceInfo() {
            return new DeviceInfo((String) this.installerPackageNameProvider.get(), this.provideLocaleProvider, AndroidModule_ApplicationFactory.application(), (String) this.squareDeviceIdProvider.get());
        }

        public NetworkMonitor networkMonitor() {
            return new NetworkMonitor((ConnectivityManager) this.connectivityManagerProvider.get());
        }

        public Resources resources() {
            return AndroidModule_ResourcesFactory.resources(AndroidModule_ApplicationFactory.application());
        }
    }

    private DaggerGooglePayComponent() {
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public static GooglePayComponent create() {
        return new Builder(0).build();
    }

    public static final class Builder {
        public /* synthetic */ Builder(int i) {
            this();
        }

        public GooglePayComponent build() {
            return new GooglePayComponentImpl();
        }

        private Builder() {
        }
    }
}
