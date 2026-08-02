package com.squareup.cash.supportarticles.app.v1;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Glyph$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Glyph.Companion.getClass();
        return CardProduct.Companion.m3831fromValue(i);
    }
}
