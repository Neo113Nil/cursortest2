package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.TileSection;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TileSection$SubtitlePlacement$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TileSection.SubtitlePlacement.Companion.getClass();
        if (i == 1) {
            return TileSection.SubtitlePlacement.ABOVE_TITLE;
        }
        if (i != 2) {
            return null;
        }
        return TileSection.SubtitlePlacement.BELOW_TITLE;
    }
}
