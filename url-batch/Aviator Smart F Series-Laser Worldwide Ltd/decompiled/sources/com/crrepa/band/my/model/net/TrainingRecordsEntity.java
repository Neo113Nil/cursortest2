package com.crrepa.band.my.model.net;

import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.db.MovementHeartRate;
import com.moyoung.dafit.module.common.utils.x0;
import java.util.Date;

/* loaded from: classes2.dex */
public class TrainingRecordsEntity {
    private Integer avgHr;
    private Float calories;
    private Integer distance;
    private Date endDate;
    private Long id;
    private boolean isGomoreSportData;
    private Date startDate;
    private Integer trainingSeconds;
    private Integer trainingType;
    private Integer type;
    private Integer validTimes;

    public void copy(GpsTraining gpsTraining) {
        if (gpsTraining == null) {
            return;
        }
        this.id = gpsTraining.getId();
        this.startDate = gpsTraining.getStartDate();
        this.endDate = gpsTraining.getEndDate();
        this.trainingSeconds = gpsTraining.getTrainingSeconds();
        this.trainingType = gpsTraining.getTrainingType();
        this.type = gpsTraining.getType();
        this.avgHr = gpsTraining.getHeartRate();
        this.distance = gpsTraining.getDistance();
        this.calories = gpsTraining.getCalorie();
        this.isGomoreSportData = x0.isNotEmpty(gpsTraining.getTrainingAdvancedInfoJson());
    }

    public Integer getAvgHr() {
        return this.avgHr;
    }

    public Float getCalories() {
        return this.calories;
    }

    public Integer getDistance() {
        return this.distance;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public long getId() {
        return this.id.longValue();
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public Integer getTrainingSeconds() {
        return this.trainingSeconds;
    }

    public Integer getTrainingType() {
        return this.trainingType;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getValidTimes() {
        return this.validTimes;
    }

    public boolean isGomoreSportData() {
        return this.isGomoreSportData;
    }

    public void setAvgHr(Integer num) {
        this.avgHr = num;
    }

    public void setCalories(Float f8) {
        this.calories = f8;
    }

    public void setDistance(Integer num) {
        this.distance = num;
    }

    public void setEndDate(Date date) {
        this.endDate = date;
    }

    public void setGomoreSportData(boolean z7) {
        this.isGomoreSportData = z7;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setStartDate(Date date) {
        this.startDate = date;
    }

    public void setTrainingSeconds(Integer num) {
        this.trainingSeconds = num;
    }

    public void setTrainingType(Integer num) {
        this.trainingType = num;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setValidTimes(Integer num) {
        this.validTimes = num;
    }

    public void setId(long j8) {
        this.id = Long.valueOf(j8);
    }

    public void copy(MovementHeartRate movementHeartRate) {
        if (movementHeartRate == null) {
            return;
        }
        this.id = movementHeartRate.getStartTime();
        this.startDate = new Date(movementHeartRate.getStartTime().longValue());
        this.endDate = new Date(movementHeartRate.getEndTime().longValue());
        this.trainingSeconds = movementHeartRate.getTrainingSeconds();
        this.trainingType = movementHeartRate.getType();
        this.avgHr = movementHeartRate.getAverage();
        this.distance = Integer.valueOf(movementHeartRate.getDistance() == null ? 0 : movementHeartRate.getDistance().intValue());
        this.calories = movementHeartRate.getCalories();
        this.isGomoreSportData = x0.isNotEmpty(movementHeartRate.getTrainingAdvancedInfoJson());
    }
}
