package com.squareup.protos.cash.whimsicard.flows.v1;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum InitiationSource implements WireEnum {
    INITIATION_SOURCE_UNSPECIFIED(0),
    PLASMA(1),
    DEEP_LINK(2),
    SUPPORT(3);

    public static final InitiationSource$Companion$ADAPTER$1 ADAPTER;
    public static final TransactionType.Companion Companion;
    public final int value;

    static {
        InitiationSource initiationSource = INITIATION_SOURCE_UNSPECIFIED;
        Companion = new TransactionType.Companion();
        ADAPTER = new InitiationSource$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(InitiationSource.class), Syntax.PROTO_2, initiationSource);
    }

    InitiationSource(int i) {
        this.value = i;
    }

    public static final InitiationSource fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return INITIATION_SOURCE_UNSPECIFIED;
        }
        if (i == 1) {
            return PLASMA;
        }
        if (i == 2) {
            return DEEP_LINK;
        }
        if (i != 3) {
            return null;
        }
        return SUPPORT;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
