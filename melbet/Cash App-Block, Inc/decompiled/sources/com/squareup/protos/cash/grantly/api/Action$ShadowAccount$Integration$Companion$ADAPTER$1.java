package com.squareup.protos.cash.grantly.api;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Action$ShadowAccount$Integration$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Action.ShadowAccount.Integration.Companion.getClass();
        if (i == 1) {
            return Action.ShadowAccount.Integration.DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return Action.ShadowAccount.Integration.APPLE_PAYLATER;
    }
}
