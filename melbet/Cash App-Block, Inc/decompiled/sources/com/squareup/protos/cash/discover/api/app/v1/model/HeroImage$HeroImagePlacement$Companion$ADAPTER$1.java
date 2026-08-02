package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.protos.cash.discover.api.app.v1.model.HeroImage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class HeroImage$HeroImagePlacement$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        HeroImage.HeroImagePlacement.Companion.getClass();
        if (i == 0) {
            return HeroImage.HeroImagePlacement.HERO_IMAGE_PLACEMENT_UNSPECIFIED;
        }
        if (i == 1) {
            return HeroImage.HeroImagePlacement.HERO_IMAGE_PLACEMENT_FILL;
        }
        if (i != 2) {
            return null;
        }
        return HeroImage.HeroImagePlacement.HERO_IMAGE_PLACEMENT_CENTER;
    }
}
