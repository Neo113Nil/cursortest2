package com.withpersona.sdk2.inquiry.network.core;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes9.dex */
public final class NetworkCoreModule_KeyInflectionFactory implements Factory {
    private final NetworkCoreModule module;

    public NetworkCoreModule_KeyInflectionFactory(NetworkCoreModule networkCoreModule) {
        this.module = networkCoreModule;
    }

    public static NetworkCoreModule_KeyInflectionFactory create(NetworkCoreModule networkCoreModule) {
        return new NetworkCoreModule_KeyInflectionFactory(networkCoreModule);
    }

    public static String keyInflection(NetworkCoreModule networkCoreModule) {
        String keyInflection = networkCoreModule.keyInflection();
        Preconditions.checkNotNullFromProvides(keyInflection);
        return keyInflection;
    }

    @Override // javax.inject.Provider
    public String get() {
        return keyInflection(this.module);
    }
}
