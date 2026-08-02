package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.ui.IdentityHubState;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class IdentityHubState$EntrypointStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        IdentityHubState.EntrypointStatus.Companion.getClass();
        return ClientDriven.Companion.m3978fromValue(i);
    }
}
