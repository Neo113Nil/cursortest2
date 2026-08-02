package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.InvestmentEntityRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class InvestmentEntityRenderData$InvestmentType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InvestmentEntityRenderData.InvestmentType.Companion.getClass();
        if (i == 1) {
            return InvestmentEntityRenderData.InvestmentType.STOCK;
        }
        if (i != 2) {
            return null;
        }
        return InvestmentEntityRenderData.InvestmentType.CURRENCY;
    }
}
