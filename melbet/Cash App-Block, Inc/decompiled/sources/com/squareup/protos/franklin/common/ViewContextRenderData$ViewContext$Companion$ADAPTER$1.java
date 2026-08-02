package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.ViewContextRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ViewContextRenderData$ViewContext$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ViewContextRenderData.ViewContext.Companion.getClass();
        if (i == 1) {
            return ViewContextRenderData.ViewContext.PARENTAL_CONTROLS;
        }
        return null;
    }
}
