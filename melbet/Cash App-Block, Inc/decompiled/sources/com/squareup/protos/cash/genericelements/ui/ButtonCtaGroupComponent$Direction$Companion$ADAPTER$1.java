package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.ButtonCtaGroupComponent;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ButtonCtaGroupComponent$Direction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ButtonCtaGroupComponent.Direction.Companion.getClass();
        if (i == 1) {
            return ButtonCtaGroupComponent.Direction.Horizontal;
        }
        if (i != 2) {
            return null;
        }
        return ButtonCtaGroupComponent.Direction.Vertical;
    }
}
