package com.squareup.protos.cash.scheduledreloader.resources.v1;

import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ScheduledReloadPreference$TargetIdentifierTokenType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ScheduledReloadPreference.TargetIdentifierTokenType.Companion.getClass();
        if (i == 0) {
            return ScheduledReloadPreference.TargetIdentifierTokenType.TARGET_IDENTIFIER_TOKEN_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ScheduledReloadPreference.TargetIdentifierTokenType.TARGET_IDENTIFIER_TOKEN_TYPE_GOAL;
        }
        if (i == 2) {
            return ScheduledReloadPreference.TargetIdentifierTokenType.TARGET_IDENTIFIER_TOKEN_TYPE_GENERAL_SAVINGS;
        }
        if (i != 3) {
            return null;
        }
        return ScheduledReloadPreference.TargetIdentifierTokenType.TARGET_IDENTIFIER_TOKEN_TYPE_SAVINGS_BALANCE;
    }
}
