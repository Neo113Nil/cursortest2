package com.squareup.protos.cash.spendinginsights;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class TextSize$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TextSize.Companion.getClass();
        if (i == 0) {
            return TextSize.TEXT_SIZE_UNSPECIFIED;
        }
        if (i == 1) {
            return TextSize.TEXT_SIZE_MEDIUM;
        }
        if (i != 2) {
            return null;
        }
        return TextSize.TEXT_SIZE_LARGE;
    }
}
