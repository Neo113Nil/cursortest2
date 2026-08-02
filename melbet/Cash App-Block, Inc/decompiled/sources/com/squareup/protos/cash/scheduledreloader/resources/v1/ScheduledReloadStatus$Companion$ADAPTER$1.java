package com.squareup.protos.cash.scheduledreloader.resources.v1;

import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class ScheduledReloadStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ScheduledReloadStatus.Companion.getClass();
        return TextSize.Companion.m3920fromValue(i);
    }
}
