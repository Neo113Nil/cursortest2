package com.squareup.protos.cash.scheduledreloader.resources.v1;

import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ScheduledReloadPreference$SourceType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ScheduledReloadPreference.SourceType.Companion.getClass();
        if (i == 0) {
            return ScheduledReloadPreference.SourceType.SOURCE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ScheduledReloadPreference.SourceType.SOURCE_TYPE_DEBIT_CARD;
        }
        if (i != 2) {
            return null;
        }
        return ScheduledReloadPreference.SourceType.SOURCE_TYPE_CASH_BALANCE;
    }
}
