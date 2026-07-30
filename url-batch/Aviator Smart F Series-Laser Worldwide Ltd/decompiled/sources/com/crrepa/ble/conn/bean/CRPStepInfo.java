package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPStepInfo {
    private int calories;
    private int distance;
    private int steps;
    private int time;

    public CRPStepInfo() {
    }

    public CRPStepInfo(int i8, int i9, int i10) {
        this.steps = i8;
        this.distance = i9;
        this.calories = i10;
    }

    public int getCalories() {
        return this.calories;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getSteps() {
        return this.steps;
    }

    public int getTime() {
        return this.time;
    }

    public void setCalories(int i8) {
        this.calories = i8;
    }

    public void setDistance(int i8) {
        this.distance = i8;
    }

    public void setSteps(int i8) {
        this.steps = i8;
    }

    public void setTime(int i8) {
        this.time = i8;
    }

    public String toString() {
        return "CRPStepInfo{steps=" + this.steps + ", distance=" + this.distance + ", calories=" + this.calories + ", time=" + this.time + '}';
    }

    public CRPStepInfo(int i8, int i9, int i10, int i11) {
        this.steps = i8;
        this.distance = i9;
        this.calories = i10;
        this.time = i11;
    }
}
