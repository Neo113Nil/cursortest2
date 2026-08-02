package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.BlankDividerComponent;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class BlankDividerComponent$Size$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BlankDividerComponent.Size.Companion.getClass();
        if (i == 1) {
            return BlankDividerComponent.Size.SMALL;
        }
        if (i != 2) {
            return null;
        }
        return BlankDividerComponent.Size.LARGE;
    }
}
