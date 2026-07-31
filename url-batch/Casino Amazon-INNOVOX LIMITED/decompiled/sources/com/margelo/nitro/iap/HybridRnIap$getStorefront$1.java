package com.margelo.nitro.iap;

import dev.hyo.openiap.OpenIapModule;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$getStorefront$1", f = "HybridRnIap.kt", i = {}, l = {775, 777}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$getStorefront$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$getStorefront$1(HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$getStorefront$1> continuation) {
        super(1, continuation);
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$getStorefront$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((HybridRnIap$getStorefront$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object ensureConnection;
        OpenIapModule openIap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                ensureConnection = this.this$0.ensureConnection(this);
                if (ensureConnection == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    String str = (String) obj;
                    RnIapLog.INSTANCE.result("getStorefront", str);
                    return str;
                }
                ResultKt.throwOnFailure(obj);
            }
            RnIapLog.INSTANCE.payload("getStorefront", null);
            openIap = this.this$0.getOpenIap();
            this.label = 2;
            obj = openIap.getStorefront(this);
        } catch (Exception e) {
            RnIapLog.INSTANCE.failure("getStorefront", e);
            return "";
        }
    }
}
