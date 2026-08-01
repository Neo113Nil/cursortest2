package com.onesignal.session.internal.outcomes.impl;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface d {
    Object cleanCachedUniqueOutcomeEventNotifications(ld.a aVar);

    Object deleteOldOutcomeEvent(f fVar, ld.a aVar);

    Object getAllEventsToSend(ld.a aVar);

    Object getNotCachedUniqueInfluencesForOutcome(String str, List<oc.b> list, ld.a aVar);

    Object saveOutcomeEvent(f fVar, ld.a aVar);

    Object saveUniqueOutcomeEventParams(f fVar, ld.a aVar);
}
