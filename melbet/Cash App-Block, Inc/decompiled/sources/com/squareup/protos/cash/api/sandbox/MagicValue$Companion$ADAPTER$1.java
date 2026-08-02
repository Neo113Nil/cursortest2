package com.squareup.protos.cash.api.sandbox;

import com.squareup.cash.notifications.Op;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes6.dex */
public final class MagicValue$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        MagicValue.Companion.getClass();
        return Op.Companion.m3672fromValue(i);
    }
}
