package com.withpersona.sdk2.inquiry.tracking.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes9.dex */
public final class TrackingEventsServiceModule_ServerEndpointFactory implements Factory {
    private final TrackingEventsServiceModule module;

    public TrackingEventsServiceModule_ServerEndpointFactory(TrackingEventsServiceModule trackingEventsServiceModule) {
        this.module = trackingEventsServiceModule;
    }

    public static TrackingEventsServiceModule_ServerEndpointFactory create(TrackingEventsServiceModule trackingEventsServiceModule) {
        return new TrackingEventsServiceModule_ServerEndpointFactory(trackingEventsServiceModule);
    }

    public static String serverEndpoint(TrackingEventsServiceModule trackingEventsServiceModule) {
        String trackingEventsServiceServerEndpoint = trackingEventsServiceModule.getTrackingEventsServiceServerEndpoint();
        Preconditions.checkNotNullFromProvides(trackingEventsServiceServerEndpoint);
        return trackingEventsServiceServerEndpoint;
    }

    @Override // javax.inject.Provider
    public String get() {
        return serverEndpoint(this.module);
    }
}
