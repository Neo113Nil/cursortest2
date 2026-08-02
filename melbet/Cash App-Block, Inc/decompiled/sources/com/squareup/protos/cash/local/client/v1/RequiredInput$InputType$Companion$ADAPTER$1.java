package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.local.client.v1.RequiredInput;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class RequiredInput$InputType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RequiredInput.InputType.Companion.getClass();
        return Origin.Companion.m3884fromValue(i);
    }
}
