package com.squareup.protos.timecards;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ShiftOptions$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ShiftOptions.Companion.getClass();
        if (i == 1) {
            return ShiftOptions.DO_NOT_USE;
        }
        if (i == 2) {
            return ShiftOptions.TIMECARDS_ONLY;
        }
        if (i != 3) {
            return null;
        }
        return ShiftOptions.SCHEDULES_AND_TIMECARDS;
    }
}
