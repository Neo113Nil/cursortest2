package com.squareup.protos.cash.postcard;

import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CashAppCard$PaymentMethod$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashAppCard.PaymentMethod.Companion.getClass();
        if (i == 0) {
            return CashAppCard.PaymentMethod.PAYMENT_METHOD_UNSPECIFIED;
        }
        if (i == 1) {
            return CashAppCard.PaymentMethod.PREPAID;
        }
        if (i != 2) {
            return null;
        }
        return CashAppCard.PaymentMethod.DEBIT_FLEX;
    }
}
