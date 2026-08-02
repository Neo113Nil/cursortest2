package com.squareup.cash.wallet.views;

import android.app.ActivityManager;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.components.ToastKt$Toast$8$1;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda0;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3$1$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ActivityManager $activityManager;
    public final /* synthetic */ MutableState $animateCardIn$delegate;
    public final /* synthetic */ MutableState $backwardResting$delegate;
    public final /* synthetic */ CardNuxState $cardNuxState;
    public final /* synthetic */ CardRegistry $cardRegistry;
    public final /* synthetic */ MutableState $cardRotation$delegate;
    public final /* synthetic */ MutableState $currentRevolvingCards$delegate;
    public final /* synthetic */ MutableSharedFlow $dragOffsets;
    public final /* synthetic */ MutableState $forwardResting$delegate;
    public final /* synthetic */ MutableState $lifecycleActive;
    public final /* synthetic */ State $nuxAnimation$delegate;
    public final /* synthetic */ long $refreshMs;
    public final /* synthetic */ MutableState $targetView$delegate;
    public final /* synthetic */ boolean $withIntroSpin;
    public /* synthetic */ Object L$0;
    public int label;

    /* renamed from: com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3$1$3$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ CoroutineScope $$this$withContext;
        public final /* synthetic */ ActivityManager $activityManager;
        public final /* synthetic */ MutableState $backwardResting$delegate;
        public final /* synthetic */ CardNuxState $cardNuxState;
        public final /* synthetic */ CardRegistry $cardRegistry;
        public final /* synthetic */ MutableState $cardRotation$delegate;
        public final /* synthetic */ MutableState $currentRevolvingCards$delegate;
        public final /* synthetic */ MutableSharedFlow $dragOffsets;
        public final /* synthetic */ MutableState $forwardResting$delegate;
        public final /* synthetic */ MutableState $lifecycleActive;
        public final /* synthetic */ State $nuxAnimation$delegate;
        public final /* synthetic */ long $refreshMs;
        public final /* synthetic */ MutableState $targetView$delegate;
        public final /* synthetic */ boolean $withIntroSpin;
        public /* synthetic */ boolean Z$0;
        public int label;

        /* renamed from: com.squareup.cash.wallet.views.RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3$1$3$2$4, reason: invalid class name */
        public final class AnonymousClass4 extends SuspendLambda implements Function2 {
            public final /* synthetic */ MutableState $cardRotation$delegate;
            public final /* synthetic */ int $r8$classId;
            public /* synthetic */ Object L$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass4(MutableState mutableState, Continuation continuation, int i) {
                super(2, continuation);
                this.$r8$classId = i;
                this.$cardRotation$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                switch (this.$r8$classId) {
                    case 0:
                        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$cardRotation$delegate, continuation, 0);
                        anonymousClass4.L$0 = obj;
                        return anonymousClass4;
                    default:
                        AnonymousClass4 anonymousClass42 = new AnonymousClass4(this.$cardRotation$delegate, continuation, 1);
                        anonymousClass42.L$0 = obj;
                        return anonymousClass42;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Quat quat = (Quat) obj;
                Continuation continuation = (Continuation) obj2;
                switch (this.$r8$classId) {
                }
                return ((AnonymousClass4) create(quat, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.$r8$classId;
                MutableState mutableState = this.$cardRotation$delegate;
                Quat quat = (Quat) this.L$0;
                switch (i) {
                    case 0:
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        mutableState.setValue(quat);
                        break;
                    default:
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        SafeTrace.throwOnFailure(obj);
                        mutableState.setValue(quat);
                        break;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CoroutineScope coroutineScope, boolean z, MutableSharedFlow mutableSharedFlow, MutableState mutableState, MutableState mutableState2, long j, MutableState mutableState3, State state, MutableState mutableState4, CardNuxState cardNuxState, ActivityManager activityManager, CardRegistry cardRegistry, MutableState mutableState5, MutableState mutableState6, Continuation continuation) {
            super(2, continuation);
            this.$$this$withContext = coroutineScope;
            this.$withIntroSpin = z;
            this.$dragOffsets = mutableSharedFlow;
            this.$targetView$delegate = mutableState;
            this.$lifecycleActive = mutableState2;
            this.$refreshMs = j;
            this.$cardRotation$delegate = mutableState3;
            this.$nuxAnimation$delegate = state;
            this.$currentRevolvingCards$delegate = mutableState4;
            this.$cardNuxState = cardNuxState;
            this.$activityManager = activityManager;
            this.$cardRegistry = cardRegistry;
            this.$forwardResting$delegate = mutableState5;
            this.$backwardResting$delegate = mutableState6;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$$this$withContext, this.$withIntroSpin, this.$dragOffsets, this.$targetView$delegate, this.$lifecycleActive, this.$refreshMs, this.$cardRotation$delegate, this.$nuxAnimation$delegate, this.$currentRevolvingCards$delegate, this.$cardNuxState, this.$activityManager, this.$cardRegistry, this.$forwardResting$delegate, this.$backwardResting$delegate, continuation);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((AnonymousClass2) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0123, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r4, r5, r26) != r2) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0125, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r7, r8, r26) == r2) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
        
            if (com.squareup.cash.wallet.views.Hero3DCardViewKt.fadeIn(r3, r26.$lifecycleActive, r26.$refreshMs, r26) == r2) goto L28;
         */
        /* JADX WARN: Type inference failed for: r15v2, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r15v5 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            MutableState mutableState;
            int i;
            ?? r15;
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.label;
            int i3 = 0;
            CoroutineScope coroutineScope = this.$$this$withContext;
            MutableState mutableState2 = this.$targetView$delegate;
            MutableState mutableState3 = this.$cardRotation$delegate;
            if (i2 == 0) {
                SafeTrace.throwOnFailure(obj);
                if (!z) {
                    return Unit.INSTANCE;
                }
                CardModelView cardModelView = (CardModelView) mutableState2.getValue();
                if (cardModelView != null) {
                    this.Z$0 = z;
                    this.label = 1;
                }
            } else if (i2 == 1) {
                SafeTrace.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mutableState = mutableState3;
                i = 1;
                r15 = 0;
                JobKt.launch$default(coroutineScope, r15, r15, new WorkflowLayout$start$1(this.$currentRevolvingCards$delegate, this.$lifecycleActive, this.$cardNuxState, this.$activityManager, this.$cardRegistry, null, 15), 3);
                ChannelFlowTransformLatest cardSettleFlow = Hero3DCardViewKt.cardSettleFlow(this.$dragOffsets, new WalletHomeViewKt$$ExternalSyntheticLambda6(2, this.$forwardResting$delegate), new WalletHomeViewKt$$ExternalSyntheticLambda6(3, this.$backwardResting$delegate), new WalletHomeViewKt$$ExternalSyntheticLambda6(4, mutableState), 25.0f, new SpringSpec(0.8f, 25.0f, new Float(0.005f)), new AlertBannerKt$$ExternalSyntheticLambda0(25));
                ChannelFlowTransformLatest rotateDragFlow = Hero3DCardViewKt.rotateDragFlow(new WalletHomeViewKt$$ExternalSyntheticLambda6(5, mutableState), this.$dragOffsets);
                Flow[] flowArr = new Flow[2];
                flowArr[0] = cardSettleFlow;
                flowArr[i] = rotateDragFlow;
                ChannelFlowBuilder merge = FlowKt.merge(flowArr);
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(mutableState, r15, i);
                this.Z$0 = z;
                this.label = 3;
            }
            mutableState = mutableState3;
            i = 1;
            Continuation continuation = null;
            JobKt.launch$default(coroutineScope, null, null, new ToastKt$Toast$8$1(mutableState2, this.$lifecycleActive, this.$refreshMs, (Continuation) null), 3);
            r15 = continuation;
            if (this.$withIntroSpin) {
                Quat quat = (Quat) mutableState.getValue();
                CardAppletTileKt$$ExternalSyntheticLambda1 cardAppletTileKt$$ExternalSyntheticLambda1 = new CardAppletTileKt$$ExternalSyntheticLambda1(this.$nuxAnimation$delegate, 13);
                Quat quat2 = CardNuxAnimationsKt.NUX_CARD_ROTATION;
                quat.getClass();
                SafeFlow safeFlow = new SafeFlow(new TakeUntil$collectSafely$2(quat, cardAppletTileKt$$ExternalSyntheticLambda1, (Continuation) null, 4));
                AnonymousClass4 anonymousClass42 = new AnonymousClass4(mutableState, continuation, i3);
                this.Z$0 = z;
                this.label = 2;
                r15 = continuation;
            }
            JobKt.launch$default(coroutineScope, r15, r15, new WorkflowLayout$start$1(this.$currentRevolvingCards$delegate, this.$lifecycleActive, this.$cardNuxState, this.$activityManager, this.$cardRegistry, null, 15), 3);
            ChannelFlowTransformLatest cardSettleFlow2 = Hero3DCardViewKt.cardSettleFlow(this.$dragOffsets, new WalletHomeViewKt$$ExternalSyntheticLambda6(2, this.$forwardResting$delegate), new WalletHomeViewKt$$ExternalSyntheticLambda6(3, this.$backwardResting$delegate), new WalletHomeViewKt$$ExternalSyntheticLambda6(4, mutableState), 25.0f, new SpringSpec(0.8f, 25.0f, new Float(0.005f)), new AlertBannerKt$$ExternalSyntheticLambda0(25));
            ChannelFlowTransformLatest rotateDragFlow2 = Hero3DCardViewKt.rotateDragFlow(new WalletHomeViewKt$$ExternalSyntheticLambda6(5, mutableState), this.$dragOffsets);
            Flow[] flowArr2 = new Flow[2];
            flowArr2[0] = cardSettleFlow2;
            flowArr2[i] = rotateDragFlow2;
            ChannelFlowBuilder merge2 = FlowKt.merge(flowArr2);
            AnonymousClass4 anonymousClass43 = new AnonymousClass4(mutableState, r15, i);
            this.Z$0 = z;
            this.label = 3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3$1$3(MutableState mutableState, boolean z, MutableSharedFlow mutableSharedFlow, MutableState mutableState2, MutableState mutableState3, long j, MutableState mutableState4, State state, MutableState mutableState5, CardNuxState cardNuxState, ActivityManager activityManager, CardRegistry cardRegistry, MutableState mutableState6, MutableState mutableState7, Continuation continuation) {
        super(2, continuation);
        this.$animateCardIn$delegate = mutableState;
        this.$withIntroSpin = z;
        this.$dragOffsets = mutableSharedFlow;
        this.$targetView$delegate = mutableState2;
        this.$lifecycleActive = mutableState3;
        this.$refreshMs = j;
        this.$cardRotation$delegate = mutableState4;
        this.$nuxAnimation$delegate = state;
        this.$currentRevolvingCards$delegate = mutableState5;
        this.$cardNuxState = cardNuxState;
        this.$activityManager = activityManager;
        this.$cardRegistry = cardRegistry;
        this.$forwardResting$delegate = mutableState6;
        this.$backwardResting$delegate = mutableState7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3$1$3 revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3$1$3 = new RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3$1$3(this.$animateCardIn$delegate, this.$withIntroSpin, this.$dragOffsets, this.$targetView$delegate, this.$lifecycleActive, this.$refreshMs, this.$cardRotation$delegate, this.$nuxAnimation$delegate, this.$currentRevolvingCards$delegate, this.$cardNuxState, this.$activityManager, this.$cardRegistry, this.$forwardResting$delegate, this.$backwardResting$delegate, continuation);
        revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3$1$3.L$0 = obj;
        return revolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3$1$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RevolvingInteractiveCardsKt$RevolvingInteractiveCards$5$3$1$3$1$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            SafeFlow snapshotFlow = Updater.snapshotFlow(new WalletHomeViewKt$$ExternalSyntheticLambda6(1, this.$animateCardIn$delegate));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(coroutineScope, this.$withIntroSpin, this.$dragOffsets, this.$targetView$delegate, this.$lifecycleActive, this.$refreshMs, this.$cardRotation$delegate, this.$nuxAnimation$delegate, this.$currentRevolvingCards$delegate, this.$cardNuxState, this.$activityManager, this.$cardRegistry, this.$forwardResting$delegate, this.$backwardResting$delegate, null);
            this.L$0 = null;
            this.label = 1;
            if (FlowKt.collectLatest(snapshotFlow, anonymousClass2, this) == coroutineSingletons) {
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
