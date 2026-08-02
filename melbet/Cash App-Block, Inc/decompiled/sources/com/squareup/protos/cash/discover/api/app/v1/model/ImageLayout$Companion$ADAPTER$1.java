package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
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
