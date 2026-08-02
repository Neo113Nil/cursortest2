package com.withpersona.sdk2.inquiry.network.core;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.Interceptor;

/* loaded from: classes9.dex */
public final class NetworkCoreModule_ResponseInterceptorFactory implements Factory {
    private final NetworkCoreModule module;

    public NetworkCoreModule_ResponseInterceptorFactory(NetworkCoreModule networkCoreModule) {
        this.module = networkCoreModule;
    }

    public static NetworkCoreModule_ResponseInterceptorFactory create(NetworkCoreModule networkCoreModule) {
        return new NetworkCoreModule_ResponseInterceptorFactory(networkCoreModule);
    }

    public static Interceptor responseInterceptor(NetworkCoreModule networkCoreModule) {
        Interceptor responseInterceptor = networkCoreModule.responseInterceptor();
        Preconditions.checkNotNullFromProvides(responseInterceptor);
        return responseInterceptor;
    }

    @Override // javax.inject.Provider
    public Interceptor get() {
        return responseInterceptor(this.module);
    }
}
