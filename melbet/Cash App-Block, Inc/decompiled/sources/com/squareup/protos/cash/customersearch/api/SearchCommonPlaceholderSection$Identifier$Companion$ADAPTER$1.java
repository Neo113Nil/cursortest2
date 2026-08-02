package com.squareup.protos.cash.customersearch.api;

import com.squareup.protos.cash.customersearch.api.SearchCommonPlaceholderSection;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SearchCommonPlaceholderSection$Identifier$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SearchCommonPlaceholderSection.Identifier.Companion.getClass();
        if (i == 1) {
            return SearchCommonPlaceholderSection.Identifier.RECENTLY_VIEWED;
        }
        if (i == 2) {
            return SearchCommonPlaceholderSection.Identifier.RECENT_SEARCHES;
        }
        if (i != 3) {
            return null;
        }
        return SearchCommonPlaceholderSection.Identifier.ZERO_SEARCH_RESULTS;
    }
}
