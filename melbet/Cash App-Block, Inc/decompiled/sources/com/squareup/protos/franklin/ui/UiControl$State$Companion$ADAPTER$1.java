package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class UiControl$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UiControl.State.Companion.getClass();
        if (i == 1) {
            return UiControl.State.ON;
        }
        if (i != 2) {
            return null;
        }
        return UiControl.State.OFF;
    }
}
