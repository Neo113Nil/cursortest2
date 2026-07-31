package com.onesignal.inAppMessages.internal.backend.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InAppBackendService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", f = "InAppBackendService.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {248, 259, 275}, m = "attemptFetchWithRetries", n = {"this", "baseUrl", "rywData", "sessionDurationProvider", "jwt", "attempts", "retryLimit", "this", "baseUrl", "rywData", "sessionDurationProvider", "jwt", "attempts", "retryLimit"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1"})
/* loaded from: classes3.dex */
final class InAppBackendService$attemptFetchWithRetries$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppBackendService$attemptFetchWithRetries$1(InAppBackendService inAppBackendService, Continuation<? super InAppBackendService$attemptFetchWithRetries$1> continuation) {
        super(continuation);
        this.this$0 = inAppBackendService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object attemptFetchWithRetries;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        attemptFetchWithRetries = this.this$0.attemptFetchWithRetries(null, null, null, null, this);
        return attemptFetchWithRetries;
    }
}
