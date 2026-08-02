package com.squareup.protos.franklin.api;

import com.squareup.protos.franklin.api.Transfer;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Transfer$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Transfer.State.Companion.getClass();
        if (i == 1) {
            return Transfer.State.FAILED;
        }
        if (i == 2) {
            return Transfer.State.PROCESSING;
        }
        if (i == 3) {
            return Transfer.State.COMPLETE;
        }
        if (i != 4) {
            return null;
        }
        return Transfer.State.WAITING_ON_CUSTOMER;
    }
}
