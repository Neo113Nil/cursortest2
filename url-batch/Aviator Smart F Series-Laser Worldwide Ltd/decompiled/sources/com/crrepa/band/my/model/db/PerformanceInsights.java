package com.crrepa.band.my.model.db;

import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Date;

/* loaded from: classes2.dex */
public class PerformanceInsights {
    private Integer age;
    private Integer ageEvaluationCoefficient;
    private Integer carbohydrateConsumptionPercentage;
    private Integer currentLoad;
    private Date date;
    private Integer fatConsumptionPercentage;
    private Integer lactateHeartRate;
    private Float lactateSpeed;
    private Integer longTermLoad;
    private Float maxOxygenIntake;
    private Integer metabolicCoefficient;
    private Integer recoveryTime;
    private Integer shortTermLoad;
    private Integer trainingEndTime;
    private Float trainingLoadFactor;
    private Integer trainingLoadLevel;
    private Date updateDate;

    public PerformanceInsights() {
    }

    public Integer getAge() {
        return this.age;
    }

    public Integer getAgeEvaluationCoefficient() {
        return this.ageEvaluationCoefficient;
    }

    public Integer getCarbohydrateConsumptionPercentage() {
        return this.carbohydrateConsumptionPercentage;
    }

    public Integer getCurrentLoad() {
        return this.currentLoad;
    }

    public Date getDate() {
        return this.date;
    }

    public Integer getFatConsumptionPercentage() {
        Log.d("fatConsumptionPercent", "fatConsumptionPercentage=" + this.fatConsumptionPercentage);
        return this.fatConsumptionPercentage;
    }

    public Integer getLactateHeartRate() {
        return this.lactateHeartRate;
    }

    public Float getLactateSpeed() {
        return this.lactateSpeed;
    }

    public Integer getLongTermLoad() {
        return this.longTermLoad;
    }

    public Float getMaxOxygenIntake() {
        Log.d("getMaxOxygenIntake", "maxOxygenIntake=" + this.maxOxygenIntake);
        if (this.maxOxygenIntake != null) {
            return Float.valueOf(Math.round(r0.floatValue() * 10.0f) / 10.0f);
        }
        return null;
    }

    public Integer getMetabolicCoefficient() {
        return this.metabolicCoefficient;
    }

    public Integer getRecoveryTime() {
        return this.recoveryTime;
    }

    public Integer getShortTermLoad() {
        return this.shortTermLoad;
    }

    public Integer getTrainingEndTime() {
        return this.trainingEndTime;
    }

    public Float getTrainingLoadFactor() {
        return this.trainingLoadFactor;
    }

    public Integer getTrainingLoadLevel() {
        return this.trainingLoadLevel;
    }

    public Date getUpdateDate() {
        return this.updateDate;
    }

    public void setAge(Integer num) {
        this.age = num;
    }

    public void setAgeEvaluationCoefficient(Integer num) {
        this.ageEvaluationCoefficient = num;
    }

    public void setCarbohydrateConsumptionPercentage(Integer num) {
        this.carbohydrateConsumptionPercentage = num;
    }

    public void setCurrentLoad(Integer num) {
        this.currentLoad = num;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setFatConsumptionPercentage(Integer num) {
        this.fatConsumptionPercentage = num;
    }

    public void setLactateHeartRate(Integer num) {
        this.lactateHeartRate = num;
    }

    public void setLactateSpeed(Float f8) {
        this.lactateSpeed = f8;
    }

    public void setLongTermLoad(Integer num) {
        this.longTermLoad = num;
    }

    public void setMaxOxygenIntake(Float f8) {
        this.maxOxygenIntake = f8;
    }

    public void setMetabolicCoefficient(Integer num) {
        this.metabolicCoefficient = num;
    }

    public void setRecoveryTime(Integer num) {
        this.recoveryTime = num;
    }

    public void setShortTermLoad(Integer num) {
        this.shortTermLoad = num;
    }

    public void setTrainingEndTime(Integer num) {
        this.trainingEndTime = num;
    }

    public void setTrainingLoadFactor(Float f8) {
        this.trainingLoadFactor = f8;
    }

    public void setTrainingLoadLevel(Integer num) {
        this.trainingLoadLevel = num;
    }

    public void setUpdateDate(Date date) {
        this.updateDate = date;
    }

    @NonNull
    public String toString() {
        return "PerformanceInsights{date=" + this.date + ", updateDate=" + this.updateDate + ", maxOxygenIntake=" + this.maxOxygenIntake + ", lactateSpeed=" + this.lactateSpeed + ", lactateHeartRate=" + this.lactateHeartRate + ", age=" + this.age + ", ageEvaluationCoefficient=" + this.ageEvaluationCoefficient + ", currentLoad=" + this.currentLoad + ", shortTermLoad=" + this.shortTermLoad + ", longTermLoad=" + this.longTermLoad + ", trainingLoadCoefficient=" + this.trainingLoadLevel + ", trainingLoadFactor=" + this.trainingLoadFactor + ", recoveryTime=" + this.recoveryTime + ", trainingEndTime=" + this.trainingEndTime + ", carbohydrateConsumptionPercentage=" + this.carbohydrateConsumptionPercentage + ", fatConsumptionPercentage=" + this.fatConsumptionPercentage + ", metabolicCoefficient=" + this.metabolicCoefficient + '}';
    }

    public PerformanceInsights(Date date, Date date2, Float f8, Float f9, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Float f10, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12) {
        this.date = date;
        this.updateDate = date2;
        this.maxOxygenIntake = f8;
        this.lactateSpeed = f9;
        this.lactateHeartRate = num;
        this.age = num2;
        this.ageEvaluationCoefficient = num3;
        this.currentLoad = num4;
        this.shortTermLoad = num5;
        this.longTermLoad = num6;
        this.trainingLoadLevel = num7;
        this.trainingLoadFactor = f10;
        this.recoveryTime = num8;
        this.trainingEndTime = num9;
        this.carbohydrateConsumptionPercentage = num10;
        this.fatConsumptionPercentage = num11;
        this.metabolicCoefficient = num12;
    }
}
