package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class CardMessage$Placement$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CardMessage.Placement.Companion.getClass();
        if (i == 1) {
            return CardMessage.Placement.ACTIVITY_TAB;
        }
        return null;
    }
}
