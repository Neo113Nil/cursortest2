package com.squareup.protos.franklin.api;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum Payment$State implements WireEnum {
    PENDING(1),
    WAITING_ON_SENDER(2),
    WAITING_ON_RECIPIENT(3),
    WAITING_TO_PAY_OUT(6),
    WAITING_ON_RISK(8),
    COMPLETED(4),
    WAITING_TO_REFUND(7),
    CANCELED(5),
    WAITING_ON_EXTERNAL(9),
    SCHEDULED(10),
    AUTHORIZED(11);

    public final int value;
    public static final TransactionType.Companion Companion = new TransactionType.Companion();
    public static final Payment$State$Companion$ADAPTER$1 ADAPTER = new Payment$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Payment$State.class), Syntax.PROTO_2, null);

    Payment$State(int i) {
        this.value = i;
    }

    public static final Payment$State fromValue(int i) {
        Companion.getClass();
        return TransactionType.Companion.m3918fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
