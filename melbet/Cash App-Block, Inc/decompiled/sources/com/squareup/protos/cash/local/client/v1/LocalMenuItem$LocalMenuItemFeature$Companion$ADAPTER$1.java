package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalMenuItem;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalMenuItem$LocalMenuItemFeature$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalMenuItem.LocalMenuItemFeature.Companion.getClass();
        if (i == 0) {
            return LocalMenuItem.LocalMenuItemFeature.LOCAL_MENU_ITEM_FEATURE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return LocalMenuItem.LocalMenuItemFeature.LOCAL_MENU_ITEM_FEATURE_RESERVATION;
    }
}
