package com.squareup.protos.lending;

import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LoanRepaymentSelectionData$Choice$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LoanRepaymentSelectionData.Choice.Icon.Companion.getClass();
        return KeyScope.Companion.m3975fromValue(i);
    }
}
