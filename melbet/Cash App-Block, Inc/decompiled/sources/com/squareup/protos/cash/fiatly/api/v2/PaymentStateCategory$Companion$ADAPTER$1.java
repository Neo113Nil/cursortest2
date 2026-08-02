package com.squareup.protos.cash.fiatly.api.v2;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PaymentStateCategory$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentStateCategory.Companion.getClass();
        if (i == 0) {
            return PaymentStateCategory.PAYMENT_STATE_CATEGORY_UNSPECIFIED;
        }
        if (i == 1) {
            return PaymentStateCategory.PAYMENT_STATE_CATEGORY_PENDING;
        }
        if (i == 2) {
            return PaymentStateCategory.PAYMENT_STATE_CATEGORY_PAID_OUT;
        }
        if (i != 3) {
            return null;
        }
        return PaymentStateCategory.PAYMENT_STATE_CATEGORY_FAILED;
    }
}
