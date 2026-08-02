package com.squareup.protos.employeejobs;

import com.squareup.protos.employeejobs.Wage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Wage$WageType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Wage.WageType.Companion.getClass();
        if (i == 0) {
            return Wage.WageType.HOURLY;
        }
        if (i == 1) {
            return Wage.WageType.ANNUAL;
        }
        if (i != 2) {
            return null;
        }
        return Wage.WageType.NONE;
    }
}
