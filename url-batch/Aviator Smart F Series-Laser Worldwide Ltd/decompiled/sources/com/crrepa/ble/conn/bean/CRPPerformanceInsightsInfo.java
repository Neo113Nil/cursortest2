package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPPerformanceInsightsInfo {
    private int age;
    private int ageEvaluationCoefficient;
    private int carbohydrateConsumptionPercentage;
    private int currentLoad;
    private int fatConsumptionPercentage;
    private int lactateHeartRate;
    private float lactateSpeed;
    private int longTermLoad;
    private float maxOxygenIntake;
    private int metabolicCoefficient;
    private int recoveryTime;
    private int shortTermLoad;
    private int trainingEndTime;
    private float trainingLoadFactor;
    private int trainingLoadLevel;

    public int getAge() {
        return this.age;
    }

    public int getAgeEvaluationCoefficient() {
        return this.ageEvaluationCoefficient;
    }

    public int getCarbohydrateConsumptionPercentage() {
        return this.carbohydrateConsumptionPercentage;
    }

    public int getCurrentLoad() {
        return this.currentLoad;
    }

    public int getFatConsumptionPercentage() {
        return this.fatConsumptionPercentage;
    }

    public int getLactateHeartRate() {
        return this.lactateHeartRate;
    }

    public float getLactateSpeed() {
        return this.lactateSpeed;
    }

    public int getLongTermLoad() {
        return this.longTermLoad;
    }

    public float getMaxOxygenIntake() {
        return this.maxOxygenIntake;
    }

    public int getMetabolicCoefficient() {
        return this.metabolicCoefficient;
    }

    public int getRecoveryTime() {
        return this.recoveryTime;
    }

    public int getShortTermLoad() {
        return this.shortTermLoad;
    }

    public int getTrainingEndTime() {
        return this.trainingEndTime;
    }

    public float getTrainingLoadFactor() {
        return this.trainingLoadFactor;
    }

    public int getTrainingLoadLevel() {
        return this.trainingLoadLevel;
    }

    public void setAge(int i8) {
        this.age = i8;
    }

    public void setAgeEvaluationCoefficient(int i8) {
        this.ageEvaluationCoefficient = i8;
    }

    public void setCarbohydrateConsumptionPercentage(int i8) {
        this.carbohydrateConsumptionPercentage = i8;
    }

    public void setCurrentLoad(int i8) {
        this.currentLoad = i8;
    }

    public void setFatConsumptionPercentage(int i8) {
        this.fatConsumptionPercentage = i8;
    }

    public void setLactateHeartRate(int i8) {
        this.lactateHeartRate = i8;
    }

    public void setLactateSpeed(float f8) {
        this.lactateSpeed = f8;
    }

    public void setLongTermLoad(int i8) {
        this.longTermLoad = i8;
    }

    public void setMaxOxygenIntake(float f8) {
        this.maxOxygenIntake = f8;
    }

    public void setMetabolicCoefficient(int i8) {
        this.metabolicCoefficient = i8;
    }

    public void setRecoveryTime(int i8) {
        this.recoveryTime = i8;
    }

    public void setShortTermLoad(int i8) {
        this.shortTermLoad = i8;
    }

    public void setTrainingEndTime(int i8) {
        this.trainingEndTime = i8;
    }

    public void setTrainingLoadFactor(float f8) {
        this.trainingLoadFactor = f8;
    }

    public void setTrainingLoadLevel(int i8) {
        this.trainingLoadLevel = i8;
    }

    public String toString() {
        return "CRPPerformanceInsightsInfo{maxOxygenIntake=" + this.maxOxygenIntake + ", lactateSpeed=" + this.lactateSpeed + ", lactateHeartRate=" + this.lactateHeartRate + ", age=" + this.age + ", ageEvaluationCoefficient=" + this.ageEvaluationCoefficient + ", currentLoad=" + this.currentLoad + ", shortTermLoad=" + this.shortTermLoad + ", longTermLoad=" + this.longTermLoad + ", trainingLoadCoefficient=" + this.trainingLoadLevel + ", recoveryTime=" + this.recoveryTime + ", trainingEndTime=" + this.trainingEndTime + ", carbohydrateConsumptionPercentage=" + this.carbohydrateConsumptionPercentage + ", fatConsumptionPercentage=" + this.fatConsumptionPercentage + ", metabolicCoefficient=" + this.metabolicCoefficient + '}';
    }
}
