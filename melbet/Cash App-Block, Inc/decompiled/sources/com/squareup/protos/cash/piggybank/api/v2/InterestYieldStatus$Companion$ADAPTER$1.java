package com.squareup.protos.cash.piggybank.api.v2;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class InterestYieldStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InterestYieldStatus.Companion.getClass();
        return ActionType.Companion.fromValue(i);
    }
}
