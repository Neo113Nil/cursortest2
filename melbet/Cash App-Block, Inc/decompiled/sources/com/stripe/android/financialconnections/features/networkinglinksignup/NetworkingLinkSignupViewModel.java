package com.stripe.android.financialconnections.features.networkinglinksignup;

import com.google.android.gms.internal.common.zzai;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.RealHandleError;
import com.stripe.android.financialconnections.features.notice.RealPresentSheet;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import kotlin.coroutines.Continuation;
import net.idrnd.face.iad.capture.internal.o0;

/* loaded from: classes8.dex */
public final class NetworkingLinkSignupViewModel extends FinancialConnectionsViewModel {
    public final ElementsSessionContext elementsSessionContext;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final GetOrFetchSync getOrFetchSync;
    public final RealHandleError handleError;
    public final LinkSignupHandler linkSignupHandler;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final LookupAccount lookupAccount;
    public final NavigationManagerImpl navigationManager;
    public final RealPresentSheet presentSheet;
    public final o0 searchJob;
    public final UriUtils uriUtils;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkingLinkSignupViewModel(NetworkingLinkSignupState networkingLinkSignupState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, LookupAccount lookupAccount, UriUtils uriUtils, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, GetOrFetchSync getOrFetchSync, NavigationManagerImpl navigationManagerImpl, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, RealPresentSheet realPresentSheet, LinkSignupHandler linkSignupHandler, ElementsSessionContext elementsSessionContext, RealHandleError realHandleError) {
        super(networkingLinkSignupState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        lookupAccount.getClass();
        uriUtils.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        getOrFetchSync.getClass();
        navigationManagerImpl.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        realPresentSheet.getClass();
        linkSignupHandler.getClass();
        realHandleError.getClass();
        this.lookupAccount = lookupAccount;
        this.uriUtils = uriUtils;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManagerImpl;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.presentSheet = realPresentSheet;
        this.linkSignupHandler = linkSignupHandler;
        this.elementsSessionContext = elementsSessionContext;
        this.handleError = realHandleError;
        this.searchJob = new o0(7);
        Continuation continuation = null;
        onAsync(NetworkingLinkSignupViewModel$observePayloadResult$1.INSTANCE, new NetworkingLinkSignupViewModel$observePayloadResult$2(this, continuation, 0), new NetworkingLinkSignupViewModel$observePayloadResult$2(this, continuation, 4));
        onAsync(NetworkingLinkSignupViewModel$observeSaveAccountResult$1.INSTANCE, new NetworkingLinkSignupViewModel$observePayloadResult$2(this, continuation, 5), new NetworkingLinkSignupViewModel$observePayloadResult$2(this, continuation, 6));
        int i = 2;
        onAsync(NetworkingLinkSignupViewModel$observeLookupAccountResult$1.INSTANCE, new NetworkingLinkSignupViewModel$observePayloadResult$2(this, continuation, 1), new NetworkingLinkSignupViewModel$observePayloadResult$2(this, continuation, i));
        FinancialConnectionsViewModel.execute$default(this, new RealMRIFactory$sign$2.AnonymousClass1(networkingLinkSignupState, this, continuation, 27), new PhoneNumberController$$ExternalSyntheticLambda5(i));
    }

    public final FinancialConnectionsSessionManifest.Pane getPane() {
        return ((NetworkingLinkSignupState) this.stateFlow.$$delegate_0.getValue()).isInstantDebits ? FinancialConnectionsSessionManifest.Pane.LINK_LOGIN : FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE;
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        NetworkingLinkSignupState networkingLinkSignupState = (NetworkingLinkSignupState) obj;
        networkingLinkSignupState.getClass();
        return new TopAppBarStateUpdate(getPane(), networkingLinkSignupState.isInstantDebits, zzai.getError(networkingLinkSignupState.payload), false, null, 56);
    }
}
