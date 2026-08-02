package com.squareup.protos.franklin.common;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class StablecoinRejectReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        StablecoinRejectReason.Companion.getClass();
        if (i == 1) {
            return StablecoinRejectReason.LIMITED_WEEKLY;
        }
        if (i == 2) {
            return StablecoinRejectReason.CUSTOMER_NOT_ELIGIBLE;
        }
        if (i != 3) {
            return null;
        }
        return StablecoinRejectReason.RISK_BLOCKED;
    }
}
