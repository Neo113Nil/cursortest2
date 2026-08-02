package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SheetType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SheetType.Companion.getClass();
        if (i == 1) {
            return SheetType.DETAIL_SHEET;
        }
        if (i != 2) {
            return null;
        }
        return SheetType.TIMELINE_SHEET;
    }
}
