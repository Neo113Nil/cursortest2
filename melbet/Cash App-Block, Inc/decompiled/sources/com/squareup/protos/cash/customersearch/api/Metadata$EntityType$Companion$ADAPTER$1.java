package com.squareup.protos.cash.customersearch.api;

import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class Metadata$EntityType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Metadata.EntityType.Companion.getClass();
        return UiAlias.Type.Companion.fromValue(i);
    }
}
