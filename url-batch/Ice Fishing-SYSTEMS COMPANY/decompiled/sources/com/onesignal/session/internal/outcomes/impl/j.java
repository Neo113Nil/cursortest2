package com.onesignal.session.internal.outcomes.impl;

import java.util.Set;

/* loaded from: classes2.dex */
public final class j implements c {
    private final F4.b preferences;

    public j(F4.b preferences) {
        kotlin.jvm.internal.h.e(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.c
    public Set<String> getUnattributedUniqueOutcomeEventsSentByChannel() {
        return this.preferences.getStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
    }

    @Override // com.onesignal.session.internal.outcomes.impl.c
    public void setUnattributedUniqueOutcomeEventsSentByChannel(Set<String> set) {
        this.preferences.saveStringSet(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }
}
