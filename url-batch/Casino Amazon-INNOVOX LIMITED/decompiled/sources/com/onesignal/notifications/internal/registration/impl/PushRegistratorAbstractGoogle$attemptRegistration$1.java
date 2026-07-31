package com.onesignal.notifications.internal.registration.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PushRegistratorAbstractGoogle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle", f = "PushRegistratorAbstractGoogle.kt", i = {0, 0}, l = {128}, m = "attemptRegistration", n = {"this", "currentRetry"}, s = {"L$0", "I$0"})
/* loaded from: classes3.dex */
final class PushRegistratorAbstractGoogle$attemptRegistration$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PushRegistratorAbstractGoogle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PushRegistratorAbstractGoogle$attemptRegistration$1(PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle, Continuation<? super PushRegistratorAbstractGoogle$attemptRegistration$1> continuation) {
        super(continuation);
        this.this$0 = pushRegistratorAbstractGoogle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object attemptRegistration;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        attemptRegistration = this.this$0.attemptRegistration(null, 0, this);
        return attemptRegistration;
    }
}
