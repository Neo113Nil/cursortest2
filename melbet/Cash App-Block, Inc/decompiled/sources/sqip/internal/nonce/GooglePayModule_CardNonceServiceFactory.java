package sqip.internal.nonce;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import retrofit2.Retrofit;

/* loaded from: classes10.dex */
public final class GooglePayModule_CardNonceServiceFactory implements Factory {
    private final Provider retrofitProvider;

    private GooglePayModule_CardNonceServiceFactory(Provider provider) {
        this.retrofitProvider = provider;
    }

    public static CreateGooglePayNonceService cardNonceService(Retrofit retrofit) {
        CreateGooglePayNonceService cardNonceService = GooglePayModule.INSTANCE.cardNonceService(retrofit);
        Preconditions.checkNotNullFromProvides(cardNonceService);
        return cardNonceService;
    }

    public static GooglePayModule_CardNonceServiceFactory create(Provider provider) {
        return new GooglePayModule_CardNonceServiceFactory(provider);
    }

    @Override // javax.inject.Provider
    public CreateGooglePayNonceService get() {
        return cardNonceService((Retrofit) this.retrofitProvider.get());
    }
}
