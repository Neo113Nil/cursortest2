package com.stripe.android.financialconnections.domain;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.exception.AccountLoadError;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitutionSelected;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.PartnerAccountsList;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.repository.CachedConsumerSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.model.LinkBrand;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class PollAuthorizationSessionAccounts$invoke$4 extends SuspendLambda implements Function1 {
    public Object $activeAuthSession;
    public final /* synthetic */ boolean $canRetry;
    public Object $manifest;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object $sync;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollAuthorizationSessionAccounts$invoke$4(SelectAccounts selectAccounts, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, SynchronizeSessionResponse synchronizeSessionResponse, boolean z, Continuation continuation) {
        super(1, continuation);
        this.this$0 = selectAccounts;
        this.$activeAuthSession = financialConnectionsAuthorizationSession;
        this.$manifest = financialConnectionsSessionManifest;
        this.$sync = synchronizeSessionResponse;
        this.$canRetry = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        boolean z = this.$canRetry;
        Object obj = this.$sync;
        switch (i) {
            case 0:
                return new PollAuthorizationSessionAccounts$invoke$4((SelectAccounts) this.this$0, (FinancialConnectionsAuthorizationSession) this.$activeAuthSession, (FinancialConnectionsSessionManifest) this.$manifest, (SynchronizeSessionResponse) obj, this.$canRetry, continuation);
            case 1:
                return new PollAuthorizationSessionAccounts$invoke$4((AccountPickerViewModel) this.$activeAuthSession, (Set) obj, z, continuation);
            default:
                return new PollAuthorizationSessionAccounts$invoke$4((InstitutionPickerViewModel) this.$manifest, z, (FinancialConnectionsInstitution) obj, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((PollAuthorizationSessionAccounts$invoke$4) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0129, code lost:
    
        if (r2 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ee, code lost:
    
        if (r2 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x011a, code lost:
    
        if (r2 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        if (r3 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b8, code lost:
    
        if (r1 == r12) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0194, code lost:
    
        if (r0 == r12) goto L84;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object postAuthorizationSessionAccounts;
        Object invoke$default;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        Object postAuthorizationSessionSelectedAccounts;
        PartnerAccountsList partnerAccountsList;
        PartnerAccountsList partnerAccountsList2;
        int i;
        Object invoke$default2;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2;
        PostAuthorizationSession postAuthorizationSession;
        Object invoke$default3;
        Object selectInstitution;
        Object invoke;
        int i2 = this.$r8$classId;
        boolean z = this.$canRetry;
        Object obj2 = this.$sync;
        Continuation continuation = null;
        switch (i2) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SelectAccounts selectAccounts = (SelectAccounts) this.this$0;
                    FinancialConnectionsAccountsRepositoryImpl financialConnectionsAccountsRepositoryImpl = selectAccounts.repository;
                    String str = selectAccounts.configuration.financialConnectionsSessionClientSecret;
                    String str2 = ((FinancialConnectionsAuthorizationSession) this.$activeAuthSession).id;
                    this.label = 1;
                    postAuthorizationSessionAccounts = financialConnectionsAccountsRepositoryImpl.postAuthorizationSessionAccounts(str, str2, this);
                    if (postAuthorizationSessionAccounts == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    postAuthorizationSessionAccounts = obj;
                }
                PartnerAccountsList partnerAccountsList3 = (PartnerAccountsList) postAuthorizationSessionAccounts;
                if (!partnerAccountsList3.data.isEmpty()) {
                    return partnerAccountsList3;
                }
                FinancialConnectionsInstitution financialConnectionsInstitution = ((FinancialConnectionsSessionManifest) this.$manifest).activeInstitution;
                if (financialConnectionsInstitution != null) {
                    throw new AccountLoadError(ListItemKt.showManualEntryInErrors((SynchronizeSessionResponse) obj2), z, financialConnectionsInstitution, new APIException(0, 31, null, null, null, null));
                }
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            case 1:
                Set set = (Set) obj2;
                AccountPickerViewModel accountPickerViewModel = (AccountPickerViewModel) this.$activeAuthSession;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    accountPickerViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(AccountPickerViewModel.PANE, set, z, 3));
                    GetOrFetchSync getOrFetchSync = accountPickerViewModel.getOrFetchSync;
                    this.label = 1;
                    invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, this, 3);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            partnerAccountsList2 = (PartnerAccountsList) this.this$0;
                            SafeTrace.throwOnFailure(obj);
                            partnerAccountsList = partnerAccountsList2;
                            NavigationManagerImpl.tryNavigateTo$default(accountPickerViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(partnerAccountsList.nextPane), AccountPickerViewModel.PANE), null, 6);
                            return partnerAccountsList;
                        }
                        financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) this.$manifest;
                        SafeTrace.throwOnFailure(obj);
                        postAuthorizationSessionSelectedAccounts = obj;
                        partnerAccountsList = (PartnerAccountsList) postAuthorizationSessionSelectedAccounts;
                        CachedConsumerSession provideConsumerSession = accountPickerViewModel.consumerSessionProvider.provideConsumerSession();
                        String str3 = provideConsumerSession != null ? provideConsumerSession.clientSecret : null;
                        financialConnectionsSessionManifest.getClass();
                        FinancialConnectionsAccount.SupportedPaymentMethodTypes supportedPaymentMethodTypes = financialConnectionsSessionManifest.paymentMethodType;
                        if (supportedPaymentMethodTypes == null) {
                            Boolean bool = financialConnectionsSessionManifest.accountholderIsLinkConsumer;
                            Boolean bool2 = Boolean.TRUE;
                            if (Intrinsics.areEqual(bool, bool2) && Intrinsics.areEqual(financialConnectionsSessionManifest.isNetworkingUserFlow, bool2) && str3 != null) {
                                SaveAccountToLink saveAccountToLink = accountPickerViewModel.saveAccountToLink;
                                ArrayList cachedPartnerAccounts = GetCachedAccountsKt.toCachedPartnerAccounts(partnerAccountsList.data);
                                boolean z2 = supportedPaymentMethodTypes == null;
                                LinkBrand invoke2 = accountPickerViewModel.currentLinkBrand.invoke();
                                this.$manifest = null;
                                this.this$0 = partnerAccountsList;
                                this.label = 3;
                                saveAccountToLink.getClass();
                                if (saveAccountToLink.ensureReadyAccounts(z2, cachedPartnerAccounts, invoke2, new WorkerWorkflow$render$1(saveAccountToLink, str3, continuation, 25), this) != coroutineSingletons2) {
                                    partnerAccountsList2 = partnerAccountsList;
                                    partnerAccountsList = partnerAccountsList2;
                                }
                                return coroutineSingletons2;
                            }
                        }
                        NavigationManagerImpl.tryNavigateTo$default(accountPickerViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(partnerAccountsList.nextPane), AccountPickerViewModel.PANE), null, 6);
                        return partnerAccountsList;
                    }
                    SafeTrace.throwOnFailure(obj);
                    invoke$default = obj;
                }
                financialConnectionsSessionManifest = ((SynchronizeSessionResponse) invoke$default).manifest;
                SelectAccounts selectAccounts2 = accountPickerViewModel.selectAccounts;
                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = financialConnectionsSessionManifest.activeAuthSession;
                if (financialConnectionsAuthorizationSession == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                String str4 = financialConnectionsAuthorizationSession.id;
                this.$manifest = financialConnectionsSessionManifest;
                this.label = 2;
                postAuthorizationSessionSelectedAccounts = selectAccounts2.repository.postAuthorizationSessionSelectedAccounts(selectAccounts2.configuration.financialConnectionsSessionClientSecret, str4, CollectionsKt.toList(set), this);
                break;
                break;
            default:
                FinancialConnectionsInstitution financialConnectionsInstitution2 = (FinancialConnectionsInstitution) obj2;
                InstitutionPickerViewModel institutionPickerViewModel = (InstitutionPickerViewModel) this.$manifest;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = institutionPickerViewModel.eventTracker;
                    FinancialConnectionsSessionManifest.Pane pane = InstitutionPickerViewModel.PANE;
                    String str5 = financialConnectionsInstitution2.id;
                    pane.getClass();
                    str5.getClass();
                    String str6 = z ? "search.featured_institution_selected" : "search.search_result_selected";
                    FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                    financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), new Pair("institution_id", str5))), str6, true));
                    FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.INSTITUTION_SELECTED, new FinancialConnectionsEvent.Metadata(financialConnectionsInstitution2.name, null, null, 6));
                    FinancialConnectionsManifestRepositoryImpl financialConnectionsManifestRepositoryImpl = institutionPickerViewModel.updateLocalManifest.repository;
                    financialConnectionsManifestRepositoryImpl.getClass();
                    SynchronizeSessionResponse cachedSynchronizeSessionResponse = financialConnectionsManifestRepositoryImpl.getCachedSynchronizeSessionResponse();
                    if (cachedSynchronizeSessionResponse == null || (financialConnectionsSessionManifest2 = cachedSynchronizeSessionResponse.manifest) == null) {
                        i = 4;
                    } else {
                        i = 4;
                        financialConnectionsManifestRepositoryImpl.updateCachedManifest("updateLocalManifest", FinancialConnectionsSessionManifest.copy$default(financialConnectionsSessionManifest2, null, financialConnectionsInstitution2, null, -25165825, 16383));
                    }
                    GetOrFetchSync getOrFetchSync2 = institutionPickerViewModel.getOrFetchSync;
                    this.label = 1;
                    invoke$default2 = GetOrFetchSync.invoke$default(getOrFetchSync2, null, this, 3);
                    break;
                } else if (i5 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    invoke$default2 = obj;
                    i = 4;
                } else if (i5 == 2) {
                    financialConnectionsInstitution2 = (FinancialConnectionsInstitution) this.$activeAuthSession;
                    PostAuthorizationSession postAuthorizationSession2 = (PostAuthorizationSession) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    postAuthorizationSession = postAuthorizationSession2;
                    invoke$default3 = obj;
                    this.this$0 = null;
                    this.$activeAuthSession = null;
                    this.label = 3;
                    invoke = postAuthorizationSession.invoke(financialConnectionsInstitution2, (SynchronizeSessionResponse) invoke$default3, this);
                    break;
                } else {
                    if (i5 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        invoke = obj;
                        FinancialConnectionsSessionManifest.Pane pane2 = InstitutionPickerViewModel.PANE;
                        NavigationManagerImpl.tryNavigateTo$default(institutionPickerViewModel.navigationManager, ((FinancialConnectionsAuthorizationSession) invoke).isOAuth() ? Destination.invoke$default(Destination.PartnerAuthDrawer.INSTANCE, pane2) : Destination.invoke$default(Destination.PartnerAuth.INSTANCE, pane2), null, 6);
                        return Unit.INSTANCE;
                    }
                    if (i5 != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    selectInstitution = obj;
                    i = 4;
                    NavigationManagerImpl.tryNavigateTo$default(institutionPickerViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(((FinancialConnectionsInstitutionSelected) selectInstitution).manifest.nextPane), InstitutionPickerViewModel.PANE), new PopUpToBehavior.Current(), i);
                    return Unit.INSTANCE;
                }
                FinancialConnectionsSessionManifest financialConnectionsSessionManifest3 = ((SynchronizeSessionResponse) invoke$default2).manifest;
                if (!financialConnectionsSessionManifest3.consentRequired || financialConnectionsSessionManifest3.consentAcquiredAt != null) {
                    postAuthorizationSession = institutionPickerViewModel.postAuthorizationSession;
                    GetOrFetchSync getOrFetchSync3 = institutionPickerViewModel.getOrFetchSync;
                    this.this$0 = postAuthorizationSession;
                    this.$activeAuthSession = financialConnectionsInstitution2;
                    this.label = 2;
                    invoke$default3 = GetOrFetchSync.invoke$default(getOrFetchSync3, null, this, 3);
                    break;
                } else {
                    SelectInstitution selectInstitution2 = institutionPickerViewModel.selectInstitution;
                    this.label = i;
                    selectInstitution = selectInstitution2.repository.selectInstitution(selectInstitution2.configuration.financialConnectionsSessionClientSecret, financialConnectionsInstitution2, this);
                    break;
                }
                return coroutineSingletons3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollAuthorizationSessionAccounts$invoke$4(AccountPickerViewModel accountPickerViewModel, Set set, boolean z, Continuation continuation) {
        super(1, continuation);
        this.$activeAuthSession = accountPickerViewModel;
        this.$sync = set;
        this.$canRetry = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollAuthorizationSessionAccounts$invoke$4(InstitutionPickerViewModel institutionPickerViewModel, boolean z, FinancialConnectionsInstitution financialConnectionsInstitution, Continuation continuation) {
        super(1, continuation);
        this.$manifest = institutionPickerViewModel;
        this.$canRetry = z;
        this.$sync = financialConnectionsInstitution;
    }
}
