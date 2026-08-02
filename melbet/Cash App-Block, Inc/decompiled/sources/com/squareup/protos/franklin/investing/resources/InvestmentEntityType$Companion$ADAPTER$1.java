package com.squareup.protos.franklin.investing.resources;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class InvestmentEntityType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InvestmentEntityType.Companion.getClass();
        if (i == 1) {
            return InvestmentEntityType.CURRENCY;
        }
        if (i == 2) {
            return InvestmentEntityType.STOCK;
        }
        if (i != 3) {
            return null;
        }
        return InvestmentEntityType.ETF;
    }
}
