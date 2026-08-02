package com.squareup.protos.lending.sync_values;

import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BorrowData$TileType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BorrowData.TileType.Companion.getClass();
        return LinkResult.Companion.m3962fromValue(i);
    }
}
