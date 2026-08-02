package com.squareup.protos.cash.cashstorefronts.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class TargetApp$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        TargetApp.Companion.getClass();
        if (i == 1) {
            return TargetApp.TARGET_CASH_APP;
        }
        if (i != 2) {
            return null;
        }
        return TargetApp.TARGET_AFTERPAY;
    }
}
