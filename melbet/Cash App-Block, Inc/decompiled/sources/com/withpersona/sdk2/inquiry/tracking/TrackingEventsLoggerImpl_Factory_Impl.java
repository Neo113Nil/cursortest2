package com.withpersona.sdk2.inquiry.tracking;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes9.dex */
public final class TrackingEventsLoggerImpl_Factory_Impl implements TrackingEventsLoggerImpl.Factory {
    private final C0352TrackingEventsLoggerImpl_Factory delegateFactory;

    public TrackingEventsLoggerImpl_Factory_Impl(C0352TrackingEventsLoggerImpl_Factory c0352TrackingEventsLoggerImpl_Factory) {
        this.delegateFactory = c0352TrackingEventsLoggerImpl_Factory;
    }

    public static Provider create(C0352TrackingEventsLoggerImpl_Factory c0352TrackingEventsLoggerImpl_Factory) {
        return InstanceFactory.create(new TrackingEventsLoggerImpl_Factory_Impl(c0352TrackingEventsLoggerImpl_Factory));
    }

    public static dagger.internal.Provider createFactoryProvider(C0352TrackingEventsLoggerImpl_Factory c0352TrackingEventsLoggerImpl_Factory) {
        return InstanceFactory.create(new TrackingEventsLoggerImpl_Factory_Impl(c0352TrackingEventsLoggerImpl_Factory));
    }

    @Override // com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl.Factory
    public TrackingEventsLoggerImpl create(String str) {
        return this.delegateFactory.get(str);
    }
}
