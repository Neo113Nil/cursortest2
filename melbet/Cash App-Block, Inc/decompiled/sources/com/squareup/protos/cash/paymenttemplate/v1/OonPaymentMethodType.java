package com.squareup.protos.cash.paymenttemplate.v1;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum OonPaymentMethodType implements WireEnum {
    OON_PAYMENT_METHOD_TYPE_UNSPECIFIED(0),
    OON_PAYMENT_METHOD_TYPE_CASH_P2P_FIAT(1),
    OON_PAYMENT_METHOD_TYPE_SQUARE_WEB_PAYMENT(2),
    OON_PAYMENT_METHOD_TYPE_USDC_P2P(3);

    public static final OonPaymentMethodType$Companion$ADAPTER$1 ADAPTER;
    public static final ContactAliasType.Companion Companion;
    public final int value;

    static {
        OonPaymentMethodType oonPaymentMethodType = OON_PAYMENT_METHOD_TYPE_UNSPECIFIED;
        Companion = new ContactAliasType.Companion();
        ADAPTER = new OonPaymentMethodType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OonPaymentMethodType.class), Syntax.PROTO_2, oonPaymentMethodType);
    }

    OonPaymentMethodType(int i) {
        this.value = i;
    }

    public static final OonPaymentMethodType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return OON_PAYMENT_METHOD_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return OON_PAYMENT_METHOD_TYPE_CASH_P2P_FIAT;
        }
        if (i == 2) {
            return OON_PAYMENT_METHOD_TYPE_SQUARE_WEB_PAYMENT;
        }
        if (i != 3) {
            return null;
        }
        return OON_PAYMENT_METHOD_TYPE_USDC_P2P;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
