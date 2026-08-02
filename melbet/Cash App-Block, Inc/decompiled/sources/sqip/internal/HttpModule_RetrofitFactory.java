package sqip.internal;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes10.dex */
public final class HttpModule_RetrofitFactory implements Factory {
    private final Provider moshiProvider;
    private final Provider okHttpClientProvider;
    private final Provider paymentUrlProvider;

    private HttpModule_RetrofitFactory(Provider provider, Provider provider2, Provider provider3) {
        this.okHttpClientProvider = provider;
        this.moshiProvider = provider2;
        this.paymentUrlProvider = provider3;
    }

    public static HttpModule_RetrofitFactory create(Provider provider, Provider provider2, Provider provider3) {
        return new HttpModule_RetrofitFactory(provider, provider2, provider3);
    }

    public static Retrofit retrofit(OkHttpClient okHttpClient, Moshi moshi, String str) {
        Retrofit retrofit = HttpModule.INSTANCE.retrofit(okHttpClient, moshi, str);
        Preconditions.checkNotNullFromProvides(retrofit);
        return retrofit;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return retrofit((OkHttpClient) this.okHttpClientProvider.get(), (Moshi) this.moshiProvider.get(), (String) this.paymentUrlProvider.get());
    }
}
