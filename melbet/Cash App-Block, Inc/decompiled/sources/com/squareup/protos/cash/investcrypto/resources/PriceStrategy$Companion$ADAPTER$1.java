package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PriceStrategy$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PriceStrategy.Companion.getClass();
        switch (i) {
            case 1:
                return PriceStrategy.NO_INCORPORATED_SPREAD;
            case 2:
                return PriceStrategy.TWENTY_FIVE_PERCENT_INCORPORATED_SPREAD;
            case 3:
                return PriceStrategy.TWENTY_FIVE_BASIS_POINTS_INCORPORATED_SPREAD;
            case 4:
                return PriceStrategy.FIFTY_BASIS_POINTS_INCORPORATED_SPREAD;
            case 5:
                return PriceStrategy.ONE_HUNDRED_BASIS_POINTS_INCORPORATED_SPREAD;
            case 6:
                return PriceStrategy.SEVENTY_FIVE_BASIS_POINTS_INCORPORATED_SPREAD;
            default:
                return null;
        }
    }
}
