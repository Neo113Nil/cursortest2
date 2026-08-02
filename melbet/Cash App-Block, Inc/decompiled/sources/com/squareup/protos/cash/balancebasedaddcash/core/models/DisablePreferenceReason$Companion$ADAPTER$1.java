package com.squareup.protos.cash.balancebasedaddcash.core.models;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DisablePreferenceReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DisablePreferenceReason.Companion.getClass();
        return Error.Code.Companion.m3838fromValue(i);
    }
}
