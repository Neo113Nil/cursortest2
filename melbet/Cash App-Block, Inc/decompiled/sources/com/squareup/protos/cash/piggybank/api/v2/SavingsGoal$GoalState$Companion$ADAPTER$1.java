package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.protos.cash.piggybank.api.v2.SavingsGoal;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SavingsGoal$GoalState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SavingsGoal.GoalState.Companion.getClass();
        return TransactionType.Companion.fromValue(i);
    }
}
