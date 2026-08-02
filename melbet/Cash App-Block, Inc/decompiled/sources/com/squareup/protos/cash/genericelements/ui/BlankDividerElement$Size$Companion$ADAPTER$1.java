package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.BlankDividerElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class BlankDividerElement$Size$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BlankDividerElement.Size.Companion.getClass();
        if (i == 1) {
            return BlankDividerElement.Size.SMALL;
        }
        if (i == 2) {
            return BlankDividerElement.Size.LARGE;
        }
        if (i != 3) {
            return null;
        }
        return BlankDividerElement.Size.X_LARGE;
    }
}
