package com.onesignal.user.internal.operations.impl.executors;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UpdateUserOperationExecutor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.operations.impl.executors.UpdateUserOperationExecutor", f = "UpdateUserOperationExecutor.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {149, 160, 162}, m = "execute", n = {"this", "operations", "appId", "onesignalId", "this", "operations", "appId", "onesignalId", "this", "operations", "appId", "onesignalId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
final class UpdateUserOperationExecutor$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateUserOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateUserOperationExecutor$execute$1(UpdateUserOperationExecutor updateUserOperationExecutor, Continuation<? super UpdateUserOperationExecutor$execute$1> continuation) {
        super(continuation);
        this.this$0 = updateUserOperationExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
