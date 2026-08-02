package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.GetProfileResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class GetProfileResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetProfileResponse.Status.Companion.getClass();
        if (i == 0) {
            return GetProfileResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return GetProfileResponse.Status.SUCCESS;
    }
}
