package com.squareup.protos.cash.taply.model.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LockActor$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LockActor.Companion.getClass();
        if (i == 0) {
            return LockActor.LOCK_ACTOR_UNSPECIFIED;
        }
        if (i == 1) {
            return LockActor.LOCK_ACTOR_USER;
        }
        if (i == 2) {
            return LockActor.LOCK_ACTOR_SPONSOR;
        }
        if (i != 3) {
            return null;
        }
        return LockActor.LOCK_ACTOR_ADMIN;
    }
}
