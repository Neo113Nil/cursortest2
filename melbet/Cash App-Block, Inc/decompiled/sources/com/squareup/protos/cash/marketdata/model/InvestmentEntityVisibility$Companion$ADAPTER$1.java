package com.squareup.protos.cash.marketdata.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class InvestmentEntityVisibility$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InvestmentEntityVisibility.Companion.getClass();
        if (i == 1) {
            return InvestmentEntityVisibility.VISIBLE;
        }
        if (i == 2) {
            return InvestmentEntityVisibility.INVISIBLE;
        }
        if (i != 3) {
            return null;
        }
        return InvestmentEntityVisibility.DECOMMISSIONED;
    }
}
