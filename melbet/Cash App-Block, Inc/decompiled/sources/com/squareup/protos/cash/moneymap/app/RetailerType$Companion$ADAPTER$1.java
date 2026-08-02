package com.squareup.protos.cash.moneymap.app;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class RetailerType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RetailerType.Companion.getClass();
        if (i == 1) {
            return RetailerType.IN_NETWORK_WITHDRAWAL;
        }
        return null;
    }
}
