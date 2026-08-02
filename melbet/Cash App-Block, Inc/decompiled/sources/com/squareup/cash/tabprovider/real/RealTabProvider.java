package com.squareup.cash.tabprovider.real;

import android.content.Context;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.ui.node.NodeChain;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import app.cash.local.navigation.api.RealCashLocalNavigatorHelper;
import app.cash.local.views.LocalViewFactory;
import app.cash.passcode.backend.RealAppLockState;
import coil3.ComponentRegistry;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda0;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import coil3.Extras;
import coil3.ExtrasKt;
import coil3.ImageLoader$Builder;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import coil3.RealImageLoader;
import coil3.Uri;
import coil3.decode.Decoder;
import coil3.network.NetworkFetcher;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import com.bugsnag.android.internal.dag.ContextModule;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.biometrics.AndroidSecureStore;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.navigation.RealBitcoinRefreshInvoiceManager;
import com.squareup.cash.blockers.actions.presenters.BlockerActionFileDownloadFailurePresenter$Factory$Impl;
import com.squareup.cash.blockers.actions.util.BlockerActionUriDecoder;
import com.squareup.cash.blockers.flow.RealMultiBlockerFacilitator;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.braze.BrazeInitializer;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.clientrouting.routers.core.BackgroundRouter;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.contacts.RealContactDetailsSyncState;
import com.squareup.cash.data.contacts.RealContactSync;
import com.squareup.cash.data.contacts.RealContactSyncDetailsRepository;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileSyncer;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ManagedAccountAuthenticatedPhotoUploads;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.gcl.RealMarketAttributesProvider;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.gps.backend.real.RealGpsLocationManager;
import com.squareup.cash.inappreview.real.RealRequestReviewFlagWrapper;
import com.squareup.cash.initialscreenloader.backend.RealColdStartIntegrityChecker;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.contacts.RealContactBook;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.moneybot.backend.real.managers.RealExtensionManager$MetroFactory;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.navigation.CashTabProviderNavigatorHelper;
import com.squareup.cash.notifications.Op;
import com.squareup.cash.observability.backend.real.network.RealDatadogObservabilityInterceptor;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository;
import com.squareup.cash.onboarding.check.RealIntegrityChecker;
import com.squareup.cash.onboarding.check.checkers.RealIntegrityCheckFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.shared.ui.SharedUiVariables;
import com.squareup.cash.shopping.presenters.ShoppingPresenterFactory;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.support.backend.api.transaction.SupportTransactionMapper;
import com.squareup.cash.support.backend.real.RealSupportTransactionService;
import com.squareup.cash.tabprovider.api.TabInfo;
import com.squareup.cash.taptopay.encryption.real.RealHieroglyphKeyProvider;
import com.squareup.cash.taptopay.encryption.real.RealMacDelegator$MetroFactory;
import com.squareup.cash.taptopay.encryption.real.utils.RealKeyProvisionCompatibilityChecker;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.util.clock.AndroidAccurateClock;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.CashBusinessPaymentsClientService;
import com.squareup.protos.cash.contacts.app.ContactsAppClientService;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.scannerview.ScannerView;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import com.squareup.util.coil.DatadogCoilEventListener;
import com.squareup.util.coil.RestrictedProfilePhotoUrlMatcher;
import com.squareup.util.coil.RoutingImageCallFactory;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.android.IoActivitySetupTeardown;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import papa.internal.Perfs$$ExternalSyntheticLambda4;

/* loaded from: classes7.dex */
public final class RealTabProvider implements IoActivitySetupTeardown {
    public final TabInfo activityTab;
    public final Analytics analytics;
    public final RealFamilyProfileManager familyProfileManager;
    public final RealCashLocalNavigatorHelper localNavigatorHelper;
    public final RealLocalTabProvider localTabProvider;
    public final TabInfo moneyTab;
    public final TabInfo paymentTab;
    public final SessionManager sessionManager;
    public final SharedUiVariables sharedUiVariables;
    public final RealTabPublisher tabPublisher;
    public final TabInfo treehouseActivityTab;

