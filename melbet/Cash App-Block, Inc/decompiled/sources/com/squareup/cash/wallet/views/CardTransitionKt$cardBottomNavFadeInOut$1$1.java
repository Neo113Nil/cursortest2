package com.squareup.cash.wallet.views;

import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.compose.MotionKt$produceAnimationsEnabled$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CardTransitionKt$cardBottomNavFadeInOut$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $cardState$delegate;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardRegistry$CardTransition$TransitionType.values().length];
            try {
                CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType = CardRegistry$CardTransition$TransitionType.SOURCE;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardTransitionKt$cardBottomNavFadeInOut$1$1(MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$cardState$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$cardState$delegate;
        switch (i) {
            case 0:
                CardTransitionKt$cardBottomNavFadeInOut$1$1 cardTransitionKt$cardBottomNavFadeInOut$1$1 = new CardTransitionKt$cardBottomNavFadeInOut$1$1(mutableState, continuation, 0);
                cardTransitionKt$cardBottomNavFadeInOut$1$1.L$0 = obj;
                return cardTransitionKt$cardBottomNavFadeInOut$1$1;
            case 1:
                CardTransitionKt$cardBottomNavFadeInOut$1$1 cardTransitionKt$cardBottomNavFadeInOut$1$12 = new CardTransitionKt$cardBottomNavFadeInOut$1$1(mutableState, continuation, 1);
                cardTransitionKt$cardBottomNavFadeInOut$1$12.L$0 = obj;
                return cardTransitionKt$cardBottomNavFadeInOut$1$12;
            default:
                CardTransitionKt$cardBottomNavFadeInOut$1$1 cardTransitionKt$cardBottomNavFadeInOut$1$13 = new CardTransitionKt$cardBottomNavFadeInOut$1$1(mutableState, continuation, 2);
                cardTransitionKt$cardBottomNavFadeInOut$1$13.L$0 = obj;
                return cardTransitionKt$cardBottomNavFadeInOut$1$13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProduceStateScope produceStateScope = (ProduceStateScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardTransitionKt$cardBottomNavFadeInOut$1$1) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$cardState$delegate;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardAppletTile$$ExternalSyntheticLambda0 cardAppletTile$$ExternalSyntheticLambda0 = new CardAppletTile$$ExternalSyntheticLambda0(13);
                    this.L$0 = produceStateScope;
                    this.label = 1;
                    if (Updater.getMonotonicFrameClock(getContext()).withFrameNanos(this, cardAppletTile$$ExternalSyntheticLambda0) == coroutineSingletons) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CardTransitionKt.LocalCardRegistry;
                CardRegistry$CardTransition$TransitionType cardRegistry$CardTransition$TransitionType = (CardRegistry$CardTransition$TransitionType) mutableState.getValue();
                produceStateScope.setValue(new Float((cardRegistry$CardTransition$TransitionType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[cardRegistry$CardTransition$TransitionType.ordinal()]) == 1 ? RecyclerView.DECELERATION_RATE : 1.0f));
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new TooltipKt$$ExternalSyntheticLambda1(i2, mutableState));
                    MotionKt$produceAnimationsEnabled$1$1 motionKt$produceAnimationsEnabled$1$1 = new MotionKt$produceAnimationsEnabled$1$1(produceStateScope2, continuation, i2);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow, motionKt$produceAnimationsEnabled$1$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                ProduceStateScope produceStateScope3 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1 = new HeroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda15(14, mutableState)), 11);
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    Flow flowOn = FlowKt.flowOn(heroCardViewKt$Render$1$8$1$invokeSuspend$$inlined$filter$1, DefaultIoScheduler.INSTANCE);
                    Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3 hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3 = new Hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3(produceStateScope3, null, 1);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(flowOn, hero3DCardViewKt$InteractiveCard$eyeIcon$2$1$3, this) == coroutineSingletons3) {
                        break;
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
