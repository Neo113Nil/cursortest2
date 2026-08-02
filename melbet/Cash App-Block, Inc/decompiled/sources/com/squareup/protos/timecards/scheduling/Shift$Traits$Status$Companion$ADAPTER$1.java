package com.squareup.protos.timecards.scheduling;

import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Shift$Traits$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Shift.Traits.Status.Companion.getClass();
        if (i == 0) {
            return Shift.Traits.Status.DO_NOT_USE;
        }
        if (i == 1) {
            return Shift.Traits.Status.SCHEDULED;
        }
        if (i == 2) {
            return Shift.Traits.Status.IN_PROGRESS;
        }
        if (i != 3) {
            return null;
        }
        return Shift.Traits.Status.COMPLETED;
    }
}
