package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CreditLine$CreditLineStatusIcon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreditLine.CreditLineStatusIcon.Companion.getClass();
        if (i == 1) {
            return CreditLine.CreditLineStatusIcon.EXCEPTION;
        }
        return null;
    }
}
