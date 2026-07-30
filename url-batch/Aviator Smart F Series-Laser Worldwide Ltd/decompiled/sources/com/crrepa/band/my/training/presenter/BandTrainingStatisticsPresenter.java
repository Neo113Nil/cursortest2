package com.crrepa.band.my.training.presenter;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.model.GpsLocation;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.db.MovementHeartRate;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.band.my.model.db.proxy.MovementHeartRateDaoProxy;
import com.crrepa.band.my.training.utils.m;
import com.crrepa.band.my.training.utils.n;
import com.crrepa.band.my.training.utils.q;
import com.crrepa.ble.conn.bean.CRPTrainingAdvancedInfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.moyoung.dafit.module.common.utils.TrainingTypeUtils;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.utils.u0;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes3.dex */
public class BandTrainingStatisticsPresenter implements com.moyoung.dafit.module.common.baseui.f {
    private Disposable readPathSubscribe;
    private x3.a view;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$moyoung$dafit$module$common$utils$TrainingTypeUtils$TrainingType;

        static {
            int[] iArr = new int[TrainingTypeUtils.TrainingType.values().length];
            $SwitchMap$com$moyoung$dafit$module$common$utils$TrainingTypeUtils$TrainingType = iArr;
            try {
                iArr[TrainingTypeUtils.TrainingType.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$moyoung$dafit$module$common$utils$TrainingTypeUtils$TrainingType[TrainingTypeUtils.TrainingType.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$moyoung$dafit$module$common$utils$TrainingTypeUtils$TrainingType[TrainingTypeUtils.TrainingType.BALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BandTrainingStatisticsPresenter() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    private void getGpsPath(final Context context, final long j8) {
        this.readPathSubscribe = Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.training.presenter.a
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                BandTrainingStatisticsPresenter.lambda$getGpsPath$0(j8, context, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.training.presenter.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BandTrainingStatisticsPresenter.this.lambda$getGpsPath$1((List) obj);
            }
        }, new com.crrepa.band.my.ble.band.config.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getGpsPath$0(long j8, Context context, ObservableEmitter observableEmitter) {
        List<GpsLocation> runLocationList;
        GpsTraining gpsTraining = new GpsTrainingDaoProxy().get(new Date(j8));
        if (gpsTraining != null && (runLocationList = com.crrepa.band.my.training.utils.c.getRunLocationList(gpsTraining.getFilePath())) != null && 3 < runLocationList.size()) {
            List<GpsLocation> convert = com.crrepa.band.my.training.j.create(com.crrepa.band.my.training.utils.h.getMapType(context)).convert(runLocationList);
            com.orhanobut.logger.f.d("locationList: " + convert.size());
            observableEmitter.onNext(convert);
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getGpsPath$1(List list) {
        this.view.renderTrainingPath(list);
    }

    private void showElevationChart(List<Float> list, Date date, Date date2) {
        String calculateAvgElevation = com.crrepa.band.my.training.utils.b.calculateAvgElevation(list);
        String calculateMinElevation = com.crrepa.band.my.training.utils.b.calculateMinElevation(list);
        String calculateMaxElevation = com.crrepa.band.my.training.utils.b.calculateMaxElevation(list);
        String[] calculateElevationChanges = com.crrepa.band.my.training.utils.b.calculateElevationChanges(list);
        this.view.renderElevationChart(date, date2, list, calculateAvgElevation, calculateMinElevation, calculateMaxElevation, calculateElevationChanges[0], calculateElevationChanges[1]);
    }

    private void showGomoreData(Context context, List<com.crrepa.band.my.training.gomoresport.path.a> list, MovementHeartRate movementHeartRate) {
        showGomoreElevation(movementHeartRate);
        try {
            Log.d("showGomoreData", "TrainingAdvancedInfoJson=" + movementHeartRate.getTrainingAdvancedInfoJson());
            CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo = (CRPTrainingAdvancedInfo) new Gson().fromJson(movementHeartRate.getTrainingAdvancedInfoJson(), CRPTrainingAdvancedInfo.class);
            if (cRPTrainingAdvancedInfo == null) {
                return;
            }
            showGomoreDetailData(context, list, cRPTrainingAdvancedInfo);
            showGomoreRunningPose(cRPTrainingAdvancedInfo);
            showGomoreSwimmingPose(cRPTrainingAdvancedInfo);
            showGomoreTrainingEffect(cRPTrainingAdvancedInfo);
            showGomoreEnergySource(cRPTrainingAdvancedInfo);
            showGomoreVo2max(cRPTrainingAdvancedInfo);
            showGomoreRecoveryTime(cRPTrainingAdvancedInfo);
        } catch (Exception e8) {
            Log.d("showGomoreData", "advancedInfo cover to gson error：" + e8.getMessage());
        }
    }

    private void showGomoreDetailData(Context context, List<com.crrepa.band.my.training.gomoresport.path.a> list, CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        float averageStepFrequency = cRPTrainingAdvancedInfo.getClimbingInfo() != null ? cRPTrainingAdvancedInfo.getClimbingInfo().getAverageStepFrequency() : -1.0f;
        if (cRPTrainingAdvancedInfo.getWalkingInfo() != null) {
            averageStepFrequency = cRPTrainingAdvancedInfo.getWalkingInfo().getAverageStepFrequency();
        }
        if (cRPTrainingAdvancedInfo.getRunningInfo() != null) {
            averageStepFrequency = cRPTrainingAdvancedInfo.getRunningInfo().getAverageStepFrequency();
        }
        if (averageStepFrequency != -1.0f) {
            list.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_average_cadence, R.string.gps_training_steps_avg_subtitle, String.valueOf(Math.round(averageStepFrequency)), context.getString(R.string.step) + "/" + context.getString(R.string.minute_unit)));
        }
        int averageStepLength = cRPTrainingAdvancedInfo.getWalkingInfo() != null ? (int) cRPTrainingAdvancedInfo.getWalkingInfo().getAverageStepLength() : -1;
        if (cRPTrainingAdvancedInfo.getRunningInfo() != null) {
            averageStepLength = (int) cRPTrainingAdvancedInfo.getRunningInfo().getAverageStepLength();
        }
        String string = context.getString(R.string.length_unit_cm);
        if (BandUnitSystemProvider.isImperialSystem()) {
            string = context.getString(R.string.length_unit_in);
            averageStepLength = u0.cm2Inches(averageStepLength);
        }
        if (averageStepLength != -1) {
            list.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_average_stride_length, R.string.gps_training_stride_avg_subtitle, String.valueOf(averageStepLength), string));
        }
        int totalSkippingTimes = cRPTrainingAdvancedInfo.getSkippingInfo() != null ? cRPTrainingAdvancedInfo.getSkippingInfo().getTotalSkippingTimes() : -1;
        if (cRPTrainingAdvancedInfo.getDumbbellInfo() != null) {
            totalSkippingTimes = cRPTrainingAdvancedInfo.getDumbbellInfo().getTotalDumbbellTimes();
        }
        if (cRPTrainingAdvancedInfo.getSwimmingInfo() != null) {
            totalSkippingTimes = cRPTrainingAdvancedInfo.getSwimmingInfo().getTotalSwimmingTimes();
        }
        if (totalSkippingTimes != -1) {
            list.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_total_count, R.string.rope_total_jumps, String.valueOf(totalSkippingTimes), ""));
        }
        if (cRPTrainingAdvancedInfo.getSwimmingInfo() != null) {
            if (cRPTrainingAdvancedInfo.getSwimmingInfo().getTrainingRound() > 0) {
                list.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_total_lap_count, R.string.swim_total_lap_count, String.valueOf(cRPTrainingAdvancedInfo.getSwimmingInfo().getTrainingRound()), ""));
            }
            if (cRPTrainingAdvancedInfo.getSwimmingInfo().getSwolf() > 0.0f) {
                list.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_swolf, R.string.swim_swolf, String.valueOf(cRPTrainingAdvancedInfo.getSwimmingInfo().getSwolf()), ""));
            }
        }
        if (cRPTrainingAdvancedInfo.getSkippingInfo() != null) {
            list.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_maximum_consecutive_jumps, R.string.rope_max_session_count, String.valueOf(cRPTrainingAdvancedInfo.getSkippingInfo().getMaxConsecutiveSkippingTimes()), ""));
            list.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_trip_over_count, R.string.rope_trip_count, String.valueOf(cRPTrainingAdvancedInfo.getSkippingInfo().getSkippingRopeTimes()), ""));
        }
        if (cRPTrainingAdvancedInfo.getRowingMachineInfo() != null) {
            list.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_total_frequency, R.string.swim_total_strokes, String.valueOf(cRPTrainingAdvancedInfo.getRowingMachineInfo().getRowingTimes()), ""));
            if (cRPTrainingAdvancedInfo.getRowingMachineInfo().getRowingFrequency() > 0.0f) {
                list.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_stroke_frequency, R.string.swim_stroke_rate, String.valueOf(cRPTrainingAdvancedInfo.getRowingMachineInfo().getRowingFrequency()), ""));
            }
        }
        com.crrepa.band.my.training.gomoresport.path.a aVar = new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_load, R.string.training_load_title, String.valueOf(cRPTrainingAdvancedInfo.getTrainingLoad()), "");
        aVar.tipsType = 0;
        list.add(aVar);
        com.crrepa.band.my.training.gomoresport.path.a aVar2 = new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_state, R.string.training_status_title, com.crrepa.band.my.training.gomoresport.e.getTrainingStatus(Integer.valueOf(cRPTrainingAdvancedInfo.getTrainingState())), "");
        aVar2.tipsType = 1;
        list.add(aVar2);
        this.view.renderGomoreDetailData(list);
    }

    private void showGomoreElevation(MovementHeartRate movementHeartRate) {
        try {
            List<Float> list = (List) new Gson().fromJson(movementHeartRate.getAltitudeListJson(), new TypeToken<List<Float>>() { // from class: com.crrepa.band.my.training.presenter.BandTrainingStatisticsPresenter.1
            }.getType());
            if (x0.isEmpty(list)) {
                return;
            }
            showElevationChart(list, new Date(movementHeartRate.getStartTime().longValue()), new Date(movementHeartRate.getEndTime().longValue()));
        } catch (Exception e8) {
            Log.d("showGomoreElevation", "elevationList cover to gson error：" + e8.getMessage());
        }
    }

    private void showGomoreEnergySource(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        this.view.renderGomoreEnergySource(cRPTrainingAdvancedInfo.getFat(), cRPTrainingAdvancedInfo.getCarbohydrate());
    }

    private void showGomoreRecoveryTime(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        this.view.renderGomoreRecoveryTime(cRPTrainingAdvancedInfo.getRecoveryTime());
    }

    private void showGomoreRunningPose(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        CRPTrainingAdvancedInfo.RunningInfo runningInfo = cRPTrainingAdvancedInfo.getRunningInfo();
        if (runningInfo == null) {
            return;
        }
        this.view.renderGomoreRunningPose(runningInfo);
    }

    private void showGomoreSwimmingPose(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        CRPTrainingAdvancedInfo.SwimmingInfo swimmingInfo = cRPTrainingAdvancedInfo.getSwimmingInfo();
        if (swimmingInfo != null) {
            if (swimmingInfo.getFreeSwimming() > 0 || swimmingInfo.getFrogSwimming() > 0 || swimmingInfo.getBackstroke() > 0 || swimmingInfo.getButterflySwimming() > 0) {
                this.view.renderGomoreSwimmingPose(swimmingInfo);
            }
        }
    }

    private void showGomoreTrainingEffect(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        float round = Math.round(cRPTrainingAdvancedInfo.getAerobicEffect() * 100.0f) / 100.0f;
        float round2 = Math.round(cRPTrainingAdvancedInfo.getAnaerobicEffect() * 100.0f) / 100.0f;
        if (round > 0.0f || round2 > 0.0f) {
            this.view.renderGomoreTrainingEffect(round, n.getTrainingEffectStr(round), round2, n.getTrainingEffectStr(round2));
        }
    }

    private void showGomoreVo2max(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        float maxOxygenIntake = cRPTrainingAdvancedInfo.getRunningInfo() != null ? cRPTrainingAdvancedInfo.getRunningInfo().getMaxOxygenIntake() : 0.0f;
        if (cRPTrainingAdvancedInfo.getCyclingInfo() != null) {
            maxOxygenIntake = cRPTrainingAdvancedInfo.getCyclingInfo().getMaxOxygenIntake();
        }
        if (maxOxygenIntake > 0.0f) {
            this.view.renderGomoreVo2max(maxOxygenIntake + com.crrepa.band.my.training.gomoresport.e.getVo2MaxUnit());
        }
    }

    private void showOneDistancePaceChart(List<Float> list) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.size() > 1) {
            arrayList.remove(arrayList.size() - 1);
        }
        float floatValue = ((Float) Collections.max(arrayList)).floatValue();
        if (floatValue > 1500.0f) {
            floatValue = 1500.0f;
        }
        String paceStrBySeconds = com.crrepa.band.my.training.utils.c.getPaceStrBySeconds((int) floatValue);
        String paceStrBySeconds2 = com.crrepa.band.my.training.utils.c.getPaceStrBySeconds(((Float) Collections.min(arrayList)).intValue());
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (list.get(i9).floatValue() > 1500.0f) {
                list.set(i9, Float.valueOf(1500.0f));
            }
        }
        while (i8 < list.size()) {
            if (list.get(i8).floatValue() <= 10.0f) {
                list.remove(i8);
                i8--;
            }
            i8++;
        }
        this.view.renderOneDistancePaceChart(list, paceStrBySeconds, paceStrBySeconds2);
    }

    private void showPaceChart(MovementHeartRate movementHeartRate) {
        List<Integer> json2List = s.json2List(movementHeartRate.getDistanceArray(), Integer[].class);
        com.orhanobut.logger.f.d("distanceList: " + s.bean2Json(json2List));
        if (x0.isEmpty((List<?>) json2List)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean isImperialSystem = BandUnitSystemProvider.isImperialSystem();
        int i8 = (int) ((isImperialSystem ? 1609.0d : 1000.0d) * 100.0d);
        int i9 = 0;
        int i10 = 0;
        for (Integer num : json2List) {
            arrayList2.add(Float.valueOf((float) (10.0d / (num.intValue() / 100000.0d))));
            i10 += num.intValue();
            if (i8 <= i10) {
                i10 -= i8;
                arrayList.add(Float.valueOf(i9 * 10));
                i9 = 0;
            } else {
                i9++;
            }
        }
        com.orhanobut.logger.f.d("oneDistancePaceList: " + arrayList.toString());
        com.orhanobut.logger.f.d("realTimePaceList: " + arrayList2.toString());
        if (i9 > 0) {
            arrayList.add(Float.valueOf(movementHeartRate.getTrainingSeconds().intValue() - com.crrepa.band.my.training.utils.f.sumFloat(arrayList)));
        }
        showOneDistancePaceChart(arrayList);
        showRealTimePaceChart(movementHeartRate, arrayList2, isImperialSystem);
    }

    private void showRealTimePaceChart(MovementHeartRate movementHeartRate, List<Float> list, boolean z7) {
        int i8 = 0;
        float f8 = 0.0f;
        for (Float f9 : list) {
            if (f9.floatValue() <= 1500.0f) {
                f8 += f9.floatValue();
                i8++;
            }
        }
        com.orhanobut.logger.f.d("realTimePaceList: count=" + i8);
        if (i8 == 0) {
            return;
        }
        float f10 = f8 / i8;
        float floatValue = ((Float) Collections.min(list)).floatValue();
        if (floatValue > 1500.0f) {
            floatValue = 1500.0f;
        }
        if (z7) {
            f10 /= 0.62f;
            floatValue /= 0.62f;
        }
        String paceStrBySeconds = com.crrepa.band.my.training.utils.c.getPaceStrBySeconds((int) f10);
        String paceStrBySeconds2 = com.crrepa.band.my.training.utils.c.getPaceStrBySeconds((int) floatValue);
        for (int i9 = 0; i9 < list.size(); i9++) {
            float floatValue2 = 1500.0f - list.get(i9).floatValue();
            if (floatValue2 < 0.0f) {
                floatValue2 = 0.0f;
            }
            list.set(i9, Float.valueOf(floatValue2));
        }
        if (z7) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                list.set(i10, Float.valueOf(list.get(i10).floatValue() / 0.62f));
            }
        }
        this.view.renderRealTimePaceChart(i3.a.getTimeDate(movementHeartRate.getStartTime().longValue()), i3.a.getTimeDate(movementHeartRate.getEndTime().longValue()), list, paceStrBySeconds, paceStrBySeconds2);
    }

    private void showStepsInfoChart(MovementHeartRate movementHeartRate) {
        int intValue = (int) ((movementHeartRate.getSteps().intValue() * 60.0f) / movementHeartRate.getTrainingSeconds().intValue());
        List json2List = s.json2List(movementHeartRate.getStepsArray(), Integer[].class);
        List json2List2 = s.json2List(movementHeartRate.getDistanceArray(), Integer[].class);
        com.orhanobut.logger.f.d("stepsList: " + s.bean2Json(json2List));
        com.orhanobut.logger.f.d("distanceList: " + s.bean2Json(json2List2));
        if (x0.isEmpty((List<?>) json2List) || x0.isEmpty((List<?>) json2List2)) {
            return;
        }
        List<Integer> minuteTrainingInfo = TrainingPathPresenter.getMinuteTrainingInfo(json2List);
        List<Integer> minuteTrainingInfo2 = TrainingPathPresenter.getMinuteTrainingInfo(json2List2);
        com.orhanobut.logger.f.d("minuteStepsList: " + s.bean2Json(minuteTrainingInfo));
        com.orhanobut.logger.f.d("minuteDistanceList: " + s.bean2Json(minuteTrainingInfo2));
        if (minuteTrainingInfo.isEmpty() || minuteTrainingInfo2.isEmpty()) {
            return;
        }
        int min = Math.min(minuteTrainingInfo.size(), minuteTrainingInfo2.size());
        List<Integer> subList = minuteTrainingInfo.subList(0, min);
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        float f8 = 0.0f;
        for (int i9 = 0; i9 < minuteTrainingInfo.size(); i9++) {
            if (i9 < min) {
                float intValue2 = minuteTrainingInfo2.get(i9).intValue() / 100.0f;
                Integer num = minuteTrainingInfo.get(i9);
                if (num.intValue() != 0) {
                    arrayList.add(Float.valueOf(intValue2 / num.intValue()));
                    i8 += num.intValue();
                    f8 += intValue2;
                } else {
                    arrayList.add(Float.valueOf(0.0f));
                }
            }
        }
        float f9 = i8 > 0 ? f8 / i8 : 0.0f;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < subList.size(); i10++) {
            float intValue3 = subList.get(i10).intValue();
            if (f10 < intValue3) {
                f10 = intValue3;
            }
        }
        float f11 = 0.0f;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            float floatValue = ((Float) arrayList.get(i11)).floatValue();
            if (f11 < floatValue) {
                f11 = floatValue;
            }
        }
        if (intValue == 0 && f10 == 0.0f) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = subList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Float.valueOf(it.next().intValue()));
        }
        this.view.renderStepsInfoChart(i3.a.getTimeDate(movementHeartRate.getStartTime().longValue()), i3.a.getTimeDate(movementHeartRate.getEndTime().longValue()), f9, f11, arrayList, intValue, f10, arrayList2);
    }

    private void showTrainingStatisticsView(int i8) {
        com.orhanobut.logger.f.d("showTrainingStatisticsView: " + i8);
        if (a.$SwitchMap$com$moyoung$dafit$module$common$utils$TrainingTypeUtils$TrainingType[TrainingTypeUtils.getTrainingType(i8).ordinal()] != 1) {
            this.view.renderBallStatisticsView();
        } else {
            this.view.renderRunStatisticsView();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        Disposable disposable = this.readPathSubscribe;
        if (disposable != null) {
            disposable.dispose();
        }
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        this.view = null;
    }

    public void getTrainingStatisticsData(Context context, long j8, int i8) {
        MovementHeartRate movementHeartRate;
        Date date;
        boolean z7;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        List<Float> list;
        int i16;
        int i17;
        float f8;
        float f9;
        int i18;
        int i19;
        int i20;
        MovementHeartRate movementHeartRate2;
        Context context2;
        boolean isImperialSystem = BandUnitSystemProvider.isImperialSystem();
        this.view.renderMetricSystem(!isImperialSystem);
        int trainingType = TrainingTypeUtils.toTrainingType(i8);
        this.view.renderTrainingName(q.getTrainingName(context, trainingType));
        showTrainingStatisticsView(trainingType);
        MovementHeartRateDaoProxy movementHeartRateDaoProxy = new MovementHeartRateDaoProxy();
        MovementHeartRate todayLastMovementHeartRate = j8 == -1 ? movementHeartRateDaoProxy.getTodayLastMovementHeartRate(trainingType) : movementHeartRateDaoProxy.getMovementHeartRate(j8);
        Date date2 = new Date();
        if (todayLastMovementHeartRate != null) {
            i11 = todayLastMovementHeartRate.getTrainingSeconds().intValue();
            i16 = todayLastMovementHeartRate.getSteps().intValue();
            i17 = todayLastMovementHeartRate.getDistance().intValue();
            f8 = todayLastMovementHeartRate.getCalories().floatValue();
            f9 = todayLastMovementHeartRate.getSpeed() == null ? 0.0f : todayLastMovementHeartRate.getSpeed().floatValue();
            i18 = (int) (i11 / (i17 / 1000.0f));
            if (isImperialSystem) {
                f9 = m.kph2mph(f9);
                i18 = (int) m.metricPace2InchPace(i18);
            }
            i19 = q2.a.getHeartRateAnalysisData(todayLastMovementHeartRate.getAverage());
            String heartRates = todayLastMovementHeartRate.getHeartRates();
            List<Float> json2List = !TextUtils.isEmpty(heartRates) ? s.json2List(heartRates, Float[].class) : null;
            Date date3 = new Date(todayLastMovementHeartRate.getStartTime().longValue());
            i15 = q2.a.getHeartRateAnalysisData(todayLastMovementHeartRate.getLightCount());
            int heartRateAnalysisData = q2.a.getHeartRateAnalysisData(todayLastMovementHeartRate.getWightCount());
            int heartRateAnalysisData2 = q2.a.getHeartRateAnalysisData(todayLastMovementHeartRate.getAerobicCount());
            int heartRateAnalysisData3 = q2.a.getHeartRateAnalysisData(todayLastMovementHeartRate.getAnaerobicCount());
            int heartRateAnalysisData4 = q2.a.getHeartRateAnalysisData(todayLastMovementHeartRate.getMaxCount());
            int intValue = todayLastMovementHeartRate.getInterval().intValue();
            getGpsPath(context, todayLastMovementHeartRate.getStartTime().longValue());
            i14 = heartRateAnalysisData;
            date = date3;
            list = json2List;
            movementHeartRate = todayLastMovementHeartRate;
            i10 = intValue;
            z7 = isImperialSystem;
            i12 = heartRateAnalysisData2;
            i9 = trainingType;
            i13 = heartRateAnalysisData4;
            i20 = heartRateAnalysisData3;
        } else {
            movementHeartRate = todayLastMovementHeartRate;
            date = date2;
            z7 = isImperialSystem;
            i9 = trainingType;
            i10 = 60;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            list = null;
            i16 = 0;
            i17 = 0;
            f8 = 0.0f;
            f9 = 0.0f;
            i18 = 0;
            i19 = 0;
            i20 = 0;
        }
        this.view.renderTrainingTotalTime(i11);
        this.view.renderSteps(i16);
        this.view.renderDistance(i17);
        this.view.renderCalories(f8);
        this.view.renderSpeed(f9);
        this.view.renderPace(i18);
        this.view.renderAverageHeartRate(i19);
        if (x0.isNotEmpty(list)) {
            this.view.renderHeartRateChart(list, date, i10);
        }
        this.view.renderTrainingDate(date);
        if (i10 < 60 && list != null && !list.isEmpty() && list.get(0).floatValue() <= 0.0f) {
            i15++;
        }
        this.view.renderTrainingHeartRateAnalysis(i10, i15, i14, i12, i20, i13);
        if (movementHeartRate != null) {
            boolean z8 = TrainingTypeUtils.getTrainingType(i9) == TrainingTypeUtils.TrainingType.RUNNING;
            if (TrainingTypeUtils.isPaceChartType(Integer.valueOf(i9))) {
                movementHeartRate2 = movementHeartRate;
                showPaceChart(movementHeartRate2);
                showStepsInfoChart(movementHeartRate2);
            } else {
                movementHeartRate2 = movementHeartRate;
            }
            if (x0.isNotEmpty(movementHeartRate2.getTrainingAdvancedInfoJson())) {
                ArrayList arrayList = new ArrayList();
                if (i16 <= 0 || !TrainingTypeUtils.isTotalStepType(Integer.valueOf(i9))) {
                    context2 = context;
                } else {
                    context2 = context;
                    arrayList.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_step, R.string.total_run_steps, String.valueOf(i16), context2.getString(R.string.step)));
                }
                String string = com.moyoung.dafit.module.common.utils.d.get().getString(com.crrepa.band.my.health.base.a.getActionDistanceUnit(i17));
                if (z8) {
                    arrayList.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_km, R.string.total_distance, String.valueOf(com.crrepa.band.my.health.base.a.getActionDistance(i17)), string));
                }
                arrayList.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_kcal, R.string.total_calorie, String.valueOf((int) f8), context2.getString(R.string.calorie_unit)));
                if (z8) {
                    String string2 = context2.getString(R.string.distance_unit_km);
                    if (z7) {
                        string2 = context2.getString(R.string.distance_unit_miles);
                    }
                    String format = String.format(context2.getString(R.string.speed_unit), string2);
                    DecimalFormat decimalFormat = new DecimalFormat("0.00");
                    decimalFormat.setRoundingMode(RoundingMode.DOWN);
                    arrayList.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_km_h, R.string.training_avg_speed, decimalFormat.format(f9), format));
                }
                if (z8) {
                    arrayList.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_min_km, R.string.pace, com.crrepa.band.my.training.utils.e.formatPace(i18), ""));
                }
                arrayList.add(new com.crrepa.band.my.training.gomoresport.path.a(R$drawable.ic_training_hr, R.string.average_heart_rate, String.valueOf(i19), context2.getString(R.string.heart_rate_unit)));
                showGomoreData(context2, arrayList, movementHeartRate2);
            }
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandUnitSystemChangeEvent(l0.g gVar) {
        x3.a aVar = this.view;
        if (aVar != null) {
            aVar.renderRefreshData();
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(x3.a aVar) {
        this.view = aVar;
    }
}
