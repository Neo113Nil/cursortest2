package com.squareup.protos.cash.orderly.plasma;

import com.squareup.protos.cash.orderly.plasma.OmsInitiateLoanPaymentFlowParameters;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class OmsInitiateLoanPaymentFlowParameters$Product$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OmsInitiateLoanPaymentFlowParameters.Product.Companion.getClass();
        if (i == 0) {
            return OmsInitiateLoanPaymentFlowParameters.Product.PRODUCT_RETROACTIVE_FINANCING;
        }
        if (i == 1) {
            return OmsInitiateLoanPaymentFlowParameters.Product.PRODUCT_AFTERPAY_ONLINE_CHECKOUT;
        }
        if (i != 2) {
            return null;
        }
        return OmsInitiateLoanPaymentFlowParameters.Product.PRODUCT_PRE_PURCHASE_FINANCING;
    }
}
