package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PoolGoalState implements WireEnum {
    POOL_GOAL_STATE_UNSPECIFIED(0),
    POOL_GOAL_STATE_NOT_REACHED(1),
    POOL_GOAL_STATE_TARGET_MET(2);

    public static final PoolGoalState$Companion$ADAPTER$1 ADAPTER;
    public static final TaxEnvironment.Companion Companion;
    public final int value;

    static {
        PoolGoalState poolGoalState = POOL_GOAL_STATE_UNSPECIFIED;
        Companion = new TaxEnvironment.Companion();
        ADAPTER = new PoolGoalState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PoolGoalState.class), Syntax.PROTO_2, poolGoalState);
    }

    PoolGoalState(int i) {
        this.value = i;
    }

    public static final PoolGoalState fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return POOL_GOAL_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return POOL_GOAL_STATE_NOT_REACHED;
        }
        if (i != 2) {
            return null;
        }
        return POOL_GOAL_STATE_TARGET_MET;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
