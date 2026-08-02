package com.stripe.android.financialconnections.features.accountpicker;

import com.google.android.gms.internal.common.zzai;
import com.squareup.kotterknife.KotterKnifeKt$$ExternalSyntheticLambda0;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts$invoke$4;
import com.stripe.android.financialconnections.domain.RealCurrentLinkBrand;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.domain.SelectAccounts;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel;
import com.stripe.android.financialconnections.features.notice.RealPresentSheet;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import com.withpersona.sdk2.inquiry.webrtc.networking.WebRtcWorker$run$1;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class AccountPickerViewModel extends FinancialConnectionsViewModel {
    public static final FinancialConnectionsSessionManifest.Pane PANE = FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER;
    public final RealConsumerSessionRepository consumerSessionProvider;
    public final RealCurrentLinkBrand currentLinkBrand;
    public final FinancialConnectionsAnalyticsTrackerImpl eventTracker;
    public final GetOrFetchSync getOrFetchSync;
    public final HandleClickableUrl handleClickableUrl;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final NavigationManagerImpl navigationManager;
    public final SelectAccounts pollAuthorizationSessionAccounts;
    public final RealPresentSheet presentSheet;
    public final SaveAccountToLink saveAccountToLink;
    public final SelectAccounts selectAccounts;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountPickerViewModel(AccountPickerState accountPickerState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, RealConsumerSessionRepository realConsumerSessionRepository, RealCurrentLinkBrand realCurrentLinkBrand, SaveAccountToLink saveAccountToLink, SelectAccounts selectAccounts, GetOrFetchSync getOrFetchSync, NavigationManagerImpl navigationManagerImpl, HandleClickableUrl handleClickableUrl, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, SelectAccounts selectAccounts2, RealPresentSheet realPresentSheet) {
        super(accountPickerState, nativeAuthFlowCoordinator);
        nativeAuthFlowCoordinator.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        realConsumerSessionRepository.getClass();
        realCurrentLinkBrand.getClass();
        saveAccountToLink.getClass();
        selectAccounts.getClass();
        getOrFetchSync.getClass();
        navigationManagerImpl.getClass();
        handleClickableUrl.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        selectAccounts2.getClass();
        realPresentSheet.getClass();
        this.eventTracker = financialConnectionsAnalyticsTrackerImpl;
        this.consumerSessionProvider = realConsumerSessionRepository;
        this.currentLinkBrand = realCurrentLinkBrand;
        this.saveAccountToLink = saveAccountToLink;
        this.selectAccounts = selectAccounts;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManagerImpl;
        this.handleClickableUrl = handleClickableUrl;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.pollAuthorizationSessionAccounts = selectAccounts2;
        this.presentSheet = realPresentSheet;
        Continuation continuation = null;
        FinancialConnectionsViewModel.onAsync$default(this, AccountPickerViewModel$logErrors$1.INSTANCE, null, new AccountPickerViewModel$logErrors$2(this, continuation, 0), 2);
        int i = 1;
        FinancialConnectionsViewModel.onAsync$default(this, AccountPickerViewModel$logErrors$3.INSTANCE, null, new AccountPickerViewModel$logErrors$2(this, continuation, i), 2);
        FinancialConnectionsViewModel.onAsync$default(this, AccountPickerViewModel$onPayloadLoaded$1.INSTANCE, new AccountPickerViewModel$logErrors$2(this, continuation, 2), null, 4);
        FinancialConnectionsViewModel.execute$default(this, new WebRtcWorker$run$1.AnonymousClass1(this, null, 1), new KotterKnifeKt$$ExternalSyntheticLambda0(23));
        FinancialConnectionsViewModel.execute$default(this, new AttachPaymentViewModel.AnonymousClass1(this, continuation, i), new KotterKnifeKt$$ExternalSyntheticLambda0(24));
    }

    public final void submitAccounts(Set set, boolean z) {
        FinancialConnectionsViewModel.execute$default(this, new PollAuthorizationSessionAccounts$invoke$4(this, set, z, (Continuation) null), new KotterKnifeKt$$ExternalSyntheticLambda0(25));
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public final TopAppBarStateUpdate updateTopAppBar(Object obj) {
        AccountPickerState accountPickerState = (AccountPickerState) obj;
        accountPickerState.getClass();
        return new TopAppBarStateUpdate(PANE, false, zzai.getError(accountPickerState.payload), false, null, 56);
    }
}
