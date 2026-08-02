package com.squareup.protos.cash.composer.app;

import com.squareup.protos.cash.composer.app.ButtonElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ButtonElement$ButtonStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ButtonElement.ButtonStyle.Companion.getClass();
        if (i == 1) {
            return ButtonElement.ButtonStyle.PRIMARY;
        }
        if (i != 2) {
            return null;
        }
        return ButtonElement.ButtonStyle.SECONDARY;
    }
}
