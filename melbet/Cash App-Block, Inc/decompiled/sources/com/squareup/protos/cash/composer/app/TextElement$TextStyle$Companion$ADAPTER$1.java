package com.squareup.protos.cash.composer.app;

import com.squareup.protos.cash.composer.app.TextElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TextElement$TextStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TextElement.TextStyle.Companion.getClass();
        if (i == 1) {
            return TextElement.TextStyle.TITLE;
        }
        if (i != 2) {
            return null;
        }
        return TextElement.TextStyle.SUBTITLE;
    }
}
