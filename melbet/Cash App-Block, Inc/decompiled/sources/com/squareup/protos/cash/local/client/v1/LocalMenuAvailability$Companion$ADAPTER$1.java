package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalMenuAvailability$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalMenuAvailability.Companion.getClass();
        if (i == 0) {
            return LocalMenuAvailability.LOCAL_MENU_AVAILABILITY_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalMenuAvailability.LOCAL_MENU_AVAILABILITY_NORMAL;
        }
        if (i != 2) {
            return null;
        }
        return LocalMenuAvailability.LOCAL_MENU_AVAILABILITY_SOLD_OUT;
    }
}
