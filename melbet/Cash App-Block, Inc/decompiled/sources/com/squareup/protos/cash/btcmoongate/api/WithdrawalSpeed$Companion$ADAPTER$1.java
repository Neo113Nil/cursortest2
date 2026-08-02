package com.squareup.protos.cash.btcmoongate.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class WithdrawalSpeed$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        WithdrawalSpeed.Companion.getClass();
        if (i == 0) {
            return WithdrawalSpeed.INVALID_SPEED;
        }
        if (i == 1) {
            return WithdrawalSpeed.RUSH;
        }
        if (i == 2) {
            return WithdrawalSpeed.PRIORITY;
        }
        if (i != 3) {
            return null;
        }
        return WithdrawalSpeed.STANDARD;
    }
}
