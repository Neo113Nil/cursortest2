package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ImageLayout$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ImageLayout.Companion.getClass();
        if (i == 0) {
            return ImageLayout.VERTICAL_RECTANGLE;
        }
        if (i != 1) {
            return null;
        }
        return ImageLayout.HORIZONTAL_RECTANGLE;
    }
}
