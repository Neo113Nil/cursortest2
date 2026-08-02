package com.squareup.cash.work.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.net.Uri;
import android.telephony.euicc.EuiccManager;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.RoomDatabase$performClear$1;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.navigation.LocalInstalledStoreKt;
import app.cash.local.presenters.LocalPresenterFactoryKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.google.android.play.core.splitinstall.internal.zzi;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.ProfileUpsellPresenter;
import com.squareup.cash.account.settings.viewmodels.ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.DefaultActivityItemEventHandler$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.cdf.passkey.PasskeyCreateCancelled;
import com.squareup.cash.cdf.passkey.PasskeyCreateFailedDismissed;
import com.squareup.cash.cdf.passkey.PasskeyDeleteCancelled;
import com.squareup.cash.cdf.passkey.PasskeyDeleteFailedDismissed;
import com.squareup.cash.cdf.shifts.ShiftsTaxFormsDownloadTap;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.observabilitynaming.ObservabilityView;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.datetimeformatter.api.TodayDateTimeFormatter$FormatOptions;
import com.squareup.cash.datetimeformatter.real.RealTodayDateTimeFormatter;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$EsimSupportedOverride;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.genericelements.backend.GenericTreeElementsData;
import com.squareup.cash.genericelements.backend.RealGenericTreeElementsRepo;
import com.squareup.cash.genericelements.presenters.RealGenericTreeElementsPresenter$Factory$Impl;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsAnalyticsData;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsItem;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.metrics.RealInvestingMetrics;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.keystats.InvestingKeyStatsDetailsViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$filterContacts$$inlined$map$1;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.merchant.presenters.SquareLoyaltySheetPresenter$State;
import com.squareup.cash.merchant.screens.SquareLoyaltySheetScreen;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltySheetViewModel;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerOption;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerQuestion;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerScreen;
import com.squareup.cash.moneybot.screens.RawMessagesScreen;
import com.squareup.cash.moneybot.viewmodels.RawMessagesViewModel;
import com.squareup.cash.moneybot.viewmodels.staticpicker.MoneybotStaticPickerViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.onboarding.screens.OnboardingLandingScreen;
import com.squareup.cash.onboarding.viewmodels.OnboardingLandingViewModel;
import com.squareup.cash.passkeys.backend.Passkey;
import com.squareup.cash.passkeys.backend.RealPasskeyAnalytics;
import com.squareup.cash.passkeys.backend.RealPasskeyRepository;
import com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration;
import com.squareup.cash.paychecks.viewmodels.HelpSheetViewEvent;
import com.squareup.cash.paychecks.viewmodels.HelpSheetViewModel;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$4$1$2;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckBlockerScreen;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckPresenter$models$1$1;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewModel;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.phoneplans.applets.presenters.PhonePlansAppletTilePresenter$WhenMappings;
import com.squareup.cash.phoneplans.applets.presenters.RealPhonePlansAppletTileAvailabilityManager;
import com.squareup.cash.phoneplans.applets.viewmodels.PhonePlansAppletTileModel;
import com.squareup.cash.pools.applets.presenters.PoolsAppletTileModel;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.presenters.PoolsListPresenter$models$2$2;
import com.squareup.cash.pools.screens.PoolMoreOptionsBottomSheet;
import com.squareup.cash.pools.viewmodels.PoolMoreOptionsBottomSheetViewModel;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.profile.devicemanager.navigation.RealDeviceManagerInboundNavigator$Factory$Impl;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.Alias;
import com.squareup.cash.profile.viewmodels.ContactMethodDetailsViewModel;
import com.squareup.cash.profile.viewmodels.OpenSourceViewModel;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.savings.backend.api.model.SavingsScreen;
import com.squareup.cash.savings.presenters.SavingsActivityItemEventDecorator;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.savings.screens.SavingsFullActivityScreen;
import com.squareup.cash.savings.screens.SavingsScreen;
import com.squareup.cash.savings.screens.TransferInScreen;
import com.squareup.cash.savings.viewmodels.AmountSelectorViewModel;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.support.backend.api.DisputesTrackerService$DisputeTrackerResult;
import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import com.squareup.cash.support.backend.real.RealDisputesTrackerMapper;
import com.squareup.cash.support.backend.real.RealDisputesTrackerService;
import com.squareup.cash.support.backend.real.RealSupportEmailValidationService;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.viewmodels.ChatFailedDeliveryViewModel;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.presenters.ArticlePresenter$models$1$1;
import com.squareup.cash.support.presenters.SupportDisputeTrackerPresenter$models$1$1;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.viewmodels.ContactSupportEmailInputViewModel$Loaded;
import com.squareup.cash.support.viewmodels.ContactSupportEmailMessageViewModel$Editing;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewModel;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentData;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.backend.real.RealTapToPayRepository;
import com.squareup.cash.taptopay.backend.real.RealTapToPaySessionManager;
import com.squareup.cash.taptopay.presenters.TapToPayInitiatorNotesPresenter$models$1$1;
import com.squareup.cash.taptopay.screens.TapToPayErrorDialogScreen;
import com.squareup.cash.taptopay.viewmodels.TapToPayErrorDialogViewModel;
import com.squareup.cash.taptopay.viewmodels.TapToPayInitiatorNotesViewModel;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.transfers.screens.InstrumentLinkingOption;
import com.squareup.cash.transfers.screens.InstrumentLinkingOptionsScreen;
import com.squareup.cash.transfers.screens.RecurringReloadsDismissDialogScreen;
import com.squareup.cash.transfers.viewmodels.InstrumentLinkingOptionsViewEvent;
import com.squareup.cash.transfers.viewmodels.InstrumentLinkingOptionsViewModel;
import com.squareup.cash.transfers.viewmodels.RecurringReloadsDismissDialogViewModel;
import com.squareup.cash.ui.CashNavigationLogger;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import com.squareup.cash.work.data.api.ClockInControls;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.cash.work.data.api.ClockInEssentialsState;
import com.squareup.cash.work.data.api.DashboardScheduleState;
import com.squareup.cash.work.data.api.LocationScopedClockInControls;
import com.squareup.cash.work.data.api.PayData;
import com.squareup.cash.work.data.api.PayDataKt;
import com.squareup.cash.work.data.api.PayDataLoader;
import com.squareup.cash.work.data.api.PayDataState;
import com.squareup.cash.work.data.api.TaxFormData;
import com.squareup.cash.work.data.real.RealAssignedJobProvider;
import com.squareup.cash.work.data.real.RealClockInEssentialsProvider;
import com.squareup.cash.work.data.real.RealDashboardScheduleProvider;
import com.squareup.cash.work.data.real.RealPayDataLoader;
import com.squareup.cash.work.data.real.RealSelectedMerchantDataProvider;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.presenters.pay.PayHistoryListPresenter$MetroFactory;
import com.squareup.cash.work.presenters.pay.RealPayCellPresenter$Factory$Impl;
import com.squareup.cash.work.presenters.pay.TaxFormDownloaderPresenter$downloadAndNavigate$1;
import com.squareup.cash.work.presenters.pay.TaxFormsListPresenter$fetchTaxForms$1;
import com.squareup.cash.work.presenters.providers.RealAssignedLocationProvider;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.cash.work.presenters.shift.DashboardShiftMapper$MetroFactory;
import com.squareup.cash.work.presenters.shift.RealShiftSection2Presenter$Factory$Impl;
import com.squareup.cash.work.presenters.shift.data.ClockInStateResolver;
import com.squareup.cash.work.presenters.shift.data.ScheduledShiftStatus;
import com.squareup.cash.work.screens.ShiftNotStartedDialogScreen;
import com.squareup.cash.work.screens.WorkHomeScreen;
import com.squareup.cash.work.screens.WorkTaxFormDownloaderScreen;
import com.squareup.cash.work.screens.WorkTaxFormsListScreen;
import com.squareup.cash.work.service.api.taxforms.TaxFormJsonData;
import com.squareup.cash.work.service.api.taxforms.TaxFormsResponse;
import com.squareup.cash.work.service.api.taxforms.TaxFormsService;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.MerchantKt;
import com.squareup.cash.work.tinygraph.real.RealMerchantRepository;
import com.squareup.cash.work.viewmodels.MerchantPickerViewModel;
import com.squareup.cash.work.viewmodels.MerchantRowViewModel;
import com.squareup.cash.work.viewmodels.PayCellViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.viewmodels.ShiftNotStartedDialogViewModel;
import com.squareup.cash.work.viewmodels.ShiftSection2ViewModel;
import com.squareup.cash.work.viewmodels.TaxFormDownloaderViewModel;
import com.squareup.cash.work.viewmodels.TaxFormsListViewModel;
import com.squareup.cash.work.viewmodels.WorkHomeTitleBarViewModel;
import com.squareup.cash.work.viewmodels.WorkHomeViewModel;
import com.squareup.cash.work.viewmodels.WorkYouViewModel;
import com.squareup.cash.work.webview.presenters.OtkRedirectUseCase;
import com.squareup.cash.work.webview.screens.WorkWebScreen;
import com.squareup.cash.work.webview.viewmodels.WorkWebViewModel;
import com.squareup.kotterknife.Lazy;
import com.squareup.moshi.Moshi;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.blockly.api.GetBlockedCustomersResponse;
import com.squareup.protos.cash.disputron.core.ClaimResolutionStatus;
import com.squareup.protos.cash.disputron.core.ListClaimDSL3Data;
import com.squareup.protos.cash.disputron.core.TransactionType;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.loyalizer.app.LoyaltyPromotionSheetPlaceholder;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityStats;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.cash.pools.PoolState;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.PhonePlanESimCheckBlocker;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.invest.ui.Section;
import com.squareup.protos.timecards.DatetimeInterval;
import com.squareup.protos.timecards.GetShiftsOverviewResponse;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.scannerview.TextSetter;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.squareup.workflow1.internal.SubtreeManager;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.stripe.hcaptcha.HCaptcha;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.internal.DoubleCheck;
import io.noties.markwon.MarkwonConfiguration;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import net.idrnd.misnap.iad.Payload;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.InputEventTrigger;
import papa.SafeTrace;
import retrofit2.OkHttpCall;
import squareup.cash.phoneplans.syncvalues.PhonePlanAppletV1;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class WorkHomePresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId;
    public final Object payPresenter;
    public final Object shiftSection2Presenter;
    public final Object shiftsAnalytics;
    public final Object titleBarPresenter;
    public final Object youPresenter;

    public WorkHomePresenter(WorkHomeScreen workHomeScreen, BetterNavigator.ScreenNavigator screenNavigator, ShiftsAnalytics shiftsAnalytics, RealWorkHomeTitleBarPresenter$Factory$Impl realWorkHomeTitleBarPresenter$Factory$Impl, RealShiftSection2Presenter$Factory$Impl realShiftSection2Presenter$Factory$Impl, RealPayCellPresenter$Factory$Impl realPayCellPresenter$Factory$Impl, RealYouPresenter$Factory$Impl realYouPresenter$Factory$Impl) {
        this.$r8$classId = 0;
        workHomeScreen.getClass();
        this.shiftsAnalytics = shiftsAnalytics;
        ProfileUpsellPresenter.MetroFactory metroFactory = realWorkHomeTitleBarPresenter$Factory$Impl.delegateFactory;
        RealMerchantRepository realMerchantRepository = (RealMerchantRepository) metroFactory.analytics.getValue();
        RealSelectedMerchantDataProvider realSelectedMerchantDataProvider = (RealSelectedMerchantDataProvider) metroFactory.syncValueReader.getValue();
        RealSellerCardViewModelProducer realSellerCardViewModelProducer = (RealSellerCardViewModelProducer) metroFactory.routerFactory.invoke();
        realMerchantRepository.getClass();
        realSelectedMerchantDataProvider.getClass();
        realSellerCardViewModelProducer.getClass();
        this.titleBarPresenter = new UnleashContext(screenNavigator, realMerchantRepository, realSelectedMerchantDataProvider, realSellerCardViewModelProducer);
        PayHistoryListPresenter$MetroFactory payHistoryListPresenter$MetroFactory = realShiftSection2Presenter$Factory$Impl.delegateFactory;
        RealClockInEssentialsProvider realClockInEssentialsProvider = (RealClockInEssentialsProvider) payHistoryListPresenter$MetroFactory.payrollJsonService.getValue();
        RealDashboardScheduleProvider realDashboardScheduleProvider = (RealDashboardScheduleProvider) payHistoryListPresenter$MetroFactory.selectedMerchantProvider.getValue();
        RealSelectedMerchantDataProvider realSelectedMerchantDataProvider2 = (RealSelectedMerchantDataProvider) payHistoryListPresenter$MetroFactory.selectedMerchantDataProvider.getValue();
        RealAssignedJobProvider realAssignedJobProvider = (RealAssignedJobProvider) payHistoryListPresenter$MetroFactory.sellerCardViewModelProducer.invoke();
        RealAssignedLocationProvider realAssignedLocationProvider = (RealAssignedLocationProvider) payHistoryListPresenter$MetroFactory.shiftsAnalytics.invoke();
        MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) ((DashboardShiftMapper$MetroFactory) payHistoryListPresenter$MetroFactory.stringManager).invoke();
        RealSellerCardViewModelProducer realSellerCardViewModelProducer2 = (RealSellerCardViewModelProducer) payHistoryListPresenter$MetroFactory.payHistoryListViewModelMapper.invoke();
        realClockInEssentialsProvider.getClass();
        realDashboardScheduleProvider.getClass();
        realSelectedMerchantDataProvider2.getClass();
        realAssignedJobProvider.getClass();
        realAssignedLocationProvider.getClass();
        realSellerCardViewModelProducer2.getClass();
        this.shiftSection2Presenter = new HCaptcha(screenNavigator, realClockInEssentialsProvider, realDashboardScheduleProvider, realSelectedMerchantDataProvider2, realAssignedJobProvider, realAssignedLocationProvider, markwonConfiguration, realSellerCardViewModelProducer2);
        OkHttpCall.AnonymousClass1 anonymousClass1 = realPayCellPresenter$Factory$Impl.delegateFactory;
        PayDataLoader payDataLoader = (PayDataLoader) ((DoubleCheck) anonymousClass1.val$callback).getValue();
        Lazy lazy = (Lazy) ((CashNavigationLogger.MetroFactory) anonymousClass1.this$0).invoke();
        payDataLoader.getClass();
        this.payPresenter = new TextSetter(screenNavigator, payDataLoader, lazy);
        RealYouPresenter$MetroFactory realYouPresenter$MetroFactory = realYouPresenter$Factory$Impl.delegateFactory;
        RealAssignedJobProvider realAssignedJobProvider2 = (RealAssignedJobProvider) realYouPresenter$MetroFactory.assignedJobProvider.invoke();
        RealAssignedLocationProvider realAssignedLocationProvider2 = (RealAssignedLocationProvider) realYouPresenter$MetroFactory.assignedLocationProvider.invoke();
        RealPasscodeProvider realPasscodeProvider = (RealPasscodeProvider) realYouPresenter$MetroFactory.passcodeProvider.invoke();
        realAssignedJobProvider2.getClass();
        realAssignedLocationProvider2.getClass();
        realPasscodeProvider.getClass();
        this.youPresenter = new TextSetter(realAssignedJobProvider2, realAssignedLocationProvider2, realPasscodeProvider);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$downloadAndNavigate(WorkHomePresenter workHomePresenter, ContinuationImpl continuationImpl) {
        TaxFormDownloaderPresenter$downloadAndNavigate$1 taxFormDownloaderPresenter$downloadAndNavigate$1;
        int i;
        Uri uri;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) workHomePresenter.shiftSection2Presenter;
        WorkTaxFormDownloaderScreen workTaxFormDownloaderScreen = (WorkTaxFormDownloaderScreen) workHomePresenter.titleBarPresenter;
        if (continuationImpl instanceof TaxFormDownloaderPresenter$downloadAndNavigate$1) {
            taxFormDownloaderPresenter$downloadAndNavigate$1 = (TaxFormDownloaderPresenter$downloadAndNavigate$1) continuationImpl;
            int i2 = taxFormDownloaderPresenter$downloadAndNavigate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                taxFormDownloaderPresenter$downloadAndNavigate$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = taxFormDownloaderPresenter$downloadAndNavigate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxFormDownloaderPresenter$downloadAndNavigate$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ShiftsAnalytics shiftsAnalytics = (ShiftsAnalytics) workHomePresenter.shiftsAnalytics;
                    String str = workTaxFormDownloaderScreen.token;
                    String str2 = workTaxFormDownloaderScreen.title;
                    str.getClass();
                    str2.getClass();
                    shiftsAnalytics.analytics.track(new ShiftsTaxFormsDownloadTap(shiftsAnalytics.getPersonToken(), shiftsAnalytics.getMerchantToken(), str, str2), null);
                    TextSetter textSetter = (TextSetter) workHomePresenter.youPresenter;
                    String str3 = workTaxFormDownloaderScreen.downloadUrl;
                    String str4 = workTaxFormDownloaderScreen.token;
                    taxFormDownloaderPresenter$downloadAndNavigate$1.label = 1;
                    obj = JobKt.withContext((CoroutineContext) textSetter.scannerText, new Logger$_log$2(textSetter, str3, str4, null, 12), taxFormDownloaderPresenter$downloadAndNavigate$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                uri = (Uri) obj;
                Back back = Back.INSTANCE;
                if (uri == null) {
                    screenNavigator.goTo(back);
                    screenNavigator.goTo(new PdfScreen(uri, workTaxFormDownloaderScreen.title));
                } else {
                    screenNavigator.goTo(back);
                }
                return Unit.INSTANCE;
            }
        }
        taxFormDownloaderPresenter$downloadAndNavigate$1 = new TaxFormDownloaderPresenter$downloadAndNavigate$1(workHomePresenter, continuationImpl);
        Object obj2 = taxFormDownloaderPresenter$downloadAndNavigate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxFormDownloaderPresenter$downloadAndNavigate$1.label;
        if (i != 0) {
        }
        uri = (Uri) obj2;
        Back back2 = Back.INSTANCE;
        if (uri == null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:10:0x0025, B:11:0x0043, B:13:0x0049, B:14:0x004f, B:16:0x0053, B:17:0x0060, B:19:0x0066, B:24:0x008d, B:30:0x0072, B:41:0x0034, B:21:0x006c), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:10:0x0025, B:11:0x0043, B:13:0x0049, B:14:0x004f, B:16:0x0053, B:17:0x0060, B:19:0x0066, B:24:0x008d, B:30:0x0072, B:41:0x0034, B:21:0x006c), top: B:7:0x0021, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$fetchTaxForms(WorkHomePresenter workHomePresenter, String str, ContinuationImpl continuationImpl) {
        TaxFormsListPresenter$fetchTaxForms$1 taxFormsListPresenter$fetchTaxForms$1;
        int i;
        TaxFormsResponse taxFormsResponse;
        TaxFormData taxFormData;
        try {
            if (continuationImpl instanceof TaxFormsListPresenter$fetchTaxForms$1) {
                taxFormsListPresenter$fetchTaxForms$1 = (TaxFormsListPresenter$fetchTaxForms$1) continuationImpl;
                int i2 = taxFormsListPresenter$fetchTaxForms$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    taxFormsListPresenter$fetchTaxForms$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = taxFormsListPresenter$fetchTaxForms$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = taxFormsListPresenter$fetchTaxForms$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        TaxFormsService taxFormsService = (TaxFormsService) workHomePresenter.payPresenter;
                        taxFormsListPresenter$fetchTaxForms$1.label = 1;
                        obj = taxFormsService.getTaxForms(str, "DESC", taxFormsListPresenter$fetchTaxForms$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    ApiResult apiResult = (ApiResult) obj;
                    taxFormsResponse = (TaxFormsResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                    if (taxFormsResponse != null) {
                        return null;
                    }
                    List<TaxFormJsonData> list = taxFormsResponse.data;
                    ArrayList arrayList = new ArrayList();
                    for (TaxFormJsonData taxFormJsonData : list) {
                        try {
                            taxFormData = LocalInstalledStoreKt.toTaxFormData(taxFormJsonData);
                        } catch (Exception e) {
                            Timber.Forest.w("Failed to parse tax form: " + taxFormJsonData, new Object[0], e);
                            taxFormData = null;
                        }
                        if (taxFormData != null) {
                            arrayList.add(taxFormData);
                        }
                    }
                    return arrayList;
                }
            }
            if (i != 0) {
            }
            ApiResult apiResult2 = (ApiResult) obj;
            taxFormsResponse = (TaxFormsResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
            if (taxFormsResponse != null) {
            }
        } catch (Exception e2) {
            Timber.Forest.e("Failed to fetch tax forms", new Object[0], e2);
            return null;
        }
        taxFormsListPresenter$fetchTaxForms$1 = new TaxFormsListPresenter$fetchTaxForms$1(workHomePresenter, continuationImpl);
        Object obj2 = taxFormsListPresenter$fetchTaxForms$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxFormsListPresenter$fetchTaxForms$1.label;
    }

    public static final void access$replace(WorkHomePresenter workHomePresenter, List list, Alias alias, boolean z) {
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(((Alias) it.next()).value, alias.value)) {
                break;
            } else {
                i++;
            }
        }
        list.set(i, Alias.copy$default(alias, z));
    }

    public static final Object access$selectOption(WorkHomePresenter workHomePresenter, String str, SuspendLambda suspendLambda) {
        RealBlockersHelper realBlockersHelper = (RealBlockersHelper) workHomePresenter.youPresenter;
        PhonePlansEsimCheckBlockerScreen phonePlansEsimCheckBlockerScreen = (PhonePlansEsimCheckBlockerScreen) workHomePresenter.shiftSection2Presenter;
        BlockersData blockersData = phonePlansEsimCheckBlockerScreen.blockersData;
        ClientScenario clientScenario = blockersData.clientScenario;
        clientScenario.getClass();
        Object collect = realBlockersHelper.selectOption(phonePlansEsimCheckBlockerScreen, str, blockersData, clientScenario).collect(new HomeViewPresenter$models$4$1$2(workHomePresenter, 28), suspendLambda);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : Unit.INSTANCE;
    }

    public static final void access$trackPasskeyOperationDismissed(WorkHomePresenter workHomePresenter, RealPasskeyAnalytics realPasskeyAnalytics, PasskeyManagementViewModel.OperationState operationState) {
        Analytics analytics = realPasskeyAnalytics.analytics;
        if (operationState instanceof PasskeyManagementViewModel.OperationState.Create.Error) {
            analytics.track(new PasskeyCreateFailedDismissed(), null);
            return;
        }
        if (Intrinsics.areEqual(operationState, PasskeyManagementViewModel.OperationState.Create.InProgress.INSTANCE)) {
            analytics.track(new PasskeyCreateCancelled(), null);
            return;
        }
        if (operationState instanceof PasskeyManagementViewModel.OperationState.Remove.AwaitingConfirmation) {
            analytics.track(new PasskeyDeleteCancelled(), null);
            return;
        }
        if (operationState instanceof PasskeyManagementViewModel.OperationState.Remove.Error) {
            analytics.track(new PasskeyDeleteFailedDismissed(), null);
            return;
        }
        if (operationState instanceof PasskeyManagementViewModel.OperationState.Remove.InProgress) {
            analytics.track(new PasskeyDeleteCancelled(), null);
        } else {
            if ((operationState instanceof PasskeyManagementViewModel.OperationState.Create.Success) || (operationState instanceof PasskeyManagementViewModel.OperationState.Remove.Success) || operationState == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.coroutines.Continuation] */
    private final Object models$com$squareup$cash$phoneplans$applets$presenters$PhonePlansAppletTilePresenter(Flow flow, Composer composer, int i) {
        Object obj;
        PhonePlansAppletTileModel.Installed.Status status;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1459848065);
        VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) this.payPresenter;
        verifyCheckDialogPresenter.getClass();
        gapComposer.startReplaceGroup(-1613152821);
        boolean changed = gapComposer.changed(((AppletId) verifyCheckDialogPresenter.navigator).ordinal());
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            rememberedValue = new InviteContactsPresenter$special$$inlined$map$1(((RealPromotedAppletTileStore) verifyCheckDialogPresenter.args).getPromotedAppletTiles(), verifyCheckDialogPresenter, 17);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) Updater.collectAsState((Flow) rememberedValue, PromotedAppletTileViewModel.Loading.INSTANCE, null, gapComposer, 0, 2).getValue();
        gapComposer.end(false);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = ((SyncValueReader) this.shiftSection2Presenter).getSingleValue(AndroidSyncValueSpecs.PhonePlanApplet, new PoolDetailsViewKt$$ExternalSyntheticLambda3(21));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new MusicPresenter$models$3$1(this, r2, 24);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        Updater.LaunchedEffect(gapComposer, flow, new PhonePlansHomePresenter$models$1$1(flow, (Continuation) r2, this, collectAsState, 14));
        PhonePlanAppletV1 phonePlanAppletV1 = (PhonePlanAppletV1) collectAsState.getValue();
        PhonePlanAppletV1.State state = phonePlanAppletV1 != null ? phonePlanAppletV1.state : null;
        int i2 = state == null ? -1 : PhonePlansAppletTilePresenter$WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i2 == -1 || i2 == 1) {
            obj = PhonePlansAppletTileModel.Loading.INSTANCE;
        } else {
            if (i2 != 2) {
                switch (state) {
                    case STATE_UNSPECIFIED:
                    case NEVER_ENROLLED:
                        a$$ExternalSyntheticBUOutline0.m$1("Unsupported state");
                        return null;
                    case PENDING:
                        status = PhonePlansAppletTileModel.Installed.Status.Pending;
                        break;
                    case TRANSFERRING:
                        status = PhonePlansAppletTileModel.Installed.Status.Transferring;
                        break;
                    case PROVISIONED:
                        status = PhonePlansAppletTileModel.Installed.Status.Provisioned;
                        break;
                    case ACTIVE:
                        status = PhonePlansAppletTileModel.Installed.Status.Active;
                        break;
                    case BILL_OVERDUE:
                        status = PhonePlansAppletTileModel.Installed.Status.Overdue;
                        break;
                    case SUSPENDED:
                        status = PhonePlansAppletTileModel.Installed.Status.Suspended;
                        break;
                    case ATTENTION_NEEDED:
                        status = PhonePlansAppletTileModel.Installed.Status.AttentionNeeded;
                        break;
                    case CANCELLED_PENDING:
                        status = PhonePlansAppletTileModel.Installed.Status.AttentionNeeded;
                        break;
                    case DEGRADED:
                        status = PhonePlansAppletTileModel.Installed.Status.AttentionNeeded;
                        break;
                    case CANCELLED:
                        status = PhonePlansAppletTileModel.Installed.Status.Cancelled;
                        break;
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                }
                PhonePlanAppletV1 phonePlanAppletV12 = (PhonePlanAppletV1) collectAsState.getValue();
                phonePlanAppletV12.getClass();
                LocalizedString localizedString = phonePlanAppletV12.title;
                String str = localizedString != null ? localizedString.translated_value : null;
                if (str == null) {
                    str = "";
                }
                PhonePlanAppletV1 phonePlanAppletV13 = (PhonePlanAppletV1) collectAsState.getValue();
                phonePlanAppletV13.getClass();
                LocalizedString localizedString2 = phonePlanAppletV13.subtitle;
                String str2 = localizedString2 != null ? localizedString2.translated_value : null;
                String str3 = str2 != null ? str2 : "";
                PhonePlanAppletV1 phonePlanAppletV14 = (PhonePlanAppletV1) collectAsState.getValue();
                phonePlanAppletV14.getClass();
                LocalizedString localizedString3 = phonePlanAppletV14.detail;
                obj = new PhonePlansAppletTileModel.Installed(status, str, str3, localizedString3 != null ? localizedString3.translated_value : null);
            } else {
                PhonePlanAppletV1 phonePlanAppletV15 = (PhonePlanAppletV1) collectAsState.getValue();
                phonePlanAppletV15.getClass();
                LocalizedString localizedString4 = phonePlanAppletV15.title;
                String str4 = localizedString4 != null ? localizedString4.translated_value : null;
                if (str4 == null) {
                    str4 = "";
                }
                PhonePlanAppletV1 phonePlanAppletV16 = (PhonePlanAppletV1) collectAsState.getValue();
                phonePlanAppletV16.getClass();
                LocalizedString localizedString5 = phonePlanAppletV16.subtitle;
                String str5 = localizedString5 != null ? localizedString5.translated_value : null;
                obj = new PhonePlansAppletTileModel.Uninstalled(str4, str5 != null ? str5 : "", promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded ? (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel : 0);
            }
        }
        gapComposer.end(false);
        return obj;
    }

    private final Object models$com$squareup$cash$pools$presenters$PoolMoreOptionsBottomSheetPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(151922605);
        Updater.LaunchedEffect(gapComposer, flow, new PdfPreviewPresenter$models$1$1(flow, (Continuation) null, this, 7));
        PoolMoreOptionsBottomSheet poolMoreOptionsBottomSheet = (PoolMoreOptionsBottomSheet) this.payPresenter;
        Redacted redacted = poolMoreOptionsBottomSheet.pool;
        PoolOwner poolOwner = ((MoneyPool) redacted.getValue()).owner;
        poolOwner.getClass();
        boolean z = (!Intrinsics.areEqual(poolOwner.customer_token, PlatformKt.activeAccountTokenOrNull((SessionManager) this.titleBarPresenter)) || ((MoneyPool) redacted.getValue()).status == PoolState.POOL_STATE_MANUAL_CLOSED || ((MoneyPool) redacted.getValue()).status == PoolState.POOL_STATE_CLOSING) ? false : true;
        boolean z2 = ((MoneyPool) redacted.getValue()).status == PoolState.POOL_STATE_MANUAL_CLOSED || ((MoneyPool) redacted.getValue()).status == PoolState.POOL_STATE_CLOSING;
        boolean z3 = poolMoreOptionsBottomSheet.viewerCanLeavePool;
        Money money = ((MoneyPool) redacted.getValue()).balance;
        money.getClass();
        Long l = money.amount;
        l.getClass();
        PoolMoreOptionsBottomSheetViewModel poolMoreOptionsBottomSheetViewModel = new PoolMoreOptionsBottomSheetViewModel(z2, z, z3, l.longValue() > 0);
        gapComposer.end(false);
        return poolMoreOptionsBottomSheetViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    private final Object models$com$squareup$cash$profile$presenters$blockedaccounts$RealBlockedAccountsSectionPresenter(Flow flow, Composer composer, int i) {
        List list;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.titleBarPresenter;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1064399423);
        Object rememberedValue = gapComposer.rememberedValue();
        Integer num = 0;
        num = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new AndroidFileSaver$save$2(this, mutableState, (Continuation) num, 14);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new PhonePlansHomePresenter$models$1$1(29, mutableState, (MoleculePresenter) this, (Object) flow, (Continuation) num));
        GetBlockedCustomersResponse getBlockedCustomersResponse = (GetBlockedCustomersResponse) mutableState.getValue();
        if (getBlockedCustomersResponse != null && (list = getBlockedCustomersResponse.blocked_customers) != null) {
            num = Integer.valueOf(list.size());
        }
        ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel = new ProfilePrivacyReadyViewModel$BlockedAccountsSectionViewModel(Recorder$$ExternalSyntheticOutline2.m$1(androidStringManager.get(R.string.profile_blocked_accounts_title), num != 0 ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(num.intValue(), " (", ")") : ""), androidStringManager.get(R.string.profile_blocked_accounts_description), androidStringManager.get(R.string.profile_blocked_accounts_view_all_button_title), num != 0 ? num.intValue() : 0);
        gapComposer.end(false);
        return profilePrivacyReadyViewModel$BlockedAccountsSectionViewModel;
    }

    private final Object models$com$squareup$cash$profile$presenters$notifications$ContactMethodDetailsPresenter(Flow flow, Composer composer, int i) {
        ProfileScreens.ContactMethodDetailsScreen contactMethodDetailsScreen = (ProfileScreens.ContactMethodDetailsScreen) this.payPresenter;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-669818877);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        int i2 = 1;
        Object obj = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == obj) {
            rememberedValue = new ChatInputView$Content$1$1$1(this, null, i2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            Collection collection = (Collection) contactMethodDetailsScreen.aliases.getValue();
            SnapshotStateList snapshotStateList = new SnapshotStateList();
            snapshotStateList.addAll(collection);
            gapComposer.updateRememberedValue(snapshotStateList);
            rememberedValue2 = snapshotStateList;
        }
        SnapshotStateList snapshotStateList2 = (SnapshotStateList) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new PoolsListPresenter$models$2$2(flow, (Continuation) null, this, snapshotStateList2, mutableState, 16));
        String str = contactMethodDetailsScreen.title;
        String str2 = contactMethodDetailsScreen.body;
        List list = CollectionsKt.toList(snapshotStateList2);
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = snapshotStateList2.listIterator();
        while (true) {
            StateListIterator stateListIterator = (StateListIterator) listIterator;
            if (!stateListIterator.hasNext()) {
                break;
            }
            Object next = stateListIterator.next();
            if (((Alias) next).isChecked) {
                arrayList.add(next);
            }
        }
        ContactMethodDetailsViewModel contactMethodDetailsViewModel = new ContactMethodDetailsViewModel(str, str2, list, arrayList, contactMethodDetailsScreen.aliasType == UiAlias.Type.SMS, ((Boolean) mutableState.getValue()).booleanValue());
        gapComposer.end(false);
        return contactMethodDetailsViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    private final Object models$com$squareup$cash$savings$presenters$TransferInPresenter(Flow flow, Composer composer, int i) {
        List plus;
        WorkHomePresenter workHomePresenter = this;
        AndroidStringManager androidStringManager = (AndroidStringManager) workHomePresenter.shiftSection2Presenter;
        TransferInScreen transferInScreen = (TransferInScreen) workHomePresenter.shiftsAnalytics;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1393181444);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.mutableStateOf$default(transferInScreen.getConfig().initiallySelectedAmount);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        ?? r2 = 0;
        Updater.LaunchedEffect(gapComposer, flow, new RealQrCodesPresenter$models$1$1(flow, (Continuation) r2, workHomePresenter, mutableState, 16));
        String str = androidStringManager.get(R.string.savings_add_cash_title);
        boolean z = transferInScreen instanceof TransferInScreen.Condensed;
        if (z) {
            SavingsScreen savingsScreen = ((TransferInScreen.Condensed) transferInScreen).origin;
            GeneralSavingsScreen generalSavingsScreen = savingsScreen instanceof GeneralSavingsScreen ? (GeneralSavingsScreen) savingsScreen : null;
            SavingsScreen.ScreenType screenType = generalSavingsScreen != null ? generalSavingsScreen.f1197type : null;
            r2 = Intrinsics.areEqual(screenType, SavingsScreen.ScreenType.GeneralSavings.INSTANCE) ? androidStringManager.get(R.string.savings_add_cash_general_subtitle) : screenType instanceof SavingsScreen.ScreenType.GoalDetail ? androidStringManager.get(R.string.savings_add_cash_goal_subtitle) : androidStringManager.get(R.string.savings_add_cash_subtitle);
        } else if (!(transferInScreen instanceof TransferInScreen.Full)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        String str2 = r2;
        String str3 = androidStringManager.get(R.string.savings_add_cash_button_text);
        AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount = new AmountPickerViewModel.Ready.Amount.MoneyAmount(transferInScreen.getConfig().minimumAmount);
        AmountPickerViewModel.Ready.Amount.MoneyAmount moneyAmount2 = new AmountPickerViewModel.Ready.Amount.MoneyAmount(transferInScreen.getConfig().maximumAmount);
        Money money = (Money) mutableState.getValue();
        if (transferInScreen instanceof TransferInScreen.Full) {
            plus = EmptyList.INSTANCE;
        } else {
            if (!z) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            List list = ((TransferInScreen.Condensed) transferInScreen).config.quickAmounts;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                Money money2 = (Money) it.next();
                arrayList.add(new AmountSelectorViewModel.Amount(money2, ((MoneyFormatter) workHomePresenter.youPresenter).format(money2), money2.equals(money)));
                workHomePresenter = this;
            }
            String str4 = androidStringManager.get(R.string.savings_add_cash_overflow_button);
            AmountSelectorWidgetModel.Item.Icon icon = AmountSelectorWidgetModel.Item.Icon.PENDING;
            plus = CollectionsKt.plus((Collection) arrayList, (Object) new AmountSelectorViewModel.CustomAmount(str4, androidStringManager.get(R.string.savings_add_cash_custom_amount_button_accessibility_label)));
        }
        AmountPickerViewModel.Ready ready = new AmountPickerViewModel.Ready(str, str2, str3, moneyAmount, moneyAmount2, false, null, new AmountSelectorWidgetModel(plus), null, null, ((Money) mutableState.getValue()) != null, false, null, null, 15200);
        gapComposer.end(false);
        return ready;
    }

    private final Object models$com$squareup$cash$support$chat$presenters$ChatFailedDeliverySheetPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1509969469);
        Updater.LaunchedEffect(gapComposer, flow, new ArticlePresenter$models$1$1(flow, (Continuation) null, this, 6));
        ChatFailedDeliveryViewModel chatFailedDeliveryViewModel = new ChatFailedDeliveryViewModel(((SupportChatScreens.SupportChatSheets.ChatFailedDeliverySheet) this.payPresenter).allowResend);
        gapComposer.end(false);
        return chatFailedDeliveryViewModel;
    }

    private final Object models$com$squareup$cash$support$presenters$ContactSupportEmailInputPresenter(Flow flow, Composer composer, int i) {
        SupportScreens.ContactScreens.ContactSupportEmailInputScreen contactSupportEmailInputScreen = (SupportScreens.ContactScreens.ContactSupportEmailInputScreen) this.payPresenter;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(167636407);
        Object[] objArr = new Object[0];
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new BottomSheet$$ExternalSyntheticLambda2(this, 28);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Intrinsics.areEqual((String) mutableState.getValue(), "") ? new ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit(ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit.EditEmailState.Editing.INSTANCE) : ContactSupportEmailInputViewModel$Loaded.ViewMode.Review.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        String str = ((ContactSupportEmailInputViewModel$Loaded.ViewMode) mutableState2.getValue()) instanceof ContactSupportEmailInputViewModel$Loaded.ViewMode.Edit ? ((AndroidStringManager) this.titleBarPresenter).get(R.string.contact_support_email_input_title) : contactSupportEmailInputScreen.title;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new ChatInputView$Content$1$1$1(this, continuation, 16);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        Updater.LaunchedEffect(gapComposer, flow, new PoolsListPresenter$models$2$2(flow, (Continuation) null, (Object) this, mutableState2, mutableState, 28));
        String str2 = null;
        String str3 = (String) mutableState.getValue();
        boolean z = ((String) mutableState.getValue()).length() > 0;
        String str4 = (String) mutableState.getValue();
        Redacted redacted = contactSupportEmailInputScreen.preFilledEmail;
        if (redacted != null) {
            str2 = (String) redacted.getValue();
        }
        ContactSupportEmailInputViewModel$Loaded contactSupportEmailInputViewModel$Loaded = new ContactSupportEmailInputViewModel$Loaded(str, str3, z, !Intrinsics.areEqual(str4, str2 != null ? str2 : ""), (ContactSupportEmailInputViewModel$Loaded.ViewMode) mutableState2.getValue());
        gapComposer.end(false);
        return contactSupportEmailInputViewModel$Loaded;
    }

    private final Object models$com$squareup$cash$support$presenters$ContactSupportEmailMessagePresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1748745362);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default("");
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState3 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState4 = (MutableState) rememberedValue4;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new ChatInputView$Content$1$1$1(this, continuation, 17);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
        Updater.LaunchedEffect(gapComposer, flow, new DbSessionManager$updateDb$2(flow, null, this, mutableState, mutableState4, mutableState2, mutableState3, 25));
        ContactSupportEmailMessageViewModel$Editing contactSupportEmailMessageViewModel$Editing = new ContactSupportEmailMessageViewModel$Editing(!StringsKt.isBlank((String) mutableState.getValue()), ((Boolean) mutableState4.getValue()).booleanValue(), ((Boolean) mutableState2.getValue()).booleanValue(), (ContactSupportEmailMessageViewModel$Editing.StatusResult) mutableState3.getValue());
        gapComposer.end(false);
        return contactSupportEmailMessageViewModel$Editing;
    }

    private final Object models$com$squareup$cash$support$presenters$SupportDisputeTrackerPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-909551711);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new SupportDisputeTrackerPresenter$models$1$1(this, mutableState, null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        Updater.LaunchedEffect(gapComposer, flow, new WorkflowLayout$start$1(flow, (Continuation) null, this, mutableState, mutableState2, 2));
        DisputesTrackerService$DisputeTrackerResult disputesTrackerService$DisputeTrackerResult = (DisputesTrackerService$DisputeTrackerResult) mutableState.getValue();
        Object loaded = disputesTrackerService$DisputeTrackerResult instanceof DisputesTrackerService$DisputeTrackerResult.Failure ? SupportDisputeTrackerViewModel.Failed.INSTANCE : disputesTrackerService$DisputeTrackerResult instanceof DisputesTrackerService$DisputeTrackerResult.Success ? new SupportDisputeTrackerViewModel.Loaded(buildDisputes((DisputesTrackerService$DisputeTrackerResult.Success) disputesTrackerService$DisputeTrackerResult), ((Boolean) mutableState2.getValue()).booleanValue()) : SupportDisputeTrackerViewModel.Loading.INSTANCE;
        gapComposer.end(false);
        return loaded;
    }

    private final Object models$com$squareup$cash$taptopay$presenters$TapToPayErrorDialogPresenter(Flow flow, Composer composer, int i) {
        TapToPayErrorDialogViewModel tapToPayErrorDialogViewModel;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(917844713);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new ShoppingWebBridge.AnonymousClass1(this, continuation, 25);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Updater.LaunchedEffect(gapComposer, flow, new ArticlePresenter$models$1$1(flow, continuation, this, 29));
        TapToPayErrorDialogScreen tapToPayErrorDialogScreen = (TapToPayErrorDialogScreen) this.youPresenter;
        if (tapToPayErrorDialogScreen instanceof TapToPayErrorDialogScreen.TapToPayGenericErrorSupportDialogScreen) {
            tapToPayErrorDialogViewModel = TapToPayErrorDialogViewModel.GENERIC;
        } else if (tapToPayErrorDialogScreen instanceof TapToPayErrorDialogScreen.TapToPayPlayProtectErrorDialogScreen) {
            tapToPayErrorDialogViewModel = TapToPayErrorDialogViewModel.PLAY_PROTECT;
        } else if (tapToPayErrorDialogScreen instanceof TapToPayErrorDialogScreen.TapToPayCardTapErrorDialogScreen) {
            tapToPayErrorDialogViewModel = TapToPayErrorDialogViewModel.CARD_TAP;
        } else if (tapToPayErrorDialogScreen instanceof TapToPayErrorDialogScreen.TapToPayAndroidVersionOutdatedDialogScreen) {
            tapToPayErrorDialogViewModel = TapToPayErrorDialogViewModel.ANDROID_VERSION_NOT_SUPPORTED;
        } else {
            if (!(tapToPayErrorDialogScreen instanceof TapToPayErrorDialogScreen.TapToPayScreenCastingDialogScreen)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            tapToPayErrorDialogViewModel = TapToPayErrorDialogViewModel.SCREEN_CASTING_ON;
        }
        gapComposer.end(false);
        return tapToPayErrorDialogViewModel;
    }

    private final Object models$com$squareup$cash$taptopay$presenters$TapToPayInitiatorNotesPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-828004481);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Updater.mutableStateOf$default("");
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            rememberedValue2 = ((RealTapToPaySessionManager) this.shiftSection2Presenter).ttpSessionData;
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        TapToPayPaymentData tapToPayPaymentData = (TapToPayPaymentData) rememberedValue2;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(tapToPayPaymentData);
        Object rememberedValue3 = gapComposer.rememberedValue();
        int i2 = 0;
        if (changedInstance || rememberedValue3 == obj) {
            rememberedValue3 = new TapToPayInitiatorNotesPresenter$models$1$1(this, tapToPayPaymentData, null, i2);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        Updater.LaunchedEffect(gapComposer, flow, new WorkflowLayout$start$1(flow, (Continuation) null, this, mutableState, tapToPayPaymentData, 5));
        MutableState collectAsState = Updater.collectAsState(new RealRecipientRepository$suggestions$$inlined$map$1(((RealTapToPayRepository) this.titleBarPresenter).syncValueReader.getSingleValue(AndroidSyncValueSpecs.TapToPayDescriptionSuggestions), 29), EmptyList.INSTANCE, null, gapComposer, 48, 2);
        TapToPayInitiatorNotesViewModel tapToPayInitiatorNotesViewModel = new TapToPayInitiatorNotesViewModel((List) collectAsState.getValue(), ((String) mutableState.getValue()).length() > 0, tapToPayPaymentData != null ? tapToPayPaymentData.isDemoMode : false);
        gapComposer.end(false);
        return tapToPayInitiatorNotesViewModel;
    }

    private final Object models$com$squareup$cash$transfers$presenters$InstrumentLinkingOptionsPresenter(Flow flow, Composer composer, int i) {
        Continuation continuation;
        String str;
        String str2;
        boolean z;
        Object remoteIcon;
        InstrumentLinkingOptionsViewEvent replaceInstrumentClick;
        WorkHomePresenter workHomePresenter = this;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(556776670);
        Continuation continuation2 = null;
        Updater.LaunchedEffect(gapComposer, flow, new TaxWebAppBridge.AnonymousClass4(flow, continuation2, workHomePresenter, 19));
        InstrumentLinkingOptionsScreen instrumentLinkingOptionsScreen = (InstrumentLinkingOptionsScreen) workHomePresenter.payPresenter;
        String str3 = instrumentLinkingOptionsScreen.header;
        String str4 = instrumentLinkingOptionsScreen.body;
        List<InstrumentLinkingOptionsScreen.Option> list = instrumentLinkingOptionsScreen.options;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (InstrumentLinkingOptionsScreen.Option option : list) {
            InstrumentLinkingOption instrumentLinkingOption = option.instrumentLinkingOption;
            InstrumentIcon.IconShape iconShape = (!instrumentLinkingOptionsScreen.useCardArt || instrumentLinkingOption.getCashInstrumentType() == CashInstrumentType.BANK_ACCOUNT) ? InstrumentIcon.IconShape.CIRCLE : InstrumentIcon.IconShape.CARD;
            String str5 = option.title;
            String str6 = option.subtitle;
            boolean z2 = instrumentLinkingOption instanceof InstrumentLinkingOption.Link;
            InstrumentCellViewModel.Accessory accessory = InstrumentCellViewModel.Accessory.Push.INSTANCE;
            if (z2) {
                continuation = continuation2;
            } else {
                continuation = continuation2;
                if (!(instrumentLinkingOption instanceof InstrumentLinkingOption.Replace)) {
                    if (!(instrumentLinkingOption instanceof InstrumentLinkingOption.ReplaceInstrument)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return continuation;
                    }
                    accessory = new InstrumentCellViewModel.Accessory.Button(((AndroidStringManager) workHomePresenter.shiftsAnalytics).get(R.string.transfers_instrument_linking_options_replace));
                }
            }
            InstrumentCellViewModel.Accessory accessory2 = accessory;
            InstrumentLinkingOptionsScreen.Option.Icon icon = option.icon;
            if (icon instanceof InstrumentLinkingOptionsScreen.Option.Icon.LocalIcon) {
                zzd zzdVar = Icons.Companion;
                String str7 = ((InstrumentLinkingOptionsScreen.Option.Icon.LocalIcon) icon).iconId;
                zzdVar.getClass();
                Icons icons = zzd.get(str7);
                icons.getClass();
                str = str5;
                z = z2;
                str2 = str6;
                remoteIcon = new InstrumentIcon.LocalIcon(icons, null, null, null, iconShape, 14);
            } else {
                str = str5;
                str2 = str6;
                z = z2;
                if (icon instanceof InstrumentLinkingOptionsScreen.Option.Icon.LocalResource) {
                    InstrumentLinkingOptionsScreen.Option.Icon.LocalResource localResource = (InstrumentLinkingOptionsScreen.Option.Icon.LocalResource) icon;
                    remoteIcon = new InstrumentIcon.LocalBrand(localResource.lightResId, localResource.darkResId, null, iconShape, 4);
                } else {
                    if (!(icon instanceof InstrumentLinkingOptionsScreen.Option.Icon.RemoteIcon)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return continuation;
                    }
                    remoteIcon = new InstrumentIcon.RemoteIcon(((InstrumentLinkingOptionsScreen.Option.Icon.RemoteIcon) icon).iconUrl, iconShape, 2);
                }
            }
            InstrumentCellViewModel instrumentCellViewModel = new InstrumentCellViewModel(str, str2, true, CollectionsKt__CollectionsJVMKt.listOf(remoteIcon), accessory2, null, null, null, null, 480);
            if (z) {
                replaceInstrumentClick = new InstrumentLinkingOptionsViewEvent.LinkClick(((InstrumentLinkingOption.Link) instrumentLinkingOption).cashInstrumentType);
            } else if (instrumentLinkingOption instanceof InstrumentLinkingOption.Replace) {
                replaceInstrumentClick = new InstrumentLinkingOptionsViewEvent.ReplaceClick(((InstrumentLinkingOption.Replace) instrumentLinkingOption).cashInstrumentType);
            } else {
                if (!(instrumentLinkingOption instanceof InstrumentLinkingOption.ReplaceInstrument)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return continuation;
                }
                InstrumentLinkingOption.ReplaceInstrument replaceInstrument = (InstrumentLinkingOption.ReplaceInstrument) instrumentLinkingOption;
                replaceInstrumentClick = new InstrumentLinkingOptionsViewEvent.ReplaceInstrumentClick(replaceInstrument.cashInstrumentType, replaceInstrument.instrumentToken);
            }
            arrayList.add(new InstrumentLinkingOptionsViewModel.Option(instrumentCellViewModel, replaceInstrumentClick));
            workHomePresenter = this;
            continuation2 = continuation;
        }
        InstrumentLinkingOptionsViewModel instrumentLinkingOptionsViewModel = new InstrumentLinkingOptionsViewModel(str3, str4, arrayList);
        gapComposer.end(false);
        return instrumentLinkingOptionsViewModel;
    }

    private final Object models$com$squareup$cash$transfers$presenters$RecurringReloadsDismissDialogPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(548691212);
        Updater.LaunchedEffect(gapComposer, flow, new TaxWebAppBridge.AnonymousClass4(flow, (Continuation) null, this, 24));
        AndroidStringManager androidStringManager = (AndroidStringManager) this.shiftsAnalytics;
        RecurringReloadsDismissDialogViewModel recurringReloadsDismissDialogViewModel = new RecurringReloadsDismissDialogViewModel(androidStringManager.get(R.string.recurring_reloads_dismiss_dialog_title), androidStringManager.get(R.string.recurring_reloads_dismiss_dialog_body), androidStringManager.get(R.string.recurring_reloads_dismiss_dialog_yes_exit), androidStringManager.get(R.string.recurring_reloads_dismiss_dialog_cancel));
        gapComposer.end(false);
        return recurringReloadsDismissDialogViewModel;
    }

    private final Object models$com$squareup$cash$work$presenters$MerchantPickerPresenter(Flow flow, Composer composer, int i) {
        MerchantRowViewModel merchantRowViewModel;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1939854754);
        MutableState collectAsState = Updater.collectAsState(((RealSelectedMerchantProvider) this.titleBarPresenter).getMerchantIdentifierFlow(), null, null, gapComposer, 48, 2);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = ((RealMerchantRepository) this.payPresenter).getAll();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue, EmptyList.INSTANCE, null, gapComposer, 48, 2);
        RealSellerCardViewModelProducer realSellerCardViewModelProducer = (RealSellerCardViewModelProducer) this.youPresenter;
        gapComposer.startReplaceGroup(-1533422109);
        Object rememberedValue2 = gapComposer.rememberedValue();
        int i2 = 0;
        Continuation continuation = null;
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realSellerCardViewModelProducer.merchantRepository.getAll(), (StateFlow) realSellerCardViewModelProducer.brandDetailsDataLoader.state$delegate.getValue(), new CardModelView$getActiveHeat$2$2(realSellerCardViewModelProducer, continuation, 24), i2));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        Map map = (Map) Updater.collectAsState((Flow) rememberedValue2, emptyMap, null, gapComposer, 48, 2).getValue();
        gapComposer.end(false);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        if (((MerchantIdentifier) mutableState.getValue()) == null && ((MerchantIdentifier) collectAsState.getValue()) != null) {
            mutableState.setValue((MerchantIdentifier) collectAsState.getValue());
        }
        Updater.LaunchedEffect(gapComposer, flow, new TakeUntil$collectSafely$2(flow, continuation, this, mutableState, 16));
        List<Merchant> list = (List) collectAsState2.getValue();
        ArrayList arrayList = new ArrayList();
        for (Merchant merchant : list) {
            MerchantIdentifier identifier = LocalPresenterFactoryKt.getIdentifier(merchant);
            if (identifier != null) {
                String name = MerchantKt.getName(merchant);
                if (name == null) {
                    name = "";
                }
                SellerCardViewModel sellerCardViewModel = (SellerCardViewModel) map.get(identifier);
                if (sellerCardViewModel == null) {
                    sellerCardViewModel = SellerCardViewModel.FALLBACK;
                }
                merchantRowViewModel = new MerchantRowViewModel(identifier, name, null, sellerCardViewModel);
            } else {
                merchantRowViewModel = null;
            }
            if (merchantRowViewModel != null) {
                arrayList.add(merchantRowViewModel);
            }
        }
        MerchantPickerViewModel merchantPickerViewModel = new MerchantPickerViewModel(arrayList, (MerchantIdentifier) mutableState.getValue());
        gapComposer.end(false);
        return merchantPickerViewModel;
    }

    private final Object models$com$squareup$cash$work$presenters$pay$TaxFormDownloaderPresenter(Flow flow, Composer composer, int i) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.payPresenter;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(50652628);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new ExoPlayerVideoView.AnonymousClass2(this, continuation, 17);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Updater.LaunchedEffect(gapComposer, flow, new WorkerWorkflow$render$1(flow, continuation, this, 1));
        TaxFormDownloaderViewModel taxFormDownloaderViewModel = new TaxFormDownloaderViewModel(androidStringManager.get(R.string.work_tax_forms_downloading), androidStringManager.get(R.string.work_tax_forms_downloading_cancel));
        gapComposer.end(false);
        return taxFormDownloaderViewModel;
    }

    private final Object models$com$squareup$cash$work$presenters$pay$TaxFormsListPresenter(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(72493004);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
        MutableState collectAsState = Updater.collectAsState(((RealSelectedMerchantProvider) this.youPresenter).getMerchantIdentifierFlow(), null, null, gapComposer, 48, 2);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue2 == obj) {
            rememberedValue2 = new CameraHelper$unbind$2(this, continuation, 10);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj) {
            rememberedValue3 = Updater.mutableStateOf$default(TaxFormsListViewModel.Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new TakeUntil$collectSafely$2(flow, continuation, this, parcelableSnapshotMutableIntState, 19));
        MerchantIdentifier merchantIdentifier = (MerchantIdentifier) collectAsState.getValue();
        Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
        boolean changed = gapComposer.changed(collectAsState) | gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed || rememberedValue4 == obj) {
            mutableState = mutableState2;
            Object workerWorkflow$render$1 = new WorkerWorkflow$render$1(this, collectAsState, mutableState, continuation, 2);
            gapComposer.updateRememberedValue(workerWorkflow$render$1);
            rememberedValue4 = workerWorkflow$render$1;
        } else {
            mutableState = mutableState2;
        }
        Updater.LaunchedEffect(merchantIdentifier, valueOf, (Function2) rememberedValue4, gapComposer);
        TaxFormsListViewModel taxFormsListViewModel = (TaxFormsListViewModel) mutableState.getValue();
        gapComposer.end(false);
        return taxFormsListViewModel;
    }

    private final Object models$com$squareup$cash$work$presenters$shift$ShiftNotStartedDialogPresenter(Flow flow, Composer composer, int i) {
        String format2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1783056654);
        Updater.LaunchedEffect(gapComposer, flow, new WorkerWorkflow$render$1(flow, (Continuation) null, this, 4));
        ShiftNotStartedDialogScreen shiftNotStartedDialogScreen = (ShiftNotStartedDialogScreen) this.shiftsAnalytics;
        OffsetDateTime offsetDateTime = shiftNotStartedDialogScreen.startDateTime;
        LocalDate localDate = offsetDateTime.toLocalDate();
        AndroidClock androidClock = (AndroidClock) this.payPresenter;
        OffsetDateTime ofInstant = OffsetDateTime.ofInstant(DimensionKt.now(androidClock), androidClock.timeZone().toZoneId());
        ofInstant.getClass();
        boolean areEqual = Intrinsics.areEqual(localDate, ofInstant.toLocalDate());
        RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) this.shiftSection2Presenter;
        String formatTime = realShiftTimeFormatter.formatTime(offsetDateTime, shiftNotStartedDialogScreen.timeZoneId);
        Resources resources = ((AndroidStringManager) this.youPresenter).resources;
        if (areEqual) {
            ArrayMap arrayMap = new ArrayMap(1);
            arrayMap.put("time_until", formatTime);
            resources.getClass();
            format2 = new MessageFormat(resources.getString(R.string.work_shift_not_started_body)).format(arrayMap);
            format2.getClass();
        } else {
            String formatDayDate = realShiftTimeFormatter.formatDayDate(offsetDateTime);
            ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(2, formatDayDate, "clock_in_day", formatDayDate);
            m.put("clock_in_time", formatTime);
            resources.getClass();
            format2 = new MessageFormat(resources.getString(R.string.work_shift_not_started_body_with_day)).format(m);
            format2.getClass();
        }
        ShiftNotStartedDialogViewModel shiftNotStartedDialogViewModel = new ShiftNotStartedDialogViewModel(format2);
        gapComposer.end(false);
        return shiftNotStartedDialogViewModel;
    }

    public static WorkWebViewModel validateAndLoadUrl(String str) {
        return (str == null || StringsKt.isBlank(str) || !(StringsKt__StringsJVMKt.startsWith(str, "http://", false) || StringsKt__StringsJVMKt.startsWith(str, "https://", false))) ? WorkWebViewModel.ErrorUrl.INSTANCE : new WorkWebViewModel.LoadUrl(str);
    }

    public ArrayList buildDisputes(DisputesTrackerService$DisputeTrackerResult.Success success) {
        String str;
        String str2;
        ListClaimDSL3Data listClaimDSL3Data;
        String str3;
        String str4;
        Money money;
        String format2;
        Long l;
        DisputeRow.TransactionType transactionType;
        List<ClaimResolutionStatus> list = success.disputesList;
        ArrayList arrayList = new ArrayList();
        for (ClaimResolutionStatus claimResolutionStatus : list) {
            RealDisputesTrackerMapper realDisputesTrackerMapper = (RealDisputesTrackerMapper) this.titleBarPresenter;
            DisputeRow disputeRow = null;
            if (claimResolutionStatus != null && (str = claimResolutionStatus.claim_token) != null && (str2 = claimResolutionStatus.transaction_token) != null && (listClaimDSL3Data = claimResolutionStatus.dsl3_data) != null && (str3 = listClaimDSL3Data.counterparty_name) != null && (str4 = claimResolutionStatus.status) != null && (money = claimResolutionStatus.amount) != null && (format2 = realDisputesTrackerMapper.moneyFormatter.format(money)) != null && (l = claimResolutionStatus.claim_submitted_at) != null) {
                long longValue = l.longValue();
                RealTodayDateTimeFormatter realTodayDateTimeFormatter = realDisputesTrackerMapper.dateTimeFormatter;
                Instant ofEpochMilli = Instant.ofEpochMilli(longValue);
                ofEpochMilli.getClass();
                String formatDate = realTodayDateTimeFormatter.formatDate(ofEpochMilli, new TodayDateTimeFormatter$FormatOptions(127, null, null, null, false, false));
                TransactionType transactionType2 = claimResolutionStatus.transaction_type;
                switch (transactionType2 == null ? -1 : RealDisputesTrackerMapper.WhenMappings.$EnumSwitchMapping$0[transactionType2.ordinal()]) {
                    case -1:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        transactionType = DisputeRow.TransactionType.UNKNOWN;
                        break;
                    case 0:
                    default:
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    case 1:
                        transactionType = DisputeRow.TransactionType.CASH_CARD;
                        break;
                    case 2:
                        transactionType = DisputeRow.TransactionType.PAY_WITH_CASH;
                        break;
                    case 3:
                    case 4:
                        transactionType = DisputeRow.TransactionType.P2P_PAYMENT;
                        break;
                    case 5:
                        transactionType = DisputeRow.TransactionType.ACH_TRANSFER;
                        break;
                }
                disputeRow = new DisputeRow(str, str2, str3, str4, format2, formatDate, transactionType, claimResolutionStatus.icon_url);
            }
            if (disputeRow != null) {
                arrayList.add(disputeRow);
            }
        }
        return arrayList;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.shiftSection2Presenter;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        return (SampleStrategy) this.payPresenter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:221:0x060e, code lost:
    
        if (r0 == null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0623, code lost:
    
        if (r1 == null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0bca, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.squareup.protos.wire.roster.mds.Unit) kotlin.collections.CollectionsKt.single((java.util.List) r10)).token, r2) != false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0259, code lost:
    
        if (r1.isEnabled() == true) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0bd4  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0c51  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0ce1  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0d58 A[LOOP:6: B:451:0x0d52->B:453:0x0d58, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0c61  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0bdd  */
    /* JADX WARN: Type inference failed for: r0v114, types: [com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel$Loading] */
    /* JADX WARN: Type inference failed for: r0v115, types: [com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel$Error] */
    /* JADX WARN: Type inference failed for: r0v118, types: [com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel$Error] */
    /* JADX WARN: Type inference failed for: r0v144, types: [com.squareup.cash.phoneplans.PhonePlansEsimCheckViewModel] */
    /* JADX WARN: Type inference failed for: r0v146, types: [com.squareup.cash.phoneplans.PhonePlansEsimCheckViewModel] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r14v16, types: [com.squareup.cash.phoneplans.PhonePlansEsimCheckViewModel] */
    /* JADX WARN: Type inference failed for: r1v106, types: [com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel$Empty] */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.squareup.cash.work.presenters.RealSellerCardViewModelProducer] */
    /* JADX WARN: Type inference failed for: r2v97, types: [com.squareup.cash.passkeys.viewmodels.PasskeyManagementViewModel$Loaded] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.lang.String, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.squareup.cash.work.presenters.RealSellerCardViewModelProducer] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        ShiftSection2ViewModel shiftSection2ViewModel;
        ShiftSection2ViewModel shiftSection2ViewModel2;
        Object rememberedValue;
        PayDataState payDataState;
        Money money;
        PayCellViewModel loaded;
        ?? r12;
        Object rememberedValue2;
        Object rememberedValue3;
        Object rememberedValue4;
        String str;
        Iterator it;
        List list;
        ArrayList buildCardList;
        ClockInEssentials.ClockedOutEssentials clockedOutEssentials;
        ShiftSchedule shiftSchedule;
        ShiftSchedule.Version version;
        LocationScopedClockInControls locationScopedClockInControls;
        ArrayList arrayList;
        List list2;
        MutableState mutableState;
        MutableState mutableState2;
        Object obj;
        ?? r4;
        MoneybotStaticPickerViewModel.Icon icon;
        MoneybotStaticPickerViewModel.Icon savingsGoalIcon;
        Continuation continuation;
        MutableState mutableState3;
        PhonePlansEsimCheckViewModel.Cta cta;
        PhonePlansEsimCheckViewModel.Cta cta2;
        Continuation continuation2;
        MutableState mutableState4;
        WorkHomePresenter workHomePresenter = this;
        int i2 = workHomePresenter.$r8$classId;
        int i3 = 2;
        int i4 = 23;
        int i5 = 12;
        int i6 = 29;
        Object obj2 = workHomePresenter.payPresenter;
        int i7 = 4;
        Object obj3 = workHomePresenter.shiftSection2Presenter;
        boolean z = true;
        Object obj4 = workHomePresenter.titleBarPresenter;
        Object obj5 = workHomePresenter.youPresenter;
        Object obj6 = workHomePresenter.shiftsAnalytics;
        Continuation continuation3 = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        switch (i2) {
            case 0:
                flow.getClass();
                ?? r42 = (GapComposer) composer;
                r42.startReplaceGroup(-1200543100);
                Unit unit = Unit.INSTANCE;
                boolean z2 = (((i & 112) ^ 48) > 32 && r42.changed(workHomePresenter)) || (i & 48) == 32;
                Object rememberedValue5 = r42.rememberedValue();
                boolean z3 = z2;
                Continuation continuation4 = null;
                Object obj7 = rememberedValue5;
                if (z3 || rememberedValue5 == neverEqualPolicy) {
                    CameraHelper$unbind$2 cameraHelper$unbind$2 = new CameraHelper$unbind$2(workHomePresenter, continuation4, 7);
                    r42.updateRememberedValue(cameraHelper$unbind$2);
                    obj7 = cameraHelper$unbind$2;
                }
                Updater.LaunchedEffect((Composer) r42, unit, (Function2) obj7);
                UnleashContext unleashContext = (UnleashContext) obj4;
                unleashContext.getClass();
                r42.startReplaceGroup(-2021761165);
                Object rememberedValue6 = r42.rememberedValue();
                Object obj8 = rememberedValue6;
                if (rememberedValue6 == neverEqualPolicy) {
                    SquareAccountStore$userFlow$$inlined$map$1 squareAccountStore$userFlow$$inlined$map$1 = new SquareAccountStore$userFlow$$inlined$map$1(flow, 14);
                    r42.updateRememberedValue(squareAccountStore$userFlow$$inlined$map$1);
                    obj8 = squareAccountStore$userFlow$$inlined$map$1;
                }
                Flow flow2 = (Flow) obj8;
                flow2.getClass();
                r42.startReplaceGroup(1064273931);
                ChannelFlowTransformLatest all = ((RealMerchantRepository) unleashContext.sessionId).getAll();
                EmptyList emptyList = EmptyList.INSTANCE;
                MutableState collectAsState = Updater.collectAsState(all, emptyList, null, r42, 48, 2);
                Object rememberedValue7 = r42.rememberedValue();
                Object obj9 = rememberedValue7;
                if (rememberedValue7 == neverEqualPolicy) {
                    Flow selectedMerchantFlow = ((RealSelectedMerchantDataProvider) unleashContext.remoteAddress).getSelectedMerchantFlow();
                    r42.updateRememberedValue(selectedMerchantFlow);
                    obj9 = selectedMerchantFlow;
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) obj9, null, null, r42, 48, 2);
                SellerCardViewModel collectSelectedMerchantViewModel = ((RealSellerCardViewModelProducer) unleashContext.properties).collectSelectedMerchantViewModel(r42);
                if (((List) collectAsState.getValue()).size() <= 1 || ((Merchant) collectAsState2.getValue()) == null) {
                    collectSelectedMerchantViewModel = null;
                }
                Updater.LaunchedEffect((Composer) r42, flow2, new CardAppletWorker$setup$1$2$1(flow2, continuation4, unleashContext, 27));
                WorkHomeTitleBarViewModel workHomeTitleBarViewModel = new WorkHomeTitleBarViewModel(collectSelectedMerchantViewModel);
                r42.end(false);
                r42.end(false);
                HCaptcha hCaptcha = (HCaptcha) obj3;
                hCaptcha.getClass();
                r42.startReplaceGroup(431082493);
                r42.startReplaceGroup(-1092406841);
                MutableState collectAsState3 = Updater.collectAsState((StateFlow) ((RealClockInEssentialsProvider) hCaptcha.exception).essentialsState$delegate.getValue(), null, r42, 1);
                MutableState collectAsState4 = Updater.collectAsState((StateFlow) ((RealDashboardScheduleProvider) hCaptcha.onSuccessListeners).upcomingSchedules$delegate.getValue(), null, r42, 1);
                boolean changed = r42.changed(hCaptcha);
                Object rememberedValue8 = r42.rememberedValue();
                Object obj10 = rememberedValue8;
                if (changed || rememberedValue8 == neverEqualPolicy) {
                    ExoPlayerVideoView.AnonymousClass2 anonymousClass2 = new ExoPlayerVideoView.AnonymousClass2(hCaptcha, continuation4, 18);
                    r42.updateRememberedValue(anonymousClass2);
                    obj10 = anonymousClass2;
                }
                Updater.LaunchedEffect((Composer) r42, unit, (Function2) obj10);
                Updater.LaunchedEffect((Composer) r42, flow, new TakeUntil$collectSafely$2(flow, continuation4, hCaptcha, collectAsState3, 21));
                Object rememberedValue9 = r42.rememberedValue();
                Object obj11 = rememberedValue9;
                if (rememberedValue9 == neverEqualPolicy) {
                    Flow selectedMerchantFlow2 = ((RealSelectedMerchantDataProvider) hCaptcha.onFailureListeners).getSelectedMerchantFlow();
                    r42.updateRememberedValue(selectedMerchantFlow2);
                    obj11 = selectedMerchantFlow2;
                }
                MutableState collectAsState5 = Updater.collectAsState((Flow) obj11, null, null, r42, 48, 2);
                Object rememberedValue10 = r42.rememberedValue();
                if (rememberedValue10 == neverEqualPolicy) {
                    AssignedJobProviderKt$jobs$$inlined$map$1 assignedJobProviderKt$jobs$$inlined$map$1 = new AssignedJobProviderKt$jobs$$inlined$map$1(((RealAssignedJobProvider) hCaptcha.onOpenListeners).getAssignedJobs(), 0);
                    r42.updateRememberedValue(assignedJobProviderKt$jobs$$inlined$map$1);
                    rememberedValue10 = assignedJobProviderKt$jobs$$inlined$map$1;
                }
                MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue10, emptyList, null, r42, 48, 2);
                Object rememberedValue11 = r42.rememberedValue();
                Object obj12 = rememberedValue11;
                if (rememberedValue11 == neverEqualPolicy) {
                    ChannelFlowTransformLatest locations = ((RealAssignedLocationProvider) hCaptcha.handler).getLocations();
                    r42.updateRememberedValue(locations);
                    obj12 = locations;
                }
                MutableState collectAsState7 = Updater.collectAsState((Flow) obj12, emptyList, null, r42, 48, 2);
                Merchant merchant = (Merchant) collectAsState5.getValue();
                String name = merchant != null ? MerchantKt.getName(merchant) : null;
                String str2 = name == null ? "" : name;
                SellerCardViewModel collectSelectedMerchantViewModel2 = ((RealSellerCardViewModelProducer) hCaptcha.captchaVerifier).collectSelectedMerchantViewModel(r42);
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) hCaptcha.internalConfig;
                ClockInEssentialsState clockInEssentialsState = (ClockInEssentialsState) collectAsState3.getValue();
                DashboardScheduleState dashboardScheduleState = (DashboardScheduleState) collectAsState4.getValue();
                List list3 = (List) collectAsState6.getValue();
                List list4 = (List) collectAsState7.getValue();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    com.squareup.protos.wire.roster.mds.Unit protoModel = ((Location) it2.next()).getProtoModel();
                    if (protoModel != null) {
                        arrayList2.add(protoModel);
                    }
                }
                clockInEssentialsState.getClass();
                dashboardScheduleState.getClass();
                collectSelectedMerchantViewModel2.getClass();
                list3.getClass();
                if ((clockInEssentialsState instanceof ClockInEssentialsState.Loading) || (dashboardScheduleState instanceof DashboardScheduleState.Loading)) {
                    shiftSection2ViewModel = ShiftSection2ViewModel.Loading.INSTANCE;
                } else {
                    ClockInEssentials clockInEssentials = clockInEssentialsState instanceof ClockInEssentials ? (ClockInEssentials) clockInEssentialsState : null;
                    DashboardScheduleState.Loaded loaded2 = dashboardScheduleState instanceof DashboardScheduleState.Loaded ? (DashboardScheduleState.Loaded) dashboardScheduleState : null;
                    if (loaded2 == null || (list = loaded2.schedules) == null) {
                        list = EmptyList.INSTANCE;
                    }
                    try {
                        buildCardList = markwonConfiguration.buildCardList(clockInEssentials, list, collectSelectedMerchantViewModel2, str2, list3, arrayList2);
                        ClockInEssentials clockInEssentials2 = clockInEssentials;
                        clockedOutEssentials = clockInEssentials2 instanceof ClockInEssentials.ClockedOutEssentials ? (ClockInEssentials.ClockedOutEssentials) clockInEssentials2 : null;
                    } catch (RuntimeException unused) {
                        shiftSection2ViewModel = ShiftSection2ViewModel.Error.INSTANCE;
                    }
                    if (clockedOutEssentials != null) {
                        ClockInStateResolver clockInStateResolver = (ClockInStateResolver) markwonConfiguration.linkResolver;
                        ClockInControls clockInControls = clockedOutEssentials.clockInControls;
                        if (clockInControls.canClockInFromTeamApp) {
                            boolean z4 = clockInControls.hasOverridePermission || !clockInControls.canEnforceEarlyOrUnscheduledClockIn;
                            ArrayList arrayList3 = clockedOutEssentials.locations;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj13 : arrayList3) {
                                String str3 = ((com.squareup.protos.wire.roster.mds.Unit) obj13).token;
                                if (str3 != null && (z4 || ((locationScopedClockInControls = (LocationScopedClockInControls) clockInControls.locationScopedControls.get(str3)) != null && (!locationScopedClockInControls.isEarlyAndUnscheduledClockInBlocked)))) {
                                    arrayList4.add(obj13);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                ScheduledShiftStatus scheduledShiftStatus = clockInStateResolver.getClockInEnabledResult(clockedOutEssentials).scheduledShiftStatus;
                                if (scheduledShiftStatus != null && scheduledShiftStatus.getCanClockIn()) {
                                    ClockInEssentials.NextShift nextShift = clockedOutEssentials.nextShift;
                                    String str4 = (nextShift == null || (shiftSchedule = nextShift.shift) == null || (version = shiftSchedule.published_version) == null) ? null : version.location_id;
                                    if (arrayList4.size() == 1) {
                                        break;
                                    }
                                }
                                if (buildCardList.isEmpty()) {
                                    shiftSection2ViewModel2 = new ShiftSection2ViewModel.Loaded(buildCardList, z);
                                    r42.end(false);
                                    r42.end(false);
                                    TextSetter textSetter = (TextSetter) obj2;
                                    textSetter.getClass();
                                    r42.startReplaceGroup(-1592838567);
                                    rememberedValue = r42.rememberedValue();
                                    Object obj14 = rememberedValue;
                                    if (rememberedValue == neverEqualPolicy) {
                                        SquareAccountStore$userFlow$$inlined$map$1 squareAccountStore$userFlow$$inlined$map$12 = new SquareAccountStore$userFlow$$inlined$map$1(flow, 15);
                                        r42.updateRememberedValue(squareAccountStore$userFlow$$inlined$map$12);
                                        obj14 = squareAccountStore$userFlow$$inlined$map$12;
                                    }
                                    Flow flow3 = (Flow) obj14;
                                    flow3.getClass();
                                    r42.startReplaceGroup(1046109532);
                                    Updater.LaunchedEffect((Composer) r42, flow3, new CardAppletWorker$setup$1$2$1(flow3, (Continuation) null, textSetter, 29));
                                    MutableState collectAsState8 = Updater.collectAsState((Flow) ((RealPayDataLoader) ((PayDataLoader) textSetter.textSwitcher)).sharedState$delegate.getValue(), new PayDataState.Loading(false), null, r42, 0, 2);
                                    Lazy lazy = (Lazy) textSetter.scannerText;
                                    payDataState = (PayDataState) collectAsState8.getValue();
                                    payDataState.getClass();
                                    if (payDataState instanceof PayDataState.Loading) {
                                        if (!(payDataState instanceof PayDataState.Error)) {
                                            if (!(payDataState instanceof PayDataState.Loaded)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            PayData payData = ((PayDataState.Loaded) payDataState).data;
                                            boolean z5 = payData.hasPayrollFeatures;
                                            GetShiftsOverviewResponse getShiftsOverviewResponse = payData.shiftsOverview;
                                            if (z5 && (money = PayDataKt.totalAmount(getShiftsOverviewResponse)) != null) {
                                                DatetimeInterval datetimeInterval = getShiftsOverviewResponse.current_interval;
                                                String formatPayPeriod = ((RealShiftTimeFormatter) lazy.initializer).formatPayPeriod(datetimeInterval != null ? datetimeInterval.start : null, datetimeInterval != null ? datetimeInterval.end : null);
                                                if (formatPayPeriod != null) {
                                                    loaded = new PayCellViewModel.Loaded(((MoneyFormatter) lazy.value).format(money), formatPayPeriod);
                                                    r12 = 0;
                                                }
                                            }
                                        }
                                        r12 = 0;
                                        loaded = null;
                                    } else {
                                        if (((PayDataState.Loading) payDataState).hasPayrollFeatures) {
                                            loaded = PayCellViewModel.Loading.INSTANCE;
                                            r12 = 0;
                                        }
                                        r12 = 0;
                                        loaded = null;
                                    }
                                    r42.end(r12);
                                    r42.end(r12);
                                    TextSetter textSetter2 = (TextSetter) obj5;
                                    textSetter2.getClass();
                                    r42.startReplaceGroup(-408133718);
                                    rememberedValue2 = r42.rememberedValue();
                                    if (rememberedValue2 == neverEqualPolicy) {
                                        AssignedJobProviderKt$jobs$$inlined$map$1 assignedJobProviderKt$jobs$$inlined$map$12 = new AssignedJobProviderKt$jobs$$inlined$map$1(((RealAssignedJobProvider) textSetter2.textView).getAssignedJobs(), r12);
                                        r42.updateRememberedValue(assignedJobProviderKt$jobs$$inlined$map$12);
                                        rememberedValue2 = assignedJobProviderKt$jobs$$inlined$map$12;
                                    }
                                    EmptyList emptyList2 = EmptyList.INSTANCE;
                                    MutableState collectAsState9 = Updater.collectAsState((Flow) rememberedValue2, emptyList2, null, r42, 48, 2);
                                    rememberedValue3 = r42.rememberedValue();
                                    if (rememberedValue3 == neverEqualPolicy) {
                                        AssignedJobProviderKt$jobs$$inlined$map$1 assignedJobProviderKt$jobs$$inlined$map$13 = new AssignedJobProviderKt$jobs$$inlined$map$1(((RealAssignedLocationProvider) textSetter2.textSwitcher).getLocations(), 3);
                                        r42.updateRememberedValue(assignedJobProviderKt$jobs$$inlined$map$13);
                                        rememberedValue3 = assignedJobProviderKt$jobs$$inlined$map$13;
                                    }
                                    MutableState collectAsState10 = Updater.collectAsState((Flow) rememberedValue3, emptyList2, null, r42, 48, 2);
                                    rememberedValue4 = r42.rememberedValue();
                                    Object obj15 = rememberedValue4;
                                    if (rememberedValue4 == neverEqualPolicy) {
                                        RealPasscodeProvider realPasscodeProvider = (RealPasscodeProvider) textSetter2.scannerText;
                                        int i8 = 0;
                                        Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realPasscodeProvider.teamMemberIdProvider.getTeamMemberId(), realPasscodeProvider.selectedMerchantProvider.getMerchantIdentifierFlow(), new RealPasscodeProvider$getPasscode$1(realPasscodeProvider, (Continuation) null, i8), i8));
                                        r42.updateRememberedValue(distinctUntilChanged);
                                        obj15 = distinctUntilChanged;
                                    }
                                    str = (String) Updater.collectAsState((Flow) obj15, null, null, r42, 48, 2).getValue();
                                    if (str == null) {
                                        str = "-";
                                    }
                                    List list5 = (List) collectAsState9.getValue();
                                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                    it = list5.iterator();
                                    while (it.hasNext()) {
                                        arrayList5.add((String) ((Job) it.next()).title$delegate.getValue());
                                    }
                                    WorkYouViewModel workYouViewModel = new WorkYouViewModel(str, arrayList5, (List) collectAsState10.getValue());
                                    r42.end(false);
                                    WorkHomeViewModel workHomeViewModel = new WorkHomeViewModel(workHomeTitleBarViewModel, shiftSection2ViewModel2, loaded, workYouViewModel, 48);
                                    r42.end(false);
                                    return workHomeViewModel;
                                }
                                shiftSection2ViewModel = new ShiftSection2ViewModel.Empty(z);
                            }
                        }
                    }
                    z = false;
                    if (buildCardList.isEmpty()) {
                    }
                }
                shiftSection2ViewModel2 = shiftSection2ViewModel;
                r42.end(false);
                r42.end(false);
                TextSetter textSetter3 = (TextSetter) obj2;
                textSetter3.getClass();
                r42.startReplaceGroup(-1592838567);
                rememberedValue = r42.rememberedValue();
                Object obj142 = rememberedValue;
                if (rememberedValue == neverEqualPolicy) {
                }
                Flow flow32 = (Flow) obj142;
                flow32.getClass();
                r42.startReplaceGroup(1046109532);
                Updater.LaunchedEffect((Composer) r42, flow32, new CardAppletWorker$setup$1$2$1(flow32, (Continuation) null, textSetter3, 29));
                MutableState collectAsState82 = Updater.collectAsState((Flow) ((RealPayDataLoader) ((PayDataLoader) textSetter3.textSwitcher)).sharedState$delegate.getValue(), new PayDataState.Loading(false), null, r42, 0, 2);
                Lazy lazy2 = (Lazy) textSetter3.scannerText;
                payDataState = (PayDataState) collectAsState82.getValue();
                payDataState.getClass();
                if (payDataState instanceof PayDataState.Loading) {
                }
                r42.end(r12);
                r42.end(r12);
                TextSetter textSetter22 = (TextSetter) obj5;
                textSetter22.getClass();
                r42.startReplaceGroup(-408133718);
                rememberedValue2 = r42.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                }
                EmptyList emptyList22 = EmptyList.INSTANCE;
                MutableState collectAsState92 = Updater.collectAsState((Flow) rememberedValue2, emptyList22, null, r42, 48, 2);
                rememberedValue3 = r42.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                }
                MutableState collectAsState102 = Updater.collectAsState((Flow) rememberedValue3, emptyList22, null, r42, 48, 2);
                rememberedValue4 = r42.rememberedValue();
                Object obj152 = rememberedValue4;
                if (rememberedValue4 == neverEqualPolicy) {
                }
                str = (String) Updater.collectAsState((Flow) obj152, null, null, r42, 48, 2).getValue();
                if (str == null) {
                }
                List list52 = (List) collectAsState92.getValue();
                ArrayList arrayList52 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list52, 10));
                it = list52.iterator();
                while (it.hasNext()) {
                }
                WorkYouViewModel workYouViewModel2 = new WorkYouViewModel(str, arrayList52, (List) collectAsState102.getValue());
                r42.end(false);
                WorkHomeViewModel workHomeViewModel2 = new WorkHomeViewModel(workHomeTitleBarViewModel, shiftSection2ViewModel2, loaded, workYouViewModel2, 48);
                r42.end(false);
                return workHomeViewModel2;
            case 1:
                InvestingScreens.KeyStatsDetailsScreen keyStatsDetailsScreen = (InvestingScreens.KeyStatsDetailsScreen) obj5;
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(117999993);
                Object rememberedValue12 = gapComposer.rememberedValue();
                if (rememberedValue12 == neverEqualPolicy) {
                    InviteContactsPresenter$filterContacts$$inlined$map$1 inviteContactsPresenter$filterContacts$$inlined$map$1 = new InviteContactsPresenter$filterContacts$$inlined$map$1(((RealInvestingMetrics) obj6).getMetrics(keyStatsDetailsScreen.investmentEntityToken), 11);
                    gapComposer.updateRememberedValue(inviteContactsPresenter$filterContacts$$inlined$map$1);
                    rememberedValue12 = inviteContactsPresenter$filterContacts$$inlined$map$1;
                }
                MutableState collectAsState11 = Updater.collectAsState((Flow) rememberedValue12, null, null, gapComposer, 48, 2);
                Object rememberedValue13 = gapComposer.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy) {
                    rememberedValue13 = FlowKt.take(new InviteContactsPresenter$filterContacts$$inlined$map$1(((RealInvestmentEntities) obj4).stockDetails(keyStatsDetailsScreen.investmentEntityToken), i5), 1);
                    gapComposer.updateRememberedValue(rememberedValue13);
                }
                MutableState collectAsState12 = Updater.collectAsState((Flow) rememberedValue13, null, null, gapComposer, 48, 2);
                if (((InvestmentEntityStats) collectAsState11.getValue()) == null) {
                    gapComposer.end(false);
                    return InvestingKeyStatsDetailsViewModel.Loading.INSTANCE;
                }
                InvestmentEntityStats investmentEntityStats = (InvestmentEntityStats) collectAsState11.getValue();
                investmentEntityStats.getClass();
                List<Section.Row> list6 = investmentEntityStats.rows;
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                for (Section.Row row : list6) {
                    String str5 = row.label;
                    str5.getClass();
                    Section.Row.Value value = row.value;
                    value.getClass();
                    String str6 = value.text;
                    str6.getClass();
                    Section.Row.MoreInfo moreInfo = row.more_info;
                    arrayList6.add(new InvestingKeyStatsDetailsViewModel.Content.Row(row.spoken_label, str5, str6, moreInfo != null ? moreInfo.text : null));
                }
                InvestmentEntityStats.InvestmentEntityStatsDetails investmentEntityStatsDetails = investmentEntityStats.details;
                if (investmentEntityStatsDetails == null || (list2 = investmentEntityStatsDetails.rows) == null) {
                    arrayList = null;
                } else {
                    List<Section.KeyStatsDetailsRow> list7 = list2;
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                    for (Section.KeyStatsDetailsRow keyStatsDetailsRow : list7) {
                        String str7 = keyStatsDetailsRow.spoken_label;
                        String str8 = keyStatsDetailsRow.label;
                        str8.getClass();
                        String str9 = keyStatsDetailsRow.value;
                        str9.getClass();
                        arrayList.add(new InvestingKeyStatsDetailsViewModel.Content.Row(str7, str8, str9, keyStatsDetailsRow.description));
                    }
                }
                if (arrayList != null) {
                    arrayList6 = arrayList;
                }
                Updater.LaunchedEffect(gapComposer, flow, new InvestingHomeView$onScrollFlow$1(flow, continuation3, workHomePresenter, i4));
                AndroidStringManager androidStringManager = (AndroidStringManager) obj3;
                String str10 = (String) collectAsState12.getValue();
                String str11 = str10 != null ? str10 : "";
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.investing_key_stats_title)).format(new Object[]{str11});
                format2.getClass();
                InvestingKeyStatsDetailsViewModel.Content content = new InvestingKeyStatsDetailsViewModel.Content(format2, arrayList6);
                gapComposer.end(false);
                return content;
            case 2:
                SquareLoyaltySheetScreen squareLoyaltySheetScreen = (SquareLoyaltySheetScreen) obj2;
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1576928569);
                Object rememberedValue14 = gapComposer2.rememberedValue();
                if (rememberedValue14 == neverEqualPolicy) {
                    rememberedValue14 = Updater.mutableStateOf$default(new SquareLoyaltySheetPresenter$State(GenericTreeElementsViewModel.Loading.INSTANCE, null));
                    gapComposer2.updateRememberedValue(rememberedValue14);
                }
                MutableState mutableState5 = (MutableState) rememberedValue14;
                Object rememberedValue15 = gapComposer2.rememberedValue();
                if (rememberedValue15 == neverEqualPolicy) {
                    rememberedValue15 = Updater.mutableStateOf$default(null);
                    gapComposer2.updateRememberedValue(rememberedValue15);
                }
                MutableState mutableState6 = (MutableState) rememberedValue15;
                String str12 = squareLoyaltySheetScreen.gteContext;
                boolean changedInstance = gapComposer2.changedInstance(workHomePresenter);
                Object rememberedValue16 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue16 == neverEqualPolicy) {
                    mutableState = mutableState5;
                    Continuation continuation5 = null;
                    mutableState2 = mutableState6;
                    obj = obj5;
                    CashMapPresenter$models$3$1 cashMapPresenter$models$3$1 = new CashMapPresenter$models$3$1(this, mutableState2, mutableState, continuation5, 15);
                    gapComposer2.updateRememberedValue(cashMapPresenter$models$3$1);
                    rememberedValue16 = cashMapPresenter$models$3$1;
                    r4 = continuation5;
                } else {
                    mutableState = mutableState5;
                    obj = obj5;
                    r4 = 0;
                    mutableState2 = mutableState6;
                }
                Updater.LaunchedEffect(gapComposer2, str12, (Function2) rememberedValue16);
                Object rememberedValue17 = gapComposer2.rememberedValue();
                if (rememberedValue17 == neverEqualPolicy) {
                    NullStateSwipeConfigProvider nullStateSwipeConfigProvider = new NullStateSwipeConfigProvider(new MoneyTabPresenter$models$lambda$31$$inlined$map$1(flow, i7), 3);
                    gapComposer2.updateRememberedValue(nullStateSwipeConfigProvider);
                    rememberedValue17 = nullStateSwipeConfigProvider;
                }
                Flow flow4 = (Flow) rememberedValue17;
                GenericTreeElementsData genericTreeElementsData = (GenericTreeElementsData) mutableState2.getValue();
                if (genericTreeElementsData == null) {
                    gapComposer2.startReplaceGroup(74245353);
                    gapComposer2.end(false);
                } else {
                    AnalyticsEvent analyticsEvent = genericTreeElementsData.dismissEvent;
                    gapComposer2.startReplaceGroup(74245354);
                    SquareLoyaltySheetPresenter$State squareLoyaltySheetPresenter$State = (SquareLoyaltySheetPresenter$State) mutableState.getValue();
                    SubtreeManager subtreeManager = (SubtreeManager) obj;
                    String str13 = squareLoyaltySheetScreen.merchantToken;
                    List list8 = genericTreeElementsData.genericElementTree;
                    AnalyticsEvent analyticsEvent2 = genericTreeElementsData.viewEvent;
                    GenericTreeElementsViewModel.Loaded model = subtreeManager.model(new GenericTreeElementsItem(str13, list8, new GenericTreeElementsAnalyticsData(5, squareLoyaltySheetScreen.referrerFlowToken, r4, r4), analyticsEvent2 != null ? zzi.toAnalyticsData(analyticsEvent2) : r4, analyticsEvent != null ? zzi.toAnalyticsData(analyticsEvent) : r4, null, LoyaltyPromotionSheetPlaceholder.ADAPTER, 32), flow4, gapComposer2, 8);
                    squareLoyaltySheetPresenter$State.getClass();
                    mutableState.setValue(new SquareLoyaltySheetPresenter$State(model, analyticsEvent));
                    gapComposer2.end(false);
                }
                Continuation continuation6 = r4;
                MutableState mutableState7 = mutableState;
                Updater.LaunchedEffect(gapComposer2, flow, new MusicPresenter$models$1$1(flow, continuation6, (MoleculePresenter) this, mutableState7, 3));
                SquareLoyaltySheetViewModel squareLoyaltySheetViewModel = new SquareLoyaltySheetViewModel(((SquareLoyaltySheetPresenter$State) mutableState7.getValue()).model);
                gapComposer2.end(false);
                return squareLoyaltySheetViewModel;
            case 3:
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj6;
                MoneybotStaticPickerQuestion moneybotStaticPickerQuestion = (MoneybotStaticPickerQuestion) obj5;
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-262202533);
                Object rememberedValue18 = gapComposer3.rememberedValue();
                if (rememberedValue18 == neverEqualPolicy) {
                    rememberedValue18 = Updater.mutableStateOf$default(moneybotStaticPickerQuestion.selectedValue);
                    gapComposer3.updateRememberedValue(rememberedValue18);
                }
                MutableState mutableState8 = (MutableState) rememberedValue18;
                Updater.LaunchedEffect(gapComposer3, flow, new MusicPresenter$models$1$1(flow, (Continuation) null, (MoleculePresenter) workHomePresenter, mutableState8, 15));
                String str14 = moneybotStaticPickerQuestion.title;
                if (str14 != null) {
                    if (StringsKt.isBlank(str14)) {
                        str14 = null;
                        break;
                    }
                }
                str14 = androidStringManager2.get(R.string.moneybot_static_picker_default_title);
                String str15 = moneybotStaticPickerQuestion.cta;
                if (str15 != null) {
                    if (StringsKt.isBlank(str15)) {
                        str15 = null;
                        break;
                    }
                }
                str15 = androidStringManager2.get(R.string.moneybot_static_picker_done_cta);
                ArrayList<MoneybotStaticPickerOption> arrayList7 = moneybotStaticPickerQuestion.options;
                ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList7, 10));
                for (MoneybotStaticPickerOption moneybotStaticPickerOption : arrayList7) {
                    String str16 = moneybotStaticPickerOption.value;
                    String str17 = moneybotStaticPickerOption.label;
                    String str18 = moneybotStaticPickerOption.subtitle;
                    boolean areEqual = Intrinsics.areEqual(str16, (String) mutableState8.getValue());
                    boolean access$isEnabled = zzabw.access$isEnabled(moneybotStaticPickerOption, moneybotStaticPickerQuestion.linkedAmount, (ErrorReporter) obj4);
                    MoneybotStaticPickerOption.Icon icon2 = moneybotStaticPickerOption.icon;
                    if (icon2 instanceof MoneybotStaticPickerOption.Icon.Avatar) {
                        savingsGoalIcon = new MoneybotStaticPickerViewModel.Icon.Avatar(((MoneybotStaticPickerOption.Icon.Avatar) icon2).avatar);
                    } else if (icon2 instanceof MoneybotStaticPickerOption.Icon.SavingsGoalIcon) {
                        savingsGoalIcon = new MoneybotStaticPickerViewModel.Icon.SavingsGoalIcon(((MoneybotStaticPickerOption.Icon.SavingsGoalIcon) icon2).savingsGoalIcon);
                    } else {
                        if (icon2 != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        icon = null;
                        arrayList8.add(new MoneybotStaticPickerViewModel.Option(str16, str17, areEqual, str18, access$isEnabled, icon));
                    }
                    icon = savingsGoalIcon;
                    arrayList8.add(new MoneybotStaticPickerViewModel.Option(str16, str17, areEqual, str18, access$isEnabled, icon));
                }
                MoneybotStaticPickerViewModel moneybotStaticPickerViewModel = new MoneybotStaticPickerViewModel(str14, str15, arrayList8);
                gapComposer3.end(false);
                return moneybotStaticPickerViewModel;
            case 4:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(204130164);
                RawMessagesViewModel.Loading loading = new RawMessagesViewModel.Loading(((RawMessagesScreen) obj3).sessionId);
                boolean changedInstance2 = gapComposer4.changedInstance(workHomePresenter);
                Object rememberedValue19 = gapComposer4.rememberedValue();
                if (changedInstance2 || rememberedValue19 == neverEqualPolicy) {
                    rememberedValue19 = new MusicPresenter$models$2$1(workHomePresenter, continuation3, 19);
                    gapComposer4.updateRememberedValue(rememberedValue19);
                }
                MutableState produceState = Updater.produceState(gapComposer4, loading, (Function2) rememberedValue19);
                Updater.LaunchedEffect(gapComposer4, flow, new RealMRIFactory$sign$2(flow, continuation3, workHomePresenter, i3));
                RawMessagesViewModel rawMessagesViewModel = (RawMessagesViewModel) produceState.getValue();
                gapComposer4.end(false);
                return rawMessagesViewModel;
            case 5:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(301936880);
                ObservabilityView[] observabilityViewArr = ObservabilityView.$VALUES;
                DragAndDrop_androidKt.AddViewAttributes((RealObservabilityManager) obj2, MapsKt__MapsJVMKt.mapOf(new Pair("type", "welcome_screen")), gapComposer5, 0);
                Updater.LaunchedEffect(gapComposer5, flow, new RealMRIFactory$sign$2(flow, continuation3, workHomePresenter, 24));
                AndroidStringManager androidStringManager3 = (AndroidStringManager) obj5;
                OnboardingLandingScreen onboardingLandingScreen = (OnboardingLandingScreen) obj6;
                OnboardingLandingViewModel onboardingLandingViewModel = new OnboardingLandingViewModel(androidStringManager3.get(R.string.onboarding_landing_tagline), androidStringManager3.get(R.string.onboarding_landing_cta), onboardingLandingScreen.placeholderImageUrl, onboardingLandingScreen.videoUrl);
                gapComposer5.end(false);
                return onboardingLandingViewModel;
            case 6:
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(-1918525617);
                Object rememberedValue20 = gapComposer6.rememberedValue();
                if (rememberedValue20 == neverEqualPolicy) {
                    rememberedValue20 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer6);
                }
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue20;
                Object rememberedValue21 = gapComposer6.rememberedValue();
                Continuation continuation7 = null;
                if (rememberedValue21 == neverEqualPolicy) {
                    rememberedValue21 = Updater.mutableStateOf$default(null);
                    gapComposer6.updateRememberedValue(rememberedValue21);
                }
                MutableState mutableState9 = (MutableState) rememberedValue21;
                Object rememberedValue22 = gapComposer6.rememberedValue();
                if (rememberedValue22 == neverEqualPolicy) {
                    rememberedValue22 = Updater.mutableStateOf$default(null);
                    gapComposer6.updateRememberedValue(rememberedValue22);
                }
                MutableState mutableState10 = (MutableState) rememberedValue22;
                Object rememberedValue23 = gapComposer6.rememberedValue();
                if (rememberedValue23 == neverEqualPolicy) {
                    rememberedValue23 = Updater.mutableStateOf$default(null);
                    gapComposer6.updateRememberedValue(rememberedValue23);
                }
                MutableState mutableState11 = (MutableState) rememberedValue23;
                PasskeyManagementViewModel.Loading loading2 = new PasskeyManagementViewModel.Loading(null);
                Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
                boolean changedInstance3 = gapComposer6.changedInstance(workHomePresenter);
                Object rememberedValue24 = gapComposer6.rememberedValue();
                if (changedInstance3 || rememberedValue24 == neverEqualPolicy) {
                    AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$1 = new AnimationsKt$takeUntil$1$1(this, mutableState9, mutableState11, mutableState10, (Continuation) null, 29);
                    workHomePresenter = this;
                    gapComposer6.updateRememberedValue(animationsKt$takeUntil$1$1);
                    rememberedValue24 = animationsKt$takeUntil$1$1;
                }
                MutableState produceState2 = Updater.produceState(loading2, valueOf, (Function2) rememberedValue24, gapComposer6, 0);
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance4 = gapComposer6.changedInstance(workHomePresenter);
                Object rememberedValue25 = gapComposer6.rememberedValue();
                if (changedInstance4 || rememberedValue25 == neverEqualPolicy) {
                    rememberedValue25 = new InviteErrorPresenter$models$1$1(workHomePresenter, continuation7, 14);
                    gapComposer6.updateRememberedValue(rememberedValue25);
                }
                Updater.LaunchedEffect(gapComposer6, unit2, (Function2) rememberedValue25);
                Updater.LaunchedEffect(gapComposer6, flow, new DbSessionManager$updateDb$2(flow, null, workHomePresenter, mutableState9, produceState2, mutableState10, parcelableSnapshotMutableIntState, 16));
                PasskeyManagementViewModel.OperationState operationState = (PasskeyManagementViewModel.OperationState) mutableState9.getValue();
                boolean changedInstance5 = gapComposer6.changedInstance(workHomePresenter);
                Object rememberedValue26 = gapComposer6.rememberedValue();
                if (changedInstance5 || rememberedValue26 == neverEqualPolicy) {
                    AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$12 = new AnimationsKt$takeUntil$1$1(workHomePresenter, mutableState9, parcelableSnapshotMutableIntState, continuation7, 28);
                    gapComposer6.updateRememberedValue(animationsKt$takeUntil$1$12);
                    rememberedValue26 = animationsKt$takeUntil$1$12;
                }
                Updater.LaunchedEffect(gapComposer6, operationState, (Function2) rememberedValue26);
                PasskeyManagementViewModel passkeyManagementViewModel = (PasskeyManagementViewModel) produceState2.getValue();
                if (passkeyManagementViewModel instanceof PasskeyManagementViewModel.Loaded) {
                    continuation3 = new PasskeyManagementViewModel.Loaded(((PasskeyManagementViewModel.Loaded) passkeyManagementViewModel).passkeys, (PasskeyManagementViewModel.OperationState) mutableState9.getValue());
                } else if (passkeyManagementViewModel instanceof PasskeyManagementViewModel.Empty) {
                    continuation3 = new PasskeyManagementViewModel.Empty((PasskeyManagementViewModel.OperationState) mutableState9.getValue());
                } else {
                    if (passkeyManagementViewModel instanceof PasskeyManagementViewModel.Error) {
                        continuation = PasskeyManagementViewModel.Error.copy$default((PasskeyManagementViewModel.Error) passkeyManagementViewModel, (PasskeyManagementViewModel.OperationState) mutableState9.getValue(), 7);
                    } else {
                        if (!(passkeyManagementViewModel instanceof PasskeyManagementViewModel.Loading)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return continuation3;
                        }
                        PasskeyManagementViewModel.Error error = (PasskeyManagementViewModel.Error) mutableState10.getValue();
                        continuation = error != null ? PasskeyManagementViewModel.Error.copy$default(error, (PasskeyManagementViewModel.OperationState) mutableState9.getValue(), 3) : new PasskeyManagementViewModel.Loading((PasskeyManagementViewModel.OperationState) mutableState9.getValue());
                    }
                    continuation3 = continuation;
                }
                gapComposer6.end(false);
                return continuation3;
            case 7:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(110013792);
                Object rememberedValue27 = gapComposer7.rememberedValue();
                Continuation continuation8 = null;
                if (rememberedValue27 == neverEqualPolicy) {
                    rememberedValue27 = ((SyncValueReader) obj6).getSingleValueOrDefault(AndroidSyncValueSpecs.PaychecksUiConfiguration, null, new UtilsKt$$ExternalSyntheticLambda0(workHomePresenter, i7));
                    gapComposer7.updateRememberedValue(rememberedValue27);
                }
                MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue27, gapComposer7);
                Updater.LaunchedEffect(gapComposer7, flow, new PhonePlansHomePresenter$models$1$1(flow, continuation8, workHomePresenter, receiveValueAsState, 1));
                PaychecksUiConfiguration.PaychecksHelpSheetUi paychecksHelpSheetUi = (PaychecksUiConfiguration.PaychecksHelpSheetUi) receiveValueAsState.getValue();
                paychecksHelpSheetUi.getClass();
                ArrayList zip = CollectionsKt.zip(paychecksHelpSheetUi.numberedItemTexts, paychecksHelpSheetUi.numberedItemSubtexts);
                ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(zip, 10));
                Iterator it3 = zip.iterator();
                while (it3.hasNext()) {
                    Pair pair = (Pair) it3.next();
                    String str19 = (String) pair.first;
                    String str20 = (String) pair.second;
                    if (str20 == null || str20.length() == 0) {
                        str20 = null;
                    }
                    arrayList9.add(new HelpSheetViewModel.Row(str19, str20));
                }
                HelpSheetViewModel helpSheetViewModel = new HelpSheetViewModel(paychecksHelpSheetUi.title, arrayList9, new HelpSheetViewModel.Button(paychecksHelpSheetUi.helpButtonText, HelpSheetViewEvent.AdditionalHelp.INSTANCE), new HelpSheetViewModel.Button(paychecksHelpSheetUi.dismissButtonText, HelpSheetViewEvent.Dismiss.INSTANCE));
                gapComposer7.end(false);
                return helpSheetViewModel;
            case 8:
                PhonePlansEsimCheckBlockerScreen phonePlansEsimCheckBlockerScreen = (PhonePlansEsimCheckBlockerScreen) obj3;
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(339668582);
                Object rememberedValue28 = gapComposer8.rememberedValue();
                if (rememberedValue28 == neverEqualPolicy) {
                    Lazy lazy3 = (Lazy) obj6;
                    int ordinal = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) lazy3.initializer)).peekCurrentValue(LaunchDarklyFeatureFlags$EsimSupportedOverride.INSTANCE)).ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                            }
                            rememberedValue28 = Boolean.valueOf(z);
                            gapComposer8.updateRememberedValue(rememberedValue28);
                        }
                        z = false;
                        rememberedValue28 = Boolean.valueOf(z);
                        gapComposer8.updateRememberedValue(rememberedValue28);
                    } else {
                        EuiccManager euiccManager = (EuiccManager) ((kotlin.Lazy) lazy3.value).getValue();
                        if (euiccManager != null) {
                            break;
                        }
                        z = false;
                        rememberedValue28 = Boolean.valueOf(z);
                        gapComposer8.updateRememberedValue(rememberedValue28);
                    }
                    return continuation3;
                }
                boolean booleanValue = ((Boolean) rememberedValue28).booleanValue();
                Object rememberedValue29 = gapComposer8.rememberedValue();
                if (rememberedValue29 == neverEqualPolicy) {
                    rememberedValue29 = Updater.mutableStateOf$default(Boolean.TRUE);
                    gapComposer8.updateRememberedValue(rememberedValue29);
                }
                MutableState mutableState12 = (MutableState) rememberedValue29;
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance6 = gapComposer8.changedInstance(workHomePresenter);
                Object rememberedValue30 = gapComposer8.rememberedValue();
                PhonePlansEsimCheckViewModel.Cta cta3 = null;
                boolean z6 = false;
                boolean z7 = false;
                if (changedInstance6 || rememberedValue30 == neverEqualPolicy) {
                    rememberedValue30 = new PhonePlansEsimCheckPresenter$models$1$1(workHomePresenter, null);
                    gapComposer8.updateRememberedValue(rememberedValue30);
                }
                Updater.LaunchedEffect(gapComposer8, unit3, (Function2) rememberedValue30);
                Updater.LaunchedEffect(gapComposer8, flow, new PdfPreviewPresenter$models$1$1(flow, (Continuation) (z7 ? 1 : 0), (MoleculePresenter) workHomePresenter, i7));
                boolean changedInstance7 = gapComposer8.changedInstance(workHomePresenter);
                Object rememberedValue31 = gapComposer8.rememberedValue();
                if (changedInstance7 || rememberedValue31 == neverEqualPolicy) {
                    mutableState3 = mutableState12;
                    RoomDatabase$performClear$1 roomDatabase$performClear$1 = new RoomDatabase$performClear$1((Object) workHomePresenter, booleanValue, (Object) mutableState3, (Continuation) (z6 ? 1 : 0), 14);
                    gapComposer8.updateRememberedValue(roomDatabase$performClear$1);
                    rememberedValue31 = roomDatabase$performClear$1;
                } else {
                    mutableState3 = mutableState12;
                }
                Updater.LaunchedEffect(gapComposer8, unit3, (Function2) rememberedValue31);
                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                    PhonePlansEsimCheckViewModel.ToolbarButton toolbarButton = PhonePlansEsimCheckViewModel.ToolbarButton.None;
                    PhonePlansEsimCheckViewModel.StatusAvatar statusAvatar = PhonePlansEsimCheckViewModel.StatusAvatar.Loading;
                    PhonePlanESimCheckBlocker phonePlanESimCheckBlocker = phonePlansEsimCheckBlockerScreen.blocker;
                    String str21 = phonePlanESimCheckBlocker.title;
                    continuation2 = new PhonePlansEsimCheckViewModel(statusAvatar, str21 != null ? str21 : "", phonePlanESimCheckBlocker.description);
                } else {
                    if (!booleanValue) {
                        BlockerAction blockerAction = phonePlansEsimCheckBlockerScreen.retreatAction;
                        PhonePlanESimCheckBlocker phonePlanESimCheckBlocker2 = phonePlansEsimCheckBlockerScreen.blocker;
                        PhonePlansEsimCheckViewModel.ToolbarButton toolbarButton2 = blockerAction != null ? PhonePlansEsimCheckViewModel.ToolbarButton.Back : PhonePlansEsimCheckViewModel.ToolbarButton.Close;
                        PhonePlansEsimCheckViewModel.StatusAvatar statusAvatar2 = PhonePlansEsimCheckViewModel.StatusAvatar.Failure;
                        String str22 = phonePlanESimCheckBlocker2.esim_unsupported_title;
                        String str23 = str22 == null ? "" : str22;
                        String str24 = phonePlanESimCheckBlocker2.esim_unsupported_description;
                        String str25 = phonePlanESimCheckBlocker2.esim_unsupported_primary_button_text;
                        if (str25 != null) {
                            String str26 = phonePlanESimCheckBlocker2.esim_unsupported_primary_action;
                            if (str26 == null) {
                                str26 = "unsupported";
                            }
                            cta = new PhonePlansEsimCheckViewModel.Cta(str25, str26);
                        } else {
                            cta = null;
                        }
                        String str27 = phonePlanESimCheckBlocker2.esim_unsupported_secondary_button_text;
                        if (str27 != null) {
                            String str28 = phonePlanESimCheckBlocker2.esim_unsupported_secondary_action;
                            if (str28 == null) {
                                str28 = "remind_on_upgrade";
                            }
                            cta2 = new PhonePlansEsimCheckViewModel.Cta(str27, str28);
                        } else {
                            cta2 = null;
                        }
                        String str29 = phonePlanESimCheckBlocker2.get_help_button_text;
                        if (str29 != null) {
                            String str30 = phonePlanESimCheckBlocker2.get_help_action;
                            if (str30 == null) {
                                str30 = "get_help";
                            }
                            cta3 = new PhonePlansEsimCheckViewModel.Cta(str29, str30);
                        }
                        continuation3 = new PhonePlansEsimCheckViewModel(toolbarButton2, statusAvatar2, str23, str24, cta, cta2, cta3);
                        gapComposer8.end(false);
                        return continuation3;
                    }
                    PhonePlansEsimCheckViewModel.ToolbarButton toolbarButton3 = PhonePlansEsimCheckViewModel.ToolbarButton.None;
                    PhonePlansEsimCheckViewModel.StatusAvatar statusAvatar3 = PhonePlansEsimCheckViewModel.StatusAvatar.Success;
                    PhonePlanESimCheckBlocker phonePlanESimCheckBlocker3 = phonePlansEsimCheckBlockerScreen.blocker;
                    String str31 = phonePlanESimCheckBlocker3.esim_supported_title;
                    continuation2 = new PhonePlansEsimCheckViewModel(statusAvatar3, str31 != null ? str31 : "", phonePlanESimCheckBlocker3.esim_supported_description);
                }
                continuation3 = continuation2;
                gapComposer8.end(false);
                return continuation3;
            case 9:
                return models$com$squareup$cash$phoneplans$applets$presenters$PhonePlansAppletTilePresenter(flow, composer, i);
            case 10:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(1941636971);
                Object rememberedValue32 = gapComposer9.rememberedValue();
                if (rememberedValue32 == neverEqualPolicy) {
                    rememberedValue32 = StateFlowKt.mapState(((RealPoolsRepository) obj4).appletData, new UtilsKt$$ExternalSyntheticLambda0(workHomePresenter, i4));
                    gapComposer9.updateRememberedValue(rememberedValue32);
                }
                Continuation continuation9 = null;
                MutableState collectAsState13 = Updater.collectAsState((StateFlow) rememberedValue32, null, gapComposer9, 1);
                Unit unit4 = Unit.INSTANCE;
                boolean changedInstance8 = gapComposer9.changedInstance(workHomePresenter);
                Object rememberedValue33 = gapComposer9.rememberedValue();
                if (changedInstance8 || rememberedValue33 == neverEqualPolicy) {
                    rememberedValue33 = new MusicPresenter$models$3$1(workHomePresenter, continuation9, 26);
                    gapComposer9.updateRememberedValue(rememberedValue33);
                }
                Updater.LaunchedEffect(gapComposer9, unit4, (Function2) rememberedValue33);
                Updater.LaunchedEffect(gapComposer9, flow, new PhonePlansHomePresenter$models$1$1(flow, continuation9, workHomePresenter, collectAsState13, 15));
                PoolsAppletTileModel poolsAppletTileModel = (PoolsAppletTileModel) collectAsState13.getValue();
                gapComposer9.end(false);
                return poolsAppletTileModel;
            case 11:
                return models$com$squareup$cash$pools$presenters$PoolMoreOptionsBottomSheetPresenter(flow, composer, i);
            case 12:
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(1290614453);
                boolean changedInstance9 = gapComposer10.changedInstance(workHomePresenter);
                Object rememberedValue34 = gapComposer10.rememberedValue();
                if (changedInstance9 || rememberedValue34 == neverEqualPolicy) {
                    rememberedValue34 = new RingtoneView.AnonymousClass1(workHomePresenter, continuation3, i5);
                    gapComposer10.updateRememberedValue(rememberedValue34);
                }
                MutableState produceState3 = Updater.produceState(gapComposer10, OpenSourceViewModel.Loading.INSTANCE, (Function2) rememberedValue34);
                Updater.LaunchedEffect(gapComposer10, flow, new PdfPreviewPresenter$models$1$1(flow, continuation3, workHomePresenter, 20));
                OpenSourceViewModel openSourceViewModel = (OpenSourceViewModel) produceState3.getValue();
                gapComposer10.end(false);
                return openSourceViewModel;
            case 13:
                return models$com$squareup$cash$profile$presenters$blockedaccounts$RealBlockedAccountsSectionPresenter(flow, composer, i);
            case 14:
                return models$com$squareup$cash$profile$presenters$notifications$ContactMethodDetailsPresenter(flow, composer, i);
            case 15:
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(148011720);
                Updater.LaunchedEffect(gapComposer11, flow, new SelectPaymentPlanBlockerPresenter$models$1$2(flow, continuation3, workHomePresenter, i6));
                FullScreenActivityViewModel fullScreenActivityViewModel = new FullScreenActivityViewModel(((RealActivityEmbeddedPresenter) obj5).models(gapComposer11, 0), ((AndroidStringManager) obj6).get(R.string.savings_activity_list_title));
                gapComposer11.end(false);
                return fullScreenActivityViewModel;
            case 16:
                return models$com$squareup$cash$savings$presenters$TransferInPresenter(flow, composer, i);
            case 17:
                return models$com$squareup$cash$support$chat$presenters$ChatFailedDeliverySheetPresenter(flow, composer, i);
            case 18:
                return models$com$squareup$cash$support$presenters$ContactSupportEmailInputPresenter(flow, composer, i);
            case 19:
                return models$com$squareup$cash$support$presenters$ContactSupportEmailMessagePresenter(flow, composer, i);
            case 20:
                return models$com$squareup$cash$support$presenters$SupportDisputeTrackerPresenter(flow, composer, i);
            case 21:
                return models$com$squareup$cash$taptopay$presenters$TapToPayErrorDialogPresenter(flow, composer, i);
            case 22:
                return models$com$squareup$cash$taptopay$presenters$TapToPayInitiatorNotesPresenter(flow, composer, i);
            case 23:
                return models$com$squareup$cash$transfers$presenters$InstrumentLinkingOptionsPresenter(flow, composer, i);
            case 24:
                return models$com$squareup$cash$transfers$presenters$RecurringReloadsDismissDialogPresenter(flow, composer, i);
            case 25:
                return models$com$squareup$cash$work$presenters$MerchantPickerPresenter(flow, composer, i);
            case 26:
                return models$com$squareup$cash$work$presenters$pay$TaxFormDownloaderPresenter(flow, composer, i);
            case 27:
                return models$com$squareup$cash$work$presenters$pay$TaxFormsListPresenter(flow, composer, i);
            case 28:
                return models$com$squareup$cash$work$presenters$shift$ShiftNotStartedDialogPresenter(flow, composer, i);
            default:
                WorkWebScreen workWebScreen = (WorkWebScreen) obj6;
                flow.getClass();
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(1217006232);
                Object rememberedValue35 = gapComposer12.rememberedValue();
                if (rememberedValue35 == neverEqualPolicy) {
                    rememberedValue35 = Updater.mutableStateOf$default(workWebScreen.useOtk ? WorkWebViewModel.OtkInitializing.INSTANCE : validateAndLoadUrl(workWebScreen.url));
                    gapComposer12.updateRememberedValue(rememberedValue35);
                }
                MutableState mutableState13 = (MutableState) rememberedValue35;
                Object rememberedValue36 = gapComposer12.rememberedValue();
                if (rememberedValue36 == neverEqualPolicy) {
                    rememberedValue36 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer12.updateRememberedValue(rememberedValue36);
                }
                MutableState mutableState14 = (MutableState) rememberedValue36;
                if (workWebScreen.useOtk) {
                    gapComposer12.startReplaceGroup(2014005920);
                    String str32 = workWebScreen.merchantToken;
                    Boolean bool = (Boolean) mutableState14.getValue();
                    bool.booleanValue();
                    boolean changedInstance10 = gapComposer12.changedInstance(workHomePresenter);
                    Object rememberedValue37 = gapComposer12.rememberedValue();
                    if (changedInstance10 || rememberedValue37 == neverEqualPolicy) {
                        mutableState4 = mutableState14;
                        WorkerWorkflow$render$1 workerWorkflow$render$1 = new WorkerWorkflow$render$1(this, mutableState13, mutableState4, (Continuation) null, 13);
                        gapComposer12.updateRememberedValue(workerWorkflow$render$1);
                        rememberedValue37 = workerWorkflow$render$1;
                    } else {
                        mutableState4 = mutableState14;
                    }
                    Updater.LaunchedEffect(str32, bool, (Function2) rememberedValue37, gapComposer12);
                    gapComposer12.end(false);
                } else {
                    mutableState4 = mutableState14;
                    gapComposer12.startReplaceGroup(2014538314);
                    gapComposer12.end(false);
                }
                Updater.LaunchedEffect(gapComposer12, flow, new WorkflowLayout$start$1(flow, (Continuation) null, this, mutableState13, mutableState4, 22));
                WorkWebViewModel workWebViewModel = (WorkWebViewModel) mutableState13.getValue();
                gapComposer12.end(false);
                return workWebViewModel;
        }
    }

    public PasskeyManagementViewModel.PasskeyItemViewModel toViewModel(Passkey passkey) {
        RealTodayDateTimeFormatter realTodayDateTimeFormatter = (RealTodayDateTimeFormatter) this.titleBarPresenter;
        Instant ofEpochMilli = Instant.ofEpochMilli(passkey.createdAtMillis);
        ofEpochMilli.getClass();
        AndroidStringManager androidStringManager = (AndroidStringManager) this.shiftSection2Presenter;
        return new PasskeyManagementViewModel.PasskeyItemViewModel(passkey.id, passkey.name, realTodayDateTimeFormatter.formatDate(ofEpochMilli, new TodayDateTimeFormatter$FormatOptions(99, null, androidStringManager.get(R.string.passkeys_item_description_prefix_today), androidStringManager.get(R.string.passkeys_item_description_prefix_other), false, true)));
    }

    public /* synthetic */ WorkHomePresenter(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$r8$classId = i;
        this.shiftsAnalytics = obj;
        this.titleBarPresenter = obj2;
        this.shiftSection2Presenter = obj3;
        this.payPresenter = obj4;
        this.youPresenter = obj5;
    }

    public WorkHomePresenter(RealConversationService realConversationService, AndroidAccessibilityManager androidAccessibilityManager, AndroidStringManager androidStringManager, SupportChatScreens.SupportChatSheets.ChatFailedDeliverySheet chatFailedDeliverySheet, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 17;
        chatFailedDeliverySheet.getClass();
        this.shiftsAnalytics = realConversationService;
        this.titleBarPresenter = androidAccessibilityManager;
        this.shiftSection2Presenter = androidStringManager;
        this.payPresenter = chatFailedDeliverySheet;
        this.youPresenter = screenNavigator;
    }

    public WorkHomePresenter(ShiftNotStartedDialogScreen shiftNotStartedDialogScreen, BetterNavigator.ScreenNavigator screenNavigator, RealShiftTimeFormatter realShiftTimeFormatter, AndroidClock androidClock, AndroidStringManager androidStringManager) {
        this.$r8$classId = 28;
        shiftNotStartedDialogScreen.getClass();
        this.shiftsAnalytics = shiftNotStartedDialogScreen;
        this.titleBarPresenter = screenNavigator;
        this.shiftSection2Presenter = realShiftTimeFormatter;
        this.payPresenter = androidClock;
        this.youPresenter = androidStringManager;
    }

    public WorkHomePresenter(WorkTaxFormDownloaderScreen workTaxFormDownloaderScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, TextSetter textSetter, ShiftsAnalytics shiftsAnalytics) {
        this.$r8$classId = 26;
        workTaxFormDownloaderScreen.getClass();
        this.titleBarPresenter = workTaxFormDownloaderScreen;
        this.shiftSection2Presenter = screenNavigator;
        this.payPresenter = androidStringManager;
        this.youPresenter = textSetter;
        this.shiftsAnalytics = shiftsAnalytics;
    }

    public WorkHomePresenter(RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl, SavingsActivityItemEventDecorator savingsActivityItemEventDecorator, SessionManager sessionManager, RealActivitiesCacheManager realActivitiesCacheManager, AndroidStringManager androidStringManager, BetterNavigator.ScreenNavigator screenNavigator, SavingsFullActivityScreen savingsFullActivityScreen) {
        this.$r8$classId = 15;
        this.shiftsAnalytics = androidStringManager;
        this.titleBarPresenter = screenNavigator;
        this.shiftSection2Presenter = savingsFullActivityScreen;
        kotlin.Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new ShareSheetViewKt$$ExternalSyntheticLambda5(6, this, sessionManager));
        this.payPresenter = lazy;
        this.youPresenter = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default((ActivitiesManager.ActivityContext) lazy.getValue(), RealActivitiesCacheManager.take$default(realActivitiesCacheManager, (ActivitiesManager.ActivityContext) lazy.getValue()), savingsFullActivityScreen, false, null, InputEventTrigger.Companion.decoratedWith(defaultActivityItemEventHandler$Factory$Impl, savingsActivityItemEventDecorator), null, null, null, 15864));
    }

    public WorkHomePresenter(ChatManager chatManager, Moshi moshi, RawMessagesScreen rawMessagesScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 4;
        this.shiftsAnalytics = chatManager;
        this.titleBarPresenter = moshi;
        this.shiftSection2Presenter = rawMessagesScreen;
        this.payPresenter = screenNavigator;
        this.youPresenter = LazyKt.lazy(new MoneyTabUIKt$$ExternalSyntheticLambda5(this, 8));
    }

    public WorkHomePresenter(OnboardingLandingScreen onboardingLandingScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, RealObservabilityManager realObservabilityManager, AndroidStringManager androidStringManager) {
        this.$r8$classId = 5;
        onboardingLandingScreen.getClass();
        this.shiftsAnalytics = onboardingLandingScreen;
        this.titleBarPresenter = screenNavigator;
        this.shiftSection2Presenter = analytics;
        this.payPresenter = realObservabilityManager;
        this.youPresenter = androidStringManager;
    }

    public WorkHomePresenter(AndroidStringManager androidStringManager, BlockerFlowListener blockerFlowListener, Analytics analytics, RecurringReloadsDismissDialogScreen recurringReloadsDismissDialogScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 24;
        recurringReloadsDismissDialogScreen.getClass();
        this.shiftsAnalytics = androidStringManager;
        this.titleBarPresenter = blockerFlowListener;
        this.shiftSection2Presenter = analytics;
        this.payPresenter = recurringReloadsDismissDialogScreen;
        this.youPresenter = screenNavigator;
    }

    public WorkHomePresenter(AndroidStringManager androidStringManager, ErrorReporter errorReporter, MoneybotStaticPickerScreen moneybotStaticPickerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 3;
        this.shiftsAnalytics = androidStringManager;
        this.titleBarPresenter = errorReporter;
        this.shiftSection2Presenter = moneybotStaticPickerScreen;
        this.payPresenter = screenNavigator;
        this.youPresenter = (MoneybotStaticPickerQuestion) moneybotStaticPickerScreen.askedQuestion.question;
    }

    public WorkHomePresenter(RealInvestingMetrics realInvestingMetrics, RealInvestmentEntities realInvestmentEntities, AndroidStringManager androidStringManager, BetterNavigator.ScreenNavigator screenNavigator, InvestingScreens.KeyStatsDetailsScreen keyStatsDetailsScreen) {
        this.$r8$classId = 1;
        keyStatsDetailsScreen.getClass();
        this.shiftsAnalytics = realInvestingMetrics;
        this.titleBarPresenter = realInvestmentEntities;
        this.shiftSection2Presenter = androidStringManager;
        this.payPresenter = screenNavigator;
        this.youPresenter = keyStatsDetailsScreen;
    }

    public WorkHomePresenter(RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper, IntentLauncher intentLauncher, RealSupportNavigator realSupportNavigator, BetterNavigator.ScreenNavigator screenNavigator, TapToPayErrorDialogScreen tapToPayErrorDialogScreen) {
        this.$r8$classId = 21;
        tapToPayErrorDialogScreen.getClass();
        this.shiftsAnalytics = realTapToPayAnalyticsHelper;
        this.titleBarPresenter = intentLauncher;
        this.shiftSection2Presenter = realSupportNavigator;
        this.payPresenter = screenNavigator;
        this.youPresenter = tapToPayErrorDialogScreen;
    }

    public WorkHomePresenter(FlowStarter flowStarter, SessionManager sessionManager, Analytics analytics, PoolMoreOptionsBottomSheet poolMoreOptionsBottomSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 11;
        poolMoreOptionsBottomSheet.getClass();
        this.shiftsAnalytics = flowStarter;
        this.titleBarPresenter = sessionManager;
        this.shiftSection2Presenter = analytics;
        this.payPresenter = poolMoreOptionsBottomSheet;
        this.youPresenter = screenNavigator;
    }

    public WorkHomePresenter(RealProfileManager realProfileManager, AndroidStringManager androidStringManager, Analytics analytics, ProfileScreens.ContactMethodDetailsScreen contactMethodDetailsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 14;
        contactMethodDetailsScreen.getClass();
        this.shiftsAnalytics = realProfileManager;
        this.titleBarPresenter = androidStringManager;
        this.shiftSection2Presenter = analytics;
        this.payPresenter = contactMethodDetailsScreen;
        this.youPresenter = screenNavigator;
    }

    public WorkHomePresenter(SyncValueReader syncValueReader, BetterNavigator.ScreenNavigator screenNavigator, RealRouter$Factory$Impl realRouter$Factory$Impl, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.$r8$classId = 7;
        this.shiftsAnalytics = syncValueReader;
        this.titleBarPresenter = screenNavigator;
        this.shiftSection2Presenter = errorReporter;
        this.payPresenter = sampleStrategy;
        this.youPresenter = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public WorkHomePresenter(WorkTaxFormsListScreen workTaxFormsListScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, TaxFormsService taxFormsService, RealSelectedMerchantProvider realSelectedMerchantProvider, ShiftsAnalytics shiftsAnalytics) {
        this.$r8$classId = 27;
        workTaxFormsListScreen.getClass();
        this.titleBarPresenter = screenNavigator;
        this.shiftSection2Presenter = androidStringManager;
        this.payPresenter = taxFormsService;
        this.youPresenter = realSelectedMerchantProvider;
        this.shiftsAnalytics = shiftsAnalytics;
    }

    public WorkHomePresenter(WorkWebScreen workWebScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, OtkRedirectUseCase otkRedirectUseCase, Payload payload) {
        this.$r8$classId = 29;
        workWebScreen.getClass();
        this.shiftsAnalytics = workWebScreen;
        this.titleBarPresenter = screenNavigator;
        this.shiftSection2Presenter = androidStringManager;
        this.payPresenter = otkRedirectUseCase;
        this.youPresenter = payload;
    }

    public WorkHomePresenter(LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, RealPoolsRepository realPoolsRepository, MoneyAnalyticsService moneyAnalyticsService, Navigator navigator) {
        this.$r8$classId = 10;
        navigator.getClass();
        this.shiftsAnalytics = androidStringManager;
        this.titleBarPresenter = realPoolsRepository;
        this.shiftSection2Presenter = moneyAnalyticsService;
        this.payPresenter = navigator;
        this.youPresenter = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public WorkHomePresenter(BlocklyService blocklyService, SessionManager sessionManager, AndroidStringManager androidStringManager, Analytics analytics, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 13;
        this.shiftsAnalytics = blocklyService;
        this.titleBarPresenter = androidStringManager;
        this.shiftSection2Presenter = analytics;
        this.payPresenter = screenNavigator;
        this.youPresenter = PlatformKt.activeAccountToken(sessionManager);
    }

    public WorkHomePresenter(AndroidStringManager androidStringManager, FlowStarter flowStarter, Analytics analytics, InstrumentLinkingOptionsScreen instrumentLinkingOptionsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 23;
        instrumentLinkingOptionsScreen.getClass();
        this.shiftsAnalytics = androidStringManager;
        this.titleBarPresenter = flowStarter;
        this.shiftSection2Presenter = analytics;
        this.payPresenter = instrumentLinkingOptionsScreen;
        this.youPresenter = screenNavigator;
    }

    public WorkHomePresenter(RealDisputesTrackerService realDisputesTrackerService, RealDisputesTrackerMapper realDisputesTrackerMapper, Analytics analytics, SupportScreens.FlowScreens.SupportDisputeTrackerScreen supportDisputeTrackerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 20;
        supportDisputeTrackerScreen.getClass();
        this.shiftsAnalytics = realDisputesTrackerService;
        this.titleBarPresenter = realDisputesTrackerMapper;
        this.shiftSection2Presenter = analytics;
        this.payPresenter = supportDisputeTrackerScreen;
        this.youPresenter = screenNavigator;
    }

    public WorkHomePresenter(RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, Lazy lazy, ErrorReporter errorReporter, PhonePlansEsimCheckBlockerScreen phonePlansEsimCheckBlockerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 8;
        phonePlansEsimCheckBlockerScreen.getClass();
        this.shiftsAnalytics = lazy;
        this.titleBarPresenter = errorReporter;
        this.shiftSection2Presenter = phonePlansEsimCheckBlockerScreen;
        this.payPresenter = screenNavigator;
        this.youPresenter = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    public WorkHomePresenter(Analytics analytics, AndroidStringManager androidStringManager, RealSupportEmailValidationService realSupportEmailValidationService, SupportScreens.ContactScreens.ContactSupportEmailInputScreen contactSupportEmailInputScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 18;
        contactSupportEmailInputScreen.getClass();
        this.shiftsAnalytics = analytics;
        this.titleBarPresenter = androidStringManager;
        this.shiftSection2Presenter = realSupportEmailValidationService;
        this.payPresenter = contactSupportEmailInputScreen;
        this.youPresenter = screenNavigator;
    }

    public WorkHomePresenter(RealPasskeyRepository realPasskeyRepository, RealTodayDateTimeFormatter realTodayDateTimeFormatter, AndroidStringManager androidStringManager, RealPasskeyAnalytics realPasskeyAnalytics, RealDeviceManagerInboundNavigator$Factory$Impl realDeviceManagerInboundNavigator$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 6;
        this.shiftsAnalytics = realPasskeyRepository;
        this.titleBarPresenter = realTodayDateTimeFormatter;
        this.shiftSection2Presenter = androidStringManager;
        this.payPresenter = realPasskeyAnalytics;
        this.youPresenter = screenNavigator;
    }

    public WorkHomePresenter(Analytics analytics, RealGenericTreeElementsRepo realGenericTreeElementsRepo, RealGenericTreeElementsPresenter$Factory$Impl realGenericTreeElementsPresenter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, SquareLoyaltySheetScreen squareLoyaltySheetScreen) {
        this.$r8$classId = 2;
        squareLoyaltySheetScreen.getClass();
        this.shiftsAnalytics = analytics;
        this.titleBarPresenter = realGenericTreeElementsRepo;
        this.shiftSection2Presenter = screenNavigator;
        this.payPresenter = squareLoyaltySheetScreen;
        this.youPresenter = realGenericTreeElementsPresenter$Factory$Impl.create$1(squareLoyaltySheetScreen, screenNavigator);
    }

    public WorkHomePresenter(TransferInScreen transferInScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidStringManager androidStringManager, Analytics analytics, LocalizedMoneyFormatter.Factory factory) {
        this.$r8$classId = 16;
        this.shiftsAnalytics = transferInScreen;
        this.titleBarPresenter = screenNavigator;
        this.shiftSection2Presenter = androidStringManager;
        this.payPresenter = analytics;
        this.youPresenter = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public WorkHomePresenter(AppService appService, AndroidStringManager androidStringManager, Analytics analytics, SupportScreens.ContactScreens.ContactSupportMessageScreen contactSupportMessageScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 19;
        contactSupportMessageScreen.getClass();
        this.shiftsAnalytics = appService;
        this.titleBarPresenter = androidStringManager;
        this.shiftSection2Presenter = analytics;
        this.payPresenter = contactSupportMessageScreen;
        this.youPresenter = screenNavigator;
    }

    public WorkHomePresenter(RealPhonePlansAppletTileAvailabilityManager realPhonePlansAppletTileAvailabilityManager, MoneyAnalyticsService moneyAnalyticsService, RealMoneyNavigatorHelper realMoneyNavigatorHelper, PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl, RealRouter$Factory$Impl realRouter$Factory$Impl, SyncValueReader syncValueReader, Navigator navigator) {
        this.$r8$classId = 9;
        navigator.getClass();
        this.shiftsAnalytics = realPhonePlansAppletTileAvailabilityManager;
        this.titleBarPresenter = moneyAnalyticsService;
        this.shiftSection2Presenter = syncValueReader;
        this.payPresenter = promotedAppletTilePresenter$Factory$Impl.create(AppletId.PHONE_PLANS);
        this.youPresenter = realRouter$Factory$Impl.create$1(navigator);
    }
}
