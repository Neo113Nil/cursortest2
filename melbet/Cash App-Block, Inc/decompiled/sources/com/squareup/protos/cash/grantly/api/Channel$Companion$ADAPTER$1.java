package com.squareup.protos.cash.grantly.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Channel$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Channel.Companion.getClass();
        if (i == 1) {
            return Channel.IN_PERSON;
        }
        if (i == 2) {
            return Channel.ONLINE;
        }
        if (i != 3) {
            return null;
        }
        return Channel.IN_APP;
    }
}
