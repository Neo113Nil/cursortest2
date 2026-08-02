package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.CustomerAdjustmentRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CustomerAdjustmentRenderData$Action$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CustomerAdjustmentRenderData.Action.Companion.getClass();
        if (i == 1) {
            return CustomerAdjustmentRenderData.Action.CLAWBACK;
        }
        if (i != 2) {
            return null;
        }
        return CustomerAdjustmentRenderData.Action.REIMBURSEMENT;
    }
}
