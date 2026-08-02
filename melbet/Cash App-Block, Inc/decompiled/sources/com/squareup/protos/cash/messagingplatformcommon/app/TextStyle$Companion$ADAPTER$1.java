package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TextStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TextStyle.Companion.getClass();
        if (i == 0) {
            return TextStyle.TEXT_STYLE_UNSPECIFIED;
        }
        if (i == 1) {
            return TextStyle.ARCADE_HEADER;
        }
        if (i != 2) {
            return null;
        }
        return TextStyle.MAIN_BODY;
    }
}
