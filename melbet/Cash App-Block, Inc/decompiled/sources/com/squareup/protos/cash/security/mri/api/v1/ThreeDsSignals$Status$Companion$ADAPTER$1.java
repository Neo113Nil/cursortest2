package com.squareup.protos.cash.security.mri.api.v1;

import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSignals;
import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ThreeDsSignals$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ThreeDsSignals.Status.Companion.getClass();
        return ActionType.Companion.m3932fromValue(i);
    }
}
