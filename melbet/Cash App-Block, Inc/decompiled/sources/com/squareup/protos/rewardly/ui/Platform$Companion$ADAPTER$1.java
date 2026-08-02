package com.squareup.protos.rewardly.ui;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Platform$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Platform.Companion.getClass();
        if (i == 1) {
            return Platform.UNKNOWN;
        }
        if (i == 2) {
            return Platform.ANDROID;
        }
        if (i == 3) {
            return Platform.IOS;
        }
        if (i != 4) {
            return null;
        }
        return Platform.WEB;
    }
}
