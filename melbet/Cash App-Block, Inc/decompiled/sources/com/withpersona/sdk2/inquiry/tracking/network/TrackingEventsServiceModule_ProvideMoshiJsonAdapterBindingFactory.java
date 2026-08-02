package com.withpersona.sdk2.inquiry.tracking.network;

import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Set;

/* loaded from: classes9.dex */
public final class TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory implements Factory {

    public static final class InstanceHolder {
        static final TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory INSTANCE = new TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory();

        private InstanceHolder() {
        }
    }

    public static TrackingEventsServiceModule_ProvideMoshiJsonAdapterBindingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<JsonAdapterBinding<?>> provideMoshiJsonAdapterBinding() {
        Set<JsonAdapterBinding<?>> provideMoshiJsonAdapterBinding = TrackingEventsServiceModule.provideMoshiJsonAdapterBinding();
        Preconditions.checkNotNullFromProvides(provideMoshiJsonAdapterBinding);
        return provideMoshiJsonAdapterBinding;
    }

    @Override // javax.inject.Provider
    public Set<JsonAdapterBinding<?>> get() {
        return provideMoshiJsonAdapterBinding();
    }
}
