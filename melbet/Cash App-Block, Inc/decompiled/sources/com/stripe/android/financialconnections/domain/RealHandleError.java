package com.stripe.android.financialconnections.domain;

import androidx.lifecycle.SavedStateHandle;
import com.datadog.trace.core.util.Matchers;
import com.squareup.workflow1.TimerWorker$run$1;
import com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl;
import com.stripe.android.financialconnections.features.error.FinancialConnectionsAttestationError;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.repository.FinancialConnectionsErrorRepository;
import com.stripe.android.uicore.navigation.NavigationManagerImpl;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes8.dex */
public final class RealHandleError {
    public final FinancialConnectionsAnalyticsTrackerImpl analyticsTracker;
    public final FinancialConnectionsErrorRepository errorRepository;
    public final Logger$Companion$NOOP_LOGGER$1 logger;
    public final NativeAuthFlowCoordinator nativeAuthFlowCoordinator;
    public final NavigationManagerImpl navigationManager;

    public RealHandleError(FinancialConnectionsErrorRepository financialConnectionsErrorRepository, FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, Logger$Companion$NOOP_LOGGER$1 logger$Companion$NOOP_LOGGER$1, NavigationManagerImpl navigationManagerImpl) {
        financialConnectionsErrorRepository.getClass();
        financialConnectionsAnalyticsTrackerImpl.getClass();
        nativeAuthFlowCoordinator.getClass();
        logger$Companion$NOOP_LOGGER$1.getClass();
        navigationManagerImpl.getClass();
        this.errorRepository = financialConnectionsErrorRepository;
        this.analyticsTracker = financialConnectionsAnalyticsTrackerImpl;
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        this.logger = logger$Companion$NOOP_LOGGER$1;
        this.navigationManager = navigationManagerImpl;
    }

    public final void invoke(String str, Throwable th, FinancialConnectionsSessionManifest.Pane pane, boolean z) {
        th.getClass();
        pane.getClass();
        Matchers.logError(this.analyticsTracker, str, th, this.logger, pane);
        Continuation continuation = null;
        if (th instanceof FinancialConnectionsAttestationError) {
            JobKt.launch$default(GlobalScope.INSTANCE, null, null, new TimerWorker$run$1(this, th, continuation, 27), 3);
        } else if (z) {
            FinancialConnectionsErrorRepository financialConnectionsErrorRepository = this.errorRepository;
            financialConnectionsErrorRepository.getClass();
            ((SavedStateHandle) financialConnectionsErrorRepository.zzd).set(new FinancialConnectionsErrorRepository.State(th), (String) financialConnectionsErrorRepository.zza);
            NavigationManagerImpl.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.Error.INSTANCE, pane), null, 6);
        }
    }
}
