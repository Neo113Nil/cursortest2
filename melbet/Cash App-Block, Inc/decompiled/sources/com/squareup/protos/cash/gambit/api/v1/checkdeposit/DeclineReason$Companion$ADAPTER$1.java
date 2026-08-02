package com.squareup.protos.cash.gambit.api.v1.checkdeposit;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DeclineReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DeclineReason.Companion.getClass();
        return Action.Type.Companion.m3866fromValue(i);
    }
}
