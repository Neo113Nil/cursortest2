package com.squareup.protos.cash.api;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.api.Error;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Error$Category$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Error.Category.Companion.getClass();
        return CardProduct.Companion.m3833fromValue(i);
    }
}
