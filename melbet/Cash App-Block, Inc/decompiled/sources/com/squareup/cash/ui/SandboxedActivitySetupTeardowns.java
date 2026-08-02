package com.squareup.cash.ui;

import app.cash.badging.backend.RealBadger2;
import app.cash.local.views.LocalViewFactory;
import app.cash.passcode.backend.AppLockMonitor;
import com.squareup.cash.appmessages.AppMessageSyncer;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.mri.android.MobileRuntimeIntegrityWorker;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.SandboxJanitor;
import com.squareup.cash.support.chat.backend.real.ChatNotificationLifecycleWorker;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$TaxesAppletMetroFactory;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import papa.InteractionResult;

/* loaded from: classes.dex */
public final class SandboxedActivitySetupTeardowns extends InteractionResult {

    public final class MetroFactory {
        public final BorrowUiFactory.MetroFactory activitiesWorker;
        public final Provider activityEventFlushStrategy;
        public final AppLockMonitor.MetroFactory appLockMonitor;
        public final AppMessageSyncer.MetroFactory appLockRecentScreenshotsDisabler;
        public final AppMessageSyncer.MetroFactory appMessageSyncer;
        public final InstanceFactory appVersionCheckerActivityWorker;
        public final Provider badger;
        public final BorrowUiFactory.MetroFactory bitcoinGraphModelPrefetch;
        public final LocalViewFactory.MetroFactory brazeSetup;
        public final Provider cardAppletWorker;
        public final ChatNotificationLifecycleWorker.MetroFactory chatNotificationLifecycleWorker;
        public final TreehouseFlows.MetroFactory clientSyncSetupTeardown;
        public final RealFilamentSupportProvider.MetroFactory clientTrustSignalsPublisher;
        public final RealBadger2.MetroFactory customerStreamingSubscriber;
        public final FillrInitializer.MetroFactory ddaAccountSetupTeardown;
        public final RealBadger2.MetroFactory deepLinkAttributionWorker;
        public final Provider deepLinkOnboardingContextWorker;
        public final Provider echoWorker;
        public final RealFileDownloader.MetroFactory eligibilityRefresherSetupTeardown;
        public final LocalViewFactory.MetroFactory favoriteUpsellRefresher;
        public final Provider featureFlagManager;
        public final Provider filamentSupportProvider;
        public final Provider fillrInitializer;
        public final Provider globalConfigManager;
        public final RealKeyStoreProvider.MetroFactory gpsLocationRefresher;
        public final Provider ioDispatcher;
        public final InstanceFactory languageDisclosureSetupTeardown;
        public final InstanceFactory localIoActivitySetupTeardown;
        public final Provider mainPaymentPadRefresher;
        public final MobileRuntimeIntegrityWorker.MetroFactory mobileRuntimeIntegrityWorker;
        public final InstanceFactory paymentActionNavigatorFactory;
        public final RealFileDownloader.MetroFactory personalizePaymentResourceRefresher;
        public final RealKeyStoreProvider.MetroFactory poolsRefresher;
        public final Provider repeatTaskAggregator;
        public final Provider sessionFlags;
        public final RealFileDownloader.MetroFactory signatureManager;
        public final InstanceFactory signoutSideEffectsPerformer;
        public final InstanceFactory supportPhoneVerificationMonitor;
        public final SandboxJanitor.MetroFactory tabProviderActivityWorker;
        public final ShiftsAnalytics.MetroFactory threeDsAuthenticationWorker;
        public final RealSessionFlags.MetroFactory threeDsServiceInitializer;
        public final TaxesAppletViewsModule$TaxesAppletMetroFactory transitionsSideEffectsPerformer;
        public final Provider uiDispatcher;

