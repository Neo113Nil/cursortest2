package com.stripe.android.financialconnections.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeSourceNode$launchPreDraw$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetNativeActivity$observeViewEffects$1 extends SuspendLambda implements Function2 {
    public int label;
    public final /* synthetic */ FinancialConnectionsSheetNativeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeActivity$observeViewEffects$1(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = financialConnectionsSheetNativeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FinancialConnectionsSheetNativeActivity$observeViewEffects$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FinancialConnectionsSheetNativeActivity$observeViewEffects$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        int i2 = 1;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Lifecycle.State state = Lifecycle.State.STARTED;
            FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = this.this$0;
            HazeSourceNode$launchPreDraw$1 hazeSourceNode$launchPreDraw$1 = new HazeSourceNode$launchPreDraw$1(financialConnectionsSheetNativeActivity, continuation, i2);
            this.label = 1;
            Object repeatOnLifecycle = RepeatOnLifecycleKt.repeatOnLifecycle(financialConnectionsSheetNativeActivity.getLifecycle(), state, hazeSourceNode$launchPreDraw$1, this);
            if (repeatOnLifecycle != obj2) {
                repeatOnLifecycle = Unit.INSTANCE;
            }
            if (repeatOnLifecycle == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
