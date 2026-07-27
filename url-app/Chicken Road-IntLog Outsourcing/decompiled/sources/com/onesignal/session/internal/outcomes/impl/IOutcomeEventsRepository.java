package com.onesignal.session.internal.outcomes.impl;

import com.onesignal.session.internal.influence.Influence;
import java.util.List;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface IOutcomeEventsRepository {
    Object cleanCachedUniqueOutcomeEventNotifications(InterfaceC1218d interfaceC1218d);

    Object deleteOldOutcomeEvent(OutcomeEventParams outcomeEventParams, InterfaceC1218d interfaceC1218d);

    Object getAllEventsToSend(InterfaceC1218d interfaceC1218d);

    Object getNotCachedUniqueInfluencesForOutcome(String str, List<Influence> list, InterfaceC1218d interfaceC1218d);

    Object saveOutcomeEvent(OutcomeEventParams outcomeEventParams, InterfaceC1218d interfaceC1218d);

    Object saveUniqueOutcomeEventParams(OutcomeEventParams outcomeEventParams, InterfaceC1218d interfaceC1218d);
}
