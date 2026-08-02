package com.withpersona.sdk2.inquiry.tracking.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes9.dex */
public final class TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory implements Factory {

    public static final class InstanceHolder {
        static final TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory INSTANCE = new TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory();

        private InstanceHolder() {
        }
    }

    public static TrackingEventsServiceModule_Companion_ProvideMoshiJsonAdapterFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<Object> provideMoshiJsonAdapter() {
        Set<Object> provideMoshiJsonAdapter = TrackingEventsServiceModule.INSTANCE.provideMoshiJsonAdapter();
        Preconditions.checkNotNullFromProvides(provideMoshiJsonAdapter);
        return provideMoshiJsonAdapter;
    }

    @Override // javax.inject.Provider
    public Set<Object> get() {
        return provideMoshiJsonAdapter();
    }
}
