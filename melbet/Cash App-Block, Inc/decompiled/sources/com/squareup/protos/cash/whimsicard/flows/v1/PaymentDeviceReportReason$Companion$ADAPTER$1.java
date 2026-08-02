package com.squareup.protos.cash.whimsicard.flows.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PaymentDeviceReportReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaymentDeviceReportReason.Companion.getClass();
        if (i == 0) {
            return PaymentDeviceReportReason.PAYMENT_DEVICE_REPORT_REASON_UNSPECIFIED;
        }
        if (i == 1) {
            return PaymentDeviceReportReason.MISSING;
        }
        if (i == 2) {
            return PaymentDeviceReportReason.STOLEN_OR_COMPROMISED;
        }
        if (i != 3) {
            return null;
        }
        return PaymentDeviceReportReason.DAMAGED;
    }
}
