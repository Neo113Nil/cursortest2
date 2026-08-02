package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.CryptoOrderRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CryptoOrderRenderData$OrderType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CryptoOrderRenderData.OrderType.Companion.getClass();
        if (i == 1) {
            return CryptoOrderRenderData.OrderType.MARKET;
        }
        if (i != 2) {
            return null;
        }
        return CryptoOrderRenderData.OrderType.CUSTOM;
    }
}
