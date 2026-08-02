package com.squareup.protos.cash.paymenttemplate.v1;

import com.squareup.protos.cash.paymenttemplate.v1.GetPaymentTemplateResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetPaymentTemplateResponse$ErrorCode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetPaymentTemplateResponse.ErrorCode.Companion.getClass();
        if (i == 0) {
            return GetPaymentTemplateResponse.ErrorCode.ERROR_CODE_UNSPECIFIED;
        }
        if (i == 1) {
            return GetPaymentTemplateResponse.ErrorCode.ERROR_CODE_PAYMENT_TEMPLATE_NOT_FOUND;
        }
        if (i != 2) {
            return null;
        }
        return GetPaymentTemplateResponse.ErrorCode.ERROR_CODE_PAYMENT_TEMPLATE_EXPIRED;
    }
}
