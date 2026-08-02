package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class FilterGroupSection$FilterGroupItem$ItemLayout$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        FilterGroupSection.FilterGroupItem.ItemLayout.Companion.getClass();
        if (i == 1) {
            return FilterGroupSection.FilterGroupItem.ItemLayout.PILL;
        }
        if (i == 2) {
            return FilterGroupSection.FilterGroupItem.ItemLayout.TILE;
        }
        if (i != 3) {
            return null;
        }
        return FilterGroupSection.FilterGroupItem.ItemLayout.ROW;
    }
}
