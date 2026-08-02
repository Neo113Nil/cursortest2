package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class OrderSide$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OrderSide.Companion.getClass();
        if (i == 1) {
            return OrderSide.BUY;
        }
        if (i != 2) {
            return null;
        }
        return OrderSide.SELL;
    }
}
