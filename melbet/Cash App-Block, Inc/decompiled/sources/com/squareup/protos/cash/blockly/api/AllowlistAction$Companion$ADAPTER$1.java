package com.squareup.protos.cash.blockly.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AllowlistAction$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AllowlistAction.Companion.getClass();
        if (i == 1) {
            return AllowlistAction.ADD;
        }
        if (i != 2) {
            return null;
        }
        return AllowlistAction.REMOVE;
    }
}
