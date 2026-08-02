package com.squareup.cash.work.data.real;

import com.squareup.cash.work.data.real.RealPayDataLoader;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealPayDataLoader$sharedState$2$3 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ MerchantIdentifier L$0;
    public /* synthetic */ String L$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealPayDataLoader$sharedState$2$3(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        MerchantIdentifier merchantIdentifier = (MerchantIdentifier) obj;
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.$r8$classId) {
            case 0:
                RealPayDataLoader$sharedState$2$3 realPayDataLoader$sharedState$2$3 = new RealPayDataLoader$sharedState$2$3(i, continuation, 0);
                realPayDataLoader$sharedState$2$3.L$0 = merchantIdentifier;
                realPayDataLoader$sharedState$2$3.L$1 = str;
                return realPayDataLoader$sharedState$2$3.invokeSuspend(Unit.INSTANCE);
            default:
                RealPayDataLoader$sharedState$2$3 realPayDataLoader$sharedState$2$32 = new RealPayDataLoader$sharedState$2$3(i, continuation, 1);
                realPayDataLoader$sharedState$2$32.L$0 = merchantIdentifier;
                realPayDataLoader$sharedState$2$32.L$1 = str;
                return realPayDataLoader$sharedState$2$32.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                MerchantIdentifier merchantIdentifier = this.L$0;
                String str = this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new RealPayDataLoader.Identity(merchantIdentifier, str);
            default:
                MerchantIdentifier merchantIdentifier2 = this.L$0;
                String str2 = this.L$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (merchantIdentifier2 == null || str2 == null) {
                    return null;
                }
                return new ShiftLoaderIdentity(merchantIdentifier2, str2);
        }
    }
}
