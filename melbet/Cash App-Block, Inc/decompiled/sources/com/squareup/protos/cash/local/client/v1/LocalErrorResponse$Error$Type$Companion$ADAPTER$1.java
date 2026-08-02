package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalErrorResponse$Error$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalErrorResponse.Error.Type.Companion.getClass();
        if (i == 0) {
            return LocalErrorResponse.Error.Type.TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalErrorResponse.Error.Type.TYPE_VALIDATION_ERROR;
        }
        if (i == 2) {
            return LocalErrorResponse.Error.Type.TYPE_STATE_CHANGED;
        }
        if (i != 3) {
            return null;
        }
        return LocalErrorResponse.Error.Type.TYPE_INTERNAL_ERROR;
    }
}
