package com.squareup.protos.cash.genericelements.ui;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ColumnWidth$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ColumnWidth.Companion.getClass();
        if (i == 1) {
            return ColumnWidth.EVEN;
        }
        if (i == 2) {
            return ColumnWidth.FIT_LEFT;
        }
        if (i != 3) {
            return null;
        }
        return ColumnWidth.FIT_RIGHT;
    }
}
