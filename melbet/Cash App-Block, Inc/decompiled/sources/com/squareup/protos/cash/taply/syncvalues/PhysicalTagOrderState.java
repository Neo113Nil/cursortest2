package com.squareup.protos.cash.taply.syncvalues;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum PhysicalTagOrderState implements WireEnum {
    PHYSICAL_TAG_ORDER_STATE_UNSPECIFIED(0),
    PHYSICAL_TAG_ORDER_STATE_PREPARING(1),
    PHYSICAL_TAG_ORDER_STATE_SHIPPED(2),
    PHYSICAL_TAG_ORDER_STATE_PENDING_ACTIVATION(3),
    PHYSICAL_TAG_ORDER_STATE_COMPLETE(4);

    public static final PhysicalTagOrderState$Companion$ADAPTER$1 ADAPTER;
    public static final TransactionType.Companion Companion;
    public final int value;

    static {
        PhysicalTagOrderState physicalTagOrderState = PHYSICAL_TAG_ORDER_STATE_UNSPECIFIED;
        Companion = new TransactionType.Companion();
        ADAPTER = new PhysicalTagOrderState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PhysicalTagOrderState.class), Syntax.PROTO_2, physicalTagOrderState);
    }

    PhysicalTagOrderState(int i) {
        this.value = i;
    }

    public static final PhysicalTagOrderState fromValue(int i) {
        Companion.getClass();
        return TransactionType.Companion.m3917fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
