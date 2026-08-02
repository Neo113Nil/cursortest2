package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.SessionScope;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SessionScope$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SessionScope.Type.Companion.getClass();
        if (i == 1) {
            return SessionScope.Type.REQUESTS_DECIDE;
        }
        return null;
    }
}
