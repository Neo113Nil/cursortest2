package com.squareup.cash.wallet.views;

import app.cash.local.views.LocalViewFactory;
import coil3.RealImageLoader;
import com.squareup.cash.activity.backend.loader.DefaultGetRequestHandler$Factory;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.MultiplatformEntitySyncer;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.history.backend.real.RealInvestmentActivity;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.RealInvestmentPerformanceSyncer;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPromptManager;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotWidgetManager;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mri.android.RealComputationalIntegrityChecker;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.overrides.HomeScreenOverrideRule;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shopping.backend.real.RealShopHubAnalyticsHelper;
import com.squareup.cash.shopping.web.RealShoppingWebCheckoutCookieManager;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.backend.real.RealSupportActivityItemLoader;
import com.squareup.cash.support.chat.backend.real.RealTransactionBodyResolver;
import com.squareup.cash.transfers.backend.real.RealTransfersWithdrawManager;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.webview.android.AndroidCookieManager;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.work.data.real.RealAssignedJobProvider;
import com.squareup.cash.work.presenters.providers.RealAssignedLocationProvider;
import com.squareup.cash.work.session.RealCurrentUserProvider;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.real.RealJobRepository;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashapproxy.api.CashApProxyClientService;
import com.squareup.protos.cash.kgoose.api.v3.WidgetService;
import com.squareup.protos.cash.kgoose.api.v3.cash.CashKgooseService;
import com.squareup.protos.cash.portfolios.PortfoliosService;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.coroutines.Signal;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.CoroutineContext;
import okio.internal.DefaultSocket;

