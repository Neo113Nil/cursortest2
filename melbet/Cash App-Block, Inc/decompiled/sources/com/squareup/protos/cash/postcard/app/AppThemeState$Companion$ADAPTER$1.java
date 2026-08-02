package com.squareup.protos.cash.postcard.app;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AppThemeState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AppThemeState.Companion.getClass();
        if (i == 0) {
            return AppThemeState.UNKNOWN_STATE;
        }
        if (i == 1) {
            return AppThemeState.LOCKED;
        }
        if (i != 2) {
            return null;
        }
        return AppThemeState.UNLOCKED;
    }
}
