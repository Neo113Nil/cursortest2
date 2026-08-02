package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.messagingplatformcommon.app.PopupMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.AsyncTimeout;

/* loaded from: classes.dex */
public final class PopupMessage$Placement$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PopupMessage.Placement.Companion.getClass();
        return AsyncTimeout.Companion.m4327fromValue(i);
    }
}
