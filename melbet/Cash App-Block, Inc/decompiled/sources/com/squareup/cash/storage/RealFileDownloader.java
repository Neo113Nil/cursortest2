package com.squareup.cash.storage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.material3.MenuKt$$ExternalSyntheticLambda0;
import androidx.datastore.core.SimpleActor;
import androidx.emoji2.text.MetadataRepo;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.local.backend.real.CalculateLineItemsManager;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.service.LocalService;
import app.cash.passcode.backend.AppLockMonitor;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.tasks.zzr;
import com.miteksystems.misnap.camera.a.n;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.analytics.cdp.CdpAnalytics;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$Factory$Impl;
import com.squareup.cash.activity.presenters.BalanceFeedPresenter$Factory$Impl;
import com.squareup.cash.activity.presenters.receipts.ReceiptPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayEligibleRetroTransactionsProvider;
import com.squareup.cash.analytics.firebase.real.RealCashFirebaseAnalytics;
import com.squareup.cash.appmessages.presenters.RealAppMessageActionPresenterHelper;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.biometrics.AndroidBiometrics;
import com.squareup.cash.biometrics.AndroidSecureStore;
import com.squareup.cash.bitcoin.presenters.applet.allowlist.BitcoinWidgetAllowlistProvider;
import com.squareup.cash.bitcoin.presenters.autoinvest.BitcoinAutoInvestProvider;
import com.squareup.cash.bitcoin.presenters.investing.RealBitcoinSponsoredStateRepo;
import com.squareup.cash.bitcoin.presenters.map.RealBitcoinMapEligibilityManager;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.clientsync.pipeline.RealClientSyncResponseProcessor;
import com.squareup.cash.clientsync.pipeline.RealClientSyncStorageOperationBatchExecutor;
import com.squareup.cash.clientsync.pipeline.RealClientSyncStorageOperationBatchSanitizer;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.crypto.backend.eligibility.RealBitcoinEligibilityRepo;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.RealDemandDepositAccountManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.deviceintegrity.PlayIntegrityClient;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrity;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAnalyticsTracker;
import com.squareup.cash.e2ee.signature.RealSignatureManager;
import com.squareup.cash.e2ee.signature.RealSignatureRepo;
import com.squareup.cash.e2ee.signature.logger.RealSignatureManagerLogger;
import com.squareup.cash.e2ee.signature.service.SigningCertificateService;
import com.squareup.cash.e2ee.trifle.RealTrifleLogger;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.e2ee.trifle.TrifleService;
import com.squareup.cash.eligibility.backend.api.EligibilityRefresher;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.familyhub.backend.real.RealManagedAccountTransferManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.CombinedAnalytics;
import com.squareup.cash.investing.backend.real.InvestingSetupTeardown;
import com.squareup.cash.investing.backend.real.RealInvestingSyncer;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.localization.RealLanguageManager;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesDataManager;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesManager;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mri.android.RealExecutorServiceFactory;
import com.squareup.cash.mri.android.RealSignalsCollector;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.onboarding.backend.RealOnboardingIntegrityChecker;
import com.squareup.cash.onboarding.check.RealIntegrityChecker;
import com.squareup.cash.onboarding.check.checkers.RealIntegrityCheckFactory;
import com.squareup.cash.passkeys.backend.CredentialManagerPasskeyCreator;
import com.squareup.cash.passkeys.backend.RealPasskeyAnalytics;
import com.squareup.cash.passkeys.backend.RealPasskeyRepository;
import com.squareup.cash.payments.backend.api.PersonalizationRepository;
import com.squareup.cash.payments.presenters.PersonalizePaymentResourceRefresher;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseCashCardRepository;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseToggleManager;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SignoutSideEffectsPerformer;
import com.squareup.cash.storage.FileSystemProviderModule;
import com.squareup.cash.storage.SandboxJanitor;
import com.squareup.cash.tax.presenters.TaxPresenterFactory;
import com.squareup.cash.ui.CashNavigationLogger;
import com.squareup.cash.userjourneys.tracker.UserJourneyAnalytics;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.network.impl.AndroidConnectivityManager;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.discover.api.app.v1.service.DiscoverService;
import com.squareup.protos.cash.janus.api.WebAuthnService;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.messagingplatformcommon.ondemand.InAppMessageService;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.android.AndroidAudioManager;
import com.squareup.util.android.AndroidToaster;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import dev.zacsweers.metro.internal.SetFactory;
import java.io.IOException;
import java.util.Set;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import okhttp3.ConnectionPool;
import okhttp3.HttpUrl;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import okio.RealBufferedSink;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealFileDownloader {
    public final FileDownloaderClientProvider fileDownloaderClientProvider;
    public final Function1 fileLooker;
    public final FileSystem fileSystem;
    public final Storage storage;

    public RealFileDownloader(AndroidConnectivityManager androidConnectivityManager, FileDownloaderClientProvider fileDownloaderClientProvider, Storage storage, Function1 function1) {
        androidConnectivityManager.getClass();
        fileDownloaderClientProvider.getClass();
        storage.getClass();
        function1.getClass();
        this.fileDownloaderClientProvider = fileDownloaderClientProvider;
        this.storage = storage;
        this.fileSystem = (FileSystem) function1.invoke(storage);
        this.fileLooker = function1;
    }

    public final FileDownloader$DownloadStatus download(FileDownloader$Category fileDownloader$Category, String str, String str2, boolean z) {
        HttpUrl httpUrl;
        str.getClass();
        str2.getClass();
        Throwable th = null;
        try {
            HttpUrl.Builder builder = new HttpUrl.Builder();
            builder.parse$okhttp(null, str2);
            httpUrl = builder.build();
        } catch (IllegalArgumentException unused) {
            httpUrl = null;
        }
        if (httpUrl == null) {
            Timber.Forest.e(new IllegalArgumentException("Invalid URL: ".concat(str2)));
            return FileDownloader$DownloadStatus.SUCCESS;
        }
        MenuKt$$ExternalSyntheticLambda0 menuKt$$ExternalSyntheticLambda0 = new MenuKt$$ExternalSyntheticLambda0(this, z, httpUrl, fileDownloader$Category, str, 7);
        FileSystem fileSystem = this.fileSystem;
        if (ready(fileDownloader$Category, str)) {
            Timber.Forest.d("Already downloaded " + fileDownloader$Category + " " + str, new Object[0]);
            return FileDownloader$DownloadStatus.SUCCESS;
        }
        String str3 = Path.DIRECTORY_SEPARATOR;
        Path path = Path.Companion.get(fileDownloader$Category.getFolderName(), false);
        try {
            if (!fileSystem.exists(path)) {
                fileSystem.createDirectory(path);
            }
            Path resolve = Path.Companion.get(fileDownloader$Category.getFolderName(), false).resolve(str);
            if (fileSystem.exists(resolve)) {
                Timber.Forest.d(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("File for ", str, " already exists"), new Object[0]);
                return FileDownloader$DownloadStatus.SUCCESS;
            }
            Path resolve2 = Path.Companion.get(fileDownloader$Category.getFolderName(), false).resolve("tmp");
            try {
                fileSystem.createDirectory(resolve2);
                Path resolve3 = resolve2.resolve(str);
                try {
                    fileSystem.delete(resolve3, false);
                    try {
                        Timber.Forest.d("Downloading " + fileDownloader$Category + " " + str, new Object[0]);
                        RealBufferedSink buffer = Okio.buffer(fileSystem.sink(resolve3, false));
                        try {
                        } catch (Throwable th2) {
                            try {
                                buffer.close();
                            } catch (Throwable th3) {
                                ExceptionsKt__ExceptionsKt.addSuppressed(th2, th3);
                            }
                            th = th2;
                        }
                        if (!((Boolean) menuKt$$ExternalSyntheticLambda0.invoke(buffer)).booleanValue()) {
                            FileDownloader$DownloadStatus fileDownloader$DownloadStatus = FileDownloader$DownloadStatus.RETRY;
                            try {
                                buffer.close();
                                return fileDownloader$DownloadStatus;
                            } catch (Throwable unused2) {
                                return fileDownloader$DownloadStatus;
                            }
                        }
                        try {
                            buffer.close();
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        if (th != null) {
                            throw th;
                        }
                        try {
                            fileSystem.atomicMove(resolve3, resolve);
                            Timber.Forest.d("Successfully downloaded " + fileDownloader$Category + " " + str, new Object[0]);
                            return FileDownloader$DownloadStatus.SUCCESS;
                        } catch (IOException e) {
                            Timber.Forest.e("Failed to rename " + resolve3 + " to " + resolve, new Object[0], e);
                            return FileDownloader$DownloadStatus.RETRY;
                        }
                    } catch (IOException e2) {
                        Timber.Forest.w("Failed to download " + fileDownloader$Category + " " + str, new Object[0], e2);
                        return FileDownloader$DownloadStatus.RETRY;
                    }
                } catch (IOException e3) {
                    Timber.Forest.e("Failed to delete " + resolve3, new Object[0], e3);
                    return FileDownloader$DownloadStatus.RETRY;
                }
            } catch (IOException e4) {
                Timber.Forest.e("Failed to create " + resolve2, new Object[0], e4);
                return FileDownloader$DownloadStatus.RETRY;
            }
        } catch (IOException e5) {
            Timber.Forest.e("Failed to create " + path, new Object[0], e5);
            return FileDownloader$DownloadStatus.RETRY;
        }
    }

    public final Uri localUri(FileDownloader$Category fileDownloader$Category, String str) {
        str.getClass();
        String str2 = Path.DIRECTORY_SEPARATOR;
        Path resolve = Path.Companion.get(fileDownloader$Category.getFolderName(), false).resolve(str);
        if (!this.fileSystem.exists(resolve)) {
            return null;
        }
        return ((RealStorage) this.storage).getFileUri(resolve, this.fileLooker);
    }

    public final boolean ready(FileDownloader$Category fileDownloader$Category, String str) {
        str.getClass();
        String str2 = Path.DIRECTORY_SEPARATOR;
        return this.fileSystem.exists(Path.Companion.get(fileDownloader$Category.getFolderName(), false).resolve(str));
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider connectivityManager;
        public final Provider fileDownloaderClientProvider;
        public final Provider fileSystemProvider;
        public final Provider storage;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, int i) {
            this.$r8$classId = i;
            this.connectivityManager = provider;
            this.storage = provider2;
            this.fileDownloaderClientProvider = provider3;
            this.fileSystemProvider = provider4;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.fileSystemProvider;
            Provider provider2 = this.storage;
            Provider provider3 = this.fileDownloaderClientProvider;
            Provider provider4 = this.connectivityManager;
            switch (i) {
                case 0:
                    AndroidConnectivityManager androidConnectivityManager = (AndroidConnectivityManager) provider4.invoke();
                    FileDownloaderClientProvider fileDownloaderClientProvider = (FileDownloaderClientProvider) ((RetroUiFactory.MetroFactory) provider3).invoke();
                    Storage storage = (Storage) provider2.invoke();
                    ((FileSystemProviderModule.ProvideProviderMetroFactory) provider).invoke();
                    FileSystemProviderModule$provideProvider$1 fileSystemProviderModule$provideProvider$1 = FileSystemProviderModule$provideProvider$1.INSTANCE;
                    androidConnectivityManager.getClass();
                    storage.getClass();
                    return new RealFileDownloader(androidConnectivityManager, fileDownloaderClientProvider, storage, fileSystemProviderModule$provideProvider$1);
                case 1:
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider4.invoke();
                    LocalService localService = (LocalService) provider2.invoke();
                    LocalInstalledStore localInstalledStore = (LocalInstalledStore) ((RealSessionFlags.MetroFactory) provider3).invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) provider).value;
                    featureFlagManager.getClass();
                    localService.getClass();
                    coroutineScope.getClass();
                    return new CalculateLineItemsManager(featureFlagManager, localService, localInstalledStore, coroutineScope);
                case 2:
                    ActivityTabPresenter$Factory$Impl activityTabPresenter$Factory$Impl = (ActivityTabPresenter$Factory$Impl) ((InstanceFactory) provider4).value;
                    BalanceFeedPresenter$Factory$Impl balanceFeedPresenter$Factory$Impl = (BalanceFeedPresenter$Factory$Impl) ((InstanceFactory) provider2).value;
                    ReceiptPresenter$Factory$Impl receiptPresenter$Factory$Impl = (ReceiptPresenter$Factory$Impl) ((InstanceFactory) provider3).value;
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) ((DoubleCheck) provider).getValue();
                    activityTabPresenter$Factory$Impl.getClass();
                    balanceFeedPresenter$Factory$Impl.getClass();
                    receiptPresenter$Factory$Impl.getClass();
                    featureFlagManager2.getClass();
                    return new TaxPresenterFactory(activityTabPresenter$Factory$Impl, balanceFeedPresenter$Factory$Impl, receiptPresenter$Factory$Impl, featureFlagManager2, 1);
                case 3:
                    Flow flow = (Flow) ((FillrInitializer.MetroFactory) provider3).invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider4.invoke();
                    AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) provider2.invoke();
                    AndroidClock androidClock = (AndroidClock) provider.invoke();
                    coroutineContext.getClass();
                    androidDateFormatManager.getClass();
                    androidClock.getClass();
                    return new RealAfterpayEligibleRetroTransactionsProvider(flow, coroutineContext, androidDateFormatManager, androidClock);
                case 4:
                    InAppMessageService inAppMessageService = (InAppMessageService) ((DoubleCheck) provider2).getValue();
                    RealAppMessageActionPresenterHelper realAppMessageActionPresenterHelper = (RealAppMessageActionPresenterHelper) provider4.invoke();
                    AndroidClock androidClock2 = (AndroidClock) ((LambdaProvider) provider3).lambda.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) ((LambdaProvider) provider).lambda.invoke();
                    inAppMessageService.getClass();
                    realAppMessageActionPresenterHelper.getClass();
                    androidClock2.getClass();
                    coroutineContext2.getClass();
                    return new n(inAppMessageService, realAppMessageActionPresenterHelper, androidClock2, coroutineContext2);
                case 5:
                    Context context = (Context) provider4.invoke();
                    ConnectionPool connectionPool = (ConnectionPool) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider3).invoke();
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider2.invoke();
                    AndroidBiometrics androidBiometrics = (AndroidBiometrics) provider.invoke();
                    context.getClass();
                    coroutineContext3.getClass();
                    androidBiometrics.getClass();
                    return new AndroidSecureStore(context, connectionPool, androidBiometrics, coroutineContext3);
                case 6:
                    Context context2 = (Context) provider4.invoke();
                    ConnectionPool connectionPool2 = (ConnectionPool) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider3).invoke();
                    CoroutineContext coroutineContext4 = (CoroutineContext) provider2.invoke();
                    AndroidBiometrics androidBiometrics2 = (AndroidBiometrics) provider.invoke();
                    context2.getClass();
                    coroutineContext4.getClass();
                    androidBiometrics2.getClass();
                    return new AndroidSecureStore(context2, connectionPool2, androidBiometrics2, coroutineContext4);
                case 7:
                    Context context3 = (Context) provider4.invoke();
                    ConnectionPool connectionPool3 = (ConnectionPool) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider3).invoke();
                    CoroutineContext coroutineContext5 = (CoroutineContext) provider2.invoke();
                    AndroidBiometrics androidBiometrics3 = (AndroidBiometrics) provider.invoke();
                    context3.getClass();
                    coroutineContext5.getClass();
                    androidBiometrics3.getClass();
                    return new AndroidSecureStore(context3, connectionPool3, androidBiometrics3, coroutineContext5);
                case 8:
                    AndroidDateFormatManager androidDateFormatManager2 = (AndroidDateFormatManager) provider4.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider2.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider3.invoke();
                    BitcoinAutoInvestProvider bitcoinAutoInvestProvider = (BitcoinAutoInvestProvider) ((TreehouseFlows.MetroFactory) provider).invoke();
                    androidDateFormatManager2.getClass();
                    androidStringManager.getClass();
                    factory.getClass();
                    return new com.fillr.n(androidDateFormatManager2, androidStringManager, factory, bitcoinAutoInvestProvider);
                case 9:
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider4.invoke();
                    RealBitcoinEligibilityRepo realBitcoinEligibilityRepo = (RealBitcoinEligibilityRepo) provider2.invoke();
                    RealBitcoinSponsoredStateRepo realBitcoinSponsoredStateRepo = (RealBitcoinSponsoredStateRepo) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider3).invoke();
                    BitcoinWidgetAllowlistProvider bitcoinWidgetAllowlistProvider = (BitcoinWidgetAllowlistProvider) provider.invoke();
                    featureFlagManager3.getClass();
                    realBitcoinEligibilityRepo.getClass();
                    bitcoinWidgetAllowlistProvider.getClass();
                    return new RealBitcoinMapEligibilityManager(featureFlagManager3, realBitcoinEligibilityRepo, realBitcoinSponsoredStateRepo, bitcoinWidgetAllowlistProvider);
                case 10:
                    LendingAppService lendingAppService = (LendingAppService) ((DoubleCheck) provider2).getValue();
                    FlowStarter flowStarter = (FlowStarter) ((DoubleCheck) provider3).getValue();
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) provider4.invoke();
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) ((LambdaProvider) provider).lambda.invoke();
                    lendingAppService.getClass();
                    flowStarter.getClass();
                    blockersDataNavigator.getClass();
                    androidStringManager2.getClass();
                    return new MetadataRepo(lendingAppService, flowStarter, blockersDataNavigator, androidStringManager2);
                case 11:
                    CoroutineScope coroutineScope2 = (CoroutineScope) ((InstanceFactory) provider2).value;
                    RealClientSyncStorageOperationBatchSanitizer realClientSyncStorageOperationBatchSanitizer = (RealClientSyncStorageOperationBatchSanitizer) provider4.invoke();
                    RealClientSyncStorageOperationBatchExecutor realClientSyncStorageOperationBatchExecutor = (RealClientSyncStorageOperationBatchExecutor) ((DoubleCheck) provider3).getValue();
                    Set set = (Set) ((SetFactory) provider).invoke();
                    coroutineScope2.getClass();
                    realClientSyncStorageOperationBatchSanitizer.getClass();
                    realClientSyncStorageOperationBatchExecutor.getClass();
                    set.getClass();
                    return new RealClientSyncResponseProcessor(coroutineScope2, realClientSyncStorageOperationBatchSanitizer, realClientSyncStorageOperationBatchExecutor, CollectionsKt.toList(set));
                case 12:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider4.invoke();
                    CoroutineContext coroutineContext6 = (CoroutineContext) provider2.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) provider3).invoke();
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    coroutineContext6.getClass();
                    realProfileManager.getClass();
                    realFeatureEligibilityRepository.getClass();
                    return new RealDemandDepositAccountManager(cashAccountDatabaseImpl, coroutineContext6, realProfileManager, realFeatureEligibilityRepository);
                case 13:
                    RealDeviceIntegrityAnalyticsTracker realDeviceIntegrityAnalyticsTracker = (RealDeviceIntegrityAnalyticsTracker) ((RealKeyStoreProvider.MetroFactory) provider3).invoke();
                    AndroidClock androidClock3 = (AndroidClock) provider4.invoke();
                    PlayIntegrityClient playIntegrityClient = (PlayIntegrityClient) provider2.invoke();
                    CoroutineContext coroutineContext7 = (CoroutineContext) provider.invoke();
                    androidClock3.getClass();
                    playIntegrityClient.getClass();
                    coroutineContext7.getClass();
                    return new RealDeviceIntegrity(realDeviceIntegrityAnalyticsTracker, androidClock3, playIntegrityClient, coroutineContext7);
                case 14:
                    DiscoverService discoverService = (DiscoverService) ((DoubleCheck) provider4).getValue();
                    AppMessageClientService appMessageClientService = (AppMessageClientService) ((DoubleCheck) provider2).getValue();
                    SizeMap sizeMap = (SizeMap) ((RealTrifleService.MetroFactory) provider3).invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) ((DoubleCheck) provider).getValue();
                    discoverService.getClass();
                    appMessageClientService.getClass();
                    featureFlagManager4.getClass();
                    return new UnleashContext(discoverService, appMessageClientService, sizeMap, featureFlagManager4);
                case 15:
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) provider4.invoke();
                    RealSignatureRepo realSignatureRepo = (RealSignatureRepo) provider2.invoke();
                    SignedInStateManager signedInStateManager = (SignedInStateManager) provider3.invoke();
                    RealSignatureManagerLogger realSignatureManagerLogger = (RealSignatureManagerLogger) ((RealSignatureManagerLogger.MetroFactory) provider).invoke();
                    featureFlagManager5.getClass();
                    realSignatureRepo.getClass();
                    signedInStateManager.getClass();
                    return new RealSignatureManager(featureFlagManager5, realSignatureRepo, signedInStateManager, realSignatureManagerLogger);
                case 16:
                    SigningCertificateService signingCertificateService = (SigningCertificateService) ((FillrInitializer.MetroFactory) provider3).invoke();
                    TrifleService trifleService = (TrifleService) provider4.invoke();
                    RealTrifleLogger realTrifleLogger = (RealTrifleLogger) provider2.invoke();
                    CoroutineContext coroutineContext8 = (CoroutineContext) provider.invoke();
                    trifleService.getClass();
                    realTrifleLogger.getClass();
                    coroutineContext8.getClass();
                    return new SimpleActor(signingCertificateService, trifleService, realTrifleLogger, coroutineContext8, 26);
                case 17:
                    EligibilityRefresher eligibilityRefresher = (EligibilityRefresher) ((AttestedKeyMetrics$MetroFactory) provider3).invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider4.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider2.invoke();
                    KeyValue keyValue = (KeyValue) ((FillrInitializer.MetroFactory) provider).invoke();
                    syncValueReader.getClass();
                    errorReporter.getClass();
                    return new SignoutSideEffectsPerformer(eligibilityRefresher, syncValueReader, errorReporter, keyValue);
                case 18:
                    JCAContext jCAContext = (JCAContext) ((FillrInitializer.MetroFactory) provider3).invoke();
                    SessionManager sessionManager = (SessionManager) provider4.invoke();
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) provider2.invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) ((InstanceFactory) provider).value;
                    sessionManager.getClass();
                    realFamilyAccountsManager.getClass();
                    coroutineScope3.getClass();
                    return new RealManagedAccountTransferManager(jCAContext, sessionManager, realFamilyAccountsManager, coroutineScope3);
                case 19:
                    CdpAnalytics cdpAnalytics = (CdpAnalytics) ((DelegateFactory) provider2).invoke();
                    RealCashFirebaseAnalytics realCashFirebaseAnalytics = (RealCashFirebaseAnalytics) provider4.invoke();
                    UserJourneyAnalytics userJourneyAnalytics = (UserJourneyAnalytics) ((CashNavigationLogger.MetroFactory) provider3).invoke();
                    CombinedAnalytics combinedAnalytics = (CombinedAnalytics) ((CashNavigationLogger.MetroFactory) provider).invoke();
                    cdpAnalytics.getClass();
                    realCashFirebaseAnalytics.getClass();
                    return new CombinedAnalytics(new Analytics[]{cdpAnalytics, realCashFirebaseAnalytics, userJourneyAnalytics, combinedAnalytics});
                case 20:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) provider4.invoke();
                    RealInvestingSyncer realInvestingSyncer = (RealInvestingSyncer) ((AppLockMonitor.MetroFactory) provider3).invoke();
                    CoroutineContext coroutineContext9 = (CoroutineContext) provider2.invoke();
                    SessionManager sessionManager2 = (SessionManager) provider.invoke();
                    cashAccountDatabaseImpl2.getClass();
                    coroutineContext9.getClass();
                    sessionManager2.getClass();
                    return new InvestingSetupTeardown(cashAccountDatabaseImpl2, realInvestingSyncer, coroutineContext9, sessionManager2);
                case 21:
                    Context context4 = (Context) ((InstanceFactory) provider2).value;
                    CoroutineScope coroutineScope4 = (CoroutineScope) provider4.invoke();
                    Flow flow2 = (Flow) ((InstanceFactory) provider3).value;
                    RealLanguageManager realLanguageManager = (RealLanguageManager) ((DoubleCheck) provider).getValue();
                    context4.getClass();
                    coroutineScope4.getClass();
                    flow2.getClass();
                    realLanguageManager.getClass();
                    return new RealLocaleManager(context4, coroutineScope4, flow2, realLanguageManager);
                case 22:
                    CoroutineScope coroutineScope5 = (CoroutineScope) ((InstanceFactory) provider3).value;
                    RealMarketCapabilitiesDataManager realMarketCapabilitiesDataManager = (RealMarketCapabilitiesDataManager) provider4.invoke();
                    SessionManager sessionManager3 = (SessionManager) provider2.invoke();
                    zzr zzrVar = (zzr) ((RetroUiFactory.MetroFactory) provider).invoke();
                    coroutineScope5.getClass();
                    realMarketCapabilitiesDataManager.getClass();
                    sessionManager3.getClass();
                    return new RealMarketCapabilitiesManager(coroutineScope5, realMarketCapabilitiesDataManager, sessionManager3, zzrVar);
                case 23:
                    Context context5 = (Context) ((InstanceFactory) provider2).value;
                    AndroidConnectivityManager androidConnectivityManager2 = (AndroidConnectivityManager) provider4.invoke();
                    AndroidAudioManager androidAudioManager = (AndroidAudioManager) ((AndroidToaster.MetroFactory) provider3).invoke();
                    RealExecutorServiceFactory realExecutorServiceFactory = (RealExecutorServiceFactory) ((DoubleCheck) provider).getValue();
                    context5.getClass();
                    androidConnectivityManager2.getClass();
                    realExecutorServiceFactory.getClass();
                    return new RealSignalsCollector(context5, androidConnectivityManager2, androidAudioManager, realExecutorServiceFactory);
                case 24:
                    KeyValue keyValue2 = (KeyValue) ((MusicViewFactory$MetroFactory) provider3).invoke();
                    RealIntegrityChecker realIntegrityChecker = (RealIntegrityChecker) provider4.invoke();
                    RealIntegrityCheckFactory realIntegrityCheckFactory = (RealIntegrityCheckFactory) provider2.invoke();
                    Analytics analytics = (Analytics) provider.invoke();
                    realIntegrityChecker.getClass();
                    realIntegrityCheckFactory.getClass();
                    analytics.getClass();
                    return new RealOnboardingIntegrityChecker(keyValue2, realIntegrityChecker, realIntegrityCheckFactory, analytics);
                case 25:
                    provider4.getClass();
                    provider2.getClass();
                    provider.getClass();
                    return new RealIntegrityCheckFactory(provider4, (MusicViewFactory$MetroFactory) provider3, provider2, provider);
                case 26:
                    WebAuthnService webAuthnService = (WebAuthnService) provider4.invoke();
                    CredentialManagerPasskeyCreator credentialManagerPasskeyCreator = (CredentialManagerPasskeyCreator) ((CashCdpConfigProvider.MetroFactory) provider3).invoke();
                    RealPasskeyAnalytics realPasskeyAnalytics = (RealPasskeyAnalytics) provider2.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) provider.invoke();
                    webAuthnService.getClass();
                    realPasskeyAnalytics.getClass();
                    errorReporter2.getClass();
                    return new RealPasskeyRepository(webAuthnService, credentialManagerPasskeyCreator, realPasskeyAnalytics, errorReporter2);
                case 27:
                    KeyValue keyValue3 = (KeyValue) provider4.invoke();
                    PersonalizationRepository personalizationRepository = (PersonalizationRepository) ((SandboxJanitor.MetroFactory) provider3).invoke();
                    FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) provider2.invoke();
                    SessionManager sessionManager4 = (SessionManager) provider.invoke();
                    keyValue3.getClass();
                    featureFlagManager6.getClass();
                    sessionManager4.getClass();
                    return new PersonalizePaymentResourceRefresher(keyValue3, personalizationRepository, featureFlagManager6, sessionManager4);
                case 28:
                    RealPrepurchaseCashCardRepository realPrepurchaseCashCardRepository = (RealPrepurchaseCashCardRepository) ((WalletUiFactory$MetroFactory) provider2).invoke();
                    EglCore eglCore = (EglCore) ((RealKeyStoreProvider.MetroFactory) provider3).invoke();
                    Analytics analytics2 = (Analytics) provider4.invoke();
                    CoroutineScope coroutineScope6 = (CoroutineScope) ((InstanceFactory) provider).value;
                    analytics2.getClass();
                    coroutineScope6.getClass();
                    return new RealPrepurchaseToggleManager(realPrepurchaseCashCardRepository, eglCore, analytics2, coroutineScope6);
                default:
                    RealFileDownloader realFileDownloader = (RealFileDownloader) provider4.invoke();
                    RealFileDownloader realFileDownloader2 = (RealFileDownloader) ((ShiftsAnalytics.MetroFactory) provider3).invoke();
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) provider2.invoke();
                    CoroutineContext coroutineContext10 = (CoroutineContext) provider.invoke();
                    realFileDownloader.getClass();
                    androidStringManager3.getClass();
                    coroutineContext10.getClass();
                    return new RealQrCodesPresenter(realFileDownloader, realFileDownloader2, androidStringManager3, coroutineContext10);
            }
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, int i, byte b) {
            this.$r8$classId = i;
            this.storage = provider;
            this.fileDownloaderClientProvider = provider2;
            this.connectivityManager = provider3;
            this.fileSystemProvider = provider4;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, Provider provider4, int i, boolean z) {
            this.$r8$classId = i;
            this.storage = provider;
            this.connectivityManager = provider2;
            this.fileDownloaderClientProvider = provider3;
            this.fileSystemProvider = provider4;
        }

        public /* synthetic */ MetroFactory(Provider provider, Factory factory, Provider provider2, Provider provider3, int i) {
            this.$r8$classId = i;
            this.connectivityManager = provider;
            this.fileDownloaderClientProvider = factory;
            this.storage = provider2;
            this.fileSystemProvider = provider3;
        }

        public /* synthetic */ MetroFactory(Factory factory, Provider provider, Provider provider2, Provider provider3, int i) {
            this.$r8$classId = i;
            this.fileDownloaderClientProvider = factory;
            this.connectivityManager = provider;
            this.storage = provider2;
            this.fileSystemProvider = provider3;
        }
    }
}
