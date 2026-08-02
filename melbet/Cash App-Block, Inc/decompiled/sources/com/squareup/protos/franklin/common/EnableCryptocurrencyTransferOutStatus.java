package com.squareup.protos.franklin.common;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public enum EnableCryptocurrencyTransferOutStatus implements WireEnum {
    DISALLOWED(1),
    CAN_ENABLE(2),
    PENDING_REVIEW(3),
    ENABLED(4),
    MISMATCHED_IDV(5);

    public final int value;
    public static final AsyncTimeout.Companion Companion = new AsyncTimeout.Companion();
    public static final EnableCryptocurrencyTransferOutStatus$Companion$ADAPTER$1 ADAPTER = new EnableCryptocurrencyTransferOutStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EnableCryptocurrencyTransferOutStatus.class), Syntax.PROTO_2, null);

    EnableCryptocurrencyTransferOutStatus(int i) {
        this.value = i;
    }

    public static final EnableCryptocurrencyTransferOutStatus fromValue(int i) {
        Companion.getClass();
        return AsyncTimeout.Companion.m4329fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
