package com.stripe.android.core.networking;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

/* loaded from: classes8.dex */
public final class RealAnalyticsRequestV2Storage_Factory implements Factory {
    public final Provider contextProvider;

    public RealAnalyticsRequestV2Storage_Factory(InstanceFactory instanceFactory) {
        this.contextProvider = instanceFactory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new RealAnalyticsRequestV2Storage((Context) this.contextProvider.get());
    }
}
