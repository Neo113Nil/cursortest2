package com.squareup.cash.work.presenters.pay;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.compose.FlowExtKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.fillr.n;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.cash.work.data.api.PayData;
import com.squareup.cash.work.data.api.PayDataKt;
import com.squareup.cash.work.data.api.PayDataLoader;
import com.squareup.cash.work.data.api.PayDataState;
import com.squareup.cash.work.data.real.RealPayDataLoader;
import com.squareup.cash.work.data.real.RealSelectedMerchantDataProvider;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.presenters.RealSellerCardViewModelProducer;
import com.squareup.cash.work.screens.WorkPayHomeScreen;
import com.squareup.cash.work.service.api.payroll.PayStubData;
import com.squareup.cash.work.service.api.payroll.PayStubMoney;
import com.squareup.cash.work.session.RealSelectedMerchantProvider;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.MerchantKt;
import com.squareup.cash.work.viewmodels.PastPayStubViewModel;
import com.squareup.cash.work.viewmodels.PayHomeViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.time.YearMonthDay;
import com.squareup.protos.timecards.DatetimeInterval;
import com.squareup.protos.timecards.GetShiftsOverviewResponse;
import com.squareup.util.coroutines.TakeUntil$collectSafely$2;
import com.withpersona.sdk2.camera.CameraHelper$unbind$2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class PayHomePresenter implements MoleculePresenter {
    public final BetterNavigator.ScreenNavigator navigator;
    public final PayDataLoader payDataLoader;
    public final n payHomeViewModelMapper;
    public final RealSelectedMerchantDataProvider selectedMerchantDataProvider;
    public final RealSelectedMerchantProvider selectedMerchantProvider;
    public final RealSellerCardViewModelProducer sellerCardViewModelProducer;
    public final ShiftsAnalytics shiftsAnalytics;

    public PayHomePresenter(WorkPayHomeScreen workPayHomeScreen, BetterNavigator.ScreenNavigator screenNavigator, PayDataLoader payDataLoader, RealSelectedMerchantProvider realSelectedMerchantProvider, RealSelectedMerchantDataProvider realSelectedMerchantDataProvider, RealSellerCardViewModelProducer realSellerCardViewModelProducer, n nVar, ShiftsAnalytics shiftsAnalytics) {
        workPayHomeScreen.getClass();
        this.navigator = screenNavigator;
        this.payDataLoader = payDataLoader;
        this.selectedMerchantProvider = realSelectedMerchantProvider;
        this.selectedMerchantDataProvider = realSelectedMerchantDataProvider;
        this.sellerCardViewModelProducer = realSellerCardViewModelProducer;
        this.payHomeViewModelMapper = nVar;
        this.shiftsAnalytics = shiftsAnalytics;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        String placeholder;
        String placeholder2;
        String placeholder3;
        String placeholder4;
        String placeholder5;
        String placeholder6;
        Object loaded;
        boolean z;
        String str;
        Money money;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-953408585);
        MutableState collectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(this.selectedMerchantProvider.getMerchantIdentifierFlow(), null, gapComposer, 48);
        MutableState collectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(this.selectedMerchantDataProvider.getSelectedMerchantFlow(), null, gapComposer, 48);
        MutableState collectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle((Flow) ((RealPayDataLoader) this.payDataLoader).sharedState$delegate.getValue(), new PayDataState.Loading(true), gapComposer, 0);
        SellerCardViewModel collectSelectedMerchantViewModel = this.sellerCardViewModelProducer.collectSelectedMerchantViewModel(gapComposer);
        Updater.LaunchedEffect(gapComposer, flow, new TakeUntil$collectSafely$2(flow, (Continuation) null, this, collectAsStateWithLifecycle, 18));
        if (((PayDataState) collectAsStateWithLifecycle3.getValue()) instanceof PayDataState.Loaded) {
            gapComposer.startReplaceGroup(-374193146);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CameraHelper$unbind$2(this, null, 9);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-374126837);
            gapComposer.end(false);
        }
        PayDataState payDataState = (PayDataState) collectAsStateWithLifecycle3.getValue();
        Merchant merchant = (Merchant) collectAsStateWithLifecycle2.getValue();
        String name = merchant != null ? MerchantKt.getName(merchant) : null;
        payDataState.getClass();
        collectSelectedMerchantViewModel.getClass();
        if (payDataState instanceof PayDataState.Loading) {
            loaded = PayHomeViewModel.Loading.INSTANCE;
        } else {
            boolean z2 = payDataState instanceof PayDataState.Error;
            n nVar = this.payHomeViewModelMapper;
            if (!z2) {
                if (!(payDataState instanceof PayDataState.Loaded)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                PayData payData = ((PayDataState.Loaded) payDataState).data;
                RealShiftTimeFormatter realShiftTimeFormatter = (RealShiftTimeFormatter) nVar.b;
                MoneyFormatter moneyFormatter = (MoneyFormatter) nVar.c;
                GetShiftsOverviewResponse getShiftsOverviewResponse = payData.shiftsOverview;
                List list = payData.pastPayStubs;
                Money money2 = PayDataKt.totalAmount(getShiftsOverviewResponse);
                if (money2 == null || (placeholder = moneyFormatter.format(money2)) == null) {
                    placeholder = nVar.getPlaceholder();
                }
                String str2 = placeholder;
                Money money3 = getShiftsOverviewResponse.total_estimated_pay;
                if (money3 == null || (placeholder2 = moneyFormatter.format(money3)) == null) {
                    placeholder2 = nVar.getPlaceholder();
                }
                String str3 = placeholder2;
                Money money4 = getShiftsOverviewResponse.total_tips;
                if (money4 == null || (placeholder3 = moneyFormatter.format(money4)) == null) {
                    placeholder3 = nVar.getPlaceholder();
                }
                String str4 = placeholder3;
                Integer num = getShiftsOverviewResponse.total_timecards;
                if (num == null || (placeholder4 = String.valueOf(num.intValue())) == null) {
                    placeholder4 = nVar.getPlaceholder();
                }
                String str5 = placeholder4;
                DatetimeInterval datetimeInterval = getShiftsOverviewResponse.current_interval;
                String formatPayPeriod = realShiftTimeFormatter.formatPayPeriod(datetimeInterval != null ? datetimeInterval.start : null, datetimeInterval != null ? datetimeInterval.end : null);
                if (formatPayPeriod == null) {
                    formatPayPeriod = nVar.getPlaceholder();
                }
                String str6 = formatPayPeriod;
                boolean z3 = list.size() > 3;
                List<PayStubData> take = CollectionsKt.take(list, 3);
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                for (PayStubData payStubData : take) {
                    LocalDate parse = LocalDate.parse(payStubData.attributes.payDate);
                    PayStubMoney payStubMoney = payStubData.attributes.netPay;
                    if (payStubMoney != null) {
                        Long longOrNull = StringsKt.toLongOrNull(payStubMoney.amount);
                        if (longOrNull != null) {
                            try {
                                str = name;
                                money = new Money(longOrNull, CurrencyCode.valueOf(payStubMoney.currencyCode), 4);
                            } catch (IllegalArgumentException unused) {
                            }
                            if (money != null && (r1 = moneyFormatter.format(money)) != null) {
                                String str7 = payStubData.id;
                                parse.getClass();
                                String format2 = parse.format(realShiftTimeFormatter.formatters().date);
                                format2.getClass();
                                arrayList.add(new PastPayStubViewModel(str7, format2, r1));
                                name = str;
                            }
                        }
                        str = name;
                        money = null;
                        if (money != null) {
                            String str72 = payStubData.id;
                            parse.getClass();
                            String format22 = parse.format(realShiftTimeFormatter.formatters().date);
                            format22.getClass();
                            arrayList.add(new PastPayStubViewModel(str72, format22, r1));
                            name = str;
                        }
                    } else {
                        str = name;
                    }
                    String placeholder7 = nVar.getPlaceholder();
                    String str722 = payStubData.id;
                    parse.getClass();
                    String format222 = parse.format(realShiftTimeFormatter.formatters().date);
                    format222.getClass();
                    arrayList.add(new PastPayStubViewModel(str722, format222, placeholder7));
                    name = str;
                }
                String str8 = name;
                YearMonthDay yearMonthDay = payData.payrollOverview.next_pay_date;
                if (yearMonthDay == null) {
                    placeholder5 = nVar.getPlaceholder();
                } else {
                    Integer num2 = yearMonthDay.year;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        Integer num3 = yearMonthDay.month_of_year;
                        if (num3 != null) {
                            int intValue2 = num3.intValue();
                            Integer num4 = yearMonthDay.day_of_month;
                            if (num4 != null) {
                                try {
                                    LocalDate of = LocalDate.of(intValue, intValue2, num4.intValue());
                                    of.getClass();
                                    placeholder5 = of.format(realShiftTimeFormatter.formatters().date);
                                    placeholder5.getClass();
                                } catch (Exception e) {
                                    Timber.Forest.w("Failed to format payday date: " + yearMonthDay, new Object[0], e);
                                    placeholder5 = nVar.getPlaceholder();
                                }
                            } else {
                                placeholder5 = nVar.getPlaceholder();
                            }
                        } else {
                            placeholder5 = nVar.getPlaceholder();
                        }
                    } else {
                        placeholder5 = nVar.getPlaceholder();
                    }
                }
                String str9 = placeholder5;
                String str10 = getShiftsOverviewResponse.total_hours_worked;
                if (str10 == null || str10.length() == 0) {
                    placeholder6 = nVar.getPlaceholder();
                } else {
                    try {
                        placeholder6 = realShiftTimeFormatter.formatDuration((int) Duration.parse(str10).getSeconds());
                    } catch (Exception e2) {
                        Timber.Forest.w("Failed to parse duration: ".concat(str10), new Object[0], e2);
                        placeholder6 = nVar.getPlaceholder();
                    }
                }
                String str11 = placeholder6;
                String placeholder8 = str8 == null ? nVar.getPlaceholder() : str8;
                boolean z4 = payData.canUseDirectDeposit;
                loaded = new PayHomeViewModel.Loaded(str9, str2, str5, str11, str6, str3, str4, placeholder8, collectSelectedMerchantViewModel, arrayList, z3, z4, z4);
                z = false;
                gapComposer.end(z);
                return loaded;
            }
            loaded = new PayHomeViewModel.Error(((AndroidStringManager) nVar.a).get(R.string.work_pay_home_error_load_failed));
        }
        z = false;
        gapComposer.end(z);
        return loaded;
    }
}
