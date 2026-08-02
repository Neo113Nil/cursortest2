package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.RetroOrderSelectionResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class RetroOrderSelectionResponse$TextLineItemSection$DisplayStyle$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RetroOrderSelectionResponse.TextLineItemSection.DisplayStyle.Companion.getClass();
        if (i == 0) {
            return RetroOrderSelectionResponse.TextLineItemSection.DisplayStyle.ORDERED;
        }
        if (i != 1) {
            return null;
        }
        return RetroOrderSelectionResponse.TextLineItemSection.DisplayStyle.UNORDERED;
    }
}
