package com.squareup.protos.cash.semaphore.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class FlagReadAction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FlagReadAction.Companion.getClass();
        if (i == 0) {
            return FlagReadAction.FLAG_READ_ACTION_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return FlagReadAction.EXPOSE_AMPLITUDE;
    }
}
