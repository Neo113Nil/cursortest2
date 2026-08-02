package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.PreAuthorizePaymentResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PreAuthorizePaymentResponse$Result$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PreAuthorizePaymentResponse.Result.Companion.getClass();
        if (i == 1) {
            return PreAuthorizePaymentResponse.Result.SUCCESS;
        }
        if (i == 2) {
            return PreAuthorizePaymentResponse.Result.FAILURE;
        }
        if (i != 3) {
            return null;
        }
        return PreAuthorizePaymentResponse.Result.RETRYABLE_FAILURE;
    }
}
