package com.squareup.protos.cash.scheduledreloader.resources.v1;

import com.squareup.protos.cash.scheduledreloader.resources.v1.ScheduledReloadPreference;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class ScheduledReloadPreference$ReminderMode$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        ScheduledReloadPreference.ReminderMode.Companion.getClass();
        if (i == 0) {
            return ScheduledReloadPreference.ReminderMode.REMINDER_MODE_UNSPECIFIED;
        }
        if (i == 1) {
            return ScheduledReloadPreference.ReminderMode.REMINDER_MODE_OFF;
        }
        if (i != 2) {
            return null;
        }
        return ScheduledReloadPreference.ReminderMode.REMINDER_MODE_ALL_RELOADS;
    }
}
