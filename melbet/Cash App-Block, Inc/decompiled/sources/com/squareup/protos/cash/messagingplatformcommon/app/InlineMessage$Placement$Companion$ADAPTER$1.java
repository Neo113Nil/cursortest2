package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.messagingplatformcommon.app.InlineMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class InlineMessage$Placement$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InlineMessage.Placement.Companion.getClass();
        if (i == 1) {
            return InlineMessage.Placement.ACTIVITY_TAB;
        }
        if (i != 2) {
            return null;
        }
        return InlineMessage.Placement.PROFILE_SCREEN;
    }
}
