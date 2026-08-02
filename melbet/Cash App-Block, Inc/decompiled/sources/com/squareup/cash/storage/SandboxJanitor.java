package com.squareup.cash.storage;

import android.app.Activity;
import android.content.Context;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.exoplayer.ExoPlayer;
import coil3.RealImageLoader;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.VariantAppComponent;
import com.squareup.cash.attribution.ActivityTransitionsSideEffectsPerformer;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.EventListener;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db.db.CashAppDatabaseImpl;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.backend.real.RealPersonalizationRepository;
import com.squareup.cash.performance.MemoryInfo;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.security.backend.impl.RealPasswordManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shortcut.RealDynamicShortcutManager;
import com.squareup.cash.stablecoin.presenters.nullstate.RealStablecoinNullStateCarouselPresenter;
import com.squareup.cash.storage.RealSandboxer;
import com.squareup.cash.tabprovider.real.RealTabProvider;
import com.squareup.cash.treehouse.android.broadway.RealTreehouseNavigatorFactory;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.treehouse.sqldelight.AndroidSqlDelightBridgeHolder;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.CashNavigationLogger;
import com.squareup.cash.ui.MainActivity;
import com.squareup.cash.ui.gcm.GcmModule$Companion$provideGcmOnSignOutAction$1;
import com.squareup.cash.userjourneys.data.ActiveUserJourneysDataSource;
import com.squareup.cash.userjourneys.notifier.NoOpUserJourneyNotifier;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.real.RealTeamMemberIdProvider;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider;
import com.squareup.cash.work.service.api.passcode.PasscodeService;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.android.AndroidPackageManager;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.android.InstrumentationTestConfig$NotATest;
import com.squareup.util.coroutines.IoSetupTeardown;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import dev.zacsweers.metro.internal.MapFactory;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes.dex */
public final class SandboxJanitor implements IoSetupTeardown {
    public final StorageLink storageLink;
    public final StorageLinker storageLinker;
    public final VariantAppComponent zombieLegacyGraphExtensionFactory;

    public SandboxJanitor(StorageLinker storageLinker, StorageLink storageLink, VariantAppComponent variantAppComponent) {
        this.storageLinker = storageLinker;
        this.storageLink = storageLink;
        this.zombieLegacyGraphExtensionFactory = variantAppComponent;
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new PreferenceFlow$flow$1((Continuation) null, this, 6), 1);
        return StateFlowKt.noOpTeardown;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider storageLink;
        public final Provider storageLinker;
        public final Provider zombieLegacyGraphExtensionFactory;

