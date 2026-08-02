package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.ResetBadgeResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class ResetBadgeResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ResetBadgeResponse.Status.Companion.getClass();
        if (i == 0) {
            return ResetBadgeResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return ResetBadgeResponse.Status.SUCCESS;
    }
}
