package com.squareup.protos.cash.marketdata.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class NewsType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        NewsType.Companion.getClass();
        if (i == 1) {
            return NewsType.GLOBAL_EQUITY;
        }
        if (i == 2) {
            return NewsType.EQUITY;
        }
        if (i != 3) {
            return null;
        }
        return NewsType.CRYPTO;
    }
}
