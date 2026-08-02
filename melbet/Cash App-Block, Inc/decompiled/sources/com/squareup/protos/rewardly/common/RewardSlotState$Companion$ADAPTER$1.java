package com.squareup.protos.rewardly.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class RewardSlotState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RewardSlotState.Companion.getClass();
        if (i == 1) {
            return RewardSlotState.LOCKED;
        }
        if (i == 2) {
            return RewardSlotState.EMPTY;
        }
        if (i != 3) {
            return null;
        }
        return RewardSlotState.OCCUPIED;
    }
}
