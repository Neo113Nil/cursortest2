package com.squareup.protos.investing.notifications.settings;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class NotificationsSettingsOptionsConfiguration$Value$Performance {
    public final NotificationsSettingsPerformanceConfiguration value;

    public NotificationsSettingsOptionsConfiguration$Value$Performance(NotificationsSettingsPerformanceConfiguration notificationsSettingsPerformanceConfiguration) {
        notificationsSettingsPerformanceConfiguration.getClass();
        this.value = notificationsSettingsPerformanceConfiguration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationsSettingsOptionsConfiguration$Value$Performance) && Intrinsics.areEqual(this.value, ((NotificationsSettingsOptionsConfiguration$Value$Performance) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Performance(value=" + this.value + ")";
    }
}
