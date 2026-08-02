package com.squareup.protos.cash.genericelements.ui;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class VerticalAlignment$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        VerticalAlignment.Companion.getClass();
        if (i == 1) {
            return VerticalAlignment.TOP;
        }
        if (i == 2) {
            return VerticalAlignment.BOTTOM;
        }
        if (i != 3) {
            return null;
        }
        return VerticalAlignment.CENTERED;
    }
}
