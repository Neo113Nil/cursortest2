package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPDailyGoalsInfo {
    private int calories;
    private int steps;
    private int trainingTime;

    public CRPDailyGoalsInfo() {
    }

    public CRPDailyGoalsInfo(int i8, int i9, int i10) {
        this.steps = i8;
        this.calories = i9;
        this.trainingTime = i10;
    }

    public int getCalories() {
        return this.calories;
    }

    public int getSteps() {
        return this.steps;
    }

    public int getTrainingTime() {
        return this.trainingTime;
    }

    public void setCalories(int i8) {
        this.calories = i8;
    }

    public void setSteps(int i8) {
        this.steps = i8;
    }

    public void setTrainingTime(int i8) {
        this.trainingTime = i8;
    }

    public String toString() {
        return "CRPDailyGoalsInfo{steps=" + this.steps + ", calories=" + this.calories + ", trainingTime=" + this.trainingTime + '}';
    }
}
