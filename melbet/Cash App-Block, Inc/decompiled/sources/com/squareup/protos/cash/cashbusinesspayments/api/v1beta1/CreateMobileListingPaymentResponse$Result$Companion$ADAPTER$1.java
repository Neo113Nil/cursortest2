package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CreateMobileListingPaymentResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CreateMobileListingPaymentResponse$Result$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreateMobileListingPaymentResponse.Result.Companion.getClass();
        if (i == 0) {
            return CreateMobileListingPaymentResponse.Result.RESULT_UNSPECIFIED;
        }
        if (i == 1) {
            return CreateMobileListingPaymentResponse.Result.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return CreateMobileListingPaymentResponse.Result.FAILURE;
    }
}
