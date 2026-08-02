package com.squareup.protos.wire.roster.mds;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BusinessUnit$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BusinessUnit.Companion.getClass();
        if (i == 0) {
            return BusinessUnit.DEFAULT_BUSINESS_UNIT_DO_NOT_USE;
        }
        if (i == 1) {
            return BusinessUnit.SQUARE;
        }
        if (i == 2) {
            return BusinessUnit.CASH_APP;
        }
        if (i != 3) {
            return null;
        }
        return BusinessUnit.AFTERPAY;
    }
}
