package com.stripe.android.financialconnections.features.error;

import com.google.android.gms.internal.common.zzai;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.error.ErrorState;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.FinancialConnectionsErrorRepository;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;

/* loaded from: classes8.dex */
public final class ErrorViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR;
    public final NativeAuthFlowCoordinator coordinator;
    public final FinancialConnectionsErrorRepository errorRepository;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final GetOrFetchSync getOrFetchSync;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final NavigationManagerImpl navigationManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorViewModel(ErrorState errorState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, GetOrFetchSync getOrFetchSync, FinancialConnectionsErrorRepository financialConnectionsErrorRepository, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, NavigationManagerImpl navigationManagerImpl, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        super(errorState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        getOrFetchSync.getClass();
        financialConnectionsErrorRepository.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        navigationManagerImpl.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.coordinator = nativeAuthFlowCoordinator;
        this.getOrFetchSync = getOrFetchSync;
        this.errorRepository = financialConnectionsErrorRepository;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.navigationManager = navigationManagerImpl;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        FinancialConnectionsViewModel.onAsync$default(this, ErrorViewModel$logErrors$1.INSTANCE, null, new InquiryViewModel.AnonymousClass1(this, null, 5), 2);
        FinancialConnectionsViewModel.execute$default(this, new WebRtcWorker$run$1.AnonymousClass1(this, null, 3), new ExitViewModel$$ExternalSyntheticLambda0(12));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.errorRepository.clear();
        super.onCleared();
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        ErrorState errorState = (ErrorState) obj;
        errorState.getClass();
        Async async = errorState.payload;
        ErrorState.Payload payload = (ErrorState.Payload) async.invoke();
        return new TopAppBarStateUpdate(PANE, false, payload != null ? payload.error : zzai.getError(async), false, null, 56);
    }
}
