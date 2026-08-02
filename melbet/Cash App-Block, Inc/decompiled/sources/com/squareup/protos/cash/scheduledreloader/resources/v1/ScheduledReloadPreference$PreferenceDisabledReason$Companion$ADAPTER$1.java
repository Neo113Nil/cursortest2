package com.squareup.protos.cash.scheduledreloader.resources.v1;

import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ScheduledReloadPreference$PreferenceDisabledReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ScheduledReloadPreference.PreferenceDisabledReason.Companion.getClass();
        switch (i) {
            case 0:
                return ScheduledReloadPreference.PreferenceDisabledReason.PREFERENCE_DISABLED_REASON_UNSPECIFIED;
            case 1:
                return ScheduledReloadPreference.PreferenceDisabledReason.PREFERENCE_DISABLED_REASON_CUSTOMER_UPDATED_PREFERENCE;
            case 2:
                return ScheduledReloadPreference.PreferenceDisabledReason.PREFERENCE_DISABLED_REASON_RELOAD_FAILURE;
            case 3:
                return ScheduledReloadPreference.PreferenceDisabledReason.PREFERENCE_DISABLED_REASON_DISABLED_BY_PRODUCT_SERVICE;
            case 4:
                return ScheduledReloadPreference.PreferenceDisabledReason.PREFERENCE_DISABLED_REASON_END_DATE_REACHED;
            case 5:
                return ScheduledReloadPreference.PreferenceDisabledReason.PREFERENCE_DISABLED_REASON_UNKNOWN;
            case 6:
                return ScheduledReloadPreference.PreferenceDisabledReason.PREFERENCE_DISABLED_REASON_DISABLED_BY_CCO;
            default:
                return null;
        }
    }
}
