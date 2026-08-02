package com.squareup.cash.ui;

import androidx.lifecycle.Lifecycle;
import androidx.media3.common.util.StuckPlayerDetector;
import app.cash.badging.backend.RealBadger2;
import app.cash.broadway.Broadway;
import app.cash.broadway.ui.TransitionFactory;
import app.cash.local.views.LocalTransitionFactory;
import app.cash.passcode.views.PasscodeTransitionFactory;
import com.fillr.featuretoggle.UnleashContext;
import com.google.mlkit.vision.common.zzb;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.banking.presenters.BankingTransitionFactory;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.blockers.views.BlockersThemer;
import com.squareup.cash.blockers.views.BlockersTransitionFactory;
import com.squareup.cash.boost.backend.BoostBackendModule$Companion$bindBoostSignOutAction$1;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.observability.RealAccountMismatchReporter;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.contacts.RealContactDetailsSyncState;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.education.stories.views.EducationStoryTransitionFactory;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.history.backend.real.PaymentSyncEntityStorageObserver;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationBadger;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationRepo;
import com.squareup.cash.initialscreenloader.views.InitialScreenPlaceholderTransitionFactory;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.InvestingTaskModule$Companion$provideInvestingLiveIntervalRepeatTask$1;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.backend.real.RealInvestmentEntitiesKt;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.backend.real.LiteMoneybotFlagsHelper;
import com.squareup.cash.music.backend.real.RealMusicPlayer;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.notification.photo.NotificationPhotoLookupKeyProvider;
import com.squareup.cash.notification.photo.NotificationPhotoLookupKeyRegistry;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.notifications.channels.RealNotificationChannelMigrationManager;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.onboarding.util.RealAliasRegistrar;
import com.squareup.cash.payments.views.PaymentsTransitionFactory;
import com.squareup.cash.profile.views.ProfilePhotoUrlProvider;
import com.squareup.cash.profile.views.ProfilePhotoUrlRegistration;
import com.squareup.cash.profile.views.ProfilePhotoUrlRegistry;
import com.squareup.cash.profile.views.ProfileTransitionFactory;
import com.squareup.cash.recipients.backend.real.RealRecipientSuggestionsProvider;
import com.squareup.cash.recipients.backend.real.RealSuggestedRecipientsVendor;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.storage.SandboxJanitor;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.storage.StorageLinker;
import com.squareup.cash.support.backend.real.RealSupportHomeService;
import com.squareup.cash.support.backend.real.RealSupportViewedArticlesStore;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.support.chat.backend.real.RealChatManager;
import com.squareup.cash.support.chat.backend.real.RealRecordedMessagesStore;
import com.squareup.cash.support.chat.backend.real.SupportChatApi;
import com.squareup.cash.support.presenters.RealContactSupportNavigator;
import com.squareup.cash.supportarticles.app.v1.AppSupportArticleService;
import com.squareup.cash.tabprovider.real.RealTabProvider;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.taptopay.encryption.real.RealHieroglyphKeyProvider;
import com.squareup.cash.taptopay.encryption.real.RealMacDelegator$MetroFactory;
import com.squareup.cash.taptopay.encryption.real.utils.RealKeyProvisionCompatibilityChecker;
import com.squareup.cash.treehouse.android.broadway.TreehouseViewFactory;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.userjourneys.data.CompletedUserJourneysDataSource;
import com.squareup.cash.userjourneys.data.DiskUserJourneyDataSource;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyRepository;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.wallet.screens.WalletTransitionFactory;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.api.GetClockInEssentialsUseCase;
import com.squareup.cash.work.data.real.RealClockInEssentialsProvider;
import com.squareup.cash.work.tinygraph.job.JobDao;
import com.squareup.cash.work.tinygraph.real.RealJobRepository;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository;
import com.squareup.cash.work.tinygraph.setting.SettingDao;
import com.squareup.cropview.Edge;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.LongPreference;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.DeviceLocationHeuristics;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.task.RepeatTaskExecutor;
import dev.chrisbanes.haze.Pool;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import dev.zacsweers.metro.internal.MapProviderFactory;
import dev.zacsweers.metro.internal.SetFactory;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public final class BroadwayModule$ProvideBroadwayMetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider presenterFactories;
    public final Provider uiFactories;

    public BroadwayModule$ProvideBroadwayMetroFactory(DoubleCheck doubleCheck, SetFactory setFactory) {
        this.$r8$classId = 3;
        this.presenterFactories = doubleCheck;
        this.uiFactories = setFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        int i2 = 12;
        int i3 = 6;
        int i4 = 0;
        Provider provider = this.presenterFactories;
        Provider provider2 = this.uiFactories;
        switch (i) {
            case 0:
                Set set = (Set) ((SetFactory) provider2).invoke();
                Set set2 = (Set) ((SetFactory) provider).invoke();
                set.getClass();
                set2.getClass();
                return new Broadway(CollectionsKt__CollectionsKt.listOf((Object[]) new BlockersThemer[]{new BlockersThemer(1), new BlockersThemer(0)}), CollectionsKt.toList(set), ArraysKt___ArraysKt.filterNotNull(new TransitionFactory[]{new LocalTransitionFactory(8), new BankingTransitionFactory(), new LocalTransitionFactory(9), new LocalTransitionFactory(14), new LocalTransitionFactory(28), new LocalTransitionFactory(20), new ProfileTransitionFactory(), new LocalTransitionFactory(11), new LocalTransitionFactory(3), PaymentsTransitionFactory.INSTANCE, new LocalTransitionFactory(25), new LocalTransitionFactory(4), new LocalTransitionFactory(13), new EducationStoryTransitionFactory(), new LocalTransitionFactory(26), new LocalTransitionFactory(12), new LocalTransitionFactory(23), new LocalTransitionFactory(16), new LocalTransitionFactory(27), new LocalTransitionFactory(19), new LocalTransitionFactory(1), new LocalTransitionFactory(24), new LocalTransitionFactory(18), new LocalTransitionFactory(6), new LocalTransitionFactory(5), new LocalTransitionFactory(10), new LocalTransitionFactory(22), new BlockersTransitionFactory(), new InitialScreenPlaceholderTransitionFactory(), new PasscodeTransitionFactory(), new LocalTransitionFactory(15), new LocalTransitionFactory(0), new LocalTransitionFactory(7), new LocalTransitionFactory(2), new LegacyTransitionFactory(), new WalletTransitionFactory(0), new LocalTransitionFactory(21), new LocalTransitionFactory(17), new WalletTransitionFactory(1)}), CollectionsKt.toList(set2));
            case 1:
                RealAccountMismatchReporter realAccountMismatchReporter = (RealAccountMismatchReporter) ((TreehouseFlows.MetroFactory) provider2).invoke();
                CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider.invoke();
                cashAccountDatabaseImpl.getClass();
                return new PaymentSyncEntityStorageObserver(realAccountMismatchReporter, cashAccountDatabaseImpl);
            case 2:
                return new RealIdentityVerificationBadger((RealIdentityVerificationRepo) ((RealSessionFlags.MetroFactory) provider2).invoke(), (LongPreference) ((AttestedKeyMetrics$MetroFactory) provider).invoke());
            case 3:
                RepeatTaskExecutor repeatTaskExecutor = (RepeatTaskExecutor) provider.invoke();
                Set set3 = (Set) ((SetFactory) provider2).invoke();
                repeatTaskExecutor.getClass();
                set3.getClass();
                return repeatTaskExecutor.m3998repeatOn5EIzBIU(new Duration(RealInvestmentEntitiesKt.INVESTING_LIVE_INTERVAL), Lifecycle.State.RESUMED, RepeatTaskExecutor.SessionState.AUTHENTICATED, new InvestingTaskModule$Companion$provideInvestingLiveIntervalRepeatTask$1(set3, null));
            case 4:
                RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) ((RealKeyStoreProvider.MetroFactory) provider2).invoke();
                SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                syncValueReader.getClass();
                return new RealInvestingStateManager(syncValueReader, realFamilyAccountsManager);
            case 5:
                Analytics analytics = (Analytics) provider2.invoke();
                RealCategoryBackend realCategoryBackend = (RealCategoryBackend) ((RealKeyStoreProvider.MetroFactory) provider).invoke();
                analytics.getClass();
                return new RealInvestingAnalytics(analytics, realCategoryBackend);
            case 6:
                RealKeyStoreProvider.MetroFactory metroFactory = (RealKeyStoreProvider.MetroFactory) provider2;
                CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0 = (CashAppLiteReleaseModule$$ExternalSyntheticLambda0) provider.invoke();
                cashAppLiteReleaseModule$$ExternalSyntheticLambda0.getClass();
                return cashAppLiteReleaseModule$$ExternalSyntheticLambda0.f$0 ? new LiteMoneybotFlagsHelper() : (MoneybotFlagsHelper) metroFactory.invoke();
            case 7:
                return new RealMusicPlayer((ToolbarTuckTargets) ((RetroUiFactory.MetroFactory) provider2).invoke(), (StuckPlayerDetector) ((SandboxJanitor.MetroFactory) provider).invoke());
            case 8:
                NotificationPhotoLookupKeyRegistry notificationPhotoLookupKeyRegistry = (NotificationPhotoLookupKeyRegistry) provider2.invoke();
                NotificationPhotoLookupKeyProvider notificationPhotoLookupKeyProvider = (NotificationPhotoLookupKeyProvider) ((MusicViewFactory$MetroFactory) provider).invoke();
                notificationPhotoLookupKeyRegistry.getClass();
                return new ProfilePhotoUrlRegistration(notificationPhotoLookupKeyRegistry, notificationPhotoLookupKeyProvider);
            case 9:
                AndroidNotificationManager androidNotificationManager = (AndroidNotificationManager) ((LambdaProvider) provider2).lambda.invoke();
                List list = (List) ((RealBrazeManager.MetroFactory) provider).invoke();
                androidNotificationManager.getClass();
                list.getClass();
                return new RealNotificationChannelMigrationManager(androidNotificationManager, list);
            case 10:
                AppService appService = (AppService) provider2.invoke();
                DeviceLocationHeuristics deviceLocationHeuristics = (DeviceLocationHeuristics) ((RealContactDetailsSyncState.MetroFactory) provider).invoke();
                appService.getClass();
                return new RealAliasRegistrar(appService, deviceLocationHeuristics);
            case 11:
                return new Lazy(i2, (RealBadger2.MetroFactory) provider2, (NavigationSideEffects.MetroFactory) provider);
            case 12:
                ProfilePhotoUrlRegistry profilePhotoUrlRegistry = (ProfilePhotoUrlRegistry) provider2.invoke();
                ProfilePhotoUrlProvider profilePhotoUrlProvider = (ProfilePhotoUrlProvider) ((ScoreUiFactory.MetroFactory) provider).invoke();
                profilePhotoUrlRegistry.getClass();
                return new ProfilePhotoUrlRegistration(profilePhotoUrlRegistry, profilePhotoUrlProvider);
            case 13:
                ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) ((BroadwayModule$ProvideBroadwayMetroFactory) provider2).invoke();
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                featureFlagManager.getClass();
                return new RealRecipientSuggestionsProvider(toolbarTuckTargets, featureFlagManager);
            case 14:
                RealSuggestedRecipientsVendor realSuggestedRecipientsVendor = (RealSuggestedRecipientsVendor) provider2.invoke();
                Lazy lazy = (Lazy) ((WalletUiFactory$MetroFactory) provider).invoke();
                realSuggestedRecipientsVendor.getClass();
                return new ToolbarTuckTargets(realSuggestedRecipientsVendor, lazy);
            case 15:
                StorageLinker storageLinker = (StorageLinker) provider2.invoke();
                StorageLink storageLink = (StorageLink) ((Factory) provider).invoke();
                storageLinker.getClass();
                storageLink.getClass();
                return storageLinker.getStorageContext(storageLink);
            case 16:
                RealArticlesService realArticlesService = (RealArticlesService) ((DoubleCheck) provider2).getValue();
                RealChatManager realChatManager = (RealChatManager) ((RealCashVibrator.MetroFactory) provider).invoke();
                realArticlesService.getClass();
                return new RealSupportHomeService(realArticlesService, realChatManager);
            case 17:
                Instrument$Adapter instrument$Adapter = (Instrument$Adapter) ((ShiftsAnalytics.MetroFactory) provider2).invoke();
                StorageLink storageLink2 = (StorageLink) ((InstanceFactory) provider).value;
                storageLink2.getClass();
                return new BoostBackendModule$Companion$bindBoostSignOutAction$1(i3, storageLink2, instrument$Adapter);
            case 18:
                AppSupportArticleService appSupportArticleService = (AppSupportArticleService) ((DoubleCheck) provider2).getValue();
                ResourceFileSystem.Companion companion = new ResourceFileSystem.Companion();
                RealSupportViewedArticlesStore realSupportViewedArticlesStore = (RealSupportViewedArticlesStore) ((RealTrifleService.MetroFactory) provider).invoke();
                appSupportArticleService.getClass();
                return new RealArticlesService(appSupportArticleService, companion, realSupportViewedArticlesStore);
            case 19:
                CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) provider2).value;
                SupportChatApi supportChatApi = (SupportChatApi) ((RealAppMessageManager.MetroFactory) provider).invoke();
                coroutineScope.getClass();
                return new RealRecordedMessagesStore(coroutineScope, supportChatApi);
            case 20:
                ToolbarTuckTargets toolbarTuckTargets2 = (ToolbarTuckTargets) ((ShiftsAnalytics.MetroFactory) provider2).invoke();
                AndroidStringManager androidStringManager = (AndroidStringManager) provider.invoke();
                androidStringManager.getClass();
                return new RealContactSupportNavigator(toolbarTuckTargets2, androidStringManager);
            case 21:
                JCAContext jCAContext = (JCAContext) RealMacDelegator$MetroFactory.INSTANCE$1.invoke();
                RealHieroglyphKeyProvider realHieroglyphKeyProvider = (RealHieroglyphKeyProvider) ((RealTabProvider.MetroFactory) provider2).invoke();
                Pool pool = (Pool) RealMacDelegator$MetroFactory.INSTANCE.invoke();
                RealObservabilityManager realObservabilityManager = (RealObservabilityManager) provider.invoke();
                realObservabilityManager.getClass();
                return new UnleashContext(jCAContext, realHieroglyphKeyProvider, pool, realObservabilityManager);
            case 22:
                return new RealKeyProvisionCompatibilityChecker((zzb) ((BreadcrumbListener.MetroFactory) provider2).invoke(), (JCAContext) ((BreadcrumbListener.MetroFactory) provider).invoke(), (Edge.Companion) RealMacDelegator$MetroFactory.INSTANCE$2.invoke());
            case 23:
                Map map = ((MapProviderFactory) provider2).contributingMap;
                CashTreehouseLayout.Factory factory = (CashTreehouseLayout.Factory) provider.invoke();
                map.getClass();
                factory.getClass();
                return new TreehouseViewFactory(i4, map, factory);
            case 24:
                File file = (File) ((AndroidToaster.MetroFactory) provider2).invoke();
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                ErrorReporter errorReporter = (ErrorReporter) provider.invoke();
                defaultIoScheduler.getClass();
                errorReporter.getClass();
                return new CompletedUserJourneysDataSource(file, defaultIoScheduler, errorReporter);
            case 25:
                DiskUserJourneyDataSource diskUserJourneyDataSource = (DiskUserJourneyDataSource) ((SandboxJanitor.MetroFactory) provider2).invoke();
                DiskUserJourneyDataSource diskUserJourneyDataSource2 = (DiskUserJourneyDataSource) provider.invoke();
                diskUserJourneyDataSource2.getClass();
                return new RealUserJourneyRepository(diskUserJourneyDataSource, diskUserJourneyDataSource2);
            case 26:
                GetClockInEssentialsUseCase getClockInEssentialsUseCase = (GetClockInEssentialsUseCase) ((RealBugReportSenderFactory.MetroFactory) provider2).invoke();
                CoroutineScope coroutineScope2 = (CoroutineScope) ((InstanceFactory) provider).value;
                coroutineScope2.getClass();
                return new RealClockInEssentialsProvider(getClockInEssentialsUseCase, coroutineScope2);
            case 27:
                JobDao jobDao = (JobDao) ((JobDao.MetroFactory) provider2).invoke();
                Flow flow = (Flow) provider.invoke();
                flow.getClass();
                return new RealJobRepository(jobDao, flow);
            case 28:
                SettingDao settingDao = (SettingDao) ((RealDrawerOpener$MetroFactory) provider2).invoke();
                Flow flow2 = (Flow) provider.invoke();
                flow2.getClass();
                return new RealLocationRepository(settingDao, flow2);
            default:
                JCAContext jCAContext2 = (JCAContext) ((RealDrawerOpener$MetroFactory) provider2).invoke();
                Flow flow3 = (Flow) provider.invoke();
                flow3.getClass();
                return new RealMembershipRepository(jCAContext2, flow3);
        }
    }

    public /* synthetic */ BroadwayModule$ProvideBroadwayMetroFactory(Provider provider, Provider provider2, int i) {
        this.$r8$classId = i;
        this.uiFactories = provider;
        this.presenterFactories = provider2;
    }
}
