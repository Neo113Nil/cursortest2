package com.squareup.protos.cash.aegis.sync_values;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class SponsorshipTier$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SponsorshipTier.Companion.getClass();
        if (i == 1) {
            return SponsorshipTier.MANAGED_ACCOUNT;
        }
        if (i == 2) {
            return SponsorshipTier.TEEN;
        }
        if (i != 3) {
            return null;
        }
        return SponsorshipTier.AGENT;
    }
}
