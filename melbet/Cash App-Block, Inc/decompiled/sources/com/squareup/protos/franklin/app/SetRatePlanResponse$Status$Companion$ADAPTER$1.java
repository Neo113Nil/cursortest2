package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SetRatePlanResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SetRatePlanResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetRatePlanResponse.Status.Companion.getClass();
        if (i == 0) {
            return SetRatePlanResponse.Status.INVALID;
        }
        if (i == 1) {
            return SetRatePlanResponse.Status.SUCCESS;
        }
        if (i == 3) {
            return SetRatePlanResponse.Status.NOT_ALLOWED;
        }
        if (i != 4) {
            return null;
        }
        return SetRatePlanResponse.Status.UNSUPPORTED_APP_VERSION;
    }
}
