package com.margelo.nitro.iap;

import dev.hyo.openiap.OpenIapModule;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$endConnection$1", f = "HybridRnIap.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$endConnection$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$endConnection$1(HybridRnIap hybridRnIap, Continuation<? super HybridRnIap$endConnection$1> continuation) {
        super(1, continuation);
        this.this$0 = hybridRnIap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$endConnection$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((HybridRnIap$endConnection$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map;
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        OpenIapModule openIap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RnIapLog.INSTANCE.payload("endConnection", null);
                HybridRnIap hybridRnIap = this.this$0;
                Result.Companion companion = Result.INSTANCE;
                openIap = hybridRnIap.getOpenIap();
                Function1<Continuation<? super Boolean>, Object> endConnection = openIap.getEndConnection();
                this.label = 1;
                obj = endConnection.invoke(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Result.m3984constructorimpl(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3984constructorimpl(ResultKt.createFailure(th));
        }
        map = this.this$0.productTypeBySku;
        map.clear();
        this.this$0.isInitialized = false;
        this.this$0.listenersAttached = false;
        list = this.this$0.purchaseUpdatedListeners;
        HybridRnIap hybridRnIap2 = this.this$0;
        synchronized (list) {
            list2 = hybridRnIap2.purchaseUpdatedListeners;
            list2.clear();
            Unit unit = Unit.INSTANCE;
        }
        list3 = this.this$0.purchaseErrorListeners;
        HybridRnIap hybridRnIap3 = this.this$0;
        synchronized (list3) {
            list4 = hybridRnIap3.purchaseErrorListeners;
            list4.clear();
            Unit unit2 = Unit.INSTANCE;
        }
        list5 = this.this$0.promotedProductListenersIOS;
        list5.clear();
        list6 = this.this$0.userChoiceBillingListenersAndroid;
        HybridRnIap hybridRnIap4 = this.this$0;
        synchronized (list6) {
            list7 = hybridRnIap4.userChoiceBillingListenersAndroid;
            list7.clear();
            Unit unit3 = Unit.INSTANCE;
        }
        list8 = this.this$0.developerProvidedBillingListenersAndroid;
        HybridRnIap hybridRnIap5 = this.this$0;
        synchronized (list8) {
            list9 = hybridRnIap5.developerProvidedBillingListenersAndroid;
            list9.clear();
            Unit unit4 = Unit.INSTANCE;
        }
        this.this$0.initDeferred = null;
        RnIapLog.INSTANCE.result("endConnection", Boxing.boxBoolean(true));
        return Boxing.boxBoolean(true);
    }
}
