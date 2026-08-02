package com.squareup.protos.franklin.investing;

import com.squareup.protos.franklin.investing.UpdateInvestmentHoldingRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class UpdateInvestmentHoldingRequest$Action$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UpdateInvestmentHoldingRequest.Action.Companion.getClass();
        if (i == 1) {
            return UpdateInvestmentHoldingRequest.Action.FOLLOW;
        }
        if (i != 2) {
            return null;
        }
        return UpdateInvestmentHoldingRequest.Action.UNFOLLOW;
    }
}
