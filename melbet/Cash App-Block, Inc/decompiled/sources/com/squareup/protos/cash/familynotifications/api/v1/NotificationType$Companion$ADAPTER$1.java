package com.squareup.protos.cash.familynotifications.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class NotificationType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        NotificationType.Companion.getClass();
        if (i == 0) {
            return NotificationType.NOTIFICATION_TYPE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return NotificationType.NOTIFICATION_TYPE_REALTIME;
    }
}
