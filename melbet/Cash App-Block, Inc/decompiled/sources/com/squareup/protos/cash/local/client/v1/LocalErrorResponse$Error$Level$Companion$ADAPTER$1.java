package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalErrorResponse$Error$Level$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalErrorResponse.Error.Level.Companion.getClass();
        if (i == 0) {
            return LocalErrorResponse.Error.Level.LEVEL_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalErrorResponse.Error.Level.LEVEL_WARNING;
        }
        if (i != 3) {
            return null;
        }
        return LocalErrorResponse.Error.Level.LEVEL_ERROR;
    }
}
