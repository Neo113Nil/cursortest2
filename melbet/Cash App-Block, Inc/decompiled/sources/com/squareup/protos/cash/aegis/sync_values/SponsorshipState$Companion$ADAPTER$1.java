package com.squareup.protos.cash.aegis.sync_values;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SponsorshipState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SponsorshipState.Companion.getClass();
        if (i == 0) {
            return SponsorshipState.PENDING;
        }
        if (i == 1) {
            return SponsorshipState.ACTIVE;
        }
        if (i == 2) {
            return SponsorshipState.CANCELED;
        }
        if (i != 3) {
            return null;
        }
        return SponsorshipState.SUSPENDED;
    }
}
