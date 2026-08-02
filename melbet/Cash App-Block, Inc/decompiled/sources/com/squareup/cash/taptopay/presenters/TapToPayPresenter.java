package com.squareup.cash.taptopay.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.net.Uri;
import android.os.Parcelable;
import android.text.format.DateUtils;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.platform.ShapeContainingUtilKt;
import androidx.compose.ui.platform.WindowInfoImpl;
import androidx.core.text.TextUtilsCompat;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.inputfieldtext.InputFieldText;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.model.FillrWidget;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.google.zxing.Result;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.R;
import com.squareup.cash.account.manager.backend.real.RealAccountRatePlanManager;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator$Factory$Impl;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.account.presenters.EditProfilePresenter$toBusinessUpgradeModel$1;
import com.squareup.cash.account.screens.EditProfile;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager;
import com.squareup.cash.account.settings.backend.RealProfilePhotoManager$Factory$Impl;
import com.squareup.cash.account.settings.viewmodels.AccountAvatarViewModel;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$DialogModel;
import com.squareup.cash.account.settings.viewmodels.EditProfileViewModel$EditCustomerProfileViewModel;
import com.squareup.cash.account.settings.viewmodels.PreviewTrustIndicatorViewModel;
import com.squareup.cash.account.settings.viewmodels.ViewMode;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda10;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.banking.DisclosureForScreen;
import com.squareup.cash.banking.applets.presenters.BalanceAppletTileRepository;
import com.squareup.cash.banking.applets.viewmodels.BalanceAppletTileViewModel;
import com.squareup.cash.banking.navigation.real.RealBankingOutboundNavigator$Factory$Impl;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.navigation.RealBitcoinRefreshInvoiceManager;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$DisplayAmounts$AmountsNotReady;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$WhenMappings;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsQrCodeModel;
import com.squareup.cash.bitcoin.presenters.deposits.RealLightningInvoiceGenerator;
import com.squareup.cash.bitcoin.screens.BitcoinDepositsScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountPickerResult;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDepositsViewModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.ErrorView$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.cdf.stock.StockSelectSubmitCancel;
import com.squareup.cash.cdf.stock.StockSelectSubmitSelection;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$Access$1;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.deviceintegrity.RealDeviceIntegrityAttester;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneyTabBalanceAppletMathText;
import com.squareup.cash.featureflags.AmplitudeExperiments$NuxActivation;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ManagedAccountAuthenticatedPhotoUploads;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.google.pay.RealGooglePayer$$ExternalSyntheticLambda0;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.api.model.EntitySelectionBlocker;
import com.squareup.cash.investing.backend.real.InvestingParsingErrorFactory;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities$discoveryStocks$$inlined$flatMapLatest$1;
import com.squareup.cash.investing.backend.real.mapper.InvestmentEntitySelectionBlockerMapperKt;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries$selectDiscoveries$2;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries.SelectDiscoveriesQuery;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.presenters.InvestingStockSelectionBlockerPresenter$submitSelection$1;
import com.squareup.cash.investing.presenters.StockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewEvent;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel$Header$TitleOnly;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel$Loaded$SingleSelect$SearchingStocks;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine$Map$3$1;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda0;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.privacy.RealBalancePrivacy;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownListKt$$ExternalSyntheticLambda6;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mri.android.RealMRIFactory;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.navigation.CashInvestingOutboundNavigator$Factory$Impl;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$8$1;
import com.squareup.cash.paychecks.backend.api.model.PaycheckAllocationDistribution;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.common.presenters.UtilsKt;
import com.squareup.cash.paychecks.presenters.PaychecksHomePresenter$models$2$1;
import com.squareup.cash.paychecks.presenters.PaychecksHomePresenter$toViewModelSection$$inlined$sortedBy$1;
import com.squareup.cash.paychecks.screens.PaychecksHomeScreen;
import com.squareup.cash.paychecks.viewmodels.ActiveDistributionSectionBodyViewModel;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewEvent;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.views.DissolveWipeContentKt$DissolveWipeContent$1$1;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.phoneplans.PhonePlansHomePresenter$models$1$1;
import com.squareup.cash.profile.presenters.RealProfilePreviewPresenter$Factory$Impl;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.ProfileViewEvent;
import com.squareup.cash.profile.viewmodels.ProfileViewModel;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter;
import com.squareup.cash.qrcodes.viewmodels.QrCodeArgs;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securitysignals.backend.RealScreenRecordingDetector;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.TimeToLiveSyncState;
import com.squareup.cash.shopping.web.ShoppingWebBridge;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.taptopay.backend.api.TapToPayPaymentData;
import com.squareup.cash.taptopay.backend.real.RealTapToPayActionManager;
import com.squareup.cash.taptopay.backend.real.RealTapToPayAnalyticsHelper;
import com.squareup.cash.taptopay.backend.real.RealTapToPayEligibilityProvider;
import com.squareup.cash.taptopay.backend.real.RealTapToPayErrorReporter;
import com.squareup.cash.taptopay.backend.real.RealTapToPayRepository;
import com.squareup.cash.taptopay.backend.real.RealTapToPaySessionManager;
import com.squareup.cash.taptopay.encryption.real.RealHieroglyphKeyProvider;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.taptopay.screens.TapToPayScreen;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.util.RealDrawerOpener$getDrawerScreen$$inlined$map$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.investflow.flows.InvestFlowService;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest$Action$Cancel;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest$Action$CancelWithDisableIntent;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest$Action$InvestmentEntityToken;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionRequest$Action$Selection;
import com.squareup.protos.cash.investflow.flows.SubmitInvestmentEntitySelectionResponse;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.blockers.InvestmentEntitySelectionBlocker;
import com.squareup.protos.franklin.blockers.RoundUp$Screens$StockSelector;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.FullCashtag;
import com.squareup.util.Strings;
import com.squareup.util.cash.Cashtags;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.cash.Countries;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.StateFlowKt$$ExternalSyntheticLambda3;
import com.squareup.util.coroutines.StateFlowKt$combineState$8;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import com.withpersona.sdk2.inquiry.ui.UiStepFileSelectWorker$run$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StartedLazily$command$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.Cookie;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;
import squareup.cash.paychecks.UiConfiguration;
import squareup.cash.paychecks.UiState;

