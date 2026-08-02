package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.CryptoOrderRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CryptoOrderRenderData$OrderSide$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CryptoOrderRenderData.OrderSide.Companion.getClass();
        if (i == 1) {
            return CryptoOrderRenderData.OrderSide.BUY;
        }
        if (i != 2) {
            return null;
        }
        return CryptoOrderRenderData.OrderSide.SELL;
    }
}
