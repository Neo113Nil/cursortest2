package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SelectOptionResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class SelectOptionResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SelectOptionResponse.Status.Companion.getClass();
        if (i == 0) {
            return SelectOptionResponse.Status.INVALID;
        }
        if (i == 1) {
            return SelectOptionResponse.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return SelectOptionResponse.Status.CONCURRENT_MODIFICATION;
    }
}
