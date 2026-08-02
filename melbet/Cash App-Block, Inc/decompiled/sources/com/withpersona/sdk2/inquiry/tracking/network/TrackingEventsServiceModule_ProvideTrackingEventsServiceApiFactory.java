package com.withpersona.sdk2.inquiry.tracking.network;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import retrofit2.Retrofit;

/* loaded from: classes9.dex */
public final class TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory implements Factory {
    private final TrackingEventsServiceModule module;
    private final Provider retrofitProvider;

    public TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory(TrackingEventsServiceModule trackingEventsServiceModule, Provider provider) {
        this.module = trackingEventsServiceModule;
        this.retrofitProvider = provider;
    }

    public static TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory create(TrackingEventsServiceModule trackingEventsServiceModule, javax.inject.Provider provider) {
        return new TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory(trackingEventsServiceModule, Providers.asDaggerProvider(provider));
    }

    public static TrackingEventsServiceApi provideTrackingEventsServiceApi(TrackingEventsServiceModule trackingEventsServiceModule, Retrofit retrofit) {
        TrackingEventsServiceApi provideTrackingEventsServiceApi = trackingEventsServiceModule.provideTrackingEventsServiceApi(retrofit);
        Preconditions.checkNotNullFromProvides(provideTrackingEventsServiceApi);
        return provideTrackingEventsServiceApi;
    }

    @Override // javax.inject.Provider
    public TrackingEventsServiceApi get() {
        return provideTrackingEventsServiceApi(this.module, (Retrofit) this.retrofitProvider.get());
    }

    public static TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory create(TrackingEventsServiceModule trackingEventsServiceModule, Provider provider) {
        return new TrackingEventsServiceModule_ProvideTrackingEventsServiceApiFactory(trackingEventsServiceModule, provider);
    }
}
