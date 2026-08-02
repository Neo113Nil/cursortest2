package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.janus.api.RegisterProspectTokenResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class RegisterProspectTokenResponse$AliasType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RegisterProspectTokenResponse.AliasType.Companion.getClass();
        if (i == 0) {
            return RegisterProspectTokenResponse.AliasType.PHONE_NUMBER;
        }
        if (i != 1) {
            return null;
        }
        return RegisterProspectTokenResponse.AliasType.EMAIL_ADDRESS;
    }
}
