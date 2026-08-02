package com.withpersona.sdk2.inquiry.tracking.network;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* loaded from: classes9.dex */
public final class TrackingEventsServiceModule_ProvideContextFactory implements Factory {
    private final TrackingEventsServiceModule module;

    public TrackingEventsServiceModule_ProvideContextFactory(TrackingEventsServiceModule trackingEventsServiceModule) {
        this.module = trackingEventsServiceModule;
    }

    public static TrackingEventsServiceModule_ProvideContextFactory create(TrackingEventsServiceModule trackingEventsServiceModule) {
        return new TrackingEventsServiceModule_ProvideContextFactory(trackingEventsServiceModule);
    }

    public static Context provideContext(TrackingEventsServiceModule trackingEventsServiceModule) {
        Context context = trackingEventsServiceModule.getContext();
        Preconditions.checkNotNullFromProvides(context);
        return context;
    }

    @Override // javax.inject.Provider
    public Context get() {
        return provideContext(this.module);
    }
}
