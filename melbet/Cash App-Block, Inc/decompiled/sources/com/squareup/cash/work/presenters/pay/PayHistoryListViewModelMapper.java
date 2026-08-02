package com.squareup.cash.work.presenters.pay;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import coil3.size.DimensionKt;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.PageTagSlotKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.data.real.RealShiftTimeFormatter;
import com.squareup.cash.work.service.api.payroll.PayStubData;
import com.squareup.cash.work.service.api.payroll.PayStubMoney;
import com.squareup.cash.work.viewmodels.PayHistoryListViewModel;
import com.squareup.cash.work.viewmodels.PayHistorySection;
import com.squareup.cash.work.viewmodels.PayHistoryStubViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.moshi.LinkedHashTreeMap;
import j$.time.DesugarLocalDate;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class PayHistoryListViewModelMapper {
    public final AndroidClock clock;
    public final Lazy placeholder$delegate = LazyKt.lazy(new PageTagSlotKt$$ExternalSyntheticLambda0(this, 25));
    public final RealShiftTimeFormatter shiftTimeFormatter;
    public final AndroidStringManager stringManager;

    public PayHistoryListViewModelMapper(AndroidStringManager androidStringManager, AndroidClock androidClock, RealShiftTimeFormatter realShiftTimeFormatter) {
        this.stringManager = androidStringManager;
        this.clock = androidClock;
        this.shiftTimeFormatter = realShiftTimeFormatter;
    }

    public final PayHistoryListViewModel.Loaded map(SellerCardViewModel sellerCardViewModel, String str, List list, boolean z, boolean z2) {
        Lazy lazy;
        String format2;
        String str2;
        Pair pair;
        sellerCardViewModel.getClass();
        AndroidClock androidClock = this.clock;
        YearMonth from = YearMonth.from(DesugarLocalDate.ofInstant(DimensionKt.now(androidClock), ZoneId.of(androidClock.timeZone().getID())));
        String str3 = this.stringManager.get(R.string.work_pay_history_this_month);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PayStubData payStubData = (PayStubData) it.next();
            try {
                pair = new Pair(LocalDate.parse(payStubData.attributes.payDate, PayStubNavigation.PAY_DATE_INPUT_FORMAT), payStubData);
            } catch (Exception e) {
                Timber.Forest.w(Recorder$$ExternalSyntheticOutline2.m("Failed to parse pay date: ", payStubData.attributes.payDate), new Object[0], e);
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            YearMonth from2 = YearMonth.from((LocalDate) ((Pair) next).first);
            Object obj = linkedHashMap.get(from2);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(from2, obj);
            }
            ((List) obj).add(next);
        }
        TreeMap treeMap = new TreeMap(new LinkedHashTreeMap.AnonymousClass1(15));
        treeMap.putAll(linkedHashMap);
        ArrayList arrayList2 = new ArrayList(treeMap.size());
        Iterator it3 = treeMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it3.hasNext();
            lazy = this.placeholder$delegate;
            if (!hasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it3.next();
            YearMonth yearMonth = (YearMonth) entry.getKey();
            List list2 = (List) entry.getValue();
            boolean areEqual = Intrinsics.areEqual(yearMonth, from);
            RealShiftTimeFormatter realShiftTimeFormatter = this.shiftTimeFormatter;
            if (areEqual) {
                format2 = str3;
            } else {
                yearMonth.getClass();
                format2 = yearMonth.format(realShiftTimeFormatter.formatters().monthYear);
                format2.getClass();
            }
            list2.getClass();
            List<Pair> list3 = list2;
            int i = 10;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            for (Pair pair2 : list3) {
                LocalDate localDate = (LocalDate) pair2.first;
                PayStubData payStubData2 = (PayStubData) pair2.second;
                String str4 = payStubData2.id;
                localDate.getClass();
                String format3 = localDate.format(realShiftTimeFormatter.formatters().date);
                format3.getClass();
                PayStubMoney payStubMoney = payStubData2.attributes.netPay;
                Long longOrNull = (payStubMoney == null || (str2 = payStubMoney.amount) == null) ? null : StringsKt.toLongOrNull(i, str2);
                DateTimeFormatter dateTimeFormatter = PayStubNavigation.PAY_DATE_INPUT_FORMAT;
                String str5 = (String) lazy.getValue();
                str5.getClass();
                if (longOrNull != null) {
                    str5 = NumberFormat.getCurrencyInstance(Locale.US).format(longOrNull.longValue() / 100.0d);
                    str5.getClass();
                }
                arrayList3.add(new PayHistoryStubViewModel(str4, format3, str5));
                i = 10;
            }
            arrayList2.add(new PayHistorySection(format2, arrayList3));
        }
        return new PayHistoryListViewModel.Loaded(sellerCardViewModel, str == null ? (String) lazy.getValue() : str, arrayList2, z2, z);
    }
}
