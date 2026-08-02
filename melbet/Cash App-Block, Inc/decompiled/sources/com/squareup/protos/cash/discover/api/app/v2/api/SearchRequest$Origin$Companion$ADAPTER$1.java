package com.squareup.protos.cash.discover.api.app.v2.api;

import com.squareup.protos.cash.discover.api.app.v2.api.SearchRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SearchRequest$Origin$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SearchRequest.Origin.Companion.getClass();
        if (i == 1) {
            return SearchRequest.Origin.ACTIVITY;
        }
        if (i == 2) {
            return SearchRequest.Origin.PAYMENT_PAD;
        }
        if (i == 3) {
            return SearchRequest.Origin.MONEY;
        }
        if (i != 4) {
            return null;
        }
        return SearchRequest.Origin.UNSPECIFIED;
    }
}
