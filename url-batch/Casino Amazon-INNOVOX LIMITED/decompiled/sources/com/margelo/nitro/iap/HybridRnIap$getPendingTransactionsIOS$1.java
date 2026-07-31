package com.margelo.nitro.iap;

import dev.hyo.openiap.OpenIapError;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/margelo/nitro/iap/NitroPurchase;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$getPendingTransactionsIOS$1", f = "HybridRnIap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$getPendingTransactionsIOS$1 extends SuspendLambda implements Function1<Continuation<? super NitroPurchase[]>, Object> {
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$getPendingTransactionsIOS$1(HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$getPendingTransactionsIOS$1> continuation) {
        super(1, continuation);
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$getPendingTransactionsIOS$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super NitroPurchase[]> continuation) {
        return ((HybridRnIap$getPendingTransactionsIOS$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, OpenIapError.FeatureNotSupported.INSTANCE, null, null, null, 14, null));
    }
}
