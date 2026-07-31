package com.onesignal.session.internal.outcomes.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OutcomeEventsRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsRepository", f = "OutcomeEventsRepository.kt", i = {0}, l = {286}, m = "getNotCachedUniqueInfluencesForOutcome", n = {"uniqueInfluences"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OutcomeEventsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1(OutcomeEventsRepository outcomeEventsRepository, Continuation<? super OutcomeEventsRepository$getNotCachedUniqueInfluencesForOutcome$1> continuation) {
        super(continuation);
        this.this$0 = outcomeEventsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getNotCachedUniqueInfluencesForOutcome(null, null, this);
    }
}
