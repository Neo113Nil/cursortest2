package com.squareup.protos.cash.client;

import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ClientInfo$NavigationParadigm$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ClientInfo.NavigationParadigm.Companion.getClass();
        if (i == 1) {
            return ClientInfo.NavigationParadigm.TRADITIONAL;
        }
        if (i != 2) {
            return null;
        }
        return ClientInfo.NavigationParadigm.TABBAR;
    }
}
