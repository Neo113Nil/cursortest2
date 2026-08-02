package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

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
            return Platform.PLATFORM_ANDROID;
        }
        if (i != 2) {
            return null;
        }
        return Platform.PLATFORM_IOS;
    }
}
