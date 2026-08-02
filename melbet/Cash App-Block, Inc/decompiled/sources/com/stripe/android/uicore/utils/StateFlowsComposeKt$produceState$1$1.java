package com.stripe.android.uicore.utils;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScopeImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class StateFlowsComposeKt$produceState$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function2 $producer;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $result;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StateFlowsComposeKt$produceState$1$1(Function2 function2, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$producer = function2;
        this.$result = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                StateFlowsComposeKt$produceState$1$1 stateFlowsComposeKt$produceState$1$1 = new StateFlowsComposeKt$produceState$1$1(this.$producer, this.$result, continuation, 0);
                stateFlowsComposeKt$produceState$1$1.L$0 = obj;
                return stateFlowsComposeKt$produceState$1$1;
            case 1:
                StateFlowsComposeKt$produceState$1$1 stateFlowsComposeKt$produceState$1$12 = new StateFlowsComposeKt$produceState$1$1(this.$producer, this.$result, continuation, 1);
                stateFlowsComposeKt$produceState$1$12.L$0 = obj;
                return stateFlowsComposeKt$produceState$1$12;
            case 2:
                StateFlowsComposeKt$produceState$1$1 stateFlowsComposeKt$produceState$1$13 = new StateFlowsComposeKt$produceState$1$1(this.$producer, this.$result, continuation, 2);
                stateFlowsComposeKt$produceState$1$13.L$0 = obj;
                return stateFlowsComposeKt$produceState$1$13;
            case 3:
                StateFlowsComposeKt$produceState$1$1 stateFlowsComposeKt$produceState$1$14 = new StateFlowsComposeKt$produceState$1$1(this.$producer, this.$result, continuation, 3);
                stateFlowsComposeKt$produceState$1$14.L$0 = obj;
                return stateFlowsComposeKt$produceState$1$14;
            case 4:
                StateFlowsComposeKt$produceState$1$1 stateFlowsComposeKt$produceState$1$15 = new StateFlowsComposeKt$produceState$1$1(this.$producer, this.$result, continuation, 4);
                stateFlowsComposeKt$produceState$1$15.L$0 = obj;
                return stateFlowsComposeKt$produceState$1$15;
            default:
                StateFlowsComposeKt$produceState$1$1 stateFlowsComposeKt$produceState$1$16 = new StateFlowsComposeKt$produceState$1$1(this.$producer, this.$result, continuation, 5);
                stateFlowsComposeKt$produceState$1$16.L$0 = obj;
                return stateFlowsComposeKt$produceState$1$16;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((StateFlowsComposeKt$produceState$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function2 function2 = this.$producer;
        MutableState mutableState = this.$result;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DefaultProduceStateScope defaultProduceStateScope = new DefaultProduceStateScope(mutableState, coroutineScope.getCoroutineContext());
                    this.L$0 = null;
                    this.label = 1;
                    if (function2.invoke(defaultProduceStateScope, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(mutableState, ((CoroutineScope) this.L$0).getCoroutineContext());
                    this.label = 1;
                    if (function2.invoke(produceStateScopeImpl, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProduceStateScopeImpl produceStateScopeImpl2 = new ProduceStateScopeImpl(mutableState, ((CoroutineScope) this.L$0).getCoroutineContext());
                    this.label = 1;
                    if (function2.invoke(produceStateScopeImpl2, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 3:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) mutableState.getValue()).booleanValue()) {
                        this.L$0 = null;
                        this.label = 1;
                        if (function2.invoke(coroutineScope2, this) == coroutineSingletons4) {
                            break;
                        }
                    }
                    break;
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.TRUE);
            case 4:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) mutableState.getValue()).booleanValue()) {
                        this.L$0 = null;
                        this.label = 1;
                        if (function2.invoke(coroutineScope3, this) == coroutineSingletons5) {
                            break;
                        }
                    }
                    break;
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                mutableState.setValue(Boolean.TRUE);
            default:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) mutableState.getValue()).booleanValue()) {
                        this.L$0 = null;
                        this.label = 1;
                        if (function2.invoke(coroutineScope4, this) == coroutineSingletons6) {
                            break;
                        }
                    } else {
                        mutableState.setValue(Boolean.FALSE);
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
