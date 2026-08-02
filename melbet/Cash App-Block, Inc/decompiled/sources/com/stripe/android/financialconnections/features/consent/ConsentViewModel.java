package com.stripe.android.financialconnections.features.consent;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.common.zzai;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.RealIsLinkWithStripe;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel;
import com.stripe.android.financialconnections.features.notice.RealPresentSheet;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.EmailSource;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;
import java.io.Serializable;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class ConsentViewModel extends FinancialConnectionsViewModel {
    public final AcceptConsent acceptConsent;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final GetOrFetchSync getOrFetchSync;
    public final HandleClickableUrl handleClickableUrl;
    public final RealIsLinkWithStripe isLinkWithStripe;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final LookupAccount lookupAccount;
    public final NavigationManagerImpl navigationManager;
    public final ElementsSessionContext.PrefillDetails prefillDetails;
    public final RealPresentSheet presentSheet;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentViewModel(ConsentState consentState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, AcceptConsent acceptConsent, GetOrFetchSync getOrFetchSync, NavigationManagerImpl navigationManagerImpl, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, HandleClickableUrl handleClickableUrl, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, RealPresentSheet realPresentSheet, LookupAccount lookupAccount, RealIsLinkWithStripe realIsLinkWithStripe, ElementsSessionContext.PrefillDetails prefillDetails) {
        super(consentState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        acceptConsent.getClass();
        getOrFetchSync.getClass();
        navigationManagerImpl.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        handleClickableUrl.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        realPresentSheet.getClass();
        lookupAccount.getClass();
        realIsLinkWithStripe.getClass();
        this.acceptConsent = acceptConsent;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManagerImpl;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.handleClickableUrl = handleClickableUrl;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.presentSheet = realPresentSheet;
        this.lookupAccount = lookupAccount;
        this.isLinkWithStripe = realIsLinkWithStripe;
        this.prefillDetails = prefillDetails;
        Continuation continuation = null;
        int i = 0;
        onAsync(ConsentViewModel$logErrors$1.INSTANCE, new ConsentViewModel$logErrors$2(this, continuation, i), new ConsentViewModel$logErrors$3(this, continuation, i));
        FinancialConnectionsViewModel.onAsync$default(this, ConsentViewModel$logErrors$4.INSTANCE, null, new ConsentViewModel$logErrors$3(this, continuation, 1), 2);
        FinancialConnectionsViewModel.execute$default(this, new WebRtcWorker$run$1.AnonymousClass1(this, continuation, 2), new ExitViewModel$$ExternalSyntheticLambda0(9));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$determineNavigationDestination(ConsentViewModel consentViewModel, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, ContinuationImpl continuationImpl) {
        ConsentViewModel$determineNavigationDestination$1 consentViewModel$determineNavigationDestination$1;
        int i;
        Destination destination;
        consentViewModel.getClass();
        if (continuationImpl instanceof ConsentViewModel$determineNavigationDestination$1) {
            consentViewModel$determineNavigationDestination$1 = (ConsentViewModel$determineNavigationDestination$1) continuationImpl;
            int i2 = consentViewModel$determineNavigationDestination$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                consentViewModel$determineNavigationDestination$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = consentViewModel$determineNavigationDestination$1.result;
                Serializable serializable = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = consentViewModel$determineNavigationDestination$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Destination destination2 = DestinationMappersKt.getDestination(financialConnectionsSessionManifest.nextPane);
                    ElementsSessionContext.PrefillDetails prefillDetails = consentViewModel.prefillDetails;
                    String str = prefillDetails != null ? prefillDetails.email : null;
                    if (!consentViewModel.isLinkWithStripe.initialState.isLinkWithStripe || financialConnectionsSessionManifest.accountholderCustomerEmailAddress != null || str == null) {
                        return destination2;
                    }
                    consentViewModel$determineNavigationDestination$1.L$1 = destination2;
                    consentViewModel$determineNavigationDestination$1.label = 1;
                    Serializable hasExistingLinkAccount = consentViewModel.hasExistingLinkAccount(financialConnectionsSessionManifest, str, consentViewModel$determineNavigationDestination$1);
                    if (hasExistingLinkAccount == serializable) {
                        return serializable;
                    }
                    obj = hasExistingLinkAccount;
                    destination = destination2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    destination = consentViewModel$determineNavigationDestination$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                return !((Boolean) obj).booleanValue() ? Destination.NetworkingLinkLoginWarmup.INSTANCE : destination;
            }
        }
        consentViewModel$determineNavigationDestination$1 = new ConsentViewModel$determineNavigationDestination$1(consentViewModel, continuationImpl);
        Object obj2 = consentViewModel$determineNavigationDestination$1.result;
        Serializable serializable2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = consentViewModel$determineNavigationDestination$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:11)(2:20|21))(3:22|23|(1:25))|12|13|(2:15|16)(1:18)))|28|6|7|8|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        r11 = kotlin.Result.Companion;
        r10 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable hasExistingLinkAccount(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, String str, ContinuationImpl continuationImpl) {
        ConsentViewModel$hasExistingLinkAccount$1 consentViewModel$hasExistingLinkAccount$1;
        int i;
        if (continuationImpl instanceof ConsentViewModel$hasExistingLinkAccount$1) {
            consentViewModel$hasExistingLinkAccount$1 = (ConsentViewModel$hasExistingLinkAccount$1) continuationImpl;
            int i2 = consentViewModel$hasExistingLinkAccount$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                consentViewModel$hasExistingLinkAccount$1.label = i2 - PKIFailureInfo.systemUnavail;
                ConsentViewModel$hasExistingLinkAccount$1 consentViewModel$hasExistingLinkAccount$12 = consentViewModel$hasExistingLinkAccount$1;
                Object obj = consentViewModel$hasExistingLinkAccount$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = consentViewModel$hasExistingLinkAccount$12.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    LookupAccount lookupAccount = this.lookupAccount;
                    FinancialConnectionsSessionManifest.Pane pane = NetworkingLinkLoginWarmupViewModel.PANE;
                    EmailSource emailSource = EmailSource.CUSTOMER_OBJECT;
                    String str2 = financialConnectionsSessionManifest.id;
                    boolean z = financialConnectionsSessionManifest.appVerificationEnabled;
                    consentViewModel$hasExistingLinkAccount$12.label = 1;
                    obj = lookupAccount.invoke(str, null, null, emailSource, z, str2, pane, consentViewModel$hasExistingLinkAccount$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Serializable failure = Boolean.valueOf(((ConsumerSessionLookup) obj).exists);
                Result.Companion companion2 = Result.Companion;
                return !(failure instanceof Result.Failure) ? Boolean.FALSE : failure;
            }
        }
        consentViewModel$hasExistingLinkAccount$1 = new ConsentViewModel$hasExistingLinkAccount$1(this, continuationImpl);
        ConsentViewModel$hasExistingLinkAccount$1 consentViewModel$hasExistingLinkAccount$122 = consentViewModel$hasExistingLinkAccount$1;
        Object obj2 = consentViewModel$hasExistingLinkAccount$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = consentViewModel$hasExistingLinkAccount$122.label;
        if (i != 0) {
        }
        Serializable failure2 = Boolean.valueOf(((ConsumerSessionLookup) obj2).exists);
        Result.Companion companion22 = Result.Companion;
        if (!(failure2 instanceof Result.Failure)) {
        }
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        ConsentState consentState = (ConsentState) obj;
        consentState.getClass();
        FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.CONSENT;
        Async async = consentState.consent;
        ConsentState.Payload payload = (ConsentState.Payload) async.invoke();
        return new TopAppBarStateUpdate(pane, true, zzai.getError(async), true, Boolean.valueOf(payload != null ? payload.shouldShowMerchantLogos : true), 32);
    }
}
