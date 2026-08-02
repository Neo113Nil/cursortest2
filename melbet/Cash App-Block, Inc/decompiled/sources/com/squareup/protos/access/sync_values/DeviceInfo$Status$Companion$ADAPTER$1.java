package com.squareup.protos.access.sync_values;

import com.squareup.protos.access.sync_values.DeviceInfo;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DeviceInfo$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DeviceInfo.Status.Companion.getClass();
        if (i == 1) {
            return DeviceInfo.Status.LOGGED_IN;
        }
        if (i == 2) {
            return DeviceInfo.Status.LOGGED_OUT;
        }
        if (i != 3) {
            return null;
        }
        return DeviceInfo.Status.HARD_SIGNED_OUT;
    }
}
