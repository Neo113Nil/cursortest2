package com.chicken.road.cerman.fixs;

import com.chicken.road.cerman.fixs.notifications.VaccineReminders;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BroilerApp.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.chicken.road.cerman.fixs.BroilerApp$onCreate$1", f = "BroilerApp.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BroilerApp$onCreate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BroilerApp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BroilerApp$onCreate$1(BroilerApp broilerApp, Continuation<? super BroilerApp$onCreate$1> continuation) {
        super(2, continuation);
        this.this$0 = broilerApp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BroilerApp$onCreate$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BroilerApp$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            VaccineReminders vaccineReminders = VaccineReminders.INSTANCE;
            BroilerApp broilerApp = this.this$0;
            this.label = 1;
            if (vaccineReminders.rescheduleAll(broilerApp, broilerApp.getRepository(), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
