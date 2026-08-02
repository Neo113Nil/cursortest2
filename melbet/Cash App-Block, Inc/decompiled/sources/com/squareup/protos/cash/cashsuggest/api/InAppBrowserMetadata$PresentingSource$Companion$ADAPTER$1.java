package com.squareup.protos.cash.cashsuggest.api;

import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class InAppBrowserMetadata$PresentingSource$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InAppBrowserMetadata.PresentingSource.Companion.getClass();
        if (i == 0) {
            return InAppBrowserMetadata.PresentingSource.UNKNOWN_PRESENTING_SOURCE;
        }
        if (i == 1) {
            return InAppBrowserMetadata.PresentingSource.TIMELINE_SHEET;
        }
        if (i != 2) {
            return null;
        }
        return InAppBrowserMetadata.PresentingSource.DETAIL_SHEET;
    }
}
