package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.CryptoOrderRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CryptoOrderRenderData$OrderState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CryptoOrderRenderData.OrderState.Companion.getClass();
        switch (i) {
            case 1:
                return CryptoOrderRenderData.OrderState.QUOTED;
            case 2:
                return CryptoOrderRenderData.OrderState.ABANDONED;
            case 3:
                return CryptoOrderRenderData.OrderState.PLACED;
            case 4:
                return CryptoOrderRenderData.OrderState.FILLED;
            case 5:
                return CryptoOrderRenderData.OrderState.CANCELED;
            case 6:
                return CryptoOrderRenderData.OrderState.REJECTED;
            case 7:
                return CryptoOrderRenderData.OrderState.EXPIRED;
            default:
                return null;
        }
    }
}
