package com.withpersona.sdk2.inquiry.tracking;

import dagger.internal.Factory;

/* loaded from: classes9.dex */
public final class TrackingEventsCache_Factory implements Factory {

    public static final class InstanceHolder {
        static final TrackingEventsCache_Factory INSTANCE = new TrackingEventsCache_Factory();

        private InstanceHolder() {
        }
    }

    public static TrackingEventsCache_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static TrackingEventsCache newInstance() {
        return new TrackingEventsCache();
    }

    @Override // javax.inject.Provider
    public TrackingEventsCache get() {
        return newInstance();
    }
}
