package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.Button$TextButtonElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Button$TextButtonElement$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Button$TextButtonElement.State.Companion.getClass();
        if (i == 1) {
            return Button$TextButtonElement.State.DEFAULT;
        }
        if (i == 2) {
            return Button$TextButtonElement.State.PRESSED;
        }
        if (i == 3) {
            return Button$TextButtonElement.State.DISABLED;
        }
        if (i != 4) {
            return null;
        }
        return Button$TextButtonElement.State.SELECTED;
    }
}
