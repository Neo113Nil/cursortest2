package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.Button$IconButtonElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Button$IconButtonElement$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Button$IconButtonElement.State.Companion.getClass();
        if (i == 1) {
            return Button$IconButtonElement.State.DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return Button$IconButtonElement.State.DISABLED;
    }
}
