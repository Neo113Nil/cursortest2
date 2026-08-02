package com.squareup.protos.franklin.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class NearbyVisibility$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        NearbyVisibility.Companion.getClass();
        if (i == 1) {
            return NearbyVisibility.EVERYONE;
        }
        if (i != 2) {
            return null;
        }
        return NearbyVisibility.CONTACTS_ONLY;
    }
}
