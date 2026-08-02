package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalMenuHoursState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalMenuHoursState.Companion.getClass();
        if (i == 0) {
            return LocalMenuHoursState.LOCAL_MENU_HOURS_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalMenuHoursState.LOCAL_MENU_HOURS_STATE_ALWAYS_AVAILABLE;
        }
        if (i == 2) {
            return LocalMenuHoursState.LOCAL_MENU_HOURS_STATE_AVAILABLE_NOW;
        }
        if (i != 3) {
            return null;
        }
        return LocalMenuHoursState.LOCAL_MENU_HOURS_STATE_AVAILABLE_LATER;
    }
}
