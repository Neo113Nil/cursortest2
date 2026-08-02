package com.squareup.cash.wallet.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Parcelable;
import androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$update3aRegions$1$1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.compose.ViewfinderKt;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.CanvasUtils;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.core.text.TextUtilsCompat;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalAddBrandsPresenter$models$2$1;
import app.cash.local.presenters.LocalPresenterFactoryKt;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.versioned.Versioned;
import app.cash.versioned.VersionedKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.fillr.browsersdk.model.FillrWidget;
import com.fillr.n;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadq;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahh;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahi;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.google.android.gms.maps.zzai;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.documents.AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.appforeground.AppForegroundStateProvider;
import com.squareup.cash.appforeground.RealAppForegroundStateProvider;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.banking.navigation.real.RealBankingOutboundNavigator$Factory$Impl;
import com.squareup.cash.banking.presenters.RecurringDepositsPresenter$models$1$1;
import com.squareup.cash.banking.screens.BalanceHomeScreen;
import com.squareup.cash.banking.screens.RecurringDepositsScreen;
import com.squareup.cash.banking.viewmodels.RecurringDepositsViewModel;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter$Factory$Impl;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountViewModel;
import com.squareup.cash.bitcoin.viewmodels.BitcoinKeypadModel;
import com.squareup.cash.blockers.analytics.RealFlowTokenGenerator;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.navigation.FlowNavigationHelper;
import com.squareup.cash.blockers.presenters.BitcoinAmountBlockerPresenter$State;
import com.squareup.cash.blockers.presenters.CashtagPresenter$models$2$1;
import com.squareup.cash.blockers.presenters.PasscodePresenter$models$1$2;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$RealIdvPresenterFactory$Impl;
import com.squareup.cash.blockers.presenters.SetAddressPresenter$WhenMappings;
import com.squareup.cash.blockers.presenters.SetAddressPresenter$createShippingAddress$1;
import com.squareup.cash.blockers.presenters.SetAddressPresenter$setAddress$1;
import com.squareup.cash.blockers.presenters.SetAddressPresenter$setAddressFailure$1;
import com.squareup.cash.blockers.presenters.SetAddressPresenter$setAddressSuccess$1;
import com.squareup.cash.blockers.presenters.SetAddressPresenter$setShippingAddress$1;
import com.squareup.cash.blockers.presenters.SetNamePresenter$SubmitNameResult;
import com.squareup.cash.blockers.presenters.SetNamePresenter$WhenMappings;
import com.squareup.cash.blockers.presenters.SetNamePresenter$createShippingAddressWithName$1;
import com.squareup.cash.blockers.presenters.SetNamePresenter$models$1$1$1;
import com.squareup.cash.blockers.presenters.SetNamePresenter$submitName$1;
import com.squareup.cash.blockers.presenters.SetNamePresenter$submitName$result$1;
import com.squareup.cash.blockers.presenters.SetNamePresenter$submitShippingAddressName$1;
import com.squareup.cash.blockers.presenters.SetNamePresenter$submitShippingAddressName$result$1;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$2$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.IdvViewModel;
import com.squareup.cash.blockers.viewmodels.SetAddressViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$None;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.db.RewardWithSelection;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.spendinginsights.activity.SpendingInsightsActivityRequestHandler;
import com.squareup.cash.card.spendinginsights.backend.api.GeneralSpendingInsightsError;
import com.squareup.cash.card.spendinginsights.backend.api.SpendingInsightsParsingErrorFactory;
import com.squareup.cash.card.spendinginsights.backend.api.model.ColoredText;
import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsightsConfig;
import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsightsHome;
import com.squareup.cash.card.spendinginsights.presenters.SpendingInsightsHomePresenter$refreshHome$1;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightHomeViewEvent;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightsHomeViewModel;
import com.squareup.cash.cdf.account.AccountRecoveryStart;
import com.squareup.cash.cdf.autoreload.AutoReloadSettingsSettingViewed;
import com.squareup.cash.cdf.autoreload.AutoReloadSettingsViewed;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionSubmitMultiAllocation;
import com.squareup.cash.cdf.promotions.PromotionState;
import com.squareup.cash.cdf.promotions.PromotionsTapPromotionRow;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel$ChartLabel$DefaultLabel;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.data.profile.ReferralManager$RewardStatus;
import com.squareup.cash.device.DeviceOrientation;
import com.squareup.cash.device.RealDeviceOrientationProvider;
import com.squareup.cash.featureflags.AmplitudeExperiments$BankingCashGreenRelease;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$CardBenefitsOffersCountLimit;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gps.backend.real.AndroidLocationProvider;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.keystore.RealMessageSigner$sign$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneybot.analytics.RealMoneybotAnalyticsService;
import com.squareup.cash.moneybot.backend.RealMoneybotChatMessagesCache;
import com.squareup.cash.moneybot.backend.RealUserSessionPager;
import com.squareup.cash.moneybot.backend.api.MoneybotFlagsHelper;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.model.chat.Session;
import com.squareup.cash.moneybot.presenters.MoneybotChatHistoryPresenter$content$$inlined$sortedByDescending$1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneybot.screens.MoneybotOverflowMenuScreen;
import com.squareup.cash.moneybot.viewmodels.MoneybotOverflowMenuViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotOverflowMenuViewModel;
import com.squareup.cash.moneybot.viewmodels.OverflowMenuItem;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Empty;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Error;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loading;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.nearby.backend.NearbyAdvertisement;
import com.squareup.cash.nearby.backend.NearbyIdentifier;
import com.squareup.cash.nearby.backend.NearbyPermissionState;
import com.squareup.cash.nearby.backend.RealNearbyManager;
import com.squareup.cash.nearby.backend.ble.BleDeviceState;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsV2;
import com.squareup.cash.offers.backend.real.RealOffersInflightStateManager;
import com.squareup.cash.offers.presenters.OfferDetailsFooterStateV2;
import com.squareup.cash.offers.presenters.OffersDetailsPresenterV2$WhenMappings;
import com.squareup.cash.offers.screens.OffersScreen$OffersDetailsScreenV2;
import com.squareup.cash.offers.viewmodels.OffersDetailsSheetViewModelV2;
import com.squareup.cash.offers.viewmodels.viewevents.OffersDetailsSheetViewEventV2;
import com.squareup.cash.offers.views.OffersStyledTextKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.home.OffersHomeV2Kt$$ExternalSyntheticLambda7;
import com.squareup.cash.onboarding.accountpicker.backend.RealSelectedAliasRegistrar;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerParsingErrorFactory;
import com.squareup.cash.onboarding.accountpicker.presenters.AccountPickerProtoParsingError;
import com.squareup.cash.onboarding.accountpicker.presenters.AliasPickerPresenter$launchAccountRecovery$1;
import com.squareup.cash.onboarding.accountpicker.presenters.AliasPickerPresenter$registerOnNext$1;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedAccountListKt$WhenMappings;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedAliasPicker;
import com.squareup.cash.onboarding.accountpicker.presenters.ValidatedPickableAlias;
import com.squareup.cash.onboarding.accountpicker.screens.OnboardingAliasPickerScreen;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasPickerViewModel;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasViewModel;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paychecks.backend.api.PaychecksParsingErrorFactory;
import com.squareup.cash.paychecks.backend.api.mapper.CommonMappersKt;
import com.squareup.cash.paychecks.backend.api.mapper.SetPaycheckMultipleAllocationMappersKt;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.BottomSheet;
import com.squareup.cash.paychecks.backend.api.model.MultipleAllocationBlocker;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.backend.api.model.PaychecksAlertUi;
import com.squareup.cash.paychecks.presenters.AllocationGroupWithPercentage;
import com.squareup.cash.paychecks.presenters.MultipleAllocationPresenter$submit$1;
import com.squareup.cash.paychecks.presenters.MultipleAllocationPresenterKt;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import com.squareup.cash.paychecks.screens.SetPaycheckMultipleAllocationScreen;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewEvent;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.presenters.AnalyticsHelperKt;
import com.squareup.cash.payments.screens.NearbyAvatarInfo;
import com.squareup.cash.payments.screens.NearbyPayer;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestTab;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewModel;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.pools.presenters.PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.promotionsreferrals.presenters.PromotionsReferralsHomePresenter$PromotionsListState;
import com.squareup.cash.promotionsreferrals.presenters.PromotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1;
import com.squareup.cash.promotionsreferrals.screens.PromotionsReferralsScreen$PromotionsReferralsHomeScreen;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewEvent;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewModel;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.taptopay.backend.api.EmvCardStatus;
import com.squareup.cash.taptopay.backend.api.EmvPaymentResult;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentData;
import com.squareup.cash.taptopay.backend.real.RealTagCommunication$Factory$Impl;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.backend.real.RealTapToPayErrorReporter;
import com.squareup.cash.taptopay.backend.real.RealTapToPaySessionManager;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$State;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$WhenMappings;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$models$$inlined$LaunchedEffectNotNull$2;
import com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$models$2$1;
import com.squareup.cash.taptopay.screens.TapToPayPaymentScreen;
import com.squareup.cash.taptopay.viewmodels.TapToPayAvatarViewModel;
import com.squareup.cash.taptopay.viewmodels.TapToPayPaymentViewModel;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.transfers.backend.api.BalanceBasedAddCashPreference;
import com.squareup.cash.transfers.backend.api.ScheduledReloadsManager;
import com.squareup.cash.transfers.backend.real.RealBalanceBasedAddCashManager;
import com.squareup.cash.transfers.backend.real.RealScheduledReloadsManager;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.amount.AmountDisplayKt$AmountDisplay$1$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealCashAppTagManager;
import com.squareup.cash.wallet.data.RealDeviceLockAnimationBus;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.screens.CardLockHalfSheetScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.viewmodels.CardLockHalfSheetModel;
import com.squareup.cash.wallet.viewmodels.DeviceLockModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$4$1;
import com.squareup.cash.wallet.views.HeroCardViewKt$Render$1$5$1$2$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.wallet.views.InteractiveCardState$animateLock$2;
import com.squareup.cash.work.data.api.AssignedJob;
import com.squareup.cash.work.data.api.AssignedJobProviderKt$jobs$$inlined$map$1;
import com.squareup.cash.work.data.api.ClockInControls;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.cash.work.data.api.ClockInEssentialsState;
import com.squareup.cash.work.data.api.DashboardScheduleState;
import com.squareup.cash.work.data.api.GetClockInEssentialsUseCase;
import com.squareup.cash.work.data.api.LastClockedInInfo;
import com.squareup.cash.work.data.api.LocationScopedClockInControls;
import com.squareup.cash.work.data.real.RealAssignedJobProvider;
import com.squareup.cash.work.data.real.RealClockInEssentialsProvider;
import com.squareup.cash.work.data.real.RealDashboardScheduleProvider;
import com.squareup.cash.work.data.real.RealGetClockInEssentialsUseCase;
import com.squareup.cash.work.data.real.RealLastClockedInInfoUseCase;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.cash.work.data.real.RealSelectedMerchantDataProvider;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.cash.work.identifiers.PersonIdentifier;
import com.squareup.cash.work.presenters.RealSellerCardViewModelProducer;
import com.squareup.cash.work.presenters.providers.RealAssignedLocationProvider;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider;
import com.squareup.cash.work.presenters.providers.RealPasscodeProvider$getPasscode$1;
import com.squareup.cash.work.presenters.shift.ClockInSelectionResolver$Selection;
import com.squareup.cash.work.presenters.shift.RealClockInRepository;
import com.squareup.cash.work.presenters.shift.ShiftDetailClockInState;
import com.squareup.cash.work.presenters.shift.ShiftDetailMapper;
import com.squareup.cash.work.presenters.shift.data.ClockInStateResolver;
import com.squareup.cash.work.presenters.shift.geofence.ClockedOutGeofenceUiState;
import com.squareup.cash.work.presenters.shift.geofence.GeofenceStateResolver;
import com.squareup.cash.work.screens.ClockInOverlayScreen;
import com.squareup.cash.work.screens.ShiftDetailScreen;
import com.squareup.cash.work.session.RealCurrentUserProvider;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.MerchantKt;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.cash.work.tinygraph.real.RealPersonRepository;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.CurrentTimeMillisProvider$Companion;
import com.squareup.cash.work.viewmodels.CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.cash.work.viewmodels.ShiftDetailViewModel;
import com.squareup.cash.work.viewmodels.ToastState;
import com.squareup.preferences.BooleanPreference;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.api.ResponseMetadata;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
import com.squareup.protos.cash.fiatly.api.v2.PaymentUpdate;
import com.squareup.protos.cash.fiatly.api.v2.SenderProfileData;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.grantly.api.ShippingAddressSource;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.CreateShippingAddressResponse;
import com.squareup.protos.cash.grantly.app.ShippingAddressService;
import com.squareup.protos.cash.grantly.app.UpdateShippingAddressRequest;
import com.squareup.protos.cash.grantly.app.UpdateShippingAddressResponse;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.janus.api.ReturningCustomerLoginFlowService;
import com.squareup.protos.cash.janus.api.StartAccountRecoveryRequest;
import com.squareup.protos.cash.janus.api.StartAccountRecoveryResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.nearby.api.v1.NearbyContext;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Cancel;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Disable;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitAll;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitSingle;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckMultiAllocationResponse;
import com.squareup.protos.cash.referly.api.incentives.client.ActivePromotion;
import com.squareup.protos.cash.referly.api.incentives.client.AvailablePromotion;
import com.squareup.protos.cash.referly.api.incentives.client.GetPromotionsHomeDataRequest;
import com.squareup.protos.cash.referly.api.incentives.client.GetPromotionsHomeDataResponse;
import com.squareup.protos.cash.referly.api.incentives.client.IncentivesClientService;
import com.squareup.protos.cash.referly.api.incentives.client.PromotionsHomeData;
import com.squareup.protos.cash.spendinginsights.appapi.RefreshCardSpendingInsightsHomeRequest;
import com.squareup.protos.cash.spendinginsights.appapi.SpendingInsightsAppService;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.api.SetPaycheckMultiAllocationBlocker;
import com.squareup.protos.franklin.api.UiAlias;
import com.squareup.protos.franklin.app.AccountListConfig;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.SetAddressRequest;
import com.squareup.protos.franklin.app.SetAddressResponse;
import com.squareup.protos.franklin.app.SetAmountRequest;
import com.squareup.protos.franklin.app.SetFullNameResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.rewardly.ui.AppLinkAndroid;
import com.squareup.protos.rewardly.ui.AppLinks;
import com.squareup.protos.rewardly.ui.UiRewardProgramDetails;
import com.squareup.protos.timecards.EmployeeJobInfo;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.protos.wire.roster.mds.Name;
import com.squareup.protos.wire.roster.mds.Names;
import com.squareup.util.Strings;
import com.squareup.util.android.RealBackupService;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.ProtoDefaults;
import com.squareup.util.cash.Regions;
import com.squareup.util.coroutines.Signal;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.util.coroutines.TickerKt;
import com.squareup.wire.GrpcStatus;
import com.squareup.workflow1.WorkerWorkflow$render$1;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.chrisbanes.haze.Pool;
import io.noties.markwon.MarkwonConfiguration;
import java.text.NumberFormat;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.MutexImpl;
import okhttp3.internal.Tags;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.PapaEvent;
import papa.SafeTrace;
import squareup.cash.bankingbenefits.ui.CashGreenV1;
import squareup.cash.paychecks.AlertUi;
import squareup.cash.paychecks.AllocationDistribution;
import squareup.cash.paychecks.LocalizedTemplatedString;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class CardLockPresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId;
    public final Object analytics;
    public final Object args;
    public final Object cardLockFlowTypeProvider;
    public final Object cashAppTagManager;
    public final Object deviceLockAnimationBus;
    public Object flowNavigationHelper;
    public Object flowStarter;
    public final Object franklinAppService;
    public Object ioDispatcher;
    public final Object issuedCardManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final Object stringManager;

    public CardLockPresenter(AndroidStringManager androidStringManager, Analytics analytics, BlockerFlowListener blockerFlowListener, ShippingAddressService shippingAddressService, AppService appService, BlockersDataNavigator blockersDataNavigator, AppConfigManager appConfigManager, RealIdvPresenter$RealIdvPresenterFactory$Impl realIdvPresenter$RealIdvPresenterFactory$Impl, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, BlockersScreens.StreetAddressScreen streetAddressScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        SetAddressViewModel.Mode mode;
        String str;
        int i;
        int i2;
        int i3;
        this.$r8$classId = 3;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.args = blockerFlowListener;
        this.cardLockFlowTypeProvider = shippingAddressService;
        this.franklinAppService = appService;
        this.cashAppTagManager = blockersDataNavigator;
        this.issuedCardManager = appConfigManager;
        this.flowStarter = streetAddressScreen;
        this.navigator = screenNavigator;
        this.flowNavigationHelper = streetAddressScreen.idvFlow ? realIdvPresenter$RealIdvPresenterFactory$Impl.create$1(streetAddressScreen) : null;
        realBlockersHelper$Factory$Impl.create(screenNavigator);
        BlockersScreens.StreetAddressScreen streetAddressScreen2 = (BlockersScreens.StreetAddressScreen) this.flowStarter;
        String str2 = streetAddressScreen2.titleOverride;
        if (str2 == null) {
            if (streetAddressScreen2.formType != BlockersScreens.StreetAddressScreen.FormType.POSTAL_CODE) {
                str2 = androidStringManager.get(R.string.profile_street_address_title);
            } else {
                Region region = streetAddressScreen2.blockersData.region;
                int i4 = SetAddressPresenter$WhenMappings.$EnumSwitchMapping$1[region.ordinal()];
                if (i4 == 1) {
                    i3 = R.string.postal_code_title_au;
                } else if (i4 == 2) {
                    i3 = R.string.postal_code_title_ca;
                } else if (i4 == 3) {
                    i3 = R.string.postal_code_title_gb;
                } else if (i4 == 4) {
                    i3 = R.string.postal_code_title_us;
                } else {
                    if (i4 != 5) {
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) region, "Unexpected region ");
                        throw null;
                    }
                    i3 = R.string.postal_code_title_ie;
                }
                str2 = androidStringManager.get(i3);
            }
        }
        BlockersScreens.StreetAddressScreen streetAddressScreen3 = (BlockersScreens.StreetAddressScreen) this.flowStarter;
        String str3 = streetAddressScreen3.subtitleOverride;
        String str4 = streetAddressScreen3.hintOverride;
        if (str4 == null) {
            if (streetAddressScreen3.formType != BlockersScreens.StreetAddressScreen.FormType.POSTAL_CODE) {
                str4 = androidStringManager.get(R.string.profile_street_address_hint);
            } else {
                Region region2 = streetAddressScreen3.blockersData.region;
                int i5 = SetAddressPresenter$WhenMappings.$EnumSwitchMapping$1[region2.ordinal()];
                if (i5 == 1) {
                    i2 = R.string.postal_code_hint_au;
                } else if (i5 == 2) {
                    i2 = R.string.postal_code_hint_ca;
                } else if (i5 == 3) {
                    i2 = R.string.postal_code_hint_gb;
                } else if (i5 == 4) {
                    i2 = R.string.postal_code_hint_us;
                } else {
                    if (i5 != 5) {
                        OptionalProvider$$ExternalSyntheticLambda0.m((Object) region2, "Unexpected region ");
                        throw null;
                    }
                    i2 = R.string.postal_code_hint_ie;
                }
                str4 = androidStringManager.get(i2);
            }
        }
        int ordinal = ((BlockersScreens.StreetAddressScreen) this.flowStarter).formType.ordinal();
        if (ordinal == 0) {
            mode = SetAddressViewModel.Mode.Postal.INSTANCE;
        } else if (ordinal == 1) {
            mode = SetAddressViewModel.Mode.StreetAndPostal.INSTANCE;
        } else {
            if (ordinal != 2) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            mode = new SetAddressViewModel.Mode.FullAddress(((BlockersScreens.StreetAddressScreen) this.flowStarter).addressTypeaheadEnabled);
        }
        Region region3 = ((BlockersScreens.StreetAddressScreen) this.flowStarter).blockersData.region;
        int[] iArr = SetAddressPresenter$WhenMappings.$EnumSwitchMapping$1;
        int i6 = iArr[region3.ordinal()];
        if (i6 == 1) {
            str = androidStringManager.get(R.string.profile_street_address_state_hint_au);
        } else if (i6 == 2) {
            str = androidStringManager.get(R.string.profile_street_address_state_hint_ca);
        } else if (i6 == 3) {
            str = null;
        } else if (i6 == 4) {
            str = androidStringManager.get(R.string.profile_street_address_state_hint_us);
        } else {
            if (i6 != 5) {
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) region3, "Unexpected region ");
                throw null;
            }
            str = androidStringManager.get(R.string.profile_street_address_state_hint_ie);
        }
        Region region4 = ((BlockersScreens.StreetAddressScreen) this.flowStarter).blockersData.region;
        int i7 = iArr[region4.ordinal()];
        if (i7 == 1) {
            i = R.string.profile_street_address_zip_hint_au;
        } else if (i7 == 2) {
            i = R.string.profile_street_address_zip_hint_ca;
        } else if (i7 == 3) {
            i = R.string.profile_street_address_zip_hint_gb;
        } else if (i7 == 4) {
            i = R.string.profile_street_address_zip_hint_us;
        } else {
            if (i7 != 5) {
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) region4, "Unexpected region ");
                throw null;
            }
            i = R.string.profile_street_address_zip_hint_ie;
        }
        String str5 = androidStringManager.get(i);
        GlobalAddress globalAddress = (GlobalAddress) ((BlockersScreens.StreetAddressScreen) this.flowStarter).address.getValue();
        Country country = Regions.toCountry(((BlockersScreens.StreetAddressScreen) this.flowStarter).blockersData.region);
        boolean z = ((BlockersScreens.StreetAddressScreen) this.flowStarter).helpItems != null ? !r4.isEmpty() : false;
        BlockersScreens.StreetAddressScreen streetAddressScreen4 = (BlockersScreens.StreetAddressScreen) this.flowStarter;
        SetAddressViewModel setAddressViewModel = new SetAddressViewModel(str2, str3, str4, mode, str, str5, globalAddress, country, z, false, streetAddressScreen4.blockersData.accentColor, streetAddressScreen4.canExit, streetAddressScreen4.autofill);
        this.deviceLockAnimationBus = setAddressViewModel;
        this.ioDispatcher = FlowKt.MutableStateFlow(setAddressViewModel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ea, code lost:
    
        if (r19.setAddressFailure((app.cash.api.ApiResult.Failure) r1, r3, r7) == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$createShippingAddress(CardLockPresenter cardLockPresenter, GlobalAddress globalAddress, BlockersScreens.StreetAddressScreen.SetStreetAddressType.CreateShippingAddressWithStreetAddress createShippingAddressWithStreetAddress, ContinuationImpl continuationImpl) {
        SetAddressPresenter$createShippingAddress$1 setAddressPresenter$createShippingAddress$1;
        Object obj;
        Object obj2;
        int i;
        GlobalAddress globalAddress2;
        BlockersScreens.StreetAddressScreen.SetStreetAddressType.CreateShippingAddressWithStreetAddress createShippingAddressWithStreetAddress2;
        BlockersData blockersData;
        ApiResult apiResult;
        if (continuationImpl instanceof SetAddressPresenter$createShippingAddress$1) {
            setAddressPresenter$createShippingAddress$1 = (SetAddressPresenter$createShippingAddress$1) continuationImpl;
            int i2 = setAddressPresenter$createShippingAddress$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setAddressPresenter$createShippingAddress$1.label = i2 - PKIFailureInfo.systemUnavail;
                SetAddressPresenter$createShippingAddress$1 setAddressPresenter$createShippingAddress$12 = setAddressPresenter$createShippingAddress$1;
                obj = setAddressPresenter$createShippingAddress$12.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setAddressPresenter$createShippingAddress$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) cardLockPresenter.ioDispatcher;
                    SetAddressViewModel copy$default = SetAddressViewModel.copy$default((SetAddressViewModel) stateFlowImpl.getValue(), true);
                    setAddressPresenter$createShippingAddress$12.L$0 = globalAddress;
                    setAddressPresenter$createShippingAddress$12.L$1 = createShippingAddressWithStreetAddress;
                    setAddressPresenter$createShippingAddress$12.label = 1;
                    stateFlowImpl.updateState(null, copy$default);
                    if (Unit.INSTANCE != obj2) {
                        globalAddress2 = globalAddress;
                        createShippingAddressWithStreetAddress2 = createShippingAddressWithStreetAddress;
                    }
                    return obj2;
                }
                if (i == 1) {
                    createShippingAddressWithStreetAddress2 = setAddressPresenter$createShippingAddress$12.L$1;
                    GlobalAddress globalAddress3 = setAddressPresenter$createShippingAddress$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                    globalAddress2 = globalAddress3;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData = setAddressPresenter$createShippingAddress$12.L$2;
                    SafeTrace.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        cardLockPresenter.navigator.goTo(((BlockersDataNavigator) cardLockPresenter.cashAppTagManager).getNext((BlockersScreens.StreetAddressScreen) cardLockPresenter.flowStarter, blockersData));
                        return Unit.INSTANCE;
                    }
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    setAddressPresenter$createShippingAddress$12.L$0 = null;
                    setAddressPresenter$createShippingAddress$12.L$1 = null;
                    setAddressPresenter$createShippingAddress$12.L$2 = null;
                    setAddressPresenter$createShippingAddress$12.label = 3;
                }
                BlockersData blockersData2 = ((BlockersScreens.StreetAddressScreen) cardLockPresenter.flowStarter).blockersData;
                String uuid = UUID.randomUUID().toString();
                String str = createShippingAddressWithStreetAddress2.profileId;
                Action.Type.Companion companion = ShippingAddressSource.Companion;
                String str2 = "";
                CreateShippingAddressRequest createShippingAddressRequest = new CreateShippingAddressRequest(uuid, new CreateShippingAddressRequest.ShippingAddress(str, new FullName(str2, str2), globalAddress2, null, null, 484));
                Analytics analytics = (Analytics) cardLockPresenter.analytics;
                AndroidStringManager androidStringManager = (AndroidStringManager) cardLockPresenter.stringManager;
                PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(cardLockPresenter, createShippingAddressRequest, continuation, 25);
                setAddressPresenter$createShippingAddress$12.L$0 = null;
                setAddressPresenter$createShippingAddress$12.L$1 = null;
                setAddressPresenter$createShippingAddress$12.L$2 = blockersData2;
                setAddressPresenter$createShippingAddress$12.label = 2;
                obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData2, analytics, androidStringManager, setAddressPresenter$createShippingAddress$12, null, pagingDataPresenter$collectFrom$2);
                if (obj != obj2) {
                    blockersData = blockersData2;
                    apiResult = (ApiResult) obj;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
                return obj2;
            }
        }
        setAddressPresenter$createShippingAddress$1 = new SetAddressPresenter$createShippingAddress$1(cardLockPresenter, continuationImpl);
        SetAddressPresenter$createShippingAddress$1 setAddressPresenter$createShippingAddress$122 = setAddressPresenter$createShippingAddress$1;
        obj = setAddressPresenter$createShippingAddress$122.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setAddressPresenter$createShippingAddress$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        BlockersData blockersData22 = ((BlockersScreens.StreetAddressScreen) cardLockPresenter.flowStarter).blockersData;
        String uuid2 = UUID.randomUUID().toString();
        String str3 = createShippingAddressWithStreetAddress2.profileId;
        Action.Type.Companion companion2 = ShippingAddressSource.Companion;
        String str22 = "";
        CreateShippingAddressRequest createShippingAddressRequest2 = new CreateShippingAddressRequest(uuid2, new CreateShippingAddressRequest.ShippingAddress(str3, new FullName(str22, str22), globalAddress2, null, null, 484));
        Analytics analytics2 = (Analytics) cardLockPresenter.analytics;
        AndroidStringManager androidStringManager2 = (AndroidStringManager) cardLockPresenter.stringManager;
        PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$22 = new PagingDataPresenter$collectFrom$2(cardLockPresenter, createShippingAddressRequest2, continuation2, 25);
        setAddressPresenter$createShippingAddress$122.L$0 = null;
        setAddressPresenter$createShippingAddress$122.L$1 = null;
        setAddressPresenter$createShippingAddress$122.L$2 = blockersData22;
        setAddressPresenter$createShippingAddress$122.label = 2;
        obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData22, analytics2, androidStringManager2, setAddressPresenter$createShippingAddress$122, null, pagingDataPresenter$collectFrom$22);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$createShippingAddressWithName(CardLockPresenter cardLockPresenter, String str, BlockersScreens.SetNameScreen.SetNameType.CreateShippingAddressWithName createShippingAddressWithName, ContinuationImpl continuationImpl) {
        SetNamePresenter$createShippingAddressWithName$1 setNamePresenter$createShippingAddressWithName$1;
        int i;
        CardLockPresenter cardLockPresenter2;
        ApiResult apiResult;
        List list;
        if (continuationImpl instanceof SetNamePresenter$createShippingAddressWithName$1) {
            setNamePresenter$createShippingAddressWithName$1 = (SetNamePresenter$createShippingAddressWithName$1) continuationImpl;
            int i2 = setNamePresenter$createShippingAddressWithName$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setNamePresenter$createShippingAddressWithName$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = setNamePresenter$createShippingAddressWithName$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setNamePresenter$createShippingAddressWithName$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Signal signal = (Signal) cardLockPresenter.flowNavigationHelper;
                    cardLockPresenter2 = cardLockPresenter;
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(cardLockPresenter2, str, createShippingAddressWithName, null, 12);
                    setNamePresenter$createShippingAddressWithName$1.label = 1;
                    obj = StateFlowKt.until(signal, sessionWorker$doWork$2$2, setNamePresenter$createShippingAddressWithName$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    cardLockPresenter2 = cardLockPresenter;
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    boolean z = apiResult instanceof ApiResult.Failure;
                    SetNamePresenter$SubmitNameResult.NotSuccessful notSuccessful = SetNamePresenter$SubmitNameResult.NotSuccessful.INSTANCE;
                    if (z) {
                        cardLockPresenter2.submitShippingAddressNameFailure((ApiResult.Failure) apiResult);
                    }
                    return notSuccessful;
                }
                ResponseMetadata responseMetadata = ((CreateShippingAddressResponse) ((ApiResult.Success) apiResult).response).metadata;
                if (responseMetadata == null || (list = responseMetadata.errors) == null) {
                    list = EmptyList.INSTANCE;
                }
                return cardLockPresenter2.submitShippingAddressNameSuccess(list);
            }
        }
        setNamePresenter$createShippingAddressWithName$1 = new SetNamePresenter$createShippingAddressWithName$1(cardLockPresenter, continuationImpl);
        Object obj2 = setNamePresenter$createShippingAddressWithName$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setNamePresenter$createShippingAddressWithName$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getPromotionsHomeDataOrNull(CardLockPresenter cardLockPresenter, ContinuationImpl continuationImpl) {
        PromotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1 promotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1;
        int i;
        ApiResult apiResult;
        PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.ActivePromotionsSectionViewModel activePromotionsSectionViewModel;
        if (continuationImpl instanceof PromotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1) {
            promotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1 = (PromotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1) continuationImpl;
            int i2 = promotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                promotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = promotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1.label;
                PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.AvailablePromotionsSectionViewModel availablePromotionsSectionViewModel = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    IncentivesClientService incentivesClientService = (IncentivesClientService) cardLockPresenter.franklinAppService;
                    GetPromotionsHomeDataRequest getPromotionsHomeDataRequest = new GetPromotionsHomeDataRequest(ByteString.EMPTY);
                    promotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1.label = 1;
                    obj = incentivesClientService.getPromotionsHomeData(getPromotionsHomeDataRequest, promotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1);
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
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                GetPromotionsHomeDataResponse getPromotionsHomeDataResponse = (GetPromotionsHomeDataResponse) ((ApiResult.Success) apiResult).response;
                getPromotionsHomeDataResponse.getClass();
                PromotionsHomeData promotionsHomeData = getPromotionsHomeDataResponse.promotions_home_data;
                if (promotionsHomeData == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("promotion home data was null");
                    return null;
                }
                List list = promotionsHomeData.active_promotions;
                List list2 = promotionsHomeData.available_promotions;
                if (list.isEmpty()) {
                    activePromotionsSectionViewModel = null;
                } else {
                    String str = promotionsHomeData.active_promotions_section_title;
                    List<ActivePromotion> list3 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    for (ActivePromotion activePromotion : list3) {
                        String str2 = activePromotion.title;
                        if (str2 == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("active promotion title was null");
                            return null;
                        }
                        String str3 = activePromotion.subtitle;
                        Icon icon = activePromotion.icon;
                        String str4 = icon != null ? icon.arcade_id : null;
                        if (str4 == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("active promotion arcade_id was null");
                            return null;
                        }
                        String str5 = activePromotion.action_url;
                        if (str5 == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("active promotion action_url was null");
                            return null;
                        }
                        arrayList.add(new PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.ActivePromotionsSectionViewModel.ActivePromotionViewModel(str4, str2, str3, str5, new PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.PromotionCampaignTokens(activePromotion.campaign_token, activePromotion.campaign_variant_token)));
                    }
                    activePromotionsSectionViewModel = new PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.ActivePromotionsSectionViewModel(str, Tags.toPersistentList(arrayList));
                }
                if (!list2.isEmpty()) {
                    String str6 = promotionsHomeData.available_promotions_section_title;
                    List<AvailablePromotion> list4 = list2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    for (AvailablePromotion availablePromotion : list4) {
                        String str7 = availablePromotion.title;
                        if (str7 == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("available promotion title was null");
                            return null;
                        }
                        String str8 = availablePromotion.subtitle;
                        String str9 = availablePromotion.call_to_action_text;
                        if (str9 == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("available promotion call_to_action_text was null");
                            return null;
                        }
                        String str10 = availablePromotion.action_url;
                        if (str10 == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("available promotion action_url was null");
                            return null;
                        }
                        Image image = availablePromotion.image;
                        if (image == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("available promotion image was null");
                            return null;
                        }
                        String str11 = image.light_url;
                        if (str11 == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("available promotion light_url was null");
                            return null;
                        }
                        String str12 = image.dark_url;
                        arrayList2.add(new PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.AvailablePromotionsSectionViewModel.AvailablePromotionViewModel(str7, str8, str9, str10, new PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.RemoteImage(str12 != null ? new PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.RemoteImage.ImageUrl(str11, str12) : new PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.RemoteImage.ImageUrl(str11, str11)), new PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.PromotionCampaignTokens(availablePromotion.campaign_token, availablePromotion.campaign_variant_token)));
                    }
                    availablePromotionsSectionViewModel = new PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.AvailablePromotionsSectionViewModel(str6, Tags.toPersistentList(arrayList2));
                }
                return new PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel(activePromotionsSectionViewModel, availablePromotionsSectionViewModel);
            }
        }
        promotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1 = new PromotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1(cardLockPresenter, continuationImpl);
        Object obj2 = promotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsReferralsHomePresenter$getPromotionsHomeDataOrNull$1.label;
        PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.AvailablePromotionsSectionViewModel availablePromotionsSectionViewModel2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    public static final void access$handleClockOutConfirm(CardLockPresenter cardLockPresenter, ClockInEssentials clockInEssentials, SellerCardViewModel sellerCardViewModel, Money money, CoroutineScope coroutineScope, Function1 function1, Function0 function0) {
        ClockInEssentials.ClockedInEssentials clockedInEssentials = clockInEssentials instanceof ClockInEssentials.ClockedInEssentials ? (ClockInEssentials.ClockedInEssentials) clockInEssentials : null;
        if (clockedInEssentials == null) {
            function0.invoke();
            return;
        }
        String str = clockedInEssentials.timecard.token;
        if (str == null) {
            function0.invoke();
        } else {
            launchWithErrorHandling(coroutineScope, "Failed to clock out", function0, new UseCaseCameraRequestControlImpl$update3aRegions$1$1(cardLockPresenter, str, money, clockedInEssentials.basicInfo.merchantIdentifier.token, function1, sellerCardViewModel, clockedInEssentials, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$launchAccountRecovery(CardLockPresenter cardLockPresenter, ContinuationImpl continuationImpl) {
        AliasPickerPresenter$launchAccountRecovery$1 aliasPickerPresenter$launchAccountRecovery$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str;
        ClientScenario clientScenario;
        ReturningCustomerLoginFlowService returningCustomerLoginFlowService;
        BlockersData blockersData;
        RequestContext requestContext;
        String str2;
        BlockersData blockersData2;
        ApiResult apiResult;
        Screen failureMessageBlockerScreen;
        AndroidStringManager androidStringManager = (AndroidStringManager) cardLockPresenter.stringManager;
        OnboardingAliasPickerScreen onboardingAliasPickerScreen = (OnboardingAliasPickerScreen) cardLockPresenter.ioDispatcher;
        if (continuationImpl instanceof AliasPickerPresenter$launchAccountRecovery$1) {
            aliasPickerPresenter$launchAccountRecovery$1 = (AliasPickerPresenter$launchAccountRecovery$1) continuationImpl;
            int i2 = aliasPickerPresenter$launchAccountRecovery$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                aliasPickerPresenter$launchAccountRecovery$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = aliasPickerPresenter$launchAccountRecovery$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aliasPickerPresenter$launchAccountRecovery$1.label;
                String str3 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowStarter flowStarter = (FlowStarter) cardLockPresenter.flowStarter;
                    BlockersData.Flow flow = BlockersData.Flow.ONBOARDING;
                    ClientScenario clientScenario2 = ClientScenario.RECOVER_ALIAS_ACCOUNT;
                    BlockersData startFlow$default = FlowStarter.startFlow$default(flowStarter, flow, (OnboardingAliasPickerScreen) cardLockPresenter.ioDispatcher, null, clientScenario2, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO);
                    str = startFlow$default.flowToken;
                    clientScenario = startFlow$default.clientScenario;
                    ((Analytics) cardLockPresenter.analytics).track(new AccountRecoveryStart(clientScenario != null ? clientScenario.name() : null, AccountRecoveryStart.Entrypoint.ALIAS_PICKER, str), null);
                    returningCustomerLoginFlowService = (ReturningCustomerLoginFlowService) cardLockPresenter.args;
                    if (clientScenario == null) {
                        clientScenario = clientScenario2;
                    }
                    RequestContext requestContext2 = new RequestContext(null, null, null, null, null, null, null, null, 8191);
                    String str4 = onboardingAliasPickerScreen.account.account_id;
                    RealBackupService realBackupService = (RealBackupService) cardLockPresenter.cardLockFlowTypeProvider;
                    aliasPickerPresenter$launchAccountRecovery$1.L$0 = startFlow$default;
                    aliasPickerPresenter$launchAccountRecovery$1.L$1 = requestContext2;
                    aliasPickerPresenter$launchAccountRecovery$1.L$2 = str4;
                    aliasPickerPresenter$launchAccountRecovery$1.L$3 = returningCustomerLoginFlowService;
                    aliasPickerPresenter$launchAccountRecovery$1.L$4 = clientScenario;
                    aliasPickerPresenter$launchAccountRecovery$1.L$5 = str;
                    aliasPickerPresenter$launchAccountRecovery$1.label = 1;
                    Object readBackupTag = realBackupService.readBackupTag(aliasPickerPresenter$launchAccountRecovery$1);
                    if (readBackupTag != coroutineSingletons) {
                        blockersData = startFlow$default;
                        obj = readBackupTag;
                        requestContext = requestContext2;
                        str2 = str4;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData2 = aliasPickerPresenter$launchAccountRecovery$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    int i3 = 4;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        ResponseContext responseContext = ((StartAccountRecoveryResponse) ((ApiResult.Success) apiResult).response).response_context;
                        if (responseContext == null) {
                            ((ErrorReporter) cardLockPresenter.flowNavigationHelper).report(new AccountPickerProtoParsingError("StartAccountRecoveryResponse", ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING, "response_context", null, "AccountPicker"), (SampleStrategy) cardLockPresenter.deviceLockAnimationBus);
                            failureMessageBlockerScreen = new FailureMessageBlockerScreen(blockersData2, TextUtilsCompat.errorMessaging(androidStringManager, new ApiResult.Failure.NetworkFailure(new Exception("Malformed response")), null).message, str3, i3);
                        } else {
                            ((BooleanPreference) cardLockPresenter.franklinAppService).set(true);
                            BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) cardLockPresenter.cashAppTagManager;
                            Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                            failureMessageBlockerScreen = blockersDataNavigator.getNext(onboardingAliasPickerScreen, blockersData2.updateFromResponseContext(responseContext, false));
                        }
                    } else {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        failureMessageBlockerScreen = new FailureMessageBlockerScreen(blockersData2, TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null).message, str3, i3);
                    }
                    cardLockPresenter.navigator.goTo(failureMessageBlockerScreen);
                    return Unit.INSTANCE;
                }
                str = aliasPickerPresenter$launchAccountRecovery$1.L$5;
                clientScenario = aliasPickerPresenter$launchAccountRecovery$1.L$4;
                returningCustomerLoginFlowService = aliasPickerPresenter$launchAccountRecovery$1.L$3;
                str2 = aliasPickerPresenter$launchAccountRecovery$1.L$2;
                requestContext = aliasPickerPresenter$launchAccountRecovery$1.L$1;
                blockersData = aliasPickerPresenter$launchAccountRecovery$1.L$0;
                SafeTrace.throwOnFailure(obj);
                StartAccountRecoveryRequest startAccountRecoveryRequest = new StartAccountRecoveryRequest(requestContext, (String) obj, str2, ByteString.EMPTY);
                aliasPickerPresenter$launchAccountRecovery$1.L$0 = blockersData;
                aliasPickerPresenter$launchAccountRecovery$1.L$1 = null;
                aliasPickerPresenter$launchAccountRecovery$1.L$2 = null;
                aliasPickerPresenter$launchAccountRecovery$1.L$3 = null;
                aliasPickerPresenter$launchAccountRecovery$1.L$4 = null;
                aliasPickerPresenter$launchAccountRecovery$1.L$5 = null;
                aliasPickerPresenter$launchAccountRecovery$1.label = 2;
                obj = returningCustomerLoginFlowService.startAccountRecovery(clientScenario, str, startAccountRecoveryRequest, aliasPickerPresenter$launchAccountRecovery$1);
                if (obj != coroutineSingletons) {
                    blockersData2 = blockersData;
                    apiResult = (ApiResult) obj;
                    int i32 = 4;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                    cardLockPresenter.navigator.goTo(failureMessageBlockerScreen);
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
        }
        aliasPickerPresenter$launchAccountRecovery$1 = new AliasPickerPresenter$launchAccountRecovery$1(cardLockPresenter, continuationImpl);
        obj = aliasPickerPresenter$launchAccountRecovery$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aliasPickerPresenter$launchAccountRecovery$1.label;
        String str32 = null;
        if (i != 0) {
        }
        StartAccountRecoveryRequest startAccountRecoveryRequest2 = new StartAccountRecoveryRequest(requestContext, (String) obj, str2, ByteString.EMPTY);
        aliasPickerPresenter$launchAccountRecovery$1.L$0 = blockersData;
        aliasPickerPresenter$launchAccountRecovery$1.L$1 = null;
        aliasPickerPresenter$launchAccountRecovery$1.L$2 = null;
        aliasPickerPresenter$launchAccountRecovery$1.L$3 = null;
        aliasPickerPresenter$launchAccountRecovery$1.L$4 = null;
        aliasPickerPresenter$launchAccountRecovery$1.L$5 = null;
        aliasPickerPresenter$launchAccountRecovery$1.label = 2;
        obj = returningCustomerLoginFlowService.startAccountRecovery(clientScenario, str, startAccountRecoveryRequest2, aliasPickerPresenter$launchAccountRecovery$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public static final void access$models$throttledVibrate(CardLockPresenter cardLockPresenter, ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState, MutableState mutableState) {
        long millis = ((AndroidClock) cardLockPresenter.flowStarter).millis();
        if (millis - parcelableSnapshotMutableLongState.getLongValue() >= 1000) {
            parcelableSnapshotMutableLongState.setLongValue(millis);
            mutableState.setValue(VersionedKt.update((Versioned) mutableState.getValue(), Boolean.TRUE));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$refreshHome(CardLockPresenter cardLockPresenter, ContinuationImpl continuationImpl) {
        SpendingInsightsHomePresenter$refreshHome$1 spendingInsightsHomePresenter$refreshHome$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof SpendingInsightsHomePresenter$refreshHome$1) {
            spendingInsightsHomePresenter$refreshHome$1 = (SpendingInsightsHomePresenter$refreshHome$1) continuationImpl;
            int i2 = spendingInsightsHomePresenter$refreshHome$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                spendingInsightsHomePresenter$refreshHome$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = spendingInsightsHomePresenter$refreshHome$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = spendingInsightsHomePresenter$refreshHome$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RefreshCardSpendingInsightsHomeRequest refreshCardSpendingInsightsHomeRequest = new RefreshCardSpendingInsightsHomeRequest(new RequestContext(null, null, null, null, null, null, null, null, 8191), ByteString.EMPTY);
                    SpendingInsightsAppService spendingInsightsAppService = (SpendingInsightsAppService) cardLockPresenter.cardLockFlowTypeProvider;
                    spendingInsightsHomePresenter$refreshHome$1.label = 1;
                    obj = spendingInsightsAppService.refreshCardSpendingInsightsHome(refreshCardSpendingInsightsHomeRequest, spendingInsightsHomePresenter$refreshHome$1);
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
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    Timber.Forest.w("Failed to refresh Spending Insights Home: " + TextUtilsCompat.errorMessaging((AndroidStringManager) cardLockPresenter.stringManager, (ApiResult.Failure) apiResult, null), new Object[0]);
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Timber.Forest.d("Successfully refreshed Spending Insights Home", new Object[0]);
                }
                return Unit.INSTANCE;
            }
        }
        spendingInsightsHomePresenter$refreshHome$1 = new SpendingInsightsHomePresenter$refreshHome$1(cardLockPresenter, continuationImpl);
        Object obj2 = spendingInsightsHomePresenter$refreshHome$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = spendingInsightsHomePresenter$refreshHome$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$registerOnNext(CardLockPresenter cardLockPresenter, String str, ValidatedAliasPicker validatedAliasPicker, ContinuationImpl continuationImpl) {
        AliasPickerPresenter$registerOnNext$1 aliasPickerPresenter$registerOnNext$1;
        int i;
        if (continuationImpl instanceof AliasPickerPresenter$registerOnNext$1) {
            aliasPickerPresenter$registerOnNext$1 = (AliasPickerPresenter$registerOnNext$1) continuationImpl;
            int i2 = aliasPickerPresenter$registerOnNext$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                aliasPickerPresenter$registerOnNext$1.label = i2 - PKIFailureInfo.systemUnavail;
                AliasPickerPresenter$registerOnNext$1 aliasPickerPresenter$registerOnNext$12 = aliasPickerPresenter$registerOnNext$1;
                Object obj = aliasPickerPresenter$registerOnNext$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aliasPickerPresenter$registerOnNext$12.label;
                Object obj2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Iterator it = validatedAliasPicker.aliases.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((ValidatedPickableAlias) next).canonicalText.equals(str)) {
                            obj2 = next;
                            break;
                        }
                    }
                    ValidatedPickableAlias validatedPickableAlias = (ValidatedPickableAlias) obj2;
                    if (validatedPickableAlias == null) {
                        cardLockPresenter.navigateToFailureScreen();
                        return Unit.INSTANCE;
                    }
                    UiAlias uiAlias = validatedPickableAlias.proto;
                    RealSelectedAliasRegistrar realSelectedAliasRegistrar = (RealSelectedAliasRegistrar) cardLockPresenter.issuedCardManager;
                    String str2 = validatedAliasPicker.accountId;
                    OnboardingAliasPickerScreen onboardingAliasPickerScreen = (OnboardingAliasPickerScreen) cardLockPresenter.ioDispatcher;
                    ClientScenario clientScenario = onboardingAliasPickerScreen.clientScenario;
                    aliasPickerPresenter$registerOnNext$12.label = 1;
                    obj = realSelectedAliasRegistrar.registerSelectedAlias(uiAlias, str2, clientScenario, onboardingAliasPickerScreen, aliasPickerPresenter$registerOnNext$12);
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
                cardLockPresenter.navigator.goTo((Screen) obj);
                return Unit.INSTANCE;
            }
        }
        aliasPickerPresenter$registerOnNext$1 = new AliasPickerPresenter$registerOnNext$1(cardLockPresenter, continuationImpl);
        AliasPickerPresenter$registerOnNext$1 aliasPickerPresenter$registerOnNext$122 = aliasPickerPresenter$registerOnNext$1;
        Object obj3 = aliasPickerPresenter$registerOnNext$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aliasPickerPresenter$registerOnNext$122.label;
        Object obj22 = null;
        if (i != 0) {
        }
        cardLockPresenter.navigator.goTo((Screen) obj3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
    
        if (r21.setAddressSuccess(r0, r3, r7) == r10) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00da, code lost:
    
        if (r21.setAddressFailure((app.cash.api.ApiResult.Failure) r0, r3, r7) == r10) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$setAddress(CardLockPresenter cardLockPresenter, GlobalAddress globalAddress, boolean z, ContinuationImpl continuationImpl) {
        SetAddressPresenter$setAddress$1 setAddressPresenter$setAddress$1;
        int i;
        BlockersData blockersData;
        BlockersData blockersData2;
        boolean z2;
        ApiResult apiResult;
        if (continuationImpl instanceof SetAddressPresenter$setAddress$1) {
            setAddressPresenter$setAddress$1 = (SetAddressPresenter$setAddress$1) continuationImpl;
            int i2 = setAddressPresenter$setAddress$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setAddressPresenter$setAddress$1.label = i2 - PKIFailureInfo.systemUnavail;
                SetAddressPresenter$setAddress$1 setAddressPresenter$setAddress$12 = setAddressPresenter$setAddress$1;
                Object obj = setAddressPresenter$setAddress$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setAddressPresenter$setAddress$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) cardLockPresenter.ioDispatcher;
                    StateFlowKt.emitOrThrow(stateFlowImpl, SetAddressViewModel.copy$default((SetAddressViewModel) stateFlowImpl.getValue(), true));
                    BlockersData blockersData3 = ((BlockersScreens.StreetAddressScreen) cardLockPresenter.flowStarter).blockersData;
                    RequestContext requestContext = blockersData3.requestContext;
                    SetAddressRequest setAddressRequest = new SetAddressRequest(requestContext, globalAddress, requestContext.payment_tokens, requestContext.transfer_token, Boolean.valueOf(z), ByteString.EMPTY);
                    Analytics analytics = (Analytics) cardLockPresenter.analytics;
                    AndroidStringManager androidStringManager = (AndroidStringManager) cardLockPresenter.stringManager;
                    BadgeQueries$$ExternalSyntheticLambda5 badgeQueries$$ExternalSyntheticLambda5 = new BadgeQueries$$ExternalSyntheticLambda5(cardLockPresenter, 23);
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(cardLockPresenter, blockersData3, setAddressRequest, continuation, 11);
                    blockersData = null;
                    setAddressPresenter$setAddress$12.L$1 = blockersData3;
                    setAddressPresenter$setAddress$12.Z$0 = z;
                    setAddressPresenter$setAddress$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(16, blockersData3, analytics, androidStringManager, setAddressPresenter$setAddress$12, badgeQueries$$ExternalSyntheticLambda5, sessionWorker$doWork$2$2);
                    if (obj != obj2) {
                        blockersData2 = blockersData3;
                        z2 = z;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = setAddressPresenter$setAddress$12.Z$0;
                blockersData2 = setAddressPresenter$setAddress$12.L$1;
                SafeTrace.throwOnFailure(obj);
                blockersData = null;
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    SetAddressResponse setAddressResponse = (SetAddressResponse) ((ApiResult.Success) apiResult).response;
                    setAddressPresenter$setAddress$12.L$1 = blockersData;
                    setAddressPresenter$setAddress$12.Z$0 = z2;
                    setAddressPresenter$setAddress$12.label = 2;
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    setAddressPresenter$setAddress$12.L$1 = blockersData;
                    setAddressPresenter$setAddress$12.Z$0 = z2;
                    setAddressPresenter$setAddress$12.label = 3;
                }
                return obj2;
            }
        }
        setAddressPresenter$setAddress$1 = new SetAddressPresenter$setAddress$1(cardLockPresenter, continuationImpl);
        SetAddressPresenter$setAddress$1 setAddressPresenter$setAddress$122 = setAddressPresenter$setAddress$1;
        Object obj3 = setAddressPresenter$setAddress$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setAddressPresenter$setAddress$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj3;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return obj22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d3, code lost:
    
        if (r11.setAddressFailure((app.cash.api.ApiResult.Failure) r14, r12, r5) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        if (kotlin.Unit.INSTANCE == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$setShippingAddress(CardLockPresenter cardLockPresenter, GlobalAddress globalAddress, BlockersScreens.StreetAddressScreen.SetStreetAddressType.SetShippingStreetAddress setShippingStreetAddress, ContinuationImpl continuationImpl) {
        SetAddressPresenter$setShippingAddress$1 setAddressPresenter$setShippingAddress$1;
        Object obj;
        Object obj2;
        int i;
        BlockersData blockersData;
        ApiResult apiResult;
        if (continuationImpl instanceof SetAddressPresenter$setShippingAddress$1) {
            setAddressPresenter$setShippingAddress$1 = (SetAddressPresenter$setShippingAddress$1) continuationImpl;
            int i2 = setAddressPresenter$setShippingAddress$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setAddressPresenter$setShippingAddress$1.label = i2 - PKIFailureInfo.systemUnavail;
                SetAddressPresenter$setShippingAddress$1 setAddressPresenter$setShippingAddress$12 = setAddressPresenter$setShippingAddress$1;
                obj = setAddressPresenter$setShippingAddress$12.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setAddressPresenter$setShippingAddress$12.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) cardLockPresenter.ioDispatcher;
                    SetAddressViewModel copy$default = SetAddressViewModel.copy$default((SetAddressViewModel) stateFlowImpl.getValue(), true);
                    setAddressPresenter$setShippingAddress$12.L$0 = globalAddress;
                    setAddressPresenter$setShippingAddress$12.L$1 = setShippingStreetAddress;
                    setAddressPresenter$setShippingAddress$12.label = 1;
                    stateFlowImpl.updateState(null, copy$default);
                } else if (i == 1) {
                    setShippingStreetAddress = setAddressPresenter$setShippingAddress$12.L$1;
                    globalAddress = setAddressPresenter$setShippingAddress$12.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData = setAddressPresenter$setShippingAddress$12.L$2;
                    SafeTrace.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    if (!(apiResult instanceof ApiResult.Success)) {
                        cardLockPresenter.navigator.goTo(((BlockersDataNavigator) cardLockPresenter.cashAppTagManager).getNext((BlockersScreens.StreetAddressScreen) cardLockPresenter.flowStarter, blockersData));
                        return Unit.INSTANCE;
                    }
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    setAddressPresenter$setShippingAddress$12.L$0 = null;
                    setAddressPresenter$setShippingAddress$12.L$1 = null;
                    setAddressPresenter$setShippingAddress$12.L$2 = null;
                    setAddressPresenter$setShippingAddress$12.label = 3;
                }
                BlockersData blockersData2 = ((BlockersScreens.StreetAddressScreen) cardLockPresenter.flowStarter).blockersData;
                String str = setShippingStreetAddress.profileId;
                ShippingAddress shippingAddress = setShippingStreetAddress.shippingAddress;
                String str2 = shippingAddress.id;
                Action.Type.Companion companion = ShippingAddressSource.Companion;
                UpdateShippingAddressRequest updateShippingAddressRequest = new UpdateShippingAddressRequest(str, str2, new UpdateShippingAddressRequest.ShippingAddress(shippingAddress.full_name, globalAddress, shippingAddress.phone, shippingAddress.email));
                Analytics analytics = (Analytics) cardLockPresenter.analytics;
                AndroidStringManager androidStringManager = (AndroidStringManager) cardLockPresenter.stringManager;
                PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(cardLockPresenter, updateShippingAddressRequest, continuation, 26);
                setAddressPresenter$setShippingAddress$12.L$0 = null;
                setAddressPresenter$setShippingAddress$12.L$1 = null;
                setAddressPresenter$setShippingAddress$12.L$2 = blockersData2;
                setAddressPresenter$setShippingAddress$12.label = 2;
                obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData2, analytics, androidStringManager, setAddressPresenter$setShippingAddress$12, null, pagingDataPresenter$collectFrom$2);
                if (obj != obj2) {
                    blockersData = blockersData2;
                    apiResult = (ApiResult) obj;
                    if (!(apiResult instanceof ApiResult.Success)) {
                    }
                }
                return obj2;
            }
        }
        setAddressPresenter$setShippingAddress$1 = new SetAddressPresenter$setShippingAddress$1(cardLockPresenter, continuationImpl);
        SetAddressPresenter$setShippingAddress$1 setAddressPresenter$setShippingAddress$122 = setAddressPresenter$setShippingAddress$1;
        obj = setAddressPresenter$setShippingAddress$122.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setAddressPresenter$setShippingAddress$122.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        BlockersData blockersData22 = ((BlockersScreens.StreetAddressScreen) cardLockPresenter.flowStarter).blockersData;
        String str3 = setShippingStreetAddress.profileId;
        ShippingAddress shippingAddress2 = setShippingStreetAddress.shippingAddress;
        String str22 = shippingAddress2.id;
        Action.Type.Companion companion2 = ShippingAddressSource.Companion;
        UpdateShippingAddressRequest updateShippingAddressRequest2 = new UpdateShippingAddressRequest(str3, str22, new UpdateShippingAddressRequest.ShippingAddress(shippingAddress2.full_name, globalAddress, shippingAddress2.phone, shippingAddress2.email));
        Analytics analytics2 = (Analytics) cardLockPresenter.analytics;
        AndroidStringManager androidStringManager2 = (AndroidStringManager) cardLockPresenter.stringManager;
        PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$22 = new PagingDataPresenter$collectFrom$2(cardLockPresenter, updateShippingAddressRequest2, continuation2, 26);
        setAddressPresenter$setShippingAddress$122.L$0 = null;
        setAddressPresenter$setShippingAddress$122.L$1 = null;
        setAddressPresenter$setShippingAddress$122.L$2 = blockersData22;
        setAddressPresenter$setShippingAddress$122.label = 2;
        obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData22, analytics2, androidStringManager2, setAddressPresenter$setShippingAddress$122, null, pagingDataPresenter$collectFrom$22);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitName(CardLockPresenter cardLockPresenter, String str, ContinuationImpl continuationImpl) {
        SetNamePresenter$submitName$1 setNamePresenter$submitName$1;
        int i;
        boolean z;
        String str2 = str;
        BlockersScreens.SetNameScreen setNameScreen = (BlockersScreens.SetNameScreen) cardLockPresenter.args;
        BlockersData blockersData = setNameScreen.blockersData;
        BetterNavigator.ScreenNavigator screenNavigator = cardLockPresenter.navigator;
        AndroidStringManager androidStringManager = (AndroidStringManager) cardLockPresenter.stringManager;
        if (continuationImpl instanceof SetNamePresenter$submitName$1) {
            setNamePresenter$submitName$1 = (SetNamePresenter$submitName$1) continuationImpl;
            int i2 = setNamePresenter$submitName$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setNamePresenter$submitName$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = setNamePresenter$submitName$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setNamePresenter$submitName$1.label;
                int i3 = 0;
                String str3 = 0;
                str3 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Signal signal = (Signal) cardLockPresenter.flowNavigationHelper;
                    SetNamePresenter$submitName$result$1 setNamePresenter$submitName$result$1 = new SetNamePresenter$submitName$result$1(cardLockPresenter, str2, str3, i3);
                    setNamePresenter$submitName$1.L$0 = str2;
                    setNamePresenter$submitName$1.label = 1;
                    obj = StateFlowKt.until(signal, setNamePresenter$submitName$result$1, setNamePresenter$submitName$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = setNamePresenter$submitName$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                z = apiResult instanceof ApiResult.Success;
                SetNamePresenter$SubmitNameResult.NotSuccessful notSuccessful = SetNamePresenter$SubmitNameResult.NotSuccessful.INSTANCE;
                if (z) {
                    if (apiResult instanceof ApiResult.Failure) {
                        Timber.Forest.e("Failed to send name.", new Object[0]);
                        screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null).message, str3, 4));
                    }
                    return notSuccessful;
                }
                SetFullNameResponse setFullNameResponse = (SetFullNameResponse) ((ApiResult.Success) apiResult).response;
                SetFullNameResponse.Status status = setFullNameResponse.status;
                ResponseContext responseContext = setFullNameResponse.response_context;
                if (status == null) {
                    status = ProtoDefaults.SET_FULL_NAME_STATUS;
                }
                if (SetNamePresenter$WhenMappings.$EnumSwitchMapping$0[status.ordinal()] == 1) {
                    Timber.Forest.d("Successfully sent name.", new Object[0]);
                    ((TimeToLiveSyncState) cardLockPresenter.issuedCardManager).lastAttemptedRefresh = 0L;
                    BlockersData copy$default = BlockersData.copy$default(setNameScreen.blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, new RedactedString(str2), null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -2097153, 65535);
                    responseContext.getClass();
                    screenNavigator.goTo(((BlockersDataNavigator) cardLockPresenter.cardLockFlowTypeProvider).getNext(setNameScreen, copy$default.updateFromResponseContext(responseContext, false)));
                    return SetNamePresenter$SubmitNameResult.Successful.INSTANCE;
                }
                Timber.Forest.e("Failed to set full name. Invalid name.", new Object[0]);
                String str4 = responseContext != null ? responseContext.dialog_message : null;
                if (str4 == null || str4.length() == 0) {
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = androidStringManager.get(R.string.default_set_name_dialog_error_message);
                }
                String str5 = responseContext != null ? responseContext.dialog_title : null;
                if (str5 != null && str5.length() != 0) {
                    str3 = str5;
                }
                if (str3 == 0) {
                    str3 = androidStringManager.get(R.string.default_set_name_dialog_error_title);
                }
                screenNavigator.goTo(new BlockersScreens.Error(blockersData, str4, str3));
                return notSuccessful;
            }
        }
        setNamePresenter$submitName$1 = new SetNamePresenter$submitName$1(cardLockPresenter, continuationImpl);
        Object obj2 = setNamePresenter$submitName$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setNamePresenter$submitName$1.label;
        int i32 = 0;
        String str32 = 0;
        str32 = 0;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        z = apiResult2 instanceof ApiResult.Success;
        SetNamePresenter$SubmitNameResult.NotSuccessful notSuccessful2 = SetNamePresenter$SubmitNameResult.NotSuccessful.INSTANCE;
        if (z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitShippingAddressName(CardLockPresenter cardLockPresenter, String str, BlockersScreens.SetNameScreen.SetNameType.SetShippingAddressName setShippingAddressName, ContinuationImpl continuationImpl) {
        SetNamePresenter$submitShippingAddressName$1 setNamePresenter$submitShippingAddressName$1;
        int i;
        ApiResult apiResult;
        List list;
        if (continuationImpl instanceof SetNamePresenter$submitShippingAddressName$1) {
            setNamePresenter$submitShippingAddressName$1 = (SetNamePresenter$submitShippingAddressName$1) continuationImpl;
            int i2 = setNamePresenter$submitShippingAddressName$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setNamePresenter$submitShippingAddressName$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = setNamePresenter$submitShippingAddressName$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setNamePresenter$submitShippingAddressName$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Signal signal = (Signal) cardLockPresenter.flowNavigationHelper;
                    SetNamePresenter$submitShippingAddressName$result$1 setNamePresenter$submitShippingAddressName$result$1 = new SetNamePresenter$submitShippingAddressName$result$1(cardLockPresenter, str, setShippingAddressName, (Continuation) null);
                    setNamePresenter$submitShippingAddressName$1.label = 1;
                    obj = StateFlowKt.until(signal, setNamePresenter$submitShippingAddressName$result$1, setNamePresenter$submitShippingAddressName$1);
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
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    boolean z = apiResult instanceof ApiResult.Failure;
                    SetNamePresenter$SubmitNameResult.NotSuccessful notSuccessful = SetNamePresenter$SubmitNameResult.NotSuccessful.INSTANCE;
                    if (z) {
                        cardLockPresenter.submitShippingAddressNameFailure((ApiResult.Failure) apiResult);
                    }
                    return notSuccessful;
                }
                ResponseMetadata responseMetadata = ((UpdateShippingAddressResponse) ((ApiResult.Success) apiResult).response).metadata;
                if (responseMetadata == null || (list = responseMetadata.errors) == null) {
                    list = EmptyList.INSTANCE;
                }
                return cardLockPresenter.submitShippingAddressNameSuccess(list);
            }
        }
        setNamePresenter$submitShippingAddressName$1 = new SetNamePresenter$submitShippingAddressName$1(cardLockPresenter, continuationImpl);
        Object obj2 = setNamePresenter$submitShippingAddressName$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setNamePresenter$submitShippingAddressName$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    public static final void access$trackTapPromotionRow(CardLockPresenter cardLockPresenter, PromotionsReferralsHomeViewEvent promotionsReferralsHomeViewEvent) {
        Triple triple;
        if (promotionsReferralsHomeViewEvent instanceof PromotionsReferralsHomeViewEvent.ActivePromotionTapped) {
            PromotionsReferralsHomeViewEvent.ActivePromotionTapped activePromotionTapped = (PromotionsReferralsHomeViewEvent.ActivePromotionTapped) promotionsReferralsHomeViewEvent;
            triple = new Triple(activePromotionTapped.campaignToken, activePromotionTapped.campaignVariantToken, PromotionState.ACTIVE);
        } else {
            if (!(promotionsReferralsHomeViewEvent instanceof PromotionsReferralsHomeViewEvent.AvailablePromotionTapped)) {
                return;
            }
            PromotionsReferralsHomeViewEvent.AvailablePromotionTapped availablePromotionTapped = (PromotionsReferralsHomeViewEvent.AvailablePromotionTapped) promotionsReferralsHomeViewEvent;
            triple = new Triple(availablePromotionTapped.campaignToken, availablePromotionTapped.campaignVariantToken, PromotionState.AVAILABLE);
        }
        ((Analytics) cardLockPresenter.analytics).track(new PromotionsTapPromotionRow((String) triple.first, (String) triple.second, (PromotionState) triple.third), null);
    }

    public static ArrayList distributionUpdated(ArrayList arrayList, int i, long j) {
        List list;
        PaycheckAllocationDistribution.DestinationAndShare destinationAndShare;
        AllocationGroupWithPercentage allocationGroupWithPercentage = (AllocationGroupWithPercentage) arrayList.get(i);
        TimeZone timeZone = UtilsKt.paycheckTimeZone;
        long percentageBps = ((j / 100) * 100) - allocationGroupWithPercentage.getPercentageBps();
        ArrayList updateAllocations = percentageBps > 0 ? updateAllocations(allocationGroupWithPercentage, Math.abs(percentageBps), 10000L, true, new HelpSheetViewKt$$ExternalSyntheticLambda4(9)) : updateAllocations(allocationGroupWithPercentage, Math.abs(percentageBps), 0L, false, new HelpSheetViewKt$$ExternalSyntheticLambda4(10));
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            AllocationDestination allocationDestination = null;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            AllocationGroupWithPercentage allocationGroupWithPercentage2 = (AllocationGroupWithPercentage) obj;
            if (i2 == i) {
                list = updateAllocations;
            } else {
                MultipleAllocationBlocker.Allocation allocation = (MultipleAllocationBlocker.Allocation) CollectionsKt.singleOrNull(allocationGroupWithPercentage2.allocations);
                if (allocation != null && (destinationAndShare = allocation.destination) != null) {
                    allocationDestination = destinationAndShare.destination;
                }
                boolean z = allocationDestination instanceof AllocationDestination.CashBalanceDestination;
                list = allocationGroupWithPercentage2.allocations;
                if (z) {
                    MultipleAllocationBlocker.Allocation allocation2 = (MultipleAllocationBlocker.Allocation) CollectionsKt.single(list);
                    PaycheckAllocationDistribution.DestinationAndShare destinationAndShare2 = allocation2.destination;
                    list = CollectionsKt__CollectionsJVMKt.listOf(MultipleAllocationBlocker.Allocation.copy$default(allocation2, PaycheckAllocationDistribution.DestinationAndShare.copy$default(destinationAndShare2, destinationAndShare2.shareInBasisPoints - percentageBps)));
                }
            }
            CollectionsKt__MutableCollectionsKt.addAll(list, arrayList2);
            i2 = i3;
        }
        return arrayList2;
    }

    public static void launchWithErrorHandling(CoroutineScope coroutineScope, String str, Function0 function0, Function1 function1) {
        JobKt.launch$default(coroutineScope, null, null, new WorkerWorkflow$render$1(function1, str, function0, (Continuation) null, 3), 3);
    }

    private final Object models$com$squareup$cash$moneybot$presenters$MoneybotOverflowMenuPresenter(Flow flow, Composer composer, int i) {
        ViewfinderKt viewfinderKt;
        MoneybotFlagsHelper moneybotFlagsHelper = (MoneybotFlagsHelper) this.issuedCardManager;
        RealUserSessionPager realUserSessionPager = (RealUserSessionPager) this.analytics;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(623672758);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = FlowKt.asStateFlow(realUserSessionPager._sessions);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue4;
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new MusicPresenter$models$1$1(flow, continuation, (MoleculePresenter) this, (State) parcelableSnapshotMutableIntState, 14));
        Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new CashMapPresenter$models$3$1((MoleculePresenter) this, mutableState, continuation, 28);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue5);
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            gapComposer.startReplaceGroup(-1945876042);
            gapComposer.end(false);
            viewfinderKt = RecentChatHistoryViewModel$Error.INSTANCE;
        } else if (((Set) collectAsState.getValue()) == null) {
            gapComposer.startReplaceGroup(-1945873992);
            gapComposer.end(false);
            viewfinderKt = RecentChatHistoryViewModel$Loading.INSTANCE;
        } else {
            Set set = (Set) collectAsState.getValue();
            set.getClass();
            if (set.isEmpty()) {
                gapComposer.startReplaceGroup(-1945871754);
                gapComposer.end(false);
                viewfinderKt = RecentChatHistoryViewModel$Empty.INSTANCE;
            } else {
                gapComposer.startReplaceGroup(-192411889);
                Set set2 = (Set) collectAsState.getValue();
                set2.getClass();
                List<Session> sortedWith = CollectionsKt.sortedWith(set2, new MoneybotChatHistoryPresenter$content$$inlined$sortedByDescending$1(1));
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
                for (Session session : sortedWith) {
                    String str = session.id;
                    arrayList.add(new RecentChatHistoryViewModel$Loaded.Session(str, session.title, new MoneybotOverflowMenuViewEvent.OpenChat(str)));
                }
                boolean booleanValue = ((Boolean) ((ParcelableSnapshotMutableState) this.flowNavigationHelper).getValue()).booleanValue();
                boolean z = realUserSessionPager.hasMoreSessions;
                String str2 = (String) ((ParcelableSnapshotMutableState) this.deviceLockAnimationBus).getValue();
                RecentChatHistoryViewModel$Loaded.Error error = (RecentChatHistoryViewModel$Loaded.Error) ((ParcelableSnapshotMutableState) this.stringManager).getValue();
                boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changedInstance(coroutineScope);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new UtilsKt$$ExternalSyntheticLambda0(2, this, coroutineScope);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                RecentChatHistoryViewModel$Loaded recentChatHistoryViewModel$Loaded = new RecentChatHistoryViewModel$Loaded(arrayList, booleanValue, z, str2, error, (Function0) rememberedValue6);
                gapComposer.end(false);
                viewfinderKt = recentChatHistoryViewModel$Loaded;
            }
        }
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        createListBuilder.add(OverflowMenuItem.NEW_CHAT);
        if (moneybotFlagsHelper.automationsHubEnabled()) {
            createListBuilder.add(OverflowMenuItem.AUTOMATIONS);
        }
        MoneybotOverflowMenuViewModel moneybotOverflowMenuViewModel = new MoneybotOverflowMenuViewModel(CollectionsKt__CollectionsJVMKt.build(createListBuilder), viewfinderKt, moneybotFlagsHelper.showDebugOptions());
        gapComposer.end(false);
        return moneybotOverflowMenuViewModel;
    }

    private final Object models$com$squareup$cash$offers$presenters$OffersDetailsPresenterV2(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        Boolean bool;
        Boolean bool2;
        boolean z;
        OffersDetailsSheetViewModelV2.Loaded.GreenStatusSection greenStatusSection;
        StackedAvatarViewModel.Avatar avatar;
        OffersDetailsSheetViewEventV2 urlClicked;
        String str;
        OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton standard;
        Icons icons;
        String str2;
        FeatureFlagManager featureFlagManager = (FeatureFlagManager) this.cashAppTagManager;
        RealBoostRepository realBoostRepository = (RealBoostRepository) this.args;
        OffersScreen$OffersDetailsScreenV2 offersScreen$OffersDetailsScreenV2 = (OffersScreen$OffersDetailsScreenV2) this.flowNavigationHelper;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        Resources resources = androidStringManager.resources;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-921540992);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(OffersDetailsSheetViewModelV2.Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState3 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            String str3 = offersScreen$OffersDetailsScreenV2.token;
            str3.getClass();
            rememberedValue2 = realBoostRepository.boostProvider.getBoost(str3);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = realBoostRepository.getSelectedBoostTokens();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        EmptySet emptySet = EmptySet.INSTANCE;
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, emptySet, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        int i2 = 1;
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = ((SyncValueReader) this.analytics).getSingleValue(AndroidSyncValueSpecs.CashGreen, new OffersStyledTextKt$$ExternalSyntheticLambda0(i2));
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Continuation continuation = null;
        MutableState collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue4, null, gapComposer, 1);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = ((RealProfileManager) this.cardLockFlowTypeProvider).publicProfile();
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = ((RealOffersInflightStateManager) this.franklinAppService).inflightOffers;
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        boolean contains = ((Set) Updater.collectAsState((Flow) rememberedValue6, emptySet, null, gapComposer, 48, 2).getValue()).contains(offersScreen$OffersDetailsScreenV2.token);
        boolean contains2 = ((Set) collectAsState2.getValue()).contains(offersScreen$OffersDetailsScreenV2.token);
        RewardWithSelection rewardWithSelection = (RewardWithSelection) collectAsState.getValue();
        boolean z2 = rewardWithSelection != null ? rewardWithSelection.is_custom_offer : false;
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = Updater.mutableStateOf$default(OfferDetailsFooterStateV2.BUTTONS);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState4 = (MutableState) rememberedValue7;
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = Updater.mutableStateOf$default(Boolean.TRUE);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState5 = (MutableState) rememberedValue8;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue9 == neverEqualPolicy) {
            mutableState = mutableState4;
            rememberedValue9 = new MusicPresenter$models$3$1(this, continuation, 8);
            gapComposer.updateRememberedValue(rememberedValue9);
        } else {
            mutableState = mutableState4;
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue9);
        MutableState mutableState6 = mutableState;
        boolean z3 = z2;
        Updater.LaunchedEffect(gapComposer, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, this, mutableState5, collectAsState, 24));
        if (contains) {
            mutableState6.setValue(OfferDetailsFooterStateV2.OFFER_UPDATE_IN_FLIGHT);
        }
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == neverEqualPolicy) {
            rememberedValue10 = Recorder$$ExternalSyntheticOutline1.m(contains, gapComposer);
        }
        MutableState mutableState7 = (MutableState) rememberedValue10;
        Boolean valueOf = Boolean.valueOf(contains2);
        Boolean valueOf2 = Boolean.valueOf(contains);
        boolean changed = gapComposer.changed(contains) | gapComposer.changed(contains2) | gapComposer.changedInstance(this);
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (changed || rememberedValue11 == neverEqualPolicy) {
            mutableState2 = mutableState6;
            bool = valueOf;
            bool2 = valueOf2;
            z = contains2;
            RealMessageSigner$sign$2 realMessageSigner$sign$2 = new RealMessageSigner$sign$2(contains, z, this, mutableState7, mutableState2, mutableState5, null);
            gapComposer.updateRememberedValue(realMessageSigner$sign$2);
            rememberedValue11 = realMessageSigner$sign$2;
        } else {
            bool2 = valueOf2;
            mutableState2 = mutableState6;
            z = contains2;
            bool = valueOf;
        }
        Updater.LaunchedEffect(bool, bool2, (Function2) rememberedValue11, gapComposer);
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        long j = ((FeatureFlag$LongFeatureFlag.Value) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$CardBenefitsOffersCountLimit.INSTANCE)).value;
        CashGreenV1 cashGreenV1 = (CashGreenV1) collectAsState3.getValue();
        CashGreenV1.Status status = cashGreenV1 != null ? cashGreenV1.status : null;
        if ((status == null ? -1 : OffersDetailsPresenterV2$WhenMappings.$EnumSwitchMapping$0[status.ordinal()]) == 1) {
            OffersDetailsSheetViewModelV2.Loaded.GreenStatusSection.GreenStatusIcon greenStatusIcon = OffersDetailsSheetViewModelV2.Loaded.GreenStatusSection.GreenStatusIcon.GREEN_RECTANGLE;
            String str4 = androidStringManager.get(R.string.offers_details_green_upsell_PDSA_title);
            Object[] objArr = {Long.valueOf(j)};
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.offers_details_green_upsell_PDSA_subtitle)).format(objArr);
            format2.getClass();
            greenStatusSection = new OffersDetailsSheetViewModelV2.Loaded.GreenStatusSection(greenStatusIcon, str4, format2, androidStringManager.get(R.string.offers_details_green_upsell_PDSA_link), OffersDetailsSheetViewEventV2.OpenBenefitsScreen.INSTANCE);
        } else {
            OffersDetailsSheetViewModelV2.Loaded.GreenStatusSection.GreenStatusIcon greenStatusIcon2 = OffersDetailsSheetViewModelV2.Loaded.GreenStatusSection.GreenStatusIcon.MAGIC;
            String str5 = androidStringManager.get(R.string.offers_details_green_upsell_non_PDSA_title);
            Object[] objArr2 = {Long.valueOf(j)};
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.offers_details_green_upsell_non_PDSA_subtitle)).format(objArr2);
            format3.getClass();
            greenStatusSection = new OffersDetailsSheetViewModelV2.Loaded.GreenStatusSection(greenStatusIcon2, str5, format3, androidStringManager.get(R.string.offers_details_green_upsell_non_PDSA_link), OffersDetailsSheetViewEventV2.OpenGreenStatusUpsell.INSTANCE);
        }
        if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$BankingCashGreenRelease.INSTANCE)).enabled()) {
            greenStatusSection = null;
        }
        RewardWithSelection rewardWithSelection2 = (RewardWithSelection) collectAsState.getValue();
        if (rewardWithSelection2 != null) {
            PublicProfile publicProfile = (PublicProfile) collectAsState4.getValue();
            String str6 = (String) this.ioDispatcher;
            str6.getClass();
            StackedAvatarViewModel.Avatar avatar2 = CanvasUtils.toAvatar(rewardWithSelection2);
            if (publicProfile != null) {
                ColorModel.Accented accented = new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, str6, publicProfile.fullName, null, null)));
                Character monogram = GrpcStatus.Companion.monogram(publicProfile.fullName);
                String str7 = publicProfile.fullName;
                String str8 = publicProfile.photoUrl;
                avatar = new StackedAvatarViewModel.Avatar(accented, monogram, str7, str8 != null ? new Image(str8, str8, 4) : null, null, null, null, null, false, false, null, false, null, null, 131056);
            } else {
                avatar = null;
            }
            StackedAvatarViewModel single = (!z3 || avatar == null) ? new StackedAvatarViewModel.Single(avatar2) : new StackedAvatarViewModel.Duo(avatar2, avatar);
            String str9 = rewardWithSelection2.full_title_text;
            str9.getClass();
            List list = rewardWithSelection2.boost_detail_rows;
            list.getClass();
            List<UiRewardProgramDetails.BoostDetail> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (UiRewardProgramDetails.BoostDetail boostDetail : list2) {
                boostDetail.getClass();
                Icon icon = boostDetail.arcade_icon;
                if (icon != null && (str2 = icon.arcade_id) != null) {
                    Icons.Companion.getClass();
                    icons = zzd.get(str2);
                    if (icons != null) {
                        String str10 = boostDetail.detail_text;
                        str10.getClass();
                        arrayList.add(new OffersDetailsSheetViewModelV2.Loaded.OfferDetailRow(icons, str10));
                    }
                }
                icons = Icons.Pending16;
                String str102 = boostDetail.detail_text;
                str102.getClass();
                arrayList.add(new OffersDetailsSheetViewModelV2.Loaded.OfferDetailRow(icons, str102));
            }
            OffersDetailsSheetViewModelV2.Loaded.GreenStatusSection greenStatusSection2 = z3 ? greenStatusSection : null;
            OfferDetailsFooterStateV2 offerDetailsFooterStateV2 = (OfferDetailsFooterStateV2) mutableState2.getValue();
            String str11 = rewardWithSelection2.token;
            AppLinks appLinks = rewardWithSelection2.app_links;
            AppLinkAndroid appLinkAndroid = appLinks != null ? appLinks.f1410android : null;
            String str12 = appLinkAndroid != null ? appLinkAndroid.app_link_url : null;
            String str13 = appLinkAndroid != null ? appLinkAndroid.app_package : null;
            if (str12 == null || str13 == null) {
                String str14 = rewardWithSelection2.affiliate_link_url;
                urlClicked = str14 != null ? new OffersDetailsSheetViewEventV2.UrlClicked(str14) : null;
            } else {
                urlClicked = new OffersDetailsSheetViewEventV2.AppLinkClicked(str12, str13);
            }
            String str15 = rewardWithSelection2.title;
            int ordinal = offerDetailsFooterStateV2.ordinal();
            if (ordinal == 0) {
                if (str15 != null) {
                    resources.getClass();
                    str = new MessageFormat(resources.getString(R.string.offers_open_merchant_button_label)).format(new Object[]{str15});
                    str.getClass();
                } else {
                    str = androidStringManager.get(R.string.offers_open_merchant_button_generic_label);
                }
                standard = z ? new OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard(new OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard.OfferStandardButton(androidStringManager.get(R.string.offers_remove_offer_button_label), new OffersDetailsSheetViewEventV2.RemoveOffers(str11)), urlClicked != null ? new OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard.OfferStandardButton(str, urlClicked) : null) : new OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard(new OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Standard.OfferStandardButton(androidStringManager.get(R.string.offers_add_offer_button_label), new OffersDetailsSheetViewEventV2.AddOffers(str11)), null);
            } else if (ordinal == 1) {
                standard = OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.Loading.INSTANCE;
            } else if (ordinal == 2) {
                standard = new OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.MessageText(androidStringManager.get(R.string.offer_detail_add_confirmation_title));
            } else {
                if (ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                standard = new OffersDetailsSheetViewModelV2.Loaded.OfferDetailsButton.MessageText(androidStringManager.get(R.string.offer_detail_remove_confirmation_title));
            }
            mutableState3.setValue(new OffersDetailsSheetViewModelV2.Loaded(single, str9, arrayList, greenStatusSection2, standard));
        }
        OffersDetailsSheetViewModelV2 offersDetailsSheetViewModelV2 = (OffersDetailsSheetViewModelV2) mutableState3.getValue();
        gapComposer.end(false);
        return offersDetailsSheetViewModelV2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02e6  */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.reflect.KClass] */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.reflect.KClass] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$onboarding$accountpicker$presenters$AliasPickerPresenter(Flow flow, Composer composer, int i) {
        Object obj;
        String str;
        Throwable th;
        Object obj2;
        Throwable th2;
        String str2;
        List list;
        AliasViewModel.AliasType aliasType;
        ProtoValidationScope protoValidationScope;
        ValidatedPickableAlias validatedPickableAlias;
        Throwable th3;
        Continuation continuation;
        SampleStrategy sampleStrategy = (SampleStrategy) this.deviceLockAnimationBus;
        ErrorReporter errorReporter = (ErrorReporter) this.flowNavigationHelper;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1875288577);
        OnboardingAliasPickerScreen onboardingAliasPickerScreen = (OnboardingAliasPickerScreen) this.ioDispatcher;
        AccountListConfig.Account account = onboardingAliasPickerScreen.account;
        UiAlias uiAlias = account.preferred_alias;
        boolean changed = gapComposer.changed(account);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Throwable th4 = null;
        if (changed || rememberedValue == neverEqualPolicy) {
            AccountListConfig.Account account2 = onboardingAliasPickerScreen.account;
            AccountPickerParsingErrorFactory accountPickerParsingErrorFactory = AccountPickerParsingErrorFactory.INSTANCE;
            try {
                ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(account2, accountPickerParsingErrorFactory, this);
                String str3 = account2.cash_tag;
                List<UiAlias> list2 = account2.aliases;
                String str4 = (String) protoValidationScope2.reportIfNullAndContinue("account.cash_tag", (String) null, str3);
                if (str4 != null && (str = (String) protoValidationScope2.reportIfNullAndContinue("account.account_id", (String) null, account2.account_id)) != null) {
                    ArrayList arrayList = new ArrayList();
                    List list3 = list2;
                    for (UiAlias uiAlias2 : list2) {
                        try {
                            try {
                                str2 = str4;
                            } catch (Exception e) {
                                e = e;
                                th = null;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            th = th4;
                        }
                        try {
                            String str5 = (String) protoValidationScope2.reportIfNullAndContinue("alias.formatted", (String) null, uiAlias2.formatted);
                            if (str5 == null) {
                                validatedPickableAlias = null;
                                th = null;
                                list = list3;
                                str4 = str2;
                                protoValidationScope = protoValidationScope2;
                            } else {
                                List list4 = list3;
                                String str6 = (String) protoValidationScope2.reportIfNullAndContinue("alias.canonical_text", (String) null, uiAlias2.canonical_text);
                                if (str6 == null) {
                                    validatedPickableAlias = null;
                                    list = list4;
                                    str4 = str2;
                                    protoValidationScope = protoValidationScope2;
                                    th = null;
                                } else {
                                    UiAlias.Type type2 = uiAlias2.f1363type;
                                    int i2 = type2 == null ? -1 : ValidatedAccountListKt$WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
                                    if (i2 == 1) {
                                        str4 = str2;
                                        list = list4;
                                        th = null;
                                        aliasType = AliasViewModel.AliasType.EMAIL;
                                    } else if (i2 != 2) {
                                        String str7 = str;
                                        th = null;
                                        list = list4;
                                        errorReporter.report(new AccountPickerProtoParsingError("AccountListConfig.Account.UiAlias", ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, "alias.type", null, "AccountPicker"), sampleStrategy);
                                        str4 = str2;
                                        protoValidationScope = protoValidationScope2;
                                        str = str7;
                                        validatedPickableAlias = null;
                                    } else {
                                        str4 = str2;
                                        list = list4;
                                        th = null;
                                        aliasType = AliasViewModel.AliasType.TEXT;
                                    }
                                    protoValidationScope = protoValidationScope2;
                                    validatedPickableAlias = new ValidatedPickableAlias(str5, str6, aliasType, uiAlias2);
                                }
                            }
                            if (validatedPickableAlias != null) {
                                try {
                                    arrayList.add(validatedPickableAlias);
                                } catch (Exception e3) {
                                    e = e3;
                                    obj = th;
                                    throw RotateKt.toProtoParsingExceptionFor(e, account2 != null ? Reflection.factory.getOrCreateKotlinClass(AccountListConfig.Account.class) : obj, accountPickerParsingErrorFactory, null);
                                }
                            }
                            protoValidationScope2 = protoValidationScope;
                            th4 = th;
                            list3 = list;
                        } catch (Exception e4) {
                            e = e4;
                            th = null;
                            obj = th;
                            throw RotateKt.toProtoParsingExceptionFor(e, account2 != null ? Reflection.factory.getOrCreateKotlinClass(AccountListConfig.Account.class) : obj, accountPickerParsingErrorFactory, null);
                        }
                    }
                    th = th4;
                    List list5 = list3;
                    try {
                        if (arrayList.isEmpty()) {
                            if (list5.isEmpty()) {
                                th2 = th;
                                errorReporter.report(new AccountPickerProtoParsingError("Account", ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING, "aliases", th, "AccountPicker"), sampleStrategy);
                            } else {
                                th2 = th;
                            }
                            rememberedValue = th2;
                            th3 = th2;
                            gapComposer.updateRememberedValue(rememberedValue);
                            continuation = th3;
                        } else {
                            Throwable th5 = th;
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj2 = th5;
                                    break;
                                }
                                obj2 = it.next();
                                String str8 = ((ValidatedPickableAlias) obj2).canonicalText;
                                UiAlias uiAlias3 = account2.preferred_alias;
                                if (str8.equals(uiAlias3 != null ? uiAlias3.canonical_text : th5)) {
                                    break;
                                }
                            }
                            ValidatedPickableAlias validatedPickableAlias2 = (ValidatedPickableAlias) obj2;
                            rememberedValue = new ValidatedAliasPicker(str4, str, validatedPickableAlias2 != null ? validatedPickableAlias2.canonicalText : ((ValidatedPickableAlias) CollectionsKt.first((List) arrayList)).canonicalText, arrayList);
                            th3 = th5;
                            gapComposer.updateRememberedValue(rememberedValue);
                            continuation = th3;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        obj = list3;
                        throw RotateKt.toProtoParsingExceptionFor(e, account2 != null ? Reflection.factory.getOrCreateKotlinClass(AccountListConfig.Account.class) : obj, accountPickerParsingErrorFactory, null);
                    }
                }
                th2 = null;
                rememberedValue = th2;
                th3 = th2;
                gapComposer.updateRememberedValue(rememberedValue);
                continuation = th3;
            } catch (Exception e6) {
                e = e6;
                obj = th4;
            }
        } else {
            continuation = 0;
        }
        ValidatedAliasPicker validatedAliasPicker = (ValidatedAliasPicker) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(continuation);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState2 = (MutableState) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, this, mutableState, mutableState2, 26));
        Boolean bool = (Boolean) mutableState.getValue();
        bool.getClass();
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new OverlayKt$Overlay$1$1$1$1$1(this, mutableState, continuation, 6);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Updater.LaunchedEffect(gapComposer, bool, (Function2) rememberedValue4);
        String str9 = (String) mutableState2.getValue();
        if (str9 == null || validatedAliasPicker == null) {
            gapComposer.startReplaceGroup(-1383879796);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1383927846);
            Updater.LaunchedEffect(str9, validatedAliasPicker, new MusicPresenter$models$1$1(str9, validatedAliasPicker, continuation, this), gapComposer);
            gapComposer.end(false);
        }
        boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changedInstance(account) | gapComposer.changedInstance(uiAlias);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
            RealKeyStoreProvider$setEntry$2 realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2(this, account, uiAlias, continuation, 20);
            gapComposer.updateRememberedValue(realKeyStoreProvider$setEntry$2);
            rememberedValue5 = realKeyStoreProvider$setEntry$2;
        }
        Updater.LaunchedEffect(gapComposer, "account-picker-shown-analytics", (Function2) rememberedValue5);
        if (validatedAliasPicker == null) {
            gapComposer.startReplaceGroup(-2080929982);
            boolean changedInstance3 = gapComposer.changedInstance(this);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new InviteErrorPresenter$models$1$1(this, continuation, 12);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Updater.LaunchedEffect(gapComposer, "alias-picker-malformed-account", (Function2) rememberedValue6);
            AliasPickerViewModel aliasPickerViewModel = new AliasPickerViewModel("", "", EmptyList.INSTANCE, true);
            gapComposer.end(false);
            gapComposer.end(false);
            return aliasPickerViewModel;
        }
        gapComposer.startReplaceGroup(-2080683005);
        gapComposer.end(false);
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        Object[] objArr = {validatedAliasPicker.cashTag};
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.alias_picker_title)).format(objArr);
        format2.getClass();
        ArrayList<ValidatedPickableAlias> arrayList2 = validatedAliasPicker.aliases;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        for (ValidatedPickableAlias validatedPickableAlias3 : arrayList2) {
            arrayList3.add(new AliasViewModel(validatedPickableAlias3.formatted, validatedPickableAlias3.f1175type, validatedPickableAlias3.canonicalText));
        }
        AliasPickerViewModel aliasPickerViewModel2 = new AliasPickerViewModel(format2, validatedAliasPicker.preSelectedAliasId, arrayList3, ((Boolean) mutableState.getValue()).booleanValue() || ((String) mutableState2.getValue()) != null);
        gapComposer.end(false);
        return aliasPickerViewModel2;
    }

    private final Object models$com$squareup$cash$payments$presenters$NearbyPayRequestPresenter(Flow flow, Composer composer, int i) {
        CardLockPresenter cardLockPresenter;
        NearbyPermissionState nearbyPermissionState;
        Object obj;
        Pair pair;
        Pair pair2;
        SnapshotStateList snapshotStateList;
        CardLockPresenter cardLockPresenter2;
        MutableState mutableState;
        int i2;
        MutableState mutableState2;
        boolean z;
        String format2;
        String str;
        List split$default;
        List split$default2;
        Object phonePlansHomePresenter$models$1$1;
        MutableState mutableState3;
        Boolean bool;
        MutableState mutableState4;
        boolean z2;
        String str2;
        NearbyAvatarInfo nearbyAvatarInfo;
        Continuation continuation;
        MutableState mutableState5;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        Resources resources = androidStringManager.resources;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1156799278);
        RealNearbyManager realNearbyManager = (RealNearbyManager) this.args;
        MutableState permissionState = realNearbyManager.permissionState(gapComposer);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            rememberedValue = ((RealProfileManager) this.cardLockFlowTypeProvider).publicProfile();
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj2) {
            rememberedValue2 = Updater.mutableStateOf$default(NearbyPayRequestTab.PAY);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState6 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj2) {
            rememberedValue3 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState7 = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj2) {
            rememberedValue4 = new SnapshotStateList();
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        SnapshotStateList snapshotStateList2 = (SnapshotStateList) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        Continuation continuation2 = null;
        if (rememberedValue5 == obj2) {
            rememberedValue5 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState8 = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == obj2) {
            rememberedValue6 = new ParcelableSnapshotMutableLongState(0L);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = (ParcelableSnapshotMutableLongState) rememberedValue6;
        NearbyPayRequestTab nearbyPayRequestTab = (NearbyPayRequestTab) mutableState6.getValue();
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == obj2) {
            rememberedValue7 = new InviteErrorPresenter$models$1$1(parcelableSnapshotMutableLongState, continuation2, 18);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        Updater.LaunchedEffect(gapComposer, nearbyPayRequestTab, (Function2) rememberedValue7);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj2) {
            rememberedValue8 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState9 = (MutableState) rememberedValue8;
        Object[] objArr = new Object[0];
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (rememberedValue9 == obj2) {
            rememberedValue9 = new MainPaymentViewKt$$ExternalSyntheticLambda0(9);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        Object obj3 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue9, gapComposer, 48);
        Object rememberedValue10 = gapComposer.rememberedValue();
        if (rememberedValue10 == obj2) {
            SliceStatus.Companion companion = NearbyContext.NearbyIntent.Companion;
            rememberedValue10 = new NearbyIdentifier();
            gapComposer.updateRememberedValue(rememberedValue10);
        }
        NearbyIdentifier nearbyIdentifier = (NearbyIdentifier) rememberedValue10;
        Continuation continuation3 = null;
        Updater.LaunchedEffect(gapComposer, flow, new DbSessionManager$updateDb$2(flow, null, this, snapshotStateList2, mutableState9, permissionState, mutableState6, 21));
        if (((NearbyPermissionState) permissionState.getValue()) == null) {
            NearbyPayRequestViewModel.Ready ready = new NearbyPayRequestViewModel.Ready(androidStringManager.get(R.string.nearby_pay_request_title_loading), (NearbyPayRequestTab) mutableState6.getValue(), null, null, null, null, false, false, 0, null, 4076);
            gapComposer.end(false);
            return ready;
        }
        NearbyPermissionState nearbyPermissionState2 = (NearbyPermissionState) permissionState.getValue();
        nearbyPermissionState2.getClass();
        BleDeviceState bleDeviceState = nearbyPermissionState2.bluetoothState;
        Object rememberedValue11 = gapComposer.rememberedValue();
        if (rememberedValue11 == obj2) {
            rememberedValue11 = Updater.mutableStateOf$default(nearbyPermissionState2);
            gapComposer.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState10 = (MutableState) rememberedValue11;
        boolean changedInstance = gapComposer.changedInstance(nearbyPermissionState2) | gapComposer.changedInstance(this);
        Object rememberedValue12 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue12 == obj2) {
            Object realKeyStoreProvider$setEntry$2 = new RealKeyStoreProvider$setEntry$2(nearbyPermissionState2, this, mutableState10, continuation3, 28);
            cardLockPresenter = this;
            nearbyPermissionState = nearbyPermissionState2;
            obj = null;
            gapComposer.updateRememberedValue(realKeyStoreProvider$setEntry$2);
            rememberedValue12 = realKeyStoreProvider$setEntry$2;
        } else {
            nearbyPermissionState = nearbyPermissionState2;
            cardLockPresenter = this;
            obj = null;
        }
        Updater.LaunchedEffect(gapComposer, nearbyPermissionState, (Function2) rememberedValue12);
        boolean changed = gapComposer.changed(nearbyPermissionState);
        Object rememberedValue13 = gapComposer.rememberedValue();
        if (changed || rememberedValue13 == obj2) {
            boolean z3 = nearbyPermissionState.locationPermission.granted;
            boolean z4 = nearbyPermissionState.bluetoothPermission.granted;
            BleDeviceState bleDeviceState2 = BleDeviceState.ENABLED;
            if (bleDeviceState != bleDeviceState2 || !z4 || !z3) {
                if (bleDeviceState == BleDeviceState.UNAVAILABLE) {
                    pair2 = new Pair(obj, obj);
                } else if (z4) {
                    if (!z3) {
                        pair = new Pair(androidStringManager.get(R.string.nearby_permissions_location_button), androidStringManager.get(R.string.nearby_permissions_location_disclaimer));
                    } else {
                        if (bleDeviceState == bleDeviceState2) {
                            a$$ExternalSyntheticBUOutline0.m$1("Unreachable: all !isReady states are covered above");
                            return null;
                        }
                        pair = new Pair(androidStringManager.get(R.string.nearby_permissions_bluetooth_turn_on_button), androidStringManager.get(R.string.nearby_permissions_bluetooth_disabled_disclaimer));
                    }
                    pair2 = pair;
                } else {
                    pair2 = new Pair(androidStringManager.get(R.string.nearby_permissions_bluetooth_permission_button), androidStringManager.get(R.string.nearby_permissions_bluetooth_permission_disclaimer));
                }
                obj = new NearbyPayRequestViewModel.NotReady(16, androidStringManager.get(R.string.nearby_pay_request_title_not_ready), (String) pair2.first, (String) pair2.second, z4 && z3 && bleDeviceState != bleDeviceState2);
            }
            gapComposer.updateRememberedValue(obj);
            rememberedValue13 = obj;
        }
        Object obj4 = (NearbyPayRequestViewModel.NotReady) rememberedValue13;
        if (obj4 != null) {
            gapComposer.startReplaceGroup(615635461);
            boolean changedInstance2 = gapComposer.changedInstance(obj4) | gapComposer.changedInstance(cardLockPresenter);
            Object rememberedValue14 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue14 == obj2) {
                rememberedValue14 = new MainPaymentView$Content$2$1(obj4, cardLockPresenter, null, 12);
                gapComposer.updateRememberedValue(rememberedValue14);
            }
            Updater.LaunchedEffect(gapComposer, obj4, (Function2) rememberedValue14);
            gapComposer.end(false);
            gapComposer.end(false);
            return obj4;
        }
        gapComposer.startReplaceGroup(615953552);
        gapComposer.end(false);
        if (((NearbyPayRequestTab) mutableState6.getValue()) == NearbyPayRequestTab.PAY) {
            gapComposer.startReplaceGroup(616137320);
            Unit unit = Unit.INSTANCE;
            boolean changed2 = gapComposer.changed(obj3) | gapComposer.changedInstance(cardLockPresenter);
            Object rememberedValue15 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue15 == obj2) {
                continuation = null;
                rememberedValue15 = new MainPaymentView$Content$2$1(cardLockPresenter, obj3, continuation, 13);
                gapComposer.updateRememberedValue(rememberedValue15);
            } else {
                continuation = null;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue15);
            SnapshotStateMap discoverNearby$default = zzadq.discoverNearby$default(nearbyIdentifier, realNearbyManager, gapComposer);
            Object rememberedValue16 = gapComposer.rememberedValue();
            if (rememberedValue16 == obj2) {
                rememberedValue16 = new SnapshotStateSet();
                gapComposer.updateRememberedValue(rememberedValue16);
            }
            SnapshotStateSet snapshotStateSet = (SnapshotStateSet) rememberedValue16;
            Object rememberedValue17 = gapComposer.rememberedValue();
            if (rememberedValue17 == obj2) {
                rememberedValue17 = new SnapshotStateMap();
                gapComposer.updateRememberedValue(rememberedValue17);
            }
            SnapshotStateMap snapshotStateMap = (SnapshotStateMap) rememberedValue17;
            Object rememberedValue18 = gapComposer.rememberedValue();
            if (rememberedValue18 == obj2) {
                rememberedValue18 = new SnapshotStateSet();
                gapComposer.updateRememberedValue(rememberedValue18);
            }
            SnapshotStateSet snapshotStateSet2 = (SnapshotStateSet) rememberedValue18;
            Integer valueOf = Integer.valueOf(discoverNearby$default.size());
            boolean changedInstance3 = gapComposer.changedInstance(discoverNearby$default) | gapComposer.changedInstance(cardLockPresenter);
            Object rememberedValue19 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue19 == obj2) {
                snapshotStateList = snapshotStateList2;
                mutableState = mutableState6;
                Object navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(snapshotStateSet, snapshotStateMap, discoverNearby$default, this, snapshotStateSet2, (Continuation) null, 13);
                cardLockPresenter2 = this;
                gapComposer.updateRememberedValue(navHostKt$NavHost$33$1);
                rememberedValue19 = navHostKt$NavHost$33$1;
            } else {
                snapshotStateList = snapshotStateList2;
                cardLockPresenter2 = cardLockPresenter;
                mutableState = mutableState6;
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue19);
            Integer valueOf2 = Integer.valueOf(snapshotStateMap.size());
            boolean changedInstance4 = gapComposer.changedInstance(cardLockPresenter2);
            Object rememberedValue20 = gapComposer.rememberedValue();
            if (changedInstance4 || rememberedValue20 == obj2) {
                CardLockPresenter cardLockPresenter3 = cardLockPresenter2;
                Object moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(snapshotStateMap, mutableState7, cardLockPresenter3, parcelableSnapshotMutableLongState, mutableState8, null, 21);
                cardLockPresenter2 = cardLockPresenter3;
                mutableState5 = mutableState8;
                gapComposer.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
                rememberedValue20 = moleculeKt$immediateClockFlow$1$1$1;
            } else {
                mutableState5 = mutableState8;
            }
            Updater.LaunchedEffect(gapComposer, valueOf2, (Function2) rememberedValue20);
            gapComposer.end(false);
            mutableState2 = mutableState5;
        } else {
            snapshotStateList = snapshotStateList2;
            cardLockPresenter2 = cardLockPresenter;
            mutableState = mutableState6;
            Continuation continuation4 = null;
            gapComposer.startReplaceGroup(620404873);
            Unit unit2 = Unit.INSTANCE;
            boolean changedInstance5 = gapComposer.changedInstance(cardLockPresenter2);
            Object rememberedValue21 = gapComposer.rememberedValue();
            if (changedInstance5 || rememberedValue21 == obj2) {
                rememberedValue21 = new MainPaymentView$Content$2$1(snapshotStateList, cardLockPresenter2, continuation4, 14);
                gapComposer.updateRememberedValue(rememberedValue21);
            }
            Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue21);
            MutableState collectAsState2 = Updater.collectAsState(((RealAppForegroundStateProvider) ((AppForegroundStateProvider) cardLockPresenter2.franklinAppService)).appForegroundState, null, gapComposer, 1);
            gapComposer.startMovableGroup(712757496, Boolean.valueOf(((AppForegroundState) collectAsState2.getValue()) == AppForegroundState.FOREGROUND));
            Object rememberedValue22 = gapComposer.rememberedValue();
            if (rememberedValue22 == obj2) {
                rememberedValue22 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue22);
            }
            MutableState mutableState11 = (MutableState) rememberedValue22;
            Object rememberedValue23 = gapComposer.rememberedValue();
            if (rememberedValue23 == obj2) {
                rememberedValue23 = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue23);
            }
            MutableState mutableState12 = (MutableState) rememberedValue23;
            if (((Boolean) mutableState11.getValue()).booleanValue()) {
                i2 = R.string.nearby_pay_request_title_not_ready;
                mutableState2 = mutableState8;
                gapComposer.startReplaceGroup(623339984);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(620833696);
                boolean changed3 = gapComposer.changed(collectAsState2) | gapComposer.changedInstance(cardLockPresenter2);
                Object rememberedValue24 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue24 == obj2) {
                    i2 = R.string.nearby_pay_request_title_not_ready;
                    Object amountDisplayKt$AmountDisplay$1$1 = new AmountDisplayKt$AmountDisplay$1$1(cardLockPresenter2, collectAsState2, mutableState12, mutableState11, null);
                    gapComposer.updateRememberedValue(amountDisplayKt$AmountDisplay$1$1);
                    rememberedValue24 = amountDisplayKt$AmountDisplay$1$1;
                } else {
                    i2 = R.string.nearby_pay_request_title_not_ready;
                }
                Updater.LaunchedEffect(gapComposer, unit2, (Function2) rememberedValue24);
                NearbyAdvertisement nearbyAdvertisement = (NearbyAdvertisement) mutableState12.getValue();
                if (nearbyAdvertisement == null) {
                    gapComposer.startReplaceGroup(622085568);
                    z = false;
                    gapComposer.end(false);
                    mutableState2 = mutableState8;
                } else {
                    gapComposer.startReplaceGroup(622085569);
                    realNearbyManager.advertiseNearby(nearbyAdvertisement, gapComposer, 8);
                    String str3 = new String(ArraysKt___ArraysKt.sliceArray(nearbyAdvertisement.payload, new IntRange(4, 11, 1)), Charsets.UTF_8);
                    boolean changedInstance6 = gapComposer.changedInstance(cardLockPresenter2) | gapComposer.changed(str3);
                    Object rememberedValue25 = gapComposer.rememberedValue();
                    if (changedInstance6 || rememberedValue25 == obj2) {
                        Object moneybotChatPresenter$models$6$1 = new MoneybotChatPresenter$models$6$1(cardLockPresenter2, str3, snapshotStateList, parcelableSnapshotMutableLongState, mutableState8, mutableState11, (Continuation) null);
                        mutableState2 = mutableState8;
                        mutableState11 = mutableState11;
                        gapComposer.updateRememberedValue(moneybotChatPresenter$models$6$1);
                        rememberedValue25 = moneybotChatPresenter$models$6$1;
                    } else {
                        mutableState2 = mutableState8;
                    }
                    Updater.LaunchedEffect(gapComposer, str3, (Function2) rememberedValue25);
                    z = false;
                    gapComposer.end(false);
                }
                gapComposer.end(z);
            }
            if (((Boolean) mutableState11.getValue()).booleanValue()) {
                NearbyPayRequestViewModel.NotReady notReady = new NearbyPayRequestViewModel.NotReady(12, androidStringManager.get(i2), null, null, false);
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, false, false);
                return notReady;
            }
            gapComposer.end(false);
            gapComposer.end(false);
        }
        Object rememberedValue26 = gapComposer.rememberedValue();
        if (rememberedValue26 == obj2) {
            rememberedValue26 = Updater.derivedStateOf(new OffersHomeV2Kt$$ExternalSyntheticLambda7(25, cardLockPresenter2, snapshotStateList));
            gapComposer.updateRememberedValue(rememberedValue26);
        }
        State state = (State) rememberedValue26;
        Object rememberedValue27 = gapComposer.rememberedValue();
        if (rememberedValue27 == obj2) {
            rememberedValue27 = Updater.derivedStateOf(new HeroCardViewKt$Render$1$5$1$2$$ExternalSyntheticLambda0(cardLockPresenter2, snapshotStateList));
            gapComposer.updateRememberedValue(rememberedValue27);
        }
        List list = (List) state.getValue();
        Money money = (Money) ((State) rememberedValue27).getValue();
        if (list.isEmpty()) {
            str = null;
        } else {
            String format3 = ((MoneyFormatter) cardLockPresenter2.deviceLockAnimationBus).format(money);
            int size = list.size();
            if (size == 1) {
                NearbyPayer nearbyPayer = (NearbyPayer) CollectionsKt.first(list);
                String str4 = nearbyPayer.displayName;
                String str5 = nearbyPayer.amountFormatted;
                str4.getClass();
                str5.getClass();
                resources.getClass();
                format2 = new MessageFormat(resources.getString(R.string.nearby_get_paid_single_payer)).format(new Object[]{str4, str5});
                format2.getClass();
            } else if (size == 2) {
                split$default = StringsKt__StringsKt.split$default(((NearbyPayer) list.get(0)).displayName, new String[]{" "}, false, 0, 6, null);
                String str6 = (String) CollectionsKt.first(split$default);
                split$default2 = StringsKt__StringsKt.split$default(((NearbyPayer) list.get(1)).displayName, new String[]{" "}, false, 0, 6, null);
                String str7 = (String) CollectionsKt.first(split$default2);
                re$$ExternalSyntheticOutline0.m1432m(str6, str7, format3);
                resources.getClass();
                format2 = new MessageFormat(resources.getString(R.string.nearby_get_paid_two_payers)).format(new Object[]{str6, str7, format3});
                format2.getClass();
            } else if (size != 3) {
                format3.getClass();
                resources.getClass();
                format2 = new MessageFormat(resources.getString(R.string.nearby_get_paid_many_payers)).format(new Object[]{format3});
                format2.getClass();
            } else {
                format3.getClass();
                resources.getClass();
                format2 = new MessageFormat(resources.getString(R.string.nearby_get_paid_three_payers)).format(new Object[]{format3});
                format2.getClass();
            }
            str = format2;
        }
        NearbyPayRequestTab nearbyPayRequestTab2 = (NearbyPayRequestTab) mutableState.getValue();
        Boolean valueOf3 = Boolean.valueOf(((List) mutableState7.getValue()).isEmpty());
        boolean changedInstance7 = gapComposer.changedInstance(cardLockPresenter2);
        Object rememberedValue28 = gapComposer.rememberedValue();
        if (changedInstance7 || rememberedValue28 == obj2) {
            mutableState3 = mutableState;
            bool = valueOf3;
            phonePlansHomePresenter$models$1$1 = new PhonePlansHomePresenter$models$1$1(cardLockPresenter2, mutableState9, mutableState3, mutableState7, null, 4);
            mutableState4 = mutableState9;
            gapComposer.updateRememberedValue(phonePlansHomePresenter$models$1$1);
        } else {
            bool = valueOf3;
            phonePlansHomePresenter$models$1$1 = rememberedValue28;
            mutableState4 = mutableState9;
            mutableState3 = mutableState;
        }
        Updater.LaunchedEffect(nearbyPayRequestTab2, bool, (Function2) phonePlansHomePresenter$models$1$1, gapComposer);
        int ordinal = ((NearbyPayRequestTab) mutableState3.getValue()).ordinal();
        if (ordinal != 0) {
            z2 = true;
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str2 = androidStringManager.get(R.string.nearby_pay_request_title_get_paid);
        } else {
            z2 = true;
            int size2 = ((List) mutableState7.getValue()).size();
            if (size2 == 0) {
                str2 = androidStringManager.get(R.string.nearby_pay_request_title_pay);
            } else if (size2 != 1) {
                Object[] objArr2 = {Integer.valueOf(((List) mutableState7.getValue()).size())};
                resources.getClass();
                str2 = new MessageFormat(resources.getString(R.string.nearby_pay_request_title_found_people)).format(objArr2);
                str2.getClass();
            } else {
                str2 = androidStringManager.get(R.string.nearby_pay_request_title_found_person);
            }
        }
        String str8 = str2;
        PublicProfile publicProfile = (PublicProfile) collectAsState.getValue();
        if (publicProfile != null) {
            Character monogram = FillrWidget.WidgetType.AnonymousClass1.getMonogram(publicProfile);
            Color uiColor = ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(30, PlatformKt.activeAccountTokenOrNull((SessionManager) cardLockPresenter2.cashAppTagManager), null, null, null, null));
            String str9 = publicProfile.photoUrl;
            nearbyAvatarInfo = new NearbyAvatarInfo(monogram, uiColor, str9 != null ? new Image(str9, str9, 4) : null);
        } else {
            nearbyAvatarInfo = null;
        }
        NearbyPayRequestViewModel.Ready ready2 = new NearbyPayRequestViewModel.Ready(str8, (NearbyPayRequestTab) mutableState3.getValue(), (List) mutableState7.getValue(), nearbyAvatarInfo, CollectionsKt.take((List) state.getValue(), 3), str, ((List) state.getValue()).size() > 3 ? z2 : false, ((Boolean) mutableState4.getValue()).booleanValue(), snapshotStateList.size(), (Versioned) mutableState2.getValue(), EnumC0170g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE);
        gapComposer.end(false);
        return ready2;
    }

    private final Object models$com$squareup$cash$promotionsreferrals$presenters$PromotionsReferralsHomePresenter(Flow flow, Composer composer, int i) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) this.ioDispatcher;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(295962874);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new ChatInputView$Content$1$1$1(this, continuation, 3);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new ShoppingWebBridge.AnonymousClass1(this, continuation, 14);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        int i2 = 0;
        if (rememberedValue3 == neverEqualPolicy) {
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((RealAppConfigManager) ((AppConfigManager) this.cashAppTagManager)).invitationConfig(), new CashQrScannerPresenter$special$$inlined$filter$1(((RealP2pSettingsManager) this.cardLockFlowTypeProvider).select(), 29), new AccountDocumentsPresenter$bitcoinTaxFormsViewModel$1(this, continuation, 2), i2);
            gapComposer.updateRememberedValue(flowKt__ZipKt$combine$$inlined$unsafeFlow$1);
            rememberedValue3 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = ((RealReferralManager) this.issuedCardManager).rewardStatus();
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2);
        MutableState rememberUpdatedState = Updater.rememberUpdatedState((ReferralManager$RewardStatus) collectAsState2.getValue(), gapComposer);
        boolean changed = gapComposer.changed((ReferralManager$RewardStatus) collectAsState2.getValue());
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed || rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.derivedStateOf(new ProfileKt$$ExternalSyntheticLambda11(28, this, collectAsState2));
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        State state = (State) rememberedValue5;
        PromotionsReferralsHomePresenter$PromotionsListState promotionsReferralsHomePresenter$PromotionsListState = new PromotionsReferralsHomePresenter$PromotionsListState(null, false);
        boolean changedInstance3 = gapComposer.changedInstance(this);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = new SelectPaymentPlanBlockerPresenter$models$1$2(this, continuation, 22);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState produceState = Updater.produceState(gapComposer, promotionsReferralsHomePresenter$PromotionsListState, (Function2) rememberedValue6);
        PromotionsReferralsHomeViewModel.Loaded.InvitePromotion invitePromotion = (PromotionsReferralsHomeViewModel.Loaded.InvitePromotion) collectAsState.getValue();
        PromotionsReferralsHomeViewModel.Loaded.PromotionCode promotionCode = (PromotionsReferralsHomeViewModel.Loaded.PromotionCode) state.getValue();
        PromotionsReferralsHomePresenter$PromotionsListState promotionsReferralsHomePresenter$PromotionsListState2 = (PromotionsReferralsHomePresenter$PromotionsListState) produceState.getValue();
        boolean changed2 = gapComposer.changed(invitePromotion) | gapComposer.changed(promotionCode) | gapComposer.changed(promotionsReferralsHomePresenter$PromotionsListState2);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = (invitePromotion == null || !promotionsReferralsHomePresenter$PromotionsListState2.isLoaded) ? PromotionsReferralsHomeViewModel.Loading.INSTANCE : new PromotionsReferralsHomeViewModel.Loaded(invitePromotion, promotionCode, promotionsReferralsHomePresenter$PromotionsListState2.promotionsListViewModel);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        parcelableSnapshotMutableState.setValue((PromotionsReferralsHomeViewModel) rememberedValue7);
        Updater.LaunchedEffect(gapComposer, flow, new RealQrCodesPresenter$models$1$1(flow, continuation, this, rememberUpdatedState, 11));
        PromotionsReferralsHomeViewModel promotionsReferralsHomeViewModel = (PromotionsReferralsHomeViewModel) parcelableSnapshotMutableState.getValue();
        gapComposer.end(false);
        return promotionsReferralsHomeViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.util.Map, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v13, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v19 */
    private final Object models$com$squareup$cash$taptopay$presenters$TapToPayPaymentPresenter(Flow flow, Composer composer, int i) {
        RealObservabilityManager realObservabilityManager;
        GapComposer gapComposer;
        int i2;
        boolean z;
        Continuation continuation;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        boolean z2;
        NeverEqualPolicy neverEqualPolicy;
        int i3;
        String str;
        MutableState mutableState;
        TapToPayPaymentData tapToPayPaymentData;
        MutableState mutableState2;
        Object dbSessionManager$updateDb$2;
        CardLockPresenter cardLockPresenter;
        MutableState mutableState3;
        Continuation continuation2;
        CardLockPresenter cardLockPresenter2;
        Continuation continuation3;
        RealObservabilityManager realObservabilityManager2;
        TapToPayAvatarViewModel tapToPayAvatarViewModel;
        Object paymentInitiated;
        zzai zzaiVar = (zzai) this.args;
        RealObservabilityManager realObservabilityManager3 = (RealObservabilityManager) zzaiVar.zab;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(1036511423);
        Object rememberedValue = gapComposer2.rememberedValue();
        Continuation continuation4 = null;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy2) {
            RealTapToPaySessionManager realTapToPaySessionManager = (RealTapToPaySessionManager) this.flowNavigationHelper;
            TapToPayPaymentData tapToPayPaymentData2 = realTapToPaySessionManager.ttpSessionData;
            realTapToPaySessionManager.ttpSessionData = null;
            gapComposer2.updateRememberedValue(tapToPayPaymentData2);
            rememberedValue = tapToPayPaymentData2;
        }
        TapToPayPaymentData tapToPayPaymentData3 = (TapToPayPaymentData) rememberedValue;
        int i4 = 0;
        if (tapToPayPaymentData3 == null) {
            gapComposer2.startReplaceGroup(-2102609028);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer2.changedInstance(this);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = new ChatInputView$Content$1$1$1(this, continuation4, 20);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue2);
            TapToPayPaymentViewModel.PaymentInitiated paymentInitiated2 = new TapToPayPaymentViewModel.PaymentInitiated("", null, "", TapToPayPaymentViewModel.PaymentInitiated.PaymentScreenOrientation.PORTRAIT);
            gapComposer2.end(false);
            gapComposer2.end(false);
            return paymentInitiated2;
        }
        gapComposer2.startReplaceGroup(-2102387037);
        gapComposer2.end(false);
        Object rememberedValue3 = gapComposer2.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy2) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer2.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState4 = (MutableState) rememberedValue3;
        String format2 = ((MoneyFormatter) this.stringManager).format(tapToPayPaymentData3.amount);
        Object rememberedValue4 = gapComposer2.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy2) {
            rememberedValue4 = Updater.mutableStateOf$default(null);
            gapComposer2.updateRememberedValue(rememberedValue4);
        }
        final MutableState mutableState5 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer2.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy2) {
            rememberedValue5 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue5;
        Object rememberedValue6 = gapComposer2.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy2) {
            rememberedValue6 = Updater.mutableStateOf$default(null);
            gapComposer2.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState6 = (MutableState) rememberedValue6;
        MutableState collectAsState = Updater.collectAsState(((RealDeviceOrientationProvider) this.cardLockFlowTypeProvider).orientation, DeviceOrientation.UNKNOWN, null, gapComposer2, 48, 2);
        boolean changedInstance2 = gapComposer2.changedInstance(this) | gapComposer2.changedInstance(tapToPayPaymentData3);
        Object rememberedValue7 = gapComposer2.rememberedValue();
        if (changedInstance2 || rememberedValue7 == neverEqualPolicy2) {
            rememberedValue7 = new TapToPayPaymentPresenter$models$2$1(this, tapToPayPaymentData3, continuation4, i4);
            gapComposer2.updateRememberedValue(rememberedValue7);
        }
        Updater.LaunchedEffect(gapComposer2, tapToPayPaymentData3, (Function2) rememberedValue7);
        Object rememberedValue8 = gapComposer2.rememberedValue();
        if (rememberedValue8 == neverEqualPolicy2) {
            rememberedValue8 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
            gapComposer2.updateRememberedValue(rememberedValue8);
        }
        final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue8;
        boolean changedInstance3 = gapComposer2.changedInstance(coroutineScope);
        Object rememberedValue9 = gapComposer2.rememberedValue();
        if (changedInstance3 || rememberedValue9 == neverEqualPolicy2) {
            rememberedValue9 = new NfcAdapter.ReaderCallback() { // from class: com.squareup.cash.taptopay.presenters.TapToPayPaymentPresenter$$ExternalSyntheticLambda0
                @Override // android.nfc.NfcAdapter.ReaderCallback
                public final void onTagDiscovered(Tag tag) {
                    JobKt.launch$default(CoroutineScope.this, null, null, new WorkflowNode$tick$1$1(tag, mutableState5, null, 7), 3);
                }
            };
            gapComposer2.updateRememberedValue(rememberedValue9);
        }
        NfcAdapter.ReaderCallback readerCallback = (NfcAdapter.ReaderCallback) rememberedValue9;
        Object rememberedValue10 = gapComposer2.rememberedValue();
        if (rememberedValue10 == neverEqualPolicy2) {
            gapComposer = gapComposer2;
            i2 = 3;
            SpanTracking startTrackingSpan$default = RealObservabilityManager.startTrackingSpan$default(realObservabilityManager3, null, "create_payment_channel", null, null, 12);
            realObservabilityManager = realObservabilityManager3;
            try {
                StateFlowImpl stateFlowImpl = (StateFlowImpl) zzaiVar.zzd;
                SpanTracking.spanEnded$default(startTrackingSpan$default, null, 3);
                gapComposer.updateRememberedValue(stateFlowImpl);
                rememberedValue10 = stateFlowImpl;
            } catch (Throwable th) {
                SpanTracking.spanEnded$default(startTrackingSpan$default, null, 3);
                throw th;
            }
        } else {
            realObservabilityManager = realObservabilityManager3;
            gapComposer = gapComposer2;
            i2 = 3;
        }
        GapComposer gapComposer3 = gapComposer;
        EmvPaymentResult emvPaymentResult = (EmvPaymentResult) Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer3, 48, 2).getValue();
        if (emvPaymentResult != null) {
            gapComposer3.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect(gapComposer3, emvPaymentResult, new Logger$_log$2(emvPaymentResult, continuation4, mutableState5, 2));
            z = false;
            gapComposer3.end(false);
        } else {
            z = false;
            gapComposer3.startReplaceGroup(-1106436997);
            gapComposer3.end(false);
        }
        TapToPayPaymentPresenter$State tapToPayPaymentPresenter$State = (TapToPayPaymentPresenter$State) mutableState5.getValue();
        if (tapToPayPaymentPresenter$State != null) {
            gapComposer3.startReplaceGroup(-1106477359);
            z2 = z;
            str = format2;
            continuation = null;
            neverEqualPolicy = neverEqualPolicy2;
            i3 = i2;
            TapToPayPaymentPresenter$models$$inlined$LaunchedEffectNotNull$2 tapToPayPaymentPresenter$models$$inlined$LaunchedEffectNotNull$2 = new TapToPayPaymentPresenter$models$$inlined$LaunchedEffectNotNull$2(tapToPayPaymentPresenter$State, null, this, tapToPayPaymentData3, readerCallback, mutableState4, mutableState5, parcelableSnapshotMutableIntState2);
            mutableState = mutableState5;
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
            tapToPayPaymentData = tapToPayPaymentData3;
            mutableState2 = mutableState4;
            Updater.LaunchedEffect(gapComposer3, tapToPayPaymentPresenter$State, tapToPayPaymentPresenter$models$$inlined$LaunchedEffectNotNull$2);
            gapComposer3.end(z2);
        } else {
            continuation = null;
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
            z2 = z;
            neverEqualPolicy = neverEqualPolicy2;
            i3 = i2;
            str = format2;
            mutableState = mutableState5;
            tapToPayPaymentData = tapToPayPaymentData3;
            mutableState2 = mutableState4;
            gapComposer3.startReplaceGroup(-1106436997);
            gapComposer3.end(z2);
        }
        Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue());
        boolean changedInstance4 = gapComposer3.changedInstance(this);
        Object rememberedValue11 = gapComposer3.rememberedValue();
        if (changedInstance4 || rememberedValue11 == neverEqualPolicy) {
            MutableState mutableState7 = mutableState;
            cardLockPresenter = this;
            Continuation continuation5 = continuation;
            dbSessionManager$updateDb$2 = new DbSessionManager$updateDb$2(cardLockPresenter, parcelableSnapshotMutableIntState, mutableState7, continuation5, 26);
            mutableState3 = mutableState7;
            continuation2 = continuation5;
            gapComposer3.updateRememberedValue(dbSessionManager$updateDb$2);
        } else {
            dbSessionManager$updateDb$2 = rememberedValue11;
            cardLockPresenter = this;
            continuation2 = continuation;
            mutableState3 = mutableState;
        }
        Updater.LaunchedEffect(gapComposer3, valueOf, (Function2) dbSessionManager$updateDb$2);
        Unit unit2 = Unit.INSTANCE;
        boolean changedInstance5 = gapComposer3.changedInstance(cardLockPresenter);
        Object rememberedValue12 = gapComposer3.rememberedValue();
        if (changedInstance5 || rememberedValue12 == neverEqualPolicy) {
            rememberedValue12 = new BottomSheet$$ExternalSyntheticLambda3(17, cardLockPresenter, mutableState2);
            gapComposer3.updateRememberedValue(rememberedValue12);
        }
        Updater.DisposableEffect(unit2, (Function1) rememberedValue12, gapComposer3);
        Object rememberedValue13 = gapComposer3.rememberedValue();
        if (rememberedValue13 == neverEqualPolicy) {
            ?? r10 = continuation2;
            cardLockPresenter2 = cardLockPresenter;
            realObservabilityManager2 = realObservabilityManager;
            SpanTracking startTrackingSpan$default2 = RealObservabilityManager.startTrackingSpan$default(realObservabilityManager2, null, "subscribe_card_status", null, null, 12);
            try {
                RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1((StateFlowImpl) zzaiVar.zzb, 24);
                SpanTracking.spanEnded$default(startTrackingSpan$default2, r10, i3);
                gapComposer3.updateRememberedValue(realBadger2$setup$lambda$0$$inlined$mapNotNull$1);
                rememberedValue13 = realBadger2$setup$lambda$0$$inlined$mapNotNull$1;
                continuation3 = r10;
            } finally {
            }
        } else {
            cardLockPresenter2 = cardLockPresenter;
            continuation3 = continuation2;
            realObservabilityManager2 = realObservabilityManager;
        }
        Flow flow2 = (Flow) rememberedValue13;
        MutableState mutableState8 = mutableState2;
        EmvCardStatus emvCardStatus = (EmvCardStatus) Updater.collectAsState(flow2, null, null, gapComposer3, 48, 2).getValue();
        if (emvCardStatus != null) {
            gapComposer3.startReplaceGroup(-1106477359);
            Updater.LaunchedEffect(gapComposer3, emvCardStatus, new HeroCardViewKt$Render$1$4$1.AnonymousClass2(emvCardStatus, continuation3, cardLockPresenter2, mutableState8));
            gapComposer3.end(z2);
        } else {
            gapComposer3.startReplaceGroup(-1106436997);
            gapComposer3.end(z2);
        }
        SpanTracking startTrackingSpan$default3 = RealObservabilityManager.startTrackingSpan$default(realObservabilityManager2, null, "alert_tone_received", null, null, 12);
        try {
            StateFlowImpl stateFlowImpl2 = (StateFlowImpl) zzaiVar.zze;
            SpanTracking.spanEnded$default(startTrackingSpan$default3, continuation3, i3);
            Updater.LaunchedEffect(gapComposer3, stateFlowImpl2, new TaxWebAppPresenter$models$1$1((Flow) stateFlowImpl2, continuation3, (MoleculePresenter) cardLockPresenter2, mutableState6, 18));
            TapToPayPaymentData tapToPayPaymentData4 = tapToPayPaymentData;
            MutableState mutableState9 = mutableState3;
            Updater.LaunchedEffect(gapComposer3, flow, new NotificationActionService$onHandleIntent$1(flow, (Continuation) null, this, tapToPayPaymentData4, mutableState9, mutableState8, 15));
            String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull((SessionManager) this.cashAppTagManager);
            TapToPayPaymentPresenter$State tapToPayPaymentPresenter$State2 = (TapToPayPaymentPresenter$State) mutableState9.getValue();
            String str2 = tapToPayPaymentData4.cashtag;
            String str3 = tapToPayPaymentData4.photoUrl;
            Character ch = tapToPayPaymentData4.monogram;
            TapToPayPaymentViewModel.AlertTone alertTone = (TapToPayPaymentViewModel.AlertTone) mutableState6.getValue();
            DeviceOrientation deviceOrientation = (DeviceOrientation) collectAsState.getValue();
            if (Intrinsics.areEqual(tapToPayPaymentPresenter$State2, TapToPayPaymentPresenter$State.Initialized.INSTANCE) || tapToPayPaymentPresenter$State2 == null) {
                if (str3 != null) {
                    tapToPayAvatarViewModel = new TapToPayAvatarViewModel(str3, ch, activeAccountTokenOrNull != null ? new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, activeAccountTokenOrNull, null, null, null))) : continuation3);
                } else {
                    tapToPayAvatarViewModel = continuation3;
                }
                paymentInitiated = new TapToPayPaymentViewModel.PaymentInitiated(str, tapToPayAvatarViewModel, str2, TapToPayPaymentPresenter$WhenMappings.$EnumSwitchMapping$2[deviceOrientation.ordinal()] == 1 ? TapToPayPaymentViewModel.PaymentInitiated.PaymentScreenOrientation.PORTRAIT_UPSIDE_DOWN : TapToPayPaymentViewModel.PaymentInitiated.PaymentScreenOrientation.PORTRAIT);
            } else {
                paymentInitiated = new TapToPayPaymentViewModel.PaymentProcessing(alertTone);
            }
            gapComposer3.end(z2);
            return paymentInitiated;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x068a, code lost:
    
        if ((r0 != null ? kotlin.jvm.internal.Intrinsics.areEqual(r0.is_tip_eligible, java.lang.Boolean.TRUE) : false) != false) goto L313;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x075f A[Catch: IllegalStateException -> 0x062d, TRY_LEAVE, TryCatch #4 {IllegalStateException -> 0x062d, blocks: (B:74:0x0614, B:129:0x062a, B:156:0x06c7, B:172:0x06d4, B:173:0x06dd, B:77:0x06de, B:80:0x06e4, B:82:0x06ff, B:83:0x0708, B:85:0x0711, B:87:0x0722, B:89:0x072c, B:91:0x0732, B:94:0x0739, B:97:0x0742, B:99:0x0746, B:100:0x0750, B:102:0x075f, B:120:0x0704), top: B:73:0x0614 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x07f7  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v9, types: [androidx.compose.runtime.State] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$work$presenters$shift$ClockInOverlayPresenter(Flow flow, Composer composer, int i) {
        Instant instant;
        LocationIdentifier locationIdentifier;
        JobIdentifier jobIdentifier;
        ShiftSchedule shiftSchedule;
        Instant instant2;
        CalendarEvent calendarEvent;
        String str;
        Object failure;
        ShiftSchedule shiftSchedule2;
        ShiftSchedule.Version version;
        Job job;
        MutableState mutableState;
        boolean z;
        MutableState mutableState2;
        GeofenceStateResolver.SelectedLocationGeofenceInput selectedLocationGeofenceInput;
        String str2;
        Object obj;
        String str3;
        Name name;
        double d;
        boolean z2;
        Object obj2;
        MutableState mutableState3;
        Object interactiveCardState$animateLock$2;
        NeverEqualPolicy neverEqualPolicy;
        AndroidStringManager androidStringManager;
        String str4;
        AndroidLocationProvider androidLocationProvider;
        ?? r15;
        MutableState mutableState4;
        String str5;
        ClockedOutGeofenceUiState clockedOutGeofenceUiState;
        AndroidStringManager androidStringManager2;
        GapComposer gapComposer;
        SellerCardViewModel sellerCardViewModel;
        boolean z3;
        Object obj3;
        Object loading;
        Object obj4;
        AndroidStringManager androidStringManager3;
        AndroidStringManager androidStringManager4;
        Object onBreak;
        boolean z4;
        CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0;
        char c;
        String str6;
        Instant instant3;
        char c2;
        AndroidStringManager androidStringManager5;
        long j;
        Object obj5;
        ClockInOverlayScreen clockInOverlayScreen = (ClockInOverlayScreen) this.args;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-2052427733);
        SellerCardViewModel collectSelectedMerchantViewModel = ((RealSellerCardViewModelProducer) this.analytics).collectSelectedMerchantViewModel(gapComposer2);
        MutableState collectAsState = Updater.collectAsState((StateFlow) ((RealClockInEssentialsProvider) this.cardLockFlowTypeProvider).essentialsState$delegate.getValue(), null, gapComposer2, 1);
        Object rememberedValue = gapComposer2.rememberedValue();
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        Object obj6 = rememberedValue;
        if (rememberedValue == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(mutableStateOf$default);
            obj6 = mutableStateOf$default;
        }
        MutableState mutableState5 = (MutableState) obj6;
        Object rememberedValue2 = gapComposer2.rememberedValue();
        Object obj7 = rememberedValue2;
        if (rememberedValue2 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(null);
            gapComposer2.updateRememberedValue(mutableStateOf$default2);
            obj7 = mutableStateOf$default2;
        }
        MutableState mutableState6 = (MutableState) obj7;
        Object rememberedValue3 = gapComposer2.rememberedValue();
        Object obj8 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(null);
            gapComposer2.updateRememberedValue(mutableStateOf$default3);
            obj8 = mutableStateOf$default3;
        }
        MutableState mutableState7 = (MutableState) obj8;
        Object rememberedValue4 = gapComposer2.rememberedValue();
        Object obj9 = rememberedValue4;
        if (rememberedValue4 == neverEqualPolicy2) {
            CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
            gapComposer2.updateRememberedValue(createCompositionCoroutineScope);
            obj9 = createCompositionCoroutineScope;
        }
        CoroutineScope coroutineScope = (CoroutineScope) obj9;
        Object rememberedValue5 = gapComposer2.rememberedValue();
        Object obj10 = rememberedValue5;
        if (rememberedValue5 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default4 = Updater.mutableStateOf$default(null);
            gapComposer2.updateRememberedValue(mutableStateOf$default4);
            obj10 = mutableStateOf$default4;
        }
        MutableState mutableState8 = (MutableState) obj10;
        ClockInEssentialsState clockInEssentialsState = (ClockInEssentialsState) collectAsState.getValue();
        ClockInEssentials.ClockedOutEssentials clockedOutEssentials = clockInEssentialsState instanceof ClockInEssentials.ClockedOutEssentials ? (ClockInEssentials.ClockedOutEssentials) clockInEssentialsState : null;
        boolean changed = gapComposer2.changed(clockInOverlayScreen.isScheduledUserFlow) | gapComposer2.changed(clockedOutEssentials);
        Object rememberedValue6 = gapComposer2.rememberedValue();
        if (changed || rememberedValue6 == neverEqualPolicy2) {
            if (clockedOutEssentials != null) {
                ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) this.issuedCardManager;
                boolean z5 = clockInOverlayScreen.isScheduledUserFlow;
                ClockInEssentials.NextShift nextShift = clockedOutEssentials.nextShift;
                String token = (nextShift == null || (job = nextShift.job) == null) ? null : job.getToken();
                String str7 = (nextShift == null || (shiftSchedule2 = nextShift.shift) == null || (version = shiftSchedule2.published_version) == null) ? null : version.location_id;
                if (nextShift == null || (shiftSchedule = nextShift.shift) == null) {
                    instant = null;
                } else {
                    ShiftSchedule.Version version2 = shiftSchedule.published_version;
                    if (version2 == null || (calendarEvent = version2.calendar_event) == null || (str = calendarEvent.stop_datetime) == null) {
                        instant2 = null;
                    } else {
                        try {
                            Result.Companion companion = Result.Companion;
                            failure = OffsetDateTime.parse(str).toInstant();
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            failure = new Result.Failure(th);
                        }
                        if (failure instanceof Result.Failure) {
                            failure = null;
                        }
                        instant2 = (Instant) failure;
                    }
                    instant = instant2;
                }
                RealLastClockedInInfoUseCase realLastClockedInInfoUseCase = (RealLastClockedInInfoUseCase) toolbarTuckTargets.startCornerCenterX$delegate;
                ClockInEssentials.BasicInfo basicInfo = clockedOutEssentials.basicInfo;
                LastClockedInInfo info = realLastClockedInInfoUseCase.getInfo(basicInfo.merchantIdentifier, basicInfo.employeeToken);
                ArrayList arrayList = clockedOutEssentials.locations;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str8 = ((com.squareup.protos.wire.roster.mds.Unit) it.next()).token;
                    if (str8 == null || str8.length() <= 0) {
                        str8 = null;
                    }
                    if (str8 != null) {
                        arrayList2.add(str8);
                    }
                }
                if (z5) {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (Intrinsics.areEqual((String) next, str7)) {
                            arrayList3.add(next);
                        }
                    }
                    arrayList2 = arrayList3;
                }
                if (arrayList2.size() == 1) {
                    locationIdentifier = new LocationIdentifier((String) CollectionsKt.single((List) arrayList2));
                } else if (!z5 || str7 == null) {
                    String str9 = info != null ? info.locationIdentifier.token : null;
                    if (str9 != null && arrayList2.contains(str9)) {
                        boolean equals = str9.equals(str7);
                        ClockInControls clockInControls = clockedOutEssentials.clockInControls;
                        if (((ClockInStateResolver) toolbarTuckTargets.endCornerCenterX$delegate).getClockInEnabledForLocationResult(clockInControls.hasOverridePermission, clockInControls.canEnforceEarlyOrUnscheduledClockIn, clockInControls.get(str9), instant, equals).isEnabled) {
                            locationIdentifier = new LocationIdentifier(str9);
                        }
                    }
                    locationIdentifier = null;
                } else {
                    locationIdentifier = new LocationIdentifier(str7);
                }
                List list = clockedOutEssentials.assignedJobs;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((AssignedJob) it3.next()).job.getToken());
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    Object next2 = it4.next();
                    if (((String) next2).length() > 0) {
                        arrayList5.add(next2);
                    }
                }
                if (arrayList5.size() == 1) {
                    jobIdentifier = new JobIdentifier((String) CollectionsKt.first((List) arrayList5));
                } else if (!z5 || token == null) {
                    String str10 = info != null ? info.jobIdentifier.token : null;
                    jobIdentifier = (str10 == null || !arrayList5.contains(str10)) ? null : new JobIdentifier(str10);
                } else {
                    jobIdentifier = new JobIdentifier(token);
                }
                rememberedValue6 = new ClockInSelectionResolver$Selection(jobIdentifier, locationIdentifier);
            } else {
                rememberedValue6 = null;
            }
            gapComposer2.updateRememberedValue(rememberedValue6);
        }
        ClockInSelectionResolver$Selection clockInSelectionResolver$Selection = (ClockInSelectionResolver$Selection) rememberedValue6;
        boolean changed2 = gapComposer2.changed(clockInSelectionResolver$Selection);
        Object rememberedValue7 = gapComposer2.rememberedValue();
        Object obj11 = rememberedValue7;
        if (changed2 || rememberedValue7 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default5 = Updater.mutableStateOf$default(clockInSelectionResolver$Selection != null ? clockInSelectionResolver$Selection.location : null);
            gapComposer2.updateRememberedValue(mutableStateOf$default5);
            obj11 = mutableStateOf$default5;
        }
        MutableState mutableState9 = (MutableState) obj11;
        boolean changed3 = gapComposer2.changed(clockInSelectionResolver$Selection);
        Object rememberedValue8 = gapComposer2.rememberedValue();
        Object obj12 = rememberedValue8;
        if (changed3 || rememberedValue8 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default6 = Updater.mutableStateOf$default(clockInSelectionResolver$Selection != null ? clockInSelectionResolver$Selection.job : null);
            gapComposer2.updateRememberedValue(mutableStateOf$default6);
            obj12 = mutableStateOf$default6;
        }
        MutableState mutableState10 = (MutableState) obj12;
        LocationIdentifier locationIdentifier2 = (LocationIdentifier) mutableState9.getValue();
        AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) this.flowStarter;
        AndroidLocationProvider androidLocationProvider2 = (AndroidLocationProvider) this.flowNavigationHelper;
        GeofenceStateResolver geofenceStateResolver = (GeofenceStateResolver) this.ioDispatcher;
        AndroidStringManager androidStringManager6 = (AndroidStringManager) this.stringManager;
        gapComposer2.startReplaceGroup(1915683232);
        if (clockedOutEssentials == null) {
            ClockedOutGeofenceUiState clockedOutGeofenceUiState2 = new ClockedOutGeofenceUiState(null, null, false, true);
            gapComposer2.end(false);
            clockedOutGeofenceUiState = clockedOutGeofenceUiState2;
            mutableState = mutableState9;
            z = true;
            gapComposer = gapComposer2;
            mutableState3 = mutableState8;
            str4 = null;
            androidStringManager2 = androidStringManager6;
        } else {
            ClockInControls clockInControls2 = clockedOutEssentials.clockInControls;
            Object rememberedValue9 = gapComposer2.rememberedValue();
            Object obj13 = rememberedValue9;
            if (rememberedValue9 == neverEqualPolicy2) {
                AndroidPermissionManager$create$1 create = androidPermissionManager.create("android.permission.ACCESS_FINE_LOCATION");
                gapComposer2.updateRememberedValue(create);
                obj13 = create;
            }
            ModifiablePermissions modifiablePermissions = (ModifiablePermissions) obj13;
            Object rememberedValue10 = gapComposer2.rememberedValue();
            Object obj14 = rememberedValue10;
            if (rememberedValue10 == neverEqualPolicy2) {
                Boolean valueOf = Boolean.valueOf(modifiablePermissions.check());
                gapComposer2.updateRememberedValue(valueOf);
                obj14 = valueOf;
            }
            Boolean bool = (Boolean) obj14;
            bool.getClass();
            Object rememberedValue11 = gapComposer2.rememberedValue();
            Object obj15 = rememberedValue11;
            if (rememberedValue11 == neverEqualPolicy2) {
                Flow granted = modifiablePermissions.granted();
                gapComposer2.updateRememberedValue(granted);
                obj15 = granted;
            }
            mutableState = mutableState9;
            z = true;
            MutableState collectAsState2 = Updater.collectAsState((Flow) obj15, bool, null, gapComposer2, 48, 2);
            Object rememberedValue12 = gapComposer2.rememberedValue();
            Object obj16 = rememberedValue12;
            if (rememberedValue12 == neverEqualPolicy2) {
                AndroidPermissionManager$create$1 create2 = androidPermissionManager.create("android.permission.ACCESS_COARSE_LOCATION");
                gapComposer2.updateRememberedValue(create2);
                obj16 = create2;
            }
            ModifiablePermissions modifiablePermissions2 = (ModifiablePermissions) obj16;
            Object rememberedValue13 = gapComposer2.rememberedValue();
            Object obj17 = rememberedValue13;
            if (rememberedValue13 == neverEqualPolicy2) {
                Boolean valueOf2 = Boolean.valueOf(modifiablePermissions2.check());
                gapComposer2.updateRememberedValue(valueOf2);
                obj17 = valueOf2;
            }
            Boolean bool2 = (Boolean) obj17;
            bool2.getClass();
            Object rememberedValue14 = gapComposer2.rememberedValue();
            Object obj18 = rememberedValue14;
            if (rememberedValue14 == neverEqualPolicy2) {
                Flow granted2 = modifiablePermissions2.granted();
                gapComposer2.updateRememberedValue(granted2);
                obj18 = granted2;
            }
            MutableState collectAsState3 = Updater.collectAsState((Flow) obj18, bool2, null, gapComposer2, 48, 2);
            GapComposer gapComposer3 = gapComposer2;
            Object rememberedValue15 = gapComposer3.rememberedValue();
            Object obj19 = rememberedValue15;
            if (rememberedValue15 == neverEqualPolicy2) {
                ParcelableSnapshotMutableState mutableStateOf$default7 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer3.updateRememberedValue(mutableStateOf$default7);
                obj19 = mutableStateOf$default7;
            }
            MutableState mutableState11 = (MutableState) obj19;
            Flow denied = modifiablePermissions.denied();
            Updater.LaunchedEffect(gapComposer3, denied, new PoolInvitePeopleListPresenter$models$$inlined$CollectEffect$1(9, mutableState11, null, denied));
            Object rememberedValue16 = gapComposer3.rememberedValue();
            Object obj20 = rememberedValue16;
            if (rememberedValue16 == neverEqualPolicy2) {
                ParcelableSnapshotMutableState mutableStateOf$default8 = Updater.mutableStateOf$default(null);
                gapComposer3.updateRememberedValue(mutableStateOf$default8);
                obj20 = mutableStateOf$default8;
            }
            MutableState mutableState12 = (MutableState) obj20;
            Object rememberedValue17 = gapComposer3.rememberedValue();
            Object obj21 = rememberedValue17;
            if (rememberedValue17 == neverEqualPolicy2) {
                ParcelableSnapshotMutableState mutableStateOf$default9 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer3.updateRememberedValue(mutableStateOf$default9);
                obj21 = mutableStateOf$default9;
            }
            MutableState mutableState13 = (MutableState) obj21;
            boolean changed4 = gapComposer3.changed(clockedOutEssentials) | gapComposer3.changed(locationIdentifier2);
            Object rememberedValue18 = gapComposer3.rememberedValue();
            if (changed4 || rememberedValue18 == neverEqualPolicy2) {
                if (locationIdentifier2 == null || (str2 = locationIdentifier2.token) == null) {
                    mutableState2 = mutableState11;
                    selectedLocationGeofenceInput = null;
                } else {
                    LocationScopedClockInControls locationScopedClockInControls = clockInControls2.get(str2);
                    Location.Coordinates coordinates = (Location.Coordinates) clockedOutEssentials.coordinates.get(str2);
                    Iterator it5 = clockedOutEssentials.locations.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it5.next();
                        if (Intrinsics.areEqual(((com.squareup.protos.wire.roster.mds.Unit) obj).token, str2)) {
                            break;
                        }
                    }
                    com.squareup.protos.wire.roster.mds.Unit unit = (com.squareup.protos.wire.roster.mds.Unit) obj;
                    if (unit != null) {
                        String str11 = unit.nickname;
                        if (str11 == null) {
                            Names names = unit.name;
                            str11 = (names == null || (name = names.primary) == null) ? null : name.value;
                        }
                        if (str11 != null) {
                            if (StringsKt.isBlank(str11)) {
                                str11 = null;
                            }
                            if (str11 != null) {
                                str3 = str11;
                                mutableState2 = mutableState11;
                                selectedLocationGeofenceInput = new GeofenceStateResolver.SelectedLocationGeofenceInput(clockInControls2.canUseGeofencing, locationScopedClockInControls.isGeofencingEnabled, locationScopedClockInControls.geofenceRadiusInMeters, coordinates == null ? Double.valueOf(coordinates.latitude) : null, coordinates == null ? Double.valueOf(coordinates.longitude) : null, str3);
                            }
                        }
                    }
                    str3 = str2;
                    mutableState2 = mutableState11;
                    selectedLocationGeofenceInput = new GeofenceStateResolver.SelectedLocationGeofenceInput(clockInControls2.canUseGeofencing, locationScopedClockInControls.isGeofencingEnabled, locationScopedClockInControls.geofenceRadiusInMeters, coordinates == null ? Double.valueOf(coordinates.latitude) : null, coordinates == null ? Double.valueOf(coordinates.longitude) : null, str3);
                }
                gapComposer3.updateRememberedValue(selectedLocationGeofenceInput);
                rememberedValue18 = selectedLocationGeofenceInput;
            } else {
                mutableState2 = mutableState11;
            }
            GeofenceStateResolver.SelectedLocationGeofenceInput selectedLocationGeofenceInput2 = (GeofenceStateResolver.SelectedLocationGeofenceInput) rememberedValue18;
            boolean changed5 = gapComposer3.changed(((Boolean) collectAsState2.getValue()).booleanValue()) | gapComposer3.changed(selectedLocationGeofenceInput2);
            Object rememberedValue19 = gapComposer3.rememberedValue();
            if (changed5 || rememberedValue19 == neverEqualPolicy2) {
                if (selectedLocationGeofenceInput2 == null) {
                    z2 = false;
                    d = 0.0d;
                } else {
                    if (selectedLocationGeofenceInput2.canUseGeofencing && selectedLocationGeofenceInput2.isGeofencingEnabled) {
                        d = 0.0d;
                        if (selectedLocationGeofenceInput2.geofenceRadiusInMeters > 0.0d && !((Boolean) collectAsState2.getValue()).booleanValue()) {
                            z2 = true;
                        }
                    } else {
                        d = 0.0d;
                    }
                    z2 = false;
                }
                Boolean valueOf3 = Boolean.valueOf(z2);
                gapComposer3.updateRememberedValue(valueOf3);
                obj2 = valueOf3;
            } else {
                d = 0.0d;
                obj2 = rememberedValue19;
            }
            Boolean bool3 = (Boolean) obj2;
            mutableState3 = mutableState8;
            boolean booleanValue = bool3.booleanValue();
            Boolean bool4 = (Boolean) mutableState2.getValue();
            bool4.getClass();
            boolean changed6 = gapComposer3.changed(booleanValue) | gapComposer3.changedInstance(androidPermissionManager);
            Object rememberedValue20 = gapComposer3.rememberedValue();
            if (changed6 || rememberedValue20 == neverEqualPolicy2) {
                neverEqualPolicy = neverEqualPolicy2;
                androidStringManager = androidStringManager6;
                str4 = null;
                MutableState mutableState14 = mutableState2;
                androidLocationProvider = androidLocationProvider2;
                interactiveCardState$animateLock$2 = new InteractiveCardState$animateLock$2(booleanValue, (Object) androidPermissionManager, (Object) mutableState14, (Continuation) (false ? 1 : 0), 14);
                gapComposer3.updateRememberedValue(interactiveCardState$animateLock$2);
                r15 = mutableState14;
            } else {
                interactiveCardState$animateLock$2 = rememberedValue20;
                neverEqualPolicy = neverEqualPolicy2;
                androidStringManager = androidStringManager6;
                str4 = null;
                r15 = mutableState2;
                androidLocationProvider = androidLocationProvider2;
            }
            Updater.LaunchedEffect(bool3, bool4, (Function2) interactiveCardState$animateLock$2, gapComposer3);
            boolean changed7 = gapComposer3.changed(((Boolean) collectAsState2.getValue()).booleanValue()) | gapComposer3.changed(selectedLocationGeofenceInput2);
            Object rememberedValue21 = gapComposer3.rememberedValue();
            Object obj22 = rememberedValue21;
            if (changed7 || rememberedValue21 == neverEqualPolicy) {
                boolean booleanValue2 = ((Boolean) collectAsState2.getValue()).booleanValue();
                Set set = GeofenceStateResolver.IMPERIAL_COUNTRY_CODES;
                Boolean valueOf4 = Boolean.valueOf(selectedLocationGeofenceInput2 != null && selectedLocationGeofenceInput2.canUseGeofencing && selectedLocationGeofenceInput2.isGeofencingEnabled && selectedLocationGeofenceInput2.geofenceRadiusInMeters > d && booleanValue2);
                gapComposer3.updateRememberedValue(valueOf4);
                obj22 = valueOf4;
            }
            Boolean bool5 = (Boolean) obj22;
            boolean booleanValue3 = bool5.booleanValue();
            boolean changed8 = gapComposer3.changed(booleanValue3) | gapComposer3.changedInstance(androidLocationProvider);
            Object rememberedValue22 = gapComposer3.rememberedValue();
            if (changed8 || rememberedValue22 == neverEqualPolicy) {
                rememberedValue22 = new RealPayDataLoader$fetchData$1(booleanValue3, androidLocationProvider, mutableState12, mutableState13, (Continuation) null, 16);
                mutableState4 = mutableState13;
                gapComposer3.updateRememberedValue(rememberedValue22);
            } else {
                mutableState4 = mutableState13;
            }
            Updater.LaunchedEffect(gapComposer3, bool5, (Function2) rememberedValue22);
            GeofenceStateResolver.GeofenceResolution resolve = geofenceStateResolver.resolve(selectedLocationGeofenceInput2, ((Boolean) collectAsState2.getValue()).booleanValue(), ((Boolean) collectAsState3.getValue()).booleanValue(), ((Boolean) r15.getValue()).booleanValue(), (com.squareup.cash.gps.backend.api.Location) mutableState12.getValue());
            GeofenceStateResolver.GeofenceAction geofenceAction = resolve.reasonAction;
            if ((geofenceAction instanceof GeofenceStateResolver.GeofenceAction.OpenSettings) || (geofenceAction instanceof GeofenceStateResolver.GeofenceAction.RequestLocationPermission)) {
                str5 = androidStringManager.get(R.string.work_shift_disclaimer_geofence_open_settings_action);
            } else {
                if (geofenceAction != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str5 = str4;
            }
            ClockedOutGeofenceUiState clockedOutGeofenceUiState3 = new ClockedOutGeofenceUiState(resolve.reasonText, str5, ((Boolean) mutableState4.getValue()).booleanValue(), resolve.isAllowed);
            gapComposer3.end(false);
            clockedOutGeofenceUiState = clockedOutGeofenceUiState3;
            gapComposer = gapComposer3;
            androidStringManager2 = r15;
        }
        if (((ClockInOverlayViewModel.Loaded.ClockedOutSummary) mutableState7.getValue()) != null) {
            ClockInOverlayViewModel.Loaded.ClockedOutSummary clockedOutSummary = (ClockInOverlayViewModel.Loaded.ClockedOutSummary) mutableState7.getValue();
            clockedOutSummary.getClass();
            obj3 = ClockInOverlayViewModel.Loaded.ClockedOutSummary.copy$default(clockedOutSummary, collectSelectedMerchantViewModel, ((Boolean) mutableState5.getValue()).booleanValue(), (ToastState) mutableState6.getValue(), 14);
            sellerCardViewModel = collectSelectedMerchantViewModel;
            obj5 = str4;
            z3 = false;
        } else {
            ClockInEssentialsState clockInEssentialsState2 = (ClockInEssentialsState) collectAsState.getValue();
            if (clockInEssentialsState2 instanceof ClockInEssentials) {
                MarkwonConfiguration markwonConfiguration = (MarkwonConfiguration) this.cashAppTagManager;
                AndroidStringManager androidStringManager7 = (AndroidStringManager) markwonConfiguration.theme;
                Pool pool = (Pool) markwonConfiguration.imageDestinationProcessor;
                MoneyFormatter moneyFormatter = (MoneyFormatter) markwonConfiguration.spansFactory;
                ClockInEssentials clockInEssentials = (ClockInEssentials) clockInEssentialsState2;
                boolean z6 = clockInOverlayScreen.isScheduledUserFlow;
                LocationIdentifier locationIdentifier3 = (LocationIdentifier) mutableState.getValue();
                JobIdentifier jobIdentifier2 = (JobIdentifier) mutableState10.getValue();
                collectSelectedMerchantViewModel.getClass();
                try {
                } catch (IllegalStateException e) {
                    e = e;
                    sellerCardViewModel = collectSelectedMerchantViewModel;
                }
                if (clockInEssentials instanceof ClockInEssentials.ClockedOutEssentials) {
                    loading = markwonConfiguration.mapClockedOut((ClockInEssentials.ClockedOutEssentials) clockInEssentials, z6, collectSelectedMerchantViewModel, locationIdentifier3, jobIdentifier2, clockedOutGeofenceUiState);
                    sellerCardViewModel = collectSelectedMerchantViewModel;
                } else {
                    sellerCardViewModel = collectSelectedMerchantViewModel;
                    try {
                        z4 = clockInEssentials instanceof ClockInEssentials.ClockedInEssentials;
                        currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 = CurrentTimeMillisProvider$Companion.Default;
                    } catch (IllegalStateException e2) {
                        e = e2;
                    }
                    if (z4) {
                        try {
                            CurrencyCode currencyCode = ((ClockInEssentials.ClockedInEssentials) clockInEssentials).basicInfo.merchantLocale.currency_code;
                            if (currencyCode == null) {
                                currencyCode = CurrencyCode.USD;
                            }
                            ClockInEssentials.ClockedInEssentials clockedInEssentials = (ClockInEssentials.ClockedInEssentials) clockInEssentials;
                            Money calculateEarnedWage$default = Pool.calculateEarnedWage$default(pool, clockedInEssentials.timecard, clockedInEssentials.timecardBreaks, null, null, 12);
                            String format2 = calculateEarnedWage$default != null ? moneyFormatter.format(calculateEarnedWage$default) : androidStringManager7.get(R.string.work_pay_home_placeholder);
                            Long l = ((ClockInEssentials.ClockedInEssentials) clockInEssentials).timecard.clockin_timestamp_ms;
                            if (l == null) {
                                throw new IllegalStateException("ClockedIn timecard missing clockin_timestamp_ms");
                            }
                            long longValue = l.longValue();
                            List mapBreakItems = markwonConfiguration.mapBreakItems(((ClockInEssentials.ClockedInEssentials) clockInEssentials).breakDefinitions);
                            ClockInEssentials.ClockedInEssentials clockedInEssentials2 = (ClockInEssentials.ClockedInEssentials) clockInEssentials;
                            Timecard timecard = clockedInEssentials2.timecard;
                            try {
                                String str12 = timecard.clockin_unit_token;
                                if (str12 != null && clockedInEssentials2.clockInControls.get(str12).isCashTipEnabled) {
                                    EmployeeJobInfo employeeJobInfo = timecard.employee_job_info;
                                }
                                z = false;
                                String currencySymbol = moneyFormatter.currencySymbol(currencyCode);
                                String name2 = currencyCode.name();
                                if ((112 & 8) != 0) {
                                    mapBreakItems = EmptyList.INSTANCE;
                                }
                                if ((112 & 64) == 0) {
                                    currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 = null;
                                }
                                boolean z7 = (112 & 128) != 0 ? false : z;
                                if ((112 & 256) != 0) {
                                    currencySymbol = "$";
                                }
                                String str13 = currencySymbol;
                                if ((112 & 512) != 0) {
                                    name2 = "USD";
                                }
                                loading = new ClockInOverlayViewModel.Loaded.ClockedIn(sellerCardViewModel, format2, longValue, mapBreakItems, false, false, currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0, z7, str13, name2);
                            } catch (IllegalStateException e3) {
                                e = e3;
                                androidStringManager3 = null;
                                z3 = false;
                                Timber.Forest.e("Failed to map clock-in overlay", new Object[0], e);
                                loading = new ClockInOverlayViewModel.Error(sellerCardViewModel);
                                androidStringManager4 = androidStringManager3;
                                boolean booleanValue4 = ((Boolean) mutableState5.getValue()).booleanValue();
                                ToastState toastState = (ToastState) mutableState6.getValue();
                                if (loading instanceof ClockInOverlayViewModel.Loaded.ClockedOut) {
                                }
                                loading = onBreak;
                                obj4 = null;
                                obj3 = loading;
                                obj5 = obj4;
                                mutableState3.setValue(obj3);
                                MutableState rememberUpdatedState = Updater.rememberUpdatedState(obj3, gapComposer);
                                ClockInEssentialsState clockInEssentialsState3 = (ClockInEssentialsState) collectAsState.getValue();
                                GapComposer gapComposer4 = gapComposer;
                                Updater.LaunchedEffect(gapComposer4, flow, new LocalAddBrandsPresenter$models$2$1(flow, (Continuation) null, this, coroutineScope, sellerCardViewModel, mutableState7, mutableState6, rememberUpdatedState, Updater.rememberUpdatedState(clockInEssentialsState3 instanceof ClockInEssentials ? (ClockInEssentials) clockInEssentialsState3 : obj5, gapComposer), mutableState5, mutableState, mutableState10));
                                gapComposer4.end(z3);
                                return obj3;
                            }
                        } catch (IllegalStateException e4) {
                            e = e4;
                        }
                    } else {
                        try {
                        } catch (IllegalStateException e5) {
                            e = e5;
                            androidStringManager3 = androidStringManager2;
                            z3 = false;
                            Timber.Forest.e("Failed to map clock-in overlay", new Object[0], e);
                            loading = new ClockInOverlayViewModel.Error(sellerCardViewModel);
                            androidStringManager4 = androidStringManager3;
                            boolean booleanValue42 = ((Boolean) mutableState5.getValue()).booleanValue();
                            ToastState toastState2 = (ToastState) mutableState6.getValue();
                            if (loading instanceof ClockInOverlayViewModel.Loaded.ClockedOut) {
                            }
                            loading = onBreak;
                            obj4 = null;
                            obj3 = loading;
                            obj5 = obj4;
                            mutableState3.setValue(obj3);
                            MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(obj3, gapComposer);
                            ClockInEssentialsState clockInEssentialsState32 = (ClockInEssentialsState) collectAsState.getValue();
                            GapComposer gapComposer42 = gapComposer;
                            Updater.LaunchedEffect(gapComposer42, flow, new LocalAddBrandsPresenter$models$2$1(flow, (Continuation) null, this, coroutineScope, sellerCardViewModel, mutableState7, mutableState6, rememberUpdatedState2, Updater.rememberUpdatedState(clockInEssentialsState32 instanceof ClockInEssentials ? (ClockInEssentials) clockInEssentialsState32 : obj5, gapComposer), mutableState5, mutableState, mutableState10));
                            gapComposer42.end(z3);
                            return obj3;
                        }
                        if (!(clockInEssentials instanceof ClockInEssentials.OnBreakEssentials)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ClockInEssentials.OnBreakEssentials onBreakEssentials = (ClockInEssentials.OnBreakEssentials) clockInEssentials;
                        Money calculateEarnedWage$default2 = Pool.calculateEarnedWage$default(pool, onBreakEssentials.timecard, onBreakEssentials.timecardBreaks, onBreakEssentials.timecardBreak, null, 8);
                        String format3 = calculateEarnedWage$default2 != null ? moneyFormatter.format(calculateEarnedWage$default2) : androidStringManager7.get(R.string.work_pay_home_placeholder);
                        Long l2 = ((ClockInEssentials.OnBreakEssentials) clockInEssentials).timecardBreak.start_timestamp_seconds;
                        if (l2 == null) {
                            throw new IllegalStateException("On-break timecard break missing start_timestamp_seconds");
                        }
                        long longValue2 = l2.longValue() * 1000;
                        ClockInEssentials.OnBreakEssentials onBreakEssentials2 = (ClockInEssentials.OnBreakEssentials) clockInEssentials;
                        ClockInControls clockInControls3 = onBreakEssentials2.clockInControls;
                        TimecardBreak timecardBreak = onBreakEssentials2.timecardBreak;
                        Long l3 = timecardBreak.start_timestamp_seconds;
                        if (l3 != null) {
                            long longValue3 = l3.longValue();
                            char c3 = 'p';
                            c = c3;
                            if (!clockInControls3.hasOverridePermission) {
                                c = c3;
                                if (clockInControls3.canEnforceEarlyBreakCompletion) {
                                    String str14 = onBreakEssentials2.timecard.clockin_unit_token;
                                    if (str14 == null) {
                                        c = c3;
                                    } else if (clockInControls3.get(str14).isEndBreakEarlyBlocked) {
                                        Integer num = timecardBreak.minimum_duration_seconds;
                                        if (num != null) {
                                            str6 = format3;
                                            j = num.intValue();
                                        } else {
                                            str6 = format3;
                                            j = 0;
                                        }
                                        instant3 = Instant.ofEpochSecond(longValue3).plusSeconds(j);
                                        c2 = c3;
                                        androidStringManager5 = null;
                                        loading = new ClockInOverlayViewModel.Loaded.OnBreak(sellerCardViewModel, str6, longValue2, (c2 & '\b') == 0 ? null : instant3 == null ? Long.valueOf(instant3.toEpochMilli()) : null, false, null, (c2 & '@') == 0 ? currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 : null);
                                        z3 = false;
                                        androidStringManager4 = androidStringManager5;
                                        boolean booleanValue422 = ((Boolean) mutableState5.getValue()).booleanValue();
                                        ToastState toastState22 = (ToastState) mutableState6.getValue();
                                        if (loading instanceof ClockInOverlayViewModel.Loaded.ClockedOut) {
                                            ClockInOverlayViewModel.Loaded.ClockedOut clockedOut = (ClockInOverlayViewModel.Loaded.ClockedOut) loading;
                                            SellerCardViewModel sellerCardViewModel2 = clockedOut.sellerCard;
                                            ClockInOverlayViewModel.ShiftScheduleDisplay shiftScheduleDisplay = clockedOut.shiftSchedule;
                                            List list2 = clockedOut.locations;
                                            List list3 = clockedOut.jobs;
                                            boolean z8 = clockedOut.shouldSendShiftToken;
                                            String str15 = clockedOut.geofenceReasonText;
                                            String str16 = clockedOut.geofenceSettingsLinkText;
                                            boolean z9 = clockedOut.isGeofenceLoading;
                                            boolean z10 = clockedOut.isGeofenceAllowed;
                                            sellerCardViewModel2.getClass();
                                            list2.getClass();
                                            list3.getClass();
                                            onBreak = new ClockInOverlayViewModel.Loaded.ClockedOut(sellerCardViewModel2, shiftScheduleDisplay, list2, list3, z8, str15, str16, z9, z10, booleanValue422);
                                        } else if (loading instanceof ClockInOverlayViewModel.Loaded.ClockedIn) {
                                            ClockInOverlayViewModel.Loaded.ClockedIn clockedIn = (ClockInOverlayViewModel.Loaded.ClockedIn) loading;
                                            SellerCardViewModel sellerCardViewModel3 = clockedIn.sellerCard;
                                            String str17 = clockedIn.wagesText;
                                            long j2 = clockedIn.elapsedTimeStartMillis;
                                            List list4 = clockedIn.breakItems;
                                            boolean z11 = clockedIn.isClockOutLoading;
                                            CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 currentTimeMillisProvider$Companion$$ExternalSyntheticLambda02 = clockedIn.currentTimeMillisProvider;
                                            boolean z12 = clockedIn.shouldDeclareCashTips;
                                            String str18 = clockedIn.currencySymbol;
                                            String str19 = clockedIn.currencyCode;
                                            sellerCardViewModel3.getClass();
                                            str17.getClass();
                                            list4.getClass();
                                            currentTimeMillisProvider$Companion$$ExternalSyntheticLambda02.getClass();
                                            str18.getClass();
                                            str19.getClass();
                                            onBreak = new ClockInOverlayViewModel.Loaded.ClockedIn(sellerCardViewModel3, str17, j2, list4, z11, booleanValue422, currentTimeMillisProvider$Companion$$ExternalSyntheticLambda02, z12, str18, str19);
                                        } else if (loading instanceof ClockInOverlayViewModel.Loaded.OnBreak) {
                                            ClockInOverlayViewModel.Loaded.OnBreak onBreak2 = (ClockInOverlayViewModel.Loaded.OnBreak) loading;
                                            SellerCardViewModel sellerCardViewModel4 = onBreak2.sellerCard;
                                            String str20 = onBreak2.wagesText;
                                            long j3 = onBreak2.elapsedTimeStartMillis;
                                            Long l4 = onBreak2.endBreakEnabledAtMillis;
                                            CurrentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 currentTimeMillisProvider$Companion$$ExternalSyntheticLambda03 = onBreak2.currentTimeMillisProvider;
                                            sellerCardViewModel4.getClass();
                                            str20.getClass();
                                            currentTimeMillisProvider$Companion$$ExternalSyntheticLambda03.getClass();
                                            onBreak = new ClockInOverlayViewModel.Loaded.OnBreak(sellerCardViewModel4, str20, j3, l4, booleanValue422, toastState22, currentTimeMillisProvider$Companion$$ExternalSyntheticLambda03);
                                        } else if (loading instanceof ClockInOverlayViewModel.Loaded.ClockedOutSummary) {
                                            obj4 = null;
                                            loading = ClockInOverlayViewModel.Loaded.ClockedOutSummary.copy$default((ClockInOverlayViewModel.Loaded.ClockedOutSummary) loading, null, booleanValue422, null, 47);
                                        } else {
                                            obj4 = null;
                                            if (!(loading instanceof ClockInOverlayViewModel.Loading) && !(loading instanceof ClockInOverlayViewModel.Error)) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return androidStringManager4;
                                            }
                                        }
                                        loading = onBreak;
                                        obj4 = null;
                                    } else {
                                        c = c3;
                                    }
                                }
                            }
                        } else {
                            c = 'p';
                        }
                        str6 = format3;
                        instant3 = null;
                        c2 = c;
                        androidStringManager5 = null;
                        loading = new ClockInOverlayViewModel.Loaded.OnBreak(sellerCardViewModel, str6, longValue2, (c2 & '\b') == 0 ? null : instant3 == null ? Long.valueOf(instant3.toEpochMilli()) : null, false, null, (c2 & '@') == 0 ? currentTimeMillisProvider$Companion$$ExternalSyntheticLambda0 : null);
                        z3 = false;
                        androidStringManager4 = androidStringManager5;
                        boolean booleanValue4222 = ((Boolean) mutableState5.getValue()).booleanValue();
                        ToastState toastState222 = (ToastState) mutableState6.getValue();
                        if (loading instanceof ClockInOverlayViewModel.Loaded.ClockedOut) {
                        }
                        loading = onBreak;
                        obj4 = null;
                    }
                }
                androidStringManager5 = null;
                z3 = false;
                androidStringManager4 = androidStringManager5;
                boolean booleanValue42222 = ((Boolean) mutableState5.getValue()).booleanValue();
                ToastState toastState2222 = (ToastState) mutableState6.getValue();
                if (loading instanceof ClockInOverlayViewModel.Loaded.ClockedOut) {
                }
                loading = onBreak;
                obj4 = null;
            } else {
                sellerCardViewModel = collectSelectedMerchantViewModel;
                Object obj23 = str4;
                z3 = false;
                if (clockInEssentialsState2 instanceof ClockInEssentialsState.Error) {
                    loading = new ClockInOverlayViewModel.Error(sellerCardViewModel);
                    obj4 = obj23;
                } else {
                    if (!(clockInEssentialsState2 instanceof ClockInEssentialsState.Loading)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Object obj24 = (ClockInOverlayViewModel) mutableState3.getValue();
                    if (!(obj24 instanceof ClockInOverlayViewModel.Loaded)) {
                        obj24 = obj23;
                    }
                    if (obj24 == null) {
                        loading = new ClockInOverlayViewModel.Loading(sellerCardViewModel);
                        obj4 = obj23;
                    } else {
                        obj3 = obj24;
                        obj5 = obj23;
                    }
                }
            }
            obj3 = loading;
            obj5 = obj4;
        }
        mutableState3.setValue(obj3);
        MutableState rememberUpdatedState22 = Updater.rememberUpdatedState(obj3, gapComposer);
        ClockInEssentialsState clockInEssentialsState322 = (ClockInEssentialsState) collectAsState.getValue();
        GapComposer gapComposer422 = gapComposer;
        Updater.LaunchedEffect(gapComposer422, flow, new LocalAddBrandsPresenter$models$2$1(flow, (Continuation) null, this, coroutineScope, sellerCardViewModel, mutableState7, mutableState6, rememberUpdatedState22, Updater.rememberUpdatedState(clockInEssentialsState322 instanceof ClockInEssentials ? (ClockInEssentials) clockInEssentialsState322 : obj5, gapComposer), mutableState5, mutableState, mutableState10));
        gapComposer422.end(z3);
        return obj3;
    }

    public static /* synthetic */ Object submit$default(CardLockPresenter cardLockPresenter, SubmitSetPaycheckMultiAllocationRequest.SubmitAll submitAll, SubmitSetPaycheckMultiAllocationRequest.Disable disable, SubmitSetPaycheckMultiAllocationRequest.Cancel cancel, SubmitSetPaycheckMultiAllocationRequest.SubmitSingle submitSingle, boolean z, SuspendLambda suspendLambda, int i) {
        if ((i & 1) != 0) {
            submitAll = null;
        }
        if ((i & 2) != 0) {
            disable = null;
        }
        if ((i & 4) != 0) {
            cancel = null;
        }
        if ((i & 8) != 0) {
            submitSingle = null;
        }
        return cardLockPresenter.submit(submitAll, disable, cancel, submitSingle, z, suspendLambda);
    }

    public static Money sumOfAmount(List list) {
        CurrencyCode currencyCode;
        Long l;
        List list2 = list;
        Iterator it = list2.iterator();
        long j = 0;
        while (it.hasNext()) {
            Money money = ((PaymentUpdate) it.next()).amount;
            j += (money == null || (l = money.amount) == null) ? 0L : l.longValue();
        }
        Iterator it2 = list2.iterator();
        do {
            currencyCode = null;
            if (!it2.hasNext()) {
                break;
            }
            Money money2 = ((PaymentUpdate) it2.next()).amount;
            if (money2 != null) {
                currencyCode = money2.currency_code;
            }
        } while (currencyCode == null);
        return new Money(Long.valueOf(j), currencyCode, 4);
    }

    public static SegmentedBarChartViewModel toSegmentedBarChartViewModel(SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph verticalStackedBarGraph) {
        SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Bar bar = (SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Bar) CollectionsKt.last((List) verticalStackedBarGraph.bars);
        ArrayList<SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Bar> arrayList = verticalStackedBarGraph.bars;
        Iterator it = arrayList.iterator();
        SegmentedBarChartViewModel.Legend legend = null;
        if (!it.hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        Iterator it2 = ((SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Bar) it.next()).items.iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Bar.BarItem) it2.next()).value;
        }
        while (it.hasNext()) {
            Iterator it3 = ((SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Bar) it.next()).items.iterator();
            long j2 = 0;
            while (it3.hasNext()) {
                j2 += ((SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Bar.BarItem) it3.next()).value;
            }
            if (j < j2) {
                j = j2;
            }
        }
        String str = bar.headerText;
        String str2 = bar.subtitleText;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Bar bar2 : arrayList) {
            ArrayList arrayList3 = bar2.items;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                float f = r10.value / j;
                Color color = ((SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Bar.BarItem) it4.next()).color;
                if (Float.isNaN(f)) {
                    f = RecyclerView.DECELERATION_RATE;
                }
                arrayList4.add(new SegmentedBarChartViewModel.Category.Segment(f, color));
            }
            arrayList2.add(new SegmentedBarChartViewModel.Category(arrayList4, new SegmentedBarChartViewModel$ChartLabel$DefaultLabel(bar2.categoryText, bar2.valueText, null, 4), (String) null, (String) null, bar2.equals(bar), bar2.accessibilityText, 76));
        }
        SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph.Legend legend2 = verticalStackedBarGraph.legend;
        if (legend2 != null) {
            ArrayList<ColoredText> arrayList5 = legend2.labels;
            if (!arrayList5.isEmpty()) {
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                for (ColoredText coloredText : arrayList5) {
                    arrayList6.add(new SegmentedBarChartViewModel.Legend.Label(coloredText.color, coloredText.text));
                }
                legend = new SegmentedBarChartViewModel.Legend(arrayList6);
            }
        }
        return new SegmentedBarChartViewModel(str, str2, arrayList2, legend, null, 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[LOOP:1: B:9:0x002a->B:20:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList updateAllocations(AllocationGroupWithPercentage allocationGroupWithPercentage, long j, long j2, boolean z, Function1 function1) {
        List list = allocationGroupWithPercentage.allocations;
        ArrayList arrayList = new ArrayList(list);
        long j3 = j;
        while (true) {
            long j4 = 0;
            if (j3 == 0) {
                return arrayList;
            }
            IntProgression intProgression = (IntProgression) function1.invoke(list);
            int i = intProgression.first;
            int i2 = intProgression.last;
            int i3 = intProgression.step;
            if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
                while (true) {
                    MultipleAllocationBlocker.Allocation allocation = (MultipleAllocationBlocker.Allocation) arrayList.get(i);
                    if (j3 != j4) {
                        long min = Math.min(100L, j3);
                        if (z) {
                            long j5 = allocation.destination.shareInBasisPoints;
                            if (j5 + min > j2) {
                                min = j2 - j5;
                                long j6 = !z ? min : -min;
                                PaycheckAllocationDistribution.DestinationAndShare destinationAndShare = allocation.destination;
                                arrayList.set(i, MultipleAllocationBlocker.Allocation.copy$default(allocation, PaycheckAllocationDistribution.DestinationAndShare.copy$default(destinationAndShare, destinationAndShare.shareInBasisPoints + j6)));
                                j3 -= min;
                                if (i == i2) {
                                    i += i3;
                                    j4 = 0;
                                }
                            }
                        }
                        if (!z) {
                            long j7 = allocation.destination.shareInBasisPoints;
                            if (j7 - min < j2) {
                                min = j7 - j2;
                            }
                        }
                        if (!z) {
                        }
                        PaycheckAllocationDistribution.DestinationAndShare destinationAndShare2 = allocation.destination;
                        arrayList.set(i, MultipleAllocationBlocker.Allocation.copy$default(allocation, PaycheckAllocationDistribution.DestinationAndShare.copy$default(destinationAndShare2, destinationAndShare2.shareInBasisPoints + j6)));
                        j3 -= min;
                        if (i == i2) {
                            break;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultipleAllocationViewModel.Active createActiveModel(List list, boolean z) {
        MultipleAllocationViewModel.Active.Action prominent;
        MultipleAllocationViewModel.Active.Action standardDisabled;
        Iterator it;
        Iterator it2;
        BottomSheet bottomSheet;
        DistributionWheelViewModel.Allocation.Treatment treatment;
        DistributionWheelViewModel.Allocation allocationGroup;
        MultipleAllocationViewEvent openSingleAllocationEditor;
        CurrencyCode currencyCode;
        List list2 = list;
        Lazy lazy = (Lazy) this.deviceLockAnimationBus;
        ArrayList group = ColorResources_androidKt.group(list2);
        AllocationGroupWithPercentage selectedGroup = ColorResources_androidKt.selectedGroup(group);
        float percentageBps = selectedGroup.getPercentageBps() / 10000.0f;
        MultipleAllocationBlocker multipleAllocationBlocker = (MultipleAllocationBlocker) this.ioDispatcher;
        String str = multipleAllocationBlocker.title;
        BottomSheet bottomSheet2 = multipleAllocationBlocker.explanation;
        String str2 = ((SetPaycheckMultipleAllocationScreen) this.args).blockersData.flowToken;
        long percentageBps2 = selectedGroup.getPercentageBps();
        List list3 = selectedGroup.allocations;
        Integer valueOf = Integer.valueOf((int) percentageBps2);
        Money money = multipleAllocationBlocker.averageMonthlyPaycheck;
        MultipleAllocationBlocker.ActionConfig actionConfig = multipleAllocationBlocker.callToAction;
        String str3 = actionConfig.submitActionText;
        List list4 = list3;
        PaychecksManageDistributionSubmitMultiAllocation paychecksManageDistributionSubmitMultiAllocation = new PaychecksManageDistributionSubmitMultiAllocation(valueOf, Integer.valueOf((int) Moneys.amount(money != null ? Moneys.percent(money, selectedGroup.getPercentageBps() / 10000.0f) : null)), str2, (money == null || (currencyCode = money.currency_code) == null) ? null : currencyCode.name(), CollectionsKt.joinToString$default(list4, "|", null, null, 0, null, new HelpSheetViewKt$$ExternalSyntheticLambda4(4), 30), CollectionsKt.joinToString$default(list4, "|", null, null, 0, null, new HelpSheetViewKt$$ExternalSyntheticLambda4(5), 30));
        List<MultipleAllocationBlocker.Allocation> list5 = list2;
        long j = 0;
        for (MultipleAllocationBlocker.Allocation allocation : list5) {
            allocation.getClass();
            j += allocation.editability instanceof MultipleAllocationBlocker.Allocation.Editable ? allocation.destination.shareInBasisPoints : 0L;
        }
        if (j > 0) {
            standardDisabled = new MultipleAllocationViewModel.Active.Action.Prominent(str3, new MultipleAllocationViewEvent.Submit.SubmitAllocations(list2, paychecksManageDistributionSubmitMultiAllocation));
        } else {
            MultipleAllocationBlocker.ZeroAllocationBehavior zeroAllocationBehavior = multipleAllocationBlocker.zeroAllocationBehavior;
            if (!zeroAllocationBehavior.equals(MultipleAllocationBlocker.ZeroAllocationBehavior.RequireAtLeastOnePercentAllocation.INSTANCE)) {
                if (!zeroAllocationBehavior.equals(MultipleAllocationBlocker.ZeroAllocationBehavior.ShowDisableCta.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                prominent = new MultipleAllocationViewModel.Active.Action.Prominent(actionConfig.disableActionText, new MultipleAllocationViewEvent.Submit.DisableAllocations(list2, paychecksManageDistributionSubmitMultiAllocation));
                NumberFormat numberFormat = (NumberFormat) lazy.getValue();
                numberFormat.getClass();
                AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                it = list4.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    MultipleAllocationBlocker.Allocation allocation2 = (MultipleAllocationBlocker.Allocation) next;
                    int intValue = ((Number) selectedGroup.distributionIndicesLookup.get(i)).intValue();
                    Iterator it3 = it;
                    MultipleAllocationViewModel.Active.Action action = prominent;
                    boolean z2 = allocation2.destination.shareInBasisPoints == 0 && selectedGroup.getPercentageBps() > 0;
                    MultipleAllocationBlocker.Allocation.Editability editability = allocation2.editability;
                    editability.getClass();
                    MultipleAllocationBlocker.Allocation.Editable editable = (MultipleAllocationBlocker.Allocation.Editable) editability;
                    String str4 = editable.displayName;
                    AllocationGroupWithPercentage allocationGroupWithPercentage = selectedGroup;
                    ArrayMap m = zzel$EnumUnboxingLocalUtility.m(1, "destination", str4);
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    AndroidStringManager androidStringManager2 = androidStringManager;
                    String format2 = new MessageFormat(resources.getString(R.string.multiple_allocations_tap_allocation_row_accessibility_label)).format(m);
                    format2.getClass();
                    Color color = allocation2.color;
                    String format3 = numberFormat.format(Float.valueOf(allocation2.destination.shareInBasisPoints / 10000.0f));
                    format3.getClass();
                    int ordinal = editable.selectionBehavior.ordinal();
                    if (ordinal == 0) {
                        openSingleAllocationEditor = new MultipleAllocationViewEvent.OpenSingleAllocationEditor(format2, list2, intValue);
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        openSingleAllocationEditor = new MultipleAllocationViewEvent.Submit.SubmitSingleAllocation(format2, list2, intValue);
                    }
                    arrayList.add(new MultipleAllocationViewModel.Active.AllocationRow(color, str4, format3, z2, openSingleAllocationEditor));
                    i = i2;
                    prominent = action;
                    it = it3;
                    selectedGroup = allocationGroupWithPercentage;
                    androidStringManager = androidStringManager2;
                }
                MultipleAllocationViewModel.Active.Action action2 = prominent;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(group, 10));
                it2 = group.iterator();
                while (it2.hasNext()) {
                    AllocationGroupWithPercentage allocationGroupWithPercentage2 = (AllocationGroupWithPercentage) it2.next();
                    List list6 = allocationGroupWithPercentage2.allocations;
                    List list7 = allocationGroupWithPercentage2.allocations;
                    MultipleAllocationBlocker.Allocation allocation3 = (MultipleAllocationBlocker.Allocation) CollectionsKt.singleOrNull(list6);
                    if (allocation3 != null) {
                        allocationGroup = MultipleAllocationPresenterKt.toViewModel(allocation3, list2);
                    } else {
                        List list8 = list7;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                        Iterator it4 = list8.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(MultipleAllocationPresenterKt.toViewModel((MultipleAllocationBlocker.Allocation) it4.next(), list2));
                        }
                        MultipleAllocationBlocker.Allocation allocation4 = (MultipleAllocationBlocker.Allocation) CollectionsKt.first(list7);
                        if (allocation4.interactable) {
                            MultipleAllocationBlocker.Allocation.Editability editability2 = allocation4.editability;
                            if (editability2 instanceof MultipleAllocationBlocker.Allocation.Editable) {
                                treatment = new DistributionWheelViewModel.Allocation.Treatment.InteractableSelected(UtilsKt.forceToWholePercentage(UtilsKt.maxAllocationFor((MultipleAllocationBlocker.Allocation) CollectionsKt.first(list7), CollectionsKt.minus((Iterable) list5, (Iterable) CollectionsKt.toSet(list7)), new HelpSheetViewKt$$ExternalSyntheticLambda4(11), new HelpSheetViewKt$$ExternalSyntheticLambda4(12))));
                            } else {
                                if (!(editability2 instanceof MultipleAllocationBlocker.Allocation.NotEditable)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                treatment = DistributionWheelViewModel.Allocation.Treatment.InteractableNotSelected.INSTANCE;
                            }
                        } else {
                            treatment = DistributionWheelViewModel.Allocation.Treatment.Default.INSTANCE;
                        }
                        allocationGroup = new DistributionWheelViewModel.AllocationGroup(treatment, arrayList3);
                    }
                    arrayList2.add(allocationGroup);
                    list2 = list;
                }
                String format4 = ((NumberFormat) lazy.getValue()).format(Float.valueOf(percentageBps));
                format4.getClass();
                DistributionWheelViewModel distributionWheelViewModel = new DistributionWheelViewModel(arrayList2, new DistributionWheelViewModel.Content.MultipleAllocationsScreen(format4, money == null ? ((MoneyFormatter) this.flowNavigationHelper).format(Moneys.percent(money, percentageBps)) : null, bottomSheet2 == null), 82);
                MultipleAllocationViewModel.Active.InfoButton infoButton = bottomSheet2 == null ? new MultipleAllocationViewModel.Active.InfoButton() : null;
                if (z) {
                    bottomSheet = null;
                } else {
                    bottomSheet2.getClass();
                    bottomSheet = bottomSheet2;
                }
                return new MultipleAllocationViewModel.Active(str, action2, distributionWheelViewModel, arrayList, infoButton, bottomSheet, new EducationalSheetKt$$ExternalSyntheticLambda8(this, group, z));
            }
            standardDisabled = new MultipleAllocationViewModel.Active.Action.StandardDisabled(str3);
        }
        prominent = standardDisabled;
        NumberFormat numberFormat2 = (NumberFormat) lazy.getValue();
        numberFormat2.getClass();
        AndroidStringManager androidStringManager3 = (AndroidStringManager) this.stringManager;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
        it = list4.iterator();
        int i3 = 0;
        while (it.hasNext()) {
        }
        MultipleAllocationViewModel.Active.Action action22 = prominent;
        ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(group, 10));
        it2 = group.iterator();
        while (it2.hasNext()) {
        }
        String format42 = ((NumberFormat) lazy.getValue()).format(Float.valueOf(percentageBps));
        format42.getClass();
        DistributionWheelViewModel distributionWheelViewModel2 = new DistributionWheelViewModel(arrayList22, new DistributionWheelViewModel.Content.MultipleAllocationsScreen(format42, money == null ? ((MoneyFormatter) this.flowNavigationHelper).format(Moneys.percent(money, percentageBps)) : null, bottomSheet2 == null), 82);
        if (bottomSheet2 == null) {
        }
        if (z) {
        }
        return new MultipleAllocationViewModel.Active(str, action22, distributionWheelViewModel2, arrayList4, infoButton, bottomSheet, new EducationalSheetKt$$ExternalSyntheticLambda8(this, group, z));
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        switch (this.$r8$classId) {
            case 5:
                return (ErrorReporter) this.flowNavigationHelper;
            case 8:
                return (ErrorReporter) this.flowNavigationHelper;
            default:
                return (ErrorReporter) this.franklinAppService;
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        int i = this.$r8$classId;
        Object obj = this.deviceLockAnimationBus;
        switch (i) {
            case 5:
                return (SampleStrategy) obj;
            case 8:
                return (SampleStrategy) obj;
            default:
                return (SampleStrategy) this.flowStarter;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0d61  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0d8c  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0d8f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0d70  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0272 A[Catch: DateTimeException -> 0x026c, TryCatch #2 {DateTimeException -> 0x026c, blocks: (B:69:0x024f, B:75:0x0272, B:77:0x0282, B:79:0x0286, B:84:0x0291, B:85:0x029b), top: B:68:0x024f }] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        DeviceLockModel deviceLockModel;
        char c;
        DeviceLockModel deviceLockModel2;
        boolean z;
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        String str5;
        Object obj;
        String str6;
        String str7;
        RecurringDepositsViewModel.BalanceBasedAddCash balanceBasedAddCash;
        RecurringDepositsViewModel.BalanceBasedAddCash.State locked;
        String str8;
        AutoReloadSettingsSettingViewed.Source source;
        AutoReloadSettingsViewed.Source source2;
        Continuation continuation;
        Object obj2;
        BitcoinAmountViewModel bitcoinAmountViewModel;
        Object obj3;
        MutableState mutableState;
        Continuation continuation2;
        Object obj4;
        SpendingInsightsHomeViewModel.Content.InsightsSection insightsSection;
        SpendingInsightsHomeViewModel.Content.InsightsSection.InsightsRow.RowIcon rowIcon;
        ShiftDetailScreen shiftDetailScreen;
        Object obj5;
        MutableState mutableState2;
        String str9;
        ShiftDetailViewModel shiftDetailViewModel;
        GapComposer gapComposer;
        GapComposer gapComposer2;
        ShiftDetailViewModel shiftDetailViewModel2;
        RealShiftTimeFormatter realShiftTimeFormatter;
        ShiftDetailViewModel.Loaded.Header header;
        ShiftDetailViewModel.Loaded.Note note;
        String str10;
        String str11;
        String str12;
        final CardLockPresenter cardLockPresenter = this;
        int i2 = cardLockPresenter.$r8$classId;
        int i3 = 5;
        Object obj6 = cardLockPresenter.cardLockFlowTypeProvider;
        Object obj7 = cardLockPresenter.analytics;
        Object obj8 = cardLockPresenter.deviceLockAnimationBus;
        Object obj9 = cardLockPresenter.franklinAppService;
        Object obj10 = cardLockPresenter.issuedCardManager;
        Object obj11 = cardLockPresenter.stringManager;
        Object obj12 = cardLockPresenter.cashAppTagManager;
        Object obj13 = cardLockPresenter.args;
        final int i4 = 1;
        Object obj14 = Composer.Companion.Empty;
        switch (i2) {
            case 0:
                AndroidStringManager androidStringManager = (AndroidStringManager) obj11;
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(770521462);
                MutableState collectAsState = Updater.collectAsState(((RealCashAppTagManager) obj12).getAllCashAppTags(), EmptyList.INSTANCE, null, gapComposer3, 48, 2);
                Object rememberedValue = gapComposer3.rememberedValue();
                if (rememberedValue == obj14) {
                    rememberedValue = ((RealIssuedCardManager) ((IssuedCardManager) obj10)).getIssuedCardOrNull();
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer3, 48, 2);
                Object rememberedValue2 = gapComposer3.rememberedValue();
                if (rememberedValue2 == obj14) {
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    rememberedValue2 = Updater.mutableStateOf$default(emptyMap);
                    gapComposer3.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState3 = (MutableState) rememberedValue2;
                Object rememberedValue3 = gapComposer3.rememberedValue();
                if (rememberedValue3 == obj14) {
                    EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                    emptyMap2.getClass();
                    rememberedValue3 = Updater.mutableStateOf$default(emptyMap2);
                    gapComposer3.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState4 = (MutableState) rememberedValue3;
                Object rememberedValue4 = gapComposer3.rememberedValue();
                if (rememberedValue4 == obj14) {
                    EmptyMap emptyMap3 = EmptyMap.INSTANCE;
                    emptyMap3.getClass();
                    rememberedValue4 = Updater.mutableStateOf$default(emptyMap3);
                    gapComposer3.updateRememberedValue(rememberedValue4);
                }
                MutableState mutableState5 = (MutableState) rememberedValue4;
                Object rememberedValue5 = gapComposer3.rememberedValue();
                if (rememberedValue5 == obj14) {
                    rememberedValue5 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer3);
                    gapComposer3.updateRememberedValue(rememberedValue5);
                }
                Updater.LaunchedEffect(gapComposer3, flow, new CardSchemePresenter$models$3$1(flow, (Continuation) null, cardLockPresenter, (CoroutineScope) rememberedValue5, collectAsState, mutableState3, mutableState4, mutableState5));
                IssuedCardFactory.IssuedCard issuedCard = (IssuedCardFactory.IssuedCard) collectAsState2.getValue();
                if (issuedCard != null) {
                    boolean z2 = issuedCard.isExpired;
                    Boolean bool2 = (Boolean) ((Map) mutableState5.getValue()).get("card");
                    boolean booleanValue = bool2 != null ? bool2.booleanValue() : !issuedCard.enabled;
                    String str13 = issuedCard.cardThemeName;
                    if (str13 != null) {
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        str3 = new MessageFormat(resources.getString(R.string.wallet_card_lock_name_format)).format(new Object[]{str13});
                        str3.getClass();
                    } else {
                        str3 = androidStringManager.get(R.string.wallet_card_default_name);
                    }
                    String str14 = str3;
                    boolean areEqual = Intrinsics.areEqual(((Map) mutableState3.getValue()).get("card"), Boolean.TRUE);
                    boolean z3 = issuedCard.isSponsorLocked;
                    boolean z4 = z3 || z2;
                    if (z3) {
                        str5 = androidStringManager.get(R.string.wallet_lock_status_locked_by_sponsor);
                    } else if (z2) {
                        str5 = androidStringManager.get(R.string.wallet_lock_status_expired);
                    } else {
                        str4 = booleanValue ? androidStringManager.get(R.string.wallet_lock_status_locked) : androidStringManager.get(R.string.wallet_lock_status_unlocked);
                        deviceLockModel = new DeviceLockModel("card", str14, booleanValue, areEqual, z3, z4, str4, (String) ((Map) mutableState4.getValue()).get("card"));
                    }
                    str4 = str5;
                    deviceLockModel = new DeviceLockModel("card", str14, booleanValue, areEqual, z3, z4, str4, (String) ((Map) mutableState4.getValue()).get("card"));
                } else {
                    deviceLockModel = null;
                }
                List list = (List) collectAsState.getValue();
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                for (Object obj15 : list) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    CashAppTag cashAppTag = (CashAppTag) obj15;
                    String str15 = cashAppTag.deviceId;
                    boolean z5 = cashAppTag.isExpired;
                    Boolean bool3 = cashAppTag.isLocked;
                    boolean z6 = cashAppTag.lifecycleState == CashAppTag.TagLifecycleState.PENDING_FIRST_ACTIVATION && (bool3 == null || str15 == null);
                    if (bool3 != null) {
                        z = bool3.booleanValue();
                    } else if (z6) {
                        z = false;
                    } else {
                        c = 6905;
                        deviceLockModel2 = null;
                        if (deviceLockModel2 != null) {
                            arrayList.add(deviceLockModel2);
                        }
                        i5 = i6;
                    }
                    String m = str15 == null ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i5, "pending-tag-") : str15;
                    if (str15 != null && (bool = (Boolean) ((Map) mutableState5.getValue()).get(str15)) != null) {
                        z = bool.booleanValue();
                    }
                    boolean z7 = z;
                    String str16 = cashAppTag.displayName;
                    if (str16 == null) {
                        str16 = androidStringManager.get(R.string.wallet_tag_default_name);
                    }
                    String str17 = str16;
                    boolean areEqual2 = str15 != null ? Intrinsics.areEqual(((Map) mutableState3.getValue()).get(str15), Boolean.TRUE) : false;
                    boolean z8 = cashAppTag.isSponsorLocked;
                    boolean z9 = z8 || z5 || z6 || str15 == null;
                    if (z8) {
                        str = androidStringManager.get(R.string.wallet_lock_status_locked_by_sponsor);
                        c = 6905;
                    } else {
                        if (z5) {
                            c = 6905;
                            str2 = androidStringManager.get(R.string.wallet_lock_status_expired);
                        } else {
                            c = 6905;
                            if (z6) {
                                str2 = androidStringManager.get(R.string.wallet_lock_status_inactive);
                            } else if (z7) {
                                str = androidStringManager.get(R.string.wallet_lock_status_locked);
                            } else {
                                str = androidStringManager.get(R.string.wallet_lock_status_unlocked);
                                deviceLockModel2 = new DeviceLockModel(m, str17, z7, areEqual2, z8, z9, str, str15 == null ? (String) ((Map) mutableState4.getValue()).get(str15) : null);
                                if (deviceLockModel2 != null) {
                                }
                                i5 = i6;
                            }
                        }
                        str = str2;
                    }
                    deviceLockModel2 = new DeviceLockModel(m, str17, z7, areEqual2, z8, z9, str, str15 == null ? (String) ((Map) mutableState4.getValue()).get(str15) : null);
                    if (deviceLockModel2 != null) {
                    }
                    i5 = i6;
                }
                CardLockHalfSheetScreen cardLockHalfSheetScreen = (CardLockHalfSheetScreen) obj13;
                CardLockHalfSheetModel cardLockHalfSheetModel = new CardLockHalfSheetModel(cardLockHalfSheetScreen.title, cardLockHalfSheetScreen.description, CollectionsKt.plus((Iterable) arrayList, (Collection) CollectionsKt__CollectionsKt.listOfNotNull(deviceLockModel)));
                gapComposer3.end(false);
                return cardLockHalfSheetModel;
            case 1:
                int i7 = 0;
                Analytics analytics = (Analytics) obj7;
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(256814439);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer4.changedInstance(cardLockPresenter);
                Object rememberedValue6 = gapComposer4.rememberedValue();
                if (changedInstance || rememberedValue6 == obj14) {
                    rememberedValue6 = new RecurringDepositsPresenter$models$1$1(cardLockPresenter, null, i7);
                    gapComposer4.updateRememberedValue(rememberedValue6);
                }
                Updater.LaunchedEffect(gapComposer4, unit, (Function2) rememberedValue6);
                Object rememberedValue7 = gapComposer4.rememberedValue();
                if (rememberedValue7 == obj14) {
                    n nVar = (n) obj13;
                    Object flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(((RealScheduledReloadsManager) ((ScheduledReloadsManager) nVar.b)).preferences(), ((RealInstrumentManager) nVar.c).forType(CashInstrumentType.DEBIT_CARD), new CardModelView$getActiveHeat$2$2(nVar, (Continuation) null, 3), i7);
                    gapComposer4.updateRememberedValue(flowKt__ZipKt$combine$$inlined$unsafeFlow$1);
                    rememberedValue7 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue7, null, null, gapComposer4, 48, 2);
                Object rememberedValue8 = gapComposer4.rememberedValue();
                if (rememberedValue8 == obj14) {
                    rememberedValue8 = ((RealBalanceBasedAddCashManager) obj6).preferences();
                    gapComposer4.updateRememberedValue(rememberedValue8);
                }
                MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue8, null, null, gapComposer4, 48, 2);
                Object rememberedValue9 = gapComposer4.rememberedValue();
                if (rememberedValue9 == obj14) {
                    rememberedValue9 = ((RealInstrumentManager) obj12).forType(CashInstrumentType.DEBIT_CARD);
                    gapComposer4.updateRememberedValue(rememberedValue9);
                }
                Iterator it = ((List) Updater.collectAsState((Flow) rememberedValue9, EmptyList.INSTANCE, null, gapComposer4, 48, 2).getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Instrument) obj).defaultForInstrumentType) {
                        }
                    } else {
                        obj = null;
                    }
                }
                Instrument instrument = (Instrument) obj;
                Object[] objArr = new Object[0];
                Object rememberedValue10 = gapComposer4.rememberedValue();
                if (rememberedValue10 == obj14) {
                    rememberedValue10 = new SsnViewKt$$ExternalSyntheticLambda0(5);
                    gapComposer4.updateRememberedValue(rememberedValue10);
                }
                MutableState mutableState6 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue10, gapComposer4, 48);
                if (!((Boolean) mutableState6.getValue()).booleanValue()) {
                    mutableState6.setValue(Boolean.TRUE);
                    Screen screen = ((RecurringDepositsScreen) obj9).origin;
                    if (screen != null) {
                        if (screen instanceof BalanceHomeScreen) {
                            source2 = AutoReloadSettingsViewed.Source.BALANCE;
                        } else if (screen instanceof MoneyTabScreen) {
                            source2 = AutoReloadSettingsViewed.Source.MONEY_TAB;
                        } else if (screen instanceof WalletHomeScreen) {
                            source2 = AutoReloadSettingsViewed.Source.CARD;
                        }
                        analytics.track(new AutoReloadSettingsViewed(source2), null);
                    }
                    source2 = null;
                    analytics.track(new AutoReloadSettingsViewed(source2), null);
                }
                Object[] objArr2 = new Object[0];
                Object rememberedValue11 = gapComposer4.rememberedValue();
                if (rememberedValue11 == obj14) {
                    rememberedValue11 = new SsnViewKt$$ExternalSyntheticLambda0(6);
                    gapComposer4.updateRememberedValue(rememberedValue11);
                }
                MutableState mutableState7 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue11, gapComposer4, 48);
                if (!((Boolean) mutableState7.getValue()).booleanValue()) {
                    RecurringDepositsViewModel.ScheduledAddCash scheduledAddCash = (RecurringDepositsViewModel.ScheduledAddCash) collectAsState3.getValue();
                    if ((scheduledAddCash != null ? scheduledAddCash.source : null) != null) {
                        mutableState7.setValue(Boolean.TRUE);
                        AutoReloadSettingsSettingViewed.ReloadType reloadType = AutoReloadSettingsSettingViewed.ReloadType.SCHEDULED;
                        RecurringDepositsViewModel.ScheduledAddCash scheduledAddCash2 = (RecurringDepositsViewModel.ScheduledAddCash) collectAsState3.getValue();
                        scheduledAddCash2.getClass();
                        int ordinal = scheduledAddCash2.source.ordinal();
                        if (ordinal == 0) {
                            source = AutoReloadSettingsSettingViewed.Source.SYNC_VALUE;
                        } else {
                            if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            source = AutoReloadSettingsSettingViewed.Source.PROFILE;
                        }
                        analytics.track(new AutoReloadSettingsSettingViewed(reloadType, source), null);
                    }
                }
                Object[] objArr3 = new Object[0];
                Object rememberedValue12 = gapComposer4.rememberedValue();
                if (rememberedValue12 == obj14) {
                    rememberedValue12 = new SsnViewKt$$ExternalSyntheticLambda0(7);
                    gapComposer4.updateRememberedValue(rememberedValue12);
                }
                MutableState mutableState8 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue12, gapComposer4, 48);
                if (((Boolean) mutableState8.getValue()).booleanValue() || ((BalanceBasedAddCashPreference) collectAsState4.getValue()) == null) {
                    str6 = null;
                } else {
                    mutableState8.setValue(Boolean.TRUE);
                    str6 = null;
                    analytics.track(new AutoReloadSettingsSettingViewed(AutoReloadSettingsSettingViewed.ReloadType.BALANCED_BASED, null), null);
                }
                Object rememberedValue13 = gapComposer4.rememberedValue();
                if (rememberedValue13 == obj14) {
                    rememberedValue13 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer4);
                    gapComposer4.updateRememberedValue(rememberedValue13);
                }
                String str18 = str6;
                Updater.LaunchedEffect(gapComposer4, flow, new NetworkFetcher$doFetch$fetchResult$1(flow, (Continuation) null, cardLockPresenter, (CoroutineScope) rememberedValue13, collectAsState4, collectAsState3, 19));
                RecurringDepositsViewModel.ScheduledAddCash scheduledAddCash3 = (RecurringDepositsViewModel.ScheduledAddCash) collectAsState3.getValue();
                BalanceBasedAddCashPreference balanceBasedAddCashPreference = (BalanceBasedAddCashPreference) collectAsState4.getValue();
                String str19 = instrument != null ? instrument.displayNameCompact : str18;
                str7 = str19 != null ? str19 : "";
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj11;
                String str20 = androidStringManager2.get(R.string.recurring_transfer_title);
                if (balanceBasedAddCashPreference != null) {
                    MoneyFormatter moneyFormatter = (MoneyFormatter) cardLockPresenter.flowStarter;
                    BalanceBasedAddCashPreference.State state = balanceBasedAddCashPreference.state;
                    boolean z10 = state instanceof BalanceBasedAddCashPreference.State.Enabled;
                    if (z10) {
                        BalanceBasedAddCashPreference.State.Enabled enabled = (BalanceBasedAddCashPreference.State.Enabled) state;
                        locked = new RecurringDepositsViewModel.BalanceBasedAddCash.State.Enabled(moneyFormatter.format(enabled.minimumBalance), moneyFormatter.format(enabled.incrementAmount));
                    } else if (state instanceof BalanceBasedAddCashPreference.State.Disabled) {
                        locked = RecurringDepositsViewModel.BalanceBasedAddCash.State.Disabled.INSTANCE;
                    } else {
                        if (!(state instanceof BalanceBasedAddCashPreference.State.Locked)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return str18;
                        }
                        BalanceBasedAddCashPreference.State.Locked locked2 = (BalanceBasedAddCashPreference.State.Locked) state;
                        locked = new RecurringDepositsViewModel.BalanceBasedAddCash.State.Locked(locked2.title, locked2.description, locked2.buttonText, locked2.dismissButtonText, locked2.clientRoute);
                    }
                    String str21 = balanceBasedAddCashPreference.title;
                    if (z10) {
                        BalanceBasedAddCashPreference.State.Enabled enabled2 = (BalanceBasedAddCashPreference.State.Enabled) state;
                        String format2 = moneyFormatter.format(enabled2.minimumBalance);
                        String format3 = moneyFormatter.format(enabled2.incrementAmount);
                        format2.getClass();
                        format3.getClass();
                        Object[] objArr4 = {format2, format3, str7};
                        Resources resources2 = androidStringManager2.resources;
                        resources2.getClass();
                        str8 = new MessageFormat(resources2.getString(R.string.recurring_transfer_arcade_balance_based_body)).format(objArr4);
                        str8.getClass();
                    } else {
                        str8 = balanceBasedAddCashPreference.subtitle;
                    }
                    String str22 = androidStringManager2.get(R.string.recurring_transfer_set_up_button);
                    if (z10) {
                        str22 = str18;
                    }
                    balanceBasedAddCash = new RecurringDepositsViewModel.BalanceBasedAddCash(locked, str21, str8, str22);
                } else {
                    balanceBasedAddCash = str18;
                }
                RecurringDepositsViewModel recurringDepositsViewModel = new RecurringDepositsViewModel(str20, scheduledAddCash3, balanceBasedAddCash);
                gapComposer4.end(false);
                return recurringDepositsViewModel;
            case 2:
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(180921996);
                Object rememberedValue14 = gapComposer5.rememberedValue();
                Object obj16 = rememberedValue14;
                if (rememberedValue14 == obj14) {
                    Object mutableStateOf$default = Updater.mutableStateOf$default(new BitcoinAmountBlockerPresenter$State(null, null));
                    gapComposer5.updateRememberedValue(mutableStateOf$default);
                    obj16 = mutableStateOf$default;
                }
                MutableState mutableState9 = (MutableState) obj16;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) gapComposer5.consume(LocalLifecycleOwnerKt.LocalLifecycleOwner);
                boolean changedInstance2 = gapComposer5.changedInstance(cardLockPresenter) | gapComposer5.changedInstance(lifecycleOwner);
                Object rememberedValue15 = gapComposer5.rememberedValue();
                if (changedInstance2 || rememberedValue15 == obj14) {
                    continuation = null;
                    Object setNamePresenter$models$1$1$1 = new SetNamePresenter$models$1$1$1(cardLockPresenter, lifecycleOwner, mutableState9, (Continuation) null);
                    gapComposer5.updateRememberedValue(setNamePresenter$models$1$1$1);
                    obj2 = setNamePresenter$models$1$1$1;
                } else {
                    continuation = null;
                    obj2 = rememberedValue15;
                }
                Updater.LaunchedEffect(gapComposer5, "bitcoin-amount-picker-presenter", (Function2) obj2);
                Updater.LaunchedEffect(gapComposer5, flow, new CashtagPresenter$models$2$1(flow, continuation, cardLockPresenter, 4));
                SetAmountRequest setAmountRequest = ((BitcoinAmountBlockerPresenter$State) mutableState9.getValue()).setAmountRequest;
                if (setAmountRequest != null) {
                    gapComposer5.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer5, setAmountRequest, new CashtagPresenter$models$2$1(setAmountRequest, continuation, cardLockPresenter, i3));
                    gapComposer5.end(false);
                } else {
                    gapComposer5.startReplaceGroup(-1106436997);
                    gapComposer5.end(false);
                }
                if (((BitcoinAmountBlockerPresenter$State) mutableState9.getValue()).bitcoinAmountModel != null) {
                    BitcoinAmountBlockerPresenter$State bitcoinAmountBlockerPresenter$State = (BitcoinAmountBlockerPresenter$State) mutableState9.getValue();
                    BlockersScreens.BitcoinAmountScreen bitcoinAmountScreen = (BlockersScreens.BitcoinAmountScreen) obj12;
                    String str23 = bitcoinAmountScreen.subtitle;
                    boolean z11 = str23.length() > 0;
                    BitcoinAmountViewModel bitcoinAmountViewModel2 = bitcoinAmountBlockerPresenter$State.bitcoinAmountModel;
                    bitcoinAmountViewModel2.getClass();
                    boolean z12 = bitcoinAmountBlockerPresenter$State.setAmountRequest != null;
                    String str24 = bitcoinAmountScreen.title;
                    String str25 = bitcoinAmountScreen.buttonLabel;
                    BitcoinKeypadModel bitcoinKeypadModel = bitcoinAmountBlockerPresenter$State.bitcoinAmountModel.keypadModel;
                    if (!z11) {
                        str23 = bitcoinKeypadModel.subtitle;
                    }
                    bitcoinAmountViewModel = BitcoinAmountViewModel.copy$default(bitcoinAmountViewModel2, z12, str24, z11, str25, BitcoinKeypadModel.copy$default(bitcoinKeypadModel, str23, null, 62), 417);
                } else {
                    bitcoinAmountViewModel = (BitcoinAmountViewModel) obj8;
                }
                gapComposer5.end(false);
                return bitcoinAmountViewModel;
            case 3:
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) cardLockPresenter.flowNavigationHelper;
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(1214784250);
                Object rememberedValue16 = gapComposer6.rememberedValue();
                Object obj17 = rememberedValue16;
                if (rememberedValue16 == obj14) {
                    Object obj18 = (StateFlowImpl) cardLockPresenter.ioDispatcher;
                    gapComposer6.updateRememberedValue(obj18);
                    obj17 = obj18;
                }
                MutableState collectAsState5 = Updater.collectAsState((MutableStateFlow) obj17, (SetAddressViewModel) obj8, null, gapComposer6, 0, 2);
                Object rememberedValue17 = gapComposer6.rememberedValue();
                Continuation continuation3 = null;
                Object obj19 = rememberedValue17;
                if (rememberedValue17 == obj14) {
                    Object Channel$default = PapaEvent.Channel$default(0, null, null, 7);
                    gapComposer6.updateRememberedValue(Channel$default);
                    obj19 = Channel$default;
                }
                Channel channel = (Channel) obj19;
                Object rememberedValue18 = gapComposer6.rememberedValue();
                Object obj20 = rememberedValue18;
                if (rememberedValue18 == obj14) {
                    Object createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer6);
                    gapComposer6.updateRememberedValue(createCompositionCoroutineScope);
                    obj20 = createCompositionCoroutineScope;
                }
                CoroutineScope coroutineScope = (CoroutineScope) obj20;
                if (disclosurePresenter == null) {
                    gapComposer6.startReplaceGroup(243466275);
                    gapComposer6.end(false);
                    obj3 = null;
                } else {
                    gapComposer6.startReplaceGroup(-823430242);
                    Object rememberedValue19 = gapComposer6.rememberedValue();
                    Object obj21 = rememberedValue19;
                    if (rememberedValue19 == obj14) {
                        Object shareIn = FlowKt.shareIn(FlowKt.consumeAsFlow(channel), coroutineScope, SharingStarted.Companion.Lazily, 0);
                        gapComposer6.updateRememberedValue(shareIn);
                        obj21 = shareIn;
                    }
                    Object obj22 = (IdvViewModel) disclosurePresenter.models((Flow) obj21, (Composer) gapComposer6, 0);
                    gapComposer6.end(false);
                    obj3 = obj22;
                }
                if (disclosurePresenter == null) {
                    gapComposer6.startReplaceGroup(243589283);
                    gapComposer6.end(false);
                    mutableState = collectAsState5;
                } else {
                    gapComposer6.startReplaceGroup(243589284);
                    SetAddressViewModel setAddressViewModel = (SetAddressViewModel) collectAsState5.getValue();
                    boolean changedInstance3 = gapComposer6.changedInstance(cardLockPresenter) | gapComposer6.changed(collectAsState5) | gapComposer6.changedInstance(obj3);
                    Object rememberedValue20 = gapComposer6.rememberedValue();
                    if (changedInstance3 || rememberedValue20 == obj14) {
                        Object passcodePresenter$models$1$2 = new PasscodePresenter$models$1$2(this, obj3, collectAsState5, continuation3, 27);
                        mutableState = collectAsState5;
                        cardLockPresenter = this;
                        gapComposer6.updateRememberedValue(passcodePresenter$models$1$2);
                        rememberedValue20 = passcodePresenter$models$1$2;
                    } else {
                        mutableState = collectAsState5;
                    }
                    Updater.LaunchedEffect(setAddressViewModel, obj3, (Function2) rememberedValue20, gapComposer6);
                    Unit unit2 = Unit.INSTANCE;
                    boolean changedInstance4 = gapComposer6.changedInstance(disclosurePresenter) | gapComposer6.changedInstance(cardLockPresenter);
                    Object rememberedValue21 = gapComposer6.rememberedValue();
                    Object obj23 = rememberedValue21;
                    if (changedInstance4 || rememberedValue21 == obj14) {
                        Object ssnPresenter$models$2$2 = new SsnPresenter$models$2$2(disclosurePresenter, cardLockPresenter, continuation3, 27);
                        gapComposer6.updateRememberedValue(ssnPresenter$models$2$2);
                        obj23 = ssnPresenter$models$2$2;
                    }
                    Updater.LaunchedEffect(gapComposer6, unit2, (Function2) obj23);
                    gapComposer6.end(false);
                }
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance5 = gapComposer6.changedInstance(cardLockPresenter);
                Object rememberedValue22 = gapComposer6.rememberedValue();
                Object obj24 = rememberedValue22;
                if (changedInstance5 || rememberedValue22 == obj14) {
                    Object c00581 = new CardModelView.AnonymousClass1.C00581(cardLockPresenter, continuation3, 6);
                    gapComposer6.updateRememberedValue(c00581);
                    obj24 = c00581;
                }
                Updater.LaunchedEffect(gapComposer6, unit3, (Function2) obj24);
                Updater.LaunchedEffect(gapComposer6, flow, new SetNamePresenter$models$1$1$1(flow, continuation3, cardLockPresenter, channel, 27));
                SetAddressViewModel setAddressViewModel2 = (SetAddressViewModel) mutableState.getValue();
                gapComposer6.end(false);
                return setAddressViewModel2;
            case 4:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(505757567);
                Object rememberedValue23 = gapComposer7.rememberedValue();
                if (rememberedValue23 == obj14) {
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) obj11;
                    BlockersScreens.SetNameScreen setNameScreen = (BlockersScreens.SetNameScreen) obj13;
                    String str26 = (String) setNameScreen.namePrefill.getValue();
                    String str27 = (String) setNameScreen.titleOverride.getValue();
                    if (str27 == null) {
                        str27 = androidStringManager3.get(R.string.set_name_title);
                    }
                    String str28 = str27;
                    SetNameViewModel.NameInputProperties nameInputProperties = new SetNameViewModel.NameInputProperties(setNameScreen.maxLength, (String) setNameScreen.hintOverride.getValue(), str26);
                    boolean z13 = setNameScreen.helpItems != null ? !r2.isEmpty() : false;
                    String str29 = setNameScreen.footerText;
                    boolean z14 = setNameScreen.showBusinessName;
                    String str30 = setNameScreen.instructionLabel;
                    boolean z15 = setNameScreen.canExit;
                    if (setNameScreen.nameType != BlockersScreens.SetNameScreen.NameType.DISPLAY) {
                        androidStringManager3 = null;
                    }
                    rememberedValue23 = Updater.mutableStateOf$default(new SetNameViewModel(SetNameViewModel$Event$None.INSTANCE, nameInputProperties, z13, str28, str29, str30, z14, z15, androidStringManager3 != null ? androidStringManager3.get(R.string.set_name_button_save) : null));
                    gapComposer7.updateRememberedValue(rememberedValue23);
                }
                MutableState mutableState10 = (MutableState) rememberedValue23;
                Updater.LaunchedEffect(gapComposer7, flow, new SetNamePresenter$models$1$1$1(flow, (Continuation) null, cardLockPresenter, mutableState10));
                SetNameViewModel setNameViewModel = (SetNameViewModel) mutableState10.getValue();
                gapComposer7.end(false);
                return setNameViewModel;
            case 5:
                final int i8 = 0;
                SyncValueReader syncValueReader = (SyncValueReader) obj13;
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(-1144816116);
                Object rememberedValue24 = gapComposer8.rememberedValue();
                if (rememberedValue24 == obj14) {
                    continuation2 = null;
                    Object singleValueOrDefault = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.CardSpendingInsightsConfig, null, new Function1(cardLockPresenter) { // from class: com.squareup.cash.card.spendinginsights.presenters.SpendingInsightsHomePresenter$$ExternalSyntheticLambda0
                        public final /* synthetic */ CardLockPresenter f$0;

                        {
                            this.f$0 = cardLockPresenter;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj25) {
                            int i9 = i8;
                            CardLockPresenter cardLockPresenter2 = this.f$0;
                            switch (i9) {
                                case 0:
                                    CardSpendingInsightsConfig cardSpendingInsightsConfig = (CardSpendingInsightsConfig) obj25;
                                    cardSpendingInsightsConfig.getClass();
                                    return zzahh.toSpendingInsightsConfig(cardLockPresenter2, cardSpendingInsightsConfig);
                                default:
                                    CardSpendingInsightsHome cardSpendingInsightsHome = (CardSpendingInsightsHome) obj25;
                                    cardSpendingInsightsHome.getClass();
                                    SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
                                    try {
                                        ProtoValidationScope protoValidationScope = new ProtoValidationScope(cardSpendingInsightsHome, spendingInsightsParsingErrorFactory, cardLockPresenter2);
                                        CardSpendingInsightsHome.EntryPoint entryPoint = (CardSpendingInsightsHome.EntryPoint) protoValidationScope.reportIfNullAndContinue("entry_point", (String) null, cardSpendingInsightsHome.entry_point);
                                        SpendingInsightsHome.EntryPoint entryPoint2 = entryPoint != null ? zzahi.toEntryPoint(protoValidationScope, entryPoint) : null;
                                        CardSpendingInsightsHome.OverviewSection overviewSection = cardSpendingInsightsHome.overview_section;
                                        ProtoValidationScope.required(overviewSection, "overview_section");
                                        try {
                                            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(overviewSection, spendingInsightsParsingErrorFactory, protoValidationScope);
                                            VerticalStackedBarGraph verticalStackedBarGraph = overviewSection.vertical_stacked_bar_graph;
                                            SpendingInsightsHome.OverviewSection overviewSection2 = new SpendingInsightsHome.OverviewSection(verticalStackedBarGraph != null ? zzahi.toVerticalStackedBarGraph(protoValidationScope2, verticalStackedBarGraph) : null);
                                            CardSpendingInsightsHome.InsightsSection insightsSection2 = (CardSpendingInsightsHome.InsightsSection) protoValidationScope.reportIfNullAndContinue("insights_section", (String) null, cardSpendingInsightsHome.insights_section);
                                            return new SpendingInsightsHome(entryPoint2, overviewSection2, insightsSection2 != null ? zzahi.toInsightsSection(protoValidationScope, insightsSection2) : null);
                                        } catch (Exception e) {
                                            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightsHome.OverviewSection.class), spendingInsightsParsingErrorFactory, null);
                                        }
                                    } catch (Exception e2) {
                                        throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightsHome.class), spendingInsightsParsingErrorFactory, null);
                                    }
                            }
                        }
                    });
                    gapComposer8.updateRememberedValue(singleValueOrDefault);
                    obj4 = singleValueOrDefault;
                } else {
                    continuation2 = null;
                    obj4 = rememberedValue24;
                }
                MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) obj4, gapComposer8);
                Object rememberedValue25 = gapComposer8.rememberedValue();
                Object obj25 = rememberedValue25;
                if (rememberedValue25 == obj14) {
                    Object singleValueOrDefault2 = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.CardSpendingInsightsHome, continuation2, new Function1(cardLockPresenter) { // from class: com.squareup.cash.card.spendinginsights.presenters.SpendingInsightsHomePresenter$$ExternalSyntheticLambda0
                        public final /* synthetic */ CardLockPresenter f$0;

                        {
                            this.f$0 = cardLockPresenter;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj252) {
                            int i9 = i4;
                            CardLockPresenter cardLockPresenter2 = this.f$0;
                            switch (i9) {
                                case 0:
                                    CardSpendingInsightsConfig cardSpendingInsightsConfig = (CardSpendingInsightsConfig) obj252;
                                    cardSpendingInsightsConfig.getClass();
                                    return zzahh.toSpendingInsightsConfig(cardLockPresenter2, cardSpendingInsightsConfig);
                                default:
                                    CardSpendingInsightsHome cardSpendingInsightsHome = (CardSpendingInsightsHome) obj252;
                                    cardSpendingInsightsHome.getClass();
                                    SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
                                    try {
                                        ProtoValidationScope protoValidationScope = new ProtoValidationScope(cardSpendingInsightsHome, spendingInsightsParsingErrorFactory, cardLockPresenter2);
                                        CardSpendingInsightsHome.EntryPoint entryPoint = (CardSpendingInsightsHome.EntryPoint) protoValidationScope.reportIfNullAndContinue("entry_point", (String) null, cardSpendingInsightsHome.entry_point);
                                        SpendingInsightsHome.EntryPoint entryPoint2 = entryPoint != null ? zzahi.toEntryPoint(protoValidationScope, entryPoint) : null;
                                        CardSpendingInsightsHome.OverviewSection overviewSection = cardSpendingInsightsHome.overview_section;
                                        ProtoValidationScope.required(overviewSection, "overview_section");
                                        try {
                                            ProtoValidationScope protoValidationScope2 = new ProtoValidationScope(overviewSection, spendingInsightsParsingErrorFactory, protoValidationScope);
                                            VerticalStackedBarGraph verticalStackedBarGraph = overviewSection.vertical_stacked_bar_graph;
                                            SpendingInsightsHome.OverviewSection overviewSection2 = new SpendingInsightsHome.OverviewSection(verticalStackedBarGraph != null ? zzahi.toVerticalStackedBarGraph(protoValidationScope2, verticalStackedBarGraph) : null);
                                            CardSpendingInsightsHome.InsightsSection insightsSection2 = (CardSpendingInsightsHome.InsightsSection) protoValidationScope.reportIfNullAndContinue("insights_section", (String) null, cardSpendingInsightsHome.insights_section);
                                            return new SpendingInsightsHome(entryPoint2, overviewSection2, insightsSection2 != null ? zzahi.toInsightsSection(protoValidationScope, insightsSection2) : null);
                                        } catch (Exception e) {
                                            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightsHome.OverviewSection.class), spendingInsightsParsingErrorFactory, null);
                                        }
                                    } catch (Exception e2) {
                                        throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsightsHome.class), spendingInsightsParsingErrorFactory, null);
                                    }
                            }
                        }
                    });
                    gapComposer8.updateRememberedValue(singleValueOrDefault2);
                    obj25 = singleValueOrDefault2;
                }
                MutableState receiveValueAsState2 = Strings.receiveValueAsState((StateFlow) obj25, gapComposer8);
                Updater.LaunchedEffect(gapComposer8, flow, new CardStudioPresenter$models$1$1(flow, continuation2, cardLockPresenter, 19));
                Unit unit4 = Unit.INSTANCE;
                boolean changedInstance6 = gapComposer8.changedInstance(cardLockPresenter);
                Object rememberedValue26 = gapComposer8.rememberedValue();
                int i9 = 18;
                Object obj26 = rememberedValue26;
                if (changedInstance6 || rememberedValue26 == obj14) {
                    Object c005812 = new CardModelView.AnonymousClass1.C00581(cardLockPresenter, null, i9);
                    gapComposer8.updateRememberedValue(c005812);
                    obj26 = c005812;
                }
                Updater.LaunchedEffect(gapComposer8, unit4, (Function2) obj26);
                boolean changedInstance7 = gapComposer8.changedInstance(cardLockPresenter);
                Object rememberedValue27 = gapComposer8.rememberedValue();
                Object obj27 = rememberedValue27;
                if (changedInstance7 || rememberedValue27 == obj14) {
                    Object temporaryStorage$getDir$2 = new TemporaryStorage$getDir$2(cardLockPresenter, null, 16);
                    gapComposer8.updateRememberedValue(temporaryStorage$getDir$2);
                    obj27 = temporaryStorage$getDir$2;
                }
                Updater.LaunchedEffect(gapComposer8, unit4, (Function2) obj27);
                SpendingInsightsConfig spendingInsightsConfig = (SpendingInsightsConfig) receiveValueAsState.getValue();
                SpendingInsightsHomeViewModel.Loading loading = SpendingInsightsHomeViewModel.Loading.INSTANCE;
                if (spendingInsightsConfig != null && ((SpendingInsightsHome) receiveValueAsState2.getValue()) != null) {
                    Object rememberedValue28 = gapComposer8.rememberedValue();
                    Object obj28 = rememberedValue28;
                    if (rememberedValue28 == obj14) {
                        String activeAccountToken = PlatformKt.activeAccountToken((SessionManager) cardLockPresenter.flowStarter);
                        ActivityClientService activityClientService = (ActivityClientService) obj12;
                        ErrorReporter errorReporter = (ErrorReporter) cardLockPresenter.flowNavigationHelper;
                        SpendingInsightsConfig spendingInsightsConfig2 = (SpendingInsightsConfig) receiveValueAsState.getValue();
                        Object spendingInsightsActivityContext = AnalyticsHelperKt.spendingInsightsActivityContext(activeAccountToken, new SpendingInsightsActivityRequestHandler(activityClientService, errorReporter, spendingInsightsConfig2 != null ? spendingInsightsConfig2.activitySection : null));
                        gapComposer8.updateRememberedValue(spendingInsightsActivityContext);
                        obj28 = spendingInsightsActivityContext;
                    }
                    ActivitiesManager.ActivityContext activityContext = (ActivitiesManager.ActivityContext) obj28;
                    boolean changed = gapComposer8.changed(activityContext);
                    Object rememberedValue29 = gapComposer8.rememberedValue();
                    BetterNavigator.ScreenNavigator screenNavigator = cardLockPresenter.navigator;
                    Object obj29 = rememberedValue29;
                    if (changed || rememberedValue29 == obj14) {
                        Object create = ((RealActivityEmbeddedPresenter$Factory$Impl) obj9).create(screenNavigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(activityContext, RealActivitiesCacheManager.take$default((RealActivitiesCacheManager) obj10, activityContext), null, new SsnViewKt$$ExternalSyntheticLambda4(cardLockPresenter, i9), 3, null, null, null, null, null, 8136));
                        gapComposer8.updateRememberedValue(create);
                        obj29 = create;
                    }
                    RealActivityEmbeddedPresenter realActivityEmbeddedPresenter = (RealActivityEmbeddedPresenter) obj29;
                    SpendingInsightsHome spendingInsightsHome = (SpendingInsightsHome) receiveValueAsState2.getValue();
                    spendingInsightsHome.getClass();
                    if (spendingInsightsHome.overviewSection.graph != null) {
                        SpendingInsightsConfig spendingInsightsConfig3 = (SpendingInsightsConfig) receiveValueAsState.getValue();
                        spendingInsightsConfig3.getClass();
                        String str31 = spendingInsightsConfig3.title;
                        SpendingInsightsHome spendingInsightsHome2 = (SpendingInsightsHome) receiveValueAsState2.getValue();
                        spendingInsightsHome2.getClass();
                        SpendingInsightsHome.InsightsSection insightsSection2 = spendingInsightsHome2.insightsSection;
                        if (insightsSection2 != null) {
                            ArrayList<SpendingInsightsHome.InsightsSection.InsightsRow> arrayList2 = insightsSection2.insights;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
                            for (SpendingInsightsHome.InsightsSection.InsightsRow insightsRow : arrayList2) {
                                int ordinal2 = insightsRow.image.ordinal();
                                if (ordinal2 == 0) {
                                    rowIcon = SpendingInsightsHomeViewModel.Content.InsightsSection.InsightsRow.RowIcon.TOP_LOCATIONS;
                                } else if (ordinal2 == 1) {
                                    rowIcon = SpendingInsightsHomeViewModel.Content.InsightsSection.InsightsRow.RowIcon.RECURRING_PAYMENTS;
                                } else {
                                    if (ordinal2 != 2) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    rowIcon = SpendingInsightsHomeViewModel.Content.InsightsSection.InsightsRow.RowIcon.AI_INSIGHTS;
                                }
                                arrayList3.add(new SpendingInsightsHomeViewModel.Content.InsightsSection.InsightsRow(rowIcon, insightsRow.title, insightsRow.subtitle, new SpendingInsightHomeViewEvent.InsightsRowTapped(insightsRow.clientRoute, insightsRow.cdfEvent)));
                            }
                            insightsSection = new SpendingInsightsHomeViewModel.Content.InsightsSection(arrayList3);
                        } else {
                            insightsSection = null;
                        }
                        SpendingInsightsHome spendingInsightsHome3 = (SpendingInsightsHome) receiveValueAsState2.getValue();
                        spendingInsightsHome3.getClass();
                        SpendingInsightsHome.OverviewSection.VerticalStackedBarGraph verticalStackedBarGraph = spendingInsightsHome3.overviewSection.graph;
                        if (verticalStackedBarGraph == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("OverviewSection graph should not be null");
                            return null;
                        }
                        try {
                            SpendingInsightsHomeViewModel.Content.OverviewSection overviewSection = new SpendingInsightsHomeViewModel.Content.OverviewSection(toSegmentedBarChartViewModel(verticalStackedBarGraph));
                            SpendingInsightsConfig spendingInsightsConfig4 = (SpendingInsightsConfig) receiveValueAsState.getValue();
                            spendingInsightsConfig4.getClass();
                            SpendingInsightsHomeViewModel.Content content = new SpendingInsightsHomeViewModel.Content(str31, overviewSection, insightsSection, new SpendingInsightsHomeViewModel.Content.ActivitySection(realActivityEmbeddedPresenter.models(gapComposer8, 0), spendingInsightsConfig4.activitySection.title));
                            gapComposer8.end(false);
                            return content;
                        } catch (Exception e) {
                            throw new GeneralSpendingInsightsError("Error parsing overview graph to segmented chart.", e);
                        }
                    }
                    screenNavigator.goTo(Back.INSTANCE);
                    screenNavigator.goTo(new ProfileScreens.ErrorScreen(((AndroidStringManager) obj11).get(R.string.unexpected_error), null, 14));
                }
                gapComposer8.end(false);
                return loading;
            case 6:
                return models$com$squareup$cash$moneybot$presenters$MoneybotOverflowMenuPresenter(flow, composer, i);
            case 7:
                return models$com$squareup$cash$offers$presenters$OffersDetailsPresenterV2(flow, composer, i);
            case 8:
                return models$com$squareup$cash$onboarding$accountpicker$presenters$AliasPickerPresenter(flow, composer, i);
            case 9:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(1991539500);
                Object rememberedValue30 = gapComposer9.rememberedValue();
                Object obj30 = rememberedValue30;
                if (rememberedValue30 == obj14) {
                    Object mutableStateOf$default2 = Updater.mutableStateOf$default(((MultipleAllocationBlocker) cardLockPresenter.ioDispatcher).allocations);
                    gapComposer9.updateRememberedValue(mutableStateOf$default2);
                    obj30 = mutableStateOf$default2;
                }
                MutableState mutableState11 = (MutableState) obj30;
                Object rememberedValue31 = gapComposer9.rememberedValue();
                Object obj31 = rememberedValue31;
                if (rememberedValue31 == obj14) {
                    Object mutableStateOf$default3 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer9.updateRememberedValue(mutableStateOf$default3);
                    obj31 = mutableStateOf$default3;
                }
                MutableState mutableState12 = (MutableState) obj31;
                Object rememberedValue32 = gapComposer9.rememberedValue();
                Object obj32 = rememberedValue32;
                if (rememberedValue32 == obj14) {
                    Object mutableStateOf$default4 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer9.updateRememberedValue(mutableStateOf$default4);
                    obj32 = mutableStateOf$default4;
                }
                MutableState mutableState13 = (MutableState) obj32;
                Updater.LaunchedEffect(gapComposer9, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (MoleculePresenter) cardLockPresenter, (Object) mutableState12, (State) mutableState13, (Object) mutableState11, 24));
                Object rememberedValue33 = gapComposer9.rememberedValue();
                Object obj33 = rememberedValue33;
                if (rememberedValue33 == obj14) {
                    Object heroTagViewKt$$ExternalSyntheticLambda12 = new HeroTagViewKt$$ExternalSyntheticLambda12(20, mutableState11);
                    gapComposer9.updateRememberedValue(heroTagViewKt$$ExternalSyntheticLambda12);
                    obj33 = heroTagViewKt$$ExternalSyntheticLambda12;
                }
                Function2 function2 = (Function2) obj33;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = AnswersKt.LocalAnswerDispatcher;
                AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer9.consume(staticProvidableCompositionLocal);
                boolean changedInstance8 = gapComposer9.changedInstance(answerDispatcher);
                Object rememberedValue34 = gapComposer9.rememberedValue();
                Object obj34 = rememberedValue34;
                if (changedInstance8 || rememberedValue34 == obj14) {
                    Object articlePresenter$models$$inlined$AnswerHandler$1 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 9);
                    gapComposer9.updateRememberedValue(articlePresenter$models$$inlined$AnswerHandler$1);
                    obj34 = articlePresenter$models$$inlined$AnswerHandler$1;
                }
                Updater.DisposableEffect(answerDispatcher, (Function1) obj34, gapComposer9);
                boolean changedInstance9 = gapComposer9.changedInstance(cardLockPresenter);
                Object rememberedValue35 = gapComposer9.rememberedValue();
                Object obj35 = rememberedValue35;
                if (changedInstance9 || rememberedValue35 == obj14) {
                    Object heroTagViewKt$$ExternalSyntheticLambda122 = new HeroTagViewKt$$ExternalSyntheticLambda12(cardLockPresenter, mutableState11);
                    gapComposer9.updateRememberedValue(heroTagViewKt$$ExternalSyntheticLambda122);
                    obj35 = heroTagViewKt$$ExternalSyntheticLambda122;
                }
                Function2 function22 = (Function2) obj35;
                AnswerDispatcher answerDispatcher2 = (AnswerDispatcher) gapComposer9.consume(staticProvidableCompositionLocal);
                boolean changed2 = gapComposer9.changed(function22) | gapComposer9.changedInstance(answerDispatcher2);
                Object rememberedValue36 = gapComposer9.rememberedValue();
                Object obj36 = rememberedValue36;
                if (changed2 || rememberedValue36 == obj14) {
                    Object articlePresenter$models$$inlined$AnswerHandler$12 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function22, answerDispatcher2, 10);
                    gapComposer9.updateRememberedValue(articlePresenter$models$$inlined$AnswerHandler$12);
                    obj36 = articlePresenter$models$$inlined$AnswerHandler$12;
                }
                Updater.DisposableEffect(answerDispatcher2, (Function1) obj36, gapComposer9);
                Object createActiveModel = ((Boolean) mutableState12.getValue()).booleanValue() ? MultipleAllocationViewModel.Loading.INSTANCE : cardLockPresenter.createActiveModel((List) mutableState11.getValue(), ((Boolean) mutableState13.getValue()).booleanValue());
                gapComposer9.end(false);
                return createActiveModel;
            case 10:
                return models$com$squareup$cash$payments$presenters$NearbyPayRequestPresenter(flow, composer, i);
            case 11:
                return models$com$squareup$cash$promotionsreferrals$presenters$PromotionsReferralsHomePresenter(flow, composer, i);
            case 12:
                return models$com$squareup$cash$taptopay$presenters$TapToPayPaymentPresenter(flow, composer, i);
            case 13:
                return models$com$squareup$cash$work$presenters$shift$ClockInOverlayPresenter(flow, composer, i);
            default:
                ShiftDetailScreen shiftDetailScreen2 = (ShiftDetailScreen) obj13;
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(-789071959);
                Object rememberedValue37 = gapComposer10.rememberedValue();
                if (rememberedValue37 == obj14) {
                    rememberedValue37 = ((RealGetClockInEssentialsUseCase) ((GetClockInEssentialsUseCase) cardLockPresenter.ioDispatcher)).getEssentials();
                    gapComposer10.updateRememberedValue(rememberedValue37);
                }
                MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue37, ClockInEssentialsState.Loading.INSTANCE, null, gapComposer10, 0, 2);
                ShiftDetailScreen shiftDetailScreen3 = shiftDetailScreen2;
                Updater.LaunchedEffect(gapComposer10, flow, new TakeUntil$collectSafely$2(flow, (Continuation) null, cardLockPresenter, collectAsState6, 22));
                DashboardScheduleState dashboardScheduleState = (DashboardScheduleState) Updater.collectAsState((StateFlow) ((RealDashboardScheduleProvider) obj7).upcomingSchedules$delegate.getValue(), null, gapComposer10, 1).getValue();
                if (dashboardScheduleState instanceof DashboardScheduleState.Loading) {
                    gapComposer10.end(false);
                    return ShiftDetailViewModel.Loading.INSTANCE;
                }
                boolean z16 = false;
                boolean z17 = dashboardScheduleState instanceof DashboardScheduleState.Error;
                ShiftDetailViewModel shiftDetailViewModel3 = ShiftDetailViewModel.Error.INSTANCE;
                if (!z17) {
                    if (!(dashboardScheduleState instanceof DashboardScheduleState.Loaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Iterator it2 = ((DashboardScheduleState.Loaded) dashboardScheduleState).schedules.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Object next = it2.next();
                            shiftDetailScreen = shiftDetailScreen3;
                            if (Intrinsics.areEqual(((ShiftSchedule) next).id, shiftDetailScreen.shiftId)) {
                                obj5 = next;
                            } else {
                                shiftDetailScreen3 = shiftDetailScreen;
                            }
                        } else {
                            shiftDetailScreen = shiftDetailScreen3;
                            obj5 = null;
                        }
                    }
                    ShiftSchedule shiftSchedule = (ShiftSchedule) obj5;
                    if (shiftSchedule != null) {
                        Object rememberedValue38 = gapComposer10.rememberedValue();
                        if (rememberedValue38 == obj14) {
                            rememberedValue38 = ((RealSelectedMerchantDataProvider) obj6).getSelectedMerchantFlow();
                            gapComposer10.updateRememberedValue(rememberedValue38);
                        }
                        MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue38, null, null, gapComposer10, 48, 2);
                        MutableState collectAsState8 = Updater.collectAsState((Flow) ((RealCurrentUserProvider) obj10).personIdentifierFlow$delegate.getValue(), null, null, gapComposer10, 48, 2);
                        boolean changed3 = gapComposer10.changed((PersonIdentifier) collectAsState8.getValue());
                        Object rememberedValue39 = gapComposer10.rememberedValue();
                        if (changed3 || rememberedValue39 == obj14) {
                            PersonIdentifier personIdentifier = (PersonIdentifier) collectAsState8.getValue();
                            rememberedValue39 = personIdentifier != null ? ((RealPersonRepository) obj9).getById(personIdentifier.entityId) : new AppLockMonitor$special$$inlined$map$2(null, 19);
                            gapComposer10.updateRememberedValue(rememberedValue39);
                        }
                        MutableState collectAsState9 = Updater.collectAsState((Flow) rememberedValue39, null, null, gapComposer10, 48, 2);
                        Object rememberedValue40 = gapComposer10.rememberedValue();
                        if (rememberedValue40 == obj14) {
                            Object assignedJobProviderKt$jobs$$inlined$map$1 = new AssignedJobProviderKt$jobs$$inlined$map$1(((RealAssignedJobProvider) cardLockPresenter.flowStarter).getAssignedJobs(), 0);
                            gapComposer10.updateRememberedValue(assignedJobProviderKt$jobs$$inlined$map$1);
                            rememberedValue40 = assignedJobProviderKt$jobs$$inlined$map$1;
                        }
                        EmptyList emptyList = EmptyList.INSTANCE;
                        MutableState collectAsState10 = Updater.collectAsState((Flow) rememberedValue40, emptyList, null, gapComposer10, 48, 2);
                        Object rememberedValue41 = gapComposer10.rememberedValue();
                        if (rememberedValue41 == obj14) {
                            rememberedValue41 = ((RealAssignedLocationProvider) cardLockPresenter.flowNavigationHelper).getLocations();
                            gapComposer10.updateRememberedValue(rememberedValue41);
                        }
                        MutableState collectAsState11 = Updater.collectAsState((Flow) rememberedValue41, emptyList, null, gapComposer10, 48, 2);
                        Object rememberedValue42 = gapComposer10.rememberedValue();
                        if (rememberedValue42 == obj14) {
                            RealPasscodeProvider realPasscodeProvider = (RealPasscodeProvider) obj8;
                            mutableState2 = collectAsState7;
                            str9 = null;
                            int i10 = 0;
                            rememberedValue42 = FlowKt.distinctUntilChanged(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(realPasscodeProvider.teamMemberIdProvider.getTeamMemberId(), realPasscodeProvider.selectedMerchantProvider.getMerchantIdentifierFlow(), new RealPasscodeProvider$getPasscode$1((Object) realPasscodeProvider, (Continuation) (false ? 1 : 0), i10), i10));
                            gapComposer10.updateRememberedValue(rememberedValue42);
                        } else {
                            mutableState2 = collectAsState7;
                            str9 = null;
                        }
                        MutableState collectAsState12 = Updater.collectAsState((Flow) rememberedValue42, null, null, gapComposer10, 48, 2);
                        Merchant merchant = (Merchant) mutableState2.getValue();
                        String name = merchant != null ? MerchantKt.getName(merchant) : str9;
                        str7 = name != null ? name : "";
                        SellerCardViewModel collectSelectedMerchantViewModel = ((RealSellerCardViewModelProducer) obj12).collectSelectedMerchantViewModel(gapComposer10);
                        ShiftDetailMapper shiftDetailMapper = (ShiftDetailMapper) obj11;
                        Person person = (Person) collectAsState9.getValue();
                        Merchant merchant2 = (Merchant) mutableState2.getValue();
                        MerchantIdentifier identifier = merchant2 != null ? LocalPresenterFactoryKt.getIdentifier(merchant2) : str9;
                        List list2 = (List) collectAsState10.getValue();
                        List list3 = (List) collectAsState11.getValue();
                        String str32 = (String) collectAsState12.getValue();
                        ClockInEssentialsState clockInEssentialsState = (ClockInEssentialsState) collectAsState6.getValue();
                        String str33 = shiftDetailScreen.shiftId;
                        collectSelectedMerchantViewModel.getClass();
                        list2.getClass();
                        list3.getClass();
                        clockInEssentialsState.getClass();
                        str33.getClass();
                        ShiftSchedule.Version version = shiftSchedule.published_version;
                        CalendarEvent calendarEvent = version != null ? version.calendar_event : str9;
                        try {
                            realShiftTimeFormatter = shiftDetailMapper.shiftTimeFormatter;
                        } catch (DateTimeException unused) {
                            shiftDetailViewModel = shiftDetailViewModel3;
                        }
                        if (calendarEvent != null && (str11 = calendarEvent.start_datetime) != null) {
                            OffsetDateTime parse = OffsetDateTime.parse(str11);
                            if (parse != null) {
                                shiftDetailViewModel = shiftDetailViewModel3;
                                try {
                                    str12 = calendarEvent.stop_datetime;
                                } catch (DateTimeException unused2) {
                                    gapComposer = gapComposer10;
                                    shiftDetailViewModel2 = shiftDetailViewModel;
                                    gapComposer2 = gapComposer;
                                    gapComposer2.end(false);
                                    return shiftDetailViewModel2;
                                }
                                if (str12 != null) {
                                    OffsetDateTime parse2 = OffsetDateTime.parse(str12);
                                    if (parse2 != null) {
                                        gapComposer = gapComposer10;
                                        try {
                                            header = new ShiftDetailViewModel.Loaded.Header(collectSelectedMerchantViewModel, realShiftTimeFormatter.formatDayDate(parse), realShiftTimeFormatter.formatDashboardCardTimeRange(parse, parse2, calendarEvent.time_zone), str7);
                                        } catch (DateTimeException unused3) {
                                        }
                                        if (header != null) {
                                            ShiftDetailClockInState resolveClockInButtonState = shiftDetailMapper.resolveClockInButtonState(clockInEssentialsState, str33);
                                            ShiftDetailViewModel.Loaded.Assignee buildAssignee = shiftDetailMapper.buildAssignee(person, identifier);
                                            ShiftDetailViewModel.Loaded.Details buildDetails = ShiftDetailMapper.buildDetails(version, list2, list3, str32);
                                            if (version != null && (str10 = version.notes) != null) {
                                                if (StringsKt.isBlank(str10)) {
                                                    str10 = null;
                                                }
                                                if (str10 != null) {
                                                    note = new ShiftDetailViewModel.Loaded.Note(str10);
                                                    gapComposer2 = gapComposer;
                                                    shiftDetailViewModel2 = new ShiftDetailViewModel.Loaded(header, buildAssignee, buildDetails, note, resolveClockInButtonState.show, resolveClockInButtonState.enabled);
                                                    gapComposer2.end(false);
                                                    return shiftDetailViewModel2;
                                                }
                                            }
                                            note = null;
                                            gapComposer2 = gapComposer;
                                            shiftDetailViewModel2 = new ShiftDetailViewModel.Loaded(header, buildAssignee, buildDetails, note, resolveClockInButtonState.show, resolveClockInButtonState.enabled);
                                            gapComposer2.end(false);
                                            return shiftDetailViewModel2;
                                        }
                                        shiftDetailViewModel2 = shiftDetailViewModel;
                                        gapComposer2 = gapComposer;
                                        gapComposer2.end(false);
                                        return shiftDetailViewModel2;
                                    }
                                }
                                gapComposer = gapComposer10;
                                header = null;
                                if (header != null) {
                                }
                                shiftDetailViewModel2 = shiftDetailViewModel;
                                gapComposer2 = gapComposer;
                                gapComposer2.end(false);
                                return shiftDetailViewModel2;
                            }
                        }
                        shiftDetailViewModel = shiftDetailViewModel3;
                        gapComposer = gapComposer10;
                        header = null;
                        if (header != null) {
                        }
                        shiftDetailViewModel2 = shiftDetailViewModel;
                        gapComposer2 = gapComposer;
                        gapComposer2.end(false);
                        return shiftDetailViewModel2;
                    }
                    z16 = false;
                }
                gapComposer10.end(z16);
                return shiftDetailViewModel3;
        }
    }

    public void navigateToFailureScreen() {
        FlowStarter flowStarter = (FlowStarter) this.flowStarter;
        BlockersData.Flow flow = BlockersData.Flow.ONBOARDING;
        OnboardingAliasPickerScreen onboardingAliasPickerScreen = (OnboardingAliasPickerScreen) this.ioDispatcher;
        this.navigator.goTo(new FailureMessageBlockerScreen(FlowStarter.startFlow$default(flowStarter, flow, onboardingAliasPickerScreen, null, onboardingAliasPickerScreen.clientScenario, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO), TextUtilsCompat.errorMessaging((AndroidStringManager) this.stringManager, new ApiResult.Failure.NetworkFailure(new Exception("Malformed account")), null).message, null, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setAddressFailure(ApiResult.Failure failure, BlockersData blockersData, ContinuationImpl continuationImpl) {
        SetAddressPresenter$setAddressFailure$1 setAddressPresenter$setAddressFailure$1;
        int i;
        if (continuationImpl instanceof SetAddressPresenter$setAddressFailure$1) {
            setAddressPresenter$setAddressFailure$1 = (SetAddressPresenter$setAddressFailure$1) continuationImpl;
            int i2 = setAddressPresenter$setAddressFailure$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setAddressPresenter$setAddressFailure$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = setAddressPresenter$setAddressFailure$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setAddressPresenter$setAddressFailure$1.label;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Timber.Forest.e(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Failed to set ", ((BlockersScreens.StreetAddressScreen) this.flowStarter).formType.name(), "."), new Object[0]);
                    StateFlowImpl stateFlowImpl = (StateFlowImpl) this.ioDispatcher;
                    SetAddressViewModel copy$default = SetAddressViewModel.copy$default((SetAddressViewModel) stateFlowImpl.getValue(), false);
                    setAddressPresenter$setAddressFailure$1.L$0 = failure;
                    setAddressPresenter$setAddressFailure$1.L$1 = blockersData;
                    setAddressPresenter$setAddressFailure$1.label = 1;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, copy$default);
                    if (Unit.INSTANCE == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData = setAddressPresenter$setAddressFailure$1.L$1;
                    failure = setAddressPresenter$setAddressFailure$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                this.navigator.goTo(new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging((AndroidStringManager) this.stringManager, failure, null).message, str, 4));
                return Unit.INSTANCE;
            }
        }
        setAddressPresenter$setAddressFailure$1 = new SetAddressPresenter$setAddressFailure$1(this, continuationImpl);
        Object obj2 = setAddressPresenter$setAddressFailure$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setAddressPresenter$setAddressFailure$1.label;
        String str2 = null;
        if (i != 0) {
        }
        this.navigator.goTo(new FailureMessageBlockerScreen(blockersData, TextUtilsCompat.errorMessaging((AndroidStringManager) this.stringManager, failure, null).message, str2, 4));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (kotlin.Unit.INSTANCE == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ef, code lost:
    
        if (kotlin.Unit.INSTANCE == r3) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setAddressSuccess(SetAddressResponse setAddressResponse, BlockersData blockersData, ContinuationImpl continuationImpl) {
        SetAddressPresenter$setAddressSuccess$1 setAddressPresenter$setAddressSuccess$1;
        int i;
        String str;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.ioDispatcher;
        if (continuationImpl instanceof SetAddressPresenter$setAddressSuccess$1) {
            setAddressPresenter$setAddressSuccess$1 = (SetAddressPresenter$setAddressSuccess$1) continuationImpl;
            int i2 = setAddressPresenter$setAddressSuccess$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                setAddressPresenter$setAddressSuccess$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = setAddressPresenter$setAddressSuccess$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setAddressPresenter$setAddressSuccess$1.label;
                BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SetAddressResponse.Status status = setAddressResponse.status;
                    ResponseContext responseContext = setAddressResponse.response_context;
                    if (status == null) {
                        status = ProtoDefaults.SET_ADDRESS_STATUS;
                    }
                    int ordinal = status.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            ((BlockerFlowListener) this.args).onFlowCancelled(((BlockersScreens.StreetAddressScreen) this.flowStarter).blockersData);
                            if (((BlockersScreens.StreetAddressScreen) this.flowStarter).blockersData.flow == BlockersData.Flow.ONBOARDING) {
                                SetAddressViewModel copy$default = SetAddressViewModel.copy$default((SetAddressViewModel) stateFlowImpl.getValue(), false);
                                setAddressPresenter$setAddressSuccess$1.L$0 = null;
                                setAddressPresenter$setAddressSuccess$1.L$1 = blockersData;
                                setAddressPresenter$setAddressSuccess$1.label = 1;
                                stateFlowImpl.getClass();
                                stateFlowImpl.updateState(null, copy$default);
                            } else {
                                screenNavigator.goTo(blockersData.exitScreen);
                            }
                        } else {
                            if (ordinal != 3) {
                                a$$ExternalSyntheticBUOutline0.m$2(setAddressResponse.status, "Unknown status ");
                                return null;
                            }
                            Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Failed to set ", ((BlockersScreens.StreetAddressScreen) this.flowStarter).formType.name()), new Object[0]);
                            SetAddressViewModel copy$default2 = SetAddressViewModel.copy$default((SetAddressViewModel) stateFlowImpl.getValue(), false);
                            setAddressPresenter$setAddressSuccess$1.L$0 = setAddressResponse;
                            setAddressPresenter$setAddressSuccess$1.L$1 = blockersData;
                            setAddressPresenter$setAddressSuccess$1.label = 2;
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, copy$default2);
                        }
                        return coroutineSingletons;
                    }
                    responseContext.getClass();
                    String str2 = responseContext.dialog_message;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
                    if (str2 == null || StringsKt.isBlank(str2)) {
                        screenNavigator.goTo(((BlockersDataNavigator) this.cashAppTagManager).getNext((BlockersScreens.StreetAddressScreen) this.flowStarter, updateFromResponseContext));
                    } else {
                        str2.getClass();
                        screenNavigator.goTo(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, null, str2, null, 10));
                    }
                } else if (i == 1) {
                    blockersData = setAddressPresenter$setAddressSuccess$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    screenNavigator.goTo(new BlockersScreens.Error(blockersData, androidStringManager.get(R.string.concurrent_modification_in_onboarding_error), null));
                } else {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    blockersData = setAddressPresenter$setAddressSuccess$1.L$1;
                    setAddressResponse = setAddressPresenter$setAddressSuccess$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    ResponseContext responseContext2 = setAddressResponse.response_context;
                    String str3 = responseContext2 != null ? responseContext2.dialog_title : null;
                    if (responseContext2 == null || (str = responseContext2.failure_message) == null) {
                        String str4 = responseContext2 != null ? responseContext2.dialog_message : null;
                        str = str4 == null ? androidStringManager.get(R.string.profile_street_address_error) : str4;
                    }
                    screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, str, str3));
                }
                return Unit.INSTANCE;
            }
        }
        setAddressPresenter$setAddressSuccess$1 = new SetAddressPresenter$setAddressSuccess$1(this, continuationImpl);
        Object obj2 = setAddressPresenter$setAddressSuccess$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setAddressPresenter$setAddressSuccess$1.label;
        BetterNavigator.ScreenNavigator screenNavigator2 = this.navigator;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object submit(SubmitSetPaycheckMultiAllocationRequest.SubmitAll submitAll, SubmitSetPaycheckMultiAllocationRequest.Disable disable, SubmitSetPaycheckMultiAllocationRequest.Cancel cancel, SubmitSetPaycheckMultiAllocationRequest.SubmitSingle submitSingle, boolean z, ContinuationImpl continuationImpl) {
        MultipleAllocationPresenter$submit$1 multipleAllocationPresenter$submit$1;
        int i;
        boolean z2;
        SetPaycheckMultipleAllocationScreen setPaycheckMultipleAllocationScreen = (SetPaycheckMultipleAllocationScreen) this.args;
        BlockersData blockersData = setPaycheckMultipleAllocationScreen.blockersData;
        if (continuationImpl instanceof MultipleAllocationPresenter$submit$1) {
            multipleAllocationPresenter$submit$1 = (MultipleAllocationPresenter$submit$1) continuationImpl;
            int i2 = multipleAllocationPresenter$submit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                multipleAllocationPresenter$submit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = multipleAllocationPresenter$submit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multipleAllocationPresenter$submit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaychecksAppService paychecksAppService = (PaychecksAppService) this.issuedCardManager;
                    String str = blockersData.flowToken;
                    SubmitSetPaycheckMultiAllocationRequest submitSetPaycheckMultiAllocationRequest = new SubmitSetPaycheckMultiAllocationRequest(blockersData.requestContext, submitAll != null ? new SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitAll(submitAll) : submitSingle != null ? new SubmitSetPaycheckMultiAllocationRequest$SubmitResult$SubmitSingle(submitSingle) : disable != null ? new SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Disable(disable) : cancel != null ? new SubmitSetPaycheckMultiAllocationRequest$SubmitResult$Cancel(cancel) : null, ByteString.EMPTY);
                    multipleAllocationPresenter$submit$1.Z$0 = z;
                    multipleAllocationPresenter$submit$1.label = 1;
                    obj = paychecksAppService.submitSetPaycheckMultiAllocation(str, submitSetPaycheckMultiAllocationRequest, multipleAllocationPresenter$submit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = multipleAllocationPresenter$submit$1.Z$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                z2 = apiResult instanceof ApiResult.Success;
                BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
                if (!z2) {
                    ResponseContext responseContext = ((SubmitSetPaycheckMultiAllocationResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(((BlockersDataNavigator) this.cashAppTagManager).getNext(setPaycheckMultipleAllocationScreen, blockersData.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (!z) {
                        screenNavigator.goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) apiResult, setPaycheckMultipleAllocationScreen, (AndroidStringManager) this.stringManager));
                    }
                }
                return Unit.INSTANCE;
            }
        }
        multipleAllocationPresenter$submit$1 = new MultipleAllocationPresenter$submit$1(this, continuationImpl);
        Object obj2 = multipleAllocationPresenter$submit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multipleAllocationPresenter$submit$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        z2 = apiResult2 instanceof ApiResult.Success;
        BetterNavigator.ScreenNavigator screenNavigator2 = this.navigator;
        if (!z2) {
        }
        return Unit.INSTANCE;
    }

    public void submitShippingAddressNameFailure(ApiResult.Failure failure) {
        Timber.Forest.e("Failed to send shipping address name.", new Object[0]);
        String str = TextUtilsCompat.errorMessaging((AndroidStringManager) this.stringManager, failure, null).message;
        this.navigator.goTo(new FailureMessageBlockerScreen(((BlockersScreens.SetNameScreen) this.args).blockersData, str, null, 4));
    }

    public SetNamePresenter$SubmitNameResult submitShippingAddressNameSuccess(List list) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        BlockersScreens.SetNameScreen setNameScreen = (BlockersScreens.SetNameScreen) this.args;
        BlockersData blockersData = setNameScreen.blockersData;
        boolean isEmpty = list.isEmpty();
        BetterNavigator.ScreenNavigator screenNavigator = this.navigator;
        if (!isEmpty) {
            screenNavigator.goTo(new BlockersScreens.Error(blockersData, androidStringManager.get(R.string.default_set_name_dialog_error_message), androidStringManager.get(R.string.default_set_name_dialog_error_title)));
            return SetNamePresenter$SubmitNameResult.NotSuccessful.INSTANCE;
        }
        Timber.Forest.d("Successfully sent shipping address name.", new Object[0]);
        screenNavigator.goTo(((BlockersDataNavigator) this.cardLockFlowTypeProvider).getNext(setNameScreen, blockersData));
        return SetNamePresenter$SubmitNameResult.Successful.INSTANCE;
    }

    public ArrayList toNearbyPayers(List list) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str2 = ((PaymentUpdate) obj).sender_customer_token;
            if (str2 != null && str2.length() != 0) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str3 = ((PaymentUpdate) next).sender_customer_token;
            Object obj2 = linkedHashMap.get(str3);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str3, obj2);
            }
            ((List) obj2).add(next);
        }
        Collection<List> values = linkedHashMap.values();
        ArrayList arrayList2 = new ArrayList();
        for (List list2 : values) {
            PaymentUpdate paymentUpdate = (PaymentUpdate) CollectionsKt.first(list2);
            SenderProfileData senderProfileData = paymentUpdate.sender_profile;
            NearbyPayer nearbyPayer = null;
            nearbyPayer = null;
            if (senderProfileData != null && (str = senderProfileData.display_name) != null) {
                Money sumOfAmount = sumOfAmount(list2);
                Character monogram = GrpcStatus.Companion.monogram(str);
                Color uiColor = ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, paymentUpdate.sender_customer_token, null, null, null));
                String str4 = senderProfileData.profile_photo_url;
                NearbyAvatarInfo nearbyAvatarInfo = new NearbyAvatarInfo(monogram, uiColor, str4 != null ? new Image(str4, str4, 4) : null);
                String str5 = senderProfileData.cashtag;
                nearbyPayer = new NearbyPayer(nearbyAvatarInfo, str, str5 != null ? "$".concat(str5) : "", ((MoneyFormatter) this.deviceLockAnimationBus).format(sumOfAmount));
            }
            if (nearbyPayer != null) {
                arrayList2.add(nearbyPayer);
            }
        }
        return arrayList2;
    }

    public CardLockPresenter(BetterNavigator.ScreenNavigator screenNavigator, MoneybotOverflowMenuScreen moneybotOverflowMenuScreen, RealUserSessionPager realUserSessionPager, ChatManager chatManager, RealMoneybotChatMessagesCache realMoneybotChatMessagesCache, MoneybotFlagsHelper moneybotFlagsHelper, RealMoneybotAnalyticsService realMoneybotAnalyticsService, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.$r8$classId = 6;
        this.navigator = screenNavigator;
        this.args = moneybotOverflowMenuScreen;
        this.analytics = realUserSessionPager;
        this.cardLockFlowTypeProvider = chatManager;
        this.cashAppTagManager = realMoneybotChatMessagesCache;
        this.issuedCardManager = moneybotFlagsHelper;
        this.franklinAppService = realMoneybotAnalyticsService;
        this.flowStarter = realRouter$Factory$Impl.create$1(screenNavigator);
        this.flowNavigationHelper = Updater.mutableStateOf$default(Boolean.FALSE);
        this.deviceLockAnimationBus = Updater.mutableStateOf$default(null);
        this.stringManager = Updater.mutableStateOf$default(null);
    }

    public CardLockPresenter(ClockInOverlayScreen clockInOverlayScreen, BetterNavigator.ScreenNavigator screenNavigator, RealSellerCardViewModelProducer realSellerCardViewModelProducer, RealClockInEssentialsProvider realClockInEssentialsProvider, MarkwonConfiguration markwonConfiguration, ToolbarTuckTargets toolbarTuckTargets, RealClockInRepository realClockInRepository, AndroidStringManager androidStringManager, AndroidPermissionManager androidPermissionManager, AndroidLocationProvider androidLocationProvider, IntentLauncher intentLauncher, GeofenceStateResolver geofenceStateResolver) {
        this.$r8$classId = 13;
        clockInOverlayScreen.getClass();
        this.args = clockInOverlayScreen;
        this.navigator = screenNavigator;
        this.analytics = realSellerCardViewModelProducer;
        this.cardLockFlowTypeProvider = realClockInEssentialsProvider;
        this.cashAppTagManager = markwonConfiguration;
        this.issuedCardManager = toolbarTuckTargets;
        this.franklinAppService = realClockInRepository;
        this.stringManager = androidStringManager;
        this.flowStarter = androidPermissionManager;
        this.flowNavigationHelper = androidLocationProvider;
        this.deviceLockAnimationBus = intentLauncher;
        this.ioDispatcher = geofenceStateResolver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardLockPresenter(Analytics analytics, RealBitcoinAmountPickerPresenter$Factory$Impl realBitcoinAmountPickerPresenter$Factory$Impl, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, AppService appService, AndroidStringManager androidStringManager, BlockersDataNavigator blockersDataNavigator, CoroutineScope coroutineScope, CoroutineContext coroutineContext, BlockersScreens.BitcoinAmountScreen bitcoinAmountScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 2;
        this.analytics = analytics;
        this.args = realBitcoinAmountPickerPresenter$Factory$Impl;
        this.franklinAppService = appService;
        this.stringManager = androidStringManager;
        this.cardLockFlowTypeProvider = blockersDataNavigator;
        this.ioDispatcher = coroutineContext;
        this.cashAppTagManager = bitcoinAmountScreen;
        this.navigator = screenNavigator;
        this.issuedCardManager = JobKt.plus(coroutineContext, coroutineScope);
        this.flowStarter = realBlockersHelper$Factory$Impl.create(screenNavigator);
        Object[] objArr = 0 == true ? 1 : 0;
        this.deviceLockAnimationBus = new BitcoinAmountViewModel(MLKEMEngine.KyberPolyBytes, new BitcoinKeypadModel("", null, new Money((Long) null, (CurrencyCode) objArr, 7), "", "", null), "", null, null, false, false, false);
    }

    public CardLockPresenter(ReturningCustomerLoginFlowService returningCustomerLoginFlowService, RealBackupService realBackupService, AndroidStringManager androidStringManager, FlowStarter flowStarter, BlockersDataNavigator blockersDataNavigator, RealSelectedAliasRegistrar realSelectedAliasRegistrar, Analytics analytics, BooleanPreference booleanPreference, ErrorReporter errorReporter, SampleStrategy sampleStrategy, OnboardingAliasPickerScreen onboardingAliasPickerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 8;
        onboardingAliasPickerScreen.getClass();
        this.args = returningCustomerLoginFlowService;
        this.cardLockFlowTypeProvider = realBackupService;
        this.stringManager = androidStringManager;
        this.flowStarter = flowStarter;
        this.cashAppTagManager = blockersDataNavigator;
        this.issuedCardManager = realSelectedAliasRegistrar;
        this.analytics = analytics;
        this.franklinAppService = booleanPreference;
        this.flowNavigationHelper = errorReporter;
        this.deviceLockAnimationBus = sampleStrategy;
        this.ioDispatcher = onboardingAliasPickerScreen;
        this.navigator = screenNavigator;
    }

    public CardLockPresenter(CardLockHalfSheetScreen cardLockHalfSheetScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, LiteCardLockFlowTypeProvider liteCardLockFlowTypeProvider, RealCashAppTagManager realCashAppTagManager, IssuedCardManager issuedCardManager, AppService appService, FlowStarter flowStarter, FlowNavigationHelper flowNavigationHelper, RealDeviceLockAnimationBus realDeviceLockAnimationBus, AndroidStringManager androidStringManager, CoroutineContext coroutineContext) {
        this.$r8$classId = 0;
        cardLockHalfSheetScreen.getClass();
        this.args = cardLockHalfSheetScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
        this.cardLockFlowTypeProvider = liteCardLockFlowTypeProvider;
        this.cashAppTagManager = realCashAppTagManager;
        this.issuedCardManager = issuedCardManager;
        this.franklinAppService = appService;
        this.flowStarter = flowStarter;
        this.flowNavigationHelper = flowNavigationHelper;
        this.deviceLockAnimationBus = realDeviceLockAnimationBus;
        this.stringManager = androidStringManager;
        this.ioDispatcher = coroutineContext;
    }

    public CardLockPresenter(AndroidStringManager androidStringManager, RealBoostRepository realBoostRepository, SyncValueReader syncValueReader, RealProfileManager realProfileManager, RealFlowTokenGenerator realFlowTokenGenerator, FeatureFlagManager featureFlagManager, RealOffersAnalyticsV2 realOffersAnalyticsV2, RealOffersInflightStateManager realOffersInflightStateManager, SessionManager sessionManager, RealRouter$Factory$Impl realRouter$Factory$Impl, IntentLauncher intentLauncher, OffersScreen$OffersDetailsScreenV2 offersScreen$OffersDetailsScreenV2, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 7;
        offersScreen$OffersDetailsScreenV2.getClass();
        this.stringManager = androidStringManager;
        this.args = realBoostRepository;
        this.analytics = syncValueReader;
        this.cardLockFlowTypeProvider = realProfileManager;
        this.cashAppTagManager = featureFlagManager;
        this.issuedCardManager = realOffersAnalyticsV2;
        this.franklinAppService = realOffersInflightStateManager;
        this.flowStarter = intentLauncher;
        this.flowNavigationHelper = offersScreen$OffersDetailsScreenV2;
        this.navigator = screenNavigator;
        this.deviceLockAnimationBus = realRouter$Factory$Impl.create$1(screenNavigator);
        this.ioDispatcher = PlatformKt.activeAccountToken(sessionManager);
    }

    public CardLockPresenter(BetterNavigator.ScreenNavigator screenNavigator, PromotionsReferralsScreen$PromotionsReferralsHomeScreen promotionsReferralsScreen$PromotionsReferralsHomeScreen, RealP2pSettingsManager realP2pSettingsManager, AppConfigManager appConfigManager, AndroidStringManager androidStringManager, FlowStarter flowStarter, LocalizedMoneyFormatter.Factory factory, Analytics analytics, RealReferralManager realReferralManager, RealRouter$Factory$Impl realRouter$Factory$Impl, IncentivesClientService incentivesClientService) {
        this.$r8$classId = 11;
        promotionsReferralsScreen$PromotionsReferralsHomeScreen.getClass();
        this.navigator = screenNavigator;
        this.args = promotionsReferralsScreen$PromotionsReferralsHomeScreen;
        this.cardLockFlowTypeProvider = realP2pSettingsManager;
        this.cashAppTagManager = appConfigManager;
        this.stringManager = androidStringManager;
        this.flowStarter = flowStarter;
        this.analytics = analytics;
        this.issuedCardManager = realReferralManager;
        this.franklinAppService = incentivesClientService;
        this.flowNavigationHelper = factory.createRounded();
        this.deviceLockAnimationBus = realRouter$Factory$Impl.create$1(screenNavigator);
        this.ioDispatcher = Updater.mutableStateOf$default(PromotionsReferralsHomeViewModel.Loading.INSTANCE);
    }

    public CardLockPresenter(LocalizedMoneyFormatter.Factory factory, n nVar, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, RealBankingOutboundNavigator$Factory$Impl realBankingOutboundNavigator$Factory$Impl, RealBalanceBasedAddCashManager realBalanceBasedAddCashManager, RealInstrumentManager realInstrumentManager, RealClientSyncer realClientSyncer, AndroidStringManager androidStringManager, Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, RecurringDepositsScreen recurringDepositsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 1;
        recurringDepositsScreen.getClass();
        this.args = nVar;
        this.cardLockFlowTypeProvider = realBalanceBasedAddCashManager;
        this.cashAppTagManager = realInstrumentManager;
        this.issuedCardManager = realClientSyncer;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.franklinAppService = recurringDepositsScreen;
        this.navigator = screenNavigator;
        this.flowStarter = factory.create(MoneyFormatterConfig.COMPACT);
        this.flowNavigationHelper = realRouter$Factory$Impl.create$1(screenNavigator);
        this.deviceLockAnimationBus = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.ioDispatcher = realBankingOutboundNavigator$Factory$Impl.create$1(screenNavigator);
    }

    public CardLockPresenter(BetterNavigator.ScreenNavigator screenNavigator, SyncValueReader syncValueReader, AndroidStringManager androidStringManager, SpendingInsightsAppService spendingInsightsAppService, ActivityClientService activityClientService, RealActivitiesCacheManager realActivitiesCacheManager, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, SessionManager sessionManager, ErrorReporter errorReporter, SampleStrategy sampleStrategy, RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics) {
        this.$r8$classId = 5;
        this.navigator = screenNavigator;
        this.args = syncValueReader;
        this.stringManager = androidStringManager;
        this.cardLockFlowTypeProvider = spendingInsightsAppService;
        this.cashAppTagManager = activityClientService;
        this.issuedCardManager = realActivitiesCacheManager;
        this.franklinAppService = realActivityEmbeddedPresenter$Factory$Impl;
        this.flowStarter = sessionManager;
        this.flowNavigationHelper = errorReporter;
        this.deviceLockAnimationBus = sampleStrategy;
        this.analytics = analytics;
        this.ioDispatcher = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public CardLockPresenter(RealNearbyManager realNearbyManager, AndroidStringManager androidStringManager, RealProfileManager realProfileManager, SessionManager sessionManager, MarkwonConfiguration markwonConfiguration, RealUuidGenerator realUuidGenerator, Analytics analytics, AppForegroundStateProvider appForegroundStateProvider, AndroidClock androidClock, LocalizedMoneyFormatter.Factory factory, PaymentScreens.NearbyPayRequest nearbyPayRequest, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 10;
        nearbyPayRequest.getClass();
        this.args = realNearbyManager;
        this.stringManager = androidStringManager;
        this.cardLockFlowTypeProvider = realProfileManager;
        this.cashAppTagManager = sessionManager;
        this.issuedCardManager = markwonConfiguration;
        this.analytics = analytics;
        this.franklinAppService = appForegroundStateProvider;
        this.flowStarter = androidClock;
        this.flowNavigationHelper = nearbyPayRequest;
        this.navigator = screenNavigator;
        this.deviceLockAnimationBus = factory.create(MoneyFormatterConfig.COMPACT);
        String str = nearbyPayRequest.flowToken;
        this.ioDispatcher = str == null ? re$$ExternalSyntheticOutline0.m() : str;
    }

    public CardLockPresenter(BlockersScreens.SetNameScreen setNameScreen, BetterNavigator.ScreenNavigator screenNavigator, BlockersDataNavigator blockersDataNavigator, ShippingAddressService shippingAddressService, AppService appService, Analytics analytics, TimeToLiveSyncState timeToLiveSyncState, SecuritySignalsAggregator securitySignalsAggregator, AndroidStringManager androidStringManager, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, Signal signal, IntentLauncher intentLauncher) {
        this.$r8$classId = 4;
        this.args = setNameScreen;
        this.navigator = screenNavigator;
        this.cardLockFlowTypeProvider = blockersDataNavigator;
        this.cashAppTagManager = shippingAddressService;
        this.franklinAppService = appService;
        this.analytics = analytics;
        this.issuedCardManager = timeToLiveSyncState;
        this.flowStarter = securitySignalsAggregator;
        this.stringManager = androidStringManager;
        this.flowNavigationHelper = signal;
        this.deviceLockAnimationBus = intentLauncher;
        this.ioDispatcher = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    public CardLockPresenter(ShiftDetailScreen shiftDetailScreen, BetterNavigator.ScreenNavigator screenNavigator, RealDashboardScheduleProvider realDashboardScheduleProvider, RealSelectedMerchantDataProvider realSelectedMerchantDataProvider, RealSellerCardViewModelProducer realSellerCardViewModelProducer, RealCurrentUserProvider realCurrentUserProvider, RealPersonRepository realPersonRepository, RealAssignedJobProvider realAssignedJobProvider, RealAssignedLocationProvider realAssignedLocationProvider, RealPasscodeProvider realPasscodeProvider, ShiftDetailMapper shiftDetailMapper, GetClockInEssentialsUseCase getClockInEssentialsUseCase) {
        this.$r8$classId = 14;
        shiftDetailScreen.getClass();
        this.args = shiftDetailScreen;
        this.navigator = screenNavigator;
        this.analytics = realDashboardScheduleProvider;
        this.cardLockFlowTypeProvider = realSelectedMerchantDataProvider;
        this.cashAppTagManager = realSellerCardViewModelProducer;
        this.issuedCardManager = realCurrentUserProvider;
        this.franklinAppService = realPersonRepository;
        this.flowStarter = realAssignedJobProvider;
        this.flowNavigationHelper = realAssignedLocationProvider;
        this.deviceLockAnimationBus = realPasscodeProvider;
        this.stringManager = shiftDetailMapper;
        this.ioDispatcher = getClockInEssentialsUseCase;
    }

    public CardLockPresenter(zzai zzaiVar, RealCashVibrator realCashVibrator, RealDeviceOrientationProvider realDeviceOrientationProvider, LocalizedMoneyFormatter.Factory factory, SessionManager sessionManager, RealTagCommunication$Factory$Impl realTagCommunication$Factory$Impl, RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper, RealTapToPayErrorReporter realTapToPayErrorReporter, RealTapToPaySessionManager realTapToPaySessionManager, BetterNavigator.ScreenNavigator screenNavigator, TapToPayPaymentScreen tapToPayPaymentScreen) {
        this.$r8$classId = 12;
        tapToPayPaymentScreen.getClass();
        this.args = zzaiVar;
        this.analytics = realCashVibrator;
        this.cardLockFlowTypeProvider = realDeviceOrientationProvider;
        this.cashAppTagManager = sessionManager;
        this.issuedCardManager = realTagCommunication$Factory$Impl;
        this.franklinAppService = realTapToPayAnalyticsHelper;
        this.flowStarter = realTapToPayErrorReporter;
        this.flowNavigationHelper = realTapToPaySessionManager;
        this.navigator = screenNavigator;
        this.deviceLockAnimationBus = tapToPayPaymentScreen;
        this.stringManager = factory.create(MoneyFormatterConfig.COMPACT);
        this.ioDispatcher = new MutexImpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x018f A[Catch: Exception -> 0x01b1, TryCatch #0 {Exception -> 0x01b1, blocks: (B:3:0x004e, B:6:0x00d6, B:8:0x00de, B:10:0x0119, B:12:0x011d, B:14:0x0121, B:15:0x0125, B:18:0x0131, B:24:0x0159, B:25:0x018b, B:27:0x018f, B:28:0x01a9, B:33:0x015f, B:34:0x0182, B:35:0x0183, B:37:0x0188, B:40:0x0106), top: B:2:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CardLockPresenter(SetPaycheckMultipleAllocationScreen setPaycheckMultipleAllocationScreen, BetterNavigator.ScreenNavigator screenNavigator, CoroutineScope coroutineScope, BlockersDataNavigator blockersDataNavigator, PaychecksAppService paychecksAppService, Analytics analytics, ErrorReporter errorReporter, SampleStrategy sampleStrategy, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory) {
        List<Long> list;
        MultipleAllocationBlocker.ZeroAllocationBehavior zeroAllocationBehavior;
        MultipleAllocationBlocker.ZeroAllocationBehavior zeroAllocationBehavior2;
        LocalizedString localizedString;
        this.$r8$classId = 9;
        this.args = setPaycheckMultipleAllocationScreen;
        this.navigator = screenNavigator;
        this.cardLockFlowTypeProvider = coroutineScope;
        this.cashAppTagManager = blockersDataNavigator;
        this.issuedCardManager = paychecksAppService;
        this.analytics = analytics;
        this.franklinAppService = errorReporter;
        this.flowStarter = sampleStrategy;
        this.stringManager = androidStringManager;
        this.flowNavigationHelper = factory.create(MoneyFormatterConfig.STANDARD);
        this.deviceLockAnimationBus = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new P2PListViewKt$$ExternalSyntheticLambda2(29));
        SetPaycheckMultiAllocationBlocker setPaycheckMultiAllocationBlocker = setPaycheckMultipleAllocationScreen.blocker;
        setPaycheckMultiAllocationBlocker.getClass();
        PaychecksParsingErrorFactory paychecksParsingErrorFactory = PaychecksParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(setPaycheckMultiAllocationBlocker, paychecksParsingErrorFactory, this);
            AllocationDistribution allocationDistribution = setPaycheckMultiAllocationBlocker.distribution;
            ProtoValidationScope.required(allocationDistribution, "distribution");
            Integer num = setPaycheckMultiAllocationBlocker.editable_distribution_allocation_start_index;
            ProtoValidationScope.required(num, "editable_distribution_allocation_start_index");
            int intValue = num.intValue();
            List<SetPaycheckMultiAllocationBlocker.EditableAllocation> list2 = setPaycheckMultiAllocationBlocker.editable_allocations;
            ProtoValidationScope.requiredCount(protoValidationScope, list2, "editable_allocations", 1, null);
            List<SetPaycheckMultiAllocationBlocker.EditableAllocation> list3 = list2;
            List<Color> list4 = setPaycheckMultiAllocationBlocker.allocation_tint_colors;
            int size = allocationDistribution.allocations.size();
            list4.getClass();
            ProtoValidationScope.requiredCount(protoValidationScope, list4, "allocation_tint_colors", Integer.valueOf(size), Integer.valueOf(size));
            ArrayList allocations = SetPaycheckMultipleAllocationMappersKt.toAllocations(protoValidationScope, allocationDistribution, list3, list4, intValue);
            String required = ProtoValidationScope.required(setPaycheckMultiAllocationBlocker.localized_title, "localized_title");
            MultipleAllocationBlocker.ActionConfig actionConfig = new MultipleAllocationBlocker.ActionConfig(ProtoValidationScope.required(setPaycheckMultiAllocationBlocker.localized_cta_title, "localized_cta_title"), ProtoValidationScope.required(setPaycheckMultiAllocationBlocker.localized_disable_cta_title, "localized_disable_cta_title"));
            IntRange until = RangesKt___RangesKt.until(intValue, list3.size() + intValue);
            Money money = setPaycheckMultiAllocationBlocker.average_monthly_paycheck_amount;
            String reportIfNullAndContinue = protoValidationScope.reportIfNullAndContinue(setPaycheckMultiAllocationBlocker.custom_amount_subtitle, "custom_amount_subtitle", (String) null);
            String reportIfNullAndContinue2 = protoValidationScope.reportIfNullAndContinue(setPaycheckMultiAllocationBlocker.custom_amount_accessibility_hint, "custom_amount_accessibility_hint", (String) null);
            String str = reportIfNullAndContinue2 == null ? "Custom amount" : reportIfNullAndContinue2;
            List<Long> list5 = setPaycheckMultiAllocationBlocker.atm_picker_options_in_basis_points;
            if (list5.isEmpty()) {
                list = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{100L, 500L, 1000L, 1500L, 2000L});
            } else {
                List<Long> list6 = list5;
                ProtoValidationScope.requiredCount(protoValidationScope, list6, "atm_picker_options_in_basis_points", 5, 5);
                list = list6;
            }
            List<Long> list7 = list;
            LocalizedTemplatedString localizedTemplatedString = setPaycheckMultiAllocationBlocker.atm_option_accessibility_hint_template;
            Object obj = "%s";
            Object reportIfNullAndContinue3 = protoValidationScope.reportIfNullAndContinue("atm_option_accessibility_hint_template", (String) null, (localizedTemplatedString == null || (localizedString = localizedTemplatedString.android) == null) ? null : localizedString.translated_value);
            if (reportIfNullAndContinue3 != null) {
                obj = reportIfNullAndContinue3;
            }
            String str2 = (String) obj;
            PaychecksAlertUi paychecksAlertUi = CommonMappersKt.toPaychecksAlertUi(protoValidationScope, (AlertUi) protoValidationScope.reportIfNullAndContinue("exceeded_max_distribution_alert_ui", (String) null, setPaycheckMultiAllocationBlocker.exceeded_max_distribution_alert_ui));
            SetPaycheckMultiAllocationBlocker.ZeroAllocationBehavior zeroAllocationBehavior3 = setPaycheckMultiAllocationBlocker.zero_allocation_behavior;
            ProtoValidationScope.required(zeroAllocationBehavior3, "zero_allocation_behavior");
            int i = SetPaycheckMultipleAllocationMappersKt.WhenMappings.$EnumSwitchMapping$1[zeroAllocationBehavior3.ordinal()];
            if (i == 1) {
                zeroAllocationBehavior = MultipleAllocationBlocker.ZeroAllocationBehavior.RequireAtLeastOnePercentAllocation.INSTANCE;
            } else {
                if (i != 2) {
                    if (i == 3) {
                        throw new com.squareup.cash.banking.observability.ProtoParsingError("ZeroAllocationBehavior", ProtoParsingError.ErrorType.UNSUPPORTED_ENUM_VALUE, "ZERO_ALLOCATION_BEHAVIOR_DO_NOT_USE", null, null, null, null, 120);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    zeroAllocationBehavior2 = null;
                    squareup.cash.paychecks.BottomSheet bottomSheet = setPaycheckMultiAllocationBlocker.explanation;
                    this.ioDispatcher = new MultipleAllocationBlocker(required, actionConfig, money, list7, str2, reportIfNullAndContinue, str, paychecksAlertUi, allocations, until, zeroAllocationBehavior2, bottomSheet == null ? new BottomSheet(ProtoValidationScope.required(bottomSheet.title, "title"), ProtoValidationScope.required(bottomSheet.description, "description")) : null);
                }
                zeroAllocationBehavior = MultipleAllocationBlocker.ZeroAllocationBehavior.ShowDisableCta.INSTANCE;
            }
            zeroAllocationBehavior2 = zeroAllocationBehavior;
            squareup.cash.paychecks.BottomSheet bottomSheet2 = setPaycheckMultiAllocationBlocker.explanation;
            this.ioDispatcher = new MultipleAllocationBlocker(required, actionConfig, money, list7, str2, reportIfNullAndContinue, str, paychecksAlertUi, allocations, until, zeroAllocationBehavior2, bottomSheet2 == null ? new BottomSheet(ProtoValidationScope.required(bottomSheet2.title, "title"), ProtoValidationScope.required(bottomSheet2.description, "description")) : null);
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(SetPaycheckMultiAllocationBlocker.class), paychecksParsingErrorFactory, null);
        }
    }
}
