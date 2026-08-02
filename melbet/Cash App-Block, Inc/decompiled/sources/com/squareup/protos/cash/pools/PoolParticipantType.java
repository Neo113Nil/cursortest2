package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PoolParticipantType implements WireEnum {
    POOL_PARTICIPANT_TYPE_UNSPECIFIED(0),
    POOL_PARTICIPANT_TYPE_CASH_APP_USER(1),
    POOL_PARTICIPANT_TYPE_OUT_OF_NETWORK(2);

    public static final PoolParticipantType$Companion$ADAPTER$1 ADAPTER;
    public static final TransactionType.Companion Companion;
    public final int value;

    static {
        PoolParticipantType poolParticipantType = POOL_PARTICIPANT_TYPE_UNSPECIFIED;
        Companion = new TransactionType.Companion();
        ADAPTER = new PoolParticipantType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PoolParticipantType.class), Syntax.PROTO_2, poolParticipantType);
    }

    PoolParticipantType(int i) {
        this.value = i;
    }

    public static final PoolParticipantType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return POOL_PARTICIPANT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return POOL_PARTICIPANT_TYPE_CASH_APP_USER;
        }
        if (i != 2) {
            return null;
        }
        return POOL_PARTICIPANT_TYPE_OUT_OF_NETWORK;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
