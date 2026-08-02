package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.ArcadeButtonElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ArcadeButtonElement$Size$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ArcadeButtonElement.Size.Companion.getClass();
        if (i == 1) {
            return ArcadeButtonElement.Size.DEFAULT_ARCADE;
        }
        if (i == 2) {
            return ArcadeButtonElement.Size.CTA;
        }
        if (i != 3) {
            return null;
        }
        return ArcadeButtonElement.Size.COMPACT;
    }
}
