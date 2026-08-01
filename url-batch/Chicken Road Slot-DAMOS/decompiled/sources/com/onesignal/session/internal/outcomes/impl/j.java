package com.onesignal.session.internal.outcomes.impl;

import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements c {
    private final qa.b preferences;

    public j(qa.b bVar) {
        bVar.getClass();
        this.preferences = bVar;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.c
    public Set<String> getUnattributedUniqueOutcomeEventsSentByChannel() {
        return this.preferences.getStringSet("OneSignal", "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
    }

    @Override // com.onesignal.session.internal.outcomes.impl.c
    public void setUnattributedUniqueOutcomeEventsSentByChannel(Set<String> set) {
        this.preferences.saveStringSet("OneSignal", "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }
}
