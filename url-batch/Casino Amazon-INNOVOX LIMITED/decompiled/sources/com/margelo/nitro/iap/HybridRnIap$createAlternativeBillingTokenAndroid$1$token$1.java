package com.margelo.nitro.iap;

import dev.hyo.openiap.OpenIapModule;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$createAlternativeBillingTokenAndroid$1$token$1", f = "HybridRnIap.kt", i = {}, l = {1640}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$createAlternativeBillingTokenAndroid$1$token$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$createAlternativeBillingTokenAndroid$1$token$1(HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$createAlternativeBillingTokenAndroid$1$token$1> continuation) {
        super(2, continuation);
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HybridRnIap$createAlternativeBillingTokenAndroid$1$token$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((HybridRnIap$createAlternativeBillingTokenAndroid$1$token$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        OpenIapModule openIap;
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
        openIap = this.this$0.getOpenIap();
        this.label = 1;
        Object createAlternativeBillingReportingToken = openIap.createAlternativeBillingReportingToken(this);
        return createAlternativeBillingReportingToken == coroutine_suspended ? coroutine_suspended : createAlternativeBillingReportingToken;
    }
}
