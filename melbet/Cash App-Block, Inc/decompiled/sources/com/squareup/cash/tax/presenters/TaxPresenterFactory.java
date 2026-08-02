package com.squareup.cash.tax.presenters;

import android.app.Activity;
import android.os.Build;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.ui.node.NodeChain;
import androidx.datastore.core.SimpleActor;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import coil3.ImageLoader$Builder;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.mlkit.vision.text.internal.zzr;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.ActivityFeedProducer;
import com.squareup.cash.activity.backend.RealActivityUpdatesNotifier;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.backend.loader.RealSingleActivityManager$Factory$Impl;
import com.squareup.cash.activity.backend.loader.ReceiptGetRequestHandler$Factory$Impl;
import com.squareup.cash.activity.backend.offline.OfflineActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.presenters.ActivityTabPresenter;
import com.squareup.cash.activity.presenters.ActivityTabPresenter$Factory$Impl;
import com.squareup.cash.activity.presenters.ActivityTabSearchCache;
import com.squareup.cash.activity.presenters.BalanceFeedPresenter$Factory$Impl;
import com.squareup.cash.activity.presenters.BalanceFeedPresenter$MetroFactory;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.PaymentHistoryAvatarFactory;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityScreenInitialArgumentsSupplier;
import com.squareup.cash.activity.presenters.RealContactHeaderPresenter$Factory$Impl;
import com.squareup.cash.activity.presenters.receipts.ReceiptPresenter;
import com.squareup.cash.activity.presenters.receipts.ReceiptPresenter$Factory$Impl;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.activity.screens.BalanceFeedScreen;
import com.squareup.cash.appmessages.presenters.ActivityCardAppMessagePresenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.ActivityInlineAppMessageV2Presenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.ProfileInlineAppMessagePresenter$Factory$Impl;
import com.squareup.cash.banking.applets.presenters.BalanceAppletTileRepository;
import com.squareup.cash.biometrics.AndroidBiometricsStore;
import com.squareup.cash.bitcoin.presenters.map.BitcoinMapPresenter;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.BlockerImageUploader$MetroFactory;
import com.squareup.cash.blockers.presenters.SignaturePresenter$MetroFactory;
import com.squareup.cash.blockers.presenters.SsnPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.spendinginsights.presenters.CardActivityListPresenter$Factory$Impl;
import com.squareup.cash.card.spendinginsights.presenters.RecurringPaymentInfoSheetPresenter$Factory$Impl;
import com.squareup.cash.card.spendinginsights.presenters.SpendingInsightDetailPresenter$Factory$Impl;
import com.squareup.cash.card.spendinginsights.presenters.SpendingInsightsHomePresenter$Factory$Impl;
import com.squareup.cash.card.spendinginsights.screens.CardActivityListScreen;
import com.squareup.cash.card.spendinginsights.screens.RecurringPaymentInfoScreen;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightDetailScreen;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightsHomeScreen;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightsScreen;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.cashapplite.presenters.LiteActivityPresenter;
import com.squareup.cash.cashapplite.presenters.LiteActivityPresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.LiteAddMoneyPresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.LiteBalanceHomePresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.LiteCashInPresenter;
import com.squareup.cash.cashapplite.presenters.LiteCashInPresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.LiteCashOutPresenter$Factory$Impl;
import com.squareup.cash.cashapplite.screens.LiteActivityScreen;
import com.squareup.cash.cashapplite.screens.LiteAddMoneyScreen;
import com.squareup.cash.cashapplite.screens.LiteBalanceHomeScreen;
import com.squareup.cash.cashapplite.screens.LiteCashInScreen;
import com.squareup.cash.cashapplite.screens.LiteCashOutScreen;
import com.squareup.cash.checks.CaptureCheckFacePresenter$Factory$Impl;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.checks.CheckDepositAmountPresenter$Factory$Impl;
import com.squareup.cash.checks.CheckDepositsPresenterFactory;
import com.squareup.cash.checks.ConfirmBackOfCheckPresenter$Factory$Impl;
import com.squareup.cash.checks.ConfirmFrontOfCheckPresenter$Factory$Impl;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$Factory$Impl;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.checks.VerifyCheckDialogPresenter$Factory$Impl;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.address.RealCryptoInvoiceParser;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.datetimeformatter.real.RealDateTimeFormatterFactory;
import com.squareup.cash.datetimeformatter.real.RealTodayDateTimeFormatter;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$NativeEnrichedReceipts;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.google.pay.GooglePayActivationPresenter$Factory$Impl;
import com.squareup.cash.google.pay.GooglePayCompleteProvisioningPresenter$Factory$Impl;
import com.squareup.cash.google.pay.GooglePayPresenter;
import com.squareup.cash.google.pay.GooglePayPresenter$Factory$Impl;
import com.squareup.cash.google.pay.GooglePayProvisioningExitPresenter$Factory$Impl;
import com.squareup.cash.google.pay.GooglePayProvisioningGateway;
import com.squareup.cash.google.pay.GooglePayService;
import com.squareup.cash.google.pay.RealGooglePayer;
import com.squareup.cash.history.analytics.LoadTimeClock$Factory$Impl;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.nfc.backend.real.RealNfcPaymentsManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.p2pblocking.presenters.AllowListController$Factory$Impl;
import com.squareup.cash.p2pblocking.presenters.BlockListController$Factory$Impl;
import com.squareup.cash.p2pblocking.presenters.P2PListPresenter$Factory$Impl;
import com.squareup.cash.p2pblocking.presenters.SelectAllowlistBlockerPresenter;
import com.squareup.cash.p2pblocking.presenters.SelectAllowlistBlockerPresenter$Factory$Impl;
import com.squareup.cash.p2pblocking.presenters.SelectAllowlistCustomersPresenter;
import com.squareup.cash.p2pblocking.presenters.SelectAllowlistCustomersPresenter$Factory$Impl;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter$Factory$Impl;
import com.squareup.cash.p2pblocking.screens.P2PAllowlistScreen;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.cash.p2pblocking.screens.SelectCustomerScreen;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.PermissionChecker;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckBlockerScreen;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckPresenter$Factory$Impl;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$Factory$Impl;
import com.squareup.cash.phoneplans.PhonePlansHomeScreen;
import com.squareup.cash.phoneplans.PhonePlansNewLineLoadingBlockerScreen;
import com.squareup.cash.phoneplans.PhonePlansNewLineLoadingPresenter;
import com.squareup.cash.phoneplans.PhonePlansNewLineLoadingPresenter$Factory$Impl;
import com.squareup.cash.phoneplans.WirelessProviderListBlockerScreen;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter;
import com.squareup.cash.phoneplans.WirelessProviderListPresenter$Factory$Impl;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerAnalytics;
import com.squareup.cash.profile.devicemanager.backend.RealDeviceManagerRepo;
import com.squareup.cash.profile.devicemanager.presenters.ConfirmRemoveDevicesPresenter$Factory$Impl;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerDeviceDetailsPresenter$Factory$Impl;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerListPresenter$Factory$Impl;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerRemovedSuccessPresenter$Factory$Impl;
import com.squareup.cash.profile.devicemanager.presenters.DeviceRemovalFailedPresenter$Factory$Impl;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerConfirmRemoveDevicesScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceDetailsScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalFailedScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerDeviceRemovalSuccessScreen;
import com.squareup.cash.profile.devicemanager.screens.DeviceManagerListScreen;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.qrcodes.QrShortcutInstaller;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$Factory$Impl;
import com.squareup.cash.qrcodes.presenters.CashQrShortcutsOnboardingPresenter$Factory$Impl;
import com.squareup.cash.qrcodes.presenters.CashtagQrScanPresenter$Factory$Impl;
import com.squareup.cash.qrcodes.presenters.QrCodeProfilePresenter$Factory$Impl;
import com.squareup.cash.qrcodes.presenters.RealCashAppUrlParser;
import com.squareup.cash.qrcodes.screens.CashQrCodeScanner;
import com.squareup.cash.qrcodes.screens.CashQrShortcutsOnboardingSheet;
import com.squareup.cash.qrcodes.screens.CashtagQrScanScreen;
import com.squareup.cash.qrcodes.screens.QrCodeScreen;
import com.squareup.cash.qrcodes.screens.TeenQrCodeScreen;
import com.squareup.cash.reactions.real.RealSharedReactionState;
import com.squareup.cash.recipients.backend.real.RealRecipientFinder;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.TransferInPresenter$MetroFactory;
import com.squareup.cash.session.backend.RealUrlAuthenticator;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.tax.backend.real.RealTaxEntryTileUserDataProvider;
import com.squareup.cash.tax.backend.real.RealTaxesDocumentsTaxReturnsDataProvider;
import com.squareup.cash.tax.presenters.TaxAuthorizationPresenter;
import com.squareup.cash.tax.primitives.TaxDialogDataModel;
import com.squareup.cash.tax.screens.TaxAuthorizationScreen;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import com.squareup.cash.tax.screens.TaxReturnsScreen;
import com.squareup.cash.tax.screens.TaxTooltipScreen;
import com.squareup.cash.tax.screens.TaxWebBridgeDialog;
import com.squareup.cash.threedsdataonly.presenters.ThreeDsPresenter;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter$Factory$Impl;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.kotterknife.Lazy;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.cashsubscriptions.api.v1_0.CashSubscriptionsAppService;
import com.squareup.protos.cash.spendinginsights.appapi.SpendingInsightsAppService;
import com.squareup.protos.cash.tax.TaxClientService;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.franklin.app.AppService;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class TaxPresenterFactory implements PresenterFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object taxAuthorizationPresenter;
    public final Object taxReturnsPresenter;
    public final Object taxTooltipPresenter;
    public final Object taxWebAppPresenterFactory;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final InstanceFactory taxAuthorizationPresenter;
        public final InstanceFactory taxMenuSheetPresenter;
        public final InstanceFactory taxReturnsPresenter;
        public final InstanceFactory taxTooltipPresenter;
        public final InstanceFactory taxWebAppPresenterFactory;
        public final InstanceFactory taxWebBridgeDialogPresenter;

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, int i) {
            this.$r8$classId = i;
            this.taxWebAppPresenterFactory = instanceFactory;
            this.taxAuthorizationPresenter = instanceFactory2;
            this.taxMenuSheetPresenter = instanceFactory3;
            this.taxWebBridgeDialogPresenter = instanceFactory4;
            this.taxTooltipPresenter = instanceFactory5;
            this.taxReturnsPresenter = instanceFactory6;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            InstanceFactory instanceFactory = this.taxReturnsPresenter;
            InstanceFactory instanceFactory2 = this.taxTooltipPresenter;
            InstanceFactory instanceFactory3 = this.taxWebBridgeDialogPresenter;
            InstanceFactory instanceFactory4 = this.taxMenuSheetPresenter;
            InstanceFactory instanceFactory5 = this.taxAuthorizationPresenter;
            InstanceFactory instanceFactory6 = this.taxWebAppPresenterFactory;
            switch (i) {
                case 0:
                    TaxWebAppPresenter$Factory$Impl taxWebAppPresenter$Factory$Impl = (TaxWebAppPresenter$Factory$Impl) instanceFactory6.value;
                    TaxAuthorizationPresenter$Factory$Impl taxAuthorizationPresenter$Factory$Impl = (TaxAuthorizationPresenter$Factory$Impl) instanceFactory5.value;
                    TaxMenuSheetPresenter$Factory$Impl taxMenuSheetPresenter$Factory$Impl = (TaxMenuSheetPresenter$Factory$Impl) instanceFactory4.value;
                    TaxWebBridgeDialogPresenter$Factory$Impl taxWebBridgeDialogPresenter$Factory$Impl = (TaxWebBridgeDialogPresenter$Factory$Impl) instanceFactory3.value;
                    TaxTooltipPresenter$Factory$Impl taxTooltipPresenter$Factory$Impl = (TaxTooltipPresenter$Factory$Impl) instanceFactory2.value;
                    TaxReturnsPresenter$Factory$Impl taxReturnsPresenter$Factory$Impl = (TaxReturnsPresenter$Factory$Impl) instanceFactory.value;
                    taxWebAppPresenter$Factory$Impl.getClass();
                    taxAuthorizationPresenter$Factory$Impl.getClass();
                    taxMenuSheetPresenter$Factory$Impl.getClass();
                    taxWebBridgeDialogPresenter$Factory$Impl.getClass();
                    taxTooltipPresenter$Factory$Impl.getClass();
                    taxReturnsPresenter$Factory$Impl.getClass();
                    return new TaxPresenterFactory(taxWebAppPresenter$Factory$Impl, taxAuthorizationPresenter$Factory$Impl, taxMenuSheetPresenter$Factory$Impl, taxWebBridgeDialogPresenter$Factory$Impl, taxTooltipPresenter$Factory$Impl, taxReturnsPresenter$Factory$Impl);
                default:
                    ConfirmBackOfCheckPresenter$Factory$Impl confirmBackOfCheckPresenter$Factory$Impl = (ConfirmBackOfCheckPresenter$Factory$Impl) instanceFactory6.value;
                    ConfirmFrontOfCheckPresenter$Factory$Impl confirmFrontOfCheckPresenter$Factory$Impl = (ConfirmFrontOfCheckPresenter$Factory$Impl) instanceFactory5.value;
                    VerifyCheckDepositPresenter$Factory$Impl verifyCheckDepositPresenter$Factory$Impl = (VerifyCheckDepositPresenter$Factory$Impl) instanceFactory4.value;
                    VerifyCheckDialogPresenter$Factory$Impl verifyCheckDialogPresenter$Factory$Impl = (VerifyCheckDialogPresenter$Factory$Impl) instanceFactory3.value;
                    CheckDepositAmountPresenter$Factory$Impl checkDepositAmountPresenter$Factory$Impl = (CheckDepositAmountPresenter$Factory$Impl) instanceFactory2.value;
                    CaptureCheckFacePresenter$Factory$Impl captureCheckFacePresenter$Factory$Impl = (CaptureCheckFacePresenter$Factory$Impl) instanceFactory.value;
                    confirmBackOfCheckPresenter$Factory$Impl.getClass();
                    confirmFrontOfCheckPresenter$Factory$Impl.getClass();
                    verifyCheckDepositPresenter$Factory$Impl.getClass();
                    verifyCheckDialogPresenter$Factory$Impl.getClass();
                    checkDepositAmountPresenter$Factory$Impl.getClass();
                    captureCheckFacePresenter$Factory$Impl.getClass();
                    return new CheckDepositsPresenterFactory(confirmBackOfCheckPresenter$Factory$Impl, confirmFrontOfCheckPresenter$Factory$Impl, verifyCheckDepositPresenter$Factory$Impl, verifyCheckDialogPresenter$Factory$Impl, checkDepositAmountPresenter$Factory$Impl, captureCheckFacePresenter$Factory$Impl);
            }
        }
    }

    public TaxPresenterFactory(DeviceManagerListPresenter$Factory$Impl deviceManagerListPresenter$Factory$Impl, DeviceManagerDeviceDetailsPresenter$Factory$Impl deviceManagerDeviceDetailsPresenter$Factory$Impl, DeviceManagerRemovedSuccessPresenter$Factory$Impl deviceManagerRemovedSuccessPresenter$Factory$Impl, DeviceRemovalFailedPresenter$Factory$Impl deviceRemovalFailedPresenter$Factory$Impl, ConfirmRemoveDevicesPresenter$Factory$Impl confirmRemoveDevicesPresenter$Factory$Impl) {
        this.$r8$classId = 7;
        this.taxWebAppPresenterFactory = deviceManagerListPresenter$Factory$Impl;
        this.taxAuthorizationPresenter = deviceManagerDeviceDetailsPresenter$Factory$Impl;
        this.taxTooltipPresenter = deviceManagerRemovedSuccessPresenter$Factory$Impl;
        this.taxReturnsPresenter = deviceRemovalFailedPresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        int i = this.$r8$classId;
        Object obj = this.taxReturnsPresenter;
        Object obj2 = this.taxAuthorizationPresenter;
        Object obj3 = this.taxWebAppPresenterFactory;
        Object obj4 = this.taxTooltipPresenter;
        switch (i) {
            case 0:
                screen.getClass();
                if (screen instanceof BlockersScreens.TaxWebViewScreen) {
                    ImageLoader$Builder imageLoader$Builder = ((TaxWebAppPresenter$Factory$Impl) obj3).delegateFactory;
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) ((Provider) imageLoader$Builder.application).invoke();
                    IntentLauncher intentLauncher = (IntentLauncher) ((Provider) imageLoader$Builder.defaults).invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) ((Provider) imageLoader$Builder.mainCoroutineContextLazy).invoke();
                    RealDeepLinkParser realDeepLinkParser = (RealDeepLinkParser) ((DoubleCheck) imageLoader$Builder.memoryCacheLazy).getValue();
                    RealTaxDesktopTooltipPreference realTaxDesktopTooltipPreference = (RealTaxDesktopTooltipPreference) ((Provider) imageLoader$Builder.diskCacheLazy).invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) imageLoader$Builder.eventListenerFactory).getValue();
                    RealUrlAuthenticator realUrlAuthenticator = (RealUrlAuthenticator) ((DoubleCheck) imageLoader$Builder.componentRegistry).getValue();
                    RealTaxEntryTileUserDataProvider realTaxEntryTileUserDataProvider = (RealTaxEntryTileUserDataProvider) ((DoubleCheck) imageLoader$Builder.extras).getValue();
                    blockersDataNavigator.getClass();
                    intentLauncher.getClass();
                    realRouter$Factory$Impl.getClass();
                    realDeepLinkParser.getClass();
                    realTaxDesktopTooltipPreference.getClass();
                    featureFlagManager.getClass();
                    realUrlAuthenticator.getClass();
                    realTaxEntryTileUserDataProvider.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxWebAppPresenter(blockersDataNavigator, intentLauncher, realRouter$Factory$Impl, realDeepLinkParser, realTaxDesktopTooltipPreference, featureFlagManager, realUrlAuthenticator, realTaxEntryTileUserDataProvider, (BlockersScreens.TaxWebViewScreen) screen, screenNavigator));
                }
                if (screen instanceof TaxAuthorizationScreen) {
                    TaxAuthorizationPresenter.MetroFactory metroFactory = ((TaxAuthorizationPresenter$Factory$Impl) obj2).delegateFactory;
                    TaxClientService taxClientService = (TaxClientService) metroFactory.taxService.getValue();
                    FlowStarter flowStarter = (FlowStarter) metroFactory.flowStarter.getValue();
                    AppService appService = (AppService) metroFactory.appService.getValue();
                    AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
                    BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) metroFactory.blockersDataNavigator.invoke();
                    TaxEnvironment taxEnvironment = TaxEnvironment.PROD;
                    taxClientService.getClass();
                    flowStarter.getClass();
                    appService.getClass();
                    androidStringManager.getClass();
                    blockersDataNavigator2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxAuthorizationPresenter(taxClientService, flowStarter, appService, androidStringManager, blockersDataNavigator2, taxEnvironment, (TaxAuthorizationScreen) screen, screenNavigator));
                }
                if (screen instanceof TaxMenuSheet) {
                    List list = ((TaxMenuSheet) screen).menuItems;
                    list.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ErrorPresenter(screenNavigator, list));
                }
                if (screen instanceof TaxWebBridgeDialog) {
                    TaxDialogDataModel taxDialogDataModel = ((TaxWebBridgeDialog) screen).taxDialog;
                    taxDialogDataModel.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ErrorPresenter(screenNavigator, taxDialogDataModel));
                }
                if (screen instanceof TaxTooltipScreen) {
                    TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = ((TaxTooltipPresenter$Factory$Impl) obj4).delegateFactory;
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
                    RealTaxDesktopTooltipPreference realTaxDesktopTooltipPreference2 = (RealTaxDesktopTooltipPreference) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
                    androidStringManager2.getClass();
                    realTaxDesktopTooltipPreference2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(androidStringManager2, realTaxDesktopTooltipPreference2, (TaxTooltipScreen) screen, screenNavigator));
                }
                if (!(screen instanceof TaxReturnsScreen)) {
                    return null;
                }
                ProfileCropView.MetroFactory metroFactory2 = ((TaxReturnsPresenter$Factory$Impl) obj).delegateFactory;
                RealTaxesDocumentsTaxReturnsDataProvider realTaxesDocumentsTaxReturnsDataProvider = (RealTaxesDocumentsTaxReturnsDataProvider) metroFactory2.imageLoader.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) metroFactory2.cropResultManager.invoke();
                realTaxesDocumentsTaxReturnsDataProvider.getClass();
                realRouter$Factory$Impl2.getClass();
                return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(realTaxesDocumentsTaxReturnsDataProvider, realRouter$Factory$Impl2, (TaxReturnsScreen) screen, screenNavigator));
            case 1:
                screen.getClass();
                if (!(screen instanceof ActivityScreen)) {
                    if (screen instanceof BalanceFeedScreen) {
                        BalanceFeedPresenter$MetroFactory balanceFeedPresenter$MetroFactory = ((BalanceFeedPresenter$Factory$Impl) obj2).delegateFactory;
                        RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) balanceFeedPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
                        RealActivityTokenFactory realActivityTokenFactory = (RealActivityTokenFactory) balanceFeedPresenter$MetroFactory.activityTokenFactory.invoke();
                        AndroidStringManager androidStringManager3 = (AndroidStringManager) balanceFeedPresenter$MetroFactory.stringManager.lambda.invoke();
                        RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) balanceFeedPresenter$MetroFactory.activitiesCacheManager.getValue();
                        LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) balanceFeedPresenter$MetroFactory.moneyFormatterFactory.invoke();
                        RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) balanceFeedPresenter$MetroFactory.balanceSnapshotManager.invoke();
                        realActivityEmbeddedPresenter$Factory$Impl.getClass();
                        realActivityTokenFactory.getClass();
                        androidStringManager3.getClass();
                        realActivitiesCacheManager.getClass();
                        factory.getClass();
                        realBalanceSnapshotManager.getClass();
                        return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter((BalanceFeedScreen) screen, screenNavigator, realActivityEmbeddedPresenter$Factory$Impl, realActivityTokenFactory, androidStringManager3, realActivitiesCacheManager, factory, realBalanceSnapshotManager));
                    }
                    if (!(screen instanceof HistoryScreens.PaymentReceipt)) {
                        return null;
                    }
                    if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj)).peekCurrentValue(LaunchDarklyFeatureFlags$NativeEnrichedReceipts.INSTANCE)).enabled()) {
                        return null;
                    }
                    RememberEventDispatcher rememberEventDispatcher = ((ReceiptPresenter$Factory$Impl) obj4).delegateFactory;
                    RealSingleActivityManager$Factory$Impl realSingleActivityManager$Factory$Impl = (RealSingleActivityManager$Factory$Impl) ((Provider) rememberEventDispatcher.abandoning).invoke();
                    RealActivitiesCacheManager realActivitiesCacheManager2 = (RealActivitiesCacheManager) ((DoubleCheck) rememberEventDispatcher.traceContext).getValue();
                    RealActivityTokenFactory realActivityTokenFactory2 = (RealActivityTokenFactory) ((Provider) rememberEventDispatcher.remembering).invoke();
                    PaymentHistoryAvatarFactory paymentHistoryAvatarFactory = (PaymentHistoryAvatarFactory) ((Provider) rememberEventDispatcher.currentRememberingList).invoke();
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) ((LambdaProvider) rememberEventDispatcher.leaving).lambda.invoke();
                    ActivityItemEventHandler.Factory factory2 = (ActivityItemEventHandler.Factory) ((Provider) rememberEventDispatcher.sideEffects).invoke();
                    IntentLauncher intentLauncher2 = (IntentLauncher) ((Provider) rememberEventDispatcher.rememberSet).invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl3 = (RealRouter$Factory$Impl) ((Provider) rememberEventDispatcher.releasing).invoke();
                    RealSharedReactionState realSharedReactionState = (RealSharedReactionState) ((DoubleCheck) rememberEventDispatcher.ignoreLeavingSet).getValue();
                    ActivityAnalyticsService activityAnalyticsService = (ActivityAnalyticsService) ((DoubleCheck) rememberEventDispatcher.pausedPlaceholders).getValue();
                    ReceiptGetRequestHandler$Factory$Impl receiptGetRequestHandler$Factory$Impl = (ReceiptGetRequestHandler$Factory$Impl) ((InstanceFactory) rememberEventDispatcher.nestedRemembersLists).value;
                    realSingleActivityManager$Factory$Impl.getClass();
                    realActivitiesCacheManager2.getClass();
                    realActivityTokenFactory2.getClass();
                    paymentHistoryAvatarFactory.getClass();
                    androidStringManager4.getClass();
                    factory2.getClass();
                    intentLauncher2.getClass();
                    realRouter$Factory$Impl3.getClass();
                    realSharedReactionState.getClass();
                    activityAnalyticsService.getClass();
                    receiptGetRequestHandler$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ReceiptPresenter((HistoryScreens.PaymentReceipt) screen, screenNavigator, realSingleActivityManager$Factory$Impl, realActivitiesCacheManager2, realActivityTokenFactory2, paymentHistoryAvatarFactory, androidStringManager4, factory2, intentLauncher2, realRouter$Factory$Impl3, realSharedReactionState, activityAnalyticsService, receiptGetRequestHandler$Factory$Impl));
                }
                ActivityTabPresenter$Factory$Impl activityTabPresenter$Factory$Impl = (ActivityTabPresenter$Factory$Impl) obj3;
                boolean z = Build.VERSION.SDK_INT > 32;
                ActivityTabPresenter.MetroFactory metroFactory3 = activityTabPresenter$Factory$Impl.delegateFactory;
                TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl = (TabToolbarPresenter$Factory$Impl) metroFactory3.tabToolbarPresenterFactory.invoke();
                ActivitiesManager.Factory factory3 = (ActivitiesManager.Factory) metroFactory3.activitiesManagerFactory.invoke();
                ActivityTabSearchCache activityTabSearchCache = (ActivityTabSearchCache) metroFactory3.activitiesSearchCache.invoke();
                ActivityClientService activityClientService = (ActivityClientService) metroFactory3.appService.invoke();
                RealContactHeaderPresenter$Factory$Impl realContactHeaderPresenter$Factory$Impl = (RealContactHeaderPresenter$Factory$Impl) metroFactory3.contactHeaderPresenterFactory.invoke();
                AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) metroFactory3.permissionManager.invoke();
                RealActivityScreenInitialArgumentsSupplier realActivityScreenInitialArgumentsSupplier = (RealActivityScreenInitialArgumentsSupplier) metroFactory3.initialArgumentsSupplier.invoke();
                ActivityFeedProducer activityFeedProducer = (ActivityFeedProducer) metroFactory3.activityFeedProducer.invoke();
                AndroidStringManager androidStringManager5 = (AndroidStringManager) metroFactory3.strings.invoke();
                ActivityItemPresenter.Factory factory4 = (ActivityItemPresenter.Factory) metroFactory3.activityItemPresenterFactory.invoke();
                RealActivityUpdatesNotifier realActivityUpdatesNotifier = (RealActivityUpdatesNotifier) metroFactory3.activityUpdatesNotifierRelay.invoke();
                OfflineActivitiesManager offlineActivitiesManager = (OfflineActivitiesManager) metroFactory3.offlineActivitiesManager.invoke();
                OfflineManager offlineManager = (OfflineManager) metroFactory3.offlineManager.invoke();
                AppConfigManager appConfigManager = (AppConfigManager) metroFactory3.appConfigManager.invoke();
                FlowStarter flowStarter2 = (FlowStarter) metroFactory3.flowStarter.invoke();
                Analytics analytics = (Analytics) metroFactory3.analytics.invoke();
                RealInputFieldTextSaver realInputFieldTextSaver = (RealInputFieldTextSaver) metroFactory3.inputFieldTextSaver.invoke();
                ProfileInlineAppMessagePresenter$Factory$Impl profileInlineAppMessagePresenter$Factory$Impl = (ProfileInlineAppMessagePresenter$Factory$Impl) metroFactory3.inlineAppMessagePresenterFactory.value;
                ActivityInlineAppMessageV2Presenter$Factory$Impl activityInlineAppMessageV2Presenter$Factory$Impl = (ActivityInlineAppMessageV2Presenter$Factory$Impl) metroFactory3.inlineAppMessageV2PresenterFactory.value;
                ActivityCardAppMessagePresenter$Factory$Impl activityCardAppMessagePresenter$Factory$Impl = (ActivityCardAppMessagePresenter$Factory$Impl) metroFactory3.cardAppMessagePresenterFactory.value;
                Flow flow = (Flow) metroFactory3.pendingPopupAppMessages.invoke();
                ActivityToken activityToken = (ActivityToken) metroFactory3.activityToken.invoke();
                ActivitiesManager activitiesManager = (ActivitiesManager) metroFactory3.activitiesManager.invoke();
                KeyValue keyValue = (KeyValue) metroFactory3.activityViewed.invoke();
                KeyValue keyValue2 = (KeyValue) metroFactory3.inlineMessageV2TooltipViewed.invoke();
                ActivityAnalyticsService activityAnalyticsService2 = (ActivityAnalyticsService) metroFactory3.activityAnalyticsService.invoke();
                FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) metroFactory3.featureFlagManager.invoke();
                n nVar = (n) ((RealFileDownloader.MetroFactory) metroFactory3.promoterActivityMessageProvider).invoke();
                LoadTimeClock$Factory$Impl loadTimeClock$Factory$Impl = (LoadTimeClock$Factory$Impl) ((InstanceFactory) metroFactory3.loadTimeClockFactory).value;
                DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl = (DefaultActivityItemEventHandler$Factory$Impl) metroFactory3.defaultActivityItemEventHandlerFactory.invoke();
                zzr zzrVar = (zzr) ((RealLiteCashInRepo$MetroFactory) metroFactory3.activityTabItemEventDecorator).invoke();
                RealAlertBannerPresenter$Factory$Impl realAlertBannerPresenter$Factory$Impl = (RealAlertBannerPresenter$Factory$Impl) metroFactory3.alertBannerPresenterFactory.invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl4 = (RealRouter$Factory$Impl) metroFactory3.routerFactory.invoke();
                MoneybotFlagsHelper moneybotFlagsHelper = (MoneybotFlagsHelper) metroFactory3.moneybotFlagsHelper.invoke();
                RealDateTimeFormatterFactory realDateTimeFormatterFactory = (RealDateTimeFormatterFactory) metroFactory3.dateTimeFormatterFactory.invoke();
                tabToolbarPresenter$Factory$Impl.getClass();
                factory3.getClass();
                activityTabSearchCache.getClass();
                activityClientService.getClass();
                realContactHeaderPresenter$Factory$Impl.getClass();
                androidPermissionManager.getClass();
                realActivityScreenInitialArgumentsSupplier.getClass();
                activityFeedProducer.getClass();
                androidStringManager5.getClass();
                factory4.getClass();
                realActivityUpdatesNotifier.getClass();
                offlineActivitiesManager.getClass();
                offlineManager.getClass();
                appConfigManager.getClass();
                flowStarter2.getClass();
                analytics.getClass();
                realInputFieldTextSaver.getClass();
                profileInlineAppMessagePresenter$Factory$Impl.getClass();
                activityInlineAppMessageV2Presenter$Factory$Impl.getClass();
                activityCardAppMessagePresenter$Factory$Impl.getClass();
                flow.getClass();
                activityToken.getClass();
                activitiesManager.getClass();
                keyValue.getClass();
                keyValue2.getClass();
                activityAnalyticsService2.getClass();
                featureFlagManager2.getClass();
                loadTimeClock$Factory$Impl.getClass();
                defaultActivityItemEventHandler$Factory$Impl.getClass();
                realAlertBannerPresenter$Factory$Impl.getClass();
                realRouter$Factory$Impl4.getClass();
                moneybotFlagsHelper.getClass();
                realDateTimeFormatterFactory.getClass();
                return MoleculePresenterKt.asPresenter$default(new ActivityTabPresenter(screenNavigator, z, tabToolbarPresenter$Factory$Impl, factory3, activityTabSearchCache, activityClientService, realContactHeaderPresenter$Factory$Impl, androidPermissionManager, realActivityScreenInitialArgumentsSupplier, activityFeedProducer, androidStringManager5, factory4, realActivityUpdatesNotifier, offlineActivitiesManager, offlineManager, appConfigManager, flowStarter2, analytics, realInputFieldTextSaver, profileInlineAppMessagePresenter$Factory$Impl, activityInlineAppMessageV2Presenter$Factory$Impl, activityCardAppMessagePresenter$Factory$Impl, flow, activityToken, activitiesManager, keyValue, keyValue2, activityAnalyticsService2, featureFlagManager2, nVar, loadTimeClock$Factory$Impl, defaultActivityItemEventHandler$Factory$Impl, zzrVar, realAlertBannerPresenter$Factory$Impl, realRouter$Factory$Impl4, moneybotFlagsHelper, realDateTimeFormatterFactory));
            case 2:
                screen.getClass();
                SpendingInsightsScreen spendingInsightsScreen = screen instanceof SpendingInsightsScreen ? (SpendingInsightsScreen) screen : null;
                if (spendingInsightsScreen instanceof SpendingInsightsHomeScreen) {
                    ThreeDsPresenter.MetroFactory metroFactory4 = ((SpendingInsightsHomePresenter$Factory$Impl) obj3).delegateFactory;
                    SyncValueReader syncValueReader = (SyncValueReader) metroFactory4.threeDsService.getValue();
                    AndroidStringManager androidStringManager6 = (AndroidStringManager) metroFactory4.stringManager.lambda.invoke();
                    SpendingInsightsAppService spendingInsightsAppService = (SpendingInsightsAppService) metroFactory4.threeDsAuthenticationManager.getValue();
                    ActivityClientService activityClientService2 = (ActivityClientService) metroFactory4.appService.getValue();
                    RealActivitiesCacheManager realActivitiesCacheManager3 = (RealActivitiesCacheManager) metroFactory4.featureFlagManager.getValue();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl2 = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory4.blockersDataNavigator.invoke();
                    SessionManager sessionManager = (SessionManager) metroFactory4.isDebug.lambda.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) metroFactory4.ioDispatcher.lambda.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) metroFactory4.spanTrackingService.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl5 = (RealRouter$Factory$Impl) metroFactory4.routerFactory.invoke();
                    Analytics analytics2 = (Analytics) metroFactory4.analytics.getValue();
                    syncValueReader.getClass();
                    androidStringManager6.getClass();
                    spendingInsightsAppService.getClass();
                    activityClientService2.getClass();
                    realActivitiesCacheManager3.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl2.getClass();
                    sessionManager.getClass();
                    errorReporter.getClass();
                    sampleStrategy.getClass();
                    realRouter$Factory$Impl5.getClass();
                    analytics2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardLockPresenter(screenNavigator, syncValueReader, androidStringManager6, spendingInsightsAppService, activityClientService2, realActivitiesCacheManager3, realActivityEmbeddedPresenter$Factory$Impl2, sessionManager, errorReporter, sampleStrategy, realRouter$Factory$Impl5, analytics2));
                }
                if (spendingInsightsScreen instanceof CardActivityListScreen) {
                    BitcoinMapPresenter.MetroFactory metroFactory5 = ((CardActivityListPresenter$Factory$Impl) obj2).delegateFactory;
                    SyncValueReader syncValueReader2 = (SyncValueReader) metroFactory5.cashDatabase.getValue();
                    ActivityClientService activityClientService3 = (ActivityClientService) metroFactory5.cryptoService.getValue();
                    RealActivitiesCacheManager realActivitiesCacheManager4 = (RealActivitiesCacheManager) metroFactory5.locationSearchClient.getValue();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl3 = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory5.cashMapPresenterFactory.invoke();
                    SessionManager sessionManager2 = (SessionManager) metroFactory5.clock.lambda.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) metroFactory5.stringManager.lambda.invoke();
                    SampleStrategy sampleStrategy2 = (SampleStrategy) metroFactory5.bitcoinMapEligibilityManager.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) metroFactory5.analytics.getValue();
                    syncValueReader2.getClass();
                    activityClientService3.getClass();
                    realActivitiesCacheManager4.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl3.getClass();
                    sessionManager2.getClass();
                    errorReporter2.getClass();
                    sampleStrategy2.getClass();
                    featureFlagManager3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new SelectCustomerPresenter((CardActivityListScreen) spendingInsightsScreen, screenNavigator, syncValueReader2, activityClientService3, realActivitiesCacheManager4, realActivityEmbeddedPresenter$Factory$Impl3, sessionManager2, errorReporter2, sampleStrategy2, featureFlagManager3));
                }
                if (spendingInsightsScreen instanceof SpendingInsightDetailScreen) {
                    SpendingInsightDetailScreen spendingInsightDetailScreen = (SpendingInsightDetailScreen) spendingInsightsScreen;
                    BlockerImageUploader$MetroFactory blockerImageUploader$MetroFactory = ((SpendingInsightDetailPresenter$Factory$Impl) obj4).delegateFactory;
                    SpendingInsightsAppService spendingInsightsAppService2 = (SpendingInsightsAppService) blockerImageUploader$MetroFactory.analytics.getValue();
                    AndroidStringManager androidStringManager7 = (AndroidStringManager) blockerImageUploader$MetroFactory.stringManager.lambda.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl6 = (RealRouter$Factory$Impl) blockerImageUploader$MetroFactory.blockersNavigator.invoke();
                    ErrorReporter errorReporter3 = (ErrorReporter) blockerImageUploader$MetroFactory.ioDispatcher.lambda.invoke();
                    SampleStrategy sampleStrategy3 = (SampleStrategy) blockerImageUploader$MetroFactory.multiBlockerFacilitator.invoke();
                    spendingInsightsAppService2.getClass();
                    androidStringManager7.getClass();
                    realRouter$Factory$Impl6.getClass();
                    errorReporter3.getClass();
                    sampleStrategy3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(screenNavigator, spendingInsightDetailScreen, spendingInsightsAppService2, androidStringManager7, realRouter$Factory$Impl6, errorReporter3, sampleStrategy3));
                }
                if (!Intrinsics.areEqual(spendingInsightsScreen, RecurringPaymentInfoScreen.INSTANCE)) {
                    if (spendingInsightsScreen == null) {
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = ((RecurringPaymentInfoSheetPresenter$Factory$Impl) obj).delegateFactory;
                SyncValueReader syncValueReader3 = (SyncValueReader) transferInPresenter$MetroFactory.analytics.getValue();
                ErrorReporter errorReporter4 = (ErrorReporter) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
                SampleStrategy sampleStrategy4 = (SampleStrategy) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
                syncValueReader3.getClass();
                errorReporter4.getClass();
                sampleStrategy4.getClass();
                return MoleculePresenterKt.asPresenter$default(new MusicPresenter(screenNavigator, syncValueReader3, errorReporter4, sampleStrategy4, 15));
            case 3:
                screen.getClass();
                if (screen instanceof LiteAddMoneyScreen) {
                    return MoleculePresenterKt.asPresenter$default(new AddAliasPresenter((LiteAddMoneyScreen) screen, screenNavigator));
                }
                if (screen instanceof LiteCashInScreen) {
                    SimpleActor simpleActor = ((LiteCashInPresenter$Factory$Impl) obj3).delegateFactory;
                    zzr zzrVar2 = (zzr) ((RealLiteCashInRepo$MetroFactory) simpleActor.scope).invoke();
                    RealClipboardManager realClipboardManager = (RealClipboardManager) ((LambdaProvider) simpleActor.consumeMessage).lambda.invoke();
                    FlowStarter flowStarter3 = (FlowStarter) ((DoubleCheck) simpleActor.messageQueue).getValue();
                    BlockersDataNavigator blockersDataNavigator3 = (BlockersDataNavigator) ((Provider) simpleActor.remainingMessages).invoke();
                    realClipboardManager.getClass();
                    flowStarter3.getClass();
                    blockersDataNavigator3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LiteCashInPresenter(zzrVar2, realClipboardManager, flowStarter3, blockersDataNavigator3, (LiteCashInScreen) screen, screenNavigator));
                }
                if (screen instanceof LiteCashOutScreen) {
                    TransferInPresenter$MetroFactory transferInPresenter$MetroFactory2 = ((LiteCashOutPresenter$Factory$Impl) obj2).delegateFactory;
                    FlowStarter flowStarter4 = (FlowStarter) transferInPresenter$MetroFactory2.analytics.getValue();
                    AndroidStringManager androidStringManager8 = (AndroidStringManager) transferInPresenter$MetroFactory2.stringManager.lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory5 = (LocalizedMoneyFormatter.Factory) transferInPresenter$MetroFactory2.moneyFormatterFactory.invoke();
                    flowStarter4.getClass();
                    androidStringManager8.getClass();
                    factory5.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(flowStarter4, androidStringManager8, factory5, (LiteCashOutScreen) screen, screenNavigator));
                }
                if (screen instanceof LiteActivityScreen) {
                    LiteActivityPresenter.MetroFactory metroFactory6 = ((LiteActivityPresenter$Factory$Impl) obj4).delegateFactory;
                    SessionManager sessionManager3 = (SessionManager) metroFactory6.sessionManager.lambda.invoke();
                    AndroidStringManager androidStringManager9 = (AndroidStringManager) metroFactory6.stringManager.lambda.invoke();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl4 = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory6.activityEmbeddedPresenterFactory.invoke();
                    sessionManager3.getClass();
                    androidStringManager9.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LiteActivityPresenter(sessionManager3, androidStringManager9, realActivityEmbeddedPresenter$Factory$Impl4, (LiteActivityScreen) screen, screenNavigator));
                }
                if (!(screen instanceof LiteBalanceHomeScreen)) {
                    return null;
                }
                SsnPresenter.MetroFactory metroFactory7 = ((LiteBalanceHomePresenter$Factory$Impl) obj).delegateFactory;
                BalanceAppletTileRepository balanceAppletTileRepository = (BalanceAppletTileRepository) metroFactory7.idvPresenterFactory.invoke();
                LocalizedMoneyFormatter.Factory factory6 = (LocalizedMoneyFormatter.Factory) metroFactory7.blockersHelperFactory.invoke();
                AndroidStringManager androidStringManager10 = (AndroidStringManager) metroFactory7.stringManager.lambda.invoke();
                balanceAppletTileRepository.getClass();
                factory6.getClass();
                androidStringManager10.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(balanceAppletTileRepository, factory6, androidStringManager10, (LiteBalanceHomeScreen) screen, screenNavigator));
            case 4:
                screen.getClass();
                if (screen instanceof BlockersScreens.ProvisionGooglePayScreen) {
                    Reward$Adapter reward$Adapter = ((GooglePayPresenter$Factory$Impl) obj3).delegateFactory;
                    AndroidStringManager androidStringManager11 = (AndroidStringManager) ((LambdaProvider) reward$Adapter.avatarsAdapter).lambda.invoke();
                    RealGooglePayer realGooglePayer = (RealGooglePayer) ((Provider) reward$Adapter.reward_selection_stateAdapter).invoke();
                    BlockerFlowListener blockerFlowListener = (BlockerFlowListener) ((Provider) reward$Adapter.boost_detail_bottom_upsellAdapter).invoke();
                    BlockersDataNavigator blockersDataNavigator4 = (BlockersDataNavigator) ((Provider) reward$Adapter.app_linksAdapter).invoke();
                    FlowStarter flowStarter5 = (FlowStarter) ((DoubleCheck) reward$Adapter.program_detail_rowsAdapter).getValue();
                    GooglePayProvisioningGateway googlePayProvisioningGateway = (GooglePayProvisioningGateway) ((RealGlobalConfigManager.MetroFactory) reward$Adapter.boost_detail_rowsAdapter).invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) reward$Adapter.boost_attributesAdapter).lambda.invoke();
                    androidStringManager11.getClass();
                    realGooglePayer.getClass();
                    blockerFlowListener.getClass();
                    blockersDataNavigator4.getClass();
                    flowStarter5.getClass();
                    coroutineContext.getClass();
                    return MoleculePresenterKt.asPresenter$default(new GooglePayPresenter(androidStringManager11, realGooglePayer, blockerFlowListener, blockersDataNavigator4, flowStarter5, googlePayProvisioningGateway, coroutineContext, (BlockersScreens.ProvisionGooglePayScreen) screen, screenNavigator));
                }
                if (screen instanceof BlockersScreens.GooglePayActivationScreen) {
                    SignaturePresenter$MetroFactory signaturePresenter$MetroFactory = ((GooglePayActivationPresenter$Factory$Impl) obj2).delegateFactory;
                    GooglePayService googlePayService = (GooglePayService) signaturePresenter$MetroFactory.analytics.getValue();
                    BlockersDataNavigator blockersDataNavigator5 = (BlockersDataNavigator) signaturePresenter$MetroFactory.blockersNavigator.invoke();
                    Moshi moshi = (Moshi) signaturePresenter$MetroFactory.ioDispatcher.lambda.invoke();
                    IssuedCardManager issuedCardManager = (IssuedCardManager) signaturePresenter$MetroFactory.appService.getValue();
                    BlockerFlowListener blockerFlowListener2 = (BlockerFlowListener) signaturePresenter$MetroFactory.blockersHelperFactory.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) signaturePresenter$MetroFactory.stringManager.lambda.invoke();
                    googlePayService.getClass();
                    blockersDataNavigator5.getClass();
                    moshi.getClass();
                    issuedCardManager.getClass();
                    blockerFlowListener2.getClass();
                    coroutineContext2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(googlePayService, blockersDataNavigator5, moshi, issuedCardManager, blockerFlowListener2, coroutineContext2, (BlockersScreens.GooglePayActivationScreen) screen, screenNavigator));
                }
                if (!(screen instanceof BlockersScreens.GooglePayCompleteProvisioningScreen)) {
                    if (!(screen instanceof BlockersScreens.GooglePayProvisioningExitScreen)) {
                        return null;
                    }
                    Activity activity = (Activity) ((GooglePayProvisioningExitPresenter$Factory$Impl) obj).delegateFactory.activity.value;
                    activity.getClass();
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter(activity, (BlockersScreens.GooglePayProvisioningExitScreen) screen));
                }
                DisclosurePresenter.MetroFactory metroFactory8 = ((GooglePayCompleteProvisioningPresenter$Factory$Impl) obj4).delegateFactory;
                GooglePayService googlePayService2 = (GooglePayService) metroFactory8.analytics.getValue();
                BlockersDataNavigator blockersDataNavigator6 = (BlockersDataNavigator) metroFactory8.blockersNavigator.invoke();
                Analytics analytics3 = (Analytics) metroFactory8.appService.getValue();
                BlockerFlowListener blockerFlowListener3 = (BlockerFlowListener) metroFactory8.launcher.invoke();
                AndroidStringManager androidStringManager12 = (AndroidStringManager) metroFactory8.stringManager.lambda.invoke();
                googlePayService2.getClass();
                blockersDataNavigator6.getClass();
                analytics3.getClass();
                blockerFlowListener3.getClass();
                androidStringManager12.getClass();
                return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(googlePayService2, blockersDataNavigator6, analytics3, blockerFlowListener3, androidStringManager12, (BlockersScreens.GooglePayCompleteProvisioningScreen) screen, screenNavigator));
            case 5:
                screen.getClass();
                if (screen instanceof P2PListScreen) {
                    RememberEventDispatcher rememberEventDispatcher2 = ((P2PListPresenter$Factory$Impl) obj3).delegateFactory;
                    SessionManager sessionManager4 = (SessionManager) ((LambdaProvider) rememberEventDispatcher2.abandoning).lambda.invoke();
                    Analytics analytics4 = (Analytics) ((DoubleCheck) rememberEventDispatcher2.traceContext).getValue();
                    RealCustomerStore realCustomerStore = (RealCustomerStore) ((Provider) rememberEventDispatcher2.remembering).invoke();
                    AndroidStringManager androidStringManager13 = (AndroidStringManager) ((LambdaProvider) rememberEventDispatcher2.currentRememberingList).lambda.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl7 = (RealRouter$Factory$Impl) ((Provider) rememberEventDispatcher2.leaving).invoke();
                    RealFamilyAccountsManager realFamilyAccountsManager = (RealFamilyAccountsManager) ((Provider) rememberEventDispatcher2.sideEffects).invoke();
                    RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) ((Provider) rememberEventDispatcher2.rememberSet).invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) ((DoubleCheck) rememberEventDispatcher2.releasing).getValue();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) ((LambdaProvider) rememberEventDispatcher2.ignoreLeavingSet).lambda.invoke();
                    AllowListController$Factory$Impl allowListController$Factory$Impl = (AllowListController$Factory$Impl) ((Provider) rememberEventDispatcher2.pausedPlaceholders).invoke();
                    BlockListController$Factory$Impl blockListController$Factory$Impl = (BlockListController$Factory$Impl) ((Provider) rememberEventDispatcher2.nestedRemembersLists).invoke();
                    sessionManager4.getClass();
                    analytics4.getClass();
                    realCustomerStore.getClass();
                    androidStringManager13.getClass();
                    realRouter$Factory$Impl7.getClass();
                    realFamilyAccountsManager.getClass();
                    realFamilyProfileManager.getClass();
                    featureFlagManager4.getClass();
                    realUuidGenerator.getClass();
                    allowListController$Factory$Impl.getClass();
                    blockListController$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalCashBalancePresenter(sessionManager4, analytics4, realCustomerStore, androidStringManager13, realRouter$Factory$Impl7, realFamilyAccountsManager, realFamilyProfileManager, featureFlagManager4, realUuidGenerator, allowListController$Factory$Impl, blockListController$Factory$Impl, (P2PListScreen) screen, screenNavigator));
                }
                if (screen instanceof SelectCustomerScreen) {
                    NodeChain nodeChain = ((SelectCustomerPresenter$Factory$Impl) obj2).delegateFactory;
                    AndroidStringManager androidStringManager14 = (AndroidStringManager) ((LambdaProvider) nodeChain.layoutNode).lambda.invoke();
                    SessionManager sessionManager5 = (SessionManager) ((LambdaProvider) nodeChain.sentinelHead).lambda.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) nodeChain.innerCoordinator).invoke();
                    RealFamilyAccountsManager realFamilyAccountsManager2 = (RealFamilyAccountsManager) ((Provider) nodeChain.outerCoordinator).invoke();
                    RealFamilyProfileManager realFamilyProfileManager2 = (RealFamilyProfileManager) ((Provider) nodeChain.tail).invoke();
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) ((DoubleCheck) nodeChain.head).getValue();
                    RealUuidGenerator realUuidGenerator2 = (RealUuidGenerator) ((LambdaProvider) nodeChain.current).lambda.invoke();
                    RealInputFieldTextSaver realInputFieldTextSaver2 = (RealInputFieldTextSaver) ((LambdaProvider) nodeChain.buffer).lambda.invoke();
                    AllowListController$Factory$Impl allowListController$Factory$Impl2 = (AllowListController$Factory$Impl) ((Provider) nodeChain.stack).invoke();
                    BlockListController$Factory$Impl blockListController$Factory$Impl2 = (BlockListController$Factory$Impl) ((Provider) nodeChain.cachedDiffer).invoke();
                    androidStringManager14.getClass();
                    sessionManager5.getClass();
                    realProfileManager.getClass();
                    realFamilyAccountsManager2.getClass();
                    realFamilyProfileManager2.getClass();
                    featureFlagManager5.getClass();
                    realUuidGenerator2.getClass();
                    realInputFieldTextSaver2.getClass();
                    allowListController$Factory$Impl2.getClass();
                    blockListController$Factory$Impl2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new SelectCustomerPresenter(androidStringManager14, sessionManager5, realProfileManager, realFamilyAccountsManager2, realFamilyProfileManager2, featureFlagManager5, realUuidGenerator2, realInputFieldTextSaver2, allowListController$Factory$Impl2, blockListController$Factory$Impl2, (SelectCustomerScreen) screen, screenNavigator));
                }
                if (screen instanceof BlockersScreens.SelectAllowlistCustomerBlockerScreen) {
                    Reward$Adapter reward$Adapter2 = ((SelectAllowlistBlockerPresenter$Factory$Impl) obj4).delegateFactory;
                    AndroidStringManager androidStringManager15 = (AndroidStringManager) ((LambdaProvider) reward$Adapter2.avatarsAdapter).lambda.invoke();
                    BlocklyService blocklyService = (BlocklyService) ((DoubleCheck) reward$Adapter2.reward_selection_stateAdapter).getValue();
                    RealInputFieldTextSaver realInputFieldTextSaver3 = (RealInputFieldTextSaver) ((LambdaProvider) reward$Adapter2.boost_detail_bottom_upsellAdapter).lambda.invoke();
                    RealProfileManager realProfileManager2 = (RealProfileManager) ((DelegateFactory) reward$Adapter2.app_linksAdapter).invoke();
                    AegisService aegisService = (AegisService) ((DoubleCheck) reward$Adapter2.program_detail_rowsAdapter).getValue();
                    BlockersDataNavigator blockersDataNavigator7 = (BlockersDataNavigator) ((Provider) reward$Adapter2.boost_detail_rowsAdapter).invoke();
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) ((Provider) reward$Adapter2.boost_attributesAdapter).invoke();
                    androidStringManager15.getClass();
                    blocklyService.getClass();
                    realInputFieldTextSaver3.getClass();
                    realProfileManager2.getClass();
                    aegisService.getClass();
                    blockersDataNavigator7.getClass();
                    realBlockersHelper$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new SelectAllowlistBlockerPresenter(androidStringManager15, blocklyService, realInputFieldTextSaver3, realProfileManager2, (BlockersScreens.SelectAllowlistCustomerBlockerScreen) screen, screenNavigator, aegisService, blockersDataNavigator7, realBlockersHelper$Factory$Impl));
                }
                if (!(screen instanceof P2PAllowlistScreen)) {
                    return null;
                }
                zzlj zzljVar = ((SelectAllowlistCustomersPresenter$Factory$Impl) obj).delegateFactory;
                Analytics analytics5 = (Analytics) ((DoubleCheck) zzljVar.zza).getValue();
                AndroidStringManager androidStringManager16 = (AndroidStringManager) ((LambdaProvider) zzljVar.zzb).lambda.invoke();
                BlocklyService blocklyService2 = (BlocklyService) ((DoubleCheck) zzljVar.zzc).getValue();
                RealInputFieldTextSaver realInputFieldTextSaver4 = (RealInputFieldTextSaver) ((LambdaProvider) zzljVar.zze).lambda.invoke();
                RealProfileManager realProfileManager3 = (RealProfileManager) ((DelegateFactory) zzljVar.zzd).invoke();
                AegisService aegisService2 = (AegisService) ((DoubleCheck) zzljVar.zzf).getValue();
                analytics5.getClass();
                androidStringManager16.getClass();
                blocklyService2.getClass();
                realInputFieldTextSaver4.getClass();
                realProfileManager3.getClass();
                aegisService2.getClass();
                return MoleculePresenterKt.asPresenter$default(new SelectAllowlistCustomersPresenter(analytics5, androidStringManager16, blocklyService2, realInputFieldTextSaver4, realProfileManager3, aegisService2, (P2PAllowlistScreen) screen, screenNavigator));
            case 6:
                screen.getClass();
                if (screen instanceof WirelessProviderListBlockerScreen) {
                    TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory2 = ((WirelessProviderListPresenter$Factory$Impl) obj3).delegateFactory;
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl2 = (RealBlockersHelper$Factory$Impl) taxTooltipPresenter$MetroFactory2.taxDesktopTooltipPreference.invoke();
                    ErrorReporter errorReporter5 = (ErrorReporter) taxTooltipPresenter$MetroFactory2.stringManager.lambda.invoke();
                    realBlockersHelper$Factory$Impl2.getClass();
                    errorReporter5.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WirelessProviderListPresenter(realBlockersHelper$Factory$Impl2, errorReporter5, (WirelessProviderListBlockerScreen) screen, screenNavigator));
                }
                if (screen instanceof PhonePlansEsimCheckBlockerScreen) {
                    Instrument$Adapter instrument$Adapter = ((PhonePlansEsimCheckPresenter$Factory$Impl) obj2).delegateFactory;
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl3 = (RealBlockersHelper$Factory$Impl) ((Provider) instrument$Adapter.cash_instrument_typeAdapter).invoke();
                    Lazy lazy = (Lazy) ((AndroidFileSaver.MetroFactory) instrument$Adapter.card_brandAdapter).invoke();
                    ErrorReporter errorReporter6 = (ErrorReporter) ((LambdaProvider) instrument$Adapter.balance_currencyAdapter).lambda.invoke();
                    realBlockersHelper$Factory$Impl3.getClass();
                    errorReporter6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(realBlockersHelper$Factory$Impl3, lazy, errorReporter6, (PhonePlansEsimCheckBlockerScreen) screen, screenNavigator));
                }
                if (screen instanceof PhonePlansNewLineLoadingBlockerScreen) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory9 = ((PhonePlansNewLineLoadingPresenter$Factory$Impl) obj4).delegateFactory;
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl4 = (RealBlockersHelper$Factory$Impl) metroFactory9.blockerFlowAnalytics.invoke();
                    CashSubscriptionsAppService cashSubscriptionsAppService = (CashSubscriptionsAppService) metroFactory9.analytics.getValue();
                    realBlockersHelper$Factory$Impl4.getClass();
                    cashSubscriptionsAppService.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PhonePlansNewLineLoadingPresenter(realBlockersHelper$Factory$Impl4, cashSubscriptionsAppService, (PhonePlansNewLineLoadingBlockerScreen) screen, screenNavigator));
                }
                if (!(screen instanceof PhonePlansHomeScreen)) {
                    return null;
                }
                CheckDepositAmountPresenter.MetroFactory metroFactory10 = ((PhonePlansHomePresenter$Factory$Impl) obj).delegateFactory;
                RealRouter$Factory$Impl realRouter$Factory$Impl8 = (RealRouter$Factory$Impl) metroFactory10.blockerFlowAnalytics.invoke();
                CashSubscriptionsAppService cashSubscriptionsAppService2 = (CashSubscriptionsAppService) metroFactory10.analytics.getValue();
                realRouter$Factory$Impl8.getClass();
                cashSubscriptionsAppService2.getClass();
                return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(realRouter$Factory$Impl8, cashSubscriptionsAppService2, screenNavigator));
            case 7:
                screen.getClass();
                if (screen instanceof DeviceManagerListScreen) {
                    TaxAuthorizationPresenter.MetroFactory metroFactory11 = ((DeviceManagerListPresenter$Factory$Impl) obj3).delegateFactory;
                    RealDeviceManagerRepo realDeviceManagerRepo = (RealDeviceManagerRepo) metroFactory11.taxService.getValue();
                    RealTodayDateTimeFormatter realTodayDateTimeFormatter = (RealTodayDateTimeFormatter) metroFactory11.flowStarter.getValue();
                    AndroidStringManager androidStringManager17 = (AndroidStringManager) metroFactory11.stringManager.lambda.invoke();
                    RealDeviceManagerAnalytics realDeviceManagerAnalytics = (RealDeviceManagerAnalytics) metroFactory11.blockersDataNavigator.invoke();
                    FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) metroFactory11.appService.getValue();
                    realDeviceManagerRepo.getClass();
                    realTodayDateTimeFormatter.getClass();
                    androidStringManager17.getClass();
                    realDeviceManagerAnalytics.getClass();
                    featureFlagManager6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PdfPreviewPresenter(realDeviceManagerRepo, realTodayDateTimeFormatter, androidStringManager17, realDeviceManagerAnalytics, featureFlagManager6, screenNavigator, (DeviceManagerListScreen) screen));
                }
                if (screen instanceof DeviceManagerDeviceDetailsScreen) {
                    TaxAuthorizationPresenter.MetroFactory metroFactory12 = ((DeviceManagerDeviceDetailsPresenter$Factory$Impl) obj2).delegateFactory;
                    RealDeviceManagerRepo realDeviceManagerRepo2 = (RealDeviceManagerRepo) metroFactory12.taxService.getValue();
                    AndroidStringManager androidStringManager18 = (AndroidStringManager) metroFactory12.stringManager.lambda.invoke();
                    RealTodayDateTimeFormatter realTodayDateTimeFormatter2 = (RealTodayDateTimeFormatter) metroFactory12.flowStarter.getValue();
                    RealDeviceManagerAnalytics realDeviceManagerAnalytics2 = (RealDeviceManagerAnalytics) metroFactory12.blockersDataNavigator.invoke();
                    FeatureFlagManager featureFlagManager7 = (FeatureFlagManager) metroFactory12.appService.getValue();
                    realDeviceManagerRepo2.getClass();
                    androidStringManager18.getClass();
                    realTodayDateTimeFormatter2.getClass();
                    realDeviceManagerAnalytics2.getClass();
                    featureFlagManager7.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PdfPreviewPresenter(realDeviceManagerRepo2, androidStringManager18, realTodayDateTimeFormatter2, realDeviceManagerAnalytics2, featureFlagManager7, (DeviceManagerDeviceDetailsScreen) screen, screenNavigator));
                }
                if (!(screen instanceof DeviceManagerDeviceRemovalSuccessScreen)) {
                    if (!(screen instanceof DeviceManagerDeviceRemovalFailedScreen)) {
                        if (screen instanceof DeviceManagerConfirmRemoveDevicesScreen) {
                            return MoleculePresenterKt.asPresenter$default(new AddAliasPresenter(screenNavigator, 16));
                        }
                        return null;
                    }
                    TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory3 = ((DeviceRemovalFailedPresenter$Factory$Impl) obj).delegateFactory;
                    RealDeviceManagerAnalytics realDeviceManagerAnalytics3 = (RealDeviceManagerAnalytics) taxTooltipPresenter$MetroFactory3.taxDesktopTooltipPreference.invoke();
                    AndroidStringManager androidStringManager19 = (AndroidStringManager) taxTooltipPresenter$MetroFactory3.stringManager.lambda.invoke();
                    realDeviceManagerAnalytics3.getClass();
                    androidStringManager19.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(screenNavigator, (DeviceManagerDeviceRemovalFailedScreen) screen, realDeviceManagerAnalytics3, androidStringManager19));
                }
                Retrofit.Builder builder = ((DeviceManagerRemovedSuccessPresenter$Factory$Impl) obj4).delegateFactory;
                RealDeviceManagerAnalytics realDeviceManagerAnalytics4 = (RealDeviceManagerAnalytics) ((Provider) builder.callFactory).invoke();
                AndroidStringManager androidStringManager20 = (AndroidStringManager) ((LambdaProvider) builder.baseUrl).lambda.invoke();
                StateFlow stateFlow = (StateFlow) ((Provider) builder.converterFactories).invoke();
                AndroidBiometricsStore androidBiometricsStore = (AndroidBiometricsStore) ((Provider) builder.callAdapterFactories).invoke();
                RealPasscodeFlowStarter realPasscodeFlowStarter = (RealPasscodeFlowStarter) ((Provider) builder.callbackExecutor).invoke();
                realDeviceManagerAnalytics4.getClass();
                androidStringManager20.getClass();
                stateFlow.getClass();
                androidBiometricsStore.getClass();
                realPasscodeFlowStarter.getClass();
                return MoleculePresenterKt.asPresenter$default(new PdfPreviewPresenter(screenNavigator, (DeviceManagerDeviceRemovalSuccessScreen) screen, realDeviceManagerAnalytics4, androidStringManager20, stateFlow, androidBiometricsStore, realPasscodeFlowStarter));
            default:
                QrCodeProfilePresenter$Factory$Impl qrCodeProfilePresenter$Factory$Impl = (QrCodeProfilePresenter$Factory$Impl) obj4;
                screen.getClass();
                if (screen instanceof CashQrCodeScanner) {
                    RememberEventDispatcher rememberEventDispatcher3 = ((CashQrScannerPresenter$Factory$Impl) obj3).delegateFactory;
                    PermissionChecker permissionChecker = (PermissionChecker) ((LambdaProvider) rememberEventDispatcher3.abandoning).lambda.invoke();
                    AndroidClock androidClock = (AndroidClock) ((LambdaProvider) rememberEventDispatcher3.traceContext).lambda.invoke();
                    AndroidPermissionManager androidPermissionManager2 = (AndroidPermissionManager) ((Provider) rememberEventDispatcher3.remembering).invoke();
                    AndroidStringManager androidStringManager21 = (AndroidStringManager) ((LambdaProvider) rememberEventDispatcher3.currentRememberingList).lambda.invoke();
                    Analytics analytics6 = (Analytics) ((DoubleCheck) rememberEventDispatcher3.leaving).getValue();
                    RealCryptoInvoiceParser realCryptoInvoiceParser = (RealCryptoInvoiceParser) ((Provider) rememberEventDispatcher3.sideEffects).invoke();
                    RealCashAppUrlParser realCashAppUrlParser = (RealCashAppUrlParser) ((Provider) rememberEventDispatcher3.rememberSet).invoke();
                    Flow flow2 = (Flow) ((InstanceFactory) rememberEventDispatcher3.releasing).value;
                    RealNfcPaymentsManager realNfcPaymentsManager = (RealNfcPaymentsManager) ((Provider) rememberEventDispatcher3.ignoreLeavingSet).invoke();
                    AssetPublicSuffixList assetPublicSuffixList = (AssetPublicSuffixList) ((NavigationSideEffects.MetroFactory) rememberEventDispatcher3.pausedPlaceholders).invoke();
                    FeatureFlagManager featureFlagManager8 = (FeatureFlagManager) ((DoubleCheck) rememberEventDispatcher3.nestedRemembersLists).getValue();
                    permissionChecker.getClass();
                    androidClock.getClass();
                    androidPermissionManager2.getClass();
                    androidStringManager21.getClass();
                    analytics6.getClass();
                    realCryptoInvoiceParser.getClass();
                    realCashAppUrlParser.getClass();
                    flow2.getClass();
                    realNfcPaymentsManager.getClass();
                    featureFlagManager8.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CashQrScannerPresenter(permissionChecker, androidClock, androidPermissionManager2, androidStringManager21, analytics6, realCryptoInvoiceParser, realCashAppUrlParser, flow2, realNfcPaymentsManager, assetPublicSuffixList, featureFlagManager8, (CashQrCodeScanner) screen, screenNavigator));
                }
                if (screen instanceof CashtagQrScanScreen) {
                    zzlj zzljVar2 = ((CashtagQrScanPresenter$Factory$Impl) obj2).delegateFactory;
                    PermissionChecker permissionChecker2 = (PermissionChecker) ((LambdaProvider) zzljVar2.zza).lambda.invoke();
                    AndroidPermissionManager androidPermissionManager3 = (AndroidPermissionManager) ((Provider) zzljVar2.zzb).invoke();
                    AndroidStringManager androidStringManager22 = (AndroidStringManager) ((LambdaProvider) zzljVar2.zzc).lambda.invoke();
                    RealCashAppUrlParser realCashAppUrlParser2 = (RealCashAppUrlParser) ((Provider) zzljVar2.zze).invoke();
                    RealRecipientFinder realRecipientFinder = (RealRecipientFinder) ((Provider) zzljVar2.zzd).invoke();
                    Flow flow3 = (Flow) ((InstanceFactory) zzljVar2.zzf).value;
                    permissionChecker2.getClass();
                    androidPermissionManager3.getClass();
                    androidStringManager22.getClass();
                    realCashAppUrlParser2.getClass();
                    realRecipientFinder.getClass();
                    flow3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(permissionChecker2, androidPermissionManager3, androidStringManager22, realCashAppUrlParser2, realRecipientFinder, flow3, (CashtagQrScanScreen) screen, screenNavigator));
                }
                if (screen instanceof QrCodeScreen) {
                    return MoleculePresenterKt.asPresenter$default(qrCodeProfilePresenter$Factory$Impl.create((QrCodeScreen) screen, null, screenNavigator));
                }
                if (screen instanceof TeenQrCodeScreen) {
                    return MoleculePresenterKt.asPresenter$default(qrCodeProfilePresenter$Factory$Impl.create(null, (TeenQrCodeScreen) screen, screenNavigator));
                }
                if (!(screen instanceof CashQrShortcutsOnboardingSheet)) {
                    return null;
                }
                TransferInPresenter$MetroFactory transferInPresenter$MetroFactory3 = ((CashQrShortcutsOnboardingPresenter$Factory$Impl) obj).delegateFactory;
                KeyValue keyValue3 = (KeyValue) transferInPresenter$MetroFactory3.stringManager.lambda.invoke();
                QrShortcutInstaller qrShortcutInstaller = (QrShortcutInstaller) transferInPresenter$MetroFactory3.moneyFormatterFactory.invoke();
                Analytics analytics7 = (Analytics) transferInPresenter$MetroFactory3.analytics.getValue();
                keyValue3.getClass();
                qrShortcutInstaller.getClass();
                analytics7.getClass();
                return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(keyValue3, qrShortcutInstaller, analytics7, screenNavigator));
        }
    }

    public /* synthetic */ TaxPresenterFactory(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.taxWebAppPresenterFactory = obj;
        this.taxAuthorizationPresenter = obj2;
        this.taxTooltipPresenter = obj3;
        this.taxReturnsPresenter = obj4;
    }

    public TaxPresenterFactory(LiteCashInPresenter$Factory$Impl liteCashInPresenter$Factory$Impl, LiteAddMoneyPresenter$Factory$Impl liteAddMoneyPresenter$Factory$Impl, LiteCashOutPresenter$Factory$Impl liteCashOutPresenter$Factory$Impl, LiteActivityPresenter$Factory$Impl liteActivityPresenter$Factory$Impl, LiteBalanceHomePresenter$Factory$Impl liteBalanceHomePresenter$Factory$Impl) {
        this.$r8$classId = 3;
        this.taxWebAppPresenterFactory = liteCashInPresenter$Factory$Impl;
        this.taxAuthorizationPresenter = liteCashOutPresenter$Factory$Impl;
        this.taxTooltipPresenter = liteActivityPresenter$Factory$Impl;
        this.taxReturnsPresenter = liteBalanceHomePresenter$Factory$Impl;
    }

    public TaxPresenterFactory(TaxWebAppPresenter$Factory$Impl taxWebAppPresenter$Factory$Impl, TaxAuthorizationPresenter$Factory$Impl taxAuthorizationPresenter$Factory$Impl, TaxMenuSheetPresenter$Factory$Impl taxMenuSheetPresenter$Factory$Impl, TaxWebBridgeDialogPresenter$Factory$Impl taxWebBridgeDialogPresenter$Factory$Impl, TaxTooltipPresenter$Factory$Impl taxTooltipPresenter$Factory$Impl, TaxReturnsPresenter$Factory$Impl taxReturnsPresenter$Factory$Impl) {
        this.$r8$classId = 0;
        this.taxWebAppPresenterFactory = taxWebAppPresenter$Factory$Impl;
        this.taxAuthorizationPresenter = taxAuthorizationPresenter$Factory$Impl;
        this.taxTooltipPresenter = taxTooltipPresenter$Factory$Impl;
        this.taxReturnsPresenter = taxReturnsPresenter$Factory$Impl;
    }
}
