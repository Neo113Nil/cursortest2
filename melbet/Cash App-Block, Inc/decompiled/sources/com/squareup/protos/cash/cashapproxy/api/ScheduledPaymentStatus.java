package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum ScheduledPaymentStatus implements WireEnum {
    SCHEDULED_PAYMENT_STATUS_UNSPECIFIED(1),
    SCHEDULED_PAYMENT_STATUS_OWED(2),
    SCHEDULED_PAYMENT_STATUS_PAID(3),
    SCHEDULED_PAYMENT_STATUS_OVERDUE(4),
    SCHEDULED_PAYMENT_STATUS_REFUNDED(5),
    SCHEDULED_PAYMENT_STATUS_DEFERRED(6),
    SCHEDULED_PAYMENT_STATUS_PAYMENT_PENDING(7),
    SCHEDULED_PAYMENT_STATUS_PARTIALLY_REFUNDED(8),
    SCHEDULED_PAYMENT_STATUS_CANCELED(9),
    SCHEDULED_PAYMENT_STATUS_ON_HOLD(10);

    public final int value;
    public static final Error.Code.Companion Companion = new Error.Code.Companion(20);
    public static final ScheduledPaymentStatus$Companion$ADAPTER$1 ADAPTER = new ScheduledPaymentStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ScheduledPaymentStatus.class), Syntax.PROTO_2, null);

    ScheduledPaymentStatus(int i) {
        this.value = i;
    }

    public static final ScheduledPaymentStatus fromValue(int i) {
        Companion.getClass();
        return Error.Code.Companion.m3841fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
