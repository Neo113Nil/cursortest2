package com.crrepa.band.my.health.sleep.presenter;

import com.crrepa.band.my.health.base.h;
import com.crrepa.band.my.model.CalendarHistoryCompletionModel;
import com.crrepa.band.my.model.db.Sleep;
import com.crrepa.band.my.model.db.proxy.SleepDaoProxy;
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
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class c extends h {

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(CalendarHistoryCompletionModel calendarHistoryCompletionModel) {
            c.this.showHistroyCompletion(calendarHistoryCompletionModel);
        }
    }

    class b implements ObservableOnSubscribe {
        b() {
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(@NonNull ObservableEmitter<CalendarHistoryCompletionModel> observableEmitter) {
            Date date;
            List<Sleep> all = SleepDaoProxy.getInstance().getAll();
            CalendarHistoryCompletionModel calendarHistoryCompletionModel = new CalendarHistoryCompletionModel();
            if (all == null || all.isEmpty()) {
                date = new Date();
            } else {
                date = all.get(0).getDate();
                calendarHistoryCompletionModel.setMonthCompletions(c.this.getHistoryStepCompletion(all));
            }
            calendarHistoryCompletionModel.setStartDate(date);
            calendarHistoryCompletionModel.setType(2);
            observableEmitter.onNext(calendarHistoryCompletionModel);
            observableEmitter.onComplete();
        }
    }

    private Map<Long, List<Sleep>> getHistorySleepGroupByMonth(List<Sleep> list) {
        HashMap hashMap = new HashMap();
        for (Sleep sleep : list) {
            long monthNumber = m.getMonthNumber(sleep.getDate());
            List list2 = (List) hashMap.get(Long.valueOf(monthNumber));
            if (list2 == null || list2.isEmpty()) {
                list2 = new ArrayList();
            }
            list2.add(sleep);
            hashMap.put(Long.valueOf(monthNumber), list2);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Map<Long, CalendarHistoryCompletionModel.MonthCompletion> getHistoryStepCompletion(List<Sleep> list) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Long, List<Sleep>> entry : getHistorySleepGroupByMonth(list).entrySet()) {
            CalendarHistoryCompletionModel.MonthCompletion monthCompletion = new CalendarHistoryCompletionModel.MonthCompletion();
            HashMap hashMap2 = new HashMap();
            for (Sleep sleep : entry.getValue()) {
                int dayOfMonth = m.getDayOfMonth(sleep.getDate());
                hashMap2.put(Integer.valueOf(dayOfMonth), z2.d.getCompletion(sleep));
            }
            monthCompletion.setCompletions(hashMap2);
            hashMap.put(entry.getKey(), monthCompletion);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showHistroyCompletion(CalendarHistoryCompletionModel calendarHistoryCompletionModel) {
        this.view.renderHistoryList(calendarHistoryCompletionModel);
    }

    @Override // com.crrepa.band.my.health.base.h
    public void getHistoryData() {
        Observable.create(new b()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }
}
