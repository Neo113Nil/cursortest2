package com.squareup.protos.lending.sync_values;

import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$TileEntryPoint$Graphic$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon.Companion.getClass();
        if (i == 1) {
            return BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon.BORROW_LOGO;
        }
        if (i != 2) {
            return null;
        }
        return BorrowData.AppletData.EntryPointData.TileEntryPoint.Graphic.Icon.EXCLAMATION;
    }
}
