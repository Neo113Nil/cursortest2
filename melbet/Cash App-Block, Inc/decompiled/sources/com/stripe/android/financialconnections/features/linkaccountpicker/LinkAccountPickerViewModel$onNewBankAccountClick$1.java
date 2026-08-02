package com.stripe.android.financialconnections.features.linkaccountpicker;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerState;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class LinkAccountPickerViewModel$onNewBankAccountClick$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LinkAccountPickerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinkAccountPickerViewModel$onNewBankAccountClick$1(LinkAccountPickerViewModel linkAccountPickerViewModel, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = linkAccountPickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new LinkAccountPickerViewModel$onNewBankAccountClick$1(this.this$0, continuation, 0);
            default:
                return new LinkAccountPickerViewModel$onNewBankAccountClick$1(this.this$0, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((LinkAccountPickerViewModel$onNewBankAccountClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((LinkAccountPickerViewModel$onNewBankAccountClick$1) create((HandleClickableUrl.DeeplinkPayload) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FinancialConnectionsSessionManifest.Pane pane;
        NetworkedAccount networkedAccount;
        List split$default;
        int i = this.$r8$classId;
        DataAccessNotice dataAccessNotice = null;
        LinkAccountPickerViewModel linkAccountPickerViewModel = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = linkAccountPickerViewModel.eventTracker;
                FinancialConnectionsSessionManifest.Pane pane2 = LinkAccountPickerViewModel.PANE;
                financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click("click.new_account", pane2));
                LinkAccountPickerState.Payload payload = (LinkAccountPickerState.Payload) ((LinkAccountPickerState) linkAccountPickerViewModel.stateFlow.$$delegate_0.getValue()).payload.invoke();
                if (payload == null || (pane = payload.nextPaneOnNewAccount) == null) {
                    pane = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;
                }
                NavigationManagerImpl.tryNavigateTo$default(linkAccountPickerViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane), pane2), null, 6);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                FinancialConnectionsSessionManifest.Pane pane3 = LinkAccountPickerViewModel.PANE;
                LinkAccountPickerState.Payload payload2 = (LinkAccountPickerState.Payload) ((LinkAccountPickerState) linkAccountPickerViewModel.stateFlow.$$delegate_0.getValue()).payload.invoke();
                if (payload2 != null) {
                    ArrayList selectedAccounts = payload2.getSelectedAccounts();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = selectedAccounts.iterator();
                    while (it.hasNext()) {
                        split$default = StringsKt__StringsKt.split$default(((LinkedAccount) it.next()).account.id, new String[]{"_"}, false, 0, 6, null);
                        String str = (String) CollectionsKt.firstOrNull(split$default);
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                    if (CollectionsKt.toSet(arrayList).size() > 1) {
                        dataAccessNotice = payload2.multipleAccountTypesSelectedDataAccessNotice;
                    } else {
                        LinkedAccount linkedAccount = (LinkedAccount) CollectionsKt.firstOrNull((List) payload2.getSelectedAccounts());
                        if (linkedAccount == null || (networkedAccount = linkedAccount.display) == null || (dataAccessNotice = networkedAccount.dataAccessNotice) == null) {
                            dataAccessNotice = payload2.defaultDataAccessNotice;
                        }
                    }
                }
                if (dataAccessNotice != null) {
                    FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl2 = linkAccountPickerViewModel.eventTracker;
                    FinancialConnectionsSessionManifest.Pane pane4 = LinkAccountPickerViewModel.PANE;
                    financialConnectionsAnalyticsTrackerImpl2.track(new FinancialConnectionsAnalyticsEvent.Click(pane4, 13));
                    linkAccountPickerViewModel.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.DataAccess(dataAccessNotice), pane4);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
