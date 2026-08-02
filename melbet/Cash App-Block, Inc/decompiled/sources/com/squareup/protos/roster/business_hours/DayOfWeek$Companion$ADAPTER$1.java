package com.squareup.protos.roster.business_hours;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class DayOfWeek$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DayOfWeek.Companion.getClass();
        switch (i) {
            case 0:
                return DayOfWeek.SUN;
            case 1:
                return DayOfWeek.MON;
            case 2:
                return DayOfWeek.TUE;
            case 3:
                return DayOfWeek.WED;
            case 4:
                return DayOfWeek.THU;
            case 5:
                return DayOfWeek.FRI;
            case 6:
                return DayOfWeek.SAT;
            default:
                return null;
        }
    }
}
