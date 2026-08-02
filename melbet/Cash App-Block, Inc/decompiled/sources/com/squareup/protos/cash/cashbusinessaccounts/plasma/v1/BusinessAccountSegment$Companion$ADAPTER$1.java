package com.squareup.protos.cash.cashbusinessaccounts.plasma.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class BusinessAccountSegment$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BusinessAccountSegment.Companion.getClass();
        if (i == 0) {
            return BusinessAccountSegment.X_SMALL;
        }
        if (i == 1) {
            return BusinessAccountSegment.SMALL;
        }
        if (i == 2) {
            return BusinessAccountSegment.MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return BusinessAccountSegment.LARGE;
    }
}
