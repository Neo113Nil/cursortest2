package com.squareup.cash.wallet.views;

import android.os.SystemClock;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardTransitionKt$CardTransition$2$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $isSourceTransition;
    public final /* synthetic */ CardRegistry $this_with;
    public int I$0;
    public long J$0;
    public long J$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardTransitionKt$CardTransition$2$2$1(boolean z, CardRegistry cardRegistry, Continuation continuation) {
        super(2, continuation);
        this.$isSourceTransition = z;
        this.$this_with = cardRegistry;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardTransitionKt$CardTransition$2$2$1(this.$isSourceTransition, this.$this_with, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardTransitionKt$CardTransition$2$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(800, r19) == r10) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        long j;
        Animatable animatable;
        Float f;
        SpringSpec spring$default;
        int i2;
        long j2;
        long elapsedRealtime;
        Float f2;
        CardRegistry cardRegistry = this.$this_with;
        Animatable animatable2 = cardRegistry.cardAnimation;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = cardRegistry.inTransition$delegate;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = cardRegistry.activeTransitionTokenCount$delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        try {
            if (i3 == 0) {
                SafeTrace.throwOnFailure(obj);
                if (!this.$isSourceTransition) {
                    i = parcelableSnapshotMutableIntState.getIntValue() == 0 ? 1 : 0;
                    j = 800;
                    parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() + 1);
                    if (i != 0) {
                        parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                        Float f3 = new Float(RecyclerView.DECELERATION_RATE);
                        this.I$0 = i;
                        this.label = 1;
                        if (animatable2.snapTo(f3, this) == coroutineSingletons) {
                        }
                        int i4 = i;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        animatable = cardRegistry.cardAnimation;
                        f = new Float(1.0f);
                        spring$default = AnimatableKt.spring$default(0.75f, 50.0f, null, 4);
                        this.I$0 = i4;
                        this.J$0 = elapsedRealtime2;
                        this.label = 2;
                        if (Animatable.animateTo$default(animatable, f, spring$default, null, null, this, 12) != coroutineSingletons) {
                        }
                    } else {
                        this.I$0 = i;
                        this.label = 5;
                    }
                    return coroutineSingletons;
                }
                return Unit.INSTANCE;
            }
            if (i3 == 1) {
                i = this.I$0;
                SafeTrace.throwOnFailure(obj);
                j = 800;
                int i42 = i;
                long elapsedRealtime22 = SystemClock.elapsedRealtime();
                animatable = cardRegistry.cardAnimation;
                f = new Float(1.0f);
                spring$default = AnimatableKt.spring$default(0.75f, 50.0f, null, 4);
                this.I$0 = i42;
                this.J$0 = elapsedRealtime22;
                this.label = 2;
                if (Animatable.animateTo$default(animatable, f, spring$default, null, null, this, 12) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                i2 = i42;
                j2 = elapsedRealtime22;
                elapsedRealtime = SystemClock.elapsedRealtime();
                this.I$0 = i2;
                this.J$0 = j2;
                this.J$1 = elapsedRealtime;
                this.label = 3;
                if (JobKt.delay(j - (elapsedRealtime - j2), this) == coroutineSingletons) {
                }
                f2 = new Float(RecyclerView.DECELERATION_RATE);
                this.I$0 = i2;
                this.J$0 = j2;
                this.J$1 = elapsedRealtime;
                this.label = 4;
                if (animatable2.snapTo(f2, this) == coroutineSingletons) {
                }
            } else if (i3 == 2) {
                long j3 = this.J$0;
                int i5 = this.I$0;
                SafeTrace.throwOnFailure(obj);
                i2 = i5;
                j = 800;
                j2 = j3;
                elapsedRealtime = SystemClock.elapsedRealtime();
                this.I$0 = i2;
                this.J$0 = j2;
                this.J$1 = elapsedRealtime;
                this.label = 3;
                if (JobKt.delay(j - (elapsedRealtime - j2), this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                f2 = new Float(RecyclerView.DECELERATION_RATE);
                this.I$0 = i2;
                this.J$0 = j2;
                this.J$1 = elapsedRealtime;
                this.label = 4;
                if (animatable2.snapTo(f2, this) == coroutineSingletons) {
                }
            } else if (i3 == 3) {
                elapsedRealtime = this.J$1;
                j2 = this.J$0;
                i2 = this.I$0;
                SafeTrace.throwOnFailure(obj);
                f2 = new Float(RecyclerView.DECELERATION_RATE);
                this.I$0 = i2;
                this.J$0 = j2;
                this.J$1 = elapsedRealtime;
                this.label = 4;
                if (animatable2.snapTo(f2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 4 && i3 != 5) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        } finally {
            parcelableSnapshotMutableIntState.setIntValue(parcelableSnapshotMutableIntState.getIntValue() - 1);
            if (parcelableSnapshotMutableIntState.getIntValue() == 0) {
                parcelableSnapshotMutableState.setValue(Boolean.FALSE);
            }
        }
    }
}
