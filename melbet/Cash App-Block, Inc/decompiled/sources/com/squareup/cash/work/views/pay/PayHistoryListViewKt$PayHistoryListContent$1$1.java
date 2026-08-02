package com.squareup.cash.work.views.pay;

import androidx.compose.runtime.State;
import com.squareup.cash.composeUi.foundation.image.ImageLoadingStatus;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewEvent;
import com.squareup.cash.work.viewmodels.PayHistoryListViewEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PayHistoryListViewKt$PayHistoryListContent$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ State $shouldLoadMore$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PayHistoryListViewKt$PayHistoryListContent$1$1(Function1 function1, State state, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$onEvent = function1;
        this.$shouldLoadMore$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        State state = this.$shouldLoadMore$delegate;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                return new PayHistoryListViewKt$PayHistoryListContent$1$1(function1, state, continuation, 0);
            case 1:
                return new PayHistoryListViewKt$PayHistoryListContent$1$1(function1, state, continuation, 1);
            default:
                return new PayHistoryListViewKt$PayHistoryListContent$1$1(function1, state, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PayHistoryListViewKt$PayHistoryListContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.$onEvent;
        State state = this.$shouldLoadMore$delegate;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) state.getValue()).booleanValue()) {
                    function1.invoke(PayHistoryListViewEvent.LoadMore.INSTANCE);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (function1 != null) {
                    function1.invoke((ImageLoadingStatus) state.getValue());
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (((Boolean) state.getValue()).booleanValue()) {
                    function1.invoke(PromotionDetailsViewEvent.ViewedTreehouseContent.INSTANCE);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
