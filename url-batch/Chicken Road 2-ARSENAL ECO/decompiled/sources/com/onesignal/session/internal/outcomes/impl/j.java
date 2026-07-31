package com.onesignal.session.internal.outcomes.impl;

import f2.InterfaceC0365b;
import java.util.Set;

/* loaded from: classes.dex */
public final class j implements c {
    private final InterfaceC0365b preferences;

    public j(InterfaceC0365b preferences) {
        kotlin.jvm.internal.i.e(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.c
    public Set<String> getUnattributedUniqueOutcomeEventsSentByChannel() {
        return this.preferences.getStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", null);
    }

    @Override // com.onesignal.session.internal.outcomes.impl.c
    public void setUnattributedUniqueOutcomeEventsSentByChannel(Set<String> set) {
        this.preferences.saveStringSet(com.onesignal.common.threading.a.BASE_THREAD_NAME, "PREFS_OS_UNATTRIBUTED_UNIQUE_OUTCOME_EVENTS_SENT", set);
    }
}
