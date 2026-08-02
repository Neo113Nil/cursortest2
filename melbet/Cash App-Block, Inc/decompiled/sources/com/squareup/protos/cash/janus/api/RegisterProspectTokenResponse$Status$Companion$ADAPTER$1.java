package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.janus.api.RegisterProspectTokenResponse;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class RegisterProspectTokenResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RegisterProspectTokenResponse.Status.Companion.getClass();
        return RetailerType.Companion.m3900fromValue(i);
    }
}
