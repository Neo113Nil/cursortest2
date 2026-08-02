package com.squareup.cash.supportarticles.app.v1;

import com.squareup.cash.supportarticles.app.v1.SupportArticle;
import com.squareup.protos.cash.api.Error;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SupportArticle$Appearance$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SupportArticle.Appearance.Companion.getClass();
        return Error.Code.Companion.m3836fromValue(i);
    }
}
