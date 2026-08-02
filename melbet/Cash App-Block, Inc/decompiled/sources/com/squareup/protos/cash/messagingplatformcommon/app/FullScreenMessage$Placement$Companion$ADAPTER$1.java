package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.messagingplatformcommon.app.FullScreenMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class FullScreenMessage$Placement$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FullScreenMessage.Placement.Companion.getClass();
        if (i == 1) {
            return FullScreenMessage.Placement.BALANCE_TAB;
        }
        if (i != 2) {
            return null;
        }
        return FullScreenMessage.Placement.PAYMENT_PAD_TAB;
    }
}
