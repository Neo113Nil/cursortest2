package com.onesignal.session.internal.outcomes.impl;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OutcomeEventsController.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", f = "OutcomeEventsController.kt", i = {0, 0, 1, 1}, l = {74, 76, 85}, m = "sendSavedOutcomeEvent", n = {"this", NotificationCompat.CATEGORY_EVENT, "this", NotificationCompat.CATEGORY_EVENT}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class OutcomeEventsController$sendSavedOutcomeEvent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OutcomeEventsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutcomeEventsController$sendSavedOutcomeEvent$1(OutcomeEventsController outcomeEventsController, Continuation<? super OutcomeEventsController$sendSavedOutcomeEvent$1> continuation) {
        super(continuation);
        this.this$0 = outcomeEventsController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendSavedOutcomeEvent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendSavedOutcomeEvent = this.this$0.sendSavedOutcomeEvent(null, this);
        return sendSavedOutcomeEvent;
    }
}
