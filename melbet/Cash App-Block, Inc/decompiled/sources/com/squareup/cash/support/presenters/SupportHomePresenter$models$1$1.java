package com.squareup.cash.support.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewDisputes;
import com.squareup.cash.cdf.customersupport.CustomerSupportAccessViewTransactions;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.support.backend.api.DisputesTrackerService$DisputesHistoryResult;
import com.squareup.cash.support.backend.real.RealDisputesTrackerService;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.moshi.JsonAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class SupportHomePresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $activityEmbeddedViewModel$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ SupportHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SupportHomePresenter$models$1$1(SupportHomePresenter supportHomePresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = supportHomePresenter;
        this.$activityEmbeddedViewModel$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$activityEmbeddedViewModel$delegate;
        SupportHomePresenter supportHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new SupportHomePresenter$models$1$1(supportHomePresenter, mutableState, continuation, 0);
            default:
                return new SupportHomePresenter$models$1$1(supportHomePresenter, mutableState, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SupportHomePresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        CustomerSupportAccessViewTransactions customerSupportAccessViewTransactions;
        int i = this.$r8$classId;
        MutableState mutableState = this.$activityEmbeddedViewModel$delegate;
        SupportHomePresenter supportHomePresenter = this.this$0;
        Continuation continuation = null;
        switch (i) {
            case 0:
                RealObservabilityManager realObservabilityManager = supportHomePresenter.observabilityManager;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                int i3 = 5;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    realObservabilityManager.addTiming("start_loading_transactions");
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new OverlayKt$$ExternalSyntheticLambda1(27, mutableState));
                    RealSheetState$peek$3.AnonymousClass2 anonymousClass2 = new RealSheetState$peek$3.AnonymousClass2(2, continuation, i3);
                    this.label = 1;
                    obj = FlowKt.firstOrNull(snapshotFlow, anonymousClass2, this);
                    if (obj == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                ActivityEmbeddedViewModel activityEmbeddedViewModel = (ActivityEmbeddedViewModel) obj;
                if (activityEmbeddedViewModel == null || activityEmbeddedViewModel.getHasLoadingError()) {
                    arrayList = null;
                } else {
                    List list = activityEmbeddedViewModel.feedEntries;
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof ActivityFeedEntry.Item) {
                            arrayList.add(obj2);
                        }
                    }
                }
                realObservabilityManager.addTiming("finish_loading_transactions");
                Analytics analytics = supportHomePresenter.analytics;
                SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen = supportHomePresenter.args;
                JsonAdapter jsonAdapter = (JsonAdapter) supportHomePresenter.stringListAdapter$delegate.getValue();
                supportHomeScreen.getClass();
                SupportScreens.FlowScreens.Data data = supportHomeScreen.data;
                jsonAdapter.getClass();
                if (arrayList != null) {
                    List take = CollectionsKt.take(arrayList, 5);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                    Iterator it = take.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((ActivityItemViewModel) ((ActivityFeedEntry.Item) it.next()).activityItem.model).rowId);
                    }
                    customerSupportAccessViewTransactions = new CustomerSupportAccessViewTransactions(data.flowToken, jsonAdapter.toJson(arrayList2), Boolean.FALSE, CustomerSupportAccessViewTransactions.Status.SUCCESS);
                } else {
                    customerSupportAccessViewTransactions = new CustomerSupportAccessViewTransactions(data.flowToken, "[]", Boolean.FALSE, CustomerSupportAccessViewTransactions.Status.FAILURE);
                }
                analytics.track(customerSupportAccessViewTransactions, null);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealDisputesTrackerService realDisputesTrackerService = supportHomePresenter.disputesTrackerService;
                    this.label = 1;
                    obj = realDisputesTrackerService.getDisputesHistory(this);
                    if (obj == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                DisputesTrackerService$DisputesHistoryResult disputesTrackerService$DisputesHistoryResult = (DisputesTrackerService$DisputesHistoryResult) obj;
                mutableState.setValue(disputesTrackerService$DisputesHistoryResult);
                if (disputesTrackerService$DisputesHistoryResult instanceof DisputesTrackerService$DisputesHistoryResult.Success) {
                    DisputesTrackerService$DisputesHistoryResult.Success success = (DisputesTrackerService$DisputesHistoryResult.Success) disputesTrackerService$DisputesHistoryResult;
                    if (success.totalClaims > 0) {
                        Analytics analytics2 = supportHomePresenter.analytics;
                        SupportScreens.FlowScreens.SupportHomeScreen supportHomeScreen2 = supportHomePresenter.args;
                        int i5 = success.activeClaims;
                        supportHomeScreen2.getClass();
                        analytics2.track(new CustomerSupportAccessViewDisputes(Integer.valueOf(i5), supportHomeScreen2.data.flowToken), null);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
