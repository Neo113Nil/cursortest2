package com.crrepa.band.my.ble.band.cmd.listener;

import android.util.Log;
import com.crrepa.band.my.home.training.model.HomeTrainingEvent;
import com.crrepa.band.my.model.db.MovementHeartRate;
import com.crrepa.band.my.model.db.PerformanceInsights;
import com.crrepa.band.my.model.db.proxy.MovementHeartRateDaoProxy;
import com.crrepa.band.my.model.db.proxy.PerformanceInsightsDaoProxy;
import com.crrepa.band.my.training.model.BandMovementHeartRateChangeEvent;
import com.crrepa.band.my.training.model.TrainingRecordSyncEvent;
import com.crrepa.ble.conn.bean.CRPHistoryTrainingInfo;
import com.crrepa.ble.conn.bean.CRPPerformanceInsightsInfo;
import com.crrepa.ble.conn.bean.CRPTrainingInfo;
import com.crrepa.ble.conn.bean.CRPTrainingRealtimeInfo;
import com.crrepa.ble.conn.listener.CRPTrainingChangeListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class n implements CRPTrainingChangeListener {
    private final MovementHeartRateDaoProxy daoProxy = new MovementHeartRateDaoProxy();
    private final List<Integer> trainingList = new ArrayList();

    private void queryTrainingDetail() {
        if (!this.trainingList.isEmpty()) {
            com.crrepa.band.my.ble.band.cmd.d.getInstance().queryTraining(this.trainingList.remove(0).intValue());
            return;
        }
        org.greenrobot.eventbus.c.getDefault().post(new BandMovementHeartRateChangeEvent());
        org.greenrobot.eventbus.c.getDefault().post(new HomeTrainingEvent());
        if (com.crrepa.band.my.training.utils.a.hasGpsTraining()) {
            org.greenrobot.eventbus.c.getDefault().post(new TrainingRecordSyncEvent(TrainingRecordSyncEvent.SyncStatus.COMPLETED));
        }
    }

    private PerformanceInsights toPerformanceInsights(CRPPerformanceInsightsInfo cRPPerformanceInsightsInfo) {
        Date sameDayStartTime = com.moyoung.dafit.module.common.utils.m.getSameDayStartTime(new Date());
        PerformanceInsights performanceInsights = new PerformanceInsights();
        performanceInsights.setDate(sameDayStartTime);
        performanceInsights.setUpdateDate(new Date());
        performanceInsights.setMaxOxygenIntake(Float.valueOf(cRPPerformanceInsightsInfo.getMaxOxygenIntake()));
        performanceInsights.setLactateSpeed(Float.valueOf(cRPPerformanceInsightsInfo.getLactateSpeed()));
        performanceInsights.setLactateHeartRate(Integer.valueOf(cRPPerformanceInsightsInfo.getLactateHeartRate()));
        performanceInsights.setAge(Integer.valueOf(cRPPerformanceInsightsInfo.getAge()));
        performanceInsights.setAgeEvaluationCoefficient(Integer.valueOf(cRPPerformanceInsightsInfo.getAgeEvaluationCoefficient()));
        performanceInsights.setCurrentLoad(Integer.valueOf(cRPPerformanceInsightsInfo.getCurrentLoad()));
        performanceInsights.setShortTermLoad(Integer.valueOf(cRPPerformanceInsightsInfo.getShortTermLoad()));
        performanceInsights.setLongTermLoad(Integer.valueOf(cRPPerformanceInsightsInfo.getLongTermLoad()));
        performanceInsights.setTrainingLoadLevel(Integer.valueOf(cRPPerformanceInsightsInfo.getTrainingLoadLevel()));
        performanceInsights.setTrainingLoadFactor(Float.valueOf(cRPPerformanceInsightsInfo.getTrainingLoadFactor()));
        performanceInsights.setRecoveryTime(Integer.valueOf(cRPPerformanceInsightsInfo.getRecoveryTime()));
        performanceInsights.setTrainingEndTime(Integer.valueOf(cRPPerformanceInsightsInfo.getTrainingEndTime()));
        performanceInsights.setCarbohydrateConsumptionPercentage(Integer.valueOf(cRPPerformanceInsightsInfo.getCarbohydrateConsumptionPercentage()));
        performanceInsights.setFatConsumptionPercentage(Integer.valueOf(cRPPerformanceInsightsInfo.getFatConsumptionPercentage()));
        performanceInsights.setMetabolicCoefficient(Integer.valueOf(cRPPerformanceInsightsInfo.getMetabolicCoefficient()));
        return performanceInsights;
    }

    @Override // com.crrepa.ble.conn.listener.CRPTrainingChangeListener
    public void onHistoryTrainingChange(List<CRPHistoryTrainingInfo> list) {
        Log.d("BandTrainingChange", "onHistoryTrainingChange: " + list);
        this.trainingList.clear();
        for (int i8 = 0; i8 < list.size(); i8++) {
            CRPHistoryTrainingInfo cRPHistoryTrainingInfo = list.get(i8);
            if (!this.daoProxy.isSavedTraining(cRPHistoryTrainingInfo.getStartTime())) {
                this.trainingList.add(Integer.valueOf(cRPHistoryTrainingInfo.getId()));
            }
        }
        if (this.trainingList.isEmpty()) {
            return;
        }
        queryTrainingDetail();
        if (com.crrepa.band.my.training.utils.a.hasGpsTraining()) {
            org.greenrobot.eventbus.c.getDefault().post(new TrainingRecordSyncEvent(TrainingRecordSyncEvent.SyncStatus.START));
        }
    }

    @Override // com.crrepa.ble.conn.listener.CRPTrainingChangeListener
    public void onPerformanceInsightsChange(CRPPerformanceInsightsInfo cRPPerformanceInsightsInfo) {
        Log.d("BandTrainingChange", "crpPerformanceInsightsInfo: " + cRPPerformanceInsightsInfo);
        PerformanceInsights performanceInsights = toPerformanceInsights(cRPPerformanceInsightsInfo);
        PerformanceInsightsDaoProxy.getInstance().save(performanceInsights);
        org.greenrobot.eventbus.c.getDefault().post(performanceInsights);
        if (!com.crrepa.band.my.training.gomoresport.f.isSupportGomoreSport()) {
            org.greenrobot.eventbus.c.getDefault().post(new com.crrepa.band.my.training.gomoresport.g());
        }
        com.crrepa.band.my.training.gomoresport.f.saveIsSupportGomoreSport(true);
    }

    @Override // com.crrepa.ble.conn.listener.CRPTrainingChangeListener
    public void onRealtimeTrainingChange(CRPTrainingRealtimeInfo cRPTrainingRealtimeInfo) {
        Log.d("BandTrainingChange", "onRealtimeTrainingChange: " + cRPTrainingRealtimeInfo);
    }

    @Override // com.crrepa.ble.conn.listener.CRPTrainingChangeListener
    public void onTrainingChange(CRPTrainingInfo cRPTrainingInfo) {
        Log.d("BandTrainingChange", "CRPTrainingInfo: " + cRPTrainingInfo);
        MovementHeartRate movementHeartRate = k0.c.toMovementHeartRate(cRPTrainingInfo);
        Log.d("BandTrainingChange", "movementHeartRate: " + movementHeartRate.toString());
        this.daoProxy.save(movementHeartRate);
        queryTrainingDetail();
    }
}
