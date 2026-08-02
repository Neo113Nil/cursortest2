package com.squareup.cash.work.data.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealPayDataLoader$loadPayData$2$payStubsDeferred$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $merchantToken;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ RealPayDataLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealPayDataLoader$loadPayData$2$payStubsDeferred$1(RealPayDataLoader realPayDataLoader, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = realPayDataLoader;
        this.$merchantToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.$merchantToken;
        RealPayDataLoader realPayDataLoader = this.this$0;
        switch (i) {
            case 0:
                return new RealPayDataLoader$loadPayData$2$payStubsDeferred$1(realPayDataLoader, str, continuation, 0);
            case 1:
                return new RealPayDataLoader$loadPayData$2$payStubsDeferred$1(realPayDataLoader, str, continuation, 1);
            default:
                return new RealPayDataLoader$loadPayData$2$payStubsDeferred$1(realPayDataLoader, str, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealPayDataLoader$loadPayData$2$payStubsDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$merchantToken;
        RealPayDataLoader realPayDataLoader = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object access$fetchPastPayStubs = RealPayDataLoader.access$fetchPastPayStubs(realPayDataLoader, str, this);
                    return access$fetchPastPayStubs == coroutineSingletons ? coroutineSingletons : access$fetchPastPayStubs;
                }
                if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object access$fetchCanUseDirectDeposit = RealPayDataLoader.access$fetchCanUseDirectDeposit(realPayDataLoader, str, this);
                    return access$fetchCanUseDirectDeposit == coroutineSingletons2 ? coroutineSingletons2 : access$fetchCanUseDirectDeposit;
                }
                if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Serializable access$fetchPayrollOverview = RealPayDataLoader.access$fetchPayrollOverview(realPayDataLoader, str, this);
                    return access$fetchPayrollOverview == coroutineSingletons3 ? coroutineSingletons3 : access$fetchPayrollOverview;
                }
                if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    return obj;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
