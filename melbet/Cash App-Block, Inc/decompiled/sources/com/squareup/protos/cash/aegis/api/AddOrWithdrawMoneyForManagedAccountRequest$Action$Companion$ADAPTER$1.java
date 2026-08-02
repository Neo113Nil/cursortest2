package com.squareup.protos.cash.aegis.api;

import com.squareup.protos.cash.aegis.api.AddOrWithdrawMoneyForManagedAccountRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AddOrWithdrawMoneyForManagedAccountRequest$Action$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AddOrWithdrawMoneyForManagedAccountRequest.Action.Companion.getClass();
        if (i == 1) {
            return AddOrWithdrawMoneyForManagedAccountRequest.Action.ADD;
        }
        if (i != 2) {
            return null;
        }
        return AddOrWithdrawMoneyForManagedAccountRequest.Action.WITHDRAW;
    }
}
