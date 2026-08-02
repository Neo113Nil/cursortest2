package com.squareup.protos.cash.discover.api.app.v1.model;

import com.squareup.protos.cash.discover.api.app.v1.model.PlaceholderSection;
import com.squareup.protos.cash.grantly.api.Channel;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PlaceholderSection$Identifier$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PlaceholderSection.Identifier.Companion.getClass();
        return Channel.Companion.m3872fromValue(i);
    }
}
