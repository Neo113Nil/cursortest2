package com.stripe.android.financialconnections.features.success;

import androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3;
import com.google.android.gms.internal.common.zzai;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda5;
import com.valentinilk.shimmer.ShimmerModifierKt$shimmer$1$1;
import com.withpersona.sdk2.inquiry.internal.InquiryViewModel;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class SuccessViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.SUCCESS;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    public final SuccessContentRepository successContentRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessViewModel(SuccessState successState, GetCachedAccounts getCachedAccounts, GetOrFetchSync getOrFetchSync, SuccessContentRepository successContentRepository, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, NativeAuthFlowCoordinator nativeAuthFlowCoordinator) {
        super(successState, nativeAuthFlowCoordinator);
        getCachedAccounts.getClass();
        getOrFetchSync.getClass();
        successContentRepository.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        nativeAuthFlowCoordinator.getClass();
        this.successContentRepository = successContentRepository;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        Continuation continuation = null;
        onAsync(SuccessViewModel$observeAsyncs$1.INSTANCE, new ShimmerModifierKt$shimmer$1$1(this, null, 9), new InquiryViewModel.AnonymousClass1(this, continuation, 13));
        FinancialConnectionsViewModel.execute$default(this, new DataStoreImpl$readDataOrHandleCorruption$3(getOrFetchSync, getCachedAccounts, this, continuation, 18), new PhoneNumberController$$ExternalSyntheticLambda5(19));
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        SuccessState successState = (SuccessState) obj;
        successState.getClass();
        return new TopAppBarStateUpdate(PANE, false, zzai.getError(successState.payload), true, null, 48);
    }
}
