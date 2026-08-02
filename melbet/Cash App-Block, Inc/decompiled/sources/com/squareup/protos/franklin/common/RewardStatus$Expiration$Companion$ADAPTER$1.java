package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.RewardStatus;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class RewardStatus$Expiration$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RewardStatus.Expiration.Companion.getClass();
        if (i == 0) {
            return RewardStatus.Expiration.VALID;
        }
        if (i != 1) {
            return null;
        }
        return RewardStatus.Expiration.EXPIRING;
    }
}
