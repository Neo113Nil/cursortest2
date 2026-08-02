package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.protos.cash.cashstorefronts.api.ImageAsset;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ImageAsset$TextColor$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ImageAsset.TextColor.Companion.getClass();
        if (i == 0) {
            return ImageAsset.TextColor.UNKNOWN_TEXT_COLOR;
        }
        if (i == 1) {
            return ImageAsset.TextColor.BLACK;
        }
        if (i != 2) {
            return null;
        }
        return ImageAsset.TextColor.WHITE;
    }
}
