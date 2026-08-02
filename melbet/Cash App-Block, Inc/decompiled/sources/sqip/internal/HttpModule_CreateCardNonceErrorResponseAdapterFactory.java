package sqip.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* loaded from: classes10.dex */
public final class HttpModule_CreateCardNonceErrorResponseAdapterFactory implements Factory {
    private final Provider moshiProvider;

    private HttpModule_CreateCardNonceErrorResponseAdapterFactory(Provider provider) {
        this.moshiProvider = provider;
    }

    public static HttpModule_CreateCardNonceErrorResponseAdapterFactory create(Provider provider) {
        return new HttpModule_CreateCardNonceErrorResponseAdapterFactory(provider);
    }

    public static JsonAdapter createCardNonceErrorResponseAdapter(Moshi moshi) {
        JsonAdapter createCardNonceErrorResponseAdapter = HttpModule.INSTANCE.createCardNonceErrorResponseAdapter(moshi);
        Preconditions.checkNotNullFromProvides(createCardNonceErrorResponseAdapter);
        return createCardNonceErrorResponseAdapter;
    }

    @Override // javax.inject.Provider
    public JsonAdapter get() {
        return createCardNonceErrorResponseAdapter((Moshi) this.moshiProvider.get());
    }
}
