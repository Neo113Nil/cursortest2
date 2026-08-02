package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum PoolState implements WireEnum {
    POOL_STATE_DEFAULT_UNSPECIFIED(0),
    POOL_STATE_ACTIVE_IN_PROGRESS(1),
    POOL_STATE_ACTIVE_REACHED_GOAL(2),
    POOL_STATE_MANUAL_CLOSED(3),
    POOL_STATE_CLOSING(4);

    public static final PoolState$Companion$ADAPTER$1 ADAPTER;
    public static final ActionType.Companion Companion;
    public final int value;

    static {
        PoolState poolState = POOL_STATE_DEFAULT_UNSPECIFIED;
        Companion = new ActionType.Companion();
        ADAPTER = new PoolState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PoolState.class), Syntax.PROTO_2, poolState);
    }

    PoolState(int i) {
        this.value = i;
    }

    public static final PoolState fromValue(int i) {
        Companion.getClass();
        return ActionType.Companion.m3931fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
