package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.LimitsPageletInlineMessageButton;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LimitsPageletInlineMessageButton$ButtonAction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LimitsPageletInlineMessageButton.ButtonAction.Companion.getClass();
        if (i == 1) {
            return LimitsPageletInlineMessageButton.ButtonAction.OPEN_URL;
        }
        if (i != 2) {
            return null;
        }
        return LimitsPageletInlineMessageButton.ButtonAction.DISMISS;
    }
}
