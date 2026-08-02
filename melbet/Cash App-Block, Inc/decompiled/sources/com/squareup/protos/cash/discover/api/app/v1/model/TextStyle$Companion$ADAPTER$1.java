package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TextStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TextStyle.Companion.getClass();
        return ImageLayout.Companion.m3846fromValue(i);
    }
}
