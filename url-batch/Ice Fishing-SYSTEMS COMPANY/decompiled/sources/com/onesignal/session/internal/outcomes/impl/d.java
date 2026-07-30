package com.onesignal.session.internal.outcomes.impl;

import java.util.List;
import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public interface d {
    Object cleanCachedUniqueOutcomeEventNotifications(InterfaceC5133d interfaceC5133d);

    Object deleteOldOutcomeEvent(f fVar, InterfaceC5133d interfaceC5133d);

    Object getAllEventsToSend(InterfaceC5133d interfaceC5133d);

    Object getNotCachedUniqueInfluencesForOutcome(String str, List<G5.b> list, InterfaceC5133d interfaceC5133d);

    Object saveOutcomeEvent(f fVar, InterfaceC5133d interfaceC5133d);

    Object saveUniqueOutcomeEventParams(f fVar, InterfaceC5133d interfaceC5133d);
}
