package com.withpersona.sdk2.inquiry.tracking;

import com.squareup.moshi.JsonAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes9.dex */
public final class TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory implements Factory {
    private final TrackingEventsModule module;

    public TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory(TrackingEventsModule trackingEventsModule) {
        this.module = trackingEventsModule;
    }

    public static TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory create(TrackingEventsModule trackingEventsModule) {
        return new TrackingEventsModule_ProvideMoshiJsonAdapterFactoryFactory(trackingEventsModule);
    }

    public static Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory(TrackingEventsModule trackingEventsModule) {
        Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory = trackingEventsModule.provideMoshiJsonAdapterFactory();
        Preconditions.checkNotNullFromProvides(provideMoshiJsonAdapterFactory);
        return provideMoshiJsonAdapterFactory;
    }

    @Override // javax.inject.Provider
    public Set<JsonAdapter.Factory> get() {
        return provideMoshiJsonAdapterFactory(this.module);
    }
}
