package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.CustomerAdjustmentRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CustomerAdjustmentRenderData$Product$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CustomerAdjustmentRenderData.Product.Companion.getClass();
        if (i == 1) {
            return CustomerAdjustmentRenderData.Product.P2P_CASH;
        }
        if (i == 2) {
            return CustomerAdjustmentRenderData.Product.CASH_IN;
        }
        if (i == 3) {
            return CustomerAdjustmentRenderData.Product.CASH_OUT;
        }
        if (i != 4) {
            return null;
        }
        return CustomerAdjustmentRenderData.Product.UNDEFINED;
    }
}
