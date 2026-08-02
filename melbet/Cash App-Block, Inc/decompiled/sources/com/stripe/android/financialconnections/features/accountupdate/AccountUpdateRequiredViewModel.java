package com.stripe.android.financialconnections.features.accountupdate;

import androidx.paging.Pager$pageFetcher$2;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda0;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.AccountUpdateRequiredContentRepository;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;

/* loaded from: classes8.dex */
public final class AccountUpdateRequiredViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.ACCOUNT_UPDATE_REQUIRED;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final NavigationManagerImpl navigationManager;
    public final CoreAuthorizationPendingNetworkingRepairRepository pendingRepairRepository;
    public final UpdateLocalManifest updateLocalManifest;
    public final AccountUpdateRequiredContentRepository updateRequiredContentRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountUpdateRequiredViewModel(AccountUpdateRequiredState accountUpdateRequiredState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, AccountUpdateRequiredContentRepository accountUpdateRequiredContentRepository, CoreAuthorizationPendingNetworkingRepairRepository coreAuthorizationPendingNetworkingRepairRepository, NavigationManagerImpl navigationManagerImpl, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, UpdateLocalManifest updateLocalManifest, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1) {
        super(accountUpdateRequiredState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        accountUpdateRequiredContentRepository.getClass();
        coreAuthorizationPendingNetworkingRepairRepository.getClass();
        navigationManagerImpl.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        updateLocalManifest.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        this.updateRequiredContentRepository = accountUpdateRequiredContentRepository;
        this.pendingRepairRepository = coreAuthorizationPendingNetworkingRepairRepository;
        this.navigationManager = navigationManagerImpl;
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.updateLocalManifest = updateLocalManifest;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        FinancialConnectionsViewModel.execute$default(this, new Pager$pageFetcher$2(this, null, 14), new KotterKnifeKt$$ExternalSyntheticLambda0(26));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.updateRequiredContentRepository.clear();
        super.onCleared();
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        ((AccountUpdateRequiredState) obj).getClass();
        return null;
    }
}
