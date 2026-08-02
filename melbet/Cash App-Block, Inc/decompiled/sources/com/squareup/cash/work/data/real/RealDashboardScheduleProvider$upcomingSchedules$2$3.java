package com.squareup.cash.work.data.real;

import com.squareup.cash.work.identifiers.MerchantIdentifier;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealDashboardScheduleProvider$upcomingSchedules$2$3 extends SuspendLambda implements Function4 {
    public /* synthetic */ int I$0;
    public /* synthetic */ MerchantIdentifier L$0;
    public /* synthetic */ String L$1;

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj3).intValue();
        RealDashboardScheduleProvider$upcomingSchedules$2$3 realDashboardScheduleProvider$upcomingSchedules$2$3 = new RealDashboardScheduleProvider$upcomingSchedules$2$3(4, (Continuation) obj4);
        realDashboardScheduleProvider$upcomingSchedules$2$3.L$0 = (MerchantIdentifier) obj;
        realDashboardScheduleProvider$upcomingSchedules$2$3.L$1 = (String) obj2;
        realDashboardScheduleProvider$upcomingSchedules$2$3.I$0 = intValue;
        return realDashboardScheduleProvider$upcomingSchedules$2$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MerchantIdentifier merchantIdentifier = this.L$0;
        String str = this.L$1;
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        return new Triple(merchantIdentifier.token, str, new Integer(i));
    }
}
