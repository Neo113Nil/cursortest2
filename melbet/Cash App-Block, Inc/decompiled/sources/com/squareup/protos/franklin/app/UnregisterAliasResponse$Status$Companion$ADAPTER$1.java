package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.UnregisterAliasResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class UnregisterAliasResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UnregisterAliasResponse.Status.Companion.getClass();
        if (i == 0) {
            return UnregisterAliasResponse.Status.INVALID;
        }
        if (i == 1) {
            return UnregisterAliasResponse.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return UnregisterAliasResponse.Status.FAILURE;
    }
}
