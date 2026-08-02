package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.TwoColumnCardComponent;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TwoColumnCardComponent$Spacing$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TwoColumnCardComponent.Spacing.Companion.getClass();
        if (i == 1) {
            return TwoColumnCardComponent.Spacing.SMALL;
        }
        if (i != 2) {
            return null;
        }
        return TwoColumnCardComponent.Spacing.LARGE;
    }
}
