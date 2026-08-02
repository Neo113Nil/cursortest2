package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.AddCustomersToPoolResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AddCustomersToPoolResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AddCustomersToPoolResponse.Status.Companion.getClass();
        if (i == 0) {
            return AddCustomersToPoolResponse.Status.STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return AddCustomersToPoolResponse.Status.STATUS_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return AddCustomersToPoolResponse.Status.STATUS_FAILURE;
    }
}
