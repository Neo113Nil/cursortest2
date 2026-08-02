package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Grant;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Grant$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Grant.Status.Companion.getClass();
        if (i == 1) {
            return Grant.Status.ACTIVE;
        }
        if (i == 2) {
            return Grant.Status.CONSUMED;
        }
        if (i == 3) {
            return Grant.Status.REVOKED;
        }
        if (i != 4) {
            return null;
        }
        return Grant.Status.EXPIRED;
    }
}
