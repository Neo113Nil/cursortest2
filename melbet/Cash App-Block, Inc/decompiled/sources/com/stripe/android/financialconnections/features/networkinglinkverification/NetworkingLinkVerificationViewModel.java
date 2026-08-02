package com.stripe.android.financialconnections.features.networkinglinkverification;

import com.google.android.gms.internal.common.zzai;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.MarkLinkVerified;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.RealAttachConsumerToLinkAccountSession;
import com.stripe.android.financialconnections.domain.RealHandleError;
import com.stripe.android.financialconnections.domain.RealIsLinkWithStripe;
import com.stripe.android.financialconnections.domain.StartVerification;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class NetworkingLinkVerificationViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_VERIFICATION;
    public final FinancialConnectionsAnalyticsTrackerImpl analyticsTracker;
    public final RealAttachConsumerToLinkAccountSession attachConsumerToLinkAccountSession;
    public final ConfirmVerification confirmVerification;
    public final RealConsumerSessionRepository consumerSessionProvider;
    public final GetOrFetchSync getOrFetchSync;
    public final RealHandleError handleError;
    public final RealIsLinkWithStripe isLinkWithStripe;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final MarkLinkVerified markLinkVerified;
    public final NavigationManagerImpl navigationManager;
    public final StartVerification startVerification;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkingLinkVerificationViewModel(NetworkingLinkVerificationState networkingLinkVerificationState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, GetOrFetchSync getOrFetchSync, ConfirmVerification confirmVerification, MarkLinkVerified markLinkVerified, NavigationManagerImpl navigationManagerImpl, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, StartVerification startVerification, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, RealIsLinkWithStripe realIsLinkWithStripe, RealAttachConsumerToLinkAccountSession realAttachConsumerToLinkAccountSession, RealConsumerSessionRepository realConsumerSessionRepository, RealHandleError realHandleError) {
        super(networkingLinkVerificationState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        getOrFetchSync.getClass();
        confirmVerification.getClass();
        markLinkVerified.getClass();
        navigationManagerImpl.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        startVerification.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        realIsLinkWithStripe.getClass();
        realAttachConsumerToLinkAccountSession.getClass();
        realConsumerSessionRepository.getClass();
        realHandleError.getClass();
        this.getOrFetchSync = getOrFetchSync;
        this.confirmVerification = confirmVerification;
        this.markLinkVerified = markLinkVerified;
        this.navigationManager = navigationManagerImpl;
        this.analyticsTracker = financialConnectionsAnalyticsTrackerImpl;
        this.startVerification = startVerification;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.isLinkWithStripe = realIsLinkWithStripe;
        this.attachConsumerToLinkAccountSession = realAttachConsumerToLinkAccountSession;
        this.consumerSessionProvider = realConsumerSessionRepository;
        this.handleError = realHandleError;
        Continuation continuation = null;
        onAsync(NetworkingLinkVerificationViewModel$observeAsyncs$1.INSTANCE, new NetworkingLinkVerificationViewModel$observeAsyncs$2(this, continuation, 0), new NetworkingLinkVerificationViewModel$observeAsyncs$2(this, continuation, 1));
        FinancialConnectionsViewModel.execute$default(this, new RealMRIFactory$sign$2.AnonymousClass1(this, continuation, 29), new PhoneNumberController$$ExternalSyntheticLambda5(6));
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        NetworkingLinkVerificationState networkingLinkVerificationState = (NetworkingLinkVerificationState) obj;
        networkingLinkVerificationState.getClass();
        return new TopAppBarStateUpdate(PANE, true, zzai.getError(networkingLinkVerificationState.payload), false, null, 56);
    }
}
