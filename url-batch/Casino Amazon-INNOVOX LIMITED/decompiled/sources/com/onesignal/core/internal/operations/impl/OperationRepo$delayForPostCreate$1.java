package com.onesignal.core.internal.operations.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OperationRepo.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.internal.operations.impl.OperationRepo", f = "OperationRepo.kt", i = {0, 0}, l = {514}, m = "delayForPostCreate", n = {"this", "postCreateDelay"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
final class OperationRepo$delayForPostCreate$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OperationRepo$delayForPostCreate$1(OperationRepo operationRepo, Continuation<? super OperationRepo$delayForPostCreate$1> continuation) {
        super(continuation);
        this.this$0 = operationRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.delayForPostCreate(0L, this);
    }
}
