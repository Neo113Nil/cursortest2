package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPMovementHeartRateInfo {
    public static final byte BADMINTON_TYPE = 4;
    public static final byte BASEBALL_TYPE = 15;
    public static final byte BASKETBALL_TYPE = 5;
    public static final byte BOATING_TYPE = 19;
    public static final byte BOWLING_TYPE = 22;
    public static final byte CRICKET_TYPE = 28;
    public static final byte DANCE_TYPE = 14;
    public static final byte DUMBBELLS_TYPE = 23;
    public static final byte ELLIPTICAL_TYPE = 16;
    public static final byte FOOTBALL_TYPE = 6;
    public static final byte FREE_TRAINING_TYPE = 18;
    public static final byte GOLF_TYPE = 11;
    public static final byte INDOOR_CYCLING_TYPE = 17;
    public static final byte INDOOR_RUN_TYPE = 27;
    public static final byte INDOOR_WALK_TYPE = 26;
    public static final byte KABADDI_TYPE = 29;
    public static final byte MOUNTAINEERING_TYPE = 8;
    public static final byte ON_FOOT_TYPE = 25;
    public static final byte OUTDOOR_CYCLING_TYPE = 2;
    public static final byte ROPE_TYPE = 3;
    public static final byte RUGBY_TYPE = 10;
    public static final byte RUN_TYPE = 1;
    public static final byte SIT_UPS_TYPE = 24;
    public static final byte SKI_TYPE = 21;
    public static final byte SWIM_TYPE = 7;
    public static final byte TENNIS_TYPE = 9;
    public static final byte TRAIL_RUNNING_TYPE = 20;
    public static final byte WALK_TYPE = 0;
    public static final byte WORKOUT_TYPE = 13;
    public static final byte YOGA_TYPE = 12;
    private int calories;
    private int distance;
    private long endTime;
    private long startTime;
    private int steps;
    private int type;
    private int validTime;

    public int getCalories() {
        return this.calories;
    }

    public int getDistance() {
        return this.distance;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public int getSteps() {
        return this.steps;
    }

    public int getType() {
        return this.type;
    }

    public int getValidTime() {
        return this.validTime;
    }

    public void setCalories(int i8) {
        this.calories = i8;
    }

    public void setDistance(int i8) {
        this.distance = i8;
    }

    public void setEndTime(long j8) {
        this.endTime = j8;
    }

    public void setStartTime(long j8) {
        this.startTime = j8;
    }

    public void setSteps(int i8) {
        this.steps = i8;
    }

    public void setType(int i8) {
        this.type = i8;
    }

    public void setValidTime(int i8) {
        this.validTime = i8;
    }

    public String toString() {
        return "CRPMovementHeartRateInfo{type=" + this.type + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", validTime=" + this.validTime + ", steps=" + this.steps + ", distance=" + this.distance + ", calories=" + this.calories + '}';
    }
}
