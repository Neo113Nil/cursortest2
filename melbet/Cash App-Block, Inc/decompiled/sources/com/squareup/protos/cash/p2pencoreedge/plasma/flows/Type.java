package com.squareup.protos.cash.p2pencoreedge.plasma.flows;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum Type implements WireEnum {
    UNSPECIFIED(0),
    ALLOWANCE(1),
    P2P_FIAT(2);

    public static final Type$Companion$ADAPTER$1 ADAPTER;
    public static final Origin.Companion Companion;
    public final int value;

    static {
        Type type2 = UNSPECIFIED;
        Companion = new Origin.Companion();
        ADAPTER = new Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, type2);
    }

    Type(int i) {
        this.value = i;
    }

    public static final Type fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return ALLOWANCE;
        }
        if (i != 2) {
            return null;
        }
        return P2P_FIAT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
