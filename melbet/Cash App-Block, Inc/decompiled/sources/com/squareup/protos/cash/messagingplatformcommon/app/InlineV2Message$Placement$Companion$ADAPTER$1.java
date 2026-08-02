package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class InlineV2Message$Placement$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InlineV2Message.Placement.Companion.getClass();
        if (i == 1) {
            return InlineV2Message.Placement.ACTIVITY_TAB;
        }
        if (i == 2) {
            return InlineV2Message.Placement.MONEYBOT_APPLET;
        }
        if (i != 3) {
            return null;
        }
        return InlineV2Message.Placement.MONEYBOT_CHAT;
    }
}
