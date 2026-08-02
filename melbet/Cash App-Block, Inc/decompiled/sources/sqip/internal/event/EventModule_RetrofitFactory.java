package sqip.internal.event;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes10.dex */
public final class EventModule_RetrofitFactory implements Factory {
    private final Provider eventsUrlProvider;
    private final Provider moshiProvider;
    private final Provider okHttpClientProvider;

    private EventModule_RetrofitFactory(Provider provider, Provider provider2, Provider provider3) {
        this.okHttpClientProvider = provider;
        this.moshiProvider = provider2;
        this.eventsUrlProvider = provider3;
    }

    public static EventModule_RetrofitFactory create(Provider provider, Provider provider2, Provider provider3) {
        return new EventModule_RetrofitFactory(provider, provider2, provider3);
    }

    public static Retrofit retrofit(OkHttpClient okHttpClient, Moshi moshi, String str) {
        Retrofit retrofit = EventModule.INSTANCE.retrofit(okHttpClient, moshi, str);
        Preconditions.checkNotNullFromProvides(retrofit);
        return retrofit;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return retrofit((OkHttpClient) this.okHttpClientProvider.get(), (Moshi) this.moshiProvider.get(), (String) this.eventsUrlProvider.get());
    }
}
