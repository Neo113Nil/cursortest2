package com.squareup.cash.work.analytics;

import android.content.SharedPreferences;
import androidx.lifecycle.Lifecycle;
import com.squareup.cash.attribution.ActivityTransitionsSideEffectsPerformer;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.discover.DiscoverRegisteredTreehouseApp;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.savings.backend.real.SyncValuesBasedSavingsBalanceStore;
import com.squareup.cash.score.backend.RealScoreRepository;
import com.squareup.cash.storage.FileDownloaderClientProvider;
import com.squareup.cash.storage.FileSystemProviderModule;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.storage.TempFileDownloaderModule$bindTempFileDownloader$1;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.support.chat.backend.real.RealPendingMessagesStore;
import com.squareup.cash.support.chat.backend.real.RealRecordedMessagesStore;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.tax.backend.real.RealTaxEntryTileUserDataProvider;
import com.squareup.cash.threedsdataonly.backend.real.RealThreeDsAuthenticationManager;
import com.squareup.cash.treehouse.android.TreehouseModule$provideCashTreehouseAppFactory$1;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreenFactory;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseConfigurationStore;
import com.squareup.cash.treehouse.android.playground.TreehousePlayground;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.network.impl.AndroidConnectivityManager;
import com.squareup.cash.wallet.backend.real.RealWalletAnalyticsHelper;
import com.squareup.cash.work.data.real.RealBrandDetailsDataLoader;
import com.squareup.cash.work.data.real.RealSelectedMerchantDataProvider;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.data.real.RealTeamMemberIdProvider;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.identifiers.PersonIdentifier;
import com.squareup.cash.work.presenters.RealSellerCardViewModelProducer;
import com.squareup.cash.work.presenters.SellerCardViewModelMapper$MetroFactory;
import com.squareup.cash.work.session.RealCurrentUserProvider;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.protos.cash.api.Error;
import com.squareup.util.coroutines.FlowExtensionsKt$runUntil$1$1;
import com.squareup.util.task.RepeatTaskExecutor;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes7.dex */
public final class ShiftsAnalytics {
    public final Analytics analytics;
    public final RealCurrentUserProvider currentUserProvider;
    public final RealSelectedMerchantProvider selectedMerchantProvider;

    public ShiftsAnalytics(Analytics analytics, RealCurrentUserProvider realCurrentUserProvider, RealSelectedMerchantProvider realSelectedMerchantProvider) {
        this.analytics = analytics;
        this.currentUserProvider = realCurrentUserProvider;
        this.selectedMerchantProvider = realSelectedMerchantProvider;
    }

    public final String getMerchantToken() {
        SharedPreferencesKeyValue sharedPreferencesKeyValue = this.selectedMerchantProvider.squareAccountStore.selectedMerchantTokenKeyValue;
        String str = (String) sharedPreferencesKeyValue.reader.read(sharedPreferencesKeyValue);
        MerchantIdentifier merchantIdentifier = str != null ? new MerchantIdentifier(str) : null;
        if (merchantIdentifier != null) {
            return merchantIdentifier.token;
        }
        return null;
    }

