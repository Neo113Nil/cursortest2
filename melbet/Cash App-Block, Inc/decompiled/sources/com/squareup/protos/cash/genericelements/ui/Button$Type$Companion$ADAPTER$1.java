package com.squareup.protos.cash.genericelements.ui;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Button$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Button$Type.Companion.getClass();
        if (i == 1) {
            return Button$Type.PRIMARY;
        }
        if (i == 2) {
            return Button$Type.SECONDARY;
        }
        if (i == 3) {
            return Button$Type.TERTIARY;
        }
        if (i != 4) {
            return null;
        }
        return Button$Type.OUTLINE;
    }
}
