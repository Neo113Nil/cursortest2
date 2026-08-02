package com.squareup.protos.cash.ui;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ActionType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ActionType.Companion.getClass();
        if (i == 0) {
            return ActionType.ACTION_TYPE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return ActionType.ACTION_TYPE_DISMISS;
    }
}
