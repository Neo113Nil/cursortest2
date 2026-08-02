package com.squareup.protos.franklin.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class BuildType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        BuildType.Companion.getClass();
        if (i == 0) {
            return BuildType.RELEASE;
        }
        if (i == 1) {
            return BuildType.BETA;
        }
        if (i == 2) {
            return BuildType.DOGFOOD;
        }
        if (i != 3) {
            return null;
        }
        return BuildType.ALPHA;
    }
}
