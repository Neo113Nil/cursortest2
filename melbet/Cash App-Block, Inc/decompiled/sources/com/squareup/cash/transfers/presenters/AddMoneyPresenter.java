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
import com.fillr.n;
import com.google.maps.android.compose.GoogleMapKt;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSender$submitBugReport$2;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.transfers.TransferManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersPlatformPay;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientTransfersUseInstrumentCardArt;
import com.squareup.cash.featureflags.AmplitudeExperiments$RecurringCashInToggle;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.google.pay.payments.api.GooglePayPaymentsClient;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine$Map$3$1;
import com.squareup.cash.maps.views.CashMapViewKt$CashMapView$3$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.tax.web.TaxWebAppBridge;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda0;
import com.squareup.cash.transfers.backend.real.RealTransferRequirementHandler;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.screens.AddMoneyScreen;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.util.money.Moneys;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.CashInstrumentType;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class AddMoneyPresenter implements MoleculePresenter {
    public static final List PRESET_AMOUNTS = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{1000L, 2500L, 5000L, 10000L, 20000L});
    public static final List PRESET_AMOUNTS_WITH_SUGGESTED = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{2500L, 5000L, 10000L, 20000L});
    public final Analytics analytics;
    public final AddMoneyScreen args;
    public final MoneyFormatter balanceFormatter;
    public final FeatureFlagManager featureFlagManager;
    public final boolean googlePayEnabled;
    public final GooglePayPaymentsClient googlePayPaymentsClient;
    public final RealInstrumentManager instrumentManager;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;
    public final n transferActionProcessor;
    public final TransferData transferData;
    public final TransferManager transferManager;
    public final RealTransferRequirementHandler transferRequirementHandler;
    public final boolean useInstrumentCardArt;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class InputMode {
        public static final /* synthetic */ InputMode[] $VALUES;
        public static final InputMode ATM_PICKER;
        public static final InputMode KEYPAD;

        static {
            InputMode inputMode = new InputMode("ATM_PICKER", 0);
            ATM_PICKER = inputMode;
            InputMode inputMode2 = new InputMode("KEYPAD", 1);
            KEYPAD = inputMode2;
            $VALUES = new InputMode[]{inputMode, inputMode2};
        }

        public static InputMode valueOf(String str) {
            return (InputMode) Enum.valueOf(InputMode.class, str);
        }

        public static InputMode[] values() {
            return (InputMode[]) $VALUES.clone();
        }
    }

    public AddMoneyPresenter(Analytics analytics, AndroidStringManager androidStringManager, TransferManager transferManager, FeatureFlagManager featureFlagManager, RealInstrumentManager realInstrumentManager, RealTransferRequirementHandler realTransferRequirementHandler, GooglePayPaymentsClient googlePayPaymentsClient, TransferActionProcessor$Factory$Impl transferActionProcessor$Factory$Impl, LocalizedMoneyFormatter.Factory factory, BetterNavigator.ScreenNavigator screenNavigator, AddMoneyScreen addMoneyScreen) {
        addMoneyScreen.getClass();
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.transferManager = transferManager;
        this.featureFlagManager = featureFlagManager;
        this.instrumentManager = realInstrumentManager;
        this.transferRequirementHandler = realTransferRequirementHandler;
        this.googlePayPaymentsClient = googlePayPaymentsClient;
        this.navigator = screenNavigator;
        this.args = addMoneyScreen;
        this.transferActionProcessor = transferActionProcessor$Factory$Impl.create(transferManager);
        TransferData transferData = addMoneyScreen.blockersData.transferData;
        transferData.getClass();
        this.transferData = transferData;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.balanceFormatter = factory.create(MoneyFormatterConfig.STANDARD);
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        this.googlePayEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$ClientTransfersPlatformPay.INSTANCE)).enabled();
        this.useInstrumentCardArt = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(AmplitudeExperiments$ClientTransfersUseInstrumentCardArt.INSTANCE)).enabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x033e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x035e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x041a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03ea  */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        TransferData transferData;
        ArrayList arrayList;
        MutableState mutableState;
        InstrumentCellViewModel instrumentCellViewModel;
        ArrayList arrayList2;
        boolean z;
        AddMoneyViewModel.RecurringCashInToggle recurringCashInToggle;
        boolean changed;
        Object rememberedValue;
        AddMoneyViewModel.RecurringCashInToggle recurringCashInToggle2;
        AddMoneyPresenter addMoneyPresenter;
        boolean z2;
        ArrayList<Money> arrayList3;
        AndroidStringManager androidStringManager;
        String str;
        int ordinal;
        Object atmPicker;
        boolean z3;
        InputMode inputMode;
        AndroidStringManager androidStringManager2 = this.stringManager;
        Resources resources = androidStringManager2.resources;
        flow.getClass();
        ?? r7 = (GapComposer) composer;
        r7.startReplaceGroup(930626020);
        boolean changedInstance = r7.changedInstance(this);
        Object rememberedValue2 = r7.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (changedInstance || rememberedValue2 == obj) {
            rememberedValue2 = new AddMoneyPresenter$models$1$1(this, null, 0);
            r7.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect((Composer) r7, "transfer-requirements", (Function2) rememberedValue2);
        boolean changedInstance2 = r7.changedInstance(this);
        Object rememberedValue3 = r7.rememberedValue();
        if (changedInstance2 || rememberedValue3 == obj) {
            rememberedValue3 = new AddMoneyPresenter$models$1$1(this, null, 1);
            r7.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect((Composer) r7, "transfer-processor", (Function2) rememberedValue3);
        TransferData transferData2 = this.transferData;
        Money money = transferData2.balance.available_balance;
        money.getClass();
        CurrencyCode currencyCode = money.currency_code;
        if (currencyCode == null) {
            currencyCode = CurrencyCode.USD;
        }
        CurrencyCode currencyCode2 = currencyCode;
        Object rememberedValue4 = r7.rememberedValue();
        AddMoneyScreen addMoneyScreen = this.args;
        if (rememberedValue4 == obj) {
            Money money2 = addMoneyScreen.initialAmount;
            if (money2 == null) {
                money2 = Moneys.zero(currencyCode2);
            }
            rememberedValue4 = Updater.mutableStateOf$default(money2);
            r7.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState2 = (MutableState) rememberedValue4;
        Object rememberedValue5 = r7.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = Updater.mutableStateOf$default(Boolean.FALSE);
            r7.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState3 = (MutableState) rememberedValue5;
        Object rememberedValue6 = r7.rememberedValue();
        if (rememberedValue6 == obj) {
            rememberedValue6 = Updater.mutableStateOf$default(Boolean.FALSE);
            r7.updateRememberedValue(rememberedValue6);
        }
        MutableState mutableState4 = (MutableState) rememberedValue6;
        Object rememberedValue7 = r7.rememberedValue();
        if (rememberedValue7 == obj) {
            rememberedValue7 = Updater.mutableStateOf$default(Boolean.FALSE);
            r7.updateRememberedValue(rememberedValue7);
        }
        MutableState mutableState5 = (MutableState) rememberedValue7;
        Object[] objArr = new Object[0];
        Object rememberedValue8 = r7.rememberedValue();
        if (rememberedValue8 == obj) {
            rememberedValue8 = new ArticleViewKt$$ExternalSyntheticLambda7(2);
            r7.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState6 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue8, r7, 48);
        Money money3 = addMoneyScreen.customSuggestedAmount;
        String str2 = addMoneyScreen.customTitle;
        if (money3 != null) {
            List list = PRESET_AMOUNTS_WITH_SUGGESTED;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList4.add(new Money(Long.valueOf(((Number) it.next()).longValue()), currencyCode2, 4));
            }
            List listOf = CollectionsKt__CollectionsJVMKt.listOf(money3);
            ArrayList arrayList5 = new ArrayList();
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                TransferData transferData3 = transferData2;
                if (!Intrinsics.areEqual(((Money) next).amount, money3.amount)) {
                    arrayList5.add(next);
                }
                transferData2 = transferData3;
            }
            transferData = transferData2;
            arrayList = CollectionsKt.plus((Iterable) arrayList5, (Collection) listOf);
        } else {
            transferData = transferData2;
            List list2 = PRESET_AMOUNTS;
            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList6.add(new Money(Long.valueOf(((Number) it3.next()).longValue()), currencyCode2, 4));
            }
            arrayList = arrayList6;
        }
        boolean z4 = this.googlePayEnabled;
        Boolean valueOf = Boolean.valueOf(z4);
        boolean changedInstance3 = r7.changedInstance(this);
        Object rememberedValue9 = r7.rememberedValue();
        if (changedInstance3 || rememberedValue9 == obj) {
            rememberedValue9 = new TaxWebAppBridge.AnonymousClass4(this, mutableState5, (Continuation) null, 16);
            r7.updateRememberedValue(rememberedValue9);
        }
        Updater.LaunchedEffect((Composer) r7, valueOf, (Function2) rememberedValue9);
        boolean z5 = z4 && ((Boolean) mutableState5.getValue()).booleanValue();
        Object rememberedValue10 = r7.rememberedValue();
        if (rememberedValue10 == obj) {
            if (!addMoneyScreen.startInKeypad) {
                if (!Moneys.isZero((Money) mutableState2.getValue())) {
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            if (Intrinsics.areEqual(((Money) it4.next()).amount, ((Money) mutableState2.getValue()).amount)) {
                            }
                        }
                    }
                    inputMode = InputMode.KEYPAD;
                }
                inputMode = InputMode.ATM_PICKER;
                break;
            }
            inputMode = InputMode.KEYPAD;
            rememberedValue10 = Updater.mutableStateOf$default(inputMode);
            r7.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState7 = (MutableState) rememberedValue10;
        Object rememberedValue11 = r7.rememberedValue();
        if (rememberedValue11 == obj) {
            rememberedValue11 = this.instrumentManager.forType(CashInstrumentType.DEBIT_CARD);
            r7.updateRememberedValue(rememberedValue11);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue11, EmptyList.INSTANCE, null, r7, 48, 2);
        Object rememberedValue12 = r7.rememberedValue();
        if (rememberedValue12 == obj) {
            rememberedValue12 = Updater.derivedStateOf(new TaxWebAppBridge$$ExternalSyntheticLambda0(21, this, collectAsState));
            r7.updateRememberedValue(rememberedValue12);
        }
        State state = (State) rememberedValue12;
        boolean changed2 = r7.changed((Instrument) state.getValue());
        Object rememberedValue13 = r7.rememberedValue();
        if (changed2 || rememberedValue13 == obj) {
            Instrument instrument = (Instrument) state.getValue();
            if (instrument != null) {
                boolean z6 = instrument.cashInstrumentType == CashInstrumentType.DEBIT_CARD;
                boolean z7 = this.useInstrumentCardArt;
                mutableState = mutableState7;
                InstrumentIcon instrumentIcon$default = GoogleMapKt.instrumentIcon$default(instrument, null, (z7 && z6) ? InstrumentIcon.IconShape.CARD : InstrumentIcon.IconShape.CIRCLE, 5);
                if (z7) {
                    arrayList2 = CollectionsKt__CollectionsJVMKt.listOf(instrumentIcon$default);
                } else {
                    List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(instrumentIcon$default);
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj2 : listOf2) {
                        if (!(((InstrumentIcon) obj2) instanceof InstrumentIcon.LocalIcon)) {
                            arrayList7.add(obj2);
                        }
                    }
                    arrayList2 = arrayList7;
                }
                String str3 = instrument.displayNameCompact;
                if (str3 == null) {
                    str3 = "";
                }
                instrumentCellViewModel = new InstrumentCellViewModel(str3, null, true, arrayList2, InstrumentCellViewModel.Accessory.Push.INSTANCE, null, androidStringManager2.get(R.string.transfers_cash_in_instrument_selector_from), null, null, 416);
            } else {
                mutableState = mutableState7;
                instrumentCellViewModel = null;
            }
            r7.updateRememberedValue(instrumentCellViewModel);
            rememberedValue13 = instrumentCellViewModel;
        } else {
            mutableState = mutableState7;
        }
        InstrumentCellViewModel instrumentCellViewModel2 = (InstrumentCellViewModel) rememberedValue13;
        Instrument instrument2 = (Instrument) state.getValue();
        boolean z8 = (instrument2 != null ? instrument2.cashInstrumentType : null) == CashInstrumentType.DEBIT_CARD;
        if (z8) {
            Long l = ((Money) mutableState2.getValue()).amount;
            if ((l != null ? l.longValue() : 0L) >= 1000) {
                z = true;
                if (z8) {
                    if (((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$RecurringCashInToggle.INSTANCE)).enabled()) {
                        recurringCashInToggle = new AddMoneyViewModel.RecurringCashInToggle(androidStringManager2.get(R.string.transfers_add_money_repeat_every_week_toggle), ((Boolean) mutableState6.getValue()).booleanValue() && z, z);
                        MutableState rememberUpdatedState = Updater.rememberUpdatedState(Boolean.valueOf((z || recurringCashInToggle == null) ? false : true), r7);
                        Boolean valueOf2 = Boolean.valueOf(z);
                        changed = r7.changed(z) | r7.changed(mutableState6);
                        rememberedValue = r7.rememberedValue();
                        if (!changed || rememberedValue == obj) {
                            rememberedValue = new CashMapViewKt$CashMapView$3$1(z, mutableState6, null, 13);
                            r7.updateRememberedValue(rememberedValue);
                        }
                        Updater.LaunchedEffect((Composer) r7, valueOf2, (Function2) rememberedValue);
                        ArrayList arrayList8 = arrayList;
                        TransferData transferData4 = transferData;
                        MutableState mutableState8 = mutableState;
                        MutableState mutableState9 = mutableState2;
                        recurringCashInToggle2 = recurringCashInToggle;
                        Updater.LaunchedEffect((Composer) r7, flow, new RealBugReportSender$submitBugReport$2(flow, null, currencyCode2, this, mutableState9, mutableState3, mutableState8, state, mutableState4, rememberUpdatedState, mutableState6, 6));
                        if (((Boolean) mutableState3.getValue()).booleanValue()) {
                            r7.startReplaceGroup(272925121);
                            Money money4 = (Money) mutableState9.getValue();
                            if (money4 != null) {
                                r7.startReplaceGroup(-1106477359);
                                addMoneyPresenter = this;
                                boolean z9 = z5;
                                arrayList3 = arrayList8;
                                GoogleMapEngine$Map$3$1 googleMapEngine$Map$3$1 = new GoogleMapEngine$Map$3$1(money4, (Continuation) null, addMoneyPresenter, arrayList3, z9, mutableState4, state, mutableState9);
                                z2 = z9;
                                mutableState9 = mutableState9;
                                Updater.LaunchedEffect((Composer) r7, money4, googleMapEngine$Map$3$1);
                                z3 = false;
                                r7.end(false);
                            } else {
                                addMoneyPresenter = this;
                                z2 = z5;
                                arrayList3 = arrayList8;
                                z3 = false;
                                r7.startReplaceGroup(-1106436997);
                                r7.end(false);
                            }
                            r7.end(z3);
                        } else {
                            addMoneyPresenter = this;
                            z2 = z5;
                            arrayList3 = arrayList8;
                            r7.startReplaceGroup(273352766);
                            r7.end(false);
                        }
                        if (recurringCashInToggle2 == null && recurringCashInToggle2.checked) {
                            androidStringManager = androidStringManager2;
                            str = androidStringManager.get(R.string.transfers_add_money_add_weekly_button);
                        } else {
                            androidStringManager = androidStringManager2;
                            str = (((List) collectAsState.getValue()).isEmpty() || !z2) ? androidStringManager.get(R.string.blockers_transfer_funds_view_add_default) : androidStringManager.get(R.string.transfers_add_money_cta_add_money_from_debit_card);
                        }
                        String str4 = str;
                        Long l2 = ((Money) mutableState9.getValue()).amount;
                        l2.getClass();
                        boolean z10 = l2.longValue() > 0;
                        boolean z11 = z2 ? z10 : false;
                        String str5 = (z2 || !((List) collectAsState.getValue()).isEmpty()) ? null : androidStringManager.get(R.string.transfers_add_money_cta_add_money_from);
                        ordinal = ((InputMode) mutableState8.getValue()).ordinal();
                        MoneyFormatter moneyFormatter = addMoneyPresenter.moneyFormatter;
                        if (ordinal == 0) {
                            String str6 = str2 == null ? androidStringManager.get(R.string.blockers_transfer_funds_view_add_money_title) : str2;
                            String format2 = addMoneyPresenter.balanceFormatter.format(money);
                            format2.getClass();
                            resources.getClass();
                            String format3 = new MessageFormat(resources.getString(R.string.transfers_add_money_cash_balance_subtitle)).format(new Object[]{format2});
                            format3.getClass();
                            Money money5 = (Money) mutableState9.getValue();
                            ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                            for (Money money6 : arrayList3) {
                                arrayList9.add(new AddMoneyViewModel.AtmPicker.AmountPickerItem.Amount(moneyFormatter.format(money6), Intrinsics.areEqual((Money) mutableState9.getValue(), money6), money6, false, 20));
                            }
                            atmPicker = new AddMoneyViewModel.AtmPicker(str6, format3, money5, str4, z10, str5, z11, instrumentCellViewModel2, CollectionsKt.plus((Collection) arrayList9, (Object) new AddMoneyViewModel.AtmPicker.AmountPickerItem.Custom(androidStringManager.get(R.string.blockers_transfer_funds_add_cash_more_options), true)), recurringCashInToggle2);
                        } else {
                            if (ordinal != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            String str7 = str2 == null ? androidStringManager.get(R.string.blockers_transfer_funds_view_add_money_title) : str2;
                            String format4 = moneyFormatter.format(money);
                            format4.getClass();
                            resources.getClass();
                            String format5 = new MessageFormat(resources.getString(R.string.transfers_add_money_cash_balance_subtitle)).format(new Object[]{format4});
                            format5.getClass();
                            Money money7 = (Money) mutableState9.getValue();
                            Money money8 = transferData4.maxAmountAllowed;
                            if (money8 == null) {
                                money8 = new Money((Long) 10000000L, currencyCode2, 4);
                            }
                            atmPicker = new AddMoneyViewModel.Keypad(str7, format5, money7, str4, z10, str5, z11, instrumentCellViewModel2, money8, addMoneyScreen.startInKeypad, recurringCashInToggle2);
                        }
                        r7.end(false);
                        return atmPicker;
                    }
                }
                recurringCashInToggle = null;
                MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(Boolean.valueOf((z || recurringCashInToggle == null) ? false : true), r7);
                Boolean valueOf22 = Boolean.valueOf(z);
                changed = r7.changed(z) | r7.changed(mutableState6);
                rememberedValue = r7.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new CashMapViewKt$CashMapView$3$1(z, mutableState6, null, 13);
                r7.updateRememberedValue(rememberedValue);
                Updater.LaunchedEffect((Composer) r7, valueOf22, (Function2) rememberedValue);
                ArrayList arrayList82 = arrayList;
                TransferData transferData42 = transferData;
                MutableState mutableState82 = mutableState;
                MutableState mutableState92 = mutableState2;
                recurringCashInToggle2 = recurringCashInToggle;
                Updater.LaunchedEffect((Composer) r7, flow, new RealBugReportSender$submitBugReport$2(flow, null, currencyCode2, this, mutableState92, mutableState3, mutableState82, state, mutableState4, rememberUpdatedState2, mutableState6, 6));
                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                }
                if (recurringCashInToggle2 == null) {
                }
                androidStringManager = androidStringManager2;
                if (((List) collectAsState.getValue()).isEmpty()) {
                }
                String str42 = str;
                Long l22 = ((Money) mutableState92.getValue()).amount;
                l22.getClass();
                if (l22.longValue() > 0) {
                }
                if (z2) {
                }
                if (z2) {
                }
                ordinal = ((InputMode) mutableState82.getValue()).ordinal();
                MoneyFormatter moneyFormatter2 = addMoneyPresenter.moneyFormatter;
                if (ordinal == 0) {
                }
                r7.end(false);
                return atmPicker;
            }
        }
        z = false;
        if (z8) {
        }
        recurringCashInToggle = null;
        MutableState rememberUpdatedState22 = Updater.rememberUpdatedState(Boolean.valueOf((z || recurringCashInToggle == null) ? false : true), r7);
        Boolean valueOf222 = Boolean.valueOf(z);
        changed = r7.changed(z) | r7.changed(mutableState6);
        rememberedValue = r7.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new CashMapViewKt$CashMapView$3$1(z, mutableState6, null, 13);
        r7.updateRememberedValue(rememberedValue);
        Updater.LaunchedEffect((Composer) r7, valueOf222, (Function2) rememberedValue);
        ArrayList arrayList822 = arrayList;
        TransferData transferData422 = transferData;
        MutableState mutableState822 = mutableState;
        MutableState mutableState922 = mutableState2;
        recurringCashInToggle2 = recurringCashInToggle;
        Updater.LaunchedEffect((Composer) r7, flow, new RealBugReportSender$submitBugReport$2(flow, null, currencyCode2, this, mutableState922, mutableState3, mutableState822, state, mutableState4, rememberUpdatedState22, mutableState6, 6));
        if (((Boolean) mutableState3.getValue()).booleanValue()) {
        }
        if (recurringCashInToggle2 == null) {
        }
        androidStringManager = androidStringManager2;
        if (((List) collectAsState.getValue()).isEmpty()) {
        }
        String str422 = str;
        Long l222 = ((Money) mutableState922.getValue()).amount;
        l222.getClass();
        if (l222.longValue() > 0) {
        }
        if (z2) {
        }
        if (z2) {
        }
        ordinal = ((InputMode) mutableState822.getValue()).ordinal();
        MoneyFormatter moneyFormatter22 = addMoneyPresenter.moneyFormatter;
        if (ordinal == 0) {
        }
        r7.end(false);
        return atmPicker;
    }
}
