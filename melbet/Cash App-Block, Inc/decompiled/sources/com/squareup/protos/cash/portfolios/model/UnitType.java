package com.squareup.protos.cash.portfolios.model;

import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum UnitType implements WireEnum {
    SLICE(1),
    SATOSHI(2);

    public final int value;
    public static final PoolVisibility.Companion Companion = new PoolVisibility.Companion();
    public static final UnitType$Companion$ADAPTER$1 ADAPTER = new UnitType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(UnitType.class), Syntax.PROTO_2, null);

    UnitType(int i) {
        this.value = i;
    }

    public static final UnitType fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return SLICE;
        }
        if (i != 2) {
            return null;
        }
        return SATOSHI;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
