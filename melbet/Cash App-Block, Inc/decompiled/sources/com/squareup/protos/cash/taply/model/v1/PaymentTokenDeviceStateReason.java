package com.squareup.protos.cash.taply.model.v1;

import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum PaymentTokenDeviceStateReason implements WireEnum {
    PAYMENT_TOKEN_DEVICE_STATE_REASON_UNSPECIFIED(0),
    PAYMENT_TOKEN_DEVICE_STATE_REASON_CUSTOMER_REPORTED(1),
    PAYMENT_TOKEN_DEVICE_STATE_REASON_ADMIN_REPORTED(2);

    public static final PaymentTokenDeviceStateReason$Companion$ADAPTER$1 ADAPTER;
    public static final PoolVisibility.Companion Companion;
    public final int value;

    static {
        PaymentTokenDeviceStateReason paymentTokenDeviceStateReason = PAYMENT_TOKEN_DEVICE_STATE_REASON_UNSPECIFIED;
        Companion = new PoolVisibility.Companion();
        ADAPTER = new PaymentTokenDeviceStateReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentTokenDeviceStateReason.class), Syntax.PROTO_2, paymentTokenDeviceStateReason);
    }

    PaymentTokenDeviceStateReason(int i) {
        this.value = i;
    }

    public static final PaymentTokenDeviceStateReason fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return PAYMENT_TOKEN_DEVICE_STATE_REASON_UNSPECIFIED;
        }
        if (i == 1) {
            return PAYMENT_TOKEN_DEVICE_STATE_REASON_CUSTOMER_REPORTED;
        }
        if (i != 2) {
            return null;
        }
        return PAYMENT_TOKEN_DEVICE_STATE_REASON_ADMIN_REPORTED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
