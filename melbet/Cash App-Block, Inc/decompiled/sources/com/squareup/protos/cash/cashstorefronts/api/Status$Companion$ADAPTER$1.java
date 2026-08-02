package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Status.Companion.getClass();
        if (i == 0) {
            return Status.UNKNOWN_STATUS;
        }
        if (i == 1) {
            return Status.ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return Status.DELETED;
    }
}
