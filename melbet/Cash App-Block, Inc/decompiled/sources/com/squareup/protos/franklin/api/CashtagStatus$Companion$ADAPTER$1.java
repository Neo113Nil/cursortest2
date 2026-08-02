package com.squareup.protos.franklin.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class CashtagStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CashtagStatus.Companion.getClass();
        if (i == 1) {
            return CashtagStatus.AVAILABLE;
        }
        if (i == 2) {
            return CashtagStatus.INVALID_CASHTAG;
        }
        if (i != 3) {
            return null;
        }
        return CashtagStatus.UNAVAILABLE;
    }
}
