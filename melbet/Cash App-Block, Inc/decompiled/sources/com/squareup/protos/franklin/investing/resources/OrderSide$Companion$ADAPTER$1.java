package com.squareup.protos.franklin.investing.resources;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class OrderSide$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OrderSide.Companion.getClass();
        if (i == 1) {
            return OrderSide.BUY;
        }
        if (i == 2) {
            return OrderSide.SELL;
        }
        if (i != 3) {
            return null;
        }
        return OrderSide.SELL_ALL;
    }
}
