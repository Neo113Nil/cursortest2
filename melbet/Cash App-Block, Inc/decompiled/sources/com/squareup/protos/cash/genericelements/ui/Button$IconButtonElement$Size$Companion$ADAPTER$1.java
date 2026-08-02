package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.Button$IconButtonElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Button$IconButtonElement$Size$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Button$IconButtonElement.Size.Companion.getClass();
        if (i == 1) {
            return Button$IconButtonElement.Size.ICON_56;
        }
        if (i == 2) {
            return Button$IconButtonElement.Size.ICON_48;
        }
        if (i == 3) {
            return Button$IconButtonElement.Size.ICON_40;
        }
        if (i != 4) {
            return null;
        }
        return Button$IconButtonElement.Size.ICON_32;
    }
}
