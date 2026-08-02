package com.squareup.protos.invest.ui;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ClientDriven$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ClientDriven.Companion.getClass();
        if (i == 1) {
            return ClientDriven.CURRENT_PRICE;
        }
        return null;
    }
}
