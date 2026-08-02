package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class UiControl$Dialog$Button$Action$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UiControl.Dialog.Button.Action.Companion.getClass();
        if (i == 1) {
            return UiControl.Dialog.Button.Action.ADD_CASH;
        }
        if (i == 2) {
            return UiControl.Dialog.Button.Action.DISMISS;
        }
        if (i != 3) {
            return null;
        }
        return UiControl.Dialog.Button.Action.OPEN_URL;
    }
}
