package com.onesignal.user.internal.operations.impl.executors;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SubscriptionOperationExecutor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor", f = "SubscriptionOperationExecutor.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {145, 157, 159}, m = "createSubscription", n = {"this", "createOperation", "this", "createOperation", "backendSubscriptionId", "this", "createOperation", "backendSubscriptionId"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class SubscriptionOperationExecutor$createSubscription$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubscriptionOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionOperationExecutor$createSubscription$1(SubscriptionOperationExecutor subscriptionOperationExecutor, Continuation<? super SubscriptionOperationExecutor$createSubscription$1> continuation) {
        super(continuation);
        this.this$0 = subscriptionOperationExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object createSubscription;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createSubscription = this.this$0.createSubscription(null, null, this);
        return createSubscription;
    }
}
