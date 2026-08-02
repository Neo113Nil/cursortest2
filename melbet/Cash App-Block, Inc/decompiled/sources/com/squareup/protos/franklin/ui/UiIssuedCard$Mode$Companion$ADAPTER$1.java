package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.UiIssuedCard;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class UiIssuedCard$Mode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UiIssuedCard.Mode.Companion.getClass();
        if (i == 1) {
            return UiIssuedCard.Mode.NULL_STATE;
        }
        if (i != 2) {
            return null;
        }
        return UiIssuedCard.Mode.NORMAL;
    }
}
