package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.ArcadeButtonElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ArcadeButtonElement$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ArcadeButtonElement.State.Companion.getClass();
        if (i == 1) {
            return ArcadeButtonElement.State.DEFAULT;
        }
        if (i == 2) {
            return ArcadeButtonElement.State.PRESSED;
        }
        if (i != 3) {
            return null;
        }
        return ArcadeButtonElement.State.DISABLED;
    }
}
