package com.squareup.protos.cash.marketdata.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class InvestmentEntityTradability$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InvestmentEntityTradability.Companion.getClass();
        if (i == 1) {
            return InvestmentEntityTradability.UNTRADABLE;
        }
        if (i == 2) {
            return InvestmentEntityTradability.TRADABLE;
        }
        if (i != 3) {
            return null;
        }
        return InvestmentEntityTradability.SELLABLE;
    }
}
