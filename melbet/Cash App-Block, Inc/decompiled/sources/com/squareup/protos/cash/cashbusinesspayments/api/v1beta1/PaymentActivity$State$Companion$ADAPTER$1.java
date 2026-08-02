package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.PaymentActivity;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PaymentActivity$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentActivity.State.Companion.getClass();
        return CardProduct.Companion.m3835fromValue(i);
    }
}
