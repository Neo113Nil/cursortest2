package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.InvestPaymentRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class InvestPaymentRenderData$SenderData$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InvestPaymentRenderData.SenderData.Status.Companion.getClass();
        if (i == 1) {
            return InvestPaymentRenderData.SenderData.Status.SENT;
        }
        if (i == 2) {
            return InvestPaymentRenderData.SenderData.Status.REFUNDED;
        }
        if (i != 3) {
            return null;
        }
        return InvestPaymentRenderData.SenderData.Status.WAITING_ON_FUNDING;
    }
}
