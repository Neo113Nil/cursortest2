package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.AllowanceRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class AllowanceRenderData$Role$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AllowanceRenderData.Role.Companion.getClass();
        if (i == 1) {
            return AllowanceRenderData.Role.SENDER;
        }
        if (i != 2) {
            return null;
        }
        return AllowanceRenderData.Role.RECIPIENT;
    }
}
