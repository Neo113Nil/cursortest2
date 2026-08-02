package com.squareup.lending.sync_values;

import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ToggleEntryPointData$ToggleState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ToggleEntryPointData.ToggleState.Companion.getClass();
        if (i == 0) {
            return ToggleEntryPointData.ToggleState.TOGGLE_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return ToggleEntryPointData.ToggleState.TURNED_OFF;
        }
        if (i == 2) {
            return ToggleEntryPointData.ToggleState.TURNED_ON;
        }
        if (i != 3) {
            return null;
        }
        return ToggleEntryPointData.ToggleState.DISABLED;
    }
}
