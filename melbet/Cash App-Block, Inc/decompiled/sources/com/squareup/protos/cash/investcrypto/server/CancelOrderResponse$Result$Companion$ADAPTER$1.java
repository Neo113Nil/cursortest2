package com.squareup.protos.cash.investcrypto.server;

import com.squareup.protos.cash.investcrypto.server.CancelOrderResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CancelOrderResponse$Result$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CancelOrderResponse.Result.Companion.getClass();
        if (i == 1) {
            return CancelOrderResponse.Result.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return CancelOrderResponse.Result.FAILURE;
    }
}
