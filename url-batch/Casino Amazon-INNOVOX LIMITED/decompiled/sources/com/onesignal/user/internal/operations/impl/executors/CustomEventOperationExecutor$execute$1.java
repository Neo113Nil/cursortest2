package com.onesignal.user.internal.operations.impl.executors;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CustomEventOperationExecutor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.operations.impl.executors.CustomEventOperationExecutor", f = "CustomEventOperationExecutor.kt", i = {}, l = {48}, m = "execute", n = {}, s = {})
/* loaded from: classes3.dex */
final class CustomEventOperationExecutor$execute$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomEventOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomEventOperationExecutor$execute$1(CustomEventOperationExecutor customEventOperationExecutor, Continuation<? super CustomEventOperationExecutor$execute$1> continuation) {
        super(continuation);
        this.this$0 = customEventOperationExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
