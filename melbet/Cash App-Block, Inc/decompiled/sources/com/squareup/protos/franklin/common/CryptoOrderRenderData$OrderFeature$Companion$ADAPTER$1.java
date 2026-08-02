package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.CryptoOrderRenderData;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class CryptoOrderRenderData$OrderFeature$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CryptoOrderRenderData.OrderFeature.Companion.getClass();
        return UiControl.Type.Companion.m3963fromValue(i);
    }
}
