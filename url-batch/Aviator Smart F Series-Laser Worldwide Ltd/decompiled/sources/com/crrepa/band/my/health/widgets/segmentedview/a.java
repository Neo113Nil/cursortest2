package com.crrepa.band.my.health.widgets.segmentedview;

/* loaded from: classes2.dex */
public class a {
    private String endTime;
    private String startTime;
    private int time;
    private SleepState type;

    public a() {
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public int getTime() {
        return this.time;
    }

    public SleepState getType() {
        return this.type;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setTime(int i8) {
        this.time = i8;
    }

    public void setType(SleepState sleepState) {
        this.type = sleepState;
    }

    public a(SleepState sleepState, int i8, String str, String str2) {
        this.type = sleepState;
        this.time = i8;
        this.startTime = str;
        this.endTime = str2;
    }
}
