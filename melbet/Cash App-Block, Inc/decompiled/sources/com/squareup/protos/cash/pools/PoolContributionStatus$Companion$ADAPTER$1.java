package com.squareup.protos.cash.pools;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PoolContributionStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PoolContributionStatus.Companion.getClass();
        if (i == 0) {
            return PoolContributionStatus.POOL_CONTRIBUTION_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return PoolContributionStatus.POOL_CONTRIBUTION_STATUS_PENDING;
        }
        if (i == 2) {
            return PoolContributionStatus.POOL_CONTRIBUTION_STATUS_FAILED;
        }
        if (i != 3) {
            return null;
        }
        return PoolContributionStatus.POOL_CONTRIBUTION_STATUS_COMPLETED;
    }
}
