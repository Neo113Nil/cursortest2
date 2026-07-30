package com.crrepa.band.my.health.physiologicalcycle.presenter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.PhysiologcalPeriodModel;
import com.crrepa.band.my.model.db.PhysiologicalPeriod;
import com.crrepa.band.my.model.db.proxy.PhysiologicalPeriodDaoProxy;
import com.haibin.calendarview.Calendar;
import com.moyoung.dafit.module.common.utils.d0;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.m;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {
    public static final int LUTEAL_PHASE = 9;
    public static final int OVULATION_DAY = 14;
    public static final int OVULATION_PERIOD = 10;
    protected int curTextColor;
    protected Date date = new Date();
    protected String follicularPhase;
    protected String lutealPhase;
    protected String menstruation;
    protected int menstruationColor;
    protected int month;
    protected String ovulation;
    protected int ovulationColor;
    protected String ovulationDay;
    protected int ovulationDayColor;
    protected int predictedMenstruationColor;
    protected int safetyPeriodColor;
    protected int year;

    /* renamed from: com.crrepa.band.my.health.physiologicalcycle.presenter.a$a, reason: collision with other inner class name */
    class C0203a implements Consumer {
        C0203a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Map<String, Calendar> map) {
            a.this.showPhysiologcalPeriodCalendar(map);
        }
    }

    class b implements ObservableOnSubscribe {
        final /* synthetic */ Context val$context;
        final /* synthetic */ Calendar val$maxCalendar;
        final /* synthetic */ Calendar val$minCalendar;

        b(Context context, Calendar calendar, Calendar calendar2) {
            this.val$context = context;
            this.val$minCalendar = calendar;
            this.val$maxCalendar = calendar2;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<Map<String, Calendar>> observableEmitter) {
            Map<String, Calendar> schemeCalendar = a.this.getSchemeCalendar(this.val$context, this.val$minCalendar, this.val$maxCalendar);
            if (schemeCalendar != null) {
                observableEmitter.onNext(schemeCalendar);
            }
            observableEmitter.onComplete();
        }
    }

    class c implements Comparator {
        c() {
        }

        @Override // java.util.Comparator
        public int compare(Map.Entry<String, Calendar> entry, Map.Entry<String, Calendar> entry2) {
            return entry.getValue().compareTo(entry2.getValue());
        }
    }

    class d implements Consumer {
        d() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(String str) {
            a.this.showDescription(str);
        }
    }

    class e implements ObservableOnSubscribe {
        final /* synthetic */ List val$calendarList;

        e(List list) {
            this.val$calendarList = list;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<String> observableEmitter) {
            String strings = a.this.getStrings(this.val$calendarList);
            if (!TextUtils.isEmpty(strings)) {
                observableEmitter.onNext(strings);
            }
            observableEmitter.onComplete();
        }
    }

    private Calendar createSchemeCalendar(java.util.Calendar calendar, int i8, String str, int i9) {
        Calendar calendar2 = new Calendar();
        calendar2.setYear(calendar.get(1));
        calendar2.setMonth(calendar.get(2) + 1);
        calendar2.setDay(calendar.get(5));
        if (i8 == this.menstruationColor || i8 == this.predictedMenstruationColor) {
            i8 = (calendar2.getTimeInMillis() <= this.date.getTime() || m.isSameDay(new Date(calendar.getTimeInMillis()), this.date)) ? this.menstruationColor : this.predictedMenstruationColor;
        }
        calendar2.setSchemeColor(i8);
        calendar2.setScheme(str);
        calendar2.addScheme(i8, String.valueOf(i9));
        return calendar2;
    }

    private PhysiologcalPeriodModel getNextPhysiologicalPeriod(List<PhysiologicalPeriod> list, java.util.Calendar calendar) {
        if (list.isEmpty()) {
            return null;
        }
        PhysiologicalPeriod remove = list.remove(0);
        Date lastMenstrualDate = remove.getLastMenstrualDate();
        Integer menstrualPeriod = remove.getMenstrualPeriod();
        Integer physiologicalPeriod = remove.getPhysiologicalPeriod();
        if (lastMenstrualDate == null || menstrualPeriod == null || physiologicalPeriod == null) {
            return getNextPhysiologicalPeriod(list, calendar);
        }
        calendar.setTime(lastMenstrualDate);
        PhysiologcalPeriodModel physiologcalPeriodModel = new PhysiologcalPeriodModel();
        physiologcalPeriodModel.setMenstrualYear(calendar.get(1));
        physiologcalPeriodModel.setMenstrualMonth(calendar.get(2) + 1);
        physiologcalPeriodModel.setMenstrualDay(calendar.get(5));
        physiologcalPeriodModel.setMenstrualPeriod(menstrualPeriod.intValue());
        physiologcalPeriodModel.setPhysiologicalPeriod(physiologicalPeriod.intValue());
        return physiologcalPeriodModel;
    }

    @Nullable
    private PhysiologcalPeriodModel getNextPredictedPhysiologcalPeriodModel(PhysiologcalPeriodModel physiologcalPeriodModel, PhysiologcalPeriodModel physiologcalPeriodModel2, int i8) {
        if (physiologcalPeriodModel == null) {
            return physiologcalPeriodModel2;
        }
        if (physiologcalPeriodModel2.getDayOffset(physiologcalPeriodModel) < i8) {
            return null;
        }
        return physiologcalPeriodModel2;
    }

    private void getPhysiologcalPeriodColor(Context context) {
        this.menstruationColor = ContextCompat.getColor(context, R.color.color_menstruation);
        this.predictedMenstruationColor = ContextCompat.getColor(context, R.color.color_prediction_menstruation);
        this.ovulationColor = ContextCompat.getColor(context, R.color.color_physiological_fertile);
        this.ovulationDayColor = ContextCompat.getColor(context, R.color.color_physiological_ovulation);
        this.safetyPeriodColor = ContextCompat.getColor(context, R.color.color_safety_period);
        this.curTextColor = ContextCompat.getColor(context, R.color.black);
    }

    private void getPhysiologcalPeriodText(Context context) {
        this.menstruation = context.getString(R.string.menstruation);
        this.ovulation = context.getString(R.string.ovulation);
        this.ovulationDay = context.getString(R.string.ovulation_day);
        this.follicularPhase = context.getString(R.string.follicular_phase);
        this.lutealPhase = context.getString(R.string.luteal_phase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public Map<String, Calendar> getSchemeCalendar(Context context, Calendar calendar, Calendar calendar2) {
        PhysiologcalPeriodModel physiologcalPeriodModel;
        boolean z7;
        PhysiologcalPeriodModel physiologcalPeriodModel2;
        List<PhysiologicalPeriod> all = new PhysiologicalPeriodDaoProxy().getAll();
        PhysiologcalPeriodModel physiologcalPeriodModel3 = null;
        if (all == null || all.isEmpty()) {
            return null;
        }
        com.orhanobut.logger.f.d("PhysiologicalPeriod size: " + all.size());
        getPhysiologcalPeriodColor(context);
        getPhysiologcalPeriodText(context);
        java.util.Calendar calendar3 = k.getCalendar();
        PhysiologcalPeriodModel nextPhysiologicalPeriod = getNextPhysiologicalPeriod(all, calendar3);
        int year = calendar.getYear();
        int year2 = calendar2.getYear();
        HashMap hashMap = new HashMap();
        boolean z8 = false;
        for (int i8 = year; i8 < year2; i8++) {
            int i9 = 1;
            while (i9 <= 12) {
                if (isPhysiologcalPeriod(nextPhysiologicalPeriod, i8, i9)) {
                    com.orhanobut.logger.f.d("year: " + i8 + ",month: " + i9);
                    int physiologicalPeriod = nextPhysiologicalPeriod.getPhysiologicalPeriod();
                    PhysiologcalPeriodModel insertPhysiologcalPeriod = insertPhysiologcalPeriod(hashMap, nextPhysiologicalPeriod, calendar3, this.menstruationColor);
                    PhysiologcalPeriodModel nextPhysiologicalPeriod2 = getNextPhysiologicalPeriod(all, calendar3);
                    physiologcalPeriodModel3 = getNextPredictedPhysiologcalPeriodModel(nextPhysiologicalPeriod2, insertPhysiologcalPeriod, physiologicalPeriod);
                    physiologcalPeriodModel = nextPhysiologicalPeriod2;
                    z7 = true;
                } else {
                    physiologcalPeriodModel = nextPhysiologicalPeriod;
                    z7 = z8;
                }
                if (z7 && isPhysiologcalPeriod(physiologcalPeriodModel3, i8, i9)) {
                    physiologcalPeriodModel3 = getNextPredictedPhysiologcalPeriodModel(physiologcalPeriodModel, insertPhysiologcalPeriod(hashMap, physiologcalPeriodModel3, calendar3, this.predictedMenstruationColor), physiologcalPeriodModel3.getPhysiologicalPeriod());
                }
                PhysiologcalPeriodModel physiologcalPeriodModel4 = physiologcalPeriodModel3;
                if (z7 || isPhysiologcalPeriod(physiologcalPeriodModel, i8, i9)) {
                    physiologcalPeriodModel2 = physiologcalPeriodModel4;
                } else {
                    physiologcalPeriodModel2 = physiologcalPeriodModel4;
                    insertPreviousCalender(hashMap, physiologcalPeriodModel, calendar3, i8, i9);
                }
                if (isSameMonth(physiologcalPeriodModel2, i8, i9) || isSameMonth(physiologcalPeriodModel, i8, i9)) {
                    i9--;
                }
                i9++;
                physiologcalPeriodModel3 = physiologcalPeriodModel2;
                nextPhysiologicalPeriod = physiologcalPeriodModel;
                z8 = z7;
            }
        }
        return hashMap;
    }

    private PhysiologcalPeriodModel insertPhysiologcalPeriod(Map<String, Calendar> map, PhysiologcalPeriodModel physiologcalPeriodModel, java.util.Calendar calendar, int i8) {
        calendar.set(1, physiologcalPeriodModel.getMenstrualYear());
        calendar.set(2, physiologcalPeriodModel.getMenstrualMonth() - 1);
        calendar.set(5, physiologcalPeriodModel.getMenstrualDay());
        int menstrualPeriod = physiologcalPeriodModel.getMenstrualPeriod();
        int physiologicalPeriod = physiologcalPeriodModel.getPhysiologicalPeriod();
        for (int i9 = 0; i9 < menstrualPeriod; i9++) {
            Calendar createSchemeCalendar = createSchemeCalendar(calendar, i8, this.menstruation, d0.getMenstruationPregnancyPrecent(i9));
            map.put(createSchemeCalendar.toString(), createSchemeCalendar);
            calendar.add(5, 1);
        }
        int i10 = (physiologicalPeriod - 19) - menstrualPeriod;
        for (int i11 = 0; i11 < i10; i11++) {
            Calendar createSchemeCalendar2 = createSchemeCalendar(calendar, this.safetyPeriodColor, this.follicularPhase, d0.getFollicularPregnancyPrecent(i11));
            map.put(createSchemeCalendar2.toString(), createSchemeCalendar2);
            calendar.add(5, 1);
        }
        int i12 = (physiologicalPeriod - 9) - menstrualPeriod;
        if (10 < i12) {
            i12 = 10;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = this.ovulationColor;
            String str = this.ovulation;
            if ((i12 + 9) - i13 == 14) {
                i14 = this.ovulationDayColor;
                str = this.ovulationDay;
            }
            Calendar createSchemeCalendar3 = createSchemeCalendar(calendar, i14, str, d0.getOvulationPregnancyPrecent(i13));
            map.put(createSchemeCalendar3.toString(), createSchemeCalendar3);
            calendar.add(5, 1);
        }
        int i15 = physiologicalPeriod - menstrualPeriod;
        if (9 < i15) {
            i15 = 9;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            Calendar createSchemeCalendar4 = createSchemeCalendar(calendar, this.safetyPeriodColor, this.lutealPhase, d0.getLutealPregnancyPrecent(i16));
            map.put(createSchemeCalendar4.toString(), createSchemeCalendar4);
            calendar.add(5, 1);
        }
        physiologcalPeriodModel.setMenstrualYear(calendar.get(1));
        physiologcalPeriodModel.setMenstrualMonth(calendar.get(2) + 1);
        physiologcalPeriodModel.setMenstrualDay(calendar.get(5));
        return physiologcalPeriodModel;
    }

    private void insertPreviousCalender(Map<String, Calendar> map, PhysiologcalPeriodModel physiologcalPeriodModel, java.util.Calendar calendar, int i8, int i9) {
        calendar.set(1, i8);
        calendar.set(2, i9);
        if (i8 < physiologcalPeriodModel.getMenstrualYear()) {
            calendar.set(5, 1);
            int monthCountDay = m.getMonthCountDay(calendar.getTime());
            for (int i10 = 0; i10 < monthCountDay; i10++) {
                Calendar createSchemeCalendar = createSchemeCalendar(calendar, this.safetyPeriodColor, this.menstruation, 0);
                map.put(createSchemeCalendar.toString(), createSchemeCalendar);
                calendar.add(5, 1);
            }
            return;
        }
        if (i8 == physiologcalPeriodModel.getMenstrualYear()) {
            if (i9 < physiologcalPeriodModel.getMenstrualMonth()) {
                calendar.set(5, 1);
                int monthCountDay2 = m.getMonthCountDay(calendar.getTime());
                for (int i11 = 0; i11 < monthCountDay2; i11++) {
                    Calendar createSchemeCalendar2 = createSchemeCalendar(calendar, this.safetyPeriodColor, this.menstruation, 0);
                    map.put(createSchemeCalendar2.toString(), createSchemeCalendar2);
                    calendar.add(5, 1);
                }
                return;
            }
            if (i9 == physiologcalPeriodModel.getMenstrualMonth()) {
                calendar.set(5, 1);
                for (int i12 = 0; i12 < physiologcalPeriodModel.getMenstrualDay(); i12++) {
                    Calendar createSchemeCalendar3 = createSchemeCalendar(calendar, this.safetyPeriodColor, this.menstruation, 0);
                    map.put(createSchemeCalendar3.toString(), createSchemeCalendar3);
                    calendar.add(5, 1);
                }
            }
        }
    }

    private boolean isPhysiologcalPeriod(PhysiologcalPeriodModel physiologcalPeriodModel, int i8, int i9) {
        return physiologcalPeriodModel != null && physiologcalPeriodModel.getMenstrualYear() == i8 && physiologcalPeriodModel.getMenstrualMonth() == i9;
    }

    private boolean isSameMonth(PhysiologcalPeriodModel physiologcalPeriodModel, int i8, int i9) {
        return physiologcalPeriodModel != null && physiologcalPeriodModel.getMenstrualYear() == i8 && physiologcalPeriodModel.getMenstrualMonth() == i9;
    }

    protected List<Map.Entry<String, Calendar>> getOrderCalenderList(Map<String, Calendar> map) {
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new c());
        return arrayList;
    }

    @SuppressLint({"CheckResult"})
    public void getPhysiologcalPeriod(Context context, Calendar calendar, Calendar calendar2) {
        Observable.create(new b(context, calendar, calendar2)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C0203a());
    }

    public PhysiologcalPeriodModel getPhysiologicalPeriodModel() {
        List<PhysiologicalPeriod> all = new PhysiologicalPeriodDaoProxy().getAll();
        if (all == null || all.isEmpty()) {
            return null;
        }
        com.orhanobut.logger.f.d("PhysiologicalPeriod size: " + all.size());
        return getNextPhysiologicalPeriod(all, k.getCalendar());
    }

    public String getStrings(List<Map.Entry<String, Calendar>> list) {
        int i8;
        Resources resources = com.moyoung.dafit.module.common.utils.d.get().getResources();
        int todayIndex = w2.a.getTodayIndex(this.date, list);
        Calendar value = list.get(todayIndex).getValue();
        if (value.getSchemeColor() == this.menstruationColor || value.getSchemeColor() == this.predictedMenstruationColor) {
            int i9 = 0;
            while (todayIndex < list.size() && (list.get(todayIndex).getValue().getSchemeColor() == this.menstruationColor || list.get(todayIndex).getValue().getSchemeColor() == this.predictedMenstruationColor)) {
                i9++;
                todayIndex++;
            }
            return resources.getString(R.string.physiological_period_expected_to_end, i9 + "");
        }
        if (value.getSchemeColor() == this.ovulationColor) {
            int i10 = 0;
            while (todayIndex < list.size() && (value.getSchemeColor() == list.get(todayIndex).getValue().getSchemeColor() || list.get(todayIndex).getValue().getSchemeColor() == this.ovulationDayColor)) {
                i10++;
                todayIndex++;
            }
            return resources.getString(R.string.physiological_ovulation_period_expected_to_end, i10 + "");
        }
        if (value.getSchemeColor() == this.ovulationDayColor) {
            return resources.getString(R.string.physiological_today_is_ovulation_day);
        }
        int i11 = 0;
        while (true) {
            if (todayIndex >= list.size()) {
                i8 = 0;
                break;
            }
            if (value.getSchemeColor() != list.get(todayIndex).getValue().getSchemeColor()) {
                i8 = list.get(todayIndex).getValue().getSchemeColor();
                break;
            }
            i11++;
            todayIndex++;
        }
        if (i8 == this.menstruationColor || i8 == this.predictedMenstruationColor) {
            return resources.getString(R.string.physiological_period_expected_to_start, i11 + "");
        }
        return resources.getString(R.string.physiological_ovulation_period_expected_to_start, i11 + "");
    }

    protected void showDescription(String str) {
    }

    protected void showPhysiologcalPeriodCalendar(Map<String, Calendar> map) {
    }

    @SuppressLint({"CheckResult"})
    public void showPhysiologicalDescription(List<Map.Entry<String, Calendar>> list) {
        Observable.create(new e(list)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d());
    }
}