/* loaded from: classes.dex */
public final class WalletUiFactory$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider authenticatedImageLoader;
    public final Provider cardRegistry;
    public final Provider elementBoundsRegistry;
    public final Provider imageLoader;

    public /* synthetic */ WalletUiFactory$MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, int i) {
        this.$r8$classId = i;
        this.imageLoader = provider;
        this.authenticatedImageLoader = provider2;
        this.elementBoundsRegistry = provider3;
        this.cardRegistry = provider4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Provider provider = this.cardRegistry;
        Provider provider2 = this.elementBoundsRegistry;
        Provider provider3 = this.authenticatedImageLoader;
        Provider provider4 = this.imageLoader;
        switch (i) {
            case 0:
                RealImageLoader realImageLoader = (RealImageLoader) provider4.invoke();
                RealImageLoader realImageLoader2 = (RealImageLoader) provider3.invoke();
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) provider2.invoke();
                CardRegistry cardRegistry = (CardRegistry) provider.invoke();
                realImageLoader.getClass();
                realImageLoader2.getClass();
                elementBoundsRegistry.getClass();
                cardRegistry.getClass();
                return new LocalViewFactory(realImageLoader, realImageLoader2, elementBoundsRegistry, cardRegistry);
            case 1:
                CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider4.invoke();
                AndroidClock androidClock = (AndroidClock) provider3.invoke();
                MultiplatformEntitySyncer multiplatformEntitySyncer = (MultiplatformEntitySyncer) provider2.invoke();
                CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                cashAccountDatabaseImpl.getClass();
                androidClock.getClass();
                multiplatformEntitySyncer.getClass();
                coroutineContext.getClass();
                return new RealInvestmentActivity(cashAccountDatabaseImpl, androidClock, multiplatformEntitySyncer, coroutineContext);
            case 2:
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider4.invoke();
                AndroidToaster androidToaster = (AndroidToaster) provider3.invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) provider2.invoke();
                KeyValue keyValue = (KeyValue) provider.invoke();
                featureFlagManager.getClass();
                androidToaster.getClass();
                androidStringManager.getClass();
                keyValue.getClass();
                return new DefaultSocket(featureFlagManager, androidToaster, androidStringManager, keyValue, 1);
            case 3:
                CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider4.invoke();
                AppService appService = (AppService) provider3.invoke();
                SyncValueReader syncValueReader = (SyncValueReader) provider2.invoke();
                Signal signal = (Signal) provider.invoke();
                cashAccountDatabaseImpl2.getClass();
                appService.getClass();
                syncValueReader.getClass();
                signal.getClass();
                return new RealInstrumentManager(cashAccountDatabaseImpl2, appService, syncValueReader, signal);
            case 4:
                CashAccountDatabaseImpl cashAccountDatabaseImpl3 = (CashAccountDatabaseImpl) provider4.invoke();
                RealEntityPriceRefresher realEntityPriceRefresher = (RealEntityPriceRefresher) provider3.invoke();
                Signal signal2 = (Signal) provider2.invoke();
                CoroutineContext coroutineContext2 = (CoroutineContext) provider.invoke();
                cashAccountDatabaseImpl3.getClass();
                realEntityPriceRefresher.getClass();
                signal2.getClass();
                coroutineContext2.getClass();
                return new RealInvestmentEntities(cashAccountDatabaseImpl3, realEntityPriceRefresher, signal2, coroutineContext2);
            case 5:
                Signal signal3 = (Signal) provider4.invoke();
                CoroutineContext coroutineContext3 = (CoroutineContext) provider3.invoke();
                PortfoliosService portfoliosService = (PortfoliosService) provider2.invoke();
                CashAccountDatabaseImpl cashAccountDatabaseImpl4 = (CashAccountDatabaseImpl) provider.invoke();
                signal3.getClass();
                coroutineContext3.getClass();
                portfoliosService.getClass();
                cashAccountDatabaseImpl4.getClass();
                return new RealInvestmentPerformanceSyncer(signal3, coroutineContext3, portfoliosService, cashAccountDatabaseImpl4);
            case 6:
                ErrorReporter errorReporter = (ErrorReporter) provider4.invoke();
                SampleStrategy sampleStrategy = (SampleStrategy) provider3.invoke();
                CashKgooseService cashKgooseService = (CashKgooseService) provider2.invoke();
                RealMoneybotAnalyticsService realMoneybotAnalyticsService = (RealMoneybotAnalyticsService) provider.invoke();
                errorReporter.getClass();
                sampleStrategy.getClass();
                cashKgooseService.getClass();
                realMoneybotAnalyticsService.getClass();
                return new RealMoneybotPromptManager(errorReporter, sampleStrategy, cashKgooseService, realMoneybotAnalyticsService);
            case 7:
                ErrorReporter errorReporter2 = (ErrorReporter) provider4.invoke();
                SampleStrategy sampleStrategy2 = (SampleStrategy) provider3.invoke();
                WidgetService widgetService = (WidgetService) provider2.invoke();
                ClientRenderablePluginRegistry clientRenderablePluginRegistry = (ClientRenderablePluginRegistry) provider.invoke();
                errorReporter2.getClass();
                sampleStrategy2.getClass();
                widgetService.getClass();
                clientRenderablePluginRegistry.getClass();
                return new RealMoneybotWidgetManager(errorReporter2, sampleStrategy2, widgetService, clientRenderablePluginRegistry);
            case 8:
                SessionManager sessionManager = (SessionManager) provider4.invoke();
                ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1 = (ForcedLazyKt$forcedLazy$1) provider3.invoke();
                CoroutineContext coroutineContext4 = (CoroutineContext) provider2.invoke();
                ErrorReporter errorReporter3 = (ErrorReporter) provider.invoke();
                sessionManager.getClass();
                forcedLazyKt$forcedLazy$1.getClass();
                coroutineContext4.getClass();
                errorReporter3.getClass();
                return new RealComputationalIntegrityChecker(sessionManager, forcedLazyKt$forcedLazy$1, coroutineContext4, errorReporter3);
            case 9:
                RealSessionFlags realSessionFlags = (RealSessionFlags) provider4.invoke();
                CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider3.invoke();
                SessionManager sessionManager2 = (SessionManager) provider2.invoke();
                RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) provider.invoke();
                realSessionFlags.getClass();
                cashAppLiteReleaseModule$$ExternalSyntheticLambda0.getClass();
                sessionManager2.getClass();
                realFamilyProfileManager.getClass();
                return new HomeScreenOverrideRule(realSessionFlags, cashAppLiteReleaseModule$$ExternalSyntheticLambda0, sessionManager2, realFamilyProfileManager);
            case 10:
                SyncValueReader syncValueReader2 = (SyncValueReader) provider4.invoke();
                LendingAppService lendingAppService = (LendingAppService) provider3.invoke();
                ErrorReporter errorReporter4 = (ErrorReporter) provider2.invoke();
                String str = (String) provider.invoke();
                syncValueReader2.getClass();
                lendingAppService.getClass();
                errorReporter4.getClass();
                str.getClass();
                return new RealPrepurchaseCashCardRepository(syncValueReader2, lendingAppService, errorReporter4, str);
            case 11:
                RealContactRepository realContactRepository = (RealContactRepository) provider4.invoke();
                AppConfigManager appConfigManager = (AppConfigManager) provider3.invoke();
                AppService appService2 = (AppService) provider2.invoke();
                long longValue = ((Number) provider.invoke()).longValue();
                realContactRepository.getClass();
                appConfigManager.getClass();
                appService2.getClass();
                return new Lazy(realContactRepository, appConfigManager, appService2, longValue);
            case 12:
                AndroidCookieManager androidCookieManager = (AndroidCookieManager) provider4.invoke();
                AndroidClock androidClock2 = (AndroidClock) provider3.invoke();
                CashApProxyClientService cashApProxyClientService = (CashApProxyClientService) provider2.invoke();
                RealShopHubAnalyticsHelper realShopHubAnalyticsHelper = (RealShopHubAnalyticsHelper) provider.invoke();
                androidCookieManager.getClass();
                androidClock2.getClass();
                cashApProxyClientService.getClass();
                realShopHubAnalyticsHelper.getClass();
                return new RealShoppingWebCheckoutCookieManager(androidCookieManager, androidClock2, cashApProxyClientService, realShopHubAnalyticsHelper);
            case 13:
                RealActivityTokenFactory realActivityTokenFactory = (RealActivityTokenFactory) provider4.invoke();
                DefaultGetRequestHandler$Factory defaultGetRequestHandler$Factory = (DefaultGetRequestHandler$Factory) provider3.invoke();
                RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) provider2.invoke();
                ErrorReporter errorReporter5 = (ErrorReporter) provider.invoke();
                realActivityTokenFactory.getClass();
                defaultGetRequestHandler$Factory.getClass();
                realActivitiesCacheManager.getClass();
                errorReporter5.getClass();
                return new RealSupportActivityItemLoader(realActivityTokenFactory, defaultGetRequestHandler$Factory, realActivitiesCacheManager, errorReporter5);
            case 14:
                CashAccountDatabaseImpl cashAccountDatabaseImpl5 = (CashAccountDatabaseImpl) provider3.invoke();
                CoroutineContext coroutineContext5 = (CoroutineContext) provider2.invoke();
                CoroutineContext coroutineContext6 = (CoroutineContext) provider.invoke();
                provider4.getClass();
                cashAccountDatabaseImpl5.getClass();
                coroutineContext5.getClass();
                coroutineContext6.getClass();
                return new RealTransactionBodyResolver(provider4, cashAccountDatabaseImpl5, coroutineContext5, coroutineContext6);
            case 15:
                WebViewProvider webViewProvider = (WebViewProvider) provider4.invoke();
                RealImageLoader realImageLoader3 = (RealImageLoader) provider3.invoke();
                RealCashVibrator realCashVibrator = (RealCashVibrator) provider2.invoke();
                SupportActivityItemLoader supportActivityItemLoader = (SupportActivityItemLoader) provider.invoke();
                webViewProvider.getClass();
                realImageLoader3.getClass();
                realCashVibrator.getClass();
                supportActivityItemLoader.getClass();
                return new LocalViewFactory(webViewProvider, realImageLoader3, realCashVibrator, supportActivityItemLoader, 4);
            case 16:
                RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) provider4.invoke();
                SyncValueReader syncValueReader3 = (SyncValueReader) provider3.invoke();
                FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider2.invoke();
                ErrorReporter errorReporter6 = (ErrorReporter) provider.invoke();
                realP2pSettingsManager.getClass();
                syncValueReader3.getClass();
                featureFlagManager2.getClass();
                errorReporter6.getClass();
                return new RealTransfersWithdrawManager(realP2pSettingsManager, syncValueReader3, featureFlagManager2, errorReporter6);
            case 17:
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider4.invoke();
                RealImageLoader realImageLoader4 = (RealImageLoader) provider3.invoke();
                RealCashVibrator realCashVibrator2 = (RealCashVibrator) provider2.invoke();
                FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider.invoke();
                factory.getClass();
                realImageLoader4.getClass();
                realCashVibrator2.getClass();
                featureFlagManager3.getClass();
                return new LocalViewFactory(factory, realImageLoader4, realCashVibrator2, featureFlagManager3, 5);
            case 18:
                BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) provider4.invoke();
                PostcardClientService postcardClientService = (PostcardClientService) provider3.invoke();
                FlowStarter flowStarter = (FlowStarter) provider2.invoke();
                SyncValueReader syncValueReader4 = (SyncValueReader) provider.invoke();
                blockersDataNavigator.getClass();
                postcardClientService.getClass();
                flowStarter.getClass();
                syncValueReader4.getClass();
                return new RealIssuedCardManager(blockersDataNavigator, postcardClientService, flowStarter, syncValueReader4);
            case 19:
                RealJobRepository realJobRepository = (RealJobRepository) provider4.invoke();
                RealMembershipRepository realMembershipRepository = (RealMembershipRepository) provider3.invoke();
                RealCurrentUserProvider realCurrentUserProvider = (RealCurrentUserProvider) provider2.invoke();
                RealSelectedMerchantProvider realSelectedMerchantProvider = (RealSelectedMerchantProvider) provider.invoke();
                realJobRepository.getClass();
                realMembershipRepository.getClass();
                realCurrentUserProvider.getClass();
                realSelectedMerchantProvider.getClass();
                return new RealAssignedJobProvider(realJobRepository, realMembershipRepository, realCurrentUserProvider, realSelectedMerchantProvider);
            default:
                RealLocationRepository realLocationRepository = (RealLocationRepository) provider4.invoke();
                RealMembershipRepository realMembershipRepository2 = (RealMembershipRepository) provider3.invoke();
                RealCurrentUserProvider realCurrentUserProvider2 = (RealCurrentUserProvider) provider2.invoke();
                RealSelectedMerchantProvider realSelectedMerchantProvider2 = (RealSelectedMerchantProvider) provider.invoke();
                realLocationRepository.getClass();
                realMembershipRepository2.getClass();
                realCurrentUserProvider2.getClass();
                realSelectedMerchantProvider2.getClass();
                return new RealAssignedLocationProvider(realLocationRepository, realMembershipRepository2, realCurrentUserProvider2, realSelectedMerchantProvider2);
        }
    }
}
