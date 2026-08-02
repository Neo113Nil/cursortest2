package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CreditLine$Alert$DisplayTime$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreditLine.Alert.DisplayTime.Companion.getClass();
        if (i == 1) {
            return CreditLine.Alert.DisplayTime.BORROW_ENTRY;
        }
        return null;
    }
}
