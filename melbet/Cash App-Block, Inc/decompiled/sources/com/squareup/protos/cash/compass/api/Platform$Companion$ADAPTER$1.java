package com.squareup.protos.cash.compass.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class Platform$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Platform.Companion.getClass();
        if (i == 0) {
            return Platform.PLATFORM_UNSPECIFIED;
        }
        if (i == 1) {
            return Platform.PLATFORM_IOS;
        }
        if (i != 2) {
            return null;
        }
        return Platform.PLATFORM_ANDROID;
    }
}
