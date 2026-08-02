package com.squareup.protos.cash.p2p.profile_directory.ui;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TextDecoration$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TextDecoration.Companion.getClass();
        if (i == 1) {
            return TextDecoration.STRIKETHROUGH;
        }
        if (i != 2) {
            return null;
        }
        return TextDecoration.UNDERLINE;
    }
}
