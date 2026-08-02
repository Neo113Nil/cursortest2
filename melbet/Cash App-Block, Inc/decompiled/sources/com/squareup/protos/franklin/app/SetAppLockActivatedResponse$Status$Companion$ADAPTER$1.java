package com.squareup.protos.franklin.app;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.protos.franklin.app.SetAppLockActivatedResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SetAppLockActivatedResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetAppLockActivatedResponse.Status.Companion.getClass();
        return ActionType.Companion.m3939fromValue(i);
    }
}
