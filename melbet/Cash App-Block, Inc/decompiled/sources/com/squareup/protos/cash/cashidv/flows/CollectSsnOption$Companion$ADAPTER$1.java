package com.squareup.protos.cash.cashidv.flows;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CollectSsnOption$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CollectSsnOption.Companion.getClass();
        if (i == 1) {
            return CollectSsnOption.DEFAULT;
        }
        if (i == 2) {
            return CollectSsnOption.COLLECT_FULL_SSN;
        }
        if (i != 3) {
            return null;
        }
        return CollectSsnOption.COLLECT_FULL_SSN_OR_COMPARE_SSN;
    }
}
