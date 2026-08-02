package com.squareup.protos.franklin.support;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SupportContactType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SupportContactType.Companion.getClass();
        if (i == 1) {
            return SupportContactType.EMAIL;
        }
        if (i == 2) {
            return SupportContactType.CALLBACK;
        }
        if (i == 3) {
            return SupportContactType.TEXT;
        }
        if (i != 4) {
            return null;
        }
        return SupportContactType.CHAT;
    }
}
