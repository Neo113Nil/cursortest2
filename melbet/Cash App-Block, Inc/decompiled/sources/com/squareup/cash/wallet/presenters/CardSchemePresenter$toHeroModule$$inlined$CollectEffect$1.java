package com.squareup.cash.wallet.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CardSchemePresenter$toHeroModule$$inlined$CollectEffect$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CardSchemePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardSchemePresenter$toHeroModule$$inlined$CollectEffect$1(Flow flow, Continuation continuation, CardSchemePresenter cardSchemePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$flow = flow;
        this.this$0 = cardSchemePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardSchemePresenter cardSchemePresenter = this.this$0;
        Flow flow = this.$flow;
        switch (i) {
            case 0:
                CardSchemePresenter$toHeroModule$$inlined$CollectEffect$1 cardSchemePresenter$toHeroModule$$inlined$CollectEffect$1 = new CardSchemePresenter$toHeroModule$$inlined$CollectEffect$1(flow, continuation, cardSchemePresenter, 0);
                cardSchemePresenter$toHeroModule$$inlined$CollectEffect$1.L$0 = obj;
                return cardSchemePresenter$toHeroModule$$inlined$CollectEffect$1;
            default:
                CardSchemePresenter$toHeroModule$$inlined$CollectEffect$1 cardSchemePresenter$toHeroModule$$inlined$CollectEffect$12 = new CardSchemePresenter$toHeroModule$$inlined$CollectEffect$1(flow, continuation, cardSchemePresenter, 1);
                cardSchemePresenter$toHeroModule$$inlined$CollectEffect$12.L$0 = obj;
                return cardSchemePresenter$toHeroModule$$inlined$CollectEffect$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardSchemePresenter$toHeroModule$$inlined$CollectEffect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardSchemePresenter cardSchemePresenter = this.this$0;
        Flow flow = this.$flow;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    TakeUntil$collectSafely$2.AnonymousClass1 anonymousClass1 = new TakeUntil$collectSafely$2.AnonymousClass1(1, coroutineScope, cardSchemePresenter);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
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
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardSchemePresenter$models$5$1$2 cardSchemePresenter$models$5$1$2 = new CardSchemePresenter$models$5$1$2(coroutineScope2, cardSchemePresenter);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(cardSchemePresenter$models$5$1$2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
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
