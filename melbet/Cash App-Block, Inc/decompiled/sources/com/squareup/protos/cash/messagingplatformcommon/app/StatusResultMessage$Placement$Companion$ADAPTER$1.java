package com.squareup.protos.cash.messagingplatformcommon.app;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.messagingplatformcommon.app.StatusResultMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class StatusResultMessage$Placement$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        StatusResultMessage.Placement.Companion.getClass();
        return Origin.Companion.m3885fromValue(i);
    }
}
