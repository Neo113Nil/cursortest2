package com.squareup.protos.cash.papermate.states;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PaperMoneyDepositState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PaperMoneyDepositState.Companion.getClass();
        return ContactAliasType.Companion.m3896fromValue(i);
    }
}
