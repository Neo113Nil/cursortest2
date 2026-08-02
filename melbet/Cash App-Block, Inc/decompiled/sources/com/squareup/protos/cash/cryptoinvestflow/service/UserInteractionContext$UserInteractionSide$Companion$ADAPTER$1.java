package com.squareup.protos.cash.cryptoinvestflow.service;

import com.squareup.protos.cash.cryptoinvestflow.service.UserInteractionContext;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class UserInteractionContext$UserInteractionSide$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        UserInteractionContext.UserInteractionSide.Companion.getClass();
        if (i == 1) {
            return UserInteractionContext.UserInteractionSide.BUY;
        }
        if (i != 2) {
            return null;
        }
        return UserInteractionContext.UserInteractionSide.SELL;
    }
}
