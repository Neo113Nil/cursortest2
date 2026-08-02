package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class OrderState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OrderState.Companion.getClass();
        switch (i) {
            case 1:
                return OrderState.QUOTED;
            case 2:
                return OrderState.ABANDONED;
            case 3:
                return OrderState.PLACED;
            case 4:
                return OrderState.FILLED;
            case 5:
                return OrderState.CANCELED;
            case 6:
                return OrderState.REJECTED;
            case 7:
                return OrderState.EXPIRED;
            case 8:
                return OrderState.NEW;
            default:
                return null;
        }
    }
}
