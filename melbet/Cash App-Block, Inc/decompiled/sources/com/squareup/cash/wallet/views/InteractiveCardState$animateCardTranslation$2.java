package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
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
public final class InteractiveCardState$animateCardTranslation$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $cardEnabled;
    public final /* synthetic */ boolean $immediate;
    public final /* synthetic */ boolean $isPressed;
    public final /* synthetic */ boolean $showContouredText;
    public int label;
    public final /* synthetic */ InteractiveCardState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveCardState$animateCardTranslation$2(boolean z, boolean z2, InteractiveCardState interactiveCardState, boolean z3, boolean z4, Continuation continuation) {
        super(2, continuation);
        this.$isPressed = z;
        this.$cardEnabled = z2;
        this.this$0 = interactiveCardState;
        this.$showContouredText = z3;
        this.$immediate = z4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InteractiveCardState$animateCardTranslation$2(this.$isPressed, this.$cardEnabled, this.this$0, this.$showContouredText, this.$immediate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InteractiveCardState$animateCardTranslation$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r0.snapTo(r1, r12) == r7) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InteractiveCardState interactiveCardState = this.this$0;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = interactiveCardState.isCardHome$delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            float f = RecyclerView.DECELERATION_RATE;
            float f2 = 0.9f;
            boolean z = this.$isPressed;
            boolean z2 = this.$cardEnabled;
            if (!z || !z2) {
                if (z && !z2) {
                    f2 = 1.3f;
                } else if (z2) {
                    f2 = 0.0f;
                }
            }
            float f3 = f2 * (-0.3f);
            if (z) {
                f = -0.15f;
            }
            if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue() && this.$showContouredText) {
                f3 = f - 0.3f;
            } else if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                f3 = f;
            }
            Animatable animatable = interactiveCardState.zTranslation;
            if (this.$immediate) {
                Float f4 = new Float(f3);
                this.label = 1;
            } else {
                Float f5 = new Float(f3);
                SpringSpec spring$default = AnimatableKt.spring$default(z ? 1.0f : 0.4f, z ? 180.0f : 200.0f, null, 4);
                this.label = 2;
                Object animateTo$default = Animatable.animateTo$default(animatable, f5, spring$default, null, null, this, 12);
                if (animateTo$default != coroutineSingletons) {
                    return animateTo$default;
                }
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
