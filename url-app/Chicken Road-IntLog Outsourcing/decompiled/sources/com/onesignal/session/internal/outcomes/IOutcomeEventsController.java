package com.onesignal.session.internal.outcomes;

import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface IOutcomeEventsController {
    Object sendOutcomeEvent(String str, InterfaceC1218d interfaceC1218d);

    Object sendOutcomeEventWithValue(String str, float f3, InterfaceC1218d interfaceC1218d);

    Object sendSessionEndOutcomeEvent(long j2, InterfaceC1218d interfaceC1218d);

    Object sendUniqueOutcomeEvent(String str, InterfaceC1218d interfaceC1218d);
}
