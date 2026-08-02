package com.squareup.protos.cash.whimsicard.syncentity;

import com.squareup.protos.cash.whimsicard.syncentity.PaymentDevicePresentation;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PaymentDevicePresentation$DeviceType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentDevicePresentation.DeviceType.Companion.getClass();
        if (i == 0) {
            return PaymentDevicePresentation.DeviceType.DEVICE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return PaymentDevicePresentation.DeviceType.CASH_APP_CARD;
        }
        if (i != 2) {
            return null;
        }
        return PaymentDevicePresentation.DeviceType.CASH_APP_TAG;
    }
}
