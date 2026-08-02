package com.withpersona.sdk2.inquiry.network.core;

import android.content.Context;
import com.withpersona.sdk2.inquiry.device.DeviceInfoProvider;
import com.withpersona.sdk2.inquiry.device.DeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.logger.SubsystemLogger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Map;
import java.util.Set;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class NetworkCoreModule_OkhttpClientFactory implements Factory {
    private final Provider contextProvider;
    private final Provider deviceInfoProvider;
    private final Provider deviceVendorIDProvider;
    private final Provider headersProvider;
    private final Provider interceptorsProvider;
    private final Provider loggerFactoryProvider;
    private final NetworkCoreModule module;

    public NetworkCoreModule_OkhttpClientFactory(NetworkCoreModule networkCoreModule, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        this.module = networkCoreModule;
        this.interceptorsProvider = provider;
        this.headersProvider = provider2;
        this.contextProvider = provider3;
        this.deviceVendorIDProvider = provider4;
        this.deviceInfoProvider = provider5;
        this.loggerFactoryProvider = provider6;
    }

    public static NetworkCoreModule_OkhttpClientFactory create(NetworkCoreModule networkCoreModule, javax.inject.Provider provider, javax.inject.Provider provider2, javax.inject.Provider provider3, javax.inject.Provider provider4, javax.inject.Provider provider5, javax.inject.Provider provider6) {
        return new NetworkCoreModule_OkhttpClientFactory(networkCoreModule, Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5), Providers.asDaggerProvider(provider6));
    }

    public static OkHttpClient okhttpClient(NetworkCoreModule networkCoreModule, Set<Interceptor> set, Map<String, String> map, Context context, DeviceVendorIDProvider deviceVendorIDProvider, DeviceInfoProvider deviceInfoProvider, SubsystemLogger.Factory factory) {
        OkHttpClient okhttpClient = networkCoreModule.okhttpClient(set, map, context, deviceVendorIDProvider, deviceInfoProvider, factory);
        Preconditions.checkNotNullFromProvides(okhttpClient);
        return okhttpClient;
    }

    @Override // javax.inject.Provider
    public OkHttpClient get() {
        return okhttpClient(this.module, (Set) this.interceptorsProvider.get(), (Map) this.headersProvider.get(), (Context) this.contextProvider.get(), (DeviceVendorIDProvider) this.deviceVendorIDProvider.get(), (DeviceInfoProvider) this.deviceInfoProvider.get(), (SubsystemLogger.Factory) this.loggerFactoryProvider.get());
    }

    public static NetworkCoreModule_OkhttpClientFactory create(NetworkCoreModule networkCoreModule, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6) {
        return new NetworkCoreModule_OkhttpClientFactory(networkCoreModule, provider, provider2, provider3, provider4, provider5, provider6);
    }
}
