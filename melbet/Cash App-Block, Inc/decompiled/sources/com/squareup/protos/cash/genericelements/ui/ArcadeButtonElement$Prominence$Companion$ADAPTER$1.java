package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.ArcadeButtonElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ArcadeButtonElement$Prominence$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ArcadeButtonElement.Prominence.Companion.getClass();
        if (i == 1) {
            return ArcadeButtonElement.Prominence.PROMINENT;
        }
        if (i == 2) {
            return ArcadeButtonElement.Prominence.STANDARD;
        }
        if (i != 3) {
            return null;
        }
        return ArcadeButtonElement.Prominence.SUBTLE;
    }
}
