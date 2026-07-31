package com.onesignal.user.internal.operations.impl.executors;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IdentityOperationExecutor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.operations.impl.executors.IdentityOperationExecutor", f = "IdentityOperationExecutor.kt", i = {0, 0, 1, 1}, l = {52, 97}, m = "execute", n = {"this", "lastOperation", "this", "lastOperation"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class IdentityOperationExecutor$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ IdentityOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityOperationExecutor$execute$1(IdentityOperationExecutor identityOperationExecutor, Continuation<? super IdentityOperationExecutor$execute$1> continuation) {
        super(continuation);
        this.this$0 = identityOperationExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
