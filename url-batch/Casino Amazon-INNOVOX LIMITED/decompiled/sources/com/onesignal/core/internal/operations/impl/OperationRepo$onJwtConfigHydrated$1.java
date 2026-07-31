package com.onesignal.core.internal.operations.impl;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: OperationRepo.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.core.internal.operations.impl.OperationRepo$onJwtConfigHydrated$1", f = "OperationRepo.kt", i = {}, l = {326}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OperationRepo$onJwtConfigHydrated$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $ivRequired;
    int label;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OperationRepo$onJwtConfigHydrated$1(OperationRepo operationRepo, boolean z, Continuation<? super OperationRepo$onJwtConfigHydrated$1> continuation) {
        super(1, continuation);
        this.this$0 = operationRepo;
        this.$ivRequired = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new OperationRepo$onJwtConfigHydrated$1(this.this$0, this.$ivRequired, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((OperationRepo$onJwtConfigHydrated$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (this.this$0.awaitInitialized(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (this.$ivRequired) {
            this.this$0.removeOperationsWithoutExternalId$com_onesignal_core();
        }
        this.this$0.forceExecuteOperations();
        return Unit.INSTANCE;
    }
}
