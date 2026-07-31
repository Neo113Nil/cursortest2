package ru.rustore.sdk.analytics.event.common;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.analytics.event.AnalyticsEvent;

@Metadata
/* loaded from: classes3.dex */
public final class SdkInfoAnalyticsEvent extends AnalyticsEvent {

    @NotNull
    private final Map<String, String> eventData;

    @NotNull
    private final String eventName;

    public SdkInfoAnalyticsEvent(@NotNull String name, @NotNull String version, @NotNull String type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(type, "type");
        this.eventName = "sdkInfo";
        this.eventData = MapsKt.mapOf(TuplesKt.to("sdkName", name), TuplesKt.to("sdkVersion", version), TuplesKt.to("sdkType", type));
    }

    @Override // ru.rustore.sdk.analytics.event.AnalyticsEvent
    @NotNull
    public Map<String, String> getEventData() {
        return this.eventData;
    }

    @Override // ru.rustore.sdk.analytics.event.AnalyticsEvent
    @NotNull
    public String getEventName() {
        return this.eventName;
    }
}
