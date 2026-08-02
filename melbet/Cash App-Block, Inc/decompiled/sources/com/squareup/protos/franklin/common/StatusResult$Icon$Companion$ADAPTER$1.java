package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class StatusResult$Icon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        StatusResult.Icon.Companion.getClass();
        return KeyScope.Companion.m3971fromValue(i);
    }
}
