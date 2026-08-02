package com.squareup.protos.cash.recipientsuggestion;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SuggestionSource$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SuggestionSource.Companion.getClass();
        if (i == 0) {
            return SuggestionSource.UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return SuggestionSource.RECENTLY_TRANSACTED;
    }
}
