package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.protos.cash.cashstorefronts.api.ImageAsset;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ImageAsset$DimmerMode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ImageAsset.DimmerMode.Companion.getClass();
        if (i == 0) {
            return ImageAsset.DimmerMode.UNKNOWN_DIMMER_MODE;
        }
        if (i == 1) {
            return ImageAsset.DimmerMode.ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return ImageAsset.DimmerMode.DISABLED;
    }
}
