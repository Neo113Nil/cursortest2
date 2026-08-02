package com.squareup.protos.franklin.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class OnchainTransactionType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OnchainTransactionType.Companion.getClass();
        if (i == 1) {
            return OnchainTransactionType.REGULAR;
        }
        if (i == 2) {
            return OnchainTransactionType.BITKEY_TRANSFER;
        }
        if (i == 3) {
            return OnchainTransactionType.BITKEY_BUY;
        }
        if (i != 4) {
            return null;
        }
        return OnchainTransactionType.BITKEY_SELL;
    }
}
