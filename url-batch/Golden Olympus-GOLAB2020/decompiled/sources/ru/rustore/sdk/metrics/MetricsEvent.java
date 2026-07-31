package ru.rustore.sdk.metrics;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public final class MetricsEvent {
    private final Map<String, String> eventData;
    private final String eventName;
    private final long eventTime;

    public MetricsEvent(String eventName, Map<String, String> eventData, long j4) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.eventName = eventName;
        this.eventData = eventData;
        this.eventTime = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricsEvent)) {
            return false;
        }
        MetricsEvent metricsEvent = (MetricsEvent) obj;
        return Intrinsics.areEqual(this.eventName, metricsEvent.eventName) && Intrinsics.areEqual(this.eventData, metricsEvent.eventData);
    }

    public final Map<String, String> getEventData() {
        return this.eventData;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final long getEventTime$sdk_public_metrics_release() {
        return this.eventTime;
    }

    public int hashCode() {
        return this.eventData.hashCode() + (this.eventName.hashCode() * 31);
    }

    public String toString() {
        return "MetricsEvent(eventName='" + this.eventName + "', eventData=" + this.eventData + ", eventTime=" + this.eventTime + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetricsEvent(String eventName, Map<String, String> eventData) {
        this(eventName, eventData, System.currentTimeMillis());
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
    }
}
