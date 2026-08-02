package com.squareup.protos.cash.spendinginsights;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CardSpendingInsightType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardSpendingInsightType.Companion.getClass();
        if (i == 1) {
            return CardSpendingInsightType.TOP_LOCATIONS;
        }
        if (i == 2) {
            return CardSpendingInsightType.RECURRING_PAYMENTS;
        }
        if (i != 3) {
            return null;
        }
        return CardSpendingInsightType.AI_SUMMARY;
    }
}
