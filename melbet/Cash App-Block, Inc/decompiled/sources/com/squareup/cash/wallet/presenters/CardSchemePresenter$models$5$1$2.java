package com.squareup.cash.wallet.presenters;

import com.squareup.cash.cdf.booklet.BookletInteractScroll;
import com.squareup.cash.wallet.data.RealNewTagPeekBus;
import com.squareup.cash.wallet.presenters.PresenterEvents;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes7.dex */
public final class CardSchemePresenter$models$5$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CardSchemePresenter this$0;

    public CardSchemePresenter$models$5$1$2(CoroutineScope coroutineScope, CardSchemePresenter cardSchemePresenter) {
        this.$r8$classId = 3;
        this.this$0 = cardSchemePresenter;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        CardSchemePresenter cardSchemePresenter = this.this$0;
        switch (i) {
            case 0:
                Object obj2 = cardSchemePresenter.lastViewedPaymentDevicePage.set(new Integer(((Number) obj).intValue()), continuation);
                if (obj2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                RealNewTagPeekBus realNewTagPeekBus = cardSchemePresenter.newTagPeekBus;
                Integer num = realNewTagPeekBus.knownTagCount;
                if (num == null) {
                    realNewTagPeekBus.knownTagCount = Integer.valueOf(intValue);
                } else if (intValue > num.intValue()) {
                    realNewTagPeekBus.knownTagCount = Integer.valueOf(intValue);
                    StateFlowImpl stateFlowImpl = realNewTagPeekBus._pendingPeek;
                    Boolean bool = Boolean.TRUE;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, bool);
                }
                break;
            case 2:
                StateFlowImpl stateFlowImpl2 = cardSchemePresenter.newTagPeekBus._pendingPeek;
                Boolean bool2 = Boolean.FALSE;
                stateFlowImpl2.getClass();
                stateFlowImpl2.updateState(null, bool2);
                break;
            default:
                if ((((PresenterEvents) obj) instanceof PresenterEvents.VerticalScroll) && !cardSchemePresenter.hasRecordedScrollEvent) {
                    cardSchemePresenter.analytics.track(new BookletInteractScroll("CARD", null, 6), null);
                    cardSchemePresenter.hasRecordedScrollEvent = true;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ CardSchemePresenter$models$5$1$2(CardSchemePresenter cardSchemePresenter, int i) {
        this.$r8$classId = i;
        this.this$0 = cardSchemePresenter;
    }
}
