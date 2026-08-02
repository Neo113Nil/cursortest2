package com.squareup.protos.cash.cashface.ui;

import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ButtonElement$TertiaryStyle$TitleStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle.Companion.getClass();
        if (i == 1) {
            return GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle.DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return GenericProfileElement.ButtonElement.TertiaryStyle.TitleStyle.DESTRUCTIVE;
    }
}
