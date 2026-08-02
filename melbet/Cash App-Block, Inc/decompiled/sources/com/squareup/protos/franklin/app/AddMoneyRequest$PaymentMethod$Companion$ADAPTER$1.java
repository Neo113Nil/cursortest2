package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.AddMoneyRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class AddMoneyRequest$PaymentMethod$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AddMoneyRequest.PaymentMethod.Companion.getClass();
        if (i == 0) {
            return AddMoneyRequest.PaymentMethod.PAYMENT_METHOD_DO_NOT_USE;
        }
        if (i == 1) {
            return AddMoneyRequest.PaymentMethod.DEBIT_CARD;
        }
        if (i != 2) {
            return null;
        }
        return AddMoneyRequest.PaymentMethod.GOOGLE_PAY;
    }
}
