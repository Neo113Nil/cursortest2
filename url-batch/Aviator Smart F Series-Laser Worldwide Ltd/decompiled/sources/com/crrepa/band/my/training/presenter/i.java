package com.crrepa.band.my.training.presenter;

import android.annotation.SuppressLint;
import android.content.Context;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.db.MovementHeartRate;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.band.my.model.db.proxy.MovementHeartRateDaoProxy;
import com.crrepa.band.my.model.net.TrainingRecordsEntity;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.n;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class i implements com.moyoung.dafit.module.common.baseui.f {
    public static final int TAB_POSITION_ALL = 4;
    public static final int TAB_POSITION_DAY = 0;
    public static final int TAB_POSITION_MONTH = 2;
    public static final int TAB_POSITION_WEEK = 1;
    public static final int TAB_POSITION_YEAR = 3;
    GpsTrainingDaoProxy gpsDaoProxy = new GpsTrainingDaoProxy();
    MovementHeartRateDaoProxy movementDaoProxy = new MovementHeartRateDaoProxy();
    private x3.b trainingHistoryView;

    private boolean hasTraining(List<TrainingRecordsEntity> list, TrainingRecordsEntity trainingRecordsEntity) {
        long time = trainingRecordsEntity.getStartDate().getTime();
        Iterator<TrainingRecordsEntity> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getStartDate().getTime() - time < 60000) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$mergeTrainingRecordsList$1(TrainingRecordsEntity trainingRecordsEntity, TrainingRecordsEntity trainingRecordsEntity2) {
        return Long.compare(trainingRecordsEntity2.getStartDate().getTime(), trainingRecordsEntity.getStartDate().getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateTrainingHistory$0(int i8, List list) {
        this.trainingHistoryView.renderTrainingList(list);
        calculateTrainingTotalInfo(list, i8);
    }

    public static List<TrainingRecordsEntity> mergeTrainingRecordsList(Context context, List<GpsTraining> list, List<MovementHeartRate> list2) {
        ArrayList<TrainingRecordsEntity> arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            TrainingRecordsEntity trainingRecordsEntity = new TrainingRecordsEntity();
            GpsTraining gpsTraining = list.get(i8);
            if (gpsTraining != null && gpsTraining.getType().intValue() != 241) {
                trainingRecordsEntity.copy(gpsTraining);
                arrayList.add(trainingRecordsEntity);
            }
        }
        for (int i9 = 0; i9 < list2.size(); i9++) {
            TrainingRecordsEntity trainingRecordsEntity2 = new TrainingRecordsEntity();
            MovementHeartRate movementHeartRate = list2.get(i9);
            if (movementHeartRate != null && !movementHeartRate.getRepeated().booleanValue()) {
                trainingRecordsEntity2.copy(movementHeartRate);
                arrayList.add(trainingRecordsEntity2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int length = context.getResources().getStringArray(R.array.training_names).length;
        for (TrainingRecordsEntity trainingRecordsEntity3 : arrayList) {
            Integer trainingType = trainingRecordsEntity3.getTrainingType();
            if (trainingType != null && trainingType.intValue() >= 0 && (trainingType.intValue() < length || trainingType.intValue() == 131)) {
                arrayList2.add(trainingRecordsEntity3);
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.crrepa.band.my.training.presenter.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$mergeTrainingRecordsList$1;
                lambda$mergeTrainingRecordsList$1 = i.lambda$mergeTrainingRecordsList$1((TrainingRecordsEntity) obj, (TrainingRecordsEntity) obj2);
                return lambda$mergeTrainingRecordsList$1;
            }
        });
        return arrayList2;
    }

    public void calculateTrainingTotalInfo(List<TrainingRecordsEntity> list, int i8) {
        int i9;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        int i11 = 0;
        float f8 = 0.0f;
        for (int i12 = 0; i12 < list.size(); i12++) {
            TrainingRecordsEntity trainingRecordsEntity = list.get(i12);
            int intValue = trainingRecordsEntity.getTrainingSeconds() == null ? 0 : trainingRecordsEntity.getTrainingSeconds().intValue();
            i10 += intValue;
            f8 += trainingRecordsEntity.getCalories() == null ? 0.0f : trainingRecordsEntity.getCalories().floatValue();
            i11++;
            if (i8 != 0) {
                Date sameDayStartTime = m.getSameDayStartTime(trainingRecordsEntity.getStartDate());
                Integer num = (Integer) hashMap.get(sameDayStartTime);
                if (num != null) {
                    intValue += num.intValue();
                }
                hashMap.put(sameDayStartTime, Integer.valueOf(intValue));
            }
        }
        int i13 = i10 / 60;
        DecimalFormat decimalFormat = n.getDecimalFormat("0.0");
        if (i11 == 0) {
            this.trainingHistoryView.renderTotalTimes(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.data_blank));
        } else {
            this.trainingHistoryView.renderTotalTimes(String.valueOf(i11));
        }
        if (i13 == 0) {
            this.trainingHistoryView.renderTotalTrainingTime(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.data_blank));
        } else {
            this.trainingHistoryView.renderTotalTrainingTime(String.valueOf(i13));
        }
        if (f8 == 0.0f) {
            this.trainingHistoryView.renderTotalCalories(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.data_blank));
        } else {
            this.trainingHistoryView.renderTotalCalories(decimalFormat.format(f8));
        }
        if (i8 != 0) {
            i9 = 0;
            for (Integer num2 : hashMap.values()) {
                if (num2.intValue() > i9) {
                    i9 = num2.intValue();
                }
            }
        } else {
            i9 = 0;
        }
        if (i9 == 0) {
            this.trainingHistoryView.renderMaxTimePerDay(i8 != 0, com.moyoung.dafit.module.common.utils.d.get().getString(R.string.data_blank));
        } else {
            this.trainingHistoryView.renderMaxTimePerDay(true, String.valueOf(i9 / 60));
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.trainingHistoryView = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    public List<TrainingRecordsEntity> queryTrainingHistory(Context context, int i8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Date sameDayStartTime = m.getSameDayStartTime(new Date());
        if (i8 == 0) {
            arrayList.addAll(this.gpsDaoProxy.getToday(sameDayStartTime));
            arrayList2.addAll(this.movementDaoProxy.getTodayMovementHeartRate());
        } else if (i8 == 1) {
            arrayList.addAll(this.gpsDaoProxy.getWeekTrainingList(sameDayStartTime));
            arrayList2.addAll(this.movementDaoProxy.getWeekMovementList(sameDayStartTime));
        } else if (i8 == 2) {
            arrayList.addAll(this.gpsDaoProxy.getMonthTrainingList(sameDayStartTime));
            arrayList2.addAll(this.movementDaoProxy.getMonthMovementList(sameDayStartTime));
        } else if (i8 == 3) {
            arrayList.addAll(this.gpsDaoProxy.getYearTrainingList(sameDayStartTime));
            arrayList2.addAll(this.movementDaoProxy.getYearMovementList(sameDayStartTime));
        } else if (i8 == 4) {
            arrayList.addAll(this.gpsDaoProxy.getAll());
            arrayList2.addAll(this.movementDaoProxy.getAll());
        }
        return mergeTrainingRecordsList(context, arrayList, arrayList2);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(x3.b bVar) {
        this.trainingHistoryView = bVar;
    }

    @SuppressLint({"CheckResult"})
    public void updateTrainingHistory(Context context, final int i8) {
        Observable.just(queryTrainingHistory(context, i8)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.training.presenter.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                i.this.lambda$updateTrainingHistory$0(i8, (List) obj);
            }
        });
    }
}
