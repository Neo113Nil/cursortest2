package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableState;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.filament.SlerpAnimator;
import com.squareup.cash.graphics.backend.math.Quat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class Hero3DCardViewKt$InteractiveCard$12$1$4$2$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $cardRotation$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref$ObjectRef $targetRotation;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hero3DCardViewKt$InteractiveCard$12$1$4$2$1$1(Ref$ObjectRef ref$ObjectRef, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$targetRotation = ref$ObjectRef;
        this.$cardRotation$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$cardRotation$delegate;
        Ref$ObjectRef ref$ObjectRef = this.$targetRotation;
        switch (i) {
            case 0:
                return new Hero3DCardViewKt$InteractiveCard$12$1$4$2$1$1(ref$ObjectRef, mutableState, continuation, 0);
            default:
                return new Hero3DCardViewKt$InteractiveCard$12$1$4$2$1$1(ref$ObjectRef, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((Hero3DCardViewKt$InteractiveCard$12$1$4$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        final MutableState mutableState = this.$cardRotation$delegate;
        Ref$ObjectRef ref$ObjectRef = this.$targetRotation;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    float[] fArr = Hero3DCardViewKt.X_AXIS;
                    if (Hero3DCardViewKt.coerceToFinite(((Quat) mutableState.getValue()).angleShortestPath((Quat) ref$ObjectRef.element)) > RecyclerView.DECELERATION_RATE) {
                        final SlerpAnimator slerpAnimator = new SlerpAnimator((Quat) mutableState.getValue(), ref$ObjectRef.element);
                        Animatable Animatable = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                        Float f = new Float(1.0f);
                        SpringSpec spring$default = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 25.0f, new Float(0.01f), 1);
                        Function1 function1 = new Function1() { // from class: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$2$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i5 = i2;
                                MutableState mutableState2 = mutableState;
                                SlerpAnimator slerpAnimator2 = slerpAnimator;
                                Animatable animatable = (Animatable) obj2;
                                switch (i5) {
                                    case 0:
                                        slerpAnimator2.setCurrentFraction(((Number) animatable.getValue()).floatValue());
                                        Object animatedValue = slerpAnimator2.getAnimatedValue();
                                        animatedValue.getClass();
                                        float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                                        mutableState2.setValue((Quat) animatedValue);
                                        break;
                                    default:
                                        slerpAnimator2.setCurrentFraction(((Number) animatable.getValue()).floatValue());
                                        Object animatedValue2 = slerpAnimator2.getAnimatedValue();
                                        animatedValue2.getClass();
                                        Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                                        mutableState2.setValue((Quat) animatedValue2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 1;
                        if (Animatable.animateTo$default(Animatable, f, spring$default, null, function1, this, 4) == coroutineSingletons) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                    if (Hero3DCardViewKt.coerceToFinite(((Quat) mutableState.getValue()).angleShortestPath((Quat) ref$ObjectRef.element)) > RecyclerView.DECELERATION_RATE) {
                        final SlerpAnimator slerpAnimator2 = new SlerpAnimator((Quat) mutableState.getValue(), ref$ObjectRef.element);
                        Animatable Animatable2 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                        Float f2 = new Float(1.0f);
                        SpringSpec spring$default2 = AnimatableKt.spring$default(RecyclerView.DECELERATION_RATE, 25.0f, new Float(0.01f), 1);
                        Function1 function12 = new Function1() { // from class: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$2$1$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int i52 = i3;
                                MutableState mutableState2 = mutableState;
                                SlerpAnimator slerpAnimator22 = slerpAnimator2;
                                Animatable animatable = (Animatable) obj2;
                                switch (i52) {
                                    case 0:
                                        slerpAnimator22.setCurrentFraction(((Number) animatable.getValue()).floatValue());
                                        Object animatedValue = slerpAnimator22.getAnimatedValue();
                                        animatedValue.getClass();
                                        float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                                        mutableState2.setValue((Quat) animatedValue);
                                        break;
                                    default:
                                        slerpAnimator22.setCurrentFraction(((Number) animatable.getValue()).floatValue());
                                        Object animatedValue2 = slerpAnimator22.getAnimatedValue();
                                        animatedValue2.getClass();
                                        Quat quat2 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                                        mutableState2.setValue((Quat) animatedValue2);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        this.label = 1;
                        if (Animatable.animateTo$default(Animatable2, f2, spring$default2, null, function12, this, 4) == coroutineSingletons2) {
                            break;
                        }
                    }
                } else if (i5 != 1) {
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
