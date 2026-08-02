package com.squareup.cash.ui.widget.amount;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class AmountLayoutAnimator$launchExitAnimation$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Digit $digit;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnimatedDigitState $state;
    public int label;
    public final /* synthetic */ AmountLayoutAnimator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AmountLayoutAnimator$launchExitAnimation$2(AnimatedDigitState animatedDigitState, AmountLayoutAnimator amountLayoutAnimator, Digit digit, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state = animatedDigitState;
        this.this$0 = amountLayoutAnimator;
        this.$digit = digit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new AmountLayoutAnimator$launchExitAnimation$2(this.$state, this.this$0, this.$digit, continuation, 0);
            default:
                return new AmountLayoutAnimator$launchExitAnimation$2(this.$state, this.this$0, this.$digit, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AmountLayoutAnimator$launchExitAnimation$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Digit digit = this.$digit;
        AmountLayoutAnimator amountLayoutAnimator = this.this$0;
        AnimatedDigitState animatedDigitState = this.$state;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = animatedDigitState.opacity;
                    Float f = new Float(RecyclerView.DECELERATION_RATE);
                    TweenSpec tween$default = AnimatableKt.tween$default(90, 0, null, 6);
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
                amountLayoutAnimator.exitingDigits.remove(digit);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable2 = animatedDigitState.opacity;
                    Float f2 = new Float(RecyclerView.DECELERATION_RATE);
                    TweenSpec tween$default2 = AnimatableKt.tween$default(90, 0, null, 6);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable2, f2, tween$default2, null, null, this, 12) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                amountLayoutAnimator.exitingDigits.remove(digit);
                break;
        }
        return Unit.INSTANCE;
    }
}