    public final String getPersonToken() {
        PersonIdentifier personIdentifier = this.currentUserProvider.getPersonIdentifier();
        String str = personIdentifier != null ? personIdentifier.token : null;
        return str == null ? "" : str;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider analytics;
        public final Provider currentUserProvider;
        public final Provider selectedMerchantProvider;

        public MetroFactory(FileSystemProviderModule fileSystemProviderModule, LambdaProvider lambdaProvider, RetroUiFactory.MetroFactory metroFactory, DoubleCheck doubleCheck) {
            this.$r8$classId = 3;
            this.analytics = lambdaProvider;
            this.currentUserProvider = metroFactory;
            this.selectedMerchantProvider = doubleCheck;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 2;
            Provider provider = this.selectedMerchantProvider;
            Provider provider2 = this.currentUserProvider;
            Provider provider3 = this.analytics;
            switch (i) {
                case 0:
                    Analytics analytics = (Analytics) provider3.invoke();
                    RealCurrentUserProvider realCurrentUserProvider = (RealCurrentUserProvider) provider2.invoke();
                    RealSelectedMerchantProvider realSelectedMerchantProvider = (RealSelectedMerchantProvider) provider.invoke();
                    analytics.getClass();
                    realCurrentUserProvider.getClass();
                    realSelectedMerchantProvider.getClass();
                    return new ShiftsAnalytics(analytics, realCurrentUserProvider, realSelectedMerchantProvider);
                case 1:
                    SyncValueReader syncValueReader = (SyncValueReader) provider3.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider2.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider.invoke();
                    syncValueReader.getClass();
                    errorReporter.getClass();
                    sampleStrategy.getClass();
                    return new SyncValuesBasedSavingsBalanceStore(syncValueReader, errorReporter, sampleStrategy);
                case 2:
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider3.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) provider2.invoke();
                    String str = (String) provider.invoke();
                    syncValueReader2.getClass();
                    errorReporter2.getClass();
                    str.getClass();
                    return new RealScoreRepository(syncValueReader2, errorReporter2, str);
                case 3:
                    AndroidConnectivityManager androidConnectivityManager = (AndroidConnectivityManager) provider3.invoke();
                    FileDownloaderClientProvider fileDownloaderClientProvider = (FileDownloaderClientProvider) provider2.invoke();
                    Storage storage = (Storage) provider.invoke();
                    androidConnectivityManager.getClass();
                    fileDownloaderClientProvider.getClass();
                    storage.getClass();
                    return new RealFileDownloader(androidConnectivityManager, fileDownloaderClientProvider, storage, TempFileDownloaderModule$bindTempFileDownloader$1.INSTANCE);
                case 4:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider3.invoke();
                    RealProfileAliasRepository realProfileAliasRepository = (RealProfileAliasRepository) provider2.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    realProfileAliasRepository.getClass();
                    coroutineContext.getClass();
                    return new ToolbarTuckTargets(cashAccountDatabaseImpl, realProfileAliasRepository, coroutineContext);
                case 5:
                    KeyValue keyValue = (KeyValue) provider3.invoke();
                    KeyValue keyValue2 = (KeyValue) provider2.invoke();
                    KeyValue keyValue3 = (KeyValue) provider.invoke();
                    keyValue.getClass();
                    keyValue2.getClass();
                    keyValue3.getClass();
                    return new Instrument$Adapter(keyValue, keyValue2, keyValue3);
                case 6:
                    RealPendingMessagesStore realPendingMessagesStore = (RealPendingMessagesStore) provider3.invoke();
                    RealRecordedMessagesStore realRecordedMessagesStore = (RealRecordedMessagesStore) provider2.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    realPendingMessagesStore.getClass();
                    realRecordedMessagesStore.getClass();
                    featureFlagManager.getClass();
                    return new RealConversationService(realPendingMessagesStore, realRecordedMessagesStore, featureFlagManager);
                case 7:
                    RepeatTaskExecutor repeatTaskExecutor = (RepeatTaskExecutor) provider3.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider2.invoke();
                    RealTaxEntryTileUserDataProvider realTaxEntryTileUserDataProvider = (RealTaxEntryTileUserDataProvider) provider.invoke();
                    repeatTaskExecutor.getClass();
                    featureFlagManager2.getClass();
                    realTaxEntryTileUserDataProvider.getClass();
                    return repeatTaskExecutor.m3998repeatOn5EIzBIU(null, Lifecycle.State.RESUMED, RepeatTaskExecutor.SessionState.AUTHENTICATED, new FlowExtensionsKt$runUntil$1$1(featureFlagManager2, realTaxEntryTileUserDataProvider, null, i2));
                case 8:
                    RealThreeDsAuthenticationManager realThreeDsAuthenticationManager = (RealThreeDsAuthenticationManager) provider3.invoke();
                    RealInstrumentManager realInstrumentManager = (RealInstrumentManager) provider2.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider.invoke();
                    realThreeDsAuthenticationManager.getClass();
                    realInstrumentManager.getClass();
                    featureFlagManager3.getClass();
                    return new ActivityTransitionsSideEffectsPerformer(i2, realThreeDsAuthenticationManager, realInstrumentManager, featureFlagManager3);
                case 9:
                    TreehouseModule$provideCashTreehouseAppFactory$1 treehouseModule$provideCashTreehouseAppFactory$1 = (TreehouseModule$provideCashTreehouseAppFactory$1) provider3.invoke();
                    RealTreehouseConfigurationStore realTreehouseConfigurationStore = (RealTreehouseConfigurationStore) provider2.invoke();
                    TreehouseScreenFactory treehouseScreenFactory = (TreehouseScreenFactory) provider.invoke();
                    treehouseModule$provideCashTreehouseAppFactory$1.getClass();
                    realTreehouseConfigurationStore.getClass();
                    treehouseScreenFactory.getClass();
                    return new DiscoverRegisteredTreehouseApp(treehouseModule$provideCashTreehouseAppFactory$1, realTreehouseConfigurationStore, treehouseScreenFactory, 1);
                case 10:
                    TreehouseModule$provideCashTreehouseAppFactory$1 treehouseModule$provideCashTreehouseAppFactory$12 = (TreehouseModule$provideCashTreehouseAppFactory$1) provider3.invoke();
                    RealTreehouseConfigurationStore realTreehouseConfigurationStore2 = (RealTreehouseConfigurationStore) provider2.invoke();
                    TreehouseScreenFactory treehouseScreenFactory2 = (TreehouseScreenFactory) provider.invoke();
                    treehouseModule$provideCashTreehouseAppFactory$12.getClass();
                    realTreehouseConfigurationStore2.getClass();
                    treehouseScreenFactory2.getClass();
                    return new DiscoverRegisteredTreehouseApp(treehouseModule$provideCashTreehouseAppFactory$12, realTreehouseConfigurationStore2, treehouseScreenFactory2, 2);
                case 11:
                    TreehouseModule$provideCashTreehouseAppFactory$1 treehouseModule$provideCashTreehouseAppFactory$13 = (TreehouseModule$provideCashTreehouseAppFactory$1) provider3.invoke();
                    RealTreehouseConfigurationStore realTreehouseConfigurationStore3 = (RealTreehouseConfigurationStore) provider2.invoke();
                    TreehouseScreenFactory treehouseScreenFactory3 = (TreehouseScreenFactory) provider.invoke();
                    treehouseModule$provideCashTreehouseAppFactory$13.getClass();
                    realTreehouseConfigurationStore3.getClass();
                    treehouseScreenFactory3.getClass();
                    return new DiscoverRegisteredTreehouseApp(treehouseModule$provideCashTreehouseAppFactory$13, realTreehouseConfigurationStore3, treehouseScreenFactory3, 3);
                case 12:
                    TreehouseModule$provideCashTreehouseAppFactory$1 treehouseModule$provideCashTreehouseAppFactory$14 = (TreehouseModule$provideCashTreehouseAppFactory$1) provider3.invoke();
                    RealTreehouseConfigurationStore realTreehouseConfigurationStore4 = (RealTreehouseConfigurationStore) provider2.invoke();
                    TreehouseScreenFactory treehouseScreenFactory4 = (TreehouseScreenFactory) provider.invoke();
                    treehouseModule$provideCashTreehouseAppFactory$14.getClass();
                    realTreehouseConfigurationStore4.getClass();
                    treehouseScreenFactory4.getClass();
                    return new DiscoverRegisteredTreehouseApp(treehouseModule$provideCashTreehouseAppFactory$14, realTreehouseConfigurationStore4, treehouseScreenFactory4, 4);
                case 13:
                    TreehouseModule$provideCashTreehouseAppFactory$1 treehouseModule$provideCashTreehouseAppFactory$15 = (TreehouseModule$provideCashTreehouseAppFactory$1) provider3.invoke();
                    RealTreehouseConfigurationStore realTreehouseConfigurationStore5 = (RealTreehouseConfigurationStore) provider2.invoke();
                    TreehouseScreenFactory treehouseScreenFactory5 = (TreehouseScreenFactory) provider.invoke();
                    treehouseModule$provideCashTreehouseAppFactory$15.getClass();
                    realTreehouseConfigurationStore5.getClass();
                    treehouseScreenFactory5.getClass();
                    return new TreehousePlayground(treehouseModule$provideCashTreehouseAppFactory$15, realTreehouseConfigurationStore5, treehouseScreenFactory5);
                case 14:
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider3.invoke();
                    SharedPreferences sharedPreferences = (SharedPreferences) provider2.invoke();
                    Analytics analytics2 = (Analytics) provider.invoke();
                    realUuidGenerator.getClass();
                    sharedPreferences.getClass();
                    analytics2.getClass();
                    return new RealWalletAnalyticsHelper(realUuidGenerator, sharedPreferences, analytics2);
                case 15:
                    AndroidClock androidClock = (AndroidClock) provider3.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider2.invoke();
                    RealLocaleManager realLocaleManager = (RealLocaleManager) provider.invoke();
                    androidClock.getClass();
                    androidStringManager.getClass();
                    realLocaleManager.getClass();
                    return new RealShiftTimeFormatter(androidClock, androidStringManager, realLocaleManager);
                case 16:
                    RealMembershipRepository realMembershipRepository = (RealMembershipRepository) provider3.invoke();
                    RealCurrentUserProvider realCurrentUserProvider2 = (RealCurrentUserProvider) provider2.invoke();
                    RealSelectedMerchantProvider realSelectedMerchantProvider2 = (RealSelectedMerchantProvider) provider.invoke();
                    realMembershipRepository.getClass();
                    realCurrentUserProvider2.getClass();
                    realSelectedMerchantProvider2.getClass();
                    return new RealTeamMemberIdProvider(realMembershipRepository, realCurrentUserProvider2, realSelectedMerchantProvider2);
                default:
                    RealBrandDetailsDataLoader realBrandDetailsDataLoader = (RealBrandDetailsDataLoader) provider3.invoke();
                    RealMerchantRepository realMerchantRepository = (RealMerchantRepository) provider2.invoke();
                    Error.Code.Companion companion = (Error.Code.Companion) SellerCardViewModelMapper$MetroFactory.INSTANCE.invoke();
                    RealSelectedMerchantDataProvider realSelectedMerchantDataProvider = (RealSelectedMerchantDataProvider) provider.invoke();
                    realBrandDetailsDataLoader.getClass();
                    realMerchantRepository.getClass();
                    realSelectedMerchantDataProvider.getClass();
                    return new RealSellerCardViewModelProducer(realBrandDetailsDataLoader, realMerchantRepository, companion, realSelectedMerchantDataProvider);
            }
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, int i) {
            this.$r8$classId = i;
            this.analytics = provider;
            this.currentUserProvider = provider2;
            this.selectedMerchantProvider = provider3;
        }
    }
}
