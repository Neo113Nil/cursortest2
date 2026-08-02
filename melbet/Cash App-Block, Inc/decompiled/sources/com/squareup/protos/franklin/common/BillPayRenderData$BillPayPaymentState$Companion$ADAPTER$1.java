package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.BillPayRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BillPayRenderData$BillPayPaymentState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BillPayRenderData.BillPayPaymentState.Companion.getClass();
        switch (i) {
            case 1:
                return BillPayRenderData.BillPayPaymentState.BILL_PAYMENT_STATE_DO_NOT_USE;
            case 2:
                return BillPayRenderData.BillPayPaymentState.COMPLETED;
            case 3:
                return BillPayRenderData.BillPayPaymentState.PRE_FUNDED;
            case 4:
                return BillPayRenderData.BillPayPaymentState.FAILED_NSF;
            case 5:
                return BillPayRenderData.BillPayPaymentState.CANCELED;
            case 6:
                return BillPayRenderData.BillPayPaymentState.FAILED;
            default:
                return null;
        }
    }
}
