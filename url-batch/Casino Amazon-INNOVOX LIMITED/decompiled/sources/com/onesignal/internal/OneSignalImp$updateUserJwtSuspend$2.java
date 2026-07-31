package com.onesignal.internal;

import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OneSignalImp.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.internal.OneSignalImp$updateUserJwtSuspend$2", f = "OneSignalImp.kt", i = {}, l = {773}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OneSignalImp$updateUserJwtSuspend$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $externalId;
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneSignalImp$updateUserJwtSuspend$2(String str, String str2, OneSignalImp oneSignalImp, Continuation<? super OneSignalImp$updateUserJwtSuspend$2> continuation) {
        super(2, continuation);
        this.$externalId = str;
        this.$token = str2;
        this.this$0 = oneSignalImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneSignalImp$updateUserJwtSuspend$2(this.$externalId, this.$token, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OneSignalImp$updateUserJwtSuspend$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object suspendUntilInit;
        JwtTokenStore jwtTokenStore;
        IOperationRepo operationRepo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Logging.log(LogLevel.DEBUG, "updateUserJwtSuspend(externalId: " + this.$externalId + ", token: ..." + StringsKt.takeLast(this.$token, 8) + ')');
            this.label = 1;
            suspendUntilInit = this.this$0.suspendUntilInit("updateUserJwt", this);
            if (suspendUntilInit == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (this.this$0.isInitialized()) {
            jwtTokenStore = this.this$0.getJwtTokenStore();
            jwtTokenStore.putJwt(this.$externalId, this.$token);
            operationRepo = this.this$0.getOperationRepo();
            operationRepo.forceExecuteOperations();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("'initWithContext failed' before 'updateUserJwt'");
    }
}
