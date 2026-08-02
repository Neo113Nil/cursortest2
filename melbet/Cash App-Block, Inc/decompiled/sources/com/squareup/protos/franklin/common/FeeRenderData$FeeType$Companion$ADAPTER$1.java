package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.FeeRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class FeeRenderData$FeeType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FeeRenderData.FeeType.Companion.getClass();
        if (i == 1) {
            return FeeRenderData.FeeType.TRANSACTION_FEE;
        }
        if (i == 2) {
            return FeeRenderData.FeeType.DELIVERY_FEE;
        }
        if (i != 3) {
            return null;
        }
        return FeeRenderData.FeeType.TOTAL_FEES;
    }
}
