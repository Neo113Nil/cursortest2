package com.squareup.protos.cash.p2p.profile_directory.ui;

import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Button$ButtonSize$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Button.ButtonSize.Companion.getClass();
        if (i == 1) {
            return Button.ButtonSize.SMALL;
        }
        if (i != 2) {
            return null;
        }
        return Button.ButtonSize.LARGE;
    }
}
