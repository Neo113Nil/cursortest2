package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.components.accountswitcher.AnimationPhase;
import com.squareup.cash.account.components.accountswitcher.ManagedAccountSwitchLoadingContentKt;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.wallet.views.CardRegistry;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CoreInteractiveCardKt$InteractiveCardEffect$12$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $animateCardIn$delegate;
    public final /* synthetic */ Animatable $cardAlpha;
    public final /* synthetic */ MutableState $parentSharedState$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoreInteractiveCardKt$InteractiveCardEffect$12$1(Animatable animatable, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$cardAlpha = animatable;
        this.$animateCardIn$delegate = mutableState;
        this.$parentSharedState$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new CoreInteractiveCardKt$InteractiveCardEffect$12$1(this.$cardAlpha, this.$animateCardIn$delegate, this.$parentSharedState$delegate, continuation, 0);
            case 1:
                return new CoreInteractiveCardKt$InteractiveCardEffect$12$1(this.$cardAlpha, this.$animateCardIn$delegate, this.$parentSharedState$delegate, continuation, 1);
            default:
                return new CoreInteractiveCardKt$InteractiveCardEffect$12$1(this.$cardAlpha, this.$animateCardIn$delegate, this.$parentSharedState$delegate, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CoreInteractiveCardKt$InteractiveCardEffect$12$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r13.$cardAlpha, r1, r2, null, null, r13, 12) == r12) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r2.snapTo(r0, r13) == r12) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f2, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(1000, r13) == r12) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r13.$cardAlpha, r0, r2, null, null, r13, 12) == r12) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0162, code lost:
    
        if (r2.snapTo(r1, r13) == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0154, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(150, r13) == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013f, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r3, r13) == r0) goto L61;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        int i2 = 6;
        Animatable animatable = this.$cardAlpha;
        MutableState mutableState = this.$parentSharedState$delegate;
        MutableState mutableState2 = this.$animateCardIn$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$1 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(i2, mutableState2)), 21);
                    this.label = 1;
                    break;
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i3 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    Float f = new Float(1.0f);
                    this.label = 3;
                    break;
                } else if (i3 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                    mutableState.setValue(null);
                    break;
                }
                Quat quat2 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                if (((CardRegistry.SharedCardTransitionState) mutableState.getValue()) != null) {
                    this.label = 2;
                    break;
                }
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CubicBezierEasing cubicBezierEasing = ManagedAccountSwitchLoadingContentKt.BounceYEasing;
                    if (((AnimationPhase) mutableState.getValue()) == AnimationPhase.SETTLING) {
                        Float f2 = new Float(1.0f);
                        TweenSpec tween$default = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6);
                        this.label = 1;
                        break;
                    } else {
                        break;
                    }
                } else if (i4 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i4 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    AnimationPhase animationPhase = AnimationPhase.FINISHED;
                    CubicBezierEasing cubicBezierEasing2 = ManagedAccountSwitchLoadingContentKt.BounceYEasing;
                    mutableState.setValue(animationPhase);
                    ((Function0) mutableState2.getValue()).invoke();
                    break;
                }
                this.label = 2;
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (((Boolean) mutableState2.getValue()).booleanValue() && ((Boolean) mutableState.getValue()).booleanValue()) {
                        Float f3 = new Float(1.0f);
                        this.label = 1;
                        break;
                    }
                } else if (i5 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i5 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    mutableState2.setValue(Boolean.FALSE);
                    break;
                }
                Float f4 = new Float(RecyclerView.DECELERATION_RATE);
                KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig(false);
                keyframesSpecConfig.durationMillis = 800;
                keyframesSpecConfig.at(Float.valueOf(1.0f), 0).easing = CardNuxAnimationsKt.EXIT_PHASE2_EASING;
                keyframesSpecConfig.at(Float.valueOf(0.45875f), 433).easing = CardNuxAnimationsKt.EXIT_PHASE1_EASING;
                keyframesSpecConfig.at(Float.valueOf(RecyclerView.DECELERATION_RATE), 800);
                KeyframesSpec keyframesSpec = new KeyframesSpec(keyframesSpecConfig);
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }
}
