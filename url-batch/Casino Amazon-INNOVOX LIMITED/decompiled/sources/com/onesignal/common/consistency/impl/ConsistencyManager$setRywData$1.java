package com.onesignal.common.consistency.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ConsistencyManager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.common.consistency.impl.ConsistencyManager", f = "ConsistencyManager.kt", i = {0, 0, 0, 0, 0}, l = {100}, m = "setRywData", n = {"this", "id", "key", "value", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes2.dex */
final class ConsistencyManager$setRywData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConsistencyManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConsistencyManager$setRywData$1(ConsistencyManager consistencyManager, Continuation<? super ConsistencyManager$setRywData$1> continuation) {
        super(continuation);
        this.this$0 = consistencyManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setRywData(null, null, null, this);
    }
}
