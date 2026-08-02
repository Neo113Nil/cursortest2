package com.squareup.cash.tax.views;

import app.cash.local.viewmodels.sheet.EducationalSheetEvent;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewEvent;
import com.squareup.cash.activity.viewmodels.LoadMore;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.SelectAfterpayPromptViewEvent;
import com.squareup.cash.card.onboarding.DisclosureViewEvent;
import com.squareup.cash.money.viewmodels.MoneyTabEvent;
import com.squareup.cash.moneybot.viewmodels.SuggestionViewModel;
import com.squareup.cash.payments.viewmodels.PaymentLoadingViewEvent;
import com.squareup.cash.sharesheet.ShareSheetViewEvent;
import com.squareup.cash.tax.viewmodels.TaxAuthorizationViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class TaxAuthorizationView$Content$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxAuthorizationView$Content$1$1(SuggestionViewModel.SuggestionPillViewModel suggestionPillViewModel, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.$onEvent = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new TaxAuthorizationView$Content$1$1(this.$onEvent, continuation, 0);
            case 1:
                return new TaxAuthorizationView$Content$1$1(this.$onEvent, continuation, 1);
            case 2:
                return new TaxAuthorizationView$Content$1$1(this.$onEvent, continuation, 2);
            case 3:
                return new TaxAuthorizationView$Content$1$1(this.$onEvent, continuation, 3);
            case 4:
                return new TaxAuthorizationView$Content$1$1(this.$onEvent, continuation, 4);
            case 5:
                return new TaxAuthorizationView$Content$1$1(this.$onEvent, continuation, 5);
            case 6:
                return new TaxAuthorizationView$Content$1$1(this.$onEvent, continuation, 6);
            case 7:
                return new TaxAuthorizationView$Content$1$1(this.$onEvent, continuation, 7);
            case 8:
                return new TaxAuthorizationView$Content$1$1((SuggestionViewModel.SuggestionPillViewModel) null, this.$onEvent, continuation);
            case 9:
                return new TaxAuthorizationView$Content$1$1(this.$onEvent, continuation, 9);
            case 10:
                return new TaxAuthorizationView$Content$1$1(this.$onEvent, continuation, 10);
            default:
                return new TaxAuthorizationView$Content$1$1(this.$onEvent, continuation, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TaxAuthorizationView$Content$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(TaxAuthorizationViewEvent.StartTaxAuthorizationFlow.INSTANCE);
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(new EducationalSheetEvent.SheetHasBeenExpanded());
                return Unit.INSTANCE;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(ActivityEmbeddedViewEvent.LoadMore.INSTANCE);
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(ActivityEmbeddedViewEvent.Refresh.INSTANCE);
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(LoadMore.INSTANCE);
                return Unit.INSTANCE;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(SelectAfterpayPromptViewEvent.SheetViewed.INSTANCE);
                return Unit.INSTANCE;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(DisclosureViewEvent.OnScrollChange.INSTANCE);
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(MoneyTabEvent.Viewed.INSTANCE);
                return Unit.INSTANCE;
            case 8:
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                throw null;
            case 9:
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(PaymentLoadingViewEvent.InitiatePayment.INSTANCE);
                return Unit.INSTANCE;
            case 10:
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                function1.invoke(ShareSheetViewEvent.ShareSuccess.INSTANCE);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TaxAuthorizationView$Content$1$1(Function1 function1, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onEvent = function1;
    }
}
