package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.janus.api.StartAccountRecoveryResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class StartAccountRecoveryResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        StartAccountRecoveryResponse.Status.Companion.getClass();
        if (i == 0) {
            return StartAccountRecoveryResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return StartAccountRecoveryResponse.Status.SUCCESS;
    }
}
