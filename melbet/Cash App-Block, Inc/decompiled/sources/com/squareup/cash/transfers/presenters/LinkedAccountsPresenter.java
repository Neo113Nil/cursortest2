package com.squareup.cash.transfers.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadm;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.benefits.applets.presenters.BankingBenefitsAppletTilePresenter$WhenMappings;
import com.squareup.cash.benefits.applets.presenters.BankingBenefitsAppletTilePresenter$onTileClick$1;
import com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel;
import com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel$Installed$Default;
import com.squareup.cash.benefits.applets.viewmodels.Subtitle;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.benefits.screens.PdsaBenefitsExplainerScreen;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$CashGreenPdsaExplainerHalfSheet;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersLinkedAccountsStackedCardsUx;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersUseInstrumentCardArt;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileBankingEvergreenProgressBar;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gcl.RealMarketAttributesProvider;
import com.squareup.cash.instruments.backend.api.InstrumentLinkingOptionManager$InstrumentLinkingOption;
import com.squareup.cash.instruments.backend.real.RealInstrumentLinkingOptionManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.intent.RealDeepLinking;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.chat.views.ChatInputView$Content$1$1$1;
import com.squareup.cash.tax.views.TaxReturnsView$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.screens.LinkedAccountsScreen;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsViewEvent;
import com.squareup.cash.transfers.viewmodels.LinkedAccountsViewModel;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAmount;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.bankingbenefits.ui.CashGreenV1;
import squareup.cash.bankingbenefits.ui.PathProgress;
import squareup.cash.bankingbenefits.ui.PathProgress$Progress$Spend;
import squareup.cash.bankingbenefits.ui.RiskStatus;
import squareup.cash.bankingbenefits.ui.SpendPathProgress;

/* loaded from: classes7.dex */
public final class LinkedAccountsPresenter implements MoleculePresenter {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object analytics;
    public final Object args;
    public final Object clientSyncer;
    public final Object errorReporter;
    public final Object flowStarter;
    public final Object instrumentLinkingOptionManager;
    public final Object instrumentManager;
    public final Object navigator;
    public final AndroidStringManager stringManager;
    public final SyncValueReader syncValueReader;
    public final boolean useInstrumentCardArt;
    public final boolean useStackedCardsUx;

    public final class InstrumentLinkingOptionsMetadata {
        public final String linkingOptionCtaLabel;
        public final String linkingOptionsTitle;

