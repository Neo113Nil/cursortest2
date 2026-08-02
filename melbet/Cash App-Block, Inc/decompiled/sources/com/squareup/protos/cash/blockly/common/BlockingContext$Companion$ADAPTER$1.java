package com.squareup.protos.cash.blockly.common;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class BlockingContext$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BlockingContext.Companion.getClass();
        return Error.Code.Companion.m3839fromValue(i);
    }
}
