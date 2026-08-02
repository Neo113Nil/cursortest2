package com.squareup.protos.cash.fiatly.api.v2;

import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PaymentStateCategory implements WireEnum {
    PAYMENT_STATE_CATEGORY_UNSPECIFIED(0),
    PAYMENT_STATE_CATEGORY_PENDING(1),
    PAYMENT_STATE_CATEGORY_PAID_OUT(2),
    PAYMENT_STATE_CATEGORY_FAILED(3);

    public static final PaymentStateCategory$Companion$ADAPTER$1 ADAPTER;
    public static final ImageLayout.Companion Companion;
    public final int value;

    static {
        PaymentStateCategory paymentStateCategory = PAYMENT_STATE_CATEGORY_UNSPECIFIED;
        Companion = new ImageLayout.Companion();
        ADAPTER = new PaymentStateCategory$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentStateCategory.class), Syntax.PROTO_2, paymentStateCategory);
    }

    PaymentStateCategory(int i) {
        this.value = i;
    }

    public static final PaymentStateCategory fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return PAYMENT_STATE_CATEGORY_UNSPECIFIED;
        }
        if (i == 1) {
            return PAYMENT_STATE_CATEGORY_PENDING;
        }
        if (i == 2) {
            return PAYMENT_STATE_CATEGORY_PAID_OUT;
        }
        if (i != 3) {
            return null;
        }
        return PAYMENT_STATE_CATEGORY_FAILED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
