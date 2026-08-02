package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DecisionMethod$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DecisionMethod.Companion.getClass();
        return RadioType.Companion.m3856fromValue(i);
    }
}
