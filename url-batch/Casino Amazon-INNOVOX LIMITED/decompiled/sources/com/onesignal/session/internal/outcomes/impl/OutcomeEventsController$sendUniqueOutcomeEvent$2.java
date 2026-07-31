package com.onesignal.session.internal.outcomes.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OutcomeEventsController.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", f = "OutcomeEventsController.kt", i = {0, 0, 0}, l = {138, 151, 167}, m = "sendUniqueOutcomeEvent", n = {"this", "name", "influences"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class OutcomeEventsController$sendUniqueOutcomeEvent$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OutcomeEventsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutcomeEventsController$sendUniqueOutcomeEvent$2(OutcomeEventsController outcomeEventsController, Continuation<? super OutcomeEventsController$sendUniqueOutcomeEvent$2> continuation) {
        super(continuation);
        this.this$0 = outcomeEventsController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendUniqueOutcomeEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendUniqueOutcomeEvent = this.this$0.sendUniqueOutcomeEvent(null, null, this);
        return sendUniqueOutcomeEvent;
    }
}
