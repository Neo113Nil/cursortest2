package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.CellDefaultComponent;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CellDefaultComponent$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CellDefaultComponent.Type.Companion.getClass();
        if (i == 1) {
            return CellDefaultComponent.Type.LARGE_ICON;
        }
        if (i != 2) {
            return null;
        }
        return CellDefaultComponent.Type.SMALL_ICON;
    }
}
