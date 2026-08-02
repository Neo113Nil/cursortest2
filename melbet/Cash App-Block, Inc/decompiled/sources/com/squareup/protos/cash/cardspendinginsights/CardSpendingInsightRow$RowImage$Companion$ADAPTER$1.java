package com.squareup.protos.cash.cardspendinginsights;

import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightRow;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CardSpendingInsightRow$RowImage$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardSpendingInsightRow.RowImage.Companion.getClass();
        if (i == 1) {
            return CardSpendingInsightRow.RowImage.TOP_LOCATIONS;
        }
        if (i == 2) {
            return CardSpendingInsightRow.RowImage.RECURRING_PAYMENTS;
        }
        if (i != 3) {
            return null;
        }
        return CardSpendingInsightRow.RowImage.AI_SUMMARY;
    }
}
