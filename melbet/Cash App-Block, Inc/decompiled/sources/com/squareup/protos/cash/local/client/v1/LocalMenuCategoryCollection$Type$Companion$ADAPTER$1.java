package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalMenuCategoryCollection;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class LocalMenuCategoryCollection$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LocalMenuCategoryCollection.Type.Companion.getClass();
        if (i == 0) {
            return LocalMenuCategoryCollection.Type.TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return LocalMenuCategoryCollection.Type.TYPE_ORDERING_MENU;
        }
        if (i != 2) {
            return null;
        }
        return LocalMenuCategoryCollection.Type.TYPE_BOOKING_SERVICES;
    }
}
