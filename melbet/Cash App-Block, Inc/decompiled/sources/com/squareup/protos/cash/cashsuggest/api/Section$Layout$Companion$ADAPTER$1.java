package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.Section;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Section$Layout$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Section.Layout.Companion.getClass();
        switch (i) {
            case 1:
                return Section.Layout.ONE_ROW;
            case 2:
                return Section.Layout.ONE_COLUMN;
            case 3:
                return Section.Layout.TWO_ROWS;
            case 4:
                return Section.Layout.TWO_COLUMNS;
            case 5:
                return Section.Layout.THREE_ROWS;
            case 6:
                return Section.Layout.THREE_COLUMNS;
            case 7:
                return Section.Layout.FOUR_ROWS;
            case 8:
                return Section.Layout.FOUR_COLUMNS;
            default:
                return null;
        }
    }
}
