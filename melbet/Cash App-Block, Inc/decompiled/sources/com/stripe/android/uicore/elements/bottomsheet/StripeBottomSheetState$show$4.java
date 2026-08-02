package com.stripe.android.uicore.elements.bottomsheet;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class StripeBottomSheetState$show$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ boolean Z$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StripeBottomSheetState$show$4(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                StripeBottomSheetState$show$4 stripeBottomSheetState$show$4 = new StripeBottomSheetState$show$4(2, continuation, 0);
                stripeBottomSheetState$show$4.Z$0 = ((Boolean) obj).booleanValue();
                return stripeBottomSheetState$show$4;
            case 1:
                StripeBottomSheetState$show$4 stripeBottomSheetState$show$42 = new StripeBottomSheetState$show$4(2, continuation, 1);
                stripeBottomSheetState$show$42.Z$0 = ((Boolean) obj).booleanValue();
                return stripeBottomSheetState$show$42;
            default:
                StripeBottomSheetState$show$4 stripeBottomSheetState$show$43 = new StripeBottomSheetState$show$4(2, continuation, 2);
                stripeBottomSheetState$show$43.Z$0 = ((Boolean) obj).booleanValue();
                return stripeBottomSheetState$show$43;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj2;
        switch (i) {
        }
        return ((StripeBottomSheetState$show$4) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        boolean z = this.Z$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                break;
        }
        return Boolean.valueOf(!z);
    }
}
