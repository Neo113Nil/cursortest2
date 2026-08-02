package com.squareup.cash.ui.widget.amount;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class AmountLayoutAnimator$launchExitAnimation$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnimatedDigitState $state;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AmountLayoutAnimator$launchExitAnimation$3(AnimatedDigitState animatedDigitState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state = animatedDigitState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AnimatedDigitState animatedDigitState = this.$state;
        switch (i) {
            case 0:
                return new AmountLayoutAnimator$launchExitAnimation$3(animatedDigitState, continuation, 0);
            case 1:
                return new AmountLayoutAnimator$launchExitAnimation$3(animatedDigitState, continuation, 1);
            case 2:
                return new AmountLayoutAnimator$launchExitAnimation$3(animatedDigitState, continuation, 2);
            case 3:
                return new AmountLayoutAnimator$launchExitAnimation$3(animatedDigitState, continuation, 3);
            default:
                return new AmountLayoutAnimator$launchExitAnimation$3(animatedDigitState, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AmountLayoutAnimator$launchExitAnimation$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AnimatedDigitState animatedDigitState = this.$state;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = animatedDigitState.scale;
                    Float f = new Float(0.7f);
                    TweenSpec tween$default = AnimatableKt.tween$default(120, 0, AmountLayoutAnimator.EASE_OUT_HEAVY, 2);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, f, tween$default, null, null, this, 12) == coroutineSingletons) {
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
                    Animatable animatable2 = animatedDigitState.scale;
                    Float f2 = new Float(1.0f);
                    TweenSpec tweenSpec = new TweenSpec(150, 30, AmountLayoutAnimator.EASE_IN_HEAVY);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable2, f2, tweenSpec, null, null, this, 12) == coroutineSingletons2) {
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
                    Animatable animatable3 = animatedDigitState.opacity;
                    Float f3 = new Float(1.0f);
                    TweenSpec tweenSpec2 = new TweenSpec(90, 30, AmountLayoutAnimator.EASE_FAST_OUT);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable3, f3, tweenSpec2, null, null, this, 12) == coroutineSingletons3) {
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
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable4 = animatedDigitState.scale;
                    Float f4 = new Float(1.0f);
                    TweenSpec tween$default2 = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 0, null, 6);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable4, f4, tween$default2, null, null, this, 12) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable5 = animatedDigitState.opacity;
                    Float f5 = new Float(1.0f);
                    TweenSpec tween$default3 = AnimatableKt.tween$default(80, 30, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable5, f5, tween$default3, null, null, this, 12) == coroutineSingletons5) {
                        break;
                    }
                } else if (i6 != 1) {
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
