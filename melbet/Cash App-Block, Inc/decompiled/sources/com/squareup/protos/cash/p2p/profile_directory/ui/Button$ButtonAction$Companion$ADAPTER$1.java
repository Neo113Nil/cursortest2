package com.squareup.protos.cash.p2p.profile_directory.ui;

import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Button$ButtonAction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Button.ButtonAction.Companion.getClass();
        if (i == 1) {
            return Button.ButtonAction.DISMISS;
        }
        if (i == 2) {
            return Button.ButtonAction.URL;
        }
        if (i != 3) {
            return null;
        }
        return Button.ButtonAction.HALF_SHEET;
    }
}
