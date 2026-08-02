package com.stripe.android.financialconnections.features.institutionpicker;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.core.util.Matchers;
import com.google.android.gms.internal.common.zzai;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.FeaturedInstitutions;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.domain.RealHandleError;
import com.stripe.android.financialconnections.domain.SearchInstitutions;
import com.stripe.android.financialconnections.domain.SelectInstitution;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepositoryImpl;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import net.idrnd.face.iad.capture.internal.o0;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class InstitutionPickerViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER;
    public final FinancialConnectionsSheetConfiguration configuration;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final FeaturedInstitutions featuredInstitutions;
    public final GetOrFetchSync getOrFetchSync;
    public final RealHandleError handleError;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final NavigationManagerImpl navigationManager;
    public final PostAuthorizationSession postAuthorizationSession;
    public final SearchInstitutions searchInstitutions;
    public final o0 searchJob;
    public final SelectInstitution selectInstitution;
    public final UpdateLocalManifest updateLocalManifest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerViewModel(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, PostAuthorizationSession postAuthorizationSession, SelectInstitution selectInstitution, GetOrFetchSync getOrFetchSync, SearchInstitutions searchInstitutions, FeaturedInstitutions featuredInstitutions, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, RealHandleError realHandleError, NavigationManagerImpl navigationManagerImpl, UpdateLocalManifest updateLocalManifest, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, InstitutionPickerState institutionPickerState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        super(institutionPickerState, nativeAuthFlowCoordinator);
        financialConnectionsSheetConfiguration.getClass();
        postAuthorizationSession.getClass();
        selectInstitution.getClass();
        getOrFetchSync.getClass();
        searchInstitutions.getClass();
        featuredInstitutions.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        realHandleError.getClass();
        navigationManagerImpl.getClass();
        updateLocalManifest.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        nativeAuthFlowCoordinator.getClass();
        this.configuration = financialConnectionsSheetConfiguration;
        this.postAuthorizationSession = postAuthorizationSession;
        this.selectInstitution = selectInstitution;
        this.getOrFetchSync = getOrFetchSync;
        this.searchInstitutions = searchInstitutions;
        this.featuredInstitutions = featuredInstitutions;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.handleError = realHandleError;
        this.navigationManager = navigationManagerImpl;
        this.updateLocalManifest = updateLocalManifest;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.searchJob = new o0(7);
        Continuation continuation = null;
        onAsync(InstitutionPickerViewModel$logErrors$1.INSTANCE, new InstitutionPickerViewModel$logErrors$2(this, continuation, 0), new InstitutionPickerViewModel$logErrors$2(this, continuation, 1));
        FinancialConnectionsViewModel.onAsync$default(this, InstitutionPickerViewModel$logErrors$4.INSTANCE, null, new InstitutionPickerViewModel$logErrors$2(this, continuation, 2), 2);
        FinancialConnectionsViewModel.onAsync$default(this, InstitutionPickerViewModel$logErrors$6.INSTANCE, null, new InstitutionPickerViewModel$logErrors$2(this, continuation, 3), 2);
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(null), new ExitViewModel$$ExternalSyntheticLambda0(16));
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        InstitutionPickerState institutionPickerState = (InstitutionPickerState) obj;
        institutionPickerState.getClass();
        FinancialConnectionsSessionManifest.Pane pane = institutionPickerState.referrer;
        return new TopAppBarStateUpdate(PANE, pane != FinancialConnectionsSessionManifest.Pane.LINK_LOGIN, zzai.getError(institutionPickerState.payload), pane == null, null, 16);
    }

    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function1 {
        public final /* synthetic */ int $r8$classId = 0;
        public long J$0;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, InstitutionPickerViewModel institutionPickerViewModel, Continuation continuation) {
            super(1, continuation);
            this.L$0 = str;
            InstitutionPickerViewModel.this = institutionPickerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            int i = this.$r8$classId;
            InstitutionPickerViewModel institutionPickerViewModel = InstitutionPickerViewModel.this;
            switch (i) {
                case 0:
                    return institutionPickerViewModel.new AnonymousClass1(continuation);
                default:
                    return new AnonymousClass1((String) this.L$0, institutionPickerViewModel, continuation);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Continuation continuation = (Continuation) obj;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
        
            if (kotlinx.coroutines.JobKt.delay(300, r16) == r7) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:
        
            if (r2 == r1) goto L40;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:36:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x018d  */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object failure;
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
            Throwable m4120exceptionOrNullimpl;
            Object invoke$default;
            Object invoke;
            long j;
            Object execute;
            long j2;
            int i = this.$r8$classId;
            ?? r3 = 1;
            InstitutionPickerViewModel institutionPickerViewModel = InstitutionPickerViewModel.this;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    try {
                    } catch (Throwable th) {
                        Result.Companion companion = Result.Companion;
                        failure = new Result.Failure(th);
                        financialConnectionsSessionManifest = r3;
                    }
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        GetOrFetchSync getOrFetchSync = institutionPickerViewModel.getOrFetchSync;
                        this.label = 1;
                        invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, this, 3);
                        break;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j = this.J$0;
                            FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            invoke = obj;
                            r3 = financialConnectionsSessionManifest2;
                            failure = new Pair((InstitutionResponse) invoke, new Long(System.currentTimeMillis() - j));
                            Result.Companion companion2 = Result.Companion;
                            financialConnectionsSessionManifest = r3;
                            m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                            if (m4120exceptionOrNullimpl != null) {
                                Matchers.logError(institutionPickerViewModel.eventTracker, "Error fetching featured institutions", m4120exceptionOrNullimpl, institutionPickerViewModel.logger, InstitutionPickerViewModel.PANE);
                            }
                            if (Result.m4120exceptionOrNullimpl(failure) != null) {
                                failure = new Pair(new InstitutionResponse(Boolean.valueOf(financialConnectionsSessionManifest.allowManualEntry), EmptyList.INSTANCE), new Long(0L));
                            }
                            Pair pair = (Pair) failure;
                            return new InstitutionPickerState.Payload((InstitutionResponse) pair.first, financialConnectionsSessionManifest.institutionSearchDisabled, ((Number) pair.second).longValue());
                        }
                        SafeTrace.throwOnFailure(obj);
                        invoke$default = obj;
                    }
                    FinancialConnectionsSessionManifest financialConnectionsSessionManifest3 = ((SynchronizeSessionResponse) invoke$default).manifest;
                    Result.Companion companion3 = Result.Companion;
                    long currentTimeMillis = System.currentTimeMillis();
                    FeaturedInstitutions featuredInstitutions = institutionPickerViewModel.featuredInstitutions;
                    String str = institutionPickerViewModel.configuration.financialConnectionsSessionClientSecret;
                    this.L$0 = financialConnectionsSessionManifest3;
                    this.J$0 = currentTimeMillis;
                    this.label = 2;
                    invoke = featuredInstitutions.invoke(str, this);
                    if (invoke != coroutineSingletons) {
                        j = currentTimeMillis;
                        r3 = financialConnectionsSessionManifest3;
                        failure = new Pair((InstitutionResponse) invoke, new Long(System.currentTimeMillis() - j));
                        Result.Companion companion22 = Result.Companion;
                        financialConnectionsSessionManifest = r3;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        if (Result.m4120exceptionOrNullimpl(failure) != null) {
                        }
                        Pair pair2 = (Pair) failure;
                        return new InstitutionPickerState.Payload((InstitutionResponse) pair2.first, financialConnectionsSessionManifest.institutionSearchDisabled, ((Number) pair2.second).longValue());
                    }
                    return coroutineSingletons;
                default:
                    String str2 = (String) this.L$0;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (!StringsKt.isBlank(str2)) {
                            this.label = 1;
                            break;
                        } else {
                            return new InstitutionResponse(Boolean.FALSE, EmptyList.INSTANCE);
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j2 = this.J$0;
                            SafeTrace.throwOnFailure(obj);
                            execute = obj;
                            InstitutionResponse institutionResponse = (InstitutionResponse) execute;
                            long longValue = new Long(System.currentTimeMillis() - j2).longValue();
                            FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = institutionPickerViewModel.eventTracker;
                            FinancialConnectionsSessionManifest.Pane pane = InstitutionPickerViewModel.PANE;
                            int size = institutionResponse.data.size();
                            pane.getClass();
                            str2.getClass();
                            FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                            financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.SearchScroll(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane)), new Pair("query", str2), new Pair("duration", String.valueOf(longValue)), new Pair("result_count", String.valueOf(size)))), "search.succeeded", true));
                            FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.SEARCH_INITIATED, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
                            return institutionResponse;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    SearchInstitutions searchInstitutions = institutionPickerViewModel.searchInstitutions;
                    String str3 = institutionPickerViewModel.configuration.financialConnectionsSessionClientSecret;
                    this.J$0 = currentTimeMillis2;
                    this.label = 2;
                    FinancialConnectionsInstitutionsRepositoryImpl financialConnectionsInstitutionsRepositoryImpl = searchInstitutions.repository;
                    execute = financialConnectionsInstitutionsRepositoryImpl.requestExecutor.execute(ApiRequest.Factory.createGet$default(financialConnectionsInstitutionsRepositoryImpl.apiRequestFactory, "https://api.stripe.com/v1/connections/institutions", financialConnectionsInstitutionsRepositoryImpl.provideApiRequestOptions.invoke(true), MapsKt__MapsKt.mapOf(new Pair("client_secret", str3), new Pair("query", str2), new Pair("limit", new Integer(10)))), InstitutionResponse.Companion.serializer(), this);
                    if (execute != coroutineSingletons2) {
                        j2 = currentTimeMillis2;
                        InstitutionResponse institutionResponse2 = (InstitutionResponse) execute;
                        long longValue2 = new Long(System.currentTimeMillis() - j2).longValue();
                        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl2 = institutionPickerViewModel.eventTracker;
                        FinancialConnectionsSessionManifest.Pane pane2 = InstitutionPickerViewModel.PANE;
                        int size2 = institutionResponse2.data.size();
                        pane2.getClass();
                        str2.getClass();
                        FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
                        financialConnectionsAnalyticsTrackerImpl2.track(new FinancialConnectionsAnalyticsEvent.SearchScroll(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane2)), new Pair("query", str2), new Pair("duration", String.valueOf(longValue2)), new Pair("result_count", String.valueOf(size2)))), "search.succeeded", true));
                        FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.SEARCH_INITIATED, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
                        return institutionResponse2;
                    }
                    return coroutineSingletons2;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(1, continuation);
        }
    }
}
