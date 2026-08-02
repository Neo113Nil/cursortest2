package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* loaded from: classes9.dex */
public final class NetworkCoreModule_RetrofitFactory implements Factory {
    private final NetworkCoreModule module;
    private final Provider moshiProvider;
    private final Provider okHttpClientProvider;
    private final Provider serverEndpointProvider;

    public NetworkCoreModule_RetrofitFactory(NetworkCoreModule networkCoreModule, Provider provider, Provider provider2, Provider provider3) {
        this.module = networkCoreModule;
        this.serverEndpointProvider = provider;
        this.okHttpClientProvider = provider2;
        this.moshiProvider = provider3;
    }

    public static NetworkCoreModule_RetrofitFactory create(NetworkCoreModule networkCoreModule, javax.inject.Provider provider, javax.inject.Provider provider2, javax.inject.Provider provider3) {
        return new NetworkCoreModule_RetrofitFactory(networkCoreModule, Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static Retrofit retrofit(NetworkCoreModule networkCoreModule, String str, OkHttpClient okHttpClient, Moshi moshi) {
        Retrofit retrofit = networkCoreModule.retrofit(str, okHttpClient, moshi);
        Preconditions.checkNotNullFromProvides(retrofit);
        return retrofit;
    }

    @Override // javax.inject.Provider
    public Retrofit get() {
        return retrofit(this.module, (String) this.serverEndpointProvider.get(), (OkHttpClient) this.okHttpClientProvider.get(), (Moshi) this.moshiProvider.get());
    }

    public static NetworkCoreModule_RetrofitFactory create(NetworkCoreModule networkCoreModule, Provider provider, Provider provider2, Provider provider3) {
        return new NetworkCoreModule_RetrofitFactory(networkCoreModule, provider, provider2, provider3);
    }
}