        public MetroFactory(InstanceFactory instanceFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2) {
            this.$r8$classId = 4;
            this.storageLink = instanceFactory;
            this.storageLinker = lambdaProvider;
            this.zombieLegacyGraphExtensionFactory = lambdaProvider2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 1;
            Provider provider = this.storageLink;
            Provider provider2 = this.storageLinker;
            Provider provider3 = this.zombieLegacyGraphExtensionFactory;
            switch (i) {
                case 0:
                    StorageLinker storageLinker = (StorageLinker) ((LambdaProvider) provider2).lambda.invoke();
                    StorageLink storageLink = (StorageLink) ((InstanceFactory) provider).value;
                    VariantAppComponent variantAppComponent = (VariantAppComponent) provider3.invoke();
                    storageLinker.getClass();
                    storageLink.getClass();
                    variantAppComponent.getClass();
                    return new SandboxJanitor(storageLinker, storageLink, variantAppComponent);
                case 1:
                    ExoPlayer exoPlayer = (ExoPlayer) ((MusicViewFactory$MetroFactory) provider2).invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) provider).value;
                    CoroutineContext coroutineContext = (CoroutineContext) provider3.invoke();
                    coroutineScope.getClass();
                    coroutineContext.getClass();
                    return new StuckPlayerDetector(exoPlayer, coroutineScope, coroutineContext);
                case 2:
                    InstrumentationTestConfig$NotATest instrumentationTestConfig$NotATest = (InstrumentationTestConfig$NotATest) provider3.invoke();
                    RealPersonalizationRepository realPersonalizationRepository = (RealPersonalizationRepository) provider2.invoke();
                    ((RealSessionFlags.MetroFactory) provider).invoke();
                    instrumentationTestConfig$NotATest.getClass();
                    realPersonalizationRepository.getClass();
                    return realPersonalizationRepository;
                case 3:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider3.invoke();
                    AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) ((TreehouseFlows.MetroFactory) provider2).invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    syncValueReader.getClass();
                    return new RealPasswordManager(cashAccountDatabaseImpl, androidBiometricsStore, syncValueReader);
                case 4:
                    Activity activity = (Activity) ((InstanceFactory) provider).value;
                    RealClipboardManager realClipboardManager = (RealClipboardManager) ((LambdaProvider) provider2).lambda.invoke();
                    AndroidPackageManager androidPackageManager = (AndroidPackageManager) ((LambdaProvider) provider3).lambda.invoke();
                    activity.getClass();
                    realClipboardManager.getClass();
                    androidPackageManager.getClass();
                    return new TextSetter(activity, realClipboardManager, androidPackageManager);
                case 5:
                    Context context = (Context) provider3.invoke();
                    RealContactRepository realContactRepository = (RealContactRepository) ((RealSessionFlags.MetroFactory) provider2).invoke();
                    RealImageLoader realImageLoader = (RealImageLoader) provider.invoke();
                    KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(MainActivity.class);
                    context.getClass();
                    realImageLoader.getClass();
                    return new RealDynamicShortcutManager(context, realContactRepository, realImageLoader, orCreateKotlinClass);
                case 6:
                    AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) provider2).lambda.invoke();
                    Analytics analytics = (Analytics) ((DoubleCheck) provider).getValue();
                    KeyValue keyValue = (KeyValue) ((RealCurrentUserSetter.MetroFactory) provider3).invoke();
                    androidStringManager.getClass();
                    analytics.getClass();
                    return new RealStablecoinNullStateCarouselPresenter(androidStringManager, analytics, keyValue);
                case 7:
                    CashAppDatabaseImpl cashAppDatabaseImpl = (CashAppDatabaseImpl) provider3.invoke();
                    RealSessionedLink$Factory$Impl realSessionedLink$Factory$Impl = (RealSessionedLink$Factory$Impl) ((InstanceFactory) provider).value;
                    KeyValue keyValue2 = (KeyValue) ((ScoreUiFactory.MetroFactory) provider2).invoke();
                    cashAppDatabaseImpl.getClass();
                    realSessionedLink$Factory$Impl.getClass();
                    return new RealSessionedLinkStore(cashAppDatabaseImpl, realSessionedLink$Factory$Impl, keyValue2);
                case 8:
                    RealSandboxer realSandboxer = (RealSandboxer) ((RealSandboxer.MetroFactory) provider2).invoke();
                    Analytics analytics2 = (Analytics) provider3.invoke();
                    Storage storage = (Storage) provider.invoke();
                    analytics2.getClass();
                    storage.getClass();
                    return new SandboxingAnalyticsLogger(realSandboxer, analytics2, storage, MemoryInfo.Reader);
                case 9:
                    SessionManager sessionManager = (SessionManager) provider3.invoke();
                    sessionManager.getClass();
                    return new ActivityTransitionsSideEffectsPerformer(i2, sessionManager, (RealTabProvider.MetroFactory) provider2, (BreadcrumbListener.MetroFactory) provider);
                case 10:
                    Function function = (MapFactory) provider2;
                    if (function instanceof Lazy) {
                    } else {
                        new ReentrantLock();
                    }
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider3.invoke();
                    AndroidSqlDelightBridgeHolder androidSqlDelightBridgeHolder = (AndroidSqlDelightBridgeHolder) provider.invoke();
                    coroutineContext2.getClass();
                    androidSqlDelightBridgeHolder.getClass();
                    return new GcmModule$Companion$provideGcmOnSignOutAction$1(androidSqlDelightBridgeHolder, 5);
                case 11:
                    Profile.Adapter adapter = (Profile.Adapter) ((RealBugReportSenderFactory.MetroFactory) provider2).invoke();
                    RealTreehouseNavigatorFactory realTreehouseNavigatorFactory = (RealTreehouseNavigatorFactory) provider3.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) ((InstanceFactory) provider).value;
                    realTreehouseNavigatorFactory.getClass();
                    coroutineScope2.getClass();
                    return new CashTreehouseLayout.Factory(adapter, realTreehouseNavigatorFactory, coroutineScope2);
                case 12:
                    BreadcrumbListener breadcrumbListener = (BreadcrumbListener) provider3.invoke();
                    CashNavigationLogger cashNavigationLogger = (CashNavigationLogger) ((InstanceFactory) provider).value;
                    NavigationSideEffects navigationSideEffects = (NavigationSideEffects) ((NavigationSideEffects.MetroFactory) provider2).invoke();
                    breadcrumbListener.getClass();
                    cashNavigationLogger.getClass();
                    return CollectionsKt__CollectionsKt.listOf((Object[]) new EventListener[]{breadcrumbListener, cashNavigationLogger, navigationSideEffects});
                case 13:
                    File file = (File) ((AndroidToaster.MetroFactory) provider2).invoke();
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    NoOpUserJourneyNotifier noOpUserJourneyNotifier = (NoOpUserJourneyNotifier) provider3.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider.invoke();
                    defaultIoScheduler.getClass();
                    noOpUserJourneyNotifier.getClass();
                    errorReporter.getClass();
                    return new ActiveUserJourneysDataSource(file, defaultIoScheduler, noOpUserJourneyNotifier, errorReporter);
                default:
                    PasscodeService passcodeService = (PasscodeService) provider3.invoke();
                    RealTeamMemberIdProvider realTeamMemberIdProvider = (RealTeamMemberIdProvider) ((ShiftsAnalytics.MetroFactory) provider2).invoke();
                    RealSelectedMerchantProvider realSelectedMerchantProvider = (RealSelectedMerchantProvider) provider.invoke();
                    passcodeService.getClass();
                    realSelectedMerchantProvider.getClass();
                    return new RealPasscodeProvider(passcodeService, realTeamMemberIdProvider, realSelectedMerchantProvider);
            }
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, int i, boolean z) {
            this.$r8$classId = i;
            this.zombieLegacyGraphExtensionFactory = provider;
            this.storageLinker = provider2;
            this.storageLink = provider3;
        }

        public /* synthetic */ MetroFactory(Provider provider, InstanceFactory instanceFactory, Factory factory, int i) {
            this.$r8$classId = i;
            this.zombieLegacyGraphExtensionFactory = provider;
            this.storageLink = instanceFactory;
            this.storageLinker = factory;
        }

        public /* synthetic */ MetroFactory(Factory factory, Provider provider, Provider provider2, int i) {
            this.$r8$classId = i;
            this.storageLinker = factory;
            this.zombieLegacyGraphExtensionFactory = provider;
            this.storageLink = provider2;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, int i) {
            this.$r8$classId = i;
            this.storageLinker = provider;
            this.storageLink = provider2;
            this.zombieLegacyGraphExtensionFactory = provider3;
        }
    }
}
