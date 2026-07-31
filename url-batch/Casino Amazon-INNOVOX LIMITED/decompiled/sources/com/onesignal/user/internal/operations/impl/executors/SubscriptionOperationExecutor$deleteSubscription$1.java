package com.onesignal.user.internal.operations.impl.executors;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SubscriptionOperationExecutor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.operations.impl.executors.SubscriptionOperationExecutor", f = "SubscriptionOperationExecutor.kt", i = {0, 0}, l = {346}, m = "deleteSubscription", n = {"this", "op"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class SubscriptionOperationExecutor$deleteSubscription$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubscriptionOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionOperationExecutor$deleteSubscription$1(SubscriptionOperationExecutor subscriptionOperationExecutor, Continuation<? super SubscriptionOperationExecutor$deleteSubscription$1> continuation) {
        super(continuation);
        this.this$0 = subscriptionOperationExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object deleteSubscription;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        deleteSubscription = this.this$0.deleteSubscription(null, this);
        return deleteSubscription;
    }
}
