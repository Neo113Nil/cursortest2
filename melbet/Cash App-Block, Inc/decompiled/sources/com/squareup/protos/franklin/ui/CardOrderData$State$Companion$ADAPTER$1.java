package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.CardOrderData;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CardOrderData$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardOrderData.State.Companion.getClass();
        return UiControl.Type.Companion.m3966fromValue(i);
    }
}
