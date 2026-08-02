package com.squareup.protos.cash.woodrow.model.v1;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class AssetDisposition$DispositionType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AssetDisposition$DispositionType.Companion.getClass();
        return ActionType.Companion.m3936fromValue(i);
    }
}
