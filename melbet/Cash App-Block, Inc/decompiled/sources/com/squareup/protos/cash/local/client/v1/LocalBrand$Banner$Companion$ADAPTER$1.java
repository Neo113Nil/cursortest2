package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalBrand;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalBrand$Banner$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalBrand.Banner.Companion.getClass();
        if (i == 0) {
            return LocalBrand.Banner.BANNER_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalBrand.Banner.BANNER_ENROLL;
        }
        if (i != 2) {
            return null;
        }
        return LocalBrand.Banner.BANNER_ADD_BRAND_OR_REMOVE;
    }
}
