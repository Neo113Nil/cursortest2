package com.onesignal.core.internal.operations.impl;

import com.onesignal.core.internal.operations.Operation;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.internal.operations.impl.OperationRepo$enqueue$1", f = "OperationRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OperationRepo$enqueue$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $flush;
    final /* synthetic */ Operation $operation;
    int label;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OperationRepo$enqueue$1(OperationRepo operationRepo, Operation operation, boolean z, Continuation<? super OperationRepo$enqueue$1> continuation) {
        super(2, continuation);
        this.this$0 = operationRepo;
        this.$operation = operation;
        this.$flush = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OperationRepo$enqueue$1(this.this$0, this.$operation, this.$flush, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OperationRepo$enqueue$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        OperationRepo operationRepo = this.this$0;
        Operation operation = this.$operation;
        i = this.this$0.enqueueIntoBucket;
        OperationRepo.internalEnqueue$default(operationRepo, new OperationRepo.OperationQueueItem(operation, null, i, 0, 10, null), this.$flush, true, null, 8, null);
        return Unit.INSTANCE;
    }
}
