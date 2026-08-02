package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.GetAppConfigResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class GetAppConfigResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetAppConfigResponse.Status.Companion.getClass();
        if (i == 0) {
            return GetAppConfigResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return GetAppConfigResponse.Status.SUCCESS;
    }
}
