package com.squareup.protos.cash.commerce;

import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.commerce.CommerceOrderRenderData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class CommerceOrderRenderData$Product$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        CommerceOrderRenderData.Product.Companion.getClass();
        return ImageLayout.Companion.m3843fromValue(i);
    }
}
