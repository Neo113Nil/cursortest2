package com.squareup.protos.investing.notifications.settings;

import com.squareup.protos.investing.notifications.settings.NotificationsSettingsOptionsConfiguration;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class NotificationsSettingsOptionsConfiguration$NotificationsSettingsOptionsConfigurationType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        NotificationsSettingsOptionsConfiguration.NotificationsSettingsOptionsConfigurationType.Companion.getClass();
        if (i == 0) {
            return NotificationsSettingsOptionsConfiguration.NotificationsSettingsOptionsConfigurationType.UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return NotificationsSettingsOptionsConfiguration.NotificationsSettingsOptionsConfigurationType.PERFORMANCE;
    }
}
