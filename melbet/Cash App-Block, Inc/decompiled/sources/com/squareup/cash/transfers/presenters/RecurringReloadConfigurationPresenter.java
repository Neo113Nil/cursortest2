package com.squareup.cash.transfers.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.cdf.balancebasedaddcash.BalanceBasedAddCashEditAmountViewed;
import com.squareup.cash.cdf.balancebasedaddcash.EditAmountMethod;
import com.squareup.cash.cdf.balancebasedaddcash.EditAmountOption;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.support.views.article.ArticleViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.transfers.screens.RecurringReloadConfigurationScreen;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.repeatedly.common.RecurringSchedule;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class RecurringReloadConfigurationPresenter implements MoleculePresenter {
    public static final List PRESET_MIN_BALANCE_AMOUNTS = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{2000L, 4000L, 6000L, 8000L, 10000L});
    public static final List PRESET_SCHEDULED_AMOUNTS = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{1000L, 2000L, 5000L, 10000L, 20000L});
    public final Analytics analytics;
    public final RecurringReloadConfigurationScreen args;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final AndroidStringManager stringManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecurringSchedule.Frequency.values().length];
            try {
                iArr[RecurringSchedule.Frequency.EVERY_DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RecurringSchedule.Frequency.EVERY_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RecurringReloadConfigurationScreen.ScheduledStartAt.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Parcelable.Creator<RecurringReloadConfigurationScreen.ScheduledStartAt> creator = RecurringReloadConfigurationScreen.ScheduledStartAt.CREATOR;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Parcelable.Creator<RecurringReloadConfigurationScreen.ScheduledStartAt> creator2 = RecurringReloadConfigurationScreen.ScheduledStartAt.CREATOR;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public RecurringReloadConfigurationPresenter(LocalizedMoneyFormatter.Factory factory, AndroidStringManager androidStringManager, Analytics analytics, RecurringReloadConfigurationScreen recurringReloadConfigurationScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        recurringReloadConfigurationScreen.getClass();
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.args = recurringReloadConfigurationScreen;
        this.navigator = screenNavigator;
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public static final long access$maxReloadAmountCents(RecurringReloadConfigurationPresenter recurringReloadConfigurationPresenter, Money money) {
        CurrencyCode currencyCode = money.currency_code;
        if (currencyCode == null) {
            currencyCode = CurrencyCode.USD;
        }
        Long l = ((Money) CollectionsKt.last((List) generatePresets(money, new Money((Long) 2000L, currencyCode, 4)))).amount;
        return Math.max(l != null ? l.longValue() : 0L, 100000L);
    }

    public static ListBuilder generatePresets(Money money, Money money2) {
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        for (int i = 0; i < 5; i++) {
            createListBuilder.add(money);
            money = Moneys.plus(money, money2);
        }
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    public final ArrayList buildAmountPickerItems(AbstractList abstractList, Money money, String str) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(abstractList, 10));
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            Money money2 = (Money) it.next();
            arrayList.add(new RecurringReloadConfigurationViewModel.AmountPickerItem.Amount(money2, this.moneyFormatter.format(money2), money2.equals(money)));
        }
        return CollectionsKt.plus((Collection) arrayList, (Object) new RecurringReloadConfigurationViewModel.AmountPickerItem.Custom(str, false));
    }

    public final String buildScheduledAmountSubtitle(RecurringSchedule.Frequency frequency, Integer num) {
        Resources resources = this.stringManager.resources;
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("MMMM d", Locale.getDefault());
        LocalDate now = LocalDate.now();
        int i = frequency == null ? -1 : WhenMappings.$EnumSwitchMapping$0[frequency.ordinal()];
        if (i == 1) {
            String format2 = ofPattern.format(now.plusDays(1L));
            format2.getClass();
            resources.getClass();
            String format3 = new MessageFormat(resources.getString(R.string.recurring_reload_scheduled_amount_subtitle_daily)).format(new Object[]{format2});
            format3.getClass();
            return format3;
        }
        if (i == 2) {
            DayOfWeek of = DayOfWeek.of(num != null ? num.intValue() : 1);
            of.getClass();
            String displayName = of.getDisplayName(TextStyle.FULL, Locale.getDefault());
            LocalDate with = now.with(TemporalAdjusters.next(of));
            displayName.getClass();
            String format4 = ofPattern.format(with);
            format4.getClass();
            resources.getClass();
            String format5 = new MessageFormat(resources.getString(R.string.recurring_reload_scheduled_amount_subtitle_weekly)).format(new Object[]{displayName, format4});
            format5.getClass();
            return format5;
        }
        if (i != 3) {
            return "";
        }
        int intValue = num != null ? num.intValue() : 1;
        String str = "th";
        if (11 > intValue || intValue >= 14) {
            int i2 = intValue % 10;
            if (i2 == 1) {
                str = "st";
            } else if (i2 == 2) {
                str = "nd";
            } else if (i2 == 3) {
                str = "rd";
            }
        }
        String str2 = intValue + str;
        now.getClass();
        int lengthOfMonth = now.lengthOfMonth();
        if (intValue <= lengthOfMonth) {
            lengthOfMonth = intValue;
        }
        LocalDate withDayOfMonth = now.withDayOfMonth(lengthOfMonth);
        if (!withDayOfMonth.isAfter(now)) {
            LocalDate plusMonths = now.plusMonths(1L);
            int lengthOfMonth2 = plusMonths.lengthOfMonth();
            if (intValue > lengthOfMonth2) {
                intValue = lengthOfMonth2;
            }
            withDayOfMonth = plusMonths.withDayOfMonth(intValue);
            withDayOfMonth.getClass();
        }
        String displayName2 = withDayOfMonth.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        displayName2.getClass();
        resources.getClass();
        String format6 = new MessageFormat(resources.getString(R.string.recurring_reload_scheduled_amount_subtitle_monthly)).format(new Object[]{str2, displayName2});
        format6.getClass();
        return format6;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object copy$default;
        ArrayList arrayList;
        String str;
        Integer num;
        boolean z;
        CurrencyCode currencyCode;
        CurrencyCode currencyCode2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1654053447);
        RecurringReloadConfigurationScreen recurringReloadConfigurationScreen = this.args;
        Object[] objArr = {recurringReloadConfigurationScreen.mode};
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new PageTagSlotKt$$ExternalSyntheticLambda0(this, 5);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
        RecurringReloadConfigurationScreen.Mode mode = recurringReloadConfigurationScreen.mode;
        RecurringReloadConfigurationScreen.Mode.BalanceBased balanceBased = mode instanceof RecurringReloadConfigurationScreen.Mode.BalanceBased ? (RecurringReloadConfigurationScreen.Mode.BalanceBased) mode : null;
        String str2 = balanceBased != null ? balanceBased.flowToken : null;
        Object[] objArr2 = new Object[0];
        Object rememberedValue2 = gapComposer.rememberedValue();
        int i2 = 3;
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new ArticleViewKt$$ExternalSyntheticLambda7(i2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer, 48);
        Object[] objArr3 = new Object[0];
        Object rememberedValue3 = gapComposer.rememberedValue();
        int i3 = 4;
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new ArticleViewKt$$ExternalSyntheticLambda7(i3);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState3 = (MutableState) SaverKt.rememberSaveable(objArr3, (Function0) rememberedValue3, gapComposer, 48);
        if (str2 != null) {
            boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
            Analytics analytics = this.analytics;
            if (!booleanValue && (((RecurringReloadConfigurationViewModel) mutableState.getValue()) instanceof RecurringReloadConfigurationViewModel.SelectMinBalance)) {
                mutableState2.setValue(Boolean.TRUE);
                analytics.track(new BalanceBasedAddCashEditAmountViewed(EditAmountOption.MIN_BALANCE, ((RecurringReloadConfigurationViewModel) mutableState.getValue()) instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad ? EditAmountMethod.KEYPAD : EditAmountMethod.ATM, str2), null);
            }
            if (!((Boolean) mutableState3.getValue()).booleanValue() && (((RecurringReloadConfigurationViewModel) mutableState.getValue()) instanceof RecurringReloadConfigurationViewModel.SelectReloadAmount)) {
                mutableState3.setValue(Boolean.TRUE);
                analytics.track(new BalanceBasedAddCashEditAmountViewed(EditAmountOption.INCREMENT, ((RecurringReloadConfigurationViewModel) mutableState.getValue()) instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad ? EditAmountMethod.KEYPAD : EditAmountMethod.ATM, str2), null);
            }
        }
        Updater.LaunchedEffect(gapComposer, flow, new WorkflowLayout$start$1(flow, (Continuation) null, this, str2, mutableState, 9));
        RecurringReloadConfigurationViewModel recurringReloadConfigurationViewModel = (RecurringReloadConfigurationViewModel) mutableState.getValue();
        AndroidStringManager androidStringManager = this.stringManager;
        String str3 = androidStringManager.get(R.string.recurring_reload_select_min_balance_title);
        String str4 = androidStringManager.get(R.string.recurring_reload_select_min_balance_continue_button);
        String str5 = androidStringManager.get(R.string.recurring_reload_select_reload_amount_title);
        String str6 = androidStringManager.get(R.string.recurring_reload_select_reload_amount_continue_button);
        String str7 = androidStringManager.get(R.string.recurring_reload_custom_amount_chip_label);
        boolean z2 = recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker;
        List list = PRESET_MIN_BALANCE_AMOUNTS;
        if (z2) {
            RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker selectMinBalanceAtmPicker = (RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker) recurringReloadConfigurationViewModel;
            Money money = selectMinBalanceAtmPicker.existingReloadAmount;
            if (money == null || (currencyCode2 = money.currency_code) == null) {
                currencyCode2 = CurrencyCode.USD;
            }
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new Money(Long.valueOf(((Number) it.next()).longValue()), currencyCode2, 4));
            }
            copy$default = RecurringReloadConfigurationViewModel.SelectMinBalanceAtmPicker.copy$default(selectMinBalanceAtmPicker, null, str3, str4, buildAmountPickerItems(arrayList2, selectMinBalanceAtmPicker.minBalance, str7), 7);
            z = false;
        } else {
            boolean z3 = recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad;
            MoneyFormatter moneyFormatter = this.moneyFormatter;
            if (z3) {
                RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad selectMinBalanceKeypad = (RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad) recurringReloadConfigurationViewModel;
                Money money2 = selectMinBalanceKeypad.existingReloadAmount;
                if (money2 == null || (currencyCode = money2.currency_code) == null) {
                    currencyCode = CurrencyCode.USD;
                }
                copy$default = RecurringReloadConfigurationViewModel.SelectMinBalanceKeypad.copy$default(selectMinBalanceKeypad, null, false, str3, Recorder$$ExternalSyntheticOutline2.m(moneyFormatter.format(new Money((Long) CollectionsKt.first(list), currencyCode, 4)), " – ", moneyFormatter.format(new Money((Long) 100000L, currencyCode, 4))), str4, 7);
            } else if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) {
                RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker selectReloadAmountAtmPicker = (RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker) recurringReloadConfigurationViewModel;
                Money money3 = selectReloadAmountAtmPicker.minBalance;
                CurrencyCode currencyCode3 = money3.currency_code;
                if (currencyCode3 == null) {
                    currencyCode3 = CurrencyCode.USD;
                }
                copy$default = RecurringReloadConfigurationViewModel.SelectReloadAmountAtmPicker.copy$default(selectReloadAmountAtmPicker, null, str5, str6, buildAmountPickerItems(generatePresets(money3, new Money((Long) 2000L, currencyCode3, 4)), selectReloadAmountAtmPicker.reloadAmount, str7), 7);
            } else if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad) {
                RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad selectReloadAmountKeypad = (RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad) recurringReloadConfigurationViewModel;
                Money money4 = selectReloadAmountKeypad.minBalance;
                CurrencyCode currencyCode4 = money4.currency_code;
                if (currencyCode4 == null) {
                    currencyCode4 = CurrencyCode.USD;
                }
                ListBuilder generatePresets = generatePresets(money4, new Money((Long) 2000L, currencyCode4, 4));
                Long l = ((Money) CollectionsKt.last((List) generatePresets)).amount;
                copy$default = RecurringReloadConfigurationViewModel.SelectReloadAmountKeypad.copy$default(selectReloadAmountKeypad, null, false, str5, Recorder$$ExternalSyntheticOutline2.m(moneyFormatter.format((Money) CollectionsKt.first((List) generatePresets)), " – ", moneyFormatter.format(new Money(Long.valueOf(Math.max(l != null ? l.longValue() : 0L, 100000L)), currencyCode4, 4))), str6, 71);
            } else if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectFrequency) {
                copy$default = RecurringReloadConfigurationViewModel.SelectFrequency.copy$default((RecurringReloadConfigurationViewModel.SelectFrequency) recurringReloadConfigurationViewModel, null, androidStringManager.get(R.string.recurring_reload_frequency_title), androidStringManager.get(R.string.recurring_reload_frequency_continue_button), 3);
            } else if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectDay) {
                RecurringReloadConfigurationViewModel.SelectDay selectDay = (RecurringReloadConfigurationViewModel.SelectDay) recurringReloadConfigurationViewModel;
                boolean z4 = selectDay.frequency == RecurringSchedule.Frequency.EVERY_MONTH;
                String str8 = z4 ? androidStringManager.get(R.string.recurring_reload_day_monthly_title) : androidStringManager.get(R.string.recurring_reload_day_weekly_title);
                String str9 = androidStringManager.get(R.string.recurring_reload_day_continue_button);
                if (z4) {
                    IntRange intRange = new IntRange(1, 31, 1);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange, 10));
                    IntProgressionIterator it2 = intRange.iterator();
                    while (it2.hasNext) {
                        arrayList.add(String.valueOf(it2.nextInt()));
                    }
                } else {
                    IntRange intRange2 = new IntRange(1, 7, 1);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRange2, 10));
                    IntProgressionIterator it3 = intRange2.iterator();
                    while (it3.hasNext) {
                        DayOfWeek of = DayOfWeek.of(it3.nextInt());
                        of.getClass();
                        arrayList.add(of.getDisplayName(TextStyle.FULL, Locale.getDefault()));
                    }
                }
                ArrayList arrayList3 = arrayList;
                if (z4 && (num = selectDay.selectedIndex) != null) {
                    int intValue = num.intValue();
                    if (29 > intValue || intValue >= 32) {
                        num = null;
                    }
                    if (num != null) {
                        String valueOf = String.valueOf(num.intValue());
                        valueOf.getClass();
                        Resources resources = androidStringManager.resources;
                        resources.getClass();
                        String format2 = new MessageFormat(resources.getString(R.string.recurring_reload_day_monthly_disclaimer)).format(new Object[]{valueOf});
                        format2.getClass();
                        str = format2;
                        copy$default = RecurringReloadConfigurationViewModel.SelectDay.copy$default(selectDay, arrayList3, null, str, str8, str9, 21);
                    }
                }
                str = null;
                copy$default = RecurringReloadConfigurationViewModel.SelectDay.copy$default(selectDay, arrayList3, null, str, str8, str9, 21);
            } else if (recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) {
                RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker selectScheduledAmountAtmPicker = (RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker) recurringReloadConfigurationViewModel;
                String str10 = androidStringManager.get(R.string.recurring_reload_scheduled_amount_title);
                String buildScheduledAmountSubtitle = buildScheduledAmountSubtitle(selectScheduledAmountAtmPicker.frequency, selectScheduledAmountAtmPicker.dayOfPeriod);
                String str11 = androidStringManager.get(R.string.recurring_reload_scheduled_amount_continue_button);
                List list3 = PRESET_SCHEDULED_AMOUNTS;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(new Money(Long.valueOf(((Number) it4.next()).longValue()), CurrencyCode.USD, 4));
                }
                copy$default = RecurringReloadConfigurationViewModel.SelectScheduledAmountAtmPicker.copy$default(selectScheduledAmountAtmPicker, null, buildScheduledAmountSubtitle, str10, str11, buildAmountPickerItems(arrayList4, selectScheduledAmountAtmPicker.selectedAmount, str7), 23);
            } else {
                if (!(recurringReloadConfigurationViewModel instanceof RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad selectScheduledAmountKeypad = (RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad) recurringReloadConfigurationViewModel;
                copy$default = RecurringReloadConfigurationViewModel.SelectScheduledAmountKeypad.copy$default(selectScheduledAmountKeypad, buildScheduledAmountSubtitle(selectScheduledAmountKeypad.frequency, selectScheduledAmountKeypad.dayOfPeriod), null, false, androidStringManager.get(R.string.recurring_reload_scheduled_amount_title), androidStringManager.get(R.string.recurring_reload_scheduled_amount_continue_button), EnumC0170g.SDK_ASSET_ILLUSTRATION_MANAGE_CONNECTIONS_VALUE);
            }
            z = false;
        }
        gapComposer.end(z);
        return copy$default;
    }
}
