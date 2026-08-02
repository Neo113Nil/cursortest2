package com.squareup.cash.work.presenters;

import android.os.Build;
import androidx.compose.ui.node.NodeChain;
import androidx.emoji2.text.MetadataRepo;
import androidx.glance.layout.PaddingKt;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.cdp.persistence.repository.PersistedEventRepository;
import app.cash.local.backend.MarkMarketingMessageAsViewed$MetroFactory;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import coil3.ImageLoader$Builder;
import com.bugsnag.android.DeviceBuildInfo;
import com.fillr.n;
import com.google.android.material.button.MaterialButton$$ExternalSyntheticLambda3;
import com.google.mlkit.vision.text.internal.zzr;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.VariantAppComponent;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.banking.backend.real.RealConfirmCashOutVersionCodeProvider;
import com.squareup.cash.banking.navigation.real.RealBankingOutboundNavigator$Factory$Impl;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.PasscodeConfirmTypeTransformer;
import com.squareup.cash.blockers.presenters.SignaturePresenter$MetroFactory;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.card.onboarding.CardStudioPresenterV2$MetroFactory;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.StampSheetPresenter$MetroFactory;
import com.squareup.cash.cashapplite.presenters.LiteActivityPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.db2.OfflineConfig;
import com.squareup.cash.e2ee.trifle.RealTrifleService;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.gps.backend.real.AndroidLocationProvider;
import com.squareup.cash.history.presenters.ReportAbusePresenter$MetroFactory;
import com.squareup.cash.history.presenters.SkipPaymentPresenter$MetroFactory;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentLinkingOptionManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.paychecks.presenters.HelpSheetPresenter$MetroFactory;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.profile.presenters.ErrorPresenter;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.TransferInPresenter$MetroFactory;
import com.squareup.cash.savings.presenters.TransferringPresenter$MetroFactory;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.support.backend.api.transaction.SupportTransactionService;
import com.squareup.cash.support.backend.real.RealDisputesTrackerMapper;
import com.squareup.cash.support.backend.real.RealDisputesTrackerService;
import com.squareup.cash.support.backend.real.RealSearchPlaceholderProvider;
import com.squareup.cash.support.backend.real.RealSupportEmailValidationService;
import com.squareup.cash.support.backend.real.RealSupportFlowManager;
import com.squareup.cash.support.backend.real.RealSupportHomeService;
import com.squareup.cash.support.backend.real.RealSupportPhoneService;
import com.squareup.cash.support.backend.real.RealSupportStatus;
import com.squareup.cash.support.backend.real.RealSupportViewedArticlesStore;
import com.squareup.cash.support.backend.real.articles.RealArticlesService;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.support.incidents.backend.real.RealIncidentsService;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.presenters.ArticlePresenter;
import com.squareup.cash.support.presenters.ArticlePresenter$Factory$Impl;
import com.squareup.cash.support.presenters.ContactSupportEmailInputPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.ContactSupportEmailMessagePresenter$Factory$Impl;
import com.squareup.cash.support.presenters.PhoneVerificationPresenter;
import com.squareup.cash.support.presenters.PhoneVerificationPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.RealContactSupportNavigator;
import com.squareup.cash.support.presenters.RealSupportLinkNavigator;
import com.squareup.cash.support.presenters.RealViewTokenGenerator;
import com.squareup.cash.support.presenters.ScreenshotConfirmPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.ScreenshotReviewPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportActivityItemPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportActivityPickerPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportArticleIncidentsSheetPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportDisputeTrackerPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportFlowCheckConnectionPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportHomeContactOptionsSheetPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportHomePresenter;
import com.squareup.cash.support.presenters.SupportHomePresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportIncidentDetailsPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportLoadClientScenarioPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportPhoneStatusPresenter;
import com.squareup.cash.support.presenters.SupportPhoneStatusPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportSearchPresenter;
import com.squareup.cash.support.presenters.SupportSearchPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportTransactionConfirmationPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.UnauthenticatedArticlePresenter$Factory$Impl;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screens.SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen;
import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.tax.presenters.TaxAuthorizationPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.presenters.TaxTooltipPresenter$MetroFactory;
import com.squareup.cash.transfers.backend.api.ScheduledReloadsManager;
import com.squareup.cash.transfers.backend.real.RealBalanceBasedAddCashManager;
import com.squareup.cash.transfers.backend.real.RealTransferRequirementHandler;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;
import com.squareup.cash.transfers.presenters.AddMoneyPresenter;
import com.squareup.cash.transfers.presenters.AddMoneyPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.BalanceBasedAddCashDisabledDialogPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.BalanceBasedAutoReloadConfirmationPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter;
import com.squareup.cash.transfers.presenters.InstrumentDetailsPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.InstrumentLinkingOptionsPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.InstrumentNotLinkedPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.LinkedAccountsNuxPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter;
import com.squareup.cash.transfers.presenters.LinkedAccountsPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.PendingTransfersConfirmationDialogPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.RecurringReloadConfigurationPresenter;
import com.squareup.cash.transfers.presenters.RecurringReloadConfigurationPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.RecurringReloadOptionPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.RecurringReloadsChangeInstrumentPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.RecurringReloadsDismissDialogPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.ScheduledReloadConfirmationPresenter;
import com.squareup.cash.transfers.presenters.ScheduledReloadConfirmationPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.SetDefaultInstrumentPresenter;
import com.squareup.cash.transfers.presenters.SetDefaultInstrumentPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.TransferActionProcessor$Factory$Impl;
import com.squareup.cash.transfers.presenters.TransfersRouterPresenter$Factory$Impl;
import com.squareup.cash.transfers.presenters.WithdrawPresenter;
import com.squareup.cash.transfers.presenters.WithdrawPresenter$Factory$Impl;
import com.squareup.cash.transfers.screens.AddMoneyScreen;
import com.squareup.cash.transfers.screens.BalanceBasedAddCashDisabledDialogScreen;
import com.squareup.cash.transfers.screens.BalanceBasedAutoReloadConfirmationScreen;
import com.squareup.cash.transfers.screens.InstrumentDetailsScreen;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsScreen;
import com.squareup.cash.transfers.screens.InstrumentNotLinkedScreen;
import com.squareup.cash.transfers.screens.LinkedAccountsNuxScreen;
import com.squareup.cash.transfers.screens.LinkedAccountsScreen;
import com.squareup.cash.transfers.screens.PendingTransfersConfirmationDialog;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationScreen;
import com.squareup.cash.transfers.screens.RecurringReloadOptionScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsChangeInstrumentScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsDismissDialogScreen;
import com.squareup.cash.transfers.screens.ScheduledReloadConfirmationScreen;
import com.squareup.cash.transfers.screens.SetDefaultInstrumentScreen;
import com.squareup.cash.transfers.screens.TransfersRouterScreen;
import com.squareup.cash.transfers.screens.WithdrawScreen;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.ui.CashNavigationLogger;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.api.GetClockInEssentialsUseCase;
import com.squareup.cash.work.data.api.PayDataLoader;
import com.squareup.cash.work.data.real.RealAssignedJobProvider;
import com.squareup.cash.work.data.real.RealClockInEssentialsProvider;
import com.squareup.cash.work.data.real.RealDashboardScheduleProvider;
import com.squareup.cash.work.data.real.RealLastClockedInInfoUseCase;
import com.squareup.cash.work.data.real.RealSelectedMerchantDataProvider;
import com.squareup.cash.work.data.real.RealShiftDataLoader$Factory$Impl;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.data.real.RealTaxFormDownloader$MetroFactory;
import com.squareup.cash.work.presenters.pay.PayHistoryListPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.pay.PayHistoryListPresenter$MetroFactory;
import com.squareup.cash.work.presenters.pay.PayHistoryListViewModelMapper;
import com.squareup.cash.work.presenters.pay.PayHomePresenter;
import com.squareup.cash.work.presenters.pay.PayHomePresenter$Factory$Impl;
import com.squareup.cash.work.presenters.pay.RealPayCellPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.pay.TaxFormDownloaderPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.pay.TaxFormsListPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.providers.RealAssignedLocationProvider;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider;
import com.squareup.cash.work.presenters.shift.ClockInBottomSheetPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.ClockInOverlayMapper$MetroFactory;
import com.squareup.cash.work.presenters.shift.ClockInOverlayPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.DashboardShiftMapper$MetroFactory;
import com.squareup.cash.work.presenters.shift.DeclareCashTipBottomSheetPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.presenters.shift.RealShiftSection2Presenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.ShiftDetailMapper;
import com.squareup.cash.work.presenters.shift.ShiftDetailPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.ShiftListPresenter;
import com.squareup.cash.work.presenters.shift.ShiftListPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.ShiftNotStartedDialogPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.ShiftNotePresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.TakeBreakBottomSheetPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.TimecardDetailPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.geofence.GeofenceStateResolver;
import com.squareup.cash.work.screens.ClockInBottomSheetScreen;
import com.squareup.cash.work.screens.ClockInOverlayScreen;
import com.squareup.cash.work.screens.DeclareCashTipBottomSheetScreen;
import com.squareup.cash.work.screens.MerchantPickerBottomSheetScreen;
import com.squareup.cash.work.screens.ShiftDetailScreen;
import com.squareup.cash.work.screens.ShiftListScreen;
import com.squareup.cash.work.screens.ShiftNotStartedDialogScreen;
import com.squareup.cash.work.screens.ShiftNoteScreen;
import com.squareup.cash.work.screens.TakeBreakBottomSheetScreen;
import com.squareup.cash.work.screens.TimecardDetailScreen;
import com.squareup.cash.work.screens.WorkHomeScreen;
import com.squareup.cash.work.screens.WorkPayHistoryListScreen;
import com.squareup.cash.work.screens.WorkPayHomeScreen;
import com.squareup.cash.work.screens.WorkTaxFormDownloaderScreen;
import com.squareup.cash.work.screens.WorkTaxFormsListScreen;
import com.squareup.cash.work.service.api.payroll.PayrollJsonService;
import com.squareup.cash.work.service.api.taxforms.TaxFormsService;
import com.squareup.cash.work.session.RealCurrentUserProvider;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.session.RealSelectedMerchantSetter;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.cash.work.tinygraph.real.RealPersonRepository;
import com.squareup.cash.work.webview.presenters.OtkRedirectUseCase;
import com.squareup.cash.work.webview.presenters.WorkWebPresenter$Factory$Impl;
import com.squareup.cash.work.webview.screens.WorkWebScreen;
import com.squareup.kotterknife.Lazy;
import com.squareup.moshi.Moshi;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.scannerview.SizeMap;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.task.RepeatTaskExecutor;
import com.squareup.wire.internal.RealGrpcStreamingCall;
import com.stripe.hcaptcha.HCaptcha;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;
import net.idrnd.misnap.iad.Payload;
import retrofit2.Retrofit;

/* loaded from: classes.dex */
public final class WorkPresenterFactory implements PresenterFactory {
    public final /* synthetic */ int $r8$classId = 1;
    public final Object clockInBottomSheetPresenterFactory;
    public final Object clockInOverlayPresenterFactory;
    public final Object declareCashTipBottomSheetPresenterFactory;
    public final Object merchantPickerPresenterFactory;
    public final Object payHistoryListPresenterFactory;
    public final Object payHomePresenterFactory;
    public final Object shiftDetailPresenterFactory;
    public final Object shiftListPresenterFactory;
    public final Object shiftNotStartedPresenterFactory;
    public final Object shiftNotePresenterFactory;
    public final Object takeBreakBottomSheetPresenterFactory;
    public final Object taxFormDownloaderPresenterFactory;
    public final Object taxFormsListPresenterFactory;
    public final Object workHomePresenterFactory;
    public final Object workWebPresenterFactory;

