package com.squareup.protos.cash.local.client.app.v1.poscheckin;

import com.squareup.protos.cash.local.client.app.v1.poscheckin.LocalPOSCheckIn;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalPOSCheckIn$State$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalPOSCheckIn.State.Companion.getClass();
        return RetailerType.Companion.m3902fromValue(i);
    }
}
