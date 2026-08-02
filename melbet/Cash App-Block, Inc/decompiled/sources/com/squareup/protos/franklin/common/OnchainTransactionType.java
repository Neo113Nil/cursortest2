package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum OnchainTransactionType implements WireEnum {
    REGULAR(1),
    BITKEY_TRANSFER(2),
    BITKEY_BUY(3),
    BITKEY_SELL(4);

    public final int value;
    public static final LinkResult.Companion Companion = new LinkResult.Companion();
    public static final OnchainTransactionType$Companion$ADAPTER$1 ADAPTER = new OnchainTransactionType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OnchainTransactionType.class), Syntax.PROTO_2, null);

    OnchainTransactionType(int i) {
        this.value = i;
    }

    public static final OnchainTransactionType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return REGULAR;
        }
        if (i == 2) {
            return BITKEY_TRANSFER;
        }
        if (i == 3) {
            return BITKEY_BUY;
        }
        if (i != 4) {
            return null;
        }
        return BITKEY_SELL;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
