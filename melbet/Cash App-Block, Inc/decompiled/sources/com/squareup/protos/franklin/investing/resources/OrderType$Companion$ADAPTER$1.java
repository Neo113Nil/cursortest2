package com.squareup.protos.franklin.investing.resources;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class OrderType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OrderType.Companion.getClass();
        if (i == 1) {
            return OrderType.MARKET;
        }
        if (i != 2) {
            return null;
        }
        return OrderType.MARKET_WHEN_TOUCHED;
    }
}
