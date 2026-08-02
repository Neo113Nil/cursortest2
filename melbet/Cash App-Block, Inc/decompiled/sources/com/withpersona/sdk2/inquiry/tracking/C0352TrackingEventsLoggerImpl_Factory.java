package com.withpersona.sdk2.inquiry.tracking;

import android.content.Context;
import com.squareup.moshi.Moshi;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl_Factory, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0352TrackingEventsLoggerImpl_Factory {
    private final Provider cacheProvider;
    private final Provider contextProvider;
    private final Provider metadataProvider;
    private final Provider moshiProvider;
    private final Provider sdkFilesManagerProvider;

    public C0352TrackingEventsLoggerImpl_Factory(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.contextProvider = provider;
        this.cacheProvider = provider2;
        this.moshiProvider = provider3;
        this.metadataProvider = provider4;
        this.sdkFilesManagerProvider = provider5;
    }

    public static C0352TrackingEventsLoggerImpl_Factory create(javax.inject.Provider provider, javax.inject.Provider provider2, javax.inject.Provider provider3, javax.inject.Provider provider4, javax.inject.Provider provider5) {
        return new C0352TrackingEventsLoggerImpl_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4), Providers.asDaggerProvider(provider5));
    }

    public static TrackingEventsLoggerImpl newInstance(Context context, TrackingEventsCache trackingEventsCache, Moshi moshi, TrackingMetadataProvider trackingMetadataProvider, SdkFilesManager sdkFilesManager, String str) {
        return new TrackingEventsLoggerImpl(context, trackingEventsCache, moshi, trackingMetadataProvider, sdkFilesManager, str);
    }

    public TrackingEventsLoggerImpl get(String str) {
        return newInstance((Context) this.contextProvider.get(), (TrackingEventsCache) this.cacheProvider.get(), (Moshi) this.moshiProvider.get(), (TrackingMetadataProvider) this.metadataProvider.get(), (SdkFilesManager) this.sdkFilesManagerProvider.get(), str);
    }

    public static C0352TrackingEventsLoggerImpl_Factory create(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        return new C0352TrackingEventsLoggerImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }
}
