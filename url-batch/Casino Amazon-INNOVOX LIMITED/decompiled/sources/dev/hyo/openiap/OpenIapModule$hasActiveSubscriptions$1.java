package dev.hyo.openiap;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "subscriptionIds", "", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$hasActiveSubscriptions$1", f = "OpenIapModule.kt", i = {0}, l = {289}, m = "invokeSuspend", n = {"subscriptionIds"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$hasActiveSubscriptions$1 extends SuspendLambda implements Function2<List<? extends String>, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$hasActiveSubscriptions$1(OpenIapModule openIapModule, Continuation<? super OpenIapModule$hasActiveSubscriptions$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapModule$hasActiveSubscriptions$1 openIapModule$hasActiveSubscriptions$1 = new OpenIapModule$hasActiveSubscriptions$1(this.this$0, continuation);
        openIapModule$hasActiveSubscriptions$1.L$0 = obj;
        return openIapModule$hasActiveSubscriptions$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends String> list, Continuation<? super Boolean> continuation) {
        return invoke2((List<String>) list, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<String> list, Continuation<? super Boolean> continuation) {
        return ((OpenIapModule$hasActiveSubscriptions$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<String> list = (List) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function2<List<String>, Continuation<? super List<ActiveSubscription>>, Object> getActiveSubscriptions = this.this$0.getGetActiveSubscriptions();
            this.L$0 = SpillingKt.nullOutSpilledVariable(list);
            this.label = 1;
            obj = getActiveSubscriptions.invoke(list, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(!((Collection) obj).isEmpty());
    }
}
