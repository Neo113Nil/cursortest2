package com.squareup.protos.cash.guardrails.api.v1;

import com.squareup.protos.cash.guardrails.api.v1.AdversityBanner;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AdversityBanner$Style$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AdversityBanner.Style.Companion.getClass();
        if (i == 0) {
            return AdversityBanner.Style.CRITICAL;
        }
        if (i == 1) {
            return AdversityBanner.Style.SEVERE;
        }
        if (i != 2) {
            return null;
        }
        return AdversityBanner.Style.SUCCESS;
    }
}
