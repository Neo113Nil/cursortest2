package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class BitcoinAddressState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BitcoinAddressState.Companion.getClass();
        if (i == 0) {
            return BitcoinAddressState.BITCOIN_ADDRESS_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return BitcoinAddressState.BITCOIN_ADDRESS_STATE_REQUESTED;
        }
        if (i == 2) {
            return BitcoinAddressState.BITCOIN_ADDRESS_STATE_CREATED;
        }
        if (i != 3) {
            return null;
        }
        return BitcoinAddressState.BITCOIN_ADDRESS_STATE_FAILED;
    }
}
