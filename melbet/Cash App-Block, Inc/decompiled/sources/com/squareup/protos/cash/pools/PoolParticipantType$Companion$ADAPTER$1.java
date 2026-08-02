package com.squareup.protos.cash.pools;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PoolParticipantType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PoolParticipantType.Companion.getClass();
        if (i == 0) {
            return PoolParticipantType.POOL_PARTICIPANT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return PoolParticipantType.POOL_PARTICIPANT_TYPE_CASH_APP_USER;
        }
        if (i != 2) {
            return null;
        }
        return PoolParticipantType.POOL_PARTICIPANT_TYPE_OUT_OF_NETWORK;
    }
}
