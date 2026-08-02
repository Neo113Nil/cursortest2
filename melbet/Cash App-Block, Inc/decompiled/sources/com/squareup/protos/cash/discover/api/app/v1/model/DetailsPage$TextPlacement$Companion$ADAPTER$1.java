package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class DetailsPage$TextPlacement$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DetailsPage.TextPlacement.Companion.getClass();
        return RadioType.Companion.m3854fromValue(i);
    }
}
