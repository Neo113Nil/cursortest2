package com.squareup.protos.cash.p2p.profile_directory.ui;

import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Button$ButtonStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Button.ButtonStyle.Companion.getClass();
        if (i == 1) {
            return Button.ButtonStyle.PRIMARY;
        }
        if (i == 2) {
            return Button.ButtonStyle.SECONDARY;
        }
        if (i == 3) {
            return Button.ButtonStyle.TERTIARY;
        }
        if (i != 4) {
            return null;
        }
        return Button.ButtonStyle.OUTLINE;
    }
}
