package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TradingModel$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TradingModel.Companion.getClass();
        if (i == 1) {
            return TradingModel.PRINCIPAL;
        }
        if (i != 2) {
            return null;
        }
        return TradingModel.AGENCY;
    }
}
