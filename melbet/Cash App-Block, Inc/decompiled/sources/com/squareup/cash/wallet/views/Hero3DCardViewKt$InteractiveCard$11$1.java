package com.squareup.cash.wallet.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardStudioViewKt;
import com.squareup.cash.fidesmo.views.ScanningShapePulseParams;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.workflow1.TimerWorker$run$1;
import dev.chrisbanes.haze.RenderScriptBlurEffect$updateSurface$2$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class Hero3DCardViewKt$InteractiveCard$11$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Animatable $indicatorBounce;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $view$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hero3DCardViewKt$InteractiveCard$11$1(MutableState mutableState, Animatable animatable, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$view$delegate = mutableState;
        this.$indicatorBounce = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$view$delegate;
        Animatable animatable = this.$indicatorBounce;
        switch (i) {
            case 0:
                return new Hero3DCardViewKt$InteractiveCard$11$1(mutableState, animatable, continuation);
            case 1:
                return new Hero3DCardViewKt$InteractiveCard$11$1(animatable, mutableState, continuation, 1);
            case 2:
                return new Hero3DCardViewKt$InteractiveCard$11$1(animatable, mutableState, continuation, 2);
            case 3:
                return new Hero3DCardViewKt$InteractiveCard$11$1(animatable, mutableState, continuation, 3);
            case 4:
                return new Hero3DCardViewKt$InteractiveCard$11$1(animatable, mutableState, continuation, 4);
            case 5:
                return new Hero3DCardViewKt$InteractiveCard$11$1(animatable, mutableState, continuation, 5);
            default:
                return new Hero3DCardViewKt$InteractiveCard$11$1(animatable, mutableState, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((Hero3DCardViewKt$InteractiveCard$11$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0194, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r15.$indicatorBounce, r0, null, null, null, r15, 14) == r12) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017d, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r3, r15) == r12) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0167, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r13, r15) == r12) goto L71;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Animatable animatable = this.$indicatorBounce;
        MutableState mutableState = this.$view$delegate;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(25, mutableState)), 24);
                    TimerWorker$run$1 timerWorker$run$1 = new TimerWorker$run$1(animatable, continuation, 5);
                    this.label = 1;
                    if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, timerWorker$run$1, this) == coroutineSingletons) {
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
                    Duration.Companion companion = Duration.Companion;
                    long duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
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
                    break;
                }
                mutableState.setValue(Boolean.TRUE);
                Duration.Companion companion2 = Duration.Companion;
                long duration2 = DurationKt.toDuration(800, DurationUnit.MILLISECONDS);
                this.label = 2;
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f2 = new Float(1.0f);
                    TweenSpec tween$default = AnimatableKt.tween$default(2500, 0, null, 6);
                    DateInputKt$$ExternalSyntheticLambda5 dateInputKt$$ExternalSyntheticLambda5 = new DateInputKt$$ExternalSyntheticLambda5(27, mutableState);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$indicatorBounce, f2, tween$default, null, dateInputKt$$ExternalSyntheticLambda5, this, 4) == coroutineSingletons3) {
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
                    Float f3 = new Float(1.0f);
                    TweenSpec tween$default2 = AnimatableKt.tween$default(800, 0, null, 6);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$indicatorBounce, f3, tween$default2, null, null, this, 12) == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                CardTheme cardTheme = CardStudioViewKt.BLACK_CARD_THEME;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardTheme cardTheme2 = CardStudioViewKt.BLACK_CARD_THEME;
                    mutableState.setValue(Boolean.FALSE);
                    Float f4 = new Float(1.0f);
                    TweenSpec tween$default3 = AnimatableKt.tween$default(800, 0, null, 6);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$indicatorBounce, f4, tween$default3, null, null, this, 12) == coroutineSingletons5) {
                        break;
                    }
                } else if (i6 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                CardTheme cardTheme3 = CardStudioViewKt.BLACK_CARD_THEME;
                mutableState.setValue(Boolean.TRUE);
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Float f5 = new Float(((ScanningShapePulseParams) mutableState.getValue()).stepTurnOrbPeakScale);
                    SpringSpec spring$default = AnimatableKt.spring$default(((ScanningShapePulseParams) mutableState.getValue()).orbTurnDamping, ((ScanningShapePulseParams) mutableState.getValue()).orbTurnStiffness, null, 4);
                    this.label = 1;
                    if (Animatable.animateTo$default(this.$indicatorBounce, f5, spring$default, null, null, this, 12) == coroutineSingletons6) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new CardLockViewKt$$ExternalSyntheticLambda1(animatable, 4));
                    RenderScriptBlurEffect$updateSurface$2$2$1 renderScriptBlurEffect$updateSurface$2$2$1 = new RenderScriptBlurEffect$updateSurface$2$2$1(mutableState, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow, renderScriptBlurEffect$updateSurface$2$2$1, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i8 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hero3DCardViewKt$InteractiveCard$11$1(Animatable animatable, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$indicatorBounce = animatable;
        this.$view$delegate = mutableState;
    }
}
