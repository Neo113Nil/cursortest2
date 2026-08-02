package com.squareup.protos.cash.investcrypto.event;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LedgerProcessor$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LedgerProcessor.Companion.getClass();
        if (i == 2) {
            return LedgerProcessor.MONEY_MOVER;
        }
        if (i != 3) {
            return null;
        }
        return LedgerProcessor.BANKLIN;
    }
}
