package com.squareup.protos.cash.transfers;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class TransferClientRouteSource$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TransferClientRouteSource.Companion.getClass();
        if (i == 0) {
            return TransferClientRouteSource.UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return TransferClientRouteSource.INSTRUMENT_SELECTION;
    }
}
