package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class UiControl$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UiControl.Type.Companion.getClass();
        if (i == 1) {
            return UiControl.Type.LABEL;
        }
        if (i == 2) {
            return UiControl.Type.BUTTON;
        }
        if (i != 3) {
            return null;
        }
        return UiControl.Type.TOGGLE;
    }
}
