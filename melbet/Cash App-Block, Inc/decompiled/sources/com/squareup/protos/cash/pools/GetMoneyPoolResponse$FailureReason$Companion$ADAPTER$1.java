package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.GetMoneyPoolResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetMoneyPoolResponse$FailureReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetMoneyPoolResponse.FailureReason.Companion.getClass();
        if (i == 0) {
            return GetMoneyPoolResponse.FailureReason.FAILURE_REASON_DEFAULT_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return GetMoneyPoolResponse.FailureReason.FAILURE_REASON_FORBIDDEN_POOL_MEMBERSHIP;
    }
}
