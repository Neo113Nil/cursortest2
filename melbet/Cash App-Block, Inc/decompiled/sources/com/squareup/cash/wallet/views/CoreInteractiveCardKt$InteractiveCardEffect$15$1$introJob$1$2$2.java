package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableState;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardRegistry;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$2$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $animationState$delegate;
    public final /* synthetic */ MutableState $cardDetails$delegate;
    public final /* synthetic */ CardRegistry.SharedCardTransitionState $parent;
    public float F$0;
    public int I$0;
    public MutableState L$0;
    public MutableState L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$2$2(CardRegistry.SharedCardTransitionState sharedCardTransitionState, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$parent = sharedCardTransitionState;
        this.$animationState$delegate = mutableState;
        this.$cardDetails$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$2$2(this.$parent, this.$animationState$delegate, this.$cardDetails$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$2$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r8, r10, r3, null, null, r12, 12) == r7) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float floatValue;
        MutableState mutableState;
        MutableState mutableState2;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            floatValue = ((Number) this.$parent.zTranslation.getValue()).floatValue();
            Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
            mutableState = this.$animationState$delegate;
            Animatable animatable = ((InteractiveCardState) mutableState.getValue()).zTranslation;
            Float f = new Float(floatValue);
            this.L$0 = mutableState;
            MutableState mutableState3 = this.$cardDetails$delegate;
            this.L$1 = mutableState3;
            this.F$0 = floatValue;
            this.I$0 = 0;
            this.label = 1;
            if (animatable.snapTo(f, this) != coroutineSingletons) {
                mutableState2 = mutableState3;
                i = 0;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = this.I$0;
        floatValue = this.F$0;
        mutableState2 = this.L$1;
        mutableState = this.L$0;
        SafeTrace.throwOnFailure(obj);
        Quat quat2 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
        float f2 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState2.getValue()).showPrepurchaseContourText ? -0.3f : 0.0f;
        Animatable animatable2 = ((InteractiveCardState) mutableState.getValue()).zTranslation;
        Float f3 = new Float(f2);
        SpringSpec spring$default = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 50.0f, new Float(0.01f), 1);
        this.L$0 = null;
        this.L$1 = null;
        this.F$0 = floatValue;
        this.I$0 = i;
        this.label = 2;
    }
}
