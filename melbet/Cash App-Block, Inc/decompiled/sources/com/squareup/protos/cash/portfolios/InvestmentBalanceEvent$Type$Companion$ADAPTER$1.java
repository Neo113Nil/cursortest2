package com.squareup.protos.cash.portfolios;

import com.squareup.protos.cash.portfolios.InvestmentBalanceEvent;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class InvestmentBalanceEvent$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InvestmentBalanceEvent.Type.Companion.getClass();
        if (i == 1) {
            return InvestmentBalanceEvent.Type.BUY;
        }
        if (i != 2) {
            return null;
        }
        return InvestmentBalanceEvent.Type.SELL;
    }
}
