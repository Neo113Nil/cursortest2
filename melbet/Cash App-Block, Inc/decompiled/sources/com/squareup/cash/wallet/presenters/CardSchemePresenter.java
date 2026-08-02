package com.squareup.cash.wallet.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Handler;
import android.os.Message;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.directory.data.DirectoryKt;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.g6$$ExternalSyntheticLambda11;
import com.braze.enums.DataStoreKey$$ExternalSyntheticLambda0;
import com.datadog.android.rum.model.ErrorEvent;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahh;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahi;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.ProfileUpsellPresenter;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.banking.DisclosureForScreen;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.navigation.FlowNavigationHelper;
import com.squareup.cash.boost.backend.RealBoostProvider;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.backend.RealBoostRepository$getAllOrderedBoosts$$inlined$map$1;
import com.squareup.cash.boost.db.RewardWithSelection;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.businessaccount.kybrestriction.presenters.KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.businessaccount.screens.KybRestrictionBannerScreen;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsightsConfig;
import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsightsHome;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.blockedbusinesses.BlockedBusinessesViewOpen;
import com.squareup.cash.cdf.cashcard.CashCardManageDisable;
import com.squareup.cash.cdf.cashcard.CashCardManageEnable;
import com.squareup.cash.cdf.cashcard.CashCardViewCopyValue;
import com.squareup.cash.cdf.prepurchasecard.PrepurchaseCardAppletRowTap;
import com.squareup.cash.cdf.roundups.RoundUpsEnableViewEntryRow;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda9;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.SyncRangeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.clientsync.models.SyncTopic;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs$Access$1;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.blockers.RealFlowStarter$$ExternalSyntheticLambda5;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.eligibility.backend.api.EligibleFeature;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$BankingCashGreenRelease;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobilePrepurchaseCashCardPilot;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$DisableFilament;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$TagProvisioningTemp;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.moneybot.presenters.plugins.NavigationCardPresenter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseToggleManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda3;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.upsell.presenters.NullStateCarouselPresenter;
import com.squareup.cash.upsell.presenters.NullStateCarouselPresenter$Factory$Impl;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.backend.real.RealWalletAnalyticsHelper;
import com.squareup.cash.wallet.data.CashAppTag;
import com.squareup.cash.wallet.data.CashAppTagKt;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealCashAppTagManager;
import com.squareup.cash.wallet.data.RealDeviceLockAnimationBus;
import com.squareup.cash.wallet.data.RealNewTagPeekBus;
import com.squareup.cash.wallet.roundups.CardsRoundUpsItemViewModel;
import com.squareup.cash.wallet.screens.CardControlDialogScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.wallet.viewmodels.CardHomeAction;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.viewmodels.NextUpDismissMethod;
import com.squareup.cash.wallet.viewmodels.OverdraftCoverageListItemViewModel;
import com.squareup.cash.wallet.viewmodels.PresentationAction;
import com.squareup.cash.wallet.viewmodels.PresentationTimelineViewModel;
import com.squareup.cash.wallet.viewmodels.SpendingInsightsListItemViewModel;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda21;
import com.squareup.cash.wallet.workers.CardAppletWorker$setup$1$2$1;
import com.squareup.cash.work.data.real.RealPayDataLoader$fetchData$1;
import com.squareup.cash.work.session.SquareAccountStore$userFlow$$inlined$map$1;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsConfig;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
import com.squareup.protos.cash.cashbusinessaccounts.KybEligibilityWarning;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.cash.pools.PoolVisibility;
import com.squareup.protos.cash.postcard.CardHomeAction;
import com.squareup.protos.cash.postcard.CardHomeAction$Action$CopyCardNumber;
import com.squareup.protos.cash.postcard.CardHomeAction$Action$LockDevices;
import com.squareup.protos.cash.postcard.CardHomeActions;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.CardModule$CardElementAction$Type$CopyCardNumber;
import com.squareup.protos.cash.postcard.CardModule$CardElementAction$Type$DoClientRoute;
import com.squareup.protos.cash.postcard.CardModule$CardElementAction$Type$DoClientScenario;
import com.squareup.protos.cash.postcard.CardModule$CardElementAction$Type$OpenDialog;
import com.squareup.protos.cash.postcard.CardModule$HeroNullStateModule$Nux$UhchNux;
import com.squareup.protos.cash.postcard.CardModule$StatusElement$Accessory$Type$PillButton;
import com.squareup.protos.cash.postcard.CardModule$StatusElement$Accessory$Type$Push;
import com.squareup.protos.cash.postcard.CardScheme;
import com.squareup.protos.cash.postcard.CashAppCard;
import com.squareup.protos.cash.postcard.app.PostcardClientService;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.whimsicard.syncentity.Action;
import com.squareup.protos.cash.whimsicard.syncentity.PaymentDevicePresentation;
import com.squareup.protos.cash.whimsicard.syncentity.PresentationEntry;
import com.squareup.protos.cash.whimsicard.syncentity.StatusDisplay;
import com.squareup.protos.cash.whimsicard.syncentity.Timeline;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.GetFlowRequest;
import com.squareup.protos.franklin.app.GetFlowResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.RoundUpsElement;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.protos.rewardly.ui.UiRewardAvatar;
import com.squareup.protos.rewardly.ui.UiRewardAvatars;
import com.squareup.util.Strings;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.android.Toaster$Length;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.util.compose.SharedViewEventsKt;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.squareup.workflow1.TimerWorker$run$1;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class CardSchemePresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final RealWalletAnalyticsHelper analyticsHelper;
    public final RealBoostRepository boostRepository;
    public final RealCardCustomizationRepository cardCustomizationRepository;
    public final SyncTopic cardTopic;
    public final RealCashAppTagManager cashAppTagManager;
    public final LiteCashAppTagSyncTopicProvider cashAppTagSyncTopicProvider;
    public final RealClientScenarioCompleter clientScenarioCompleter;
    public final RealClientSyncer clientSyncer;
    public final RealClipboardManager clippy;
    public final ParcelableSnapshotMutableIntState copyAnimationTrigger$delegate;
    public final ParcelableSnapshotMutableState copyId$delegate;
    public final RealDeviceLockAnimationBus deviceLockAnimationBus;
    public final RealDisclosureProvider disclosureProvider;
    public final ErrorReporter errorReporter;
    public final RealFamilyProfileManager familyProfileManager;
    public final RealFeatureEligibilityRepository featureEligibilityRepository;
    public final FeatureFlagManager featureFlagManager;
    public final FlowNavigationHelper flowNavigationHelper;
    public final FlowStarter flowStarter;
    public final AppService franklinAppService;
    public boolean hasRecordedScrollEvent;
    public final GpsConfigQueries heroCardStateQueries;
    public final Integer initialPaymentDevicePage;
    public final CoroutineContext ioDispatcher;
    public final Lazy isCardGridEnabled$delegate;
    public final boolean isFilamentDisabled;
    public final IssuedCardManager issuedCardManager;
    public final NavigationCardPresenter kybRestrictionBannerPresenter;
    public final KeyValue lastViewedPaymentDevicePage;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealNewTagPeekBus newTagPeekBus;
    public final RealNextUpCandidateDismisser nextUpCandidateDismisser;
    public final NullStateCarouselPresenter$Factory$Impl nullStateCarouselPresenterFactory;
    public final TaxReturnsPresenter overdraftListItemPresenter;
    public final PostcardClientService postcardService;
    public final RealPrepurchaseToggleManager prepurchaseToggleManager;
    public final MarkwonConfiguration roundUpsItemPresenter;
    public final RealRouter router;
    public final SessionManager sessionManager;
    public final MarkwonConfiguration spendingInsightsListItemPresenter;
    public final AndroidStringManager stringManager;
    public final boolean supportsFilament;
    public final SyncValueReader syncValueReader;
    public final AndroidToaster toaster;

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider analytics;
        public final Provider analyticsHelper;
        public final Provider boostRepository;
        public final Provider cardCustomizationRepository;
        public final Provider cardTopic;
        public final Provider cashAppTagManager;
        public final Provider cashAppTagSyncTopicProvider;
        public final Provider cashDatabase;
        public final Provider clientScenarioCompleter;
        public final Provider clientSyncer;
        public final Provider clippy;
        public final Provider deviceLockAnimationBus;
        public final Provider disclosureProvider;
        public final Provider errorReporter;
        public final Provider familyProfileManager;
        public final Provider featureEligibilityRepository;
        public final Provider featureFlagManager;
        public final Provider filamentSupportProvider;
        public final Provider flowNavigationHelper;
        public final Provider flowStarter;
        public final Provider franklinAppService;
        public final Provider ioDispatcher;
        public final Provider issuedCardManager;
        public final Provider kybRestrictionBannerFactory;
        public final Provider lastViewedPaymentDevicePage;
        public final Provider newTagPeekBus;
        public final Provider nextUpCandidateDismisser;
        public final InstanceFactory nullStateCarouselPresenterFactory;
        public final InstanceFactory overdraftListItemPresenterFactory;
        public final Provider postcardService;
        public final Provider prepurchaseToggleManager;
        public final RealBrazeManager.MetroFactory roundUpsItemPresenter;
        public final Provider routerFactory;
        public final Provider sessionManager;
        public final RealBrazeManager.MetroFactory spendingInsightsListItemPresenter;
        public final Provider stringManager;
        public final Provider syncValueReader;
        public final Provider toaster;

        public MetroFactory(Provider provider, Provider provider2, InstanceFactory instanceFactory, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, RealBrazeManager.MetroFactory metroFactory, RealBrazeManager.MetroFactory metroFactory2, Provider provider9, Provider provider10, Provider provider11, Provider provider12, Provider provider13, Provider provider14, Provider provider15, Provider provider16, Provider provider17, Provider provider18, Provider provider19, Provider provider20, Provider provider21, Provider provider22, Provider provider23, Provider provider24, Provider provider25, Provider provider26, Provider provider27, Provider provider28, Provider provider29, Provider provider30, Provider provider31, Provider provider32, Provider provider33, InstanceFactory instanceFactory2, Provider provider34) {
            this.clientSyncer = provider;
            this.syncValueReader = provider2;
            this.nullStateCarouselPresenterFactory = instanceFactory;
            this.stringManager = provider3;
            this.clientScenarioCompleter = provider4;
            this.clippy = provider5;
            this.analytics = provider6;
            this.toaster = provider7;
            this.flowNavigationHelper = provider8;
            this.roundUpsItemPresenter = metroFactory;
            this.spendingInsightsListItemPresenter = metroFactory2;
            this.sessionManager = provider9;
            this.disclosureProvider = provider10;
            this.featureEligibilityRepository = provider11;
            this.boostRepository = provider12;
            this.analyticsHelper = provider13;
            this.errorReporter = provider14;
            this.issuedCardManager = provider15;
            this.cashAppTagManager = provider16;
            this.deviceLockAnimationBus = provider17;
            this.newTagPeekBus = provider18;
            this.lastViewedPaymentDevicePage = provider19;
            this.nextUpCandidateDismisser = provider20;
            this.postcardService = provider21;
            this.franklinAppService = provider22;
            this.flowStarter = provider23;
            this.familyProfileManager = provider24;
            this.featureFlagManager = provider25;
            this.cardCustomizationRepository = provider26;
            this.prepurchaseToggleManager = provider27;
            this.cardTopic = provider28;
            this.cashAppTagSyncTopicProvider = provider29;
            this.ioDispatcher = provider30;
            this.cashDatabase = provider31;
            this.filamentSupportProvider = provider32;
            this.routerFactory = provider33;
            this.overdraftListItemPresenterFactory = instanceFactory2;
            this.kybRestrictionBannerFactory = provider34;
        }
    }

    /* loaded from: classes8.dex */
    public final class NextUpEventMetadata {
        public final String candidateId;
        public final int candidateRank;
        public final CardModule.CardElementAction configuredAction;
        public final CardModule.CardElementAction enabledAction;
        public final String title;

        public NextUpEventMetadata(String str, int i, String str2, CardModule.CardElementAction cardElementAction, CardModule.CardElementAction cardElementAction2) {
            this.candidateId = str;
            this.candidateRank = i;
            this.title = str2;
            this.configuredAction = cardElementAction;
            this.enabledAction = cardElementAction2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextUpEventMetadata)) {
                return false;
            }
            NextUpEventMetadata nextUpEventMetadata = (NextUpEventMetadata) obj;
            return this.candidateId.equals(nextUpEventMetadata.candidateId) && this.candidateRank == nextUpEventMetadata.candidateRank && this.title.equals(nextUpEventMetadata.title) && Intrinsics.areEqual(this.configuredAction, nextUpEventMetadata.configuredAction) && Intrinsics.areEqual(this.enabledAction, nextUpEventMetadata.enabledAction);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.candidateRank, this.candidateId.hashCode() * 31, 31), 31, this.title);
            CardModule.CardElementAction cardElementAction = this.configuredAction;
            int hashCode = (m + (cardElementAction == null ? 0 : cardElementAction.hashCode())) * 31;
            CardModule.CardElementAction cardElementAction2 = this.enabledAction;
            return hashCode + (cardElementAction2 != null ? cardElementAction2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("NextUpEventMetadata(candidateId=", this.candidateRank, this.candidateId, ", candidateRank=", ", title=");
            m.append(this.title);
            m.append(", configuredAction=");
            m.append(this.configuredAction);
            m.append(", enabledAction=");
            m.append(this.enabledAction);
            m.append(")");
            return m.toString();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;

        static {
            int[] iArr = new int[ClientScenario.values().length];
            try {
                iArr[ClientScenario.ENABLE_ISSUED_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClientScenario.DISABLE_ISSUED_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CardModule.InformationSource.values().length];
            try {
                iArr2[3] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PoolVisibility.Companion companion = CardModule.InformationSource.Companion;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PoolVisibility.Companion companion2 = CardModule.InformationSource.Companion;
                iArr2[4] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PoolVisibility.Companion companion3 = CardModule.InformationSource.Companion;
                iArr2[5] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PoolVisibility.Companion companion4 = CardModule.InformationSource.Companion;
                iArr2[6] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                PoolVisibility.Companion companion5 = CardModule.InformationSource.Companion;
                iArr2[7] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                PoolVisibility.Companion companion6 = CardModule.InformationSource.Companion;
                iArr2[10] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                PoolVisibility.Companion companion7 = CardModule.InformationSource.Companion;
                iArr2[11] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                PoolVisibility.Companion companion8 = CardModule.InformationSource.Companion;
                iArr2[13] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                PoolVisibility.Companion companion9 = CardModule.InformationSource.Companion;
                iArr2[14] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                PoolVisibility.Companion companion10 = CardModule.InformationSource.Companion;
                iArr2[8] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NextUpDismissMethod.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                NextUpDismissMethod nextUpDismissMethod = NextUpDismissMethod.SWIPE;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr4 = new int[CardModule.Button.Prominence.Type.values().length];
            try {
                iArr4[1] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                TextSize.Companion companion11 = CardModule.Button.Prominence.Type.Companion;
                iArr4[2] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[OverdraftCoverageListItemViewModel.Ready.OverdraftListItemState.values().length];
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                OverdraftCoverageListItemViewModel.Ready.OverdraftListItemState overdraftListItemState = OverdraftCoverageListItemViewModel.Ready.OverdraftListItemState.ON;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                OverdraftCoverageListItemViewModel.Ready.OverdraftListItemState overdraftListItemState2 = OverdraftCoverageListItemViewModel.Ready.OverdraftListItemState.ON;
                iArr5[2] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                OverdraftCoverageListItemViewModel.Ready.OverdraftListItemState overdraftListItemState3 = OverdraftCoverageListItemViewModel.Ready.OverdraftListItemState.ON;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            int[] iArr6 = new int[CardModule.DeliveryStatusElement.Prominence.values().length];
            try {
                iArr6[1] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[CardModule.StatusElement.Icon.IconBackground.values().length];
            try {
                iArr7[1] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                TaxEnvironment.Companion companion12 = CardModule.StatusElement.Icon.IconBackground.Companion;
                iArr7[2] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$6 = iArr7;
        }
    }

    public CardSchemePresenter(BetterNavigator.ScreenNavigator screenNavigator, String str, Integer num, RealClientSyncer realClientSyncer, SyncValueReader syncValueReader, NullStateCarouselPresenter$Factory$Impl nullStateCarouselPresenter$Factory$Impl, AndroidStringManager androidStringManager, RealClientScenarioCompleter realClientScenarioCompleter, RealClipboardManager realClipboardManager, Analytics analytics, AndroidToaster androidToaster, FlowNavigationHelper flowNavigationHelper, MarkwonConfiguration markwonConfiguration, MarkwonConfiguration markwonConfiguration2, SessionManager sessionManager, RealDisclosureProvider realDisclosureProvider, RealFeatureEligibilityRepository realFeatureEligibilityRepository, RealBoostRepository realBoostRepository, RealWalletAnalyticsHelper realWalletAnalyticsHelper, ErrorReporter errorReporter, IssuedCardManager issuedCardManager, RealCashAppTagManager realCashAppTagManager, RealDeviceLockAnimationBus realDeviceLockAnimationBus, RealNewTagPeekBus realNewTagPeekBus, KeyValue keyValue, RealNextUpCandidateDismisser realNextUpCandidateDismisser, PostcardClientService postcardClientService, AppService appService, FlowStarter flowStarter, RealFamilyProfileManager realFamilyProfileManager, FeatureFlagManager featureFlagManager, RealCardCustomizationRepository realCardCustomizationRepository, RealPrepurchaseToggleManager realPrepurchaseToggleManager, SyncTopic syncTopic, LiteCashAppTagSyncTopicProvider liteCashAppTagSyncTopicProvider, CoroutineContext coroutineContext, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealFilamentSupportProvider realFilamentSupportProvider, RealRouter$Factory$Impl realRouter$Factory$Impl, OverdraftListItemPresenter$Factory$Impl overdraftListItemPresenter$Factory$Impl, KybRestrictionBannerPresenter$AssistedInjectionFactory$Impl kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl) {
        this.navigator = screenNavigator;
        this.initialPaymentDevicePage = num;
        this.clientSyncer = realClientSyncer;
        this.syncValueReader = syncValueReader;
        this.nullStateCarouselPresenterFactory = nullStateCarouselPresenter$Factory$Impl;
        this.stringManager = androidStringManager;
        this.clientScenarioCompleter = realClientScenarioCompleter;
        this.clippy = realClipboardManager;
        this.analytics = analytics;
        this.toaster = androidToaster;
        this.flowNavigationHelper = flowNavigationHelper;
        this.roundUpsItemPresenter = markwonConfiguration;
        this.spendingInsightsListItemPresenter = markwonConfiguration2;
        this.sessionManager = sessionManager;
        this.disclosureProvider = realDisclosureProvider;
        this.featureEligibilityRepository = realFeatureEligibilityRepository;
        this.boostRepository = realBoostRepository;
        this.analyticsHelper = realWalletAnalyticsHelper;
        this.errorReporter = errorReporter;
        this.issuedCardManager = issuedCardManager;
        this.cashAppTagManager = realCashAppTagManager;
        this.deviceLockAnimationBus = realDeviceLockAnimationBus;
        this.newTagPeekBus = realNewTagPeekBus;
        this.lastViewedPaymentDevicePage = keyValue;
        this.nextUpCandidateDismisser = realNextUpCandidateDismisser;
        this.postcardService = postcardClientService;
        this.franklinAppService = appService;
        this.flowStarter = flowStarter;
        this.familyProfileManager = realFamilyProfileManager;
        this.featureFlagManager = featureFlagManager;
        this.cardCustomizationRepository = realCardCustomizationRepository;
        this.prepurchaseToggleManager = realPrepurchaseToggleManager;
        this.cardTopic = syncTopic;
        this.cashAppTagSyncTopicProvider = liteCashAppTagSyncTopicProvider;
        this.ioDispatcher = coroutineContext;
        this.heroCardStateQueries = cashAccountDatabaseImpl.cardTabHeroStateQueries;
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
        ProfileUpsellPresenter.MetroFactory metroFactory = overdraftListItemPresenter$Factory$Impl.delegateFactory;
        SyncValueReader syncValueReader2 = (SyncValueReader) metroFactory.analytics.getValue();
        Analytics analytics2 = (Analytics) metroFactory.syncValueReader.getValue();
        RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) metroFactory.routerFactory.invoke();
        syncValueReader2.getClass();
        analytics2.getClass();
        realRouter$Factory$Impl2.getClass();
        this.overdraftListItemPresenter = new TaxReturnsPresenter(syncValueReader2, analytics2, realRouter$Factory$Impl2, screenNavigator);
        this.supportsFilament = realFilamentSupportProvider.isDeviceSupported();
        this.isFilamentDisabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$DisableFilament.INSTANCE)).enabled();
        this.isCardGridEnabled$delegate = LazyKt.lazy(new CardSchemePresenter$$ExternalSyntheticLambda1(this, 4));
        this.kybRestrictionBannerPresenter = kybRestrictionBannerPresenter$AssistedInjectionFactory$Impl.create(screenNavigator, new KybRestrictionBannerScreen(new WalletHomeScreen(7, (Integer) null, (String) null), KybEligibilityWarning.RestrictedFeature.RESTRICTED_FEATURE_CARD));
        this.copyId$delegate = Updater.mutableStateOf$default(str);
        this.copyAnimationTrigger$delegate = new ParcelableSnapshotMutableIntState(0);
    }

    public static final boolean access$containsCardScheme(CardSchemePresenter cardSchemePresenter, List list) {
        SyncValue.Value value;
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            SyncValue syncValue = ((SyncEntity) it.next()).sync_value;
            List list3 = null;
            if (syncValue != null && (value = syncValue.value) != null) {
                SyncValue.Value.Scheme scheme = value instanceof SyncValue.Value.Scheme ? (SyncValue.Value.Scheme) value : null;
                CardScheme cardScheme = scheme != null ? scheme.value : null;
                if (cardScheme != null) {
                    list3 = cardScheme.modules;
                }
            }
            List list4 = list3;
            if (list4 != null && !list4.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsHeroCard(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            CardModule.Type type2 = ((CardModule) it.next()).f1328type;
            CardModule.HeroIssuedCardModule heroIssuedCardModule = null;
            if (type2 != null) {
                CardModule.Type.HeroIssuedCard heroIssuedCard = type2 instanceof CardModule.Type.HeroIssuedCard ? (CardModule.Type.HeroIssuedCard) type2 : null;
                if (heroIssuedCard != null) {
                    heroIssuedCardModule = heroIssuedCard.value;
                }
            }
            if (heroIssuedCardModule != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getActionType(CardModule.CardElementAction cardElementAction) {
        CardModule.CardElementAction.DoClientRoute doClientRoute;
        CardModule.CardElementAction.DoClientScenario doClientScenario;
        CardModule.CardElementAction.OpenDialog openDialog;
        zzkk zzkkVar;
        zzkk zzkkVar2;
        zzkk zzkkVar3;
        zzkk zzkkVar4;
        CardModule.CardElementAction.CopyCardNumber copyCardNumber = null;
        if (cardElementAction != null && (zzkkVar4 = cardElementAction.f1331type) != null) {
            CardModule$CardElementAction$Type$DoClientRoute cardModule$CardElementAction$Type$DoClientRoute = zzkkVar4 instanceof CardModule$CardElementAction$Type$DoClientRoute ? (CardModule$CardElementAction$Type$DoClientRoute) zzkkVar4 : null;
            if (cardModule$CardElementAction$Type$DoClientRoute != null) {
                doClientRoute = cardModule$CardElementAction$Type$DoClientRoute.value;
                if (doClientRoute == null) {
                    return "do_client_route";
                }
                if (cardElementAction != null && (zzkkVar3 = cardElementAction.f1331type) != null) {
                    CardModule$CardElementAction$Type$DoClientScenario cardModule$CardElementAction$Type$DoClientScenario = zzkkVar3 instanceof CardModule$CardElementAction$Type$DoClientScenario ? (CardModule$CardElementAction$Type$DoClientScenario) zzkkVar3 : null;
                    if (cardModule$CardElementAction$Type$DoClientScenario != null) {
                        doClientScenario = cardModule$CardElementAction$Type$DoClientScenario.value;
                        if (doClientScenario == null) {
                            return "do_client_scenario";
                        }
                        if (cardElementAction != null && (zzkkVar2 = cardElementAction.f1331type) != null) {
                            CardModule$CardElementAction$Type$OpenDialog cardModule$CardElementAction$Type$OpenDialog = zzkkVar2 instanceof CardModule$CardElementAction$Type$OpenDialog ? (CardModule$CardElementAction$Type$OpenDialog) zzkkVar2 : null;
                            if (cardModule$CardElementAction$Type$OpenDialog != null) {
                                openDialog = cardModule$CardElementAction$Type$OpenDialog.value;
                                if (openDialog == null) {
                                    return "open_dialog";
                                }
                                if (cardElementAction != null && (zzkkVar = cardElementAction.f1331type) != null) {
                                    CardModule$CardElementAction$Type$CopyCardNumber cardModule$CardElementAction$Type$CopyCardNumber = zzkkVar instanceof CardModule$CardElementAction$Type$CopyCardNumber ? (CardModule$CardElementAction$Type$CopyCardNumber) zzkkVar : null;
                                    if (cardModule$CardElementAction$Type$CopyCardNumber != null) {
                                        copyCardNumber = cardModule$CardElementAction$Type$CopyCardNumber.value;
                                    }
                                }
                                return copyCardNumber != null ? "copy_card_number" : "unknown";
                            }
                        }
                        openDialog = null;
                        if (openDialog == null) {
                        }
                    }
                }
                doClientScenario = null;
                if (doClientScenario == null) {
                }
            }
        }
        doClientRoute = null;
        if (doClientRoute == null) {
        }
    }

    public static Object reportExpected$default(CardSchemePresenter cardSchemePresenter, Object obj) {
        cardSchemePresenter.getClass();
        try {
            obj.getClass();
            return obj;
        } catch (Exception e) {
            cardSchemePresenter.errorReporter.report(new CardTabError(e), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            return null;
        }
    }

    public static String token(Icon icon, String str) {
        String str2;
        return (icon == null || (str2 = icon.arcade_id) == null) ? str : str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x00db, code lost:
    
        if (r5 == r12) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b1, code lost:
    
        if (((com.squareup.cash.wallet.data.RealIssuedCardManager) r27.issuedCardManager).retrieveCardDetails(r4, r2, r6, r4, r7, r6) == r12) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ed, code lost:
    
        if (r2.collect(r3, r6) == r12) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[LOOP:0: B:35:0x011b->B:52:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Integer, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object complete(ClientScenario clientScenario, Function1 function1, WalletHomeScreen walletHomeScreen, ContinuationImpl continuationImpl) {
        CardSchemePresenter$complete$1 cardSchemePresenter$complete$1;
        int i;
        Flow$Type flow$Type;
        ChannelFlowTransformLatest completeClientScenario;
        BlockersData startFlow$default;
        ?? r4;
        Object flow;
        SyncEntitiesResponse syncEntitiesResponse;
        List list;
        boolean z;
        SyncValue.Value value;
        Function1 function12 = function1;
        WalletHomeScreen walletHomeScreen2 = walletHomeScreen;
        if (continuationImpl instanceof CardSchemePresenter$complete$1) {
            cardSchemePresenter$complete$1 = (CardSchemePresenter$complete$1) continuationImpl;
            int i2 = cardSchemePresenter$complete$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cardSchemePresenter$complete$1.label = i2 - PKIFailureInfo.systemUnavail;
                CardSchemePresenter$complete$1 cardSchemePresenter$complete$12 = cardSchemePresenter$complete$1;
                Object obj = cardSchemePresenter$complete$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardSchemePresenter$complete$12.label;
                int i3 = 3;
                boolean z2 = false;
                int i4 = 1;
                String str = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    int i5 = WhenMappings.$EnumSwitchMapping$0[clientScenario.ordinal()];
                    Analytics analytics = this.analytics;
                    if (i5 == 1) {
                        analytics.track(new CashCardManageEnable(), null);
                        flow$Type = Flow$Type.ENABLE_ISSUED_CARD;
                    } else if (i5 != 2) {
                        flow$Type = null;
                    } else {
                        analytics.track(new CashCardManageDisable(), null);
                        flow$Type = Flow$Type.DISABLE_ISSUED_CARD_IN_POSTCARD;
                    }
                    int i6 = 6;
                    if (flow$Type != null) {
                        BlockersData.Flow flow2 = BlockersData.Flow.SERVER_FLOW;
                        WalletHomeScreen walletHomeScreen3 = new WalletHomeScreen(7, (Integer) null, (String) null);
                        if (walletHomeScreen2 == null) {
                            walletHomeScreen2 = new WalletHomeScreen(7, (Integer) null, (String) null);
                        }
                        startFlow$default = FlowStarter.startFlow$default(this.flowStarter, flow2, walletHomeScreen3, null, ClientScenario.PLASMA, null, walletHomeScreen2, new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.CARD_TAB, str, i6), null, new RealFlowStarter$$ExternalSyntheticLambda5(flow$Type, i4), EnumC0170g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE);
                        GetFlowRequest getFlowRequest = new GetFlowRequest((RequestContext) (objArr2 == true ? 1 : 0), (GetFlowRequest.Input) new GetFlowRequest.Input.FlowType(flow$Type), 5);
                        if (function12 != null) {
                            function12.invoke(Boolean.TRUE);
                        }
                        cardSchemePresenter$complete$12.L$1 = function12;
                        cardSchemePresenter$complete$12.L$3 = flow$Type;
                        cardSchemePresenter$complete$12.L$4 = startFlow$default;
                        cardSchemePresenter$complete$12.label = 1;
                        r4 = 0;
                        flow = this.franklinAppService.getFlow("/2.0/cash/get-flow", null, null, getFlowRequest, cardSchemePresenter$complete$12);
                    } else if (clientScenario == ClientScenario.UNLOCK_ISSUED_CARD) {
                        WalletHomeScreen walletHomeScreen4 = new WalletHomeScreen(7, (Integer) null, (String) null);
                        CardSchemePresenter$complete$2 cardSchemePresenter$complete$2 = new CardSchemePresenter$complete$2(function12, null, 0);
                        CardSchemePresenter$$ExternalSyntheticLambda1 cardSchemePresenter$$ExternalSyntheticLambda1 = new CardSchemePresenter$$ExternalSyntheticLambda1(this, i3);
                        BottomSheet$$ExternalSyntheticLambda3 bottomSheet$$ExternalSyntheticLambda3 = new BottomSheet$$ExternalSyntheticLambda3(26, walletHomeScreen2, this);
                        cardSchemePresenter$complete$12.L$1 = null;
                        cardSchemePresenter$complete$12.L$3 = null;
                        cardSchemePresenter$complete$12.label = 2;
                    } else {
                        completeClientScenario = this.clientScenarioCompleter.completeClientScenario(clientScenario, (r24 & 2) != 0 ? null : new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.CARD_TAB, (String) (objArr == true ? 1 : 0), i6), new WalletHomeScreen(7, (Integer) null, (String) null), (r24 & 8) != 0 ? null : walletHomeScreen, BlockersData.Flow.PROFILE_BLOCKERS, function12 == null, (r24 & 64) != 0 ? null : null, (r24 & 128) != 0 ? EmptyList.INSTANCE : null, null, null, false);
                        BufferCountKt$bufferSkip$1.AnonymousClass1 anonymousClass1 = new BufferCountKt$bufferSkip$1.AnonymousClass1(16, function12, this, walletHomeScreen);
                        cardSchemePresenter$complete$12.L$1 = null;
                        cardSchemePresenter$complete$12.L$3 = null;
                        cardSchemePresenter$complete$12.label = 3;
                    }
                    return coroutineSingletons;
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
                BlockersData blockersData = cardSchemePresenter$complete$12.L$4;
                Flow$Type flow$Type2 = cardSchemePresenter$complete$12.L$3;
                Function1 function13 = cardSchemePresenter$complete$12.L$1;
                SafeTrace.throwOnFailure(obj);
                flow = obj;
                flow$Type = flow$Type2;
                startFlow$default = blockersData;
                function12 = function13;
                r4 = 0;
                ApiResult apiResult = (ApiResult) flow;
                if (apiResult instanceof ApiResult.Success) {
                    ApiResult.Success success = (ApiResult.Success) apiResult;
                    this.navigator.goTo(this.flowNavigationHelper.getFlowSuccessScreen(new WalletHomeScreen(7, (Integer) r4, (String) r4), success, startFlow$default, false));
                    ResponseContext responseContext = ((GetFlowResponse) success.response).response_context;
                    if (responseContext != null && (syncEntitiesResponse = responseContext.sync_entities_data) != null && (list = syncEntitiesResponse.entities) != null) {
                        List list2 = list;
                        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                SyncValue syncValue = ((SyncEntity) it.next()).sync_value;
                                if (syncValue != null && (value = syncValue.value) != null) {
                                    SyncValue.Value.CashAppCard cashAppCard = value instanceof SyncValue.Value.CashAppCard ? (SyncValue.Value.CashAppCard) value : r4;
                                    CashAppCard cashAppCard2 = cashAppCard != null ? cashAppCard.value : r4;
                                    if (cashAppCard2 != null) {
                                        z = Intrinsics.areEqual(cashAppCard2.enabled, Boolean.TRUE);
                                        if (!z) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                if (!z) {
                                }
                            }
                        }
                    }
                    if (((flow$Type == Flow$Type.ENABLE_ISSUED_CARD && !z2) || (flow$Type == Flow$Type.DISABLE_ISSUED_CARD_IN_POSTCARD && z2)) && function12 != null) {
                        function12.invoke(Boolean.FALSE);
                    }
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return r4;
                    }
                    if (function12 != null) {
                        function12.invoke(Boolean.FALSE);
                    }
                    this.toaster.makeToast(this.stringManager.get(R.string.wallet_card_tab_error), Toaster$Length.SHORT);
                }
                return Unit.INSTANCE;
            }
        }
        cardSchemePresenter$complete$1 = new CardSchemePresenter$complete$1(this, continuationImpl);
        CardSchemePresenter$complete$1 cardSchemePresenter$complete$122 = cardSchemePresenter$complete$1;
        Object obj2 = cardSchemePresenter$complete$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardSchemePresenter$complete$122.label;
        int i32 = 3;
        boolean z22 = false;
        int i42 = 1;
        String str2 = null;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
        if (i != 0) {
        }
    }

    public final boolean completeClientRoute(String str) {
        return this.router.route(new RoutingParams(new WalletHomeScreen(7, (Integer) null, (String) null), BlockersData.AnalyticsData.Source.CARD_TAB.getAnalyticsName(), null, null, null, null, 508), str);
    }

    public final Object copyCardAction(String str, Function1 function1, ContinuationImpl continuationImpl) {
        if (str == null) {
            Object complete = complete(ClientScenario.UNLOCK_ISSUED_CARD, function1, new WalletHomeScreen(6, (Integer) null, UUID.randomUUID().toString()), continuationImpl);
            return complete == CoroutineSingletons.COROUTINE_SUSPENDED ? complete : Unit.INSTANCE;
        }
        copyToClipboard(str);
        return Unit.INSTANCE;
    }

    public final void copyToClipboard(String str) {
        CashCardViewCopyValue.CopiedValue copiedValue = CashCardViewCopyValue.CopiedValue.PAN;
        this.analytics.track(new CashCardViewCopyValue(), null);
        AndroidStringManager androidStringManager = this.stringManager;
        String str2 = androidStringManager.get(R.string.wallet_cash_app_card);
        Duration.Companion companion = Duration.Companion;
        long duration = DurationKt.toDuration(30, DurationUnit.SECONDS);
        str2.getClass();
        str.getClass();
        RealClipboardManager realClipboardManager = this.clippy;
        realClipboardManager.copy(str2, str);
        Handler handler = realClipboardManager.handler;
        handler.sendMessageDelayed(Message.obtain(handler, 0, str2), Duration.m4167getInWholeMillisecondsimpl(duration));
        this.toaster.makeToast(androidStringManager.get(R.string.wallet_card_pan_copied), Toaster$Length.SHORT);
    }

    public final String getCopyId() {
        return (String) this.copyId$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        if (complete(r2, r9, null, r0) == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0097, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0095, code lost:
    
        if (copyCardAction(r8, r9, r0) == r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleAction(CardModule.CardElementAction cardElementAction, String str, TabToolbarsKt$$ExternalSyntheticLambda10 tabToolbarsKt$$ExternalSyntheticLambda10, ContinuationImpl continuationImpl) {
        CardSchemePresenter$handleAction$1 cardSchemePresenter$handleAction$1;
        int i;
        Unit unit;
        String str2;
        zzkk zzkkVar;
        CardModule.CardElementAction.OpenDialog openDialog;
        if (continuationImpl instanceof CardSchemePresenter$handleAction$1) {
            cardSchemePresenter$handleAction$1 = (CardSchemePresenter$handleAction$1) continuationImpl;
            int i2 = cardSchemePresenter$handleAction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                cardSchemePresenter$handleAction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = cardSchemePresenter$handleAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardSchemePresenter$handleAction$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    zzkk zzkkVar2 = cardElementAction.f1331type;
                    if (zzkkVar2 != null) {
                        CardModule$CardElementAction$Type$DoClientScenario cardModule$CardElementAction$Type$DoClientScenario = zzkkVar2 instanceof CardModule$CardElementAction$Type$DoClientScenario ? (CardModule$CardElementAction$Type$DoClientScenario) zzkkVar2 : null;
                        CardModule.CardElementAction.DoClientScenario doClientScenario = cardModule$CardElementAction$Type$DoClientScenario != null ? cardModule$CardElementAction$Type$DoClientScenario.value : null;
                        if (doClientScenario != null && (r2 = doClientScenario.client_scenario) != null) {
                            cardSchemePresenter$handleAction$1.L$0 = cardElementAction;
                            cardSchemePresenter$handleAction$1.label = 1;
                        }
                    }
                    if (zzkkVar2 != null) {
                        CardModule$CardElementAction$Type$DoClientRoute cardModule$CardElementAction$Type$DoClientRoute = zzkkVar2 instanceof CardModule$CardElementAction$Type$DoClientRoute ? (CardModule$CardElementAction$Type$DoClientRoute) zzkkVar2 : null;
                        CardModule.CardElementAction.DoClientRoute doClientRoute = cardModule$CardElementAction$Type$DoClientRoute != null ? cardModule$CardElementAction$Type$DoClientRoute.value : null;
                        if (doClientRoute != null && (str2 = doClientRoute.url) != null) {
                            completeClientRoute(str2);
                            return Unit.INSTANCE;
                        }
                    }
                    if (zzkkVar2 != null) {
                        CardModule$CardElementAction$Type$CopyCardNumber cardModule$CardElementAction$Type$CopyCardNumber = zzkkVar2 instanceof CardModule$CardElementAction$Type$CopyCardNumber ? (CardModule$CardElementAction$Type$CopyCardNumber) zzkkVar2 : null;
                        if ((cardModule$CardElementAction$Type$CopyCardNumber != null ? cardModule$CardElementAction$Type$CopyCardNumber.value : null) != null) {
                            cardSchemePresenter$handleAction$1.L$0 = cardElementAction;
                            cardSchemePresenter$handleAction$1.label = 2;
                        }
                    }
                    unit = null;
                } else {
                    if (i == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cardElementAction = cardSchemePresenter$handleAction$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    unit = Unit.INSTANCE;
                }
                if (unit == null && (zzkkVar = cardElementAction.f1331type) != null) {
                    CardModule$CardElementAction$Type$OpenDialog cardModule$CardElementAction$Type$OpenDialog = !(zzkkVar instanceof CardModule$CardElementAction$Type$OpenDialog) ? (CardModule$CardElementAction$Type$OpenDialog) zzkkVar : null;
                    openDialog = cardModule$CardElementAction$Type$OpenDialog != null ? cardModule$CardElementAction$Type$OpenDialog.value : null;
                    if (openDialog != null) {
                        this.navigator.goTo(new CardControlDialogScreen(openDialog));
                    }
                }
                return Unit.INSTANCE;
            }
        }
        cardSchemePresenter$handleAction$1 = new CardSchemePresenter$handleAction$1(this, continuationImpl);
        Object obj3 = cardSchemePresenter$handleAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardSchemePresenter$handleAction$1.label;
        if (i != 0) {
        }
        if (unit == null) {
            if (!(zzkkVar instanceof CardModule$CardElementAction$Type$OpenDialog)) {
            }
            if (cardModule$CardElementAction$Type$OpenDialog != null) {
            }
            if (openDialog != null) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:379:0x0a47, code lost:
    
        if (r8 == r7) goto L396;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x040a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x055d A[EDGE_INSN: B:195:0x055d->B:196:0x055d BREAK  A[LOOP:3: B:184:0x053a->B:418:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0a92  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0b5a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0c0a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0b54 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0abe  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x08db A[LOOP:7: B:390:0x08b6->B:400:0x08db, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08e5 A[EDGE_INSN: B:401:0x08e5->B:402:0x08e5 BREAK  A[LOOP:7: B:390:0x08b6->B:400:0x08db], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:418:? A[LOOP:3: B:184:0x053a->B:418:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x018b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0370  */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [com.squareup.protos.cash.postcard.CardModule$CardElementAction] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [com.squareup.protos.cash.postcard.CardModule$CardElementAction] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r2v13, types: [kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r2v14, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v78, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v83, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v36, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r55v0, types: [app.cash.broadway.presenter.molecule.MoleculePresenter, com.squareup.cash.wallet.presenters.CardSchemePresenter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [com.squareup.protos.cash.postcard.CardModule$Type$LineItem] */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30, types: [com.squareup.protos.cash.postcard.CardHomeAction$Action$LockDevices] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [com.squareup.protos.cash.postcard.LockDevices] */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [com.squareup.protos.cash.postcard.CardModule$Type$Upsell] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [com.squareup.protos.cash.postcard.CardModule$UpsellModule] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CardSchemeViewModel models(Flow flow, Composer composer, int i) {
        Throwable th;
        Object obj;
        MutableState mutableState;
        List list;
        List list2;
        ?? r27;
        Object nextUpEventMetadata;
        Throwable pair;
        Object obj2;
        Object obj3;
        Object cardSchemePresenter$models$3$1;
        CardSchemePresenter cardSchemePresenter;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        int i2;
        ArrayList arrayList;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        List list3;
        MutableState mutableState5;
        CardModule.HeroNullStateModule heroNullStateModule;
        ?? r4;
        Object obj4;
        CardSchemePresenter cardSchemePresenter2;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2;
        int i3;
        Continuation continuation;
        Object obj5;
        CardSchemePresenter cardSchemePresenter3;
        GapComposer gapComposer;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3;
        Object obj6;
        List list4;
        MutableState mutableState6;
        AndroidStringManager androidStringManager;
        RealDisclosureProvider realDisclosureProvider;
        ?? r0;
        List list5;
        Object obj7;
        AndroidStringManager androidStringManager2;
        NeverEqualPolicy neverEqualPolicy;
        Object obj8;
        List list6;
        ArrayList arrayList2;
        Object rememberedValue;
        CardHomeAction$Action$CopyCardNumber cardHomeAction$Action$CopyCardNumber;
        Object obj9;
        Disclosure disclosure;
        Object disclosure2;
        Object obj10;
        Object obj11;
        CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content.ParentAsKidContent parentAsKidContent;
        CardModule.Button button;
        boolean z;
        CardSchemeViewModel.Module.Accessory.Button button2;
        CardSchemePresenter cardSchemePresenter4;
        CardSchemeViewModel cardNullStateBooklet;
        boolean z2;
        CardSchemePresenter cardSchemePresenter5;
        Iterator it;
        String str;
        FeatureFlagManager featureFlagManager;
        PresentationTimelineViewModel presentationTimelineViewModel;
        CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel deliveryStatusRowModel;
        PresentationTimelineViewModel.Icon icon;
        PresentationTimelineViewModel presentationTimelineViewModel2;
        PresentationTimelineViewModel.Step.State state;
        FeatureFlagManager featureFlagManager2;
        PresentationTimelineViewModel.Step step;
        PresentationTimelineViewModel.Icon icon2;
        LocalizedString localizedString;
        AndroidSyncValueSpecs$Access$1 androidSyncValueSpecs$Access$1 = AndroidSyncValueSpecs.CashAppTag;
        RealCashAppTagManager realCashAppTagManager = this.cashAppTagManager;
        SyncValueReader syncValueReader = realCashAppTagManager.syncValueReader;
        flow.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startReplaceGroup(-1063295529);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer2.changedInstance(this);
        Object rememberedValue2 = gapComposer2.rememberedValue();
        int i4 = 29;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        Continuation continuation2 = null;
        Object obj12 = rememberedValue2;
        if (changedInstance || rememberedValue2 == neverEqualPolicy2) {
            ChatInputView$Content$1$1$1 chatInputView$Content$1$1$1 = new ChatInputView$Content$1$1$1(this, continuation2, i4);
            gapComposer2.updateRememberedValue(chatInputView$Content$1$1$1);
            obj12 = chatInputView$Content$1$1$1;
        }
        Updater.LaunchedEffect(gapComposer2, unit, (Function2) obj12);
        Object rememberedValue3 = gapComposer2.rememberedValue();
        Object obj13 = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(mutableStateOf$default);
            obj13 = mutableStateOf$default;
        }
        MutableState mutableState7 = (MutableState) obj13;
        Object rememberedValue4 = gapComposer2.rememberedValue();
        Object obj14 = rememberedValue4;
        if (rememberedValue4 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(mutableStateOf$default2);
            obj14 = mutableStateOf$default2;
        }
        MutableState mutableState8 = (MutableState) obj14;
        Object rememberedValue5 = gapComposer2.rememberedValue();
        Object obj15 = rememberedValue5;
        if (rememberedValue5 == neverEqualPolicy2) {
            ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer2.updateRememberedValue(mutableStateOf$default3);
            obj15 = mutableStateOf$default3;
        }
        MutableState mutableState9 = (MutableState) obj15;
        Object rememberedValue6 = gapComposer2.rememberedValue();
        Object obj16 = rememberedValue6;
        if (rememberedValue6 == neverEqualPolicy2) {
            obj16 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = (ParcelableSnapshotMutableIntState) obj16;
        MutableState collectAsState = Updater.collectAsState(this.nextUpCandidateDismisser.dismissedItemIds, null, gapComposer2, 1);
        Object rememberedValue7 = gapComposer2.rememberedValue();
        int i5 = 13;
        SyncValueReader syncValueReader2 = this.syncValueReader;
        if (rememberedValue7 == neverEqualPolicy2) {
            th = null;
            StateFlow singleValueOrDefault = syncValueReader2.getSingleValueOrDefault(AndroidSyncValueSpecs.CardTabScheme, new CardScheme(EmptyList.INSTANCE), new Matcher$$ExternalSyntheticLambda9(i5));
            gapComposer2.updateRememberedValue(singleValueOrDefault);
            obj = singleValueOrDefault;
        } else {
            th = null;
            obj = rememberedValue7;
        }
        MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) obj, gapComposer2);
        List list7 = ((CardScheme) receiveValueAsState.getValue()).modules;
        boolean changed = gapComposer2.changed(list7);
        Object rememberedValue8 = gapComposer2.rememberedValue();
        if (changed || rememberedValue8 == neverEqualPolicy2) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = list7.iterator();
            while (it2.hasNext()) {
                CardModule.Type type2 = ((CardModule) it2.next()).f1328type;
                if (type2 != null) {
                    ?? r9 = type2 instanceof CardModule.Type.Upsell ? (CardModule.Type.Upsell) type2 : th;
                    ?? r92 = r9 != 0 ? r9.value : th;
                    if (r92 != 0) {
                        obj2 = r92.elements;
                        if (obj2 != null) {
                            obj2 = EmptyList.INSTANCE;
                        }
                        CollectionsKt__MutableCollectionsKt.addAll((Iterable) obj2, arrayList3);
                    }
                }
                obj2 = th;
                if (obj2 != null) {
                }
                CollectionsKt__MutableCollectionsKt.addAll((Iterable) obj2, arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            int i6 = 0;
            while (it3.hasNext()) {
                Object next = it3.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw th;
                }
                CardModule.UpsellElement upsellElement = (CardModule.UpsellElement) next;
                MutableState mutableState10 = receiveValueAsState;
                String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i6, "next-up-action:");
                String str2 = upsellElement.id;
                ?? r23 = (str2 == null || StringsKt.isBlank(str2)) ? th : str2;
                CardModule.Button button3 = upsellElement.button;
                if (r23 == 0) {
                    list2 = list7;
                } else {
                    list2 = list7;
                    LocalizedString localizedString2 = upsellElement.title;
                    if (localizedString2 != null) {
                        String translated = com.squareup.util.cash.StringsKt.translated(localizedString2);
                        ?? r26 = button3 != null ? button3.card_element_action : th;
                        Boolean bool = upsellElement.is_disabled;
                        Boolean bool2 = Boolean.TRUE;
                        if (!Intrinsics.areEqual(bool, bool2)) {
                            if (!(button3 != null ? Intrinsics.areEqual(button3.is_disabled, bool2) : false)) {
                                r27 = r26;
                                nextUpEventMetadata = new NextUpEventMetadata(r23, i6, translated, r26, r27);
                                pair = nextUpEventMetadata != null ? new Pair(m, nextUpEventMetadata) : th;
                                if (pair != null) {
                                    arrayList4.add(pair);
                                }
                                i6 = i7;
                                receiveValueAsState = mutableState10;
                                list7 = list2;
                            }
                        }
                        r27 = th;
                        nextUpEventMetadata = new NextUpEventMetadata(r23, i6, translated, r26, r27);
                        if (nextUpEventMetadata != null) {
                        }
                        if (pair != null) {
                        }
                        i6 = i7;
                        receiveValueAsState = mutableState10;
                        list7 = list2;
                    }
                }
                nextUpEventMetadata = th;
                if (nextUpEventMetadata != null) {
                }
                if (pair != null) {
                }
                i6 = i7;
                receiveValueAsState = mutableState10;
                list7 = list2;
            }
            mutableState = receiveValueAsState;
            list = list7;
            Map map = MapsKt__MapsKt.toMap(arrayList4);
            gapComposer2.updateRememberedValue(map);
            obj3 = map;
        } else {
            mutableState = receiveValueAsState;
            list = list7;
            obj3 = rememberedValue8;
        }
        MutableState rememberUpdatedState = Updater.rememberUpdatedState((Map) obj3, gapComposer2);
        List list8 = ((CardScheme) mutableState.getValue()).overflow_modules;
        CardHomeActions cardHomeActions = ((CardScheme) mutableState.getValue()).card_home_actions;
        Object obj17 = cardHomeActions != null ? cardHomeActions.actions : th;
        if (obj17 == null) {
            obj17 = EmptyList.INSTANCE;
        }
        Object obj18 = obj17;
        ?? r2 = th;
        List list9 = list;
        Updater.LaunchedEffect(gapComposer2, flow, new TaxWebAppPresenter$models$1$1(flow, (Continuation) r2, (MoleculePresenter) this, rememberUpdatedState, 29));
        Object rememberedValue9 = gapComposer2.rememberedValue();
        Object obj19 = rememberedValue9;
        if (rememberedValue9 == neverEqualPolicy2) {
            StateFlow singleValue = syncValueReader2.getSingleValue(AndroidSyncValueSpecs.CashAppCard);
            gapComposer2.updateRememberedValue(singleValue);
            obj19 = singleValue;
        }
        MutableState receiveValueAsState2 = Strings.receiveValueAsState((StateFlow) obj19, gapComposer2);
        ?? rememberedValue10 = gapComposer2.rememberedValue();
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = rememberedValue10;
        if (rememberedValue10 == neverEqualPolicy2) {
            FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 allCashAppTags = realCashAppTagManager.getAllCashAppTags();
            gapComposer2.updateRememberedValue(allCashAppTags);
            flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = allCashAppTags;
        }
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$12 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
        EmptyList emptyList = EmptyList.INSTANCE;
        CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel deliveryStatusRowModel2 = r2;
        MutableState collectAsState2 = Updater.collectAsState(flowKt__ZipKt$combine$$inlined$unsafeFlow$12, emptyList, null, gapComposer2, 48, 2);
        Object rememberedValue11 = gapComposer2.rememberedValue();
        int i8 = 4;
        if (rememberedValue11 == neverEqualPolicy2) {
            SquareAccountStore$userFlow$$inlined$map$1 squareAccountStore$userFlow$$inlined$map$1 = new SquareAccountStore$userFlow$$inlined$map$1(syncValueReader.getAllValues(androidSyncValueSpecs$Access$1), i8);
            gapComposer2.updateRememberedValue(squareAccountStore$userFlow$$inlined$map$1);
            rememberedValue11 = squareAccountStore$userFlow$$inlined$map$1;
        }
        Boolean bool3 = Boolean.FALSE;
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue11, bool3, null, gapComposer2, 48, 2);
        Object rememberedValue12 = gapComposer2.rememberedValue();
        int i9 = 3;
        if (rememberedValue12 == neverEqualPolicy2) {
            SquareAccountStore$userFlow$$inlined$map$1 squareAccountStore$userFlow$$inlined$map$12 = new SquareAccountStore$userFlow$$inlined$map$1(syncValueReader.getAllValues(androidSyncValueSpecs$Access$1), i9);
            gapComposer2.updateRememberedValue(squareAccountStore$userFlow$$inlined$map$12);
            rememberedValue12 = squareAccountStore$userFlow$$inlined$map$12;
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue12, bool3, null, gapComposer2, 48, 2);
        Object rememberedValue13 = gapComposer2.rememberedValue();
        FeatureFlagManager featureFlagManager3 = this.featureFlagManager;
        if (rememberedValue13 == neverEqualPolicy2) {
            rememberedValue13 = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager3).currentValue(AmplitudeExperiments$MobilePrepurchaseCashCardPilot.INSTANCE)).enabled() ? this.prepurchaseToggleManager.prepurchaseToggleEntryPointData : new AppLockMonitor$special$$inlined$map$2(deliveryStatusRowModel2, 19);
            gapComposer2.updateRememberedValue(rememberedValue13);
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue13, null, null, gapComposer2, 48, 2);
        Object rememberedValue14 = gapComposer2.rememberedValue();
        Object obj20 = rememberedValue14;
        if (rememberedValue14 == neverEqualPolicy2) {
            StateFlow allValues = syncValueReader2.getAllValues(AndroidSyncValueSpecs.PaymentDevicePresentation);
            gapComposer2.updateRememberedValue(allValues);
            obj20 = allValues;
        }
        List list10 = (List) Updater.collectAsState((StateFlow) obj20, emptyList, null, gapComposer2, 48, 2).getValue();
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = list10.iterator();
        while (it4.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((PaymentDevicePresentation) it4.next()).entries, arrayList5);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            PresentationEntry presentationEntry = (PresentationEntry) it5.next();
            presentationEntry.getClass();
            StatusDisplay statusDisplay = presentationEntry.status_display;
            if (statusDisplay == null) {
                it = it5;
                featureFlagManager = featureFlagManager3;
                deliveryStatusRowModel = deliveryStatusRowModel2;
            } else {
                Action action = statusDisplay.primary_action;
                LocalizedString localizedString3 = statusDisplay.title;
                localizedString3.getClass();
                String str3 = localizedString3.translated_value;
                str3.getClass();
                LocalizedString localizedString4 = statusDisplay.subtitle;
                localizedString4.getClass();
                String str4 = localizedString4.translated_value;
                str4.getClass();
                String str5 = (action == null || (localizedString = action.label) == null) ? null : localizedString.translated_value;
                PresentationAction presentationAction = action != null ? DirectoryKt.toPresentationAction(action) : null;
                Timeline timeline = presentationEntry.timeline;
                if (timeline != null) {
                    String str6 = presentationEntry.theme_token;
                    String str7 = presentationEntry.device_id;
                    it = it5;
                    Timeline.TimelineIcon timelineIcon = timeline.icon;
                    int i10 = timelineIcon == null ? -1 : PaymentDevicePresentationMapperKt$WhenMappings.$EnumSwitchMapping$1[timelineIcon.ordinal()];
                    if (i10 != -1) {
                        if (i10 == 1) {
                            icon2 = PresentationTimelineViewModel.Icon.CHECKMARK;
                        } else if (i10 == 2) {
                            icon2 = PresentationTimelineViewModel.Icon.PACKAGE;
                        } else if (i10 == 3) {
                            icon2 = PresentationTimelineViewModel.Icon.TRUCK;
                        } else if (i10 == 4) {
                            icon2 = PresentationTimelineViewModel.Icon.CHECKMARK_SUCCESS;
                        } else if (i10 != 5) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        icon = icon2;
                        if (icon != null) {
                            str = str4;
                            featureFlagManager = featureFlagManager3;
                            presentationTimelineViewModel2 = null;
                        } else {
                            LocalizedString localizedString5 = timeline.title;
                            localizedString5.getClass();
                            String str8 = localizedString5.translated_value;
                            str8.getClass();
                            LocalizedString localizedString6 = timeline.subtitle;
                            String str9 = localizedString6 != null ? localizedString6.translated_value : null;
                            List list11 = timeline.steps;
                            ArrayList arrayList7 = new ArrayList();
                            Iterator it6 = list11.iterator();
                            while (it6.hasNext()) {
                                Iterator it7 = it6;
                                Timeline.Step step2 = (Timeline.Step) it6.next();
                                step2.getClass();
                                String str10 = str4;
                                Timeline.Step.StepStyle stepStyle = step2.style;
                                int i11 = stepStyle == null ? -1 : PaymentDevicePresentationMapperKt$WhenMappings.$EnumSwitchMapping$2[stepStyle.ordinal()];
                                String str11 = str6;
                                if (i11 != -1) {
                                    if (i11 == 1) {
                                        state = PresentationTimelineViewModel.Step.State.COMPLETED;
                                    } else if (i11 == 2) {
                                        state = PresentationTimelineViewModel.Step.State.IN_PROGRESS;
                                    } else if (i11 == 3) {
                                        state = PresentationTimelineViewModel.Step.State.UPCOMING;
                                    } else if (i11 != 4) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    if (state != null) {
                                        featureFlagManager2 = featureFlagManager3;
                                        step = null;
                                    } else {
                                        featureFlagManager2 = featureFlagManager3;
                                        LocalizedString localizedString7 = step2.title;
                                        String str12 = localizedString7 != null ? localizedString7.translated_value : null;
                                        if (str12 == null) {
                                            str12 = "";
                                        }
                                        LocalizedString localizedString8 = step2.date;
                                        step = new PresentationTimelineViewModel.Step(str12, localizedString8 != null ? localizedString8.translated_value : null, state);
                                    }
                                    if (step == null) {
                                        arrayList7.add(step);
                                    }
                                    it6 = it7;
                                    str6 = str11;
                                    str4 = str10;
                                    featureFlagManager3 = featureFlagManager2;
                                }
                                state = null;
                                if (state != null) {
                                }
                                if (step == null) {
                                }
                                it6 = it7;
                                str6 = str11;
                                str4 = str10;
                                featureFlagManager3 = featureFlagManager2;
                            }
                            str = str4;
                            String str13 = str6;
                            featureFlagManager = featureFlagManager3;
                            Action action2 = timeline.action;
                            presentationTimelineViewModel2 = new PresentationTimelineViewModel(icon, str8, str9, arrayList7, action2 != null ? DirectoryKt.toPresentationAction(action2) : null, str13, str7);
                        }
                        presentationTimelineViewModel = presentationTimelineViewModel2;
                    }
                    icon = null;
                    if (icon != null) {
                    }
                    presentationTimelineViewModel = presentationTimelineViewModel2;
                } else {
                    it = it5;
                    str = str4;
                    featureFlagManager = featureFlagManager3;
                    presentationTimelineViewModel = null;
                }
                deliveryStatusRowModel = new CardSchemeViewModel.Module.HeroPaymentDevices.DeliveryStatusRowModel(str3, str, str5, presentationAction, presentationTimelineViewModel, presentationEntry.theme_token, presentationEntry.device_id);
            }
            if (deliveryStatusRowModel != null) {
                arrayList6.add(deliveryStatusRowModel);
            }
            it5 = it;
            featureFlagManager3 = featureFlagManager;
            deliveryStatusRowModel2 = null;
        }
        FeatureFlagManager featureFlagManager4 = featureFlagManager3;
        Integer valueOf = Integer.valueOf(parcelableSnapshotMutableIntState4.getIntValue());
        boolean changedInstance2 = gapComposer2.changedInstance(this) | gapComposer2.changedInstance(list9) | gapComposer2.changed(receiveValueAsState2);
        Object rememberedValue15 = gapComposer2.rememberedValue();
        if (changedInstance2 || rememberedValue15 == neverEqualPolicy2) {
            cardSchemePresenter = this;
            mutableState2 = mutableState8;
            mutableState3 = mutableState9;
            mutableState4 = mutableState7;
            i2 = -1;
            arrayList = arrayList6;
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState4;
            cardSchemePresenter$models$3$1 = new CardSchemePresenter$models$3$1(cardSchemePresenter, list9, mutableState4, receiveValueAsState2, mutableState3, parcelableSnapshotMutableIntState, mutableState2, (Continuation) null);
            list3 = list9;
            mutableState5 = receiveValueAsState2;
            gapComposer2.updateRememberedValue(cardSchemePresenter$models$3$1);
        } else {
            list3 = list9;
            cardSchemePresenter = this;
            mutableState5 = receiveValueAsState2;
            mutableState2 = mutableState8;
            mutableState3 = mutableState9;
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState4;
            i2 = -1;
            arrayList = arrayList6;
            cardSchemePresenter$models$3$1 = rememberedValue15;
            mutableState4 = mutableState7;
        }
        Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) cardSchemePresenter$models$3$1);
        boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
        AndroidStringManager androidStringManager3 = cardSchemePresenter.stringManager;
        if (booleanValue && ((Boolean) mutableState3.getValue()).booleanValue()) {
            gapComposer2.startReplaceGroup(-1247831261);
            String str14 = androidStringManager3.get(R.string.wallet_retry_card_tab_title);
            String str15 = androidStringManager3.get(R.string.wallet_retry_card_tab_body);
            String str16 = androidStringManager3.get(R.string.wallet_retry_card_tab_retry);
            boolean booleanValue2 = ((Boolean) mutableState4.getValue()).booleanValue();
            Object rememberedValue16 = gapComposer2.rememberedValue();
            Object obj21 = rememberedValue16;
            if (rememberedValue16 == neverEqualPolicy2) {
                WalletHomeViewKt$$ExternalSyntheticLambda21 walletHomeViewKt$$ExternalSyntheticLambda21 = new WalletHomeViewKt$$ExternalSyntheticLambda21(9, parcelableSnapshotMutableIntState);
                gapComposer2.updateRememberedValue(walletHomeViewKt$$ExternalSyntheticLambda21);
                obj21 = walletHomeViewKt$$ExternalSyntheticLambda21;
            }
            CardSchemeViewModel.RetryableError retryableError = new CardSchemeViewModel.RetryableError(str14, str15, str16, booleanValue2, (Function0) obj21);
            gapComposer2.end(false);
            gapComposer2.end(false);
            return retryableError;
        }
        gapComposer2.startReplaceGroup(-1247516053);
        gapComposer2.end(false);
        boolean z3 = containsHeroCard(list3) && ((CashAppCard) mutableState5.getValue()) == null;
        if (list3.isEmpty() || z3) {
            gapComposer2.end(false);
            return CardSchemeViewModel.Loading.INSTANCE;
        }
        Iterator it8 = list3.iterator();
        while (true) {
            if (!it8.hasNext()) {
                heroNullStateModule = null;
                break;
            }
            CardModule.Type type3 = ((CardModule) it8.next()).f1328type;
            if (type3 != null) {
                CardModule.Type.HeroNullState heroNullState = type3 instanceof CardModule.Type.HeroNullState ? (CardModule.Type.HeroNullState) type3 : null;
                if (heroNullState != null) {
                    heroNullStateModule = heroNullState.value;
                    if (heroNullStateModule == null) {
                        break;
                    }
                }
            }
            heroNullStateModule = null;
            if (heroNullStateModule == null) {
            }
        }
        RealDisclosureProvider realDisclosureProvider2 = cardSchemePresenter.disclosureProvider;
        int i12 = 6;
        if (heroNullStateModule != null) {
            gapComposer2.startReplaceGroup(-1247220530);
            int i13 = (i << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION;
            gapComposer2.startReplaceGroup(1890895211);
            CardModule$HeroNullStateModule$Nux$UhchNux cardModule$HeroNullStateModule$Nux$UhchNux = heroNullStateModule.nux;
            CardModule.HeroNullStateModule.UnifiedCardHomeNUX unifiedCardHomeNUX = cardModule$HeroNullStateModule$Nux$UhchNux != null ? cardModule$HeroNullStateModule$Nux$UhchNux.value : null;
            if (unifiedCardHomeNUX == null) {
                gapComposer2.startReplaceGroup(-1131487766);
                gapComposer2.end(false);
                cardSchemePresenter5 = cardSchemePresenter;
            } else {
                CardModule.HeroNullStateModule.UnifiedCardHomeNUX.Content content = unifiedCardHomeNUX.content;
                gapComposer2.startReplaceGroup(-1131487765);
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer2.changedInstance(cardSchemePresenter);
                Object rememberedValue17 = gapComposer2.rememberedValue();
                Object obj22 = rememberedValue17;
                if (changedInstance3 || rememberedValue17 == neverEqualPolicy2) {
                    AlertBannerKt$$ExternalSyntheticLambda3 alertBannerKt$$ExternalSyntheticLambda3 = new AlertBannerKt$$ExternalSyntheticLambda3(cardSchemePresenter, 13);
                    gapComposer2.updateRememberedValue(alertBannerKt$$ExternalSyntheticLambda3);
                    obj22 = alertBannerKt$$ExternalSyntheticLambda3;
                }
                Updater.DisposableEffect(unit2, (Function1) obj22, gapComposer2);
                Updater.LaunchedEffect(gapComposer2, flow, new CardSchemePresenter$toHeroModule$$inlined$CollectEffect$1(flow, null, cardSchemePresenter, 1));
                Flow disclosure3 = realDisclosureProvider2.disclosure(DisclosureForScreen.BENEFITS_BOOKLET, null);
                if (((FamilyProfile) Updater.collectAsState(cardSchemePresenter.familyProfileManager.familyProfile, null, gapComposer2, 1).getValue()) instanceof FamilyProfile.ManagedAccount) {
                    if ((content != null ? content.parent_as_kid_content : null) != null) {
                        content.getClass();
                        parentAsKidContent = content.parent_as_kid_content;
                        if (parentAsKidContent != null || (button = parentAsKidContent.primary_button) == null) {
                            button = content == null ? content.primary_button : null;
                        }
                        if (button != null) {
                            gapComposer2.startReplaceGroup(-2015808901);
                            gapComposer2.end(false);
                            z = false;
                            cardSchemePresenter4 = cardSchemePresenter;
                            button2 = null;
                        } else {
                            gapComposer2.startReplaceGroup(-2015808900);
                            boolean changedInstance4 = gapComposer2.changedInstance(cardSchemePresenter) | gapComposer2.changedInstance(button);
                            Object rememberedValue18 = gapComposer2.rememberedValue();
                            Object obj23 = rememberedValue18;
                            if (changedInstance4 || rememberedValue18 == neverEqualPolicy2) {
                                ListsKt$$ExternalSyntheticLambda0 listsKt$$ExternalSyntheticLambda0 = new ListsKt$$ExternalSyntheticLambda0(1, cardSchemePresenter, button);
                                gapComposer2.updateRememberedValue(listsKt$$ExternalSyntheticLambda0);
                                obj23 = listsKt$$ExternalSyntheticLambda0;
                            }
                            int i14 = (i13 << 6) & 57344;
                            CardSchemePresenter cardSchemePresenter6 = cardSchemePresenter;
                            CardSchemeViewModel.Module.Accessory.Button accessory = cardSchemePresenter6.toAccessory(button, null, (Function0) obj23, gapComposer2, i14, 3);
                            z = false;
                            gapComposer2.end(false);
                            button2 = accessory;
                            cardSchemePresenter4 = cardSchemePresenter6;
                        }
                        if (button2 == null) {
                            boolean changedInstance5 = gapComposer2.changedInstance(cardSchemePresenter4) | gapComposer2.changedInstance(unifiedCardHomeNUX) | gapComposer2.changedInstance(disclosure3) | gapComposer2.changedInstance(parentAsKidContent) | gapComposer2.changedInstance(button2);
                            Object rememberedValue19 = gapComposer2.rememberedValue();
                            if (changedInstance5 || rememberedValue19 == neverEqualPolicy2) {
                                NotificationActionService$onHandleIntent$1 notificationActionService$onHandleIntent$1 = new NotificationActionService$onHandleIntent$1((Object) this, disclosure3, unifiedCardHomeNUX, parentAsKidContent, button2, (Continuation) null, 18);
                                gapComposer2.updateRememberedValue(notificationActionService$onHandleIntent$1);
                                rememberedValue19 = notificationActionService$onHandleIntent$1;
                            }
                            cardNullStateBooklet = new CardSchemeViewModel.CardNullStateBooklet((CardSchemeViewModel.CardNullStateBooklet.Content) Updater.produceState(gapComposer2, null, (Function2) rememberedValue19).getValue());
                            z2 = false;
                            gapComposer2.end(false);
                            gapComposer2.end(z2);
                            gapComposer2.end(z2);
                            gapComposer2.end(z2);
                            return cardNullStateBooklet;
                        }
                        cardSchemePresenter4.errorReporter.report(new CardTabError(new NullPointerException("Card NUX booklet primary button is missing")), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                        gapComposer2.end(z);
                        cardSchemePresenter5 = cardSchemePresenter4;
                    }
                }
                parentAsKidContent = null;
                if (parentAsKidContent != null) {
                }
                if (content == null) {
                }
                if (button != null) {
                }
                if (button2 == null) {
                }
            }
            Object rememberedValue20 = gapComposer2.rememberedValue();
            if (rememberedValue20 == neverEqualPolicy2) {
                Instrument$Adapter instrument$Adapter = cardSchemePresenter5.nullStateCarouselPresenterFactory.delegateFactory;
                Analytics analytics = (Analytics) ((DoubleCheck) instrument$Adapter.cash_instrument_typeAdapter).getValue();
                RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) ((Provider) instrument$Adapter.card_brandAdapter).invoke();
                Flow flow2 = (Flow) ((RealLocaleAssetProvider$MetroFactory) instrument$Adapter.balance_currencyAdapter).invoke();
                analytics.getClass();
                realRouter$Factory$Impl.getClass();
                NullStateCarouselPresenter nullStateCarouselPresenter = new NullStateCarouselPresenter(analytics, realRouter$Factory$Impl, flow2, cardSchemePresenter5.navigator);
                gapComposer2.updateRememberedValue(nullStateCarouselPresenter);
                rememberedValue20 = nullStateCarouselPresenter;
            }
            NullStateCarouselPresenter nullStateCarouselPresenter2 = (NullStateCarouselPresenter) rememberedValue20;
            Object rememberedValue21 = gapComposer2.rememberedValue();
            if (rememberedValue21 == neverEqualPolicy2) {
                NullStateSwipeConfigProvider nullStateSwipeConfigProvider = new NullStateSwipeConfigProvider(new SquareAccountStore$userFlow$$inlined$map$1(flow, i12), 27);
                gapComposer2.updateRememberedValue(nullStateSwipeConfigProvider);
                rememberedValue21 = nullStateSwipeConfigProvider;
            }
            cardNullStateBooklet = new CardSchemeViewModel.HeroNullState(nullStateCarouselPresenter2.models((Flow) rememberedValue21, (Composer) gapComposer2, 64));
            z2 = false;
            gapComposer2.end(z2);
            gapComposer2.end(z2);
            gapComposer2.end(z2);
            return cardNullStateBooklet;
        }
        int i15 = 0;
        gapComposer2.startReplaceGroup(-1247161909);
        gapComposer2.end(false);
        Object[] objArr = new Object[0];
        boolean changedInstance6 = gapComposer2.changedInstance(cardSchemePresenter);
        Object rememberedValue22 = gapComposer2.rememberedValue();
        Object obj24 = rememberedValue22;
        if (changedInstance6 || rememberedValue22 == neverEqualPolicy2) {
            CardSchemePresenter$$ExternalSyntheticLambda1 cardSchemePresenter$$ExternalSyntheticLambda1 = new CardSchemePresenter$$ExternalSyntheticLambda1(cardSchemePresenter, i15);
            gapComposer2.updateRememberedValue(cardSchemePresenter$$ExternalSyntheticLambda1);
            obj24 = cardSchemePresenter$$ExternalSyntheticLambda1;
        }
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState5 = (ParcelableSnapshotMutableIntState) SaverKt.rememberSaveable(objArr, (Function0) obj24, gapComposer2, 0);
        Unit unit3 = Unit.INSTANCE;
        boolean changed2 = gapComposer2.changed(parcelableSnapshotMutableIntState5) | gapComposer2.changedInstance(cardSchemePresenter);
        Object rememberedValue23 = gapComposer2.rememberedValue();
        if (changed2 || rememberedValue23 == neverEqualPolicy2) {
            r4 = 0;
            TaxWebAppBridge.AnonymousClass3 anonymousClass3 = new TaxWebAppBridge.AnonymousClass3((Object) parcelableSnapshotMutableIntState5, (Object) cardSchemePresenter, (Continuation) (false ? 1 : 0), 29);
            gapComposer2.updateRememberedValue(anonymousClass3);
            obj4 = anonymousClass3;
        } else {
            r4 = 0;
            obj4 = rememberedValue23;
        }
        Updater.LaunchedEffect(gapComposer2, unit3, (Function2) obj4);
        MutableState collectAsState6 = Updater.collectAsState(cardSchemePresenter.newTagPeekBus.pendingPeek, r4, gapComposer2, 1);
        boolean changedInstance7 = gapComposer2.changedInstance(cardSchemePresenter);
        Object rememberedValue24 = gapComposer2.rememberedValue();
        Object obj25 = rememberedValue24;
        if (changedInstance7 || rememberedValue24 == neverEqualPolicy2) {
            CardSchemePresenter$models$6$1 cardSchemePresenter$models$6$1 = new CardSchemePresenter$models$6$1(cardSchemePresenter, r4, 0);
            gapComposer2.updateRememberedValue(cardSchemePresenter$models$6$1);
            obj25 = cardSchemePresenter$models$6$1;
        }
        Updater.LaunchedEffect(gapComposer2, unit3, (Function2) obj25);
        Boolean bool4 = (Boolean) collectAsState6.getValue();
        bool4.getClass();
        boolean changed3 = gapComposer2.changed(collectAsState6) | gapComposer2.changed(parcelableSnapshotMutableIntState5);
        Object rememberedValue25 = gapComposer2.rememberedValue();
        Object obj26 = rememberedValue25;
        if (changed3 || rememberedValue25 == neverEqualPolicy2) {
            CardSchemePresenter$models$7$1 cardSchemePresenter$models$7$1 = new CardSchemePresenter$models$7$1(0, collectAsState6, parcelableSnapshotMutableIntState5, null);
            gapComposer2.updateRememberedValue(cardSchemePresenter$models$7$1);
            obj26 = cardSchemePresenter$models$7$1;
        }
        Updater.LaunchedEffect(gapComposer2, bool4, (Function2) obj26);
        boolean changedInstance8 = gapComposer2.changedInstance(flow) | gapComposer2.changedInstance(cardSchemePresenter);
        Object rememberedValue26 = gapComposer2.rememberedValue();
        Object obj27 = rememberedValue26;
        if (changedInstance8 || rememberedValue26 == neverEqualPolicy2) {
            TimerWorker$run$1 timerWorker$run$1 = new TimerWorker$run$1(flow, cardSchemePresenter, null, 1);
            gapComposer2.updateRememberedValue(timerWorker$run$1);
            obj27 = timerWorker$run$1;
        }
        Updater.LaunchedEffect(gapComposer2, unit3, (Function2) obj27);
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState((List) collectAsState2.getValue(), gapComposer2);
        boolean changedInstance9 = gapComposer2.changedInstance(flow) | gapComposer2.changed(parcelableSnapshotMutableIntState5) | gapComposer2.changed(rememberUpdatedState2) | gapComposer2.changedInstance(cardSchemePresenter);
        Object rememberedValue27 = gapComposer2.rememberedValue();
        if (changedInstance9 || rememberedValue27 == neverEqualPolicy2) {
            CardSchemePresenter cardSchemePresenter7 = cardSchemePresenter;
            TakeUntil$collectSafely$2 takeUntil$collectSafely$2 = new TakeUntil$collectSafely$2(flow, cardSchemePresenter7, parcelableSnapshotMutableIntState5, rememberUpdatedState2, null, 1);
            cardSchemePresenter2 = cardSchemePresenter7;
            parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState5;
            gapComposer2.updateRememberedValue(takeUntil$collectSafely$2);
            rememberedValue27 = takeUntil$collectSafely$2;
        } else {
            cardSchemePresenter2 = cardSchemePresenter;
            parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState5;
        }
        Updater.LaunchedEffect(gapComposer2, unit3, (Function2) rememberedValue27);
        MutableState collectAsState7 = Updater.collectAsState(cardSchemePresenter2.deviceLockAnimationBus.loadingDeviceIds, EmptySet.INSTANCE, null, gapComposer2, 48, 2);
        boolean changedInstance10 = gapComposer2.changedInstance(cardSchemePresenter2);
        Object rememberedValue28 = gapComposer2.rememberedValue();
        if (changedInstance10 || rememberedValue28 == neverEqualPolicy2) {
            i3 = 1;
            continuation = null;
            CardSchemePresenter$models$6$1 cardSchemePresenter$models$6$12 = new CardSchemePresenter$models$6$1(cardSchemePresenter2, continuation, i3);
            gapComposer2.updateRememberedValue(cardSchemePresenter$models$6$12);
            obj5 = cardSchemePresenter$models$6$12;
        } else {
            i3 = 1;
            continuation = null;
            obj5 = rememberedValue28;
        }
        Updater.LaunchedEffect(gapComposer2, unit3, (Function2) obj5);
        MutableState rememberUpdatedState3 = Updater.rememberUpdatedState((List) collectAsState2.getValue(), gapComposer2);
        boolean changedInstance11 = gapComposer2.changedInstance(cardSchemePresenter2) | gapComposer2.changed(rememberUpdatedState3) | gapComposer2.changed(parcelableSnapshotMutableIntState2);
        Object rememberedValue29 = gapComposer2.rememberedValue();
        if (changedInstance11 || rememberedValue29 == neverEqualPolicy2) {
            cardSchemePresenter3 = cardSchemePresenter2;
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState6 = parcelableSnapshotMutableIntState2;
            gapComposer = gapComposer2;
            rememberedValue29 = new CardAppletWorker$setup$1$2$1(cardSchemePresenter3, rememberUpdatedState3, parcelableSnapshotMutableIntState6, continuation, 4);
            parcelableSnapshotMutableIntState3 = parcelableSnapshotMutableIntState6;
            obj6 = continuation;
            gapComposer.updateRememberedValue(rememberedValue29);
        } else {
            cardSchemePresenter3 = cardSchemePresenter2;
            parcelableSnapshotMutableIntState3 = parcelableSnapshotMutableIntState2;
            gapComposer = gapComposer2;
            obj6 = continuation;
        }
        Updater.LaunchedEffect(gapComposer, unit3, (Function2) rememberedValue29);
        UiCallbackModel models = cardSchemePresenter3.kybRestrictionBannerPresenter.models(gapComposer);
        Object kybRestrictionModel = new CardSchemeViewModel.Module.KybRestrictionModel(models);
        if (models.model == null) {
            kybRestrictionModel = obj6;
        }
        List listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(kybRestrictionModel);
        int i16 = i & 112;
        gapComposer.startReplaceGroup(-247694773);
        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager4).peekCurrentValue(LaunchDarklyFeatureFlags$TagProvisioningTemp.INSTANCE)).enabled()) {
            Iterator it9 = list3.iterator();
            int i17 = 0;
            while (true) {
                if (!it9.hasNext()) {
                    i17 = i2;
                    break;
                }
                CardModule.Type type4 = ((CardModule) it9.next()).f1328type;
                int i18 = i12;
                if (type4 != null) {
                    ?? r6 = type4 instanceof CardModule.Type.LineItem ? (CardModule.Type.LineItem) type4 : obj6;
                    if (r6 != 0) {
                        obj7 = r6.value;
                        if (obj7 == null) {
                            break;
                        }
                        i17++;
                        i12 = i18;
                    }
                }
                obj7 = obj6;
                if (obj7 == null) {
                }
            }
            if (i17 < 0) {
                i17 = list3.size();
            }
            ArrayList arrayList8 = new ArrayList(list3);
            zzd zzdVar = Icons.Companion;
            Icon icon3 = new Icon("MAGvK7");
            LocalizedString localized = com.squareup.util.cash.StringsKt.localized(androidStringManager3.get(R.string.wallet_fidesmo_provision_text));
            LocalizedString localized2 = com.squareup.util.cash.StringsKt.localized(androidStringManager3.get(R.string.wallet_fidesmo_provision_text));
            CardModule.InformationSource informationSource = CardModule.InformationSource.GENERIC;
            list4 = listOfNotNull;
            mutableState6 = collectAsState7;
            androidStringManager = androidStringManager3;
            ByteString byteString = ByteString.EMPTY;
            realDisclosureProvider = realDisclosureProvider2;
            arrayList8.add(i17, new CardModule(new CardModule.Type.LineItem(new CardModule.LineItemModule(new CardModule.LineItemElement(informationSource, null, new CardModule.Push(new CardModule.CardElementAction(new CardModule$CardElementAction$Type$DoClientRoute(new CardModule.CardElementAction.DoClientRoute("https://cash.app/f/PROVISION_PAYMENT_TOKEN_DEVICE", byteString)), byteString), null, byteString), localized, icon3, localized2, Boolean.FALSE, byteString), byteString)), null, byteString));
            r0 = 0;
            gapComposer.end(false);
            list5 = arrayList8;
        } else {
            gapComposer.end(false);
            list4 = listOfNotNull;
            mutableState6 = collectAsState7;
            r0 = 0;
            androidStringManager = androidStringManager3;
            realDisclosureProvider = realDisclosureProvider2;
            list5 = list3;
        }
        ArrayList arrayList9 = arrayList;
        int i19 = (i << 6) & 896;
        List list12 = list4;
        AndroidStringManager androidStringManager4 = androidStringManager;
        RealDisclosureProvider realDisclosureProvider3 = realDisclosureProvider;
        ?? modules = toModules(list5, (ToggleEntryPointData) collectAsState5.getValue(), flow, (List) collectAsState2.getValue(), arrayList9, ((Boolean) collectAsState3.getValue()).booleanValue(), ((Boolean) collectAsState4.getValue()).booleanValue(), parcelableSnapshotMutableIntState3.getIntValue(), (Set) mutableState6.getValue(), (Set) collectAsState.getValue(), ((Boolean) collectAsState6.getValue()).booleanValue(), gapComposer, i19, i16, 0);
        ?? r3 = gapComposer;
        CashAppTag currentCashAppTagOrNull = CashAppTagKt.currentCashAppTagOrNull((List) collectAsState2.getValue());
        r3.startReplaceGroup(-539973359);
        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager4).peekCurrentValue(LaunchDarklyFeatureFlags$TagProvisioningTemp.INSTANCE)).enabled()) {
            Iterator it10 = modules.iterator();
            int i20 = r0;
            while (true) {
                if (!it10.hasNext()) {
                    androidStringManager2 = androidStringManager4;
                    i20 = -1;
                    break;
                }
                CardSchemeViewModel.Module module = (CardSchemeViewModel.Module) it10.next();
                if (module instanceof CardSchemeViewModel.Module.ListItemModule) {
                    androidStringManager2 = androidStringManager4;
                    if (Intrinsics.areEqual(((CardSchemeViewModel.Module.ListItemModule) module).mainText, androidStringManager2.get(R.string.wallet_fidesmo_provision_text))) {
                        break;
                    }
                } else {
                    androidStringManager2 = androidStringManager4;
                }
                i20++;
                androidStringManager4 = androidStringManager2;
            }
            if (i20 != -1) {
                int i21 = i20 + 1;
                List subList = modules.subList(r0, i21);
                zzd zzdVar2 = Icons.Companion;
                String str17 = androidStringManager2.get(R.string.wallet_fidesmo_deprovision_text);
                String str18 = androidStringManager2.get(R.string.wallet_fidesmo_deprovision_text);
                boolean changedInstance12 = r3.changedInstance(this) | r3.changedInstance(currentCashAppTagOrNull);
                Object rememberedValue30 = r3.rememberedValue();
                if (changedInstance12) {
                    neverEqualPolicy = neverEqualPolicy2;
                } else {
                    neverEqualPolicy = neverEqualPolicy2;
                    obj8 = rememberedValue30;
                }
                TaxWebAppBridge$$ExternalSyntheticLambda0 taxWebAppBridge$$ExternalSyntheticLambda0 = new TaxWebAppBridge$$ExternalSyntheticLambda0(28, this, currentCashAppTagOrNull);
                r3.updateRememberedValue(taxWebAppBridge$$ExternalSyntheticLambda0);
                obj8 = taxWebAppBridge$$ExternalSyntheticLambda0;
                ArrayList plus = CollectionsKt.plus((Iterable) modules.subList(i21, modules.size()), (Collection) CollectionsKt.plus((Collection) subList, (Object) new CardSchemeViewModel.Module.ListItemModule("b2TSUf", str17, false, str18, new CardSchemeViewModel.Module.Accessory.Push(null, (Function0) obj8))));
                r3.end(r0);
                list6 = list12;
                arrayList2 = plus;
                ArrayList plus2 = CollectionsKt.plus((Iterable) arrayList2, (Collection) list6);
                r3.startReplaceGroup(944410728);
                rememberedValue = r3.rememberedValue();
                if (rememberedValue != neverEqualPolicy) {
                    cardHomeAction$Action$CopyCardNumber = null;
                    Flow disclosure4 = realDisclosureProvider3.disclosure(DisclosureForScreen.CARDS_HOME, null);
                    r3.updateRememberedValue(disclosure4);
                    obj9 = disclosure4;
                } else {
                    cardHomeAction$Action$CopyCardNumber = null;
                    obj9 = rememberedValue;
                }
                CardHomeAction$Action$CopyCardNumber cardHomeAction$Action$CopyCardNumber2 = cardHomeAction$Action$CopyCardNumber;
                int i22 = r0;
                disclosure = (Disclosure) Updater.collectAsState((Flow) obj9, null, null, r3, 48, 2).getValue();
                if (disclosure != null) {
                    r3.end(i22);
                    disclosure2 = cardHomeAction$Action$CopyCardNumber2;
                } else {
                    disclosure2 = new CardSchemeViewModel.Module.Disclosure(disclosure.text, disclosure.showIcon);
                    r3.end(i22);
                }
                ArrayList plus3 = CollectionsKt.plus((Iterable) CollectionsKt__CollectionsKt.listOfNotNull(disclosure2), (Collection) plus2);
                List modules2 = toModules(list8, (ToggleEntryPointData) collectAsState5.getValue(), flow, (List) collectAsState2.getValue(), arrayList9, ((Boolean) collectAsState3.getValue()).booleanValue(), ((Boolean) collectAsState4.getValue()).booleanValue(), parcelableSnapshotMutableIntState3.getIntValue(), null, (Set) collectAsState.getValue(), false, r3, i19, i16, 640);
                if (containsHeroCard(list3)) {
                    if (!plus3.isEmpty()) {
                        Iterator it11 = plus3.iterator();
                        while (it11.hasNext()) {
                            CardSchemeViewModel.Module module2 = (CardSchemeViewModel.Module) it11.next();
                            if (!(module2 instanceof CardSchemeViewModel.Module.HeroCard) && !(module2 instanceof CardSchemeViewModel.Module.HeroPaymentDevices)) {
                            }
                        }
                    }
                    EmptyList emptyList2 = EmptyList.INSTANCE;
                    CardSchemeViewModel.Content content2 = new CardSchemeViewModel.Content(emptyList2, emptyList2, emptyList2, i22);
                    r3.end(i22);
                    return content2;
                }
                ArrayList arrayList10 = new ArrayList();
                for (CardHomeAction cardHomeAction : (Iterable) obj18) {
                    Boolean bool5 = cardHomeAction.is_disabled;
                    Icon icon4 = cardHomeAction.icon;
                    boolean areEqual = Intrinsics.areEqual(bool5, Boolean.TRUE);
                    ErrorEvent.Dd.Companion companion = cardHomeAction.action;
                    if (companion != null) {
                        CardHomeAction$Action$CopyCardNumber cardHomeAction$Action$CopyCardNumber3 = companion instanceof CardHomeAction$Action$CopyCardNumber ? (CardHomeAction$Action$CopyCardNumber) companion : cardHomeAction$Action$CopyCardNumber2;
                        if ((cardHomeAction$Action$CopyCardNumber3 != null ? cardHomeAction$Action$CopyCardNumber3.value : cardHomeAction$Action$CopyCardNumber2) != null) {
                            zzd zzdVar3 = Icons.Companion;
                            Icons icons = Icons.Copy24;
                            String str19 = token(icon4, "IoU1tO");
                            zzdVar3.getClass();
                            Icons icons2 = zzd.get(str19);
                            if (icons2 != null) {
                                icons = icons2;
                            }
                            obj11 = new CardHomeAction.CopyCardNumber(icons, areEqual, this.copyAnimationTrigger$delegate.getIntValue());
                            if (obj11 != null) {
                                arrayList10.add(obj11);
                            }
                        }
                    }
                    if (companion != null) {
                        ?? r7 = companion instanceof CardHomeAction$Action$LockDevices ? (CardHomeAction$Action$LockDevices) companion : cardHomeAction$Action$CopyCardNumber2;
                        ?? r72 = r7 != 0 ? r7.value : cardHomeAction$Action$CopyCardNumber2;
                        if (r72 != 0) {
                            LocalizedString localizedString9 = r72.title;
                            ?? translated2 = localizedString9 != null ? com.squareup.util.cash.StringsKt.translated(localizedString9) : cardHomeAction$Action$CopyCardNumber2;
                            if (translated2 == 0) {
                                translated2 = "";
                            }
                            LocalizedString localizedString10 = r72.description;
                            ?? translated3 = localizedString10 != null ? com.squareup.util.cash.StringsKt.translated(localizedString10) : cardHomeAction$Action$CopyCardNumber2;
                            if (translated3 == 0) {
                                translated3 = "";
                            }
                            if (translated2.length() <= 0 || translated3.length() <= 0) {
                                Timber.Forest.w("LockDevices action filtered: missing title or description", new Object[i22]);
                            } else {
                                zzd zzdVar4 = Icons.Companion;
                                Icons icons3 = Icons.LockLocked24;
                                String str20 = token(icon4, "o3Rxtb");
                                zzdVar4.getClass();
                                Icons icons4 = zzd.get(str20);
                                if (icons4 != null) {
                                    icons3 = icons4;
                                }
                                obj10 = new CardHomeAction.LockDevices(icons3, translated2, translated3, areEqual);
                                obj11 = obj10;
                                if (obj11 != null) {
                                }
                            }
                        }
                    }
                    obj10 = cardHomeAction$Action$CopyCardNumber2;
                    obj11 = obj10;
                    if (obj11 != null) {
                    }
                }
                CardSchemeViewModel.Content content3 = new CardSchemeViewModel.Content(plus3, modules2, arrayList10, ((Boolean) collectAsState6.getValue()).booleanValue());
                r3.end(i22);
                return content3;
            }
        }
        r3.end(r0);
        list6 = list12;
        neverEqualPolicy = neverEqualPolicy2;
        arrayList2 = modules;
        ArrayList plus22 = CollectionsKt.plus((Iterable) arrayList2, (Collection) list6);
        r3.startReplaceGroup(944410728);
        rememberedValue = r3.rememberedValue();
        if (rememberedValue != neverEqualPolicy) {
        }
        CardHomeAction$Action$CopyCardNumber cardHomeAction$Action$CopyCardNumber22 = cardHomeAction$Action$CopyCardNumber;
        int i222 = r0;
        disclosure = (Disclosure) Updater.collectAsState((Flow) obj9, null, null, r3, 48, 2).getValue();
        if (disclosure != null) {
        }
        ArrayList plus32 = CollectionsKt.plus((Iterable) CollectionsKt__CollectionsKt.listOfNotNull(disclosure2), (Collection) plus22);
        List modules22 = toModules(list8, (ToggleEntryPointData) collectAsState5.getValue(), flow, (List) collectAsState2.getValue(), arrayList9, ((Boolean) collectAsState3.getValue()).booleanValue(), ((Boolean) collectAsState4.getValue()).booleanValue(), parcelableSnapshotMutableIntState3.getIntValue(), null, (Set) collectAsState.getValue(), false, r3, i19, i16, 640);
        if (containsHeroCard(list3)) {
        }
        ArrayList arrayList102 = new ArrayList();
        while (r6.hasNext()) {
        }
        CardSchemeViewModel.Content content32 = new CardSchemeViewModel.Content(plus32, modules22, arrayList102, ((Boolean) collectAsState6.getValue()).booleanValue());
        r3.end(i222);
        return content32;
    }

    public final CardSchemeViewModel.Module.Accessory.Button toAccessory(final CardModule.Button button, Function0 function0, Function0 function02, Composer composer, int i, int i2) {
        final Function0 function03;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1911512851);
        int i3 = i2 & 1;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (i3 != 0) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new DataStoreKey$$ExternalSyntheticLambda0(17);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            function03 = (Function0) rememberedValue;
        } else {
            function03 = function0;
        }
        boolean z = true;
        boolean z2 = (i2 & 2) == 0;
        Function0 function04 = (i2 & 4) != 0 ? null : function02;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
        boolean changed = gapComposer.changed(button);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        final MutableState mutableState = (MutableState) rememberedValue3;
        LocalizedString localizedString = button.text;
        Icon icon = button.icon;
        String str2 = (String) reportExpected$default(this, localizedString != null ? com.squareup.util.cash.StringsKt.translated(localizedString) : null);
        if (str2 == null) {
            gapComposer.end(false);
            return null;
        }
        CardModule.Button.Prominence prominence = button.prominence;
        CardModule.Button.Prominence.Type type2 = prominence != null ? prominence.f1330type : null;
        int i4 = type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$3[type2.ordinal()];
        CardSchemeViewModel.Module.Accessory.Button.Prominence prominence2 = i4 != 1 ? i4 != 2 ? CardSchemeViewModel.Module.Accessory.Button.Prominence.SUBTLE : CardSchemeViewModel.Module.Accessory.Button.Prominence.PROMINENT : CardSchemeViewModel.Module.Accessory.Button.Prominence.STANDARD;
        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
        boolean z3 = (button.card_element_action == null || ((Boolean) mutableState.getValue()).booleanValue() || Intrinsics.areEqual(button.is_disabled, Boolean.TRUE)) ? false : true;
        if (icon != null) {
            zzd zzdVar = Icons.Companion;
            str = token(icon, "ts1Zo2");
        } else {
            str = null;
        }
        String str3 = icon != null ? str : null;
        boolean changedInstance = ((((i & 7168) ^ 3072) > 2048 && gapComposer.changed(function04)) || (i & 3072) == 2048) | gapComposer.changedInstance(button) | gapComposer.changedInstance(coroutineScope) | gapComposer.changedInstance(this) | ((((i & 112) ^ 48) > 32 && gapComposer.changed(function03)) || (i & 48) == 32);
        if ((((i & 896) ^ MLKEMEngine.KyberPolyBytes) <= 256 || !gapComposer.changed(z2)) && (i & MLKEMEngine.KyberPolyBytes) != 256) {
            z = false;
        }
        boolean changed2 = changedInstance | z | gapComposer.changed(mutableState);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue4 == neverEqualPolicy) {
            final boolean z4 = z2;
            final Function0 function05 = function04;
            Function0 function06 = new Function0() { // from class: com.squareup.cash.wallet.presenters.CardSchemePresenter$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Function0 function07 = Function0.this;
                    if (function07 != null) {
                        function07.invoke();
                    }
                    CardModule.CardElementAction cardElementAction = button.card_element_action;
                    if (cardElementAction != null) {
                        JobKt.launch$default(coroutineScope, null, null, new RealPayDataLoader$fetchData$1(this, cardElementAction, function03, z4, mutableState, (Continuation) null), 3);
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer.updateRememberedValue(function06);
            rememberedValue4 = function06;
        }
        CardSchemeViewModel.Module.Accessory.Button button2 = new CardSchemeViewModel.Module.Accessory.Button(str2, prominence2, booleanValue, z3, str3, (Function0) rememberedValue4, 4);
        gapComposer.end(false);
        return button2;
    }

    public final CardModule.Button toCardHomeButton(CardModule.Button button, String str) {
        LocalizedString localized;
        zzkk zzkkVar;
        zzkk zzkkVar2;
        CardModule.CardElementAction cardElementAction = button.card_element_action;
        AndroidStringManager androidStringManager = this.stringManager;
        ClientScenario clientScenario = null;
        if (cardElementAction != null && (zzkkVar2 = cardElementAction.f1331type) != null) {
            CardModule$CardElementAction$Type$CopyCardNumber cardModule$CardElementAction$Type$CopyCardNumber = zzkkVar2 instanceof CardModule$CardElementAction$Type$CopyCardNumber ? (CardModule$CardElementAction$Type$CopyCardNumber) zzkkVar2 : null;
            if ((cardModule$CardElementAction$Type$CopyCardNumber != null ? cardModule$CardElementAction$Type$CopyCardNumber.value : null) != null) {
                str.getClass();
                Resources resources = androidStringManager.resources;
                resources.getClass();
                String format2 = new MessageFormat(resources.getString(R.string.wallet_copy_last_four_text)).format(new Object[]{str});
                format2.getClass();
                localized = com.squareup.util.cash.StringsKt.localized(format2);
                return CardModule.Button.copy$default(button, null, null, localized, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
            }
        }
        if (cardElementAction != null && (zzkkVar = cardElementAction.f1331type) != null) {
            CardModule$CardElementAction$Type$DoClientScenario cardModule$CardElementAction$Type$DoClientScenario = zzkkVar instanceof CardModule$CardElementAction$Type$DoClientScenario ? (CardModule$CardElementAction$Type$DoClientScenario) zzkkVar : null;
            CardModule.CardElementAction.DoClientScenario doClientScenario = cardModule$CardElementAction$Type$DoClientScenario != null ? cardModule$CardElementAction$Type$DoClientScenario.value : null;
            if (doClientScenario != null) {
                clientScenario = doClientScenario.client_scenario;
            }
        }
        int i = clientScenario == null ? -1 : WhenMappings.$EnumSwitchMapping$0[clientScenario.ordinal()];
        localized = i != 1 ? i != 2 ? button.text : com.squareup.util.cash.StringsKt.localized(androidStringManager.get(R.string.wallet_card_lock)) : com.squareup.util.cash.StringsKt.localized(androidStringManager.get(R.string.wallet_card_unlock));
        return CardModule.Button.copy$default(button, null, null, localized, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE);
    }

    public final CardSchemeViewModel.Module.ListItemModule toGenericLineItemModule(CardModule.LineItemElement lineItemElement, Icons icons, Event event, Composer composer, int i, int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-877366991);
        if ((i2 & 1) != 0) {
            icons = Icons.Pending24;
        }
        int i3 = i2 & 2;
        CardSchemeViewModel.Module.Accessory.Push push = null;
        if (i3 != 0) {
            event = null;
        }
        String str = token(lineItemElement.icon, icons.id);
        LocalizedString localizedString = lineItemElement.main_text;
        String str2 = (String) reportExpected$default(this, localizedString != null ? com.squareup.util.cash.StringsKt.translated(localizedString) : null);
        if (str2 == null) {
            gapComposer.end(false);
            return null;
        }
        LocalizedString localizedString2 = lineItemElement.accessibility_text;
        String translated = localizedString2 != null ? com.squareup.util.cash.StringsKt.translated(localizedString2) : null;
        boolean areEqual = Intrinsics.areEqual(lineItemElement.is_disabled, Boolean.TRUE);
        CardModule.Push push2 = lineItemElement.push;
        if (push2 == null) {
            gapComposer.startReplaceGroup(1531363089);
        } else {
            gapComposer.startReplaceGroup(-1336074512);
            push = toAccessory(push2, event, gapComposer, 0);
        }
        gapComposer.end(false);
        CardSchemeViewModel.Module.ListItemModule listItemModule = new CardSchemeViewModel.Module.ListItemModule(str, str2, areEqual, translated, push);
        gapComposer.end(false);
        return listItemModule;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac  */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.squareup.cash.wallet.viewmodels.CardSchemeViewModel$Module$ListItemModule] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v24, types: [com.squareup.cash.wallet.viewmodels.CardSchemeViewModel$Module$ListItemModule] */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r26v0, types: [com.squareup.cash.wallet.presenters.CardSchemePresenter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CardSchemeViewModel.Module.ListItemModule toLineItemModule(CardModule.LineItemElement lineItemElement, boolean z, boolean z2, boolean z3, Composer composer, int i) {
        String str;
        String str2;
        CardModule.CardElementAction cardElementAction;
        zzkk zzkkVar;
        LocalizedString localizedString;
        SpendingInsightsListItemViewModel spendingInsightsListItemViewModel;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(709699035);
        CardModule.InformationSource informationSource = lineItemElement.source;
        CardModule.Push push = lineItemElement.push;
        LocalizedString localizedString2 = lineItemElement.main_text;
        LocalizedString localizedString3 = lineItemElement.accessibility_text;
        Boolean bool = lineItemElement.is_disabled;
        Icon icon = lineItemElement.icon;
        int i2 = informationSource == null ? -1 : WhenMappings.$EnumSwitchMapping$1[informationSource.ordinal()];
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        final int i3 = 1;
        Continuation continuation = null;
        ?? r11 = 0;
        CardSchemeViewModel.Module.ListItemModule listItemModule = null;
        CardSchemeViewModel.Module.ListItemModule listItemModule2 = null;
        CardSchemeViewModel.Module.ListItemModule listItemModule3 = null;
        CardSchemeViewModel.Module.ListItemModule listItemModule4 = null;
        r11 = null;
        CardSchemeViewModel.Module.ListItemModule listItemModule5 = null;
        r11 = null;
        CardSchemeViewModel.Module.ListItemModule listItemModule6 = null;
        CardSchemeViewModel.Module.Accessory.Push accessory = null;
        final int i4 = 0;
        switch (i2) {
            case 1:
                gapComposer.startReplaceGroup(-878985325);
                gapComposer.startReplaceGroup(1785014397);
                zzd zzdVar = Icons.Companion;
                String str3 = token(icon, "ThsKPh");
                String str4 = (String) reportExpected$default(this, localizedString2 != null ? com.squareup.util.cash.StringsKt.translated(localizedString2) : null);
                if (str4 != null) {
                    String translated = localizedString3 != null ? com.squareup.util.cash.StringsKt.translated(localizedString3) : null;
                    boolean areEqual = Intrinsics.areEqual(bool, Boolean.TRUE);
                    if (push == null) {
                        gapComposer.startReplaceGroup(1374158839);
                    } else {
                        gapComposer.startReplaceGroup(1706895690);
                        accessory = toAccessory(push, null, gapComposer, 1);
                    }
                    gapComposer.end(false);
                    continuation = new CardSchemeViewModel.Module.ListItemModule(str3, str4, areEqual, translated, accessory);
                }
                gapComposer.end(false);
                gapComposer.end(false);
                r11 = continuation;
                break;
            case 2:
            case 10:
            case 11:
                gapComposer.startReplaceGroup(-878979468);
                CardSchemeViewModel.Module.ListItemModule genericLineItemModule = toGenericLineItemModule(lineItemElement, null, null, gapComposer, (i & 14) | ((i >> 3) & 7168), 3);
                gapComposer.end(false);
                r11 = genericLineItemModule;
                break;
            case 3:
                gapComposer.startReplaceGroup(-879020274);
                gapComposer.startReplaceGroup(2050434856);
                Object rememberedValue = gapComposer.rememberedValue();
                Object obj = rememberedValue;
                if (rememberedValue == neverEqualPolicy) {
                    CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(createCompositionCoroutineScope);
                    obj = createCompositionCoroutineScope;
                }
                CoroutineScope coroutineScope = (CoroutineScope) obj;
                MutableSharedFlow rememberSharedViewEvents = SharedViewEventsKt.rememberSharedViewEvents(gapComposer);
                OverdraftCoverageListItemViewModel models = this.overdraftListItemPresenter.models((Flow) rememberSharedViewEvents, (Composer) gapComposer, 0);
                if (models instanceof OverdraftCoverageListItemViewModel.Ready) {
                    gapComposer.startReplaceGroup(1480248356);
                    zzd zzdVar2 = Icons.Companion;
                    String str5 = token(icon, "0WpBiM");
                    String str6 = (String) reportExpected$default(this, localizedString2 != null ? com.squareup.util.cash.StringsKt.translated(localizedString2) : null);
                    if (str6 == null) {
                        gapComposer.end(false);
                    } else {
                        String translated2 = localizedString3 != null ? com.squareup.util.cash.StringsKt.translated(localizedString3) : null;
                        boolean areEqual2 = Intrinsics.areEqual(bool, Boolean.TRUE);
                        int ordinal = ((OverdraftCoverageListItemViewModel.Ready) models).overdraftListItemState.ordinal();
                        AndroidStringManager androidStringManager = this.stringManager;
                        if (ordinal == 0) {
                            str = androidStringManager.get(R.string.overdraft_coverage_item_on_label);
                        } else if (ordinal == 1) {
                            str = androidStringManager.get(R.string.overdraft_coverage_item_off_label);
                        } else if (ordinal == 2) {
                            str = "";
                        } else {
                            if (ordinal != 3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            str = androidStringManager.get(R.string.overdraft_coverage_item_new_label);
                        }
                        boolean changedInstance = gapComposer.changedInstance(coroutineScope) | gapComposer.changedInstance(rememberSharedViewEvents);
                        Object rememberedValue2 = gapComposer.rememberedValue();
                        Object obj2 = rememberedValue2;
                        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                            CardSchemePresenter$$ExternalSyntheticLambda20 cardSchemePresenter$$ExternalSyntheticLambda20 = new CardSchemePresenter$$ExternalSyntheticLambda20(coroutineScope, rememberSharedViewEvents, i4);
                            gapComposer.updateRememberedValue(cardSchemePresenter$$ExternalSyntheticLambda20);
                            obj2 = cardSchemePresenter$$ExternalSyntheticLambda20;
                        }
                        listItemModule6 = new CardSchemeViewModel.Module.ListItemModule(str5, str6, areEqual2, translated2, new CardSchemeViewModel.Module.Accessory.Push(str, (Function0) obj2));
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.startReplaceGroup(1481143016);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
                gapComposer.end(false);
                r11 = listItemModule6;
                break;
            case 4:
                gapComposer.startReplaceGroup(-879018099);
                gapComposer.startReplaceGroup(450660585);
                Object rememberedValue3 = gapComposer.rememberedValue();
                Object obj3 = rememberedValue3;
                if (rememberedValue3 == neverEqualPolicy) {
                    CoroutineScope createCompositionCoroutineScope2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                    gapComposer.updateRememberedValue(createCompositionCoroutineScope2);
                    obj3 = createCompositionCoroutineScope2;
                }
                CoroutineScope coroutineScope2 = (CoroutineScope) obj3;
                Object rememberedValue4 = gapComposer.rememberedValue();
                Object obj4 = rememberedValue4;
                if (rememberedValue4 == neverEqualPolicy) {
                    String translated3 = localizedString2 != null ? com.squareup.util.cash.StringsKt.translated(localizedString2) : null;
                    String translated4 = (push == null || (localizedString = push.text) == null) ? null : com.squareup.util.cash.StringsKt.translated(localizedString);
                    if (push != null && (cardElementAction = push.action) != null && (zzkkVar = cardElementAction.f1331type) != null) {
                        CardModule$CardElementAction$Type$DoClientRoute cardModule$CardElementAction$Type$DoClientRoute = zzkkVar instanceof CardModule$CardElementAction$Type$DoClientRoute ? (CardModule$CardElementAction$Type$DoClientRoute) zzkkVar : null;
                        CardModule.CardElementAction.DoClientRoute doClientRoute = cardModule$CardElementAction$Type$DoClientRoute != null ? cardModule$CardElementAction$Type$DoClientRoute.value : null;
                        if (doClientRoute != null) {
                            str2 = doClientRoute.url;
                            RoundUpsElement roundUpsElement = new RoundUpsElement(null, translated3, null, translated4, null, null, null, null, null, null, str2, ByteString.EMPTY);
                            MarkwonConfiguration markwonConfiguration = this.roundUpsItemPresenter;
                            ((Analytics) markwonConfiguration.imageDestinationProcessor).track(new RoundUpsEnableViewEntryRow(), null);
                            ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(((SyncValueReader) markwonConfiguration.syntaxHighlight).getFirstValueOrDefault(AndroidSyncValueSpecs.InvestingAutomation, null, new SyncRangeQueries$$ExternalSyntheticLambda1(18)), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, markwonConfiguration, roundUpsElement, 17));
                            gapComposer.updateRememberedValue(transformLatest);
                            obj4 = transformLatest;
                        }
                    }
                    str2 = null;
                    RoundUpsElement roundUpsElement2 = new RoundUpsElement(null, translated3, null, translated4, null, null, null, null, null, null, str2, ByteString.EMPTY);
                    MarkwonConfiguration markwonConfiguration2 = this.roundUpsItemPresenter;
                    ((Analytics) markwonConfiguration2.imageDestinationProcessor).track(new RoundUpsEnableViewEntryRow(), null);
                    ChannelFlowTransformLatest transformLatest2 = FlowKt.transformLatest(((SyncValueReader) markwonConfiguration2.syntaxHighlight).getFirstValueOrDefault(AndroidSyncValueSpecs.InvestingAutomation, null, new SyncRangeQueries$$ExternalSyntheticLambda1(18)), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, markwonConfiguration2, roundUpsElement2, 17));
                    gapComposer.updateRememberedValue(transformLatest2);
                    obj4 = transformLatest2;
                }
                CardsRoundUpsItemViewModel cardsRoundUpsItemViewModel = (CardsRoundUpsItemViewModel) Updater.collectAsState((Flow) obj4, null, null, gapComposer, 48, 2).getValue();
                if (cardsRoundUpsItemViewModel != null) {
                    RoundUpsElement roundUpsElement3 = cardsRoundUpsItemViewModel.element;
                    zzd zzdVar3 = Icons.Companion;
                    String str7 = token(icon, "hHwc1o");
                    String str8 = (String) reportExpected$default(this, roundUpsElement3.main_text);
                    if (str8 != null) {
                        String str9 = roundUpsElement3.accessibility_text;
                        boolean areEqual3 = Intrinsics.areEqual(bool, Boolean.TRUE);
                        String str10 = roundUpsElement3.info_text;
                        boolean changedInstance2 = gapComposer.changedInstance(coroutineScope2) | gapComposer.changedInstance(this) | gapComposer.changedInstance(roundUpsElement3);
                        Object rememberedValue5 = gapComposer.rememberedValue();
                        Object obj5 = rememberedValue5;
                        if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                            HeroCardViewKt$$ExternalSyntheticLambda9 heroCardViewKt$$ExternalSyntheticLambda9 = new HeroCardViewKt$$ExternalSyntheticLambda9(i3, coroutineScope2, (Object) this, roundUpsElement3);
                            gapComposer.updateRememberedValue(heroCardViewKt$$ExternalSyntheticLambda9);
                            obj5 = heroCardViewKt$$ExternalSyntheticLambda9;
                        }
                        listItemModule5 = new CardSchemeViewModel.Module.ListItemModule(str7, str8, areEqual3, str9, new CardSchemeViewModel.Module.Accessory.Push(str10, (Function0) obj5));
                    }
                }
                gapComposer.end(false);
                gapComposer.end(false);
                r11 = listItemModule5;
                break;
            case 5:
                gapComposer.startReplaceGroup(-879015691);
                gapComposer.startReplaceGroup(-866230434);
                final MarkwonConfiguration markwonConfiguration3 = this.spendingInsightsListItemPresenter;
                SyncValueReader syncValueReader = (SyncValueReader) markwonConfiguration3.theme;
                ?? rememberedValue6 = gapComposer.rememberedValue();
                StateFlow stateFlow = rememberedValue6;
                if (rememberedValue6 == neverEqualPolicy) {
                    StateFlow singleValueOrDefault = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.CardSpendingInsightsConfig, null, new Function1() { // from class: com.squareup.cash.wallet.presenters.SpendingInsightsListItemPresenter$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i5 = i4;
                            MarkwonConfiguration markwonConfiguration4 = markwonConfiguration3;
                            switch (i5) {
                                case 0:
                                    CardSpendingInsightsConfig cardSpendingInsightsConfig = (CardSpendingInsightsConfig) obj6;
                                    cardSpendingInsightsConfig.getClass();
                                    return zzahh.toSpendingInsightsConfig(markwonConfiguration4, cardSpendingInsightsConfig);
                                default:
                                    CardSpendingInsightsHome cardSpendingInsightsHome = (CardSpendingInsightsHome) obj6;
                                    cardSpendingInsightsHome.getClass();
                                    CardSpendingInsightsHome.EntryPoint entryPoint = cardSpendingInsightsHome.entry_point;
                                    if (entryPoint != null) {
                                        return zzahi.toEntryPoint(markwonConfiguration4, entryPoint);
                                    }
                                    return null;
                            }
                        }
                    });
                    gapComposer.updateRememberedValue(singleValueOrDefault);
                    stateFlow = singleValueOrDefault;
                }
                MutableState receiveValueAsState = Strings.receiveValueAsState(stateFlow, gapComposer);
                ?? rememberedValue7 = gapComposer.rememberedValue();
                StateFlow stateFlow2 = rememberedValue7;
                if (rememberedValue7 == neverEqualPolicy) {
                    StateFlow singleValueOrDefault2 = syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.CardSpendingInsightsHome, null, new Function1() { // from class: com.squareup.cash.wallet.presenters.SpendingInsightsListItemPresenter$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i5 = i3;
                            MarkwonConfiguration markwonConfiguration4 = markwonConfiguration3;
                            switch (i5) {
                                case 0:
                                    CardSpendingInsightsConfig cardSpendingInsightsConfig = (CardSpendingInsightsConfig) obj6;
                                    cardSpendingInsightsConfig.getClass();
                                    return zzahh.toSpendingInsightsConfig(markwonConfiguration4, cardSpendingInsightsConfig);
                                default:
                                    CardSpendingInsightsHome cardSpendingInsightsHome = (CardSpendingInsightsHome) obj6;
                                    cardSpendingInsightsHome.getClass();
                                    CardSpendingInsightsHome.EntryPoint entryPoint = cardSpendingInsightsHome.entry_point;
                                    if (entryPoint != null) {
                                        return zzahi.toEntryPoint(markwonConfiguration4, entryPoint);
                                    }
                                    return null;
                            }
                        }
                    });
                    gapComposer.updateRememberedValue(singleValueOrDefault2);
                    stateFlow2 = singleValueOrDefault2;
                }
                MutableState receiveValueAsState2 = Strings.receiveValueAsState(stateFlow2, gapComposer);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance3 = gapComposer.changedInstance(markwonConfiguration3);
                Object rememberedValue8 = gapComposer.rememberedValue();
                Object obj6 = rememberedValue8;
                if (changedInstance3 || rememberedValue8 == neverEqualPolicy) {
                    ExoPlayerVideoView.AnonymousClass2 anonymousClass2 = new ExoPlayerVideoView.AnonymousClass2(markwonConfiguration3, continuation, 14);
                    gapComposer.updateRememberedValue(anonymousClass2);
                    obj6 = anonymousClass2;
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) obj6);
                SpendingInsightsHome.EntryPoint entryPoint = (SpendingInsightsHome.EntryPoint) receiveValueAsState2.getValue();
                if (entryPoint != null && entryPoint.visible) {
                    SpendingInsightsHome.EntryPoint entryPoint2 = (SpendingInsightsHome.EntryPoint) receiveValueAsState2.getValue();
                    entryPoint2.getClass();
                    String str11 = entryPoint2.previewText;
                    SpendingInsightsConfig spendingInsightsConfig = (SpendingInsightsConfig) receiveValueAsState.getValue();
                    if ((spendingInsightsConfig != null ? spendingInsightsConfig.previewTitle : null) != null) {
                        String str12 = entryPoint2.clientRoute;
                        if (str11 != null && str12 != null) {
                            String str13 = spendingInsightsConfig.previewTitle;
                            str13.getClass();
                            spendingInsightsListItemViewModel = new SpendingInsightsListItemViewModel(str13, str11, str12);
                            if (spendingInsightsListItemViewModel != null) {
                                Object rememberedValue9 = gapComposer.rememberedValue();
                                Object obj7 = rememberedValue9;
                                if (rememberedValue9 == neverEqualPolicy) {
                                    CoroutineScope createCompositionCoroutineScope3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                                    gapComposer.updateRememberedValue(createCompositionCoroutineScope3);
                                    obj7 = createCompositionCoroutineScope3;
                                }
                                CoroutineScope coroutineScope3 = (CoroutineScope) obj7;
                                zzd zzdVar4 = Icons.Companion;
                                String str14 = token(icon, "Pcmgzv");
                                String str15 = spendingInsightsListItemViewModel.title;
                                String translated5 = localizedString3 != null ? com.squareup.util.cash.StringsKt.translated(localizedString3) : null;
                                boolean areEqual4 = Intrinsics.areEqual(bool, Boolean.TRUE);
                                String str16 = spendingInsightsListItemViewModel.subtitle;
                                boolean changedInstance4 = gapComposer.changedInstance(coroutineScope3) | gapComposer.changedInstance(this) | gapComposer.changedInstance(spendingInsightsListItemViewModel);
                                Object rememberedValue10 = gapComposer.rememberedValue();
                                if (changedInstance4 || rememberedValue10 == neverEqualPolicy) {
                                    rememberedValue10 = new BasicShieetScope$$ExternalSyntheticLambda10(coroutineScope3, this, spendingInsightsListItemViewModel, false, 29);
                                    gapComposer.updateRememberedValue(rememberedValue10);
                                }
                                listItemModule4 = new CardSchemeViewModel.Module.ListItemModule(str14, str15, areEqual4, translated5, new CardSchemeViewModel.Module.Accessory.Push(str16, (Function0) rememberedValue10));
                            }
                            gapComposer.end(false);
                            gapComposer.end(false);
                            r11 = listItemModule4;
                            break;
                        }
                    }
                }
                spendingInsightsListItemViewModel = null;
                if (spendingInsightsListItemViewModel != null) {
                }
                gapComposer.end(false);
                gapComposer.end(false);
                r11 = listItemModule4;
                break;
            case 6:
                gapComposer.startReplaceGroup(-1479593425);
                String activeAccountTokenOrNull = PlatformKt.activeAccountTokenOrNull(this.sessionManager);
                if (activeAccountTokenOrNull != null) {
                    CardSchemeViewModel.Module.ListItemModule genericLineItemModule2 = toGenericLineItemModule(lineItemElement, Icons.Block24, new BlockedBusinessesViewOpen(activeAccountTokenOrNull), gapComposer, ((i >> 3) & 7168) | (i & 14) | 48, 0);
                    gapComposer.end(false);
                    r11 = genericLineItemModule2;
                    break;
                } else {
                    gapComposer.end(false);
                    gapComposer.end(false);
                    return null;
                }
            case 7:
                gapComposer.startReplaceGroup(-1479286959);
                if (z) {
                    gapComposer.startReplaceGroup(-1479254564);
                    CardSchemeViewModel.Module.ListItemModule genericLineItemModule3 = toGenericLineItemModule(lineItemElement, Icons.LogoAfterpay24, new PrepurchaseCardAppletRowTap(), gapComposer, (i & 14) | 48 | ((i >> 3) & 7168), 0);
                    gapComposer.end(false);
                    listItemModule3 = genericLineItemModule3;
                } else {
                    gapComposer.startReplaceGroup(-1479083475);
                    gapComposer.end(false);
                }
                gapComposer.end(false);
                r11 = listItemModule3;
                break;
            case 8:
                gapComposer.startReplaceGroup(-878993291);
                if (z3) {
                    gapComposer.startReplaceGroup(-878992588);
                    listItemModule2 = toGenericLineItemModule(lineItemElement, Icons.DeviceTap24, null, gapComposer, (i & 14) | 48 | ((i >> 3) & 7168), 2);
                } else {
                    gapComposer.startReplaceGroup(-1478905598);
                }
                gapComposer.end(false);
                gapComposer.end(false);
                r11 = listItemModule2;
                break;
            case 9:
                gapComposer.startReplaceGroup(-878988526);
                if (z2) {
                    gapComposer.startReplaceGroup(-878987916);
                    listItemModule = toGenericLineItemModule(lineItemElement, null, null, gapComposer, (i & 14) | ((i >> 3) & 7168), 3);
                } else {
                    gapComposer.startReplaceGroup(-1478791518);
                }
                gapComposer.end(false);
                gapComposer.end(false);
                r11 = listItemModule;
                break;
            default:
                gapComposer.startReplaceGroup(-1478519710);
                gapComposer.end(false);
                break;
        }
        gapComposer.end(false);
        return r11;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final java.util.List toModules(java.util.List r53, com.squareup.lending.sync_values.ToggleEntryPointData r54, kotlinx.coroutines.flow.Flow r55, java.util.List r56, java.util.ArrayList r57, boolean r58, boolean r59, int r60, java.util.Set r61, java.util.Set r62, boolean r63, androidx.compose.runtime.Composer r64, int r65, int r66, int r67) {
        /*
            Method dump skipped, instructions count: 3283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.wallet.presenters.CardSchemePresenter.toModules(java.util.List, com.squareup.lending.sync_values.ToggleEntryPointData, kotlinx.coroutines.flow.Flow, java.util.List, java.util.ArrayList, boolean, boolean, int, java.util.Set, java.util.Set, boolean, androidx.compose.runtime.Composer, int, int, int):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e9  */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.squareup.cash.wallet.viewmodels.CardSchemeViewModel$Module$Accessory$Button] */
    /* JADX WARN: Type inference failed for: r41v0, types: [com.squareup.cash.wallet.presenters.CardSchemePresenter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.squareup.cash.ui.widget.StackedAvatarViewModel$Single] */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.squareup.cash.ui.widget.StackedAvatarViewModel$Duo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CardSchemeViewModel.Module.StatusModule toStatusModule(CardModule.StatusElement statusElement, Composer composer, int i) {
        int i2;
        String str;
        StackedAvatarViewModel stackedAvatarViewModel;
        boolean z;
        Iterable<UiRewardAvatar> iterable;
        StackedAvatarViewModel.Avatar avatar;
        UiRewardAvatars uiRewardAvatars;
        CardModule.Push push;
        CardSchemeViewModel.Module.Accessory.Push accessory;
        CardSchemeViewModel.Module.Accessory.Push push2;
        CardModule.Button button;
        CardModule.InformationSource informationSource = statusElement.source;
        Boolean bool = statusElement.is_disabled;
        LocalizedString localizedString = statusElement.accessibility_text;
        int i3 = informationSource == null ? -1 : WhenMappings.$EnumSwitchMapping$1[informationSource.ordinal()];
        CardSchemeViewModel.Module.StatusModule statusModule = null;
        CardSchemeViewModel.Module.StatusModule statusModule2 = null;
        CardSchemeViewModel.Module.Accessory.Button accessory2 = null;
        int i4 = 0;
        if (i3 != 1) {
            if (i3 != 2) {
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1040343982);
                gapComposer.end(false);
                return null;
            }
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-1834675998);
            int i5 = i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
            gapComposer2.startReplaceGroup(583319354);
            CardModule.StatusElement.Icon icon = statusElement.icon;
            zzd zzdVar = Icons.Companion;
            CardSchemeViewModel.Module.Icon.LegacyAvatar.AvatarImage.Local local = new CardSchemeViewModel.Module.Icon.LegacyAvatar.AvatarImage.Local(token(icon != null ? icon.icon : null, "ts1Zo2"));
            CardModule.StatusElement.Icon.IconBackground iconBackground = icon != null ? icon.background : null;
            int i6 = iconBackground != null ? WhenMappings.$EnumSwitchMapping$6[iconBackground.ordinal()] : -1;
            CardSchemeViewModel.Module.Icon.LegacyAvatar legacyAvatar = new CardSchemeViewModel.Module.Icon.LegacyAvatar(i6 != 1 ? i6 != 2 ? CardSchemeViewModel.Module.Icon.LegacyAvatarBackground.SUBTLE : CardSchemeViewModel.Module.Icon.LegacyAvatarBackground.DANGER : CardSchemeViewModel.Module.Icon.LegacyAvatarBackground.BRAND, local, null, 12);
            LocalizedString localizedString2 = statusElement.main_text;
            String str2 = (String) reportExpected$default(this, localizedString2 != null ? com.squareup.util.cash.StringsKt.translated(localizedString2) : null);
            if (str2 == null) {
                gapComposer2.end(false);
            } else {
                LocalizedString localizedString3 = statusElement.info_text;
                String translated = localizedString3 != null ? com.squareup.util.cash.StringsKt.translated(localizedString3) : null;
                String translated2 = localizedString != null ? com.squareup.util.cash.StringsKt.translated(localizedString) : null;
                boolean areEqual = Intrinsics.areEqual(bool, Boolean.TRUE);
                CardModule.StatusElement.Accessory accessory3 = statusElement.accessory;
                if (accessory3 == null) {
                    gapComposer2.startReplaceGroup(229590556);
                    gapComposer2.end(false);
                    push2 = null;
                } else {
                    zzkm zzkmVar = accessory3.f1333type;
                    gapComposer2.startReplaceGroup(229590557);
                    if (zzkmVar != null) {
                        CardModule$StatusElement$Accessory$Type$Push cardModule$StatusElement$Accessory$Type$Push = zzkmVar instanceof CardModule$StatusElement$Accessory$Type$Push ? (CardModule$StatusElement$Accessory$Type$Push) zzkmVar : null;
                        if (cardModule$StatusElement$Accessory$Type$Push != null) {
                            push = cardModule$StatusElement$Accessory$Type$Push.value;
                            if (push != null) {
                                gapComposer2.startReplaceGroup(-31801576);
                                gapComposer2.end(false);
                                accessory = null;
                            } else {
                                gapComposer2.startReplaceGroup(-1802141175);
                                accessory = toAccessory(push, null, gapComposer2, 1);
                                gapComposer2.end(false);
                            }
                            if (accessory != null) {
                                gapComposer2.startReplaceGroup(-31762887);
                                if (zzkmVar != null) {
                                    CardModule$StatusElement$Accessory$Type$PillButton cardModule$StatusElement$Accessory$Type$PillButton = zzkmVar instanceof CardModule$StatusElement$Accessory$Type$PillButton ? (CardModule$StatusElement$Accessory$Type$PillButton) zzkmVar : null;
                                    if (cardModule$StatusElement$Accessory$Type$PillButton != null) {
                                        button = cardModule$StatusElement$Accessory$Type$PillButton.value;
                                        if (button != null) {
                                            gapComposer2.startReplaceGroup(-31762888);
                                            gapComposer2.end(false);
                                            accessory = null;
                                        } else {
                                            gapComposer2.startReplaceGroup(-1802139927);
                                            ?? accessory4 = toAccessory(button, null, null, gapComposer2, (i5 << 9) & 57344, 7);
                                            gapComposer2.end(false);
                                            accessory = accessory4;
                                        }
                                    }
                                }
                                button = null;
                                if (button != null) {
                                }
                            } else {
                                gapComposer2.startReplaceGroup(-1802141601);
                            }
                            gapComposer2.end(false);
                            gapComposer2.end(false);
                            push2 = accessory;
                        }
                    }
                    push = null;
                    if (push != null) {
                    }
                    if (accessory != null) {
                    }
                    gapComposer2.end(false);
                    gapComposer2.end(false);
                    push2 = accessory;
                }
                CardModule.Button button2 = statusElement.button;
                if (button2 == null) {
                    gapComposer2.startReplaceGroup(229693786);
                } else {
                    gapComposer2.startReplaceGroup(-2070800505);
                    accessory2 = toAccessory(button2, null, null, gapComposer2, (i5 << 9) & 57344, 7);
                }
                gapComposer2.end(false);
                CardSchemeViewModel.Module.StatusModule statusModule3 = new CardSchemeViewModel.Module.StatusModule(legacyAvatar, str2, translated, translated2, areEqual, push2, accessory2, 128);
                gapComposer2.end(false);
                statusModule2 = statusModule3;
            }
            gapComposer2.end(false);
            return statusModule2;
        }
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startReplaceGroup(-1834678021);
        RealBoostRepository realBoostRepository = this.boostRepository;
        RealBoostProvider realBoostProvider = realBoostRepository.boostProvider;
        gapComposer3.startReplaceGroup(56172304);
        Object rememberedValue = gapComposer3.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            FinishSetupTileBadgeCounter finishSetupTileBadgeCounter = new FinishSetupTileBadgeCounter(10, this.featureEligibilityRepository.currentEligibleFeatures(), new EligibleFeature[]{EligibleFeature.CASH_OFFERS_TAB});
            gapComposer3.updateRememberedValue(finishSetupTileBadgeCounter);
            rememberedValue = finishSetupTileBadgeCounter;
        }
        if (((Boolean) Updater.collectAsState((Flow) rememberedValue, Boolean.FALSE, null, gapComposer3, 48, 2).getValue()).booleanValue()) {
            Object rememberedValue2 = gapComposer3.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer3);
                gapComposer3.updateRememberedValue(rememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
            Object rememberedValue3 = gapComposer3.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = realBoostRepository.getSelectedBoostTokens();
                gapComposer3.updateRememberedValue(rememberedValue3);
            }
            Flow flow = (Flow) rememberedValue3;
            EmptySet emptySet = EmptySet.INSTANCE;
            MutableState collectAsState = Updater.collectAsState(flow, emptySet, null, gapComposer3, 48, 2);
            Object rememberedValue4 = gapComposer3.rememberedValue();
            int i7 = 15;
            if (rememberedValue4 == neverEqualPolicy) {
                CardModelView$iconTexture$$inlined$map$1 cardModelView$iconTexture$$inlined$map$1 = new CardModelView$iconTexture$$inlined$map$1(realBoostProvider.getBoostSlots(true), i7);
                gapComposer3.updateRememberedValue(cardModelView$iconTexture$$inlined$map$1);
                rememberedValue4 = cardModelView$iconTexture$$inlined$map$1;
            }
            MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue4, emptySet, null, gapComposer3, 48, 2);
            Object rememberedValue5 = gapComposer3.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = FlowKt.distinctUntilChanged(new RealBoostRepository$getAllOrderedBoosts$$inlined$map$1(realBoostProvider.getCategorizedBoosts(), i4));
                gapComposer3.updateRememberedValue(rememberedValue5);
            }
            MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue5, EmptyList.INSTANCE, null, gapComposer3, 48, 2);
            List list = (List) collectAsState3.getValue();
            if ((list instanceof Collection) && list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (((Set) collectAsState.getValue()).contains(((RewardWithSelection) it.next()).token) && (i2 = i2 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                        throw null;
                    }
                }
            }
            boolean z2 = i2 > 0;
            AndroidStringManager androidStringManager = this.stringManager;
            if (z2) {
                Object[] objArr = {Integer.valueOf(i2)};
                Resources resources = androidStringManager.resources;
                resources.getClass();
                str = new MessageFormat(resources.getString(R.string.offers_module_button_subtitle_text_active)).format(objArr);
                str.getClass();
            } else {
                str = androidStringManager.get(R.string.offers_module_button_subtitle_text_inactive);
            }
            String str3 = str;
            List list2 = (List) collectAsState3.getValue();
            Set set = (Set) collectAsState2.getValue();
            Set set2 = (Set) collectAsState.getValue();
            boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$BankingCashGreenRelease.INSTANCE)).enabled();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                RewardWithSelection rewardWithSelection = (RewardWithSelection) obj;
                if (enabled || !set.contains(rewardWithSelection.token)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                RewardWithSelection rewardWithSelection2 = (RewardWithSelection) next;
                if (!z2 || set2.contains(rewardWithSelection2.token)) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                RewardWithSelection rewardWithSelection3 = (RewardWithSelection) it3.next();
                if (rewardWithSelection3 == null || (uiRewardAvatars = rewardWithSelection3.avatars) == null || (iterable = uiRewardAvatars.reward_avatars) == null) {
                    iterable = EmptyList.INSTANCE;
                }
                ArrayList arrayList4 = new ArrayList();
                for (UiRewardAvatar uiRewardAvatar : iterable) {
                    Image image = uiRewardAvatar.image;
                    if (image == null) {
                        String str4 = uiRewardAvatar.url;
                        image = str4 != null ? new Image(str4, str4, 4) : null;
                    }
                    if (image != null) {
                        arrayList4.add(image);
                    }
                }
                Image image2 = (Image) CollectionsKt.firstOrNull((List) arrayList4);
                if (image2 != null) {
                    String str5 = rewardWithSelection3.title;
                    avatar = new StackedAvatarViewModel.Avatar(null, str5 != null ? StringsKt___StringsKt.firstOrNull(str5) : null, rewardWithSelection3.title, image2, null, null, null, null, false, false, null, false, null, null, 131057);
                } else {
                    avatar = null;
                }
                if (avatar != null) {
                    arrayList3.add(avatar);
                }
            }
            List take = CollectionsKt.take(arrayList3, 3);
            int size = take.size();
            StackedAvatarViewModel.Trio trio = size != 0 ? size != 1 ? size != 2 ? new StackedAvatarViewModel.Trio((StackedAvatarViewModel.Avatar) take.get(0), (StackedAvatarViewModel.Avatar) take.get(1), (StackedAvatarViewModel.Avatar) take.get(2), false, 0) : new StackedAvatarViewModel.Duo((StackedAvatarViewModel.Avatar) take.get(0), (StackedAvatarViewModel.Avatar) take.get(1)) : new StackedAvatarViewModel.Single((StackedAvatarViewModel.Avatar) CollectionsKt.first(take)) : null;
            if (trio == null) {
                zzd zzdVar2 = Icons.Companion;
                stackedAvatarViewModel = new StackedAvatarViewModel.Single(new StackedAvatarViewModel.Avatar(null, null, null, null, null, new Icon("B06Lkl"), null, null, false, false, null, true, null, null, 114655));
            } else {
                stackedAvatarViewModel = trio;
            }
            CardSchemeViewModel.Module.Icon.Avatar.AvatarSize avatarSize = CardSchemeViewModel.Module.Icon.Avatar.AvatarSize.LARGE;
            CardSchemeViewModel.Module.Icon.Avatar avatar2 = new CardSchemeViewModel.Module.Icon.Avatar(stackedAvatarViewModel);
            String str6 = z2 ? androidStringManager.get(R.string.offers_module_button_label_text_active) : androidStringManager.get(R.string.offers_module_button_label_text_inactive);
            String translated3 = localizedString != null ? com.squareup.util.cash.StringsKt.translated(localizedString) : null;
            boolean areEqual2 = Intrinsics.areEqual(bool, Boolean.TRUE);
            boolean changedInstance = gapComposer3.changedInstance(coroutineScope) | gapComposer3.changedInstance(this) | gapComposer3.changed(z2);
            Object rememberedValue6 = gapComposer3.rememberedValue();
            if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new g6$$ExternalSyntheticLambda11(coroutineScope, (Object) this, z2, 15);
                gapComposer3.updateRememberedValue(rememberedValue6);
            }
            CardSchemeViewModel.Module.StatusModule statusModule4 = new CardSchemeViewModel.Module.StatusModule(avatar2, str6, str3, translated3, areEqual2, new CardSchemeViewModel.Module.Accessory.Push(null, (Function0) rememberedValue6), null, 192);
            z = false;
            gapComposer3.end(false);
            statusModule = statusModule4;
        } else {
            gapComposer3.end(false);
            z = false;
        }
        gapComposer3.end(z);
        return statusModule;
    }

    public final CardSchemeViewModel.Module.Accessory.Push toAccessory(CardModule.Push push, Event event, Composer composer, int i) {
        Event event2 = (i & 1) != 0 ? null : event;
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            LocalizedString localizedString = push.text;
            rememberedValue2 = new CardSchemeViewModel.Module.Accessory.Push(localizedString != null ? com.squareup.util.cash.StringsKt.translated(localizedString) : null, new UiWorkflow$$ExternalSyntheticLambda25(event2, push, this, coroutineScope, 14));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        return (CardSchemeViewModel.Module.Accessory.Push) rememberedValue2;
    }
}
