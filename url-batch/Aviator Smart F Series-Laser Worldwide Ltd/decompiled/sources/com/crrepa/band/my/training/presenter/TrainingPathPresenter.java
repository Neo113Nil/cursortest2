package com.crrepa.band.my.training.presenter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.baidu.ar.util.SystemInfoUtil;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.db.MovementHeartRate;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.band.my.model.db.proxy.MovementHeartRateDaoProxy;
import com.crrepa.band.my.model.gps.GpsTrainingInfoModel;
import com.crrepa.band.my.model.gps.TrainingLocation;
import com.crrepa.band.my.profile.strava.StravaHttpDelegate;
import com.crrepa.band.my.profile.strava.o;
import com.crrepa.band.my.training.utils.q;
import com.crrepa.ble.conn.bean.CRPTrainingAdvancedInfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public class TrainingPathPresenter implements com.moyoung.dafit.module.common.baseui.f {
    public static final int FASTEST_PACE = 10;
    public static final int LOWEST_PACE = 1500;
    private static final int RATING_TRAINING_SECONDS = 600000;
    public Float fastestPace;
    private boolean isMapMode;
    private StravaHttpDelegate stravaHttpDelegate;
    public Integer totalDistance;
    public Float totalKcal;
    public Integer totalSeconds;
    private x3.c trainingPathView;
    private int trainingType;
    private final GpsTrainingDaoProxy gpsTrainingDaoProxy = new GpsTrainingDaoProxy();
    private final List<GpsTrainingInfoModel> trainingInfoList = new ArrayList();
    private boolean isImperialSystem = BandUnitSystemProvider.isImperialSystem();

    public enum TrainingSourceType {
        WATCH,
        APP,
        WATCH_AND_APP
    }

    class a implements StravaHttpDelegate.a {
        final /* synthetic */ boolean val$isShowInvalidToken;
        final /* synthetic */ long val$trainingId;
        final /* synthetic */ List val$trainingLocationList;

        a(boolean z7, long j8, List list) {
            this.val$isShowInvalidToken = z7;
            this.val$trainingId = j8;
            this.val$trainingLocationList = list;
        }

        @Override // com.crrepa.band.my.profile.strava.StravaHttpDelegate.a
        public void onFailed(String str) {
            TrainingPathPresenter.this.trainingPathView.renderStravaToast(R.string.strava_share_failed);
        }

        @Override // com.crrepa.band.my.profile.strava.StravaHttpDelegate.a
        public void onStravaOauthInvalid() {
            if (this.val$isShowInvalidToken) {
                TrainingPathPresenter.this.trainingPathView.renderStravaToast(R.string.strava_oauth_out_of_date);
                TrainingPathPresenter.this.trainingPathView.renderStravaOauthInvalid();
            }
        }

        @Override // com.crrepa.band.my.profile.strava.StravaHttpDelegate.a
        public void onSucceed(String str) {
            TrainingPathPresenter.this.trainingPathView.renderStravaToast(R.string.strava_share_succeed);
        }

        @Override // com.crrepa.band.my.profile.strava.StravaHttpDelegate.a
        public void onTokenRefreshed() {
            TrainingPathPresenter.this.stravaHttpDelegate.uploadGPXFile(this.val$trainingId, TrainingPathPresenter.this.trainingType, this.val$trainingLocationList);
        }
    }

    private void addCalorieInfo(Float f8) {
        if (f8 == null || 0.0f >= f8.floatValue()) {
            return;
        }
        GpsTrainingInfoModel gpsTrainingInfoModel = new GpsTrainingInfoModel();
        gpsTrainingInfoModel.setTitle(R.string.calorie_unit);
        gpsTrainingInfoModel.setContent(String.valueOf((int) f8.floatValue()));
        this.trainingInfoList.add(gpsTrainingInfoModel);
    }

    private void addElevationInfo(Float f8) {
    }

    private void addGomoreSportData(GpsTraining gpsTraining) {
        CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo = (CRPTrainingAdvancedInfo) new Gson().fromJson(gpsTraining.getTrainingAdvancedInfoJson(), CRPTrainingAdvancedInfo.class);
        if (cRPTrainingAdvancedInfo == null) {
            return;
        }
        GpsTrainingInfoModel gpsTrainingInfoModel = new GpsTrainingInfoModel();
        gpsTrainingInfoModel.setTitle(R.string.training_avg_speed_kmh);
        float averageSpeed = cRPTrainingAdvancedInfo.getRunningInfo() != null ? cRPTrainingAdvancedInfo.getRunningInfo().getAverageSpeed() : 0.0f;
        if (cRPTrainingAdvancedInfo.getWalkingInfo() != null) {
            averageSpeed = cRPTrainingAdvancedInfo.getWalkingInfo().getAverageSpeed();
        }
        if (cRPTrainingAdvancedInfo.getCyclingInfo() != null) {
            averageSpeed = cRPTrainingAdvancedInfo.getCyclingInfo().getAverageSpeed();
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        gpsTrainingInfoModel.setContent(decimalFormat.format(averageSpeed));
        this.trainingInfoList.add(gpsTrainingInfoModel);
        GpsTrainingInfoModel gpsTrainingInfoModel2 = new GpsTrainingInfoModel();
        gpsTrainingInfoModel2.setTitle(R.string.training_load_title);
        gpsTrainingInfoModel2.setContent(String.valueOf(cRPTrainingAdvancedInfo.getTrainingLoad()));
        gpsTrainingInfoModel2.setTipsType(0);
        this.trainingInfoList.add(gpsTrainingInfoModel2);
        GpsTrainingInfoModel gpsTrainingInfoModel3 = new GpsTrainingInfoModel();
        gpsTrainingInfoModel3.setTitle(R.string.training_status_title);
        gpsTrainingInfoModel3.setContent(com.crrepa.band.my.training.gomoresport.e.getTrainingStatus(Integer.valueOf(cRPTrainingAdvancedInfo.getTrainingState())));
        gpsTrainingInfoModel3.setTipsType(1);
        this.trainingInfoList.add(gpsTrainingInfoModel3);
    }

    private void addHeartRateInfo(GpsTraining gpsTraining) {
        Integer minHr = gpsTraining.getMinHr();
        Integer heartRate = gpsTraining.getHeartRate();
        Integer maxHr = gpsTraining.getMaxHr();
        if (minHr != null && minHr.intValue() > 0) {
            GpsTrainingInfoModel gpsTrainingInfoModel = new GpsTrainingInfoModel();
            gpsTrainingInfoModel.setTitle(R.string.lowest_heart_rate);
            gpsTrainingInfoModel.setIcon(R$drawable.ic_gpsexercise_hr_s);
            gpsTrainingInfoModel.setContent(String.valueOf(minHr));
            this.trainingInfoList.add(gpsTrainingInfoModel);
        }
        if (heartRate != null && heartRate.intValue() > 0) {
            GpsTrainingInfoModel gpsTrainingInfoModel2 = new GpsTrainingInfoModel();
            gpsTrainingInfoModel2.setTitle(R.string.average_heart_rate);
            gpsTrainingInfoModel2.setIcon(R$drawable.ic_gpsexercise_hr_s);
            gpsTrainingInfoModel2.setContent(String.valueOf(heartRate));
            this.trainingInfoList.add(gpsTrainingInfoModel2);
        }
        if (maxHr == null || maxHr.intValue() <= 0) {
            return;
        }
        GpsTrainingInfoModel gpsTrainingInfoModel3 = new GpsTrainingInfoModel();
        gpsTrainingInfoModel3.setTitle(R.string.highest_heart_rate);
        gpsTrainingInfoModel3.setIcon(R$drawable.ic_gpsexercise_hr_s);
        gpsTrainingInfoModel3.setContent(String.valueOf(maxHr));
        this.trainingInfoList.add(gpsTrainingInfoModel3);
    }

    private void addPaceInfo(int i8, Integer num) {
        String averagePaceStr = com.crrepa.band.my.training.utils.c.getAveragePaceStr(num.intValue(), i8);
        GpsTrainingInfoModel gpsTrainingInfoModel = new GpsTrainingInfoModel();
        gpsTrainingInfoModel.setContent(averagePaceStr);
        gpsTrainingInfoModel.setTitle(R.string.pace);
        this.trainingInfoList.add(gpsTrainingInfoModel);
    }

    private void addStepRateInfo(Integer num) {
        if (com.crrepa.band.my.training.utils.e.isGpsCycling(this.trainingType) || num == null || num.intValue() <= 0) {
            return;
        }
        GpsTrainingInfoModel gpsTrainingInfoModel = new GpsTrainingInfoModel();
        gpsTrainingInfoModel.setTitle(R.string.gps_training_cadence_subtitle);
        gpsTrainingInfoModel.setContent(String.valueOf(num));
        this.trainingInfoList.add(gpsTrainingInfoModel);
    }

    private void addStepsInfo(Integer num) {
        if (com.crrepa.band.my.training.utils.e.isGpsCycling(this.trainingType) || num == null || num.intValue() <= 0) {
            return;
        }
        GpsTrainingInfoModel gpsTrainingInfoModel = new GpsTrainingInfoModel();
        gpsTrainingInfoModel.setContent(String.valueOf(num));
        gpsTrainingInfoModel.setTitle(R.string.total_run_steps);
        this.trainingInfoList.add(gpsTrainingInfoModel);
    }

    private void addTimeInfo(Integer num) {
        DecimalFormat decimalFormat = n.getDecimalFormat(n.TWO_INTEGERS_PATTERN);
        int intValue = num.intValue() / 60;
        int intValue2 = num.intValue() % 60;
        String str = decimalFormat.format(intValue / 60) + ":" + decimalFormat.format(intValue % 60) + ":" + decimalFormat.format(intValue2);
        GpsTrainingInfoModel gpsTrainingInfoModel = new GpsTrainingInfoModel();
        gpsTrainingInfoModel.setContent(str);
        gpsTrainingInfoModel.setTitle(R.string.total_run_time);
        this.trainingInfoList.add(gpsTrainingInfoModel);
    }

    private GpsTraining addTrainingInfoOfBandGPS(GpsTraining gpsTraining) {
        MovementHeartRate movementHeartRate = new MovementHeartRateDaoProxy().getMovementHeartRate(gpsTraining.getStartDate().getTime(), gpsTraining.getTrainingSeconds().intValue());
        if (movementHeartRate != null && !movementHeartRate.getRepeated().booleanValue()) {
            gpsTraining.setTrainingType(movementHeartRate.getType());
            gpsTraining.setStep(movementHeartRate.getSteps());
            gpsTraining.setCalorie(movementHeartRate.getCalories());
            float floatValue = movementHeartRate.getDistance() == null ? 0.0f : movementHeartRate.getDistance().floatValue();
            if (0.0f < floatValue) {
                int intValue = gpsTraining.getDistance() == null ? 0 : gpsTraining.getDistance().intValue();
                com.orhanobut.logger.f.d(intValue + " -> " + floatValue);
                float f8 = ((float) intValue) / floatValue;
                com.orhanobut.logger.f.d(" distancePercent -> " + f8);
                this.trainingPathView.renderDistancePercent(f8);
                gpsTraining.setDistance(Integer.valueOf((int) floatValue));
            }
            gpsTraining.setTrainingSeconds(movementHeartRate.getTrainingSeconds());
            gpsTraining.setMinHr(movementHeartRate.getMinHeartRate());
            gpsTraining.setMaxHr(movementHeartRate.getMaxHeartRate());
            gpsTraining.setHeartRate(movementHeartRate.getAverage());
            gpsTraining.setHrList(movementHeartRate.getHeartRates());
            Integer interval = movementHeartRate.getInterval();
            gpsTraining.setInterval(interval);
            gpsTraining.setLightSeconds(Integer.valueOf(movementHeartRate.getLightCount().intValue() * interval.intValue()));
            gpsTraining.setWeightSeconds(Integer.valueOf(movementHeartRate.getWightCount().intValue() * interval.intValue()));
            gpsTraining.setAerobicSeconds(Integer.valueOf(movementHeartRate.getAerobicCount().intValue() * interval.intValue()));
            gpsTraining.setAnaerobicSeconds(Integer.valueOf(movementHeartRate.getAnaerobicCount().intValue() * interval.intValue()));
            gpsTraining.setMaxSeconds(Integer.valueOf(movementHeartRate.getMaxCount().intValue() * interval.intValue()));
            gpsTraining.setAverageStepFrequency(Integer.valueOf((int) ((gpsTraining.getStep().intValue() * 60.0f) / gpsTraining.getTrainingSeconds().intValue())));
            List json2List = s.json2List(movementHeartRate.getStepsArray(), Integer[].class);
            List<Integer> json2List2 = s.json2List(movementHeartRate.getDistanceArray(), Integer[].class);
            com.orhanobut.logger.f.d("stepsList: " + s.bean2Json(json2List));
            com.orhanobut.logger.f.d("distanceList: " + s.bean2Json(json2List2));
            if (json2List2 != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i8 = (int) ((this.isImperialSystem ? 1609.0d : 1000.0d) * 100.0d);
                int i9 = 0;
                int i10 = 0;
                for (Integer num : json2List2) {
                    arrayList2.add(Integer.valueOf((int) (10.0d / (num.intValue() / 100000.0d))));
                    i10 += num.intValue();
                    if (i8 <= i10) {
                        i10 -= i8;
                        arrayList.add(Integer.valueOf(i9 * 10));
                        i9 = 0;
                    } else {
                        i9++;
                    }
                }
                if (i9 > 0) {
                    arrayList.add(Integer.valueOf((int) (gpsTraining.getTrainingSeconds().intValue() - com.crrepa.band.my.training.utils.f.sum(arrayList))));
                }
                String bean2Json = s.bean2Json(arrayList);
                com.orhanobut.logger.f.d("paceList: " + bean2Json);
                gpsTraining.setOneKmPaceList(bean2Json);
                gpsTraining.setOneMilePaceList(bean2Json);
                String bean2Json2 = s.bean2Json(arrayList2);
                com.orhanobut.logger.f.d("realTimePaceListStr: " + bean2Json2);
                gpsTraining.setRealTimePaceList(bean2Json2);
            }
            List<Integer> minuteTrainingInfo = getMinuteTrainingInfo(json2List);
            List<Integer> minuteTrainingInfo2 = getMinuteTrainingInfo(json2List2);
            com.orhanobut.logger.f.d("minuteStepsList: " + s.bean2Json(minuteTrainingInfo));
            com.orhanobut.logger.f.d("minuteDistanceList: " + s.bean2Json(minuteTrainingInfo2));
            if (!minuteTrainingInfo.isEmpty() && !minuteTrainingInfo2.isEmpty()) {
                int min = Math.min(minuteTrainingInfo.size(), minuteTrainingInfo2.size());
                gpsTraining.setStepFrequencyList(s.bean2Json(minuteTrainingInfo.subList(0, min)));
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                float f9 = 0.0f;
                for (int i12 = 0; i12 < minuteTrainingInfo.size(); i12++) {
                    if (i12 < min) {
                        float intValue2 = minuteTrainingInfo2.get(i12).intValue() / 100.0f;
                        Integer num2 = minuteTrainingInfo.get(i12);
                        if (num2.intValue() != 0) {
                            arrayList3.add(Float.valueOf(intValue2 / num2.intValue()));
                            i11 += num2.intValue();
                            f9 += intValue2;
                        } else {
                            arrayList3.add(Float.valueOf(0.0f));
                        }
                    }
                }
                if (i11 > 0) {
                    gpsTraining.setAverageStepLength(Float.valueOf(f9 / i11));
                }
                gpsTraining.setStepLengthList(s.bean2Json(arrayList3));
            }
            gpsTraining.setAltitudeListJson(movementHeartRate.getAltitudeListJson());
            gpsTraining.setTrainingAdvancedInfoJson(movementHeartRate.getTrainingAdvancedInfoJson());
            com.orhanobut.logger.f.d("gpsTraining: " + s.bean2Json(gpsTraining));
        }
        return gpsTraining;
    }

    private void dealElevationData(GpsTraining gpsTraining) {
    }

    private void dealHeartRateData(GpsTraining gpsTraining) {
        List<Float> json2List = s.json2List(gpsTraining.getHrList(), Float[].class);
        if (json2List == null || json2List.isEmpty()) {
            return;
        }
        this.trainingPathView.renderHeartRateChart(gpsTraining, json2List);
    }

    private void dealOneDistancePaceData(GpsTraining gpsTraining) {
        List<Float> json2List = this.isImperialSystem ? s.json2List(gpsTraining.getOneMilePaceList(), Float[].class) : s.json2List(gpsTraining.getOneKmPaceList(), Float[].class);
        if (json2List == null || json2List.isEmpty()) {
            return;
        }
        Log.d("oneDistancePaceList", gpsTraining.toString());
        Log.d("oneDistancePaceList", json2List.toString());
        ArrayList arrayList = new ArrayList(json2List);
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
        for (int i9 = 0; i9 < json2List.size(); i9++) {
            if (json2List.get(i9).floatValue() > 1500.0f) {
                json2List.set(i9, Float.valueOf(1500.0f));
            }
        }
        while (i8 < json2List.size()) {
            if (json2List.get(i8).floatValue() <= 10.0f) {
                json2List.remove(i8);
                i8--;
            }
            i8++;
        }
        this.trainingPathView.renderOneDistancePaceChart(json2List, paceStrBySeconds, paceStrBySeconds2);
    }

    private void dealRealTimePaceData(GpsTraining gpsTraining) {
        List<Float> json2List = s.json2List(gpsTraining.getRealTimePaceList(), Float[].class);
        if (json2List == null || json2List.isEmpty()) {
            return;
        }
        int i8 = 0;
        float f8 = 0.0f;
        for (Float f9 : json2List) {
            if (f9.floatValue() <= 1500.0f) {
                f8 += f9.floatValue();
                i8++;
            }
        }
        if (i8 == 0) {
            return;
        }
        float f10 = f8 / i8;
        float floatValue = ((Float) Collections.min(json2List)).floatValue();
        if (floatValue > 1500.0f) {
            floatValue = 1500.0f;
        }
        if (this.isImperialSystem) {
            f10 /= 0.62f;
            floatValue /= 0.62f;
        }
        String paceStrBySeconds = com.crrepa.band.my.training.utils.c.getPaceStrBySeconds((int) f10);
        String paceStrBySeconds2 = com.crrepa.band.my.training.utils.c.getPaceStrBySeconds((int) floatValue);
        for (int i9 = 0; i9 < json2List.size(); i9++) {
            float floatValue2 = 1500.0f - json2List.get(i9).floatValue();
            if (floatValue2 < 0.0f) {
                floatValue2 = 0.0f;
            }
            json2List.set(i9, Float.valueOf(floatValue2));
        }
        if (this.isImperialSystem) {
            for (int i10 = 0; i10 < json2List.size(); i10++) {
                json2List.set(i10, Float.valueOf(json2List.get(i10).floatValue() / 0.62f));
            }
        }
        this.trainingPathView.renderRealTimePaceChart(gpsTraining, json2List, paceStrBySeconds, paceStrBySeconds2);
    }

    private void dealStepsData(GpsTraining gpsTraining) {
        if (gpsTraining.getStep() == null || gpsTraining.getStep().intValue() <= 0) {
            return;
        }
        String stepFrequencyList = gpsTraining.getStepFrequencyList();
        String stepLengthList = gpsTraining.getStepLengthList();
        if (TextUtils.isEmpty(stepFrequencyList) || TextUtils.isEmpty(stepLengthList)) {
            return;
        }
        List<Float> json2List = s.json2List(stepFrequencyList, Float[].class);
        List<Float> json2List2 = s.json2List(stepLengthList, Float[].class);
        if (json2List == null) {
            json2List = new ArrayList<>();
        }
        List<Float> list = json2List;
        if (json2List2 == null) {
            json2List2 = new ArrayList<>();
        }
        List<Float> list2 = json2List2;
        float f8 = 0.0f;
        for (int i8 = 0; i8 < list.size(); i8++) {
            float floatValue = list.get(i8).floatValue();
            if (f8 < floatValue) {
                f8 = floatValue;
            }
        }
        float f9 = 0.0f;
        for (int i9 = 0; i9 < list2.size(); i9++) {
            float floatValue2 = list2.get(i9).floatValue();
            if (f9 < floatValue2) {
                f9 = floatValue2;
            }
        }
        this.trainingPathView.renderStepsInfoChart(gpsTraining, f8, f9, list, list2);
    }

    private List<TrainingLocation> getBandGpsTrainingLocationList(GpsTraining gpsTraining, List<TrainingLocation> list) {
        long time = gpsTraining.getStartDate().getTime();
        long intValue = new MovementHeartRateDaoProxy().getMovementHeartRate(time).getTrainingTime().intValue() * 1000;
        float f8 = (intValue / 1000.0f) / 60.0f;
        float intValue2 = (gpsTraining.getDistance().intValue() / 1000.0f) / f8;
        Objects.requireNonNull(list);
        int size = list.size();
        float f9 = f8 / size;
        long j8 = intValue / size;
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        for (int i8 = 0; i8 < size; i8++) {
            TrainingLocation trainingLocation = list.get(i8);
            trainingLocation.setSpeed(intValue2);
            trainingLocation.setAltitude(d8);
            d8 += f9;
            time += j8;
            trainingLocation.setTimestamp(time);
            Log.d("locationList", "timestamp:" + time + SystemInfoUtil.COMMA + intValue + SystemInfoUtil.COMMA + j8);
        }
        return list;
    }

    @NonNull
    public static List<Integer> getMinuteTrainingInfo(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                int i9 = i8 / 6;
                if (arrayList.size() <= i9) {
                    arrayList.add(list.get(i8));
                } else {
                    arrayList.set(i9, Integer.valueOf(((Integer) arrayList.get(i9)).intValue() + list.get(i8).intValue()));
                }
            }
        }
        return arrayList;
    }

    private int getTotalMovingSeconds(GpsTraining gpsTraining) {
        return gpsTraining.getTrainingSeconds().intValue() - (v3.a.getStaticPointSize(getTrainingPathList(gpsTraining)) * 2);
    }

    private List<TrainingLocation> getTrainingPathList(long j8) {
        return getTrainingPathList(this.gpsTrainingDaoProxy.get(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getGpsTrainingDetail$0(long j8, ObservableEmitter observableEmitter) {
        GpsTraining gpsTraining = this.gpsTrainingDaoProxy.get(j8);
        if (gpsTraining != null) {
            com.orhanobut.logger.f.d("gpsTraining: " + s.bean2Json(gpsTraining));
            observableEmitter.onNext(addTrainingInfoOfBandGPS(gpsTraining));
        }
        observableEmitter.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getGpsTrainingDetail$1(Context context, boolean z7, GpsTraining gpsTraining) {
        this.trainingType = gpsTraining.getTrainingType().intValue();
        Integer trainingSeconds = gpsTraining.getTrainingSeconds();
        this.totalSeconds = trainingSeconds;
        addTimeInfo(trainingSeconds);
        this.totalDistance = gpsTraining.getDistance();
        Date endDate = gpsTraining.getEndDate();
        Date startDate = gpsTraining.getStartDate();
        addPaceInfo(this.totalSeconds.intValue(), this.totalDistance);
        Float calorie = gpsTraining.getCalorie();
        this.totalKcal = calorie;
        addCalorieInfo(calorie);
        addStepRateInfo(gpsTraining.getAverageStepFrequency());
        addStepsInfo(gpsTraining.getStep());
        addElevationInfo(gpsTraining.getElevation());
        addHeartRateInfo(gpsTraining);
        addGomoreSportData(gpsTraining);
        this.trainingPathView.renderTrainingInfoList(this.trainingInfoList);
        renderTitle(context, gpsTraining.getTrainingType());
        showTrainingSource(gpsTraining);
        renderDistance(this.totalDistance.intValue());
        renderChart(gpsTraining);
        showHeartRateAnalysis(gpsTraining);
        if (!z7) {
            if (RATING_TRAINING_SECONDS < this.totalSeconds.intValue()) {
                this.trainingPathView.renderRatingDialog();
            }
            logGPSTrainingEvent(context, startDate, endDate, gpsTraining.getTrainingType());
        }
        showGomoreData(gpsTraining);
    }

    private void logGPSTrainingEvent(Context context, Date date, Date date2, Integer num) {
        String format = m.format(date, cn.hutool.core.date.d.PURE_DATE_PATTERN);
        String trainingNameByTrack = q.getTrainingNameByTrack(context, num.intValue());
        int minuteSpace = m.getMinuteSpace(date.getTime(), date2.getTime());
        Bundle bundle = new Bundle();
        bundle.putString("exercise_date", format);
        bundle.putString("exercise_type", trainingNameByTrack);
        bundle.putString("exercise_time", minuteSpace + "分钟");
        s0.logEvent("GPS锻炼2.0", bundle);
    }

    private void renderChart(GpsTraining gpsTraining) {
        dealStepsData(gpsTraining);
        dealHeartRateData(gpsTraining);
        if (this.isMapMode) {
            dealRealTimePaceData(gpsTraining);
        }
        dealOneDistancePaceData(gpsTraining);
        dealElevationData(gpsTraining);
    }

    private void renderDistance(int i8) {
        int unitSystem = BandUnitSystemProvider.getUnitSystem();
        String actionDistance = com.crrepa.band.my.health.base.a.getActionDistance(i8, unitSystem);
        int actionDistanceUnit = com.crrepa.band.my.health.base.a.getActionDistanceUnit(i8, unitSystem);
        this.trainingPathView.renderDistance(actionDistance);
        this.trainingPathView.renderDistanceUnit(actionDistanceUnit);
    }

    private void renderTitle(Context context, Integer num) {
        String trainingName = q.getTrainingName(context, num.intValue());
        if (trainingName != null) {
            this.trainingPathView.renderTitle(trainingName);
        }
    }

    private void showElevationChart(List<Float> list, Date date, Date date2) {
        String calculateAvgElevation = com.crrepa.band.my.training.utils.b.calculateAvgElevation(list);
        String calculateMinElevation = com.crrepa.band.my.training.utils.b.calculateMinElevation(list);
        String calculateMaxElevation = com.crrepa.band.my.training.utils.b.calculateMaxElevation(list);
        String[] calculateElevationChanges = com.crrepa.band.my.training.utils.b.calculateElevationChanges(list);
        this.trainingPathView.renderElevationChart(date, date2, list, calculateAvgElevation, calculateMinElevation, calculateMaxElevation, calculateElevationChanges[0], calculateElevationChanges[1]);
    }

    private void showGomoreAvgStepMsg(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        if (cRPTrainingAdvancedInfo.getRunningInfo() != null) {
            CRPTrainingAdvancedInfo.RunningInfo runningInfo = cRPTrainingAdvancedInfo.getRunningInfo();
            this.trainingPathView.renderGomoreAvgStepMsg(runningInfo.getAverageStepFrequency(), runningInfo.getAverageStepLength());
        } else if (cRPTrainingAdvancedInfo.getWalkingInfo() != null) {
            CRPTrainingAdvancedInfo.WalkingInfo walkingInfo = cRPTrainingAdvancedInfo.getWalkingInfo();
            this.trainingPathView.renderGomoreAvgStepMsg(walkingInfo.getAverageStepFrequency(), walkingInfo.getAverageStepLength());
        }
    }

    private void showGomoreData(GpsTraining gpsTraining) {
        showGomoreElevation(gpsTraining);
        try {
            Log.d("showGomoreData", "TrainingAdvancedInfoJson=" + gpsTraining.getTrainingAdvancedInfoJson());
            CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo = (CRPTrainingAdvancedInfo) new Gson().fromJson(gpsTraining.getTrainingAdvancedInfoJson(), CRPTrainingAdvancedInfo.class);
            if (cRPTrainingAdvancedInfo == null) {
                Log.d("showGomoreData", "advancedInfo == null");
                return;
            }
            showGomoreTitle(gpsTraining.getTrainingType());
            showGomoreAvgStepMsg(cRPTrainingAdvancedInfo);
            showGomoreRunningPose(cRPTrainingAdvancedInfo);
            showGomoreTrainingEffect(cRPTrainingAdvancedInfo);
            showGomoreEnergySource(cRPTrainingAdvancedInfo);
            showGomoreVo2max(cRPTrainingAdvancedInfo);
            showGomoreRecoveryTime(cRPTrainingAdvancedInfo);
        } catch (Exception unused) {
            Log.d("showGomoreData", "advancedInfo cover to gson error");
        }
    }

    private void showGomoreElevation(GpsTraining gpsTraining) {
        try {
            List<Float> list = (List) new Gson().fromJson(gpsTraining.getAltitudeListJson(), new TypeToken<List<Float>>() { // from class: com.crrepa.band.my.training.presenter.TrainingPathPresenter.2
            }.getType());
            Log.d("showGomoreElevation", "getAltitudeListJson：" + gpsTraining.getAltitudeListJson());
            if (x0.isEmpty(list)) {
                return;
            }
            showElevationChart(list, gpsTraining.getStartDate(), gpsTraining.getEndDate());
        } catch (Exception e8) {
            Log.d("showGomoreElevation", "elevationList cover to gson error：" + e8.getMessage());
        }
    }

    private void showGomoreEnergySource(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        this.trainingPathView.renderGomoreEnergySource(cRPTrainingAdvancedInfo.getFat(), cRPTrainingAdvancedInfo.getCarbohydrate());
    }

    private void showGomoreRecoveryTime(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        this.trainingPathView.renderGomoreRecoveryTime(cRPTrainingAdvancedInfo.getRecoveryTime());
    }

    private void showGomoreRunningPose(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        CRPTrainingAdvancedInfo.RunningInfo runningInfo = cRPTrainingAdvancedInfo.getRunningInfo();
        if (runningInfo == null) {
            return;
        }
        this.trainingPathView.renderGomoreRunningPose(runningInfo);
    }

    private void showGomoreTitle(Integer num) {
        String gomoreTrainingName = q.getGomoreTrainingName(num.intValue());
        if (x0.isNotEmpty(gomoreTrainingName)) {
            this.trainingPathView.renderGomoreTitle(gomoreTrainingName);
        }
    }

    private void showGomoreTrainingEffect(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        float round = Math.round(cRPTrainingAdvancedInfo.getAerobicEffect() * 100.0f) / 100.0f;
        float round2 = Math.round(cRPTrainingAdvancedInfo.getAnaerobicEffect() * 100.0f) / 100.0f;
        if (round > 0.0f || round2 > 0.0f) {
            this.trainingPathView.renderGomoreTrainingEffect(round, com.crrepa.band.my.training.utils.n.getTrainingEffectStr(round), round2, com.crrepa.band.my.training.utils.n.getTrainingEffectStr(round2));
        }
    }

    private void showGomoreVo2max(CRPTrainingAdvancedInfo cRPTrainingAdvancedInfo) {
        float maxOxygenIntake = cRPTrainingAdvancedInfo.getRunningInfo() != null ? cRPTrainingAdvancedInfo.getRunningInfo().getMaxOxygenIntake() : 0.0f;
        if (cRPTrainingAdvancedInfo.getCyclingInfo() != null) {
            maxOxygenIntake = cRPTrainingAdvancedInfo.getCyclingInfo().getMaxOxygenIntake();
        }
        if (maxOxygenIntake > 0.0f) {
            this.trainingPathView.renderGomoreVo2max(maxOxygenIntake + com.crrepa.band.my.training.gomoresport.e.getVo2MaxUnit());
        }
    }

    private void showHeartRateAnalysis(GpsTraining gpsTraining) {
        List json2List = s.json2List(gpsTraining.getHrList(), Float[].class);
        if (json2List == null || json2List.isEmpty()) {
            return;
        }
        int intValue = gpsTraining.getInterval() == null ? 60 : gpsTraining.getInterval().intValue();
        this.trainingPathView.renderHeartRateAnalysis(intValue, q2.a.getHeartRateAnalysisData(gpsTraining.getLightSeconds()) / intValue, q2.a.getHeartRateAnalysisData(gpsTraining.getWeightSeconds()) / intValue, q2.a.getHeartRateAnalysisData(gpsTraining.getAerobicSeconds()) / intValue, q2.a.getHeartRateAnalysisData(gpsTraining.getAnaerobicSeconds()) / intValue, q2.a.getHeartRateAnalysisData(gpsTraining.getMaxSeconds()) / intValue);
        int heartRateAnalysisData = q2.a.getHeartRateAnalysisData(gpsTraining.getLightSeconds());
        int heartRateAnalysisData2 = q2.a.getHeartRateAnalysisData(gpsTraining.getWeightSeconds());
        int heartRateAnalysisData3 = heartRateAnalysisData + heartRateAnalysisData2 + q2.a.getHeartRateAnalysisData(gpsTraining.getAerobicSeconds()) + q2.a.getHeartRateAnalysisData(gpsTraining.getAnaerobicSeconds()) + q2.a.getHeartRateAnalysisData(gpsTraining.getMaxSeconds());
        int i8 = heartRateAnalysisData3 / 60;
        if (heartRateAnalysisData3 % 60 > 0) {
            i8++;
        }
        this.trainingPathView.renderHeartRateTotalSeconds(i8);
    }

    private void showTrainingSource(GpsTraining gpsTraining) {
        this.trainingPathView.renderTrainingSource(gpsTraining.getStartDate(), gpsTraining.getType().intValue() == 241 ? TrainingSourceType.WATCH : gpsTraining.getHeartRate() == null ? TrainingSourceType.APP : TrainingSourceType.WATCH_AND_APP);
        if (gpsTraining.getNowTemperature() == null || gpsTraining.getWeatherCode() == null) {
            return;
        }
        if (gpsTraining.getNowTemperatureUnit() == null) {
            gpsTraining.setNowTemperatureUnit(0);
        }
        this.trainingPathView.renderTrainingWeather(gpsTraining);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.trainingPathView = null;
    }

    @SuppressLint({"CheckResult"})
    public void getGpsTrainingDetail(final Context context, final long j8, final boolean z7) {
        Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.training.presenter.j
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                TrainingPathPresenter.this.lambda$getGpsTrainingDetail$0(j8, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.training.presenter.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TrainingPathPresenter.this.lambda$getGpsTrainingDetail$1(context, z7, (GpsTraining) obj);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    public void renderTrainingPath(long j8) {
        List<TrainingLocation> trainingPathList = getTrainingPathList(j8);
        if (trainingPathList == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (TrainingLocation trainingLocation : trainingPathList) {
            if (trainingLocation.getLatitude() != 200.0d && trainingLocation.getLongitude() != 200.0d) {
                arrayList.add(trainingLocation);
            }
        }
        this.trainingPathView.renderTrainingPath(arrayList);
        this.trainingPathView.renderGpsTrack(arrayList);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setMapMode(boolean z7) {
        this.isMapMode = z7;
    }

    public void setView(x3.c cVar) {
        this.trainingPathView = cVar;
    }

    public void uploadGPXFile(long j8, boolean z7) {
        if (o.isSharedTraining(j8)) {
            this.trainingPathView.renderStravaToast(R.string.strava_share_already_shared);
            return;
        }
        List<TrainingLocation> trainingPathList = getTrainingPathList(j8);
        if (trainingPathList == null) {
            return;
        }
        StravaHttpDelegate stravaHttpDelegate = new StravaHttpDelegate(new a(z7, j8, trainingPathList));
        this.stravaHttpDelegate = stravaHttpDelegate;
        stravaHttpDelegate.uploadGPXFile(j8, this.trainingType, trainingPathList);
    }

    private List<TrainingLocation> getTrainingPathList(GpsTraining gpsTraining) {
        if (gpsTraining == null) {
            return null;
        }
        this.trainingPathView.renderBandGpsPath(gpsTraining.isBandGps());
        String filePath = gpsTraining.getFilePath();
        if (TextUtils.isEmpty(filePath)) {
            return null;
        }
        List<TrainingLocation> readTrainingPath = new com.crrepa.band.my.training.utils.d().readTrainingPath(new File(filePath), gpsTraining.getEncrypt().booleanValue());
        if (gpsTraining.isBandGps()) {
            getBandGpsTrainingLocationList(gpsTraining, readTrainingPath);
        }
        return readTrainingPath;
    }
}