        public InstrumentLinkingOptionsMetadata(String str, String str2) {
            str.getClass();
            this.linkingOptionsTitle = str;
            this.linkingOptionCtaLabel = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InstrumentLinkingOptionsMetadata)) {
                return false;
            }
            InstrumentLinkingOptionsMetadata instrumentLinkingOptionsMetadata = (InstrumentLinkingOptionsMetadata) obj;
            return Intrinsics.areEqual(this.linkingOptionsTitle, instrumentLinkingOptionsMetadata.linkingOptionsTitle) && Intrinsics.areEqual(this.linkingOptionCtaLabel, instrumentLinkingOptionsMetadata.linkingOptionCtaLabel);
        }

        public final int hashCode() {
            int hashCode = this.linkingOptionsTitle.hashCode() * 31;
            String str = this.linkingOptionCtaLabel;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("InstrumentLinkingOptionsMetadata(linkingOptionsTitle=", this.linkingOptionsTitle, ", linkingOptionCtaLabel=", this.linkingOptionCtaLabel, ")");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/transfers/presenters/LinkedAccountsPresenter$MultipleInstrumentLinkingOptionsOfSameTypeError", "Lcom/squareup/cash/observability/types/ReportedError;", "presenters"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final class MultipleInstrumentLinkingOptionsOfSameTypeError extends ReportedError {
        public final Set features;
        public final CashInstrumentType instrumentType;

        public MultipleInstrumentLinkingOptionsOfSameTypeError(CashInstrumentType cashInstrumentType) {
            cashInstrumentType.getClass();
            this.instrumentType = cashInstrumentType;
            this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.InstrumentLinkingOptions.INSTANCE);
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return this.features;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return BalanceFeedKt$$ExternalSyntheticOutline0.m("InstrumentLinkingOptions", Thread$State$EnumUnboxingLocalUtility.m("instrument_type", this.instrumentType.name()));
        }
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CashInstrumentType.values().length];
            try {
                iArr[CashInstrumentType.DEBIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CashInstrumentType.BANK_ACCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CashInstrumentType.CREDIT_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InstrumentLinkingOptionManager$InstrumentLinkingOption.LinkingAction.LinkType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                InstrumentLinkingOptionManager$InstrumentLinkingOption.LinkingAction.LinkType linkType = InstrumentLinkingOptionManager$InstrumentLinkingOption.LinkingAction.LinkType.LINK;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public LinkedAccountsPresenter(AndroidDateFormatManager androidDateFormatManager, FeatureFlagManager featureFlagManager, LocalizedMoneyFormatter.Factory factory, RealRouter$Factory$Impl realRouter$Factory$Impl, AndroidStringManager androidStringManager, SyncValueReader syncValueReader, MoneyAnalyticsService moneyAnalyticsService, RealFamilyAccountsManager realFamilyAccountsManager, PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl, KeyValue keyValue, Navigator navigator) {
        navigator.getClass();
        this.stringManager = androidStringManager;
        this.syncValueReader = syncValueReader;
        this.analytics = moneyAnalyticsService;
        this.instrumentManager = realFamilyAccountsManager;
        this.instrumentLinkingOptionManager = keyValue;
        this.flowStarter = navigator;
        TimeZone timeZone = TimeZone.getTimeZone(ZoneId.of("America/New_York"));
        timeZone.getClass();
        this.clientSyncer = androidDateFormatManager.getDateFormat("MMM d", timeZone).formatter;
        this.errorReporter = factory.create(MoneyFormatterConfig.STANDARD);
        this.args = realRouter$Factory$Impl.create$1(navigator);
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.useInstrumentCardArt = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.peekCurrentValue(AmplitudeExperiments$CashGreenPdsaExplainerHalfSheet.INSTANCE)).enabled();
        this.useStackedCardsUx = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$MobileBankingEvergreenProgressBar.INSTANCE)).enabled();
        this.navigator = promotedAppletTilePresenter$Factory$Impl.create(AppletId.BANKING_BENEFITS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0082, code lost:
    
        if (r4.set(r1, r5) == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$onTileClick(LinkedAccountsPresenter linkedAccountsPresenter, CashGreenV1 cashGreenV1, boolean z, ContinuationImpl continuationImpl) {
        BankingBenefitsAppletTilePresenter$onTileClick$1 bankingBenefitsAppletTilePresenter$onTileClick$1;
        Object obj;
        int i;
        CashGreenV1 cashGreenV12;
        boolean z2;
        KeyValue keyValue = (KeyValue) linkedAccountsPresenter.instrumentLinkingOptionManager;
        if (continuationImpl instanceof BankingBenefitsAppletTilePresenter$onTileClick$1) {
            bankingBenefitsAppletTilePresenter$onTileClick$1 = (BankingBenefitsAppletTilePresenter$onTileClick$1) continuationImpl;
            int i2 = bankingBenefitsAppletTilePresenter$onTileClick$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bankingBenefitsAppletTilePresenter$onTileClick$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = bankingBenefitsAppletTilePresenter$onTileClick$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bankingBenefitsAppletTilePresenter$onTileClick$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) linkedAccountsPresenter.analytics)).submitSelectItemEvent(z ? ItemId.PROMOTED_BANKING_BENEFITS.INSTANCE : ItemId.BANKING_BENEFITS.INSTANCE, null, MoneySelectAction.TAP);
                    if (linkedAccountsPresenter.useInstrumentCardArt) {
                        if ((cashGreenV1 != null ? cashGreenV1.status_method : null) == CashGreenV1.StatusMethod.DIRECT_DEPOSIT) {
                            bankingBenefitsAppletTilePresenter$onTileClick$1.L$0 = cashGreenV1;
                            bankingBenefitsAppletTilePresenter$onTileClick$1.Z$0 = z;
                            bankingBenefitsAppletTilePresenter$onTileClick$1.label = 1;
                            obj = keyValue.get(bankingBenefitsAppletTilePresenter$onTileClick$1);
                            if (obj != coroutineSingletons) {
                                cashGreenV12 = cashGreenV1;
                                z2 = z;
                            }
                            return coroutineSingletons;
                        }
                    }
                    cashGreenV12 = cashGreenV1;
                    ((RealRouter) linkedAccountsPresenter.args).route(new RoutingParams(new MoneyTabScreen(null), null, null, null, null, null, 510), cashGreenV12 != null ? cashGreenV12.client_route : null);
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    ((Navigator) linkedAccountsPresenter.flowStarter).goTo(PdsaBenefitsExplainerScreen.INSTANCE);
                    return Unit.INSTANCE;
                }
                boolean z3 = bankingBenefitsAppletTilePresenter$onTileClick$1.Z$0;
                CashGreenV1 cashGreenV13 = bankingBenefitsAppletTilePresenter$onTileClick$1.L$0;
                SafeTrace.throwOnFailure(obj);
                z2 = z3;
                cashGreenV12 = cashGreenV13;
                if (!((Boolean) obj).booleanValue()) {
                    Boolean bool = Boolean.TRUE;
                    bankingBenefitsAppletTilePresenter$onTileClick$1.L$0 = null;
                    bankingBenefitsAppletTilePresenter$onTileClick$1.Z$0 = z2;
                    bankingBenefitsAppletTilePresenter$onTileClick$1.label = 2;
                }
                ((RealRouter) linkedAccountsPresenter.args).route(new RoutingParams(new MoneyTabScreen(null), null, null, null, null, null, 510), cashGreenV12 != null ? cashGreenV12.client_route : null);
                return Unit.INSTANCE;
            }
        }
        bankingBenefitsAppletTilePresenter$onTileClick$1 = new BankingBenefitsAppletTilePresenter$onTileClick$1(linkedAccountsPresenter, continuationImpl);
        obj = bankingBenefitsAppletTilePresenter$onTileClick$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bankingBenefitsAppletTilePresenter$onTileClick$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        ((RealRouter) linkedAccountsPresenter.args).route(new RoutingParams(new MoneyTabScreen(null), null, null, null, null, null, 510), cashGreenV12 != null ? cashGreenV12.client_route : null);
        return Unit.INSTANCE;
    }

    public static Float computeProgress(CashGreenV1 cashGreenV1) {
        Double d;
        if (cashGreenV1.status_method != CashGreenV1.StatusMethod.DIRECT_DEPOSIT) {
            SpendPathProgress spendPath = spendPath(cashGreenV1);
            Float valueOf = (spendPath == null || (d = spendPath.percent_complete) == null) ? null : Float.valueOf((float) d.doubleValue());
            CashGreenV1.Status status = cashGreenV1.status;
            int i = status == null ? -1 : BankingBenefitsAppletTilePresenter$WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i != -1 && i != 1) {
                if (i == 2 || i == 3) {
                    valueOf.getClass();
                    float floatValue = valueOf.floatValue();
                    if (floatValue >= RecyclerView.DECELERATION_RATE && floatValue < 1.0f) {
                        return valueOf;
                    }
                } else if (i == 4) {
                    valueOf.getClass();
                    if (valueOf.floatValue() > RecyclerView.DECELERATION_RATE) {
                        return valueOf;
                    }
                } else if (i != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
        }
        return null;
    }

    public static SpendPathProgress spendPath(CashGreenV1 cashGreenV1) {
        PathProgress pathProgress = (PathProgress) CollectionsKt.firstOrNull(cashGreenV1.path_progresses);
        PathProgress$Progress$Spend pathProgress$Progress$Spend = pathProgress != null ? pathProgress.progress : null;
        if (pathProgress$Progress$Spend == null) {
            pathProgress$Progress$Spend = null;
        }
        if (pathProgress$Progress$Spend != null) {
            return pathProgress$Progress$Spend.value;
        }
        return null;
    }

    public Subtitle computeSubtitle(CashGreenV1 cashGreenV1, boolean z) {
        Subtitle subtitle;
        Long l;
        String format2;
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        CashGreenV1.Status status = cashGreenV1.status;
        status.getClass();
        SpendPathProgress spendPath = spendPath(cashGreenV1);
        Money money = spendPath != null ? spendPath.remaining_amount : null;
        money.getClass();
        String format3 = ((MoneyFormatter) this.errorReporter).format(money);
        int ordinal = status.ordinal();
        if (ordinal != 0) {
            subtitle = null;
            if (ordinal == 1) {
                Money money2 = spendPath.current_aggregated_amount;
                if (money2 != null && (l = money2.amount) != null && l.longValue() == 0) {
                    return new Subtitle(z ? androidStringManager.get(R.string.benefits_applet_subtitle_inactive_teen) : androidStringManager.get(R.string.benefits_applet_subtitle_inactive), Subtitle.Style.BODY);
                }
                if (z) {
                    return new Subtitle(androidStringManager.get(R.string.benefits_applet_subtitle_unearned_teen), Subtitle.Style.BODY);
                }
                format3.getClass();
                ArrayMap arrayMap = new ArrayMap(1);
                arrayMap.put("amount", format3);
                resources.getClass();
                String format4 = new MessageFormat(resources.getString(R.string.benefits_applet_subtitle_inactive_unearned)).format(arrayMap);
                format4.getClass();
                return new Subtitle(format4, Subtitle.Style.LABEL);
            }
            if (ordinal == 2) {
                CashGreenV1.StatusMethod statusMethod = cashGreenV1.status_method;
                RiskStatus riskStatus = cashGreenV1.risk_status;
                Long l2 = cashGreenV1.expire_at;
                DateTimeFormatter dateTimeFormatter = (DateTimeFormatter) this.clientSyncer;
                Long l3 = spendPath.period_end_at;
                l3.getClass();
                Instant ofEpochMilli = Instant.ofEpochMilli(l3.longValue());
                if (z || statusMethod == CashGreenV1.StatusMethod.DIRECT_DEPOSIT) {
                    l2.getClass();
                    String format5 = dateTimeFormatter.format(Instant.ofEpochMilli(l2.longValue()));
                    format5.getClass();
                    ArrayMap arrayMap2 = new ArrayMap(1);
                    arrayMap2.put(InquiryField.DateField.TYPE, format5);
                    resources.getClass();
                    String format6 = new MessageFormat(resources.getString(R.string.benefits_applet_subtitle_active_pdsa_unearned)).format(arrayMap2);
                    format6.getClass();
                    return new Subtitle(format6, Subtitle.Style.BODY);
                }
                Long l4 = money.amount;
                if (l4 != null && l4.longValue() == 0) {
                    Duration.Companion companion = Duration.Companion;
                    java.time.Duration ofSeconds = java.time.Duration.ofSeconds(Duration.m4176toLongimpl(DurationKt.toDuration(1, DurationUnit.DAYS), DurationUnit.SECONDS), Duration.m4169getNanosecondsComponentimpl(r2));
                    ofSeconds.getClass();
                    String format7 = dateTimeFormatter.format(ofEpochMilli.plus((TemporalAmount) ofSeconds));
                    format7.getClass();
                    ArrayMap arrayMap3 = new ArrayMap(1);
                    arrayMap3.put(InquiryField.DateField.TYPE, format7);
                    resources.getClass();
                    String format8 = new MessageFormat(resources.getString(R.string.benefits_applet_subtitle_active_earned)).format(arrayMap3);
                    format8.getClass();
                    return new Subtitle(format8, Subtitle.Style.BODY);
                }
                if (riskStatus == null) {
                    format3.getClass();
                    ArrayMap arrayMap4 = new ArrayMap(1);
                    arrayMap4.put("amount", format3);
                    resources.getClass();
                    String format9 = new MessageFormat(resources.getString(R.string.benefits_applet_subtitle_active_progressing)).format(arrayMap4);
                    format9.getClass();
                    return new Subtitle(format9, Subtitle.Style.LABEL);
                }
                String format10 = dateTimeFormatter.format(ofEpochMilli);
                format10.getClass();
                format3.getClass();
                ArrayMap arrayMap5 = new ArrayMap(2);
                arrayMap5.put("amount", format3);
                arrayMap5.put(InquiryField.DateField.TYPE, format10);
                resources.getClass();
                String format11 = new MessageFormat(resources.getString(R.string.benefits_applet_subtitle_active_at_risk)).format(arrayMap5);
                format11.getClass();
                return new Subtitle(format11, Subtitle.Style.LABEL);
            }
            if (ordinal == 3) {
                if (z) {
                    format2 = androidStringManager.get(R.string.benefits_applet_subtitle_unearned_teen);
                } else {
                    format3.getClass();
                    ArrayMap arrayMap6 = new ArrayMap(1);
                    arrayMap6.put("amount", format3);
                    resources.getClass();
                    format2 = new MessageFormat(resources.getString(R.string.benefits_applet_subtitle_inactive_unearned)).format(arrayMap6);
                    format2.getClass();
                }
                return new Subtitle(format2, Subtitle.Style.LABEL);
            }
            if (ordinal != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        } else {
            subtitle = null;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) status, "Unexpected status ");
        return subtitle;
    }

    public String computeTitle(CashGreenV1 cashGreenV1) {
        int i;
        CashGreenV1.Status status = cashGreenV1.status;
        status.getClass();
        if (status == CashGreenV1.Status.INACTIVE) {
            SpendPathProgress spendPath = spendPath(cashGreenV1);
            Money money = spendPath != null ? spendPath.current_aggregated_amount : null;
            money.getClass();
            Long l = money.amount;
            l.getClass();
            if (l.longValue() == 0) {
                i = R.string.benefits_applet_inactive_no_progress_title;
                return this.stringManager.get(i);
            }
        }
        i = R.string.benefits_apple_active_or_in_progress_title;
        return this.stringManager.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v53, types: [com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel$Loading] */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel$Installed$Default] */
    /* JADX WARN: Type inference failed for: r17v1, types: [com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel$Uninstalled] */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel$Loading] */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.squareup.cash.benefits.applets.viewmodels.BankingBenefitsAppletTileModel$Failed] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        Float f;
        int i2 = this.$r8$classId;
        Continuation continuation = null;
        Object obj = this.instrumentManager;
        SyncValueReader syncValueReader = this.syncValueReader;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i3 = 1;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1796055260);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(this);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new ChatInputView$Content$1$1$1(this, continuation, 24);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
                RealInstrumentManager realInstrumentManager = (RealInstrumentManager) obj;
                Flow runUntil = StateFlowKt.runUntil(RealInstrumentManager.syncValueBased$default(realInstrumentManager), realInstrumentManager.signOut);
                EmptyList emptyList = EmptyList.INSTANCE;
                MutableState collectAsState = Updater.collectAsState(runUntil, emptyList, null, gapComposer, 48, 2);
                MutableState collectAsState2 = Updater.collectAsState(((RealInstrumentLinkingOptionManager) this.instrumentLinkingOptionManager).select(), emptyList, null, gapComposer, 48, 2);
                MutableState collectAsState3 = Updater.collectAsState(syncValueReader.getSingleValueOrDefault(AndroidSyncValueSpecs.MultiInstrumentLinkingOptions, null, new AlertBannerKt$$ExternalSyntheticLambda3(this, i3)), null, null, gapComposer, 48, 2);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = Updater.mutableStateOf$default(LinkedAccountsViewModel.Loading.INSTANCE);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState3 = (MutableState) rememberedValue2;
                List list = (List) collectAsState.getValue();
                List list2 = (List) collectAsState2.getValue();
                boolean changed = gapComposer.changed(collectAsState) | gapComposer.changed(collectAsState2) | gapComposer.changedInstance(this) | gapComposer.changed(collectAsState3);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed || rememberedValue3 == neverEqualPolicy) {
                    mutableState = collectAsState2;
                    WorkflowLayout$start$1 workflowLayout$start$1 = new WorkflowLayout$start$1(collectAsState, mutableState, this, collectAsState3, mutableState3, null, 8);
                    mutableState2 = mutableState3;
                    gapComposer.updateRememberedValue(workflowLayout$start$1);
                    rememberedValue3 = workflowLayout$start$1;
                } else {
                    mutableState2 = mutableState3;
                    mutableState = collectAsState2;
                }
                Updater.LaunchedEffect(list, list2, (Function2) rememberedValue3, gapComposer);
                boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changed(collectAsState) | gapComposer.changed(mutableState);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new TaxReturnsView$$ExternalSyntheticLambda1(7, this, collectAsState, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Function2 function2 = (Function2) rememberedValue4;
                AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
                boolean changed2 = gapComposer.changed(function2) | gapComposer.changedInstance(answerDispatcher);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new LinkedAccountsPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 0);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue5, gapComposer);
                Updater.LaunchedEffect(gapComposer, flow, new WorkflowLayout$start$1(flow, (Continuation) null, this, collectAsState3, mutableState, 7));
                LinkedAccountsViewModel linkedAccountsViewModel = (LinkedAccountsViewModel) mutableState2.getValue();
                gapComposer.end(false);
                return linkedAccountsViewModel;
            default:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1849011793);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = syncValueReader.getSingleValue(AndroidSyncValueSpecs.CashGreen, new BenefitsHubViewKt$$ExternalSyntheticLambda2(1));
                    gapComposer2.updateRememberedValue(rememberedValue6);
                }
                MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue6, gapComposer2);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                if (rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = ((RealFamilyAccountsManager) obj).isSponsored();
                    gapComposer2.updateRememberedValue(rememberedValue7);
                }
                Continuation continuation2 = null;
                MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue7, null, gapComposer2, 1);
                VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) this.navigator;
                verifyCheckDialogPresenter.getClass();
                gapComposer2.startReplaceGroup(-1613152821);
                boolean changed3 = gapComposer2.changed(((AppletId) verifyCheckDialogPresenter.navigator).ordinal());
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue8 == neverEqualPolicy) {
                    rememberedValue8 = new InviteContactsPresenter$special$$inlined$map$1(((RealPromotedAppletTileStore) verifyCheckDialogPresenter.args).getPromotedAppletTiles(), verifyCheckDialogPresenter, 17);
                    gapComposer2.updateRememberedValue(rememberedValue8);
                }
                PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) Updater.collectAsState((Flow) rememberedValue8, PromotedAppletTileViewModel.Loading.INSTANCE, null, gapComposer2, 0, 2).getValue();
                gapComposer2.end(false);
                PromotedAppletTileViewModel.Loaded loaded = promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded ? (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel : null;
                CashGreenV1 cashGreenV1 = (CashGreenV1) receiveValueAsState.getValue();
                if (cashGreenV1 == null || (f = computeProgress(cashGreenV1)) == null || ((Boolean) collectAsState4.getValue()).booleanValue()) {
                    f = null;
                }
                Object rememberedValue9 = gapComposer2.rememberedValue();
                if (rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = Recorder$$ExternalSyntheticOutline2.m(f != null ? f.floatValue() : RecyclerView.DECELERATION_RATE, gapComposer2);
                }
                MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue9;
                Updater.LaunchedEffect(gapComposer2, flow, new BenefitsHubPresenter$models$1$1(13, receiveValueAsState, flow, this, continuation2));
                CashGreenV1 cashGreenV12 = (CashGreenV1) receiveValueAsState.getValue();
                AndroidStringManager androidStringManager = this.stringManager;
                if (cashGreenV12 != null) {
                    CashGreenV1 cashGreenV13 = (CashGreenV1) receiveValueAsState.getValue();
                    cashGreenV13.getClass();
                    CashGreenV1.Status status = cashGreenV13.status;
                    int i4 = status == null ? -1 : BankingBenefitsAppletTilePresenter$WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
                    if (i4 != -1) {
                        if (i4 != 1) {
                            boolean z = this.useStackedCardsUx;
                            if (i4 == 2) {
                                CashGreenV1 cashGreenV14 = (CashGreenV1) receiveValueAsState.getValue();
                                cashGreenV14.getClass();
                                boolean booleanValue = ((Boolean) collectAsState4.getValue()).booleanValue();
                                Float valueOf = z ? Float.valueOf(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue()) : null;
                                String computeTitle = computeTitle(cashGreenV14);
                                CashGreenV1.Status status2 = cashGreenV14.status;
                                status2.getClass();
                                continuation = new BankingBenefitsAppletTileModel$Installed$Default(computeTitle, zzadm.access$toGreenStatus(status2), computeSubtitle(cashGreenV14, booleanValue), !booleanValue ? computeProgress(cashGreenV14) : null, !booleanValue ? valueOf : null);
                            } else if (i4 == 3 || i4 == 4) {
                                CashGreenV1 cashGreenV15 = (CashGreenV1) receiveValueAsState.getValue();
                                cashGreenV15.getClass();
                                boolean booleanValue2 = ((Boolean) collectAsState4.getValue()).booleanValue();
                                Float valueOf2 = z ? Float.valueOf(((ParcelableSnapshotMutableFloatState) mutableFloatState).getFloatValue()) : null;
                                String computeTitle2 = computeTitle(cashGreenV15);
                                CashGreenV1.Status status3 = cashGreenV15.status;
                                status3.getClass();
                                continuation = new BankingBenefitsAppletTileModel.Uninstalled(computeTitle2, loaded, zzadm.access$toGreenStatus(status3), computeSubtitle(cashGreenV15, booleanValue2), !booleanValue2 ? computeProgress(cashGreenV15) : null, !booleanValue2 ? valueOf2 : null);
                            } else if (i4 != 5) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return continuation;
                            }
                        } else {
                            continuation = new BankingBenefitsAppletTileModel.Loading("");
                        }
                    }
                    CashGreenV1 cashGreenV16 = (CashGreenV1) receiveValueAsState.getValue();
                    cashGreenV16.getClass();
                    CashGreenV1.Status status4 = cashGreenV16.status;
                    continuation = new BankingBenefitsAppletTileModel.Failed(androidStringManager.get(R.string.benefits_applet_inactive_no_progress_title), new IllegalArgumentException("Unexpected status: " + status4));
                } else {
                    continuation = new BankingBenefitsAppletTileModel.Loading(androidStringManager.get(R.string.benefits_applet_inactive_no_progress_title));
                }
                gapComposer2.end(false);
                return continuation;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r8 = "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LinkedAccountsViewModel.Ready.InstrumentSection.InstrumentRow toInstrumentRow(Instrument instrument, InstrumentIcon.IconShape iconShape, boolean z) {
        Icons icons;
        String str;
        String str2 = instrument.accessoryIconId;
        String str3 = instrument.displayName;
        if (str2 != null) {
            Icons.Companion.getClass();
            icons = zzd.get(str2);
        } else {
            icons = null;
        }
        String str4 = instrument.accessoryText;
        if (z) {
            String cardInfoLabel = UtilsKt.cardInfoLabel(instrument, this.stringManager);
            if (cardInfoLabel != null) {
                str = cardInfoLabel;
            }
        }
        return new LinkedAccountsViewModel.Ready.InstrumentSection.InstrumentRow(new InstrumentCellViewModel(str, instrument.bankName, !Intrinsics.areEqual(instrument.pendingVerification, Boolean.TRUE), CollectionsKt__CollectionsJVMKt.listOf(GoogleMapKt.instrumentIcon$default(instrument, icons, iconShape, 4)), InstrumentCellViewModel.Accessory.Push.INSTANCE, str4 != null ? new InstrumentCellViewModel.InstrumentLabel(str4, InstrumentCellViewModel.InstrumentLabel.Color.DEFAULT) : null, null, null, CollectionsKt.joinToString$default(ArraysKt___ArraysKt.filterNotNull(new String[]{str3, instrument.bankName}), " ", null, null, 0, null, null, 62), 192), new LinkedAccountsViewEvent.ShowCardOptionsSheet(instrument.cashInstrumentType, instrument.token));
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final Provider clientSyncer;
        public final LambdaProvider errorReporter;
        public final DoubleCheck featureFlagManager;
        public final DoubleCheck flowStarter;
        public final Provider instrumentLinkingOptionManager;
        public final Provider instrumentManager;
        public final LambdaProvider stringManager;
        public final DoubleCheck syncValueReader;

        public MetroFactory(DoubleCheck doubleCheck, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, IntentLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck4) {
            this.analytics = doubleCheck;
            this.instrumentManager = walletUiFactory$MetroFactory;
            this.stringManager = lambdaProvider;
            this.syncValueReader = doubleCheck2;
            this.instrumentLinkingOptionManager = broadwayModule$ProvideBroadwayMetroFactory;
            this.clientSyncer = metroFactory;
            this.flowStarter = doubleCheck3;
            this.errorReporter = lambdaProvider2;
            this.featureFlagManager = doubleCheck4;
        }

        public MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, RealMarketAttributesProvider.MetroFactory metroFactory, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider, RealKnotLauncher.MetroFactory metroFactory2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck4) {
            this.analytics = doubleCheck;
            this.syncValueReader = doubleCheck2;
            this.instrumentManager = walletUiFactory$MetroFactory;
            this.instrumentLinkingOptionManager = metroFactory;
            this.flowStarter = doubleCheck3;
            this.stringManager = lambdaProvider;
            this.clientSyncer = metroFactory2;
            this.errorReporter = lambdaProvider2;
            this.featureFlagManager = doubleCheck4;
        }

        public MetroFactory(InstanceFactory instanceFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck4, RealDeepLinking.MetroFactory metroFactory, LambdaProvider lambdaProvider2) {
            this.instrumentManager = instanceFactory;
            this.analytics = doubleCheck;
            this.syncValueReader = doubleCheck2;
            this.flowStarter = doubleCheck3;
            this.instrumentLinkingOptionManager = broadwayModule$ProvideBroadwayMetroFactory;
            this.stringManager = lambdaProvider;
            this.featureFlagManager = doubleCheck4;
            this.clientSyncer = metroFactory;
            this.errorReporter = lambdaProvider2;
        }
    }

    public LinkedAccountsPresenter(Analytics analytics, SyncValueReader syncValueReader, RealInstrumentManager realInstrumentManager, RealInstrumentLinkingOptionManager realInstrumentLinkingOptionManager, FlowStarter flowStarter, AndroidStringManager androidStringManager, RealClientSyncer realClientSyncer, ErrorReporter errorReporter, FeatureFlagManager featureFlagManager, LinkedAccountsScreen linkedAccountsScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        linkedAccountsScreen.getClass();
        this.analytics = analytics;
        this.syncValueReader = syncValueReader;
        this.instrumentManager = realInstrumentManager;
        this.instrumentLinkingOptionManager = realInstrumentLinkingOptionManager;
        this.flowStarter = flowStarter;
        this.stringManager = androidStringManager;
        this.clientSyncer = realClientSyncer;
        this.errorReporter = errorReporter;
        this.args = linkedAccountsScreen;
        this.navigator = screenNavigator;
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.useInstrumentCardArt = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$ClientTransfersUseInstrumentCardArt.INSTANCE)).enabled();
        this.useStackedCardsUx = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$ClientTransfersLinkedAccountsStackedCardsUx.INSTANCE)).enabled();
    }
}
