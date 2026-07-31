package ru.rustore.sdk.analytics.event;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public abstract class AnalyticsEvent {

    @NotNull
    private final Map<String, String> eventData = MapsKt.emptyMap();

    @NotNull
    public Map<String, String> getEventData() {
        return this.eventData;
    }

    @NotNull
    public abstract String getEventName();
}
