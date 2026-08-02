package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.ResolveMergeResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ResolveMergeResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ResolveMergeResponse.Status.Companion.getClass();
        if (i == 0) {
            return ResolveMergeResponse.Status.INVALID;
        }
        if (i == 1) {
            return ResolveMergeResponse.Status.SUCCESS;
        }
        if (i != 3) {
            return null;
        }
        return ResolveMergeResponse.Status.FAILURE;
    }
}
