package com.squareup.protos.cash.whimsicard.flows.v1;

import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum PaymentDeviceType implements WireEnum {
    PAYMENT_DEVICE_TYPE_UNSPECIFIED(0),
    PAYMENT_CARD(1),
    PAYMENT_TOKEN_DEVICE(2),
    PAYMENT_CARD_LITE(3);

    public static final PaymentDeviceType$Companion$ADAPTER$1 ADAPTER;
    public static final TaxEnvironment.Companion Companion;
    public final int value;

    static {
        PaymentDeviceType paymentDeviceType = PAYMENT_DEVICE_TYPE_UNSPECIFIED;
        Companion = new TaxEnvironment.Companion();
        ADAPTER = new PaymentDeviceType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentDeviceType.class), Syntax.PROTO_2, paymentDeviceType);
    }

    PaymentDeviceType(int i) {
        this.value = i;
    }

    public static final PaymentDeviceType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return PAYMENT_DEVICE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return PAYMENT_CARD;
        }
        if (i == 2) {
            return PAYMENT_TOKEN_DEVICE;
        }
        if (i != 3) {
            return null;
        }
        return PAYMENT_CARD_LITE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
