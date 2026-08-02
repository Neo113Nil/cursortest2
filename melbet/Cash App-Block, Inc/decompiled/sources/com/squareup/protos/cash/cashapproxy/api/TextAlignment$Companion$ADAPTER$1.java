package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TextAlignment$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TextAlignment.Companion.getClass();
        if (i == 1) {
            return TextAlignment.TEXT_ALIGNMENT_LEADING;
        }
        if (i == 2) {
            return TextAlignment.TEXT_ALIGNMENT_TRAILING;
        }
        if (i != 3) {
            return null;
        }
        return TextAlignment.TEXT_ALIGNMENT_CENTERED;
    }
}
