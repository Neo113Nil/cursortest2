package com.squareup.protos.cash.taply.model.v1;

import com.squareup.protos.cash.taply.model.v1.PaymentTokenDevice;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PaymentTokenDevice$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentTokenDevice.State.Companion.getClass();
        if (i == 0) {
            return PaymentTokenDevice.State.STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return PaymentTokenDevice.State.STATE_INACTIVE;
        }
        if (i == 2) {
            return PaymentTokenDevice.State.STATE_ACTIVE;
        }
        if (i != 3) {
            return null;
        }
        return PaymentTokenDevice.State.STATE_TERMINATED;
    }
}
