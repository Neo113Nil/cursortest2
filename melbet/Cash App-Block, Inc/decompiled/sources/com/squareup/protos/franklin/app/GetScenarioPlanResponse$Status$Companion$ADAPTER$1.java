package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.GetScenarioPlanResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class GetScenarioPlanResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetScenarioPlanResponse.Status.Companion.getClass();
        if (i == 0) {
            return GetScenarioPlanResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return GetScenarioPlanResponse.Status.SUCCESS;
    }
}
