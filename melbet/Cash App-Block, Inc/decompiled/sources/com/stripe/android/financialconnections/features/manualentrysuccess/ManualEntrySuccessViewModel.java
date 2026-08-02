package com.stripe.android.financialconnections.features.manualentrysuccess;

import com.google.android.gms.internal.common.zzai;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.exit.ExitViewModel$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;

/* loaded from: classes8.dex */
public final class ManualEntrySuccessViewModel extends FinancialConnectionsViewModel {
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final GetOrFetchSync getOrFetchSync;
    public final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    public final SuccessContentRepository successContentRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntrySuccessViewModel(ManualEntrySuccessState manualEntrySuccessState, GetOrFetchSync getOrFetchSync, SuccessContentRepository successContentRepository, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        super(manualEntrySuccessState, nativeAuthFlowCoordinator);
        getOrFetchSync.getClass();
        successContentRepository.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        nativeAuthFlowCoordinator.getClass();
        this.getOrFetchSync = getOrFetchSync;
        this.successContentRepository = successContentRepository;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        FinancialConnectionsViewModel.execute$default(this, new WebRtcWorker$run$1.AnonymousClass1(this, null, 6), new ExitViewModel$$ExternalSyntheticLambda0(26));
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        ManualEntrySuccessState manualEntrySuccessState = (ManualEntrySuccessState) obj;
        manualEntrySuccessState.getClass();
        return new TopAppBarStateUpdate(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS, false, zzai.getError(manualEntrySuccessState.payload), true, null, 48);
    }
}
