package com.squareup.protos.cash.genericelements.ui;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Alignment$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Alignment.Companion.getClass();
        if (i == 1) {
            return Alignment.LEFT;
        }
        if (i == 2) {
            return Alignment.RIGHT;
        }
        if (i == 3) {
            return Alignment.CENTER;
        }
        if (i != 4) {
            return null;
        }
        return Alignment.JUSTIFY;
    }
}
