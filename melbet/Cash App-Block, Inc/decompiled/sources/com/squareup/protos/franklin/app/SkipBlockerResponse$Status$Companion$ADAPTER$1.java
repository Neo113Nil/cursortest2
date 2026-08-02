package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SkipBlockerResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SkipBlockerResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SkipBlockerResponse.Status.Companion.getClass();
        if (i == 0) {
            return SkipBlockerResponse.Status.INVALID;
        }
        if (i == 1) {
            return SkipBlockerResponse.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return SkipBlockerResponse.Status.CONCURRENT_MODIFICATION;
    }
}
