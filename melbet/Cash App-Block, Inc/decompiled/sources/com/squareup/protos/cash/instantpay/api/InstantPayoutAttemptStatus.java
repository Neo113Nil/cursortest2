package com.squareup.protos.cash.instantpay.api;

import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum InstantPayoutAttemptStatus implements WireEnum {
    UNSUPPORTED(0),
    PROCESSING(1),
    APPROVED(2),
    FAILED(3),
    EXPIRED(4);

    public static final InstantPayoutAttemptStatus$Companion$ADAPTER$1 ADAPTER;
    public static final SliceStatus.Companion Companion;
    public final int value;

    static {
        InstantPayoutAttemptStatus instantPayoutAttemptStatus = UNSUPPORTED;
        Companion = new SliceStatus.Companion();
        ADAPTER = new InstantPayoutAttemptStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InstantPayoutAttemptStatus.class), Syntax.PROTO_2, instantPayoutAttemptStatus);
    }

    InstantPayoutAttemptStatus(int i) {
        this.value = i;
    }

    public static final InstantPayoutAttemptStatus fromValue(int i) {
        Companion.getClass();
        return SliceStatus.Companion.m3874fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
