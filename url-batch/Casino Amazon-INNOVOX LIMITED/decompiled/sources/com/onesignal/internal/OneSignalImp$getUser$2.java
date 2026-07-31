package com.onesignal.internal;

import com.onesignal.common.services.ServiceProvider;
import com.onesignal.user.IUserManager;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OneSignalImp.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/onesignal/user/IUserManager;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.internal.OneSignalImp$getUser$2", f = "OneSignalImp.kt", i = {}, l = {661}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class OneSignalImp$getUser$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super IUserManager>, Object> {
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneSignalImp$getUser$2(OneSignalImp oneSignalImp, Continuation<? super OneSignalImp$getUser$2> continuation) {
        super(2, continuation);
        this.this$0 = oneSignalImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OneSignalImp$getUser$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super IUserManager> continuation) {
        return ((OneSignalImp$getUser$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object suspendAndReturn;
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
        OneSignalImp oneSignalImp = this.this$0;
        final OneSignalImp oneSignalImp2 = this.this$0;
        this.label = 1;
        suspendAndReturn = oneSignalImp.suspendAndReturn(new Function0<IUserManager>() { // from class: com.onesignal.internal.OneSignalImp$getUser$2.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final IUserManager invoke() {
                ServiceProvider serviceProvider;
                serviceProvider = OneSignalImp.this.services;
                return (IUserManager) serviceProvider.getService(IUserManager.class);
            }
        }, this);
        return suspendAndReturn == coroutine_suspended ? coroutine_suspended : suspendAndReturn;
    }
}
