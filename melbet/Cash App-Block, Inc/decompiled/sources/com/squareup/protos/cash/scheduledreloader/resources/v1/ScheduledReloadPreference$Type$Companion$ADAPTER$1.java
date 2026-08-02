package com.squareup.protos.cash.scheduledreloader.resources.v1;

import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ScheduledReloadPreference$Type$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ScheduledReloadPreference.Type.Companion.getClass();
        return TaxEnvironment.Companion.m3926fromValue(i);
    }
}
