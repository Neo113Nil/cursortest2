package sqip.internal.nonce;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import retrofit2.Retrofit;

/* loaded from: classes10.dex */
public final class CardEntryModule_CardNonceServiceFactory implements Factory {
    private final Provider retrofitProvider;

    private CardEntryModule_CardNonceServiceFactory(Provider provider) {
        this.retrofitProvider = provider;
    }

    public static CreateCardNonceService cardNonceService(Retrofit retrofit) {
        CreateCardNonceService cardNonceService = CardEntryModule.INSTANCE.cardNonceService(retrofit);
        Preconditions.checkNotNullFromProvides(cardNonceService);
        return cardNonceService;
    }

    public static CardEntryModule_CardNonceServiceFactory create(Provider provider) {
        return new CardEntryModule_CardNonceServiceFactory(provider);
    }

    @Override // javax.inject.Provider
    public CreateCardNonceService get() {
        return cardNonceService((Retrofit) this.retrofitProvider.get());
    }
}
