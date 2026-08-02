package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.InvestPaymentRenderData;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class InvestPaymentRenderData$RecipientData$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InvestPaymentRenderData.RecipientData.Status.Companion.getClass();
        return LinkResult.Companion.m3957fromValue(i);
    }
}
