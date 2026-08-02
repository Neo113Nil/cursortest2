package com.squareup.cash.wallet.views;

import androidx.compose.runtime.Updater;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardModelView$colorGradient$2;
import com.squareup.cash.wallet.views.CardRegistry;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class Hero3DCardViewKt$InteractiveCard$6$1$2$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CardRegistry.SharedCardTransitionState $cardState;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardModelView $view;
    public /* synthetic */ Object L$0;

    /* renamed from: com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$6$1$2$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ CardRegistry.SharedCardTransitionState $cardState;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ CardModelView $view;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(CardRegistry.SharedCardTransitionState sharedCardTransitionState, CardModelView cardModelView, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$cardState = sharedCardTransitionState;
            this.$view = cardModelView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    return new AnonymousClass1(this.$cardState, this.$view, continuation, 0);
                case 1:
                    return new AnonymousClass1(this.$cardState, this.$view, continuation, 1);
                case 2:
                    return new AnonymousClass1(this.$cardState, this.$view, continuation, 2);
                default:
                    return new AnonymousClass1(this.$cardState, this.$view, continuation, 3);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.$r8$classId;
            int i2 = 3;
            int i3 = 2;
            CardModelView cardModelView = this.$view;
            CardRegistry.SharedCardTransitionState sharedCardTransitionState = this.$cardState;
            int i4 = 1;
            Continuation continuation = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new CoreInteractiveCardKt$$ExternalSyntheticLambda4(sharedCardTransitionState, 1)), 24);
                        CardModelView$colorGradient$2 cardModelView$colorGradient$2 = new CardModelView$colorGradient$2(i4, cardModelView, continuation);
                        this.label = 1;
                        if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, cardModelView$colorGradient$2, this) == coroutineSingletons) {
                            break;
                        }
                    } else if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$12 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(Updater.snapshotFlow(new CoreInteractiveCardKt$$ExternalSyntheticLambda4(sharedCardTransitionState, 2)), 24);
                        Hero3DCardViewKt$fadeIn$2 hero3DCardViewKt$fadeIn$2 = new Hero3DCardViewKt$fadeIn$2(i3, cardModelView, continuation);
                        this.label = 1;
                        if (FlowKt.collectLatest(realBadger2$setup$lambda$0$$inlined$mapNotNull$12, hero3DCardViewKt$fadeIn$2, this) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new CoreInteractiveCardKt$$ExternalSyntheticLambda4(sharedCardTransitionState, 3));
                        CardModelView$colorGradient$2 cardModelView$colorGradient$22 = new CardModelView$colorGradient$2(i3, cardModelView, continuation);
                        this.label = 1;
                        if (FlowKt.collectLatest(snapshotFlow, cardModelView$colorGradient$22, this) == coroutineSingletons3) {
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
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i8 = this.label;
                    if (i8 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow2 = Updater.snapshotFlow(new CoreInteractiveCardKt$$ExternalSyntheticLambda4(sharedCardTransitionState, 4));
                        Hero3DCardViewKt$fadeIn$2 hero3DCardViewKt$fadeIn$22 = new Hero3DCardViewKt$fadeIn$2(i2, cardModelView, continuation);
                        this.label = 1;
                        if (FlowKt.collectLatest(snapshotFlow2, hero3DCardViewKt$fadeIn$22, this) == coroutineSingletons4) {
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hero3DCardViewKt$InteractiveCard$6$1$2$2$1(CardRegistry.SharedCardTransitionState sharedCardTransitionState, CardModelView cardModelView, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$cardState = sharedCardTransitionState;
        this.$view = cardModelView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                Hero3DCardViewKt$InteractiveCard$6$1$2$2$1 hero3DCardViewKt$InteractiveCard$6$1$2$2$1 = new Hero3DCardViewKt$InteractiveCard$6$1$2$2$1(this.$cardState, this.$view, continuation, 0);
                hero3DCardViewKt$InteractiveCard$6$1$2$2$1.L$0 = obj;
                return hero3DCardViewKt$InteractiveCard$6$1$2$2$1;
            default:
                Hero3DCardViewKt$InteractiveCard$6$1$2$2$1 hero3DCardViewKt$InteractiveCard$6$1$2$2$12 = new Hero3DCardViewKt$InteractiveCard$6$1$2$2$1(this.$cardState, this.$view, continuation, 1);
                hero3DCardViewKt$InteractiveCard$6$1$2$2$12.L$0 = obj;
                return hero3DCardViewKt$InteractiveCard$6$1$2$2$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((Hero3DCardViewKt$InteractiveCard$6$1$2$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardModelView cardModelView = this.$view;
        CardRegistry.SharedCardTransitionState sharedCardTransitionState = this.$cardState;
        Continuation continuation = null;
        int i2 = 3;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedCardTransitionState, cardModelView, continuation, 0), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedCardTransitionState, cardModelView, continuation, 1), 3);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedCardTransitionState, cardModelView, continuation, 2), 3);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(sharedCardTransitionState, cardModelView, continuation, i2), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
