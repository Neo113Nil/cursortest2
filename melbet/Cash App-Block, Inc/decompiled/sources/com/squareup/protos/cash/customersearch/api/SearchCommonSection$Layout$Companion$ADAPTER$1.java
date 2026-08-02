package com.squareup.protos.cash.customersearch.api;

import com.squareup.protos.cash.customersearch.api.SearchCommonSection;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SearchCommonSection$Layout$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SearchCommonSection.Layout.Companion.getClass();
        switch (i) {
            case 1:
                return SearchCommonSection.Layout.ONE_ROW;
            case 2:
                return SearchCommonSection.Layout.ONE_COLUMN;
            case 3:
                return SearchCommonSection.Layout.TWO_ROWS;
            case 4:
                return SearchCommonSection.Layout.TWO_COLUMNS;
            case 5:
                return SearchCommonSection.Layout.THREE_ROWS;
            case 6:
                return SearchCommonSection.Layout.THREE_COLUMNS;
            case 7:
                return SearchCommonSection.Layout.FOUR_ROWS;
            case 8:
                return SearchCommonSection.Layout.FOUR_COLUMNS;
            default:
                return null;
        }
    }
}
