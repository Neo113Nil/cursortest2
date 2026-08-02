package com.stripe.android.financialconnections.features.partnerauth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.lifecycle.ViewModelKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.trace.core.util.Matchers;
import com.google.android.gms.internal.common.zzai;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.work.presenters.shift.RealClockInRepository$updateNote$2;
import com.squareup.scannerview.TextSetter;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.core.model.Country;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.AuthSessionEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.domain.CancelAuthorizationSession;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.domain.RealHandleError;
import com.stripe.android.financialconnections.exception.WebAuthFlowFailedException;
import com.stripe.android.financialconnections.features.notice.RealPresentSheet;
import com.stripe.android.financialconnections.features.partnerauth.SharedPartnerAuthState;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.MixedOAuthParams;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepositoryImpl;
import com.stripe.android.financialconnections.utils.ErrorsKt;
import com.stripe.android.financialconnections.utils.PollTimingOptions;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import com.stripe.attestation.RealStandardIntegrityManagerFactory;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Date;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class PartnerAuthViewModel extends FinancialConnectionsViewModel {
    public final String applicationId;
    public final RealStandardIntegrityManagerFactory browserManager;
    public final CancelAuthorizationSession cancelAuthorizationSession;
    public final CancelAuthorizationSession completeAuthorizationSession;
    public final PostAuthorizationSession createAuthorizationSession;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final GetOrFetchSync getOrFetchSync;
    public final RealHandleError handleError;
    public final SharedPartnerAuthState initialState;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final NavigationManagerImpl navigationManager;
    public final CoreAuthorizationPendingNetworkingRepairRepository pendingRepairRepository;
    public final ToolbarTuckTargets pollAuthorizationSessionOAuthResults;
    public final TextSetter postAuthSessionEvent;
    public final RealPresentSheet presentSheet;
    public final TextSetter repairAuthSession;
    public final CancelAuthorizationSession retrieveAuthorizationSession;
    public final UriUtils uriUtils;

    public final class Args implements Parcelable {
        public static final Parcelable.Creator<Args> CREATOR = new Country.Creator(14);
        public final boolean inModal;
        public final FinancialConnectionsSessionManifest.Pane pane;

        public Args(boolean z, FinancialConnectionsSessionManifest.Pane pane) {
            pane.getClass();
            this.inModal = z;
            this.pane = pane;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Args)) {
                return false;
            }
            Args args = (Args) obj;
            return this.inModal == args.inModal && this.pane == args.pane;
        }

        public final int hashCode() {
            return this.pane.hashCode() + (Boolean.hashCode(this.inModal) * 31);
        }

        public final String toString() {
            return "Args(inModal=" + this.inModal + ", pane=" + this.pane + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.inModal ? 1 : 0);
            parcel.writeString(this.pane.name());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthViewModel(CancelAuthorizationSession cancelAuthorizationSession, PostAuthorizationSession postAuthorizationSession, CancelAuthorizationSession cancelAuthorizationSession2, CancelAuthorizationSession cancelAuthorizationSession3, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, String str, UriUtils uriUtils, TextSetter textSetter, GetOrFetchSync getOrFetchSync, RealStandardIntegrityManagerFactory realStandardIntegrityManagerFactory, RealHandleError realHandleError, NavigationManagerImpl navigationManagerImpl, ToolbarTuckTargets toolbarTuckTargets, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, RealPresentSheet realPresentSheet, CoreAuthorizationPendingNetworkingRepairRepository coreAuthorizationPendingNetworkingRepairRepository, TextSetter textSetter2, SharedPartnerAuthState sharedPartnerAuthState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        super(sharedPartnerAuthState, nativeAuthFlowCoordinator);
        cancelAuthorizationSession.getClass();
        postAuthorizationSession.getClass();
        cancelAuthorizationSession2.getClass();
        cancelAuthorizationSession3.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        str.getClass();
        uriUtils.getClass();
        textSetter.getClass();
        getOrFetchSync.getClass();
        realStandardIntegrityManagerFactory.getClass();
        realHandleError.getClass();
        navigationManagerImpl.getClass();
        toolbarTuckTargets.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        realPresentSheet.getClass();
        coreAuthorizationPendingNetworkingRepairRepository.getClass();
        textSetter2.getClass();
        nativeAuthFlowCoordinator.getClass();
        this.completeAuthorizationSession = cancelAuthorizationSession;
        this.createAuthorizationSession = postAuthorizationSession;
        this.cancelAuthorizationSession = cancelAuthorizationSession2;
        this.retrieveAuthorizationSession = cancelAuthorizationSession3;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.applicationId = str;
        this.uriUtils = uriUtils;
        this.postAuthSessionEvent = textSetter;
        this.getOrFetchSync = getOrFetchSync;
        this.browserManager = realStandardIntegrityManagerFactory;
        this.handleError = realHandleError;
        this.navigationManager = navigationManagerImpl;
        this.pollAuthorizationSessionOAuthResults = toolbarTuckTargets;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.presentSheet = realPresentSheet;
        this.pendingRepairRepository = coreAuthorizationPendingNetworkingRepairRepository;
        this.repairAuthSession = textSetter2;
        this.initialState = sharedPartnerAuthState;
        Continuation continuation = null;
        onAsync(PartnerAuthViewModel$handleErrors$1.INSTANCE, new CameraHelper$unbind$2(this, continuation, 17), new PartnerAuthViewModel$handleErrors$3(this, continuation, 0));
        FinancialConnectionsViewModel.onAsync$default(this, PartnerAuthViewModel$handleErrors$4.INSTANCE, null, new PartnerAuthViewModel$handleErrors$3(this, continuation, 1), 2);
        FinancialConnectionsViewModel.onAsync$default(this, PartnerAuthViewModel$launchBrowserIfNonOauth$1.INSTANCE, new PartnerAuthViewModel$handleErrors$3(this, continuation, 2), null, 4);
        FinancialConnectionsViewModel.execute$default(this, new WebRtcWorker$run$1.AnonymousClass1(this, continuation, 8), new PhoneNumberController$$ExternalSyntheticLambda5(12));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(7:12|13|14|15|(2:17|(1:18))|22|23)(2:25|26))(3:27|28|29))(3:32|33|34))(5:49|50|(1:51)|55|(2:57|31)(1:58))|35|(1:37)(1:48)|38|(2:40|(3:42|(2:44|31)|29)(6:45|14|15|(0)|22|23))(2:46|47)))|61|6|7|(0)(0)|35|(0)(0)|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011c, code lost:
    
        if (r1 != r7) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0158, code lost:
    
        r1 = kotlin.Result.Companion;
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:12:0x0038, B:13:0x011f, B:14:0x013b, B:28:0x004a, B:29:0x0102, B:33:0x0053, B:35:0x0093, B:37:0x009d, B:38:0x00a1, B:40:0x00ad, B:42:0x00c4, B:45:0x0133, B:46:0x014b, B:47:0x0152, B:50:0x005b, B:51:0x005d, B:55:0x007d), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:12:0x0038, B:13:0x011f, B:14:0x013b, B:28:0x004a, B:29:0x0102, B:33:0x0053, B:35:0x0093, B:37:0x009d, B:38:0x00a1, B:40:0x00ad, B:42:0x00c4, B:45:0x0133, B:46:0x014b, B:47:0x0152, B:50:0x005b, B:51:0x005d, B:55:0x007d), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b A[Catch: all -> 0x003d, TryCatch #0 {all -> 0x003d, blocks: (B:12:0x0038, B:13:0x011f, B:14:0x013b, B:28:0x004a, B:29:0x0102, B:33:0x0053, B:35:0x0093, B:37:0x009d, B:38:0x00a1, B:40:0x00ad, B:42:0x00c4, B:45:0x0133, B:46:0x014b, B:47:0x0152, B:50:0x005b, B:51:0x005d, B:55:0x007d), top: B:7:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$completeAuthorizationSession(PartnerAuthViewModel partnerAuthViewModel, String str, ContinuationImpl continuationImpl) {
        PartnerAuthViewModel$completeAuthorizationSession$1 partnerAuthViewModel$completeAuthorizationSession$1;
        int i;
        Throwable m4120exceptionOrNullimpl;
        Object value;
        SharedPartnerAuthState sharedPartnerAuthState;
        Object value2;
        SharedPartnerAuthState sharedPartnerAuthState2;
        String str2;
        int i2;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
        String invoke$default;
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = partnerAuthViewModel.eventTracker;
        StateFlowImpl stateFlowImpl = partnerAuthViewModel._stateFlow;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = partnerAuthViewModel.logger;
        SharedPartnerAuthState sharedPartnerAuthState3 = partnerAuthViewModel.initialState;
        if (continuationImpl instanceof PartnerAuthViewModel$completeAuthorizationSession$1) {
            partnerAuthViewModel$completeAuthorizationSession$1 = (PartnerAuthViewModel$completeAuthorizationSession$1) continuationImpl;
            int i3 = partnerAuthViewModel$completeAuthorizationSession$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                partnerAuthViewModel$completeAuthorizationSession$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = partnerAuthViewModel$completeAuthorizationSession$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerAuthViewModel$completeAuthorizationSession$1.label;
                int i4 = 2;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    do {
                        value2 = stateFlowImpl.getValue();
                        sharedPartnerAuthState2 = (SharedPartnerAuthState) value2;
                        sharedPartnerAuthState2.getClass();
                    } while (!stateFlowImpl.compareAndSet(value2, SharedPartnerAuthState.copy$default(sharedPartnerAuthState2, null, null, new Async.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.Action.AUTHENTICATING)), 23)));
                    GetOrFetchSync getOrFetchSync = partnerAuthViewModel.getOrFetchSync;
                    GetOrFetchSync.RefetchCondition.IfMissingActiveAuthSession ifMissingActiveAuthSession = GetOrFetchSync.RefetchCondition.IfMissingActiveAuthSession.INSTANCE;
                    str2 = str;
                    partnerAuthViewModel$completeAuthorizationSession$1.L$0 = str2;
                    partnerAuthViewModel$completeAuthorizationSession$1.I$0 = 0;
                    partnerAuthViewModel$completeAuthorizationSession$1.label = 1;
                    obj = GetOrFetchSync.invoke$default(getOrFetchSync, ifMissingActiveAuthSession, partnerAuthViewModel$completeAuthorizationSession$1, 2);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i2 = 0;
                } else if (i == 1) {
                    i2 = partnerAuthViewModel$completeAuthorizationSession$1.I$0;
                    String str3 = partnerAuthViewModel$completeAuthorizationSession$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str2 = str3;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        logger$Companion$NOOP_LOGGER$1.debug("Session authorized!");
                        invoke$default = Destination.invoke$default(DestinationMappersKt.getDestination(((FinancialConnectionsAuthorizationSession) obj).nextPane), sharedPartnerAuthState3.pane);
                        FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.INSTITUTION_AUTHORIZED, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
                        NavigationManagerImpl.tryNavigateTo$default(partnerAuthViewModel.navigationManager, invoke$default, null, 6);
                        Object failure = Unit.INSTANCE;
                        Result.Companion companion2 = Result.Companion;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                            Matchers.logError(financialConnectionsAnalyticsTrackerImpl, "failed authorizing session", m4120exceptionOrNullimpl, logger$Companion$NOOP_LOGGER$1, sharedPartnerAuthState3.pane);
                            do {
                                value = stateFlowImpl.getValue();
                                sharedPartnerAuthState = (SharedPartnerAuthState) value;
                                sharedPartnerAuthState.getClass();
                            } while (!stateFlowImpl.compareAndSet(value, SharedPartnerAuthState.copy$default(sharedPartnerAuthState, null, null, new Async.Fail(m4120exceptionOrNullimpl), 23)));
                        }
                        return Unit.INSTANCE;
                    }
                    i2 = partnerAuthViewModel$completeAuthorizationSession$1.I$0;
                    financialConnectionsAuthorizationSession = partnerAuthViewModel$completeAuthorizationSession$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    logger$Companion$NOOP_LOGGER$1.debug("OAuth results received! completing session");
                    CancelAuthorizationSession cancelAuthorizationSession = partnerAuthViewModel.completeAuthorizationSession;
                    String str4 = financialConnectionsAuthorizationSession.id;
                    String str5 = ((MixedOAuthParams) obj).publicToken;
                    partnerAuthViewModel$completeAuthorizationSession$1.L$0 = null;
                    partnerAuthViewModel$completeAuthorizationSession$1.L$1 = null;
                    partnerAuthViewModel$completeAuthorizationSession$1.I$0 = i2;
                    partnerAuthViewModel$completeAuthorizationSession$1.label = 3;
                    obj = cancelAuthorizationSession.invoke(str4, str5, partnerAuthViewModel$completeAuthorizationSession$1);
                }
                financialConnectionsAuthorizationSession = ((SynchronizeSessionResponse) obj).manifest.activeAuthSession;
                financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(sharedPartnerAuthState3.pane, str2, "success", financialConnectionsAuthorizationSession == null ? financialConnectionsAuthorizationSession.id : null));
                if (financialConnectionsAuthorizationSession != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                partnerAuthViewModel.postAuthSessionEvent.invoke(financialConnectionsAuthorizationSession.id, new AuthSessionEvent.Success(new Date()));
                if (!financialConnectionsAuthorizationSession.isOAuth()) {
                    invoke$default = Destination.invoke$default(Destination.AccountPicker.INSTANCE, sharedPartnerAuthState3.pane);
                    FinancialConnections.m4012emitEventgIAlus$financial_connections_release(FinancialConnectionsEvent.Name.INSTITUTION_AUTHORIZED, new FinancialConnectionsEvent.Metadata(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7));
                    NavigationManagerImpl.tryNavigateTo$default(partnerAuthViewModel.navigationManager, invoke$default, null, 6);
                    Object failure2 = Unit.INSTANCE;
                    Result.Companion companion22 = Result.Companion;
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
                    if (m4120exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                logger$Companion$NOOP_LOGGER$1.debug("Web AuthFlow completed! waiting for oauth results");
                ToolbarTuckTargets toolbarTuckTargets = partnerAuthViewModel.pollAuthorizationSessionOAuthResults;
                partnerAuthViewModel$completeAuthorizationSession$1.L$0 = null;
                partnerAuthViewModel$completeAuthorizationSession$1.L$1 = financialConnectionsAuthorizationSession;
                partnerAuthViewModel$completeAuthorizationSession$1.I$0 = i2;
                partnerAuthViewModel$completeAuthorizationSession$1.label = 2;
                toolbarTuckTargets.getClass();
                Duration.Companion companion3 = Duration.Companion;
                obj = ErrorsKt.retryOnException(new PollTimingOptions(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0L, Duration.m4167getInWholeMillisecondsimpl(DurationKt.toDuration(2, DurationUnit.SECONDS))), new RealSheetState$peek$3.AnonymousClass2(i4, continuation, 13), new RealMRIFactory$sign$2.AnonymousClass1(toolbarTuckTargets, financialConnectionsAuthorizationSession, continuation, 24), partnerAuthViewModel$completeAuthorizationSession$1);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                logger$Companion$NOOP_LOGGER$1.debug("OAuth results received! completing session");
                CancelAuthorizationSession cancelAuthorizationSession2 = partnerAuthViewModel.completeAuthorizationSession;
                String str42 = financialConnectionsAuthorizationSession.id;
                String str52 = ((MixedOAuthParams) obj).publicToken;
                partnerAuthViewModel$completeAuthorizationSession$1.L$0 = null;
                partnerAuthViewModel$completeAuthorizationSession$1.L$1 = null;
                partnerAuthViewModel$completeAuthorizationSession$1.I$0 = i2;
                partnerAuthViewModel$completeAuthorizationSession$1.label = 3;
                obj = cancelAuthorizationSession2.invoke(str42, str52, partnerAuthViewModel$completeAuthorizationSession$1);
            }
        }
        partnerAuthViewModel$completeAuthorizationSession$1 = new PartnerAuthViewModel$completeAuthorizationSession$1(partnerAuthViewModel, continuationImpl);
        Object obj2 = partnerAuthViewModel$completeAuthorizationSession$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerAuthViewModel$completeAuthorizationSession$1.label;
        int i42 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        financialConnectionsAuthorizationSession = ((SynchronizeSessionResponse) obj2).manifest.activeAuthSession;
        financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(sharedPartnerAuthState3.pane, str2, "success", financialConnectionsAuthorizationSession == null ? financialConnectionsAuthorizationSession.id : null));
        if (financialConnectionsAuthorizationSession != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$initializeBankAuthRepair(PartnerAuthViewModel partnerAuthViewModel, SynchronizeSessionResponse synchronizeSessionResponse, ContinuationImpl continuationImpl) {
        PartnerAuthViewModel$initializeBankAuthRepair$1 partnerAuthViewModel$initializeBankAuthRepair$1;
        int i;
        FinancialConnectionsInstitution financialConnectionsInstitution;
        if (continuationImpl instanceof PartnerAuthViewModel$initializeBankAuthRepair$1) {
            partnerAuthViewModel$initializeBankAuthRepair$1 = (PartnerAuthViewModel$initializeBankAuthRepair$1) continuationImpl;
            int i2 = partnerAuthViewModel$initializeBankAuthRepair$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                partnerAuthViewModel$initializeBankAuthRepair$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = partnerAuthViewModel$initializeBankAuthRepair$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerAuthViewModel$initializeBankAuthRepair$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CoreAuthorizationPendingNetworkingRepairRepository.State state = (CoreAuthorizationPendingNetworkingRepairRepository.State) partnerAuthViewModel.pendingRepairRepository.get();
                    String str = state != null ? state.coreAuthorization : null;
                    if (str == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    FinancialConnectionsInstitution financialConnectionsInstitution2 = synchronizeSessionResponse.manifest.activeInstitution;
                    if (financialConnectionsInstitution2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    TextSetter textSetter = partnerAuthViewModel.repairAuthSession;
                    partnerAuthViewModel$initializeBankAuthRepair$1.L$0 = synchronizeSessionResponse;
                    partnerAuthViewModel$initializeBankAuthRepair$1.L$2 = financialConnectionsInstitution2;
                    partnerAuthViewModel$initializeBankAuthRepair$1.label = 1;
                    obj = ((FinancialConnectionsManifestRepositoryImpl) textSetter.textView).repairAuthorizationSession(((FinancialConnectionsSheetConfiguration) textSetter.textSwitcher).financialConnectionsSessionClientSecret, str, (String) textSetter.scannerText, partnerAuthViewModel$initializeBankAuthRepair$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    financialConnectionsInstitution = financialConnectionsInstitution2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    financialConnectionsInstitution = partnerAuthViewModel$initializeBankAuthRepair$1.L$2;
                    synchronizeSessionResponse = partnerAuthViewModel$initializeBankAuthRepair$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) obj;
                Boolean bool = synchronizeSessionResponse.manifest.isStripeDirect;
                return new SharedPartnerAuthState.Payload(bool == null ? bool.booleanValue() : false, financialConnectionsInstitution, financialConnectionsAuthorizationSession);
            }
        }
        partnerAuthViewModel$initializeBankAuthRepair$1 = new PartnerAuthViewModel$initializeBankAuthRepair$1(partnerAuthViewModel, continuationImpl);
        Object obj2 = partnerAuthViewModel$initializeBankAuthRepair$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerAuthViewModel$initializeBankAuthRepair$1.label;
        if (i != 0) {
        }
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) obj2;
        Boolean bool2 = synchronizeSessionResponse.manifest.isStripeDirect;
        return new SharedPartnerAuthState.Payload(bool2 == null ? bool2.booleanValue() : false, financialConnectionsInstitution, financialConnectionsAuthorizationSession2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$initializePartnerAuth(PartnerAuthViewModel partnerAuthViewModel, SynchronizeSessionResponse synchronizeSessionResponse, ContinuationImpl continuationImpl) {
        PartnerAuthViewModel$initializePartnerAuth$1 partnerAuthViewModel$initializePartnerAuth$1;
        int i;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2;
        FinancialConnectionsInstitution financialConnectionsInstitution;
        if (continuationImpl instanceof PartnerAuthViewModel$initializePartnerAuth$1) {
            partnerAuthViewModel$initializePartnerAuth$1 = (PartnerAuthViewModel$initializePartnerAuth$1) continuationImpl;
            int i2 = partnerAuthViewModel$initializePartnerAuth$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                partnerAuthViewModel$initializePartnerAuth$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = partnerAuthViewModel$initializePartnerAuth$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerAuthViewModel$initializePartnerAuth$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    financialConnectionsSessionManifest = synchronizeSessionResponse.manifest;
                    financialConnectionsAuthorizationSession = financialConnectionsSessionManifest.activeAuthSession;
                    if (financialConnectionsAuthorizationSession == null) {
                        PostAuthorizationSession postAuthorizationSession = partnerAuthViewModel.createAuthorizationSession;
                        FinancialConnectionsInstitution financialConnectionsInstitution2 = financialConnectionsSessionManifest.activeInstitution;
                        if (financialConnectionsInstitution2 == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return null;
                        }
                        partnerAuthViewModel$initializePartnerAuth$1.L$1 = financialConnectionsSessionManifest;
                        partnerAuthViewModel$initializePartnerAuth$1.label = 1;
                        Object invoke = postAuthorizationSession.invoke(financialConnectionsInstitution2, synchronizeSessionResponse, partnerAuthViewModel$initializePartnerAuth$1);
                        if (invoke == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = invoke;
                        financialConnectionsSessionManifest2 = financialConnectionsSessionManifest;
                    }
                    Boolean bool = financialConnectionsSessionManifest.isStripeDirect;
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    financialConnectionsInstitution = financialConnectionsSessionManifest.activeInstitution;
                    if (financialConnectionsInstitution != null) {
                        return new SharedPartnerAuthState.Payload(booleanValue, financialConnectionsInstitution, financialConnectionsAuthorizationSession);
                    }
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                financialConnectionsSessionManifest2 = partnerAuthViewModel$initializePartnerAuth$1.L$1;
                SafeTrace.throwOnFailure(obj);
                financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) obj;
                financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
                Boolean bool2 = financialConnectionsSessionManifest.isStripeDirect;
                if (bool2 != null) {
                }
                financialConnectionsInstitution = financialConnectionsSessionManifest.activeInstitution;
                if (financialConnectionsInstitution != null) {
                }
            }
        }
        partnerAuthViewModel$initializePartnerAuth$1 = new PartnerAuthViewModel$initializePartnerAuth$1(partnerAuthViewModel, continuationImpl);
        Object obj2 = partnerAuthViewModel$initializePartnerAuth$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerAuthViewModel$initializePartnerAuth$1.label;
        if (i != 0) {
        }
        financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) obj2;
        financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
        Boolean bool22 = financialConnectionsSessionManifest.isStripeDirect;
        if (bool22 != null) {
        }
        financialConnectionsInstitution = financialConnectionsSessionManifest.activeInstitution;
        if (financialConnectionsInstitution != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(10:(1:(1:13)(2:36|37))(1:38)|14|15|16|17|18|19|(2:21|(2:22|(1:25)(1:24)))(0)|26|27)(16:39|40|41|42|43|44|45|46|(2:48|(2:50|51))(1:53)|52|17|18|19|(0)(0)|26|27))(2:59|60))(8:84|85|86|(2:87|(1:90)(1:89))|91|92|93|(2:95|51)(1:96))|61|(1:63)(1:83)|(1:65)(1:82)|66|(4:68|(1:70)(1:78)|(2:72|(1:74)(15:75|41|42|43|44|45|46|(0)(0)|52|17|18|19|(0)(0)|26|27))(1:76)|51)(3:79|80|81)))|104|6|7|(0)(0)|61|(0)(0)|(0)(0)|66|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0064, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x014d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0188, code lost:
    
        if (r19.cancelAuthSessionAndContinue(r12, r6) == r7) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c A[Catch: all -> 0x014d, TryCatch #4 {all -> 0x014d, blocks: (B:46:0x0119, B:48:0x013c, B:53:0x014f, B:76:0x0176, B:80:0x0197, B:81:0x019e), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014f A[Catch: all -> 0x014d, TryCatch #4 {all -> 0x014d, blocks: (B:46:0x0119, B:48:0x013c, B:53:0x014f, B:76:0x0176, B:80:0x0197, B:81:0x019e), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5 A[Catch: all -> 0x0064, TryCatch #3 {all -> 0x0064, blocks: (B:40:0x005f, B:41:0x00ff, B:60:0x006f, B:61:0x00b3, B:65:0x00c5, B:66:0x00c9, B:68:0x00d5, B:70:0x00d9, B:72:0x00e9, B:93:0x00a3), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d5 A[Catch: all -> 0x0064, TryCatch #3 {all -> 0x0064, blocks: (B:40:0x005f, B:41:0x00ff, B:60:0x006f, B:61:0x00b3, B:65:0x00c5, B:66:0x00c9, B:68:0x00d5, B:70:0x00d9, B:72:0x00e9, B:93:0x00a3), top: B:7:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel, com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$onAuthCancelled(PartnerAuthViewModel partnerAuthViewModel, String str, ContinuationImpl continuationImpl) {
        PartnerAuthViewModel$onAuthCancelled$1 partnerAuthViewModel$onAuthCancelled$1;
        int i;
        StateFlowImpl stateFlowImpl;
        boolean z;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1;
        Object failure;
        String str2;
        Throwable m4120exceptionOrNullimpl;
        int i2;
        String str3;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2;
        String str4;
        FinancialConnectionsSessionManifest.Pane pane;
        StateFlowImpl stateFlowImpl2 = partnerAuthViewModel._stateFlow;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$12 = partnerAuthViewModel.logger;
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = partnerAuthViewModel.eventTracker;
        SharedPartnerAuthState sharedPartnerAuthState = partnerAuthViewModel.initialState;
        if (continuationImpl instanceof PartnerAuthViewModel$onAuthCancelled$1) {
            partnerAuthViewModel$onAuthCancelled$1 = (PartnerAuthViewModel$onAuthCancelled$1) continuationImpl;
            int i3 = partnerAuthViewModel$onAuthCancelled$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                partnerAuthViewModel$onAuthCancelled$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = partnerAuthViewModel$onAuthCancelled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerAuthViewModel$onAuthCancelled$1.label;
                int i4 = 0;
                ?? r11 = 4;
                ?? r112 = 4;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    try {
                        Result.Companion companion = Result.Companion;
                        logger$Companion$NOOP_LOGGER$12.debug("Auth cancelled, cancelling AuthSession");
                        while (true) {
                            Object value = stateFlowImpl2.getValue();
                            SharedPartnerAuthState sharedPartnerAuthState2 = (SharedPartnerAuthState) value;
                            sharedPartnerAuthState2.getClass();
                            if (stateFlowImpl2.compareAndSet(value, SharedPartnerAuthState.copy$default(sharedPartnerAuthState2, null, null, new Async.Loading(new SharedPartnerAuthState.AuthenticationStatus(SharedPartnerAuthState.AuthenticationStatus.Action.AUTHENTICATING)), 23))) {
                                break;
                            }
                            i4 = 0;
                        }
                        GetOrFetchSync getOrFetchSync = partnerAuthViewModel.getOrFetchSync;
                        GetOrFetchSync.RefetchCondition.IfMissingActiveAuthSession ifMissingActiveAuthSession = GetOrFetchSync.RefetchCondition.IfMissingActiveAuthSession.INSTANCE;
                        String str5 = str;
                        partnerAuthViewModel$onAuthCancelled$1.L$0 = str5;
                        partnerAuthViewModel$onAuthCancelled$1.I$0 = i4;
                        partnerAuthViewModel$onAuthCancelled$1.label = 1;
                        obj = GetOrFetchSync.invoke$default(getOrFetchSync, ifMissingActiveAuthSession, partnerAuthViewModel$onAuthCancelled$1, 2);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        i2 = i4;
                        str3 = str5;
                    } catch (Throwable th) {
                        th = th;
                        r11 = str;
                        stateFlowImpl = stateFlowImpl2;
                        z = r11;
                        logger$Companion$NOOP_LOGGER$1 = logger$Companion$NOOP_LOGGER$12;
                        r112 = z;
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                        str2 = r112;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                str2 = partnerAuthViewModel$onAuthCancelled$1.L$0;
                            } else {
                                if (i != 4) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                str2 = partnerAuthViewModel$onAuthCancelled$1.L$0;
                            }
                            try {
                                SafeTrace.throwOnFailure(obj);
                                stateFlowImpl = stateFlowImpl2;
                                logger$Companion$NOOP_LOGGER$1 = logger$Companion$NOOP_LOGGER$12;
                                try {
                                    failure = Unit.INSTANCE;
                                    Result.Companion companion3 = Result.Companion;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r112 = str2;
                                    Result.Companion companion22 = Result.Companion;
                                    failure = new Result.Failure(th);
                                    str2 = r112;
                                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                                    if (m4120exceptionOrNullimpl != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                stateFlowImpl = stateFlowImpl2;
                                logger$Companion$NOOP_LOGGER$1 = logger$Companion$NOOP_LOGGER$12;
                                r112 = str2;
                                Result.Companion companion222 = Result.Companion;
                                failure = new Result.Failure(th);
                                str2 = r112;
                                m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                                if (m4120exceptionOrNullimpl != null) {
                                }
                                return Unit.INSTANCE;
                            }
                            m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                            if (m4120exceptionOrNullimpl != null) {
                                Matchers.logError(financialConnectionsAnalyticsTrackerImpl, Recorder$$ExternalSyntheticOutline2.m("failed cancelling session after cancelled web flow. url: ", str2), m4120exceptionOrNullimpl, logger$Companion$NOOP_LOGGER$1, sharedPartnerAuthState.pane);
                                while (true) {
                                    Object value2 = stateFlowImpl.getValue();
                                    SharedPartnerAuthState sharedPartnerAuthState3 = (SharedPartnerAuthState) value2;
                                    sharedPartnerAuthState3.getClass();
                                    StateFlowImpl stateFlowImpl3 = stateFlowImpl;
                                    if (stateFlowImpl3.compareAndSet(value2, SharedPartnerAuthState.copy$default(sharedPartnerAuthState3, null, null, new Async.Fail(m4120exceptionOrNullimpl), 23))) {
                                        break;
                                    }
                                    stateFlowImpl = stateFlowImpl3;
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        i2 = partnerAuthViewModel$onAuthCancelled$1.I$0;
                        financialConnectionsAuthorizationSession2 = partnerAuthViewModel$onAuthCancelled$1.L$2;
                        String str6 = partnerAuthViewModel$onAuthCancelled$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        r11 = str6;
                        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession3 = (FinancialConnectionsAuthorizationSession) obj;
                        pane = financialConnectionsAuthorizationSession3.nextPane;
                        String str7 = financialConnectionsAuthorizationSession3.id;
                        pane.getClass();
                        str7.getClass();
                        stateFlowImpl = stateFlowImpl2;
                        try {
                            logger$Companion$NOOP_LOGGER$1 = logger$Companion$NOOP_LOGGER$12;
                            financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("next_pane", pane.getValue()), new Pair("auth_session_id", str7))), "auth_session.retrieved", true));
                            if (pane != sharedPartnerAuthState.pane) {
                                partnerAuthViewModel$onAuthCancelled$1.L$0 = r11;
                                partnerAuthViewModel$onAuthCancelled$1.L$2 = null;
                                partnerAuthViewModel$onAuthCancelled$1.I$0 = i2;
                                partnerAuthViewModel$onAuthCancelled$1.label = 3;
                                str4 = r11;
                                if (partnerAuthViewModel.cancelAuthSessionAndContinue(financialConnectionsAuthorizationSession3, partnerAuthViewModel$onAuthCancelled$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                partnerAuthViewModel.postAuthSessionEvent.invoke(financialConnectionsAuthorizationSession2.id, new AuthSessionEvent.Success(new Date()));
                                NavigationManagerImpl.tryNavigateTo$default(partnerAuthViewModel.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(pane), sharedPartnerAuthState.pane), null, 6);
                                str4 = r11;
                            }
                            str2 = str4;
                            failure = Unit.INSTANCE;
                            Result.Companion companion32 = Result.Companion;
                        } catch (Throwable th4) {
                            th = th4;
                            z = r11;
                            logger$Companion$NOOP_LOGGER$1 = logger$Companion$NOOP_LOGGER$12;
                            r112 = z;
                            Result.Companion companion2222 = Result.Companion;
                            failure = new Result.Failure(th);
                            str2 = r112;
                            m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                            if (m4120exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    i2 = partnerAuthViewModel$onAuthCancelled$1.I$0;
                    String str8 = partnerAuthViewModel$onAuthCancelled$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str3 = str8;
                }
                FinancialConnectionsSessionManifest financialConnectionsSessionManifest = ((SynchronizeSessionResponse) obj).manifest;
                financialConnectionsAuthorizationSession = financialConnectionsSessionManifest.activeAuthSession;
                financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(sharedPartnerAuthState.pane, str3 != null ? "none" : str3, "cancelled", financialConnectionsAuthorizationSession == null ? financialConnectionsAuthorizationSession.id : null));
                if (financialConnectionsAuthorizationSession != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Map map = financialConnectionsSessionManifest.features;
                if (map != null ? Intrinsics.areEqual(map.get("bank_connections_disable_defensive_auth_session_retrieval_on_complete"), Boolean.TRUE) : false) {
                    stateFlowImpl = stateFlowImpl2;
                    logger$Companion$NOOP_LOGGER$1 = logger$Companion$NOOP_LOGGER$12;
                    partnerAuthViewModel$onAuthCancelled$1.L$0 = str3;
                    partnerAuthViewModel$onAuthCancelled$1.L$2 = null;
                    partnerAuthViewModel$onAuthCancelled$1.I$0 = i2;
                    partnerAuthViewModel$onAuthCancelled$1.label = 4;
                    str4 = str3;
                } else {
                    CancelAuthorizationSession cancelAuthorizationSession = partnerAuthViewModel.retrieveAuthorizationSession;
                    String str9 = financialConnectionsAuthorizationSession.id;
                    partnerAuthViewModel$onAuthCancelled$1.L$0 = str3;
                    partnerAuthViewModel$onAuthCancelled$1.L$2 = financialConnectionsAuthorizationSession;
                    partnerAuthViewModel$onAuthCancelled$1.I$0 = i2;
                    partnerAuthViewModel$onAuthCancelled$1.label = 2;
                    obj = cancelAuthorizationSession.invoke(str9, partnerAuthViewModel$onAuthCancelled$1);
                    if (obj != coroutineSingletons) {
                        financialConnectionsAuthorizationSession2 = financialConnectionsAuthorizationSession;
                        r11 = str3;
                        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession32 = (FinancialConnectionsAuthorizationSession) obj;
                        pane = financialConnectionsAuthorizationSession32.nextPane;
                        String str72 = financialConnectionsAuthorizationSession32.id;
                        pane.getClass();
                        str72.getClass();
                        stateFlowImpl = stateFlowImpl2;
                        logger$Companion$NOOP_LOGGER$1 = logger$Companion$NOOP_LOGGER$12;
                        financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(new Pair("next_pane", pane.getValue()), new Pair("auth_session_id", str72))), "auth_session.retrieved", true));
                        if (pane != sharedPartnerAuthState.pane) {
                        }
                        str2 = str4;
                        failure = Unit.INSTANCE;
                        Result.Companion companion322 = Result.Companion;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                return coroutineSingletons;
            }
        }
        partnerAuthViewModel$onAuthCancelled$1 = new PartnerAuthViewModel$onAuthCancelled$1(partnerAuthViewModel, continuationImpl);
        Object obj2 = partnerAuthViewModel$onAuthCancelled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerAuthViewModel$onAuthCancelled$1.label;
        int i42 = 0;
        ?? r113 = 4;
        ?? r1122 = 4;
        if (i != 0) {
        }
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = ((SynchronizeSessionResponse) obj2).manifest;
        financialConnectionsAuthorizationSession = financialConnectionsSessionManifest2.activeAuthSession;
        financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(sharedPartnerAuthState.pane, str3 != null ? "none" : str3, "cancelled", financialConnectionsAuthorizationSession == null ? financialConnectionsAuthorizationSession.id : null));
        if (financialConnectionsAuthorizationSession != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(10:11|12|13|14|(1:15)|18|19|(1:21)|22|23)(2:27|28))(2:29|30))(3:42|43|(2:45|38)(1:46))|31|(1:33)(1:41)|34|(3:36|(9:39|13|14|(1:15)|18|19|(0)|22|23)|38)(8:40|14|(1:15)|18|19|(0)|22|23)))|49|6|7|(0)(0)|31|(0)(0)|34|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0038, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        r1 = kotlin.Result.Companion;
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:12:0x0033, B:14:0x00bc, B:15:0x00be, B:18:0x00d9, B:30:0x0047, B:31:0x0071, B:33:0x007b, B:34:0x007f, B:36:0x0092, B:40:0x00b7, B:43:0x0057), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:12:0x0033, B:14:0x00bc, B:15:0x00be, B:18:0x00d9, B:30:0x0047, B:31:0x0071, B:33:0x007b, B:34:0x007f, B:36:0x0092, B:40:0x00b7, B:43:0x0057), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:12:0x0033, B:14:0x00bc, B:15:0x00be, B:18:0x00d9, B:30:0x0047, B:31:0x0071, B:33:0x007b, B:34:0x007f, B:36:0x0092, B:40:0x00b7, B:43:0x0057), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$onAuthFailed(PartnerAuthViewModel partnerAuthViewModel, String str, String str2, String str3, ContinuationImpl continuationImpl) {
        PartnerAuthViewModel$onAuthFailed$1 partnerAuthViewModel$onAuthFailed$1;
        int i;
        Throwable m4120exceptionOrNullimpl;
        String str4;
        WebAuthFlowFailedException webAuthFlowFailedException;
        int i2;
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession;
        WebAuthFlowFailedException webAuthFlowFailedException2;
        StateFlowImpl stateFlowImpl;
        Object value;
        SharedPartnerAuthState sharedPartnerAuthState;
        Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1 = partnerAuthViewModel.logger;
        SharedPartnerAuthState sharedPartnerAuthState2 = partnerAuthViewModel.initialState;
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl = partnerAuthViewModel.eventTracker;
        if (continuationImpl instanceof PartnerAuthViewModel$onAuthFailed$1) {
            partnerAuthViewModel$onAuthFailed$1 = (PartnerAuthViewModel$onAuthFailed$1) continuationImpl;
            int i3 = partnerAuthViewModel$onAuthFailed$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                partnerAuthViewModel$onAuthFailed$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = partnerAuthViewModel$onAuthFailed$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerAuthViewModel$onAuthFailed$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    WebAuthFlowFailedException webAuthFlowFailedException3 = new WebAuthFlowFailedException(str2, str3);
                    Result.Companion companion = Result.Companion;
                    GetOrFetchSync getOrFetchSync = partnerAuthViewModel.getOrFetchSync;
                    str4 = str;
                    partnerAuthViewModel$onAuthFailed$1.L$0 = str4;
                    partnerAuthViewModel$onAuthFailed$1.L$3 = webAuthFlowFailedException3;
                    partnerAuthViewModel$onAuthFailed$1.I$0 = 0;
                    partnerAuthViewModel$onAuthFailed$1.label = 1;
                    Object invoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, partnerAuthViewModel$onAuthFailed$1, 3);
                    if (invoke$default == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    webAuthFlowFailedException = webAuthFlowFailedException3;
                    obj = invoke$default;
                    i2 = 0;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        webAuthFlowFailedException2 = partnerAuthViewModel$onAuthFailed$1.L$3;
                        SafeTrace.throwOnFailure(obj);
                        webAuthFlowFailedException = webAuthFlowFailedException2;
                        stateFlowImpl = partnerAuthViewModel._stateFlow;
                        do {
                            value = stateFlowImpl.getValue();
                            sharedPartnerAuthState = (SharedPartnerAuthState) value;
                            sharedPartnerAuthState.getClass();
                        } while (!stateFlowImpl.compareAndSet(value, SharedPartnerAuthState.copy$default(sharedPartnerAuthState, null, null, new Async.Fail(webAuthFlowFailedException), 23)));
                        Object failure = Unit.INSTANCE;
                        Result.Companion companion2 = Result.Companion;
                        m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                            Matchers.logError(financialConnectionsAnalyticsTrackerImpl, "failed cancelling session after failed web flow", m4120exceptionOrNullimpl, logger$Companion$NOOP_LOGGER$1, sharedPartnerAuthState2.pane);
                        }
                        return Unit.INSTANCE;
                    }
                    i2 = partnerAuthViewModel$onAuthFailed$1.I$0;
                    webAuthFlowFailedException = partnerAuthViewModel$onAuthFailed$1.L$3;
                    str4 = partnerAuthViewModel$onAuthFailed$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                financialConnectionsAuthorizationSession = ((SynchronizeSessionResponse) obj).manifest.activeAuthSession;
                financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(sharedPartnerAuthState2.pane, str4, "failed", financialConnectionsAuthorizationSession == null ? financialConnectionsAuthorizationSession.id : null));
                Matchers.logError(financialConnectionsAnalyticsTrackerImpl, "Auth failed, cancelling AuthSession", webAuthFlowFailedException, logger$Companion$NOOP_LOGGER$1, sharedPartnerAuthState2.pane);
                if (financialConnectionsAuthorizationSession != null) {
                    logger$Companion$NOOP_LOGGER$1.debug("Could not find AuthSession to cancel.");
                    stateFlowImpl = partnerAuthViewModel._stateFlow;
                    do {
                        value = stateFlowImpl.getValue();
                        sharedPartnerAuthState = (SharedPartnerAuthState) value;
                        sharedPartnerAuthState.getClass();
                    } while (!stateFlowImpl.compareAndSet(value, SharedPartnerAuthState.copy$default(sharedPartnerAuthState, null, null, new Async.Fail(webAuthFlowFailedException), 23)));
                    Object failure2 = Unit.INSTANCE;
                    Result.Companion companion22 = Result.Companion;
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure2);
                    if (m4120exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                String str5 = financialConnectionsAuthorizationSession.id;
                partnerAuthViewModel.postAuthSessionEvent.invoke(str5, new AuthSessionEvent.Failure(new Date(), webAuthFlowFailedException));
                CancelAuthorizationSession cancelAuthorizationSession = partnerAuthViewModel.cancelAuthorizationSession;
                partnerAuthViewModel$onAuthFailed$1.L$0 = null;
                partnerAuthViewModel$onAuthFailed$1.L$3 = webAuthFlowFailedException;
                partnerAuthViewModel$onAuthFailed$1.I$0 = i2;
                partnerAuthViewModel$onAuthFailed$1.label = 2;
                if (cancelAuthorizationSession.invoke(str5, partnerAuthViewModel$onAuthFailed$1) != coroutineSingletons) {
                    webAuthFlowFailedException2 = webAuthFlowFailedException;
                    webAuthFlowFailedException = webAuthFlowFailedException2;
                    stateFlowImpl = partnerAuthViewModel._stateFlow;
                    do {
                        value = stateFlowImpl.getValue();
                        sharedPartnerAuthState = (SharedPartnerAuthState) value;
                        sharedPartnerAuthState.getClass();
                    } while (!stateFlowImpl.compareAndSet(value, SharedPartnerAuthState.copy$default(sharedPartnerAuthState, null, null, new Async.Fail(webAuthFlowFailedException), 23)));
                    Object failure22 = Unit.INSTANCE;
                    Result.Companion companion222 = Result.Companion;
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure22);
                    if (m4120exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
        }
        partnerAuthViewModel$onAuthFailed$1 = new PartnerAuthViewModel$onAuthFailed$1(partnerAuthViewModel, continuationImpl);
        Object obj2 = partnerAuthViewModel$onAuthFailed$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerAuthViewModel$onAuthFailed$1.label;
        if (i != 0) {
        }
        financialConnectionsAuthorizationSession = ((SynchronizeSessionResponse) obj2).manifest.activeAuthSession;
        financialConnectionsAnalyticsTrackerImpl.track(new FinancialConnectionsAnalyticsEvent.Click(sharedPartnerAuthState2.pane, str4, "failed", financialConnectionsAuthorizationSession == null ? financialConnectionsAuthorizationSession.id : null));
        Matchers.logError(financialConnectionsAnalyticsTrackerImpl, "Auth failed, cancelling AuthSession", webAuthFlowFailedException, logger$Companion$NOOP_LOGGER$1, sharedPartnerAuthState2.pane);
        if (financialConnectionsAuthorizationSession != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object cancelAuthSessionAndContinue(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession, ContinuationImpl continuationImpl) {
        PartnerAuthViewModel$cancelAuthSessionAndContinue$1 partnerAuthViewModel$cancelAuthSessionAndContinue$1;
        int i;
        boolean isOAuth;
        StateFlowImpl stateFlowImpl;
        Object value;
        SharedPartnerAuthState sharedPartnerAuthState;
        if (continuationImpl instanceof PartnerAuthViewModel$cancelAuthSessionAndContinue$1) {
            partnerAuthViewModel$cancelAuthSessionAndContinue$1 = (PartnerAuthViewModel$cancelAuthSessionAndContinue$1) continuationImpl;
            int i2 = partnerAuthViewModel$cancelAuthSessionAndContinue$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                partnerAuthViewModel$cancelAuthSessionAndContinue$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = partnerAuthViewModel$cancelAuthSessionAndContinue$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = partnerAuthViewModel$cancelAuthSessionAndContinue$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = financialConnectionsAuthorizationSession.id;
                    partnerAuthViewModel$cancelAuthSessionAndContinue$1.L$0 = financialConnectionsAuthorizationSession;
                    partnerAuthViewModel$cancelAuthSessionAndContinue$1.label = 1;
                    obj = this.cancelAuthorizationSession.invoke(str, partnerAuthViewModel$cancelAuthSessionAndContinue$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    financialConnectionsAuthorizationSession = partnerAuthViewModel$cancelAuthSessionAndContinue$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession2 = (FinancialConnectionsAuthorizationSession) obj;
                isOAuth = financialConnectionsAuthorizationSession.isOAuth();
                String str2 = financialConnectionsAuthorizationSession.id;
                TextSetter textSetter = this.postAuthSessionEvent;
                if (isOAuth) {
                    textSetter.invoke(str2, new AuthSessionEvent.Cancel(new Date()));
                    NavigationManagerImpl.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination(financialConnectionsAuthorizationSession2.nextPane), this.initialState.pane), new PopUpToBehavior.Current(), 4);
                } else {
                    this.logger.debug("Creating a new session for this OAuth institution");
                    textSetter.invoke(str2, new AuthSessionEvent.Retry(new Date()));
                    do {
                        stateFlowImpl = this._stateFlow;
                        value = stateFlowImpl.getValue();
                        sharedPartnerAuthState = (SharedPartnerAuthState) value;
                        sharedPartnerAuthState.getClass();
                    } while (!stateFlowImpl.compareAndSet(value, SharedPartnerAuthState.copy$default(sharedPartnerAuthState, null, null, Async.Uninitialized.INSTANCE, 23)));
                    RealClockInRepository$updateNote$2 realClockInRepository$updateNote$2 = new RealClockInRepository$updateNote$2(this, null);
                    PartnerAuthViewModel$recreateAuthSession$2 partnerAuthViewModel$recreateAuthSession$2 = PartnerAuthViewModel$recreateAuthSession$2.INSTANCE;
                    JobKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WorkflowLayout$start$1(this, new PhoneNumberController$$ExternalSyntheticLambda5(11), partnerAuthViewModel$recreateAuthSession$2, realClockInRepository$updateNote$2, (Continuation) null, 27), 3);
                }
                return Unit.INSTANCE;
            }
        }
        partnerAuthViewModel$cancelAuthSessionAndContinue$1 = new PartnerAuthViewModel$cancelAuthSessionAndContinue$1(this, continuationImpl);
        Object obj2 = partnerAuthViewModel$cancelAuthSessionAndContinue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = partnerAuthViewModel$cancelAuthSessionAndContinue$1.label;
        if (i != 0) {
        }
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession22 = (FinancialConnectionsAuthorizationSession) obj2;
        isOAuth = financialConnectionsAuthorizationSession.isOAuth();
        String str22 = financialConnectionsAuthorizationSession.id;
        TextSetter textSetter2 = this.postAuthSessionEvent;
        if (isOAuth) {
        }
        return Unit.INSTANCE;
    }

    public final void launchAuthInBrowser(FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession) {
        StateFlowImpl stateFlowImpl;
        Object value;
        SharedPartnerAuthState sharedPartnerAuthState;
        String str = financialConnectionsAuthorizationSession.url;
        String replaceFirst = str != null ? StringsKt__StringsJVMKt.replaceFirst(str, JsonLogicResult$Success$$ExternalSyntheticOutline0.m("stripe-auth://native-redirect/", this.applicationId, "/"), "", false) : null;
        if (replaceFirst != null) {
            do {
                stateFlowImpl = this._stateFlow;
                value = stateFlowImpl.getValue();
                sharedPartnerAuthState = (SharedPartnerAuthState) value;
                sharedPartnerAuthState.getClass();
            } while (!stateFlowImpl.compareAndSet(value, SharedPartnerAuthState.copy$default(sharedPartnerAuthState, null, new SharedPartnerAuthState.ViewEffect.OpenPartnerAuth(replaceFirst), null, 27)));
            String str2 = financialConnectionsAuthorizationSession.id;
            FinancialConnectionsSessionManifest.Pane pane = this.initialState.pane;
            String str3 = financialConnectionsAuthorizationSession.flow;
            String packageToHandleUri = this.browserManager.getPackageToHandleUri(Uri.parse(replaceFirst));
            pane.getClass();
            str2.getClass();
            Pair pair = new Pair("auth_session_id", str2);
            FinancialConnectionsAnalyticsEvent.ConsentAgree.INSTANCE.getClass();
            Pair pair2 = new Pair("pane", FinancialConnectionsAnalyticsEvent.getAnalyticsValue$financial_connections_release(pane));
            if (str3 == null) {
                str3 = "unknown";
            }
            Pair pair3 = new Pair("flow", str3);
            if (packageToHandleUri == null) {
                packageToHandleUri = "unknown";
            }
            this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(MooncakeHeaderViewKt.filterNotNullValues(MapsKt__MapsKt.mapOf(pair, pair2, pair3, new Pair("browser", packageToHandleUri))), "auth_session.opened", true));
        }
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        SharedPartnerAuthState sharedPartnerAuthState = (SharedPartnerAuthState) obj;
        sharedPartnerAuthState.getClass();
        boolean z = sharedPartnerAuthState.inModal;
        Async async = sharedPartnerAuthState.payload;
        if (z) {
            return null;
        }
        FinancialConnectionsSessionManifest.Pane pane = sharedPartnerAuthState.pane;
        Async async2 = sharedPartnerAuthState.authenticationStatus;
        return new TopAppBarStateUpdate(pane, ((async2 instanceof Async.Loading) || (async2 instanceof Async.Success) || (async instanceof Async.Fail) || pane == FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR) ? false : true, zzai.getError(async), false, null, 56);
    }
}
