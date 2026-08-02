package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Button$Prominence$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Button.Prominence.Companion.getClass();
        if (i == 0) {
            return Button.Prominence.UNSPECIFIED;
        }
        if (i == 1) {
            return Button.Prominence.STANDARD;
        }
        if (i == 2) {
            return Button.Prominence.PROMINENT;
        }
        if (i != 3) {
            return null;
        }
        return Button.Prominence.SUBTLE;
    }
}
