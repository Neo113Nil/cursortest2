package com.stripe.android.financialconnections.features.accountpicker;

import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
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
public final class AccountPickerViewModel$onSubmit$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccountPickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountPickerViewModel$onSubmit$1(AccountPickerViewModel accountPickerViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = accountPickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new AccountPickerViewModel$onSubmit$1(this.this$0, continuation, 0);
            default:
                return new AccountPickerViewModel$onSubmit$1(this.this$0, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((AccountPickerViewModel$onSubmit$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((AccountPickerViewModel$onSubmit$1) create((HandleClickableUrl.DeeplinkPayload) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DataAccessNotice dataAccessNotice;
        int i = this.$r8$classId;
        AccountPickerViewModel accountPickerViewModel = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = accountPickerViewModel.eventTracker;
                FinancialConnectionsSessionManifest.Pane pane = AccountPickerViewModel.PANE;
                pane.getClass();
                FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsJVMKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)))), "click.link_accounts", true));
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FinancialConnectionsSessionManifest.Pane pane2 = AccountPickerViewModel.PANE;
                AccountPickerState.Payload payload = (AccountPickerState.Payload) ((AccountPickerState) accountPickerViewModel.stateFlow.$$delegate_0.getValue()).payload.invoke();
                if (payload != null && (dataAccessNotice = payload.dataAccessNotice) != null) {
                    FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl2 = accountPickerViewModel.eventTracker;
                    FinancialConnectionsSessionManifest.Pane pane3 = AccountPickerViewModel.PANE;
                    financialConnectionsAnalyticsTrackerImpl2.track(new FinancialConnectionsAnalyticsEvent.Click(pane3, 13));
                    accountPickerViewModel.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.DataAccess(dataAccessNotice), pane3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
