package com.squareup.protos.franklin.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class SessionStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SessionStatus.Companion.getClass();
        if (i == 1) {
            return SessionStatus.PARTIAL;
        }
        if (i == 2) {
            return SessionStatus.FULL;
        }
        if (i != 3) {
            return null;
        }
        return SessionStatus.ANONYMOUS;
    }
}
