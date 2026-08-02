package com.squareup.protos.cash.taply.model.v1;

import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum LockActor implements WireEnum {
    LOCK_ACTOR_UNSPECIFIED(0),
    LOCK_ACTOR_USER(1),
    LOCK_ACTOR_SPONSOR(2),
    LOCK_ACTOR_ADMIN(3);

    public static final LockActor$Companion$ADAPTER$1 ADAPTER;
    public static final TransactionType.Companion Companion;
    public final int value;

    static {
        LockActor lockActor = LOCK_ACTOR_UNSPECIFIED;
        Companion = new TransactionType.Companion();
        ADAPTER = new LockActor$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LockActor.class), Syntax.PROTO_2, lockActor);
    }

    LockActor(int i) {
        this.value = i;
    }

    public static final LockActor fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return LOCK_ACTOR_UNSPECIFIED;
        }
        if (i == 1) {
            return LOCK_ACTOR_USER;
        }
        if (i == 2) {
            return LOCK_ACTOR_SPONSOR;
        }
        if (i != 3) {
            return null;
        }
        return LOCK_ACTOR_ADMIN;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
