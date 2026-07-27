package com.onesignal.session.internal.outcomes.impl;

import java.util.Set;

/* loaded from: classes.dex */
public interface IOutcomeEventsPreferences {
    Set<String> getUnattributedUniqueOutcomeEventsSentByChannel();

    void setUnattributedUniqueOutcomeEventsSentByChannel(Set<String> set);
}