    public RealTabProvider(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, CashTabProviderNavigatorHelper cashTabProviderNavigatorHelper, SessionManager sessionManager, RealTabPublisher realTabPublisher, SharedUiVariables sharedUiVariables, Analytics analytics, RealCashLocalNavigatorHelper realCashLocalNavigatorHelper, RealLocalTabProvider realLocalTabProvider, RealFamilyProfileManager realFamilyProfileManager) {
        this.sessionManager = sessionManager;
        this.tabPublisher = realTabPublisher;
        this.sharedUiVariables = sharedUiVariables;
        this.analytics = analytics;
        this.localNavigatorHelper = realCashLocalNavigatorHelper;
        this.localTabProvider = realLocalTabProvider;
        this.familyProfileManager = realFamilyProfileManager;
        this.activityTab = new TabInfo(TabInfo.Id.Activity, new ScannerView.AnonymousClass3(1, cashTabProviderNavigatorHelper, CashTabProviderNavigatorHelper.class, "isActivityScreen", "isActivityScreen(Ljava/lang/Object;)Z", 0, 5));
        int i = 0;
        int i2 = 1;
        this.treehouseActivityTab = new TabInfo(TabInfo.Id.TreehouseActivity, new ScannerView.AnonymousClass3(i2, cashTabProviderNavigatorHelper, CashTabProviderNavigatorHelper.class, "isActivityScreen", "isActivityScreen(Ljava/lang/Object;)Z", i, 9));
        this.moneyTab = new TabInfo(TabInfo.Id.Money, new ScannerView.AnonymousClass3(i2, cashTabProviderNavigatorHelper, CashTabProviderNavigatorHelper.class, "isBankingScreen", "isBankingScreen(Ljava/lang/Object;)Z", i, 7));
        this.paymentTab = new TabInfo(TabInfo.Id.Payment, new ScannerView.AnonymousClass3(i2, cashTabProviderNavigatorHelper, CashTabProviderNavigatorHelper.class, "isPaymentPadScreen", "isPaymentPadScreen(Ljava/lang/Object;)Z", i, 8));
    }

