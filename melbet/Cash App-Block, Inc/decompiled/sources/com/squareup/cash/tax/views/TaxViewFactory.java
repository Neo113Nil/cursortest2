package com.squareup.cash.tax.views;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.ViewFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.passcode.backend.RealAppLockState;
import com.datadog.android.trace.Trace;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.UiSandboxedSetupTeardowns;
import com.squareup.cash.account.backend.AccountSwitchScreenStateRelay;
import com.squareup.cash.account.backend.RealAccountSwitchAnalytics;
import com.squareup.cash.account.backend.RealAccountSwitcher;
import com.squareup.cash.api.RealServiceContextManager;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.presenters.buy.BuyBitcoinNavigator;
import com.squareup.cash.bitcoin.presenters.featureavailability.BitcoinFeatureAvailabilityProvider;
import com.squareup.cash.bitcoin.presenters.investing.RealBitcoinSponsoredStateRepo;
import com.squareup.cash.bitcoin.presenters.limits.util.BitcoinLimitsProvider;
import com.squareup.cash.bitcoin.presenters.sell.SellBitcoinNavigator;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.braze.RealBrazeConfigurator;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.core.navigationcontainer.AcceptableScrim;
import com.squareup.cash.crypto.backend.balance.RealCryptoBalanceRepo;
import com.squareup.cash.crypto.backend.capability.RealBitcoinActivityProvider;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.data.transfers.RealTransferManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.downloadmanager.android.AndroidDownloadManager$Factory$Impl;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.localization.RealRegionProvider;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt$overrideTheme$1;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.payments.backend.real.RealOfflineManager;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.session.backend.RealOnSessionChangeActionsExecutor;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.stablecoin.capability.real.RealStablecoinCapabilityHelper;
import com.squareup.cash.storage.AndroidFileProvider;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.tax.screens.TaxAuthorizationScreen;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import com.squareup.cash.tax.screens.TaxReturnsScreen;
import com.squareup.cash.tax.screens.TaxTooltipScreen;
import com.squareup.cash.tax.screens.TaxWebBridgeDialog;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.network.impl.RealNetworkInfo;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.real.RealPayDataLoader;
import com.squareup.cash.work.data.real.RealPullToRefreshTrigger;
import com.squareup.cash.work.data.real.RealTeamMemberIdProvider;
import com.squareup.cash.work.service.api.payroll.PayrollJsonService;
import com.squareup.cash.work.service.api.payroll.PayrollService;
import com.squareup.cash.work.service.api.timecards.TimecardsService;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.StringPreference;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.util.workmanager.AndroidWorkManager;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.BaseDoubleCheckKt;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.Lazy;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class TaxViewFactory implements ViewFactory {
    public final Activity activity;
    public final Flow activityResults;
    public final String cashUserAgent;
    public final AndroidDownloadManager$Factory$Impl downloadManagerFactory;
    public final AndroidFileProvider fileProvider;
    public final IntentLauncher launcher;
    public final AndroidPermissionManager permissionManager;
    public final Storage storage;
    public final AndroidStringManager stringManager;
    public final Flow unhandledIntents;

    public TaxViewFactory(String str, IntentLauncher intentLauncher, AndroidDownloadManager$Factory$Impl androidDownloadManager$Factory$Impl, Activity activity, Flow flow, AndroidStringManager androidStringManager, AndroidPermissionManager androidPermissionManager, Flow flow2, Storage storage, AndroidFileProvider androidFileProvider) {
        this.cashUserAgent = str;
        this.launcher = intentLauncher;
        this.downloadManagerFactory = androidDownloadManager$Factory$Impl;
        this.activity = activity;
        this.activityResults = flow;
        this.stringManager = androidStringManager;
        this.permissionManager = androidPermissionManager;
        this.unhandledIntents = flow2;
        this.storage = storage;
        this.fileProvider = androidFileProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.squareup.cash.tax.views.TaxWebBridgeDialogView] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.squareup.cash.tax.views.TaxMenuSheetView] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.squareup.cash.tax.views.TaxWebAppView] */
    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        ComposeUiView taxWebAppView;
        context.getClass();
        ThemeHelpersKt$overrideTheme$1 overrideTheme = ThemeHelpersKt.overrideTheme(context, new TaxWebAppBridge$$ExternalSyntheticLambda1(3));
        if (screen instanceof TaxAuthorizationScreen) {
            taxWebAppView = new TaxAuthorizationView(overrideTheme);
        } else if (screen instanceof BlockersScreens.TaxWebViewScreen) {
            taxWebAppView = new TaxWebAppView(overrideTheme, this.cashUserAgent, Trace.provideTaxesHeaders(), this.launcher, this.downloadManagerFactory, this.activity, this.activityResults, this.stringManager, this.permissionManager, this.storage, this.fileProvider, this.unhandledIntents);
        } else if (screen instanceof TaxMenuSheet) {
            taxWebAppView = new TaxMenuSheetView(overrideTheme);
        } else if (screen instanceof TaxWebBridgeDialog) {
            taxWebAppView = new TaxWebBridgeDialogView(overrideTheme);
        } else if (screen instanceof TaxTooltipScreen) {
            taxWebAppView = new TaxTooltipView(overrideTheme);
        } else {
            if (!(screen instanceof TaxReturnsScreen)) {
                return null;
            }
            taxWebAppView = new TaxReturnsView(context);
        }
        return new ViewFactory.ScreenView(taxWebAppView, taxWebAppView);
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId = 4;
        public final Provider activity;
        public final Provider activityResults;
        public final Provider cashUserAgent;
        public final Provider downloadManagerFactory;
        public final Provider fileProvider;
        public final Provider launcher;
        public final Provider permissionManager;
        public final Provider storage;
        public final Provider stringManager;
        public final Provider unhandledIntents;

        public MetroFactory(RealAppLockState.MetroFactory metroFactory, TreehouseFlows.MetroFactory metroFactory2, RealMessageSigner.MetroFactory metroFactory3, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, NavigationSideEffects.MetroFactory metroFactory4, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2, CashCdpConfigProvider.MetroFactory metroFactory5, RealAppLockState.MetroFactory metroFactory6) {
            this.cashUserAgent = metroFactory;
            this.launcher = metroFactory2;
            this.downloadManagerFactory = metroFactory3;
            this.stringManager = lambdaProvider;
            this.permissionManager = doubleCheck;
            this.storage = metroFactory4;
            this.fileProvider = lambdaProvider2;
            this.activity = doubleCheck2;
            this.activityResults = metroFactory5;
            this.unhandledIntents = metroFactory6;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r7v6, types: [kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.activity;
            Provider provider2 = this.unhandledIntents;
            Provider provider3 = this.fileProvider;
            Provider provider4 = this.storage;
            Provider provider5 = this.permissionManager;
            Provider provider6 = this.activityResults;
            Provider provider7 = this.stringManager;
            Provider provider8 = this.downloadManagerFactory;
            Provider provider9 = this.launcher;
            Provider provider10 = this.cashUserAgent;
            switch (i) {
                case 0:
                    String str = (String) provider10.invoke();
                    IntentLauncher intentLauncher = (IntentLauncher) provider9.invoke();
                    AndroidDownloadManager$Factory$Impl androidDownloadManager$Factory$Impl = (AndroidDownloadManager$Factory$Impl) provider8.invoke();
                    Activity activity = (Activity) ((InstanceFactory) provider).value;
                    Flow flow = (Flow) ((InstanceFactory) provider6).value;
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider7.invoke();
                    AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) provider5.invoke();
                    Flow flow2 = (Flow) ((InstanceFactory) provider2).value;
                    Storage storage = (Storage) provider4.invoke();
                    AndroidFileProvider androidFileProvider = (AndroidFileProvider) provider3.invoke();
                    str.getClass();
                    intentLauncher.getClass();
                    androidDownloadManager$Factory$Impl.getClass();
                    activity.getClass();
                    flow.getClass();
                    androidStringManager.getClass();
                    androidPermissionManager.getClass();
                    flow2.getClass();
                    storage.getClass();
                    androidFileProvider.getClass();
                    return new TaxViewFactory(str, intentLauncher, androidDownloadManager$Factory$Impl, activity, flow, androidStringManager, androidPermissionManager, flow2, storage, androidFileProvider);
                case 1:
                    JanusService janusService = (JanusService) provider10.invoke();
                    SessionManager sessionManager = (SessionManager) provider9.invoke();
                    FlowStarter flowStarter = (FlowStarter) provider8.invoke();
                    RealAccountSwitchAnalytics realAccountSwitchAnalytics = (RealAccountSwitchAnalytics) provider7.invoke();
                    AndroidClock androidClock = (AndroidClock) provider5.invoke();
                    RealSessionFlags realSessionFlags = (RealSessionFlags) provider4.invoke();
                    AccountSwitchScreenStateRelay accountSwitchScreenStateRelay = (AccountSwitchScreenStateRelay) ((InstanceFactory) provider).value;
                    AcceptableScrim acceptableScrim = (AcceptableScrim) ((InstanceFactory) provider6).value;
                    KeyValue keyValue = (KeyValue) provider3.invoke();
                    janusService.getClass();
                    sessionManager.getClass();
                    flowStarter.getClass();
                    realAccountSwitchAnalytics.getClass();
                    androidClock.getClass();
                    realSessionFlags.getClass();
                    accountSwitchScreenStateRelay.getClass();
                    acceptableScrim.getClass();
                    keyValue.getClass();
                    return new RealAccountSwitcher(janusService, sessionManager, flowStarter, realAccountSwitchAnalytics, androidClock, realSessionFlags, accountSwitchScreenStateRelay, (RealOnSessionChangeActionsExecutor.MetroFactory) provider2, acceptableScrim, keyValue);
                case 2:
                    Lazy lazy = BaseDoubleCheckKt.lazy((RealBrazeConfigurator.MetroFactory) provider);
                    Lazy lazy2 = BaseDoubleCheckKt.lazy(provider10);
                    Lazy lazy3 = BaseDoubleCheckKt.lazy(provider9);
                    Lazy lazy4 = BaseDoubleCheckKt.lazy(provider8);
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider7.invoke();
                    Lazy lazy5 = BaseDoubleCheckKt.lazy(provider5);
                    Lazy lazy6 = BaseDoubleCheckKt.lazy(provider4);
                    SessionManager sessionManager2 = (SessionManager) provider3.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider6.invoke();
                    RealRegionProvider realRegionProvider = (RealRegionProvider) provider2.invoke();
                    cashAccountDatabaseImpl.getClass();
                    sessionManager2.getClass();
                    coroutineContext.getClass();
                    realRegionProvider.getClass();
                    return new RealServiceContextManager(lazy, lazy2, lazy3, lazy4, cashAccountDatabaseImpl, lazy5, lazy6, sessionManager2, coroutineContext, realRegionProvider);
                case 3:
                    BitcoinLimitsProvider bitcoinLimitsProvider = (BitcoinLimitsProvider) provider10.invoke();
                    BuyBitcoinNavigator buyBitcoinNavigator = (BuyBitcoinNavigator) ((BorrowUiFactory.MetroFactory) provider).invoke();
                    SellBitcoinNavigator sellBitcoinNavigator = (SellBitcoinNavigator) ((RealBrazeConfigurator.MetroFactory) provider6).invoke();
                    RealBitcoinActivityProvider realBitcoinActivityProvider = (RealBitcoinActivityProvider) provider9.invoke();
                    RealCryptoBalanceRepo realCryptoBalanceRepo = (RealCryptoBalanceRepo) provider8.invoke();
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) provider7.invoke();
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider5.invoke();
                    RealBitcoinSponsoredStateRepo realBitcoinSponsoredStateRepo = (RealBitcoinSponsoredStateRepo) provider4.invoke();
                    RealStablecoinCapabilityHelper realStablecoinCapabilityHelper = (RealStablecoinCapabilityHelper) provider3.invoke();
                    Analytics analytics = (Analytics) provider2.invoke();
                    bitcoinLimitsProvider.getClass();
                    realBitcoinActivityProvider.getClass();
                    realCryptoBalanceRepo.getClass();
                    androidStringManager2.getClass();
                    realBitcoinCapabilityProvider.getClass();
                    realBitcoinSponsoredStateRepo.getClass();
                    realStablecoinCapabilityHelper.getClass();
                    analytics.getClass();
                    return new StuckPlayerDetector(bitcoinLimitsProvider, buyBitcoinNavigator, sellBitcoinNavigator, realBitcoinActivityProvider, realCryptoBalanceRepo, androidStringManager2, realBitcoinCapabilityProvider, realBitcoinSponsoredStateRepo, realStablecoinCapabilityHelper, analytics, 6);
                case 4:
                    RealBitcoinActivityProvider realBitcoinActivityProvider2 = (RealBitcoinActivityProvider) provider10.invoke();
                    RealBitcoinProfileRepo realBitcoinProfileRepo = (RealBitcoinProfileRepo) provider9.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider8.invoke();
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) provider7.invoke();
                    Analytics analytics2 = (Analytics) provider5.invoke();
                    RealProfileNotificationsRepository realProfileNotificationsRepository = (RealProfileNotificationsRepository) provider4.invoke();
                    SessionManager sessionManager3 = (SessionManager) provider3.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    zzb zzbVar = new zzb(17);
                    RealCryptoValueRepo realCryptoValueRepo = (RealCryptoValueRepo) provider6.invoke();
                    BitcoinFeatureAvailabilityProvider bitcoinFeatureAvailabilityProvider = (BitcoinFeatureAvailabilityProvider) provider2.invoke();
                    realBitcoinActivityProvider2.getClass();
                    realBitcoinProfileRepo.getClass();
                    factory.getClass();
                    androidStringManager3.getClass();
                    analytics2.getClass();
                    realProfileNotificationsRepository.getClass();
                    sessionManager3.getClass();
                    featureFlagManager.getClass();
                    realCryptoValueRepo.getClass();
                    bitcoinFeatureAvailabilityProvider.getClass();
                    return new StuckPlayerDetector(realBitcoinActivityProvider2, realBitcoinProfileRepo, factory, androidStringManager3, analytics2, realProfileNotificationsRepository, sessionManager3, featureFlagManager, zzbVar, realCryptoValueRepo, bitcoinFeatureAvailabilityProvider);
                case 5:
                    StringPreference stringPreference = (StringPreference) provider10.invoke();
                    AppConfigManager appConfigManager = (AppConfigManager) ((DoubleCheck) provider).getValue();
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) provider9.invoke();
                    BlockerFlowListener blockerFlowListener = (BlockerFlowListener) provider8.invoke();
                    AndroidClock androidClock2 = (AndroidClock) provider7.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider5.invoke();
                    SessionManager sessionManager4 = (SessionManager) provider4.invoke();
                    RealOnboardingFlowTokenManager realOnboardingFlowTokenManager = (RealOnboardingFlowTokenManager) ((LambdaProvider) provider6).lambda.invoke();
                    RealRegionProvider realRegionProvider2 = (RealRegionProvider) provider3.invoke();
                    Analytics analytics3 = (Analytics) provider2.invoke();
                    stringPreference.getClass();
                    appConfigManager.getClass();
                    blockersDataNavigator.getClass();
                    blockerFlowListener.getClass();
                    androidClock2.getClass();
                    featureFlagManager2.getClass();
                    sessionManager4.getClass();
                    realOnboardingFlowTokenManager.getClass();
                    realRegionProvider2.getClass();
                    analytics3.getClass();
                    return new RealFlowStarter(stringPreference, appConfigManager, blockersDataNavigator, blockerFlowListener, androidClock2, featureFlagManager2, sessionManager4, realOnboardingFlowTokenManager, realRegionProvider2, analytics3);
                case 6:
                    AndroidClock androidClock3 = (AndroidClock) provider10.invoke();
                    Provider provider11 = (UiSandboxedSetupTeardowns.MetroFactory) provider6;
                    DoubleCheck doubleCheck = provider11 instanceof Lazy ? (Lazy) provider11 : new DoubleCheck(provider11);
                    Provider provider12 = (RealTransferManager.MetroFactory) provider2;
                    DoubleCheck doubleCheck2 = provider12 instanceof Lazy ? (Lazy) provider12 : new DoubleCheck(provider12);
                    AndroidWorkManager androidWorkManager = (AndroidWorkManager) provider9.invoke();
                    Analytics analytics4 = (Analytics) provider8.invoke();
                    RealNetworkInfo realNetworkInfo = (RealNetworkInfo) provider7.invoke();
                    Flow flow3 = (Flow) provider5.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider4.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) provider).value;
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider3.invoke();
                    androidClock3.getClass();
                    androidWorkManager.getClass();
                    analytics4.getClass();
                    realNetworkInfo.getClass();
                    flow3.getClass();
                    cashAccountDatabaseImpl2.getClass();
                    coroutineScope.getClass();
                    coroutineContext2.getClass();
                    return new RealOfflineManager(androidClock3, doubleCheck, doubleCheck2, androidWorkManager, analytics4, realNetworkInfo, flow3, cashAccountDatabaseImpl2, coroutineScope, coroutineContext2);
                default:
                    RealPullToRefreshTrigger realPullToRefreshTrigger = (RealPullToRefreshTrigger) provider10.invoke();
                    RealTeamMemberIdProvider realTeamMemberIdProvider = (RealTeamMemberIdProvider) provider9.invoke();
                    RealSelectedMerchantProvider realSelectedMerchantProvider = (RealSelectedMerchantProvider) provider8.invoke();
                    TimecardsService timecardsService = (TimecardsService) provider7.invoke();
                    PayrollService payrollService = (PayrollService) ((DoubleCheck) provider6).getValue();
                    PayrollJsonService payrollJsonService = (PayrollJsonService) provider5.invoke();
                    RealMerchantRepository realMerchantRepository = (RealMerchantRepository) provider4.invoke();
                    RealLocaleManager realLocaleManager = (RealLocaleManager) provider3.invoke();
                    AndroidClock androidClock4 = (AndroidClock) provider2.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) ((InstanceFactory) provider).value;
                    realPullToRefreshTrigger.getClass();
                    realTeamMemberIdProvider.getClass();
                    realSelectedMerchantProvider.getClass();
                    timecardsService.getClass();
                    payrollService.getClass();
                    payrollJsonService.getClass();
                    realMerchantRepository.getClass();
                    realLocaleManager.getClass();
                    androidClock4.getClass();
                    coroutineScope2.getClass();
                    return new RealPayDataLoader(realPullToRefreshTrigger, realTeamMemberIdProvider, realSelectedMerchantProvider, timecardsService, payrollService, payrollJsonService, realMerchantRepository, realLocaleManager, androidClock4, coroutineScope2);
            }
        }

        public MetroFactory(RealBrazeConfigurator.MetroFactory metroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DelegateFactory delegateFactory, DoubleCheck doubleCheck3, RealReferralManager.MetroFactory metroFactory2, DoubleCheck doubleCheck4, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck5) {
            this.activity = metroFactory;
            this.cashUserAgent = doubleCheck;
            this.launcher = doubleCheck2;
            this.downloadManagerFactory = delegateFactory;
            this.stringManager = doubleCheck3;
            this.permissionManager = metroFactory2;
            this.storage = doubleCheck4;
            this.fileProvider = lambdaProvider;
            this.activityResults = lambdaProvider2;
            this.unhandledIntents = doubleCheck5;
        }

        public MetroFactory(RealGlobalConfigManager.MetroFactory metroFactory, BorrowUiFactory.MetroFactory metroFactory2, RealBrazeConfigurator.MetroFactory metroFactory3, RealAppLockState.MetroFactory metroFactory4, RealAppMessageManager.MetroFactory metroFactory5, LambdaProvider lambdaProvider, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory2, RetroUiFactory.MetroFactory metroFactory6, DoubleCheck doubleCheck) {
            this.cashUserAgent = metroFactory;
            this.activity = metroFactory2;
            this.activityResults = metroFactory3;
            this.launcher = metroFactory4;
            this.downloadManagerFactory = metroFactory5;
            this.stringManager = lambdaProvider;
            this.permissionManager = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.storage = arcadeModule$ProvideHapticVibratorMetroFactory2;
            this.fileProvider = metroFactory6;
            this.unhandledIntents = doubleCheck;
        }

        public MetroFactory(LambdaProvider lambdaProvider, UiSandboxedSetupTeardowns.MetroFactory metroFactory, RealTransferManager.MetroFactory metroFactory2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, InstanceFactory instanceFactory, LambdaProvider lambdaProvider3) {
            this.cashUserAgent = lambdaProvider;
            this.activityResults = metroFactory;
            this.unhandledIntents = metroFactory2;
            this.launcher = lambdaProvider2;
            this.downloadManagerFactory = doubleCheck;
            this.stringManager = realDrawerOpener$MetroFactory;
            this.permissionManager = doubleCheck2;
            this.storage = doubleCheck3;
            this.activity = instanceFactory;
            this.fileProvider = lambdaProvider3;
        }

        public MetroFactory(DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, InstanceFactory instanceFactory4, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider2) {
            this.cashUserAgent = doubleCheck;
            this.launcher = metroFactory;
            this.downloadManagerFactory = instanceFactory;
            this.activity = instanceFactory2;
            this.activityResults = instanceFactory3;
            this.stringManager = lambdaProvider;
            this.permissionManager = doubleCheck2;
            this.unhandledIntents = instanceFactory4;
            this.storage = doubleCheck3;
            this.fileProvider = lambdaProvider2;
        }

        public MetroFactory(DoubleCheck doubleCheck, ShiftsAnalytics.MetroFactory metroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, DoubleCheck doubleCheck6, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, InstanceFactory instanceFactory) {
            this.cashUserAgent = doubleCheck;
            this.launcher = metroFactory;
            this.downloadManagerFactory = doubleCheck2;
            this.stringManager = doubleCheck3;
            this.activityResults = doubleCheck4;
            this.permissionManager = doubleCheck5;
            this.storage = doubleCheck6;
            this.fileProvider = lambdaProvider;
            this.unhandledIntents = lambdaProvider2;
            this.activity = instanceFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, TreehouseFlows.MetroFactory metroFactory, LambdaProvider lambdaProvider2, Provider provider, InstanceFactory instanceFactory, RealOnSessionChangeActionsExecutor.MetroFactory metroFactory2, InstanceFactory instanceFactory2, BorrowUiFactory.MetroFactory metroFactory3) {
            this.cashUserAgent = doubleCheck;
            this.launcher = lambdaProvider;
            this.downloadManagerFactory = doubleCheck2;
            this.stringManager = metroFactory;
            this.permissionManager = lambdaProvider2;
            this.storage = provider;
            this.activity = instanceFactory;
            this.unhandledIntents = metroFactory2;
            this.activityResults = instanceFactory2;
            this.fileProvider = metroFactory3;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, RealGlobalConfigDataSource.MetroFactory metroFactory2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5) {
            this.cashUserAgent = doubleCheck;
            this.activity = doubleCheck2;
            this.launcher = metroFactory;
            this.downloadManagerFactory = metroFactory2;
            this.stringManager = lambdaProvider;
            this.permissionManager = doubleCheck3;
            this.storage = lambdaProvider2;
            this.activityResults = lambdaProvider3;
            this.fileProvider = doubleCheck4;
            this.unhandledIntents = doubleCheck5;
        }
    }
}
