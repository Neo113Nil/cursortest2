package com.withpersona.sdk2.inquiry.tracking;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes9.dex */
public final class TrackingMetadataProvider_Factory implements Factory {
    private final Provider contextProvider;

    public TrackingMetadataProvider_Factory(Provider provider) {
        this.contextProvider = provider;
    }

    public static TrackingMetadataProvider_Factory create(javax.inject.Provider provider) {
        return new TrackingMetadataProvider_Factory(Providers.asDaggerProvider(provider));
    }

    public static TrackingMetadataProvider newInstance(Context context) {
        return new TrackingMetadataProvider(context);
    }

    @Override // javax.inject.Provider
    public TrackingMetadataProvider get() {
        return newInstance((Context) this.contextProvider.get());
    }

    public static TrackingMetadataProvider_Factory create(Provider provider) {
        return new TrackingMetadataProvider_Factory(provider);
    }
}
