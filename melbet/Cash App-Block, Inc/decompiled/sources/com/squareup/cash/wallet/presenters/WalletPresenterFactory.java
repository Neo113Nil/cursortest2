package com.squareup.cash.wallet.presenters;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.node.NodeChain;
import androidx.emoji2.text.MetadataRepo;
import app.cash.badging.backend.RealBadger2;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.backend.MarkMarketingMessageAsViewed$MetroFactory;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.account.presenters.ThemeSwitcherPresenter$MetroFactory;
import com.squareup.cash.account.presenters.documents.AccountDocumentsDownloadOptionsPresenter;
import com.squareup.cash.account.presenters.documents.AccountDocumentsDownloadOptionsPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.documents.AccountDocumentsDownloaderPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$Factory$Impl;
import com.squareup.cash.account.presenters.settings.PersonalSetting;
import com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.blockers.navigation.FlowNavigationHelper;
import com.squareup.cash.blockers.presenters.ClientScenarioLauncherPresenter$MetroFactory;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter;
import com.squareup.cash.blockers.presenters.SsnPresenter;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapplite.cashin.RealLiteCashInRepo$MetroFactory;
import com.squareup.cash.cashapppay.settings.presenters.CashAppPaySettingsPresenter$Factory$Impl;
import com.squareup.cash.cashapppay.settings.presenters.ConfirmRemoveLinkedBusinessPresenter$Factory$Impl;
import com.squareup.cash.cashapppay.settings.presenters.LinkedBusinessDetailsPresenter$Factory$Impl;
import com.squareup.cash.cashapppay.settings.presenters.UnlinkResultPresenter$Factory$Impl;
import com.squareup.cash.cashapppay.settings.screens.CashAppPaySettingsScreen;
import com.squareup.cash.cashapppay.settings.screens.ConfirmRemoveLinkedBusinessDialogScreen;
import com.squareup.cash.cashapppay.settings.screens.LinkedBusinessDetailsSheet;
import com.squareup.cash.cashapppay.settings.screens.UnlinkResultScreen;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.checks.VerifyCheckDepositPresenter;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.messaging.presenters.FailureMessageBlockerFullScreenPresenter$Factory$Impl;
import com.squareup.cash.common.messaging.presenters.FailureMessageBlockerPresenter$Factory$Impl;
import com.squareup.cash.common.messaging.presenters.FailureMessagePresenter$Factory$Impl;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerFullScreen;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionCustomPercentagePresenter$Factory$Impl;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionPercentagePresenter;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionPercentagePresenter$Factory$Impl;
import com.squareup.cash.crypto.common.presenters.BitcoinP2pConversionPercentageSubmitter;
import com.squareup.cash.crypto.common.presenters.CryptoCommonInsufficientFundsPresenter$Factory$Impl;
import com.squareup.cash.crypto.common.screens.CryptoCommonScreens;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.documents.RealAfterpayStatementManager;
import com.squareup.cash.data.profile.documents.RealDocumentEntitiesMapper;
import com.squareup.cash.data.profile.documents.RealDocumentsManager;
import com.squareup.cash.data.profile.documents.RealLegalDocumentManager$MetroFactory;
import com.squareup.cash.datefilterbar.backend.real.RealDateFilterGenerator;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerAnalytics;
import com.squareup.cash.earningstracker.backend.real.RealEarningsTrackerRepository;
import com.squareup.cash.earningstracker.presenters.EarningsTimeframeSelectorSheetPresenter$Factory$Impl;
import com.squareup.cash.earningstracker.presenters.EarningsTrackerPresenter$Factory$Impl;
import com.squareup.cash.earningstracker.presenters.NetEarningsInfoSheetPresenter;
import com.squareup.cash.earningstracker.presenters.NetEarningsInfoSheetPresenter$Factory$Impl;
import com.squareup.cash.earningstracker.screens.EarningsTimeframeSelectorSheetScreen;
import com.squareup.cash.earningstracker.screens.EarningsTrackerScreen;
import com.squareup.cash.earningstracker.screens.NetEarningsInfoSheetScreen;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.exchangedata.real.RealFxExchangeRateStreamingSubscriber;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.family.requestsponsorship.presenters.SelectContactMethodPresenter$Factory$Impl;
import com.squareup.cash.family.requestsponsorship.presenters.SelectSponsorPresenter$Factory$Impl;
import com.squareup.cash.family.requestsponsorship.presenters.SponsorSelectionDetailsPresenter;
import com.squareup.cash.family.requestsponsorship.presenters.SponsorSelectionDetailsPresenter$Factory$Impl;
import com.squareup.cash.family.requestsponsorship.screens.ContactPermissionDialogScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectContactMethodScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectDependentScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorErrorScreen;
import com.squareup.cash.family.requestsponsorship.screens.SelectSponsorScreen;
import com.squareup.cash.family.requestsponsorship.screens.SponsorSelectionDetailsScreen;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.favorites.presenters.AddFavoritesPresenter$Factory$Impl;
import com.squareup.cash.favorites.presenters.FavoriteAddedPresenter$Factory$Impl;
import com.squareup.cash.favorites.presenters.ListFavoritesPresenter$Factory$Impl;
import com.squareup.cash.favorites.presenters.RealFavoritesInboundNavigator$Factory$Impl;
import com.squareup.cash.favorites.screens.AddFavorites;
import com.squareup.cash.favorites.screens.FavoriteAdded;
import com.squareup.cash.favorites.screens.FavoritesMessage;
import com.squareup.cash.favorites.screens.ListFavorites;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.gcl.RealGlobalConfigProvider;
import com.squareup.cash.google.pay.RealGooglePayer;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.identityverification.backend.real.RealIdentityVerificationRepo;
import com.squareup.cash.inappreview.real.RealRequestReviewFlagWrapper;
import com.squareup.cash.initialscreenloader.backend.OpenTheAppUserJourney;
import com.squareup.cash.initialscreenloader.backend.RealPreSignInScreenLoader;
import com.squareup.cash.initialscreenloader.presenters.AppUpgradePresenter$Factory$Impl;
import com.squareup.cash.initialscreenloader.presenters.GenericErrorPresenter$Factory$Impl;
import com.squareup.cash.initialscreenloader.presenters.InitialScreenLoaderPresenter;
import com.squareup.cash.initialscreenloader.presenters.InitialScreenLoaderPresenter$Factory$Impl;
import com.squareup.cash.initialscreenloader.screens.AppUpgradeScreen;
import com.squareup.cash.initialscreenloader.screens.GenericErrorScreen;
import com.squareup.cash.initialscreenloader.screens.InitialScreenPlaceholder;
import com.squareup.cash.initialscreenloader.screens.InitiateSessionFailedScreen;
import com.squareup.cash.initialscreenloader.screens.ScenarioPlanErrorScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.integration.contacts.RealContactBook;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.merchant.backend.real.RealMerchantProfileRepo$MetroFactory;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.navigation.CashPaymentPadOutboundNavigator$Factory$Impl;
import com.squareup.cash.nearby.backend.RealNearbyPermissionStateProvider;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.onboarding.accountpicker.backend.RealSelectedAliasRegistrar;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerOptionsMenuPresenter$Factory$Impl;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerPresenter$Factory$Impl;
import com.squareup.cash.onboarding.accountpicker.presenters.AliasPickerPresenter$Factory$Impl;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerErrorScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerOptionsMenuScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAccountPickerScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAliasPickerScreen;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingConfirmAccountRemovalScreen;
import com.squareup.cash.onboarding.presenters.OnboardingLandingPresenter$MetroFactory;
import com.squareup.cash.p2pblocking.presenters.RealAllowlistRepository;
import com.squareup.cash.passkeys.backend.RealPasskeyFeatureManager;
import com.squareup.cash.passkeys.backend.RealPasskeyRepository;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$Factory$Impl;
import com.squareup.cash.paymentpad.presenters.LitePaymentPadPresenter$Factory$Impl;
import com.squareup.cash.paymentpad.presenters.LitePaymentPadPresenter$MetroFactory;
import com.squareup.cash.paymentpad.presenters.LowDiskSpaceAlertPresenter$Factory$Impl;
import com.squareup.cash.paymentpad.presenters.MainPaymentPadPresenter$Factory$Impl;
import com.squareup.cash.paymentpad.presenters.RealLowDiskSpaceAlertManager;
import com.squareup.cash.paymentpad.presenters.RealPaymentTabSettings;
import com.squareup.cash.paymentpad.screens.LitePaymentPadSheetScreen;
import com.squareup.cash.paymentpad.screens.LowDiskSpaceAlertDialogScreen;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.pools.presenters.StartPoolPresenter;
import com.squareup.cash.profile.devicemanager.navigation.RealDeviceManagerInboundNavigator$Factory$Impl;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.profile.screens.DocumentDownloaderScreen;
import com.squareup.cash.profile.screens.DocumentsDownloadOptionsScreen;
import com.squareup.cash.profile.screens.DocumentsScreen;
import com.squareup.cash.qrcodes.QrShortcutInstaller;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.TransferringPresenter$MetroFactory;
import com.squareup.cash.securityhub.presenters.BookletPresenter$Factory$Impl;
import com.squareup.cash.securityhub.presenters.ProtectionsSectionPresenter$Factory$Impl;
import com.squareup.cash.securityhub.presenters.RecoveryGuidePresenter$Factory$Impl;
import com.squareup.cash.securityhub.presenters.RecoveryGuidePresenter$MetroFactory;
import com.squareup.cash.securityhub.presenters.SecurityHubPresenter$Factory$Impl;
import com.squareup.cash.securityhub.presenters.SecurityHubPresenter$MetroFactory;
import com.squareup.cash.securityhub.screens.BookletScreen;
import com.squareup.cash.securityhub.screens.RecoveryGuideScreen;
import com.squareup.cash.securityhub.screens.SecurityHubScreen;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.Storage;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter$Factory$Impl;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider;
import com.squareup.cash.tax.backend.real.RealTaxesDocumentsTaxReturnsDataProvider;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.presenters.TaxTooltipPresenter$MetroFactory;
import com.squareup.cash.ui.overlays.presenter.RealAlertBannerPresenter$Factory$Impl;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealCashAppTagManager;
import com.squareup.cash.wallet.data.RealDeviceLockAnimationBus;
import com.squareup.cash.wallet.screens.CardControlDialogScreen;
import com.squareup.cash.wallet.screens.CardLockHalfSheetScreen;
import com.squareup.cash.wallet.screens.PresentationTimelineScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.work.wages.real.RealWagesTaxDocumentManager;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.janus.api.JanusService;
import com.squareup.protos.cash.janus.api.ReturningCustomerLoginFlowService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.android.RealBackupService;
import com.squareup.util.android.RealIntentFactory;
import com.squareup.util.coroutines.Signal;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import squareup.cash.registrar.api.RegistrarClientService;

