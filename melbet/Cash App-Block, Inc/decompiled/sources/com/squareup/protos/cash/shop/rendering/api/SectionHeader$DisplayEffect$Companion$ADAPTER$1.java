package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SectionHeader$DisplayEffect$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SectionHeader.DisplayEffect.Companion.getClass();
        if (i == 0) {
            return SectionHeader.DisplayEffect.UNSPECIFIED;
        }
        if (i == 1) {
            return SectionHeader.DisplayEffect.DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return SectionHeader.DisplayEffect.FADED;
    }
}
