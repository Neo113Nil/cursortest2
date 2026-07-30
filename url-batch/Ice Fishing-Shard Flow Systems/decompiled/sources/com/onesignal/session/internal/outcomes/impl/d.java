package com.onesignal.session.internal.outcomes.impl;

import java.util.List;

/* loaded from: classes.dex */
public interface d {
    Object cleanCachedUniqueOutcomeEventNotifications(V5.b bVar);

    Object deleteOldOutcomeEvent(f fVar, V5.b bVar);

    Object getAllEventsToSend(V5.b bVar);

    Object getNotCachedUniqueInfluencesForOutcome(String str, List<J3.b> list, V5.b bVar);

    Object saveOutcomeEvent(f fVar, V5.b bVar);

    Object saveUniqueOutcomeEventParams(f fVar, V5.b bVar);
}
