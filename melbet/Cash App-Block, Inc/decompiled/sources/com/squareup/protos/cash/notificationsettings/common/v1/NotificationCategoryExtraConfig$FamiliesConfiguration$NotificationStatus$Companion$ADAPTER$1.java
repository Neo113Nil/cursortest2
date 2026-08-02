package com.squareup.protos.cash.notificationsettings.common.v1;

import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class NotificationCategoryExtraConfig$FamiliesConfiguration$NotificationStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.Companion.getClass();
        if (i == 0) {
            return NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.NOTIFICATION_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.NOTIFICATION_STATUS_ENABLED_ON;
        }
        if (i == 2) {
            return NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.NOTIFICATION_STATUS_ENABLED_OFF;
        }
        if (i != 3) {
            return null;
        }
        return NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus.NOTIFICATION_STATUS_DISABLED;
    }
}
