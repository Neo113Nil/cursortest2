package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.Button$TextButtonElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Button$TextButtonElement$Size$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Button$TextButtonElement.Size.Companion.getClass();
        if (i == 1) {
            return Button$TextButtonElement.Size.WIDE;
        }
        if (i == 2) {
            return Button$TextButtonElement.Size.MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return Button$TextButtonElement.Size.SMALL;
    }
}
