package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreateWebListingPaymentResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CreateWebListingPaymentResponse$Result$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreateWebListingPaymentResponse.Result.Companion.getClass();
        if (i == 0) {
            return CreateWebListingPaymentResponse.Result.RESULT_UNSPECIFIED;
        }
        if (i == 1) {
            return CreateWebListingPaymentResponse.Result.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return CreateWebListingPaymentResponse.Result.FAILURE;
    }
}
