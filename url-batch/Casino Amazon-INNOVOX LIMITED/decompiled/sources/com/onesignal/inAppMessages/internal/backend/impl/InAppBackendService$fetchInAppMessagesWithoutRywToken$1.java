package com.onesignal.inAppMessages.internal.backend.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InAppBackendService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", f = "InAppBackendService.kt", i = {0}, l = {284}, m = "fetchInAppMessagesWithoutRywToken", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class InAppBackendService$fetchInAppMessagesWithoutRywToken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppBackendService$fetchInAppMessagesWithoutRywToken$1(InAppBackendService inAppBackendService, Continuation<? super InAppBackendService$fetchInAppMessagesWithoutRywToken$1> continuation) {
        super(continuation);
        this.this$0 = inAppBackendService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchInAppMessagesWithoutRywToken;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchInAppMessagesWithoutRywToken = this.this$0.fetchInAppMessagesWithoutRywToken(null, null, null, this);
        return fetchInAppMessagesWithoutRywToken;
    }
}
