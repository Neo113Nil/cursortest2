package com.onesignal.user.internal.backend.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SubscriptionBackendService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.backend.impl.SubscriptionBackendService", f = "SubscriptionBackendService.kt", i = {}, l = {114}, m = "getIdentityFromSubscription", n = {}, s = {})
/* loaded from: classes3.dex */
final class SubscriptionBackendService$getIdentityFromSubscription$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubscriptionBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionBackendService$getIdentityFromSubscription$1(SubscriptionBackendService subscriptionBackendService, Continuation<? super SubscriptionBackendService$getIdentityFromSubscription$1> continuation) {
        super(continuation);
        this.this$0 = subscriptionBackendService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getIdentityFromSubscription(null, null, this);
    }
}
