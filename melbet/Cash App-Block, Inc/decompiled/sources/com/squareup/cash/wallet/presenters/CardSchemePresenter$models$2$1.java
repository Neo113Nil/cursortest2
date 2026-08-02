package com.squareup.cash.wallet.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.cash.postcard.CardModule;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class CardSchemePresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CardModule.CardElementAction $action;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ CardSchemePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardSchemePresenter$models$2$1(CardSchemePresenter cardSchemePresenter, CardModule.CardElementAction cardElementAction, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = cardSchemePresenter;
        this.$action = cardElementAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardModule.CardElementAction cardElementAction = this.$action;
        CardSchemePresenter cardSchemePresenter = this.this$0;
        switch (i) {
            case 0:
                return new CardSchemePresenter$models$2$1(cardSchemePresenter, cardElementAction, continuation, 0);
            case 1:
                return new CardSchemePresenter$models$2$1(cardSchemePresenter, cardElementAction, continuation, 1);
            default:
                return new CardSchemePresenter$models$2$1(cardSchemePresenter, cardElementAction, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CardSchemePresenter$models$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        CardModule.CardElementAction cardElementAction = this.$action;
        CardSchemePresenter cardSchemePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (cardSchemePresenter.handleAction(cardElementAction, null, null, this) == coroutineSingletons) {
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
                    this.label = 1;
                    if (cardSchemePresenter.handleAction(cardElementAction, null, null, this) == coroutineSingletons2) {
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
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    if (cardSchemePresenter.handleAction(cardElementAction, null, null, this) == coroutineSingletons3) {
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
