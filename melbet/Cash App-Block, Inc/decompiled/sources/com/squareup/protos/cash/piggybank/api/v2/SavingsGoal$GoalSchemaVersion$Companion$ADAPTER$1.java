package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.protos.cash.piggybank.api.v2.SavingsGoal;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SavingsGoal$GoalSchemaVersion$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SavingsGoal.GoalSchemaVersion.Companion.getClass();
        if (i == 0) {
            return SavingsGoal.GoalSchemaVersion.GOAL_SCHEMA_VERSION_DEFAULT_UNSPECIFIED;
        }
        if (i == 1) {
            return SavingsGoal.GoalSchemaVersion.GOAL_SCHEMA_VERSION_V1;
        }
        if (i != 2) {
            return null;
        }
        return SavingsGoal.GoalSchemaVersion.GOAL_SCHEMA_VERSION_V2;
    }
}
