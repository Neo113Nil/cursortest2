package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.protos.cash.discover.api.app.v1.model.TileSection;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TileSection$ElementPlacement$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TileSection.ElementPlacement.Companion.getClass();
        return Alignment.Companion.m3860fromValue(i);
    }
}
