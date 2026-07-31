package com.margelo.nitro.iap;

import dev.hyo.openiap.DeepLinkOptions;
import dev.hyo.openiap.OpenIapModule;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$deepLinkToSubscriptionsAndroid$1", f = "HybridRnIap.kt", i = {}, l = {1294, 1298}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$deepLinkToSubscriptionsAndroid$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ NitroDeepLinkOptionsAndroid $options;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$deepLinkToSubscriptionsAndroid$1(HybridRnIap hybridRnIap, NitroDeepLinkOptionsAndroid nitroDeepLinkOptionsAndroid, Continuation<? super HybridRnIap$deepLinkToSubscriptionsAndroid$1> continuation) {
        super(1, continuation);
        this.this$0 = hybridRnIap;
        this.$options = nitroDeepLinkOptionsAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$deepLinkToSubscriptionsAndroid$1(this.this$0, this.$options, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((HybridRnIap$deepLinkToSubscriptionsAndroid$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r7.invoke(r5, r6) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object ensureConnection;
        String unwrapString;
        String unwrapString2;
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
                    RnIapLog.INSTANCE.result("deepLinkToSubscriptionsAndroid", Boxing.boxBoolean(true));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            unwrapString = this.this$0.unwrapString(this.$options.getSkuAndroid());
            unwrapString2 = this.this$0.unwrapString(this.$options.getPackageNameAndroid());
            DeepLinkOptions deepLinkOptions = new DeepLinkOptions(unwrapString2, unwrapString);
            openIap = this.this$0.getOpenIap();
            Function2<DeepLinkOptions, Continuation<? super Unit>, Object> deepLinkToSubscriptions = openIap.getDeepLinkToSubscriptions();
            this.label = 2;
        } catch (Exception e) {
            RnIapLog.INSTANCE.failure("deepLinkToSubscriptionsAndroid", e);
            throw e;
        }
    }
}
