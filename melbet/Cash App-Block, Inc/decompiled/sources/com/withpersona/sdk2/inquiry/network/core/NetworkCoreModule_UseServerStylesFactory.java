package com.withpersona.sdk2.inquiry.network.core;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes9.dex */
public final class NetworkCoreModule_UseServerStylesFactory implements Factory {
    private final NetworkCoreModule module;

    public NetworkCoreModule_UseServerStylesFactory(NetworkCoreModule networkCoreModule) {
        this.module = networkCoreModule;
    }

    public static NetworkCoreModule_UseServerStylesFactory create(NetworkCoreModule networkCoreModule) {
        return new NetworkCoreModule_UseServerStylesFactory(networkCoreModule);
    }

    public static String useServerStyles(NetworkCoreModule networkCoreModule) {
        String useServerStyles = networkCoreModule.useServerStyles();
        Preconditions.checkNotNullFromProvides(useServerStyles);
        return useServerStyles;
    }

    @Override // javax.inject.Provider
    public String get() {
        return useServerStyles(this.module);
    }
}
