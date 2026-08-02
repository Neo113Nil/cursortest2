package com.squareup.protos.cash.whimsicard.syncentity;

import com.squareup.protos.cash.whimsicard.syncentity.PresentationEntry;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class PresentationEntry$Category$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PresentationEntry.Category.Companion.getClass();
        if (i == 0) {
            return PresentationEntry.Category.CATEGORY_UNSPECIFIED;
        }
        if (i == 1) {
            return PresentationEntry.Category.INFORMATIONAL;
        }
        if (i == 2) {
            return PresentationEntry.Category.AWAITING_EXTERNAL;
        }
        if (i != 3) {
            return null;
        }
        return PresentationEntry.Category.ACTION_NEEDED;
    }
}
