package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.protos.cash.cashstorefronts.api.ImageAsset;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ImageAsset$ImageType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ImageAsset.ImageType.Companion.getClass();
        if (i == 0) {
            return ImageAsset.ImageType.IMAGE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ImageAsset.ImageType.CASH_LIFESTYLE_SHORT;
        }
        if (i == 2) {
            return ImageAsset.ImageType.CASH_LIFESTYLE_TALL;
        }
        if (i != 3) {
            return null;
        }
        return ImageAsset.ImageType.CASH_LOGO;
    }
}
