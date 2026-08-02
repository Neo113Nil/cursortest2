package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AppletCardSection$TileCarousel$Tile$OverlayColor$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AppletCardSection.TileCarousel.Tile.OverlayColor.Companion.getClass();
        if (i == 0) {
            return AppletCardSection.TileCarousel.Tile.OverlayColor.UNSPECIFIED;
        }
        if (i == 1) {
            return AppletCardSection.TileCarousel.Tile.OverlayColor.BLACK;
        }
        if (i != 2) {
            return null;
        }
        return AppletCardSection.TileCarousel.Tile.OverlayColor.WHITE;
    }
}
