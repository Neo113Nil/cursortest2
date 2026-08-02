package com.squareup.protos.cash.postbank;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DemandDepositAccountState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DemandDepositAccountState.Companion.getClass();
        if (i == 0) {
            return DemandDepositAccountState.DDA_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return DemandDepositAccountState.DDA_STATE_OPEN;
        }
        if (i == 2) {
            return DemandDepositAccountState.DDA_STATE_CLOSED;
        }
        if (i != 3) {
            return null;
        }
        return DemandDepositAccountState.DDA_STATE_LOCKED;
    }
}
