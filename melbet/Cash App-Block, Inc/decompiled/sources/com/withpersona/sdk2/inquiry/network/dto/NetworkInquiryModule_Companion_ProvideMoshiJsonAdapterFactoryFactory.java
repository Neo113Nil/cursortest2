package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.JsonAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes9.dex */
public final class NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory implements Factory {

    public static final class InstanceHolder {
        static final NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory INSTANCE = new NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory();

        private InstanceHolder() {
        }
    }

    public static NetworkInquiryModule_Companion_ProvideMoshiJsonAdapterFactoryFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
        Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory = NetworkInquiryModule.INSTANCE.provideMoshiJsonAdapterFactory();
        Preconditions.checkNotNullFromProvides(provideMoshiJsonAdapterFactory);
        return provideMoshiJsonAdapterFactory;
    }

    @Override // javax.inject.Provider
    public Set<JsonAdapter.Factory> get() {
        return provideMoshiJsonAdapterFactory();
    }
}
