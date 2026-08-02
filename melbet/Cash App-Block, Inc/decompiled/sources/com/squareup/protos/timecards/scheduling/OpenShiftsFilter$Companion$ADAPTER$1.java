package com.squareup.protos.timecards.scheduling;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class OpenShiftsFilter$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OpenShiftsFilter.Companion.getClass();
        if (i == 0) {
            return OpenShiftsFilter.INCLUDE;
        }
        if (i == 1) {
            return OpenShiftsFilter.EXCLUDE;
        }
        if (i != 2) {
            return null;
        }
        return OpenShiftsFilter.ONLY;
    }
}
