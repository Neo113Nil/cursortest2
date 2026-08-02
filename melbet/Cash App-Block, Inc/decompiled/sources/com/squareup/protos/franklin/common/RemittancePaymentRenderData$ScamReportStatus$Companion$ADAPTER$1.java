package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.RemittancePaymentRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class RemittancePaymentRenderData$ScamReportStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RemittancePaymentRenderData.ScamReportStatus.Companion.getClass();
        if (i == 1) {
            return RemittancePaymentRenderData.ScamReportStatus.NOT_SUBMITTED;
        }
        if (i != 2) {
            return null;
        }
        return RemittancePaymentRenderData.ScamReportStatus.SUBMITTED;
    }
}
