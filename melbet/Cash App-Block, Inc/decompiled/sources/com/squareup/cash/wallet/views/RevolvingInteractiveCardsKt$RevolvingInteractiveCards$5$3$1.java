package com.squareup.cash.wallet.views;

import android.app.ActivityManager;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.glance.session.SessionWorkerKt$runSession$5;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.transfers.views.WithdrawViewKt$WithdrawAmountView$1$1;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ActivityManager $activityManager;
    public final /* synthetic */ MutableState $animateCardIn$delegate;
    public final /* synthetic */ State $animationsEnabled$delegate;
    public /* synthetic */ Object $backwardResting$delegate;
    public final /* synthetic */ CardNuxState $cardNuxState;
    public final /* synthetic */ CardRegistry $cardRegistry;
    public final /* synthetic */ MutableState $cardRotation$delegate;
    public final /* synthetic */ CardWobbleState $cardWobble;
    public final /* synthetic */ MutableState $currentRevolvingCards$delegate;
    public final /* synthetic */ MutableSharedFlow $dragOffsets;
    public final /* synthetic */ MutableState $exitTransitionState$delegate;
    public final /* synthetic */ MutableState $forwardResting$delegate;
    public final /* synthetic */ MutableState $lifecycleActive;
    public final /* synthetic */ State $nuxAnimation$delegate;
    public final /* synthetic */ MutableState $parentModel$delegate;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ long $refreshMs;
    public final /* synthetic */ MutableState $targetView$delegate;
    public final /* synthetic */ boolean $withIntroSpin;
    public final /* synthetic */ boolean $wobble;
    public final /* synthetic */ Animatable $zTranslation;
    public int label;

    /* renamed from: com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends SuspendLambda implements Function2 {
        public final /* synthetic */ ActivityManager $activityManager;
        public final /* synthetic */ MutableState $animateCardIn$delegate;
        public final /* synthetic */ State $animationsEnabled$delegate;
        public final /* synthetic */ MutableState $backwardResting$delegate;
        public final /* synthetic */ CardNuxState $cardNuxState;
        public final /* synthetic */ CardRegistry $cardRegistry;
        public final /* synthetic */ MutableState $cardRotation$delegate;
        public final /* synthetic */ CardWobbleState $cardWobble;
        public final /* synthetic */ MutableState $currentRevolvingCards$delegate;
        public final /* synthetic */ MutableSharedFlow $dragOffsets;
        public final /* synthetic */ MutableState $forwardResting$delegate;
        public final /* synthetic */ MutableState $lifecycleActive;
        public final /* synthetic */ State $nuxAnimation$delegate;
        public final /* synthetic */ MutableState $parentModel$delegate;
        public final /* synthetic */ long $refreshMs;
        public final /* synthetic */ MutableState $targetView$delegate;
        public final /* synthetic */ boolean $withIntroSpin;
        public final /* synthetic */ boolean $wobble;
        public final /* synthetic */ Animatable $zTranslation;
        public /* synthetic */ boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, MutableSharedFlow mutableSharedFlow, State state, boolean z2, CardWobbleState cardWobbleState, MutableState mutableState, CardNuxState cardNuxState, MutableState mutableState2, Animatable animatable, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, long j, State state2, MutableState mutableState7, ActivityManager activityManager, CardRegistry cardRegistry, MutableState mutableState8, Continuation continuation) {
            super(2, continuation);
            this.$withIntroSpin = z;
            this.$dragOffsets = mutableSharedFlow;
            this.$animationsEnabled$delegate = state;
            this.$wobble = z2;
            this.$cardWobble = cardWobbleState;
            this.$cardRotation$delegate = mutableState;
            this.$cardNuxState = cardNuxState;
            this.$forwardResting$delegate = mutableState2;
            this.$zTranslation = animatable;
            this.$parentModel$delegate = mutableState3;
            this.$animateCardIn$delegate = mutableState4;
            this.$targetView$delegate = mutableState5;
            this.$lifecycleActive = mutableState6;
            this.$refreshMs = j;
            this.$nuxAnimation$delegate = state2;
            this.$currentRevolvingCards$delegate = mutableState7;
            this.$activityManager = activityManager;
            this.$cardRegistry = cardRegistry;
            this.$backwardResting$delegate = mutableState8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$withIntroSpin, this.$dragOffsets, this.$animationsEnabled$delegate, this.$wobble, this.$cardWobble, this.$cardRotation$delegate, this.$cardNuxState, this.$forwardResting$delegate, this.$zTranslation, this.$parentModel$delegate, this.$animateCardIn$delegate, this.$targetView$delegate, this.$lifecycleActive, this.$refreshMs, this.$nuxAnimation$delegate, this.$currentRevolvingCards$delegate, this.$activityManager, this.$cardRegistry, this.$backwardResting$delegate, continuation);
            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.getClass();
            return ((AnonymousClass3) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                if (!z) {
                    RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1 revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1 = new RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1(this.$withIntroSpin, this.$dragOffsets, this.$animationsEnabled$delegate, this.$wobble, this.$cardWobble, this.$cardRotation$delegate, this.$cardNuxState, this.$forwardResting$delegate, this.$zTranslation, this.$parentModel$delegate, this.$animateCardIn$delegate, this.$targetView$delegate, this.$lifecycleActive, this.$refreshMs, this.$nuxAnimation$delegate, this.$currentRevolvingCards$delegate, this.$activityManager, this.$cardRegistry, this.$backwardResting$delegate, null);
                    this.Z$0 = z;
                    this.label = 1;
                    if (JobKt.coroutineScope(revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1(MutableState mutableState, boolean z, MutableSharedFlow mutableSharedFlow, State state, boolean z2, CardWobbleState cardWobbleState, MutableState mutableState2, CardNuxState cardNuxState, MutableState mutableState3, Animatable animatable, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, long j, State state2, MutableState mutableState8, ActivityManager activityManager, CardRegistry cardRegistry, MutableState mutableState9, Continuation continuation) {
        super(2, continuation);
        this.$exitTransitionState$delegate = mutableState;
        this.$withIntroSpin = z;
        this.$dragOffsets = mutableSharedFlow;
        this.$animationsEnabled$delegate = state;
        this.$wobble = z2;
        this.$cardWobble = cardWobbleState;
        this.$cardRotation$delegate = mutableState2;
        this.$cardNuxState = cardNuxState;
        this.$forwardResting$delegate = mutableState3;
        this.$zTranslation = animatable;
        this.$parentModel$delegate = mutableState4;
        this.$animateCardIn$delegate = mutableState5;
        this.$targetView$delegate = mutableState6;
        this.$lifecycleActive = mutableState7;
        this.$refreshMs = j;
        this.$nuxAnimation$delegate = state2;
        this.$currentRevolvingCards$delegate = mutableState8;
        this.$activityManager = activityManager;
        this.$cardRegistry = cardRegistry;
        this.$backwardResting$delegate = mutableState9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1(this.$exitTransitionState$delegate, this.$withIntroSpin, this.$dragOffsets, this.$animationsEnabled$delegate, this.$wobble, this.$cardWobble, this.$cardRotation$delegate, this.$cardNuxState, this.$forwardResting$delegate, this.$zTranslation, this.$parentModel$delegate, this.$animateCardIn$delegate, this.$targetView$delegate, this.$lifecycleActive, this.$refreshMs, this.$nuxAnimation$delegate, this.$currentRevolvingCards$delegate, this.$activityManager, this.$cardRegistry, (MutableState) this.$backwardResting$delegate, continuation);
            default:
                RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1 revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1 = new RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1(this.$withIntroSpin, this.$dragOffsets, this.$animationsEnabled$delegate, this.$wobble, this.$cardWobble, this.$exitTransitionState$delegate, this.$cardNuxState, this.$cardRotation$delegate, this.$zTranslation, this.$forwardResting$delegate, this.$parentModel$delegate, this.$animateCardIn$delegate, this.$targetView$delegate, this.$refreshMs, this.$nuxAnimation$delegate, this.$lifecycleActive, this.$activityManager, this.$cardRegistry, this.$currentRevolvingCards$delegate, continuation);
                revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1.$backwardResting$delegate = obj;
                return revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(com.squareup.util.compose.ConstantSpeedMotionDurationScale.INSTANCE, r9, r27) == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (kotlinx.coroutines.JobKt.coroutineScope(r9, r27) == r7) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        int i = this.$r8$classId;
        MutableState mutableState2 = this.$exitTransitionState$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChannelFlowTransformLatest mapLatest = FlowKt.mapLatest(new SessionWorkerKt$runSession$5(2, null, 27), Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(29, mutableState2)));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$withIntroSpin, this.$dragOffsets, this.$animationsEnabled$delegate, this.$wobble, this.$cardWobble, this.$cardRotation$delegate, this.$cardNuxState, this.$forwardResting$delegate, this.$zTranslation, this.$parentModel$delegate, this.$animateCardIn$delegate, this.$targetView$delegate, this.$lifecycleActive, this.$refreshMs, this.$nuxAnimation$delegate, this.$currentRevolvingCards$delegate, this.$activityManager, this.$cardRegistry, (MutableState) this.$backwardResting$delegate, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(mapLatest, anonymousClass3, this) == coroutineSingletons) {
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
                CoroutineScope coroutineScope = (CoroutineScope) this.$backwardResting$delegate;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                MutableState mutableState3 = this.$cardRotation$delegate;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    JobKt.launch$default(coroutineScope, null, null, new RealPayDataLoader$fetchData$1(this.$dragOffsets, this.$animationsEnabled$delegate, this.$wobble, this.$cardWobble, this.$exitTransitionState$delegate, (Continuation) null), 3);
                    WithdrawViewKt$WithdrawAmountView$1$1 withdrawViewKt$WithdrawAmountView$1$1 = new WithdrawViewKt$WithdrawAmountView$1$1(this.$cardNuxState, this.$exitTransitionState$delegate, mutableState3, this.$zTranslation, null, 4);
                    mutableState = mutableState3;
                    this.$backwardResting$delegate = null;
                    this.label = 1;
                    break;
                } else if (i3 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState = mutableState3;
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                this.$forwardResting$delegate.setValue(null);
                if (this.$withIntroSpin) {
                    mutableState2.setValue(CardNuxAnimationsKt.MONEY_CARD_INTRO_ROTATION);
                }
                RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3$1$3 revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3$1$3 = new RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3$1$3(this.$parentModel$delegate, this.$withIntroSpin, this.$dragOffsets, this.$animateCardIn$delegate, this.$targetView$delegate, this.$refreshMs, this.$exitTransitionState$delegate, this.$nuxAnimation$delegate, this.$lifecycleActive, this.$cardNuxState, this.$activityManager, this.$cardRegistry, mutableState, this.$currentRevolvingCards$delegate, null);
                this.$backwardResting$delegate = null;
                this.label = 2;
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1(boolean z, MutableSharedFlow mutableSharedFlow, State state, boolean z2, CardWobbleState cardWobbleState, MutableState mutableState, CardNuxState cardNuxState, MutableState mutableState2, Animatable animatable, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, long j, State state2, MutableState mutableState7, ActivityManager activityManager, CardRegistry cardRegistry, MutableState mutableState8, Continuation continuation) {
        super(2, continuation);
        this.$withIntroSpin = z;
        this.$dragOffsets = mutableSharedFlow;
        this.$animationsEnabled$delegate = state;
        this.$wobble = z2;
        this.$cardWobble = cardWobbleState;
        this.$exitTransitionState$delegate = mutableState;
        this.$cardNuxState = cardNuxState;
        this.$cardRotation$delegate = mutableState2;
        this.$zTranslation = animatable;
        this.$forwardResting$delegate = mutableState3;
        this.$parentModel$delegate = mutableState4;
        this.$animateCardIn$delegate = mutableState5;
        this.$targetView$delegate = mutableState6;
        this.$refreshMs = j;
        this.$nuxAnimation$delegate = state2;
        this.$lifecycleActive = mutableState7;
        this.$activityManager = activityManager;
        this.$cardRegistry = cardRegistry;
        this.$currentRevolvingCards$delegate = mutableState8;
    }
}
