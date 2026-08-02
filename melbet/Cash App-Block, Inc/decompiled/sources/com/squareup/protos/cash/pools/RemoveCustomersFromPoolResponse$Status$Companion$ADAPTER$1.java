package com.squareup.protos.cash.pools;

import com.squareup.protos.cash.pools.RemoveCustomersFromPoolResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class RemoveCustomersFromPoolResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RemoveCustomersFromPoolResponse.Status.Companion.getClass();
        if (i == 0) {
            return RemoveCustomersFromPoolResponse.Status.STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return RemoveCustomersFromPoolResponse.Status.STATUS_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return RemoveCustomersFromPoolResponse.Status.STATUS_FAILURE;
    }
}
