package com.onesignal.session.internal.outcomes.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OutcomeEventsController.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", f = "OutcomeEventsController.kt", i = {0, 0, 0, 0}, l = {214, 229, 232}, m = "sendAndCreateOutcomeEvent", n = {"this", "name", "eventParams", "timestampSeconds"}, s = {"L$0", "L$1", "L$2", "J$0"})
/* loaded from: classes3.dex */
final class OutcomeEventsController$sendAndCreateOutcomeEvent$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OutcomeEventsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutcomeEventsController$sendAndCreateOutcomeEvent$1(OutcomeEventsController outcomeEventsController, Continuation<? super OutcomeEventsController$sendAndCreateOutcomeEvent$1> continuation) {
        super(continuation);
        this.this$0 = outcomeEventsController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendAndCreateOutcomeEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendAndCreateOutcomeEvent = this.this$0.sendAndCreateOutcomeEvent(null, 0.0f, 0L, null, this);
        return sendAndCreateOutcomeEvent;
    }
}
