package com.squareup.protos.cash.investcrypto.resources;

import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class FeeStrategy$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FeeStrategy.Companion.getClass();
        return FeeType.Companion.fromValue(i);
    }
}
