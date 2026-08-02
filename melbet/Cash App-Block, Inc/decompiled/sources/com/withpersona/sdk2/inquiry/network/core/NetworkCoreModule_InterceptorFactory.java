package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import okhttp3.Interceptor;

/* loaded from: classes9.dex */
public final class NetworkCoreModule_InterceptorFactory implements Factory {
    private final NetworkCoreModule module;
    private final Provider moshiProvider;

    public NetworkCoreModule_InterceptorFactory(NetworkCoreModule networkCoreModule, Provider provider) {
        this.module = networkCoreModule;
        this.moshiProvider = provider;
    }

    public static NetworkCoreModule_InterceptorFactory create(NetworkCoreModule networkCoreModule, javax.inject.Provider provider) {
        return new NetworkCoreModule_InterceptorFactory(networkCoreModule, Providers.asDaggerProvider(provider));
    }

    public static Interceptor interceptor(NetworkCoreModule networkCoreModule, Moshi moshi) {
        Interceptor interceptor = networkCoreModule.interceptor(moshi);
        Preconditions.checkNotNullFromProvides(interceptor);
        return interceptor;
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return interceptor(this.module, (Moshi) this.moshiProvider.get());
    }

    public static NetworkCoreModule_InterceptorFactory create(NetworkCoreModule networkCoreModule, Provider provider) {
        return new NetworkCoreModule_InterceptorFactory(networkCoreModule, provider);
    }
}
