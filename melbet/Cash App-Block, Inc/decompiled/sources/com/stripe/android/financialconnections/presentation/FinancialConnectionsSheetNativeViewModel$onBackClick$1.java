package com.stripe.android.financialconnections.presentation;

import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetNativeViewModel$onBackClick$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ FinancialConnectionsSessionManifest.Pane $pane;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FinancialConnectionsSheetNativeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeViewModel$onBackClick$1(FinancialConnectionsSessionManifest.Pane pane, FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 0;
        this.$pane = pane;
        this.this$0 = financialConnectionsSheetNativeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        FinancialConnectionsSessionManifest.Pane pane = this.$pane;
        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = this.this$0;
        switch (i) {
            case 0:
                return new FinancialConnectionsSheetNativeViewModel$onBackClick$1(pane, financialConnectionsSheetNativeViewModel, continuation);
            case 1:
                return new FinancialConnectionsSheetNativeViewModel$onBackClick$1(financialConnectionsSheetNativeViewModel, pane, continuation, 1);
            default:
                return new FinancialConnectionsSheetNativeViewModel$onBackClick$1(financialConnectionsSheetNativeViewModel, pane, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FinancialConnectionsSheetNativeViewModel$onBackClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        FinancialConnectionsSessionManifest.Pane pane = this.$pane;
        FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (pane != null) {
                    FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = financialConnectionsSheetNativeViewModel.eventTracker;
                    FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                    financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsJVMKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)))), "click.nav_bar.back", true));
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                financialConnectionsSheetNativeViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(pane, 16));
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                financialConnectionsSheetNativeViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(pane, 16));
                NavigationManagerImpl.tryNavigateTo$default(financialConnectionsSheetNativeViewModel.navigationManager, Destination.invoke$default(Destination.Exit.INSTANCE, pane), null, 6);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinancialConnectionsSheetNativeViewModel$onBackClick$1(FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModel, FinancialConnectionsSessionManifest.Pane pane, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = financialConnectionsSheetNativeViewModel;
        this.$pane = pane;
    }
}
