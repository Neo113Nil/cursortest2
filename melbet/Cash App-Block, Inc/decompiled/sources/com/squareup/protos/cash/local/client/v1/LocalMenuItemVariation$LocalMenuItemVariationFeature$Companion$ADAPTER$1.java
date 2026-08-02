package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalMenuItemVariation;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalMenuItemVariation$LocalMenuItemVariationFeature$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalMenuItemVariation.LocalMenuItemVariationFeature.Companion.getClass();
        if (i == 0) {
            return LocalMenuItemVariation.LocalMenuItemVariationFeature.LOCAL_MENU_ITEM_VARIATION_FEATURE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return LocalMenuItemVariation.LocalMenuItemVariationFeature.LOCAL_MENU_ITEM_VARIATION_FEATURE_RESERVATION;
    }
}
