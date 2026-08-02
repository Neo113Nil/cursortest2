package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SyncInvestmentHolding;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class SyncInvestmentHolding$InvestmentHoldingState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncInvestmentHolding.InvestmentHoldingState.Companion.getClass();
        if (i == 0) {
            return SyncInvestmentHolding.InvestmentHoldingState.DO_NOT_USE_INVESTMENT_HOLDING_STATE;
        }
        if (i == 1) {
            return SyncInvestmentHolding.InvestmentHoldingState.OWNED;
        }
        if (i == 2) {
            return SyncInvestmentHolding.InvestmentHoldingState.FOLLOWED;
        }
        if (i != 3) {
            return null;
        }
        return SyncInvestmentHolding.InvestmentHoldingState.UNFOLLOWED;
    }
}
