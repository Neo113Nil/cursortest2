package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.ImageElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ImageElement$Size$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ImageElement.Size.Companion.getClass();
        if (i == 1) {
            return ImageElement.Size.SMALL;
        }
        if (i == 2) {
            return ImageElement.Size.MEDIUM;
        }
        if (i == 3) {
            return ImageElement.Size.LARGE;
        }
        if (i != 4) {
            return null;
        }
        return ImageElement.Size.STATIC;
    }
}
