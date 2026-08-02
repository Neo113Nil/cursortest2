package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class HalfSheetMessage$Placement$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        HalfSheetMessage.Placement.Companion.getClass();
        if (i == 1) {
            return HalfSheetMessage.Placement.BALANCE_TAB;
        }
        if (i == 2) {
            return HalfSheetMessage.Placement.CARD_TAB;
        }
        if (i != 3) {
            return null;
        }
        return HalfSheetMessage.Placement.PAYMENT_PAD_TAB;
    }
}
