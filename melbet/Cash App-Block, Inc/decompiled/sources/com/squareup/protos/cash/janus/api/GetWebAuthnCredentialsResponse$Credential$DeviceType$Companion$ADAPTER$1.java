package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.janus.api.GetWebAuthnCredentialsResponse;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetWebAuthnCredentialsResponse$Credential$DeviceType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetWebAuthnCredentialsResponse.Credential.DeviceType.Companion.getClass();
        return FeeType.Companion.m3909fromValue(i);
    }
}
