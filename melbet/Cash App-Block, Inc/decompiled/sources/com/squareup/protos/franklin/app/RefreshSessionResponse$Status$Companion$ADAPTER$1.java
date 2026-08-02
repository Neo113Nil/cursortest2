package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.RefreshSessionResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class RefreshSessionResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RefreshSessionResponse.Status.Companion.getClass();
        if (i == 0) {
            return RefreshSessionResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return RefreshSessionResponse.Status.SUCCESS;
    }
}
