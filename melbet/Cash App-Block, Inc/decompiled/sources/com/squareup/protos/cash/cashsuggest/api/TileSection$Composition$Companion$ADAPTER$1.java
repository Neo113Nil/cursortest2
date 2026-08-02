package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.TileSection;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TileSection$Composition$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TileSection.Composition.Companion.getClass();
        if (i == 1) {
            return TileSection.Composition.TOP_LEFT_TEXT;
        }
        if (i != 2) {
            return null;
        }
        return TileSection.Composition.BOTTOM_LEFT_TEXT;
    }
}
