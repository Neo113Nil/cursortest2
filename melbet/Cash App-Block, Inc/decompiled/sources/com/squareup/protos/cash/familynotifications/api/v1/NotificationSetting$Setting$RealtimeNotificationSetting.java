package com.squareup.protos.cash.familynotifications.api.v1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class NotificationSetting$Setting$RealtimeNotificationSetting {
    public final RealtimeNotificationSetting value;

    public NotificationSetting$Setting$RealtimeNotificationSetting(RealtimeNotificationSetting realtimeNotificationSetting) {
        realtimeNotificationSetting.getClass();
        this.value = realtimeNotificationSetting;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationSetting$Setting$RealtimeNotificationSetting) && Intrinsics.areEqual(this.value, ((NotificationSetting$Setting$RealtimeNotificationSetting) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "RealtimeNotificationSetting(value=" + this.value + ")";
    }
}
