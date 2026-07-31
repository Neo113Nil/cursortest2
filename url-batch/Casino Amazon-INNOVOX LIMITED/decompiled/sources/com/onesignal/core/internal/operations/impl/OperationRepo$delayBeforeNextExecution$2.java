package com.onesignal.core.internal.operations.impl;

import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.operations.impl.OperationRepo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OperationRepo.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/onesignal/core/internal/operations/impl/OperationRepo$LoopWaiterMessage;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.internal.operations.impl.OperationRepo$delayBeforeNextExecution$2", f = "OperationRepo.kt", i = {}, l = {500}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OperationRepo$delayBeforeNextExecution$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super OperationRepo.LoopWaiterMessage>, Object> {
    int label;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OperationRepo$delayBeforeNextExecution$2(OperationRepo operationRepo, Continuation<? super OperationRepo$delayBeforeNextExecution$2> continuation) {
        super(2, continuation);
        this.this$0 = operationRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OperationRepo$delayBeforeNextExecution$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super OperationRepo.LoopWaiterMessage> continuation) {
        return ((OperationRepo$delayBeforeNextExecution$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        WaiterWithValue waiterWithValue;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        waiterWithValue = this.this$0.retryWaiter;
        this.label = 1;
        Object waitForWake = waiterWithValue.waitForWake(this);
        return waitForWake == coroutine_suspended ? coroutine_suspended : waitForWake;
    }
}
