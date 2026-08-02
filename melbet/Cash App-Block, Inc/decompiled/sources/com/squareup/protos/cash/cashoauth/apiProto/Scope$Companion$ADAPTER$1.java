package com.squareup.protos.cash.cashoauth.apiProto;

import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Scope$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Scope.Companion.getClass();
        return Channel.Companion.fromValue(i);
    }
}
