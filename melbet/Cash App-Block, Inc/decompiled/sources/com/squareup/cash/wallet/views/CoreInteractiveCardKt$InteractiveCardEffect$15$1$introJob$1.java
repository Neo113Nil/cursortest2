package com.squareup.cash.wallet.views;

import android.view.animation.LinearInterpolator;
import androidx.compose.animation.core.Animatable;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.filament.SlerpAnimator;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.score.views.ScoreSummaryKt$ScoreSummary$1$3$1;
import com.squareup.cash.transfers.views.WithdrawViewKt$WithdrawAmountView$1$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$9$1$3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $active;
    public final /* synthetic */ MutableState $activeHeroDetails$delegate;
    public final /* synthetic */ MutableState $animateCardIn$delegate;
    public final /* synthetic */ MutableState $animationState$delegate;
    public final /* synthetic */ MutableState $animationsEnabled$delegate;
    public final /* synthetic */ Quat $backwardResting;
    public final /* synthetic */ Animatable $cardAlpha;
    public final /* synthetic */ MutableState $cardDetails$delegate;
    public final /* synthetic */ State $cardEnabled$delegate;
    public final /* synthetic */ MutableState $cardRotation$delegate;
    public final /* synthetic */ CardWobbleState $cardWobble;
    public final /* synthetic */ MutableSharedFlow $dragOffsets;
    public final /* synthetic */ MutableState $exitTransitionState$delegate;
    public final /* synthetic */ MutableState $finishedAnimating$delegate;
    public final /* synthetic */ MutableState $forceFlipEnabled$delegate;
    public final /* synthetic */ Quat $forwardResting;
    public final /* synthetic */ State $isFacingForward$delegate;
    public final /* synthetic */ MutableState $parentSharedState$delegate;
    public final /* synthetic */ long $refreshMs;
    public final /* synthetic */ MutableState $sceneRef$delegate;
    public final /* synthetic */ boolean $showCardHome;
    public final /* synthetic */ MutableState $showContouredText$delegate;
    public int I$0;
    public /* synthetic */ Object L$0;
    public int label;

    /* renamed from: com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1$6, reason: invalid class name */
    public final class AnonymousClass6 extends SuspendLambda implements Function2 {
        public final /* synthetic */ CoroutineScope $$this$launch;
        public final /* synthetic */ MutableState $active;
        public final /* synthetic */ MutableState $activeHeroDetails$delegate;
        public final /* synthetic */ MutableState $animationState$delegate;
        public final /* synthetic */ Quat $backwardResting;
        public final /* synthetic */ Animatable $cardAlpha;
        public final /* synthetic */ MutableState $cardDetails$delegate;
        public final /* synthetic */ State $cardEnabled$delegate;
        public final /* synthetic */ MutableState $cardRotation$delegate;
        public final /* synthetic */ MutableSharedFlow $dragOffsets;
        public final /* synthetic */ MutableState $finishedAnimating$delegate;
        public final /* synthetic */ MutableState $forceFlipEnabled$delegate;
        public final /* synthetic */ Quat $forwardResting;
        public final /* synthetic */ State $isFacingForward$delegate;
        public final /* synthetic */ long $refreshMs;
        public final /* synthetic */ MutableState $sceneRef$delegate;
        public final /* synthetic */ boolean $showCardHome;
        public final /* synthetic */ MutableState $showContouredText$delegate;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public State L$3;
        public InteractiveCardState L$4;
        public CardScene L$5;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Animatable animatable, MutableState mutableState, long j, CoroutineScope coroutineScope, Quat quat, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, State state, MutableState mutableState7, State state2, MutableState mutableState8, MutableState mutableState9, MutableSharedFlow mutableSharedFlow, boolean z, Quat quat2, Continuation continuation) {
            super(2, continuation);
            this.$cardAlpha = animatable;
            this.$active = mutableState;
            this.$refreshMs = j;
            this.$$this$launch = coroutineScope;
            this.$forwardResting = quat;
            this.$cardDetails$delegate = mutableState2;
            this.$animationState$delegate = mutableState3;
            this.$activeHeroDetails$delegate = mutableState4;
            this.$cardRotation$delegate = mutableState5;
            this.$sceneRef$delegate = mutableState6;
            this.$cardEnabled$delegate = state;
            this.$showContouredText$delegate = mutableState7;
            this.$isFacingForward$delegate = state2;
            this.$finishedAnimating$delegate = mutableState8;
            this.$forceFlipEnabled$delegate = mutableState9;
            this.$dragOffsets = mutableSharedFlow;
            this.$showCardHome = z;
            this.$backwardResting = quat2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.$cardAlpha, this.$active, this.$refreshMs, this.$$this$launch, this.$forwardResting, this.$cardDetails$delegate, this.$animationState$delegate, this.$activeHeroDetails$delegate, this.$cardRotation$delegate, this.$sceneRef$delegate, this.$cardEnabled$delegate, this.$showContouredText$delegate, this.$isFacingForward$delegate, this.$finishedAnimating$delegate, this.$forceFlipEnabled$delegate, this.$dragOffsets, this.$showCardHome, this.$backwardResting, continuation);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass6) create((CardSchemeViewModel.Module.CardAnimation) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x032c, code lost:
        
            if (kotlinx.coroutines.JobKt.withContext(com.squareup.util.compose.ConstantSpeedMotionDurationScale.INSTANCE, r13, r29) == r2) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0279, code lost:
        
            if (kotlinx.coroutines.JobKt.coroutineScope(r22, r29) != r2) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x02cd, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r4, r5, r29) != r2) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x01db, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r4, r5, r29) == r2) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f9, code lost:
        
            if (r4.animateDimmer(false, false, r29) == r2) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00df, code lost:
        
            if (com.squareup.cash.wallet.views.CoreInteractiveCardKt.access$fadeIn(r10, r4, r14, r29) == r2) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00d1, code lost:
        
            if (r11.animateDimmer(true, true, r29) == r2) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x01b2, code lost:
        
            if (com.squareup.cash.wallet.views.CoreInteractiveCardKt.access$fadeIn(r10, r4, r12, r29) == r2) goto L90;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0206, code lost:
        
            if (com.squareup.cash.wallet.views.CoreInteractiveCardKt.access$fadeIn(r10, r4, r12, r29) == r2) goto L90;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x02ea  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x02fd  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0300  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            MutableState mutableState;
            MutableState mutableState2;
            long j;
            SlerpAnimator slerpAnimator;
            SlerpAnimator slerpAnimator2;
            SlerpAnimator slerpAnimator3;
            MutableState mutableState3;
            MutableState mutableState4;
            long j2;
            int i;
            CoroutineScope coroutineScope;
            InteractiveCardState interactiveCardState;
            State state;
            CardScene cardScene;
            State state2;
            State state3;
            int i2;
            CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1;
            CardSchemeViewModel.Module.CardAnimation cardAnimation = (CardSchemeViewModel.Module.CardAnimation) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.label;
            CoroutineScope coroutineScope2 = this.$$this$launch;
            MutableState mutableState5 = this.$activeHeroDetails$delegate;
            MutableState mutableState6 = this.$animationState$delegate;
            Animatable animatable = this.$cardAlpha;
            MutableState mutableState7 = this.$cardDetails$delegate;
            long j3 = this.$refreshMs;
            MutableState mutableState8 = this.$active;
            MutableState mutableState9 = this.$cardRotation$delegate;
            switch (i3) {
                case 0:
                    SafeTrace.throwOnFailure(obj);
                    if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.None)) {
                        if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Updated)) {
                            mutableState = mutableState9;
                            mutableState2 = mutableState7;
                            j = j3;
                            if (!Intrinsics.areEqual(cardAnimation, CardSchemeViewModel.Module.CardAnimation.SpinToFront.INSTANCE) && !Intrinsics.areEqual(cardAnimation, CardSchemeViewModel.Module.CardAnimation.Expired.INSTANCE)) {
                                if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Copy)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    this.L$0 = cardAnimation;
                                    this.label = 8;
                                    break;
                                }
                            } else {
                                boolean z = cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Expired;
                                Quat quat = z ? CoreInteractiveCardKt.MESH_EXPIRED_RESTING : this.$forwardResting;
                                Quat quat2 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                                slerpAnimator = new SlerpAnimator((Quat) mutableState.getValue(), quat);
                                if (z) {
                                    this.L$0 = cardAnimation;
                                    this.L$1 = null;
                                    this.L$2 = slerpAnimator;
                                    this.label = 6;
                                    if (CoreInteractiveCardKt.access$fadeIn(animatable, mutableState8, j, this) != coroutineSingletons) {
                                        slerpAnimator2 = slerpAnimator;
                                        slerpAnimator = slerpAnimator2;
                                    }
                                }
                                coroutineScope = coroutineScope2;
                                FlowKt__MergeKt$flatMapMerge$$inlined$map$1 animatedFlow = FlowsKt.animatedFlow(mutableState8, j, 500L);
                                Hero3DCardViewKt$InteractiveCard$9$1$3.AnonymousClass2.AnonymousClass7.AnonymousClass1 anonymousClass1 = new Hero3DCardViewKt$InteractiveCard$9$1$3.AnonymousClass2.AnonymousClass7.AnonymousClass1(slerpAnimator, mutableState, null, 2);
                                this.L$0 = cardAnimation;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 7;
                                break;
                            }
                        } else {
                            Quat quat3 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                            CardSchemeViewModel.Module.CardAnimation.Updated updated = (CardSchemeViewModel.Module.CardAnimation.Updated) cardAnimation;
                            mutableState5.setValue(CardSchemeViewModel.Module.HeroCardDetails.copy$default((CardSchemeViewModel.Module.HeroCardDetails) mutableState7.getValue(), updated.cardTheme, updated.customizationImage, updated.previouslyEnabled));
                            Quat quat4 = (Quat) mutableState9.getValue();
                            float[] fArr = Hero3DCardViewKt.Z_AXIS;
                            mutableState3 = mutableState5;
                            mutableState4 = mutableState9;
                            mutableState2 = mutableState7;
                            slerpAnimator3 = new SlerpAnimator(quat4, new Quat((float) Math.toRadians(90.0d), fArr).times((Quat) mutableState9.getValue()), new Quat((float) Math.toRadians(180.0d), fArr).times((Quat) mutableState9.getValue()), new Quat((float) Math.toRadians(270.0d), fArr).times((Quat) mutableState4.getValue()), new Quat((float) Math.toRadians(360.0d), fArr).times((Quat) mutableState4.getValue()));
                            slerpAnimator3.setInterpolator(new LinearInterpolator());
                            this.L$0 = cardAnimation;
                            this.L$1 = slerpAnimator3;
                            this.label = 4;
                            j2 = j3;
                            break;
                        }
                    } else {
                        if (!((CardSchemeViewModel.Module.CardAnimation.None) cardAnimation).previouslyEnabled) {
                            Quat quat5 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                            if (((CardSchemeViewModel.Module.HeroCardDetails) mutableState7.getValue()).isEnabled) {
                                i = 1;
                                if (i != 0) {
                                    Quat quat6 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                                    InteractiveCardState interactiveCardState2 = (InteractiveCardState) mutableState6.getValue();
                                    this.L$0 = cardAnimation;
                                    this.I$0 = i;
                                    this.label = 1;
                                    break;
                                }
                                this.L$0 = cardAnimation;
                                this.I$0 = i;
                                this.label = 2;
                                break;
                            }
                        }
                        i = 0;
                        if (i != 0) {
                        }
                        this.L$0 = cardAnimation;
                        this.I$0 = i;
                        this.label = 2;
                    }
                    break;
                case 1:
                    i = this.I$0;
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = cardAnimation;
                    this.I$0 = i;
                    this.label = 2;
                    break;
                case 2:
                    i = this.I$0;
                    SafeTrace.throwOnFailure(obj);
                    if (i != 0) {
                        Quat quat7 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                        InteractiveCardState interactiveCardState3 = (InteractiveCardState) mutableState6.getValue();
                        this.L$0 = cardAnimation;
                        this.I$0 = i;
                        this.label = 3;
                        break;
                    }
                    coroutineScope = coroutineScope2;
                    mutableState2 = mutableState7;
                    Quat quat8 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                    this.$finishedAnimating$delegate.setValue(Boolean.TRUE);
                    this.$forceFlipEnabled$delegate.setValue(Boolean.FALSE);
                    cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState2.getValue()).cardInteraction;
                    if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null) {
                        cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1.onCardSettled(false);
                    }
                    JobKt.launch$default(coroutineScope, null, null, new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState5, (Continuation) null, 4), 3);
                    if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Expired)) {
                        Hero3DCardViewKt$InteractiveCard$12$1.AnonymousClass4.AnonymousClass5.AnonymousClass2.AnonymousClass7 anonymousClass7 = new Hero3DCardViewKt$InteractiveCard$12$1.AnonymousClass4.AnonymousClass5.AnonymousClass2.AnonymousClass7(this.$dragOffsets, this.$showCardHome, this.$forwardResting, this.$backwardResting, this.$cardRotation$delegate, mutableState2, null, 1);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 11;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    SafeTrace.throwOnFailure(obj);
                    coroutineScope = coroutineScope2;
                    mutableState2 = mutableState7;
                    Quat quat82 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                    this.$finishedAnimating$delegate.setValue(Boolean.TRUE);
                    this.$forceFlipEnabled$delegate.setValue(Boolean.FALSE);
                    cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState2.getValue()).cardInteraction;
                    if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null) {
                    }
                    JobKt.launch$default(coroutineScope, null, null, new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState5, (Continuation) null, 4), 3);
                    if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Expired)) {
                    }
                    break;
                case 4:
                    slerpAnimator3 = (SlerpAnimator) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    mutableState3 = mutableState5;
                    mutableState4 = mutableState9;
                    mutableState2 = mutableState7;
                    j2 = j3;
                    mutableState5 = mutableState3;
                    JobKt.launch$default(coroutineScope2, null, null, new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState5, (Continuation) null, 3), 3);
                    FlowKt__MergeKt$flatMapMerge$$inlined$map$1 animatedFlow2 = FlowsKt.animatedFlow(mutableState8, j2, 2000L);
                    Hero3DCardViewKt$InteractiveCard$9$1$3.AnonymousClass2.AnonymousClass7.AnonymousClass1 anonymousClass12 = new Hero3DCardViewKt$InteractiveCard$9$1$3.AnonymousClass2.AnonymousClass7.AnonymousClass1(slerpAnimator3, mutableState4, null, 1);
                    this.L$0 = cardAnimation;
                    this.L$1 = null;
                    this.label = 5;
                    break;
                case 5:
                    SafeTrace.throwOnFailure(obj);
                    mutableState2 = mutableState7;
                    coroutineScope = coroutineScope2;
                    Quat quat822 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                    this.$finishedAnimating$delegate.setValue(Boolean.TRUE);
                    this.$forceFlipEnabled$delegate.setValue(Boolean.FALSE);
                    cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState2.getValue()).cardInteraction;
                    if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null) {
                    }
                    JobKt.launch$default(coroutineScope, null, null, new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState5, (Continuation) null, 4), 3);
                    if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Expired)) {
                    }
                    break;
                case 6:
                    slerpAnimator2 = (SlerpAnimator) this.L$2;
                    SafeTrace.throwOnFailure(obj);
                    mutableState = mutableState9;
                    mutableState2 = mutableState7;
                    j = j3;
                    slerpAnimator = slerpAnimator2;
                    coroutineScope = coroutineScope2;
                    FlowKt__MergeKt$flatMapMerge$$inlined$map$1 animatedFlow3 = FlowsKt.animatedFlow(mutableState8, j, 500L);
                    Hero3DCardViewKt$InteractiveCard$9$1$3.AnonymousClass2.AnonymousClass7.AnonymousClass1 anonymousClass13 = new Hero3DCardViewKt$InteractiveCard$9$1$3.AnonymousClass2.AnonymousClass7.AnonymousClass1(slerpAnimator, mutableState, null, 2);
                    this.L$0 = cardAnimation;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 7;
                    break;
                case 7:
                    SafeTrace.throwOnFailure(obj);
                    coroutineScope = coroutineScope2;
                    mutableState2 = mutableState7;
                    Quat quat8222 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                    this.$finishedAnimating$delegate.setValue(Boolean.TRUE);
                    this.$forceFlipEnabled$delegate.setValue(Boolean.FALSE);
                    cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState2.getValue()).cardInteraction;
                    if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null) {
                    }
                    JobKt.launch$default(coroutineScope, null, null, new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState5, (Continuation) null, 4), 3);
                    if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Expired)) {
                    }
                    break;
                case 8:
                    SafeTrace.throwOnFailure(obj);
                    mutableState2 = mutableState7;
                    Quat quat9 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                    InteractiveCardState interactiveCardState4 = (InteractiveCardState) mutableState6.getValue();
                    CardScene cardScene2 = (CardScene) this.$sceneRef$delegate.getValue();
                    State state4 = this.$cardEnabled$delegate;
                    MutableState mutableState10 = this.$showContouredText$delegate;
                    WithdrawViewKt$WithdrawAmountView$1$1 withdrawViewKt$WithdrawAmountView$1$1 = new WithdrawViewKt$WithdrawAmountView$1$1(interactiveCardState4, state4, mutableState10, cardScene2, null, 2);
                    interactiveCardState = interactiveCardState4;
                    state = mutableState10;
                    cardScene = cardScene2;
                    this.L$0 = cardAnimation;
                    this.L$1 = state4;
                    this.L$2 = state;
                    state2 = this.$isFacingForward$delegate;
                    this.L$3 = state2;
                    this.L$4 = interactiveCardState;
                    this.L$5 = cardScene;
                    this.I$0 = 0;
                    this.label = 9;
                    if (JobKt.coroutineScope(withdrawViewKt$WithdrawAmountView$1$1, this) != coroutineSingletons) {
                        state3 = state4;
                        i2 = 0;
                        NavHostKt$NavHost$33$1 navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(cardScene, interactiveCardState, state3, state, state2, (Continuation) null);
                        this.L$0 = cardAnimation;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.I$0 = i2;
                        this.label = 10;
                        break;
                    }
                    break;
                case 9:
                    i2 = this.I$0;
                    cardScene = this.L$5;
                    interactiveCardState = this.L$4;
                    state2 = this.L$3;
                    state = (State) this.L$2;
                    State state5 = (State) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    state3 = state5;
                    mutableState2 = mutableState7;
                    NavHostKt$NavHost$33$1 navHostKt$NavHost$33$12 = new NavHostKt$NavHost$33$1(cardScene, interactiveCardState, state3, state, state2, (Continuation) null);
                    this.L$0 = cardAnimation;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.I$0 = i2;
                    this.label = 10;
                    break;
                case 10:
                    SafeTrace.throwOnFailure(obj);
                    mutableState2 = mutableState7;
                    coroutineScope = coroutineScope2;
                    Quat quat82222 = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
                    this.$finishedAnimating$delegate.setValue(Boolean.TRUE);
                    this.$forceFlipEnabled$delegate.setValue(Boolean.FALSE);
                    cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState2.getValue()).cardInteraction;
                    if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null) {
                    }
                    JobKt.launch$default(coroutineScope, null, null, new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState2, mutableState5, (Continuation) null, 4), 3);
                    if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Expired)) {
                    }
                    break;
                case 11:
                    SafeTrace.throwOnFailure(obj);
                    break;
                default:
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1(Quat quat, Quat quat2, boolean z, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, State state, MutableState mutableState5, MutableSharedFlow mutableSharedFlow, MutableState mutableState6, CardWobbleState cardWobbleState, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, Animatable animatable, MutableState mutableState11, long j, MutableState mutableState12, State state2, MutableState mutableState13, Continuation continuation) {
        super(2, continuation);
        this.$forwardResting = quat;
        this.$backwardResting = quat2;
        this.$showCardHome = z;
        this.$cardDetails$delegate = mutableState;
        this.$cardRotation$delegate = mutableState2;
        this.$forceFlipEnabled$delegate = mutableState3;
        this.$activeHeroDetails$delegate = mutableState4;
        this.$cardEnabled$delegate = state;
        this.$animationsEnabled$delegate = mutableState5;
        this.$dragOffsets = mutableSharedFlow;
        this.$exitTransitionState$delegate = mutableState6;
        this.$cardWobble = cardWobbleState;
        this.$parentSharedState$delegate = mutableState7;
        this.$animationState$delegate = mutableState8;
        this.$showContouredText$delegate = mutableState9;
        this.$animateCardIn$delegate = mutableState10;
        this.$cardAlpha = animatable;
        this.$active = mutableState11;
        this.$refreshMs = j;
        this.$sceneRef$delegate = mutableState12;
        this.$isFacingForward$delegate = state2;
        this.$finishedAnimating$delegate = mutableState13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1 coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1 = new CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1(this.$forwardResting, this.$backwardResting, this.$showCardHome, this.$cardDetails$delegate, this.$cardRotation$delegate, this.$forceFlipEnabled$delegate, this.$activeHeroDetails$delegate, this.$cardEnabled$delegate, this.$animationsEnabled$delegate, this.$dragOffsets, this.$exitTransitionState$delegate, this.$cardWobble, this.$parentSharedState$delegate, this.$animationState$delegate, this.$showContouredText$delegate, this.$animateCardIn$delegate, this.$cardAlpha, this.$active, this.$refreshMs, this.$sceneRef$delegate, this.$isFacingForward$delegate, this.$finishedAnimating$delegate, continuation);
        coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1.L$0 = obj;
        return coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x025c, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r5, r2, r28) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01e0, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r6, r28) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0069, code lost:
    
        if (r2 == r1) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20, types: [kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object first;
        MutableState mutableState;
        Object obj2;
        CardSchemeViewModel.Module.HeroCardDetails heroCardDetails;
        int i;
        Object obj3;
        MutableState mutableState2;
        int i2;
        Object obj4;
        Object obj5;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        MutableState mutableState3 = this.$showContouredText$delegate;
        MutableState mutableState4 = this.$activeHeroDetails$delegate;
        MutableState mutableState5 = this.$animationState$delegate;
        MutableState mutableState6 = this.$cardDetails$delegate;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(9, mutableState6)), 24);
            this.L$0 = coroutineScope;
            this.label = 1;
            first = FlowKt.first(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, this);
        } else if (i3 == 1) {
            SafeTrace.throwOnFailure(obj);
            first = obj;
        } else if (i3 == 2 || i3 == 3) {
            i2 = this.I$0;
            SafeTrace.throwOnFailure(obj);
            mutableState = mutableState5;
            mutableState2 = mutableState6;
            obj4 = null;
            SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$1 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(10, this.$animateCardIn$delegate)), 23);
            this.L$0 = coroutineScope;
            this.I$0 = i2;
            this.label = 4;
            obj5 = obj4;
        } else {
            if (i3 != 4) {
                if (i3 == 5) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$0;
            SafeTrace.throwOnFailure(obj);
            mutableState = mutableState5;
            mutableState2 = mutableState6;
            obj5 = null;
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(11, mutableState2)), 24));
            int i4 = i2;
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.$cardAlpha, this.$active, this.$refreshMs, coroutineScope, this.$forwardResting, mutableState2, mutableState, mutableState4, this.$cardRotation$delegate, this.$sceneRef$delegate, this.$cardEnabled$delegate, mutableState3, this.$isFacingForward$delegate, this.$finishedAnimating$delegate, this.$forceFlipEnabled$delegate, this.$dragOffsets, this.$showCardHome, this.$backwardResting, null);
            this.L$0 = obj5;
            this.I$0 = i4;
            this.label = 5;
            coroutineSingletons = coroutineSingletons;
        }
        CardSchemeViewModel.Module.CardAnimation cardAnimation = (CardSchemeViewModel.Module.CardAnimation) first;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Quat quat = CoreInteractiveCardKt.MESH_EXPIRED_RESTING;
        ref$ObjectRef.element = (Quat) this.$cardRotation$delegate.getValue();
        boolean z = cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.None;
        MutableState mutableState7 = this.$forceFlipEnabled$delegate;
        Quat quat2 = this.$backwardResting;
        Quat quat3 = this.$forwardResting;
        if (z) {
            CardSchemeViewModel.Module.CardAnimation.None none = (CardSchemeViewModel.Module.CardAnimation.None) cardAnimation;
            boolean z2 = none.previouslyEnabled;
            if (none.previouslyFacingForward) {
                quat2 = quat3;
            }
            ref$ObjectRef.element = quat2;
            mutableState7.setValue(Boolean.valueOf((z2 && ((CardSchemeViewModel.Module.HeroCardDetails) mutableState6.getValue()).isEnabled) ? false : true));
            i = z2 ? 1 : 0;
            mutableState = mutableState5;
            heroCardDetails = null;
            obj2 = null;
        } else if (cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Updated) {
            CardSchemeViewModel.Module.HeroCardDetails heroCardDetails2 = (CardSchemeViewModel.Module.HeroCardDetails) mutableState6.getValue();
            CardSchemeViewModel.Module.CardAnimation.Updated updated = (CardSchemeViewModel.Module.CardAnimation.Updated) cardAnimation;
            boolean z3 = updated.previouslyEnabled;
            obj2 = null;
            mutableState = mutableState5;
            heroCardDetails = CardSchemeViewModel.Module.HeroCardDetails.copy$default(heroCardDetails2, updated.cardTheme, updated.customizationImage, z3);
            if (updated.previouslyFacingForward) {
                quat2 = quat3;
            }
            ref$ObjectRef.element = quat2;
            mutableState7.setValue(Boolean.valueOf((z3 && ((CardSchemeViewModel.Module.HeroCardDetails) mutableState6.getValue()).isEnabled) ? false : true));
            i = z3 ? 1 : 0;
        } else {
            mutableState = mutableState5;
            obj2 = null;
            if (Intrinsics.areEqual(cardAnimation, CardSchemeViewModel.Module.CardAnimation.Expired.INSTANCE)) {
                ref$ObjectRef.element = quat3;
            } else if (!Intrinsics.areEqual(cardAnimation, CardSchemeViewModel.Module.CardAnimation.SpinToFront.INSTANCE)) {
                if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Copy)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ref$ObjectRef.element = quat2;
            }
            heroCardDetails = null;
            i = 1;
        }
        if (heroCardDetails == null) {
            heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) mutableState6.getValue();
        }
        mutableState4.setValue(heroCardDetails);
        if (this.$showCardHome) {
            ?? r4 = obj2;
            JobKt.launch$default(coroutineScope, r4, r4, new HeroCardViewKt$Render$1$4$1(cardAnimation, this.$cardEnabled$delegate, this.$animationsEnabled$delegate, this.$dragOffsets, this.$exitTransitionState$delegate, this.$cardWobble, this.$cardRotation$delegate, (Continuation) null), 3);
            obj3 = r4;
        } else {
            obj3 = obj2;
        }
        CardRegistry.SharedCardTransitionState sharedCardTransitionState = (CardRegistry.SharedCardTransitionState) this.$parentSharedState$delegate.getValue();
        MutableState mutableState8 = this.$cardRotation$delegate;
        if (sharedCardTransitionState != null) {
            NavHostKt$NavHost$33$1 navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(sharedCardTransitionState, mutableState8, ref$ObjectRef, mutableState, mutableState6, (Continuation) null, 21);
            mutableState2 = mutableState6;
            this.L$0 = coroutineScope;
            this.I$0 = i;
            this.label = 2;
            if (JobKt.coroutineScope(navHostKt$NavHost$33$1, this) != coroutineSingletons) {
                i2 = i;
                obj4 = obj3;
                SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$12 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(10, this.$animateCardIn$delegate)), 23);
                this.L$0 = coroutineScope;
                this.I$0 = i2;
                this.label = 4;
                obj5 = obj4;
            }
            return coroutineSingletons;
        }
        mutableState2 = mutableState6;
        mutableState8.setValue((Quat) ref$ObjectRef.element);
        InteractiveCardState interactiveCardState = (InteractiveCardState) mutableState.getValue();
        boolean booleanValue = ((Boolean) mutableState3.getValue()).booleanValue();
        this.L$0 = coroutineScope;
        this.I$0 = i;
        this.label = 3;
        interactiveCardState.getClass();
        boolean z4 = i;
        if (JobKt.coroutineScope(new InteractiveCardState$animateCardTranslation$2(false, z4, interactiveCardState, booleanValue, true, null), this) != coroutineSingletons) {
            i2 = z4 ? 1 : 0;
            obj4 = obj3;
            SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$122 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(10, this.$animateCardIn$delegate)), 23);
            this.L$0 = coroutineScope;
            this.I$0 = i2;
            this.label = 4;
            obj5 = obj4;
        }
        return coroutineSingletons;
        return Unit.INSTANCE;
    }
}
