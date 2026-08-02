package com.squareup.protos.franklin.api;

import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class DirectDepositBlockerBenefitsIcon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DirectDepositBlockerBenefitsIcon.Companion.getClass();
        return TaxEnvironment.Companion.m3930fromValue(i);
    }
}
