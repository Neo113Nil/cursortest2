package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.TwoColumnRowComponent;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TwoColumnRowComponent$Spacing$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TwoColumnRowComponent.Spacing.Companion.getClass();
        if (i == 1) {
            return TwoColumnRowComponent.Spacing.SMALL;
        }
        if (i != 2) {
            return null;
        }
        return TwoColumnRowComponent.Spacing.LARGE;
    }
}
