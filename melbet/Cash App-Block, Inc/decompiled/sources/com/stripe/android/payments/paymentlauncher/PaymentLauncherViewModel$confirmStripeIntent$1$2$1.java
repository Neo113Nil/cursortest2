package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.payments.paymentlauncher.InternalPaymentResult;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class PaymentLauncherViewModel$confirmStripeIntent$1$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Map $analyticsParams;
    public final /* synthetic */ Throwable $it;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PaymentLauncherViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentLauncherViewModel$confirmStripeIntent$1$2$1(PaymentLauncherViewModel paymentLauncherViewModel, Throwable th, Map map, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = paymentLauncherViewModel;
        this.$it = th;
        this.$analyticsParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new PaymentLauncherViewModel$confirmStripeIntent$1$2$1(this.this$0, this.$it, this.$analyticsParams, continuation, 0);
            default:
                return new PaymentLauncherViewModel$confirmStripeIntent$1$2$1(this.this$0, this.$it, this.$analyticsParams, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PaymentLauncherViewModel$confirmStripeIntent$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Map map = this.$analyticsParams;
        Throwable th = this.$it;
        PaymentLauncherViewModel paymentLauncherViewModel = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PaymentLauncherViewModel.postInternalResult$default(paymentLauncherViewModel, new InternalPaymentResult.Failed(th), null, map, 2);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                PaymentLauncherViewModel.postInternalResult$default(paymentLauncherViewModel, new InternalPaymentResult.Failed(th), null, map, 2);
                break;
        }
        return Unit.INSTANCE;
    }
}
