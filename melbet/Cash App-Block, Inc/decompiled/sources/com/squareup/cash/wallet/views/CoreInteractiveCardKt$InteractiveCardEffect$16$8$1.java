package com.squareup.cash.wallet.views;

import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1;
import app.cash.local.presenters.brand.profile.LocalBrandProfilePresenter$$ExternalSyntheticLambda21;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter$models$15$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CoreInteractiveCardKt$InteractiveCardEffect$16$8$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $animationState$delegate;
    public final /* synthetic */ State $cardEnabled$delegate;
    public final /* synthetic */ MutableState $parentSharedState$delegate;
    public final /* synthetic */ int $r8$classId = 1;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInteractiveCardKt$InteractiveCardEffect$16$8$1(MutableState mutableState, MutableState mutableState2, State state, Continuation continuation) {
        super(2, continuation);
        this.$parentSharedState$delegate = mutableState;
        this.$animationState$delegate = mutableState2;
        this.$cardEnabled$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        State state = this.$cardEnabled$delegate;
        MutableState mutableState = this.$animationState$delegate;
        MutableState mutableState2 = this.$parentSharedState$delegate;
        switch (i) {
            case 0:
                CoreInteractiveCardKt$InteractiveCardEffect$16$8$1 coreInteractiveCardKt$InteractiveCardEffect$16$8$1 = new CoreInteractiveCardKt$InteractiveCardEffect$16$8$1(state, mutableState2, mutableState, continuation);
                coreInteractiveCardKt$InteractiveCardEffect$16$8$1.L$0 = obj;
                return coreInteractiveCardKt$InteractiveCardEffect$16$8$1;
            default:
                CoreInteractiveCardKt$InteractiveCardEffect$16$8$1 coreInteractiveCardKt$InteractiveCardEffect$16$8$12 = new CoreInteractiveCardKt$InteractiveCardEffect$16$8$1(mutableState2, mutableState, state, continuation);
                coreInteractiveCardKt$InteractiveCardEffect$16$8$12.L$0 = obj;
                return coreInteractiveCardKt$InteractiveCardEffect$16$8$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((CoreInteractiveCardKt$InteractiveCardEffect$16$8$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((CoreInteractiveCardKt$InteractiveCardEffect$16$8$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        State state = this.$cardEnabled$delegate;
        MutableState mutableState = this.$animationState$delegate;
        MutableState mutableState2 = this.$parentSharedState$delegate;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$1 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new HeroCardViewKt$$ExternalSyntheticLambda2(state, mutableState2, 4)), 26);
                    ShoppingWebPresenter$models$15$1 shoppingWebPresenter$models$15$1 = new ShoppingWebPresenter$models$15$1(coroutineScope, mutableState, continuation, i2);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(swipeableState$special$$inlined$filter$1, shoppingWebPresenter$models$15$1, this) == coroutineSingletons) {
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
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(Updater.snapshotFlow(new LocalBrandProfilePresenter$$ExternalSyntheticLambda21(mutableState2, mutableState, state, i2)));
                    NavHostKt$NavHost$29$1$1$1 navHostKt$NavHost$29$1$1$1 = new NavHostKt$NavHost$29$1$1$1(produceStateScope, mutableState2, continuation, 3);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(distinctUntilChanged, navHostKt$NavHost$29$1$1$1, this) == coroutineSingletons2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInteractiveCardKt$InteractiveCardEffect$16$8$1(State state, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$cardEnabled$delegate = state;
        this.$parentSharedState$delegate = mutableState;
        this.$animationState$delegate = mutableState2;
    }
}
