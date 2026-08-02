package com.squareup.protos.cash.transfers;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum TransferClientRouteSource implements WireEnum {
    UNKNOWN(0),
    INSTRUMENT_SELECTION(1);

    public static final TransferClientRouteSource$Companion$ADAPTER$1 ADAPTER;
    public static final TransactionType.Companion Companion;
    public final int value;

    static {
        TransferClientRouteSource transferClientRouteSource = UNKNOWN;
        Companion = new TransactionType.Companion();
        ADAPTER = new TransferClientRouteSource$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TransferClientRouteSource.class), Syntax.PROTO_2, transferClientRouteSource);
    }

    TransferClientRouteSource(int i) {
        this.value = i;
    }

    public static final TransferClientRouteSource fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return INSTRUMENT_SELECTION;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
