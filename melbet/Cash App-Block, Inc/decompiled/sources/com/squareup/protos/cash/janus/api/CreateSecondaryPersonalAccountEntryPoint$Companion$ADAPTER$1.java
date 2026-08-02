package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CreateSecondaryPersonalAccountEntryPoint$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CreateSecondaryPersonalAccountEntryPoint.Companion.getClass();
        return RetailerType.Companion.fromValue(i);
    }
}
