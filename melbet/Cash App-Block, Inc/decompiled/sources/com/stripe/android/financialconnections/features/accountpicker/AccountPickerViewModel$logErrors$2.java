package com.stripe.android.financialconnections.features.accountpicker;

import com.datadog.trace.core.util.Matchers;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PartnerAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class AccountPickerViewModel$logErrors$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ AccountPickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountPickerViewModel$logErrors$2(AccountPickerViewModel accountPickerViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = accountPickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AccountPickerViewModel accountPickerViewModel = this.this$0;
        switch (i) {
            case 0:
                AccountPickerViewModel$logErrors$2 accountPickerViewModel$logErrors$2 = new AccountPickerViewModel$logErrors$2(accountPickerViewModel, continuation, 0);
                accountPickerViewModel$logErrors$2.L$0 = obj;
                return accountPickerViewModel$logErrors$2;
            case 1:
                AccountPickerViewModel$logErrors$2 accountPickerViewModel$logErrors$22 = new AccountPickerViewModel$logErrors$2(accountPickerViewModel, continuation, 1);
                accountPickerViewModel$logErrors$22.L$0 = obj;
                return accountPickerViewModel$logErrors$22;
            default:
                AccountPickerViewModel$logErrors$2 accountPickerViewModel$logErrors$23 = new AccountPickerViewModel$logErrors$2(accountPickerViewModel, continuation, 2);
                accountPickerViewModel$logErrors$23.L$0 = obj;
                return accountPickerViewModel$logErrors$23;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((AccountPickerViewModel$logErrors$2) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((AccountPickerViewModel$logErrors$2) create((Throwable) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((AccountPickerViewModel$logErrors$2) create((AccountPickerState.Payload) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i = this.$r8$classId;
        AccountPickerViewModel accountPickerViewModel = this.this$0;
        switch (i) {
            case 0:
                Throwable th = (Throwable) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Matchers.logError(accountPickerViewModel.eventTracker, "Error retrieving accounts", th, accountPickerViewModel.logger, AccountPickerViewModel.PANE);
                break;
            case 1:
                Throwable th2 = (Throwable) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Matchers.logError(accountPickerViewModel.eventTracker, "Error selecting accounts", th2, accountPickerViewModel.logger, AccountPickerViewModel.PANE);
                break;
            default:
                StateFlowImpl stateFlowImpl = accountPickerViewModel._stateFlow;
                FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = accountPickerViewModel.eventTracker;
                AccountPickerState.Payload payload = (AccountPickerState.Payload) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (payload.skipAccountSelection) {
                    Iterable selectableAccounts = payload.getSelectableAccounts();
                    if (payload.singleAccount) {
                        selectableAccounts = CollectionsKt.take(selectableAccounts, 1);
                    }
                    Iterable iterable = selectableAccounts;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PartnerAccount) it.next()).id);
                    }
                    Set set = CollectionsKt.toSet(arrayList);
                    FinancialConnectionsSessionManifest.Pane pane = AccountPickerViewModel.PANE;
                    accountPickerViewModel.submitAccounts(set, true);
                } else if (payload.userSelectedSingleAccountInInstitution) {
                    Set of = SetsKt__SetsJVMKt.setOf(((PartnerAccount) CollectionsKt.first(payload.accounts)).id);
                    FinancialConnectionsSessionManifest.Pane pane2 = AccountPickerViewModel.PANE;
                    accountPickerViewModel.submitAccounts(of, true);
                } else {
                    AccountPickerState.SelectionMode selectionMode = payload.selectionMode;
                    if (selectionMode == AccountPickerState.SelectionMode.Single) {
                        PartnerAccount partnerAccount = (PartnerAccount) CollectionsKt.firstOrNull((List) payload.getSelectableAccounts());
                        String str = partnerAccount != null ? partnerAccount.id : null;
                        Set of2 = str != null ? SetsKt__SetsJVMKt.setOf(str) : EmptySet.INSTANCE;
                        financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(AccountPickerViewModel.PANE, of2, true, 2));
                        do {
                            value2 = stateFlowImpl.getValue();
                        } while (!stateFlowImpl.compareAndSet(value2, AccountPickerState.copy$default((AccountPickerState) value2, null, null, null, of2, null, 47)));
                    } else if (selectionMode == AccountPickerState.SelectionMode.Multiple) {
                        ArrayList selectableAccounts2 = payload.getSelectableAccounts();
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(selectableAccounts2, 10));
                        Iterator it2 = selectableAccounts2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((PartnerAccount) it2.next()).id);
                        }
                        Set set2 = CollectionsKt.toSet(arrayList2);
                        financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(AccountPickerViewModel.PANE, set2, false, 2));
                        do {
                            value = stateFlowImpl.getValue();
                        } while (!stateFlowImpl.compareAndSet(value, AccountPickerState.copy$default((AccountPickerState) value, null, null, null, set2, null, 47)));
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
