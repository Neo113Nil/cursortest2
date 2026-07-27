package com.onesignal.session.internal.outcomes.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", f = "OutcomeEventsController.kt", l = {214, 229, 232}, m = "sendAndCreateOutcomeEvent")
/* loaded from: classes.dex */
public final class OutcomeEventsController$sendAndCreateOutcomeEvent$1 extends AbstractC1295c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OutcomeEventsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutcomeEventsController$sendAndCreateOutcomeEvent$1(OutcomeEventsController outcomeEventsController, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = outcomeEventsController;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object sendAndCreateOutcomeEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendAndCreateOutcomeEvent = this.this$0.sendAndCreateOutcomeEvent(null, 0.0f, 0L, null, this);
        return sendAndCreateOutcomeEvent;
    }
}
