package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class DirectDepositAccount$DirectDepositAccountState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DirectDepositAccount.DirectDepositAccountState.Companion.getClass();
        if (i == 1) {
            return DirectDepositAccount.DirectDepositAccountState.OPEN;
        }
        if (i == 2) {
            return DirectDepositAccount.DirectDepositAccountState.CLOSED;
        }
        if (i == 3) {
            return DirectDepositAccount.DirectDepositAccountState.NOT_PRESENT;
        }
        if (i != 4) {
            return null;
        }
        return DirectDepositAccount.DirectDepositAccountState.LOCKED;
    }
}
