package com.squareup.protos.timecards;

import com.squareup.protos.timecards.GetShiftsOverviewResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class GetShiftsOverviewResponse$IntervalType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetShiftsOverviewResponse.IntervalType.Companion.getClass();
        if (i == 0) {
            return GetShiftsOverviewResponse.IntervalType.INTERVAL_TYPE_DO_NOT_USE;
        }
        if (i == 1) {
            return GetShiftsOverviewResponse.IntervalType.PAY_PERIOD;
        }
        if (i != 2) {
            return null;
        }
        return GetShiftsOverviewResponse.IntervalType.WORKWEEK;
    }
}
