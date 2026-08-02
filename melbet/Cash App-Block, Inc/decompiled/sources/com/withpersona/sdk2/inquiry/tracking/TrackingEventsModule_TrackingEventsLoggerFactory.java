package com.withpersona.sdk2.inquiry.tracking;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes9.dex */
public final class TrackingEventsModule_TrackingEventsLoggerFactory implements Factory {
    private final Provider factoryProvider;
    private final TrackingEventsModule module;

    public TrackingEventsModule_TrackingEventsLoggerFactory(TrackingEventsModule trackingEventsModule, Provider provider) {
        this.module = trackingEventsModule;
        this.factoryProvider = provider;
    }

    public static TrackingEventsModule_TrackingEventsLoggerFactory create(TrackingEventsModule trackingEventsModule, javax.inject.Provider provider) {
        return new TrackingEventsModule_TrackingEventsLoggerFactory(trackingEventsModule, Providers.asDaggerProvider(provider));
    }

    public static TrackingEventsLogger trackingEventsLogger(TrackingEventsModule trackingEventsModule, TrackingEventsLoggerImpl.Factory factory) {
        TrackingEventsLogger trackingEventsLogger = trackingEventsModule.trackingEventsLogger(factory);
        Preconditions.checkNotNullFromProvides(trackingEventsLogger);
        return trackingEventsLogger;
    }

    @Override // javax.inject.Provider
    public TrackingEventsLogger get() {
        return trackingEventsLogger(this.module, (TrackingEventsLoggerImpl.Factory) this.factoryProvider.get());
    }

    public static TrackingEventsModule_TrackingEventsLoggerFactory create(TrackingEventsModule trackingEventsModule, Provider provider) {
        return new TrackingEventsModule_TrackingEventsLoggerFactory(trackingEventsModule, provider);
    }
}
