package dev.hyo.openiap;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* compiled from: OpenIapModule.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Ldev/hyo/openiap/VerifyPurchaseResult;", "props", "Ldev/hyo/openiap/VerifyPurchaseProps;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@DebugMetadata(c = "dev.hyo.openiap.OpenIapModule$validateReceipt$1", f = "OpenIapModule.kt", i = {0}, l = {1179}, m = "invokeSuspend", n = {"props"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class OpenIapModule$validateReceipt$1 extends SuspendLambda implements Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OpenIapModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OpenIapModule$validateReceipt$1(OpenIapModule openIapModule, Continuation<? super OpenIapModule$validateReceipt$1> continuation) {
        super(2, continuation);
        this.this$0 = openIapModule;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OpenIapModule$validateReceipt$1 openIapModule$validateReceipt$1 = new OpenIapModule$validateReceipt$1(this.this$0, continuation);
        openIapModule$validateReceipt$1.L$0 = obj;
        return openIapModule$validateReceipt$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(VerifyPurchaseProps verifyPurchaseProps, Continuation<? super VerifyPurchaseResult> continuation) {
        return ((OpenIapModule$validateReceipt$1) create(verifyPurchaseProps, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        VerifyPurchaseProps verifyPurchaseProps = (VerifyPurchaseProps) this.L$0;
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
        Function2<VerifyPurchaseProps, Continuation<? super VerifyPurchaseResult>, Object> verifyPurchase = this.this$0.getVerifyPurchase();
        this.L$0 = SpillingKt.nullOutSpilledVariable(verifyPurchaseProps);
        this.label = 1;
        Object invoke = verifyPurchase.invoke(verifyPurchaseProps, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }
}
