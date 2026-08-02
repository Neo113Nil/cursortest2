package com.squareup.protos.timecards.scheduling;

import com.squareup.protos.timecards.scheduling.ShiftCover;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ShiftCover$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ShiftCover.Status.Companion.getClass();
        switch (i) {
            case 0:
                return ShiftCover.Status.DO_NOT_USE;
            case 1:
                return ShiftCover.Status.PENDING;
            case 2:
                return ShiftCover.Status.DECLINED;
            case 3:
                return ShiftCover.Status.APPROVED;
            case 4:
                return ShiftCover.Status.CANCELED;
            case 5:
                return ShiftCover.Status.EXPIRED;
            case 6:
                return ShiftCover.Status.OBSOLETE;
            default:
                return null;
        }
    }
}
