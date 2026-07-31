package com.margelo.nitro.iap;

import dev.hyo.openiap.OpenIapError;
import dev.hyo.openiap.OpenIapModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: HybridRnIap.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.margelo.nitro.iap.HybridRnIap$hasActiveSubscriptions$1", f = "HybridRnIap.kt", i = {}, l = {668, 676}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HybridRnIap$hasActiveSubscriptions$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ String[] $subscriptionIds;
    int label;
    final /* synthetic */ HybridRnIap this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HybridRnIap$hasActiveSubscriptions$1(HybridRnIap hybridRnIap, String[] strArr, Continuation<? super HybridRnIap$hasActiveSubscriptions$1> continuation) {
        super(1, continuation);
        this.this$0 = hybridRnIap;
        this.$subscriptionIds = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new HybridRnIap$hasActiveSubscriptions$1(this.this$0, this.$subscriptionIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((HybridRnIap$hasActiveSubscriptions$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r10 == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0031, code lost:
    
        if (r10 == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object ensureConnection;
        Object obj2;
        OpenIapModule openIap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                ensureConnection = this.this$0.ensureConnection(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    RnIapLog.INSTANCE.result("hasActiveSubscriptions", Boxing.boxBoolean(booleanValue));
                    return Boxing.boxBoolean(booleanValue);
                }
                ResultKt.throwOnFailure(obj);
            }
            RnIapLog rnIapLog = RnIapLog.INSTANCE;
            String[] strArr = this.$subscriptionIds;
            if (strArr == null || (obj2 = ArraysKt.toList(strArr)) == null) {
                obj2 = "all";
            }
            rnIapLog.payload("hasActiveSubscriptions", MapsKt.mapOf(TuplesKt.to("subscriptionIds", obj2)));
            openIap = this.this$0.getOpenIap();
            Function2<List<String>, Continuation<? super Boolean>, Object> hasActiveSubscriptions = openIap.getHasActiveSubscriptions();
            String[] strArr2 = this.$subscriptionIds;
            List<String> list = strArr2 != null ? ArraysKt.toList(strArr2) : null;
            this.label = 2;
            obj = hasActiveSubscriptions.invoke(list, this);
        } catch (Exception e) {
            RnIapLog.INSTANCE.failure("hasActiveSubscriptions", e);
            throw new OpenIapException(HybridRnIap.toErrorJson$default(this.this$0, OpenIapError.ServiceUnavailable.INSTANCE, null, e.getMessage(), "Failed to check active subscriptions: " + e.getMessage(), 2, null));
        }
    }
}
