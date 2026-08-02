package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.RemoveCustomersFromPoolResponse;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class RemoveCustomersFromPoolResponse$FailureReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RemoveCustomersFromPoolResponse.FailureReason.Companion.getClass();
        return TaxEnvironment.Companion.fromValue(i);
    }
}
