package com.squareup.lending;

import com.squareup.lending.CashCreditScoreHomeData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashCreditScoreHomeData$TextAlignment$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashCreditScoreHomeData.TextAlignment.Companion.getClass();
        if (i == 1) {
            return CashCreditScoreHomeData.TextAlignment.LEADING;
        }
        if (i != 2) {
            return null;
        }
        return CashCreditScoreHomeData.TextAlignment.CENTERED;
    }
}
