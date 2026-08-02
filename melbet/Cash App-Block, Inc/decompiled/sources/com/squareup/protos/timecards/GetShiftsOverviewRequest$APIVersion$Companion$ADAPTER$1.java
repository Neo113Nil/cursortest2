package com.squareup.protos.timecards;

import com.squareup.protos.timecards.GetShiftsOverviewRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class GetShiftsOverviewRequest$APIVersion$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetShiftsOverviewRequest.APIVersion.Companion.getClass();
        if (i == 0) {
            return GetShiftsOverviewRequest.APIVersion.DO_NOT_USE;
        }
        if (i == 1) {
            return GetShiftsOverviewRequest.APIVersion.V1;
        }
        if (i != 2) {
            return null;
        }
        return GetShiftsOverviewRequest.APIVersion.V2;
    }
}
