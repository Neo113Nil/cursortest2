package com.stripe.android.financialconnections.features.attachpayment;

import androidx.lifecycle.SavedStateHandle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.common.zzai;
import com.squareup.cash.R;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda0;
import com.squareup.moshi.LinkedHashTreeMap;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.exception.LocalStripeException;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.CachedPartnerAccount;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.domain.RealCurrentLinkBrand;
import com.stripe.android.financialconnections.domain.RealIsNetworkingRelinkSession;
import com.stripe.android.financialconnections.domain.SelectAccounts;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.model.AccountPickerPane;
import com.stripe.android.financialconnections.model.ConsentPane;
import com.stripe.android.financialconnections.model.DataAccessNotice;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.PaymentAccountParams;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.model.LinkBrand;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class AttachPaymentViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.ATTACH_LINKED_PAYMENT_ACCOUNT;
    public final RealCurrentLinkBrand currentLinkBrand;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final GetCachedAccounts getCachedAccounts;
    public final GetOrFetchSync getOrFetchSync;
    public final RealIsNetworkingRelinkSession isNetworkingRelinkSession;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final NavigationManagerImpl navigationManager;
    public final PollAttachPaymentAccount pollAttachPaymentAccount;
    public final SuccessContentRepository successContentRepository;

    /* renamed from: com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public long J$0;
        public SynchronizeSessionResponse L$0;
        public FinancialConnectionsSessionManifest L$1;
        public FinancialConnectionsAuthorizationSession L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public final /* synthetic */ FinancialConnectionsViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(FinancialConnectionsViewModel financialConnectionsViewModel, Continuation continuation, int i) {
            super(1, continuation);
            this.$r8$classId = i;
            this.this$0 = financialConnectionsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            int i = this.$r8$classId;
            FinancialConnectionsViewModel financialConnectionsViewModel = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1((AttachPaymentViewModel) financialConnectionsViewModel, continuation, 0);
                default:
                    return new AnonymousClass1((AccountPickerViewModel) financialConnectionsViewModel, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Continuation continuation = (Continuation) obj;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:129:0x0230, code lost:
        
            if (r12 == r1) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:134:0x020d, code lost:
        
            if (r6 == r1) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0063, code lost:
        
            if (r5 == r12) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:105:0x032b  */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x01ab  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0283  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object invoke$default;
            SynchronizeSessionResponse synchronizeSessionResponse;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            Object obj2;
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
            FinancialConnectionsInstitution financialConnectionsInstitution;
            Object invoke;
            long currentTimeMillis;
            Object invoke2;
            List list;
            Boolean bool;
            Boolean bool2;
            FinancialConnectionsSessionManifest.Pane pane;
            AccountPickerState accountPickerState;
            Object invoke$default2;
            SynchronizeSessionResponse synchronizeSessionResponse2;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2;
            long currentTimeMillis2;
            Object invoke3;
            DataAccessNotice dataAccessNotice;
            FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2;
            ConsentPane consentPane;
            PartnerAccountsList partnerAccountsList;
            List list2;
            Iterator it;
            FinancialConnectionsInstitution financialConnectionsInstitution2;
            AccountPickerPane accountPickerPane;
            int i = this.$r8$classId;
            FinancialConnectionsViewModel financialConnectionsViewModel = this.this$0;
            switch (i) {
                case 0:
                    AttachPaymentViewModel attachPaymentViewModel = (AttachPaymentViewModel) financialConnectionsViewModel;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetOrFetchSync getOrFetchSync = attachPaymentViewModel.getOrFetchSync;
                        this.label = 1;
                        invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, this, 3);
                        break;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                long j = this.J$0;
                                list = (List) this.L$4;
                                financialConnectionsAuthorizationSession = this.L$2;
                                FinancialConnectionsSessionManifest financialConnectionsSessionManifest3 = this.L$1;
                                SafeTrace.throwOnFailure(obj);
                                currentTimeMillis = j;
                                financialConnectionsSessionManifest = financialConnectionsSessionManifest3;
                                invoke2 = obj;
                                LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount = (LinkAccountSessionPaymentAccount) invoke2;
                                long longValue = new Long(System.currentTimeMillis() - currentTimeMillis).longValue();
                                bool = linkAccountSessionPaymentAccount.networkingSuccessful;
                                bool2 = Boolean.TRUE;
                                if (Intrinsics.areEqual(bool, bool2)) {
                                    FinancialConnectionsSessionManifest.Pane pane2 = AttachPaymentViewModel.PANE;
                                    if (Intrinsics.areEqual(financialConnectionsSessionManifest.isNetworkingUserFlow, bool2) && Intrinsics.areEqual(financialConnectionsSessionManifest.accountholderIsLinkConsumer, bool2) && attachPaymentViewModel.isNetworkingRelinkSession.pendingRepairRepository.get() == null) {
                                        LinkBrand invoke4 = attachPaymentViewModel.currentLinkBrand.invoke();
                                        SuccessContentRepository successContentRepository = attachPaymentViewModel.successContentRepository;
                                        TextResource.PluralId pluralId = invoke4 == LinkBrand.Link ? new TextResource.PluralId(R.string.stripe_success_pane_desc_link_success_singular, R.string.stripe_success_pane_desc_link_success_plural, list.size()) : new TextResource.PluralId(R.string.stripe_success_pane_desc_link_success_singular_with_brand, R.string.stripe_success_pane_desc_link_success_plural_with_brand, list.size(), CollectionsKt__CollectionsJVMKt.listOf(invoke4.brandName()));
                                        successContentRepository.getClass();
                                        ((SavedStateHandle) successContentRepository.zzd).set(new SuccessContentRepository.State(pluralId, null), (String) successContentRepository.zza);
                                    }
                                }
                                FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = attachPaymentViewModel.eventTracker;
                                FinancialConnectionsSessionManifest.Pane pane3 = AttachPaymentViewModel.PANE;
                                String str = financialConnectionsAuthorizationSession.id;
                                pane3.getClass();
                                str.getClass();
                                FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                                financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane3)), new Pair("authSessionId", str), new Pair("duration", String.valueOf(longValue)))), "polling.attachPayment.success", true));
                                pane = linkAccountSessionPaymentAccount.nextPane;
                                if (pane == null) {
                                    pane = FinancialConnectionsSessionManifest.Pane.SUCCESS;
                                }
                                NavigationManagerImpl.tryNavigateTo$default(attachPaymentViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane), pane3), null, 6);
                                return linkAccountSessionPaymentAccount;
                            }
                            FinancialConnectionsInstitution financialConnectionsInstitution3 = (FinancialConnectionsInstitution) this.L$3;
                            financialConnectionsAuthorizationSession = this.L$2;
                            FinancialConnectionsSessionManifest financialConnectionsSessionManifest4 = this.L$1;
                            synchronizeSessionResponse = this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            financialConnectionsInstitution = financialConnectionsInstitution3;
                            financialConnectionsSessionManifest = financialConnectionsSessionManifest4;
                            invoke = obj;
                            List list3 = (List) invoke;
                            String str2 = ((CachedPartnerAccount) CollectionsKt.single(list3)).linkedAccountId;
                            currentTimeMillis = System.currentTimeMillis();
                            PollAttachPaymentAccount pollAttachPaymentAccount = attachPaymentViewModel.pollAttachPaymentAccount;
                            if (str2 == null) {
                                obj2 = null;
                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                return obj2;
                            }
                            PaymentAccountParams.LinkedAccount linkedAccount = new PaymentAccountParams.LinkedAccount(str2);
                            this.L$0 = null;
                            this.L$1 = financialConnectionsSessionManifest;
                            this.L$2 = financialConnectionsAuthorizationSession;
                            this.L$3 = null;
                            this.L$4 = list3;
                            this.J$0 = currentTimeMillis;
                            this.label = 3;
                            invoke2 = pollAttachPaymentAccount.invoke(synchronizeSessionResponse, financialConnectionsInstitution, linkedAccount, this);
                            if (invoke2 != coroutineSingletons) {
                                list = list3;
                                LinkAccountSessionPaymentAccount linkAccountSessionPaymentAccount2 = (LinkAccountSessionPaymentAccount) invoke2;
                                long longValue2 = new Long(System.currentTimeMillis() - currentTimeMillis).longValue();
                                bool = linkAccountSessionPaymentAccount2.networkingSuccessful;
                                bool2 = Boolean.TRUE;
                                if (Intrinsics.areEqual(bool, bool2)) {
                                }
                                FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl2 = attachPaymentViewModel.eventTracker;
                                FinancialConnectionsSessionManifest.Pane pane32 = AttachPaymentViewModel.PANE;
                                String str3 = financialConnectionsAuthorizationSession.id;
                                pane32.getClass();
                                str3.getClass();
                                FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                                financialConnectionsAnalyticsTrackerImpl2.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane32)), new Pair("authSessionId", str3), new Pair("duration", String.valueOf(longValue2)))), "polling.attachPayment.success", true));
                                pane = linkAccountSessionPaymentAccount2.nextPane;
                                if (pane == null) {
                                }
                                NavigationManagerImpl.tryNavigateTo$default(attachPaymentViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane), pane32), null, 6);
                                return linkAccountSessionPaymentAccount2;
                            }
                            return coroutineSingletons;
                        }
                        SafeTrace.throwOnFailure(obj);
                        invoke$default = obj;
                    }
                    synchronizeSessionResponse = (SynchronizeSessionResponse) invoke$default;
                    financialConnectionsSessionManifest = synchronizeSessionResponse.manifest;
                    if (financialConnectionsSessionManifest != null) {
                        financialConnectionsAuthorizationSession = financialConnectionsSessionManifest.activeAuthSession;
                        if (financialConnectionsAuthorizationSession != null) {
                            financialConnectionsInstitution = financialConnectionsSessionManifest.activeInstitution;
                            if (financialConnectionsInstitution != null) {
                                GetCachedAccounts getCachedAccounts = attachPaymentViewModel.getCachedAccounts;
                                this.L$0 = synchronizeSessionResponse;
                                this.L$1 = financialConnectionsSessionManifest;
                                this.L$2 = financialConnectionsAuthorizationSession;
                                this.L$3 = financialConnectionsInstitution;
                                this.label = 2;
                                invoke = getCachedAccounts.invoke(this);
                                break;
                            } else {
                                obj2 = null;
                                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            }
                        } else {
                            obj2 = null;
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        }
                    } else {
                        obj2 = null;
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    }
                    return obj2;
                default:
                    AccountPickerViewModel accountPickerViewModel = (AccountPickerViewModel) financialConnectionsViewModel;
                    FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl3 = accountPickerViewModel.eventTracker;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        accountPickerState = (AccountPickerState) accountPickerViewModel.stateFlow.$$delegate_0.getValue();
                        GetOrFetchSync getOrFetchSync2 = accountPickerViewModel.getOrFetchSync;
                        this.L$3 = accountPickerState;
                        this.label = 1;
                        invoke$default2 = GetOrFetchSync.invoke$default(getOrFetchSync2, null, this, 3);
                        break;
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            long j2 = this.J$0;
                            financialConnectionsAuthorizationSession2 = this.L$2;
                            FinancialConnectionsSessionManifest financialConnectionsSessionManifest5 = this.L$1;
                            DataAccessNotice dataAccessNotice2 = (DataAccessNotice) this.L$4;
                            SynchronizeSessionResponse synchronizeSessionResponse3 = this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            financialConnectionsSessionManifest2 = financialConnectionsSessionManifest5;
                            dataAccessNotice = dataAccessNotice2;
                            currentTimeMillis2 = j2;
                            synchronizeSessionResponse2 = synchronizeSessionResponse3;
                            invoke3 = obj;
                            partnerAccountsList = (PartnerAccountsList) invoke3;
                            long longValue3 = new Long(System.currentTimeMillis() - currentTimeMillis2).longValue();
                            if (!partnerAccountsList.data.isEmpty()) {
                                FinancialConnectionsSessionManifest.Pane pane4 = AccountPickerViewModel.PANE;
                                String str4 = financialConnectionsAuthorizationSession2.id;
                                pane4.getClass();
                                str4.getClass();
                                FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                                financialConnectionsAnalyticsTrackerImpl3.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane4)), new Pair("authSessionId", str4), new Pair("duration", String.valueOf(longValue3)))), "polling.accounts.success", true));
                            }
                            List sortedWith = CollectionsKt.sortedWith(partnerAccountsList.data, new LinkedHashTreeMap.AnonymousClass1(19));
                            TextUpdate textUpdate = synchronizeSessionResponse2.text;
                            String str5 = (textUpdate != null || (accountPickerPane = textUpdate.accountPicker) == null) ? null : accountPickerPane.dataAccessNotice;
                            FinancialConnectionsSessionManifest.Pane pane5 = AccountPickerViewModel.PANE;
                            list2 = sortedWith;
                            if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    Boolean bool3 = ((PartnerAccount) it.next())._allowSelection;
                                    if (bool3 != null ? bool3.booleanValue() : true) {
                                        Boolean bool4 = partnerAccountsList.skipAccountSelection;
                                        boolean booleanValue = (bool4 == null && (bool4 = financialConnectionsAuthorizationSession2.skipAccountSelection) == null) ? false : bool4.booleanValue();
                                        boolean z = financialConnectionsSessionManifest2.singleAccount;
                                        AccountPickerState.SelectionMode selectionMode = z ? AccountPickerState.SelectionMode.Single : AccountPickerState.SelectionMode.Multiple;
                                        boolean z2 = z && Intrinsics.areEqual(financialConnectionsAuthorizationSession2.institutionSkipAccountSelection, Boolean.TRUE) && sortedWith.size() == 1;
                                        String str6 = financialConnectionsSessionManifest2.businessName;
                                        Boolean bool5 = financialConnectionsSessionManifest2.isStripeDirect;
                                        AccountPickerState.Payload payload = new AccountPickerState.Payload(booleanValue, sortedWith, str5, dataAccessNotice, selectionMode, z, bool5 != null ? bool5.booleanValue() : false, str6, z2);
                                        financialConnectionsAnalyticsTrackerImpl3.track(new FinancialConnectionsAnalyticsEvent.Click(AccountPickerViewModel.PANE, 25));
                                        return payload;
                                    }
                                }
                            }
                            boolean z3 = financialConnectionsSessionManifest2.allowManualEntry;
                            financialConnectionsInstitution2 = financialConnectionsSessionManifest2.activeInstitution;
                            if (financialConnectionsInstitution2 == null) {
                                throw new AccountLoadError(z3, true, financialConnectionsInstitution2, new LocalStripeException("No accounts available to select.", null));
                            }
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return null;
                        }
                        AccountPickerState accountPickerState2 = (AccountPickerState) this.L$3;
                        SafeTrace.throwOnFailure(obj);
                        accountPickerState = accountPickerState2;
                        invoke$default2 = obj;
                    }
                    synchronizeSessionResponse2 = (SynchronizeSessionResponse) invoke$default2;
                    TextUpdate textUpdate2 = synchronizeSessionResponse2.text;
                    DataAccessNotice dataAccessNotice3 = (textUpdate2 == null || (consentPane = textUpdate2.consent) == null) ? null : consentPane.dataAccessNotice;
                    financialConnectionsSessionManifest2 = synchronizeSessionResponse2.manifest;
                    FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession3 = financialConnectionsSessionManifest2.activeAuthSession;
                    if (financialConnectionsAuthorizationSession3 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    currentTimeMillis2 = System.currentTimeMillis();
                    SelectAccounts selectAccounts = accountPickerViewModel.pollAuthorizationSessionAccounts;
                    boolean z4 = accountPickerState.canRetry;
                    this.L$3 = null;
                    this.L$0 = synchronizeSessionResponse2;
                    this.L$4 = dataAccessNotice3;
                    this.L$1 = financialConnectionsSessionManifest2;
                    this.L$2 = financialConnectionsAuthorizationSession3;
                    this.J$0 = currentTimeMillis2;
                    this.label = 2;
                    invoke3 = selectAccounts.invoke(z4, synchronizeSessionResponse2, this);
                    if (invoke3 != coroutineSingletons2) {
                        dataAccessNotice = dataAccessNotice3;
                        financialConnectionsAuthorizationSession2 = financialConnectionsAuthorizationSession3;
                        partnerAccountsList = (PartnerAccountsList) invoke3;
                        long longValue32 = new Long(System.currentTimeMillis() - currentTimeMillis2).longValue();
                        if (!partnerAccountsList.data.isEmpty()) {
                        }
                        List sortedWith2 = CollectionsKt.sortedWith(partnerAccountsList.data, new LinkedHashTreeMap.AnonymousClass1(19));
                        TextUpdate textUpdate3 = synchronizeSessionResponse2.text;
                        if (textUpdate3 != null) {
                        }
                        FinancialConnectionsSessionManifest.Pane pane52 = AccountPickerViewModel.PANE;
                        list2 = sortedWith2;
                        if (list2 instanceof Collection) {
                        }
                        it = list2.iterator();
                        while (it.hasNext()) {
                        }
                        boolean z32 = financialConnectionsSessionManifest2.allowManualEntry;
                        financialConnectionsInstitution2 = financialConnectionsSessionManifest2.activeInstitution;
                        if (financialConnectionsInstitution2 == null) {
                        }
                    }
                    return coroutineSingletons2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttachPaymentViewModel(AttachPaymentState attachPaymentState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, SuccessContentRepository successContentRepository, PollAttachPaymentAccount pollAttachPaymentAccount, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, GetCachedAccounts getCachedAccounts, NavigationManagerImpl navigationManagerImpl, GetOrFetchSync getOrFetchSync, RealCurrentLinkBrand realCurrentLinkBrand, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, RealIsNetworkingRelinkSession realIsNetworkingRelinkSession) {
        super(attachPaymentState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        successContentRepository.getClass();
        pollAttachPaymentAccount.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        getCachedAccounts.getClass();
        navigationManagerImpl.getClass();
        getOrFetchSync.getClass();
        realCurrentLinkBrand.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        realIsNetworkingRelinkSession.getClass();
        this.successContentRepository = successContentRepository;
        this.pollAttachPaymentAccount = pollAttachPaymentAccount;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.getCachedAccounts = getCachedAccounts;
        this.navigationManager = navigationManagerImpl;
        this.getOrFetchSync = getOrFetchSync;
        this.currentLinkBrand = realCurrentLinkBrand;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.isNetworkingRelinkSession = realIsNetworkingRelinkSession;
        Continuation continuation = null;
        FinancialConnectionsViewModel.onAsync$default(this, AttachPaymentViewModel$logErrors$1.INSTANCE, null, new InquiryViewModel.AnonymousClass1(this, continuation, 3), 2);
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(this, continuation, 0), new KotterKnifeKt$$ExternalSyntheticLambda0(28));
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        AttachPaymentState attachPaymentState = (AttachPaymentState) obj;
        attachPaymentState.getClass();
        return new TopAppBarStateUpdate(PANE, false, zzai.getError(attachPaymentState.linkPaymentAccount), false, null, 56);
    }
}
