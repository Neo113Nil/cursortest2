package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.protos.cash.shop.rendering.api.HeroSection;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class HeroSection$HeroTile$DisplayStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        HeroSection.HeroTile.DisplayStyle.Companion.getClass();
        if (i == 0) {
            return HeroSection.HeroTile.DisplayStyle.TALL;
        }
        if (i == 1) {
            return HeroSection.HeroTile.DisplayStyle.SQUARE;
        }
        if (i != 2) {
            return null;
        }
        return HeroSection.HeroTile.DisplayStyle.SHORT;
    }
}
