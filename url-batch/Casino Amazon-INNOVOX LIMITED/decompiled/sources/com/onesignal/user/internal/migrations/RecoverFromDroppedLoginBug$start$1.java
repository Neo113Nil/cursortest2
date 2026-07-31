package com.onesignal.user.internal.migrations;

import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.identity.IdentityModelStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: RecoverFromDroppedLoginBug.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.migrations.RecoverFromDroppedLoginBug$start$1", f = "RecoverFromDroppedLoginBug.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RecoverFromDroppedLoginBug$start$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ RecoverFromDroppedLoginBug this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecoverFromDroppedLoginBug$start$1(RecoverFromDroppedLoginBug recoverFromDroppedLoginBug, Continuation<? super RecoverFromDroppedLoginBug$start$1> continuation) {
        super(1, continuation);
        this.this$0 = recoverFromDroppedLoginBug;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new RecoverFromDroppedLoginBug$start$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((RecoverFromDroppedLoginBug$start$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IOperationRepo iOperationRepo;
        boolean isInBadState;
        IdentityModelStore identityModelStore;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            iOperationRepo = this.this$0._operationRepo;
            this.label = 1;
            if (iOperationRepo.awaitInitialized(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        isInBadState = this.this$0.isInBadState();
        if (isInBadState) {
            StringBuilder sb = new StringBuilder("User with externalId:");
            identityModelStore = this.this$0._identityModelStore;
            Logging.warn$default(sb.append(identityModelStore.getModel().getExternalId()).append(" was in a bad state, causing it to not update on OneSignal's backend! We are recovering and replaying all unsent operations now.").toString(), null, 2, null);
            this.this$0.recoverByAddingBackDroppedLoginOperation();
        }
        return Unit.INSTANCE;
    }
}