    public WorkPresenterFactory(BalanceBasedAutoReloadConfirmationPresenter$Factory$Impl balanceBasedAutoReloadConfirmationPresenter$Factory$Impl, BalanceBasedAddCashDisabledDialogPresenter$Factory$Impl balanceBasedAddCashDisabledDialogPresenter$Factory$Impl, PendingTransfersConfirmationDialogPresenter$Factory$Impl pendingTransfersConfirmationDialogPresenter$Factory$Impl, WithdrawPresenter$Factory$Impl withdrawPresenter$Factory$Impl, LinkedAccountsPresenter$Factory$Impl linkedAccountsPresenter$Factory$Impl, LinkedAccountsNuxPresenter$Factory$Impl linkedAccountsNuxPresenter$Factory$Impl, InstrumentDetailsPresenter$Factory$Impl instrumentDetailsPresenter$Factory$Impl, InstrumentLinkingOptionsPresenter$Factory$Impl instrumentLinkingOptionsPresenter$Factory$Impl, AddMoneyPresenter$Factory$Impl addMoneyPresenter$Factory$Impl, InstrumentNotLinkedPresenter$Factory$Impl instrumentNotLinkedPresenter$Factory$Impl, TransfersRouterPresenter$Factory$Impl transfersRouterPresenter$Factory$Impl, SetDefaultInstrumentPresenter$Factory$Impl setDefaultInstrumentPresenter$Factory$Impl, RecurringReloadOptionPresenter$Factory$Impl recurringReloadOptionPresenter$Factory$Impl, RecurringReloadConfigurationPresenter$Factory$Impl recurringReloadConfigurationPresenter$Factory$Impl, RecurringReloadsChangeInstrumentPresenter$Factory$Impl recurringReloadsChangeInstrumentPresenter$Factory$Impl, RecurringReloadsDismissDialogPresenter$Factory$Impl recurringReloadsDismissDialogPresenter$Factory$Impl, ScheduledReloadConfirmationPresenter$Factory$Impl scheduledReloadConfirmationPresenter$Factory$Impl) {
        this.workHomePresenterFactory = balanceBasedAutoReloadConfirmationPresenter$Factory$Impl;
        this.workWebPresenterFactory = pendingTransfersConfirmationDialogPresenter$Factory$Impl;
        this.merchantPickerPresenterFactory = withdrawPresenter$Factory$Impl;
        this.clockInBottomSheetPresenterFactory = linkedAccountsPresenter$Factory$Impl;
        this.clockInOverlayPresenterFactory = linkedAccountsNuxPresenter$Factory$Impl;
        this.takeBreakBottomSheetPresenterFactory = instrumentDetailsPresenter$Factory$Impl;
        this.declareCashTipBottomSheetPresenterFactory = instrumentLinkingOptionsPresenter$Factory$Impl;
        this.shiftNotStartedPresenterFactory = addMoneyPresenter$Factory$Impl;
        this.shiftNotePresenterFactory = instrumentNotLinkedPresenter$Factory$Impl;
        this.payHomePresenterFactory = setDefaultInstrumentPresenter$Factory$Impl;
        this.payHistoryListPresenterFactory = recurringReloadOptionPresenter$Factory$Impl;
        this.taxFormsListPresenterFactory = recurringReloadConfigurationPresenter$Factory$Impl;
        this.taxFormDownloaderPresenterFactory = recurringReloadsChangeInstrumentPresenter$Factory$Impl;
        this.shiftDetailPresenterFactory = recurringReloadsDismissDialogPresenter$Factory$Impl;
        this.shiftListPresenterFactory = scheduledReloadConfirmationPresenter$Factory$Impl;
    }

