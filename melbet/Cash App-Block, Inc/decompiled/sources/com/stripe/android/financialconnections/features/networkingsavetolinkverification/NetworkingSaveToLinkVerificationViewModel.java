package com.stripe.android.financialconnections.features.networkingsavetolinkverification;

import com.google.android.gms.internal.common.zzai;
import com.squareup.cash.graphics.swampgl.EngineSurfaceViewTarget$surfaceChanged$1;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.MarkLinkVerified;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.RealCurrentLinkBrand;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.domain.StartVerification;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class NetworkingSaveToLinkVerificationViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.NETWORKING_SAVE_TO_LINK_VERIFICATION;
    public final AttachedPaymentAccountRepository attachedPaymentAccountRepository;
    public final ConfirmVerification confirmVerification;
    public final RealConsumerSessionRepository consumerSessionProvider;
    public final RealCurrentLinkBrand currentLinkBrand;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final GetCachedAccounts getCachedAccounts;
    public final GetOrFetchSync getOrFetchSync;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final MarkLinkVerified markLinkVerified;
    public final NavigationManagerImpl navigationManager;
    public final SaveAccountToLink saveAccountToLink;
    public final StartVerification startVerification;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkingSaveToLinkVerificationViewModel(NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, RealConsumerSessionRepository realConsumerSessionRepository, StartVerification startVerification, GetOrFetchSync getOrFetchSync, ConfirmVerification confirmVerification, AttachedPaymentAccountRepository attachedPaymentAccountRepository, MarkLinkVerified markLinkVerified, GetCachedAccounts getCachedAccounts, SaveAccountToLink saveAccountToLink, NavigationManagerImpl navigationManagerImpl, RealCurrentLinkBrand realCurrentLinkBrand, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        super(networkingSaveToLinkVerificationState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        realConsumerSessionRepository.getClass();
        startVerification.getClass();
        getOrFetchSync.getClass();
        confirmVerification.getClass();
        attachedPaymentAccountRepository.getClass();
        markLinkVerified.getClass();
        getCachedAccounts.getClass();
        saveAccountToLink.getClass();
        navigationManagerImpl.getClass();
        realCurrentLinkBrand.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.consumerSessionProvider = realConsumerSessionRepository;
        this.startVerification = startVerification;
        this.getOrFetchSync = getOrFetchSync;
        this.confirmVerification = confirmVerification;
        this.attachedPaymentAccountRepository = attachedPaymentAccountRepository;
        this.markLinkVerified = markLinkVerified;
        this.getCachedAccounts = getCachedAccounts;
        this.saveAccountToLink = saveAccountToLink;
        this.navigationManager = navigationManagerImpl;
        this.currentLinkBrand = realCurrentLinkBrand;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        Continuation continuation = null;
        onAsync(NetworkingSaveToLinkVerificationViewModel$logErrors$1.INSTANCE, new NetworkingSaveToLinkVerificationViewModel$logErrors$2(this, continuation, 0), new NetworkingSaveToLinkVerificationViewModel$logErrors$2(this, continuation, 2));
        onAsync(NetworkingSaveToLinkVerificationViewModel$logErrors$4.INSTANCE, new CameraHelper$unbind$2(this, null, 15), new NetworkingSaveToLinkVerificationViewModel$logErrors$2(this, continuation, 3));
        FinancialConnectionsViewModel.execute$default(this, new EngineSurfaceViewTarget$surfaceChanged$1(this, null), new PhoneNumberController$$ExternalSyntheticLambda5(9));
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        NetworkingSaveToLinkVerificationState networkingSaveToLinkVerificationState = (NetworkingSaveToLinkVerificationState) obj;
        networkingSaveToLinkVerificationState.getClass();
        return new TopAppBarStateUpdate(PANE, true, zzai.getError(networkingSaveToLinkVerificationState.payload), false, null, 56);
    }
}
