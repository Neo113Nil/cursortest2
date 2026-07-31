package com.onesignal.session.internal.outcomes.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OutcomeEventsController.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsController", f = "OutcomeEventsController.kt", i = {}, l = {298}, m = "getUniqueIds", n = {}, s = {})
/* loaded from: classes3.dex */
final class OutcomeEventsController$getUniqueIds$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OutcomeEventsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutcomeEventsController$getUniqueIds$1(OutcomeEventsController outcomeEventsController, Continuation<? super OutcomeEventsController$getUniqueIds$1> continuation) {
        super(continuation);
        this.this$0 = outcomeEventsController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object uniqueIds;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        uniqueIds = this.this$0.getUniqueIds(null, null, this);
        return uniqueIds;
    }
}
