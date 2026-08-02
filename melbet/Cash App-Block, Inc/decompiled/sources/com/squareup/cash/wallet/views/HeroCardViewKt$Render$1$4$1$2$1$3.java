package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class HeroCardViewKt$Render$1$4$1$2$1$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $isPressed;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InteractiveCardState $this_with;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeroCardViewKt$Render$1$4$1$2$1$3(InteractiveCardState interactiveCardState, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$this_with = interactiveCardState;
        this.$isPressed = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        boolean z = this.$isPressed;
        InteractiveCardState interactiveCardState = this.$this_with;
        switch (i) {
            case 0:
                return new HeroCardViewKt$Render$1$4$1$2$1$3(interactiveCardState, z, continuation, 0);
            default:
                return new HeroCardViewKt$Render$1$4$1$2$1$3(interactiveCardState, z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((HeroCardViewKt$Render$1$4$1$2$1$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        boolean z = this.$isPressed;
        InteractiveCardState interactiveCardState = this.$this_with;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    interactiveCardState.getClass();
                    if (JobKt.coroutineScope(new InteractiveCardState$animateLock$2(z, interactiveCardState, null, 0), this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Animatable animatable = interactiveCardState.zTranslation;
                    Float f = new Float(z ? -1.0f : 1.0f);
                    SpringSpec spring$default = AnimatableKt.spring$default(1.0f, 200.0f, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, f, spring$default, null, null, this, 12) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
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
