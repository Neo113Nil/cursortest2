package com.squareup.protos.cash.taply.model.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PaymentTokenDeviceStateReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentTokenDeviceStateReason.Companion.getClass();
        if (i == 0) {
            return PaymentTokenDeviceStateReason.PAYMENT_TOKEN_DEVICE_STATE_REASON_UNSPECIFIED;
        }
        if (i == 1) {
            return PaymentTokenDeviceStateReason.PAYMENT_TOKEN_DEVICE_STATE_REASON_CUSTOMER_REPORTED;
        }
        if (i != 2) {
            return null;
        }
        return PaymentTokenDeviceStateReason.PAYMENT_TOKEN_DEVICE_STATE_REASON_ADMIN_REPORTED;
    }
}
