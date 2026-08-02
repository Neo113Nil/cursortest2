package com.squareup.protos.cash.paymenttemplate.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class OonPaymentMethodType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OonPaymentMethodType.Companion.getClass();
        if (i == 0) {
            return OonPaymentMethodType.OON_PAYMENT_METHOD_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return OonPaymentMethodType.OON_PAYMENT_METHOD_TYPE_CASH_P2P_FIAT;
        }
        if (i == 2) {
            return OonPaymentMethodType.OON_PAYMENT_METHOD_TYPE_SQUARE_WEB_PAYMENT;
        }
        if (i != 3) {
            return null;
        }
        return OonPaymentMethodType.OON_PAYMENT_METHOD_TYPE_USDC_P2P;
    }
}
