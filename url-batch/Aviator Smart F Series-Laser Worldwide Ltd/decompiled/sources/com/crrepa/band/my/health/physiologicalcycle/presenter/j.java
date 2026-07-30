package com.crrepa.band.my.health.physiologicalcycle.presenter;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.proxy.PhysiologicalPeriodDaoProxy;
import com.haibin.calendarview.Calendar;
import com.moyoung.dafit.module.common.utils.m;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class j extends a {
    x2.c physiologicalHolderView;

    private List<Map.Entry<String, Calendar>> getBarList(Map<String, Calendar> map) {
        List<Map.Entry<String, Calendar>> orderCalenderList = getOrderCalenderList(map);
        int todayIndex = w2.a.getTodayIndex(this.date, orderCalenderList);
        showPhysiologicalDescription(orderCalenderList);
        getCountDay(orderCalenderList);
        int i8 = todayIndex - 4;
        if (i8 < 0) {
            i8 = 0;
        }
        int i9 = i8 + 8;
        if (i9 > orderCalenderList.size() - 1) {
            i9 = orderCalenderList.size() - 1;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < orderCalenderList.size(); i10++) {
            if (i10 >= i8 && i10 <= i9) {
                arrayList.add(orderCalenderList.get(i10));
            }
        }
        handleBarListPhysiological(arrayList);
        return arrayList;
    }

    private void handleBarListPhysiological(List<Map.Entry<String, Calendar>> list) {
        for (Map.Entry<String, Calendar> entry : list) {
            Calendar value = entry.getValue();
            if (value.getSchemeColor() == this.menstruationColor || value.getSchemeColor() == this.predictedMenstruationColor) {
                Date date = new Date(value.getTimeInMillis());
                if (value.getTimeInMillis() <= this.date.getTime() || m.isSameDay(date, this.date)) {
                    value.setSchemeColor(this.menstruationColor);
                    entry.setValue(value);
                } else {
                    value.setSchemeColor(this.predictedMenstruationColor);
                    entry.setValue(value);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getCountDay$2(List list, ObservableEmitter observableEmitter) {
        String countDayText = getCountDayText(list);
        if (!TextUtils.isEmpty(countDayText)) {
            observableEmitter.onNext(countDayText);
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPhysiologcalPeriodCalendar$0(Map map, ObservableEmitter observableEmitter) {
        List<Map.Entry<String, Calendar>> barList = getBarList(map);
        if (barList != null) {
            observableEmitter.onNext(barList);
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showPhysiological, reason: merged with bridge method [inline-methods] */
    public void lambda$showPhysiologcalPeriodCalendar$1(List<Map.Entry<String, Calendar>> list) {
        this.physiologicalHolderView.renderBarList(list);
    }

    @SuppressLint({"CheckResult"})
    public void getCountDay(final List<Map.Entry<String, Calendar>> list) {
        Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.health.physiologicalcycle.presenter.h
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                j.this.lambda$getCountDay$2(list, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.health.physiologicalcycle.presenter.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                j.this.lambda$getCountDay$3((String) obj);
            }
        });
    }

    public String getCountDayText(List<Map.Entry<String, Calendar>> list) {
        int schemeColor = list.get(w2.a.getTodayIndex(this.date, list)).getValue().getSchemeColor();
        int intValue = (schemeColor == this.menstruationColor || schemeColor == this.predictedMenstruationColor) ? new PhysiologicalPeriodDaoProxy().getLastPhysiologcalPeriod().getMenstrualPeriod().intValue() : (schemeColor == this.ovulationColor || schemeColor == this.ovulationDayColor) ? 10 : 0;
        return intValue > 0 ? com.moyoung.dafit.module.common.utils.d.get().getString(R.string.physiological_current_status_days, String.valueOf(intValue)) : com.moyoung.dafit.module.common.utils.d.get().getString(R.string.physiological_no_data);
    }

    public void setPhysiologicalHolderView(x2.c cVar) {
        this.physiologicalHolderView = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: showCountDayText, reason: merged with bridge method [inline-methods] */
    public void lambda$getCountDay$3(String str) {
        this.physiologicalHolderView.renderCountDayText(str);
    }

    @Override // com.crrepa.band.my.health.physiologicalcycle.presenter.a
    protected void showDescription(String str) {
        this.physiologicalHolderView.renderDescription(str);
    }

    @Override // com.crrepa.band.my.health.physiologicalcycle.presenter.a
    @SuppressLint({"CheckResult"})
    protected void showPhysiologcalPeriodCalendar(final Map<String, Calendar> map) {
        this.date = new Date();
        Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.health.physiologicalcycle.presenter.f
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                j.this.lambda$showPhysiologcalPeriodCalendar$0(map, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.health.physiologicalcycle.presenter.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                j.this.lambda$showPhysiologcalPeriodCalendar$1((List) obj);
            }
        });
    }
}
