package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class InfoTileIcon$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        InfoTileIcon.Companion.getClass();
        if (i == 1) {
            return InfoTileIcon.INFO_TILE_ICON_WARNING;
        }
        return null;
    }
}
