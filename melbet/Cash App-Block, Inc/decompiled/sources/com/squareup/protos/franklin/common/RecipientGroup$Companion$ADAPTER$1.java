package com.squareup.protos.franklin.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class RecipientGroup$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RecipientGroup.Companion.getClass();
        if (i == 1) {
            return RecipientGroup.NEARBY;
        }
        if (i == 2) {
            return RecipientGroup.RECENTS;
        }
        if (i != 3) {
            return null;
        }
        return RecipientGroup.SUGGESTIONS;
    }
}
