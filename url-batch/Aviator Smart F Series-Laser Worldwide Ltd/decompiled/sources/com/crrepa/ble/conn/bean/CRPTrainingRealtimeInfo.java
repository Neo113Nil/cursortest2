package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPTrainingRealtimeInfo {
    public static final byte STATE_IDLE = 0;
    public static final byte STATE_PAUSE = 2;
    public static final byte STATE_TRAINING = 1;
    private int calories;
    private int distance;
    private int heartrate;
    private long startTime;
    private byte state;
    private int steps;
    private int trainingTime;

    public int getCalories() {
        return this.calories;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getHeartrate() {
        return this.heartrate;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public byte getState() {
        return this.state;
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

    public void setDistance(int i8) {
        this.distance = i8;
    }

    public void setHeartrate(int i8) {
        this.heartrate = i8;
    }

    public void setStartTime(long j8) {
        this.startTime = j8;
    }

    public void setState(byte b8) {
        this.state = b8;
    }

    public void setSteps(int i8) {
        this.steps = i8;
    }

    public void setTrainingTime(int i8) {
        this.trainingTime = i8;
    }

    public String toString() {
        return "CRPTrainingRealtimeInfo{state=" + ((int) this.state) + ", heartrate=" + this.heartrate + ", steps=" + this.steps + ", trainingTime=" + this.trainingTime + ", distance=" + this.distance + ", calories=" + this.calories + '}';
    }
}
