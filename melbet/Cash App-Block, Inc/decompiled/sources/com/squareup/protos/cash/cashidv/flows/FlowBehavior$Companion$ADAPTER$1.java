package com.squareup.protos.cash.cashidv.flows;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class FlowBehavior$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FlowBehavior.Companion.getClass();
        if (i == 3) {
            return FlowBehavior.ONLY_EIDV_WITH_NO_FALLBACK_DIDV;
        }
        return null;
    }
}
