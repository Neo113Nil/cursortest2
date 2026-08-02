package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.local.client.v1.LocalProfileWidget;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalProfileWidget$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalProfileWidget.Type.Companion.getClass();
        return Origin.Companion.m3883fromValue(i);
    }
}
