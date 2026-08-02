package com.squareup.protos.cash.kgoosememorystore.api.v1;

import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class FinancialKey$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FinancialKey.Companion.getClass();
        return ContactAliasType.Companion.m3891fromValue(i);
    }
}
