package com.squareup.protos.franklin.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class LinkType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        LinkType.Companion.getClass();
        if (i == 1) {
            return LinkType.NEW_LINK;
        }
        if (i != 2) {
            return null;
        }
        return LinkType.REPLACE;
    }
}
