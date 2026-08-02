package com.squareup.protos.franklin.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class NetworkCongestionLevel$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        NetworkCongestionLevel.Companion.getClass();
        if (i == 1) {
            return NetworkCongestionLevel.LOW;
        }
        if (i == 2) {
            return NetworkCongestionLevel.MEDIUM;
        }
        if (i != 3) {
            return null;
        }
        return NetworkCongestionLevel.HIGH;
    }
}