        public MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, AppMessageSyncer.MetroFactory metroFactory, DoubleCheck doubleCheck, TaxesAppletViewsModule$TaxesAppletMetroFactory taxesAppletViewsModule$TaxesAppletMetroFactory, ChatNotificationLifecycleWorker.MetroFactory metroFactory2, RealBadger2.MetroFactory metroFactory3, Provider provider, InstanceFactory instanceFactory, Provider provider2, Provider provider3, SandboxJanitor.MetroFactory metroFactory4, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, AppLockMonitor.MetroFactory metroFactory5, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, RealBadger2.MetroFactory metroFactory6, RealFileDownloader.MetroFactory metroFactory7, DoubleCheck doubleCheck2, InstanceFactory instanceFactory6, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, RealFileDownloader.MetroFactory metroFactory8, TreehouseFlows.MetroFactory metroFactory9, MobileRuntimeIntegrityWorker.MetroFactory metroFactory10, RealFilamentSupportProvider.MetroFactory metroFactory11, BorrowUiFactory.MetroFactory metroFactory12, LocalViewFactory.MetroFactory metroFactory13, Provider provider4, RealFileDownloader.MetroFactory metroFactory14, RealKeyStoreProvider.MetroFactory metroFactory15, BorrowUiFactory.MetroFactory metroFactory16, RealKeyStoreProvider.MetroFactory metroFactory17, RealSessionFlags.MetroFactory metroFactory18, ShiftsAnalytics.MetroFactory metroFactory19, Provider provider5, Provider provider6, Provider provider7, AppMessageSyncer.MetroFactory metroFactory20, LocalViewFactory.MetroFactory metroFactory21, DoubleCheck doubleCheck5, FillrInitializer.MetroFactory metroFactory22) {
            this.uiDispatcher = lambdaProvider;
            this.ioDispatcher = lambdaProvider2;
            this.appMessageSyncer = metroFactory;
            this.badger = doubleCheck;
            this.transitionsSideEffectsPerformer = taxesAppletViewsModule$TaxesAppletMetroFactory;
            this.chatNotificationLifecycleWorker = metroFactory2;
            this.deepLinkAttributionWorker = metroFactory3;
            this.deepLinkOnboardingContextWorker = provider;
            this.signoutSideEffectsPerformer = instanceFactory;
            this.fillrInitializer = provider2;
            this.sessionFlags = provider3;
            this.tabProviderActivityWorker = metroFactory4;
            this.languageDisclosureSetupTeardown = instanceFactory2;
            this.appVersionCheckerActivityWorker = instanceFactory3;
            this.appLockMonitor = metroFactory5;
            this.supportPhoneVerificationMonitor = instanceFactory4;
            this.localIoActivitySetupTeardown = instanceFactory5;
            this.customerStreamingSubscriber = metroFactory6;
            this.signatureManager = metroFactory7;
            this.activityEventFlushStrategy = doubleCheck2;
            this.paymentActionNavigatorFactory = instanceFactory6;
            this.featureFlagManager = doubleCheck3;
            this.globalConfigManager = doubleCheck4;
            this.eligibilityRefresherSetupTeardown = metroFactory8;
            this.clientSyncSetupTeardown = metroFactory9;
            this.mobileRuntimeIntegrityWorker = metroFactory10;
            this.clientTrustSignalsPublisher = metroFactory11;
            this.activitiesWorker = metroFactory12;
            this.favoriteUpsellRefresher = metroFactory13;
            this.mainPaymentPadRefresher = provider4;
            this.personalizePaymentResourceRefresher = metroFactory14;
            this.gpsLocationRefresher = metroFactory15;
            this.bitcoinGraphModelPrefetch = metroFactory16;
            this.poolsRefresher = metroFactory17;
            this.threeDsServiceInitializer = metroFactory18;
            this.threeDsAuthenticationWorker = metroFactory19;
            this.repeatTaskAggregator = provider5;
            this.cardAppletWorker = provider6;
            this.echoWorker = provider7;
            this.appLockRecentScreenshotsDisabler = metroFactory20;
            this.brazeSetup = metroFactory21;
            this.filamentSupportProvider = doubleCheck5;
            this.ddaAccountSetupTeardown = metroFactory22;
        }
    }
}
