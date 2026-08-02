package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes9.dex */
public final class NetworkCoreModule_Companion_ProvideMoshiJsonAdapterFactoryFactory implements Factory {

    public static final class InstanceHolder {
        static final NetworkCoreModule_Companion_ProvideMoshiJsonAdapterFactoryFactory INSTANCE = new NetworkCoreModule_Companion_ProvideMoshiJsonAdapterFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkCoreModule_Companion_ProvideMoshiJsonAdapterFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
        Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory = NetworkCoreModule.Companion.provideMoshiJsonAdapterFactory();
        Preconditions.checkNotNullFromProvides(provideMoshiJsonAdapterFactory);
        return provideMoshiJsonAdapterFactory;
    }

    @Override // javax.inject.Provider
    public Set<JsonAdapter.Factory> get() {
        return provideMoshiJsonAdapterFactory();
    }
}
