package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum OperationType implements WireEnum {
    OPERATION_TYPE_UNSPECIFIED(0),
    OPERATION_TYPE_SAME_CHAIN_SEND(1),
    OPERATION_TYPE_CROSS_CHAIN_SEND(2),
    OPERATION_TYPE_RECEIVE(3),
    OPERATION_TYPE_CARD_SPEND(4),
    OPERATION_TYPE_LITE_P2P_SEND(5),
    OPERATION_TYPE_CROSS_CHAIN_RECEIVE(6),
    OPERATION_TYPE_APPROVE_CARD(7),
    OPERATION_TYPE_REVOKE_CARD(8),
    OPERATION_TYPE_SWAP(9);

    public static final OperationType$Companion$ADAPTER$1 ADAPTER;
    public static final Alignment.Companion Companion;
    public final int value;

    static {
        OperationType operationType = OPERATION_TYPE_UNSPECIFIED;
        Companion = new Alignment.Companion();
        ADAPTER = new OperationType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OperationType.class), Syntax.PROTO_2, operationType);
    }

    OperationType(int i) {
        this.value = i;
    }

    public static final OperationType fromValue(int i) {
        Companion.getClass();
        return Alignment.Companion.fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
