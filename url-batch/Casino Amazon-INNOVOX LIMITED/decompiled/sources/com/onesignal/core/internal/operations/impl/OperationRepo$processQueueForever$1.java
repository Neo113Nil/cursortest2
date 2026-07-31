package com.onesignal.core.internal.operations.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OperationRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.internal.operations.impl.OperationRepo", f = "OperationRepo.kt", i = {0, 1, 2, 3}, l = {257, 272, 275, 277}, m = "processQueueForever", n = {"this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class OperationRepo$processQueueForever$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OperationRepo$processQueueForever$1(OperationRepo operationRepo, Continuation<? super OperationRepo$processQueueForever$1> continuation) {
        super(continuation);
        this.this$0 = operationRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object processQueueForever;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processQueueForever = this.this$0.processQueueForever(this);
        return processQueueForever;
    }
}
