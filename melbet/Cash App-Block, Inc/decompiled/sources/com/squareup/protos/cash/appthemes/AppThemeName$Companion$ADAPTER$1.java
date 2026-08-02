package com.squareup.protos.cash.appthemes;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AppThemeName$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AppThemeName.Companion.getClass();
        return CardProduct.Companion.m3834fromValue(i);
    }
}
