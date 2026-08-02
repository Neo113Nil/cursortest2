package com.squareup.protos.cash.cashface.api;

import com.squareup.protos.cash.cashface.api.UtilityAction;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class UtilityAction$Action$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UtilityAction.Action.Companion.getClass();
        if (i == 0) {
            return UtilityAction.Action.ACTION_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return UtilityAction.Action.ACTION_SHARE;
    }
}
