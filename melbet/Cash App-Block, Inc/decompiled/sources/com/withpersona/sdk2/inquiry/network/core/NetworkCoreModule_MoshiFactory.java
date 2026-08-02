package com.withpersona.sdk2.inquiry.network.core;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Set;

/* loaded from: classes9.dex */
public final class NetworkCoreModule_MoshiFactory implements Factory {
    private final Provider jsonAdapterBindingsProvider;
    private final Provider jsonAdapterFactoryProvider;
    private final Provider jsonAdaptersProvider;
    private final NetworkCoreModule module;

    public NetworkCoreModule_MoshiFactory(NetworkCoreModule networkCoreModule, Provider provider, Provider provider2, Provider provider3) {
        this.module = networkCoreModule;
        this.jsonAdaptersProvider = provider;
        this.jsonAdapterBindingsProvider = provider2;
        this.jsonAdapterFactoryProvider = provider3;
    }

    public static NetworkCoreModule_MoshiFactory create(NetworkCoreModule networkCoreModule, javax.inject.Provider provider, javax.inject.Provider provider2, javax.inject.Provider provider3) {
        return new NetworkCoreModule_MoshiFactory(networkCoreModule, Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static Moshi moshi(NetworkCoreModule networkCoreModule, Set<Object> set, Set<JsonAdapterBinding<?>> set2, Set<JsonAdapter.Factory> set3) {
        Moshi moshi = networkCoreModule.moshi(set, set2, set3);
        Preconditions.checkNotNullFromProvides(moshi);
        return moshi;
    }

    @Override // javax.inject.Provider
    public Moshi get() {
        return moshi(this.module, (Set) this.jsonAdaptersProvider.get(), (Set) this.jsonAdapterBindingsProvider.get(), (Set) this.jsonAdapterFactoryProvider.get());
    }

    public static NetworkCoreModule_MoshiFactory create(NetworkCoreModule networkCoreModule, Provider provider, Provider provider2, Provider provider3) {
        return new NetworkCoreModule_MoshiFactory(networkCoreModule, provider, provider2, provider3);
    }
}
