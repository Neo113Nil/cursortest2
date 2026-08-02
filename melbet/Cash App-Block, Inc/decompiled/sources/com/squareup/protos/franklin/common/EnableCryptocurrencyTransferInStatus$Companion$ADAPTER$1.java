package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class EnableCryptocurrencyTransferInStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        EnableCryptocurrencyTransferInStatus.Companion.getClass();
        return UiAlias.Type.Companion.m3945fromValue(i);
    }
}
