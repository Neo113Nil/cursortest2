package com.squareup.protos.cash.pools;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class HighlightedPoolsSelectionMode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        HighlightedPoolsSelectionMode.Companion.getClass();
        if (i == 0) {
            return HighlightedPoolsSelectionMode.HIGHLIGHTED_POOLS_SELECTION_MODE_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return HighlightedPoolsSelectionMode.HIGHLIGHTED_POOLS_SELECTION_MODE_ACTIVE_ONLY;
    }
}
