package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.SyncInvestmentIncentive;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SyncInvestmentIncentive$IncentiveState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SyncInvestmentIncentive.IncentiveState.Companion.getClass();
        if (i == 0) {
            return SyncInvestmentIncentive.IncentiveState.DO_NOT_USE_INCENTIVE_STATE;
        }
        if (i == 1) {
            return SyncInvestmentIncentive.IncentiveState.UNCLAIMED;
        }
        if (i == 2) {
            return SyncInvestmentIncentive.IncentiveState.CLAIMED;
        }
        if (i != 3) {
            return null;
        }
        return SyncInvestmentIncentive.IncentiveState.INELIGIBLE;
    }
}
