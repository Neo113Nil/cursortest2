package com.squareup.protos.cash.badging.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public final class ItemType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ItemType.Companion.getClass();
        return ResourceFileSystem.Companion.fromValue(i);
    }
}
