package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.GetEditorialResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GetEditorialResponse$EditorialContent$Image$Style$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GetEditorialResponse.EditorialContent.Image.Style.Companion.getClass();
        if (i == 0) {
            return GetEditorialResponse.EditorialContent.Image.Style.STYLE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return GetEditorialResponse.EditorialContent.Image.Style.STYLE_HERO;
    }
}
