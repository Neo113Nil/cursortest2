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
public final class AmountLayoutAnimator$animateToLayout$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ AnimatedDigitState $existing;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RawDigitLayout $target;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AmountLayoutAnimator$animateToLayout$1(AnimatedDigitState animatedDigitState, RawDigitLayout rawDigitLayout, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$existing = animatedDigitState;
        this.$target = rawDigitLayout;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        RawDigitLayout rawDigitLayout = this.$target;
        AnimatedDigitState animatedDigitState = this.$existing;
        switch (i) {
            case 0:
                return new AmountLayoutAnimator$animateToLayout$1(animatedDigitState, rawDigitLayout, continuation, 0);
            case 1:
                return new AmountLayoutAnimator$animateToLayout$1(animatedDigitState, rawDigitLayout, continuation, 1);
            default:
                return new AmountLayoutAnimator$animateToLayout$1(animatedDigitState, rawDigitLayout, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AmountLayoutAnimator$animateToLayout$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        RawDigitLayout rawDigitLayout = this.$target;
        AnimatedDigitState animatedDigitState = this.$existing;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = animatedDigitState.left;
                    Float f = new Float(rawDigitLayout.left);
                    TweenSpec tweenSpec = AmountLayoutAnimator.POSITION_SPEC;
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, f, tweenSpec, null, null, this, 12) == coroutineSingletons) {
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
                    Animatable animatable2 = animatedDigitState.width;
                    Float f2 = new Float(rawDigitLayout.width);
                    TweenSpec tweenSpec2 = AmountLayoutAnimator.POSITION_SPEC;
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable2, f2, tweenSpec2, null, null, this, 12) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable3 = animatedDigitState.left;
                    Float f3 = new Float(rawDigitLayout.left);
                    TweenSpec tween$default = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 0, null, 6);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable3, f3, tween$default, null, null, this, 12) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
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
