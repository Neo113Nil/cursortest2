package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Discount;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Discount$PaymentMethodTarget$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Discount.PaymentMethodTarget.Companion.getClass();
        if (i == 1) {
            return Discount.PaymentMethodTarget.UNKNOWN;
        }
        if (i == 2) {
            return Discount.PaymentMethodTarget.CASH_APP_PAY_ONLY;
        }
        if (i != 3) {
            return null;
        }
        return Discount.PaymentMethodTarget.AGNOSTIC;
    }
}
