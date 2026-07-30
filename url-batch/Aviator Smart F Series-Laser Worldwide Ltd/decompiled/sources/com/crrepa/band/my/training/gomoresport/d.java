package com.crrepa.band.my.training.gomoresport;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.crrepa.band.my.health.base.h;
import com.crrepa.band.my.model.CalendarHistoryCompletionModel;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.crrepa.band.my.model.db.proxy.PerformanceInsightsDaoProxy;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class d extends h {
    private int modeType;

    @NonNull
    private Map<Long, CalendarHistoryCompletionModel.MonthCompletion> getHistoryStressCompletion(List<PerformanceInsights> list) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Long, List<PerformanceInsights>> entry : getMonthHistory(list).entrySet()) {
            CalendarHistoryCompletionModel.MonthCompletion monthCompletion = new CalendarHistoryCompletionModel.MonthCompletion();
            HashMap hashMap2 = new HashMap();
            Iterator<PerformanceInsights> it = entry.getValue().iterator();
            while (it.hasNext()) {
                hashMap2.put(Integer.valueOf(m.getDayOfMonth(it.next().getDate())), Float.valueOf(1.0f));
            }
            monthCompletion.setCompletions(hashMap2);
            hashMap.put(entry.getKey(), monthCompletion);
        }
        return hashMap;
    }

    private Map<Long, List<PerformanceInsights>> getMonthHistory(List<PerformanceInsights> list) {
        HashMap hashMap = new HashMap();
        for (PerformanceInsights performanceInsights : list) {
            long monthNumber = m.getMonthNumber(performanceInsights.getDate());
            List list2 = (List) hashMap.get(Long.valueOf(monthNumber));
            if (list2 == null || list2.isEmpty()) {
                list2 = new ArrayList();
            }
            list2.add(performanceInsights);
            hashMap.put(Long.valueOf(monthNumber), list2);
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getHistoryData$0(ObservableEmitter observableEmitter) {
        Date date;
        CalendarHistoryCompletionModel calendarHistoryCompletionModel = new CalendarHistoryCompletionModel();
        List<PerformanceInsights> all = PerformanceInsightsDaoProxy.getInstance().getAll();
        if (x0.isNotEmpty(all)) {
            date = all.get(0).getDate();
            calendarHistoryCompletionModel.setMonthCompletions(getHistoryStressCompletion(all));
        } else {
            date = new Date();
        }
        calendarHistoryCompletionModel.setStartDate(date);
        int i8 = this.modeType;
        calendarHistoryCompletionModel.setType(i8 != 0 ? i8 != 1 ? 9 : 8 : 7);
        observableEmitter.onNext(calendarHistoryCompletionModel);
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getHistoryData$1(CalendarHistoryCompletionModel calendarHistoryCompletionModel) {
        this.view.renderHistoryList(calendarHistoryCompletionModel);
    }

    @Override // com.crrepa.band.my.health.base.h
    @SuppressLint({"CheckResult"})
    public void getHistoryData() {
        Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.training.gomoresport.b
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                d.this.lambda$getHistoryData$0(observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.training.gomoresport.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                d.this.lambda$getHistoryData$1((CalendarHistoryCompletionModel) obj);
            }
        });
    }

    public void setTrainingAnalysis(int i8) {
        this.modeType = i8;
    }
}
