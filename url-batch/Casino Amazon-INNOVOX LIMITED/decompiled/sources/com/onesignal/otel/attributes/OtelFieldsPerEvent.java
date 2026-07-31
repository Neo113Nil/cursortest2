package com.onesignal.otel.attributes;

import com.onesignal.otel.IOtelPlatformProvider;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OtelFieldsPerEvent.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/onesignal/otel/attributes/OtelFieldsPerEvent;", "", "platformProvider", "Lcom/onesignal/otel/IOtelPlatformProvider;", "(Lcom/onesignal/otel/IOtelPlatformProvider;)V", "recordId", "Ljava/util/UUID;", "getRecordId", "()Ljava/util/UUID;", "getAttributes", "", "", "com.onesignal.otel"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OtelFieldsPerEvent {
    private final IOtelPlatformProvider platformProvider;

    public OtelFieldsPerEvent(IOtelPlatformProvider platformProvider) {
        Intrinsics.checkNotNullParameter(platformProvider, "platformProvider");
        this.platformProvider = platformProvider;
    }

    public final Map<String, String> getAttributes() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String uuid = getRecordId().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        linkedHashMap.put("log.record.uid", uuid);
        OtelFieldsTopLevelKt.putIfValueNotNull(OtelFieldsTopLevelKt.putIfValueNotNull(OtelFieldsTopLevelKt.putIfValueNotNull(linkedHashMap, "ossdk.app_id", this.platformProvider.getAppId()), "ossdk.onesignal_id", this.platformProvider.getOnesignalId()), "ossdk.push_subscription_id", this.platformProvider.getPushSubscriptionId());
        linkedHashMap.put("app.state", this.platformProvider.getAppState());
        linkedHashMap.put("process.uptime", String.valueOf(this.platformProvider.getProcessUptime()));
        linkedHashMap.put("thread.name", this.platformProvider.getCurrentThreadName());
        List<String> enabledFeatureFlags = this.platformProvider.getEnabledFeatureFlags();
        if (!enabledFeatureFlags.isEmpty()) {
            linkedHashMap.put("ossdk.feature_flags", CollectionsKt.joinToString$default(CollectionsKt.sorted(enabledFeatureFlags), StringUtils.COMMA, null, null, 0, null, null, 62, null));
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    private final UUID getRecordId() {
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID(...)");
        return randomUUID;
    }
}
