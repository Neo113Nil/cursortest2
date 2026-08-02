package com.squareup.protos.cash.whimsicard.flows.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PaymentDeviceType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentDeviceType.Companion.getClass();
        if (i == 0) {
            return PaymentDeviceType.PAYMENT_DEVICE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return PaymentDeviceType.PAYMENT_CARD;
        }
        if (i == 2) {
            return PaymentDeviceType.PAYMENT_TOKEN_DEVICE;
        }
        if (i != 3) {
            return null;
        }
        return PaymentDeviceType.PAYMENT_CARD_LITE;
    }
}