/* loaded from: classes.dex */
public final class WalletPresenterFactory implements PresenterFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object cardLock;
    public final Object presentationTimeline;
    public final Object walletHome;

    public WalletPresenterFactory(WalletHomePresenter$Factory$Impl walletHomePresenter$Factory$Impl, CardControlDialogPresenter$Factory$Impl cardControlDialogPresenter$Factory$Impl, CardLockPresenter$Factory$Impl cardLockPresenter$Factory$Impl, PresentationTimelinePresenter$Factory$Impl presentationTimelinePresenter$Factory$Impl) {
        this.$r8$classId = 0;
        this.walletHome = walletHomePresenter$Factory$Impl;
        this.cardLock = cardLockPresenter$Factory$Impl;
        this.presentationTimeline = presentationTimelinePresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        int i = this.$r8$classId;
        Object obj = this.presentationTimeline;
        Object obj2 = this.cardLock;
        Object obj3 = this.walletHome;
        switch (i) {
            case 0:
                screen.getClass();
                if (screen instanceof WalletHomeScreen) {
                    StartPoolPresenter.MetroFactory metroFactory = ((WalletHomePresenter$Factory$Impl) obj3).delegateFactory;
                    Analytics analytics = (Analytics) metroFactory.analytics.getValue();
                    Flow flow = (Flow) metroFactory.moneyFormatterFactory.invoke();
                    RealClipboardManager realClipboardManager = (RealClipboardManager) metroFactory.stringManager.lambda.invoke();
                    IssuedCardManager issuedCardManager = (IssuedCardManager) metroFactory.blockersNavigator.getValue();
                    RealOverlayAppMessageReader realOverlayAppMessageReader = (RealOverlayAppMessageReader) metroFactory.appConfig.getValue();
                    AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.uuidGenerator.lambda.invoke();
                    AndroidToaster androidToaster = (AndroidToaster) metroFactory.ioDispatcher.lambda.invoke();
                    RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) metroFactory.poolsRepository.invoke();
                    KeyValue keyValue = (KeyValue) metroFactory.intentFactory.getValue();
                    CardSchemePresenter$Factory$Impl cardSchemePresenter$Factory$Impl = (CardSchemePresenter$Factory$Impl) metroFactory.activity.value;
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.poolActionManager.invoke();
                    TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl = (TabToolbarPresenter$Factory$Impl) metroFactory.sponsorshipStateProvider.invoke();
                    analytics.getClass();
                    flow.getClass();
                    realClipboardManager.getClass();
                    issuedCardManager.getClass();
                    realOverlayAppMessageReader.getClass();
                    androidStringManager.getClass();
                    androidToaster.getClass();
                    realFamilyProfileManager.getClass();
                    keyValue.getClass();
                    cardSchemePresenter$Factory$Impl.getClass();
                    realRouter$Factory$Impl.getClass();
                    tabToolbarPresenter$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WalletHomePresenter((WalletHomeScreen) screen, screenNavigator, analytics, flow, realClipboardManager, issuedCardManager, realOverlayAppMessageReader, androidStringManager, androidToaster, realFamilyProfileManager, keyValue, cardSchemePresenter$Factory$Impl, realRouter$Factory$Impl, tabToolbarPresenter$Factory$Impl));
                }
                if (screen instanceof CardControlDialogScreen) {
                    return MoleculePresenterKt.asPresenter$default(new ErrorPresenter((CardControlDialogScreen) screen, screenNavigator));
                }
                if (!(screen instanceof CardLockHalfSheetScreen)) {
                    if (!(screen instanceof PresentationTimelineScreen)) {
                        return null;
                    }
                    CheckDepositAmountPresenter.MetroFactory metroFactory2 = ((PresentationTimelinePresenter$Factory$Impl) obj).delegateFactory;
                    Analytics analytics2 = (Analytics) metroFactory2.analytics.getValue();
                    RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) metroFactory2.blockerFlowAnalytics.invoke();
                    analytics2.getClass();
                    realRouter$Factory$Impl2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter((PresentationTimelineScreen) screen, screenNavigator, analytics2, realRouter$Factory$Impl2));
                }
                NodeChain nodeChain = ((CardLockPresenter$Factory$Impl) obj2).delegateFactory;
                Analytics analytics3 = (Analytics) ((DoubleCheck) nodeChain.layoutNode).getValue();
                LiteCardLockFlowTypeProvider liteCardLockFlowTypeProvider = (LiteCardLockFlowTypeProvider) ((RealLocaleAssetProvider$MetroFactory) nodeChain.sentinelHead).invoke();
                RealCashAppTagManager realCashAppTagManager = (RealCashAppTagManager) ((DoubleCheck) nodeChain.innerCoordinator).getValue();
                IssuedCardManager issuedCardManager2 = (IssuedCardManager) ((DoubleCheck) nodeChain.outerCoordinator).getValue();
                AppService appService = (AppService) ((DoubleCheck) nodeChain.tail).getValue();
                FlowStarter flowStarter = (FlowStarter) ((DoubleCheck) nodeChain.head).getValue();
                FlowNavigationHelper flowNavigationHelper = (FlowNavigationHelper) ((Provider) nodeChain.current).invoke();
                RealDeviceLockAnimationBus realDeviceLockAnimationBus = (RealDeviceLockAnimationBus) ((DoubleCheck) nodeChain.buffer).getValue();
                AndroidStringManager androidStringManager2 = (AndroidStringManager) ((LambdaProvider) nodeChain.stack).lambda.invoke();
                CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) nodeChain.cachedDiffer).lambda.invoke();
                analytics3.getClass();
                realCashAppTagManager.getClass();
                issuedCardManager2.getClass();
                appService.getClass();
                flowStarter.getClass();
                flowNavigationHelper.getClass();
                realDeviceLockAnimationBus.getClass();
                androidStringManager2.getClass();
                coroutineContext.getClass();
                return MoleculePresenterKt.asPresenter$default(new CardLockPresenter((CardLockHalfSheetScreen) screen, screenNavigator, analytics3, liteCardLockFlowTypeProvider, realCashAppTagManager, issuedCardManager2, appService, flowStarter, flowNavigationHelper, realDeviceLockAnimationBus, androidStringManager2, coroutineContext));
            case 1:
                screen.getClass();
                if (screen instanceof DocumentDownloaderScreen) {
                    ClientScenarioLauncherPresenter$MetroFactory clientScenarioLauncherPresenter$MetroFactory = ((AccountDocumentsDownloaderPresenter$Factory$Impl) obj3).delegateFactory;
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) clientScenarioLauncherPresenter$MetroFactory.toaster.lambda.invoke();
                    RealFileDownloader realFileDownloader = (RealFileDownloader) clientScenarioLauncherPresenter$MetroFactory.blockerFlowAnalytics.invoke();
                    RegistrarClientService registrarClientService = (RegistrarClientService) clientScenarioLauncherPresenter$MetroFactory.clientScenarioCompleter.getValue();
                    String str = (String) clientScenarioLauncherPresenter$MetroFactory.stringManager.lambda.invoke();
                    CoroutineContext coroutineContext2 = (CoroutineContext) clientScenarioLauncherPresenter$MetroFactory.ioDispatcher.lambda.invoke();
                    androidStringManager3.getClass();
                    realFileDownloader.getClass();
                    registrarClientService.getClass();
                    str.getClass();
                    coroutineContext2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(androidStringManager3, realFileDownloader, registrarClientService, str, coroutineContext2, (DocumentDownloaderScreen) screen, screenNavigator));
                }
                if (screen instanceof DocumentsDownloadOptionsScreen) {
                    SsnPresenter.MetroFactory metroFactory3 = ((AccountDocumentsDownloadOptionsPresenter$Factory$Impl) obj2).delegateFactory;
                    IntentLauncher intentLauncher = (IntentLauncher) metroFactory3.idvPresenterFactory.invoke();
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) metroFactory3.stringManager.lambda.invoke();
                    RealDocumentEntitiesMapper realDocumentEntitiesMapper = (RealDocumentEntitiesMapper) metroFactory3.blockersHelperFactory.invoke();
                    intentLauncher.getClass();
                    androidStringManager4.getClass();
                    realDocumentEntitiesMapper.getClass();
                    return MoleculePresenterKt.asPresenter$default(new AccountDocumentsDownloadOptionsPresenter(intentLauncher, androidStringManager4, realDocumentEntitiesMapper, (DocumentsDownloadOptionsScreen) screen));
                }
                if (!(screen instanceof DocumentsScreen)) {
                    return null;
                }
                HomeViewPresenter.MetroFactory metroFactory4 = ((AccountDocumentsPresenter$Factory$Impl) obj).delegateFactory;
                AndroidStringManager androidStringManager5 = (AndroidStringManager) metroFactory4.analytics.invoke();
                EglCore eglCore = (EglCore) ((RealMerchantProfileRepo$MetroFactory) metroFactory4.qrShortcutInstaller).invoke();
                MetadataRepo metadataRepo = (MetadataRepo) ((RealLegalDocumentManager$MetroFactory) metroFactory4.badgingState).invoke();
                RealClientSyncer realClientSyncer = (RealClientSyncer) metroFactory4.profileManager.invoke();
                RealDocumentsManager realDocumentsManager = (RealDocumentsManager) metroFactory4.overlayAppMessageReader.invoke();
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) ((RealMerchantProfileRepo$MetroFactory) metroFactory4.moneybotFlagsHelper).invoke();
                RealDocumentEntitiesMapper realDocumentEntitiesMapper2 = (RealDocumentEntitiesMapper) metroFactory4.requestReviewFlagWrapper.invoke();
                Analytics analytics4 = (Analytics) metroFactory4.paymentPadOutboundNavigatorFactory.invoke();
                IntentLauncher intentLauncher2 = (IntentLauncher) metroFactory4.tabToolbarPresenterFactory.invoke();
                RealTaxesDocumentsTaxReturnsDataProvider realTaxesDocumentsTaxReturnsDataProvider = (RealTaxesDocumentsTaxReturnsDataProvider) metroFactory4.alertBannerPresenterFactory.invoke();
                RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) metroFactory4.featureFlagManager.invoke();
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory4.p2pSettingsManager.invoke();
                RealGlobalConfigProvider realGlobalConfigProvider = (RealGlobalConfigProvider) metroFactory4.paymentTabSettings.invoke();
                RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) metroFactory4.sessionFlags.invoke();
                RealAfterpayStatementManager realAfterpayStatementManager = (RealAfterpayStatementManager) metroFactory4.uuidGenerator.invoke();
                EglCore eglCore2 = (EglCore) ((RealMerchantProfileRepo$MetroFactory) metroFactory4.inAppReviewLauncher).invoke();
                String str2 = (String) metroFactory4.nearbyPermissionStateProvider.invoke();
                ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) ((MarkMarketingMessageAsViewed$MetroFactory) metroFactory4.mainPaymentPadPresenterFactory).invoke();
                RealWagesTaxDocumentManager realWagesTaxDocumentManager = (RealWagesTaxDocumentManager) metroFactory4.hasSeenQrShortcutsOnboarding.invoke();
                ToolbarTuckTargets toolbarTuckTargets2 = (ToolbarTuckTargets) ((AndroidFileSaver.MetroFactory) metroFactory4.lowDiskSpaceAlertManager).invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl3 = (RealRouter$Factory$Impl) metroFactory4.qrShortcutsOnboardingAppStarts.invoke();
                androidStringManager5.getClass();
                realClientSyncer.getClass();
                realDocumentsManager.getClass();
                realDocumentEntitiesMapper2.getClass();
                analytics4.getClass();
                intentLauncher2.getClass();
                realTaxesDocumentsTaxReturnsDataProvider.getClass();
                realBitcoinCapabilityProvider.getClass();
                featureFlagManager.getClass();
                realGlobalConfigProvider.getClass();
                realFeatureEligibilityRepository.getClass();
                realAfterpayStatementManager.getClass();
                str2.getClass();
                realWagesTaxDocumentManager.getClass();
                realRouter$Factory$Impl3.getClass();
                return MoleculePresenterKt.asPresenter$default(new AccountDocumentsPresenter(androidStringManager5, eglCore, metadataRepo, realClientSyncer, realDocumentsManager, markwonConfiguration, realDocumentEntitiesMapper2, analytics4, intentLauncher2, "https://cash.app/", realTaxesDocumentsTaxReturnsDataProvider, realBitcoinCapabilityProvider, featureFlagManager, (DocumentsScreen) screen, screenNavigator, realGlobalConfigProvider, realFeatureEligibilityRepository, realAfterpayStatementManager, eglCore2, str2, toolbarTuckTargets, realWagesTaxDocumentManager, toolbarTuckTargets2, realRouter$Factory$Impl3));
            case 2:
                screen.getClass();
                if (screen instanceof CashAppPaySettingsScreen) {
                    Instrument$Adapter instrument$Adapter = ((CashAppPaySettingsPresenter$Factory$Impl) obj3).delegateFactory;
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) instrument$Adapter.cash_instrument_typeAdapter).value;
                    EglCore eglCore3 = (EglCore) ((RealMerchantProfileRepo$MetroFactory) instrument$Adapter.card_brandAdapter).invoke();
                    Analytics analytics5 = (Analytics) ((DoubleCheck) instrument$Adapter.balance_currencyAdapter).getValue();
                    coroutineScope.getClass();
                    analytics5.getClass();
                    return MoleculePresenterKt.asPresenter$default(new MusicPresenter(screenNavigator, coroutineScope, eglCore3, analytics5, 16));
                }
                if (screen instanceof LinkedBusinessDetailsSheet) {
                    Analytics analytics6 = (Analytics) ((LinkedBusinessDetailsPresenter$Factory$Impl) obj2).delegateFactory.analytics.getValue();
                    analytics6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(screenNavigator, (LinkedBusinessDetailsSheet) screen, analytics6));
                }
                if (screen instanceof ConfirmRemoveLinkedBusinessDialogScreen) {
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((ConfirmRemoveLinkedBusinessDialogScreen) screen, screenNavigator));
                }
                if (!(screen instanceof UnlinkResultScreen)) {
                    return null;
                }
                AndroidStringManager androidStringManager6 = (AndroidStringManager) ((UnlinkResultPresenter$Factory$Impl) obj).delegateFactory.stringManager.lambda.invoke();
                androidStringManager6.getClass();
                return MoleculePresenterKt.asPresenter$default(new MusicPresenter(androidStringManager6, (UnlinkResultScreen) screen, screenNavigator));
            case 3:
                screen.getClass();
                if (screen instanceof FailureMessageScreen) {
                    AndroidStringManager androidStringManager7 = (AndroidStringManager) ((FailureMessagePresenter$Factory$Impl) obj3).delegateFactory.stringManager.lambda.invoke();
                    androidStringManager7.getClass();
                    return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(androidStringManager7, (FailureMessageScreen) screen, screenNavigator));
                }
                if (screen instanceof FailureMessageBlockerScreen) {
                    AndroidStringManager androidStringManager8 = (AndroidStringManager) ((FailureMessageBlockerPresenter$Factory$Impl) obj2).delegateFactory.stringManager.lambda.invoke();
                    androidStringManager8.getClass();
                    return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(androidStringManager8, (FailureMessageBlockerScreen) screen, screenNavigator));
                }
                if (!(screen instanceof FailureMessageBlockerFullScreen)) {
                    return null;
                }
                AndroidActivityFinisher androidActivityFinisher = (AndroidActivityFinisher) ((FailureMessageBlockerFullScreenPresenter$Factory$Impl) obj).delegateFactory.staticImageLoader.invoke();
                androidActivityFinisher.getClass();
                return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((FailureMessageBlockerFullScreen) screen, androidActivityFinisher));
            case 4:
                screen.getClass();
                if (!(screen instanceof CryptoCommonScreens)) {
                    return null;
                }
                CryptoCommonScreens cryptoCommonScreens = (CryptoCommonScreens) screen;
                if (cryptoCommonScreens instanceof CryptoCommonScreens.CryptoCommonInsufficientFunds) {
                    AndroidStringManager androidStringManager9 = (AndroidStringManager) ((CryptoCommonInsufficientFundsPresenter$Factory$Impl) obj3).delegateFactory.stringManager.lambda.invoke();
                    androidStringManager9.getClass();
                    return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(androidStringManager9, (CryptoCommonScreens.CryptoCommonInsufficientFunds) screen, screenNavigator));
                }
                if (cryptoCommonScreens instanceof CryptoCommonScreens.BitcoinP2pConversionPercentageScreen) {
                    TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = ((BitcoinP2pConversionPercentagePresenter$Factory$Impl) obj2).delegateFactory;
                    BitcoinP2pConversionPercentageSubmitter bitcoinP2pConversionPercentageSubmitter = (BitcoinP2pConversionPercentageSubmitter) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
                    AndroidStringManager androidStringManager10 = (AndroidStringManager) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
                    bitcoinP2pConversionPercentageSubmitter.getClass();
                    androidStringManager10.getClass();
                    return MoleculePresenterKt.asPresenter$default(new BitcoinP2pConversionPercentagePresenter(bitcoinP2pConversionPercentageSubmitter, androidStringManager10, (CryptoCommonScreens.BitcoinP2pConversionPercentageScreen) screen, screenNavigator));
                }
                if (!(cryptoCommonScreens instanceof CryptoCommonScreens.BitcoinP2pConversionCustomPercentageScreen)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory2 = ((BitcoinP2pConversionCustomPercentagePresenter$Factory$Impl) obj).delegateFactory;
                BitcoinP2pConversionPercentageSubmitter bitcoinP2pConversionPercentageSubmitter2 = (BitcoinP2pConversionPercentageSubmitter) taxTooltipPresenter$MetroFactory2.taxDesktopTooltipPreference.invoke();
                AndroidStringManager androidStringManager11 = (AndroidStringManager) taxTooltipPresenter$MetroFactory2.stringManager.lambda.invoke();
                bitcoinP2pConversionPercentageSubmitter2.getClass();
                androidStringManager11.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter((CryptoCommonScreens.BitcoinP2pConversionCustomPercentageScreen) screen, screenNavigator, bitcoinP2pConversionPercentageSubmitter2, androidStringManager11));
            case 5:
                screen.getClass();
                if (!(screen instanceof EarningsTrackerScreen)) {
                    if (screen instanceof NetEarningsInfoSheetScreen) {
                        RealRouter$Factory$Impl realRouter$Factory$Impl4 = (RealRouter$Factory$Impl) ((NetEarningsInfoSheetPresenter$Factory$Impl) obj2).delegateFactory.staticImageLoader.invoke();
                        realRouter$Factory$Impl4.getClass();
                        return MoleculePresenterKt.asPresenter$default(new NetEarningsInfoSheetPresenter(realRouter$Factory$Impl4, screenNavigator, 0));
                    }
                    if (!(screen instanceof EarningsTimeframeSelectorSheetScreen)) {
                        return null;
                    }
                    OnboardingLandingPresenter$MetroFactory onboardingLandingPresenter$MetroFactory = ((EarningsTimeframeSelectorSheetPresenter$Factory$Impl) obj).delegateFactory;
                    SyncValueReader syncValueReader = (SyncValueReader) onboardingLandingPresenter$MetroFactory.analytics.getValue();
                    AndroidClock androidClock = (AndroidClock) onboardingLandingPresenter$MetroFactory.observabilityManager.lambda.invoke();
                    AndroidStringManager androidStringManager12 = (AndroidStringManager) onboardingLandingPresenter$MetroFactory.stringManager.lambda.invoke();
                    syncValueReader.getClass();
                    androidClock.getClass();
                    androidStringManager12.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(syncValueReader, androidClock, androidStringManager12, (EarningsTimeframeSelectorSheetScreen) screen, screenNavigator));
                }
                NodeChain nodeChain2 = ((EarningsTrackerPresenter$Factory$Impl) obj3).delegateFactory;
                RealEarningsTrackerRepository realEarningsTrackerRepository = (RealEarningsTrackerRepository) ((Provider) nodeChain2.layoutNode).invoke();
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((Provider) nodeChain2.sentinelHead).invoke();
                AndroidStringManager androidStringManager13 = (AndroidStringManager) ((LambdaProvider) nodeChain2.innerCoordinator).lambda.invoke();
                EglCore eglCore4 = (EglCore) ((PersonalSetting.MetroFactory) nodeChain2.outerCoordinator).invoke();
                AndroidClock androidClock2 = (AndroidClock) ((LambdaProvider) nodeChain2.tail).lambda.invoke();
                RealDateFilterGenerator realDateFilterGenerator = (RealDateFilterGenerator) ((Provider) nodeChain2.head).invoke();
                zzr zzrVar = (zzr) ((PersonalSetting.MetroFactory) nodeChain2.current).invoke();
                SyncValueReader syncValueReader2 = (SyncValueReader) ((DoubleCheck) nodeChain2.buffer).getValue();
                RealTapToPayEligibilityProvider realTapToPayEligibilityProvider = (RealTapToPayEligibilityProvider) ((Provider) nodeChain2.stack).invoke();
                RealEarningsTrackerAnalytics realEarningsTrackerAnalytics = (RealEarningsTrackerAnalytics) ((Provider) nodeChain2.cachedDiffer).invoke();
                realEarningsTrackerRepository.getClass();
                factory.getClass();
                androidStringManager13.getClass();
                androidClock2.getClass();
                realDateFilterGenerator.getClass();
                syncValueReader2.getClass();
                realTapToPayEligibilityProvider.getClass();
                realEarningsTrackerAnalytics.getClass();
                return MoleculePresenterKt.asPresenter$default(new TransfersPresenter(realEarningsTrackerRepository, factory, androidStringManager13, eglCore4, androidClock2, realDateFilterGenerator, zzrVar, syncValueReader2, realTapToPayEligibilityProvider, realEarningsTrackerAnalytics, (EarningsTrackerScreen) screen, screenNavigator));
            case 6:
                SelectSponsorPresenter$Factory$Impl selectSponsorPresenter$Factory$Impl = (SelectSponsorPresenter$Factory$Impl) obj;
                screen.getClass();
                if (screen instanceof SponsorSelectionDetailsScreen) {
                    TransferringPresenter$MetroFactory transferringPresenter$MetroFactory = ((SponsorSelectionDetailsPresenter$Factory$Impl) obj3).delegateFactory;
                    AppService appService2 = (AppService) transferringPresenter$MetroFactory.appService.getValue();
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) transferringPresenter$MetroFactory.blockersDataNavigator.invoke();
                    AndroidStringManager androidStringManager14 = (AndroidStringManager) transferringPresenter$MetroFactory.stringManager.lambda.invoke();
                    IntentLauncher intentLauncher3 = (IntentLauncher) transferringPresenter$MetroFactory.balanceSnapshotManager.invoke();
                    Signal signal = (Signal) transferringPresenter$MetroFactory.flowStarter.getValue();
                    ErrorReporter errorReporter = (ErrorReporter) transferringPresenter$MetroFactory.uuidGenerator.lambda.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) transferringPresenter$MetroFactory.moneyFormatterFactory.invoke();
                    appService2.getClass();
                    blockersDataNavigator.getClass();
                    androidStringManager14.getClass();
                    intentLauncher3.getClass();
                    signal.getClass();
                    errorReporter.getClass();
                    sampleStrategy.getClass();
                    return MoleculePresenterKt.asPresenter$default(new SponsorSelectionDetailsPresenter(appService2, blockersDataNavigator, androidStringManager14, intentLauncher3, signal, errorReporter, sampleStrategy, screenNavigator, (SponsorSelectionDetailsScreen) screen));
                }
                if (!(screen instanceof SelectContactMethodScreen)) {
                    if (screen instanceof SelectSponsorScreen) {
                        return MoleculePresenterKt.asPresenter$default(SelectSponsorPresenter$Factory$Impl.create$default(selectSponsorPresenter$Factory$Impl, (SelectSponsorScreen) screen, null, screenNavigator, 2));
                    }
                    if (screen instanceof SelectDependentScreen) {
                        return MoleculePresenterKt.asPresenter$default(SelectSponsorPresenter$Factory$Impl.create$default(selectSponsorPresenter$Factory$Impl, null, (SelectDependentScreen) screen, screenNavigator, 1));
                    }
                    if (screen instanceof ContactPermissionDialogScreen) {
                        return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((ContactPermissionDialogScreen) screen, screenNavigator));
                    }
                    if (screen instanceof SelectSponsorErrorScreen) {
                        return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((SelectSponsorErrorScreen) screen, screenNavigator));
                    }
                    return null;
                }
                ThemeSwitcherPresenter$MetroFactory themeSwitcherPresenter$MetroFactory = ((SelectContactMethodPresenter$Factory$Impl) obj2).delegateFactory;
                RealContactBook realContactBook = (RealContactBook) themeSwitcherPresenter$MetroFactory.analytics.getValue();
                AppService appService3 = (AppService) themeSwitcherPresenter$MetroFactory.postcardService.getValue();
                BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) themeSwitcherPresenter$MetroFactory.paymentPadThemeSelection.invoke();
                Signal signal2 = (Signal) themeSwitcherPresenter$MetroFactory.featureFlagManager.getValue();
                AndroidStringManager androidStringManager15 = (AndroidStringManager) themeSwitcherPresenter$MetroFactory.stringManager.lambda.invoke();
                ModifiablePermissions modifiablePermissions = (ModifiablePermissions) themeSwitcherPresenter$MetroFactory.routerFactory.invoke();
                realContactBook.getClass();
                appService3.getClass();
                blockersDataNavigator2.getClass();
                signal2.getClass();
                androidStringManager15.getClass();
                modifiablePermissions.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(realContactBook, appService3, blockersDataNavigator2, signal2, androidStringManager15, (SelectContactMethodScreen) screen, screenNavigator, modifiablePermissions));
            case 7:
                screen.getClass();
                if (screen instanceof FavoritesMessage) {
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((FavoritesMessage) screen, screenNavigator));
                }
                if (screen instanceof FavoriteAdded) {
                    RealFavoritesInboundNavigator$Factory$Impl realFavoritesInboundNavigator$Factory$Impl = (RealFavoritesInboundNavigator$Factory$Impl) ((FavoriteAddedPresenter$Factory$Impl) obj).delegateFactory.staticImageLoader.invoke();
                    realFavoritesInboundNavigator$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(realFavoritesInboundNavigator$Factory$Impl, (FavoriteAdded) screen, screenNavigator));
                }
                if (screen instanceof AddFavorites) {
                    Reward$Adapter reward$Adapter = ((AddFavoritesPresenter$Factory$Impl) obj3).delegateFactory;
                    AndroidStringManager androidStringManager16 = (AndroidStringManager) ((LambdaProvider) reward$Adapter.avatarsAdapter).lambda.invoke();
                    RealFavoritesManager realFavoritesManager = (RealFavoritesManager) ((Provider) reward$Adapter.reward_selection_stateAdapter).invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) reward$Adapter.boost_detail_bottom_upsellAdapter).invoke();
                    RealFavoritesInboundNavigator$Factory$Impl realFavoritesInboundNavigator$Factory$Impl2 = (RealFavoritesInboundNavigator$Factory$Impl) ((Provider) reward$Adapter.app_linksAdapter).invoke();
                    RealInputFieldTextSaver realInputFieldTextSaver = (RealInputFieldTextSaver) ((LambdaProvider) reward$Adapter.program_detail_rowsAdapter).lambda.invoke();
                    BooleanPreference booleanPreference = (BooleanPreference) ((DoubleCheck) reward$Adapter.boost_detail_rowsAdapter).getValue();
                    ModifiablePermissions modifiablePermissions2 = (ModifiablePermissions) ((Provider) reward$Adapter.boost_attributesAdapter).invoke();
                    androidStringManager16.getClass();
                    realFavoritesManager.getClass();
                    realProfileManager.getClass();
                    realFavoritesInboundNavigator$Factory$Impl2.getClass();
                    realInputFieldTextSaver.getClass();
                    booleanPreference.getClass();
                    modifiablePermissions2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(androidStringManager16, realFavoritesManager, realProfileManager, realFavoritesInboundNavigator$Factory$Impl2, realInputFieldTextSaver, booleanPreference, modifiablePermissions2, (AddFavorites) screen, screenNavigator));
                }
                if (!(screen instanceof ListFavorites)) {
                    return null;
                }
                zzlj zzljVar = ((ListFavoritesPresenter$Factory$Impl) obj2).delegateFactory;
                Analytics analytics7 = (Analytics) ((DoubleCheck) zzljVar.zza).getValue();
                AndroidStringManager androidStringManager17 = (AndroidStringManager) ((LambdaProvider) zzljVar.zzb).lambda.invoke();
                RealFavoritesManager realFavoritesManager2 = (RealFavoritesManager) ((Provider) zzljVar.zzc).invoke();
                RealAllowlistRepository realAllowlistRepository = (RealAllowlistRepository) ((Provider) zzljVar.zze).invoke();
                RealFavoritesInboundNavigator$Factory$Impl realFavoritesInboundNavigator$Factory$Impl3 = (RealFavoritesInboundNavigator$Factory$Impl) ((Provider) zzljVar.zzd).invoke();
                RealProfileManager realProfileManager2 = (RealProfileManager) ((DelegateFactory) zzljVar.zzf).invoke();
                analytics7.getClass();
                androidStringManager17.getClass();
                realFavoritesManager2.getClass();
                realAllowlistRepository.getClass();
                realFavoritesInboundNavigator$Factory$Impl3.getClass();
                realProfileManager2.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(analytics7, androidStringManager17, realFavoritesManager2, realAllowlistRepository, realFavoritesInboundNavigator$Factory$Impl3, realProfileManager2, (ListFavorites) screen, screenNavigator));
            case 8:
                screen.getClass();
                if (screen instanceof AppUpgradeScreen) {
                    zzlj zzljVar2 = ((AppUpgradePresenter$Factory$Impl) obj3).delegateFactory;
                    RealIntentFactory realIntentFactory = (RealIntentFactory) ((DoubleCheck) zzljVar2.zza).getValue();
                    Activity activity = (Activity) ((InstanceFactory) zzljVar2.zzb).value;
                    AndroidActivityFinisher androidActivityFinisher2 = (AndroidActivityFinisher) ((Provider) zzljVar2.zzc).invoke();
                    AndroidStringManager androidStringManager18 = (AndroidStringManager) ((LambdaProvider) zzljVar2.zze).lambda.invoke();
                    zzr zzrVar2 = (zzr) ((RealLiteCashInRepo$MetroFactory) zzljVar2.zzd).invoke();
                    String str3 = (String) ((LambdaProvider) zzljVar2.zzf).lambda.invoke();
                    realIntentFactory.getClass();
                    activity.getClass();
                    androidActivityFinisher2.getClass();
                    androidStringManager18.getClass();
                    str3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(realIntentFactory, activity, androidActivityFinisher2, androidStringManager18, zzrVar2, str3, (AppUpgradeScreen) screen, screenNavigator));
                }
                if (screen instanceof InitiateSessionFailedScreen) {
                    return MoleculePresenterKt.asPresenter$default(new AddAliasPresenter(screenNavigator, 13));
                }
                if (screen instanceof InitialScreenPlaceholder) {
                    Instrument$Adapter instrument$Adapter2 = ((InitialScreenLoaderPresenter$Factory$Impl) obj2).delegateFactory;
                    PrimitiveRegistry$$ExternalSyntheticLambda0 primitiveRegistry$$ExternalSyntheticLambda0 = (PrimitiveRegistry$$ExternalSyntheticLambda0) ((RealGooglePayer.MetroFactory) instrument$Adapter2.cash_instrument_typeAdapter).invoke();
                    AndroidActivityFinisher androidActivityFinisher3 = (AndroidActivityFinisher) ((Provider) instrument$Adapter2.card_brandAdapter).invoke();
                    OpenTheAppUserJourney openTheAppUserJourney = (OpenTheAppUserJourney) ((LambdaProvider) instrument$Adapter2.balance_currencyAdapter).lambda.invoke();
                    androidActivityFinisher3.getClass();
                    openTheAppUserJourney.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InitialScreenLoaderPresenter(primitiveRegistry$$ExternalSyntheticLambda0, androidActivityFinisher3, openTheAppUserJourney, (InitialScreenPlaceholder) screen, screenNavigator));
                }
                if (screen instanceof ScenarioPlanErrorScreen) {
                    return MoleculePresenterKt.asPresenter$default(new AddAliasPresenter(screenNavigator, 14));
                }
                if (!(screen instanceof GenericErrorScreen)) {
                    return null;
                }
                CheckDepositAmountPresenter.MetroFactory metroFactory5 = ((GenericErrorPresenter$Factory$Impl) obj).delegateFactory;
                AndroidActivityFinisher androidActivityFinisher4 = (AndroidActivityFinisher) metroFactory5.blockerFlowAnalytics.invoke();
                FlowStarter flowStarter2 = (FlowStarter) metroFactory5.analytics.getValue();
                androidActivityFinisher4.getClass();
                flowStarter2.getClass();
                return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter(androidActivityFinisher4, flowStarter2, screenNavigator, 29));
            case 9:
                screen.getClass();
                if (screen instanceof OnboardingAccountPickerErrorScreen) {
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((OnboardingAccountPickerErrorScreen) screen, screenNavigator));
                }
                if (!(screen instanceof OnboardingAccountPickerScreen)) {
                    if (screen instanceof OnboardingAccountPickerOptionsMenuScreen) {
                        AndroidStringManager androidStringManager19 = (AndroidStringManager) ((AccountPickerOptionsMenuPresenter$Factory$Impl) obj2).delegateFactory.stringManager.lambda.invoke();
                        androidStringManager19.getClass();
                        return MoleculePresenterKt.asPresenter$default(new CardStudioUndoDialogPresenter(androidStringManager19, screenNavigator, 3));
                    }
                    if (!(screen instanceof OnboardingAliasPickerScreen)) {
                        if (screen instanceof OnboardingConfirmAccountRemovalScreen) {
                            return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((OnboardingConfirmAccountRemovalScreen) screen, screenNavigator));
                        }
                        return null;
                    }
                    NodeChain nodeChain3 = ((AliasPickerPresenter$Factory$Impl) obj).delegateFactory;
                    ReturningCustomerLoginFlowService returningCustomerLoginFlowService = (ReturningCustomerLoginFlowService) ((DoubleCheck) nodeChain3.layoutNode).getValue();
                    RealBackupService realBackupService = (RealBackupService) ((LambdaProvider) nodeChain3.sentinelHead).lambda.invoke();
                    AndroidStringManager androidStringManager20 = (AndroidStringManager) ((LambdaProvider) nodeChain3.innerCoordinator).lambda.invoke();
                    FlowStarter flowStarter3 = (FlowStarter) ((DoubleCheck) nodeChain3.outerCoordinator).getValue();
                    BlockersDataNavigator blockersDataNavigator3 = (BlockersDataNavigator) ((Provider) nodeChain3.tail).invoke();
                    RealSelectedAliasRegistrar realSelectedAliasRegistrar = (RealSelectedAliasRegistrar) ((Provider) nodeChain3.head).invoke();
                    Analytics analytics8 = (Analytics) ((DoubleCheck) nodeChain3.current).getValue();
                    BooleanPreference booleanPreference2 = (BooleanPreference) ((Provider) nodeChain3.buffer).invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) ((LambdaProvider) nodeChain3.stack).lambda.invoke();
                    SampleStrategy sampleStrategy2 = (SampleStrategy) ((Provider) nodeChain3.cachedDiffer).invoke();
                    returningCustomerLoginFlowService.getClass();
                    realBackupService.getClass();
                    androidStringManager20.getClass();
                    flowStarter3.getClass();
                    blockersDataNavigator3.getClass();
                    realSelectedAliasRegistrar.getClass();
                    analytics8.getClass();
                    booleanPreference2.getClass();
                    errorReporter2.getClass();
                    sampleStrategy2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardLockPresenter(returningCustomerLoginFlowService, realBackupService, androidStringManager20, flowStarter3, blockersDataNavigator3, realSelectedAliasRegistrar, analytics8, booleanPreference2, errorReporter2, sampleStrategy2, (OnboardingAliasPickerScreen) screen, screenNavigator));
                }
                FilesetUploadPresenter.MetroFactory metroFactory6 = ((AccountPickerPresenter$Factory$Impl) obj3).delegateFactory;
                BlockersDataNavigator blockersDataNavigator4 = (BlockersDataNavigator) metroFactory6.blockersNavigator.invoke();
                RealSelectedAliasRegistrar realSelectedAliasRegistrar2 = (RealSelectedAliasRegistrar) metroFactory6.fileTypeDescriber.invoke();
                FlowStarter flowStarter4 = (FlowStarter) metroFactory6.analytics.getValue();
                AndroidStringManager androidStringManager21 = (AndroidStringManager) metroFactory6.stringManager.lambda.invoke();
                JanusService janusService = (JanusService) metroFactory6.fileUploadService.getValue();
                ReturningCustomerLoginFlowService returningCustomerLoginFlowService2 = (ReturningCustomerLoginFlowService) metroFactory6.service.getValue();
                RealPasskeyRepository realPasskeyRepository = (RealPasskeyRepository) metroFactory6.fileValidatorFactory.invoke();
                RealPasskeyFeatureManager realPasskeyFeatureManager = (RealPasskeyFeatureManager) metroFactory6.imageFormatConverterFactory.invoke();
                RealBackupService realBackupService2 = (RealBackupService) metroFactory6.errorReporter.lambda.invoke();
                Analytics analytics9 = (Analytics) ((DoubleCheck) metroFactory6.franklinAppService).getValue();
                BooleanPreference booleanPreference3 = (BooleanPreference) metroFactory6.blockersHelperFactory.invoke();
                SessionManager sessionManager = (SessionManager) metroFactory6.fileProvider.lambda.invoke();
                RealPreSignInScreenLoader realPreSignInScreenLoader = (RealPreSignInScreenLoader) metroFactory6.permissionManager.invoke();
                CoroutineContext coroutineContext3 = (CoroutineContext) ((LambdaProvider) metroFactory6.storage).lambda.invoke();
                ErrorReporter errorReporter3 = (ErrorReporter) ((LambdaProvider) metroFactory6.featureFlagManager).lambda.invoke();
                SampleStrategy sampleStrategy3 = (SampleStrategy) metroFactory6.cameraLauncherFactory.invoke();
                blockersDataNavigator4.getClass();
                realSelectedAliasRegistrar2.getClass();
                flowStarter4.getClass();
                androidStringManager21.getClass();
                janusService.getClass();
                returningCustomerLoginFlowService2.getClass();
                realPasskeyRepository.getClass();
                realPasskeyFeatureManager.getClass();
                realBackupService2.getClass();
                analytics9.getClass();
                booleanPreference3.getClass();
                sessionManager.getClass();
                realPreSignInScreenLoader.getClass();
                coroutineContext3.getClass();
                errorReporter3.getClass();
                sampleStrategy3.getClass();
                return MoleculePresenterKt.asPresenter$default(new TabToolbarPresenter((OnboardingAccountPickerScreen) screen, screenNavigator, blockersDataNavigator4, realSelectedAliasRegistrar2, flowStarter4, androidStringManager21, janusService, returningCustomerLoginFlowService2, realPasskeyRepository, realPasskeyFeatureManager, realBackupService2, analytics9, booleanPreference3, sessionManager, realPreSignInScreenLoader, coroutineContext3, errorReporter3, sampleStrategy3));
            case 10:
                screen.getClass();
                if (!(screen instanceof PaymentScreens$HomeScreens$PaymentPad)) {
                    if (!(screen instanceof LitePaymentPadSheetScreen)) {
                        if (!(screen instanceof LowDiskSpaceAlertDialogScreen)) {
                            return null;
                        }
                        CardStudioPresenter.MetroFactory metroFactory7 = ((LowDiskSpaceAlertPresenter$Factory$Impl) obj).delegateFactory;
                        Context context = (Context) metroFactory7.analytics.getValue();
                        AndroidStringManager androidStringManager22 = (AndroidStringManager) metroFactory7.ioContext.lambda.invoke();
                        Analytics analytics10 = (Analytics) metroFactory7.appConfig.getValue();
                        Storage storage = (Storage) metroFactory7.cashDatabase.getValue();
                        context.getClass();
                        androidStringManager22.getClass();
                        analytics10.getClass();
                        storage.getClass();
                        return MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter(context, androidStringManager22, analytics10, storage, screenNavigator, (LowDiskSpaceAlertDialogScreen) screen));
                    }
                    LitePaymentPadPresenter$MetroFactory litePaymentPadPresenter$MetroFactory = ((LitePaymentPadPresenter$Factory$Impl) obj2).delegateFactory;
                    RealProfileManager realProfileManager3 = (RealProfileManager) litePaymentPadPresenter$MetroFactory.profileManager.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) litePaymentPadPresenter$MetroFactory.uuidGenerator.lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) litePaymentPadPresenter$MetroFactory.moneyFormatterFactory.invoke();
                    AndroidStringManager androidStringManager23 = (AndroidStringManager) litePaymentPadPresenter$MetroFactory.stringManager.lambda.invoke();
                    CashPaymentPadOutboundNavigator$Factory$Impl cashPaymentPadOutboundNavigator$Factory$Impl = (CashPaymentPadOutboundNavigator$Factory$Impl) litePaymentPadPresenter$MetroFactory.paymentPadOutboundNavigatorFactory.invoke();
                    RealFxExchangeRateStreamingSubscriber realFxExchangeRateStreamingSubscriber = (RealFxExchangeRateStreamingSubscriber) litePaymentPadPresenter$MetroFactory.fxExchangeRateStreamingSubscriber.getValue();
                    realProfileManager3.getClass();
                    realUuidGenerator.getClass();
                    factory2.getClass();
                    androidStringManager23.getClass();
                    cashPaymentPadOutboundNavigator$Factory$Impl.getClass();
                    realFxExchangeRateStreamingSubscriber.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter(realProfileManager3, realUuidGenerator, factory2, androidStringManager23, cashPaymentPadOutboundNavigator$Factory$Impl, realFxExchangeRateStreamingSubscriber, screenNavigator));
                }
                HomeViewPresenter.MetroFactory metroFactory8 = ((HomeViewPresenter$Factory$Impl) obj3).delegateFactory;
                Analytics analytics11 = (Analytics) metroFactory8.analytics.invoke();
                RealProfileManager realProfileManager4 = (RealProfileManager) metroFactory8.profileManager.invoke();
                RealOverlayAppMessageReader realOverlayAppMessageReader2 = (RealOverlayAppMessageReader) metroFactory8.overlayAppMessageReader.invoke();
                EglCore eglCore5 = (EglCore) ((RealGlobalConfigManager.MetroFactory) metroFactory8.inAppReviewLauncher).invoke();
                RealRequestReviewFlagWrapper realRequestReviewFlagWrapper = (RealRequestReviewFlagWrapper) metroFactory8.requestReviewFlagWrapper.invoke();
                CashPaymentPadOutboundNavigator$Factory$Impl cashPaymentPadOutboundNavigator$Factory$Impl2 = (CashPaymentPadOutboundNavigator$Factory$Impl) metroFactory8.paymentPadOutboundNavigatorFactory.invoke();
                TabToolbarPresenter$Factory$Impl tabToolbarPresenter$Factory$Impl2 = (TabToolbarPresenter$Factory$Impl) metroFactory8.tabToolbarPresenterFactory.invoke();
                MainPaymentPadPresenter$Factory$Impl mainPaymentPadPresenter$Factory$Impl = (MainPaymentPadPresenter$Factory$Impl) ((InstanceFactory) metroFactory8.mainPaymentPadPresenterFactory).value;
                RealAlertBannerPresenter$Factory$Impl realAlertBannerPresenter$Factory$Impl = (RealAlertBannerPresenter$Factory$Impl) metroFactory8.alertBannerPresenterFactory.invoke();
                FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) metroFactory8.featureFlagManager.invoke();
                RealLowDiskSpaceAlertManager realLowDiskSpaceAlertManager = (RealLowDiskSpaceAlertManager) ((RealBadger2.MetroFactory) metroFactory8.lowDiskSpaceAlertManager).invoke();
                RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) metroFactory8.p2pSettingsManager.invoke();
                RealPaymentTabSettings realPaymentTabSettings = (RealPaymentTabSettings) metroFactory8.paymentTabSettings.invoke();
                RealSessionFlags realSessionFlags = (RealSessionFlags) metroFactory8.sessionFlags.invoke();
                RealUuidGenerator realUuidGenerator2 = (RealUuidGenerator) metroFactory8.uuidGenerator.invoke();
                RealNearbyPermissionStateProvider realNearbyPermissionStateProvider = (RealNearbyPermissionStateProvider) metroFactory8.nearbyPermissionStateProvider.invoke();
                KeyValue keyValue2 = (KeyValue) metroFactory8.hasSeenQrShortcutsOnboarding.invoke();
                KeyValue keyValue3 = (KeyValue) metroFactory8.qrShortcutsOnboardingAppStarts.invoke();
                QrShortcutInstaller qrShortcutInstaller = (QrShortcutInstaller) metroFactory8.qrShortcutInstaller.invoke();
                Flow flow2 = (Flow) metroFactory8.badgingState.invoke();
                MoneybotFlagsHelper moneybotFlagsHelper = (MoneybotFlagsHelper) metroFactory8.moneybotFlagsHelper.invoke();
                analytics11.getClass();
                realProfileManager4.getClass();
                realOverlayAppMessageReader2.getClass();
                realRequestReviewFlagWrapper.getClass();
                cashPaymentPadOutboundNavigator$Factory$Impl2.getClass();
                tabToolbarPresenter$Factory$Impl2.getClass();
                mainPaymentPadPresenter$Factory$Impl.getClass();
                realAlertBannerPresenter$Factory$Impl.getClass();
                featureFlagManager2.getClass();
                realP2pSettingsManager.getClass();
                realPaymentTabSettings.getClass();
                realSessionFlags.getClass();
                realUuidGenerator2.getClass();
                realNearbyPermissionStateProvider.getClass();
                keyValue2.getClass();
                keyValue3.getClass();
                qrShortcutInstaller.getClass();
                flow2.getClass();
                moneybotFlagsHelper.getClass();
                return MoleculePresenterKt.asPresenter$default(new HomeViewPresenter(analytics11, realProfileManager4, realOverlayAppMessageReader2, eglCore5, realRequestReviewFlagWrapper, cashPaymentPadOutboundNavigator$Factory$Impl2, tabToolbarPresenter$Factory$Impl2, mainPaymentPadPresenter$Factory$Impl, realAlertBannerPresenter$Factory$Impl, featureFlagManager2, realLowDiskSpaceAlertManager, realP2pSettingsManager, realPaymentTabSettings, realSessionFlags, realUuidGenerator2, realNearbyPermissionStateProvider, keyValue2, keyValue3, qrShortcutInstaller, screenNavigator, flow2, moneybotFlagsHelper));
            default:
                screen.getClass();
                if (screen instanceof SecurityHubScreen) {
                    SecurityHubPresenter$MetroFactory securityHubPresenter$MetroFactory = ((SecurityHubPresenter$Factory$Impl) obj3).delegateFactory;
                    Analytics analytics12 = (Analytics) securityHubPresenter$MetroFactory.analytics.getValue();
                    ProtectionsSectionPresenter$Factory$Impl protectionsSectionPresenter$Factory$Impl = (ProtectionsSectionPresenter$Factory$Impl) securityHubPresenter$MetroFactory.protectionsSectionPresenterFactory.value;
                    analytics12.getClass();
                    protectionsSectionPresenter$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter((SecurityHubScreen) screen, screenNavigator, analytics12, protectionsSectionPresenter$Factory$Impl));
                }
                if (screen instanceof BookletScreen) {
                    VerifyCheckDepositPresenter.MetroFactory metroFactory9 = ((BookletPresenter$Factory$Impl) obj2).delegateFactory;
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) metroFactory9.blockerFlowAnalytics.invoke();
                    FlowStarter flowStarter5 = (FlowStarter) metroFactory9.analytics.getValue();
                    RealIdentityVerificationRepo realIdentityVerificationRepo = (RealIdentityVerificationRepo) metroFactory9.blockersNavigator.invoke();
                    AndroidStringManager androidStringManager24 = (AndroidStringManager) metroFactory9.stringManager.lambda.invoke();
                    RealSupportNavigator realSupportNavigator = (RealSupportNavigator) metroFactory9.moneyFormatterFactory.invoke();
                    Analytics analytics13 = (Analytics) metroFactory9.appService.getValue();
                    realBlockersHelper$Factory$Impl.getClass();
                    flowStarter5.getClass();
                    realIdentityVerificationRepo.getClass();
                    androidStringManager24.getClass();
                    realSupportNavigator.getClass();
                    analytics13.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter((BookletScreen) screen, screenNavigator, realBlockersHelper$Factory$Impl, flowStarter5, realIdentityVerificationRepo, androidStringManager24, realSupportNavigator, analytics13));
                }
                if (!(screen instanceof RecoveryGuideScreen)) {
                    return null;
                }
                RecoveryGuidePresenter$MetroFactory recoveryGuidePresenter$MetroFactory = ((RecoveryGuidePresenter$Factory$Impl) obj).delegateFactory;
                AndroidStringManager androidStringManager25 = (AndroidStringManager) recoveryGuidePresenter$MetroFactory.stringManager.lambda.invoke();
                RealSupportNavigator realSupportNavigator2 = (RealSupportNavigator) recoveryGuidePresenter$MetroFactory.supportNavigator.invoke();
                RealPasscodeFlowStarter realPasscodeFlowStarter = (RealPasscodeFlowStarter) recoveryGuidePresenter$MetroFactory.passcodeFlowStarter.invoke();
                RealDeviceManagerInboundNavigator$Factory$Impl realDeviceManagerInboundNavigator$Factory$Impl = (RealDeviceManagerInboundNavigator$Factory$Impl) recoveryGuidePresenter$MetroFactory.deviceManagerInboundNavigatorFactory.invoke();
                RealIntentFactory realIntentFactory2 = (RealIntentFactory) recoveryGuidePresenter$MetroFactory.intentFactory.getValue();
                Activity activity2 = (Activity) recoveryGuidePresenter$MetroFactory.activity.value;
                Analytics analytics14 = (Analytics) recoveryGuidePresenter$MetroFactory.analytics.getValue();
                androidStringManager25.getClass();
                realSupportNavigator2.getClass();
                realPasscodeFlowStarter.getClass();
                realDeviceManagerInboundNavigator$Factory$Impl.getClass();
                realIntentFactory2.getClass();
                activity2.getClass();
                analytics14.getClass();
                return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter((RecoveryGuideScreen) screen, screenNavigator, androidStringManager25, realSupportNavigator2, realPasscodeFlowStarter, realDeviceManagerInboundNavigator$Factory$Impl, realIntentFactory2, activity2, analytics14));
        }
    }

    public /* synthetic */ WalletPresenterFactory(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.walletHome = obj;
        this.cardLock = obj2;
        this.presentationTimeline = obj3;
    }

    public /* synthetic */ WalletPresenterFactory(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.walletHome = obj;
        this.cardLock = obj2;
        this.presentationTimeline = obj3;
    }

    public WalletPresenterFactory(CashAppPaySettingsPresenter$Factory$Impl cashAppPaySettingsPresenter$Factory$Impl, LinkedBusinessDetailsPresenter$Factory$Impl linkedBusinessDetailsPresenter$Factory$Impl, ConfirmRemoveLinkedBusinessPresenter$Factory$Impl confirmRemoveLinkedBusinessPresenter$Factory$Impl, UnlinkResultPresenter$Factory$Impl unlinkResultPresenter$Factory$Impl) {
        this.$r8$classId = 2;
        this.walletHome = cashAppPaySettingsPresenter$Factory$Impl;
        this.cardLock = linkedBusinessDetailsPresenter$Factory$Impl;
        this.presentationTimeline = unlinkResultPresenter$Factory$Impl;
    }
}
