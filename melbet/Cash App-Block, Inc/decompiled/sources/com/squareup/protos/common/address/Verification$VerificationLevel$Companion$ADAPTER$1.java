package com.squareup.protos.common.address;

import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.common.address.Verification;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Verification$VerificationLevel$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Verification.VerificationLevel.Companion.getClass();
        return TaxEnvironment.Companion.m3929fromValue(i);
    }
}
