package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.janus.api.GetLoginScenarioPlanResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetLoginScenarioPlanResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetLoginScenarioPlanResponse.Status.Companion.getClass();
        if (i == 0) {
            return GetLoginScenarioPlanResponse.Status.FAILED;
        }
        if (i != 1) {
            return null;
        }
        return GetLoginScenarioPlanResponse.Status.SUCCESS;
    }
}
