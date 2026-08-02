package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class HorizontalAlignment$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        HorizontalAlignment.Companion.getClass();
        if (i == 1) {
            return HorizontalAlignment.LEFT;
        }
        if (i == 2) {
            return HorizontalAlignment.CENTER;
        }
        if (i != 3) {
            return null;
        }
        return HorizontalAlignment.RIGHT;
    }
}