    @Override // com.squareup.util.coroutines.SetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope, Object obj) {
        coroutineScope.getClass();
        ((Lifecycle) obj).getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new ShoppingWebBridge$loadUrl$1(null, this), 1);
        return StateFlowKt.noOpTeardown;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider analytics;
        public final Provider bitcoinCapabilityProvider;
        public final Provider familyProfileManager;
        public final Provider localNavigatorHelper;
        public final Provider localTabProvider;
        public final Provider sessionManager;
        public final Provider sharedUiVariables;
        public final Provider tabProviderNavigatorHelper;
        public final Provider tabPublisher;

        public MetroFactory(RealMarketAttributesProvider.MetroFactory metroFactory, RealContactSync.MetroFactory metroFactory2, RealSessionFlags.MetroFactory metroFactory3, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, RealFeatureFlagManager.MetroFactory metroFactory4, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, InstanceFactory instanceFactory) {
            this.$r8$classId = 2;
            this.bitcoinCapabilityProvider = metroFactory;
            this.sessionManager = metroFactory2;
            this.familyProfileManager = metroFactory3;
            this.tabPublisher = arcadeModule$ProvideHapticVibratorMetroFactory;
            this.sharedUiVariables = metroFactory4;
            this.analytics = doubleCheck;
            this.localNavigatorHelper = doubleCheck2;
            this.localTabProvider = lambdaProvider;
            this.tabProviderNavigatorHelper = instanceFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.localNavigatorHelper;
            Provider provider2 = this.analytics;
            Provider provider3 = this.sharedUiVariables;
            Provider provider4 = this.tabPublisher;
            Provider provider5 = this.tabProviderNavigatorHelper;
            Provider provider6 = this.familyProfileManager;
            Provider provider7 = this.sessionManager;
            Provider provider8 = this.localTabProvider;
            Provider provider9 = this.bitcoinCapabilityProvider;
            switch (i) {
                case 0:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider9.invoke();
                    CashTabProviderNavigatorHelper cashTabProviderNavigatorHelper = (CashTabProviderNavigatorHelper) ((MusicViewFactory$MetroFactory) provider5).invoke();
                    SessionManager sessionManager = (SessionManager) provider7.invoke();
                    RealTabPublisher realTabPublisher = (RealTabPublisher) provider4.invoke();
                    SharedUiVariables sharedUiVariables = (SharedUiVariables) provider3.invoke();
                    Analytics analytics = (Analytics) provider2.invoke();
                    RealCashLocalNavigatorHelper realCashLocalNavigatorHelper = (RealCashLocalNavigatorHelper) provider.invoke();
                    RealLocalTabProvider realLocalTabProvider = (RealLocalTabProvider) provider8.invoke();
                    RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) provider6.invoke();
                    realBitcoinCapabilityProvider.getClass();
                    sessionManager.getClass();
                    realTabPublisher.getClass();
                    sharedUiVariables.getClass();
                    analytics.getClass();
                    realCashLocalNavigatorHelper.getClass();
                    realLocalTabProvider.getClass();
                    realFamilyProfileManager.getClass();
                    return new RealTabProvider(realBitcoinCapabilityProvider, cashTabProviderNavigatorHelper, sessionManager, realTabPublisher, sharedUiVariables, analytics, realCashLocalNavigatorHelper, realLocalTabProvider, realFamilyProfileManager);
                case 1:
                    Analytics analytics2 = (Analytics) ((DoubleCheck) provider).getValue();
                    BlockerFlowListener blockerFlowListener = (BlockerFlowListener) provider9.invoke();
                    RealMultiBlockerFacilitator realMultiBlockerFacilitator = (RealMultiBlockerFacilitator) provider7.invoke();
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) provider4.invoke();
                    AppForegroundStateProvider appForegroundStateProvider = (AppForegroundStateProvider) ((LambdaProvider) provider8).lambda.invoke();
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) provider3.invoke();
                    BlockerActionUriDecoder blockerActionUriDecoder = (BlockerActionUriDecoder) provider2.invoke();
                    BlockerActionFileDownloadFailurePresenter$Factory$Impl blockerActionFileDownloadFailurePresenter$Factory$Impl = (BlockerActionFileDownloadFailurePresenter$Factory$Impl) ((InstanceFactory) provider6).value;
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) provider5).value;
                    analytics2.getClass();
                    blockerFlowListener.getClass();
                    realMultiBlockerFacilitator.getClass();
                    blockersDataNavigator.getClass();
                    appForegroundStateProvider.getClass();
                    realBlockersHelper$Factory$Impl.getClass();
                    blockerActionUriDecoder.getClass();
                    blockerActionFileDownloadFailurePresenter$Factory$Impl.getClass();
                    coroutineScope.getClass();
                    return new ShoppingPresenterFactory(analytics2, blockerFlowListener, realMultiBlockerFacilitator, blockersDataNavigator, appForegroundStateProvider, realBlockersHelper$Factory$Impl, blockerActionUriDecoder, blockerActionFileDownloadFailurePresenter$Factory$Impl, coroutineScope);
                case 2:
                    RealRequestReviewFlagWrapper realRequestReviewFlagWrapper = (RealRequestReviewFlagWrapper) provider9.invoke();
                    RealAfterpayAppletRepository realAfterpayAppletRepository = (RealAfterpayAppletRepository) provider7.invoke();
                    RealOffersSheetRepository realOffersSheetRepository = (RealOffersSheetRepository) ((RealSessionFlags.MetroFactory) provider6).invoke();
                    RealBitcoinRefreshInvoiceManager realBitcoinRefreshInvoiceManager = (RealBitcoinRefreshInvoiceManager) provider4.invoke();
                    RealGpsLocationManager realGpsLocationManager = (RealGpsLocationManager) provider3.invoke();
                    RealAppMessageManager realAppMessageManager = (RealAppMessageManager) provider2.invoke();
                    ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1 = (ForcedLazyKt$forcedLazy$1) provider.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider8.invoke();
                    CoroutineScope coroutineScope2 = (CoroutineScope) ((InstanceFactory) provider5).value;
                    realRequestReviewFlagWrapper.getClass();
                    realAfterpayAppletRepository.getClass();
                    realBitcoinRefreshInvoiceManager.getClass();
                    realGpsLocationManager.getClass();
                    realAppMessageManager.getClass();
                    forcedLazyKt$forcedLazy$1.getClass();
                    coroutineContext.getClass();
                    coroutineScope2.getClass();
                    return new BackgroundRouter(realRequestReviewFlagWrapper, realAfterpayAppletRepository, realOffersSheetRepository, realBitcoinRefreshInvoiceManager, realGpsLocationManager, realAppMessageManager, forcedLazyKt$forcedLazy$1, coroutineContext, coroutineScope2);
                case 3:
                    ContactsAppClientService contactsAppClientService = (ContactsAppClientService) provider9.invoke();
                    RealContactSyncDetailsRepository realContactSyncDetailsRepository = (RealContactSyncDetailsRepository) provider7.invoke();
                    RealContactDetailsSyncState realContactDetailsSyncState = (RealContactDetailsSyncState) provider4.invoke();
                    ContextModule contextModule = (ContextModule) ((BrazeInitializer.MetroFactory) provider5).invoke();
                    UiAlias.Type.Companion companion = new UiAlias.Type.Companion();
                    AndroidClock androidClock = (AndroidClock) provider3.invoke();
                    Analytics analytics3 = (Analytics) provider2.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) provider.invoke();
                    RealContactBook realContactBook = (RealContactBook) provider8.invoke();
                    Context context = (Context) provider6.invoke();
                    contactsAppClientService.getClass();
                    realContactSyncDetailsRepository.getClass();
                    realContactDetailsSyncState.getClass();
                    androidClock.getClass();
                    analytics3.getClass();
                    realProfileManager.getClass();
                    realContactBook.getClass();
                    context.getClass();
                    return new NodeChain(contactsAppClientService, realContactSyncDetailsRepository, realContactDetailsSyncState, contextModule, companion, androidClock, analytics3, realProfileManager, realContactBook, context);
                case 4:
                    RealProfileSyncer realProfileSyncer = (RealProfileSyncer) provider9.invoke();
                    AppConfigManager appConfigManager = (AppConfigManager) provider7.invoke();
                    RealIntegrityCheckFactory realIntegrityCheckFactory = (RealIntegrityCheckFactory) provider4.invoke();
                    RealIntegrityChecker realIntegrityChecker = (RealIntegrityChecker) ((DoubleCheck) provider5).getValue();
                    RealClientSyncer realClientSyncer = (RealClientSyncer) provider3.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) provider2.invoke();
                    Analytics analytics4 = (Analytics) provider.invoke();
                    RealAppLockState realAppLockState = (RealAppLockState) provider8.invoke();
                    AndroidClock androidClock2 = (AndroidClock) provider6.invoke();
                    realProfileSyncer.getClass();
                    appConfigManager.getClass();
                    realIntegrityCheckFactory.getClass();
                    realIntegrityChecker.getClass();
                    realClientSyncer.getClass();
                    syncValueReader.getClass();
                    analytics4.getClass();
                    realAppLockState.getClass();
                    androidClock2.getClass();
                    return new RealColdStartIntegrityChecker(realProfileSyncer, appConfigManager, realIntegrityCheckFactory, realIntegrityChecker, realClientSyncer, syncValueReader, analytics4, realAppLockState, androidClock2);
                case 5:
                    ActivityClientService activityClientService = (ActivityClientService) provider9.invoke();
                    SessionManager sessionManager2 = (SessionManager) provider7.invoke();
                    Flow flow = (Flow) provider4.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider3.invoke();
                    RealSupportTransactionService.TimeoutConfig timeoutConfig = (RealSupportTransactionService.TimeoutConfig) ((BreadcrumbListener.MetroFactory) provider6).invoke();
                    SupportTransactionMapper supportTransactionMapper = (SupportTransactionMapper) provider2.invoke();
                    Flow flow2 = (Flow) provider.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) provider8.invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) ((InstanceFactory) provider5).value;
                    activityClientService.getClass();
                    sessionManager2.getClass();
                    flow.getClass();
                    errorReporter.getClass();
                    supportTransactionMapper.getClass();
                    flow2.getClass();
                    coroutineContext2.getClass();
                    coroutineScope3.getClass();
                    return new RealSupportTransactionService(activityClientService, sessionManager2, flow, errorReporter, timeoutConfig, supportTransactionMapper, flow2, coroutineContext2, coroutineScope3);
                case 6:
                    AndroidAccurateClock androidAccurateClock = (AndroidAccurateClock) provider9.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) provider7.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider4.invoke();
                    AndroidSecureStore androidSecureStore = (AndroidSecureStore) ((RealFileDownloader.MetroFactory) provider6).invoke();
                    RealKeyProvisionCompatibilityChecker realKeyProvisionCompatibilityChecker = (RealKeyProvisionCompatibilityChecker) ((BroadwayModule$ProvideBroadwayMetroFactory) provider5).invoke();
                    RealKeyStoreProvider realKeyStoreProvider = (RealKeyStoreProvider) provider3.invoke();
                    CashBusinessPaymentsClientService cashBusinessPaymentsClientService = (CashBusinessPaymentsClientService) provider2.invoke();
                    SessionManager sessionManager3 = (SessionManager) provider.invoke();
                    RealMRIFactory realMRIFactory = (RealMRIFactory) provider8.invoke();
                    CardProduct.Companion companion2 = (CardProduct.Companion) RealMacDelegator$MetroFactory.INSTANCE$4.invoke();
                    Op.Companion companion3 = (Op.Companion) RealMacDelegator$MetroFactory.INSTANCE$3.invoke();
                    androidAccurateClock.getClass();
                    errorReporter2.getClass();
                    featureFlagManager.getClass();
                    realKeyStoreProvider.getClass();
                    cashBusinessPaymentsClientService.getClass();
                    sessionManager3.getClass();
                    realMRIFactory.getClass();
                    return new RealHieroglyphKeyProvider(androidAccurateClock, errorReporter2, featureFlagManager, androidSecureStore, realKeyProvisionCompatibilityChecker, realKeyStoreProvider, cashBusinessPaymentsClientService, sessionManager3, realMRIFactory, companion2, companion3);
                default:
                    Context context2 = (Context) provider9.invoke();
                    CoroutineScope coroutineScope4 = (CoroutineScope) ((InstanceFactory) provider8).value;
                    CoroutineContext coroutineContext3 = (CoroutineContext) provider7.invoke();
                    String str = (String) ((LambdaProvider) provider6).lambda.invoke();
                    ComponentRegistry componentRegistry = (ComponentRegistry) ((LambdaProvider) provider5).lambda.invoke();
                    RealDatadogObservabilityInterceptor realDatadogObservabilityInterceptor = (RealDatadogObservabilityInterceptor) provider4.invoke();
                    EventListener.Factory factory = (EventListener.Factory) provider3.invoke();
                    Call.Factory factory2 = (Call.Factory) provider2.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider.invoke();
                    context2.getClass();
                    coroutineScope4.getClass();
                    coroutineContext3.getClass();
                    str.getClass();
                    componentRegistry.getClass();
                    realDatadogObservabilityInterceptor.getClass();
                    factory.getClass();
                    factory2.getClass();
                    featureFlagManager2.getClass();
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    builder.interceptors.add(realDatadogObservabilityInterceptor);
                    builder.eventListenerFactory = factory;
                    RoutingImageCallFactory routingImageCallFactory = new RoutingImageCallFactory(new OkHttpClient(builder), factory2, new RestrictedProfilePhotoUrlMatcher(str, ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager2).peekCurrentValue(LaunchDarklyFeatureFlags$ManagedAccountAuthenticatedPhotoUploads.INSTANCE)).enabled()));
                    ArrayList mutableList = CollectionsKt.toMutableList((Collection) componentRegistry.interceptors);
                    ArrayList mutableList2 = CollectionsKt.toMutableList((Collection) componentRegistry.mappers);
                    ArrayList mutableList3 = CollectionsKt.toMutableList((Collection) componentRegistry.keyers);
                    List fetcherFactories = componentRegistry.getFetcherFactories();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = fetcherFactories.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new ImageLoader$Builder$$ExternalSyntheticLambda1((Pair) it.next(), 24));
                    }
                    List decoderFactories = componentRegistry.getDecoderFactories();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = decoderFactories.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new ComponentRegistry$Builder$$ExternalSyntheticLambda0((Decoder.Factory) it2.next(), 1));
                    }
                    arrayList.add(new ComponentRegistry$Builder$$ExternalSyntheticLambda3(0, new NetworkFetcher.Factory(new ImageLoader$Builder$$ExternalSyntheticLambda1(routingImageCallFactory, 25)), Reflection.factory.getOrCreateKotlinClass(Uri.class)));
                    ComponentRegistry componentRegistry2 = new ComponentRegistry(BundleKt.toImmutableList(mutableList), BundleKt.toImmutableList(mutableList2), BundleKt.toImmutableList(mutableList3), BundleKt.toImmutableList(arrayList), BundleKt.toImmutableList(arrayList2));
                    ImageLoader$Builder imageLoader$Builder = new ImageLoader$Builder(context2);
                    ImageRequestsKt.crossfade(imageLoader$Builder);
                    ImageRequest.Defaults copy$default = ImageRequest.Defaults.copy$default((ImageRequest.Defaults) imageLoader$Builder.defaults, null, coroutineContext3, null, null, 16379);
                    imageLoader$Builder.defaults = copy$default;
                    imageLoader$Builder.defaults = ImageRequest.Defaults.copy$default(copy$default, null, null, coroutineContext3, null, 16375);
                    ((Extras.Builder) imageLoader$Builder.extras).set(ExtrasKt.serviceLoaderEnabledKey, Boolean.FALSE);
                    imageLoader$Builder.eventListenerFactory = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(new DatadogCoilEventListener(), 4);
                    imageLoader$Builder.componentRegistry = componentRegistry2;
                    RealImageLoader build = imageLoader$Builder.build();
                    StateFlowKt.closeWith(build, coroutineScope4, new Perfs$$ExternalSyntheticLambda4(15));
                    return build;
            }
        }

        public MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck, RealFileDownloader.MetroFactory metroFactory, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck4) {
            this.$r8$classId = 6;
            this.bitcoinCapabilityProvider = lambdaProvider;
            this.sessionManager = lambdaProvider2;
            this.tabPublisher = doubleCheck;
            this.familyProfileManager = metroFactory;
            this.tabProviderNavigatorHelper = broadwayModule$ProvideBroadwayMetroFactory;
            this.sharedUiVariables = doubleCheck2;
            this.analytics = doubleCheck3;
            this.localNavigatorHelper = lambdaProvider3;
            this.localTabProvider = doubleCheck4;
        }

        public MetroFactory(Provider provider, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, LambdaProvider lambdaProvider, Provider provider2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, Provider provider3, Provider provider4, Provider provider5) {
            this.$r8$classId = 0;
            this.bitcoinCapabilityProvider = provider;
            this.tabProviderNavigatorHelper = musicViewFactory$MetroFactory;
            this.sessionManager = lambdaProvider;
            this.tabPublisher = provider2;
            this.sharedUiVariables = doubleCheck;
            this.analytics = doubleCheck2;
            this.localNavigatorHelper = provider3;
            this.localTabProvider = provider4;
            this.familyProfileManager = provider5;
        }

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Factory factory, Provider provider3, Provider provider4, DoubleCheck doubleCheck, Provider provider5, DoubleCheck doubleCheck2, Provider provider6, int i) {
            this.$r8$classId = i;
            this.bitcoinCapabilityProvider = provider;
            this.sessionManager = provider2;
            this.tabPublisher = factory;
            this.tabProviderNavigatorHelper = provider3;
            this.sharedUiVariables = provider4;
            this.analytics = doubleCheck;
            this.localNavigatorHelper = provider5;
            this.localTabProvider = doubleCheck2;
            this.familyProfileManager = provider6;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealGlobalConfigDataSource.MetroFactory metroFactory, LocalViewFactory.MetroFactory metroFactory2, RealBrazeManager.MetroFactory metroFactory3, LambdaProvider lambdaProvider, InstanceFactory instanceFactory, RealExtensionManager$MetroFactory realExtensionManager$MetroFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3) {
            this.$r8$classId = 1;
            this.localNavigatorHelper = doubleCheck;
            this.bitcoinCapabilityProvider = metroFactory;
            this.sessionManager = metroFactory2;
            this.tabPublisher = metroFactory3;
            this.localTabProvider = lambdaProvider;
            this.sharedUiVariables = instanceFactory;
            this.analytics = realExtensionManager$MetroFactory;
            this.familyProfileManager = instanceFactory2;
            this.tabProviderNavigatorHelper = instanceFactory3;
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, FillrInitializer.MetroFactory metroFactory, LambdaProvider lambdaProvider2, BreadcrumbListener.MetroFactory metroFactory2, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, InstanceFactory instanceFactory) {
            this.$r8$classId = 5;
            this.bitcoinCapabilityProvider = doubleCheck;
            this.sessionManager = lambdaProvider;
            this.tabPublisher = metroFactory;
            this.sharedUiVariables = lambdaProvider2;
            this.familyProfileManager = metroFactory2;
            this.analytics = doubleCheck2;
            this.localNavigatorHelper = doubleCheck3;
            this.localTabProvider = doubleCheck4;
            this.tabProviderNavigatorHelper = instanceFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, InstanceFactory instanceFactory, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DelegateFactory delegateFactory, DoubleCheck doubleCheck4) {
            this.$r8$classId = 7;
            this.bitcoinCapabilityProvider = doubleCheck;
            this.localTabProvider = instanceFactory;
            this.sessionManager = lambdaProvider;
            this.familyProfileManager = lambdaProvider2;
            this.tabProviderNavigatorHelper = lambdaProvider3;
            this.tabPublisher = doubleCheck2;
            this.sharedUiVariables = doubleCheck3;
            this.analytics = delegateFactory;
            this.localNavigatorHelper = doubleCheck4;
        }
    }
}
