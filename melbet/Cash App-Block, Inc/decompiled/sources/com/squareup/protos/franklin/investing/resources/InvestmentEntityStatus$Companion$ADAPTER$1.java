package com.squareup.protos.franklin.investing.resources;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class InvestmentEntityStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InvestmentEntityStatus.Companion.getClass();
        if (i == 1) {
            return InvestmentEntityStatus.ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return InvestmentEntityStatus.INACTIVE;
    }
}
