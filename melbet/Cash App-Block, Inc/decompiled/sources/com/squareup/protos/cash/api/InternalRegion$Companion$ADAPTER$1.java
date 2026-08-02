package com.squareup.protos.cash.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class InternalRegion$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InternalRegion.Companion.getClass();
        if (i == 1) {
            return InternalRegion.CASH_US_WEST_2;
        }
        return null;
    }
}
