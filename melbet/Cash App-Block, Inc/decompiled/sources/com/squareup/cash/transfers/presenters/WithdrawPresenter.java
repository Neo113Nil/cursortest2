package com.squareup.cash.transfers.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.n;
import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cash.R;
import com.squareup.cash.banking.backend.api.ConfirmCashOutVersionCode;
import com.squareup.cash.banking.backend.real.RealConfirmCashOutVersionCodeProvider;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.cash.CashWithdrawEnterAmount;
import com.squareup.cash.cdf.cash.CashWithdrawViewed;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersMultiLinkingUxButtons;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersUseInstrumentCardArt;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$TransfersImprovedFeePrecisionCalculation;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.instruments.backend.api.InstrumentManagerKt;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.out.sync_entity.SupportedFlows;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda10;
import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.backend.api.CashOutCapabilityManager$CashOutCapabilities;
import com.squareup.cash.transfers.backend.api.TransfersWithdrawManager;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferFee;
import com.squareup.cash.transfers.screens.WithdrawScreen;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel$AmountConfig$KeypadConfig;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.common.ConfirmationSheetData;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import com.squareup.protos.franklin.common.DepositPreferenceOption;
import com.squareup.protos.franklin.common.SignalsContext;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.cash.Bps;
import com.withpersona.sdk2.inquiry.logger.Logger$_log$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class WithdrawPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final WithdrawScreen args;
    public final SizeMap cashOutCapabilityManager;
    public final MoneyFormatter compactFormatter;
    public final RealConfirmCashOutVersionCodeProvider confirmCashOutVersionCodeProvider;
    public final RealInstrumentManager instrumentManager;
    public final boolean multiLinkingUxButtonsEnabled;
    public final BetterNavigator.ScreenNavigator navigator;
    public final SecuritySignalsAggregator securitySignalsAggregator;
    public final MoneyFormatter standardFormatter;
    public final AndroidStringManager stringManager;
    public final n transferActionProcessor;
    public final TransferData transferData;
    public final TransferManager transferManager;
    public final boolean useImprovedFeePrecision;
    public final boolean useInstrumentCardArt;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InputMode {
        public static final /* synthetic */ InputMode[] $VALUES;
        public static final InputMode CHANGE_AMOUNT;
        public static final InputMode VIEW_AMOUNT;

        static {
            InputMode inputMode = new InputMode("VIEW_AMOUNT", 0);
            VIEW_AMOUNT = inputMode;
            InputMode inputMode2 = new InputMode("CHANGE_AMOUNT", 1);
            CHANGE_AMOUNT = inputMode2;
            $VALUES = new InputMode[]{inputMode, inputMode2};
        }

        public static InputMode valueOf(String str) {
            return (InputMode) Enum.valueOf(InputMode.class, str);
        }

        public static InputMode[] values() {
            return (InputMode[]) $VALUES.clone();
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InputMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InputMode inputMode = InputMode.VIEW_AMOUNT;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[DepositPreference.values().length];
            try {
                iArr2[DepositPreference.TRANSFER_INSTANTLY_WITH_FEE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DepositPreference.TRANSFER_SLOWLY_WITHOUT_FEE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public WithdrawPresenter(TransferManager transferManager, TransferActionProcessor$Factory$Impl transferActionProcessor$Factory$Impl, RealInstrumentManager realInstrumentManager, SizeMap sizeMap, RealConfirmCashOutVersionCodeProvider realConfirmCashOutVersionCodeProvider, SecuritySignalsAggregator securitySignalsAggregator, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, Analytics analytics, LocalizedMoneyFormatter.Factory factory, WithdrawScreen withdrawScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        withdrawScreen.getClass();
        this.transferManager = transferManager;
        this.instrumentManager = realInstrumentManager;
        this.cashOutCapabilityManager = sizeMap;
        this.confirmCashOutVersionCodeProvider = realConfirmCashOutVersionCodeProvider;
        this.securitySignalsAggregator = securitySignalsAggregator;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.args = withdrawScreen;
        this.navigator = screenNavigator;
        this.transferActionProcessor = transferActionProcessor$Factory$Impl.create(transferManager);
        TransferData transferData = withdrawScreen.blockersData.transferData;
        transferData.getClass();
        this.transferData = transferData;
        this.standardFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        this.compactFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.multiLinkingUxButtonsEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$ClientTransfersMultiLinkingUxButtons.INSTANCE)).enabled();
        this.useImprovedFeePrecision = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$TransfersImprovedFeePrecisionCalculation.INSTANCE)).enabled();
        this.useInstrumentCardArt = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$ClientTransfersUseInstrumentCardArt.INSTANCE)).enabled();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0130, code lost:
    
        if (((com.squareup.cash.data.transfers.RealTransferManager) r3).processTransfer(r0, r5) != r6) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$initiateCashOut(WithdrawPresenter withdrawPresenter, Money money, Instrument instrument, WithdrawViewModel.DepositPreferenceOption depositPreferenceOption, SignalsContext signalsContext, ContinuationImpl continuationImpl) {
        WithdrawPresenter$initiateCashOut$1 withdrawPresenter$initiateCashOut$1;
        int i;
        Instrument instrument2;
        Money money2;
        SignalsContext signalsContext2;
        WithdrawViewModel.DepositPreferenceOption depositPreferenceOption2 = depositPreferenceOption;
        WithdrawScreen withdrawScreen = withdrawPresenter.args;
        if (continuationImpl instanceof WithdrawPresenter$initiateCashOut$1) {
            withdrawPresenter$initiateCashOut$1 = (WithdrawPresenter$initiateCashOut$1) continuationImpl;
            int i2 = withdrawPresenter$initiateCashOut$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                withdrawPresenter$initiateCashOut$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = withdrawPresenter$initiateCashOut$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = withdrawPresenter$initiateCashOut$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = withdrawPresenter.analytics;
                    CashWithdrawEnterAmount.EntryMethod entryMethod = CashWithdrawEnterAmount.EntryMethod.KEYPAD;
                    Long l = money.amount;
                    Integer num = l != null ? new Integer((int) l.longValue()) : null;
                    CurrencyCode currencyCode = money.currency_code;
                    analytics.track(new CashWithdrawEnterAmount(currencyCode != null ? com.squareup.cash.integration.analytics.UtilsKt.getAsCdfCurrencyCode(currencyCode) : null, num, withdrawScreen.blockersData.flowToken), null);
                    ConfirmationSheetData confirmationSheetData = depositPreferenceOption2.confirmSheetData;
                    withdrawPresenter$initiateCashOut$1.L$0 = money;
                    instrument2 = instrument;
                    withdrawPresenter$initiateCashOut$1.L$1 = instrument2;
                    withdrawPresenter$initiateCashOut$1.L$2 = depositPreferenceOption2;
                    withdrawPresenter$initiateCashOut$1.L$3 = signalsContext;
                    withdrawPresenter$initiateCashOut$1.label = 1;
                    obj = withdrawPresenter.shouldShowConfirmDialog(confirmationSheetData, withdrawPresenter$initiateCashOut$1);
                    if (obj != obj2) {
                        money2 = money;
                        signalsContext2 = signalsContext;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SignalsContext signalsContext3 = withdrawPresenter$initiateCashOut$1.L$3;
                depositPreferenceOption2 = withdrawPresenter$initiateCashOut$1.L$2;
                instrument2 = withdrawPresenter$initiateCashOut$1.L$1;
                Money money3 = withdrawPresenter$initiateCashOut$1.L$0;
                SafeTrace.throwOnFailure(obj);
                signalsContext2 = signalsContext3;
                money2 = money3;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                TransferManager transferManager = withdrawPresenter.transferManager;
                BlockersData blockersData = withdrawScreen.blockersData;
                TransferData transferData = withdrawPresenter.transferData;
                com.squareup.protos.franklin.api.Instrument proto = instrument2 == null ? InstrumentManagerKt.toProto(instrument2) : null;
                TransferFee transferFee = depositPreferenceOption2.fee;
                DepositPreference depositPreference = depositPreferenceOption2.depositPreference;
                ConfirmationSheetData confirmationSheetData2 = depositPreferenceOption2.confirmSheetData;
                BlockersData copy$default = BlockersData.copy$default(blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, TransferData.copy$default(transferData, money2, depositPreference, transferFee, signalsContext2, (confirmationSheetData2 == null && booleanValue) ? confirmationSheetData2 : null, bool, null, proto, 12654), null, null, null, null, null, null, null, null, null, false, null, null, null, -1, 65531);
                withdrawPresenter$initiateCashOut$1.L$0 = null;
                withdrawPresenter$initiateCashOut$1.L$1 = null;
                withdrawPresenter$initiateCashOut$1.L$2 = null;
                withdrawPresenter$initiateCashOut$1.L$3 = null;
                withdrawPresenter$initiateCashOut$1.label = 2;
            }
        }
        withdrawPresenter$initiateCashOut$1 = new WithdrawPresenter$initiateCashOut$1(withdrawPresenter, continuationImpl);
        Object obj3 = withdrawPresenter$initiateCashOut$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = withdrawPresenter$initiateCashOut$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj3;
        boolean booleanValue2 = bool2.booleanValue();
        TransferManager transferManager2 = withdrawPresenter.transferManager;
        BlockersData blockersData2 = withdrawScreen.blockersData;
        TransferData transferData2 = withdrawPresenter.transferData;
        if (instrument2 == null) {
        }
        TransferFee transferFee2 = depositPreferenceOption2.fee;
        DepositPreference depositPreference2 = depositPreferenceOption2.depositPreference;
        ConfirmationSheetData confirmationSheetData22 = depositPreferenceOption2.confirmSheetData;
        BlockersData copy$default2 = BlockersData.copy$default(blockersData2, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, TransferData.copy$default(transferData2, money2, depositPreference2, transferFee2, signalsContext2, (confirmationSheetData22 == null && booleanValue2) ? confirmationSheetData22 : null, bool2, null, proto, 12654), null, null, null, null, null, null, null, null, null, false, null, null, null, -1, 65531);
        withdrawPresenter$initiateCashOut$1.L$0 = null;
        withdrawPresenter$initiateCashOut$1.L$1 = null;
        withdrawPresenter$initiateCashOut$1.L$2 = null;
        withdrawPresenter$initiateCashOut$1.L$3 = null;
        withdrawPresenter$initiateCashOut$1.label = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList models$depositPreferenceOptionsFor(WithdrawPresenter withdrawPresenter, State state, State state2, Money money) {
        CashOutCapabilityManager$CashOutCapabilities.InstrumentCapability instrumentCapability;
        TransfersWithdrawManager.FeeData feeData;
        Iterator it;
        CashOutCapabilityManager$CashOutCapabilities.InstrumentCapability instrumentCapability2;
        TransferFee transferFee;
        String str;
        String format2;
        boolean booleanValue;
        Boolean bool;
        TransfersWithdrawManager.FeeData.FeeStepTier feeStepTier;
        Object obj;
        TransferData transferData = withdrawPresenter.transferData;
        DepositPreferenceData depositPreferenceData = transferData.depositPreferenceData;
        depositPreferenceData.getClass();
        List list = depositPreferenceData.cash_out_options;
        AndroidStringManager androidStringManager = withdrawPresenter.stringManager;
        Instrument instrument = (Instrument) state.getValue();
        CashOutCapabilityManager$CashOutCapabilities cashOutCapabilityManager$CashOutCapabilities = (CashOutCapabilityManager$CashOutCapabilities) state2.getValue();
        if (cashOutCapabilityManager$CashOutCapabilities != null) {
            Iterator it2 = cashOutCapabilityManager$CashOutCapabilities.capabilities.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                CashInstrumentType cashInstrumentType = ((CashOutCapabilityManager$CashOutCapabilities.InstrumentCapability) obj).instrumentType;
                Instrument instrument2 = (Instrument) state.getValue();
                if (cashInstrumentType == (instrument2 != null ? instrument2.cashInstrumentType : null)) {
                    break;
                }
            }
            instrumentCapability = (CashOutCapabilityManager$CashOutCapabilities.InstrumentCapability) obj;
        } else {
            instrumentCapability = null;
        }
        TransfersWithdrawManager.FeeData feeData2 = transferData.feeData;
        feeData2.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            DepositPreferenceOption depositPreferenceOption = (DepositPreferenceOption) it3.next();
            DepositPreference depositPreference = depositPreferenceOption.deposit_preference;
            depositPreference.getClass();
            boolean z = depositPreference == DepositPreference.TRANSFER_SLOWLY_WITHOUT_FEE;
            boolean z2 = depositPreference == DepositPreference.TRANSFER_INSTANTLY_WITH_FEE;
            if (z2) {
                boolean z3 = withdrawPresenter.useImprovedFeePrecision;
                money.getClass();
                Long l = money.amount;
                l.getClass();
                TreeMap treeMap = feeData2.feeStepTiers;
                Map.Entry floorEntry = treeMap.floorEntry(l);
                if (floorEntry == null || (feeStepTier = (TransfersWithdrawManager.FeeData.FeeStepTier) floorEntry.getValue()) == null) {
                    Object value = treeMap.firstEntry().getValue();
                    value.getClass();
                    feeStepTier = (TransfersWithdrawManager.FeeData.FeeStepTier) value;
                }
                DecimalFormat decimalFormat = Bps.DISPLAY_FORMAT;
                instrumentCapability2 = instrumentCapability;
                long j = feeStepTier.feeBps;
                feeData = feeData2;
                Long l2 = money.amount;
                l2.getClass();
                it = it3;
                Long l3 = new Money(Long.valueOf(Bps.applyFee(z3, l2.longValue(), j)), money.currency_code, 4).amount;
                l3.getClass();
                transferFee = new TransferFee(new Money(Long.valueOf(RangesKt___RangesKt.coerceIn(l3.longValue(), feeStepTier.minimumFeeCents, feeStepTier.maximumFeeCents)), money.currency_code, 4), feeStepTier);
                str = null;
            } else {
                feeData = feeData2;
                it = it3;
                instrumentCapability2 = instrumentCapability;
                CurrencyCode currencyCode = money.currency_code;
                currencyCode.getClass();
                str = null;
                transferFee = new TransferFee(Moneys.zero(currencyCode), null);
            }
            TransferFee transferFee2 = transferFee;
            boolean z4 = z2;
            String str2 = depositPreferenceOption.options_text;
            str2.getClass();
            Money money2 = transferFee2.fee;
            if (Moneys.isZero(money2)) {
                format2 = str;
            } else {
                String format3 = withdrawPresenter.standardFormatter.format(money2);
                format3.getClass();
                Resources resources = androidStringManager.resources;
                resources.getClass();
                format2 = new MessageFormat(resources.getString(R.string.transfers_cash_out_deposit_preference_fee_subtitle)).format(new Object[]{format3});
                format2.getClass();
            }
            WithdrawViewModel.DepositPreferenceOption.Icon icon = z4 ? WithdrawViewModel.DepositPreferenceOption.Icon.INSTANT : str;
            ConfirmationSheetData confirmationSheetData = depositPreferenceOption.confirmation_sheet_data;
            if (instrument == null || instrumentCapability2 == null) {
                instrumentCapability = instrumentCapability2;
            } else {
                instrumentCapability = instrumentCapability2;
                CashOutCapabilityManager$CashOutCapabilities.QualifiedCapability findQualifiedCapability = UtilsKt.findQualifiedCapability(instrumentCapability, instrument);
                if (findQualifiedCapability != null) {
                    List list3 = findQualifiedCapability.supportedFlows;
                    if (z) {
                        if (list3 != null) {
                            bool = Boolean.valueOf(list3.contains(SupportedFlows.STANDARD_CASH_OUT));
                            booleanValue = bool != 0 ? bool.booleanValue() : false;
                        }
                        bool = str;
                        if (bool != 0) {
                        }
                    } else {
                        if (z4) {
                            if (list3 != null) {
                                bool = Boolean.valueOf(list3.contains(SupportedFlows.INSTANT_CASH_OUT));
                            }
                            bool = str;
                        } else {
                            bool = Boolean.FALSE;
                        }
                        if (bool != 0) {
                        }
                    }
                    arrayList.add(new WithdrawViewModel.DepositPreferenceOption(str2, format2, transferFee2, icon, depositPreference, confirmationSheetData, booleanValue));
                    feeData2 = feeData;
                    it3 = it;
                }
            }
            arrayList.add(new WithdrawViewModel.DepositPreferenceOption(str2, format2, transferFee2, icon, depositPreference, confirmationSheetData, booleanValue));
            feeData2 = feeData;
            it3 = it;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.squareup.cash.arcade.Icons] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        WithdrawViewModel.DepositPreferenceOption depositPreferenceOption;
        WithdrawViewModel.DepositPreferenceOption depositPreferenceOption2;
        MutableState mutableState2;
        List list;
        Continuation continuation;
        ?? r0;
        InstrumentCellViewModel instrumentCellViewModel;
        Object viewAmount;
        ArrayList arrayList;
        boolean z;
        Object obj;
        AndroidStringManager androidStringManager = this.stringManager;
        Resources resources = androidStringManager.resources;
        flow.getClass();
        ?? r11 = (GapComposer) composer;
        r11.startReplaceGroup(764232997);
        boolean changedInstance = r11.changedInstance(this);
        Object rememberedValue = r11.rememberedValue();
        Object obj2 = Composer.Companion.Empty;
        Continuation continuation2 = null;
        if (changedInstance || rememberedValue == obj2) {
            rememberedValue = new ExoPlayerVideoView.AnonymousClass2(this, continuation2, 10);
            r11.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect((Composer) r11, "transfer-action-processing", (Function2) rememberedValue);
        Object rememberedValue2 = r11.rememberedValue();
        if (rememberedValue2 == obj2) {
            rememberedValue2 = this.instrumentManager.forTypes(CashInstrumentType.DEBIT_CARD, CashInstrumentType.BANK_ACCOUNT);
            r11.updateRememberedValue(rememberedValue2);
        }
        EmptyList emptyList = EmptyList.INSTANCE;
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, emptyList, null, r11, 48, 2);
        List list2 = emptyList;
        Object rememberedValue3 = r11.rememberedValue();
        if (rememberedValue3 == obj2) {
            SizeMap sizeMap = this.cashOutCapabilityManager;
            rememberedValue3 = ((SyncValueReader) sizeMap.mRatios).getSingleValueOrDefault(AndroidSyncValueSpecs.CashOutInstrumentCapabilityConfig, null, new TaxWebAppBridge$$ExternalSyntheticLambda1(sizeMap));
            r11.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, null, null, r11, 48, 2);
        Object rememberedValue4 = r11.rememberedValue();
        if (rememberedValue4 == obj2) {
            rememberedValue4 = Updater.derivedStateOf(new BasicShieetScope$$ExternalSyntheticLambda10(24, collectAsState, this, collectAsState2));
            r11.updateRememberedValue(rememberedValue4);
        }
        State state = (State) rememberedValue4;
        Object rememberedValue5 = r11.rememberedValue();
        if (rememberedValue5 == obj2) {
            rememberedValue5 = Updater.mutableStateOf$default(null);
            r11.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState3 = (MutableState) rememberedValue5;
        Object rememberedValue6 = r11.rememberedValue();
        if (rememberedValue6 == obj2) {
            rememberedValue6 = Updater.mutableStateOf$default(null);
            r11.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState4 = (MutableState) rememberedValue6;
        Object rememberedValue7 = r11.rememberedValue();
        if (rememberedValue7 == obj2) {
            rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
            r11.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState5 = (MutableState) rememberedValue7;
        Money money = this.transferData.balance.available_balance;
        money.getClass();
        CurrencyCode currencyCode = money.currency_code;
        if (currencyCode == null) {
            currencyCode = CurrencyCode.USD;
        }
        CurrencyCode currencyCode2 = currencyCode;
        Object rememberedValue8 = r11.rememberedValue();
        if (rememberedValue8 == obj2) {
            rememberedValue8 = Updater.mutableStateOf$default(null);
            r11.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState6 = (MutableState) rememberedValue8;
        Object[] objArr = new Object[0];
        boolean changedInstance2 = r11.changedInstance(this) | r11.changedInstance(money);
        Object rememberedValue9 = r11.rememberedValue();
        if (changedInstance2 || rememberedValue9 == obj2) {
            rememberedValue9 = new TaxWebAppBridge$$ExternalSyntheticLambda0(22, this, money);
            r11.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState7 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue9, r11, 0);
        Object[] objArr2 = new Object[0];
        Object rememberedValue10 = r11.rememberedValue();
        int i2 = 5;
        if (rememberedValue10 == obj2) {
            rememberedValue10 = new ArticleViewKt$$ExternalSyntheticLambda7(i2);
            r11.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState8 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue10, r11, 48);
        Object[] objArr3 = new Object[0];
        Object rememberedValue11 = r11.rememberedValue();
        if (rememberedValue11 == obj2) {
            rememberedValue11 = new ArticleViewKt$$ExternalSyntheticLambda7(6);
            r11.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState9 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue11, r11, 48);
        if (((Boolean) mutableState9.getValue()).booleanValue()) {
            mutableState = collectAsState;
        } else {
            String str = this.args.blockersData.flowToken;
            CashWithdrawViewed.EntryMethod entryMethod = CashWithdrawViewed.EntryMethod.KEYPAD;
            mutableState = collectAsState;
            this.analytics.track(new CashWithdrawViewed(str), null);
            mutableState9.setValue(Boolean.TRUE);
        }
        int ordinal = ((InputMode) mutableState8.getValue()).ordinal();
        if (ordinal == 0) {
            list2 = models$depositPreferenceOptionsFor(this, state, collectAsState2, (Money) mutableState7.getValue());
        } else if (ordinal != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        List list3 = list2;
        WithdrawViewModel.DepositPreferenceOption depositPreferenceOption3 = (WithdrawViewModel.DepositPreferenceOption) mutableState3.getValue();
        if (depositPreferenceOption3 != null) {
            Iterator it = list3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((WithdrawViewModel.DepositPreferenceOption) obj).depositPreference == depositPreferenceOption3.depositPreference) {
                    break;
                }
            }
            WithdrawViewModel.DepositPreferenceOption depositPreferenceOption4 = (WithdrawViewModel.DepositPreferenceOption) obj;
            if (depositPreferenceOption4 != null) {
                depositPreferenceOption3 = depositPreferenceOption4;
            }
            depositPreferenceOption = depositPreferenceOption3;
        } else {
            depositPreferenceOption = null;
        }
        if (((Boolean) mutableState5.getValue()).booleanValue()) {
            r11.startReplaceGroup(-353403222);
            Money money2 = (Money) mutableState7.getValue();
            if (money2 == null || depositPreferenceOption == null) {
                depositPreferenceOption2 = depositPreferenceOption;
                mutableState2 = mutableState4;
                list = list3;
                z = false;
                continuation = null;
                r11.startReplaceGroup(-1383879796);
                r11.end(false);
            } else {
                r11.startReplaceGroup(-1383927846);
                depositPreferenceOption2 = depositPreferenceOption;
                mutableState2 = mutableState4;
                list = list3;
                z = false;
                continuation = null;
                Updater.LaunchedEffect(money2, depositPreferenceOption2, new NotificationActionService$onHandleIntent$1(money2, depositPreferenceOption2, (Continuation) null, this, state, mutableState2), r11);
                r11.end(false);
            }
            r11.end(z);
        } else {
            depositPreferenceOption2 = depositPreferenceOption;
            mutableState2 = mutableState4;
            list = list3;
            continuation = null;
            r11.startReplaceGroup(-353231203);
            r11.end(false);
        }
        WithdrawViewModel.DepositPreferenceOption depositPreferenceOption5 = depositPreferenceOption2;
        Updater.LaunchedEffect((Composer) r11, flow, new WithdrawPresenter$models$$inlined$CollectEffect$1(flow, (Continuation) null, this, depositPreferenceOption5, currencyCode2, state, mutableState7, mutableState3, collectAsState2, mutableState6, mutableState8, mutableState2, mutableState, mutableState5));
        List list4 = list;
        boolean changedInstance3 = r11.changedInstance(list4) | r11.changedInstance(this);
        Object rememberedValue12 = r11.rememberedValue();
        if (changedInstance3 || rememberedValue12 == obj2) {
            Continuation continuation3 = continuation;
            rememberedValue12 = new Logger$_log$2(list4, this, mutableState3, continuation3, 4);
            r0 = continuation3;
            r11.updateRememberedValue(rememberedValue12);
        } else {
            r0 = continuation;
        }
        Updater.LaunchedEffect((Composer) r11, list4, (Function2) rememberedValue12);
        int ordinal2 = ((InputMode) mutableState8.getValue()).ordinal();
        if (ordinal2 == 0) {
            String str2 = androidStringManager.get(R.string.transfers_cash_out_title);
            MoneyFormatter moneyFormatter = this.compactFormatter;
            String format2 = moneyFormatter.format(money);
            format2.getClass();
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.transfers_cash_out_cash_balance_subtitle)).format(new Object[]{format2});
            format3.getClass();
            String format4 = moneyFormatter.format((Money) mutableState7.getValue());
            String str3 = androidStringManager.get(R.string.transfers_cash_out_next_button);
            String str4 = androidStringManager.get(R.string.transfers_cash_out_change_amount_button);
            DepositPreference depositPreference = depositPreferenceOption5 != null ? depositPreferenceOption5.depositPreference : r0;
            WithdrawViewModel.ViewAmount.DepositPreferenceStyle depositPreferenceStyle = this.multiLinkingUxButtonsEnabled ? WithdrawViewModel.ViewAmount.DepositPreferenceStyle.WITH_BUTTONS : WithdrawViewModel.ViewAmount.DepositPreferenceStyle.DEFAULT;
            Money money3 = (Money) mutableState7.getValue();
            Long l = money.amount;
            l.getClass();
            double longValue = l.longValue();
            CurrencyCode currencyCode3 = money.currency_code;
            currencyCode3.getClass();
            WithdrawViewModel$AmountConfig$KeypadConfig withdrawViewModel$AmountConfig$KeypadConfig = new WithdrawViewModel$AmountConfig$KeypadConfig(money3, longValue / Moneys.displayDivisor(currencyCode3), currencyCode2);
            Instrument instrument = (Instrument) state.getValue();
            if (instrument != null) {
                boolean z2 = instrument.cashInstrumentType == CashInstrumentType.DEBIT_CARD;
                boolean z3 = this.useInstrumentCardArt;
                InstrumentIcon instrumentIcon$default = GoogleMapKt.instrumentIcon$default(instrument, r0, (z3 && z2) ? InstrumentIcon.IconShape.CARD : InstrumentIcon.IconShape.CIRCLE, 5);
                if (z3) {
                    arrayList = CollectionsKt__CollectionsJVMKt.listOf(instrumentIcon$default);
                } else {
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(instrumentIcon$default);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : listOf) {
                        if (!(((InstrumentIcon) obj3) instanceof InstrumentIcon.LocalIcon)) {
                            arrayList2.add(obj3);
                        }
                    }
                    arrayList = arrayList2;
                }
                String str5 = instrument.displayNameCompact;
                if (str5 == null) {
                    str5 = "";
                }
                instrumentCellViewModel = new InstrumentCellViewModel(str5, null, true, arrayList, InstrumentCellViewModel.Accessory.Push.INSTANCE, null, androidStringManager.get(R.string.transfers_cash_out_instrument_selector_to), null, null, 416);
            } else {
                instrumentCellViewModel = r0;
            }
            viewAmount = new WithdrawViewModel.ViewAmount(str2, format3, withdrawViewModel$AmountConfig$KeypadConfig, list4, format4, str3, str4, depositPreference, instrumentCellViewModel, depositPreferenceStyle);
        } else {
            if (ordinal2 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            String str6 = androidStringManager.get(R.string.transfers_cash_out_title);
            String format5 = this.standardFormatter.format(money);
            format5.getClass();
            resources.getClass();
            String format6 = new MessageFormat(resources.getString(R.string.transfers_cash_out_cash_balance_subtitle)).format(new Object[]{format5});
            format6.getClass();
            String str7 = androidStringManager.get(R.string.transfers_cash_out_change_amount_confirmation_label);
            boolean z4 = ((Instrument) state.getValue()) != null;
            Money money4 = (Money) mutableState7.getValue();
            Long l2 = money.amount;
            l2.getClass();
            double longValue2 = l2.longValue();
            CurrencyCode currencyCode4 = money.currency_code;
            currencyCode4.getClass();
            viewAmount = new WithdrawViewModel.ChangeAmount(str6, format6, new WithdrawViewModel$AmountConfig$KeypadConfig(money4, longValue2 / Moneys.displayDivisor(currencyCode4), currencyCode2), list4, str7, z4);
        }
        r11.end(false);
        return viewAmount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (r9 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shouldShowConfirmDialog(ConfirmationSheetData confirmationSheetData, ContinuationImpl continuationImpl) {
        WithdrawPresenter$shouldShowConfirmDialog$1 withdrawPresenter$shouldShowConfirmDialog$1;
        int i;
        String str;
        String str2;
        int i2;
        if (continuationImpl instanceof WithdrawPresenter$shouldShowConfirmDialog$1) {
            withdrawPresenter$shouldShowConfirmDialog$1 = (WithdrawPresenter$shouldShowConfirmDialog$1) continuationImpl;
            int i3 = withdrawPresenter$shouldShowConfirmDialog$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                withdrawPresenter$shouldShowConfirmDialog$1.label = i3 - PKIFailureInfo.systemUnavail;
                Object obj = withdrawPresenter$shouldShowConfirmDialog$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = withdrawPresenter$shouldShowConfirmDialog$1.label;
                RealConfirmCashOutVersionCodeProvider realConfirmCashOutVersionCodeProvider = this.confirmCashOutVersionCodeProvider;
                boolean z = false;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        z = true;
                        return Boolean.valueOf(z);
                    }
                    i2 = withdrawPresenter$shouldShowConfirmDialog$1.I$0;
                    str = withdrawPresenter$shouldShowConfirmDialog$1.L$2;
                    str2 = withdrawPresenter$shouldShowConfirmDialog$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(str, obj)) {
                        withdrawPresenter$shouldShowConfirmDialog$1.L$1 = null;
                        withdrawPresenter$shouldShowConfirmDialog$1.L$2 = null;
                        withdrawPresenter$shouldShowConfirmDialog$1.I$0 = i2;
                        withdrawPresenter$shouldShowConfirmDialog$1.label = 2;
                        KeyValue keyValue = realConfirmCashOutVersionCodeProvider.confirmCashOutVersionCode;
                        str2.getClass();
                        Object obj2 = keyValue.set(new ConfirmCashOutVersionCode(str2), withdrawPresenter$shouldShowConfirmDialog$1);
                        if (obj2 != coroutineSingletons) {
                            obj2 = Unit.INSTANCE;
                        }
                    }
                    return Boolean.valueOf(z);
                }
                SafeTrace.throwOnFailure(obj);
                if (confirmationSheetData != null && (str = confirmationSheetData.version_code) != null) {
                    withdrawPresenter$shouldShowConfirmDialog$1.L$1 = str;
                    withdrawPresenter$shouldShowConfirmDialog$1.L$2 = str;
                    withdrawPresenter$shouldShowConfirmDialog$1.I$0 = 0;
                    withdrawPresenter$shouldShowConfirmDialog$1.label = 1;
                    obj = realConfirmCashOutVersionCodeProvider.get(withdrawPresenter$shouldShowConfirmDialog$1);
                    if (obj != coroutineSingletons) {
                        str2 = str;
                        i2 = 0;
                        if (!Intrinsics.areEqual(str, obj)) {
                        }
                        return Boolean.valueOf(z);
                    }
                    return coroutineSingletons;
                }
            }
        }
        withdrawPresenter$shouldShowConfirmDialog$1 = new WithdrawPresenter$shouldShowConfirmDialog$1(this, continuationImpl);
        Object obj3 = withdrawPresenter$shouldShowConfirmDialog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = withdrawPresenter$shouldShowConfirmDialog$1.label;
        RealConfirmCashOutVersionCodeProvider realConfirmCashOutVersionCodeProvider2 = this.confirmCashOutVersionCodeProvider;
        boolean z2 = false;
        if (i == 0) {
        }
    }
}
