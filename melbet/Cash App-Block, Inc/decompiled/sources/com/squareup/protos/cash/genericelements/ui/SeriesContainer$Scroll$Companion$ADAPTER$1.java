package com.squareup.protos.cash.genericelements.ui;

import com.squareup.protos.cash.genericelements.ui.SeriesContainer;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SeriesContainer$Scroll$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SeriesContainer.Scroll.Companion.getClass();
        if (i == 1) {
            return SeriesContainer.Scroll.VERTICAL;
        }
        if (i == 2) {
            return SeriesContainer.Scroll.HORIZONTAL;
        }
        if (i != 3) {
            return null;
        }
        return SeriesContainer.Scroll.HORIZONTAL_PAGINATED;
    }
}
