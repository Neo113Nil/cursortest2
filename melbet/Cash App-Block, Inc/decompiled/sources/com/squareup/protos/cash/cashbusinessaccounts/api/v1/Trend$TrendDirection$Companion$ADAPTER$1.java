package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import com.squareup.protos.cash.cashbusinessaccounts.api.v1.Trend;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Trend$TrendDirection$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Trend.TrendDirection.Companion.getClass();
        if (i == 1) {
            return Trend.TrendDirection.TREND_DIRECTION_POSITIVE;
        }
        if (i != 2) {
            return null;
        }
        return Trend.TrendDirection.TREND_DIRECTION_NEGATIVE;
    }
}
