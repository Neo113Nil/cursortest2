package com.squareup.cash.work.presenters;

import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.presenters.CardSchemePresenter$toHeroModule$3$1$1;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityStats;
import com.squareup.protos.cash.marketdata.server.GetInvestingMetricsResponse;
import com.squareup.protos.cash.messagingplatformcommon.app.CardMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.InlineV2Message;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes6.dex */
public final class WorkReviewTermsBanner$configFlow$$inlined$map$1 implements Flow {
    public final Object $exitScreen$inlined;
    public final Object $flowStarter$inlined;
    public final Object $navigator$inlined;
    public final /* synthetic */ int $r8$classId;
    public final Object $stringManager$inlined;
    public final Object $this_unsafeTransform$inlined;

    public WorkReviewTermsBanner$configFlow$$inlined$map$1(CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, CoroutineScope coroutineScope, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 2:
                this.$this_unsafeTransform$inlined = InlineV2Message.Placement.ACTIVITY_TAB;
                this.$stringManager$inlined = LazyKt.lazy(new ErrorView$$ExternalSyntheticLambda0(this, 2));
                this.$navigator$inlined = cashAccountDatabaseImpl;
                this.$flowStarter$inlined = coroutineContext;
                this.$exitScreen$inlined = coroutineScope;
                break;
            default:
                this.$this_unsafeTransform$inlined = CardMessage.Placement.ACTIVITY_TAB;
                this.$stringManager$inlined = LazyKt.lazy(new ErrorView$$ExternalSyntheticLambda0(this, 1));
                this.$navigator$inlined = cashAccountDatabaseImpl;
                this.$flowStarter$inlined = coroutineContext;
                this.$exitScreen$inlined = coroutineScope;
                break;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$exitScreen$inlined;
        Object obj2 = this.$flowStarter$inlined;
        Object obj3 = this.$navigator$inlined;
        Object obj4 = this.$this_unsafeTransform$inlined;
        Object obj5 = this.$stringManager$inlined;
        switch (i) {
            case 0:
                Object collect = ((MoneyTabPresenter$models$lambda$31$$inlined$map$1) obj4).collect(new CardSchemePresenter$toHeroModule$3$1$1(flowCollector, (AndroidStringManager) obj5, (BetterNavigator.ScreenNavigator) obj3, (FlowStarter) obj2, (Screen) obj, 17), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = FlowKt.distinctUntilChanged((SharedFlow) ((Lazy) obj5).getValue()).collect(flowCollector, continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object collect3 = FlowKt.distinctUntilChanged((SharedFlow) ((Lazy) obj5).getValue()).collect(flowCollector, continuation);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object collect4 = ((FlowKt__LimitKt$drop$$inlined$unsafeFlow$1) obj4).collect(new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(flowCollector, (MarkwonConfiguration) obj5, (BlockersScreens.ProvisionGooglePayScreen) obj3, (String) obj2, (String) obj, 24), continuation);
                if (collect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect5 = ((Flow) obj4).collect(new LocalCashBalancePresenter$models$$inlined$CollectEffect$1$1(flowCollector, (InvestmentEntityToken) obj5, (GetInvestingMetricsResponse) obj3, (InvestmentEntityStats) obj2, (RealInvestingMetrics) obj, 28), continuation);
                if (collect5 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ WorkReviewTermsBanner$configFlow$$inlined$map$1(Flow flow, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = flow;
        this.$stringManager$inlined = obj;
        this.$navigator$inlined = obj2;
        this.$flowStarter$inlined = obj3;
        this.$exitScreen$inlined = obj4;
    }
}
