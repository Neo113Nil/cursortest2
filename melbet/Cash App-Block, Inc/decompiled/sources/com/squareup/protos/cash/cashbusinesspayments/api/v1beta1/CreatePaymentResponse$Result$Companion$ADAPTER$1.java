package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreatePaymentResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CreatePaymentResponse$Result$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreatePaymentResponse.Result.Companion.getClass();
        if (i == 0) {
            return CreatePaymentResponse.Result.RESULT_UNSPECIFIED;
        }
        if (i == 1) {
            return CreatePaymentResponse.Result.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return CreatePaymentResponse.Result.FAILURE;
    }
}
