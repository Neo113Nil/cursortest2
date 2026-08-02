package com.squareup.protos.franklin.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class LimitedAction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LimitedAction.Companion.getClass();
        if (i == 1) {
            return LimitedAction.ADD_CASH;
        }
        if (i == 2) {
            return LimitedAction.BUY_CRYPTOCURRENCY;
        }
        if (i != 3) {
            return null;
        }
        return LimitedAction.SELL_CRYPTOCURRENCY;
    }
}
