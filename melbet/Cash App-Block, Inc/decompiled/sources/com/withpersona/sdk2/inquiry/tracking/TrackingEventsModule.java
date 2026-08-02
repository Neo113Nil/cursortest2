package com.withpersona.sdk2.inquiry.tracking;

import com.squareup.moshi.JsonAdapter;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLoggerImpl;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0013\u0010\n\u001a\r\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsModule;", "", "trackingEventServerEndpoint", "", "<init>", "(Ljava/lang/String;)V", "trackingEventsLogger", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;", "factory", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLoggerImpl$Factory;", "provideMoshiJsonAdapterFactory", "", "Lcom/squareup/moshi/JsonAdapter$Factory;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrackingEventsModule {
    private final String trackingEventServerEndpoint;

    public TrackingEventsModule(String str) {
        str.getClass();
        this.trackingEventServerEndpoint = str;
    }

    public final Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
        return SetsKt__SetsJVMKt.setOf(TrackingEvent.INSTANCE.createAdapter());
    }

    public final TrackingEventsLogger trackingEventsLogger(TrackingEventsLoggerImpl.Factory factory) {
        factory.getClass();
        return factory.create(this.trackingEventServerEndpoint);
    }
}
