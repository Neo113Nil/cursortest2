package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalBrand$WebLayoutType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalBrand.WebLayoutType.Companion.getClass();
        if (i == 0) {
            return LocalBrand.WebLayoutType.WEB_LAYOUT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalBrand.WebLayoutType.WEB_LAYOUT_TYPE_DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return LocalBrand.WebLayoutType.WEB_LAYOUT_TYPE_CARD;
    }
}
