package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.core.internal.preferences.IPreferencesService;
import com.onesignal.core.internal.preferences.PreferenceOneSignalKeys;
import java.util.Set;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OutcomeEventsPreferences implements IOutcomeEventsPreferences {
    private final IPreferencesService preferences;

    public OutcomeEventsPreferences(IPreferencesService preferences) {
        i.e(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsPreferences
    public Set<String> getUnattributedUniqueOutcomeEventsSentByChannel() {
        return this.preferences.getStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT, null);
    }

    @Override // com.onesignal.session.internal.outcomes.impl.IOutcomeEventsPreferences
    public void setUnattributedUniqueOutcomeEventsSentByChannel(Set<String> set) {
        this.preferences.saveStringSet("OneSignal", PreferenceOneSignalKeys.PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT, set);
    }
}
