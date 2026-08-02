package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.TTPPaymentRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class TTPPaymentRenderData$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TTPPaymentRenderData.Status.Companion.getClass();
        switch (i) {
            case 1:
                return TTPPaymentRenderData.Status.PENDING;
            case 2:
                return TTPPaymentRenderData.Status.COMPLETED;
            case 3:
                return TTPPaymentRenderData.Status.FAILED;
            case 4:
                return TTPPaymentRenderData.Status.PARTIALLY_REFUNDED;
            case 5:
                return TTPPaymentRenderData.Status.REFUNDED;
            case 6:
                return TTPPaymentRenderData.Status.REFUND_FAILED;
            default:
                return null;
        }
    }
}
