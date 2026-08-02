package com.squareup.protos.cash.whimsicard.flows.v1;

import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum PaymentDeviceReportReason implements WireEnum {
    PAYMENT_DEVICE_REPORT_REASON_UNSPECIFIED(0),
    MISSING(1),
    STOLEN_OR_COMPROMISED(2),
    DAMAGED(3);

    public static final PaymentDeviceReportReason$Companion$ADAPTER$1 ADAPTER;
    public static final PoolVisibility.Companion Companion;
    public final int value;

    static {
        PaymentDeviceReportReason paymentDeviceReportReason = PAYMENT_DEVICE_REPORT_REASON_UNSPECIFIED;
        Companion = new PoolVisibility.Companion();
        ADAPTER = new PaymentDeviceReportReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentDeviceReportReason.class), Syntax.PROTO_2, paymentDeviceReportReason);
    }

    PaymentDeviceReportReason(int i) {
        this.value = i;
    }

    public static final PaymentDeviceReportReason fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return PAYMENT_DEVICE_REPORT_REASON_UNSPECIFIED;
        }
        if (i == 1) {
            return MISSING;
        }
        if (i == 2) {
            return STOLEN_OR_COMPROMISED;
        }
        if (i != 3) {
            return null;
        }
        return DAMAGED;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
