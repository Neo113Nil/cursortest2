package com.squareup.protos.cash.portfolios.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class UnitType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UnitType.Companion.getClass();
        if (i == 1) {
            return UnitType.SLICE;
        }
        if (i != 2) {
            return null;
        }
        return UnitType.SATOSHI;
    }
}
