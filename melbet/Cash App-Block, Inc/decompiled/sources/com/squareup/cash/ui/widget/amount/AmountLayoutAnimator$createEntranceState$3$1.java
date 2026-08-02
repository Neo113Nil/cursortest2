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
public final class AmountLayoutAnimator$createEntranceState$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $delay;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnimatedDigitState $s;
    public final /* synthetic */ RawDigitLayout $target;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AmountLayoutAnimator$createEntranceState$3$1(AnimatedDigitState animatedDigitState, RawDigitLayout rawDigitLayout, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.$r8$classId = i2;
        this.$s = animatedDigitState;
        this.$target = rawDigitLayout;
        this.$delay = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new AmountLayoutAnimator$createEntranceState$3$1(this.$s, this.$target, this.$delay, continuation, 0);
            default:
                return new AmountLayoutAnimator$createEntranceState$3$1(this.$s, this.$target, this.$delay, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AmountLayoutAnimator$createEntranceState$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = this.$delay;
        RawDigitLayout rawDigitLayout = this.$target;
        AnimatedDigitState animatedDigitState = this.$s;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = animatedDigitState.scale;
                    rawDigitLayout.getClass();
                    Float f = new Float(1.0f);
                    TweenSpec tweenSpec = new TweenSpec(EnumC0170g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, i2, AmountLayoutAnimator.EASE_FAST_OUT);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, f, tweenSpec, null, null, this, 12) == coroutineSingletons) {
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
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable2 = animatedDigitState.opacity;
                    Float f2 = new Float(rawDigitLayout.opacity);
                    TweenSpec tween$default = AnimatableKt.tween$default(100, i2, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable2, f2, tween$default, null, null, this, 12) == coroutineSingletons2) {
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