    private final Presenter create$com$squareup$cash$support$presenters$SupportPresenterFactory(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        screen.getClass();
        if (screen instanceof SupportScreens.FlowScreens.ArticleScreen) {
            ArticlePresenter.MetroFactory metroFactory = ((ArticlePresenter$Factory$Impl) this.workHomePresenterFactory).delegateFactory;
            RealArticlesService realArticlesService = (RealArticlesService) ((DoubleCheck) metroFactory.articlesService).getValue();
            SupportTransactionService supportTransactionService = (SupportTransactionService) ((DoubleCheck) metroFactory.transactionService).getValue();
            RealContactSupportNavigator realContactSupportNavigator = (RealContactSupportNavigator) metroFactory.contactSupportNavigator.invoke();
            RealSupportLinkNavigator realSupportLinkNavigator = (RealSupportLinkNavigator) metroFactory.linkNavigator.invoke();
            RealSupportViewedArticlesStore realSupportViewedArticlesStore = (RealSupportViewedArticlesStore) metroFactory.viewedArticlesStore.invoke();
            Analytics analytics = (Analytics) ((DoubleCheck) metroFactory.analytics).getValue();
            RealSupportPhoneService realSupportPhoneService = (RealSupportPhoneService) ((DoubleCheck) metroFactory.supportPhoneService).getValue();
            RealSupportStatus realSupportStatus = (RealSupportStatus) metroFactory.supportStatus.invoke();
            RealIncidentsService realIncidentsService = (RealIncidentsService) ((DoubleCheck) metroFactory.incidentsService).getValue();
            AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) metroFactory.stringManager).lambda.invoke();
            AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) ((LambdaProvider) metroFactory.dateFormatManager).lambda.invoke();
            AndroidClock androidClock = (AndroidClock) ((LambdaProvider) metroFactory.clock).lambda.invoke();
            RealObservabilityManager realObservabilityManager = (RealObservabilityManager) ((LambdaProvider) metroFactory.observabilityManager).lambda.invoke();
            ActivityDataBridge activityDataBridge = (ActivityDataBridge) ((DoubleCheck) metroFactory.activityDataBridge).getValue();
            IntentLauncher intentLauncher = (IntentLauncher) metroFactory.launcher.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.routerFactory.invoke();
            Moshi moshi = (Moshi) ((LambdaProvider) metroFactory.moshi).lambda.invoke();
            RealViewTokenGenerator realViewTokenGenerator = (RealViewTokenGenerator) ((DoubleCheck) metroFactory.viewTokenGenerator).getValue();
            realArticlesService.getClass();
            supportTransactionService.getClass();
            realContactSupportNavigator.getClass();
            realSupportLinkNavigator.getClass();
            realSupportViewedArticlesStore.getClass();
            analytics.getClass();
            realSupportPhoneService.getClass();
            realSupportStatus.getClass();
            realIncidentsService.getClass();
            androidStringManager.getClass();
            androidDateFormatManager.getClass();
            androidClock.getClass();
            realObservabilityManager.getClass();
            activityDataBridge.getClass();
            intentLauncher.getClass();
            realRouter$Factory$Impl.getClass();
            moshi.getClass();
            realViewTokenGenerator.getClass();
            return MoleculePresenterKt.asPresenter$default(new ArticlePresenter(realArticlesService, supportTransactionService, realContactSupportNavigator, realSupportLinkNavigator, realSupportViewedArticlesStore, analytics, realSupportPhoneService, realSupportStatus, realIncidentsService, androidStringManager, androidDateFormatManager, androidClock, realObservabilityManager, activityDataBridge, intentLauncher, realRouter$Factory$Impl, moshi, realViewTokenGenerator, screenNavigator, (SupportScreens.FlowScreens.ArticleScreen) screen));
        }
        if (screen instanceof SupportScreens.ContactScreens.ContactSupportEmailInputScreen) {
            SkipPaymentPresenter$MetroFactory skipPaymentPresenter$MetroFactory = ((ContactSupportEmailInputPresenter$Factory$Impl) this.workWebPresenterFactory).delegateFactory;
            Analytics analytics2 = (Analytics) skipPaymentPresenter$MetroFactory.activityEntityManager.getValue();
            AndroidStringManager androidStringManager2 = (AndroidStringManager) skipPaymentPresenter$MetroFactory.stringManager.lambda.invoke();
            RealSupportEmailValidationService realSupportEmailValidationService = (RealSupportEmailValidationService) skipPaymentPresenter$MetroFactory.paymentManager.getValue();
            analytics2.getClass();
            androidStringManager2.getClass();
            realSupportEmailValidationService.getClass();
            return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(analytics2, androidStringManager2, realSupportEmailValidationService, (SupportScreens.ContactScreens.ContactSupportEmailInputScreen) screen, screenNavigator));
        }
        if (screen instanceof SupportScreens.ContactScreens.ContactSupportMessageScreen) {
            SkipPaymentPresenter$MetroFactory skipPaymentPresenter$MetroFactory2 = ((ContactSupportEmailMessagePresenter$Factory$Impl) this.merchantPickerPresenterFactory).delegateFactory;
            AppService appService = (AppService) skipPaymentPresenter$MetroFactory2.activityEntityManager.getValue();
            AndroidStringManager androidStringManager3 = (AndroidStringManager) skipPaymentPresenter$MetroFactory2.stringManager.lambda.invoke();
            Analytics analytics3 = (Analytics) skipPaymentPresenter$MetroFactory2.paymentManager.getValue();
            appService.getClass();
            androidStringManager3.getClass();
            analytics3.getClass();
            return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(appService, androidStringManager3, analytics3, (SupportScreens.ContactScreens.ContactSupportMessageScreen) screen, screenNavigator));
        }
        if (screen instanceof SupportScreens.FlowScreens.SupportHomeScreen) {
            SupportHomePresenter.MetroFactory metroFactory2 = ((SupportHomePresenter$Factory$Impl) this.clockInBottomSheetPresenterFactory).delegateFactory;
            RealSupportPhoneService realSupportPhoneService2 = (RealSupportPhoneService) metroFactory2.supportPhoneService.getValue();
            RealIncidentsService realIncidentsService2 = (RealIncidentsService) metroFactory2.incidentsService.getValue();
            AndroidStringManager androidStringManager4 = (AndroidStringManager) metroFactory2.stringManager.lambda.invoke();
            Analytics analytics4 = (Analytics) metroFactory2.analytics.getValue();
            RealSupportLinkNavigator realSupportLinkNavigator2 = (RealSupportLinkNavigator) metroFactory2.linkNavigator.invoke();
            RealObservabilityManager realObservabilityManager2 = (RealObservabilityManager) metroFactory2.observabilityManager.lambda.invoke();
            RealSupportHomeService realSupportHomeService = (RealSupportHomeService) metroFactory2.supportHomeService.getValue();
            RealSupportStatus realSupportStatus2 = (RealSupportStatus) metroFactory2.supportStatus.invoke();
            RealConversationService realConversationService = (RealConversationService) metroFactory2.conversationService.invoke();
            RealDisputesTrackerService realDisputesTrackerService = (RealDisputesTrackerService) metroFactory2.disputesTrackerService.getValue();
            RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) metroFactory2.activityEmbeddedPresenterFactory.invoke();
            SupportActivityItemPresenter$Factory$Impl supportActivityItemPresenter$Factory$Impl = (SupportActivityItemPresenter$Factory$Impl) metroFactory2.supportActivityItemPresenterFactory.invoke();
            FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory2.featureFlagManager.getValue();
            RealActivitiesCacheManager realActivitiesCacheManager = (RealActivitiesCacheManager) metroFactory2.activitiesCacheManager.getValue();
            RealActivityTokenFactory realActivityTokenFactory = (RealActivityTokenFactory) metroFactory2.activityTokenFactory.invoke();
            RealViewTokenGenerator realViewTokenGenerator2 = (RealViewTokenGenerator) metroFactory2.viewTokenGenerator.getValue();
            RealSearchPlaceholderProvider realSearchPlaceholderProvider = (RealSearchPlaceholderProvider) metroFactory2.searchPlaceholderProvider.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) metroFactory2.routerFactory.invoke();
            Moshi moshi2 = (Moshi) metroFactory2.moshi.lambda.invoke();
            realSupportPhoneService2.getClass();
            realIncidentsService2.getClass();
            androidStringManager4.getClass();
            analytics4.getClass();
            realSupportLinkNavigator2.getClass();
            realObservabilityManager2.getClass();
            realSupportHomeService.getClass();
            realSupportStatus2.getClass();
            realConversationService.getClass();
            realDisputesTrackerService.getClass();
            realActivityEmbeddedPresenter$Factory$Impl.getClass();
            supportActivityItemPresenter$Factory$Impl.getClass();
            featureFlagManager.getClass();
            realActivitiesCacheManager.getClass();
            realActivityTokenFactory.getClass();
            realViewTokenGenerator2.getClass();
            realRouter$Factory$Impl2.getClass();
            moshi2.getClass();
            return MoleculePresenterKt.asPresenter$default(new SupportHomePresenter(realSupportPhoneService2, realIncidentsService2, androidStringManager4, analytics4, realSupportLinkNavigator2, realObservabilityManager2, realSupportHomeService, realSupportStatus2, realConversationService, realDisputesTrackerService, realActivityEmbeddedPresenter$Factory$Impl, supportActivityItemPresenter$Factory$Impl, featureFlagManager, realActivitiesCacheManager, realActivityTokenFactory, realViewTokenGenerator2, realSearchPlaceholderProvider, realRouter$Factory$Impl2, moshi2, (SupportScreens.FlowScreens.SupportHomeScreen) screen, screenNavigator));
        }
        if (screen instanceof SupportScreens.PhoneVerificationScreen) {
            PhoneVerificationPresenter.MetroFactory metroFactory3 = ((PhoneVerificationPresenter$Factory$Impl) this.clockInOverlayPresenterFactory).delegateFactory;
            zzr zzrVar = (zzr) metroFactory3.phoneVerificationService.invoke();
            AndroidStringManager androidStringManager5 = (AndroidStringManager) metroFactory3.stringManager.lambda.invoke();
            Analytics analytics5 = (Analytics) metroFactory3.analytics.getValue();
            AndroidNotificationManager androidNotificationManager = (AndroidNotificationManager) metroFactory3.notificationManager.lambda.invoke();
            StateFlow stateFlow = (StateFlow) metroFactory3.activityLifecycleStates.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl3 = (RealRouter$Factory$Impl) metroFactory3.routerFactory.invoke();
            androidStringManager5.getClass();
            analytics5.getClass();
            androidNotificationManager.getClass();
            stateFlow.getClass();
            realRouter$Factory$Impl3.getClass();
            return MoleculePresenterKt.asPresenter$default(new PhoneVerificationPresenter(zzrVar, androidStringManager5, analytics5, androidNotificationManager, stateFlow, realRouter$Factory$Impl3, (SupportScreens.PhoneVerificationScreen) screen, screenNavigator));
        }
        if (screen instanceof SupportScreens.FlowScreens.SupportSearchScreen) {
            OfflineConfig.Adapter adapter = ((SupportSearchPresenter$Factory$Impl) this.takeBreakBottomSheetPresenterFactory).delegateFactory;
            RealSupportLinkNavigator realSupportLinkNavigator3 = (RealSupportLinkNavigator) ((Provider) adapter.attempted_payment_status_resultAdapter).invoke();
            MaterialButton$$ExternalSyntheticLambda3 provideSupportSearchServiceFactory$jvm = PaddingKt.provideSupportSearchServiceFactory$jvm((MarkMarketingMessageAsViewed$MetroFactory) ((RealTrifleService.MetroFactory) adapter.offline_payment_status_resultAdapter).trifleLogger);
            AndroidStringManager androidStringManager6 = (AndroidStringManager) ((LambdaProvider) adapter.attempted_bill_status_resultAdapter).lambda.invoke();
            Analytics analytics6 = (Analytics) ((DoubleCheck) adapter.offline_bill_status_resultAdapter).getValue();
            RealViewTokenGenerator realViewTokenGenerator3 = (RealViewTokenGenerator) ((DoubleCheck) adapter.attempted_cash_out_status_resultAdapter).getValue();
            RealArticlesService realArticlesService2 = (RealArticlesService) ((DoubleCheck) adapter.offline_cash_out_status_resultAdapter).getValue();
            FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) ((DoubleCheck) adapter.attempted_add_cash_status_resultAdapter).getValue();
            RealSupportPhoneService realSupportPhoneService3 = (RealSupportPhoneService) ((DoubleCheck) adapter.offline_add_cash_status_resultAdapter).getValue();
            AndroidDateFormatManager androidDateFormatManager2 = (AndroidDateFormatManager) ((LambdaProvider) adapter.error_cash_out_status_resultAdapter).lambda.invoke();
            AndroidClock androidClock2 = (AndroidClock) ((LambdaProvider) adapter.error_add_cash_status_resultAdapter).lambda.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl4 = (RealRouter$Factory$Impl) ((Provider) adapter.offline_transfer_scenario_planAdapter).invoke();
            Moshi moshi3 = (Moshi) ((LambdaProvider) adapter.error_transfer_scenario_planAdapter).lambda.invoke();
            RealSupportFlowManager realSupportFlowManager = (RealSupportFlowManager) ((Provider) adapter.retry_intervalsAdapter).invoke();
            realSupportLinkNavigator3.getClass();
            androidStringManager6.getClass();
            analytics6.getClass();
            realViewTokenGenerator3.getClass();
            realArticlesService2.getClass();
            featureFlagManager2.getClass();
            realSupportPhoneService3.getClass();
            androidDateFormatManager2.getClass();
            androidClock2.getClass();
            realRouter$Factory$Impl4.getClass();
            moshi3.getClass();
            realSupportFlowManager.getClass();
            return MoleculePresenterKt.asPresenter$default(new SupportSearchPresenter(realSupportLinkNavigator3, provideSupportSearchServiceFactory$jvm, androidStringManager6, analytics6, realViewTokenGenerator3, realArticlesService2, featureFlagManager2, realSupportPhoneService3, androidDateFormatManager2, androidClock2, realRouter$Factory$Impl4, moshi3, realSupportFlowManager, (SupportScreens.FlowScreens.SupportSearchScreen) screen, screenNavigator));
        }
        if (screen instanceof SupportScreens.FlowScreens.SupportIncidentDetailsScreen) {
            SupportIncidentDetailsPresenter$Factory$Impl supportIncidentDetailsPresenter$Factory$Impl = (SupportIncidentDetailsPresenter$Factory$Impl) this.declareCashTipBottomSheetPresenterFactory;
            SupportScreens.FlowScreens.SupportIncidentDetailsScreen supportIncidentDetailsScreen = (SupportScreens.FlowScreens.SupportIncidentDetailsScreen) screen;
            boolean z = Build.VERSION.SDK_INT >= 33;
            SignaturePresenter$MetroFactory signaturePresenter$MetroFactory = supportIncidentDetailsPresenter$Factory$Impl.delegateFactory;
            RealIncidentsService realIncidentsService3 = (RealIncidentsService) signaturePresenter$MetroFactory.analytics.getValue();
            AndroidClock androidClock3 = (AndroidClock) signaturePresenter$MetroFactory.ioDispatcher.lambda.invoke();
            AndroidStringManager androidStringManager7 = (AndroidStringManager) signaturePresenter$MetroFactory.stringManager.lambda.invoke();
            Analytics analytics7 = (Analytics) signaturePresenter$MetroFactory.appService.getValue();
            AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) signaturePresenter$MetroFactory.blockersNavigator.invoke();
            IntentLauncher intentLauncher2 = (IntentLauncher) signaturePresenter$MetroFactory.blockersHelperFactory.invoke();
            realIncidentsService3.getClass();
            androidClock3.getClass();
            androidStringManager7.getClass();
            analytics7.getClass();
            androidPermissionManager.getClass();
            intentLauncher2.getClass();
            return MoleculePresenterKt.asPresenter$default(new InstrumentDetailsPresenter(realIncidentsService3, androidClock3, androidStringManager7, analytics7, androidPermissionManager, intentLauncher2, supportIncidentDetailsScreen, screenNavigator, z));
        }
        if (screen instanceof SupportScreens.SupportPhoneStatusScreen) {
            TaxAuthorizationPresenter.MetroFactory metroFactory4 = ((SupportPhoneStatusPresenter$Factory$Impl) this.shiftNotStartedPresenterFactory).delegateFactory;
            RealSupportPhoneService realSupportPhoneService4 = (RealSupportPhoneService) metroFactory4.taxService.getValue();
            AndroidStringManager androidStringManager8 = (AndroidStringManager) metroFactory4.stringManager.lambda.invoke();
            Analytics analytics8 = (Analytics) metroFactory4.flowStarter.getValue();
            RealRouter$Factory$Impl realRouter$Factory$Impl5 = (RealRouter$Factory$Impl) metroFactory4.blockersDataNavigator.invoke();
            FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) metroFactory4.appService.getValue();
            realSupportPhoneService4.getClass();
            androidStringManager8.getClass();
            analytics8.getClass();
            realRouter$Factory$Impl5.getClass();
            featureFlagManager3.getClass();
            return MoleculePresenterKt.asPresenter$default(new SupportPhoneStatusPresenter(realSupportPhoneService4, androidStringManager8, analytics8, realRouter$Factory$Impl5, featureFlagManager3, (SupportScreens.SupportPhoneStatusScreen) screen, screenNavigator));
        }
        if (screen instanceof SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen) {
            return MoleculePresenterKt.asPresenter$default(new ErrorPresenter((SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen) screen, screenNavigator));
        }
        if (screen instanceof SupportScreens.SupportLoadClientScenarioScreen) {
            RealClientScenarioCompleter realClientScenarioCompleter = (RealClientScenarioCompleter) ((SupportLoadClientScenarioPresenter$Factory$Impl) this.payHomePresenterFactory).delegateFactory.analytics.getValue();
            realClientScenarioCompleter.getClass();
            return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(realClientScenarioCompleter, (SupportScreens.SupportLoadClientScenarioScreen) screen, screenNavigator));
        }
        if (screen instanceof SupportScreens.UnauthenticatedArticleScreen) {
            RealGrpcStreamingCall realGrpcStreamingCall = ((UnauthenticatedArticlePresenter$Factory$Impl) this.shiftNotePresenterFactory).delegateFactory;
            RealArticlesService realArticlesService3 = (RealArticlesService) ((DoubleCheck) realGrpcStreamingCall.grpcClient).getValue();
            Lazy lazy = (Lazy) ((CashNavigationLogger.MetroFactory) realGrpcStreamingCall.method).invoke();
            Analytics analytics9 = (Analytics) ((DoubleCheck) realGrpcStreamingCall.requestBody).getValue();
            RealRouter$Factory$Impl realRouter$Factory$Impl6 = (RealRouter$Factory$Impl) ((Provider) realGrpcStreamingCall.call).invoke();
            Moshi moshi4 = (Moshi) ((LambdaProvider) realGrpcStreamingCall.timeout).lambda.invoke();
            RealViewTokenGenerator realViewTokenGenerator4 = (RealViewTokenGenerator) ((DoubleCheck) realGrpcStreamingCall.requestMetadata).getValue();
            realArticlesService3.getClass();
            analytics9.getClass();
            realRouter$Factory$Impl6.getClass();
            moshi4.getClass();
            realViewTokenGenerator4.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(realArticlesService3, lazy, analytics9, realRouter$Factory$Impl6, moshi4, realViewTokenGenerator4, screenNavigator, (SupportScreens.UnauthenticatedArticleScreen) screen));
        }
        if (screen instanceof SupportScreens.FlowScreens.SupportDisputeTrackerScreen) {
            VariantAppComponent.Impl.ZombieLegacyGraphExtensionImpl zombieLegacyGraphExtensionImpl = ((SupportDisputeTrackerPresenter$Factory$Impl) this.payHistoryListPresenterFactory).delegateFactory;
            RealDisputesTrackerService realDisputesTrackerService2 = (RealDisputesTrackerService) zombieLegacyGraphExtensionImpl.provideSandboxedContextProvider.getValue();
            RealDisputesTrackerMapper realDisputesTrackerMapper = (RealDisputesTrackerMapper) zombieLegacyGraphExtensionImpl.provideAccountDatabaseHelperProvider.getValue();
            Analytics analytics10 = (Analytics) zombieLegacyGraphExtensionImpl.provideSharedPreferencesProvider.getValue();
            realDisputesTrackerService2.getClass();
            realDisputesTrackerMapper.getClass();
            analytics10.getClass();
            return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(realDisputesTrackerService2, realDisputesTrackerMapper, analytics10, (SupportScreens.FlowScreens.SupportDisputeTrackerScreen) screen, screenNavigator));
        }
        if (screen instanceof SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen) {
            return MoleculePresenterKt.asPresenter$default(new ErrorPresenter((SupportScreens.FlowScreens.SupportArticleIncidentsSheetScreen) screen, screenNavigator));
        }
        if (screen instanceof SupportScreens.ScreenshotScreen.ScreenshotConfirmScreen) {
            StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory = ((ScreenshotConfirmPresenter$Factory$Impl) this.taxFormsListPresenterFactory).delegateFactory;
            RealScreenshotManager realScreenshotManager = (RealScreenshotManager) stampSheetPresenter$MetroFactory.ioContext.lambda.invoke();
            Analytics analytics11 = (Analytics) stampSheetPresenter$MetroFactory.appConfig.getValue();
            realScreenshotManager.getClass();
            analytics11.getClass();
            return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(screenNavigator, (SupportScreens.ScreenshotScreen.ScreenshotConfirmScreen) screen, realScreenshotManager, analytics11));
        }
        if (screen instanceof SupportScreens.ScreenshotScreen.ScreenshotReviewScreen) {
            Retrofit.Builder builder = ((ScreenshotReviewPresenter$Factory$Impl) this.taxFormDownloaderPresenterFactory).delegateFactory;
            RealScreenshotManager realScreenshotManager2 = (RealScreenshotManager) ((LambdaProvider) builder.callFactory).lambda.invoke();
            HCaptcha hCaptcha = (HCaptcha) ((NavigationSideEffects.MetroFactory) builder.baseUrl).invoke();
            RealSupportNavigator realSupportNavigator = (RealSupportNavigator) ((Provider) builder.converterFactories).invoke();
            AndroidStringManager androidStringManager9 = (AndroidStringManager) ((LambdaProvider) builder.callAdapterFactories).lambda.invoke();
            Analytics analytics12 = (Analytics) ((DoubleCheck) builder.callbackExecutor).getValue();
            realScreenshotManager2.getClass();
            realSupportNavigator.getClass();
            androidStringManager9.getClass();
            analytics12.getClass();
            return MoleculePresenterKt.asPresenter$default(new PdfPreviewPresenter(screenNavigator, (SupportScreens.ScreenshotScreen.ScreenshotReviewScreen) screen, realScreenshotManager2, hCaptcha, realSupportNavigator, androidStringManager9, analytics12));
        }
        if (!(screen instanceof SupportScreens.FlowScreens.SupportActivityPickerFullScreen)) {
            if (!(screen instanceof SupportScreens.SupportSheets.SupportTransactionConfirmationSheet)) {
                if (screen instanceof SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen) {
                    return MoleculePresenterKt.asPresenter$default(new ErrorPresenter((SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen) screen, screenNavigator));
                }
                return null;
            }
            StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory2 = ((SupportTransactionConfirmationPresenter$Factory$Impl) this.shiftListPresenterFactory).delegateFactory;
            AndroidStringManager androidStringManager10 = (AndroidStringManager) stampSheetPresenter$MetroFactory2.ioContext.lambda.invoke();
            Analytics analytics13 = (Analytics) stampSheetPresenter$MetroFactory2.appConfig.getValue();
            androidStringManager10.getClass();
            analytics13.getClass();
            return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(androidStringManager10, analytics13, (SupportScreens.SupportSheets.SupportTransactionConfirmationSheet) screen, screenNavigator));
        }
        TransferringPresenter$MetroFactory transferringPresenter$MetroFactory = ((SupportActivityPickerPresenter$Factory$Impl) this.shiftDetailPresenterFactory).delegateFactory;
        RealActivitiesCacheManager realActivitiesCacheManager2 = (RealActivitiesCacheManager) transferringPresenter$MetroFactory.appService.getValue();
        RealActivityTokenFactory realActivityTokenFactory2 = (RealActivityTokenFactory) transferringPresenter$MetroFactory.blockersDataNavigator.invoke();
        RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl2 = (RealActivityEmbeddedPresenter$Factory$Impl) transferringPresenter$MetroFactory.balanceSnapshotManager.invoke();
        SupportActivityItemPresenter$Factory$Impl supportActivityItemPresenter$Factory$Impl2 = (SupportActivityItemPresenter$Factory$Impl) transferringPresenter$MetroFactory.moneyFormatterFactory.invoke();
        AndroidStringManager androidStringManager11 = (AndroidStringManager) transferringPresenter$MetroFactory.stringManager.lambda.invoke();
        Analytics analytics14 = (Analytics) transferringPresenter$MetroFactory.flowStarter.getValue();
        Moshi moshi5 = (Moshi) transferringPresenter$MetroFactory.uuidGenerator.lambda.invoke();
        realActivitiesCacheManager2.getClass();
        realActivityTokenFactory2.getClass();
        realActivityEmbeddedPresenter$Factory$Impl2.getClass();
        supportActivityItemPresenter$Factory$Impl2.getClass();
        androidStringManager11.getClass();
        analytics14.getClass();
        moshi5.getClass();
        return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(realActivitiesCacheManager2, realActivityTokenFactory2, realActivityEmbeddedPresenter$Factory$Impl2, supportActivityItemPresenter$Factory$Impl2, androidStringManager11, analytics14, moshi5, screenNavigator, (SupportScreens.FlowScreens.SupportActivityPickerFullScreen) screen));
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        int i = this.$r8$classId;
        Object obj = this.shiftListPresenterFactory;
        Object obj2 = this.shiftDetailPresenterFactory;
        Object obj3 = this.taxFormDownloaderPresenterFactory;
        Object obj4 = this.taxFormsListPresenterFactory;
        Object obj5 = this.payHistoryListPresenterFactory;
        Object obj6 = this.payHomePresenterFactory;
        Object obj7 = this.shiftNotePresenterFactory;
        Object obj8 = this.shiftNotStartedPresenterFactory;
        Object obj9 = this.declareCashTipBottomSheetPresenterFactory;
        Object obj10 = this.takeBreakBottomSheetPresenterFactory;
        Object obj11 = this.clockInOverlayPresenterFactory;
        Object obj12 = this.clockInBottomSheetPresenterFactory;
        Object obj13 = this.merchantPickerPresenterFactory;
        Object obj14 = this.workWebPresenterFactory;
        Object obj15 = this.workHomePresenterFactory;
        switch (i) {
            case 0:
                screen.getClass();
                if (screen instanceof WorkHomeScreen) {
                    Retrofit.Builder builder = ((WorkHomePresenter$Factory$Impl) obj15).delegateFactory;
                    ShiftsAnalytics shiftsAnalytics = (ShiftsAnalytics) ((Provider) builder.callFactory).invoke();
                    RealWorkHomeTitleBarPresenter$Factory$Impl realWorkHomeTitleBarPresenter$Factory$Impl = (RealWorkHomeTitleBarPresenter$Factory$Impl) ((InstanceFactory) builder.baseUrl).value;
                    RealShiftSection2Presenter$Factory$Impl realShiftSection2Presenter$Factory$Impl = (RealShiftSection2Presenter$Factory$Impl) ((InstanceFactory) builder.converterFactories).value;
                    RealPayCellPresenter$Factory$Impl realPayCellPresenter$Factory$Impl = (RealPayCellPresenter$Factory$Impl) ((InstanceFactory) builder.callAdapterFactories).value;
                    RealYouPresenter$Factory$Impl realYouPresenter$Factory$Impl = (RealYouPresenter$Factory$Impl) ((InstanceFactory) builder.callbackExecutor).value;
                    shiftsAnalytics.getClass();
                    realWorkHomeTitleBarPresenter$Factory$Impl.getClass();
                    realShiftSection2Presenter$Factory$Impl.getClass();
                    realPayCellPresenter$Factory$Impl.getClass();
                    realYouPresenter$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter((WorkHomeScreen) screen, screenNavigator, shiftsAnalytics, realWorkHomeTitleBarPresenter$Factory$Impl, realShiftSection2Presenter$Factory$Impl, realPayCellPresenter$Factory$Impl, realYouPresenter$Factory$Impl));
                }
                if (screen instanceof WorkWebScreen) {
                    StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory = ((WorkWebPresenter$Factory$Impl) obj14).delegateFactory;
                    AndroidStringManager androidStringManager = (AndroidStringManager) stampSheetPresenter$MetroFactory.ioContext.lambda.invoke();
                    OtkRedirectUseCase otkRedirectUseCase = (OtkRedirectUseCase) stampSheetPresenter$MetroFactory.appConfig.getValue();
                    Payload payload = new Payload(1);
                    androidStringManager.getClass();
                    otkRedirectUseCase.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter((WorkWebScreen) screen, screenNavigator, androidStringManager, otkRedirectUseCase, payload));
                }
                if (screen instanceof MerchantPickerBottomSheetScreen) {
                    MerchantPickerPresenter$MetroFactory merchantPickerPresenter$MetroFactory = ((MerchantPickerPresenter$Factory$Impl) obj13).delegateFactory;
                    RealSelectedMerchantProvider realSelectedMerchantProvider = (RealSelectedMerchantProvider) merchantPickerPresenter$MetroFactory.selectedMerchantProvider.getValue();
                    RealSelectedMerchantSetter realSelectedMerchantSetter = (RealSelectedMerchantSetter) merchantPickerPresenter$MetroFactory.selectedMerchantSetter.getValue();
                    RealMerchantRepository realMerchantRepository = (RealMerchantRepository) merchantPickerPresenter$MetroFactory.merchantRepository.getValue();
                    RealSellerCardViewModelProducer realSellerCardViewModelProducer = (RealSellerCardViewModelProducer) merchantPickerPresenter$MetroFactory.sellerCardViewModelProducer.invoke();
                    realSelectedMerchantProvider.getClass();
                    realSelectedMerchantSetter.getClass();
                    realMerchantRepository.getClass();
                    realSellerCardViewModelProducer.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(screenNavigator, realSelectedMerchantProvider, realSelectedMerchantSetter, realMerchantRepository, realSellerCardViewModelProducer, 25));
                }
                if (screen instanceof ClockInBottomSheetScreen) {
                    ImageLoader$Builder imageLoader$Builder = ((ClockInBottomSheetPresenter$Factory$Impl) obj12).delegateFactory;
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder.application).lambda.invoke();
                    RealClockInRepository realClockInRepository = (RealClockInRepository) ((DoubleCheck) imageLoader$Builder.defaults).getValue();
                    MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) ((ClockInOverlayMapper$MetroFactory) imageLoader$Builder.mainCoroutineContextLazy).invoke();
                    RealLastClockedInInfoUseCase realLastClockedInInfoUseCase = (RealLastClockedInInfoUseCase) ((Provider) imageLoader$Builder.memoryCacheLazy).invoke();
                    ShiftsAnalytics shiftsAnalytics2 = (ShiftsAnalytics) ((Provider) imageLoader$Builder.diskCacheLazy).invoke();
                    AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) ((Provider) imageLoader$Builder.eventListenerFactory).invoke();
                    AndroidLocationProvider androidLocationProvider = (AndroidLocationProvider) ((LambdaProvider) imageLoader$Builder.componentRegistry).lambda.invoke();
                    IntentLauncher intentLauncher = (IntentLauncher) ((Provider) imageLoader$Builder.extras).invoke();
                    androidStringManager2.getClass();
                    realClockInRepository.getClass();
                    realLastClockedInInfoUseCase.getClass();
                    shiftsAnalytics2.getClass();
                    androidPermissionManager.getClass();
                    androidLocationProvider.getClass();
                    intentLauncher.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PoolsListPresenter((ClockInBottomSheetScreen) screen, screenNavigator, androidStringManager2, realClockInRepository, markwonConfiguration, realLastClockedInInfoUseCase, shiftsAnalytics2, androidPermissionManager, androidLocationProvider, intentLauncher));
                }
                if (screen instanceof ClockInOverlayScreen) {
                    NodeChain nodeChain = ((ClockInOverlayPresenter$Factory$Impl) obj11).delegateFactory;
                    RealSellerCardViewModelProducer realSellerCardViewModelProducer2 = (RealSellerCardViewModelProducer) ((Provider) nodeChain.layoutNode).invoke();
                    RealClockInEssentialsProvider realClockInEssentialsProvider = (RealClockInEssentialsProvider) ((DoubleCheck) nodeChain.sentinelHead).getValue();
                    MarkwonConfiguration markwonConfiguration2 = (MarkwonConfiguration) ((ClockInOverlayMapper$MetroFactory) nodeChain.innerCoordinator).invoke();
                    ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) ((CashNavigationLogger.MetroFactory) nodeChain.outerCoordinator).invoke();
                    RealClockInRepository realClockInRepository2 = (RealClockInRepository) ((DoubleCheck) nodeChain.tail).getValue();
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) ((LambdaProvider) nodeChain.head).lambda.invoke();
                    AndroidPermissionManager androidPermissionManager2 = (AndroidPermissionManager) ((Provider) nodeChain.current).invoke();
                    AndroidLocationProvider androidLocationProvider2 = (AndroidLocationProvider) ((LambdaProvider) nodeChain.buffer).lambda.invoke();
                    IntentLauncher intentLauncher2 = (IntentLauncher) ((Provider) nodeChain.stack).invoke();
                    GeofenceStateResolver geofenceStateResolver = (GeofenceStateResolver) ((Provider) nodeChain.cachedDiffer).invoke();
                    realSellerCardViewModelProducer2.getClass();
                    realClockInEssentialsProvider.getClass();
                    realClockInRepository2.getClass();
                    androidStringManager3.getClass();
                    androidPermissionManager2.getClass();
                    androidLocationProvider2.getClass();
                    intentLauncher2.getClass();
                    geofenceStateResolver.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardLockPresenter((ClockInOverlayScreen) screen, screenNavigator, realSellerCardViewModelProducer2, realClockInEssentialsProvider, markwonConfiguration2, toolbarTuckTargets, realClockInRepository2, androidStringManager3, androidPermissionManager2, androidLocationProvider2, intentLauncher2, geofenceStateResolver));
                }
                if (screen instanceof TakeBreakBottomSheetScreen) {
                    DisclosurePresenter.MetroFactory metroFactory = ((TakeBreakBottomSheetPresenter$Factory$Impl) obj10).delegateFactory;
                    RealClockInRepository realClockInRepository3 = (RealClockInRepository) metroFactory.analytics.getValue();
                    RealSelectedMerchantProvider realSelectedMerchantProvider2 = (RealSelectedMerchantProvider) metroFactory.appService.getValue();
                    ShiftsAnalytics shiftsAnalytics3 = (ShiftsAnalytics) metroFactory.blockersNavigator.invoke();
                    RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) metroFactory.launcher.invoke();
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
                    realClockInRepository3.getClass();
                    realSelectedMerchantProvider2.getClass();
                    shiftsAnalytics3.getClass();
                    realShiftTimeFormatter.getClass();
                    androidStringManager4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PdfPreviewPresenter((TakeBreakBottomSheetScreen) screen, screenNavigator, realClockInRepository3, realSelectedMerchantProvider2, shiftsAnalytics3, realShiftTimeFormatter, androidStringManager4));
                }
                if (screen instanceof DeclareCashTipBottomSheetScreen) {
                    TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = ((DeclareCashTipBottomSheetPresenter$Factory$Impl) obj9).delegateFactory;
                    RealClockInRepository realClockInRepository4 = (RealClockInRepository) transferInPresenter$MetroFactory.analytics.getValue();
                    AndroidStringManager androidStringManager5 = (AndroidStringManager) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
                    realClockInRepository4.getClass();
                    androidStringManager5.getClass();
                    factory.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter((DeclareCashTipBottomSheetScreen) screen, screenNavigator, realClockInRepository4, androidStringManager5, factory));
                }
                if (screen instanceof ShiftNotStartedDialogScreen) {
                    LiteActivityPresenter.MetroFactory metroFactory2 = ((ShiftNotStartedDialogPresenter$Factory$Impl) obj8).delegateFactory;
                    RealShiftTimeFormatter realShiftTimeFormatter2 = (RealShiftTimeFormatter) metroFactory2.activityEmbeddedPresenterFactory.invoke();
                    AndroidClock androidClock = (AndroidClock) metroFactory2.sessionManager.lambda.invoke();
                    AndroidStringManager androidStringManager6 = (AndroidStringManager) metroFactory2.stringManager.lambda.invoke();
                    realShiftTimeFormatter2.getClass();
                    androidClock.getClass();
                    androidStringManager6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter((ShiftNotStartedDialogScreen) screen, screenNavigator, realShiftTimeFormatter2, androidClock, androidStringManager6));
                }
                if (screen instanceof ShiftNoteScreen) {
                    DisclosurePresenter.MetroFactory metroFactory3 = ((ShiftNotePresenter$Factory$Impl) obj7).delegateFactory;
                    RealClockInRepository realClockInRepository5 = (RealClockInRepository) metroFactory3.analytics.getValue();
                    ShiftsAnalytics shiftsAnalytics4 = (ShiftsAnalytics) metroFactory3.blockersNavigator.invoke();
                    RealSelectedMerchantProvider realSelectedMerchantProvider3 = (RealSelectedMerchantProvider) metroFactory3.appService.getValue();
                    AndroidStringManager androidStringManager7 = (AndroidStringManager) metroFactory3.stringManager.lambda.invoke();
                    RealShiftTimeFormatter realShiftTimeFormatter3 = (RealShiftTimeFormatter) metroFactory3.launcher.invoke();
                    realClockInRepository5.getClass();
                    shiftsAnalytics4.getClass();
                    realSelectedMerchantProvider3.getClass();
                    androidStringManager7.getClass();
                    realShiftTimeFormatter3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PdfPreviewPresenter((ShiftNoteScreen) screen, screenNavigator, realClockInRepository5, shiftsAnalytics4, realSelectedMerchantProvider3, androidStringManager7, realShiftTimeFormatter3));
                }
                if (screen instanceof WorkPayHomeScreen) {
                    RealGrpcStreamingCall realGrpcStreamingCall = ((PayHomePresenter$Factory$Impl) obj6).delegateFactory;
                    PayDataLoader payDataLoader = (PayDataLoader) ((DoubleCheck) realGrpcStreamingCall.grpcClient).getValue();
                    RealSelectedMerchantProvider realSelectedMerchantProvider4 = (RealSelectedMerchantProvider) ((DoubleCheck) realGrpcStreamingCall.method).getValue();
                    RealSelectedMerchantDataProvider realSelectedMerchantDataProvider = (RealSelectedMerchantDataProvider) ((DoubleCheck) realGrpcStreamingCall.requestBody).getValue();
                    RealSellerCardViewModelProducer realSellerCardViewModelProducer3 = (RealSellerCardViewModelProducer) ((Provider) realGrpcStreamingCall.call).invoke();
                    n nVar = (n) ((PersistedEventRepository.MetroFactory) realGrpcStreamingCall.timeout).invoke();
                    ShiftsAnalytics shiftsAnalytics5 = (ShiftsAnalytics) ((Provider) realGrpcStreamingCall.requestMetadata).invoke();
                    payDataLoader.getClass();
                    realSelectedMerchantProvider4.getClass();
                    realSelectedMerchantDataProvider.getClass();
                    realSellerCardViewModelProducer3.getClass();
                    shiftsAnalytics5.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PayHomePresenter((WorkPayHomeScreen) screen, screenNavigator, payDataLoader, realSelectedMerchantProvider4, realSelectedMerchantDataProvider, realSellerCardViewModelProducer3, nVar, shiftsAnalytics5));
                }
                if (screen instanceof WorkPayHistoryListScreen) {
                    PayHistoryListPresenter$MetroFactory payHistoryListPresenter$MetroFactory = ((PayHistoryListPresenter$Factory$Impl) obj5).delegateFactory;
                    AndroidStringManager androidStringManager8 = (AndroidStringManager) ((LambdaProvider) payHistoryListPresenter$MetroFactory.stringManager).lambda.invoke();
                    PayrollJsonService payrollJsonService = (PayrollJsonService) payHistoryListPresenter$MetroFactory.payrollJsonService.getValue();
                    RealSelectedMerchantProvider realSelectedMerchantProvider5 = (RealSelectedMerchantProvider) payHistoryListPresenter$MetroFactory.selectedMerchantProvider.getValue();
                    RealSelectedMerchantDataProvider realSelectedMerchantDataProvider2 = (RealSelectedMerchantDataProvider) payHistoryListPresenter$MetroFactory.selectedMerchantDataProvider.getValue();
                    RealSellerCardViewModelProducer realSellerCardViewModelProducer4 = (RealSellerCardViewModelProducer) payHistoryListPresenter$MetroFactory.sellerCardViewModelProducer.invoke();
                    PayHistoryListViewModelMapper payHistoryListViewModelMapper = (PayHistoryListViewModelMapper) ((RealTaxFormDownloader$MetroFactory) payHistoryListPresenter$MetroFactory.payHistoryListViewModelMapper).invoke();
                    ShiftsAnalytics shiftsAnalytics6 = (ShiftsAnalytics) payHistoryListPresenter$MetroFactory.shiftsAnalytics.invoke();
                    androidStringManager8.getClass();
                    payrollJsonService.getClass();
                    realSelectedMerchantProvider5.getClass();
                    realSelectedMerchantDataProvider2.getClass();
                    realSellerCardViewModelProducer4.getClass();
                    shiftsAnalytics6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxAuthorizationPresenter((WorkPayHistoryListScreen) screen, screenNavigator, androidStringManager8, payrollJsonService, realSelectedMerchantProvider5, realSelectedMerchantDataProvider2, realSellerCardViewModelProducer4, payHistoryListViewModelMapper, shiftsAnalytics6));
                }
                if (screen instanceof WorkTaxFormsListScreen) {
                    CardStudioPresenterV2$MetroFactory cardStudioPresenterV2$MetroFactory = ((TaxFormsListPresenter$Factory$Impl) obj4).delegateFactory;
                    AndroidStringManager androidStringManager9 = (AndroidStringManager) cardStudioPresenterV2$MetroFactory.ioContext.lambda.invoke();
                    TaxFormsService taxFormsService = (TaxFormsService) cardStudioPresenterV2$MetroFactory.cashDatabase.getValue();
                    RealSelectedMerchantProvider realSelectedMerchantProvider6 = (RealSelectedMerchantProvider) cardStudioPresenterV2$MetroFactory.appConfig.getValue();
                    ShiftsAnalytics shiftsAnalytics7 = (ShiftsAnalytics) cardStudioPresenterV2$MetroFactory.deviceOrientationProvider.invoke();
                    androidStringManager9.getClass();
                    taxFormsService.getClass();
                    realSelectedMerchantProvider6.getClass();
                    shiftsAnalytics7.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter((WorkTaxFormsListScreen) screen, screenNavigator, androidStringManager9, taxFormsService, realSelectedMerchantProvider6, shiftsAnalytics7));
                }
                if (screen instanceof WorkTaxFormDownloaderScreen) {
                    Instrument$Adapter instrument$Adapter = ((TaxFormDownloaderPresenter$Factory$Impl) obj3).delegateFactory;
                    AndroidStringManager androidStringManager10 = (AndroidStringManager) ((LambdaProvider) instrument$Adapter.cash_instrument_typeAdapter).lambda.invoke();
                    TextSetter textSetter = (TextSetter) ((RealTaxFormDownloader$MetroFactory) instrument$Adapter.card_brandAdapter).invoke();
                    ShiftsAnalytics shiftsAnalytics8 = (ShiftsAnalytics) ((Provider) instrument$Adapter.balance_currencyAdapter).invoke();
                    androidStringManager10.getClass();
                    shiftsAnalytics8.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter((WorkTaxFormDownloaderScreen) screen, screenNavigator, androidStringManager10, textSetter, shiftsAnalytics8));
                }
                if (screen instanceof TimecardDetailScreen) {
                    return MoleculePresenterKt.asPresenter$default(new AddAliasPresenter((TimecardDetailScreen) screen, screenNavigator));
                }
                if (!(screen instanceof ShiftDetailScreen)) {
                    if (!(screen instanceof ShiftListScreen)) {
                        return null;
                    }
                    RealGrpcStreamingCall realGrpcStreamingCall2 = ((ShiftListPresenter$Factory$Impl) obj).delegateFactory;
                    AndroidClock androidClock2 = (AndroidClock) ((LambdaProvider) realGrpcStreamingCall2.grpcClient).lambda.invoke();
                    RealShiftDataLoader$Factory$Impl realShiftDataLoader$Factory$Impl = (RealShiftDataLoader$Factory$Impl) ((InstanceFactory) realGrpcStreamingCall2.method).value;
                    RealSelectedMerchantDataProvider realSelectedMerchantDataProvider3 = (RealSelectedMerchantDataProvider) ((DoubleCheck) realGrpcStreamingCall2.requestBody).getValue();
                    RealSellerCardViewModelProducer realSellerCardViewModelProducer5 = (RealSellerCardViewModelProducer) ((Provider) realGrpcStreamingCall2.call).invoke();
                    RealAssignedLocationProvider realAssignedLocationProvider = (RealAssignedLocationProvider) ((Provider) realGrpcStreamingCall2.timeout).invoke();
                    MetadataRepo metadataRepo = (MetadataRepo) ((DashboardShiftMapper$MetroFactory) realGrpcStreamingCall2.requestMetadata).invoke();
                    androidClock2.getClass();
                    realShiftDataLoader$Factory$Impl.getClass();
                    realSelectedMerchantDataProvider3.getClass();
                    realSellerCardViewModelProducer5.getClass();
                    realAssignedLocationProvider.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ShiftListPresenter((ShiftListScreen) screen, screenNavigator, androidClock2, realShiftDataLoader$Factory$Impl, realSelectedMerchantDataProvider3, realSellerCardViewModelProducer5, realAssignedLocationProvider, metadataRepo));
                }
                NodeChain nodeChain2 = ((ShiftDetailPresenter$Factory$Impl) obj2).delegateFactory;
                RealDashboardScheduleProvider realDashboardScheduleProvider = (RealDashboardScheduleProvider) ((DoubleCheck) nodeChain2.layoutNode).getValue();
                RealSelectedMerchantDataProvider realSelectedMerchantDataProvider4 = (RealSelectedMerchantDataProvider) ((DoubleCheck) nodeChain2.sentinelHead).getValue();
                RealSellerCardViewModelProducer realSellerCardViewModelProducer6 = (RealSellerCardViewModelProducer) ((Provider) nodeChain2.innerCoordinator).invoke();
                RealCurrentUserProvider realCurrentUserProvider = (RealCurrentUserProvider) ((DoubleCheck) nodeChain2.outerCoordinator).getValue();
                RealPersonRepository realPersonRepository = (RealPersonRepository) ((DoubleCheck) nodeChain2.tail).getValue();
                RealAssignedJobProvider realAssignedJobProvider = (RealAssignedJobProvider) ((Provider) nodeChain2.head).invoke();
                RealAssignedLocationProvider realAssignedLocationProvider2 = (RealAssignedLocationProvider) ((Provider) nodeChain2.current).invoke();
                RealPasscodeProvider realPasscodeProvider = (RealPasscodeProvider) ((Provider) nodeChain2.buffer).invoke();
                ShiftDetailMapper shiftDetailMapper = (ShiftDetailMapper) ((RepeatTaskExecutor.MetroFactory) nodeChain2.stack).invoke();
                GetClockInEssentialsUseCase getClockInEssentialsUseCase = (GetClockInEssentialsUseCase) ((RealBugReportSenderFactory.MetroFactory) nodeChain2.cachedDiffer).invoke();
                realDashboardScheduleProvider.getClass();
                realSelectedMerchantDataProvider4.getClass();
                realSellerCardViewModelProducer6.getClass();
                realCurrentUserProvider.getClass();
                realPersonRepository.getClass();
                realAssignedJobProvider.getClass();
                realAssignedLocationProvider2.getClass();
                realPasscodeProvider.getClass();
                return MoleculePresenterKt.asPresenter$default(new CardLockPresenter((ShiftDetailScreen) screen, screenNavigator, realDashboardScheduleProvider, realSelectedMerchantDataProvider4, realSellerCardViewModelProducer6, realCurrentUserProvider, realPersonRepository, realAssignedJobProvider, realAssignedLocationProvider2, realPasscodeProvider, shiftDetailMapper, getClockInEssentialsUseCase));
            case 1:
                return create$com$squareup$cash$support$presenters$SupportPresenterFactory(screen, screenNavigator);
            default:
                screen.getClass();
                if (screen instanceof BalanceBasedAutoReloadConfirmationScreen) {
                    PasscodeConfirmTypeTransformer.MetroFactory metroFactory4 = ((BalanceBasedAutoReloadConfirmationPresenter$Factory$Impl) obj15).delegateFactory;
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) metroFactory4.blockersNavigator.invoke();
                    RealBalanceSnapshotManager realBalanceSnapshotManager = (RealBalanceSnapshotManager) metroFactory4.biometricsStore.invoke();
                    com.squareup.protos.cash.balancebasedaddcash.api.v1_0.AppService appService = (com.squareup.protos.cash.balancebasedaddcash.api.v1_0.AppService) metroFactory4.appService.getValue();
                    AndroidStringManager androidStringManager11 = (AndroidStringManager) metroFactory4.stringManager.lambda.invoke();
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory4.biometricsInfo.invoke();
                    Analytics analytics = (Analytics) metroFactory4.analytics.getValue();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory4.appLockState.getValue();
                    factory2.getClass();
                    realBalanceSnapshotManager.getClass();
                    appService.getClass();
                    androidStringManager11.getClass();
                    blockersDataNavigator.getClass();
                    analytics.getClass();
                    featureFlagManager.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InstrumentDetailsPresenter(factory2, realBalanceSnapshotManager, appService, androidStringManager11, blockersDataNavigator, analytics, featureFlagManager, (BalanceBasedAutoReloadConfirmationScreen) screen, screenNavigator));
                }
                if (screen instanceof BalanceBasedAddCashDisabledDialogScreen) {
                    return MoleculePresenterKt.asPresenter$default(new ErrorPresenter((BalanceBasedAddCashDisabledDialogScreen) screen, screenNavigator));
                }
                if (screen instanceof PendingTransfersConfirmationDialog) {
                    TransferInPresenter$MetroFactory transferInPresenter$MetroFactory2 = ((PendingTransfersConfirmationDialogPresenter$Factory$Impl) obj14).delegateFactory;
                    RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl = (RealTransfersInboundNavigator$Factory$Impl) transferInPresenter$MetroFactory2.moneyFormatterFactory.invoke();
                    AndroidStringManager androidStringManager12 = (AndroidStringManager) transferInPresenter$MetroFactory2.stringManager.lambda.invoke();
                    Analytics analytics2 = (Analytics) transferInPresenter$MetroFactory2.analytics.getValue();
                    realTransfersInboundNavigator$Factory$Impl.getClass();
                    androidStringManager12.getClass();
                    analytics2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter(realTransfersInboundNavigator$Factory$Impl, androidStringManager12, analytics2, (PendingTransfersConfirmationDialog) screen, screenNavigator));
                }
                if (screen instanceof WithdrawScreen) {
                    NodeChain nodeChain3 = ((WithdrawPresenter$Factory$Impl) obj13).delegateFactory;
                    TransferManager transferManager = (TransferManager) ((Provider) nodeChain3.layoutNode).invoke();
                    TransferActionProcessor$Factory$Impl transferActionProcessor$Factory$Impl = (TransferActionProcessor$Factory$Impl) ((Provider) nodeChain3.sentinelHead).invoke();
                    RealInstrumentManager realInstrumentManager = (RealInstrumentManager) ((Provider) nodeChain3.innerCoordinator).invoke();
                    SizeMap sizeMap = (SizeMap) ((RealCurrentUserSetter.MetroFactory) nodeChain3.outerCoordinator).invoke();
                    RealConfirmCashOutVersionCodeProvider realConfirmCashOutVersionCodeProvider = (RealConfirmCashOutVersionCodeProvider) ((Provider) nodeChain3.tail).invoke();
                    SecuritySignalsAggregator securitySignalsAggregator = (SecuritySignalsAggregator) ((Provider) nodeChain3.head).invoke();
                    AndroidStringManager androidStringManager13 = (AndroidStringManager) ((LambdaProvider) nodeChain3.current).lambda.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) ((DoubleCheck) nodeChain3.buffer).getValue();
                    Analytics analytics3 = (Analytics) ((DoubleCheck) nodeChain3.stack).getValue();
                    LocalizedMoneyFormatter.Factory factory3 = (LocalizedMoneyFormatter.Factory) ((Provider) nodeChain3.cachedDiffer).invoke();
                    transferManager.getClass();
                    transferActionProcessor$Factory$Impl.getClass();
                    realInstrumentManager.getClass();
                    realConfirmCashOutVersionCodeProvider.getClass();
                    securitySignalsAggregator.getClass();
                    androidStringManager13.getClass();
                    featureFlagManager2.getClass();
                    analytics3.getClass();
                    factory3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WithdrawPresenter(transferManager, transferActionProcessor$Factory$Impl, realInstrumentManager, sizeMap, realConfirmCashOutVersionCodeProvider, securitySignalsAggregator, androidStringManager13, featureFlagManager2, analytics3, factory3, (WithdrawScreen) screen, screenNavigator));
                }
                if (screen instanceof LinkedAccountsScreen) {
                    LinkedAccountsPresenter.MetroFactory metroFactory5 = ((LinkedAccountsPresenter$Factory$Impl) obj12).delegateFactory;
                    Analytics analytics4 = (Analytics) metroFactory5.analytics.getValue();
                    SyncValueReader syncValueReader = (SyncValueReader) metroFactory5.syncValueReader.getValue();
                    RealInstrumentManager realInstrumentManager2 = (RealInstrumentManager) metroFactory5.instrumentManager.invoke();
                    RealInstrumentLinkingOptionManager realInstrumentLinkingOptionManager = (RealInstrumentLinkingOptionManager) metroFactory5.instrumentLinkingOptionManager.invoke();
                    FlowStarter flowStarter = (FlowStarter) metroFactory5.flowStarter.getValue();
                    AndroidStringManager androidStringManager14 = (AndroidStringManager) metroFactory5.stringManager.lambda.invoke();
                    RealClientSyncer realClientSyncer = (RealClientSyncer) metroFactory5.clientSyncer.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) metroFactory5.errorReporter.lambda.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) metroFactory5.featureFlagManager.getValue();
                    analytics4.getClass();
                    syncValueReader.getClass();
                    realInstrumentManager2.getClass();
                    realInstrumentLinkingOptionManager.getClass();
                    flowStarter.getClass();
                    androidStringManager14.getClass();
                    realClientSyncer.getClass();
                    errorReporter.getClass();
                    featureFlagManager3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LinkedAccountsPresenter(analytics4, syncValueReader, realInstrumentManager2, realInstrumentLinkingOptionManager, flowStarter, androidStringManager14, realClientSyncer, errorReporter, featureFlagManager3, (LinkedAccountsScreen) screen, screenNavigator));
                }
                if (screen instanceof LinkedAccountsNuxScreen) {
                    TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory = ((LinkedAccountsNuxPresenter$Factory$Impl) obj11).delegateFactory;
                    AndroidStringManager androidStringManager15 = (AndroidStringManager) taxTooltipPresenter$MetroFactory.stringManager.lambda.invoke();
                    KeyValue keyValue = (KeyValue) taxTooltipPresenter$MetroFactory.taxDesktopTooltipPreference.invoke();
                    androidStringManager15.getClass();
                    keyValue.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(androidStringManager15, keyValue, (LinkedAccountsNuxScreen) screen, screenNavigator));
                }
                if (screen instanceof InstrumentDetailsScreen) {
                    Reward$Adapter reward$Adapter = ((InstrumentDetailsPresenter$Factory$Impl) obj10).delegateFactory;
                    RealInstrumentManager realInstrumentManager3 = (RealInstrumentManager) ((Provider) reward$Adapter.avatarsAdapter).invoke();
                    AndroidStringManager androidStringManager16 = (AndroidStringManager) ((LambdaProvider) reward$Adapter.reward_selection_stateAdapter).lambda.invoke();
                    FlowStarter flowStarter2 = (FlowStarter) ((DoubleCheck) reward$Adapter.boost_detail_bottom_upsellAdapter).getValue();
                    Analytics analytics5 = (Analytics) ((DoubleCheck) reward$Adapter.app_linksAdapter).getValue();
                    CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) reward$Adapter.program_detail_rowsAdapter).lambda.invoke();
                    CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) reward$Adapter.boost_detail_rowsAdapter).value;
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) ((DoubleCheck) reward$Adapter.boost_attributesAdapter).getValue();
                    realInstrumentManager3.getClass();
                    androidStringManager16.getClass();
                    flowStarter2.getClass();
                    analytics5.getClass();
                    coroutineContext.getClass();
                    coroutineScope.getClass();
                    featureFlagManager4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InstrumentDetailsPresenter((InstrumentDetailsScreen) screen, screenNavigator, realInstrumentManager3, androidStringManager16, flowStarter2, analytics5, coroutineContext, coroutineScope, featureFlagManager4));
                }
                if (screen instanceof InstrumentLinkingOptionsScreen) {
                    SkipPaymentPresenter$MetroFactory skipPaymentPresenter$MetroFactory = ((InstrumentLinkingOptionsPresenter$Factory$Impl) obj9).delegateFactory;
                    AndroidStringManager androidStringManager17 = (AndroidStringManager) skipPaymentPresenter$MetroFactory.stringManager.lambda.invoke();
                    FlowStarter flowStarter3 = (FlowStarter) skipPaymentPresenter$MetroFactory.activityEntityManager.getValue();
                    Analytics analytics6 = (Analytics) skipPaymentPresenter$MetroFactory.paymentManager.getValue();
                    androidStringManager17.getClass();
                    flowStarter3.getClass();
                    analytics6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(androidStringManager17, flowStarter3, analytics6, (InstrumentLinkingOptionsScreen) screen, screenNavigator));
                }
                if (screen instanceof AddMoneyScreen) {
                    DeviceBuildInfo deviceBuildInfo = ((AddMoneyPresenter$Factory$Impl) obj8).delegateFactory;
                    Analytics analytics7 = (Analytics) ((DoubleCheck) deviceBuildInfo.manufacturer).getValue();
                    AndroidStringManager androidStringManager18 = (AndroidStringManager) ((LambdaProvider) deviceBuildInfo.model).lambda.invoke();
                    TransferManager transferManager2 = (TransferManager) ((Provider) deviceBuildInfo.osVersion).invoke();
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) ((DoubleCheck) deviceBuildInfo.osBuild).getValue();
                    RealInstrumentManager realInstrumentManager4 = (RealInstrumentManager) ((Provider) deviceBuildInfo.fingerprint).invoke();
                    RealTransferRequirementHandler realTransferRequirementHandler = (RealTransferRequirementHandler) ((Provider) deviceBuildInfo.tags).invoke();
                    GooglePayPaymentsClient googlePayPaymentsClient = (GooglePayPaymentsClient) ((Provider) deviceBuildInfo.brand).invoke();
                    TransferActionProcessor$Factory$Impl transferActionProcessor$Factory$Impl2 = (TransferActionProcessor$Factory$Impl) ((Provider) deviceBuildInfo.apiLevel).invoke();
                    LocalizedMoneyFormatter.Factory factory4 = (LocalizedMoneyFormatter.Factory) ((Provider) deviceBuildInfo.cpuAbis).invoke();
                    analytics7.getClass();
                    androidStringManager18.getClass();
                    transferManager2.getClass();
                    featureFlagManager5.getClass();
                    realInstrumentManager4.getClass();
                    realTransferRequirementHandler.getClass();
                    googlePayPaymentsClient.getClass();
                    transferActionProcessor$Factory$Impl2.getClass();
                    factory4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new AddMoneyPresenter(analytics7, androidStringManager18, transferManager2, featureFlagManager5, realInstrumentManager4, realTransferRequirementHandler, googlePayPaymentsClient, transferActionProcessor$Factory$Impl2, factory4, screenNavigator, (AddMoneyScreen) screen));
                }
                if (screen instanceof InstrumentNotLinkedScreen) {
                    HelpSheetPresenter$MetroFactory helpSheetPresenter$MetroFactory = ((InstrumentNotLinkedPresenter$Factory$Impl) obj7).delegateFactory;
                    TransferManager transferManager3 = (TransferManager) helpSheetPresenter$MetroFactory.routerFactory.invoke();
                    TransferActionProcessor$Factory$Impl transferActionProcessor$Factory$Impl3 = (TransferActionProcessor$Factory$Impl) helpSheetPresenter$MetroFactory.oneErrorPerAppSessionStrategy.invoke();
                    AndroidStringManager androidStringManager19 = (AndroidStringManager) helpSheetPresenter$MetroFactory.errorReporter.lambda.invoke();
                    Analytics analytics8 = (Analytics) helpSheetPresenter$MetroFactory.syncValueReader.getValue();
                    transferManager3.getClass();
                    transferActionProcessor$Factory$Impl3.getClass();
                    androidStringManager19.getClass();
                    analytics8.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter(transferManager3, transferActionProcessor$Factory$Impl3, androidStringManager19, analytics8, (InstrumentNotLinkedScreen) screen, screenNavigator));
                }
                if (screen instanceof TransfersRouterScreen) {
                    return MoleculePresenterKt.asPresenter$default(new ErrorPresenter((TransfersRouterScreen) screen, screenNavigator));
                }
                if (screen instanceof SetDefaultInstrumentScreen) {
                    TaxAuthorizationPresenter.MetroFactory metroFactory6 = ((SetDefaultInstrumentPresenter$Factory$Impl) obj6).delegateFactory;
                    com.squareup.cash.cashlynxflow.service.v2.AppService appService2 = (com.squareup.cash.cashlynxflow.service.v2.AppService) metroFactory6.taxService.getValue();
                    BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) metroFactory6.blockersDataNavigator.invoke();
                    Analytics analytics9 = (Analytics) metroFactory6.flowStarter.getValue();
                    FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) metroFactory6.appService.getValue();
                    AndroidStringManager androidStringManager20 = (AndroidStringManager) metroFactory6.stringManager.lambda.invoke();
                    appService2.getClass();
                    blockersDataNavigator2.getClass();
                    analytics9.getClass();
                    featureFlagManager6.getClass();
                    androidStringManager20.getClass();
                    return MoleculePresenterKt.asPresenter$default(new SetDefaultInstrumentPresenter(appService2, blockersDataNavigator2, analytics9, featureFlagManager6, androidStringManager20, (SetDefaultInstrumentScreen) screen, screenNavigator));
                }
                if (screen instanceof RecurringReloadOptionScreen) {
                    ImageLoader$Builder imageLoader$Builder2 = ((RecurringReloadOptionPresenter$Factory$Impl) obj5).delegateFactory;
                    LocalizedMoneyFormatter.Factory factory5 = (LocalizedMoneyFormatter.Factory) ((Provider) imageLoader$Builder2.application).invoke();
                    RealBalanceBasedAddCashManager realBalanceBasedAddCashManager = (RealBalanceBasedAddCashManager) ((Provider) imageLoader$Builder2.defaults).invoke();
                    ScheduledReloadsManager scheduledReloadsManager = (ScheduledReloadsManager) ((Provider) imageLoader$Builder2.mainCoroutineContextLazy).invoke();
                    RealInstrumentManager realInstrumentManager5 = (RealInstrumentManager) ((Provider) imageLoader$Builder2.memoryCacheLazy).invoke();
                    AndroidStringManager androidStringManager21 = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder2.diskCacheLazy).lambda.invoke();
                    Analytics analytics10 = (Analytics) ((DoubleCheck) imageLoader$Builder2.eventListenerFactory).getValue();
                    RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl = (RealBlockersHelper$Factory$Impl) ((Provider) imageLoader$Builder2.componentRegistry).invoke();
                    RealBankingOutboundNavigator$Factory$Impl realBankingOutboundNavigator$Factory$Impl = (RealBankingOutboundNavigator$Factory$Impl) ((Provider) imageLoader$Builder2.extras).invoke();
                    factory5.getClass();
                    realBalanceBasedAddCashManager.getClass();
                    scheduledReloadsManager.getClass();
                    realInstrumentManager5.getClass();
                    androidStringManager21.getClass();
                    analytics10.getClass();
                    realBlockersHelper$Factory$Impl.getClass();
                    realBankingOutboundNavigator$Factory$Impl.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PoolsListPresenter(factory5, realBalanceBasedAddCashManager, scheduledReloadsManager, realInstrumentManager5, androidStringManager21, analytics10, realBlockersHelper$Factory$Impl, realBankingOutboundNavigator$Factory$Impl, (RecurringReloadOptionScreen) screen, screenNavigator));
                }
                if (screen instanceof RecurringReloadConfigurationScreen) {
                    TransferInPresenter$MetroFactory transferInPresenter$MetroFactory3 = ((RecurringReloadConfigurationPresenter$Factory$Impl) obj4).delegateFactory;
                    LocalizedMoneyFormatter.Factory factory6 = (LocalizedMoneyFormatter.Factory) transferInPresenter$MetroFactory3.moneyFormatterFactory.invoke();
                    AndroidStringManager androidStringManager22 = (AndroidStringManager) transferInPresenter$MetroFactory3.stringManager.lambda.invoke();
                    Analytics analytics11 = (Analytics) transferInPresenter$MetroFactory3.analytics.getValue();
                    factory6.getClass();
                    androidStringManager22.getClass();
                    analytics11.getClass();
                    return MoleculePresenterKt.asPresenter$default(new RecurringReloadConfigurationPresenter(factory6, androidStringManager22, analytics11, (RecurringReloadConfigurationScreen) screen, screenNavigator));
                }
                if (screen instanceof RecurringReloadsChangeInstrumentScreen) {
                    TaxTooltipPresenter$MetroFactory taxTooltipPresenter$MetroFactory2 = ((RecurringReloadsChangeInstrumentPresenter$Factory$Impl) obj3).delegateFactory;
                    AndroidStringManager androidStringManager23 = (AndroidStringManager) taxTooltipPresenter$MetroFactory2.stringManager.lambda.invoke();
                    RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl2 = (RealTransfersInboundNavigator$Factory$Impl) taxTooltipPresenter$MetroFactory2.taxDesktopTooltipPreference.invoke();
                    androidStringManager23.getClass();
                    realTransfersInboundNavigator$Factory$Impl2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(androidStringManager23, realTransfersInboundNavigator$Factory$Impl2, (RecurringReloadsChangeInstrumentScreen) screen, screenNavigator));
                }
                if (screen instanceof RecurringReloadsDismissDialogScreen) {
                    TransferInPresenter$MetroFactory transferInPresenter$MetroFactory4 = ((RecurringReloadsDismissDialogPresenter$Factory$Impl) obj2).delegateFactory;
                    AndroidStringManager androidStringManager24 = (AndroidStringManager) transferInPresenter$MetroFactory4.stringManager.lambda.invoke();
                    BlockerFlowListener blockerFlowListener = (BlockerFlowListener) transferInPresenter$MetroFactory4.moneyFormatterFactory.invoke();
                    Analytics analytics12 = (Analytics) transferInPresenter$MetroFactory4.analytics.getValue();
                    androidStringManager24.getClass();
                    blockerFlowListener.getClass();
                    analytics12.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(androidStringManager24, blockerFlowListener, analytics12, (RecurringReloadsDismissDialogScreen) screen, screenNavigator));
                }
                if (!(screen instanceof ScheduledReloadConfirmationScreen)) {
                    return null;
                }
                ReportAbusePresenter$MetroFactory reportAbusePresenter$MetroFactory = ((ScheduledReloadConfirmationPresenter$Factory$Impl) obj).delegateFactory;
                LocalizedMoneyFormatter.Factory factory7 = (LocalizedMoneyFormatter.Factory) reportAbusePresenter$MetroFactory.contactRepository.invoke();
                ScheduledReloadsManager scheduledReloadsManager2 = (ScheduledReloadsManager) reportAbusePresenter$MetroFactory.favoritesManager.invoke();
                RealInstrumentManager realInstrumentManager6 = (RealInstrumentManager) reportAbusePresenter$MetroFactory.familyProfileManager.invoke();
                AppService appService3 = (AppService) reportAbusePresenter$MetroFactory.paymentManager.getValue();
                AndroidStringManager androidStringManager25 = (AndroidStringManager) reportAbusePresenter$MetroFactory.stringManager.lambda.invoke();
                BlockersDataNavigator blockersDataNavigator3 = (BlockersDataNavigator) reportAbusePresenter$MetroFactory.routerFactory.invoke();
                Analytics analytics13 = (Analytics) reportAbusePresenter$MetroFactory.appService.getValue();
                factory7.getClass();
                scheduledReloadsManager2.getClass();
                realInstrumentManager6.getClass();
                appService3.getClass();
                androidStringManager25.getClass();
                blockersDataNavigator3.getClass();
                analytics13.getClass();
                return MoleculePresenterKt.asPresenter$default(new ScheduledReloadConfirmationPresenter(factory7, scheduledReloadsManager2, realInstrumentManager6, appService3, androidStringManager25, blockersDataNavigator3, analytics13, (ScheduledReloadConfirmationScreen) screen, screenNavigator));
        }
    }

    public WorkPresenterFactory(ArticlePresenter$Factory$Impl articlePresenter$Factory$Impl, ContactSupportEmailInputPresenter$Factory$Impl contactSupportEmailInputPresenter$Factory$Impl, ContactSupportEmailMessagePresenter$Factory$Impl contactSupportEmailMessagePresenter$Factory$Impl, SupportHomePresenter$Factory$Impl supportHomePresenter$Factory$Impl, PhoneVerificationPresenter$Factory$Impl phoneVerificationPresenter$Factory$Impl, SupportSearchPresenter$Factory$Impl supportSearchPresenter$Factory$Impl, SupportIncidentDetailsPresenter$Factory$Impl supportIncidentDetailsPresenter$Factory$Impl, SupportPhoneStatusPresenter$Factory$Impl supportPhoneStatusPresenter$Factory$Impl, UnauthenticatedArticlePresenter$Factory$Impl unauthenticatedArticlePresenter$Factory$Impl, SupportFlowCheckConnectionPresenter$Factory$Impl supportFlowCheckConnectionPresenter$Factory$Impl, SupportLoadClientScenarioPresenter$Factory$Impl supportLoadClientScenarioPresenter$Factory$Impl, SupportDisputeTrackerPresenter$Factory$Impl supportDisputeTrackerPresenter$Factory$Impl, SupportArticleIncidentsSheetPresenter$Factory$Impl supportArticleIncidentsSheetPresenter$Factory$Impl, ScreenshotConfirmPresenter$Factory$Impl screenshotConfirmPresenter$Factory$Impl, ScreenshotReviewPresenter$Factory$Impl screenshotReviewPresenter$Factory$Impl, SupportActivityPickerPresenter$Factory$Impl supportActivityPickerPresenter$Factory$Impl, SupportTransactionConfirmationPresenter$Factory$Impl supportTransactionConfirmationPresenter$Factory$Impl, SupportHomeContactOptionsSheetPresenter$Factory$Impl supportHomeContactOptionsSheetPresenter$Factory$Impl) {
        this.workHomePresenterFactory = articlePresenter$Factory$Impl;
        this.workWebPresenterFactory = contactSupportEmailInputPresenter$Factory$Impl;
        this.merchantPickerPresenterFactory = contactSupportEmailMessagePresenter$Factory$Impl;
        this.clockInBottomSheetPresenterFactory = supportHomePresenter$Factory$Impl;
        this.clockInOverlayPresenterFactory = phoneVerificationPresenter$Factory$Impl;
        this.takeBreakBottomSheetPresenterFactory = supportSearchPresenter$Factory$Impl;
        this.declareCashTipBottomSheetPresenterFactory = supportIncidentDetailsPresenter$Factory$Impl;
        this.shiftNotStartedPresenterFactory = supportPhoneStatusPresenter$Factory$Impl;
        this.shiftNotePresenterFactory = unauthenticatedArticlePresenter$Factory$Impl;
        this.payHomePresenterFactory = supportLoadClientScenarioPresenter$Factory$Impl;
        this.payHistoryListPresenterFactory = supportDisputeTrackerPresenter$Factory$Impl;
        this.taxFormsListPresenterFactory = screenshotConfirmPresenter$Factory$Impl;
        this.taxFormDownloaderPresenterFactory = screenshotReviewPresenter$Factory$Impl;
        this.shiftDetailPresenterFactory = supportActivityPickerPresenter$Factory$Impl;
        this.shiftListPresenterFactory = supportTransactionConfirmationPresenter$Factory$Impl;
    }

    public WorkPresenterFactory(WorkHomePresenter$Factory$Impl workHomePresenter$Factory$Impl, WorkWebPresenter$Factory$Impl workWebPresenter$Factory$Impl, MerchantPickerPresenter$Factory$Impl merchantPickerPresenter$Factory$Impl, ClockInBottomSheetPresenter$Factory$Impl clockInBottomSheetPresenter$Factory$Impl, ClockInOverlayPresenter$Factory$Impl clockInOverlayPresenter$Factory$Impl, TakeBreakBottomSheetPresenter$Factory$Impl takeBreakBottomSheetPresenter$Factory$Impl, DeclareCashTipBottomSheetPresenter$Factory$Impl declareCashTipBottomSheetPresenter$Factory$Impl, ShiftNotStartedDialogPresenter$Factory$Impl shiftNotStartedDialogPresenter$Factory$Impl, ShiftNotePresenter$Factory$Impl shiftNotePresenter$Factory$Impl, PayHomePresenter$Factory$Impl payHomePresenter$Factory$Impl, PayHistoryListPresenter$Factory$Impl payHistoryListPresenter$Factory$Impl, TaxFormsListPresenter$Factory$Impl taxFormsListPresenter$Factory$Impl, TaxFormDownloaderPresenter$Factory$Impl taxFormDownloaderPresenter$Factory$Impl, TimecardDetailPresenter$Factory$Impl timecardDetailPresenter$Factory$Impl, ShiftDetailPresenter$Factory$Impl shiftDetailPresenter$Factory$Impl, ShiftListPresenter$Factory$Impl shiftListPresenter$Factory$Impl) {
        this.workHomePresenterFactory = workHomePresenter$Factory$Impl;
        this.workWebPresenterFactory = workWebPresenter$Factory$Impl;
        this.merchantPickerPresenterFactory = merchantPickerPresenter$Factory$Impl;
        this.clockInBottomSheetPresenterFactory = clockInBottomSheetPresenter$Factory$Impl;
        this.clockInOverlayPresenterFactory = clockInOverlayPresenter$Factory$Impl;
        this.takeBreakBottomSheetPresenterFactory = takeBreakBottomSheetPresenter$Factory$Impl;
        this.declareCashTipBottomSheetPresenterFactory = declareCashTipBottomSheetPresenter$Factory$Impl;
        this.shiftNotStartedPresenterFactory = shiftNotStartedDialogPresenter$Factory$Impl;
        this.shiftNotePresenterFactory = shiftNotePresenter$Factory$Impl;
        this.payHomePresenterFactory = payHomePresenter$Factory$Impl;
        this.payHistoryListPresenterFactory = payHistoryListPresenter$Factory$Impl;
        this.taxFormsListPresenterFactory = taxFormsListPresenter$Factory$Impl;
        this.taxFormDownloaderPresenterFactory = taxFormDownloaderPresenter$Factory$Impl;
        this.shiftDetailPresenterFactory = shiftDetailPresenter$Factory$Impl;
        this.shiftListPresenterFactory = shiftListPresenter$Factory$Impl;
    }
}
