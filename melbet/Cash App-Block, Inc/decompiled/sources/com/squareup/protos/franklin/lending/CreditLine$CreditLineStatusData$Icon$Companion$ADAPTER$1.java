package com.squareup.protos.franklin.lending;

import com.squareup.protos.franklin.lending.CreditLine;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CreditLine$CreditLineStatusData$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreditLine.CreditLineStatusData.Icon.Companion.getClass();
        if (i == 1) {
            return CreditLine.CreditLineStatusData.Icon.CHECKMARK;
        }
        if (i != 2) {
            return null;
        }
        return CreditLine.CreditLineStatusData.Icon.INFO;
    }
}
