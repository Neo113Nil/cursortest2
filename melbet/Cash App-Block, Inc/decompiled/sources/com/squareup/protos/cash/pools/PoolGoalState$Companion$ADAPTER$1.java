package com.squareup.protos.cash.pools;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PoolGoalState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PoolGoalState.Companion.getClass();
        if (i == 0) {
            return PoolGoalState.POOL_GOAL_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return PoolGoalState.POOL_GOAL_STATE_NOT_REACHED;
        }
        if (i != 2) {
            return null;
        }
        return PoolGoalState.POOL_GOAL_STATE_TARGET_MET;
    }
}
