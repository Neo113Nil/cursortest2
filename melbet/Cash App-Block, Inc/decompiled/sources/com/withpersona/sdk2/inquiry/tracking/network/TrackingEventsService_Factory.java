package com.withpersona.sdk2.inquiry.tracking.network;

import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes9.dex */
public final class TrackingEventsService_Factory implements Factory {
    private final Provider trackingEventsServiceApiProvider;

    public TrackingEventsService_Factory(Provider provider) {
        this.trackingEventsServiceApiProvider = provider;
    }

    public static TrackingEventsService_Factory create(javax.inject.Provider provider) {
        return new TrackingEventsService_Factory(Providers.asDaggerProvider(provider));
    }

    public static TrackingEventsService newInstance(TrackingEventsServiceApi trackingEventsServiceApi) {
        return new TrackingEventsService(trackingEventsServiceApi);
    }

    @Override // javax.inject.Provider
    public TrackingEventsService get() {
        return newInstance((TrackingEventsServiceApi) this.trackingEventsServiceApiProvider.get());
    }

    public static TrackingEventsService_Factory create(Provider provider) {
        return new TrackingEventsService_Factory(provider);
    }
}
