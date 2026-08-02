package com.squareup.protos.lending.sync_values;

import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$HiddenEntryPoint$Reason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BorrowData.AppletData.EntryPointData.HiddenEntryPoint.Reason.Companion.getClass();
        if (i == 0) {
            return BorrowData.AppletData.EntryPointData.HiddenEntryPoint.Reason.UNKNOWN;
        }
        return null;
    }
}
