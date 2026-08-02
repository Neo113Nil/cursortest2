package com.squareup.util.coroutines;

import androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.session.backend.RealSessionManager;
import com.squareup.preferences.SharedPreferencesKeyValue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class FlowExtensionsKt$doWhile$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $block;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ boolean Z$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowExtensionsKt$doWhile$3(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$block = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$block;
        switch (i) {
            case 0:
                FlowExtensionsKt$doWhile$3 flowExtensionsKt$doWhile$3 = new FlowExtensionsKt$doWhile$3((Function2) obj2, continuation, 0);
                flowExtensionsKt$doWhile$3.Z$0 = ((Boolean) obj).booleanValue();
                return flowExtensionsKt$doWhile$3;
            default:
                FlowExtensionsKt$doWhile$3 flowExtensionsKt$doWhile$32 = new FlowExtensionsKt$doWhile$3((RealSessionManager) obj2, continuation, 1);
                flowExtensionsKt$doWhile$32.Z$0 = ((Boolean) obj).booleanValue();
                return flowExtensionsKt$doWhile$32;
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
        return ((FlowExtensionsKt$doWhile$3) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r9.delete(r8) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r9.set(r1, r8) == r5) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$block;
        Continuation continuation = null;
        switch (i) {
            case 0:
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (z) {
                        SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new SimpleChannelFlowKt$simpleChannelFlow$1((Function2) obj2, continuation, 4);
                        this.Z$0 = z;
                        this.label = 1;
                        if (JobKt.coroutineScope(simpleChannelFlowKt$simpleChannelFlow$1, this) == coroutineSingletons) {
                            break;
                        }
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                RealSessionManager realSessionManager = (RealSessionManager) obj2;
                boolean z2 = this.Z$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SharedPreferencesKeyValue sharedPreferencesKeyValue = realSessionManager.onboarded;
                    Boolean valueOf = Boolean.valueOf(z2);
                    this.Z$0 = z2;
                    this.label = 1;
                    break;
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                if (z2) {
                    RealOnboardingFlowTokenManager realOnboardingFlowTokenManager = realSessionManager.onboardingFlowTokenManager;
                    this.Z$0 = z2;
                    this.label = 2;
                    break;
                }
        }
        return Unit.INSTANCE;
    }
}
