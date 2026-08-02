package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.CompleteScenarioResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CompleteScenarioResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CompleteScenarioResponse.Status.Companion.getClass();
        if (i == 0) {
            return CompleteScenarioResponse.Status.INVALID;
        }
        if (i != 1) {
            return null;
        }
        return CompleteScenarioResponse.Status.SUCCESS;
    }
}
