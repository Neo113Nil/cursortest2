package com.squareup.protos.cash.semaphore.api;

import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum FlagReadAction implements WireEnum {
    FLAG_READ_ACTION_UNSPECIFIED(0),
    EXPOSE_AMPLITUDE(1);

    public static final FlagReadAction$Companion$ADAPTER$1 ADAPTER;
    public static final PoolVisibility.Companion Companion;
    public final int value;

    static {
        FlagReadAction flagReadAction = FLAG_READ_ACTION_UNSPECIFIED;
        Companion = new PoolVisibility.Companion();
        ADAPTER = new FlagReadAction$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FlagReadAction.class), Syntax.PROTO_2, flagReadAction);
    }

    FlagReadAction(int i) {
        this.value = i;
    }

    public static final FlagReadAction fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return FLAG_READ_ACTION_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return EXPOSE_AMPLITUDE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
