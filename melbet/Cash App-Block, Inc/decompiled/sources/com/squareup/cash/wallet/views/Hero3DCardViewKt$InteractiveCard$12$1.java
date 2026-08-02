package com.squareup.cash.wallet.views;

import android.view.animation.LinearInterpolator;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.filament.SlerpAnimator;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.score.views.ScoreSummaryKt$ScoreSummary$1$3$1;
import com.squareup.cash.transfers.views.WithdrawViewKt$WithdrawAmountView$1$1;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$9$1$3;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.util.coroutines.TakeUntil;
import com.squareup.util.coroutines.TakeUntilKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class Hero3DCardViewKt$InteractiveCard$12$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $active;
    public final /* synthetic */ MutableState $activeHeroDetails$delegate;
    public final /* synthetic */ MutableState $animateCardIn$delegate;
    public final /* synthetic */ MutableState $animationState$delegate;
    public final /* synthetic */ MutableState $animationsEnabled$delegate;
    public final /* synthetic */ Quat $backwardResting;
    public final /* synthetic */ MutableState $cardDetails$delegate;
    public final /* synthetic */ MutableState $cardEnabled$delegate;
    public final /* synthetic */ MutableState $cardRotation$delegate;
    public final /* synthetic */ CardWobbleState $cardWobble;
    public final /* synthetic */ MutableSharedFlow $dragOffsets;
    public final /* synthetic */ MutableState $exitTransitionState$delegate;
    public final /* synthetic */ MutableState $finishedAnimating$delegate;
    public final /* synthetic */ MutableState $forceFlipEnabled$delegate;
    public final /* synthetic */ Quat $forwardResting;
    public final /* synthetic */ MutableState $parentModel$delegate;
    public final /* synthetic */ long $refreshMs;
    public final /* synthetic */ boolean $showCardHome;
    public final /* synthetic */ MutableState $showContouredText$delegate;
    public final /* synthetic */ MutableState $view$delegate;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hero3DCardViewKt$InteractiveCard$12$1(MutableState mutableState, MutableState mutableState2, Quat quat, Quat quat2, boolean z, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableSharedFlow mutableSharedFlow, CardWobbleState cardWobbleState, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, long j, MutableState mutableState14, Continuation continuation) {
        super(2, continuation);
        this.$view$delegate = mutableState;
        this.$exitTransitionState$delegate = mutableState2;
        this.$forwardResting = quat;
        this.$backwardResting = quat2;
        this.$showCardHome = z;
        this.$cardDetails$delegate = mutableState3;
        this.$cardRotation$delegate = mutableState4;
        this.$forceFlipEnabled$delegate = mutableState5;
        this.$activeHeroDetails$delegate = mutableState6;
        this.$cardEnabled$delegate = mutableState7;
        this.$animationsEnabled$delegate = mutableState8;
        this.$dragOffsets = mutableSharedFlow;
        this.$cardWobble = cardWobbleState;
        this.$parentModel$delegate = mutableState9;
        this.$animationState$delegate = mutableState10;
        this.$showContouredText$delegate = mutableState11;
        this.$animateCardIn$delegate = mutableState12;
        this.$active = mutableState13;
        this.$refreshMs = j;
        this.$finishedAnimating$delegate = mutableState14;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Hero3DCardViewKt$InteractiveCard$12$1 hero3DCardViewKt$InteractiveCard$12$1 = new Hero3DCardViewKt$InteractiveCard$12$1(this.$view$delegate, this.$exitTransitionState$delegate, this.$forwardResting, this.$backwardResting, this.$showCardHome, this.$cardDetails$delegate, this.$cardRotation$delegate, this.$forceFlipEnabled$delegate, this.$activeHeroDetails$delegate, this.$cardEnabled$delegate, this.$animationsEnabled$delegate, this.$dragOffsets, this.$cardWobble, this.$parentModel$delegate, this.$animationState$delegate, this.$showContouredText$delegate, this.$animateCardIn$delegate, this.$active, this.$refreshMs, this.$finishedAnimating$delegate, continuation);
        hero3DCardViewKt$InteractiveCard$12$1.L$0 = obj;
        return hero3DCardViewKt$InteractiveCard$12$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Hero3DCardViewKt$InteractiveCard$12$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(26, this.$view$delegate)), 24);
            MutableState mutableState = this.$exitTransitionState$delegate;
            TakeUntil takeUntil = TakeUntilKt.takeUntil(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(27, mutableState)), 4));
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$forwardResting, this.$backwardResting, this.$showCardHome, coroutineScope, this.$cardDetails$delegate, this.$cardRotation$delegate, this.$forceFlipEnabled$delegate, this.$activeHeroDetails$delegate, this.$cardEnabled$delegate, this.$animationsEnabled$delegate, this.$dragOffsets, mutableState, this.$cardWobble, this.$parentModel$delegate, this.$animationState$delegate, this.$showContouredText$delegate, this.$animateCardIn$delegate, this.$active, this.$refreshMs, this.$view$delegate, this.$finishedAnimating$delegate, null);
            this.L$0 = null;
            this.label = 1;
            if (FlowKt.collectLatest(takeUntil, anonymousClass4, this) == coroutineSingletons) {
                return coroutineSingletons;
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

    /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends SuspendLambda implements Function2 {
        public final /* synthetic */ Object $$this$LaunchedEffect;
        public final /* synthetic */ MutableState $active;
        public final /* synthetic */ MutableState $activeHeroDetails$delegate;
        public final /* synthetic */ MutableState $animateCardIn$delegate;
        public final /* synthetic */ MutableState $animationState$delegate;
        public final /* synthetic */ MutableState $animationsEnabled$delegate;
        public final /* synthetic */ Quat $backwardResting;
        public final /* synthetic */ MutableState $cardDetails$delegate;
        public final /* synthetic */ MutableState $cardEnabled$delegate;
        public final /* synthetic */ MutableState $cardRotation$delegate;
        public final /* synthetic */ CardWobbleState $cardWobble;
        public final /* synthetic */ MutableSharedFlow $dragOffsets;
        public final /* synthetic */ MutableState $exitTransitionState$delegate;
        public final /* synthetic */ State $finishedAnimating$delegate;
        public final /* synthetic */ MutableState $forceFlipEnabled$delegate;
        public final /* synthetic */ Quat $forwardResting;
        public final /* synthetic */ MutableState $parentModel$delegate;
        public final /* synthetic */ int $r8$classId = 1;
        public final /* synthetic */ long $refreshMs;
        public final /* synthetic */ boolean $showCardHome;
        public final /* synthetic */ MutableState $showContouredText$delegate;
        public final /* synthetic */ MutableState $view$delegate;
        public /* synthetic */ Object L$0;
        public Object L$2;
        public Object L$4;
        public int label;

        /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$5, reason: invalid class name */
        public final class AnonymousClass5 extends SuspendLambda implements Function2 {
            public final /* synthetic */ CoroutineScope $$this$LaunchedEffect;
            public final /* synthetic */ MutableState $active;
            public final /* synthetic */ MutableState $activeHeroDetails$delegate;
            public final /* synthetic */ MutableState $animationState$delegate;
            public final /* synthetic */ Quat $backwardResting;
            public final /* synthetic */ MutableState $cardDetails$delegate;
            public final /* synthetic */ MutableState $cardEnabled$delegate;
            public final /* synthetic */ CardModelView $cardModelView;
            public final /* synthetic */ MutableState $cardRotation$delegate;
            public final /* synthetic */ MutableSharedFlow $dragOffsets;
            public final /* synthetic */ MutableState $finishedAnimating$delegate;
            public final /* synthetic */ MutableState $forceFlipEnabled$delegate;
            public final /* synthetic */ Quat $forwardResting;
            public final /* synthetic */ long $refreshMs;
            public final /* synthetic */ boolean $showCardHome;
            public final /* synthetic */ MutableState $showContouredText$delegate;
            public final /* synthetic */ MutableState $view$delegate;
            public /* synthetic */ boolean Z$0;
            public int label;

            /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$5$2, reason: invalid class name */
            public final class AnonymousClass2 extends SuspendLambda implements Function2 {
                public final /* synthetic */ CoroutineScope $$this$LaunchedEffect;
                public final /* synthetic */ MutableState $active;
                public final /* synthetic */ MutableState $activeHeroDetails$delegate;
                public final /* synthetic */ MutableState $animationState$delegate;
                public final /* synthetic */ Quat $backwardResting;
                public final /* synthetic */ MutableState $cardDetails$delegate;
                public final /* synthetic */ MutableState $cardEnabled$delegate;
                public final /* synthetic */ CardModelView $cardModelView;
                public final /* synthetic */ MutableState $cardRotation$delegate;
                public final /* synthetic */ MutableSharedFlow $dragOffsets;
                public final /* synthetic */ MutableState $finishedAnimating$delegate;
                public final /* synthetic */ MutableState $forceFlipEnabled$delegate;
                public final /* synthetic */ Quat $forwardResting;
                public final /* synthetic */ long $refreshMs;
                public final /* synthetic */ boolean $showCardHome;
                public final /* synthetic */ MutableState $showContouredText$delegate;
                public final /* synthetic */ MutableState $view$delegate;
                public int I$0;
                public /* synthetic */ Object L$0;
                public Object L$1;
                public MutableState L$2;
                public MutableState L$3;
                public InteractiveCardState L$4;
                public int label;

                /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$5$2$7, reason: invalid class name */
                public final class AnonymousClass7 extends SuspendLambda implements Function2 {
                    public final /* synthetic */ Quat $backwardResting;
                    public final /* synthetic */ MutableState $cardDetails$delegate;
                    public final /* synthetic */ MutableState $cardRotation$delegate;
                    public final /* synthetic */ MutableSharedFlow $dragOffsets;
                    public final /* synthetic */ Quat $forwardResting;
                    public final /* synthetic */ int $r8$classId;
                    public final /* synthetic */ boolean $showCardHome;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public /* synthetic */ AnonymousClass7(MutableSharedFlow mutableSharedFlow, boolean z, Quat quat, Quat quat2, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
                        super(2, continuation);
                        this.$r8$classId = i;
                        this.$dragOffsets = mutableSharedFlow;
                        this.$showCardHome = z;
                        this.$forwardResting = quat;
                        this.$backwardResting = quat2;
                        this.$cardRotation$delegate = mutableState;
                        this.$cardDetails$delegate = mutableState2;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        switch (this.$r8$classId) {
                            case 0:
                                return new AnonymousClass7(this.$dragOffsets, this.$showCardHome, this.$forwardResting, this.$backwardResting, this.$cardRotation$delegate, this.$cardDetails$delegate, continuation, 0);
                            default:
                                return new AnonymousClass7(this.$dragOffsets, this.$showCardHome, this.$forwardResting, this.$backwardResting, this.$cardRotation$delegate, this.$cardDetails$delegate, continuation, 1);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        CoroutineScope coroutineScope = (CoroutineScope) obj;
                        Continuation continuation = (Continuation) obj2;
                        switch (this.$r8$classId) {
                        }
                        return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        int i = this.$r8$classId;
                        MutableSharedFlow mutableSharedFlow = this.$dragOffsets;
                        MutableState mutableState = this.$cardDetails$delegate;
                        boolean z = this.$showCardHome;
                        Quat quat = this.$backwardResting;
                        Quat quat2 = this.$forwardResting;
                        MutableState mutableState2 = this.$cardRotation$delegate;
                        int i2 = 14;
                        switch (i) {
                            case 0:
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                int i3 = this.label;
                                if (i3 == 0) {
                                    SafeTrace.throwOnFailure(obj);
                                    ChannelFlowBuilder merge = FlowKt.merge(Hero3DCardViewKt.cardSettleFlow(this.$dragOffsets, new PageTagSlotKt$$ExternalSyntheticLambda0(quat2, i2), new PageTagSlotKt$$ExternalSyntheticLambda0(quat, i2), new HeroCardViewKt$$ExternalSyntheticLambda15(4, mutableState2), z ? 25.0f : 60.0f, z ? new SpringSpec(0.8f, 25.0f, new Float(0.005f)) : new SpringSpec(0.43f, 290.0f, new Float(0.01f)), new HeroCardViewKt$$ExternalSyntheticLambda15(5, mutableState)), Hero3DCardViewKt.rotateDragFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(6, mutableState2), mutableSharedFlow));
                                    TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$1 = new TabContentPresenter$models$4$1$1$1(mutableState2, (Continuation) null, 26);
                                    this.label = 1;
                                    if (FlowKt.collectLatest(merge, tabContentPresenter$models$4$1$1$1, this) == coroutineSingletons) {
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
                                    ChannelFlowBuilder merge2 = FlowKt.merge(Hero3DCardViewKt.cardSettleFlow(this.$dragOffsets, new PageTagSlotKt$$ExternalSyntheticLambda0(quat2, i2), new PageTagSlotKt$$ExternalSyntheticLambda0(quat, i2), new CardAppletTileKt$$ExternalSyntheticLambda9(i2, mutableState2), z ? 25.0f : 60.0f, z ? new SpringSpec(0.8f, 25.0f, new Float(0.005f)) : new SpringSpec(0.43f, 290.0f, new Float(0.01f)), new CardAppletTileKt$$ExternalSyntheticLambda9(15, mutableState)), Hero3DCardViewKt.rotateDragFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(16, mutableState2), mutableSharedFlow));
                                    TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$12 = new TabContentPresenter$models$4$1$1$1(mutableState2, (Continuation) null, 22);
                                    this.label = 1;
                                    if (FlowKt.collectLatest(merge2, tabContentPresenter$models$4$1$1$12, this) == coroutineSingletons2) {
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(long j, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, CardModelView cardModelView, Quat quat, Quat quat2, Continuation continuation, CoroutineScope coroutineScope, MutableSharedFlow mutableSharedFlow, boolean z) {
                    super(2, continuation);
                    this.$cardModelView = cardModelView;
                    this.$active = mutableState;
                    this.$refreshMs = j;
                    this.$$this$LaunchedEffect = coroutineScope;
                    this.$forwardResting = quat;
                    this.$cardDetails$delegate = mutableState2;
                    this.$animationState$delegate = mutableState3;
                    this.$activeHeroDetails$delegate = mutableState4;
                    this.$cardRotation$delegate = mutableState5;
                    this.$cardEnabled$delegate = mutableState6;
                    this.$showContouredText$delegate = mutableState7;
                    this.$view$delegate = mutableState8;
                    this.$finishedAnimating$delegate = mutableState9;
                    this.$forceFlipEnabled$delegate = mutableState10;
                    this.$dragOffsets = mutableSharedFlow;
                    this.$showCardHome = z;
                    this.$backwardResting = quat2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    boolean z = this.$showCardHome;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$refreshMs, this.$active, this.$cardDetails$delegate, this.$animationState$delegate, this.$activeHeroDetails$delegate, this.$cardRotation$delegate, this.$cardEnabled$delegate, this.$showContouredText$delegate, this.$view$delegate, this.$finishedAnimating$delegate, this.$forceFlipEnabled$delegate, this.$cardModelView, this.$forwardResting, this.$backwardResting, continuation, this.$$this$LaunchedEffect, this.$dragOffsets, z);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass2) create((CardSchemeViewModel.Module.CardAnimation) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0322, code lost:
                
                    if (kotlinx.coroutines.JobKt.withContext(com.squareup.util.compose.ConstantSpeedMotionDurationScale.INSTANCE, r16, r3) == r2) goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x02bd, code lost:
                
                    if (r0 != r2) goto L71;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x0252, code lost:
                
                    if (kotlinx.coroutines.flow.FlowKt.collectLatest(r1, r5, r3) == r2) goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:38:0x01ce, code lost:
                
                    if (kotlinx.coroutines.flow.FlowKt.collectLatest(r0, r1, r3) == r2) goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
                
                    if (r5.animateDimmer(false, false, r35) == r2) goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x00d3, code lost:
                
                    if (com.squareup.cash.wallet.views.Hero3DCardViewKt.fadeIn(r14, r5, r10, r35) == r2) goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x00c4, code lost:
                
                    if (r6.animateDimmer(true, true, r35) == r2) goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x0119, code lost:
                
                    if (com.squareup.cash.wallet.views.Hero3DCardViewKt.fadeIn(r14, r5, r10, r35) == r2) goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:64:0x020d, code lost:
                
                    if (kotlinx.coroutines.flow.FlowKt.collectLatest(r1, r5, r3) == r2) goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x0237, code lost:
                
                    if (com.squareup.cash.wallet.views.Hero3DCardViewKt.fadeIn(r14, r5, r7, r3) == r2) goto L81;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0264, code lost:
                
                    if (com.squareup.cash.wallet.views.Hero3DCardViewKt.fadeIn(r14, r5, r7, r3) == r2) goto L81;
                 */
                /* JADX WARN: Removed duplicated region for block: B:13:0x02dc  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x02ef  */
                /* JADX WARN: Removed duplicated region for block: B:18:0x02f2  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AnonymousClass2 anonymousClass2;
                    MutableState mutableState;
                    CardSchemeViewModel.Module.CardAnimation cardAnimation;
                    CoroutineScope coroutineScope;
                    long j;
                    SlerpAnimator slerpAnimator;
                    int i;
                    InteractiveCardState interactiveCardState;
                    MutableState mutableState2;
                    Object obj2;
                    MutableState mutableState3;
                    int i2;
                    Object coroutineScope2;
                    CardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1;
                    CardSchemeViewModel.Module.CardAnimation cardAnimation2 = (CardSchemeViewModel.Module.CardAnimation) this.L$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    CoroutineScope coroutineScope3 = this.$$this$LaunchedEffect;
                    MutableState mutableState4 = this.$activeHeroDetails$delegate;
                    MutableState mutableState5 = this.$animationState$delegate;
                    CardModelView cardModelView = this.$cardModelView;
                    MutableState mutableState6 = this.$cardDetails$delegate;
                    long j2 = this.$refreshMs;
                    MutableState mutableState7 = this.$active;
                    MutableState mutableState8 = this.$cardRotation$delegate;
                    switch (i3) {
                        case 0:
                            SafeTrace.throwOnFailure(obj);
                            if (cardAnimation2 instanceof CardSchemeViewModel.Module.CardAnimation.None) {
                                if (!((CardSchemeViewModel.Module.CardAnimation.None) cardAnimation2).previouslyEnabled) {
                                    float[] fArr = Hero3DCardViewKt.X_AXIS;
                                    if (((CardSchemeViewModel.Module.HeroCardDetails) mutableState6.getValue()).isEnabled) {
                                        i = 1;
                                        if (i != 0) {
                                            float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                                            InteractiveCardState interactiveCardState2 = (InteractiveCardState) mutableState5.getValue();
                                            this.L$0 = cardAnimation2;
                                            this.I$0 = i;
                                            this.label = 1;
                                            break;
                                        }
                                        this.L$0 = cardAnimation2;
                                        this.I$0 = i;
                                        this.label = 2;
                                        break;
                                    }
                                }
                                i = 0;
                                if (i != 0) {
                                }
                                this.L$0 = cardAnimation2;
                                this.I$0 = i;
                                this.label = 2;
                            } else if (cardAnimation2 instanceof CardSchemeViewModel.Module.CardAnimation.Updated) {
                                float[] fArr3 = Hero3DCardViewKt.X_AXIS;
                                CardSchemeViewModel.Module.CardAnimation.Updated updated = (CardSchemeViewModel.Module.CardAnimation.Updated) cardAnimation2;
                                mutableState4.setValue(CardSchemeViewModel.Module.HeroCardDetails.copy$default((CardSchemeViewModel.Module.HeroCardDetails) mutableState6.getValue(), updated.cardTheme, updated.customizationImage, updated.previouslyEnabled));
                                this.L$0 = cardAnimation2;
                                this.label = 4;
                                break;
                            } else {
                                anonymousClass2 = this;
                                mutableState = mutableState8;
                                cardAnimation = cardAnimation2;
                                coroutineScope = coroutineScope3;
                                j = j2;
                                if (Intrinsics.areEqual(cardAnimation, CardSchemeViewModel.Module.CardAnimation.SpinToFront.INSTANCE)) {
                                    float[] fArr4 = Hero3DCardViewKt.X_AXIS;
                                    SlerpAnimator slerpAnimator2 = new SlerpAnimator((Quat) mutableState.getValue(), anonymousClass2.$forwardResting);
                                    FlowKt__MergeKt$flatMapMerge$$inlined$map$1 animatedFlow = FlowsKt.animatedFlow(mutableState7, j, 500L);
                                    Hero3DCardViewKt$InteractiveCard$9$1$3.AnonymousClass2.AnonymousClass7.AnonymousClass1 anonymousClass1 = new Hero3DCardViewKt$InteractiveCard$9$1$3.AnonymousClass2.AnonymousClass7.AnonymousClass1(slerpAnimator2, mutableState, null, 5);
                                    anonymousClass2.L$0 = cardAnimation;
                                    anonymousClass2.L$1 = null;
                                    anonymousClass2.label = 6;
                                    break;
                                } else if (Intrinsics.areEqual(cardAnimation, CardSchemeViewModel.Module.CardAnimation.Expired.INSTANCE)) {
                                    float[] fArr5 = Hero3DCardViewKt.X_AXIS;
                                    slerpAnimator = new SlerpAnimator((Quat) mutableState.getValue(), Hero3DCardViewKt.EXPIRED_RESTING);
                                    anonymousClass2.L$0 = cardAnimation;
                                    anonymousClass2.L$1 = slerpAnimator;
                                    anonymousClass2.label = 7;
                                    break;
                                } else {
                                    if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Copy)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    anonymousClass2.L$0 = cardAnimation;
                                    anonymousClass2.label = 9;
                                    break;
                                }
                            }
                            return coroutineSingletons;
                        case 1:
                            i = this.I$0;
                            SafeTrace.throwOnFailure(obj);
                            this.L$0 = cardAnimation2;
                            this.I$0 = i;
                            this.label = 2;
                            break;
                        case 2:
                            i = this.I$0;
                            SafeTrace.throwOnFailure(obj);
                            if (i != 0) {
                                float[] fArr6 = Hero3DCardViewKt.X_AXIS;
                                InteractiveCardState interactiveCardState3 = (InteractiveCardState) mutableState5.getValue();
                                this.L$0 = cardAnimation2;
                                this.I$0 = i;
                                this.label = 3;
                                break;
                            }
                            anonymousClass2 = this;
                            cardAnimation = cardAnimation2;
                            coroutineScope = coroutineScope3;
                            float[] fArr7 = Hero3DCardViewKt.X_AXIS;
                            anonymousClass2.$finishedAnimating$delegate.setValue(Boolean.TRUE);
                            anonymousClass2.$forceFlipEnabled$delegate.setValue(Boolean.FALSE);
                            cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState6.getValue()).cardInteraction;
                            if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null) {
                                cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1.onCardSettled(false);
                            }
                            JobKt.launch$default(coroutineScope, null, null, new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState6, mutableState4, (Continuation) null, 7), 3);
                            if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Expired)) {
                                return Unit.INSTANCE;
                            }
                            AnonymousClass7 anonymousClass7 = new AnonymousClass7(anonymousClass2.$dragOffsets, anonymousClass2.$showCardHome, anonymousClass2.$forwardResting, anonymousClass2.$backwardResting, anonymousClass2.$cardRotation$delegate, mutableState6, null, 0);
                            anonymousClass2.L$0 = null;
                            anonymousClass2.L$1 = null;
                            anonymousClass2.label = 12;
                            break;
                        case 3:
                            SafeTrace.throwOnFailure(obj);
                            anonymousClass2 = this;
                            cardAnimation = cardAnimation2;
                            coroutineScope = coroutineScope3;
                            float[] fArr72 = Hero3DCardViewKt.X_AXIS;
                            anonymousClass2.$finishedAnimating$delegate.setValue(Boolean.TRUE);
                            anonymousClass2.$forceFlipEnabled$delegate.setValue(Boolean.FALSE);
                            cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState6.getValue()).cardInteraction;
                            if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null) {
                            }
                            JobKt.launch$default(coroutineScope, null, null, new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState6, mutableState4, (Continuation) null, 7), 3);
                            if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Expired)) {
                            }
                            break;
                        case 4:
                            SafeTrace.throwOnFailure(obj);
                            float[] fArr8 = Hero3DCardViewKt.X_AXIS;
                            Quat quat = (Quat) mutableState8.getValue();
                            float[] fArr9 = Hero3DCardViewKt.Z_AXIS;
                            coroutineScope = coroutineScope3;
                            SlerpAnimator slerpAnimator3 = new SlerpAnimator(quat, new Quat((float) Math.toRadians(90.0d), fArr9).times((Quat) mutableState8.getValue()), new Quat((float) Math.toRadians(180.0d), fArr9).times((Quat) mutableState8.getValue()), new Quat((float) Math.toRadians(270.0d), fArr9).times((Quat) mutableState8.getValue()), new Quat((float) Math.toRadians(360.0d), fArr9).times((Quat) mutableState8.getValue()));
                            slerpAnimator3.setInterpolator(new LinearInterpolator());
                            Continuation continuation = null;
                            JobKt.launch$default(coroutineScope, null, null, new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState6, mutableState4, continuation, 6), 3);
                            FlowKt__MergeKt$flatMapMerge$$inlined$map$1 animatedFlow2 = FlowsKt.animatedFlow(mutableState7, j2, 2000L);
                            Hero3DCardViewKt$InteractiveCard$9$1$3.AnonymousClass2.AnonymousClass7.AnonymousClass1 anonymousClass12 = new Hero3DCardViewKt$InteractiveCard$9$1$3.AnonymousClass2.AnonymousClass7.AnonymousClass1(slerpAnimator3, mutableState8, continuation, 4);
                            anonymousClass2 = this;
                            cardAnimation = cardAnimation2;
                            anonymousClass2.L$0 = cardAnimation;
                            anonymousClass2.L$1 = null;
                            anonymousClass2.label = 5;
                            break;
                        case 5:
                        case 6:
                        case 8:
                            SafeTrace.throwOnFailure(obj);
                            anonymousClass2 = this;
                            cardAnimation = cardAnimation2;
                            coroutineScope = coroutineScope3;
                            float[] fArr722 = Hero3DCardViewKt.X_AXIS;
                            anonymousClass2.$finishedAnimating$delegate.setValue(Boolean.TRUE);
                            anonymousClass2.$forceFlipEnabled$delegate.setValue(Boolean.FALSE);
                            cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState6.getValue()).cardInteraction;
                            if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null) {
                            }
                            JobKt.launch$default(coroutineScope, null, null, new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState6, mutableState4, (Continuation) null, 7), 3);
                            if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Expired)) {
                            }
                            break;
                        case 7:
                            SlerpAnimator slerpAnimator4 = (SlerpAnimator) this.L$1;
                            SafeTrace.throwOnFailure(obj);
                            anonymousClass2 = this;
                            slerpAnimator = slerpAnimator4;
                            mutableState = mutableState8;
                            cardAnimation = cardAnimation2;
                            coroutineScope = coroutineScope3;
                            j = j2;
                            FlowKt__MergeKt$flatMapMerge$$inlined$map$1 animatedFlow3 = FlowsKt.animatedFlow(mutableState7, j, 500L);
                            Hero3DCardViewKt$InteractiveCard$9$1$3.AnonymousClass2.AnonymousClass7.AnonymousClass1 anonymousClass13 = new Hero3DCardViewKt$InteractiveCard$9$1$3.AnonymousClass2.AnonymousClass7.AnonymousClass1(slerpAnimator, mutableState, null, 6);
                            anonymousClass2.L$0 = cardAnimation;
                            anonymousClass2.L$1 = null;
                            anonymousClass2.label = 8;
                            break;
                        case 9:
                            SafeTrace.throwOnFailure(obj);
                            anonymousClass2 = this;
                            cardAnimation = cardAnimation2;
                            coroutineScope = coroutineScope3;
                            float[] fArr10 = Hero3DCardViewKt.X_AXIS;
                            interactiveCardState = (InteractiveCardState) mutableState5.getValue();
                            MutableState mutableState9 = anonymousClass2.$cardEnabled$delegate;
                            MutableState mutableState10 = anonymousClass2.$showContouredText$delegate;
                            HeroCardViewKt$Render$1$4$1.AnonymousClass2 anonymousClass22 = new HeroCardViewKt$Render$1$4$1.AnonymousClass2(interactiveCardState, mutableState9, mutableState10, (Continuation) null);
                            anonymousClass2.L$0 = cardAnimation;
                            anonymousClass2.L$1 = mutableState9;
                            anonymousClass2.L$2 = mutableState10;
                            mutableState2 = anonymousClass2.$view$delegate;
                            anonymousClass2.L$3 = mutableState2;
                            anonymousClass2.L$4 = interactiveCardState;
                            anonymousClass2.I$0 = 0;
                            anonymousClass2.label = 10;
                            if (JobKt.coroutineScope(anonymousClass22, anonymousClass2) != coroutineSingletons) {
                                obj2 = mutableState9;
                                mutableState3 = mutableState10;
                                i2 = 0;
                                WithdrawViewKt$WithdrawAmountView$1$1 withdrawViewKt$WithdrawAmountView$1$1 = new WithdrawViewKt$WithdrawAmountView$1$1(interactiveCardState, obj2, mutableState3, mutableState2, null, 3);
                                anonymousClass2.L$0 = cardAnimation;
                                anonymousClass2.L$1 = null;
                                anonymousClass2.L$2 = null;
                                anonymousClass2.L$3 = null;
                                anonymousClass2.L$4 = null;
                                anonymousClass2.I$0 = i2;
                                anonymousClass2.label = 11;
                                coroutineScope2 = JobKt.coroutineScope(withdrawViewKt$WithdrawAmountView$1$1, anonymousClass2);
                                break;
                            }
                            return coroutineSingletons;
                        case 10:
                            int i4 = this.I$0;
                            interactiveCardState = this.L$4;
                            mutableState2 = this.L$3;
                            MutableState mutableState11 = this.L$2;
                            Object obj3 = (State) this.L$1;
                            SafeTrace.throwOnFailure(obj);
                            anonymousClass2 = this;
                            i2 = i4;
                            mutableState3 = mutableState11;
                            obj2 = obj3;
                            cardAnimation = cardAnimation2;
                            coroutineScope = coroutineScope3;
                            WithdrawViewKt$WithdrawAmountView$1$1 withdrawViewKt$WithdrawAmountView$1$12 = new WithdrawViewKt$WithdrawAmountView$1$1(interactiveCardState, obj2, mutableState3, mutableState2, null, 3);
                            anonymousClass2.L$0 = cardAnimation;
                            anonymousClass2.L$1 = null;
                            anonymousClass2.L$2 = null;
                            anonymousClass2.L$3 = null;
                            anonymousClass2.L$4 = null;
                            anonymousClass2.I$0 = i2;
                            anonymousClass2.label = 11;
                            coroutineScope2 = JobKt.coroutineScope(withdrawViewKt$WithdrawAmountView$1$12, anonymousClass2);
                            break;
                        case 11:
                            SafeTrace.throwOnFailure(obj);
                            anonymousClass2 = this;
                            cardAnimation = cardAnimation2;
                            coroutineScope = coroutineScope3;
                            coroutineScope2 = obj;
                            float[] fArr7222 = Hero3DCardViewKt.X_AXIS;
                            anonymousClass2.$finishedAnimating$delegate.setValue(Boolean.TRUE);
                            anonymousClass2.$forceFlipEnabled$delegate.setValue(Boolean.FALSE);
                            cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 = ((CardSchemeViewModel.Module.HeroCardDetails) mutableState6.getValue()).cardInteraction;
                            if (cardSchemePresenter$toHeroModule$cardDetails$2$1$1$1 != null) {
                            }
                            JobKt.launch$default(coroutineScope, null, null, new ScoreSummaryKt$ScoreSummary$1$3$1(mutableState6, mutableState4, (Continuation) null, 7), 3);
                            if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Expired)) {
                            }
                            break;
                        case 12:
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        default:
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(long j, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, CardModelView cardModelView, Quat quat, Quat quat2, Continuation continuation, CoroutineScope coroutineScope, MutableSharedFlow mutableSharedFlow, boolean z) {
                super(2, continuation);
                this.$cardDetails$delegate = mutableState;
                this.$cardModelView = cardModelView;
                this.$active = mutableState2;
                this.$refreshMs = j;
                this.$$this$LaunchedEffect = coroutineScope;
                this.$forwardResting = quat;
                this.$animationState$delegate = mutableState3;
                this.$activeHeroDetails$delegate = mutableState4;
                this.$cardRotation$delegate = mutableState5;
                this.$cardEnabled$delegate = mutableState6;
                this.$showContouredText$delegate = mutableState7;
                this.$view$delegate = mutableState8;
                this.$finishedAnimating$delegate = mutableState9;
                this.$forceFlipEnabled$delegate = mutableState10;
                this.$dragOffsets = mutableSharedFlow;
                this.$showCardHome = z;
                this.$backwardResting = quat2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                boolean z = this.$showCardHome;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$refreshMs, this.$cardDetails$delegate, this.$active, this.$animationState$delegate, this.$activeHeroDetails$delegate, this.$cardRotation$delegate, this.$cardEnabled$delegate, this.$showContouredText$delegate, this.$view$delegate, this.$finishedAnimating$delegate, this.$forceFlipEnabled$delegate, this.$cardModelView, this.$forwardResting, this.$backwardResting, continuation, this.$$this$LaunchedEffect, this.$dragOffsets, z);
                anonymousClass5.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass5;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.getClass();
                return ((AnonymousClass5) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!z) {
                        return Unit.INSTANCE;
                    }
                    MutableState mutableState = this.$cardDetails$delegate;
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(2, mutableState)), 24));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$refreshMs, this.$active, mutableState, this.$animationState$delegate, this.$activeHeroDetails$delegate, this.$cardRotation$delegate, this.$cardEnabled$delegate, this.$showContouredText$delegate, this.$view$delegate, this.$finishedAnimating$delegate, this.$forceFlipEnabled$delegate, this.$cardModelView, this.$forwardResting, this.$backwardResting, null, this.$$this$LaunchedEffect, this.$dragOffsets, this.$showCardHome);
                    this.Z$0 = z;
                    this.label = 1;
                    if (FlowKt.collectLatest(distinctUntilChanged, anonymousClass2, this) == coroutineSingletons) {
                        return coroutineSingletons;
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
        public AnonymousClass4(Quat quat, Quat quat2, boolean z, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, State state, MutableState mutableState5, MutableSharedFlow mutableSharedFlow, MutableState mutableState6, CardWobbleState cardWobbleState, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, Animatable animatable, MutableState mutableState11, long j, MutableState mutableState12, State state2, MutableState mutableState13, Continuation continuation) {
            super(2, continuation);
            this.$forwardResting = quat;
            this.$backwardResting = quat2;
            this.$showCardHome = z;
            this.$cardDetails$delegate = mutableState;
            this.$cardRotation$delegate = mutableState2;
            this.$forceFlipEnabled$delegate = mutableState3;
            this.$activeHeroDetails$delegate = mutableState4;
            this.L$4 = state;
            this.$cardEnabled$delegate = mutableState5;
            this.$dragOffsets = mutableSharedFlow;
            this.$animationsEnabled$delegate = mutableState6;
            this.$cardWobble = cardWobbleState;
            this.$exitTransitionState$delegate = mutableState7;
            this.$parentModel$delegate = mutableState8;
            this.$animationState$delegate = mutableState9;
            this.$showContouredText$delegate = mutableState10;
            this.$$this$LaunchedEffect = animatable;
            this.$animateCardIn$delegate = mutableState11;
            this.$refreshMs = j;
            this.$active = mutableState12;
            this.$finishedAnimating$delegate = state2;
            this.$view$delegate = mutableState13;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.$$this$LaunchedEffect;
            switch (i) {
                case 0:
                    MutableState mutableState = (MutableState) this.$finishedAnimating$delegate;
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$forwardResting, this.$backwardResting, this.$showCardHome, (CoroutineScope) obj2, this.$cardDetails$delegate, this.$cardRotation$delegate, this.$forceFlipEnabled$delegate, this.$activeHeroDetails$delegate, this.$cardEnabled$delegate, this.$animationsEnabled$delegate, this.$dragOffsets, this.$exitTransitionState$delegate, this.$cardWobble, this.$parentModel$delegate, this.$animationState$delegate, this.$showContouredText$delegate, this.$animateCardIn$delegate, this.$active, this.$refreshMs, this.$view$delegate, mutableState, continuation);
                    anonymousClass4.L$0 = obj;
                    return anonymousClass4;
                default:
                    AnonymousClass4 anonymousClass42 = new AnonymousClass4(this.$forwardResting, this.$backwardResting, this.$showCardHome, this.$cardDetails$delegate, this.$cardRotation$delegate, this.$forceFlipEnabled$delegate, this.$activeHeroDetails$delegate, (State) this.L$4, this.$cardEnabled$delegate, this.$dragOffsets, this.$animationsEnabled$delegate, this.$cardWobble, this.$exitTransitionState$delegate, this.$parentModel$delegate, this.$animationState$delegate, this.$showContouredText$delegate, (Animatable) obj2, this.$animateCardIn$delegate, this.$refreshMs, this.$active, this.$finishedAnimating$delegate, this.$view$delegate, continuation);
                    anonymousClass42.L$0 = obj;
                    return anonymousClass42;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((AnonymousClass4) create((CardModelView) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                default:
                    return ((AnonymousClass4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0309, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r3, r7, r34) == r2) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x026c, code lost:
        
            if (((kotlinx.coroutines.Job) r3) == null) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x02a6, code lost:
        
            if (kotlinx.coroutines.JobKt.coroutineScope(new com.squareup.cash.wallet.views.InteractiveCardState$animateCardTranslation$2(false, r7, r8, r9, true, null), r34) == r2) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0266, code lost:
        
            if (r3 == r2) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0132, code lost:
        
            if (r3 == r2) goto L88;
         */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0207  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0249  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x026f  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0232  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z;
            Object first;
            Ref$BooleanRef ref$BooleanRef;
            MutableState mutableState;
            Object obj2;
            MutableState mutableState2;
            MutableState mutableState3;
            MutableState mutableState4;
            CardSchemeViewModel.Module.HeroCardDetails copy$default;
            MutableState mutableState5;
            Ref$ObjectRef ref$ObjectRef;
            MutableState mutableState6;
            MutableState mutableState7;
            int i;
            MutableState mutableState8;
            CardModelView cardModelView;
            Ref$ObjectRef ref$ObjectRef2;
            Object coroutineScope;
            CancellationException cancellationException;
            StandaloneCoroutine standaloneCoroutine;
            int i2 = this.$r8$classId;
            Object obj3 = this.$$this$LaunchedEffect;
            switch (i2) {
                case 0:
                    CardModelView cardModelView2 = (CardModelView) this.L$0;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    MutableState mutableState9 = this.$showContouredText$delegate;
                    MutableState mutableState10 = this.$cardEnabled$delegate;
                    MutableState mutableState11 = this.$activeHeroDetails$delegate;
                    MutableState mutableState12 = this.$animationState$delegate;
                    MutableState mutableState13 = this.$parentModel$delegate;
                    MutableState mutableState14 = this.$cardRotation$delegate;
                    MutableState mutableState15 = this.$cardDetails$delegate;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(28, mutableState15)), 24);
                        this.L$0 = cardModelView2;
                        z = true;
                        this.label = 1;
                        first = FlowKt.first(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, this);
                        break;
                    } else if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        first = obj;
                        z = true;
                    } else if (i3 == 2) {
                        Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.L$4;
                        ref$BooleanRef = (Ref$BooleanRef) this.L$2;
                        SafeTrace.throwOnFailure(obj);
                        mutableState = mutableState9;
                        obj2 = obj3;
                        mutableState2 = mutableState12;
                        mutableState6 = mutableState13;
                        mutableState7 = mutableState14;
                        mutableState8 = mutableState15;
                        ref$ObjectRef2 = ref$ObjectRef3;
                        coroutineScope = obj;
                        mutableState5 = mutableState11;
                        break;
                    } else if (i3 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        mutableState = mutableState9;
                        obj2 = obj3;
                        mutableState5 = mutableState11;
                        mutableState2 = mutableState12;
                        mutableState6 = mutableState13;
                        mutableState8 = mutableState15;
                        float[] fArr = Hero3DCardViewKt.X_AXIS;
                        mutableState6.setValue(null);
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(29, this.$animateCardIn$delegate));
                        MutableState mutableState16 = mutableState8;
                        MutableState mutableState17 = mutableState5;
                        MutableState mutableState18 = mutableState2;
                        MutableState mutableState19 = mutableState;
                        AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$refreshMs, mutableState16, this.$active, mutableState18, mutableState17, this.$cardRotation$delegate, mutableState10, mutableState19, this.$view$delegate, (MutableState) this.$finishedAnimating$delegate, this.$forceFlipEnabled$delegate, cardModelView2, this.$forwardResting, this.$backwardResting, null, (CoroutineScope) obj2, this.$dragOffsets, this.$showCardHome);
                        this.L$0 = null;
                        this.L$2 = null;
                        this.L$4 = null;
                        this.label = 4;
                        break;
                    } else if (i3 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    }
                    CardSchemeViewModel.Module.CardAnimation cardAnimation = (CardSchemeViewModel.Module.CardAnimation) first;
                    ref$BooleanRef = new Ref$BooleanRef();
                    ref$BooleanRef.element = z;
                    Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                    float[] fArr2 = Hero3DCardViewKt.X_AXIS;
                    ref$ObjectRef4.element = (Quat) mutableState14.getValue();
                    boolean z2 = cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.None;
                    MutableState mutableState20 = this.$forceFlipEnabled$delegate;
                    Quat quat = this.$backwardResting;
                    mutableState = mutableState9;
                    Quat quat2 = this.$forwardResting;
                    if (!z2) {
                        obj2 = obj3;
                        if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Updated)) {
                            mutableState2 = mutableState12;
                            mutableState3 = mutableState13;
                            mutableState4 = mutableState14;
                            if (!Intrinsics.areEqual(cardAnimation, CardSchemeViewModel.Module.CardAnimation.Expired.INSTANCE)) {
                                if (!Intrinsics.areEqual(cardAnimation, CardSchemeViewModel.Module.CardAnimation.SpinToFront.INSTANCE)) {
                                    if (!(cardAnimation instanceof CardSchemeViewModel.Module.CardAnimation.Copy)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        ref$ObjectRef4.element = quat;
                                    }
                                }
                            } else {
                                ref$ObjectRef4.element = quat2;
                            }
                        } else {
                            CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = (CardSchemeViewModel.Module.HeroCardDetails) mutableState15.getValue();
                            CardSchemeViewModel.Module.CardAnimation.Updated updated = (CardSchemeViewModel.Module.CardAnimation.Updated) cardAnimation;
                            mutableState2 = mutableState12;
                            boolean z3 = updated.previouslyEnabled;
                            mutableState3 = mutableState13;
                            mutableState4 = mutableState14;
                            copy$default = CardSchemeViewModel.Module.HeroCardDetails.copy$default(heroCardDetails, updated.cardTheme, updated.customizationImage, z3);
                            if (updated.previouslyFacingForward) {
                                quat = quat2;
                            }
                            ref$ObjectRef4.element = quat;
                            mutableState20.setValue(Boolean.valueOf((z3 && ((CardSchemeViewModel.Module.HeroCardDetails) mutableState15.getValue()).isEnabled) ? false : true));
                            ref$BooleanRef.element = z3;
                            if (copy$default == null) {
                                copy$default = (CardSchemeViewModel.Module.HeroCardDetails) mutableState15.getValue();
                            }
                            mutableState11.setValue(copy$default);
                            if (this.$showCardHome) {
                                mutableState5 = mutableState11;
                                ref$ObjectRef = ref$ObjectRef4;
                                mutableState10 = mutableState10;
                                mutableState6 = mutableState3;
                                mutableState7 = mutableState4;
                                i = 2;
                                mutableState8 = mutableState15;
                            } else {
                                ref$ObjectRef = ref$ObjectRef4;
                                mutableState5 = mutableState11;
                                mutableState6 = mutableState3;
                                mutableState7 = mutableState4;
                                mutableState8 = mutableState15;
                                i = 2;
                                HeroCardViewKt$Render$1$4$1 heroCardViewKt$Render$1$4$1 = new HeroCardViewKt$Render$1$4$1(cardAnimation, mutableState10, this.$animationsEnabled$delegate, this.$dragOffsets, this.$exitTransitionState$delegate, this.$cardWobble, this.$cardRotation$delegate, (Continuation) null);
                                mutableState10 = mutableState10;
                                JobKt.launch$default((CoroutineScope) obj2, null, null, heroCardViewKt$Render$1$4$1, 3);
                            }
                            cardModelView = (CardModelView) mutableState6.getValue();
                            if (cardModelView != null) {
                                ref$ObjectRef2 = ref$ObjectRef;
                                Quat quat3 = (Quat) ref$ObjectRef2.element;
                                float[] fArr3 = Hero3DCardViewKt.X_AXIS;
                                mutableState7.setValue(quat3);
                                InteractiveCardState interactiveCardState = (InteractiveCardState) mutableState2.getValue();
                                boolean z4 = ref$BooleanRef.element;
                                boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                                this.L$0 = cardModelView2;
                                this.L$2 = null;
                                this.L$4 = null;
                                this.label = 3;
                                interactiveCardState.getClass();
                                break;
                            } else {
                                NavHostKt$NavHost$33$1 navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(cardModelView, this.$cardRotation$delegate, ref$ObjectRef, mutableState2, mutableState8, (Continuation) null, 23);
                                ref$ObjectRef2 = ref$ObjectRef;
                                this.L$0 = cardModelView2;
                                this.L$2 = ref$BooleanRef;
                                this.L$4 = ref$ObjectRef2;
                                this.label = i;
                                coroutineScope = JobKt.coroutineScope(navHostKt$NavHost$33$1, this);
                                break;
                            }
                        }
                    } else {
                        CardSchemeViewModel.Module.CardAnimation.None none = (CardSchemeViewModel.Module.CardAnimation.None) cardAnimation;
                        obj2 = obj3;
                        boolean z5 = none.previouslyEnabled;
                        if (none.previouslyFacingForward) {
                            quat = quat2;
                        }
                        ref$ObjectRef4.element = quat;
                        mutableState20.setValue(Boolean.valueOf((z5 && ((CardSchemeViewModel.Module.HeroCardDetails) mutableState15.getValue()).isEnabled) ? false : true));
                        ref$BooleanRef.element = z5;
                        mutableState2 = mutableState12;
                        mutableState3 = mutableState13;
                        mutableState4 = mutableState14;
                    }
                    copy$default = null;
                    if (copy$default == null) {
                    }
                    mutableState11.setValue(copy$default);
                    if (this.$showCardHome) {
                    }
                    cardModelView = (CardModelView) mutableState6.getValue();
                    if (cardModelView != null) {
                    }
                    break;
                default:
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        State state = (State) this.L$4;
                        Animatable animatable = (Animatable) obj3;
                        MutableState mutableState21 = this.$view$delegate;
                        Quat quat4 = this.$forwardResting;
                        Quat quat5 = this.$backwardResting;
                        boolean z6 = this.$showCardHome;
                        MutableState mutableState22 = this.$cardDetails$delegate;
                        MutableState mutableState23 = this.$cardRotation$delegate;
                        MutableState mutableState24 = this.$forceFlipEnabled$delegate;
                        MutableState mutableState25 = this.$activeHeroDetails$delegate;
                        MutableState mutableState26 = this.$cardEnabled$delegate;
                        MutableSharedFlow mutableSharedFlow = this.$dragOffsets;
                        MutableState mutableState27 = this.$animationsEnabled$delegate;
                        CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1 coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1 = new CoreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1(quat4, quat5, z6, mutableState22, mutableState23, mutableState24, mutableState25, state, mutableState26, mutableSharedFlow, mutableState27, this.$cardWobble, this.$exitTransitionState$delegate, this.$parentModel$delegate, this.$animationState$delegate, this.$showContouredText$delegate, animatable, this.$animateCardIn$delegate, this.$refreshMs, this.$active, this.$finishedAnimating$delegate, mutableState21, null);
                        cancellationException = null;
                        StandaloneCoroutine launch$default = JobKt.launch$default(coroutineScope2, null, null, coreInteractiveCardKt$InteractiveCardEffect$15$1$introJob$1, 3);
                        SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$1 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new CardAppletTileKt$$ExternalSyntheticLambda9(8, mutableState27)), 24);
                        this.L$0 = null;
                        this.L$2 = launch$default;
                        this.label = 1;
                        if (FlowKt.first(swipeableState$special$$inlined$filter$1, this) == coroutineSingletons2) {
                            break;
                        } else {
                            standaloneCoroutine = launch$default;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        standaloneCoroutine = (StandaloneCoroutine) this.L$2;
                        SafeTrace.throwOnFailure(obj);
                        cancellationException = null;
                    }
                    standaloneCoroutine.cancel(cancellationException);
                    break;
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Quat quat, Quat quat2, boolean z, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableSharedFlow mutableSharedFlow, MutableState mutableState7, CardWobbleState cardWobbleState, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, long j, MutableState mutableState13, MutableState mutableState14, Continuation continuation) {
            super(2, continuation);
            this.$forwardResting = quat;
            this.$backwardResting = quat2;
            this.$showCardHome = z;
            this.$$this$LaunchedEffect = coroutineScope;
            this.$cardDetails$delegate = mutableState;
            this.$cardRotation$delegate = mutableState2;
            this.$forceFlipEnabled$delegate = mutableState3;
            this.$activeHeroDetails$delegate = mutableState4;
            this.$cardEnabled$delegate = mutableState5;
            this.$animationsEnabled$delegate = mutableState6;
            this.$dragOffsets = mutableSharedFlow;
            this.$exitTransitionState$delegate = mutableState7;
            this.$cardWobble = cardWobbleState;
            this.$parentModel$delegate = mutableState8;
            this.$animationState$delegate = mutableState9;
            this.$showContouredText$delegate = mutableState10;
            this.$animateCardIn$delegate = mutableState11;
            this.$active = mutableState12;
            this.$refreshMs = j;
            this.$view$delegate = mutableState13;
            this.$finishedAnimating$delegate = mutableState14;
        }
    }
}
