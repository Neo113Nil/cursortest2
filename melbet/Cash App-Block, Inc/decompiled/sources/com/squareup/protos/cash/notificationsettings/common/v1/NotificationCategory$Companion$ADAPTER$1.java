package com.squareup.protos.cash.notificationsettings.common.v1;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class NotificationCategory$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        NotificationCategory.Companion.getClass();
        return Origin.Companion.m3886fromValue(i);
    }
}
