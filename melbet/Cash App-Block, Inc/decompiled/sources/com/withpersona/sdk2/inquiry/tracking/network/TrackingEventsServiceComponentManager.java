package com.withpersona.sdk2.inquiry.tracking.network;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.core.NetworkCoreModule;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\b\u0006¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponentManager;", "", "<init>", "()V", "INSTANCE", "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceComponent;", "INSTANCE$1", "getInstance", "context", "Landroid/content/Context;", "serverEndpoint", "", "newTrackingEventsServiceComponent", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TrackingEventsServiceComponentManager {
    public static final TrackingEventsServiceComponentManager INSTANCE = new TrackingEventsServiceComponentManager();

    /* renamed from: INSTANCE$1, reason: from kotlin metadata */
    private static volatile TrackingEventsServiceComponent INSTANCE;

    private TrackingEventsServiceComponentManager() {
    }

    private final TrackingEventsServiceComponent newTrackingEventsServiceComponent(Context context, String serverEndpoint) {
        TrackingEventsServiceComponent build = DaggerTrackingEventsServiceComponent.builder().trackingEventsServiceModule(new TrackingEventsServiceModule(context, serverEndpoint)).networkCoreModule(new NetworkCoreModule(true, null, null, null, 2, null)).build();
        build.getClass();
        return build;
    }

    public final TrackingEventsServiceComponent getInstance(Context context, String serverEndpoint) {
        TrackingEventsServiceComponent trackingEventsServiceComponent;
        context.getClass();
        serverEndpoint.getClass();
        TrackingEventsServiceComponent trackingEventsServiceComponent2 = INSTANCE;
        if (trackingEventsServiceComponent2 != null) {
            return trackingEventsServiceComponent2;
        }
        synchronized (this) {
            trackingEventsServiceComponent = INSTANCE;
            if (trackingEventsServiceComponent == null) {
                trackingEventsServiceComponent = INSTANCE.newTrackingEventsServiceComponent(context, serverEndpoint);
                INSTANCE = trackingEventsServiceComponent;
            }
        }
        return trackingEventsServiceComponent;
    }
}
