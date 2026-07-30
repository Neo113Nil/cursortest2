package com.crrepa.band.my.health.physiologicalcycle.presenter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.crrepa.band.aviator.R;
import com.haibin.calendarview.Calendar;
import com.moyoung.dafit.module.common.utils.k;
import com.moyoung.dafit.module.common.utils.m;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class d extends a implements com.moyoung.dafit.module.common.baseui.f {
    private int day;
    private int month;
    private x2.a physiologcalCalendarView;
    private int year;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPhysiologicalDescription$0(Map map, ObservableEmitter observableEmitter) {
        List<Map.Entry<String, Calendar>> orderCalenderList = getOrderCalenderList(map);
        if (orderCalenderList != null) {
            observableEmitter.onNext(orderCalenderList);
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPhysiologicalDescription$1(List list) {
        showPhysiologicalDescription((List<Map.Entry<String, Calendar>>) list);
    }

    private void showPhysiologcalPhase(Context context, Calendar calendar) {
        String scheme = calendar.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            this.physiologcalCalendarView.hidePhysiologcalPhase();
            return;
        }
        String string = context.getString(R.string.ovulation);
        String string2 = context.getString(R.string.ovulation_day);
        String string3 = context.getString(R.string.predicting_physiological_phase, scheme.toLowerCase());
        if (TextUtils.equals(scheme, string) || TextUtils.equals(scheme, string2)) {
            string3 = string3 + context.getString(R.string.pregnancy);
        }
        this.physiologcalCalendarView.renderPhysiologcalPhase(string3);
    }

    @SuppressLint({"CheckResult"})
    private void showPhysiologicalDescription(final Map<String, Calendar> map) {
        this.date = new Date();
        Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.health.physiologicalcycle.presenter.b
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                d.this.lambda$showPhysiologicalDescription$0(map, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.health.physiologicalcycle.presenter.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                d.this.lambda$showPhysiologicalDescription$1((List) obj);
            }
        });
    }

    private void showPregnancyChance(Context context, Calendar calendar) {
        List<Calendar.Scheme> schemes = calendar.getSchemes();
        String scheme = (schemes == null || schemes.isEmpty()) ? null : schemes.get(0).getScheme();
        if (TextUtils.isEmpty(scheme)) {
            this.physiologcalCalendarView.hidePregnancyChance();
            return;
        }
        this.physiologcalCalendarView.renderPregnancyChance(scheme + context.getString(R.string.percent_unit));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.physiologcalCalendarView = null;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonthDays(int i8, int i9) {
        java.util.Calendar calendar = k.getCalendar();
        calendar.set(1, i8);
        calendar.set(2, i9 - 1);
        return m.getMonthCountDay(calendar.getTime());
    }

    public void getSelectedDayInfo(Context context, Calendar calendar) {
        showPhysiologcalPhase(context, calendar);
        showPregnancyChance(context, calendar);
    }

    public void getTitleYearMonth(Context context, int i8, int i9) {
        java.util.Calendar calendar = k.getCalendar();
        calendar.set(1, i8);
        calendar.set(2, i9 - 1);
        calendar.set(5, 1);
        this.physiologcalCalendarView.renderTitleYearMonth(m.format(calendar.getTime(), context.getString(R.string.physiological_year_month_format)));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setCurrentDate(int i8, int i9) {
        this.year = i8;
        this.month = i9;
    }

    public void setLastMonth() {
        int i8 = this.month - 1;
        this.month = i8;
        if (i8 == 0) {
            this.year--;
            this.month = 12;
        }
        this.physiologcalCalendarView.renderLastMonth(this.year, this.month);
    }

    public void setNextMonth() {
        int i8 = this.month + 1;
        this.month = i8;
        if (i8 > 12) {
            this.year++;
            this.month = 1;
        }
        this.physiologcalCalendarView.renderLastMonth(this.year, this.month);
    }

    public void setView(x2.a aVar) {
        this.physiologcalCalendarView = aVar;
        this.day = m.getDayOfMonth(new Date());
    }

    public void setYearMonth(int i8, int i9) {
        this.year = i8;
        this.month = i9;
    }

    @Override // com.crrepa.band.my.health.physiologicalcycle.presenter.a
    protected void showDescription(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.physiologcalCalendarView.renderDescription(str);
    }

    @Override // com.crrepa.band.my.health.physiologicalcycle.presenter.a
    protected void showPhysiologcalPeriodCalendar(Map<String, Calendar> map) {
        this.physiologcalCalendarView.renderPhysiologcalPeriod(map);
        showPhysiologicalDescription(map);
    }
}
