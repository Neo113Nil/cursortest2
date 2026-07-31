package com.onesignal.session.internal.outcomes.impl;

import h3.C0406b;
import java.util.List;
import o5.InterfaceC0564d;

/* loaded from: classes.dex */
public interface d {
    Object cleanCachedUniqueOutcomeEventNotifications(InterfaceC0564d interfaceC0564d);

    Object deleteOldOutcomeEvent(f fVar, InterfaceC0564d interfaceC0564d);

    Object getAllEventsToSend(InterfaceC0564d interfaceC0564d);

    Object getNotCachedUniqueInfluencesForOutcome(String str, List<C0406b> list, InterfaceC0564d interfaceC0564d);

    Object saveOutcomeEvent(f fVar, InterfaceC0564d interfaceC0564d);

    Object saveUniqueOutcomeEventParams(f fVar, InterfaceC0564d interfaceC0564d);
}
