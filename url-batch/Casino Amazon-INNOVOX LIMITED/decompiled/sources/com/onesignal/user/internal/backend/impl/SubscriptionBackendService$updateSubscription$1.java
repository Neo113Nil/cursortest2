package com.onesignal.user.internal.backend.impl;

import com.facebook.soloader.Elf64;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SubscriptionBackendService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.backend.impl.SubscriptionBackendService", f = "SubscriptionBackendService.kt", i = {}, l = {Elf64.Ehdr.E_SHSTRNDX}, m = "updateSubscription", n = {}, s = {})
/* loaded from: classes3.dex */
final class SubscriptionBackendService$updateSubscription$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubscriptionBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionBackendService$updateSubscription$1(SubscriptionBackendService subscriptionBackendService, Continuation<? super SubscriptionBackendService$updateSubscription$1> continuation) {
        super(continuation);
        this.this$0 = subscriptionBackendService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateSubscription(null, null, null, null, this);
    }
}