/* loaded from: classes6.dex */
public final class TapToPayPresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId;
    public final Object deviceIntegrityAttester;
    public final Object errorReporter;
    public final Object flowStarter;
    public final Object keyProvider;
    public final Object mriFactory;
    public final Object navigator;
    public final Object profileManager;
    public final Object screen;
    public final Object screenRecodingDetector;
    public final Object sessionManager;
    public final Object tapToPayActionManager;
    public final Object tapToPayAnalyticsHelper;
    public final Object tapToPayErrorReporter;
    public final Object tapToPayRepository;
    public final Object ttpEligibilityProvider;
    public final Object ttpSessionManager;

    public TapToPayPresenter(BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.StockSelectionBlockerScreen stockSelectionBlockerScreen, CoroutineContext coroutineContext, Analytics analytics, BlockersDataNavigator blockersDataNavigator, CashInvestingOutboundNavigator$Factory$Impl cashInvestingOutboundNavigator$Factory$Impl, InvestFlowService investFlowService, AndroidStringManager androidStringManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealInvestmentEntities realInvestmentEntities, RealInputFieldTextSaver realInputFieldTextSaver, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.$r8$classId = 4;
        stockSelectionBlockerScreen.getClass();
        this.navigator = screenNavigator;
        this.deviceIntegrityAttester = stockSelectionBlockerScreen;
        this.flowStarter = coroutineContext;
        this.keyProvider = analytics;
        this.profileManager = blockersDataNavigator;
        this.sessionManager = investFlowService;
        this.tapToPayActionManager = androidStringManager;
        this.tapToPayAnalyticsHelper = cashAccountDatabaseImpl;
        this.tapToPayErrorReporter = realInvestmentEntities;
        this.tapToPayRepository = realInputFieldTextSaver;
        this.errorReporter = errorReporter;
        this.ttpEligibilityProvider = sampleStrategy;
        InvestmentEntitySelectionBlocker investmentEntitySelectionBlocker = stockSelectionBlockerScreen.blocker;
        investmentEntitySelectionBlocker.getClass();
        InvestingParsingErrorFactory investingParsingErrorFactory = InvestingParsingErrorFactory.INSTANCE;
        try {
            ProtoValidationScope protoValidationScope = new ProtoValidationScope(investmentEntitySelectionBlocker, investingParsingErrorFactory, this);
            RoundUp$Screens$StockSelector roundUp$Screens$StockSelector = investmentEntitySelectionBlocker.stock_selector_screen;
            ProtoValidationScope.required(roundUp$Screens$StockSelector, "stock_selector_screen");
            String str = roundUp$Screens$StockSelector.title;
            ProtoValidationScope.required(str, "title");
            String str2 = roundUp$Screens$StockSelector.search_bar_placeholder_text;
            ProtoValidationScope.required(str2, "search_bar_placeholder_text");
            EntitySelectionBlocker.StockSelectorConfig stockSelectorConfig = new EntitySelectionBlocker.StockSelectorConfig(roundUp$Screens$StockSelector.select_button_tint_color, str, str2);
            EntitySelectionBlocker.MultiSelectData.MultiSelectConfig multiSelectConfig = InvestmentEntitySelectionBlockerMapperKt.toMultiSelectConfig(protoValidationScope, investmentEntitySelectionBlocker.multi_selection_parameters);
            Object multiSelectData = multiSelectConfig != null ? new EntitySelectionBlocker.MultiSelectData(stockSelectorConfig, multiSelectConfig) : new EntitySelectionBlocker.SingleSelectData(stockSelectorConfig);
            this.ttpSessionManager = multiSelectData;
            this.mriFactory = Updater.mutableStateOf$default(Boolean.FALSE);
            AndroidStringManager androidStringManager2 = (AndroidStringManager) cashInvestingOutboundNavigator$Factory$Impl.delegateFactory.stringManager.lambda.invoke();
            androidStringManager2.getClass();
            this.screen = new Lazy(9, androidStringManager2, screenNavigator);
            this.screenRecodingDetector = multiSelectData instanceof EntitySelectionBlocker.MultiSelectData ? CollectionsKt.toSet(((EntitySelectionBlocker.MultiSelectData) multiSelectData).multiSelectConfig.selectedInvestmentEntities) : EmptySet.INSTANCE;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(InvestmentEntitySelectionBlocker.class), investingParsingErrorFactory, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitSelection(TapToPayPresenter tapToPayPresenter, InvestingStockSelectionViewEvent investingStockSelectionViewEvent, ContinuationImpl continuationImpl) {
        InvestingStockSelectionBlockerPresenter$submitSelection$1 investingStockSelectionBlockerPresenter$submitSelection$1;
        int i;
        SubmitInvestmentEntitySelectionRequest submitInvestmentEntitySelectionRequest;
        ArrayList arrayList;
        ApiResult apiResult;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) tapToPayPresenter.mriFactory;
        Analytics analytics = (Analytics) tapToPayPresenter.keyProvider;
        BlockersScreens.StockSelectionBlockerScreen stockSelectionBlockerScreen = (BlockersScreens.StockSelectionBlockerScreen) tapToPayPresenter.deviceIntegrityAttester;
        if (continuationImpl instanceof InvestingStockSelectionBlockerPresenter$submitSelection$1) {
            investingStockSelectionBlockerPresenter$submitSelection$1 = (InvestingStockSelectionBlockerPresenter$submitSelection$1) continuationImpl;
            int i2 = investingStockSelectionBlockerPresenter$submitSelection$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                investingStockSelectionBlockerPresenter$submitSelection$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = investingStockSelectionBlockerPresenter$submitSelection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = investingStockSelectionBlockerPresenter$submitSelection$1.label;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    parcelableSnapshotMutableState.setValue(Boolean.TRUE);
                    BlockersData blockersData = stockSelectionBlockerScreen.blockersData;
                    String str2 = blockersData.flowToken;
                    InvestFlowService investFlowService = (InvestFlowService) tapToPayPresenter.sessionManager;
                    if (investingStockSelectionViewEvent instanceof InvestingStockSelectionViewEvent.SubmitMultiSelection) {
                        Set set = ((InvestingStockSelectionViewEvent.SubmitMultiSelection) investingStockSelectionViewEvent).entities;
                        if (set != null) {
                            Set set2 = set;
                            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set2, 10));
                            Iterator it = set2.iterator();
                            while (it.hasNext()) {
                                arrayList.add((String) ((Pair) it.next()).first);
                            }
                        } else {
                            arrayList = null;
                        }
                        Set set3 = set;
                        analytics.track((set3 == null || set3.isEmpty()) ? new StockSelectSubmitCancel(str2, Boolean.TRUE) : new StockSelectSubmitSelection(str2, CollectionsKt.joinToString$default(set, "|", null, null, 0, null, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(24), 30)), null);
                        submitInvestmentEntitySelectionRequest = (arrayList == null || arrayList.isEmpty()) ? new SubmitInvestmentEntitySelectionRequest(blockersData.requestContext, new SubmitInvestmentEntitySelectionRequest$Action$CancelWithDisableIntent(new SubmitInvestmentEntitySelectionRequest.CancelWithDisableIntent(ByteString.EMPTY))) : new SubmitInvestmentEntitySelectionRequest(blockersData.requestContext, new SubmitInvestmentEntitySelectionRequest$Action$Selection(new SubmitInvestmentEntitySelectionRequest.SelectionAction(CollectionsKt.toList(arrayList), ByteString.EMPTY)));
                    } else if (investingStockSelectionViewEvent instanceof InvestingStockSelectionViewEvent.NavigationClicked) {
                        analytics.track(new StockSelectSubmitCancel(str2, Boolean.FALSE), null);
                        submitInvestmentEntitySelectionRequest = new SubmitInvestmentEntitySelectionRequest(blockersData.requestContext, new SubmitInvestmentEntitySelectionRequest$Action$Cancel(new SubmitInvestmentEntitySelectionRequest.CancelAction()));
                    } else {
                        submitInvestmentEntitySelectionRequest = investingStockSelectionViewEvent instanceof InvestingStockSelectionViewEvent.SelectStockClicked ? new SubmitInvestmentEntitySelectionRequest(blockersData.requestContext, new SubmitInvestmentEntitySelectionRequest$Action$InvestmentEntityToken(((InvestingStockSelectionViewEvent.SelectStockClicked) investingStockSelectionViewEvent).entityToken.value)) : new SubmitInvestmentEntitySelectionRequest(blockersData.requestContext, new SubmitInvestmentEntitySelectionRequest$Action$Cancel(new SubmitInvestmentEntitySelectionRequest.CancelAction()));
                    }
                    investingStockSelectionBlockerPresenter$submitSelection$1.label = 1;
                    obj = investFlowService.submitInvestmentEntitySelection(str2, submitInvestmentEntitySelectionRequest, investingStockSelectionBlockerPresenter$submitSelection$1);
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
                if (!(apiResult instanceof ApiResult.Success)) {
                    ResponseContext responseContext = ((SubmitInvestmentEntitySelectionResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    BlockersData blockersData2 = stockSelectionBlockerScreen.blockersData;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    ((BetterNavigator.ScreenNavigator) tapToPayPresenter.navigator).goTo(((BlockersDataNavigator) tapToPayPresenter.profileManager).getNext(stockSelectionBlockerScreen, blockersData2.updateFromResponseContext(responseContext, false)));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Lazy lazy = (Lazy) tapToPayPresenter.screen;
                    lazy.getClass();
                    ((BetterNavigator.ScreenNavigator) lazy.value).goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging((AndroidStringManager) lazy.initializer, (ApiResult.Failure) apiResult, null).message, str, 14));
                }
                parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }
        investingStockSelectionBlockerPresenter$submitSelection$1 = new InvestingStockSelectionBlockerPresenter$submitSelection$1(tapToPayPresenter, continuationImpl);
        Object obj2 = investingStockSelectionBlockerPresenter$submitSelection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = investingStockSelectionBlockerPresenter$submitSelection$1.label;
        String str3 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        parcelableSnapshotMutableState.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if (r6 == r9) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$toBusinessUpgradeModel(TapToPayPresenter tapToPayPresenter, RealAccountRatePlanManager realAccountRatePlanManager, boolean z, ContinuationImpl continuationImpl) {
        EditProfilePresenter$toBusinessUpgradeModel$1 editProfilePresenter$toBusinessUpgradeModel$1;
        Object obj;
        int i;
        boolean z2;
        AndroidStringManager androidStringManager = (AndroidStringManager) tapToPayPresenter.deviceIntegrityAttester;
        if (continuationImpl instanceof EditProfilePresenter$toBusinessUpgradeModel$1) {
            editProfilePresenter$toBusinessUpgradeModel$1 = (EditProfilePresenter$toBusinessUpgradeModel$1) continuationImpl;
            int i2 = editProfilePresenter$toBusinessUpgradeModel$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                editProfilePresenter$toBusinessUpgradeModel$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = editProfilePresenter$toBusinessUpgradeModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = editProfilePresenter$toBusinessUpgradeModel$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    editProfilePresenter$toBusinessUpgradeModel$1.L$0 = realAccountRatePlanManager;
                    editProfilePresenter$toBusinessUpgradeModel$1.Z$0 = z;
                    editProfilePresenter$toBusinessUpgradeModel$1.label = 1;
                    obj = realAccountRatePlanManager.canDowngrade(editProfilePresenter$toBusinessUpgradeModel$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = editProfilePresenter$toBusinessUpgradeModel$1.Z$0;
                        SafeTrace.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new EditProfileViewModel$EditCustomerProfileViewModel.BusinessUpgradeModel(androidStringManager.get(R.string.edit_profile_business_upgrade), z2);
                    }
                    z = editProfilePresenter$toBusinessUpgradeModel$1.Z$0;
                    realAccountRatePlanManager = editProfilePresenter$toBusinessUpgradeModel$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return new EditProfileViewModel$EditCustomerProfileViewModel.BusinessUpgradeModel(androidStringManager.get(R.string.edit_profile_personal_downgrade), z);
                }
                editProfilePresenter$toBusinessUpgradeModel$1.L$0 = null;
                editProfilePresenter$toBusinessUpgradeModel$1.Z$0 = z;
                editProfilePresenter$toBusinessUpgradeModel$1.label = 2;
                obj = realAccountRatePlanManager.canUpgrade(editProfilePresenter$toBusinessUpgradeModel$1);
                if (obj != coroutineSingletons) {
                    z2 = z;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return coroutineSingletons;
            }
        }
        editProfilePresenter$toBusinessUpgradeModel$1 = new EditProfilePresenter$toBusinessUpgradeModel$1(tapToPayPresenter, continuationImpl);
        obj = editProfilePresenter$toBusinessUpgradeModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = editProfilePresenter$toBusinessUpgradeModel$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public static Pair callToActionButtonStatus(EntitySelectionBlocker.MultiSelectData.MultiSelectConfig multiSelectConfig, boolean z) {
        String str = multiSelectConfig.confirmCtaText;
        if (z) {
            return new Pair(str, Boolean.TRUE);
        }
        EntitySelectionBlocker.MultiSelectData.ZeroSelectionBehavior zeroSelectionBehavior = multiSelectConfig.zeroSelectionBehavior;
        if (zeroSelectionBehavior.equals(EntitySelectionBlocker.MultiSelectData.ZeroSelectionBehavior.ShowCancelCta.INSTANCE)) {
            return new Pair(multiSelectConfig.cancelCtaText, Boolean.TRUE);
        }
        if (zeroSelectionBehavior.equals(EntitySelectionBlocker.MultiSelectData.ZeroSelectionBehavior.ShowConfirmCtaDisabled.INSTANCE)) {
            return new Pair(str, Boolean.FALSE);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static String formatNumberForContentDescription(String str) {
        ArrayList arrayList = new ArrayList(str.length());
        for (int i = 0; i < str.length(); i++) {
            arrayList.add(str.charAt(i) + "\u200b");
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62);
    }

    public static PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.ActivitySection getActivitySection(PaychecksUiConfiguration.PaychecksHomeUi paychecksHomeUi) {
        Object obj;
        Iterator it = paychecksHomeUi.sections.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection) obj) instanceof PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.ActivitySection) {
                break;
            }
        }
        if (obj instanceof PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.ActivitySection) {
            return (PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.ActivitySection) obj;
        }
        return null;
    }

    private final Object models$com$squareup$cash$investing$presenters$InvestingStockSelectionBlockerPresenter(Flow flow, Composer composer, int i) {
        EntitySelectionBlocker entitySelectionBlocker;
        Set set;
        CashAccountDatabaseImpl cashAccountDatabaseImpl;
        Set set2;
        InputFieldText inputFieldText;
        Object obj;
        Object browsing;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-854718787);
        Object[] objArr = new Object[0];
        RealInputFieldTextSaver realInputFieldTextSaver = (RealInputFieldTextSaver) this.tapToPayRepository;
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        if (rememberedValue == obj2) {
            rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda0(18);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) realInputFieldTextSaver, (Function0) rememberedValue, (Composer) gapComposer, MLKEMEngine.KyberPolyBytes);
        Object[] objArr2 = new Object[0];
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == obj2) {
            rememberedValue2 = new RealGooglePayer$$ExternalSyntheticLambda0(this, 23);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer, 0);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance2 || rememberedValue3 == obj2) {
            rememberedValue3 = new RealProfileManager$profileOrNull$2(this, continuation, 28);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
        Updater.LaunchedEffect(gapComposer, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, this, rememberSaveable, mutableState, 11));
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj2) {
            rememberedValue4 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue4;
        boolean changedInstance3 = gapComposer.changedInstance(this) | gapComposer.changed(mutableState) | gapComposer.changedInstance(coroutineScope);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue5 == obj2) {
            rememberedValue5 = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(13, this, coroutineScope, mutableState);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Function2 function2 = (Function2) rememberedValue5;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed = gapComposer.changed(function2) | gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue6 = gapComposer.rememberedValue();
        int i2 = 1;
        if (changed || rememberedValue6 == obj2) {
            rememberedValue6 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, i2);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue6, gapComposer);
        Set set3 = (Set) mutableState.getValue();
        InputFieldText inputFieldText2 = (InputFieldText) rememberSaveable.getValue();
        EntitySelectionBlocker entitySelectionBlocker2 = (EntitySelectionBlocker) this.ttpSessionManager;
        RealInvestmentEntities realInvestmentEntities = (RealInvestmentEntities) this.tapToPayErrorReporter;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.tapToPayActionManager;
        CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) this.tapToPayAnalyticsHelper;
        CoroutineContext coroutineContext = (CoroutineContext) this.flowStarter;
        coroutineScope.getClass();
        Pair selectionConfigs = Cookie.Companion.getSelectionConfigs(entitySelectionBlocker2, set3);
        boolean booleanValue = ((Boolean) selectionConfigs.first).booleanValue();
        Set set4 = (Set) selectionConfigs.second;
        boolean changed2 = gapComposer.changed(set3);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue7 == obj2) {
            RealDrawerOpener$getDrawerScreen$$inlined$map$1 realDrawerOpener$getDrawerScreen$$inlined$map$1 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(realInvestmentEntities.ownedStocks(), 7);
            RealDrawerOpener$getDrawerScreen$$inlined$map$1 realDrawerOpener$getDrawerScreen$$inlined$map$12 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(realInvestmentEntities.followingStocks(), 8);
            InvestingDiscoveryQueries investingDiscoveryQueries = realInvestmentEntities.cashDatabase.investingDiscoveryQueries;
            investingDiscoveryQueries.getClass();
            InvestingDiscoveryQueries$selectDiscoveries$2 investingDiscoveryQueries$selectDiscoveries$2 = InvestingDiscoveryQueries$selectDiscoveries$2.INSTANCE;
            RealDrawerOpener$getDrawerScreen$$inlined$map$1 realDrawerOpener$getDrawerScreen$$inlined$map$13 = new RealDrawerOpener$getDrawerScreen$$inlined$map$1(FlowKt.transformLatest(DBUtil.mapToList(DBUtil.toFlow(investingDiscoveryQueries.new SelectDiscoveriesQuery(false, new TooltipBoxKt$$ExternalSyntheticLambda2(investingDiscoveryQueries))), realInvestmentEntities.ioDispatcher), new RealInvestmentEntities$discoveryStocks$$inlined$flatMapLatest$1(null, true, realInvestmentEntities)), 9);
            StockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4 stockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4 = new StockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4(entitySelectionBlocker2, set4, androidStringManager, set3, coroutineContext, cashAccountDatabaseImpl2, booleanValue, null);
            entitySelectionBlocker = entitySelectionBlocker2;
            set = set3;
            coroutineContext = coroutineContext;
            cashAccountDatabaseImpl = cashAccountDatabaseImpl2;
            rememberedValue7 = FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.combine(realDrawerOpener$getDrawerScreen$$inlined$map$1, realDrawerOpener$getDrawerScreen$$inlined$map$12, realDrawerOpener$getDrawerScreen$$inlined$map$13, stockSelectionPresenterHelperKt$getDefaultSearchResults$defaultSearchResults$2$4)), coroutineScope, SharingStarted.Companion.Eagerly, 1);
            gapComposer.updateRememberedValue(rememberedValue7);
        } else {
            set = set3;
            entitySelectionBlocker = entitySelectionBlocker2;
            cashAccountDatabaseImpl = cashAccountDatabaseImpl2;
        }
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        InvestingStockSelectionViewModel.SearchResultModel.LabeledSections labeledSections = (InvestingStockSelectionViewModel.SearchResultModel.LabeledSections) Updater.collectAsState((SharedFlow) rememberedValue7, new InvestingStockSelectionViewModel.SearchResultModel.LabeledSections(emptyMap), null, gapComposer, 48, 2).getValue();
        inputFieldText2.getClass();
        labeledSections.getClass();
        boolean booleanValue2 = ((Boolean) Cookie.Companion.getSelectionConfigs(entitySelectionBlocker, set).first).booleanValue();
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (rememberedValue8 == obj2) {
            rememberedValue8 = Updater.mutableStateOf$default(labeledSections);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState2 = (MutableState) rememberedValue8;
        CharSequence value = inputFieldText2.getValue();
        boolean changedInstance4 = gapComposer.changedInstance(inputFieldText2) | gapComposer.changedInstance(coroutineContext) | gapComposer.changedInstance(cashAccountDatabaseImpl) | gapComposer.changedInstance(set) | gapComposer.changed(booleanValue2) | gapComposer.changed(labeledSections);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changedInstance4 || rememberedValue9 == obj2) {
            set2 = set;
            inputFieldText = inputFieldText2;
            Object googleMapEngine$Map$3$1 = new GoogleMapEngine$Map$3$1(inputFieldText, coroutineContext, cashAccountDatabaseImpl, set2, booleanValue2, labeledSections, mutableState2, (Continuation) null);
            gapComposer.updateRememberedValue(googleMapEngine$Map$3$1);
            rememberedValue9 = googleMapEngine$Map$3$1;
        } else {
            set2 = set;
            inputFieldText = inputFieldText2;
        }
        Updater.LaunchedEffect(value, labeledSections, (Function2) rememberedValue9, gapComposer);
        final InvestingStockSelectionViewModel.SearchResultModel searchResultModel = (InvestingStockSelectionViewModel.SearchResultModel) mutableState2.getValue();
        if (((Boolean) ((ParcelableSnapshotMutableState) this.mriFactory).getValue()).booleanValue()) {
            browsing = InvestingStockSelectionViewModel.Submitting.INSTANCE;
        } else if (StringsKt.isBlank(inputFieldText.getValue())) {
            if (entitySelectionBlocker instanceof EntitySelectionBlocker.MultiSelectData) {
                EntitySelectionBlocker.MultiSelectData multiSelectData = (EntitySelectionBlocker.MultiSelectData) entitySelectionBlocker;
                EntitySelectionBlocker.StockSelectorConfig stockSelectorConfig = multiSelectData.stockSelectorConfig;
                EntitySelectionBlocker.MultiSelectData.MultiSelectConfig multiSelectConfig = multiSelectData.multiSelectConfig;
                Pair callToActionButtonStatus = callToActionButtonStatus(multiSelectConfig, !set2.isEmpty());
                String str = (String) callToActionButtonStatus.first;
                boolean booleanValue3 = ((Boolean) callToActionButtonStatus.second).booleanValue();
                InvestingStockSelectionViewModel$Header$TitleOnly investingStockSelectionViewModel$Header$TitleOnly = new InvestingStockSelectionViewModel$Header$TitleOnly(stockSelectorConfig.title);
                String str2 = stockSelectorConfig.searchBarPlaceholderText;
                InvestingStockSelectionViewModel.NavigationIcon navigationIcon = InvestingStockSelectionViewModel.NavigationIcon.CLOSE;
                browsing = new InvestingStockSelectionViewModel.Loaded.MultiSelect.Browsing(investingStockSelectionViewModel$Header$TitleOnly, str2, searchResultModel, new InvestingStockSelectionViewModel.Loaded.MultiSelect.MultiSelectParametersViewModel(multiSelectConfig.infoText, str, multiSelectConfig.maxSelections, booleanValue3));
            } else {
                final InvestingStockSelectionViewModel$Header$TitleOnly investingStockSelectionViewModel$Header$TitleOnly2 = new InvestingStockSelectionViewModel$Header$TitleOnly(entitySelectionBlocker.getStockSelectorConfig().title);
                final String str3 = entitySelectionBlocker.getStockSelectorConfig().searchBarPlaceholderText;
                InvestingStockSelectionViewModel.NavigationIcon navigationIcon2 = InvestingStockSelectionViewModel.NavigationIcon.CLOSE;
                obj = new InvestingStockSelectionViewModel.Loaded(investingStockSelectionViewModel$Header$TitleOnly2, str3, searchResultModel) { // from class: com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel$Loaded$SingleSelect$Browsing
                    public final InvestingStockSelectionViewModel$Header$TitleOnly header;
                    public final String searchBarPlaceholderText;
                    public final InvestingStockSelectionViewModel.SearchResultModel searchResults;

                    {
                        InvestingStockSelectionViewModel.NavigationIcon navigationIcon3 = InvestingStockSelectionViewModel.NavigationIcon.CLOSE;
                        str3.getClass();
                        searchResultModel.getClass();
                        this.header = investingStockSelectionViewModel$Header$TitleOnly2;
                        this.searchBarPlaceholderText = str3;
                        this.searchResults = searchResultModel;
                    }

                    public final boolean equals(Object obj3) {
                        if (this == obj3) {
                            return true;
                        }
                        if (!(obj3 instanceof InvestingStockSelectionViewModel$Loaded$SingleSelect$Browsing)) {
                            return false;
                        }
                        InvestingStockSelectionViewModel$Loaded$SingleSelect$Browsing investingStockSelectionViewModel$Loaded$SingleSelect$Browsing = (InvestingStockSelectionViewModel$Loaded$SingleSelect$Browsing) obj3;
                        if (!this.header.equals(investingStockSelectionViewModel$Loaded$SingleSelect$Browsing.header) || !Intrinsics.areEqual(this.searchBarPlaceholderText, investingStockSelectionViewModel$Loaded$SingleSelect$Browsing.searchBarPlaceholderText)) {
                            return false;
                        }
                        InvestingStockSelectionViewModel.NavigationIcon navigationIcon3 = InvestingStockSelectionViewModel.NavigationIcon.CLOSE;
                        return Intrinsics.areEqual(this.searchResults, investingStockSelectionViewModel$Loaded$SingleSelect$Browsing.searchResults);
                    }

                    @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
                    public final InvestingStockSelectionViewModel$Header$TitleOnly getHeader() {
                        return this.header;
                    }

                    @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
                    public final InvestingStockSelectionViewModel.NavigationIcon getNavigationIcon() {
                        return InvestingStockSelectionViewModel.NavigationIcon.CLOSE;
                    }

                    @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
                    public final String getSearchBarPlaceholderText() {
                        return this.searchBarPlaceholderText;
                    }

                    @Override // com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel.Loaded
                    public final InvestingStockSelectionViewModel.SearchResultModel getSearchResults() {
                        return this.searchResults;
                    }

                    public final int hashCode() {
                        return this.searchResults.hashCode() + ((InvestingStockSelectionViewModel.NavigationIcon.CLOSE.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.header.title.hashCode() * 31, 31, this.searchBarPlaceholderText)) * 31);
                    }

                    public final String toString() {
                        return "Browsing(header=" + this.header + ", searchBarPlaceholderText=" + this.searchBarPlaceholderText + ", navigationIcon=" + InvestingStockSelectionViewModel.NavigationIcon.CLOSE + ", searchResults=" + this.searchResults + ")";
                    }
                };
                browsing = obj;
            }
        } else if (entitySelectionBlocker instanceof EntitySelectionBlocker.MultiSelectData) {
            EntitySelectionBlocker.MultiSelectData multiSelectData2 = (EntitySelectionBlocker.MultiSelectData) entitySelectionBlocker;
            EntitySelectionBlocker.StockSelectorConfig stockSelectorConfig2 = multiSelectData2.stockSelectorConfig;
            EntitySelectionBlocker.MultiSelectData.MultiSelectConfig multiSelectConfig2 = multiSelectData2.multiSelectConfig;
            Pair callToActionButtonStatus2 = callToActionButtonStatus(multiSelectConfig2, !set2.isEmpty());
            String str4 = (String) callToActionButtonStatus2.first;
            boolean booleanValue4 = ((Boolean) callToActionButtonStatus2.second).booleanValue();
            InputFieldText inputFieldText3 = inputFieldText;
            InvestingStockSelectionViewModel$Header$TitleOnly investingStockSelectionViewModel$Header$TitleOnly3 = new InvestingStockSelectionViewModel$Header$TitleOnly(stockSelectorConfig2.title);
            String str5 = stockSelectorConfig2.searchBarPlaceholderText;
            InvestingStockSelectionViewModel.NavigationIcon navigationIcon3 = InvestingStockSelectionViewModel.NavigationIcon.CLOSE;
            browsing = new InvestingStockSelectionViewModel.Loaded.MultiSelect.SearchingStocks(investingStockSelectionViewModel$Header$TitleOnly3, inputFieldText3, str5, searchResultModel, new InvestingStockSelectionViewModel.Loaded.MultiSelect.MultiSelectParametersViewModel(multiSelectConfig2.infoText, str4, multiSelectConfig2.maxSelections, booleanValue4));
        } else {
            InvestingStockSelectionViewModel$Header$TitleOnly investingStockSelectionViewModel$Header$TitleOnly4 = new InvestingStockSelectionViewModel$Header$TitleOnly(entitySelectionBlocker.getStockSelectorConfig().title);
            String str6 = entitySelectionBlocker.getStockSelectorConfig().searchBarPlaceholderText;
            InvestingStockSelectionViewModel.NavigationIcon navigationIcon4 = InvestingStockSelectionViewModel.NavigationIcon.CLOSE;
            obj = new InvestingStockSelectionViewModel$Loaded$SingleSelect$SearchingStocks(investingStockSelectionViewModel$Header$TitleOnly4, inputFieldText, str6, searchResultModel);
            browsing = obj;
        }
        gapComposer.end(false);
        return browsing;
    }

    public void RefreshInvoiceSideEffect(String str, String str2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(172054875);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(this) ? 256 : 128;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.skipToGroupEnd();
        } else if (str == null || str2 == null) {
            gapComposer.startReplaceGroup(-1383879796);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1383927846);
            Updater.LaunchedEffect(str, str2, new MoleculeKt$immediateClockFlow$1$1$1(str, str2, (Continuation) null, str, this, 7), gapComposer);
            gapComposer.end(false);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CopyCodeKt$$ExternalSyntheticLambda10(this, str, str2, i, 26);
        }
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        int i = this.$r8$classId;
        Object obj = this.errorReporter;
        switch (i) {
        }
        return (ErrorReporter) obj;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        switch (this.$r8$classId) {
            case 4:
                return (SampleStrategy) this.ttpEligibilityProvider;
            default:
                return (SampleStrategy) this.tapToPayErrorReporter;
        }
    }

    public void handleRoute$1(String str) {
        ((RealRouter) this.ttpSessionManager).route(new RoutingParams((PaychecksHomeScreen) this.ttpEligibilityProvider, null, null, null, null, null, 510), str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0355, code lost:
    
        if (r3.customerIsDenylisted == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x035b, code lost:
    
        if (r3.customerDdaIsLocked == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0372, code lost:
    
        if (r6 == false) goto L115;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[LOOP:2: B:94:0x0339->B:103:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0da5  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0da8  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0d48  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0516 A[SYNTHETIC] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object obj;
        MutableState mutableState;
        Object obj2;
        String str;
        Character ch;
        Profile profile;
        String str2;
        Long l;
        int i2;
        char c;
        FullCashtag fullCashtag;
        FullCashtag fullCashtag2;
        Object obj3;
        MutableState mutableState2;
        Object obj4;
        MutableState mutableState3;
        Object androidSecureStore$read$2;
        MutableState mutableState4;
        Object[] objArr;
        MutableState mutableState5;
        MutableState mutableState6;
        MutableState mutableState7;
        AndroidAutofill_androidKt androidAutofill_androidKt;
        String str3;
        String format2;
        PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.ActivitySection activitySection;
        PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.ActivitySection activitySection2;
        Throwable th;
        PaychecksHomeViewModel paychecksHomeViewModel;
        Object obj5;
        kotlin.Lazy lazy;
        PaychecksUiConfiguration paychecksUiConfiguration;
        Disclosure disclosure;
        GapComposer gapComposer;
        UiCallbackModel uiCallbackModel;
        PaychecksHomeViewModel.Content.ArcadeHeader benefitsModuleNullStateViewModel;
        PaychecksUiConfiguration paychecksUiConfiguration2;
        Disclosure disclosure2;
        UiCallbackModel uiCallbackModel2;
        PaychecksHomeViewModel.Content.Button button;
        PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel.ColoredText coloredText;
        Iterator it;
        PaychecksHomeViewModel.Content.DisclosureFooter disclosureFooter;
        PaychecksHomeViewModel content;
        List list;
        boolean z;
        boolean z2;
        List list2;
        Object obj6;
        Iterator it2;
        PaychecksUiConfiguration paychecksUiConfiguration3;
        UiCallbackModel uiCallbackModel3;
        PaychecksUiState paychecksUiState;
        UiCallbackModel uiCallbackModel4;
        int i3 = this.$r8$classId;
        Object obj7 = this.sessionManager;
        Object obj8 = this.screenRecodingDetector;
        Object obj9 = this.ttpSessionManager;
        Object obj10 = this.keyProvider;
        Object obj11 = this.deviceIntegrityAttester;
        int i4 = 27;
        Object obj12 = this.mriFactory;
        Object obj13 = this.profileManager;
        Object obj14 = this.tapToPayActionManager;
        Object obj15 = this.flowStarter;
        Object obj16 = this.screen;
        Object obj17 = Composer.Companion.Empty;
        final int i5 = 1;
        final int i6 = 0;
        switch (i3) {
            case 0:
                m3759models(flow, composer, i);
                return Unit.INSTANCE;
            case 1:
                RealProfileManager realProfileManager = (RealProfileManager) obj13;
                AndroidStringManager androidStringManager = (AndroidStringManager) obj11;
                Resources resources = androidStringManager.resources;
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-2146186437);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer2.changedInstance(this);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue == obj17) {
                    rememberedValue = new UiStepFileSelectWorker$run$1$1(this, null, 1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == obj17) {
                    rememberedValue2 = realProfileManager.profile();
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer2, 48, 2);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == obj17) {
                    Object flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(realProfileManager.publicProfile(), new SearchBarBinding$Content$1$1(this, null, 2), 3);
                    gapComposer2.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$1);
                    rememberedValue3 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer2, 48, 2);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (rememberedValue4 == obj17) {
                    Object realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealP2pSettingsManager) this.errorReporter).select(), 23);
                    gapComposer2.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$1);
                    rememberedValue4 = realLocalInstalledStore$hideBrands$$inlined$map$1;
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue4, Boolean.FALSE, null, gapComposer2, 48, 2);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                if (rememberedValue5 == obj17) {
                    rememberedValue5 = ((RealFamilyProfileManager) obj14).familyProfile;
                    gapComposer2.updateRememberedValue(rememberedValue5);
                }
                FamilyProfile.Standard standard = FamilyProfile.Standard.INSTANCE;
                MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue5, standard, null, gapComposer2, 0, 2);
                boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.tapToPayAnalyticsHelper)).peekCurrentValue(LaunchDarklyFeatureFlags$ManagedAccountAuthenticatedPhotoUploads.INSTANCE)).enabled();
                boolean z3 = ((FamilyProfile) collectAsState4.getValue()) instanceof FamilyProfile.ManagedAccount;
                boolean z4 = !z3 || enabled;
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (rememberedValue6 == obj17) {
                    obj = null;
                    rememberedValue6 = Updater.mutableStateOf$default(null);
                    gapComposer2.updateRememberedValue(rememberedValue6);
                } else {
                    obj = null;
                }
                MutableState mutableState8 = (MutableState) rememberedValue6;
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (rememberedValue7 == obj17) {
                    rememberedValue7 = Updater.mutableStateOf$default(obj);
                    gapComposer2.updateRememberedValue(rememberedValue7);
                }
                MutableState mutableState9 = (MutableState) rememberedValue7;
                boolean changedInstance2 = gapComposer2.changedInstance(this);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (changedInstance2 || rememberedValue8 == obj17) {
                    mutableState = collectAsState4;
                    rememberedValue8 = new EditProfilePresenter$models$2$1(this, mutableState9, (Continuation) null);
                    gapComposer2.updateRememberedValue(rememberedValue8);
                } else {
                    mutableState = collectAsState4;
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue8);
                PublicProfile publicProfile = (PublicProfile) collectAsState2.getValue();
                String symbol = (publicProfile == null || (fullCashtag2 = publicProfile.fullCashtag) == null) ? Moneys.symbol(CurrencyCode.USD) : Cashtags.symbol(fullCashtag2.currency);
                PublicProfile publicProfile2 = (PublicProfile) collectAsState2.getValue();
                String cashtagWithCurrencySymbol = (publicProfile2 == null || (fullCashtag = publicProfile2.fullCashtag) == null) ? null : FillrWidget.WidgetType.AnonymousClass1.cashtagWithCurrencySymbol(fullCashtag);
                Boolean bool = (Boolean) collectAsState3.getValue();
                bool.getClass();
                boolean changedInstance3 = gapComposer2.changedInstance(this) | gapComposer2.changed(collectAsState3);
                Object rememberedValue9 = gapComposer2.rememberedValue();
                if (changedInstance3 || rememberedValue9 == obj17) {
                    obj2 = null;
                    rememberedValue9 = new zzmo(this, collectAsState3, null);
                    gapComposer2.updateRememberedValue(rememberedValue9);
                } else {
                    obj2 = null;
                }
                MutableState produceState = Updater.produceState(obj2, bool, (Function2) rememberedValue9, gapComposer2, 6);
                FamilyProfile familyProfile = (FamilyProfile) mutableState.getValue();
                if (Intrinsics.areEqual(familyProfile, standard)) {
                    str = androidStringManager.get(R.string.edit_profile_basic_info_description);
                } else {
                    if (!(familyProfile instanceof FamilyProfile.ManagedAccount)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    int i7 = enabled ? R.string.edit_profile_managed_account_basic_info_description_photo_enabled : R.string.edit_profile_managed_account_basic_info_description;
                    int i8 = enabled ? R.string.edit_profile_managed_account_basic_info_description_photo_enabled_fallback : R.string.edit_profile_managed_account_basic_info_description_fallback;
                    String str4 = ((FamilyProfile.ManagedAccount) familyProfile).firstName;
                    if (str4 != null) {
                        if (StringsKt.isBlank(str4)) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            Map mapOf = MapsKt__MapsJVMKt.mapOf(new Pair("name", str4));
                            mapOf.getClass();
                            resources.getClass();
                            str = new MessageFormat(resources.getString(i7)).format(mapOf);
                            str.getClass();
                        }
                    }
                    str = androidStringManager.get(i8);
                }
                String str5 = str;
                Object rememberedValue10 = gapComposer2.rememberedValue();
                if (rememberedValue10 == obj17) {
                    RealProfilePhotoManager realProfilePhotoManager = (RealProfilePhotoManager) obj16;
                    rememberedValue10 = new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new RealLocalInstalledStore$hideBrands$$inlined$map$1(realProfilePhotoManager.activityResults, 27), realProfilePhotoManager, 11);
                    gapComposer2.updateRememberedValue(rememberedValue10);
                }
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer2, 48, 2);
                Uri uri = (Uri) collectAsState5.getValue();
                boolean changed = gapComposer2.changed(collectAsState5) | gapComposer2.changedInstance(this);
                Object rememberedValue11 = gapComposer2.rememberedValue();
                if (changed || rememberedValue11 == obj17) {
                    rememberedValue11 = new SearchBarBinding$Content$1$1(collectAsState5, this, null, 1);
                    gapComposer2.updateRememberedValue(rememberedValue11);
                }
                Updater.LaunchedEffect(gapComposer2, uri, (Function2) rememberedValue11);
                Object rememberedValue12 = gapComposer2.rememberedValue();
                if (rememberedValue12 == obj17) {
                    rememberedValue12 = Updater.mutableStateOf$default(ViewMode.EDIT);
                    gapComposer2.updateRememberedValue(rememberedValue12);
                }
                MutableState mutableState10 = (MutableState) rememberedValue12;
                boolean z5 = z4;
                Updater.LaunchedEffect(gapComposer2, flow, new DissolveWipeContentKt$DissolveWipeContent$1$1(flow, null, this, z5, collectAsState2, mutableState9, collectAsState3, mutableState8, mutableState10));
                PublicProfile publicProfile3 = (PublicProfile) collectAsState2.getValue();
                String str6 = publicProfile3 != null ? publicProfile3.fullName : null;
                String str7 = (String) ((ParcelableSnapshotMutableState) obj9).getValue();
                PublicProfile publicProfile4 = (PublicProfile) collectAsState2.getValue();
                if (publicProfile4 != null) {
                    String str8 = publicProfile4.fullName;
                    if (str8 == null || StringsKt.isBlank(str8)) {
                        i2 = 0;
                        c = 0;
                    } else {
                        i2 = 0;
                        c = str8.charAt(0);
                    }
                    if (Character.isLetter(c)) {
                        String valueOf = String.valueOf(c);
                        Locale locale = Locale.US;
                        locale.getClass();
                        String upperCase = valueOf.toUpperCase(locale);
                        upperCase.getClass();
                        ch = Character.valueOf(upperCase.charAt(i2));
                    } else if (Character.isDigit(c)) {
                        ch = Character.valueOf(c);
                    }
                    Profile profile2 = (Profile) collectAsState.getValue();
                    AccountAvatarViewModel accountAvatarViewModel = new AccountAvatarViewModel(str7, ch, new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, profile2 == null ? profile2.profile_id : null, null, null, null))), null);
                    boolean booleanValue = ((Boolean) collectAsState3.getValue()).booleanValue();
                    EditProfileViewModel$EditCustomerProfileViewModel.BusinessUpgradeModel businessUpgradeModel = (EditProfileViewModel$EditCustomerProfileViewModel.BusinessUpgradeModel) produceState.getValue();
                    ProfileViewModel profileViewModel = (ProfileViewModel) ((LocalEditorialPresenter) obj8).models(new StartedLazily$command$$inlined$unsafeFlow$1(new ProfileViewEvent[0], 4), (Composer) gapComposer2, 0);
                    profile = (Profile) collectAsState.getValue();
                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    PreviewTrustIndicatorViewModel.Type type2 = PreviewTrustIndicatorViewModel.Type.JOINED;
                    if (profile != null && (l = profile.customer_since) != null) {
                        if (l.longValue() <= 0) {
                            l = null;
                        }
                        if (l != null) {
                            long longValue = l.longValue();
                            Map mapOf2 = MapsKt__MapsJVMKt.mapOf(new Pair("joined_at", DateUtils.getRelativeTimeSpanString(longValue, Math.max(System.currentTimeMillis(), longValue + 86400000), 86400000L, 0).toString()));
                            mapOf2.getClass();
                            resources.getClass();
                            str2 = new MessageFormat(resources.getString(R.string.edit_profile_preview_joined)).format(mapOf2);
                            str2.getClass();
                            createListBuilder.add(new PreviewTrustIndicatorViewModel(type2, str2));
                            createListBuilder.add(new PreviewTrustIndicatorViewModel(PreviewTrustIndicatorViewModel.Type.PAID_BY_PEOPLE_YOU_KNOW, androidStringManager.get(R.string.edit_profile_preview_paid_by_people_you_know)));
                            createListBuilder.add(new PreviewTrustIndicatorViewModel(PreviewTrustIndicatorViewModel.Type.IN_CONTACTS, androidStringManager.get(R.string.edit_profile_preview_in_contacts)));
                            EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel = new EditProfileViewModel$EditCustomerProfileViewModel(str6, cashtagWithCurrencySymbol, symbol, accountAvatarViewModel, z5, z3, booleanValue, businessUpgradeModel, str5, profileViewModel, CollectionsKt__CollectionsJVMKt.build(createListBuilder), (ViewMode) mutableState10.getValue(), (EditProfileViewModel$DialogModel) mutableState8.getValue());
                            gapComposer2.end(false);
                            return editProfileViewModel$EditCustomerProfileViewModel;
                        }
                    }
                    str2 = androidStringManager.get(R.string.edit_profile_preview_joined_fallback);
                    createListBuilder.add(new PreviewTrustIndicatorViewModel(type2, str2));
                    createListBuilder.add(new PreviewTrustIndicatorViewModel(PreviewTrustIndicatorViewModel.Type.PAID_BY_PEOPLE_YOU_KNOW, androidStringManager.get(R.string.edit_profile_preview_paid_by_people_you_know)));
                    createListBuilder.add(new PreviewTrustIndicatorViewModel(PreviewTrustIndicatorViewModel.Type.IN_CONTACTS, androidStringManager.get(R.string.edit_profile_preview_in_contacts)));
                    EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel2 = new EditProfileViewModel$EditCustomerProfileViewModel(str6, cashtagWithCurrencySymbol, symbol, accountAvatarViewModel, z5, z3, booleanValue, businessUpgradeModel, str5, profileViewModel, CollectionsKt__CollectionsJVMKt.build(createListBuilder), (ViewMode) mutableState10.getValue(), (EditProfileViewModel$DialogModel) mutableState8.getValue());
                    gapComposer2.end(false);
                    return editProfileViewModel$EditCustomerProfileViewModel2;
                }
                ch = null;
                Profile profile22 = (Profile) collectAsState.getValue();
                AccountAvatarViewModel accountAvatarViewModel2 = new AccountAvatarViewModel(str7, ch, new ColorModel.Accented(ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(29, null, profile22 == null ? profile22.profile_id : null, null, null, null))), null);
                boolean booleanValue2 = ((Boolean) collectAsState3.getValue()).booleanValue();
                EditProfileViewModel$EditCustomerProfileViewModel.BusinessUpgradeModel businessUpgradeModel2 = (EditProfileViewModel$EditCustomerProfileViewModel.BusinessUpgradeModel) produceState.getValue();
                ProfileViewModel profileViewModel2 = (ProfileViewModel) ((LocalEditorialPresenter) obj8).models(new StartedLazily$command$$inlined$unsafeFlow$1(new ProfileViewEvent[0], 4), (Composer) gapComposer2, 0);
                profile = (Profile) collectAsState.getValue();
                ListBuilder createListBuilder2 = CollectionsKt__CollectionsJVMKt.createListBuilder();
                PreviewTrustIndicatorViewModel.Type type22 = PreviewTrustIndicatorViewModel.Type.JOINED;
                if (profile != null) {
                    if (l.longValue() <= 0) {
                    }
                    if (l != null) {
                    }
                }
                str2 = androidStringManager.get(R.string.edit_profile_preview_joined_fallback);
                createListBuilder2.add(new PreviewTrustIndicatorViewModel(type22, str2));
                createListBuilder2.add(new PreviewTrustIndicatorViewModel(PreviewTrustIndicatorViewModel.Type.PAID_BY_PEOPLE_YOU_KNOW, androidStringManager.get(R.string.edit_profile_preview_paid_by_people_you_know)));
                createListBuilder2.add(new PreviewTrustIndicatorViewModel(PreviewTrustIndicatorViewModel.Type.IN_CONTACTS, androidStringManager.get(R.string.edit_profile_preview_in_contacts)));
                EditProfileViewModel$EditCustomerProfileViewModel editProfileViewModel$EditCustomerProfileViewModel22 = new EditProfileViewModel$EditCustomerProfileViewModel(str6, cashtagWithCurrencySymbol, symbol, accountAvatarViewModel2, z5, z3, booleanValue2, businessUpgradeModel2, str5, profileViewModel2, CollectionsKt__CollectionsJVMKt.build(createListBuilder2), (ViewMode) mutableState10.getValue(), (EditProfileViewModel$DialogModel) mutableState8.getValue());
                gapComposer2.end(false);
                return editProfileViewModel$EditCustomerProfileViewModel22;
            case 2:
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) obj7;
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-1583864348);
                String str9 = ((AndroidStringManager) obj15).get(R.string.balance_applet_tile_click_label);
                Object rememberedValue13 = gapComposer3.rememberedValue();
                if (rememberedValue13 == obj17) {
                    rememberedValue13 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer3.updateRememberedValue(rememberedValue13);
                }
                MutableState mutableState11 = (MutableState) rememberedValue13;
                Object rememberedValue14 = gapComposer3.rememberedValue();
                if (rememberedValue14 == obj17) {
                    ReadonlyStateFlow balanceModel = ((BalanceAppletTileRepository) this.errorReporter).balanceModel();
                    DerivedStateFlow observeState = Countries.observeState(((RealBalancePrivacy) obj13).obfuscationEnabled);
                    ReadonlyStateFlow readonlyStateFlow = ((RealFamilyProfileManager) obj14).familyProfile;
                    DerivedStateFlow mapState = StateFlowKt.mapState(Trace.valuesState(featureFlagManager, AmplitudeExperiments$MoneyTabBalanceAppletMathText.INSTANCE), new AvatarsKt$$ExternalSyntheticLambda2(15));
                    DerivedStateFlow mapState2 = StateFlowKt.mapState(Trace.valuesState(featureFlagManager, AmplitudeExperiments$NuxActivation.INSTANCE), new AvatarsKt$$ExternalSyntheticLambda2(16));
                    MoneybotMarkdownListKt$$ExternalSyntheticLambda6 moneybotMarkdownListKt$$ExternalSyntheticLambda6 = new MoneybotMarkdownListKt$$ExternalSyntheticLambda6(this, str9, mutableState11);
                    balanceModel.getClass();
                    readonlyStateFlow.getClass();
                    Object derivedStateFlow = new DerivedStateFlow(new StateFlowKt$$ExternalSyntheticLambda3(moneybotMarkdownListKt$$ExternalSyntheticLambda6, balanceModel, observeState, readonlyStateFlow, mapState, mapState2), new FinishSetupTileBadgeCounter(25, new Flow[]{balanceModel, observeState, readonlyStateFlow, mapState, mapState2}, new StateFlowKt$combineState$8(6, 0, ArrayIteratorKt.class, moneybotMarkdownListKt$$ExternalSyntheticLambda6, "suspendConversion0", "combineState$suspendConversion0$6(Lkotlin/jvm/functions/Function5;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;")));
                    gapComposer3.updateRememberedValue(derivedStateFlow);
                    rememberedValue14 = derivedStateFlow;
                }
                MutableState collectAsState6 = Updater.collectAsState((StateFlow) rememberedValue14, null, gapComposer3, 1);
                Updater.LaunchedEffect(gapComposer3, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, this, mutableState11, collectAsState6, 3));
                BalanceAppletTileViewModel balanceAppletTileViewModel = (BalanceAppletTileViewModel) collectAsState6.getValue();
                gapComposer3.end(false);
                return balanceAppletTileViewModel;
            case 3:
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj10;
                Resources resources2 = androidStringManager2.resources;
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(424083136);
                Object[] objArr2 = new Object[0];
                boolean changedInstance4 = gapComposer4.changedInstance(this);
                Object rememberedValue15 = gapComposer4.rememberedValue();
                if (changedInstance4 || rememberedValue15 == obj17) {
                    rememberedValue15 = new ErrorView$$ExternalSyntheticLambda0(this, 16);
                    gapComposer4.updateRememberedValue(rememberedValue15);
                }
                MutableState mutableState12 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue15, gapComposer4, 0);
                Object[] objArr3 = new Object[0];
                Object rememberedValue16 = gapComposer4.rememberedValue();
                if (rememberedValue16 == obj17) {
                    rememberedValue16 = new SsnViewKt$$ExternalSyntheticLambda0(9);
                    gapComposer4.updateRememberedValue(rememberedValue16);
                }
                MutableState mutableState13 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue16, gapComposer4, 48);
                Object rememberedValue17 = gapComposer4.rememberedValue();
                if (rememberedValue17 == obj17) {
                    rememberedValue17 = (DataStoreImpl$data$1$invokeSuspend$$inlined$map$1) obj12;
                    gapComposer4.updateRememberedValue(rememberedValue17);
                }
                MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue17, null, null, gapComposer4, 48, 2);
                Object rememberedValue18 = gapComposer4.rememberedValue();
                if (rememberedValue18 == obj17) {
                    rememberedValue18 = (FlowKt__LimitKt$drop$$inlined$unsafeFlow$1) obj9;
                    gapComposer4.updateRememberedValue(rememberedValue18);
                }
                MutableState collectAsState8 = Updater.collectAsState((Flow) rememberedValue18, null, null, gapComposer4, 48, 2);
                Object rememberedValue19 = gapComposer4.rememberedValue();
                if (rememberedValue19 == obj17) {
                    rememberedValue19 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer4.updateRememberedValue(rememberedValue19);
                }
                MutableState mutableState14 = (MutableState) rememberedValue19;
                Object rememberedValue20 = gapComposer4.rememberedValue();
                if (rememberedValue20 == obj17) {
                    obj3 = obj16;
                    mutableState2 = mutableState14;
                    rememberedValue20 = Updater.mutableStateOf$default(new QrCodeModel((String) null, 4, true));
                    gapComposer4.updateRememberedValue(rememberedValue20);
                } else {
                    obj3 = obj16;
                    mutableState2 = mutableState14;
                }
                MutableState mutableState15 = (MutableState) rememberedValue20;
                Object rememberedValue21 = gapComposer4.rememberedValue();
                if (rememberedValue21 == obj17) {
                    Object cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(((RealProfileManager) obj13).publicProfile(), 6);
                    gapComposer4.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
                    rememberedValue21 = cardModelView$cardHeat$$inlined$map$1;
                }
                MutableState collectAsState9 = Updater.collectAsState((Flow) rememberedValue21, null, null, gapComposer4, 48, 2);
                Object rememberedValue22 = gapComposer4.rememberedValue();
                if (rememberedValue22 == obj17) {
                    rememberedValue22 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer4.updateRememberedValue(rememberedValue22);
                }
                MutableState mutableState16 = (MutableState) rememberedValue22;
                Object rememberedValue23 = gapComposer4.rememberedValue();
                if (rememberedValue23 == obj17) {
                    rememberedValue23 = (AppLockMonitor$special$$inlined$map$2) obj8;
                    gapComposer4.updateRememberedValue(rememberedValue23);
                }
                MutableState collectAsState10 = Updater.collectAsState((Flow) rememberedValue23, null, null, gapComposer4, 48, 2);
                Money money = ((BitcoinAmountPickerResult) mutableState12.getValue()).bitcoinAmount;
                boolean changedInstance5 = gapComposer4.changedInstance(this);
                Object rememberedValue24 = gapComposer4.rememberedValue();
                if (changedInstance5 || rememberedValue24 == obj17) {
                    obj4 = null;
                    rememberedValue24 = new ToastKt$Toast$9$1(this, null);
                    gapComposer4.updateRememberedValue(rememberedValue24);
                } else {
                    obj4 = null;
                }
                MutableState produceState2 = Updater.produceState(obj4, money, (Function2) rememberedValue24, gapComposer4, 6);
                boolean changed2 = gapComposer4.changed(mutableState12) | gapComposer4.changed(mutableState13);
                Object rememberedValue25 = gapComposer4.rememberedValue();
                if (changed2 || rememberedValue25 == obj17) {
                    rememberedValue25 = new BitcoinDepositsPresenter$$ExternalSyntheticLambda2(mutableState12, mutableState13, 0);
                    gapComposer4.updateRememberedValue(rememberedValue25);
                }
                Function2 function2 = (Function2) rememberedValue25;
                AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer4.consume(AnswersKt.LocalAnswerDispatcher);
                boolean changed3 = gapComposer4.changed(function2) | gapComposer4.changedInstance(answerDispatcher);
                Object rememberedValue26 = gapComposer4.rememberedValue();
                if (changed3 || rememberedValue26 == obj17) {
                    mutableState3 = mutableState13;
                    rememberedValue26 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 12);
                    gapComposer4.updateRememberedValue(rememberedValue26);
                } else {
                    mutableState3 = mutableState13;
                }
                Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue26, gapComposer4);
                BitcoinDepositsPresenter$special$$inlined$filter$1 bitcoinDepositsPresenter$special$$inlined$filter$1 = (BitcoinDepositsPresenter$special$$inlined$filter$1) obj3;
                boolean changedInstance6 = gapComposer4.changedInstance(this);
                Object rememberedValue27 = gapComposer4.rememberedValue();
                if (changedInstance6 || rememberedValue27 == obj17) {
                    rememberedValue27 = new AmountPickerCondensedView.AnonymousClass14(this, null, 15);
                    gapComposer4.updateRememberedValue(rememberedValue27);
                }
                Updater.LaunchedEffect(gapComposer4, bitcoinDepositsPresenter$special$$inlined$filter$1, (Function2) rememberedValue27);
                String str10 = (String) collectAsState10.getValue();
                BitcoinDepositsQrCodeModel bitcoinDepositsQrCodeModel = (BitcoinDepositsQrCodeModel) mutableState3.getValue();
                RefreshInvoiceSideEffect(str10, bitcoinDepositsQrCodeModel != null ? bitcoinDepositsQrCodeModel.shareUrl : null, gapComposer4, (i << 3) & 896);
                MutableState mutableState17 = mutableState2;
                TapToPayPresenter tapToPayPresenter = this;
                MutableState mutableState18 = mutableState3;
                Updater.LaunchedEffect(gapComposer4, flow, new OffersHomePresenter$models$8$1(flow, (Continuation) null, tapToPayPresenter, mutableState18, produceState2, mutableState12, collectAsState8, mutableState17, mutableState16));
                Money money2 = ((BitcoinAmountPickerResult) mutableState12.getValue()).bitcoinAmount;
                String str11 = ((BitcoinAmountPickerResult) mutableState12.getValue()).note;
                Boolean bool2 = (Boolean) mutableState17.getValue();
                bool2.getClass();
                Object[] objArr4 = {money2, str11, bool2, (BitcoinDepositsQrCodeModel) mutableState18.getValue()};
                boolean changed4 = gapComposer4.changed(mutableState18) | gapComposer4.changed(mutableState12) | gapComposer4.changedInstance(tapToPayPresenter);
                Object rememberedValue28 = gapComposer4.rememberedValue();
                if (changed4 || rememberedValue28 == obj17) {
                    mutableState4 = mutableState16;
                    objArr = objArr4;
                    androidSecureStore$read$2 = new AndroidSecureStore$read$2(tapToPayPresenter, mutableState18, mutableState15, mutableState12, mutableState4, null, 8);
                    tapToPayPresenter = tapToPayPresenter;
                    mutableState5 = mutableState15;
                    gapComposer4.updateRememberedValue(androidSecureStore$read$2);
                } else {
                    objArr = objArr4;
                    androidSecureStore$read$2 = rememberedValue28;
                    mutableState4 = mutableState16;
                    mutableState5 = mutableState15;
                }
                Updater.LaunchedEffect(objArr, (Function2) androidSecureStore$read$2, gapComposer4);
                RealQrCodesPresenter realQrCodesPresenter = (RealQrCodesPresenter) obj7;
                QrCodeArgs qrCodeArgs = new QrCodeArgs((Integer) null, (Integer) null, (Integer) null, (Integer) null, (CurrencyCode) null, 0, 72);
                BitcoinDepositsQrCodeModel bitcoinDepositsQrCodeModel2 = (BitcoinDepositsQrCodeModel) mutableState18.getValue();
                QrCodeModel models = realQrCodesPresenter.models(qrCodeArgs, bitcoinDepositsQrCodeModel2 != null ? bitcoinDepositsQrCodeModel2.unifiedQrCode : null, gapComposer4, 0);
                BitcoinDepositsQrCodeModel bitcoinDepositsQrCodeModel3 = (BitcoinDepositsQrCodeModel) mutableState18.getValue();
                if ((bitcoinDepositsQrCodeModel3 != null ? bitcoinDepositsQrCodeModel3.unifiedQrCode : null) == null) {
                    models = new QrCodeModel((String) null, models.qrImage, true);
                }
                mutableState5.setValue(models);
                Money money3 = ((BitcoinAmountPickerResult) mutableState12.getValue()).bitcoinAmount;
                BitcoinDisplayUnits bitcoinDisplayUnits = (BitcoinDisplayUnits) collectAsState7.getValue();
                Money money4 = (Money) collectAsState8.getValue();
                final CurrencyCode currencyCode = (CurrencyCode) produceState2.getValue();
                Money money5 = ((BitcoinAmountPickerResult) mutableState12.getValue()).userInputtedAmount;
                MoneyFormatter moneyFormatter = (MoneyFormatter) tapToPayPresenter.ttpEligibilityProvider;
                BitcoinDepositsPresenter$DisplayAmounts$AmountsNotReady bitcoinDepositsPresenter$DisplayAmounts$AmountsNotReady = BitcoinDepositsPresenter$DisplayAmounts$AmountsNotReady.INSTANCE;
                if (bitcoinDisplayUnits == null || money4 == null || currencyCode == null) {
                    mutableState6 = mutableState5;
                    mutableState7 = mutableState18;
                    androidAutofill_androidKt = bitcoinDepositsPresenter$DisplayAmounts$AmountsNotReady;
                } else {
                    mutableState6 = mutableState5;
                    Long l2 = money3.amount;
                    if (l2 != null && l2.longValue() == 0) {
                        mutableState7 = mutableState18;
                        androidAutofill_androidKt = new AndroidAutofill_androidKt(currencyCode) { // from class: com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$DisplayAmounts$NullAmounts
                            public final CurrencyCode currencyCode;

                            {
                                this.currencyCode = currencyCode;
                            }

                            public final boolean equals(Object obj18) {
                                if (this == obj18) {
                                    return true;
                                }
                                return (obj18 instanceof BitcoinDepositsPresenter$DisplayAmounts$NullAmounts) && this.currencyCode == ((BitcoinDepositsPresenter$DisplayAmounts$NullAmounts) obj18).currencyCode;
                            }

                            @Override // androidx.compose.ui.autofill.AndroidAutofill_androidKt
                            public final CurrencyCode getCurrencyCode() {
                                return this.currencyCode;
                            }

                            public final int hashCode() {
                                return this.currencyCode.hashCode();
                            }

                            public final String toString() {
                                return "NullAmounts(currencyCode=" + this.currencyCode + ")";
                            }
                        };
                    } else {
                        mutableState7 = mutableState18;
                        final String format3 = ((RealBitcoinFormatter) obj15).format(bitcoinDisplayUnits, money3, true, false);
                        Money convertBitcoinEquivalentAmount = Moneys.convertBitcoinEquivalentAmount(money3, money4);
                        final String format4 = moneyFormatter.format(convertBitcoinEquivalentAmount);
                        if (currencyCode == CurrencyCode.BTC) {
                            Long l3 = convertBitcoinEquivalentAmount.amount;
                            l3.getClass();
                            if (l3.longValue() < 1) {
                                CurrencyCode currencyCode2 = money4.currency_code;
                                if (currencyCode2 == null) {
                                    currencyCode2 = CurrencyCode.USD;
                                }
                                String format5 = moneyFormatter.format(new Money((Long) 1L, currencyCode2, 4));
                                format5.getClass();
                                resources2.getClass();
                                format4 = new MessageFormat(resources2.getString(R.string.bitcoin_deposits_less_than_fiat_amount)).format(new Object[]{format5});
                                format4.getClass();
                            }
                            androidAutofill_androidKt = new AndroidAutofill_androidKt(format3, format4, currencyCode) { // from class: com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts
                                public final String amount;
                                public final CurrencyCode currencyCode;
                                public final String subAmount;

                                {
                                    format3.getClass();
                                    format4.getClass();
                                    this.amount = format3;
                                    this.subAmount = format4;
                                    this.currencyCode = currencyCode;
                                }

                                public final boolean equals(Object obj18) {
                                    if (this == obj18) {
                                        return true;
                                    }
                                    if (!(obj18 instanceof BitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts)) {
                                        return false;
                                    }
                                    BitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts bitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts = (BitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts) obj18;
                                    return Intrinsics.areEqual(this.amount, bitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts.amount) && Intrinsics.areEqual(this.subAmount, bitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts.subAmount) && this.currencyCode == bitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts.currencyCode;
                                }

                                @Override // androidx.compose.ui.autofill.AndroidAutofill_androidKt
                                public final String getAmount() {
                                    return this.amount;
                                }

                                @Override // androidx.compose.ui.autofill.AndroidAutofill_androidKt
                                public final CurrencyCode getCurrencyCode() {
                                    return this.currencyCode;
                                }

                                @Override // androidx.compose.ui.autofill.AndroidAutofill_androidKt
                                public final String getSubAmount() {
                                    return this.subAmount;
                                }

                                public final int hashCode() {
                                    return this.currencyCode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.amount.hashCode() * 31, 31, this.subAmount);
                                }

                                public final String toString() {
                                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FormattedAmounts(amount=", this.amount, ", subAmount=", this.subAmount, ", currencyCode=");
                                    m.append(this.currencyCode);
                                    m.append(")");
                                    return m.toString();
                                }
                            };
                        } else {
                            if (money5 != null && (format2 = moneyFormatter.format(money5)) != null) {
                                format4 = format2;
                            }
                            androidAutofill_androidKt = new AndroidAutofill_androidKt(format4, format3, currencyCode) { // from class: com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts
                                public final String amount;
                                public final CurrencyCode currencyCode;
                                public final String subAmount;

                                {
                                    format4.getClass();
                                    format3.getClass();
                                    this.amount = format4;
                                    this.subAmount = format3;
                                    this.currencyCode = currencyCode;
                                }

                                public final boolean equals(Object obj18) {
                                    if (this == obj18) {
                                        return true;
                                    }
                                    if (!(obj18 instanceof BitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts)) {
                                        return false;
                                    }
                                    BitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts bitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts = (BitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts) obj18;
                                    return Intrinsics.areEqual(this.amount, bitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts.amount) && Intrinsics.areEqual(this.subAmount, bitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts.subAmount) && this.currencyCode == bitcoinDepositsPresenter$DisplayAmounts$FormattedAmounts.currencyCode;
                                }

                                @Override // androidx.compose.ui.autofill.AndroidAutofill_androidKt
                                public final String getAmount() {
                                    return this.amount;
                                }

                                @Override // androidx.compose.ui.autofill.AndroidAutofill_androidKt
                                public final CurrencyCode getCurrencyCode() {
                                    return this.currencyCode;
                                }

                                @Override // androidx.compose.ui.autofill.AndroidAutofill_androidKt
                                public final String getSubAmount() {
                                    return this.subAmount;
                                }

                                public final int hashCode() {
                                    return this.currencyCode.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.amount.hashCode() * 31, 31, this.subAmount);
                                }

                                public final String toString() {
                                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("FormattedAmounts(amount=", this.amount, ", subAmount=", this.subAmount, ", currencyCode=");
                                    m.append(this.currencyCode);
                                    m.append(")");
                                    return m.toString();
                                }
                            };
                        }
                    }
                }
                if (androidAutofill_androidKt.equals(bitcoinDepositsPresenter$DisplayAmounts$AmountsNotReady)) {
                    gapComposer4.end(false);
                    return BitcoinDepositsViewModel.Loading.INSTANCE;
                }
                Long l4 = ((BitcoinAmountPickerResult) mutableState12.getValue()).bitcoinAmount.amount;
                String str12 = androidStringManager2.get(l4 == null || (l4.longValue() > 0L ? 1 : (l4.longValue() == 0L ? 0 : -1)) != 0 ? R.string.bitcoin_deposits_address_edit_amount : R.string.bitcoin_deposits_address_add_amount);
                String amount = androidAutofill_androidKt.getAmount();
                String subAmount = androidAutofill_androidKt.getSubAmount();
                QrCodeModel qrCodeModel = (QrCodeModel) mutableState6.getValue();
                String str13 = (String) collectAsState9.getValue();
                if (str13 != null) {
                    resources2.getClass();
                    str3 = new MessageFormat(resources2.getString(R.string.bitcoin_deposits_description_with_cashtag)).format(new Object[]{str13});
                    str3.getClass();
                } else {
                    str3 = androidStringManager2.get(R.string.bitcoin_deposits_description_without_cashtag);
                }
                String str14 = str3;
                boolean booleanValue3 = ((Boolean) mutableState4.getValue()).booleanValue();
                BitcoinDepositsQrCodeModel bitcoinDepositsQrCodeModel4 = (BitcoinDepositsQrCodeModel) mutableState7.getValue();
                String str15 = bitcoinDepositsQrCodeModel4 != null ? bitcoinDepositsQrCodeModel4.unifiedQrCode : null;
                BitcoinDepositsQrCodeModel bitcoinDepositsQrCodeModel5 = (BitcoinDepositsQrCodeModel) mutableState7.getValue();
                BitcoinPayments bitcoinPayments = bitcoinDepositsQrCodeModel5 != null ? bitcoinDepositsQrCodeModel5.qrCodeInvoice : null;
                BitcoinDepositsQrCodeModel bitcoinDepositsQrCodeModel6 = (BitcoinDepositsQrCodeModel) mutableState7.getValue();
                String str16 = bitcoinDepositsQrCodeModel6 != null ? bitcoinDepositsQrCodeModel6.shareUrl : null;
                boolean z6 = androidAutofill_androidKt.getAmount() == null;
                BitcoinDepositsQrCodeModel bitcoinDepositsQrCodeModel7 = (BitcoinDepositsQrCodeModel) mutableState7.getValue();
                BitcoinDepositsViewModel.Loaded loaded = new BitcoinDepositsViewModel.Loaded(str12, amount, subAmount, qrCodeModel, str14, booleanValue3, str15, bitcoinPayments, str16, z6, (bitcoinDepositsQrCodeModel7 != null ? bitcoinDepositsQrCodeModel7.shareUrl : null) != null, androidAutofill_androidKt.getCurrencyCode(), BitcoinDepositsPresenter$WhenMappings.$EnumSwitchMapping$0[((BitcoinDepositsScreen) tapToPayPresenter.tapToPayErrorReporter).origin.ordinal()] == 1 ? BitcoinDepositsViewModel.Loaded.NavigationType.Back : BitcoinDepositsViewModel.Loaded.NavigationType.Close);
                gapComposer4.end(false);
                return loaded;
            case 4:
                return models$com$squareup$cash$investing$presenters$InvestingStockSelectionBlockerPresenter(flow, composer, i);
            default:
                kotlin.Lazy lazy2 = (kotlin.Lazy) obj12;
                SyncValueReader syncValueReader = (SyncValueReader) obj15;
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(1300114772);
                Object rememberedValue29 = gapComposer5.rememberedValue();
                Continuation continuation = null;
                if (rememberedValue29 == obj17) {
                    rememberedValue29 = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.PaychecksUiState, null, new Function1(this) { // from class: com.squareup.cash.paychecks.presenters.PaychecksHomePresenter$$ExternalSyntheticLambda0
                        public final /* synthetic */ TapToPayPresenter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj18) {
                            int i9 = i6;
                            TapToPayPresenter tapToPayPresenter2 = this.f$0;
                            switch (i9) {
                                case 0:
                                    UiState uiState = (UiState) obj18;
                                    uiState.getClass();
                                    return WindowInfoImpl.Companion.toPaychecksUiState(tapToPayPresenter2, uiState);
                                default:
                                    UiConfiguration uiConfiguration = (UiConfiguration) obj18;
                                    uiConfiguration.getClass();
                                    return ShapeContainingUtilKt.toPaychecksUiConfiguration(tapToPayPresenter2, uiConfiguration);
                            }
                        }
                    });
                    gapComposer5.updateRememberedValue(rememberedValue29);
                }
                MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue29, gapComposer5);
                Object rememberedValue30 = gapComposer5.rememberedValue();
                if (rememberedValue30 == obj17) {
                    rememberedValue30 = ((RealDisclosureProvider) obj14).disclosure(DisclosureForScreen.PAYCHECKS, "");
                    gapComposer5.updateRememberedValue(rememberedValue30);
                }
                MutableState collectAsState11 = Updater.collectAsState((Flow) rememberedValue30, null, null, gapComposer5, 48, 2);
                GapComposer gapComposer6 = gapComposer5;
                Object rememberedValue31 = gapComposer6.rememberedValue();
                if (rememberedValue31 == obj17) {
                    rememberedValue31 = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.PaychecksUiConfiguration, null, new Function1(this) { // from class: com.squareup.cash.paychecks.presenters.PaychecksHomePresenter$$ExternalSyntheticLambda0
                        public final /* synthetic */ TapToPayPresenter f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj18) {
                            int i9 = i5;
                            TapToPayPresenter tapToPayPresenter2 = this.f$0;
                            switch (i9) {
                                case 0:
                                    UiState uiState = (UiState) obj18;
                                    uiState.getClass();
                                    return WindowInfoImpl.Companion.toPaychecksUiState(tapToPayPresenter2, uiState);
                                default:
                                    UiConfiguration uiConfiguration = (UiConfiguration) obj18;
                                    uiConfiguration.getClass();
                                    return ShapeContainingUtilKt.toPaychecksUiConfiguration(tapToPayPresenter2, uiConfiguration);
                            }
                        }
                    });
                    gapComposer6.updateRememberedValue(rememberedValue31);
                }
                MutableState receiveValueAsState2 = Strings.receiveValueAsState((StateFlow) rememberedValue31, gapComposer6);
                boolean changed5 = gapComposer6.changed((PaychecksUiConfiguration) receiveValueAsState2.getValue());
                Object rememberedValue32 = gapComposer6.rememberedValue();
                if (changed5 || rememberedValue32 == obj17) {
                    rememberedValue32 = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.PaychecksAllocationDistribution, null, new MusicViewKt$$ExternalSyntheticLambda6(i4, this, receiveValueAsState2));
                    gapComposer6.updateRememberedValue(rememberedValue32);
                }
                MutableState receiveValueAsState3 = Strings.receiveValueAsState((StateFlow) rememberedValue32, gapComposer6);
                ActivitiesManager.ActivityContext activityContext = (ActivitiesManager.ActivityContext) obj16;
                PaychecksUiConfiguration paychecksUiConfiguration4 = (PaychecksUiConfiguration) receiveValueAsState2.getValue();
                boolean changed6 = gapComposer6.changed(activityContext) | gapComposer6.changed(paychecksUiConfiguration4 != null ? paychecksUiConfiguration4.home : null);
                Object rememberedValue33 = gapComposer6.rememberedValue();
                if (changed6 || rememberedValue33 == obj17) {
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) obj11;
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.navigator;
                    ActivitiesManager.ActivityContext activityContext2 = (ActivitiesManager.ActivityContext) obj16;
                    PaychecksUiConfiguration paychecksUiConfiguration5 = (PaychecksUiConfiguration) receiveValueAsState2.getValue();
                    String str17 = (paychecksUiConfiguration5 == null || (activitySection2 = getActivitySection(paychecksUiConfiguration5.home)) == null) ? null : activitySection2.loadFailureSubtitle;
                    PaychecksUiConfiguration paychecksUiConfiguration6 = (PaychecksUiConfiguration) receiveValueAsState2.getValue();
                    rememberedValue33 = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.EmbeddedRecentsConfiguration$default(activityContext2, null, null, new MoneyTabUIKt$$ExternalSyntheticLambda5(this, 21), 3, (paychecksUiConfiguration6 == null || (activitySection = getActivitySection(paychecksUiConfiguration6.home)) == null) ? null : activitySection.noActivitySubtitle, str17, null, null, null, 7754));
                    gapComposer6.updateRememberedValue(rememberedValue33);
                }
                UiCallbackModel models2 = ((RealActivityEmbeddedPresenter) rememberedValue33).models(gapComposer6, 0);
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance7 = gapComposer6.changedInstance(this);
                Object rememberedValue34 = gapComposer6.rememberedValue();
                if (changedInstance7 || rememberedValue34 == obj17) {
                    rememberedValue34 = new MainPaymentView$Content$2$1(this, continuation, 7);
                    gapComposer6.updateRememberedValue(rememberedValue34);
                }
                Updater.LaunchedEffect(gapComposer6, unit2, (Function2) rememberedValue34);
                boolean changedInstance8 = gapComposer6.changedInstance(this);
                Object rememberedValue35 = gapComposer6.rememberedValue();
                if (changedInstance8 || rememberedValue35 == obj17) {
                    rememberedValue35 = new PaychecksHomePresenter$models$2$1(this, continuation, i6);
                    gapComposer6.updateRememberedValue(rememberedValue35);
                }
                Updater.LaunchedEffect(gapComposer6, unit2, (Function2) rememberedValue35);
                Updater.LaunchedEffect(gapComposer6, flow, new PhonePlansHomePresenter$models$1$1(flow, continuation, this, receiveValueAsState, 2));
                PaychecksUiConfiguration paychecksUiConfiguration7 = (PaychecksUiConfiguration) receiveValueAsState2.getValue();
                PaychecksHomeViewModel paychecksHomeViewModel2 = PaychecksHomeViewModel.Loading.INSTANCE;
                if (paychecksUiConfiguration7 == null || ((PaychecksUiState) receiveValueAsState.getValue()) == null) {
                    gapComposer6.end(false);
                    return paychecksHomeViewModel2;
                }
                PaychecksUiConfiguration paychecksUiConfiguration8 = (PaychecksUiConfiguration) receiveValueAsState2.getValue();
                PaychecksUiState paychecksUiState2 = (PaychecksUiState) receiveValueAsState.getValue();
                PaycheckAllocationDistribution paycheckAllocationDistribution = (PaycheckAllocationDistribution) receiveValueAsState3.getValue();
                Disclosure disclosure3 = (Disclosure) collectAsState11.getValue();
                if (paychecksUiState2 == null || paychecksUiConfiguration8 == null) {
                    paychecksHomeViewModel = paychecksHomeViewModel2;
                    content = null;
                    gapComposer = gapComposer6;
                } else {
                    PaychecksUiConfiguration.PaychecksHomeUi paychecksHomeUi = paychecksUiConfiguration8.home;
                    boolean hasNonCashBalanceAllocations = UtilsKt.getHasNonCashBalanceAllocations(paycheckAllocationDistribution);
                    PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHeader paychecksHeader = paychecksHomeUi.header;
                    if (paychecksHeader == null) {
                        paychecksUiConfiguration = paychecksUiConfiguration8;
                        paychecksHomeViewModel = paychecksHomeViewModel2;
                        th = null;
                        benefitsModuleNullStateViewModel = null;
                        disclosure = disclosure3;
                        obj5 = obj10;
                        lazy = lazy2;
                    } else {
                        PaychecksUiState.PaychecksBenefitsStatusSection paychecksBenefitsStatusSection = paychecksUiState2.benefitsStatusSection;
                        paychecksBenefitsStatusSection.getClass();
                        th = null;
                        PaychecksUiState.PaychecksBenefitsStatusSection.Button button2 = paychecksBenefitsStatusSection.viewBenefitsButton;
                        String str18 = paychecksBenefitsStatusSection.body;
                        PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksBenefitsState paychecksBenefitsState = paychecksBenefitsStatusSection.state;
                        PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksColoredText paychecksColoredText = paychecksBenefitsStatusSection.title;
                        paychecksHomeViewModel = paychecksHomeViewModel2;
                        int ordinal = paychecksBenefitsState.ordinal();
                        if (ordinal != 0) {
                            obj5 = obj10;
                            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            String str19 = paychecksColoredText.placeholderString;
                            String str20 = paychecksColoredText.text;
                            List list3 = paychecksColoredText.values;
                            button2.getClass();
                            lazy = lazy2;
                            PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel.BenefitsModuleButton benefitsModuleButton = new PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel.BenefitsModuleButton(button2.text, new PaychecksHomeViewEvent.ViewPaycheckBenefits(button2.clientRoute), paychecksBenefitsState == PaychecksUiState.PaychecksBenefitsStatusSection.PaychecksBenefitsState.ACTIVE_STATE ? PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel.BenefitsModuleButton.Prominence.PROMINENT : PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel.BenefitsModuleButton.Prominence.STANDARD);
                            str19.getClass();
                            str20.getClass();
                            list3.getClass();
                            str18.getClass();
                            int indexOf$default = StringsKt.indexOf$default((CharSequence) str20, str19, 0, false, 6);
                            Integer valueOf2 = Integer.valueOf(indexOf$default);
                            if (indexOf$default == -1) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                int intValue = valueOf2.intValue();
                                IntRange until = RangesKt___RangesKt.until(intValue, ((String) CollectionsKt.first(list3)).length() + intValue);
                                Color color = paychecksColoredText.tintColor;
                                color.getClass();
                                coloredText = new PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel.ColoredText(until, color);
                            } else {
                                coloredText = null;
                            }
                            if (!list3.isEmpty()) {
                                str20 = StringsKt__StringsJVMKt.replace$default(str20, str19, (String) CollectionsKt.first(list3));
                            }
                            paychecksUiConfiguration = paychecksUiConfiguration8;
                            benefitsModuleNullStateViewModel = new PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel(str20, str18, coloredText, benefitsModuleButton);
                            disclosure = disclosure3;
                        } else {
                            obj5 = obj10;
                            lazy = lazy2;
                            String str21 = paychecksColoredText.text;
                            PaychecksHomeViewModel.Content.Button button3 = button2 != null ? new PaychecksHomeViewModel.Content.Button(button2.text, new PaychecksHomeViewEvent.SeeAllBenefits(button2.clientRoute)) : null;
                            ArrayList arrayList = paychecksHeader.nullStateUpsell.detailRows;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHeader.PaychecksNullStateUpsell.PaychecksDetailsRow paychecksDetailsRow = (PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHeader.PaychecksNullStateUpsell.PaychecksDetailsRow) it3.next();
                                String str22 = paychecksDetailsRow.title;
                                String str23 = paychecksDetailsRow.subtitle;
                                Iterator it4 = it3;
                                boolean z7 = paychecksDetailsRow.stepCompleted;
                                GapComposer gapComposer7 = gapComposer6;
                                String str24 = paychecksDetailsRow.buttonText;
                                if (str24 != null) {
                                    disclosure2 = disclosure3;
                                    paychecksUiConfiguration2 = paychecksUiConfiguration8;
                                    uiCallbackModel2 = models2;
                                    PaychecksHomeViewEvent.SetUpDirectDeposit.SetupDirectDepositOrigin setupDirectDepositOrigin = PaychecksHomeViewEvent.SetUpDirectDeposit.SetupDirectDepositOrigin.TIMELINE;
                                    String str25 = paychecksDetailsRow.clientRoute;
                                    str25.getClass();
                                    button = new PaychecksHomeViewModel.Content.Button(str24, new PaychecksHomeViewEvent.SetUpDirectDeposit(setupDirectDepositOrigin, str25, hasNonCashBalanceAllocations));
                                } else {
                                    paychecksUiConfiguration2 = paychecksUiConfiguration8;
                                    disclosure2 = disclosure3;
                                    uiCallbackModel2 = models2;
                                    button = null;
                                }
                                arrayList2.add(new PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleNullStateViewModel.BenefitRequirement(str22, str23, z7, button));
                                it3 = it4;
                                disclosure3 = disclosure2;
                                paychecksUiConfiguration8 = paychecksUiConfiguration2;
                                models2 = uiCallbackModel2;
                                gapComposer6 = gapComposer7;
                            }
                            paychecksUiConfiguration = paychecksUiConfiguration8;
                            disclosure = disclosure3;
                            gapComposer = gapComposer6;
                            uiCallbackModel = models2;
                            benefitsModuleNullStateViewModel = new PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleNullStateViewModel(str21, str18, button3, arrayList2);
                            ArrayList arrayList3 = paychecksHomeUi.sections;
                            ArrayList arrayList4 = new ArrayList();
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                                PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection paychecksHomeSection = (PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection) it.next();
                                List visibilityPredicates = paychecksHomeSection.getVisibilityPredicates();
                                visibilityPredicates.getClass();
                                List list4 = visibilityPredicates;
                                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                                    Iterator it5 = list4.iterator();
                                    while (it5.hasNext()) {
                                        switch (((PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.SectionVisibilityPredicate) it5.next()).ordinal()) {
                                            case 0:
                                                z = true;
                                                if (z) {
                                                    obj6 = th;
                                                    it2 = it;
                                                    paychecksUiConfiguration3 = paychecksUiConfiguration;
                                                    uiCallbackModel3 = uiCallbackModel;
                                                    paychecksUiState = paychecksUiState2;
                                                    if (obj6 != null) {
                                                        arrayList4.add(obj6);
                                                    }
                                                    paychecksUiConfiguration = paychecksUiConfiguration3;
                                                    it = it2;
                                                    paychecksUiState2 = paychecksUiState;
                                                    uiCallbackModel = uiCallbackModel3;
                                                }
                                            case 1:
                                                TimeZone timeZone = com.squareup.cash.paychecks.presenters.util.UtilsKt.paycheckTimeZone;
                                                if (paycheckAllocationDistribution != null && (list = paycheckAllocationDistribution.allocations) != null) {
                                                    z = !list.isEmpty();
                                                    if (z) {
                                                    }
                                                }
                                                z = false;
                                                if (z) {
                                                }
                                                break;
                                            case 2:
                                                TimeZone timeZone2 = com.squareup.cash.paychecks.presenters.util.UtilsKt.paycheckTimeZone;
                                                if (paycheckAllocationDistribution != null && (list2 = paycheckAllocationDistribution.allocations) != null) {
                                                    z2 = !list2.isEmpty();
                                                    break;
                                                } else {
                                                    z2 = false;
                                                    break;
                                                }
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                break;
                                            case 5:
                                            case 6:
                                                z = false;
                                                if (z) {
                                                }
                                                break;
                                            default:
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                        }
                                    }
                                }
                                if (paychecksHomeSection instanceof PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.ActivitySection) {
                                    uiCallbackModel4 = uiCallbackModel;
                                    it2 = it;
                                    paychecksUiState = paychecksUiState2;
                                    obj6 = new PaychecksHomeViewModel.Content.Section.ArcadeActivity(((PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.ActivitySection) paychecksHomeSection).title, paychecksUiState2.activitySubtitle, uiCallbackModel4);
                                } else {
                                    uiCallbackModel4 = uiCallbackModel;
                                    if (paychecksHomeSection instanceof PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.DistributionNuxSection) {
                                        AndroidStringManager androidStringManager3 = (AndroidStringManager) obj5;
                                        it2 = it;
                                        paychecksUiState = paychecksUiState2;
                                        obj6 = new PaychecksHomeViewModel.Content.Section.DistributionsNullState(androidStringManager3.get(R.string.arcade_distribution_nux_section_title), androidStringManager3.get(R.string.arcade_distribution_nux_section_body), androidStringManager3.get(R.string.arcade_distribution_nux_section_button_text), new PaychecksHomeViewEvent.CallToAction(((PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.DistributionNuxSection) paychecksHomeSection).callToActionClientRoute));
                                    } else {
                                        if (paychecksHomeSection instanceof PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.ActiveDistributionSection) {
                                            PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.ActiveDistributionSection activeDistributionSection = (PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.ActiveDistributionSection) paychecksHomeSection;
                                            if (paycheckAllocationDistribution == null) {
                                                obj6 = th;
                                                it2 = it;
                                                paychecksUiState = paychecksUiState2;
                                            } else {
                                                paychecksUiConfiguration3 = paychecksUiConfiguration;
                                                PaychecksUiConfiguration.PaychecksDestinationUi.DestinationUiConfiguration configForDestination = UtilsKt.getConfigForDestination(paychecksUiConfiguration3, UtilsKt.getHighestAllocation(paycheckAllocationDistribution).destination);
                                                List sortedWith = CollectionsKt.sortedWith(paycheckAllocationDistribution.allocations, new PaychecksHomePresenter$toViewModelSection$$inlined$sortedBy$1(0));
                                                List productTintWheelPalette = UtilsKt.productTintWheelPalette(paychecksUiConfiguration3, sortedWith, new HelpSheetViewKt$$ExternalSyntheticLambda4(13));
                                                String str26 = activeDistributionSection.title;
                                                PaychecksHomeViewModel.Content.Button button4 = new PaychecksHomeViewModel.Content.Button(activeDistributionSection.editButtonText, new PaychecksHomeViewEvent.EditDistribution(activeDistributionSection.editButtonClientRoute));
                                                List list5 = sortedWith;
                                                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                                                int i9 = 0;
                                                for (Object obj18 : list5) {
                                                    int i10 = i9 + 1;
                                                    if (i9 < 0) {
                                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                                        throw th;
                                                    }
                                                    PaycheckAllocationDistribution.DestinationAndShare destinationAndShare = (PaycheckAllocationDistribution.DestinationAndShare) obj18;
                                                    Iterator it6 = it;
                                                    PaychecksUiConfiguration.PaychecksDestinationUi.DestinationUiConfiguration configForDestination2 = UtilsKt.getConfigForDestination(paychecksUiConfiguration3, destinationAndShare.destination);
                                                    Color color2 = (Color) CollectionsKt.getOrNull(i9, productTintWheelPalette);
                                                    PaychecksUiState paychecksUiState3 = paychecksUiState2;
                                                    if (color2 == null) {
                                                        color2 = configForDestination2.tint;
                                                    }
                                                    UiCallbackModel uiCallbackModel5 = uiCallbackModel4;
                                                    NumberFormat numberFormat = (NumberFormat) lazy.getValue();
                                                    numberFormat.getClass();
                                                    arrayList5.add(new ActiveDistributionSectionBodyViewModel.Allocation(color2, UtilsKt.percentageString(destinationAndShare, numberFormat), configForDestination2.name));
                                                    it = it6;
                                                    i9 = i10;
                                                    paychecksUiState2 = paychecksUiState3;
                                                    uiCallbackModel4 = uiCallbackModel5;
                                                }
                                                it2 = it;
                                                paychecksUiState = paychecksUiState2;
                                                uiCallbackModel3 = uiCallbackModel4;
                                                ArrayList wheelAllocations = UtilsKt.toWheelAllocations(paycheckAllocationDistribution, paychecksUiConfiguration3);
                                                PaycheckAllocationDistribution.DestinationAndShare highestAllocation = UtilsKt.getHighestAllocation(paycheckAllocationDistribution);
                                                NumberFormat numberFormat2 = (NumberFormat) lazy.getValue();
                                                numberFormat2.getClass();
                                                obj6 = new PaychecksHomeViewModel.Content.Section.ActiveDistribution(str26, button4, new ActiveDistributionSectionBodyViewModel(new DistributionWheelViewModel(wheelAllocations, new DistributionWheelViewModel.Content.ActiveDistributionSection(configForDestination.tint, UtilsKt.percentageString(highestAllocation, numberFormat2), configForDestination.name), 30), arrayList5));
                                            }
                                        } else {
                                            it2 = it;
                                            paychecksUiState = paychecksUiState2;
                                            uiCallbackModel3 = uiCallbackModel4;
                                            paychecksUiConfiguration3 = paychecksUiConfiguration;
                                            if (paychecksHomeSection instanceof PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.AddOrUpdateDirectDepositSection) {
                                                PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.AddOrUpdateDirectDepositSection addOrUpdateDirectDepositSection = (PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.AddOrUpdateDirectDepositSection) paychecksHomeSection;
                                                String str27 = addOrUpdateDirectDepositSection.buttonClientRoute;
                                                String str28 = addOrUpdateDirectDepositSection.buttonText;
                                                PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.AddOrUpdateDirectDepositSection.PendingDirectDepositInfo pendingDirectDepositInfo = addOrUpdateDirectDepositSection.pendingDirectDepositInfo;
                                                if (pendingDirectDepositInfo != null) {
                                                    boolean hasNonCashBalanceAllocations2 = UtilsKt.getHasNonCashBalanceAllocations(paycheckAllocationDistribution);
                                                    String str29 = pendingDirectDepositInfo.buttonText;
                                                    String str30 = pendingDirectDepositInfo.secondaryButtonText;
                                                    PaychecksHomeViewEvent.SetUpDirectDeposit setUpDirectDeposit = new PaychecksHomeViewEvent.SetUpDirectDeposit(PaychecksHomeViewEvent.SetUpDirectDeposit.SetupDirectDepositOrigin.FOOTER, str27, hasNonCashBalanceAllocations2);
                                                    PaychecksUiConfiguration.PaychecksHomeUi.PaychecksHomeSection.AddOrUpdateDirectDepositSection.PendingDirectDepositHalfSheet pendingDirectDepositHalfSheet = pendingDirectDepositInfo.halfSheet;
                                                    pendingDirectDepositHalfSheet.getClass();
                                                    obj6 = new PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit(str29, setUpDirectDeposit, str30, new PaychecksHomeViewModel.Content.Section.DirectDeposit.PendingDirectDeposit.PendingDirectDepositSheetContent(pendingDirectDepositHalfSheet.icon, pendingDirectDepositHalfSheet.title, pendingDirectDepositHalfSheet.body, pendingDirectDepositHalfSheet.buttonText));
                                                } else {
                                                    obj6 = new PaychecksHomeViewModel.Content.Section.DirectDeposit.AddOrUpdateDirectDeposit(str28, new PaychecksHomeViewEvent.SetUpDirectDeposit(PaychecksHomeViewEvent.SetUpDirectDeposit.SetupDirectDepositOrigin.FOOTER, str27, UtilsKt.getHasNonCashBalanceAllocations(paycheckAllocationDistribution)));
                                                }
                                            } else {
                                                obj6 = th;
                                            }
                                        }
                                        if (obj6 != null) {
                                        }
                                        paychecksUiConfiguration = paychecksUiConfiguration3;
                                        it = it2;
                                        paychecksUiState2 = paychecksUiState;
                                        uiCallbackModel = uiCallbackModel3;
                                    }
                                }
                                uiCallbackModel3 = uiCallbackModel4;
                                paychecksUiConfiguration3 = paychecksUiConfiguration;
                                if (obj6 != null) {
                                }
                                paychecksUiConfiguration = paychecksUiConfiguration3;
                                it = it2;
                                paychecksUiState2 = paychecksUiState;
                                uiCallbackModel = uiCallbackModel3;
                            }
                            if (disclosure == null) {
                                Disclosure disclosure4 = disclosure;
                                disclosureFooter = new PaychecksHomeViewModel.Content.DisclosureFooter(disclosure4.text, Boolean.valueOf(disclosure4.showIcon));
                            } else {
                                disclosureFooter = th;
                            }
                            content = new PaychecksHomeViewModel.Content(arrayList4, paychecksHomeUi.termsOfService, disclosureFooter, benefitsModuleNullStateViewModel);
                        }
                    }
                    gapComposer = gapComposer6;
                    uiCallbackModel = models2;
                    ArrayList arrayList32 = paychecksHomeUi.sections;
                    ArrayList arrayList42 = new ArrayList();
                    it = arrayList32.iterator();
                    while (it.hasNext()) {
                    }
                    if (disclosure == null) {
                    }
                    content = new PaychecksHomeViewModel.Content(arrayList42, paychecksHomeUi.termsOfService, disclosureFooter, benefitsModuleNullStateViewModel);
                }
                PaychecksHomeViewModel paychecksHomeViewModel3 = content != null ? content : paychecksHomeViewModel;
                gapComposer.end(false);
                return paychecksHomeViewModel3;
        }
    }

    public TapToPayPresenter(RealDeviceIntegrityAttester realDeviceIntegrityAttester, ErrorReporter errorReporter, FlowStarter flowStarter, RealHieroglyphKeyProvider realHieroglyphKeyProvider, RealProfileManager realProfileManager, SessionManager sessionManager, RealTapToPayActionManager realTapToPayActionManager, RealTapToPayAnalyticsHelper realTapToPayAnalyticsHelper, RealTapToPayErrorReporter realTapToPayErrorReporter, RealTapToPayRepository realTapToPayRepository, RealTapToPayEligibilityProvider realTapToPayEligibilityProvider, RealTapToPaySessionManager realTapToPaySessionManager, RealUuidGenerator realUuidGenerator, RealMRIFactory realMRIFactory, BetterNavigator.ScreenNavigator screenNavigator, TapToPayScreen tapToPayScreen, RealScreenRecordingDetector realScreenRecordingDetector) {
        this.$r8$classId = 0;
        tapToPayScreen.getClass();
        this.deviceIntegrityAttester = realDeviceIntegrityAttester;
        this.errorReporter = errorReporter;
        this.flowStarter = flowStarter;
        this.keyProvider = realHieroglyphKeyProvider;
        this.profileManager = realProfileManager;
        this.sessionManager = sessionManager;
        this.tapToPayActionManager = realTapToPayActionManager;
        this.tapToPayAnalyticsHelper = realTapToPayAnalyticsHelper;
        this.tapToPayErrorReporter = realTapToPayErrorReporter;
        this.tapToPayRepository = realTapToPayRepository;
        this.ttpEligibilityProvider = realTapToPayEligibilityProvider;
        this.ttpSessionManager = realTapToPaySessionManager;
        this.mriFactory = realMRIFactory;
        this.navigator = screenNavigator;
        this.screen = tapToPayScreen;
        this.screenRecodingDetector = realScreenRecordingDetector;
    }

    public TapToPayPresenter(Analytics analytics, BalanceAppletTileRepository balanceAppletTileRepository, AndroidStringManager androidStringManager, RealBankingOutboundNavigator$Factory$Impl realBankingOutboundNavigator$Factory$Impl, MoneyAnalyticsService moneyAnalyticsService, RealBalancePrivacy realBalancePrivacy, FeatureFlagManager featureFlagManager, RealFamilyProfileManager realFamilyProfileManager, SyncValueReader syncValueReader, LocalizedMoneyFormatter.Factory factory, RealRouter$Factory$Impl realRouter$Factory$Impl, CoroutineScope coroutineScope, Navigator navigator) {
        this.$r8$classId = 2;
        navigator.getClass();
        this.deviceIntegrityAttester = analytics;
        this.errorReporter = balanceAppletTileRepository;
        this.flowStarter = androidStringManager;
        this.keyProvider = moneyAnalyticsService;
        this.profileManager = realBalancePrivacy;
        this.sessionManager = featureFlagManager;
        this.tapToPayActionManager = realFamilyProfileManager;
        this.tapToPayAnalyticsHelper = syncValueReader;
        this.tapToPayErrorReporter = coroutineScope;
        this.tapToPayRepository = navigator;
        this.ttpEligibilityProvider = realBankingOutboundNavigator$Factory$Impl.create$1(navigator);
        realRouter$Factory$Impl.create$1(navigator);
        String str = androidStringManager.get(R.string.balance_banking_packaging_applet_title);
        this.ttpSessionManager = str;
        String str2 = androidStringManager.get(R.string.balance_banking_packaging_applet_tile_add_money_button_label);
        this.mriFactory = str2;
        String str3 = androidStringManager.get(R.string.balance_banking_packaging_applet_tile_withdraw_button_label);
        this.navigator = str3;
        this.screen = factory.create(MoneyFormatterConfig.STANDARD);
        this.screenRecodingDetector = new BalanceAppletTileViewModel.Loading(str, new BalanceAppletTileViewModel.BalanceMovementButtons(true, true, str2, str3, 48));
    }

    public TapToPayPresenter(AndroidStringManager androidStringManager, RealProfilePreviewPresenter$Factory$Impl realProfilePreviewPresenter$Factory$Impl, RealAccountOutboundNavigator$Factory$Impl realAccountOutboundNavigator$Factory$Impl, RealProfileManager realProfileManager, RealP2pSettingsManager realP2pSettingsManager, Analytics analytics, RealAccountRatePlanManager realAccountRatePlanManager, RealFamilyProfileManager realFamilyProfileManager, FeatureFlagManager featureFlagManager, RealProfilePhotoManager$Factory$Impl realProfilePhotoManager$Factory$Impl, FlowStarter flowStarter, n nVar, EditProfile editProfile, BetterNavigator.ScreenNavigator screenNavigator, TimeToLiveSyncState timeToLiveSyncState) {
        this.$r8$classId = 1;
        editProfile.getClass();
        this.deviceIntegrityAttester = androidStringManager;
        this.profileManager = realProfileManager;
        this.errorReporter = realP2pSettingsManager;
        this.keyProvider = analytics;
        this.sessionManager = realAccountRatePlanManager;
        this.tapToPayActionManager = realFamilyProfileManager;
        this.tapToPayAnalyticsHelper = featureFlagManager;
        this.flowStarter = flowStarter;
        this.tapToPayErrorReporter = nVar;
        this.tapToPayRepository = editProfile;
        this.navigator = screenNavigator;
        this.ttpEligibilityProvider = timeToLiveSyncState;
        this.ttpSessionManager = Updater.mutableStateOf$default(null);
        this.mriFactory = realAccountOutboundNavigator$Factory$Impl.create$1(screenNavigator);
        this.screen = realProfilePhotoManager$Factory$Impl.create$1(screenNavigator);
        this.screenRecodingDetector = realProfilePreviewPresenter$Factory$Impl.create$1(ProfileScreens.ProfilePreview.INSTANCE, screenNavigator);
    }

    public TapToPayPresenter(Analytics analytics, IntentLauncher intentLauncher, RealBitcoinFormatter realBitcoinFormatter, RealProfileManager realProfileManager, AndroidStringManager androidStringManager, CryptoFlowStarter cryptoFlowStarter, RealQrCodesPresenter realQrCodesPresenter, RealLightningInvoiceGenerator realLightningInvoiceGenerator, RealCryptoValueRepo realCryptoValueRepo, RealBitcoinRefreshInvoiceManager realBitcoinRefreshInvoiceManager, RealBitcoinProfileRepo realBitcoinProfileRepo, Flow flow, LocalizedMoneyFormatter.Factory factory, AndroidClock androidClock, BetterNavigator.ScreenNavigator screenNavigator, BitcoinDepositsScreen bitcoinDepositsScreen) {
        this.$r8$classId = 3;
        bitcoinDepositsScreen.getClass();
        this.deviceIntegrityAttester = analytics;
        this.errorReporter = intentLauncher;
        this.flowStarter = realBitcoinFormatter;
        this.profileManager = realProfileManager;
        this.keyProvider = androidStringManager;
        this.sessionManager = realQrCodesPresenter;
        this.tapToPayActionManager = realLightningInvoiceGenerator;
        this.tapToPayAnalyticsHelper = realBitcoinRefreshInvoiceManager;
        this.navigator = screenNavigator;
        this.tapToPayErrorReporter = bitcoinDepositsScreen;
        this.tapToPayRepository = new Result(androidClock);
        this.ttpEligibilityProvider = factory.create(MoneyFormatterConfig.STANDARD);
        this.ttpSessionManager = FlowKt.take(realCryptoValueRepo.valuePerBitcoin(null), 2);
        this.mriFactory = ViewShowRenderingKt.displayUnitProto(realBitcoinProfileRepo);
        this.screen = new BitcoinDepositsPresenter$special$$inlined$filter$1(flow, 0);
        this.screenRecodingDetector = realBitcoinRefreshInvoiceManager.requests;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TapToPayPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, ActivitiesManager.Factory factory, SessionManager sessionManager, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, SyncValueReader syncValueReader, AndroidStringManager androidStringManager, PaychecksAppService paychecksAppService, Error.Code.Companion companion, Analytics analytics, RealDisclosureProvider realDisclosureProvider, RealClientSyncer realClientSyncer, ErrorReporter errorReporter, SampleStrategy sampleStrategy, CoroutineContext coroutineContext, PaychecksHomeScreen paychecksHomeScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 5;
        this.deviceIntegrityAttester = realActivityEmbeddedPresenter$Factory$Impl;
        this.flowStarter = syncValueReader;
        this.keyProvider = androidStringManager;
        this.profileManager = paychecksAppService;
        this.sessionManager = analytics;
        this.tapToPayActionManager = realDisclosureProvider;
        this.tapToPayAnalyticsHelper = realClientSyncer;
        this.errorReporter = errorReporter;
        this.tapToPayErrorReporter = sampleStrategy;
        this.tapToPayRepository = coroutineContext;
        this.ttpEligibilityProvider = paychecksHomeScreen;
        this.navigator = screenNavigator;
        this.ttpSessionManager = realRouter$Factory$Impl.create$1(screenNavigator);
        this.mriFactory = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new MainPaymentViewKt$$ExternalSyntheticLambda0(1));
        Object[] objArr = 0 == true ? 1 : 0;
        ActivitiesManager.ActivityContext activityContext = new ActivitiesManager.ActivityContext(new ActivityToken(ActivityTokenType.CUSTOMER_TOKEN_PAYCHECKS, PlatformKt.activeAccountToken(sessionManager), (String) null, 12), ActivityScope.MY_ACTIVITY, (ActivitiesManager.ActivityPageHandler) objArr, 8);
        this.screen = activityContext;
        this.screenRecodingDetector = factory.create(activityContext, new ActivitiesCache.InMemory());
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3759models(Flow flow, Composer composer, int i) {
        int i2;
        int i3;
        Pair pair;
        int i4;
        AndroidSyncValueSpecs$Access$1 androidSyncValueSpecs$Access$1 = AndroidSyncValueSpecs.C4bTapToPay;
        RealTapToPayEligibilityProvider realTapToPayEligibilityProvider = (RealTapToPayEligibilityProvider) this.ttpEligibilityProvider;
        SyncValueReader syncValueReader = realTapToPayEligibilityProvider.syncValueReader;
        TapToPayScreen tapToPayScreen = (TapToPayScreen) this.screen;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-100421039);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            if (tapToPayScreen instanceof TapToPayScreen.TapToPayInitialScreen) {
                TapToPayScreen.TapToPayInitialScreen tapToPayInitialScreen = (TapToPayScreen.TapToPayInitialScreen) tapToPayScreen;
                pair = new Pair(tapToPayInitialScreen.amount, tapToPayInitialScreen.exitScreen);
            } else if (Intrinsics.areEqual(tapToPayScreen, TapToPayScreen.TapToPayReturnScreen.INSTANCE)) {
                TapToPayPaymentData tapToPayPaymentData = ((RealTapToPaySessionManager) this.ttpSessionManager).ttpSessionData;
                if (tapToPayPaymentData != null) {
                    pair = new Pair(tapToPayPaymentData.amount, tapToPayPaymentData.exitScreen);
                } else {
                    a$$ExternalSyntheticBUOutline0.m$1("no session data on return screen");
                    return;
                }
            } else {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            Money money = (Money) pair.first;
            Screen screen = (Screen) pair.second;
            Object rememberedValue = gapComposer.rememberedValue();
            Continuation continuation = null;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(((RealProfileManager) this.profileManager).publicProfile(), new TabContentPresenter$models$4$1$1$1(mutableState, continuation, 19), 3);
                gapComposer.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$1);
                rememberedValue2 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
            }
            MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
            Object rememberedValue3 = gapComposer.rememberedValue();
            int i5 = 28;
            if (rememberedValue3 == neverEqualPolicy) {
                RealRecipientRepository$suggestions$$inlined$map$1 realRecipientRepository$suggestions$$inlined$map$1 = new RealRecipientRepository$suggestions$$inlined$map$1(syncValueReader.getSingleValue(androidSyncValueSpecs$Access$1), i5);
                gapComposer.updateRememberedValue(realRecipientRepository$suggestions$$inlined$map$1);
                rememberedValue3 = realRecipientRepository$suggestions$$inlined$map$1;
            }
            MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy) {
                StateFlow allValues = syncValueReader.getAllValues(androidSyncValueSpecs$Access$1);
                i4 = 10;
                rememberedValue4 = new FlowExtensionsKt$combine$$inlined$combine$1(i4, allValues, realTapToPayEligibilityProvider);
                gapComposer.updateRememberedValue(rememberedValue4);
            } else {
                i4 = 10;
            }
            MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2);
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new ShoppingWebBridge.AnonymousClass1(this, (Continuation) null, i5);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect(gapComposer, tapToPayScreen, (Function2) rememberedValue5);
            PublicProfile publicProfile = (PublicProfile) collectAsState.getValue();
            Boolean bool = (Boolean) collectAsState2.getValue();
            Boolean bool2 = (Boolean) collectAsState3.getValue();
            if (publicProfile != null && bool != null && bool2 != null) {
                gapComposer.startReplaceGroup(465006208);
                i3 = i4;
                Updater.LaunchedEffect(publicProfile, bool, bool2, new TapToPayPresenter$models$$inlined$LaunchedEffectNotNull$1(publicProfile, bool, bool2, null, this, screen, money, mutableState), gapComposer);
                gapComposer.end(false);
            } else {
                i3 = i4;
                gapComposer.startReplaceGroup(465061946);
                gapComposer.end(false);
            }
        } else {
            i3 = 10;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AddMoneyViewKt$$ExternalSyntheticLambda11(this, flow, i, i3);
        }
    }
}
