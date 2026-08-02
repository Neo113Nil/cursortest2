package com.stripe.android.financialconnections.features.exit;

import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.RealCurrentLinkBrand;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;

/* loaded from: classes8.dex */
public final class ExitViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.EXIT;
    public final NativeAuthFlowCoordinator coordinator;
    public final RealCurrentLinkBrand currentLinkBrand;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final GetOrFetchSync getOrFetchSync;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final NavigationManagerImpl navigationManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExitViewModel(ExitState exitState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, GetOrFetchSync getOrFetchSync, NativeAuthFlowCoordinator nativeAuthFlowCoordinator2, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, NavigationManagerImpl navigationManagerImpl, RealCurrentLinkBrand realCurrentLinkBrand, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        super(exitState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        getOrFetchSync.getClass();
        nativeAuthFlowCoordinator2.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        navigationManagerImpl.getClass();
        realCurrentLinkBrand.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.getOrFetchSync = getOrFetchSync;
        this.coordinator = nativeAuthFlowCoordinator2;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.navigationManager = navigationManagerImpl;
        this.currentLinkBrand = realCurrentLinkBrand;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        FinancialConnectionsViewModel.onAsync$default(this, ExitViewModel$logErrors$1.INSTANCE, null, new InquiryViewModel.AnonymousClass1(this, null, 6), 2);
        FinancialConnectionsViewModel.execute$default(this, new WebRtcWorker$run$1.AnonymousClass1(this, null, 4), new ExitViewModel$$ExternalSyntheticLambda0(0));
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        ((ExitState) obj).getClass();
        return null;
    }
}
