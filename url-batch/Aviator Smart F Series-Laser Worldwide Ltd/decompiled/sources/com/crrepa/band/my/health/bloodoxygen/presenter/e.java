package com.crrepa.band.my.health.bloodoxygen.presenter;

import android.annotation.SuppressLint;
import com.crrepa.band.my.model.CalendarHistoryCompletionModel;
import com.crrepa.band.my.model.db.TimingBloodOxygen;
import com.crrepa.band.my.model.db.proxy.TimingBloodOxygenDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class e extends com.crrepa.band.my.health.base.h {

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(CalendarHistoryCompletionModel calendarHistoryCompletionModel) {
            ((com.crrepa.band.my.health.base.h) e.this).view.renderHistoryList(calendarHistoryCompletionModel);
        }
    }

    class b implements ObservableOnSubscribe {
        b() {
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(@NonNull ObservableEmitter<CalendarHistoryCompletionModel> observableEmitter) {
            Date date;
            CalendarHistoryCompletionModel calendarHistoryCompletionModel = new CalendarHistoryCompletionModel();
            List<TimingBloodOxygen> all = new TimingBloodOxygenDaoProxy().getAll();
            if (all == null || all.isEmpty()) {
                date = new Date();
            } else {
                date = all.get(0).getDate();
                calendarHistoryCompletionModel.setMonthCompletions(e.this.getHistoryHeartRateCompletion(all));
            }
            calendarHistoryCompletionModel.setStartDate(date);
            calendarHistoryCompletionModel.setType(5);
            observableEmitter.onNext(calendarHistoryCompletionModel);
            observableEmitter.onComplete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.NonNull
    public Map<Long, CalendarHistoryCompletionModel.MonthCompletion> getHistoryHeartRateCompletion(List<TimingBloodOxygen> list) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Long, List<TimingBloodOxygen>> entry : getMonthHistory(list).entrySet()) {
            CalendarHistoryCompletionModel.MonthCompletion monthCompletion = new CalendarHistoryCompletionModel.MonthCompletion();
            HashMap hashMap2 = new HashMap();
            Iterator<TimingBloodOxygen> it = entry.getValue().iterator();
            while (it.hasNext()) {
                hashMap2.put(Integer.valueOf(m.getDayOfMonth(it.next().getDate())), Float.valueOf(1.0f));
            }
            monthCompletion.setCompletions(hashMap2);
            hashMap.put(entry.getKey(), monthCompletion);
        }
        return hashMap;
    }

    private Map<Long, List<TimingBloodOxygen>> getMonthHistory(List<TimingBloodOxygen> list) {
        HashMap hashMap = new HashMap();
        for (TimingBloodOxygen timingBloodOxygen : list) {
            if (timingBloodOxygen.getAverage() != 0) {
                long monthNumber = m.getMonthNumber(timingBloodOxygen.getDate());
                List list2 = (List) hashMap.get(Long.valueOf(monthNumber));
                if (list2 == null || list2.isEmpty()) {
                    list2 = new ArrayList();
                }
                list2.add(timingBloodOxygen);
                hashMap.put(Long.valueOf(monthNumber), list2);
            }
        }
        return hashMap;
    }

    @Override // com.crrepa.band.my.health.base.h
    @SuppressLint({"CheckResult"})
    public void getHistoryData() {
        Observable.create(new b()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }
}
