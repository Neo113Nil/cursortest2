package dev.hyo.openiap;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ldev/hyo/openiap/RequestPurchaseResultPurchases;", "props", "Ldev/hyo/openiap/RequestPurchaseProps;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$requestPurchase$1", f = "OpenIapModule.kt", i = {0}, l = {709}, m = "invokeSuspend", n = {"props"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$requestPurchase$1 extends SuspendLambda implements Function2<RequestPurchaseProps, Continuation<? super RequestPurchaseResultPurchases>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$requestPurchase$1(OpenIapModule openIapModule, Continuation<? super OpenIapModule$requestPurchase$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapModule$requestPurchase$1 openIapModule$requestPurchase$1 = new OpenIapModule$requestPurchase$1(this.this$0, continuation);
        openIapModule$requestPurchase$1.L$0 = obj;
        return openIapModule$requestPurchase$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RequestPurchaseProps requestPurchaseProps, Continuation<? super RequestPurchaseResultPurchases> continuation) {
        return ((OpenIapModule$requestPurchase$1) create(requestPurchaseProps, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RequestPurchaseProps requestPurchaseProps = (RequestPurchaseProps) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.L$0 = SpillingKt.nullOutSpilledVariable(requestPurchaseProps);
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new OpenIapModule$requestPurchase$1$purchases$1(this.this$0, requestPurchaseProps, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return new RequestPurchaseResultPurchases((List) obj);
    }
}
