package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum BitcoinAddressState implements WireEnum {
    BITCOIN_ADDRESS_STATE_UNSPECIFIED(0),
    BITCOIN_ADDRESS_STATE_REQUESTED(1),
    BITCOIN_ADDRESS_STATE_CREATED(2),
    BITCOIN_ADDRESS_STATE_FAILED(3);

    public static final BitcoinAddressState$Companion$ADAPTER$1 ADAPTER;
    public static final Channel.Companion Companion;
    public final int value;

    static {
        BitcoinAddressState bitcoinAddressState = BITCOIN_ADDRESS_STATE_UNSPECIFIED;
        Companion = new Channel.Companion();
        ADAPTER = new BitcoinAddressState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(BitcoinAddressState.class), Syntax.PROTO_2, bitcoinAddressState);
    }

    BitcoinAddressState(int i) {
        this.value = i;
    }

    public static final BitcoinAddressState fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return BITCOIN_ADDRESS_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return BITCOIN_ADDRESS_STATE_REQUESTED;
        }
        if (i == 2) {
            return BITCOIN_ADDRESS_STATE_CREATED;
        }
        if (i != 3) {
            return null;
        }
        return BITCOIN_ADDRESS_STATE_FAILED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
